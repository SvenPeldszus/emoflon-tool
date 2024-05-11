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
package org.gervarro.eclipse.workspace.autosetup;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.gervarro.eclipse.workspace.util.WorkspaceTask;

public final class ResourceVisitorTask extends WorkspaceTask {
	private final String taskName;
	private final IResource resource;
	private final int depth;
	private final IResourceVisitor visitor;
	
	public ResourceVisitorTask(final String taskName, final IResource root, final int depth, final IResourceVisitor visitor) {
		if (taskName == null || root == null || visitor == null) {
			throw new NullPointerException();
		}
		this.taskName = taskName;
		this.resource = root;
		this.depth = depth;
		this.visitor = visitor;
	}
	
	@Override
	public final String getTaskName() {
		return taskName;
	}

	@Override
	public final IResource getRule() {
		return resource;
	}

	@Override
	public final void run(final IProgressMonitor monitor) throws CoreException {
		resource.accept(visitor, depth, IContainer.INCLUDE_HIDDEN);
	}
}
