/**
 */
package org.gervarro.democles.specification.emf.constraint.emf.emf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.gervarro.democles.specification.emf.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMF Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gervarro.democles.specification.emf.constraint.emf.emf.EMFConstraint#getEModelElement <em>EModel Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getEMFConstraint()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class EMFConstraint<E extends ETypedElement> extends Constraint implements EObject {
	/**
	 * The cached value of the '{@link #getEModelElement() <em>EModel Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEModelElement()
	 * @generated
	 * @ordered
	 */
	protected E eModelElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMFConstraint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFTypePackage.Literals.EMF_CONSTRAINT;
	}

	/**
	 * Returns the value of the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EModel Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EModel Element</em>' reference.
	 * @see #setEModelElement(ETypedElement)
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getEMFConstraint_EModelElement()
	 * @model required="true"
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public E getEModelElement() {
		if (eModelElement != null && eModelElement.eIsProxy()) {
			InternalEObject oldEModelElement = (InternalEObject)eModelElement;
			eModelElement = (E)eResolveProxy(oldEModelElement);
			if (eModelElement != oldEModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFTypePackage.EMF_CONSTRAINT__EMODEL_ELEMENT, oldEModelElement, eModelElement));
			}
		}
		return eModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public E basicGetEModelElement() {
		return eModelElement;
	}

	/**
	 * Sets the value of the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.EMFConstraint#getEModelElement <em>EModel Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EModel Element</em>' reference.
	 * @see #getEModelElement()
	 * @generated
	 */
	public void setEModelElement(E newEModelElement) {
		E oldEModelElement = eModelElement;
		eModelElement = newEModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFTypePackage.EMF_CONSTRAINT__EMODEL_ELEMENT, oldEModelElement, eModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFTypePackage.EMF_CONSTRAINT__EMODEL_ELEMENT:
				if (resolve) return getEModelElement();
				return basicGetEModelElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EMFTypePackage.EMF_CONSTRAINT__EMODEL_ELEMENT:
				setEModelElement((E)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EMFTypePackage.EMF_CONSTRAINT__EMODEL_ELEMENT:
				setEModelElement((E)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EMFTypePackage.EMF_CONSTRAINT__EMODEL_ELEMENT:
				return eModelElement != null;
		}
		return super.eIsSet(featureID);
	}

} // EMFConstraint
