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

import java.util.List;

/**
 * Default implementation for {@link org.gervarro.democles.specification.Pattern}.
 */
abstract public class Pattern
		implements org.gervarro.democles.specification.Pattern {
	private final String name;

	protected Pattern(final String name, final Variable[] symbolicParameters) {
		this.name = name;
	}

	@Override
	abstract public List<? extends PatternBody> getBodies();

	@Override
	abstract public List<? extends Variable> getSymbolicParameters();

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		final StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}
}
