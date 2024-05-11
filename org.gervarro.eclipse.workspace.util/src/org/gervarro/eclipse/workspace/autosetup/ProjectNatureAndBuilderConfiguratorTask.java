/*
 * Copyright (c) 2010-2016 Gergely Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.eclipse.workspace.autosetup;

import java.util.Arrays;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.ISchedulingRule;

public class ProjectNatureAndBuilderConfiguratorTask extends ProjectConfiguratorTask {
	public static final boolean FORCE_OVERWRITE = true;
	private static final String TASK_NAME = "Project configurator task";
	protected IProjectDescription description;
	protected String[] natureIDs;
	protected ICommand[] buildSpecs;

	public ProjectNatureAndBuilderConfiguratorTask(final IProject project, final boolean forceOverwrite) throws CoreException {
		super(project, forceOverwrite);
		this.description = project.getDescription();
		this.natureIDs = forceOverwrite ? new String[0] : description.getNatureIds();
		this.buildSpecs = forceOverwrite ? new ICommand[0] : description.getBuildSpec();
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
	
	public void switchOn(final ProjectConfigurationActivity configuration) throws CoreException {
		configuration.switchOn(this);
	}
	
	public void switchOff(final ProjectConfigurationActivity configuration) throws CoreException {
		configuration.switchOff(this);
	}
	
	public void updateNatureIDs(final ProjectConfigurator activity, boolean added) throws CoreException {
		this.natureIDs = activity.updateNatureIDs(this.natureIDs, added);
	}
	
	public void updateBuildSpecs(final ProjectConfigurator activity, boolean added) throws CoreException {
		this.buildSpecs = activity.updateBuildSpecs(description, this.buildSpecs, added);
	}

	@Override
	public void run(final IProgressMonitor monitor) throws CoreException {
		final IProject project = getProject();
		final IProjectDescription description = project.getDescription();
		if (!Arrays.deepEquals(natureIDs, description.getNatureIds())) {
			final IWorkspace workspace = project.getWorkspace();
			final IStatus status = workspace.validateNatureSet(natureIDs);
			if (status.isOK()) {
				description.setNatureIds(natureIDs);
				description.setBuildSpec(buildSpecs);
				project.setDescription(description, monitor);
			}
		}
	}
}
