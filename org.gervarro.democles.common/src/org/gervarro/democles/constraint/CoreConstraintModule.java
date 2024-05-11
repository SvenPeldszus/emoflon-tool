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
package org.gervarro.democles.constraint;

import org.gervarro.democles.common.TypeModule;
import org.gervarro.democles.specification.ConstraintType;

/**
 * Singleton class that produces constraints for standard comparison constraints (=,>,...).
 */
public final class CoreConstraintModule implements TypeModule {

	/**
	 * The singleton instance of this module.
	 */
	public static final CoreConstraintModule INSTANCE = new CoreConstraintModule();

	public static final String EQUAL_STRING = "equal";
	public static final String UNEQUAL_STRING = "unequal";
	public static final String SMALLER_STRING = "smaller";
	public static final String SMALLER_OR_EQUAL_STRING = "smallerOrEqual";
	public static final String LARGER_STRING = "larger";
	public static final String LARGER_OR_EQUAL_STRING = "largerOrEqual";

	public static final CoreConstraintType EQUAL = new CoreConstraintType(
			EQUAL_STRING);
	public static final CoreConstraintType UNEQUAL = new CoreConstraintType(
			UNEQUAL_STRING);
	public static final CoreConstraintType SMALLER = new CoreConstraintType(
			SMALLER_STRING);
	public static final CoreConstraintType SMALLER_OR_EQUAL = new CoreConstraintType(
			SMALLER_OR_EQUAL_STRING);
	public static final CoreConstraintType LARGER = new CoreConstraintType(
			LARGER_STRING);
	public static final CoreConstraintType LARGER_OR_EQUAL = new CoreConstraintType(
			LARGER_OR_EQUAL_STRING);

	private static final String NAME = "core";

	private CoreConstraintModule() {
	}

	/**
	 * @see #NAME
	 */
	@Override
	public final String getName() {
		return NAME;
	}

	public final ConstraintType getConstraintType(final String identifier) {
		if (EQUAL_STRING.equals(identifier)) {
			return EQUAL;
		} else if (UNEQUAL_STRING.equals(identifier)) {
			return UNEQUAL;
		} else if (SMALLER_STRING.equals(identifier)) {
			return SMALLER;
		} else if (SMALLER_OR_EQUAL_STRING.equals(identifier)) {
			return SMALLER_OR_EQUAL;
		} else if (LARGER_STRING.equals(identifier)) {
			return LARGER;
		} else if (LARGER_OR_EQUAL_STRING.equals(identifier)) {
			return LARGER_OR_EQUAL;
		}
		return null;
	}

	public final String getConstraintTypeIdentifier(
			final ConstraintType constraintType) {
		if (constraintType instanceof CoreConstraintType) {
			final StringBuilder builder = new StringBuilder("/");
			builder.append(getName());
			builder.append("/");
			builder.append(((CoreConstraintType) constraintType).getID());
			return builder.toString();
		}
		return null;
	}
}
