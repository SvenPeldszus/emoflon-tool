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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;

/**
 * Usage scenarios:<br/><br/>
 * <b>1a) Asynchronous task invocation (with 1 monitor)</b><br/>
 * 		ProgressMonitoringJob internalJob = new ProgressMonitoringJob(pluginID, jobName, job);<br/>
 * 		internalJob.schedule();<br/><br/>
 * <b>1b) Asynchronous subtask invocation (with 1 monitor)</b><br/>
 * 		AsyncJobProgressMonitor asyncMonitor = new AsyncJobProgressMonitor(monitor, ticks);<br/>
 * 		ProgressMonitoringJob internalJob = new ProgressMonitoringJob(pluginID, jobName, job);<br/>
 * 		internalJob.addJobChangeListener(asyncMonitor);<br/>
 * 		internalJob.schedule();<br/><br/>
 * <b>2a) Emulated synchronous task invocation</b><br/>
 * 		ProgressMonitoringJob internalJob = new ProgressMonitoringJob(pluginID, jobName, job);<br/>
 * 		internalJob.run(monitor);<br/><br/>
 * <b>2b) Emulated synchronous subtask invocation (with 2 monitors)</b><br/>
 * 		SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, ticks);<br/>
 * 		ProgressMonitoringJob internalJob = new ProgressMonitoringJob(pluginID, jobName, job);<br/>
 * 		internalJob.run(subMonitor);<br/><br/>
 * <b>3) Real synchronous subtask invocation</b><br/>
 * 		SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, ticks);<br/>
 * 		job.run(subMonitor);
 */
public final class ProgressMonitoringJob extends Job implements ITask {
	private final String pluginID;
	private final ITask runnable;
	private IProgressMonitor secondaryMonitor;
	private IStatus returnStatus;

	public static final void executeAsAsyncTask(final ITask job,
			final String pluginID, final String jobName) {
 		ProgressMonitoringJob internalJob = new ProgressMonitoringJob(pluginID, jobName, job);
 		internalJob.schedule();
	}
	
	public static final void executeAsAsyncSubTask(final ITask job,
			final String pluginID, final String jobName,
			final IProgressMonitor monitor, final int ticks) {
		AsyncJobProgressMonitor asyncMonitor = new AsyncJobProgressMonitor(monitor, ticks);
		ProgressMonitoringJob internalJob = new ProgressMonitoringJob(pluginID, jobName, job);
		internalJob.addJobChangeListener(asyncMonitor);
		internalJob.schedule();
	}
	
	public static final void executeAsEmulatedSyncTask(final ITask job, 
			final String pluginID, final String jobName, final IProgressMonitor monitor) {
		ProgressMonitoringJob internalJob = new ProgressMonitoringJob(pluginID, jobName, job);
		internalJob.run(monitor);
	}
	
	public static final void executeAsEmulatedSyncSubTask(final ITask job,
			final String pluginID, final String jobName,
			final IProgressMonitor monitor, final int ticks) {
		final SubMonitor subMonitor = SubMonitor.convert(monitor, ticks);
 		final ProgressMonitoringJob internalJob = new ProgressMonitoringJob(pluginID, jobName, job);
 		try {
 			internalJob.run(subMonitor);
 		} finally {
 			subMonitor.done();
 		}
	}
	
	public static final void executeAsSyncSubTask(final ITask job,
			final IProgressMonitor monitor, final int ticks) {
		final SubMonitor subMonitor = SubMonitor.convert(monitor, ticks);
		try {
			job.run(subMonitor);
		} finally {
			subMonitor.done();
		}
	}
	
	public static final IStatus executeSyncSubTasks(final ITask[] tasks,
			final MultiStatus status,
			final IProgressMonitor monitor) {
		final SubMonitor subMonitor = SubMonitor.convert(monitor, tasks.length);
		try {
			for (final ITask task : tasks) {
				status.add(task.run(subMonitor.newChild(1)));
			}
		} finally {
			subMonitor.done();
		}
		return status;
	}
	
	private ProgressMonitoringJob(final String pluginID, final String name, final ITask runnable) {
		super(name);
		this.pluginID = pluginID;
		this.runnable = runnable;
	}

	// 1) Asynchronous invocation with 1 monitor
	// 2) Emulated synchronous invocation with 1 or 2 monitors
	// 3) Real synchronous invocation: invoke IMonitoredJob directly
	@Override
	public final IStatus run(final IProgressMonitor monitor) {
		final Job invokingJob = Job.getJobManager().currentJob();
		if (invokingJob == this) {
			// Creates a new combinedMonitor that reports to the original monitor AND to the secondaryMonitor
			final IProgressMonitor combinedMonitor = secondaryMonitor != null ?
					new DoubleChannelProgressMonitor(monitor, secondaryMonitor) : monitor;
			try {
				return runnable.run(combinedMonitor);
			} catch (Throwable throwable) {
				this.returnStatus = new Status(IStatus.ERROR, pluginID, throwable.getMessage(), throwable);
				return this.returnStatus;
			}
		} else {
			// Emulated synchronous invocation
			this.secondaryMonitor = monitor;
			this.schedule();
			try {
				this.join();
				final IStatus returnStatus = this.returnStatus != null ? this.returnStatus : new Status(IStatus.OK, pluginID, "Job " + getName()
						+ " returns successfully from an emulated synchronous invocation");
				this.returnStatus = null;
				return returnStatus;
			} catch (InterruptedException e) {
				this.cancel();
				return Status.CANCEL_STATUS;
			}
		}
	}
	
	public final String getTaskName() {
		return runnable.getTaskName();
	}
}
