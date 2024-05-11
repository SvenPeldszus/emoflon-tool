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
package org.gervarro.eclipse.workspace.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;

public final class WorkspaceObservationLifecycleManager extends WorkspaceTask {
	private static final ProjectStateObserver NO_OP_CONFIGURATION = new ProjectStateObserver();
	private static final Map<IWorkspace,ProjectStateObserver> CONFIGURATIONS =
			new HashMap<IWorkspace, ProjectStateObserver>();

	private final IWorkspace workspace;
	private final ProjectStateObserver newConfig;

	public WorkspaceObservationLifecycleManager() {
		this(NO_OP_CONFIGURATION);
	}
	
	public WorkspaceObservationLifecycleManager(final ProjectStateObserver newConfig) {
		this(ResourcesPlugin.getWorkspace(), newConfig);
	}
	
	public WorkspaceObservationLifecycleManager(final IWorkspace workspace, final ProjectStateObserver newConfig) {
		this.workspace = workspace;
		this.newConfig = newConfig != null ? newConfig : NO_OP_CONFIGURATION;
	}
	
	@Override
	public final String getTaskName() {
		return "Workspace lifecycle manager";
	}

	@Override
	public final ISchedulingRule getRule() {
		return workspace.getRoot();
	}

	@Override
	public void run(IProgressMonitor monitor) throws CoreException {
		synchronized (CONFIGURATIONS) {
			ProjectStateObserver actualConfiguration = CONFIGURATIONS.get(workspace);
			if (actualConfiguration == null) {
				actualConfiguration = NO_OP_CONFIGURATION;
			}
			
			if (actualConfiguration != NO_OP_CONFIGURATION) {
				workspace.removeResourceChangeListener(actualConfiguration);
			}
			actualConfiguration = newConfig;
			if (actualConfiguration != NO_OP_CONFIGURATION) {
				workspace.getRoot().accept(actualConfiguration, IResource.DEPTH_ONE, IResource.NONE);
				workspace.addResourceChangeListener(actualConfiguration);
			}
			CONFIGURATIONS.put(workspace, actualConfiguration);
		}
	}
}
