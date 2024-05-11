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

import java.util.Arrays;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.gervarro.eclipse.workspace.util.ProjectUtil;

public class JavaProjectConfigurator implements ProjectConfigurator {

	public String[] updateNatureIDs(String[] natureIDs, final boolean added) throws CoreException {
		if (added) {
			if (ProjectUtil.indexOf(natureIDs, "org.eclipse.jdt.core.javanature") < 0) {
				natureIDs = Arrays.copyOf(natureIDs, natureIDs.length + 1);
				natureIDs[natureIDs.length-1] = "org.eclipse.jdt.core.javanature";
			}
		} else {
			int javaNaturePosition = ProjectUtil.indexOf(natureIDs, "org.eclipse.jdt.core.javanature"); 
			if (javaNaturePosition >= 0) {
				natureIDs = WorkspaceAutoSetupModule.remove(natureIDs, javaNaturePosition);
			}
		}
		return natureIDs;
	}
	
	public ICommand[] updateBuildSpecs(final IProjectDescription description, ICommand[] buildSpecs, final boolean added) throws CoreException {
		if (added) {
			int javaBuilderPosition = ProjectUtil.indexOf(buildSpecs, "org.eclipse.jdt.core.javabuilder");
			if (javaBuilderPosition < 0) {
				final ICommand javaBuilder = description.newCommand();
				javaBuilder.setBuilderName("org.eclipse.jdt.core.javabuilder");
				buildSpecs = Arrays.copyOf(buildSpecs, buildSpecs.length + 1);
				javaBuilderPosition = buildSpecs.length - 1;
				buildSpecs[javaBuilderPosition] = javaBuilder;
			}
		} else {
			int javaBuilderPosition = ProjectUtil.indexOf(buildSpecs, "org.eclipse.jdt.core.javabuilder");
			if (javaBuilderPosition >= 0) {
				buildSpecs = WorkspaceAutoSetupModule.remove(buildSpecs, javaBuilderPosition);
			}
		}
		return buildSpecs;
	}
}
