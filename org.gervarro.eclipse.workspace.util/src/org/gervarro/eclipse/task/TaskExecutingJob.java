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
package org.gervarro.eclipse.task;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.Job;

public class TaskExecutingJob extends Job {
	private final ITask task;
	
	public TaskExecutingJob(final ITask task) {
		super(task.getTaskName());
		this.task = task;
	}

	@Override
	protected IStatus run(final IProgressMonitor monitor) {
		return task.run(monitor);
	}
}
