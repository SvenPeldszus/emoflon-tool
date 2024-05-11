/*
 * Copyright (c) 2010-2015 Gergely Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.eclipse.workspace.autosetup;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.gervarro.eclipse.workspace.util.WorkspaceTask;

public class ProjectAutoSetupInstallerVisitor implements IResourceVisitor {
	private static final ProjectConfigurationActivity EMPTY_ACTIVITY =
			new ProjectConfigurationActivity(new ProjectConfigurator[0]);
	private final AutoSetupConfiguration oldConfiguration;
	private final AutoSetupConfiguration newConfiguration;
	
	public ProjectAutoSetupInstallerVisitor(
			final AutoSetupConfiguration oldConfiguration,
			final AutoSetupConfiguration newConfiguration) {
		this.oldConfiguration = oldConfiguration;
		this.newConfiguration = newConfiguration;
	}
	
	@Override
	public final boolean visit(final IResource resource) throws CoreException {
		final int resourceType = resource.getType();
		if (resourceType == IResource.ROOT) {
			return true;
		}
		if (resourceType == IResource.PROJECT && resource.isAccessible()) {
			final IProject project = (IProject) resource;
			// Uninstall
			if (oldConfiguration != null) {
				final PrioritizedProjectVisitor oldVisitor =
						new PrioritizedProjectVisitor(project, oldConfiguration.getActivities(), false);
				project.accept(oldVisitor, IResource.DEPTH_INFINITE, oldVisitor.getVisitOptions());
				install(project, oldConfiguration, oldVisitor.getLargestAdded(),
						oldVisitor.getLargestRemoved(), true);
			}
			// Install
			if (newConfiguration != null) {
				final PrioritizedProjectVisitor newVisitor =
						new PrioritizedProjectVisitor(project, newConfiguration.getActivities(), true);
				project.accept(newVisitor, IResource.DEPTH_INFINITE, IContainer.INCLUDE_HIDDEN);
				install(project, newConfiguration, newVisitor.getLargestAdded(),
						newVisitor.getLargestRemoved(), newConfiguration.isOverwriteForced());
			}
		}
		return false;
	}
	
	private static final void install(final IProject project, final AutoSetupConfiguration configuration,
			final int largestAdded, final int largestRemoved, final boolean forceOverwrite) throws CoreException {
		if (largestAdded > 0 || largestRemoved > 0) {
			final IProjectConfigurationActivity[] activities = configuration.getActivities();
			
			// Select activities
			final int mostImportantAdd = largestAdded;
			final int mostImportantRemove = forceOverwrite ? largestRemoved : 0;

			IProjectConfigurationActivity add = EMPTY_ACTIVITY;
			IProjectConfigurationActivity remove = EMPTY_ACTIVITY;
			for (int i = 0; i < activities.length && (!forceOverwrite || add == EMPTY_ACTIVITY); i++) {
				if (activities.length - i == mostImportantRemove && remove == EMPTY_ACTIVITY) {
					remove = activities[activities.length - mostImportantRemove];
				}
				// if (activities[i].checkProject(project)) {
					if (activities.length - i == mostImportantAdd && add == EMPTY_ACTIVITY) {
						add = activities[activities.length - mostImportantAdd];
					} else if (add != EMPTY_ACTIVITY) {
						remove = activities[activities.length - i];
					}
				// }
			}
			final ProjectConfiguratorTask projectConfigurationSession =
					configuration.getProjectConfiguratorTask(project);
			projectConfigurationSession.switchOff(remove);
			projectConfigurationSession.switchOn(add);
			WorkspaceTask.execute(projectConfigurationSession, false);
		}
	}
}
