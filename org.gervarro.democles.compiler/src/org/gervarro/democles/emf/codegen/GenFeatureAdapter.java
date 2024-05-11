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
package org.gervarro.democles.emf.codegen;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

@Deprecated
public class GenFeatureAdapter extends GenModelElementAdapter<EStructuralFeature, GenFeature> {

	GenFeatureAdapter() {
		super();
	}

	public GenClassAdapter getParent() {
		EClass eClass = getEModelElement().getEContainingClass();
		return (GenClassAdapter) factory.adapt(eClass, null);
	}

	public final boolean isToMany() {
		return getGenElement().getEcoreFeature().isMany();
	}

	public final String getMethod() {
		return getGenElement().getGetAccessor() + "()";
	}
	
	public final String getReturnType() {
		if (getGenElement().isListType()) {
			return getGenElement().getQualifiedListItemType(getContext(getGenElement()));
		}
		return getGenElement().getRawBoundType();
	}
	
	public final String[] getTypes() {
		return new String[] { getParent().getTypeName(), getReturnType() };
	}

	public final String getForwardMethod() {
		return getGenElement().getGetAccessor() + "()";
	}
	
	public final String getBackwardMethod() {
		return getGenElement().getReverse().getGetAccessor() + "()";
	}
	
	public final String getFullyQualifiedClassName() {
		return getPackageName() + "." + getClassName();
	}
	
	public final String getPackageName() {
		return getParent().getParent().getPackageName();
	}
	
	public final String getClassName() {
		return getParent().getGenElement().getName() + getGenElement().getCapName() + "Operation";
	}
	
	private GenClass getContext(GenFeature feature) {
		for (EObject context = feature.eContainer(); context != null; context = context.eContainer()) {
			if (context instanceof GenClass) {
				return (GenClass)context;
			}
		}
		return null;
	}
	
	public String toString() {
		return getEModelElement() != null ? getEModelElement().toString() : super.toString();
	}
}
