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
package org.gervarro.democles.codegen;

import java.util.List;
import java.util.ListIterator;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.specification.impl.Variable;

abstract public class AbstractCodeGeneratorBuilder<T> {
	abstract protected T getSuccessfulMatchingController();
	abstract protected T getWriteVariableController(GeneratorOperation operation, int index, T tail);
	abstract protected T getCheckVariableController(GeneratorOperation operation, int index, T tail);
	abstract protected T getOperationController(GeneratorOperation operation, T tail);
	abstract protected T getReadVariableController(GeneratorOperation operation, int index, T tail);
	abstract protected T getMethodController(GeneratorOperation operation, T tail);

	public T getGeneralConstraintGenerator(GeneratorOperation operation) {
		List<GeneratorVariable> params = operation.getParameters();

		T renderable = getSuccessfulMatchingController();
		ListIterator<GeneratorVariable> iterator = null;
		for (iterator = params.listIterator(params.size()); iterator.hasPrevious(); ) {
			int index = iterator.previousIndex();
			GeneratorVariable current = iterator.previous();
			if (operation.getPrecondition().get(index) == Adornment.FREE && current.getSpecification() instanceof Variable) {
				renderable = getWriteVariableController(operation, index, renderable);
			}
		}

		for (iterator = params.listIterator(params.size()); iterator.hasPrevious(); ) {
			int index = iterator.previousIndex();
			GeneratorVariable current = iterator.previous();
			if (operation.getPrecondition().get(index) == Adornment.FREE && current.getSpecification() instanceof Variable) {
				renderable = getCheckVariableController(operation, index, renderable);
			}
		}

		renderable = getOperationController(operation, renderable);

		for (iterator = params.listIterator(params.size()); iterator.hasPrevious(); ) {
			int index = iterator.previousIndex();
			GeneratorVariable current = iterator.previous();
			if (operation.getPrecondition().get(index) == Adornment.BOUND && current.getSpecification() instanceof Variable) {
				renderable = getReadVariableController(operation, index, renderable);
			}
		}
		 return getMethodController(operation, renderable);
	}
}
