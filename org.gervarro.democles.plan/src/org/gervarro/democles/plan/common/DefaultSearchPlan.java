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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.Combiner;
import org.gervarro.democles.common.OperationCombiner;
import org.gervarro.democles.common.OperationRuntime;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.specification.impl.Constraint;

class DefaultSearchPlan<C extends OperationCombiner<C,O>, O extends OperationRuntime> extends SearchPlan<C,O,Integer,DefaultSearchPlan<C,O>> implements Combiner<DefaultSearchPlan<C,O>, WeightedOperation<O,Integer>> {
	
	DefaultSearchPlan(C root,
			Adornment adornment,
			final Set<Constraint> uncheckedConstraints,
			final int cost,
			List<WeightedOperation<O, Integer>> present,
			List<WeightedOperation<O, Integer>> future) {
		super(root, adornment, uncheckedConstraints, cost, present, future);
	}
	
	public final int compareTo(DefaultSearchPlan<C,O> o) {
		return getCost() - o.getCost();
	}

	public DefaultSearchPlan<C, O> combine(WeightedOperation<O,Integer> operation) {
		final Set<Constraint> uncheckedConstraints =
				new HashSet<Constraint>(getUncheckedConstraints());
		uncheckedConstraints.remove(operation.getOperation().getOrigin());
		return new DefaultSearchPlan<C,O>(
				getRoot().combine(operation.getOperation()),
				getAdornment().applyOperationMask(operation.getOperation()),
				uncheckedConstraints,
				getCost() + operation.getWeight(),
				getPresentOperations(),
				getFutureOperations());
	}
}
