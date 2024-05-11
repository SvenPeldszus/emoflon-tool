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

import java.util.TreeMap;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.INodeChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.NodeChangeEvent;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.PreferenceChangeEvent;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.gervarro.eclipse.workspace.util.ProjectStateObserver;
import org.gervarro.eclipse.workspace.util.WorkspaceTaskJob;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;

public class ProjectAutoConfigurator extends ProjectStateObserver implements IPreferenceChangeListener,INodeChangeListener {
	private final TreeMap<String,AutoSetupConfiguration> projectConfigurations =
			new TreeMap<String,AutoSetupConfiguration>();
	private final IEclipsePreferences rootPreferences = 
			Platform.getPreferencesService().getRootNode();
	private final IEclipsePreferences projectPreferences =
			(IEclipsePreferences) rootPreferences.node(ProjectScope.SCOPE);
	private final IEclipsePreferences instancePreferences =
			(IEclipsePreferences) rootPreferences.node(InstanceScope.SCOPE);
	
	public final void installPreferenceChangeListeners() {
		try {
			projectPreferences.addNodeChangeListener(this);
			for (String projectName : projectPreferences.childrenNames()) {
				final IEclipsePreferences projectPreference = (IEclipsePreferences) projectPreferences.node(projectName);
				projectPreference.addNodeChangeListener(this);
				if (projectPreference.nodeExists(WorkspaceAutoSetupModule.PLUGIN_ID)) {
					final IEclipsePreferences childPreferences = (IEclipsePreferences) projectPreference.node(WorkspaceAutoSetupModule.PLUGIN_ID);
					childPreferences.addPreferenceChangeListener(this);
				}
			}
			instancePreferences.addNodeChangeListener(this);
			if (instancePreferences.nodeExists(WorkspaceAutoSetupModule.PLUGIN_ID)) {
				final IEclipsePreferences childPreferences = (IEclipsePreferences) instancePreferences.node(WorkspaceAutoSetupModule.PLUGIN_ID);
				childPreferences.addPreferenceChangeListener(this);
			}
		} catch (BackingStoreException e) {
			// Do nothing
		}
	}
	
	public final void uninstallPreferenceChangeListeners() {
		try {
			projectPreferences.removeNodeChangeListener(this);
			for (String projectName : projectPreferences.childrenNames()) {
				final IEclipsePreferences projectPreference = (IEclipsePreferences) projectPreferences.node(projectName);
				projectPreference.removeNodeChangeListener(this);
				if (projectPreference.nodeExists(WorkspaceAutoSetupModule.PLUGIN_ID)) {
					final IEclipsePreferences childPreferences = (IEclipsePreferences) projectPreference.node(WorkspaceAutoSetupModule.PLUGIN_ID);
					childPreferences.removePreferenceChangeListener(this);
				}
			}
			instancePreferences.removeNodeChangeListener(this);
			if (instancePreferences.nodeExists(WorkspaceAutoSetupModule.PLUGIN_ID)) {
				final IEclipsePreferences childPreferences = (IEclipsePreferences) instancePreferences.node(WorkspaceAutoSetupModule.PLUGIN_ID);
				childPreferences.removePreferenceChangeListener(this);
			}
		} catch (BackingStoreException e) {
			// Do nothing
		}
	}
	
	@Override
	public void added(NodeChangeEvent event) {
		final IEclipsePreferences child = (IEclipsePreferences) event.getChild();
		if (event.getParent() == projectPreferences) {
			child.addNodeChangeListener(this);
		} else if (event.getParent().parent() == projectPreferences &&
				child.name() == WorkspaceAutoSetupModule.PLUGIN_ID) {
			child.addNodeChangeListener(this);
			child.addPreferenceChangeListener(this);
		} else if (event.getParent() == instancePreferences &&
				child.name() == WorkspaceAutoSetupModule.PLUGIN_ID) {
			child.addPreferenceChangeListener(this);
		}
	}
	
	protected void handlePreDelete(final IResource resource) {
		super.handlePreDelete(resource);
		if (resource.getType() == IResource.PROJECT) {
			try {
				if (projectPreferences.nodeExists(resource.getName())) {
					final IEclipsePreferences child =
							(IEclipsePreferences) projectPreferences.node(resource.getName());
					child.removeNodeChangeListener(this);
					if (child.nodeExists(WorkspaceAutoSetupModule.PLUGIN_ID)) {
						final IEclipsePreferences grandchild =
								(IEclipsePreferences) child.node(WorkspaceAutoSetupModule.PLUGIN_ID);
						grandchild.removeNodeChangeListener(this);
						grandchild.removePreferenceChangeListener(this);
					}
				}
			} catch (BackingStoreException e) {
				// Do nothing
			}
		}
	}

	@Override
	public void removed(NodeChangeEvent event) {
		final IEclipsePreferences child = (IEclipsePreferences) event.getChild();
		if (event.getParent().parent() == projectPreferences &&
				child.name() == WorkspaceAutoSetupModule.PLUGIN_ID) {
			child.removeNodeChangeListener(this);
			child.removePreferenceChangeListener(this);
		} else if (event.getParent() == instancePreferences &&
				child.name() == WorkspaceAutoSetupModule.PLUGIN_ID) {
			child.removePreferenceChangeListener(this);
		}
	}
	
