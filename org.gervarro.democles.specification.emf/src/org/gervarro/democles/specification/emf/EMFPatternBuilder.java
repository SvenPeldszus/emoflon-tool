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
package org.gervarro.democles.specification.emf;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.Switch;
import org.gervarro.democles.common.PatternMatcherPlugin;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.VariableType;
import org.gervarro.democles.specification.impl.DefaultPatternBody;
import org.gervarro.democles.specification.impl.PatternBuilder;
import org.gervarro.democles.specification.impl.PatternFactory;

/**
 * This class constructs patterns (according to the Demcoles-internal pattern spec.) from EMF-based patterns.
 *
 * @param <P> the subtype of {@link org.gervarro.democles.specification.impl.Pattern} to use
 * @param <PB> the subtype of {@link org.gervarro.democles.specification.impl.PatternBody} to use
 */
public class EMFPatternBuilder<P extends org.gervarro.democles.specification.impl.Pattern, PB> extends PatternBuilder<P, PB> {
	private final List<Switch<VariableType>> variableTypeSwitches = new LinkedList<Switch<VariableType>>();
	private final List<Switch<ConstraintType>> constraintTypeSwitches = new LinkedList<Switch<ConstraintType>>();

	public EMFPatternBuilder(final PatternFactory<P, PB> factory) {
		super(factory);
	}

	public final void addVariableTypeSwitch(final Switch<VariableType> variableTypeSwitch) {
		variableTypeSwitches.add(variableTypeSwitch);
	}

	public final void addConstraintTypeSwitch(final Switch<ConstraintType> constraintTypeSwitch) {
		constraintTypeSwitches.add(constraintTypeSwitch);
	}

	/**
	 * Constructs an instance of {@link Pattern} subtype P for the given EMF-based pattern.
	 * @param emfPattern
	 * @return
	 */
	public final P build(final Pattern emfPattern) {
		final Map<Variable, org.gervarro.democles.specification.impl.Variable> variableMap = new HashMap<Variable, org.gervarro.democles.specification.impl.Variable>();
		final List<? extends Variable> symbolicParameters = emfPattern.getSymbolicParameters();
		final org.gervarro.democles.specification.impl.Variable[] newSymbolicParameters = new org.gervarro.democles.specification.impl.Variable[symbolicParameters
		                                                                                                                                        .size()];

		// Create variable mapping
		for (int i = 0; i < symbolicParameters.size(); i++) {
			final Variable variableSpec = symbolicParameters.get(i);
			newSymbolicParameters[i] = createVariable(variableSpec);
			variableMap.put(variableSpec, newSymbolicParameters[i]);
		}

		// Create pattern body mapping
		final List<? extends PatternBody> emfPatternBodies = emfPattern.getBodies();
		@SuppressWarnings("unchecked")
		final PB[] newBodies = (PB[]) new DefaultPatternBody[emfPatternBodies.size()];
		for (int i = 0; i < emfPatternBodies.size(); i++) {
			newBodies[i] = buildPatternBody(emfPatternBodies.get(i), variableMap);
		}

		return createPattern(emfPattern.getName(), newBodies, newSymbolicParameters);
	}

	public final Collection<P> build(final Iterable<Pattern> patterns) {
		final Map<Pattern, P> patternMap = new HashMap<Pattern, P>();
		// Create patterns and symbolic parameters
		for (final Pattern pattern : patterns) {
			final List<? extends Variable> symbolicParameters = pattern.getSymbolicParameters();
			final org.gervarro.democles.specification.impl.Variable[] newSymbolicParameters = new org.gervarro.democles.specification.impl.Variable[symbolicParameters
			                                                                                                                                        .size()];
			for (int i = 0; i < symbolicParameters.size(); i++) {
				final Variable variableSpec = symbolicParameters.get(i);
				newSymbolicParameters[i] = createVariable(variableSpec);
			}
			final P newPattern = factory.createPattern(pattern.getName(), newSymbolicParameters);
			patternMap.put(pattern, newPattern);
		}

		// Register pattern signatures in patttern registry
		for (final P newPattern : patternMap.values()) {
			patternRegistry.put(PatternMatcherPlugin.getIdentifier(newPattern.getName(), newPattern.getSymbolicParameters().size()), newPattern);
		}

		// Create pattern bodies
		for (final Pattern pattern : patterns) {
			final P newPattern = patternMap.get(pattern);
			final Map<Variable, org.gervarro.democles.specification.impl.Variable> variableMap = new HashMap<Variable, org.gervarro.democles.specification.impl.Variable>();
			final List<? extends Variable> symbolicParameters = pattern.getSymbolicParameters();
			for (int i = 0; i < symbolicParameters.size(); i++) {
				final Variable variableSpec = symbolicParameters.get(i);
				variableMap.put(variableSpec, newPattern.getSymbolicParameters().get(i));
			}

			final List<? extends PatternBody> bodies = pattern.getBodies();
			@SuppressWarnings("unchecked")
			final PB[] newBodies = (PB[]) new DefaultPatternBody[bodies.size()];
			for (int i = 0; i < bodies.size(); i++) {
				newBodies[i] = buildPatternBody(bodies.get(i), variableMap);
			}
			factory.setBodies(newPattern, newBodies);
		}

		return patternMap.values();
	}

