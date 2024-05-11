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
package org.gervarro.democles.specification.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.gervarro.democles.common.Adornment;

public class DefaultPatternBody extends org.gervarro.democles.specification.impl.PatternBody {
	private DefaultPattern parent = null;
	private final List<Variable> localVariables;
	private final List<Constraint> constraints;
	private final List<Constant> constants;

	DefaultPatternBody(Variable[] localVariables, Constraint[] constraints, Constant[] constants) {
		this.localVariables = Collections.unmodifiableList(Arrays.asList(localVariables));
		this.constraints = Collections.unmodifiableList(Arrays.asList(constraints));
		this.constants = Collections.unmodifiableList(Arrays.asList(constants));
	}
	
	public DefaultPattern getHeader() {
		return parent;
	}

	void setParent(DefaultPattern parent) {
		this.parent = parent;
	}
	
	public final List<Variable> getLocalVariables() {
		return localVariables; 
	}

	public final List<Constraint> getConstraints() {
		return constraints; 
	}

	public final List<Constant> getConstants() {
		return constants;
	}
	
	public final int frameSize() {
		return getHeader().getSymbolicParameters().size() + getLocalVariables().size();
	}
	
	public Adornment calculateAdornment(Adornment input) {
		int numberOfSymbolicParameters = getHeader().getSymbolicParameters().size();
		int numberOfVariables = numberOfSymbolicParameters + getLocalVariables().size();
		Adornment adornment = new Adornment(frameSize() + getConstants().size());
		// Symbolic parameters depend on the input
		for (int i = 0; i < numberOfSymbolicParameters; i++) {
			adornment.set(i, input.get(i));
		}
		// Local variables are free
		for (int i = numberOfSymbolicParameters; i < numberOfVariables; i++) {
			adornment.set(i, Adornment.FREE);
		}
		// Constants are bound (nothing to do as values of adornments are bound by default)
		return adornment;
	}

	public Object getConstant(int index) {
		return getConstants().get(index).getValue();
	}

	public Variable getVariable(int index) {
		List<Variable> symbolicParameters = getHeader().getSymbolicParameters();
		int diff = index - symbolicParameters.size();
		return diff < 0 ? symbolicParameters.get(index) : getLocalVariables().get(diff);
	}
}