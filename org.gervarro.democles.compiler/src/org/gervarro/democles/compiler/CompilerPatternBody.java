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
package org.gervarro.democles.compiler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.GeneratorVariable;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.VariableRuntime;
import org.gervarro.democles.specification.impl.Constant;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.ConstraintVariable;
import org.gervarro.democles.specification.impl.PatternBody;
import org.gervarro.democles.specification.impl.Variable;

public class CompilerPatternBody extends PatternBody {
	private CompilerPattern pattern;
	private int index;
	private final List<Constraint> constraints;
	private final List<Variable> localVariables;
	private final List<Constant> constants;
	private List<GeneratorVariable> runtimeSlots;
	private List<GeneratorOperation> localVariableOperations;
	private List<GeneratorOperation> operations;

	protected CompilerPatternBody(List<Variable> localVariables,
			List<Constant> constants,
			List<Constraint> constraints) {
		this.localVariables = new ArrayList<Variable>(localVariables);
		this.constants = new ArrayList<Constant>(constants);
		this.constraints = constraints;
	}
	
	public final CompilerPattern getHeader() {
		return pattern;
	}
	
	final void setHeader(CompilerPattern pattern) {
		this.pattern = pattern;
	}
	
	public final List<Variable> getLocalVariables() {
		return localVariables;
	}

	final List<GeneratorVariable> getRuntimeSlots() {
		if (runtimeSlots == null) {
			final int offset = getHeader().getSymbolicParameters().size();
			runtimeSlots = new ArrayList<GeneratorVariable>(getLocalVariables().size() + getConstants().size());
			runtimeSlots.addAll(getHeader().getBuilder().createVariableRuntimes(getLocalVariables(), offset));
			runtimeSlots.addAll(getHeader().getBuilder().createVariableRuntimes(getConstants(), offset + getLocalVariables().size()));
		}
		return runtimeSlots;
	}
	
	final List<GeneratorOperation> getLocalVariableOperations() {
		if (localVariableOperations == null) {
			localVariableOperations =
				new ArrayList<GeneratorOperation>(getLocalVariables().size());
			for (int i = 0; i < getLocalVariables().size(); i++) {
				final GeneratorOperation newOperation =
					getHeader().getBuilder().buildVariableOperation(getLocalVariables().get(i), getRuntimeSlots().get(i));
				localVariableOperations.add(newOperation);
			}
		}
		return localVariableOperations;
	}
	
	final List<GeneratorOperation> getConstraintOperations() {
		if (operations == null) {
			CompilerPatternBuilder module = getHeader().getBuilder();
			final Map<ConstraintVariable, GeneratorVariable> variableMap = getHeader().getVariableMap();

			for (int i = 0; i < localVariables.size(); i++) {
				variableMap.put(localVariables.get(i), getRuntimeSlots().get(i));
			}
			int offset = localVariables.size();
			for (int i = 0; i < constants.size(); i++) {
				variableMap.put(constants.get(i), getRuntimeSlots().get(offset+i));
			}

			this.operations = new LinkedList<GeneratorOperation>();
			for (int i = 0; i < constraints.size(); i++) {
				Constraint constraint = constraints.get(i);
				operations.addAll(module.buildConstraintOperations(constraint, variableMap));
			}
		}
		return operations;
	}

	public List<GeneratorOperation> getInternalLocalVariables() {
		return getLocalVariableOperations();
	}
	
	public final VariableRuntime getRuntimeVariable(int index) {
		final int diff = index - pattern.getSymbolicParameters().size();
		return diff < 0 ? pattern.getRuntimeSymbolicParameters().get(index) : getRuntimeSlots().get(diff);
	}
	
	public final List<Constraint> getConstraints() {
		return constraints;
	}

	public final List<Constant> getConstants() {
		return constants;
	}
	
	public final int getIndex() {
		return index;
	}

	final void setIndex(int index) {
		this.index = index;
	}
	
	public final List<GeneratorOperation> getOperations() {
		final List<GeneratorOperation> result =
			new LinkedList<GeneratorOperation>(getHeader().getSymbolicParameterOperations());
		result.addAll(getLocalVariableOperations());
		result.addAll(getConstraintOperations());
		return result;
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

	public final String getClassName() {
		StringBuilder builder = new StringBuilder(getHeader().getBodyName());
		if (getHeader().getBodies().size() > 1) {
			builder.append(index);
		}
		return builder.toString();
	}
	
	public final String getDataFrameName() {
		return getClassName() + getHeader().getBuilder().getDataFrameSuffix();
	}
	
	public final String getFullyQualifiedClassName() {
		StringBuilder builder = new StringBuilder(getHeader().getBuilder().getPackagePrefix());
		builder.append(getClassName());
		return builder.toString();
	}
	
	public final String getFullyQualifiedDataFrameName() {
		StringBuilder builder = new StringBuilder(getHeader().getBuilder().getPackagePrefix());
		builder.append(getDataFrameName());
		return builder.toString();
	}
}
