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

import java.util.List;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.OperationRuntime;

public class GeneratorOperation implements OperationRuntime {
	public static final int ALWAYS_SUCCESSFUL = 0x1;
	
	private final Object origin;
	private final List<GeneratorVariable> parameters;
	private final Adornment precondition;
	private final Adornment postcondition;
	private final Object type;
	private final int options;
	
	public GeneratorOperation(Object origin,
			List<GeneratorVariable> parameters,
			Adornment precondition,
			Adornment postcondition,
			Object type) {
		this(origin, parameters, precondition, postcondition, type, 0);
	}
	
	public GeneratorOperation(Object origin,
			List<GeneratorVariable> parameters,
			Adornment precondition,
			Adornment postcondition,
			Object type,
			int options) {
		this.origin = origin;
		this.parameters = parameters;
		this.precondition = precondition;
		this.postcondition = postcondition;
		this.type = type;
		this.options = options;
	}
	
	public final Adornment getPrecondition() {
		return precondition;
	}

	public final Adornment getPostcondition() {
		return postcondition;
	}

	public final Object getOrigin() {
		return origin;
	}
	
	public final List<GeneratorVariable> getParameters() {
		return parameters;
	}
	
	public final Object getType() {
		return type;
	}
	
	public final boolean isAlwaysSuccessful() {
		return (options & ALWAYS_SUCCESSFUL) != 0;
	}
	
	public String toString() {
		return origin.toString() + "^" + precondition.toString() + "->" + postcondition.toString();
	}
	
	public String getLowerCaseName(String original) {
		if (Character.isUpperCase(original.charAt(0))) {
			return original.substring(0, 1).toLowerCase() + original.substring(1);
		} else {
			return original;
		}
	}
	
	public String getUpperCaseName(String original) {
		if (Character.isLowerCase(original.charAt(0))) {
			return original.substring(0, 1).toUpperCase() + original.substring(1);
		} else {
			return original;
		}
	}

}