	private PB buildPatternBody(final PatternBody body, final Map<Variable, org.gervarro.democles.specification.impl.Variable> symbolicParameterMap) {

		final Map<ConstraintVariable, org.gervarro.democles.specification.impl.ConstraintVariable> slotMap = new HashMap<ConstraintVariable, org.gervarro.democles.specification.impl.ConstraintVariable>(
				symbolicParameterMap);

		// Create local variables.
		final Map<Variable, org.gervarro.democles.specification.impl.Variable> variableMap = new HashMap<Variable, org.gervarro.democles.specification.impl.Variable>(
				symbolicParameterMap);
		final List<? extends Variable> localVariables = body.getLocalVariables();
		final org.gervarro.democles.specification.impl.Variable[] newLocalVariables = new org.gervarro.democles.specification.impl.Variable[localVariables
		                                                                                                                                    .size()];
		for (int i = 0; i < localVariables.size(); i++) {
			newLocalVariables[i] = createVariable(localVariables.get(i));
			variableMap.put(localVariables.get(i), newLocalVariables[i]);
			slotMap.put(localVariables.get(i), newLocalVariables[i]);
		}

		// Create constants
		final List<? extends Constant> constants = body.getConstants();
		final org.gervarro.democles.specification.impl.Constant[] newConstants = new org.gervarro.democles.specification.impl.Constant[constants
		                                                                                                                               .size()];
		for (int i = 0; i < constants.size(); i++) {
			newConstants[i] = new org.gervarro.democles.specification.impl.Constant(constants.get(i).getValue());
			slotMap.put(constants.get(i), newConstants[i]);
		}

		// Create constraints
		final List<? extends Constraint> constraints = body.getConstraints();
		final org.gervarro.democles.specification.impl.Constraint[] newConstraints = new org.gervarro.democles.specification.impl.Constraint[constraints
		                                                                                                                                     .size()];
		for (int i = 0; i < constraints.size(); i++) {
			final Constraint constraint = constraints.get(i);
			newConstraints[i] = buildConstraint(constraint, slotMap);
		}

		return createPatternBody(newLocalVariables, newConstraints, newConstants);
	}

	private final org.gervarro.democles.specification.impl.Constraint buildConstraint(final Constraint constraint,
			final Map<ConstraintVariable, org.gervarro.democles.specification.impl.ConstraintVariable> slotMap) {
		final List<? extends ConstraintParameter> parameters = constraint.getParameters();
		final org.gervarro.democles.specification.impl.ConstraintVariable[] newParameters = new org.gervarro.democles.specification.impl.ConstraintVariable[parameters
		                                                                                                                                                    .size()];
		for (int j = 0; j < parameters.size(); j++) {
			final ConstraintVariable parameter = parameters.get(j).getReference();
			if (parameter instanceof Variable) {
				newParameters[j] = lookupVariable((Variable) parameter, slotMap);
			} else if (parameter instanceof Constant) {
				newParameters[j] = lookupConstant((Constant) parameter, slotMap);
			}
		}
		return new org.gervarro.democles.specification.impl.Constraint(newParameters, lookupConstraintType(constraint));
	}

	private final ConstraintType lookupConstraintType(final Constraint constraint) {
		for (final Switch<ConstraintType> constraintTypeSwitch : constraintTypeSwitches) {
			final ConstraintType result = constraintTypeSwitch.doSwitch(constraint);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	private final org.gervarro.democles.specification.impl.Variable createVariable(final Variable variable) {
		return new org.gervarro.democles.specification.impl.Variable(variable.getName(), lookupVariableType(variable));
	}

	private final org.gervarro.democles.specification.impl.Variable lookupVariable(final Variable variable,
			final Map<? extends ConstraintVariable, ? extends org.gervarro.democles.specification.impl.ConstraintVariable> map) {
		final org.gervarro.democles.specification.impl.ConstraintVariable result = map.get(variable);
		if (result == null) {
			throw new RuntimeException("Variable " + variable.getName() + " not found");
		}
		return (org.gervarro.democles.specification.impl.Variable) result;
	}

	private final VariableType lookupVariableType(final Variable variable) {
		for (final Switch<VariableType> variableTypeSwitch : variableTypeSwitches) {
			final VariableType result = variableTypeSwitch.doSwitch(variable);
			if (result != null) {
				return result;
			}
		}
		return null;
	}

	private org.gervarro.democles.specification.impl.Constant lookupConstant(final Constant constant,
			final Map<? extends ConstraintVariable, ? extends org.gervarro.democles.specification.impl.ConstraintVariable> map) {
		final org.gervarro.democles.specification.impl.ConstraintVariable result = map.get(constant);
		if (result == null) {
			throw new RuntimeException("Constant " + constant.getValue().toString() + " not found");
		}
		return (org.gervarro.democles.specification.impl.Constant) result;
	}
}
