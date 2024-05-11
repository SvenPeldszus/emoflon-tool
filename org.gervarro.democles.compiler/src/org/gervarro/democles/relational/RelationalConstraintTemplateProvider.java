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

import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.CodeGeneratorProvider;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.TemplateController;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.constraint.CoreConstraintType;
import org.gervarro.democles.specification.ConstraintType;

public final class RelationalConstraintTemplateProvider implements
		CodeGeneratorProvider<Chain<TemplateController>> {

	@Override
	public final Chain<TemplateController> getTemplateController(
			GeneratorOperation operation, Chain<TemplateController> tail) {
		Adornment adornment = operation.getPrecondition();
		if (adornment.get(0) == Adornment.BOUND && adornment.get(1) == Adornment.BOUND) {
			ConstraintType type = (ConstraintType) operation.getType();
			if (type == CoreConstraintModule.EQUAL) {
				return new Chain<TemplateController>(new TemplateController("/core/Equal", operation), tail);
			} else if (type == CoreConstraintModule.UNEQUAL) {
				return new Chain<TemplateController>(new TemplateController("/core/Unequal", operation), tail);
			} else if (type == CoreConstraintModule.SMALLER) {
				return new Chain<TemplateController>(new TemplateController("/core/Smaller", operation), tail);
			} else if (type == CoreConstraintModule.SMALLER_OR_EQUAL) {
				return new Chain<TemplateController>(new TemplateController("/core/SmallerOrEqual", operation), tail);
			} else if (type == CoreConstraintModule.LARGER) {
				return new Chain<TemplateController>(new TemplateController("/core/Larger", operation), tail);
			} else if (type == CoreConstraintModule.LARGER_OR_EQUAL) {
				return new Chain<TemplateController>(new TemplateController("/core/LargerOrEqual", operation), tail);
			}
		}
		throw new RuntimeException("Invalid operation");
	}

	@Override
	public final boolean isResponsibleFor(GeneratorOperation operation) {
		return operation != null && operation.getType() instanceof CoreConstraintType;
	}
}
