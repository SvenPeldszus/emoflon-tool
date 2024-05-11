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
import org.eclipse.core.runtime.CoreException;

public class ProjectConfigurationActivity implements IProjectConfigurationActivity {
	protected final ProjectConfigurator[] projectConfigurators;

	protected ProjectConfigurationActivity(final ProjectConfigurator[] projectConfigurators) {
		this.projectConfigurators = projectConfigurators;
	}
	
	public String getPatternCondition() {
		return null;
	}
	
	public boolean checkResource(IResource resource) {
		return false;
	}
	
	public boolean checkProject(IProject project) {
		return false;
	}
	
	public void switchOn(final ProjectConfiguratorTask projectConfigurationSession) throws CoreException {
		for (int i = 0; i < projectConfigurators.length; i++) {
			projectConfigurationSession.updateNatureIDs(projectConfigurators[i], true);
			projectConfigurationSession.updateBuildSpecs(projectConfigurators[i], true);
		}
	}
	
	public void switchOff(final ProjectConfiguratorTask projectConfigurationSession) throws CoreException {
		for (int i = projectConfigurators.length-1; i >= 0; i--) {
			projectConfigurationSession.updateNatureIDs(projectConfigurators[i], false);
			projectConfigurationSession.updateBuildSpecs(projectConfigurators[i], false);
		}
	}
}
