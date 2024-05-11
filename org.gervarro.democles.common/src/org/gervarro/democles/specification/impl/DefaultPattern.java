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
package org.gervarro.democles.specification.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DefaultPattern extends org.gervarro.democles.specification.impl.Pattern {
	private List<DefaultPatternBody> bodies;
	private final List<Variable> symbolicParameters;
	
	DefaultPattern(String name, Variable[] symbolicParameters) {
		super(name, symbolicParameters);
		this.symbolicParameters = Collections.unmodifiableList(Arrays.asList(symbolicParameters));
	}
	
	DefaultPattern(String name, DefaultPatternBody[] bodies, Variable[] symbolicParameters) {
		this(name, symbolicParameters);
		this.setBodies(bodies);
	}
	
	public final List<DefaultPatternBody> getBodies() {
		if (bodies != null) {
			return bodies;
		} else {
			final List<DefaultPatternBody> result = Collections.emptyList();
			return result;
		}
	}
	
	public final List<Variable> getSymbolicParameters() {
		return symbolicParameters;
	}
	
	final void setBodies(DefaultPatternBody[] bodies) {
		if (this.bodies == null) {
			this.bodies = Collections.unmodifiableList(Arrays.asList(bodies));
		}
	}
}
