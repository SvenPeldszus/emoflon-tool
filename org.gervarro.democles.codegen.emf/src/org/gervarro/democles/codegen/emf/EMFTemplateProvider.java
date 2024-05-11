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
package org.gervarro.democles.codegen.emf;

import org.eclipse.emf.ecore.EReference;
import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.CodeGeneratorProvider;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.TemplateController;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.constraint.emf.EMFConstraint;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.constraint.emf.Operation;
import org.gervarro.democles.constraint.emf.StructuralFeature;

public class EMFTemplateProvider implements CodeGeneratorProvider<Chain<TemplateController>> {

	public Chain<TemplateController> getTemplateController(
			GeneratorOperation operation, Chain<TemplateController> tail) {
		Object type = operation.getType();
		Adornment adornment = operation.getPrecondition();
		if (type instanceof StructuralFeature<?>) {
			StructuralFeature<?> sf = (StructuralFeature<?>) type;
			if (adornment.get(0) == Adornment.BOUND && adornment.get(1) == Adornment.BOUND) {
				if (sf.getLinkedElement().isMany()) {
					return new Chain<TemplateController>(new TemplateController("/emf/CheckToMany", operation), tail);
				} else {
					return new Chain<TemplateController>(new TemplateController("/emf/CheckToOne", operation), tail);
				}
			} else if (adornment.get(0) == Adornment.BOUND && adornment.get(1) == Adornment.FREE) {
				if (sf.getLinkedElement().isMany()) {
					return new Chain<TemplateController>(new TemplateController("/emf/ForwardExtendToMany", operation), tail);
				} else {
					return new Chain<TemplateController>(new TemplateController("/emf/ForwardExtendToOne", operation), tail);
				}
			} else if (adornment.get(0) == Adornment.FREE && adornment.get(1) == Adornment.BOUND) {
				if (((EReference) sf.getLinkedElement()).getEOpposite().isMany()) {
					return new Chain<TemplateController>(new TemplateController("/emf/BackwardExtendToMany", operation), tail);
				} else {
					return new Chain<TemplateController>(new TemplateController("/emf/BackwardExtendToOne", operation), tail);
				}
			}
		} else if (type instanceof Operation) {
			return new Chain<TemplateController>(new TemplateController("/emf/InvokeOperation", operation), tail);
		} else if (type instanceof EMFVariable) {
			if (adornment.get(0) == Adornment.NOT_TYPECHECKED) {
				return new Chain<TemplateController>(new TemplateController("/emf/TypeCheck", operation), tail);
			}
		}
		throw new RuntimeException("Invalid operation");
	}
	
	public boolean isResponsibleFor(GeneratorOperation operation) {
		return operation.getType() instanceof EMFConstraint<?> || operation.getType() instanceof EMFVariable;
	}
}
