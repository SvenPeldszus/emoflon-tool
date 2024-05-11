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
package org.gervarro.democles.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Adornment implements Iterable<Integer> {
	private static final String[] BINDING_CONSTANTS = new String[] { "BOUND",
			"NOT_TYPECHECKED", "FREE" };
	public static final int BOUND = 0;
	public static final int NOT_TYPECHECKED = 1;
	public static final int FREE = 2;

	private final int[] bindings;

	public static final Adornment create(int... bindings) {
		return new Adornment(bindings);
	}

	public static final Adornment create(Adornment origin) {
		return new Adornment(origin.bindings);
	}

	public Adornment() {
		this(0);
	}

	public Adornment(final int nbits) {
		if (nbits < 0) {
			throw new NegativeArraySizeException();
		}
		this.bindings = new int[nbits];
	}

	public Adornment(final int[] bindings) {
		this(bindings.length);
		System.arraycopy(bindings, 0, this.bindings, 0, bindings.length);
	}

	public static final String getBindingConstant(int i) {
		if (0 <= i && i <= 2) {
			return BINDING_CONSTANTS[i];
		} else {
			return null;
		}
	}

	public final int get(int index) {
		return bindings[index];
	}

	public final void set(int index, int value) {
		bindings[index] = value;
	}

	public final int size() {
		return bindings.length;
	}

	public final int numberOfFrees() {
		return this.numberOfState(FREE);
	}

	public final int numberOfBound() {
		return this.numberOfState(BOUND);
	}

	public final int cardinality() {
		int result = 0;
		for (int i = 0; i < bindings.length; i++) {
			if (bindings[i] > BOUND) {
				result++;
			}
		}
		return result;
	}

	/**
	 * Returns the column indices of bound variables in this adornment.
	 * 
	 * Example: For the adornment BFBU, the result would be {0,2}.
	 * @return the array of bound indices
	 */
	public final int[] getBoundColumns() {
		int[] indexedColumns = new int[numberOfBound()];

		for (int i = 0, j = 0; i < size(); i++) {
			if (get(i) == Adornment.BOUND) {
				indexedColumns[j++] = i;
			}
		}
		return indexedColumns;
	}

	public final int[] getRawBindingInformation() {
		return bindings;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < bindings.length; i++) {
			switch (bindings[i]) {
			case BOUND:
				builder.append("B");
				break;
			case NOT_TYPECHECKED:
				builder.append("U");
				break;
			case FREE:
				builder.append("F");
				break;
			default:
				break;
			}
		}
		return builder.toString();
	}

	public Iterator<Integer> iterator() {
		final int size = bindings.length;
		return new Iterator<Integer>() {
			private int index = 0;

			public final boolean hasNext() {
				return index < size;
			}

			public final Integer next() {
				if (hasNext()) {
					return bindings[index++];
				} else {
					throw new NoSuchElementException();
				}
			}

			public final void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

	public final Adornment applyOperationMask(final OperationRuntime operation) {
		final Adornment result = Adornment.create(this);
		final Adornment precondition = operation.getPrecondition();
		final Adornment postcondition = operation.getPostcondition();
		assert precondition.size() == postcondition.size();
		final int size = precondition.size();
		for (int i = 0; i < size; i++) {
			final int index = operation.getParameters().get(i).getIndex();
			if (result.get(index) == precondition.get(i)) {
				result.set(index, postcondition.get(i));
			} else {
				throw new RuntimeException();
			}
		}
		return result;
	}

	/**
	 * Returns the number of bindings of the given state in this adornment.
	 */
	private final int numberOfState(final int state) {
		int result = 0;
		for (int i = 0; i < bindings.length; i++) {
			if (bindings[i] == state) {
				result++;
			}
		}
		return result;
	}
}