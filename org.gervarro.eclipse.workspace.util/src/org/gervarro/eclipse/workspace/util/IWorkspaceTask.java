package org.gervarro.eclipse.workspace.util;

import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.jobs.ISchedulingRule;

public interface IWorkspaceTask extends IWorkspaceRunnable {
	public String getTaskName();
	public ISchedulingRule getRule();
}
