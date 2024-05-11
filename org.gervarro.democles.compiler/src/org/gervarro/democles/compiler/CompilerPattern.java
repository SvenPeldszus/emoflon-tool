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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.GeneratorVariable;
import org.gervarro.democles.common.runtime.VariableRuntime;
import org.gervarro.democles.specification.impl.ConstraintVariable;
import org.gervarro.democles.specification.impl.Pattern;
import org.gervarro.democles.specification.impl.Variable;

public final class CompilerPattern extends Pattern {
	private final CompilerPatternBuilder module;
	private final List<Variable> symbolicParameters;
	private List<CompilerPatternBody> bodies;
	private List<GeneratorVariable> symbolicParameterRuntimes;
	private List<GeneratorOperation> symbolicParameterOperations;
	
	CompilerPattern(CompilerPatternBuilder module,
			String name,
			List<? extends Variable> symbolicParameters) {
		super(name, null);
		this.module = module;
		this.symbolicParameters =
			new ArrayList<Variable>(symbolicParameters);
	}
	
	public final CompilerPatternBuilder getBuilder() {
		return module;
	}
	
	public final List<CompilerPatternBody> getBodies() {
		if (this.bodies != null) {
			return bodies;
		} else {
			final List<CompilerPatternBody> emptyList = Collections.emptyList();
			return emptyList;
		}
	}
	
	final void setBodies(List<CompilerPatternBody> bodies) {
		if (this.bodies == null) {
			this.bodies = bodies;
			for (int i = 0; i < this.bodies.size(); ) {
				CompilerPatternBody body = this.bodies.get(i);
				body.setHeader(this);
				body.setIndex(++i);
			}
		}
	}
	
	public List<Variable> getSymbolicParameters() {
		return symbolicParameters;
	}
	
	final List<GeneratorVariable> getRuntimeSymbolicParameters() {
		if (symbolicParameterRuntimes == null) {
			symbolicParameterRuntimes = getBuilder().createVariableRuntimes(getSymbolicParameters(), 0);
		}
		return symbolicParameterRuntimes;
	}
	
	final Map<ConstraintVariable, GeneratorVariable> getVariableMap() {
		final Map<ConstraintVariable, GeneratorVariable> variableMap =
				new HashMap<ConstraintVariable, GeneratorVariable>();
		for (int i = 0; i < getSymbolicParameters().size(); i++) {
			variableMap.put(getSymbolicParameters().get(i), getRuntimeSymbolicParameters().get(i));
		}
		return variableMap;
	}
	
	final List<GeneratorOperation> getSymbolicParameterOperations() {
		if (symbolicParameterOperations == null) {
			symbolicParameterOperations =
				new ArrayList<GeneratorOperation>(getSymbolicParameters().size());
			for (int i = 0; i < getSymbolicParameters().size(); i++) {
				final GeneratorOperation newOperation =
					getBuilder().buildVariableOperation(getSymbolicParameters().get(i), getRuntimeSymbolicParameters().get(i));
				symbolicParameterOperations.add(newOperation);
			}
		}
		return symbolicParameterOperations;
	}
	
	public List<GeneratorOperation> getInternalSymbolicParameters() {
		return getSymbolicParameterOperations();
	}
	
	public final VariableRuntime getRuntimeVariable(int index) {
		return getRuntimeSymbolicParameters().get(index);
	}
	
	public final String getClassName() {
		StringBuilder builder = new StringBuilder(getName());
		builder.replace(0, 1, builder.substring(0, 1).toUpperCase());
		builder.append(module.getPatternSuffix());
		return builder.toString();
	}
	
	public final String getBodyName() {
		StringBuilder builder = new StringBuilder(getClassName());
		builder.append(module.getBodySuffix());
		return builder.toString();
	}
	
	public final String getDataFrameName() {
		return getClassName() + module.getDataFrameSuffix();
	}
	
	public final String getFullyQualifiedClassName() {
		StringBuilder builder = new StringBuilder(module.getPackagePrefix());
		builder.append(getClassName());
		return builder.toString();
	}
	
	public final String getFullyQualifiedBodyName() {
		StringBuilder builder = new StringBuilder(module.getPackagePrefix());
		builder.append(getBodyName());
		return builder.toString();
	}
	
	public final String getFullyQualifiedDataFrameName() {
		StringBuilder builder = new StringBuilder(module.getPackagePrefix());
		builder.append(getDataFrameName());
		return builder.toString();
	}
}
