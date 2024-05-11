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
import org.eclipse.core.runtime.PlatformObject;

public abstract class Task extends PlatformObject implements ITask {
	private String taskName;
	private CompositeTask parent;

	public final boolean belongsTo(final Object family) {
		return parent != null && parent == family;
	}
	
	abstract public IStatus run(IProgressMonitor monitor);
	
	public final String getTaskName() {
		return taskName;
	}
}
