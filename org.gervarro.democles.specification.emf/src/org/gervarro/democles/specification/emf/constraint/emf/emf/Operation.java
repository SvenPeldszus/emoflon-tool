/**
 */
package org.gervarro.democles.specification.emf.constraint.emf.emf;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getOperation()
 * @model kind="class"
 * @generated
 */
public class Operation extends EMFConstraint<EOperation> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Operation() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFTypePackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setEModelElement(EOperation newEModelElement) {
		super.setEModelElement(newEModelElement);
	}

} // Operation
