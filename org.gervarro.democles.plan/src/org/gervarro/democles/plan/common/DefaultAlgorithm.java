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
package org.gervarro.democles.plan.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.OperationCombiner;
import org.gervarro.democles.common.OperationRuntime;
import org.gervarro.democles.common.SearchPlanAlgorithm;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.plan.WeightedOperationBuilder;
import org.gervarro.democles.specification.impl.Constraint;

public class DefaultAlgorithm<C extends OperationCombiner<C, O>, O extends OperationRuntime> implements SearchPlanAlgorithm<C, O> {
	private WeightedOperationBuilder<O> builder;
	
	public DefaultAlgorithm(WeightedOperationBuilder<O> builder) {
		this.builder = builder;
	}

	public C generateSearchPlan(C combiner, List<O> operations, Adornment inputAdornment) {
		// Build unchecked constraints and weighted operations
		final Set<Constraint> uncheckedConstraints =
				new HashSet<Constraint>();
		ArrayList<WeightedOperation<O,Integer>> weightedOperations =
			new ArrayList<WeightedOperation<O,Integer>>(operations.size());
		for (O operation : operations) {
			Object origin = operation.getOrigin();
			if (origin instanceof Constraint) {
				uncheckedConstraints.add((Constraint) origin);
			}
			
			// Prepare past and present masks
			int weight = builder.getWeight(operation);
			WeightedOperation<O,Integer> weightedOperation = WeightedOperation.createOperation(operation, weight); 
			if (weightedOperation != null) {
				weightedOperations.add(weightedOperation);
			}
		}
		
		// Prepare the initial state
		List<WeightedOperation<O,Integer>> present = Collections.emptyList();
		Collections.sort(weightedOperations);

		DefaultSearchPlan<C,O> initialPlan = 
			new DefaultSearchPlan<C,O>(combiner, inputAdornment, uncheckedConstraints, 0, present, weightedOperations);
		initialPlan.refreshOperationLists();
		Algorithm<C, O> algo = new Algorithm<C, O>();
		
		return algo.generatePlan(initialPlan).getRoot();
	}
}
