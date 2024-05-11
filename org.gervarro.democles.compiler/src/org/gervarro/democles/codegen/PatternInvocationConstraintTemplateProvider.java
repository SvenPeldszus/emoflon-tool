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
package org.gervarro.democles.codegen;

import org.gervarro.democles.constraint.PatternInvocationConstraintType;

public class PatternInvocationConstraintTemplateProvider implements
		CodeGeneratorProvider<Chain<TemplateController>> {

	@Override
	public Chain<TemplateController> getTemplateController(
			GeneratorOperation operation, Chain<TemplateController> tail) {
		return new Chain<TemplateController>(new TemplateController("/pattern/PatternCall", operation), tail);
	}

	@Override
	public final boolean isResponsibleFor(GeneratorOperation operation) {
		return operation != null && operation.getType() instanceof PatternInvocationConstraintType &&
				!((PatternInvocationConstraintType) operation.getType()).isPositive();
	}
}
