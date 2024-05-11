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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.gervarro.eclipse.workspace.util.AntPatternCondition;
import org.gervarro.eclipse.workspace.util.ProjectVisitor;

final class PrioritizedProjectVisitor extends ProjectVisitor {
	private final IProjectConfigurationActivity[] activities;
	private int largestAdded = 0;
	private int largestRemoved = 0;
	private final boolean installMode;

	PrioritizedProjectVisitor(final IProject project, final IProjectConfigurationActivity[] activities) {
		this(project, activities, true);
	}
	
	PrioritizedProjectVisitor(final IProject project, final IProjectConfigurationActivity[] activities, final boolean installMode) {
		super(project, new AntPatternCondition(getPatternConditionStrings(activities)));
		this.activities = activities;
		this.installMode = installMode;
	}
	
	private static final String[] getPatternConditionStrings(final IProjectConfigurationActivity[] configurationActivities) {
		final String[] result = new String[configurationActivities.length];
		for (int i = 0; i < configurationActivities.length; i++) {
			result[i] = configurationActivities[i].getPatternCondition();
		}
		return result;
	}
	
	public boolean handleResource(final IResource resource) {
		if (resource.isAccessible()) {
			return handleResourceChange(resource, installMode);
		}
		return false;
	}

	@Override
	public final boolean handleResourceChange(final IResource resource, final boolean added) {
		for (int i = 0; i < activities.length; i++) {
			if (activities[i].checkResource(resource)) {
				final int revertedIndex = activities.length - i;
				if (added && revertedIndex > largestAdded) {
					largestAdded = revertedIndex;
				}
				if (!added && revertedIndex > largestRemoved) {
					largestRemoved = revertedIndex;
				}
			}
		}
		return false;
	}
	
	final int getLargestAdded() {
		return largestAdded;
	}
	
	final int getLargestRemoved() {
		return largestRemoved;
	}
}
