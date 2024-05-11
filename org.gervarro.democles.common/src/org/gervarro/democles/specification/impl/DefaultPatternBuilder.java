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

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultPatternBuilder<P extends Pattern,PB> extends PatternBuilder<P, PB> {

	public DefaultPatternBuilder(PatternFactory<P, PB> factory) {
		super(factory);
	}
	
	public final P build(Pattern pattern) {
		@SuppressWarnings("unchecked")
		PB[] bodies = (PB[]) new PatternBody[pattern.getBodies().size()];
		for (int i = 0; i < pattern.getBodies().size(); i++) {
			PatternBody  pb = (PatternBody) pattern.getBodies().get(i);
			Variable[] localVariables = new Variable[pb.getLocalVariables().size()];
			pb.getLocalVariables().toArray(localVariables);
			Constraint[] constraints = new Constraint[pb.getConstraints().size()];
			pb.getConstraints().toArray(constraints);
			Constant[] constants = new Constant[pb.getConstants().size()];
			pb.getConstants().toArray(constants);
			bodies[i] = createPatternBody(localVariables, constraints, constants);
		}
		Variable[] symbolicParameters = new Variable[pattern.getSymbolicParameters().size()];
		pattern.getSymbolicParameters().toArray(symbolicParameters);
		return createPattern(pattern.getName(), bodies, symbolicParameters);
	}
	
	public final P build(org.gervarro.democles.specification.Pattern pattern) {
		Map<org.gervarro.democles.specification.Variable, Variable> variableMap =
			new HashMap<org.gervarro.democles.specification.Variable, Variable>();
		List<? extends org.gervarro.democles.specification.Variable> symbolicParameters = pattern.getSymbolicParameters();
		final Variable[] newSymbolicParameters = new Variable[symbolicParameters.size()];
		for (int i = 0; i < symbolicParameters.size(); i++) {
			org.gervarro.democles.specification.Variable variableSpec = symbolicParameters.get(i);
			newSymbolicParameters[i] = createVariable(variableSpec);
			variableMap.put(variableSpec, newSymbolicParameters[i]);
		}
		
		List<? extends org.gervarro.democles.specification.PatternBody> bodies = pattern.getBodies();
		@SuppressWarnings("unchecked")
		final PB[] newBodies = (PB[]) new DefaultPatternBody[bodies.size()];
		for (int i = 0; i < bodies.size(); i++) {
			newBodies[i] = buildPatternBody(bodies.get(i), variableMap);
		}

		return createPattern(pattern.getName(), newBodies, newSymbolicParameters);
	}
	
	public final Collection<P> build(Iterable<org.gervarro.democles.specification.Pattern> patterns) {
		Map<org.gervarro.democles.specification.Pattern, P> patternMap =
				new HashMap<org.gervarro.democles.specification.Pattern, P>();
		// Create patterns and symbolic parameters
		for (org.gervarro.democles.specification.Pattern pattern : patterns) {
			List<? extends org.gervarro.democles.specification.Variable> symbolicParameters = pattern.getSymbolicParameters();
			final Variable[] newSymbolicParameters = new Variable[symbolicParameters.size()];
			for (int i = 0; i < symbolicParameters.size(); i++) {
				org.gervarro.democles.specification.Variable variableSpec = symbolicParameters.get(i);
				newSymbolicParameters[i] = createVariable(variableSpec);
			}
			patternMap.put(pattern, factory.createPattern(pattern.getName(), newSymbolicParameters));
		}
		
		// Create pattern bodies
		for (org.gervarro.democles.specification.Pattern pattern : patterns) {
			P newPattern = patternMap.get(pattern);
			Map<org.gervarro.democles.specification.Variable, Variable> variableMap =
					new HashMap<org.gervarro.democles.specification.Variable, Variable>();
			List<? extends org.gervarro.democles.specification.Variable> symbolicParameters = pattern.getSymbolicParameters();
			for (int i = 0; i < symbolicParameters.size(); i++) {
				org.gervarro.democles.specification.Variable variableSpec = symbolicParameters.get(i);
				variableMap.put(variableSpec, newPattern.getSymbolicParameters().get(i));
			}

			List<? extends org.gervarro.democles.specification.PatternBody> bodies = pattern.getBodies();
			@SuppressWarnings("unchecked")
			final PB[] newBodies = (PB[]) new DefaultPatternBody[bodies.size()];
			for (int i = 0; i < bodies.size(); i++) {
				newBodies[i] = buildPatternBody(bodies.get(i), variableMap);
			}
			factory.setBodies(newPattern, newBodies);
		}
		return patternMap.values();
	}
	
	private PB buildPatternBody(org.gervarro.democles.specification.PatternBody body,
			Map<org.gervarro.democles.specification.Variable, Variable> symbolicParameterMap) {
		Map<org.gervarro.democles.specification.Variable, Variable> variableMap =
			new HashMap<org.gervarro.democles.specification.Variable, Variable>(symbolicParameterMap);
		Map<org.gervarro.democles.specification.ConstraintVariable, ConstraintVariable> slotMap =
			new HashMap<org.gervarro.democles.specification.ConstraintVariable, ConstraintVariable>(symbolicParameterMap);
		List<? extends org.gervarro.democles.specification.Variable> localVariables = body.getLocalVariables();
		Variable[] newLocalVariables = new Variable[localVariables.size()];
		for (int i = 0; i < localVariables.size(); i++) {
			newLocalVariables[i] = createVariable(localVariables.get(i));
			variableMap.put(localVariables.get(i), newLocalVariables[i]);
			slotMap.put(localVariables.get(i), newLocalVariables[i]);
		}
		List<? extends org.gervarro.democles.specification.Constant> constants = body.getConstants();
		Constant[] newConstants = new Constant[constants.size()];
		for (int i = 0; i < constants.size(); i++) {
			newConstants[i] = new Constant(constants.get(i).getValue());
			slotMap.put(constants.get(i), newConstants[i]);
		}
		
		List<? extends org.gervarro.democles.specification.Constraint> constraints = body.getConstraints();
		Constraint[] newConstraints = new Constraint[constraints.size()];
		for (int i = 0; i < constraints.size(); i++) {
			org.gervarro.democles.specification.Constraint constraint = constraints.get(i);
			newConstraints[i] = buildConstraint(constraint, slotMap);
		}
		
		return createPatternBody(newLocalVariables, newConstraints, newConstants);
	}
	
	private Constraint buildConstraint(org.gervarro.democles.specification.Constraint constraint, 
			Map<org.gervarro.democles.specification.ConstraintVariable, ConstraintVariable> slotMap) {
		List<? extends org.gervarro.democles.specification.ConstraintVariable> parameters = constraint.getParameters();
		ConstraintVariable[] newParameters = new ConstraintVariable[parameters.size()];
		for (int j = 0; j < parameters.size(); j++) {
			org.gervarro.democles.specification.ConstraintVariable parameter = parameters.get(j);
			if (parameter instanceof org.gervarro.democles.specification.Variable) {
				newParameters[j] = lookupVariable((org.gervarro.democles.specification.Variable) parameter, slotMap);
			} else if (parameter instanceof org.gervarro.democles.specification.Constant) {
				newParameters[j] = lookupConstant((org.gervarro.democles.specification.Constant) parameter, slotMap);
			}
		}
		return new Constraint(newParameters, constraint.getType());
	}
	
	private final Variable createVariable(org.gervarro.democles.specification.Variable variable) {
		return new Variable(variable.getName(), variable.getType());
	}
	
	private Variable lookupVariable(org.gervarro.democles.specification.Variable variable,
			Map<? extends org.gervarro.democles.specification.ConstraintVariable, ? extends ConstraintVariable> map) {
		ConstraintVariable result = map.get(variable);
		if (result == null) {
			throw new RuntimeException("Variable " + variable.getName() + " not found");
		}
		return (Variable) result;
	}
	
	private Constant lookupConstant(org.gervarro.democles.specification.Constant constant,
			Map<? extends org.gervarro.democles.specification.ConstraintVariable, ? extends ConstraintVariable> map) {
		ConstraintVariable result = map.get(constant);
		if (result == null) {
			throw new RuntimeException("Constant " + constant.getValue().toString() + " not found");
		}
		return (Constant) result;
	}
}
