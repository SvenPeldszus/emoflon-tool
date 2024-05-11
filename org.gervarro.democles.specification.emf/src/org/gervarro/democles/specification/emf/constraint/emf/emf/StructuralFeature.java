/**
 */
package org.gervarro.democles.specification.emf.constraint.emf.emf;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getStructuralFeature()
 * @model kind="class"
 * @generated
 */
public class StructuralFeature<E extends EStructuralFeature> extends EMFConstraint<E> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuralFeature() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFTypePackage.Literals.STRUCTURAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setEModelElement(E newEModelElement) {
		super.setEModelElement(newEModelElement);
	}

} // StructuralFeature
