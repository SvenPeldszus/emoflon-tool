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
package org.gervarro.democles.codegen.emf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EcorePackage;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.GeneratorVariable;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.OperationBuilder;
import org.gervarro.democles.constraint.emf.Attribute;
import org.gervarro.democles.constraint.emf.EMFConstraint;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.constraint.emf.Operation;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.Variable;

public class BasicEMFOperationBuilder implements
		OperationBuilder<GeneratorOperation,GeneratorVariable> {

	public GeneratorOperation getVariableOperation(Variable variable, GeneratorVariable runtimeVariable) {
		if (variable.getType() instanceof EMFVariable) {
			EClassifier eClassifier = ((EMFVariable) variable.getType()).getLinkedElement();
			if (eClassifier instanceof EClass) {
				return new GeneratorOperation(variable,
						Collections.singletonList(runtimeVariable),
						Adornment.create(Adornment.NOT_TYPECHECKED),
						Adornment.create(Adornment.BOUND),
						variable.getType());
			} else if (eClassifier instanceof EDataType) {
				return new GeneratorOperation(variable,
						Collections.singletonList(runtimeVariable),
						Adornment.create(Adornment.NOT_TYPECHECKED),
						Adornment.create(Adornment.BOUND),
						variable.getType());
			}
		}
		return null;
	}
	
	protected EClass lookupEClass(GeneratorVariable runtimeVariable) {
		Variable variable = (Variable) runtimeVariable.getSpecification();
		EMFVariable emfVariable = (EMFVariable) variable.getType();
		return (EClass) emfVariable.getLinkedElement();
	}

	public List<GeneratorOperation> getConstraintOperations(Constraint constraint, List<GeneratorVariable> parameters) {
		if (constraint.getType() instanceof EMFConstraint<?>) {
			List<GeneratorOperation> result = new LinkedList<GeneratorOperation>();
			EMFConstraint<?> cType = (EMFConstraint<?>) constraint.getType();
			if (cType instanceof Attribute) {
				result.add(new GeneratorOperation(constraint, parameters,
						Adornment.create(Adornment.BOUND, Adornment.FREE),
						Adornment.create(Adornment.BOUND, Adornment.BOUND),
						cType, GeneratorOperation.ALWAYS_SUCCESSFUL));
				return result;
			} else if (cType instanceof Operation) {
				EOperation eOperation = ((Operation) cType).getLinkedElement();
				if (eOperation.getEType() != null) {
					int arraySize = eOperation.getEParameters().size() + 2;
					int[] precondition = new int[arraySize];
					Arrays.fill(precondition, Adornment.BOUND);
					precondition[0] = Adornment.FREE;
					EClassifier returnType = eOperation.getEType();
					final boolean isTypeCheckNeeded = EcorePackage.eINSTANCE.getEClass().isInstance(returnType) ? 
							!lookupEClass(parameters.get(0)).isSuperTypeOf((EClass) returnType) : false;
					int[] postcondition = new int[arraySize];
					Arrays.fill(postcondition, Adornment.BOUND);
					postcondition[0] = isTypeCheckNeeded ? Adornment.NOT_TYPECHECKED : Adornment.BOUND;
					result.add(new GeneratorOperation(constraint, parameters,
							new Adornment(precondition),
							new Adornment(postcondition),
							cType, isTypeCheckNeeded ? 0 : GeneratorOperation.ALWAYS_SUCCESSFUL));
					return result;
				} else {
					int[] bindings = new int[eOperation.getEParameters().size() + 1];
					Arrays.fill(bindings, Adornment.BOUND);
					result.add(new GeneratorOperation(constraint, parameters,
							new Adornment(bindings),
							new Adornment(bindings),
							cType, GeneratorOperation.ALWAYS_SUCCESSFUL));
					return result;
				}
			}
		}
		return null;
	}
}
