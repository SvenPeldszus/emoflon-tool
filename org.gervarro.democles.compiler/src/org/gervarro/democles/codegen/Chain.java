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
package org.gervarro.democles.codegen;

public class Chain<T> {
	private final Chain<T> next;
	private final T value;

	public Chain(T element) {
		this(element, null);
	}
	
	public Chain(T value,
			Chain<T> next) {
		this.value = value;
		this.next = next;
	}

	public Chain(final Chain<T> origin) {
		this(origin.value, origin.next != null ? origin.next.copy(false) : null);
	}
	
    public final T getValue() {
    	return value;
    }
    
    public final Chain<T> getNext() {
    	return next;
    }

	public final Chain<T> copy(final boolean reverse) {
		return internalCopy(reverse, null);
	}
	
	private final Chain<T> internalCopy(final boolean reverse, final Chain<T> tail) {
		if (next != null) {
			return reverse ? next.internalCopy(reverse, new Chain<T>(value, tail)) :
				new Chain<T>(value, next.internalCopy(reverse, tail));
		} else {
			return new Chain<T>(value, tail);
		}
	}
}
