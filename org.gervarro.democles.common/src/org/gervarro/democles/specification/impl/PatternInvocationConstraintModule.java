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

import java.util.HashMap;
import java.util.Map;

import org.gervarro.democles.common.TypeModule;
import org.gervarro.democles.constraint.PatternInvocationConstraintType;

public class PatternInvocationConstraintModule<P extends Pattern, PB>
		implements TypeModule {
	private static final String NAME = "pattern";
	private final PatternBuilder<P, PB> patternModule;
	private final Map<P, PatternInvocationConstraintType> constraintTypeMapping;

	public PatternInvocationConstraintModule(
			final PatternBuilder<P, PB> patternModule) {
		this.patternModule = patternModule;
		this.constraintTypeMapping = new HashMap<P, PatternInvocationConstraintType>();
	}

	public final PatternInvocationConstraintType getConstraintType(
			final String identifier, final boolean isPositive) {
		final P pattern = patternModule.patternRegistry.get(identifier);
		if (pattern != null) {
			PatternInvocationConstraintType type = constraintTypeMapping
					.get(pattern);
			if (type == null) {
				type = new PatternInvocationConstraintType(pattern, isPositive);
				constraintTypeMapping.put(pattern, type);
			}
			return type;
		}
		return null;
	}

	@Override
	public String getName() {
		return NAME;
	}
}
