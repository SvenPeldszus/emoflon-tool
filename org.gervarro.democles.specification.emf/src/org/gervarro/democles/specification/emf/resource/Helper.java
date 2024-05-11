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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.impl.XMIHelperImpl;
import org.gervarro.democles.common.TypeModule;

public class Helper extends XMIHelperImpl {
	private Map<String, TypeModule> sessions =
		new HashMap<String, TypeModule>();
	
	public Helper(PatternResource resource) {
		super(resource);
	}
	
	public PatternResource getResource() {
		return (PatternResource) super.getResource();
	}
	
//	public void addPrefix(String prefix, String uri) {
//		super.addPrefix(prefix, uri);
//	}
//	
//	public String getURI(String prefix) {
//		return super.getURI(prefix);
//	}
	
	public String getPrefix(EPackage ePackage, boolean mustHavePrefix) {
		return super.getPrefix(ePackage, mustHavePrefix);
	}
	
	public String convertToString(EFactory eFactory, EDataType eDataType, Object value) {
//		if (SpecificationPackage.Literals.CONSTRAINT_TYPE == eDataType && SpecificationPackage.Literals.CONSTRAINT_TYPE.isInstance(value)) {
//			ConstraintType constraintType = (ConstraintType) value;
//			TypeModule tModule = constraintType.getModule();
//			TypeModuleSerializationSession session = getSession(tModule);
//			return session.getConstraintTypeIdentifier(constraintType);
//			// throw new RuntimeException("Handler for ConstraintType " + value.getClass() + " cannot be found.");
//		} else if (SpecificationPackage.Literals.VARIABLE_TYPE == eDataType && SpecificationPackage.Literals.VARIABLE_TYPE.isInstance(value)) {
//			VariableType variableType = (VariableType) value;
//			TypeModule tModule = variableType.getModule();
//			TypeModuleSerializationSession session = getSession(tModule);
//			return session.getVariableTypeIdentifier(variableType);
//			// throw new RuntimeException("Handler for VariableType " + value.getClass() + " cannot be found.");
//		}
		return super.convertToString(eFactory, eDataType, value);
	}

	protected Object createFromString(EFactory eFactory, EDataType eDataType, String value) {
//		if (SpecificationPackage.Literals.CONSTRAINT_TYPE == eDataType) {
//			if (value.startsWith("/")) {
//				value = value.substring(1);
//				int slashIndex = value.indexOf("/");
//				String prefix = slashIndex == -1 ? value : value.substring(0, slashIndex);
//				String rest = slashIndex == -1 ? "" : value.substring(slashIndex);
//				for (TypeModuleProxy module : getResource().getPlugin().getTypeModuleProxies()) {
//					if (prefix.equals(module.getName())) {
//						TypeModuleSerializationSession session = getSession(module);
//						return session.getConstraintType(rest);
//					}
//				}
//				throw new RuntimeException("Handler for ConstraintType " + value + " cannot be found.");
//			}
//			throw new RuntimeException("Invalid identifier: " + value);
//		} else if (SpecificationPackage.Literals.VARIABLE_TYPE == eDataType) {
//			if (value.startsWith("/")) {
//				value = value.substring(1);
//				int slashIndex = value.indexOf("/");
//				String prefix = slashIndex == -1 ? value : value.substring(0, slashIndex);
//				String rest = slashIndex == -1 ? "" : value.substring(slashIndex);
//				for (TypeModuleProxy module : getResource().getPlugin().getTypeModuleProxies()) {
//					if (prefix.equals(module.getName())) {
//						TypeModuleSerializationSession session = getSession(module);
//						return session.getVariableType(rest);
//					}
//				}
//				throw new RuntimeException("Handler for VariableType " + value + " cannot be found.");
//			}
//			throw new RuntimeException("Invalid identifier: " + value);
//		}
		return super.createFromString(eFactory, eDataType, value);
	}
	
	public Object getValue(EObject object, EStructuralFeature feature) {
		return super.getValue(object, feature);
	}
	
	public EObject createObject(EFactory eFactory, EClassifier type) {
		return super.createObject(eFactory, type);
	}
	
//	public void setValue(EObject object, EStructuralFeature feature, Object value, int position) {
//		if (SpecificationPackage.eINSTANCE.getConstraint().isInstance(object) && SpecificationPackage.eINSTANCE.getConstraint_Type() == feature) {
//			value = getResource().resolve((ConstraintType) value);
//			if (value instanceof InternalEObject && ((InternalEObject) value).eIsProxy()) {
//				throw new RuntimeException("Constraint type " + ((InternalEObject) value).eProxyURI().toString() + " cannot be resolved.");
//			}
//		}
//		if (SpecificationPackage.eINSTANCE.getVariable().isInstance(object) && SpecificationPackage.eINSTANCE.getVariable_Type() == feature) {
//			value = getResource().resolve((VariableType) value);
//			if (value instanceof InternalEObject && ((InternalEObject) value).eIsProxy()) {
//				throw new RuntimeException("Variable type " + ((InternalEObject) value).eProxyURI().toString() + " cannot be resolved.");
//			}
//		}
//		super.setValue(object, feature, value, position);
//	}
}
