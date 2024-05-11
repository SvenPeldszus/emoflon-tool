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
package org.gervarro.democles.specification.impl;

public final class DefaultPatternFactory implements PatternFactory<DefaultPattern, DefaultPatternBody> {

	public final void setBodies(final DefaultPattern pattern,
			final DefaultPatternBody[] bodies) {
		pattern.setBodies(bodies);
		for (int i = 0; i < bodies.length; i++) {
			bodies[i].setParent(pattern);
		}
	}
	
	public final DefaultPattern createPattern(final String name,
			final Variable[] symbolicParameters) {
		return new DefaultPattern(name, symbolicParameters);
	}
	
	public final DefaultPatternBody createPatternBody(final Variable[] localVariables,
			final Constraint[] constraints,
			final Constant[] constants) {
		return new DefaultPatternBody(localVariables, constraints, constants);
	}
}
