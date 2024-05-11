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
package org.gervarro.democles.common.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.gervarro.democles.common.Combiner;
import org.gervarro.democles.common.OperationRuntime;
import org.gervarro.democles.common.PatternMatcherPlugin;
import org.gervarro.democles.common.SearchPlanAlgorithm;
import org.gervarro.democles.specification.impl.Constant;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.ConstraintVariable;
import org.gervarro.democles.specification.impl.Pattern;
import org.gervarro.democles.specification.impl.PatternBody;
import org.gervarro.democles.specification.impl.Variable;

abstract public class PatternMatcherBuilder<P,PB,O extends OperationRuntime,V extends VariableRuntime, OB extends OperationBuilder<O,V>, C extends Combiner<C, O>> implements OperationBuilder<O,V> {
	private final List<OB> operationBuilders =
		new LinkedList<OB>();
	private SearchPlanAlgorithm<C, O> algorithm;
	protected final Map<String, P> patternMap =
			new HashMap<String, P>();

	public final SearchPlanAlgorithm<C, O> getAlgorithm() {
		return algorithm;
	}

	public final void setAlgorithm(SearchPlanAlgorithm<C, O> algorithm) {
		this.algorithm = algorithm;
	}

	public final void addOperationBuilder(OB builder) {
		operationBuilders.add(builder);
	}
	
	public final void removeOperationBuilder(OB builder) {
		operationBuilders.remove(builder);
	}
	
	public final P build(Pattern pattern) {
		// TODO Rewrite this
		List<? extends PatternBody> bodies = pattern.getBodies();
		final List<PB> newBodies = new ArrayList<PB>(bodies.size()); 
		for (int i = 0; i < bodies.size(); i++) {
			PatternBody body = bodies.get(i);
			newBodies.add(i, createPatternBody(body.getLocalVariables(), body.getConstants(), body.getConstraints()));
		}
		P newPattern = createPattern(pattern.getName(), pattern.getSymbolicParameters());
		setBodies(newPattern, newBodies);
		patternMap.put(PatternMatcherPlugin.getIdentifier(pattern.getName(), pattern.getSymbolicParameters().size()), newPattern);
		return newPattern;
	}
	
	abstract protected P createPattern(String name, List<? extends Variable> symbolicParameters);

	abstract protected void setBodies(P pattern, List<PB> bodies);

	abstract protected PB createPatternBody(List<Variable> localVariables, List<Constant> constants, List<Constraint> constraints);
	
	public final O buildVariableOperation(Variable variable, 
			V runtimeVariable) {
		for (OB operationBuilder : operationBuilders) {
			O result = operationBuilder.getVariableOperation(variable, runtimeVariable);
			if (result != null) {
				return result;
			}
		}
		throw new RuntimeException("No handler exists for constraint " + variable.toString());
	}
	
	public final List<O> buildConstraintOperations(Constraint constraint, 
			Map<ConstraintVariable, V> slotMap) {
		List<ConstraintVariable> parameters = constraint.getParameters();
		List<V> newParameters = new ArrayList<V>(parameters.size());
		for (int j = 0; j < parameters.size(); j++) {
			ConstraintVariable parameter = parameters.get(j);
			if (parameter instanceof Variable) {
				newParameters.add(j, lookupVariable((Variable) parameter, slotMap));
			} else if (parameter instanceof Constant) {
				newParameters.add(j, lookupConstant((Constant) parameter, slotMap));
			}
		}
		
		for (OB operationBuilder : operationBuilders) {
			List<O> result = 
				operationBuilder.getConstraintOperations(constraint, newParameters);
			if (result != null && !result.isEmpty()) {
				return result;
			}
		}
		throw new RuntimeException("No handler exists for constraint " + constraint.toString());
	}
	
	public final List<V> createVariableRuntimes(List<? extends ConstraintVariable> variables, int offset) {
		final List<V> newVariables =
			new ArrayList<V>(variables.size());
		for (int i = 0; i < variables.size(); i++) {
			ConstraintVariable variableSpec = variables.get(i);
			V runtimeVariable = createVariableRuntime(variableSpec, offset + i);
			newVariables.add(i, runtimeVariable);
		}
		return newVariables;
	}
	
	abstract protected V createVariableRuntime(ConstraintVariable variable, int index);
	
	private V lookupVariable(Variable variable,
			Map<ConstraintVariable, V> map) {
		V result = map.get(variable);
		if (result == null) {
			throw new RuntimeException("Variable " + variable.getName() + " not found");
		}
		return result;
	}
	
	private V lookupConstant(Constant constant,
			Map<ConstraintVariable, V> map) {
		V result = map.get(constant);
		if (result == null) {
			throw new RuntimeException("Constant " + constant.getValue().toString() + " not found");
		}
		return result;
	}
	
	@Override
	public final O getVariableOperation(Variable variable,
			V runtimeVariable) {
		return null;
	}
}
