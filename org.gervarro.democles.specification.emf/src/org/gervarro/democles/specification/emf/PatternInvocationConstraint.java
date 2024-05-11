/**
 */
package org.gervarro.democles.specification.emf;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Invocation Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gervarro.democles.specification.emf.PatternInvocationConstraint#isPositive <em>Positive</em>}</li>
 *   <li>{@link org.gervarro.democles.specification.emf.PatternInvocationConstraint#getInvokedPattern <em>Invoked Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPatternInvocationConstraint()
 * @model kind="class"
 * @generated
 */
public class PatternInvocationConstraint extends Constraint {
	/**
	 * The default value of the '{@link #isPositive() <em>Positive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POSITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPositive() <em>Positive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositive()
	 * @generated
	 * @ordered
	 */
	protected boolean positive = POSITIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInvokedPattern() <em>Invoked Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvokedPattern()
	 * @generated
	 * @ordered
	 */
	protected Pattern invokedPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternInvocationConstraint() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.PATTERN_INVOCATION_CONSTRAINT;
	}

	/**
	 * Returns the value of the '<em><b>Positive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Positive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Positive</em>' attribute.
	 * @see #setPositive(boolean)
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPatternInvocationConstraint_Positive()
	 * @model required="true"
	 * @generated
	 */
	public boolean isPositive() {
		return positive;
	}

	/**
	 * Sets the value of the '{@link org.gervarro.democles.specification.emf.PatternInvocationConstraint#isPositive <em>Positive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Positive</em>' attribute.
	 * @see #isPositive()
	 * @generated
	 */
	public void setPositive(boolean newPositive) {
		boolean oldPositive = positive;
		positive = newPositive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.PATTERN_INVOCATION_CONSTRAINT__POSITIVE, oldPositive, positive));
	}

	/**
	 * Returns the value of the '<em><b>Invoked Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoked Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoked Pattern</em>' reference.
	 * @see #setInvokedPattern(Pattern)
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPatternInvocationConstraint_InvokedPattern()
	 * @model required="true"
	 * @generated
	 */
	public Pattern getInvokedPattern() {
		if (invokedPattern != null && ((EObject)invokedPattern).eIsProxy()) {
			InternalEObject oldInvokedPattern = (InternalEObject)invokedPattern;
			invokedPattern = (Pattern)eResolveProxy(oldInvokedPattern);
			if (invokedPattern != oldInvokedPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpecificationPackage.PATTERN_INVOCATION_CONSTRAINT__INVOKED_PATTERN, oldInvokedPattern, invokedPattern));
			}
		}
		return invokedPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern basicGetInvokedPattern() {
		return invokedPattern;
	}

	/**
	 * Sets the value of the '{@link org.gervarro.democles.specification.emf.PatternInvocationConstraint#getInvokedPattern <em>Invoked Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoked Pattern</em>' reference.
	 * @see #getInvokedPattern()
	 * @generated
	 */
	public void setInvokedPattern(Pattern newInvokedPattern) {
		Pattern oldInvokedPattern = invokedPattern;
		invokedPattern = newInvokedPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.PATTERN_INVOCATION_CONSTRAINT__INVOKED_PATTERN, oldInvokedPattern, invokedPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecificationPackage.PATTERN_INVOCATION_CONSTRAINT__POSITIVE:
				return isPositive();
			case SpecificationPackage.PATTERN_INVOCATION_CONSTRAINT__INVOKED_PATTERN:
				if (resolve) return getInvokedPattern();
				return basicGetInvokedPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpecificationPackage.PATTERN_INVOCATION_CONSTRAINT__POSITIVE:
				setPositive((Boolean)newValue);
				return;
			case SpecificationPackage.PATTERN_INVOCATION_CONSTRAINT__INVOKED_PATTERN:
				setInvokedPattern((Pattern)newValue);
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
			case SpecificationPackage.PATTERN_INVOCATION_CONSTRAINT__POSITIVE:
				setPositive(POSITIVE_EDEFAULT);
				return;
			case SpecificationPackage.PATTERN_INVOCATION_CONSTRAINT__INVOKED_PATTERN:
				setInvokedPattern((Pattern)null);
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
			case SpecificationPackage.PATTERN_INVOCATION_CONSTRAINT__POSITIVE:
				return positive != POSITIVE_EDEFAULT;
			case SpecificationPackage.PATTERN_INVOCATION_CONSTRAINT__INVOKED_PATTERN:
				return invokedPattern != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (positive: ");
		result.append(positive);
		result.append(')');
		return result.toString();
	}

} // PatternInvocationConstraint
