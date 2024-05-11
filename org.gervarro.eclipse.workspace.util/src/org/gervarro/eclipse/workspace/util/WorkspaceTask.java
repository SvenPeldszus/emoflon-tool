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
package org.gervarro.eclipse.workspace.util;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;
import org.eclipse.core.runtime.jobs.Job;

public abstract class WorkspaceTask implements IWorkspaceTask {
	abstract public String getTaskName();
	abstract public ISchedulingRule getRule();
	abstract public void run(IProgressMonitor monitor) throws CoreException;
	
	/**
	 * @deprecated Invoke the task explicitly either in the same thread or in a new thread
	 * <pre>
	 * 		// Performing the task in the same thread (if possible) [runInBackground == false]
	 * 		WorkspaceTask.executeInCurrentThread(task, flags, progressMonitor);
	 *		
	 *		// Performing the task in a new thread [runInBackground == true]
	 *		WorkspaceTask.executeInNewThread(task);
	 * </pre>
	 */
	@Deprecated
	public static final void execute(final IWorkspaceTask task,
			final boolean runInBackground) throws CoreException {
		if (runInBackground) {
			executeInNewThread(task);
		} else {
			executeInCurrentThread(task, IWorkspace.AVOID_UPDATE, new NullProgressMonitor());
		}
	}
	
	public static final void executeInNewThread(final IWorkspaceTask task) {
		new WorkspaceTaskJob(task).schedule();
	}
	
	public static final void executeInCurrentThread(final IWorkspaceTask task,
			final int flags, final IProgressMonitor monitor) throws CoreException {
		if (canRunInCurrentThread(task)) {
			ResourcesPlugin.getWorkspace().run(task, task.getRule(), flags, monitor);
		} else {
			executeInNewThread(task);
		}
	}
	
	public static final boolean isConflicting(final ISchedulingRule ruleToTest) {
		final ISchedulingRule currentRule = Job.getJobManager().currentRule();
		return currentRule == null || ruleToTest == null ||
				!(currentRule.contains(ruleToTest) && currentRule.isConflicting(ruleToTest));
	}
	
	public static final boolean canRunInCurrentThread(final IWorkspaceTask task) {
		return !isConflicting(task.getRule()) && !ResourcesPlugin.getWorkspace().isTreeLocked();
	}
}
