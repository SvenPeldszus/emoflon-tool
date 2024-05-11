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
package org.gervarro.democles.specification.emf.constraint;

import org.eclipse.emf.ecore.util.Switch;
import org.gervarro.democles.constraint.CoreConstraintModule;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.VariableType;
import org.gervarro.democles.specification.emf.TypeModule;
import org.gervarro.democles.specification.emf.constraint.relational.Equal;
import org.gervarro.democles.specification.emf.constraint.relational.Larger;
import org.gervarro.democles.specification.emf.constraint.relational.LargerOrEqual;
import org.gervarro.democles.specification.emf.constraint.relational.Smaller;
import org.gervarro.democles.specification.emf.constraint.relational.SmallerOrEqual;
import org.gervarro.democles.specification.emf.constraint.relational.Unequal;
import org.gervarro.democles.specification.emf.constraint.relational.util.RelationalConstraintSwitch;

public final class RelationalTypeModule extends TypeModule {
	
	public RelationalTypeModule(CoreConstraintModule typeModule) {
		super(typeModule);
	}
	
	@Override
	protected final Switch<VariableType> createVariableTypeSwitch() {
		return null;
	}

	@Override
	protected final Switch<ConstraintType> createConstraintTypeSwitch() {
		return new RelationalConstraintTypeSwitch();
	}
	
	private class RelationalConstraintTypeSwitch extends RelationalConstraintSwitch<ConstraintType> {
		
		public ConstraintType caseEqual(Equal object) {
			return ((CoreConstraintModule) typeModule).getConstraintType(CoreConstraintModule.EQUAL_STRING);
		}

		public ConstraintType caseUnequal(Unequal object) {
			return ((CoreConstraintModule) typeModule).getConstraintType(CoreConstraintModule.UNEQUAL_STRING);
		}

		public ConstraintType caseSmaller(Smaller object) {
			return ((CoreConstraintModule) typeModule).getConstraintType(CoreConstraintModule.SMALLER_STRING);
		}

		public ConstraintType caseSmallerOrEqual(SmallerOrEqual object) {
			return ((CoreConstraintModule) typeModule).getConstraintType(CoreConstraintModule.SMALLER_OR_EQUAL_STRING);
		}

		public ConstraintType caseLarger(Larger object) {
			return ((CoreConstraintModule) typeModule).getConstraintType(CoreConstraintModule.LARGER_STRING);
		}

		public ConstraintType caseLargerOrEqual(LargerOrEqual object) {
			return ((CoreConstraintModule) typeModule).getConstraintType(CoreConstraintModule.LARGER_OR_EQUAL_STRING);
		}
	}
}
