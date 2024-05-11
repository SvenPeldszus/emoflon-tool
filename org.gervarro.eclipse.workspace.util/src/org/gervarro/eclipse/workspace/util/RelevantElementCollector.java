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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;

public class RelevantElementCollector extends ProjectVisitor {
	private final LinkedList<IResource> relevantResources =
			new LinkedList<IResource>();
	private final LinkedList<IResourceDelta> relevantDeltas =
			new LinkedList<IResourceDelta>();

	public RelevantElementCollector(final IProject project, final VisitorCondition condition) {
		super(project, condition);
	}
	
	public boolean handleResource(final IResource resource) {
		if (resource.isAccessible()) {
			relevantResources.add(resource);
		}
		return false;
	}
	
	public boolean handleResourceDelta(final IResourceDelta delta) {
		final int deltaKind = delta.getKind();
		if (deltaKind == IResourceDelta.CHANGED) {
			relevantDeltas.add(delta);
		} else if (deltaKind == IResourceDelta.ADDED) {
			relevantDeltas.add(delta);
		} else if (deltaKind == IResourceDelta.REMOVED) {
			relevantDeltas.add(delta);
		}
		return false;
	}

	public List<IResource> getRelevantResources() {
		return relevantResources;
	}
	
	public List<IResourceDelta> getRelevantDeltas() {
		return relevantDeltas;
	}
}
