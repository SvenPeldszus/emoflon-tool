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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.GeneratorVariable;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.constraint.emf.EMFConstraint;
import org.gervarro.democles.constraint.emf.Reference;
import org.gervarro.democles.specification.impl.Constraint;

public class EMFOperationBuilder extends BasicEMFOperationBuilder {

	public List<GeneratorOperation> getConstraintOperations(Constraint constraint, List<GeneratorVariable> parameters) {
		if (constraint.getType() instanceof EMFConstraint<?>) {
			List<GeneratorOperation> result = new LinkedList<GeneratorOperation>();
			EMFConstraint<?> cType = (EMFConstraint<?>) constraint.getType();
			if (cType instanceof Reference) {
				Reference reference = (Reference) cType;
				if (reference.isBidirectional()) {
					EReference eReference = ((Reference) cType).getLinkedElement();
					result.add(new GeneratorOperation(constraint, parameters,
							Adornment.create(Adornment.BOUND, Adornment.BOUND),
							Adornment.create(Adornment.BOUND, Adornment.BOUND),
							cType));
					final boolean isTargetTypeCheckNeeded = !lookupEClass(parameters.get(1)).isSuperTypeOf((EClass) eReference.getEType());
					result.add(new GeneratorOperation(constraint, parameters,
							Adornment.create(Adornment.BOUND, Adornment.FREE),
							Adornment.create(Adornment.BOUND, isTargetTypeCheckNeeded ? Adornment.NOT_TYPECHECKED : Adornment.BOUND),
							cType));
					final boolean isSourceTypeCheckNeeded = !lookupEClass(parameters.get(0)).isSuperTypeOf(eReference.getEContainingClass());
					result.add(new GeneratorOperation(constraint, parameters,
							Adornment.create(Adornment.FREE, Adornment.BOUND),
							Adornment.create(isSourceTypeCheckNeeded ? Adornment.NOT_TYPECHECKED : Adornment.BOUND, Adornment.BOUND),
							cType));
					return result;
				} else {
					EReference eReference = reference.getLinkedElement();
					result.add(new GeneratorOperation(constraint, parameters,
							Adornment.create(Adornment.BOUND, Adornment.BOUND),
							Adornment.create(Adornment.BOUND, Adornment.BOUND),
							cType));
					final boolean isTargetTypeCheckNeeded = !lookupEClass(parameters.get(1)).isSuperTypeOf((EClass) eReference.getEType());
					result.add(new GeneratorOperation(constraint, parameters,
							Adornment.create(Adornment.BOUND, Adornment.FREE),
							Adornment.create(Adornment.BOUND, isTargetTypeCheckNeeded ? Adornment.NOT_TYPECHECKED : Adornment.BOUND),
							cType));
					return result;
				}
			} else {
				return super.getConstraintOperations(constraint, parameters);
			}
		}
		return null;
	}
}