	@Override
	public final void preferenceChange(final PreferenceChangeEvent event) {
		final Preferences node = event.getNode();
		if (node != null && WorkspaceAutoSetupModule.PLUGIN_ID.equals(node.name()) && "id".equals(event.getKey())) {
			if (node.parent() == instancePreferences) {
				// Workspace reconfiguration
				final IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
				final IResourceVisitor workspaceVisitor = new IResourceVisitor() {
					@Override
					public boolean visit(final IResource resource) throws CoreException {
						final int resourceType = resource.getType();
						if (resourceType == IResource.ROOT) {
							final IProject[] projects = workspaceRoot.getProjects();
							for (int i = 0; i < projects.length; i++) {
								try {
									final IEclipsePreferences[] searchOrder = new IEclipsePreferences[] {
											(IEclipsePreferences) projectPreferences.node(projects[i].getName())
									};
									if (WorkspaceAutoSetupModule.lookupConfigurationID(searchOrder) == null) {
										final AutoSetupConfiguration oldConfig = event.getOldValue() != null ? getConfigurationToUninstall(projects[i]) : null;
										final AutoSetupConfiguration newConfig = event.getNewValue() != null ? getConfigurationToInstall(projects[i]) : null;
										final ProjectAutoSetupInstallerVisitor visitor = new ProjectAutoSetupInstallerVisitor(oldConfig, newConfig);
										final ResourceVisitorTask task =
												new ResourceVisitorTask("Project auto-setup installer", projects[i], IResource.DEPTH_ZERO, visitor);
										ResourcesPlugin.getWorkspace().run(task, projects[i], IWorkspace.AVOID_UPDATE,
												Job.getJobManager().createProgressGroup());
										synchronized (projectConfigurations) {
											projectConfigurations.put(projects[i].getName(), newConfig);
										}
									}
								} catch (BackingStoreException e) {
									// Do nothing
								}
							}
						}
						return false;
					}
				};
				final ResourceVisitorTask workspaceTraversalTask =
						new ResourceVisitorTask("Workspace auto-setup installer", workspaceRoot, IResource.DEPTH_ZERO, workspaceVisitor);
				new WorkspaceTaskJob(workspaceTraversalTask).schedule();
			} else if (node.parent().parent() == projectPreferences) {
				// Project reconfiguration
				final String projectName = node.parent().name();
				final IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				final IResourceVisitor projectVisitor = new IResourceVisitor() {
					@Override
					public boolean visit(final IResource resource) throws CoreException {
						final int resourceType = resource.getType();
						if (resourceType == IResource.PROJECT) {
							final AutoSetupConfiguration oldConfig = event.getOldValue() != null ? getConfigurationToUninstall(project) : null;
							final AutoSetupConfiguration newConfig = event.getNewValue() != null ? getConfigurationToInstall(project) : null;
							final ProjectAutoSetupInstallerVisitor visitor = new ProjectAutoSetupInstallerVisitor(oldConfig, newConfig);
							final ResourceVisitorTask task =
									new ResourceVisitorTask("Project auto-setup installer", project, IResource.DEPTH_ZERO, visitor);
							ResourcesPlugin.getWorkspace().run(task, project, IWorkspace.AVOID_UPDATE,
									Job.getJobManager().createProgressGroup());
							synchronized (projectConfigurations) {
								projectConfigurations.put(project.getName(), newConfig);
							}
						}
						return false;
					}
				};
				final ResourceVisitorTask task = new ResourceVisitorTask("Project auto-setup installer", project, IResource.DEPTH_ZERO, projectVisitor);
				new WorkspaceTaskJob(task).schedule();
			}
		}
	}
	
	protected void handleInit(final IResource resource) {
		install(resource.getProject());
	}
	
	protected void handlePostCreate(IResourceDelta delta) {
		install(delta.getResource().getProject());
	}
	
	protected void handlePostOpen(IResourceDelta delta) {
		install(delta.getResource().getProject());
	}
	
	protected void handleProjectInternalDelta(IResourceDelta delta) {
		// install(delta.getResource().getProject());
	}
	
	private final IEclipsePreferences[] getSearchOrder(final IProject project) {
		final IEclipsePreferences rootPrefs = Platform.getPreferencesService().getRootNode();
		return new IEclipsePreferences[] {
				(IEclipsePreferences) rootPrefs.node(ProjectScope.SCOPE).node(project.getName()),
				(IEclipsePreferences) rootPrefs.node(InstanceScope.SCOPE)
		};
	}
	
	private final AutoSetupConfiguration getConfigurationToInstall(final IProject project) {
		return WorkspaceAutoSetupModule.lookupConfiguration(getSearchOrder(project));
	}

	private final AutoSetupConfiguration getConfigurationToUninstall(final IProject project) {
		synchronized (projectConfigurations) {
			return projectConfigurations.get(project.getName());
		}
	}

	private final void install(final IProject project) {
		try {
			final AutoSetupConfiguration configuration = getConfigurationToInstall(project);
			if (configuration != null) {
				final ProjectAutoSetupInstallerVisitor visitor =
						new ProjectAutoSetupInstallerVisitor(null, configuration);
				project.accept(visitor, IResource.DEPTH_ZERO, IContainer.INCLUDE_HIDDEN);
				synchronized (projectConfigurations) {
					projectConfigurations.put(project.getName(), configuration);
				}
			}
		} catch (CoreException e) {
			// Do nothing
		}
	}
}
