/*
 * Copyright (c) 2010-2014 Gergely Varro
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.eclipse.task;

import java.util.Arrays;
import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

public class CompositeTask extends Task implements Iterable<Task> {
	private final boolean parallel;
	private final Task[] children;
	
	public CompositeTask(final Task[] tasks, final boolean parallel) {
		this.children = tasks;
		this.parallel = parallel;
	}

	@Override
	public IStatus run(final IProgressMonitor monitor) {
		IStatus[] statuses = new IStatus[children.length];
		if (parallel) {
			// TODO Create a job for each task
			Job[] children = new Job[0];
			for (int i = 0; i < children.length; i++) {
				children[i].schedule();
			}
			try {
				Job.getJobManager().join(this, monitor);
			} catch (OperationCanceledException e) {
				for (int i = 0; i < children.length; i++) {
					children[i].cancel();
				}
				return Status.CANCEL_STATUS;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			for (int i = 0; i < children.length; i++) {
				statuses[i] = children[i].getResult();
			}
		} else {
			for (int i = 0; i < children.length; i++) {
				statuses[i] = children[i].run(monitor);
			}
		}
		return new MultiStatus("org.gervarro.eclipse.task", 0, statuses, null, null);
	}

	@Override
	public final Iterator<Task> iterator() {
		return Arrays.asList(children).iterator();
	}
}
