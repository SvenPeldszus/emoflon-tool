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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PatternMatcherPlugin {
	private final List<TypeModuleProxy> typeModuleProxies = new ArrayList<TypeModuleProxy>();

	/**
	 * Instances are created via {@link #createPlugin()}
	 */
	private PatternMatcherPlugin() {
	}

	public final void setTypeModuleProxies(final TypeModuleProxy... builders) {
		typeModuleProxies.clear();
		typeModuleProxies.addAll(Arrays.asList(builders));
	}

	public final List<TypeModuleProxy> getTypeModuleProxies() {
		return typeModuleProxies;
	}

	public static final PatternMatcherPlugin createPlugin() {
		return new PatternMatcherPlugin();
	}

	/**
	 * Creates a (unique) name from a pattern name and its number of symbolic parameters
	 */
	public static final String getIdentifier(final String patternName,
			final int numberOfSymbolicParameters) {
		return patternName + "/" + numberOfSymbolicParameters;
	}
}
