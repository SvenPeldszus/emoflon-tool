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

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubProgressMonitor;

abstract public class RelevantElementCollectingBuilder extends
		VisitorDrivenProjectBuilder<RelevantElementCollector> {

	protected RelevantElementCollectingBuilder(VisitorCondition condition) {
		super(condition);
	}

	abstract protected void processResource(final IResource resource, final int kind,
			final Map<String,String> args, final IProgressMonitor monitor);

	protected void processResourceDelta(final IResourceDelta delta, final int kind,
			final Map<String,String> args, final IProgressMonitor monitor) {
		processResource(delta.getResource(), kind, args, monitor);
	}
	
	protected void postprocess(final RelevantElementCollector buildVisitor, final int kind,
			final Map<String, String> args, final IProgressMonitor monitor) {
		if (kind == INCREMENTAL_BUILD || kind == AUTO_BUILD) {
			final List<IResourceDelta> deltas = buildVisitor.getRelevantDeltas();
			final SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, deltas.size());
			for (IResourceDelta delta : deltas) {
				processResourceDelta(delta, kind, args, subMonitor);
				if (subMonitor.isCanceled()) {
					throw new OperationCanceledException();
				}
				subMonitor.worked(1);
			}
			subMonitor.done();
		} else if (kind == FULL_BUILD) {
			final List<IResource> resources = buildVisitor.getRelevantResources();
			final SubProgressMonitor subMonitor = new SubProgressMonitor(monitor, resources.size());
			for (IResource resource : resources) {
				processResource(resource, kind, args, subMonitor);
				if (subMonitor.isCanceled()) {
					throw new OperationCanceledException();
				}
				subMonitor.worked(1);
			}
			subMonitor.done();
		}		
	}

	@Override
	protected RelevantElementCollector createBuildVisitor(final VisitorCondition condition) {
		return new RelevantElementCollector(getProject(), condition);
	}

}
