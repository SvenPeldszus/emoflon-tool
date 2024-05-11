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
package org.gervarro.democles.common;

import org.gervarro.democles.event.MatchEventSource;

abstract public class PatternMatcher<T extends DataFrame> extends MatchEventSource {
	private final String name;
	
	protected PatternMatcher(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
	
	protected final Adornment calculateAdornment(T input) {
		Adornment adornment = new Adornment(input.size());
		for (int i = 0; i < input.size(); i++) {
			adornment.set(i, input.getValue(i) == null ? Adornment.FREE : Adornment.BOUND);
		}
		return adornment;
	}
	
	public final T matchSingle() {
		final T input = createDataFrame();
		final Adornment adornment = calculateAdornment(input);
		return matchSingle(input, adornment);
	}
	
	public final Iterable<T> matchAll() {
		final T input = createDataFrame();
		final Adornment adornment = calculateAdornment(input);
		return matchAll(input, adornment);
	}
	
	public final T matchSingle(T input) {
		final Adornment adornment = calculateAdornment(input);
		return matchSingle(input, adornment);
	}
	
	public final Iterable<T> matchAll(T input) {
		final Adornment adornment = calculateAdornment(input);
		return matchAll(input, adornment);
	}
	
	public final T matchSingle(Object... input){
		// TODO check input.length
		T initialFrame = createDataFrame();
		Adornment adornment = new Adornment(initialFrame.size());
		for (int i = 0; i < input.length; i++) {
			adornment.set(i, input[i] == null ? Adornment.FREE : Adornment.BOUND);
			initialFrame.setValue(i, input[i]);
		}
		return matchSingle(initialFrame, adornment);
	}
	
	public final Iterable<T> matchAll(Object... input) {
		// TODO check input.length
		T initialFrame = createDataFrame();
		Adornment adornment = new Adornment(initialFrame.size());
		for (int i = 0; i < input.length; i++) {
			adornment.set(i, input[i] == null ? Adornment.FREE : Adornment.BOUND);
			initialFrame.setValue(i, input[i]);
		}
		return matchAll(initialFrame, adornment);
	}
	
	abstract protected T matchSingle(T input, Adornment adornment);
	
	abstract protected Iterable<T> matchAll(T input, Adornment adornment);
	
	abstract public T createDataFrame();
}
