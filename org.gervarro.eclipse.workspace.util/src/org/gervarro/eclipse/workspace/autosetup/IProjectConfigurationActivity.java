package org.gervarro.eclipse.workspace.autosetup;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public interface IProjectConfigurationActivity {
	public String getPatternCondition();
	public boolean checkResource(IResource resource);
	public void switchOn(final ProjectConfiguratorTask projectConfigurationSession) throws CoreException;
	public void switchOff(final ProjectConfiguratorTask projectConfigurationSession) throws CoreException;
}
