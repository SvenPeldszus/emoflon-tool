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

import org.gervarro.democles.common.runtime.VariableRuntime;
import org.gervarro.democles.specification.impl.ConstraintVariable;

public class GeneratorVariable extends VariableRuntime {
	private final ConstraintVariable constraintVariable;
	
	public GeneratorVariable(ConstraintVariable constraintVariable, int index) {
		super(index);
		this.constraintVariable = constraintVariable;
	}
	
	public final ConstraintVariable getSpecification() {
		return constraintVariable;
	}
}
