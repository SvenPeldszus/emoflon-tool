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
package org.gervarro.democles.specification.emf;

import org.eclipse.emf.ecore.util.Switch;
import org.gervarro.democles.specification.Constraint;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.Variable;
import org.gervarro.democles.specification.VariableType;

abstract public class TypeModule {
	protected final org.gervarro.democles.common.TypeModule typeModule;
	private final Switch<VariableType> variableTypeSwitch;
	private final Switch<ConstraintType> constraintTypeSwitch;

	protected TypeModule(
			final org.gervarro.democles.common.TypeModule typeModule) {
		this.typeModule = typeModule;
		this.variableTypeSwitch = createVariableTypeSwitch();
		this.constraintTypeSwitch = createConstraintTypeSwitch();
	}

	/**
	 * Returns the stored {@link Switch} for {@link VariableType}s, created during the instantiation of this {@link TypeModule}.
	 */
	public final Switch<VariableType> getVariableTypeSwitch() {
		return variableTypeSwitch;
	}

	/**
	 * Returns the stored {@link Switch} for {@link ConstraintType}s, created during the instantiation of this {@link TypeModule}.
	 */
	public final Switch<ConstraintType> getConstraintTypeSwitch() {
		return constraintTypeSwitch;
	}

	/**
	 * Produces a switch for the types that this module supports.
	 * 
	 * The switches returned by this method operate as a factory that return an instance of {@link VariableType} for a given {@link Variable}.
	 */
	abstract protected Switch<VariableType> createVariableTypeSwitch();

	/**
	 * Produces a switch for the constraint types that this module supports.
	 * 
	 * The switches returned by this method operate as a factory that return an instance of {@link ConstraintType} for a given {@link Constraint}.
	 */
	abstract protected Switch<ConstraintType> createConstraintTypeSwitch();
}
