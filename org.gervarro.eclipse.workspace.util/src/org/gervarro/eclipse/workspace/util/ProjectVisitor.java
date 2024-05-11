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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;

abstract public class ProjectVisitor extends ResourceVisitor {
	private final IProject project;
	private final VisitorCondition condition;

	public ProjectVisitor(final IProject project, final VisitorCondition condition) {
		if (project == null || condition == null) {
			throw new NullPointerException();
		}
		this.project = project;
		this.condition = condition;
	}
	
	public boolean visit(final IResource resource) {
		final int resourceType = resource.getType();
		if (resourceType == IResource.PROJECT) {
			final IProject project = resource.getProject();
			return resource.isAccessible() && this.project == project && shouldVisitProject(project);
		} else if (resourceType != IResource.ROOT) {
			final String path = 
					resource.getProjectRelativePath().toString();
			boolean exactMatchFound = condition.isExactMatch(path);
			if (exactMatchFound) {
				return handleResource(resource);
			} else {
				return condition.isPrefixMatch(path);
			}
		}
		return false;
	}
	
	public boolean visit(final IResourceDelta delta) {
		final IResource resource = delta.getResource();
		final int resourceType = resource.getType();
		if (resourceType == IResource.PROJECT) {
			final IProject project = resource.getProject();
			return resource.isAccessible() && this.project == project && shouldVisitProject(project);
		} else if (resourceType != IResource.ROOT) {
			final String path = 
					resource.getProjectRelativePath().toString();
			boolean exactMatchFound = condition.isExactMatch(path);
			if (exactMatchFound) {
				return handleResourceDelta(delta);
			} else {
				return condition.isPrefixMatch(path);
			}
		}
		return false;
	}
	
	public boolean handleResource(final IResource resource) {
		if (resource.isAccessible()) {
			return handleResourceChange(resource, true);
		}
		return false;
	}
	
	public boolean handleResourceDelta(final IResourceDelta delta) {
		final IResource resource = delta.getResource();
		final int deltaKind = delta.getKind();
		if (deltaKind == IResourceDelta.ADDED) {
			return handleResourceChange(resource, true);
		} else if (deltaKind == IResourceDelta.REMOVED) {
			return handleResourceChange(resource, false);
		}
		return false;
	}
	
	public boolean handleResourceChange(final IResource resource, final boolean added) {
		return false;
	}
	
	public int getVisitOptions() {
		return IContainer.NONE;
	}
	
	protected final IProject getProject() {
		return project;
	}
	
	protected boolean shouldVisitProject(final IProject project) {
		return true;
	}
}
