/**
 */
package org.gervarro.democles.specification.emf.constraint.relational;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.gervarro.democles.specification.emf.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relational Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getRelationalConstraint()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class RelationalConstraint extends Constraint implements EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalConstraint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationalConstraintPackage.Literals.RELATIONAL_CONSTRAINT;
	}

} // RelationalConstraint
