/*
 * Democles, Declarative Model Query Framework for Monitoring Heterogeneous Embedded Systems
 * Copyright (C) 2010  Gergely Varro
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
package org.gervarro.democles.emf.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class ResourceProxy extends XMIResourceImpl {
	
	public ResourceProxy(URI uri) {
		super(uri);
	}
	
	public EObject getEObject(String uriFragment) {
		EObject result = super.getEObject(uriFragment);
		if (isLoaded && !isLoading && result instanceof EModelElement) {
			for (EObject current = result; current != null; current = current.eContainer()) {
				if (current instanceof EPackage) {
					EPackage ePackageInFile = (EPackage) current;
//					String prefix = getURIFragment(ePackageInFile);
//					if (uriFragment.startsWith(prefix)) {
//						InternalEObject proxy = (InternalEObject) EcorePackage.eINSTANCE.getEcoreFactory().create(result.eClass());
//						proxy.eSetProxyURI(URI.createURI(ePackageInFile.getNsURI()).appendFragment("/" + uriFragment.substring(prefix.length())));
//						return proxy;
//					}
					InternalEObject proxy = (InternalEObject) EcorePackage.eINSTANCE.getEcoreFactory().create(result.eClass());
					proxy.eSetProxyURI(URI.createURI(ePackageInFile.getNsURI()).appendFragment(uriFragment));
					return proxy;
				}
			}
		}
		return result;
	}
	
	public void doUnload() {
		super.doUnload();
	}
}
