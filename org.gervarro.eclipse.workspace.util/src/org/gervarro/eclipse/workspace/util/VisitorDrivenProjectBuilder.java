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

import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

abstract public class VisitorDrivenProjectBuilder<PV extends ProjectVisitor> extends IncrementalProjectBuilder {
	private final VisitorCondition condition;
	private final int memberFlags;
	
	protected VisitorDrivenProjectBuilder(final VisitorCondition condition) {
		this(condition, IContainer.INCLUDE_HIDDEN);
	}

	protected VisitorDrivenProjectBuilder(final VisitorCondition condition,
			final int memberFlags) {
		this.condition = condition;
		this.memberFlags = memberFlags;
	}

	@Override
	protected final IProject[] build(final int kind, final Map<String, String> args,
			final IProgressMonitor monitor) throws CoreException {
		final PV buildVisitor = createBuildVisitor(condition);
		if (kind == INCREMENTAL_BUILD) {
			preprocess(buildVisitor, kind, args, monitor);
			getDelta(getProject()).accept(buildVisitor, memberFlags);
			postprocess(buildVisitor, kind, args, monitor);
		} else if (kind == AUTO_BUILD) {
			preprocess(buildVisitor, kind, args, monitor);
			getDelta(getProject()).accept(buildVisitor, memberFlags);
			postprocess(buildVisitor, kind, args, monitor);
		} else if (kind == FULL_BUILD) {
			preprocess(buildVisitor, kind, args, monitor);
			getProject().accept(buildVisitor, IResource.DEPTH_INFINITE, memberFlags);
			postprocess(buildVisitor, kind, args, monitor);
		}
		return calculateInterestingProjects();
	}
	
	abstract protected PV createBuildVisitor(VisitorCondition condition);

	protected IProject[] calculateInterestingProjects() {
		return new IProject[0];
	}
	
	protected void preprocess(final PV buildVisitor, final int kind,
			final Map<String, String> args, final IProgressMonitor monitor) {
		// Do nothing
	}
	
	protected void postprocess(final PV buildVisitor, final int kind,
			final Map<String, String> args, final IProgressMonitor monitor) {
		// Do nothing
	}
}
