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

import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.gervarro.eclipse.task.ITask;

public final class WorkspaceTaskJob extends WorkspaceJob implements ITask {
	private final IWorkspaceTask task;

	public WorkspaceTaskJob(final IWorkspaceTask task) {
		super(task.getTaskName());
		this.task = task;
		this.setRule(task.getRule());
	}

	@Override
	public final IStatus runInWorkspace(final IProgressMonitor monitor)
			throws CoreException {
		task.run(monitor);
		return Status.OK_STATUS;
	}

	@Override
	public final String getTaskName() {
		return task.getTaskName();
	}
}
