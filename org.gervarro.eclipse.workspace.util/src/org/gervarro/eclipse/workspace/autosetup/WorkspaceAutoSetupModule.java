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

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.osgi.service.prefs.BackingStoreException;

public final class WorkspaceAutoSetupModule {
	public static final String PLUGIN_ID =
			"org.gervarro.eclipse.workspace.autosetup";
	public static final String WORKSPACE_AUTOSETUP_EXTENSION_POINT_ID =
			"org.gervarro.eclipse.workspace.autosetup";
	public static final String CONFIGURATION_ELEMENT = "configuration";
	public static final String ID_ATTRIBUTE = "id";
	public static final String NAME_ATTRIBUTE = "name";
	public static final String CLASS_ATTRIBUTE = "class";
	
	private WorkspaceAutoSetupModule() { }
	
	public static final AutoSetupConfiguration getConfiguration(final String configurationID) throws CoreException {
		if (configurationID != null) {
			final IConfigurationElement[] configurations =
					Platform.getExtensionRegistry().getConfigurationElementsFor(WORKSPACE_AUTOSETUP_EXTENSION_POINT_ID);
			for (final IConfigurationElement configElement : configurations) {
				if (configElement.getAttribute(ID_ATTRIBUTE).equals(configurationID)) {
					return (AutoSetupConfiguration) configElement.createExecutableExtension(CLASS_ATTRIBUTE);
				}
			}
		}
		return null;
	}
	
	static final String lookupConfigurationID(final IEclipsePreferences[] searchOrder) throws BackingStoreException {
		String configurationID = null;
		for (int i = 0; i < searchOrder.length && configurationID == null; i++) {
			if (searchOrder[i].nodeExists(PLUGIN_ID)) {
				configurationID = searchOrder[i].node(PLUGIN_ID).get("id", configurationID);
			}
		}
		return configurationID;
	}
	
	static final AutoSetupConfiguration lookupConfiguration(final IEclipsePreferences[] searchOrder) {
		try {
			return getConfiguration(lookupConfigurationID(searchOrder));
		} catch (BackingStoreException e) {
			// Do nothing
		} catch (CoreException e) {
			// Do nothing
		}
		return null;
	}
	
	public static final ICommand[] remove(ICommand[] array, int index) {
		final ICommand[] result = new ICommand[array.length - 1];
		if (index > 0) {
			System.arraycopy(array, 0, result, 0, index);
		}
		if (index < result.length) {
			System.arraycopy(array, index+1, result, index, result.length-index);
		}
		return result;
	}
	
	public static final String[] remove(String[] array, int index) {
		final String[] result = new String[array.length - 1];
		if (index > 0) {
			System.arraycopy(array, 0, result, 0, index);
		}
		if (index < result.length) {
			System.arraycopy(array, index+1, result, index, result.length-index);
		}
		return result;
	}
}

