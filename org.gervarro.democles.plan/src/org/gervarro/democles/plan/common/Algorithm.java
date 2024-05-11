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
package org.gervarro.democles.plan.common;

import org.gervarro.democles.common.OperationCombiner;
import org.gervarro.democles.common.OperationRuntime;
import org.gervarro.democles.plan.WeightedOperation;

public class Algorithm<C extends OperationCombiner<C, O>, O extends OperationRuntime> {
	
	public DefaultSearchPlan<C,O> generatePlan(DefaultSearchPlan<C,O> initial) {
		DefaultSearchPlan<C,O> primerSolution = findFirstSolutionInTree(initial);
		if (primerSolution != null) {
			return primerSolution;
		} else {
			throw new RuntimeException("No valid search plan is available");
		}
	}
	
	private DefaultSearchPlan<C,O> findFirstSolutionInTree(DefaultSearchPlan<C,O> root) {
		if (root.getAdornment().cardinality() == 0 && root.getUncheckedConstraints().isEmpty() /* && root.getPresentOperations().isEmpty() */) {
			return root;
		}
		for (WeightedOperation<O,Integer> operation : root.getPresentOperations()) {
			DefaultSearchPlan<C,O> newPlan = root.combine(operation);
			newPlan.refreshOperationLists();
			DefaultSearchPlan<C,O> result = findFirstSolutionInTree(newPlan);
			if (result != null) {
				return result;
			}
		}
		return null;
	}
}
