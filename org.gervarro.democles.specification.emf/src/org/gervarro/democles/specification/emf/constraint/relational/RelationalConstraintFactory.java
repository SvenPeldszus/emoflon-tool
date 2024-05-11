/**
 */
package org.gervarro.democles.specification.emf.constraint.relational;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage
 * @generated
 */
public class RelationalConstraintFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalConstraintFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationalConstraintFactory init() {
		try {
			RelationalConstraintFactory theRelationalConstraintFactory = (RelationalConstraintFactory)EPackage.Registry.INSTANCE.getEFactory(RelationalConstraintPackage.eNS_URI);
			if (theRelationalConstraintFactory != null) {
				return theRelationalConstraintFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationalConstraintFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalConstraintFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RelationalConstraintPackage.EQUAL: return createEqual();
			case RelationalConstraintPackage.UNEQUAL: return createUnequal();
			case RelationalConstraintPackage.SMALLER: return createSmaller();
			case RelationalConstraintPackage.SMALLER_OR_EQUAL: return createSmallerOrEqual();
			case RelationalConstraintPackage.LARGER: return createLarger();
			case RelationalConstraintPackage.LARGER_OR_EQUAL: return createLargerOrEqual();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equal createEqual() {
		Equal equal = new Equal();
		return equal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unequal createUnequal() {
		Unequal unequal = new Unequal();
		return unequal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Smaller createSmaller() {
		Smaller smaller = new Smaller();
		return smaller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallerOrEqual createSmallerOrEqual() {
		SmallerOrEqual smallerOrEqual = new SmallerOrEqual();
		return smallerOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Larger createLarger() {
		Larger larger = new Larger();
		return larger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargerOrEqual createLargerOrEqual() {
		LargerOrEqual largerOrEqual = new LargerOrEqual();
		return largerOrEqual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalConstraintPackage getRelationalConstraintPackage() {
		return (RelationalConstraintPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationalConstraintPackage getPackage() {
		return RelationalConstraintPackage.eINSTANCE;
	}

} //RelationalConstraintFactory
