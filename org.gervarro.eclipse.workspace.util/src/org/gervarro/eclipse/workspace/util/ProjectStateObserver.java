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

import java.util.TreeMap;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class ProjectStateObserver extends ResourceVisitor implements IResourceChangeListener {
	private static final String EXTERNAL_FOLDERS =
			".org.eclipse.jdt.core.external.folders";
	private final TreeMap<String, Boolean> projectMap =
			new TreeMap<String, Boolean>();

	// Create: POST_CHANGE: IDelta
	// Open: POST_CHANGE: IDelta
	// Close: PRE_CLOSE: IProject, POST_CHANGE: IDelta
	// Delete: PRE_DELETE: IProject, POST_CHANGE: IDelta
	
	public final void resourceChanged(final IResourceChangeEvent event) {
		try {
			final int type = event.getType();
			if (type == IResourceChangeEvent.POST_CHANGE) {
				internalHandlePostCreateOrOpen(event.getDelta());
			} else if (type == IResourceChangeEvent.PRE_CLOSE) {
				internalHandlePreClose(event.getResource());
			} else if (type == IResourceChangeEvent.PRE_DELETE) {
				internalHandlePreDelete(event.getResource());
			}
		} catch (CoreException e) {
			throw new RuntimeException(e);
		}
	}
	
	public final boolean visit(final IResource resource) throws CoreException {
		final int resourceType = resource.getType();
		if (resourceType == IResource.ROOT) {
			return true;
		}
		if (resourceType == IResource.PROJECT && !EXTERNAL_FOLDERS.equals(resource.getName())) {
			final Boolean oldValue = projectMap.put(resource.getName(), resource.isAccessible());
			if (oldValue != null) {
				throwException("Unknown state found when initializing project " + resource.getName());
			}
			if (resource.isAccessible()) {
				handleInit(resource);
			}
		}
		return false;
	}
	
	public final boolean visit(final IResourceDelta delta) throws CoreException {
		final IResource resource = delta.getResource();
		final int resourceType = resource.getType();
		if (resourceType == IResource.ROOT) {
			return true;
		}
		if (resourceType == IResource.PROJECT && !EXTERNAL_FOLDERS.equals(resource.getName())) {
			if (delta.getKind() == IResourceDelta.ADDED) {
				// ADDED null -> open/close
				Boolean oldValue = projectMap.put(resource.getName(), resource.isAccessible());
				if (oldValue != null) {
					throwException("Unknown state found when creating project " + resource.getName());
				}
				if (resource.isAccessible()) {
					// Project created
					handlePostCreate(delta);
				}
			} else if (delta.getKind() == IResourceDelta.CHANGED && resource.isAccessible()) {
				// CHANGE close -> open
				Boolean oldValue = projectMap.put(resource.getName(), true);
				if (oldValue == null) {
					throwException("Unknown state found when opening project " + resource.getName());
				} else if (oldValue == Boolean.FALSE) {
					// Project opened
					handlePostOpen(delta);
				} else {
					// Regular change in project
					handleProjectInternalDelta(delta);
				}
			}
		}
		return false;
	}
	
	protected void handleInit(final IResource resource) {
		handleResourceChange(resource, true);
	}
	
	protected void handlePostCreate(final IResourceDelta delta) {
		handleResourceChange(delta.getResource(), true);
	}
	
	protected void handlePostOpen(final IResourceDelta delta) {
		handleResourceChange(delta.getResource(), true);
	}
	
	protected void handlePreClose(final IResource resource) {
		handleResourceChange(resource, false);
	}
	
	protected void handlePreDelete(final IResource resource) {
		handleResourceChange(resource, false);
	}
	
	protected void handleProjectInternalDelta(final IResourceDelta delta) {
		// Do nothing
	}
	
	protected void handleResourceChange(final IResource resource, final boolean added) {
		// Do nothing
	}
	
	private final void internalHandlePostCreateOrOpen(final IResourceDelta delta) throws CoreException {
		delta.accept(this, IContainer.INCLUDE_HIDDEN);
	}
	
	private final void internalHandlePreClose(final IResource resource) throws CoreException {
		if (resource.getType() == IResource.PROJECT && !EXTERNAL_FOLDERS.equals(resource.getName())) {
			final Boolean oldValue = projectMap.put(resource.getName(), false);
			if (oldValue != Boolean.TRUE) {
				throwException("Unknown state before closing project " + resource.getName());
			}
			handlePreClose(resource);
		}
	}
	
	private final void internalHandlePreDelete(final IResource resource) throws CoreException {
		if (resource.getType() == IResource.PROJECT && !EXTERNAL_FOLDERS.equals(resource.getName())) {
			final Boolean oldValue = projectMap.remove(resource.getName());
			if (oldValue == null) {
				throwException("Unknown state before deleting project " + resource.getName());
			}
			handlePreDelete(resource);
		}
	}
	
	private final void throwException(final String message) throws CoreException {
		IStatus status = new Status(IStatus.ERROR,
				WorkspaceObserverPlugin.PLUGIN_ID, message);
		throw new CoreException(status);
	}
}
