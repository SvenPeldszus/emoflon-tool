package org.gervarro.eclipse.workspace.util;

import org.eclipse.core.resources.IProject;

public class ProjectVisitingSession<S extends WorkspaceTask> extends ProjectVisitor {
	protected final S session;
	
	public ProjectVisitingSession(final IProject project, final VisitorCondition condition,
			final S session) {
		super(project, condition);
		this.session = session;
	}
}
