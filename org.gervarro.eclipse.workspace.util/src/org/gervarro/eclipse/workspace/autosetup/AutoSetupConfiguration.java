package org.gervarro.eclipse.workspace.autosetup;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

public interface AutoSetupConfiguration {
	public boolean isOverwriteForced();
	public IProjectConfigurationActivity[] getActivities();
	public ProjectConfiguratorTask getProjectConfiguratorTask(IProject project) throws CoreException;
}
