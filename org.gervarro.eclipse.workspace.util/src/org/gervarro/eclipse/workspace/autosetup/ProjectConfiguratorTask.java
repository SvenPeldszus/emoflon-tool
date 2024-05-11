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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.gervarro.eclipse.workspace.util.IWorkspaceTask;

public class ProjectConfiguratorTask implements IWorkspaceTask {
	public static final boolean FORCE_OVERWRITE = true;
	private static final String TASK_NAME = "Project configurator task";
	private final IProject project;
	protected final boolean forceOverwrite;

	public ProjectConfiguratorTask(final IProject project, final boolean forceOverwrite) throws CoreException {
		this.project = project;
		this.forceOverwrite = forceOverwrite;
	}
	
	public final IProject getProject() {
		return project;
	}
	
	@Override
	public String getTaskName() {
		return TASK_NAME;
	}

	@Override
	public ISchedulingRule getRule() {
		// TODO return project; ???
		return ResourcesPlugin.getWorkspace().getRoot();
	}
	
	public void switchOn(final IProjectConfigurationActivity configuration) throws CoreException {
		configuration.switchOn(this);
	}
	
	public void switchOff(final IProjectConfigurationActivity configuration) throws CoreException {
		configuration.switchOff(this);
	}
	
	public void updateNatureIDs(final ProjectConfigurator activity, boolean added) throws CoreException {
		// Do nothing
	}
	
	public void updateBuildSpecs(final ProjectConfigurator activity, boolean added) throws CoreException {
		// Do nothing
	}

	@Override
	public void run(final IProgressMonitor monitor) throws CoreException {
		// Do nothing
	}
}
