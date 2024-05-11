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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.gervarro.democles.common.TypeModule;
import org.gervarro.democles.specification.Variable;

/**
 * This class provides methods for mapping EMF model elements to appropriate {@link Variable}s and {@link Constraint}s
 */
public class EMFConstraintModule implements TypeModule {
	private static final String NAME = "emf";

	private final EPackage.Registry registry;
	private final Map<EModelElement, EMFConstraint<?>> constraintTypeMapping = new HashMap<EModelElement, EMFConstraint<?>>();
	private final Map<EClassifier, EMFVariable> variableTypeMapping = new HashMap<EClassifier, EMFVariable>();

	public EMFConstraintModule(final Registry registry) {
		this.registry = registry;
	}

	public EMFConstraintModule(final ResourceSet resourceSet) {
		this(resourceSet.getPackageRegistry());
	}

	/**
	 * Returns the stored {@link EClass} of the given {@link Variable}.
	 * 
	 * @param variable must be of type {@link EMFVariable}
	 * @return
	 */
	public static final EClass lookupEClass(final Variable variable) {
		final EMFVariable emfVariable = (EMFVariable) variable.getType();
		return (EClass) emfVariable.getLinkedElement();
	}

	public boolean isAdapterForType(final Object type) {
		return type instanceof Class<?>
				&& getClass().isAssignableFrom((Class<?>) type);
	}

	/**
	 * @see EMFConstraintModule#NAME
	 */
	@Override
	public final String getName() {
		return NAME;
	}

	/**
	 * For each EMF model element (EAttribute, EReference,...), a corresponding constraint instance is created.
	 * @param eModelElement
	 * @return
	 */
	public final EMFConstraint<?> getConstraintType(
			final EModelElement eModelElement) {
		EMFConstraint<?> constraintType = constraintTypeMapping
				.get(eModelElement);
		if (constraintType == null) {
			if (EcorePackage.eINSTANCE.getEAttribute()
					.isInstance(eModelElement)) {
				final EAttribute eAttribute = (EAttribute) eModelElement;
				constraintType = new Attribute(this, eAttribute);
			} else if (EcorePackage.eINSTANCE.getEReference()
					.isInstance(eModelElement)) {
				final EReference eReference = (EReference) eModelElement;
				constraintType = new Reference(this, eReference);
			} else if (EcorePackage.eINSTANCE.getEOperation()
					.isInstance(eModelElement)) {
				final EOperation eReference = (EOperation) eModelElement;
				constraintType = new Operation(this, eReference);
			} else {
				return null;
			}
			constraintTypeMapping.put(eModelElement, constraintType);
		}
		return constraintType;
	}

	/**
	 * Returns an appropriate {@link Variable} for the given classifier
	 * @param eClassifier
	 * @return
	 */
	public final EMFVariable getVariableType(final EClassifier eClassifier) {
		EMFVariable variableType = variableTypeMapping.get(eClassifier);
		if (variableType == null) {
			variableType = new EMFVariable(this, eClassifier);
			variableTypeMapping.put(eClassifier, variableType);
		}
		return variableType;
	}

	/**
	 * Returns the {@link EPackageRegistry} of this module
	 * @return
	 */
	public final Registry getRegistry() {
		return registry;
	}
}
