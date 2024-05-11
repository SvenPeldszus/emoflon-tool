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

public class PluginProjectConfigurator implements ProjectConfigurator {
	
	public String[] updateNatureIDs(String[] natureIDs, final boolean added) throws CoreException {
		if (added) {
			if (ProjectUtil.indexOf(natureIDs, "org.eclipse.pde.PluginNature") < 0) {
				natureIDs = Arrays.copyOf(natureIDs, natureIDs.length + 1);
				natureIDs[natureIDs.length-1] = "org.eclipse.pde.PluginNature";
			}
		} else {
			int pluginNaturePosition = ProjectUtil.indexOf(natureIDs, "org.eclipse.pde.PluginNature");
			if (pluginNaturePosition >= 0) {
				natureIDs = WorkspaceAutoSetupModule.remove(natureIDs, pluginNaturePosition);
			}
		}

		return natureIDs;
	}
	
	public ICommand[] updateBuildSpecs(final IProjectDescription description, ICommand[] buildSpecs, final boolean added) throws CoreException {
		if (added) {
			int javaBuilderPosition = ProjectUtil.indexOf(buildSpecs, "org.eclipse.jdt.core.javabuilder");
			int manifestBuilderPosition = ProjectUtil.indexOf(buildSpecs, "org.eclipse.pde.ManifestBuilder");
			if (manifestBuilderPosition < 0) {
				final ICommand manifestBuilder = description.newCommand();
				manifestBuilder.setBuilderName("org.eclipse.pde.ManifestBuilder");
				buildSpecs = Arrays.copyOf(buildSpecs, buildSpecs.length + 1);
				manifestBuilderPosition = buildSpecs.length - 1;
				buildSpecs[manifestBuilderPosition] = manifestBuilder;
			} 
			if (manifestBuilderPosition < javaBuilderPosition) {
				final ICommand manifestBuilder = buildSpecs[manifestBuilderPosition];
				System.arraycopy(buildSpecs, manifestBuilderPosition+1, buildSpecs, manifestBuilderPosition, javaBuilderPosition-manifestBuilderPosition);
				manifestBuilderPosition = javaBuilderPosition--;
				buildSpecs[manifestBuilderPosition] = manifestBuilder;
			}
			int schemaBuilderPosition = ProjectUtil.indexOf(buildSpecs, "org.eclipse.pde.SchemaBuilder");
			if (schemaBuilderPosition < 0) {
				final ICommand schemaBuilder = description.newCommand();
				schemaBuilder.setBuilderName("org.eclipse.pde.SchemaBuilder");
				buildSpecs = Arrays.copyOf(buildSpecs, buildSpecs.length + 1);
				schemaBuilderPosition = buildSpecs.length - 1;
				buildSpecs[schemaBuilderPosition] = schemaBuilder;
			} 
			if (schemaBuilderPosition < manifestBuilderPosition) {
				final ICommand schemaBuilder = buildSpecs[schemaBuilderPosition];
				System.arraycopy(buildSpecs, schemaBuilderPosition+1, buildSpecs, schemaBuilderPosition, manifestBuilderPosition-schemaBuilderPosition);
				schemaBuilderPosition = manifestBuilderPosition--;
				buildSpecs[schemaBuilderPosition] = schemaBuilder;
			}
		} else {
			int schemaBuilderPosition = ProjectUtil.indexOf(buildSpecs, "org.eclipse.pde.SchemaBuilder");
			if (schemaBuilderPosition >= 0) {
				ICommand[] oldBuilderSpecs = buildSpecs;
				buildSpecs = new ICommand[oldBuilderSpecs.length - 1];
				if (schemaBuilderPosition > 0) {
					System.arraycopy(oldBuilderSpecs, 0, buildSpecs, 0, schemaBuilderPosition);
				}
				if (schemaBuilderPosition == buildSpecs.length) {
					System.arraycopy(oldBuilderSpecs, schemaBuilderPosition+1, buildSpecs, schemaBuilderPosition, buildSpecs.length-schemaBuilderPosition);
				}
			}
			int manifestBuilderPosition = ProjectUtil.indexOf(buildSpecs, "org.eclipse.pde.ManifestBuilder");
			if (manifestBuilderPosition >= 0) {
				ICommand[] oldBuilderSpecs = buildSpecs;
				buildSpecs = new ICommand[oldBuilderSpecs.length - 1];
				if (manifestBuilderPosition > 0) {
					System.arraycopy(oldBuilderSpecs, 0, buildSpecs, 0, manifestBuilderPosition);
				}
				if (manifestBuilderPosition == buildSpecs.length) {
					System.arraycopy(oldBuilderSpecs, manifestBuilderPosition+1, buildSpecs, manifestBuilderPosition, buildSpecs.length-manifestBuilderPosition);
				}
			}
		}
		return buildSpecs;
	}
}
