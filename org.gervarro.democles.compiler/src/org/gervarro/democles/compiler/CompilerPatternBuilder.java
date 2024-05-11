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

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.GeneratorVariable;
import org.gervarro.democles.codegen.SimpleCombiner;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.PatternMatcherPlugin;
import org.gervarro.democles.common.runtime.OperationBuilder;
import org.gervarro.democles.common.runtime.PatternMatcherBuilder;
import org.gervarro.democles.constraint.PatternInvocationConstraintType;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.impl.Constant;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.ConstraintVariable;
import org.gervarro.democles.specification.impl.Variable;

public class CompilerPatternBuilder extends PatternMatcherBuilder<CompilerPattern, CompilerPatternBody, GeneratorOperation, GeneratorVariable, OperationBuilder<GeneratorOperation,GeneratorVariable>, SimpleCombiner> {
	private final String packageName;

	public CompilerPatternBuilder() {
		this(null);
	}

	public CompilerPatternBuilder(String packageName) {
		this.packageName = packageName;
		addOperationBuilder(this);
	}

	public final String getPackageName() {
		return packageName != null ? packageName : "";
	}
	
	public final String getPackagePrefix() {
		return packageName != null ? packageName + "." : "";
	}
	
	public final String getPatternSuffix() {
		return "Pattern";
	}
	
	public final String getBodySuffix() {
		return "Body";
	}
	
	public final String getDataFrameSuffix() {
		return "DataFrame";
	}
	
	public final Chain<GeneratorOperation> generateReverseSearchPlan(List<GeneratorOperation> operations, Adornment inputAdornment) {
		SimpleCombiner initialCombiner = new SimpleCombiner(inputAdornment);
		SimpleCombiner finalCombiner = getAlgorithm().generateSearchPlan(initialCombiner, operations, inputAdornment);
		return finalCombiner.getRoot();
	}
	
	protected final CompilerPattern createPattern(String name,
			List<? extends Variable> symbolicParameters) {
		return new CompilerPattern(this, name, symbolicParameters);
	}

	protected final void setBodies(CompilerPattern pattern,
			List<CompilerPatternBody> bodies) {
		pattern.setBodies(bodies);
	}

	protected final CompilerPatternBody createPatternBody(List<Variable> localVariables,
			List<Constant> constants,
			List<Constraint> constraints) {
		return new CompilerPatternBody(localVariables, constants, constraints);
	}
	
	protected final GeneratorVariable createVariableRuntime(ConstraintVariable variable, int index) {
		return new GeneratorVariable(variable, index);
	}

	@Override
	public final List<GeneratorOperation> getConstraintOperations(
			Constraint constraint, List<GeneratorVariable> parameters) {
		ConstraintType cType = constraint.getType();
		if (cType instanceof PatternInvocationConstraintType) {
			PatternInvocationConstraintType invocation = (PatternInvocationConstraintType) cType;
			String invokedPatternIdentifier = PatternMatcherPlugin.getIdentifier(invocation.getInvokedPattern().getName(), parameters.size());
			CompilerPattern invokedPattern = patternMap.get(invokedPatternIdentifier);
			if (invokedPattern != null && !invocation.isPositive()) {
				int[] allBoundArray = new int[parameters.size()];
				Arrays.fill(allBoundArray, Adornment.BOUND);
				List<GeneratorOperation> result = new LinkedList<GeneratorOperation>();
				result.add(new GeneratorOperation(constraint, parameters,
						Adornment.create(allBoundArray),
						Adornment.create(allBoundArray),
						invocation));
				return result;
			}
		}
		return null;
	}
}
