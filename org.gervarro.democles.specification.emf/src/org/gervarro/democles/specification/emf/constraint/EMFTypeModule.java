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
package org.gervarro.democles.specification.emf.constraint;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.Switch;
import org.gervarro.democles.constraint.emf.EMFConstraintModule;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.VariableType;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFConstraint;
import org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable;
import org.gervarro.democles.specification.emf.constraint.emf.emf.util.EMFTypeSwitch;

public final class EMFTypeModule extends org.gervarro.democles.specification.emf.TypeModule {
	
	public EMFTypeModule(EMFConstraintModule typeModule) {
		super(typeModule);
	}
	
	@Override
	protected final EMFVariableTypeSwitch createVariableTypeSwitch() {
		return new EMFVariableTypeSwitch();
	}

	@Override
	protected final Switch<ConstraintType> createConstraintTypeSwitch() {
		return new EMFConstraintTypeSwitch();
	}
	
	private class EMFVariableTypeSwitch extends EMFTypeSwitch<VariableType> {
		
		public VariableType caseEMFVariable(EMFVariable emfVariable) {
			EClassifier eClassifier = emfVariable.getEClassifier();
			return ((EMFConstraintModule) typeModule).getVariableType(eClassifier);
		}
	}
	
	private class EMFConstraintTypeSwitch extends EMFTypeSwitch<ConstraintType> {
		
		public <E extends ETypedElement> ConstraintType caseEMFConstraint(EMFConstraint<E> emfConstraint) {
			ETypedElement typedElement = emfConstraint.getEModelElement();
			return ((EMFConstraintModule) typeModule).getConstraintType(typedElement);
		}
	}

}
