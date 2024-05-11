/**
 */
package org.gervarro.democles.specification.emf;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gervarro.democles.specification.emf.PatternBody#getHeader <em>Header</em>}</li>
 *   <li>{@link org.gervarro.democles.specification.emf.PatternBody#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link org.gervarro.democles.specification.emf.PatternBody#getConstants <em>Constants</em>}</li>
 *   <li>{@link org.gervarro.democles.specification.emf.PatternBody#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPatternBody()
 * @model kind="class"
 * @generated
 */
public class PatternBody extends EObjectImpl {
	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> localVariables;

	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<Constant> constants;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternBody() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecificationPackage.Literals.PATTERN_BODY;
	}

	/**
	 * Returns the value of the '<em><b>Header</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.gervarro.democles.specification.emf.Pattern#getBodies <em>Bodies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' container reference.
	 * @see #setHeader(Pattern)
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPatternBody_Header()
	 * @see org.gervarro.democles.specification.emf.Pattern#getBodies
	 * @model opposite="bodies" required="true" transient="false"
	 * @generated
	 */
	public Pattern getHeader() {
		if (eContainerFeatureID() != SpecificationPackage.PATTERN_BODY__HEADER) return null;
		return (Pattern)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(Pattern newHeader, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHeader, SpecificationPackage.PATTERN_BODY__HEADER, msgs);
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.gervarro.democles.specification.emf.PatternBody#getHeader <em>Header</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' container reference.
	 * @see #getHeader()
	 * @generated
	 */
	public void setHeader(Pattern newHeader) {
		if (newHeader != eInternalContainer() || (eContainerFeatureID() != SpecificationPackage.PATTERN_BODY__HEADER && newHeader != null)) {
			if (EcoreUtil.isAncestor(this, (EObject)newHeader))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, SpecificationPackage.PATTERN__BODIES, Pattern.class, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpecificationPackage.PATTERN_BODY__HEADER, newHeader, newHeader));
	}

	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link org.gervarro.democles.specification.emf.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference list.
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPatternBody_LocalVariables()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Variable> getLocalVariables() {
		if (localVariables == null) {
			localVariables = new EObjectContainmentEList<Variable>(Variable.class, this, SpecificationPackage.PATTERN_BODY__LOCAL_VARIABLES);
		}
		return localVariables;
	}

	/**
	 * Returns the value of the '<em><b>Constants</b></em>' containment reference list.
	 * The list contents are of type {@link org.gervarro.democles.specification.emf.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' containment reference list.
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPatternBody_Constants()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Constant> getConstants() {
		if (constants == null) {
			constants = new EObjectContainmentEList<Constant>(Constant.class, this, SpecificationPackage.PATTERN_BODY__CONSTANTS);
		}
		return constants;
	}

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.gervarro.democles.specification.emf.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPatternBody_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, SpecificationPackage.PATTERN_BODY__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecificationPackage.PATTERN_BODY__HEADER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHeader((Pattern)otherEnd, msgs);
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
			case SpecificationPackage.PATTERN_BODY__HEADER:
				return basicSetHeader(null, msgs);
			case SpecificationPackage.PATTERN_BODY__LOCAL_VARIABLES:
				return ((InternalEList<?>)getLocalVariables()).basicRemove(otherEnd, msgs);
			case SpecificationPackage.PATTERN_BODY__CONSTANTS:
				return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
			case SpecificationPackage.PATTERN_BODY__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SpecificationPackage.PATTERN_BODY__HEADER:
				return eInternalContainer().eInverseRemove(this, SpecificationPackage.PATTERN__BODIES, Pattern.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpecificationPackage.PATTERN_BODY__HEADER:
				return getHeader();
			case SpecificationPackage.PATTERN_BODY__LOCAL_VARIABLES:
				return getLocalVariables();
			case SpecificationPackage.PATTERN_BODY__CONSTANTS:
				return getConstants();
			case SpecificationPackage.PATTERN_BODY__CONSTRAINTS:
				return getConstraints();
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
			case SpecificationPackage.PATTERN_BODY__HEADER:
				setHeader((Pattern)newValue);
				return;
			case SpecificationPackage.PATTERN_BODY__LOCAL_VARIABLES:
				getLocalVariables().clear();
				getLocalVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case SpecificationPackage.PATTERN_BODY__CONSTANTS:
				getConstants().clear();
				getConstants().addAll((Collection<? extends Constant>)newValue);
				return;
			case SpecificationPackage.PATTERN_BODY__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
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
			case SpecificationPackage.PATTERN_BODY__HEADER:
				setHeader((Pattern)null);
				return;
			case SpecificationPackage.PATTERN_BODY__LOCAL_VARIABLES:
				getLocalVariables().clear();
				return;
			case SpecificationPackage.PATTERN_BODY__CONSTANTS:
				getConstants().clear();
				return;
			case SpecificationPackage.PATTERN_BODY__CONSTRAINTS:
				getConstraints().clear();
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
			case SpecificationPackage.PATTERN_BODY__HEADER:
				return getHeader() != null;
			case SpecificationPackage.PATTERN_BODY__LOCAL_VARIABLES:
				return localVariables != null && !localVariables.isEmpty();
			case SpecificationPackage.PATTERN_BODY__CONSTANTS:
				return constants != null && !constants.isEmpty();
			case SpecificationPackage.PATTERN_BODY__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // PatternBody
