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

import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;

public class JobExecutor extends JobChangeAdapter {
	
	public static final void execute(final Job... jobs) {
		if (jobs != null && jobs.length > 0) {
			for (int i = jobs.length-2; i >= 0; i--) {
				jobs[i].addJobChangeListener(new JobExecutor(jobs[i+1]));
			}
			jobs[0].schedule();
		}
	}
	
	private final Job nextJob;
	
	public JobExecutor(final Job nextJob) {
		this.nextJob = nextJob;
	}

	public void done(final IJobChangeEvent event) {
		if (event.getResult().isOK()) {
			nextJob.schedule();
		}
	}
}
