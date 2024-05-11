/*
 * Democles, Declarative Model Query Framework for Monitoring Heterogeneous Embedded Systems
 * Copyright (C) 2010-2012  Gergely Varro
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.democles.specification.emf.resource;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.gervarro.democles.common.PatternMatcherPlugin;

public class PatternResource extends XMIResourceImpl {
	
	public PatternResource(URI uri) {
		super(uri);
	}
	
	private final PatternMatcherPluginAdapter getPluginAdapter() {
		EList<Adapter> adapters = getResourceSet().eAdapters();
		return (PatternMatcherPluginAdapter) EcoreUtil.getAdapter(adapters, PatternMatcherPluginAdapter.class);
	}
	
	final PatternMatcherPlugin getPlugin() {
		return getPluginAdapter().getPlugin();
	}
	
	public NotificationChain basicSetResourceSet(ResourceSet newResourceSet, NotificationChain notifications) {
		NotificationChain result = super.basicSetResourceSet(newResourceSet, notifications);
		if (getResourceSet() != null) {
			PatternMatcherPluginAdapter adapter = getPluginAdapter();
			if (adapter == null) {
				PatternMatcherPlugin plugin = PatternMatcherPlugin.createPlugin();
				adapter = new PatternMatcherPluginAdapter(plugin);
				getResourceSet().eAdapters().add(adapter);
			}
		}
		return result;
	}
	
	protected final Helper createXMLHelper() {
		return new Helper(this);
	}
}
