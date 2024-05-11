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
import org.eclipse.core.runtime.ProgressMonitorWrapper;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;

public class AsyncJobProgressMonitor extends ProgressMonitorWrapper implements IJobChangeListener {
	private final int ticks;

	public AsyncJobProgressMonitor(final IProgressMonitor monitor, final int ticks) {
		super(monitor);
		this.ticks = ticks;
	}

	@Override
	public void aboutToRun(final IJobChangeEvent event) {
		// Do nothing
	}

	@Override
	public void awake(final IJobChangeEvent event) {
		// Do nothing
	}

	@Override
	public void done(final IJobChangeEvent event) {
		event.getJob().removeJobChangeListener(this);
		if (event.getJob().getResult().isOK()) {
			getWrappedProgressMonitor().worked(ticks);
		}
	}

	@Override
	public void running(final IJobChangeEvent event) {
		// Do nothing
	}

	@Override
	public void scheduled(final IJobChangeEvent event) {
		// Do nothing
	}

	@Override
	public void sleeping(final IJobChangeEvent event) {
		// Do nothing
	}
}
