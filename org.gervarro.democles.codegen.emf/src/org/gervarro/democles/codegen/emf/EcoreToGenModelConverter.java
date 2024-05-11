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
package org.gervarro.democles.codegen.emf;

import java.util.HashMap;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

public class EcoreToGenModelConverter {
	private final GenModel genModel;
	private final HashMap<EModelElement, GenBase> cache =
			new HashMap<EModelElement, GenBase>();

	public EcoreToGenModelConverter(GenModel genModel) {
		this.genModel = genModel;
	}
	
	public final GenBase getGenModelElement(EModelElement eModelElement) {
		GenBase result = cache.get(eModelElement);
		if (result == null) {
			if (EcorePackage.eINSTANCE.getEClassifier().isInstance(eModelElement)) {
				EClassifier eClassifier = (EClassifier) eModelElement;
				result = genModel.findGenClassifier(eClassifier);
			} else if (EcorePackage.eINSTANCE.getEStructuralFeature().isInstance(eModelElement)) {
				EStructuralFeature eStructuralFeature = (EStructuralFeature) eModelElement;
				result = genModel.findGenFeature(eStructuralFeature);
			} else if (EcorePackage.eINSTANCE.getEOperation().isInstance(eModelElement)) {
				EOperation eOperation = (EOperation) eModelElement;
				result = genModel.findGenOperation(eOperation);
			} else if (EcorePackage.eINSTANCE.getEPackage().isInstance(eModelElement)) {
				EPackage ePackage = (EPackage) eModelElement;
				result = genModel.findGenPackage(ePackage);
			}
			if (result != null) {
				cache.put(eModelElement, result);
			}
		}
		return result;
	}
	
	public final String toString(EModelElement eModelElement) {
		GenBase genModelElement = getGenModelElement(eModelElement);
		return toString(genModelElement);
	}
	
	public final String toString(GenBase genModelElement) {
		if (genModelElement instanceof GenClass) {
			GenClass genClass = (GenClass) genModelElement;
			EClass eClass = genClass.getEcoreClass();
			boolean includeTemplateArguments = false;
		    return eClass.getInstanceClassName() != null ?
		      includeTemplateArguments ? eClass.getInstanceTypeName() : eClass.getInstanceClassName() :
		      genClass.getGenPackage().getInterfacePackageName() + "." + genClass.getInterfaceName();
//		      if (!genClass.isExternalInterface() && (!genModel.isSuppressInterfaces() || genClass.isInterface())) {
//		    	  StringBuilder sb = new StringBuilder();
//		    	  sb.append(genClass.getGenPackage().getInterfacePackageName());
//		    	  sb.append(".");
//		    	  sb.append(genClass.getInterfaceName());
//		    	  sb.append(genClass.getTypeParameters().trim());
//		    	  return sb.toString();
//		      } else if (!genClass.isInterface()) {
//		    	  StringBuilder sb = new StringBuilder();
//		    	  sb.append(genClass.getGenPackage().getClassPackageName());
//		    	  sb.append(".");
//		    	  sb.append(genClass.getClassName());
//		    	  sb.append(genClass.getTypeParameters().trim());
//		    	  return sb.toString();
//		      }
		} else if (genModelElement instanceof GenEnum) {
			GenEnum genEnum = (GenEnum) genModelElement;
			StringBuilder sb = new StringBuilder();
			sb.append(genEnum.getGenPackage().getInterfacePackageName());
			sb.append(".");
			sb.append(genEnum.getName());
			return sb.toString();
		} else if (genModelElement instanceof GenDataType) {
			return ((GenDataType) genModelElement).getQualifiedInstanceClassName();
		} 
		return null;
	}
}
