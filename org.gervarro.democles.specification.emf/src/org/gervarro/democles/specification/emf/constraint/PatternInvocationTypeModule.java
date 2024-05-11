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
import org.gervarro.democles.common.PatternMatcherPlugin;
import org.gervarro.democles.specification.ConstraintType;
import org.gervarro.democles.specification.VariableType;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternInvocationConstraint;
import org.gervarro.democles.specification.emf.TypeModule;
import org.gervarro.democles.specification.emf.util.SpecificationSwitch;
import org.gervarro.democles.specification.impl.PatternInvocationConstraintModule;

public class PatternInvocationTypeModule<P extends org.gervarro.democles.specification.impl.Pattern, PB> extends TypeModule {

	public PatternInvocationTypeModule(PatternInvocationConstraintModule<P, PB> typeModule) {
		super(typeModule);
	}

	@Override
	protected final Switch<VariableType> createVariableTypeSwitch() {
		return null;
	}

	@Override
	protected final PatternInvocationTypeSwitch createConstraintTypeSwitch() {
		return new PatternInvocationTypeSwitch();
	}
	
	private class PatternInvocationTypeSwitch extends SpecificationSwitch<ConstraintType> {
		@SuppressWarnings("unchecked")
		public ConstraintType casePatternInvocationConstraint(PatternInvocationConstraint patternInvocationConstraint) {
			Pattern invokedPattern = patternInvocationConstraint.getInvokedPattern();
			String identifier = PatternMatcherPlugin.getIdentifier(invokedPattern.getName(), invokedPattern.getSymbolicParameters().size());
			return ((PatternInvocationConstraintModule<P,PB>) typeModule).getConstraintType(identifier, patternInvocationConstraint.isPositive());
		}
	}
}
