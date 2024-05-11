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
package org.gervarro.democles.constraint.emf;

import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gervarro.democles.specification.ConstraintType;

abstract public class EMFConstraint<E extends ETypedElement> implements ConstraintType {
	private final EMFConstraintModule module;
	private final E linkedElement;
	
	protected EMFConstraint(final EMFConstraintModule module,
			final E linkedElement) {
		this.module = module;
		this.linkedElement = linkedElement;
	}
	
	public final EMFConstraintModule getTypeModule() {
		return module;
	}
	
	public final E getLinkedElement() {
		return linkedElement;
	}
	
	public String toString() {
		return linkedElement != null ? EcoreUtil.getURI(linkedElement).toString() : "null";
	}
}
