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
package org.gervarro.democles.plan;

public class WeightedOperation<O,W extends Comparable<W>> implements Comparable<WeightedOperation<O,W>> {
	private final O operation;
	private final W weight;
	
	private WeightedOperation(final O operation, final W weight) {
		this.operation = operation;
		this.weight = weight;
	}
	
	public int compareTo(WeightedOperation<O,W> o) {
		return weight.compareTo(o.weight);
	}
	
	public final O getOperation() {
		return operation;
	}
	
	public final W getWeight() {
		return weight;
	}
	
	public String toString() {
		if (operation != null) {
			StringBuilder result = new StringBuilder(operation.toString());
			result.append(" : ");
			result.append(weight);
			return result.toString();
		} else {
			return super.toString();
		}
	}
	
	public static final <O,W extends Comparable<W>> WeightedOperation<O,W> createOperation(O operation, W weight) {
		return new WeightedOperation<O, W>(operation, weight);
	}
}
