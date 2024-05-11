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

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.OperationCombiner;
import org.gervarro.democles.common.OperationRuntime;
import org.gervarro.democles.plan.OperationCategory;
import org.gervarro.democles.plan.WeightedOperation;
import org.gervarro.democles.specification.impl.Constraint;

abstract public class SearchPlan<C extends OperationCombiner<C,O>, O extends OperationRuntime, W extends Comparable<W>, SP extends SearchPlan<C,O,W,SP>> implements org.gervarro.democles.plan.SearchPlan<O,W,SP>, Comparable<SP> {
	private boolean hasFreshLists;
	private final C root;
	private Adornment adornment;
	private Set<Constraint> uncheckedConstraints;
	private final W cost;
	private List<WeightedOperation<O,W>> present;
	private List<WeightedOperation<O,W>> future;

	@SuppressWarnings("unchecked")
	private static <U, W extends Comparable<W>> WeightedOperation<U, W>[] createArray(int size) {
		return new WeightedOperation[size];
	}
	
	protected SearchPlan(C root,
			Adornment adornment,
			final Set<Constraint> uncheckedConstraints,
			final W cost,
			List<WeightedOperation<O, W>> present,
			List<WeightedOperation<O, W>> future) {
		this.hasFreshLists = false;
		this.root = root;
		this.adornment = adornment;
		this.uncheckedConstraints = uncheckedConstraints;
		this.cost = cost;
		this.present = present;
		this.future = future;
	}
	
	private final OperationCategory categorize(O operation) {
		OperationCategory result = OperationCategory.PRESENT;
		final Adornment precondition = operation.getPrecondition();
		final int preconditionSize = precondition.size();
		for (int i = 0; i < preconditionSize; i++) {
			final int maskValue = precondition.get(i);
			final int adornmentValue = getAdornment().get(operation.getParameters().get(i).getIndex());
			if (maskValue > adornmentValue) {
				return OperationCategory.PAST;
			} else if (maskValue < adornmentValue) {
				result = OperationCategory.FUTURE;
			}
		}
		return result;
	}
	
	boolean hasSameOrigin(O operation) {
		return root.getLast() != null ? root.getLast().getOrigin() == operation.getOrigin() : false;
	}

	public Iterable<SP> getNextPlans() {
		return new Iterable<SP>() {

			@Override
			public Iterator<SP> iterator() {
				return new SearchPlanIterator();
			}
			
		};
	}
	
	public final void refreshOperationLists() {
		if (hasFreshLists) {
			return;
		}
		
		WeightedOperation<O,W>[] pArray = createArray(present.size());
		pArray = present.toArray(pArray);
		WeightedOperation<O,W>[] fArray = createArray(future.size());
		fArray = future.toArray(fArray);
		present = new LinkedList<WeightedOperation<O,W>>();
		future = new LinkedList<WeightedOperation<O,W>>();
		
		for (int p = 0, f = 0; p < pArray.length || f < fArray.length; ) {
			WeightedOperation<O,W> smaller = 
				p < pArray.length && (f >= fArray.length || pArray[p].compareTo(fArray[f]) <= 0) ? 
						pArray[p++] : fArray[f++];
			if (!hasSameOrigin(smaller.getOperation())) {
				final OperationCategory category = categorize(smaller.getOperation());
				if (category == OperationCategory.FUTURE) {
					this.future.add(smaller);
				} else if (category == OperationCategory.PRESENT) {
					// Present operation
					this.present.add(smaller);
				}
			}
		}
		hasFreshLists = true;
	}
	
	public final Adornment getAdornment() {
		return adornment;
	}
	
	protected final Set<Constraint> getUncheckedConstraints() {
		return uncheckedConstraints;
	}

	public W getCost() {
		return cost;
	}

	public final C getRoot() {
		return root;
	}
	
	public final List<WeightedOperation<O,W>> getPresentOperations() {
		return present;
	}
	
	protected final List<WeightedOperation<O,W>> getFutureOperations() {
		return future;
	}
	
	abstract public int compareTo(SP o);
	abstract public SP combine(WeightedOperation<O,W> operation);
	
	private class SearchPlanIterator implements Iterator<SP> {
		private final Iterator<WeightedOperation<O,W>> iterator;
		
		private SearchPlanIterator() {
			this.iterator = present.iterator();
		}

		@Override
		public final boolean hasNext() {
			return iterator.hasNext();
		}

		@Override
		public final SP next() {
			return SearchPlan.this.combine(iterator.next());
		}

		@Override
		public final void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
