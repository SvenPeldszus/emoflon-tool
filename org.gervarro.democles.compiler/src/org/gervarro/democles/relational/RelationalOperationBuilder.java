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
package org.gervarro.democles.relational;

import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.GeneratorVariable;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.OperationBuilder;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.Variable;

public final class RelationalOperationBuilder implements
		OperationBuilder<GeneratorOperation,GeneratorVariable> {

	@Override
	public List<GeneratorOperation> getConstraintOperations(
			Constraint constraint, List<GeneratorVariable> parameters) {
		ConstraintType cType = constraint.getType();
		if (cType == CoreConstraintModule.EQUAL) {
			List<GeneratorOperation> result = new LinkedList<GeneratorOperation>();
			result.add(new GeneratorOperation(constraint, parameters,
					Adornment.create(Adornment.BOUND, Adornment.BOUND),
					Adornment.create(Adornment.BOUND, Adornment.BOUND),
					CoreConstraintModule.EQUAL));
			return result;
		} else if (cType == CoreConstraintModule.UNEQUAL) {
			List<GeneratorOperation> result = new LinkedList<GeneratorOperation>();
			result.add(new GeneratorOperation(constraint, parameters,
					Adornment.create(Adornment.BOUND, Adornment.BOUND),
					Adornment.create(Adornment.BOUND, Adornment.BOUND),
					CoreConstraintModule.UNEQUAL));
			return result;
		} else if (cType == CoreConstraintModule.SMALLER) {
			List<GeneratorOperation> result = new LinkedList<GeneratorOperation>();
			result.add(new GeneratorOperation(constraint, parameters,
					Adornment.create(Adornment.BOUND, Adornment.BOUND),
					Adornment.create(Adornment.BOUND, Adornment.BOUND),
					CoreConstraintModule.SMALLER));
			return result;
		} else if (cType == CoreConstraintModule.SMALLER_OR_EQUAL) {
			List<GeneratorOperation> result = new LinkedList<GeneratorOperation>();
			result.add(new GeneratorOperation(constraint, parameters,
					Adornment.create(Adornment.BOUND, Adornment.BOUND),
					Adornment.create(Adornment.BOUND, Adornment.BOUND),
					CoreConstraintModule.SMALLER_OR_EQUAL));
			return result;
		} else if (cType == CoreConstraintModule.LARGER) {
			List<GeneratorOperation> result = new LinkedList<GeneratorOperation>();
			result.add(new GeneratorOperation(constraint, parameters,
					Adornment.create(Adornment.BOUND, Adornment.BOUND),
					Adornment.create(Adornment.BOUND, Adornment.BOUND),
					CoreConstraintModule.LARGER));
			return result;
		} else if (cType == CoreConstraintModule.LARGER_OR_EQUAL) {
			List<GeneratorOperation> result = new LinkedList<GeneratorOperation>();
			result.add(new GeneratorOperation(constraint, parameters,
					Adornment.create(Adornment.BOUND, Adornment.BOUND),
					Adornment.create(Adornment.BOUND, Adornment.BOUND),
					CoreConstraintModule.LARGER_OR_EQUAL));
			return result;
		}
		return null;
	}

	@Override
	public final GeneratorOperation getVariableOperation(Variable variable,
			GeneratorVariable runtimeVariable) {
		return null;
	}
}
