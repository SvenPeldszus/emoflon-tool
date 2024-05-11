/**
 */
package org.gervarro.democles.specification.emf;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gervarro.democles.specification.emf.Pattern#getName <em>Name</em>}</li>
 *   <li>{@link org.gervarro.democles.specification.emf.Pattern#getSymbolicParameters <em>Symbolic Parameters</em>}</li>
 *   <li>{@link org.gervarro.democles.specification.emf.Pattern#getBodies <em>Bodies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPattern()
 * @model kind="class"
 * @generated
 */
public class Pattern extends EObjectImpl {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSymbolicParameters() <em>Symbolic Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolicParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> symbolicParameters;

	/**
	 * The cached value of the '{@link #getBodies() <em>Bodies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodies()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternBody> bodies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pattern() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.PATTERN;
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPattern_Name()
	 * @model id="true"
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link org.gervarro.democles.specification.emf.Pattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.PATTERN__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Symbolic Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.gervarro.democles.specification.emf.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbolic Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbolic Parameters</em>' containment reference list.
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPattern_SymbolicParameters()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Variable> getSymbolicParameters() {
		if (symbolicParameters == null) {
			symbolicParameters = new EObjectContainmentEList<Variable>(Variable.class, this, SpecificationPackage.PATTERN__SYMBOLIC_PARAMETERS);
		}
		return symbolicParameters;
	}

	/**
	 * Returns the value of the '<em><b>Bodies</b></em>' containment reference list.
	 * The list contents are of type {@link org.gervarro.democles.specification.emf.PatternBody}.
	 * It is bidirectional and its opposite is '{@link org.gervarro.democles.specification.emf.PatternBody#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bodies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bodies</em>' containment reference list.
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPattern_Bodies()
	 * @see org.gervarro.democles.specification.emf.PatternBody#getHeader
	 * @model opposite="header" containment="true" ordered="false"
	 * @generated
	 */
	public EList<PatternBody> getBodies() {
		if (bodies == null) {
			bodies = new EObjectContainmentWithInverseEList<PatternBody>(PatternBody.class, this, SpecificationPackage.PATTERN__BODIES, SpecificationPackage.PATTERN_BODY__HEADER);
		}
		return bodies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecificationPackage.PATTERN__BODIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBodies()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecificationPackage.PATTERN__SYMBOLIC_PARAMETERS:
				return ((InternalEList<?>)getSymbolicParameters()).basicRemove(otherEnd, msgs);
			case SpecificationPackage.PATTERN__BODIES:
				return ((InternalEList<?>)getBodies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecificationPackage.PATTERN__NAME:
				return getName();
			case SpecificationPackage.PATTERN__SYMBOLIC_PARAMETERS:
				return getSymbolicParameters();
			case SpecificationPackage.PATTERN__BODIES:
				return getBodies();
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
			case SpecificationPackage.PATTERN__NAME:
				setName((String)newValue);
				return;
			case SpecificationPackage.PATTERN__SYMBOLIC_PARAMETERS:
				getSymbolicParameters().clear();
				getSymbolicParameters().addAll((Collection<? extends Variable>)newValue);
				return;
			case SpecificationPackage.PATTERN__BODIES:
				getBodies().clear();
				getBodies().addAll((Collection<? extends PatternBody>)newValue);
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
			case SpecificationPackage.PATTERN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpecificationPackage.PATTERN__SYMBOLIC_PARAMETERS:
				getSymbolicParameters().clear();
				return;
			case SpecificationPackage.PATTERN__BODIES:
				getBodies().clear();
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
			case SpecificationPackage.PATTERN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpecificationPackage.PATTERN__SYMBOLIC_PARAMETERS:
				return symbolicParameters != null && !symbolicParameters.isEmpty();
			case SpecificationPackage.PATTERN__BODIES:
				return bodies != null && !bodies.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} // Pattern
