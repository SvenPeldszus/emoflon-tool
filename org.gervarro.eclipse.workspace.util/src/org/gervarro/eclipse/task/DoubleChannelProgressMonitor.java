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

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IProgressMonitorWithBlocking;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ProgressMonitorWrapper;

public class DoubleChannelProgressMonitor extends ProgressMonitorWrapper {
	private final IProgressMonitor secondaryMonitor;

	protected DoubleChannelProgressMonitor(final IProgressMonitor primaryMonitor,
			final IProgressMonitor secondaryMonitor) {
		super(primaryMonitor);
		Assert.isNotNull(secondaryMonitor);
		this.secondaryMonitor = secondaryMonitor;
	}

	public void beginTask(final String name, final int totalWork) {
		super.beginTask(name, totalWork);
		secondaryMonitor.beginTask(name, totalWork);
	}

	public void clearBlocked() {
		super.clearBlocked();
		if (secondaryMonitor instanceof IProgressMonitorWithBlocking) {
			((IProgressMonitorWithBlocking) secondaryMonitor).clearBlocked();
		}
	}

	public void done() {
		super.done();
		secondaryMonitor.done();
	}

	public void internalWorked(final double work) {
		super.internalWorked(work);
		secondaryMonitor.internalWorked(work);
	}

	public void setBlocked(final IStatus reason) {
		super.setBlocked(reason);
		if (secondaryMonitor instanceof IProgressMonitorWithBlocking) {
			((IProgressMonitorWithBlocking) secondaryMonitor).setBlocked(reason);
		}
	}

	public void setCanceled(final boolean b) {
		super.setCanceled(b);
		secondaryMonitor.setCanceled(b);
	}

	public void setTaskName(final String name) {
		super.setTaskName(name);
		secondaryMonitor.setTaskName(name);
	}

	public void subTask(final String name) {
		super.subTask(name);
		secondaryMonitor.subTask(name);
	}

	public void worked(final int work) {
		super.worked(work);
		secondaryMonitor.worked(work);
	}
}
