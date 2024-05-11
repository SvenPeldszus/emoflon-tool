/**
 */
package org.gervarro.democles.specification.emf.constraint.relational;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.gervarro.democles.specification.emf.SpecificationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintFactory
 * @model kind="package"
 * @generated
 */
public class RelationalConstraintPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "relational";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://gervarro.org/democles/specification/constraint/relational.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "relational";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RelationalConstraintPackage eINSTANCE = org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage.init();

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint <em>Relational Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint
	 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getRelationalConstraint()
	 * @generated
	 */
	public static final int RELATIONAL_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_CONSTRAINT__PARAMETERS = SpecificationPackage.CONSTRAINT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Relational Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONAL_CONSTRAINT_FEATURE_COUNT = SpecificationPackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.relational.Equal <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.relational.Equal
	 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getEqual()
	 * @generated
	 */
	public static final int EQUAL = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL__PARAMETERS = RELATIONAL_CONSTRAINT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_FEATURE_COUNT = RELATIONAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.relational.Unequal <em>Unequal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.relational.Unequal
	 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getUnequal()
	 * @generated
	 */
	public static final int UNEQUAL = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNEQUAL__PARAMETERS = RELATIONAL_CONSTRAINT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Unequal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNEQUAL_FEATURE_COUNT = RELATIONAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.relational.Smaller <em>Smaller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.relational.Smaller
	 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getSmaller()
	 * @generated
	 */
	public static final int SMALLER = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SMALLER__PARAMETERS = RELATIONAL_CONSTRAINT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Smaller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SMALLER_FEATURE_COUNT = RELATIONAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.relational.SmallerOrEqual <em>Smaller Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.relational.SmallerOrEqual
	 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getSmallerOrEqual()
	 * @generated
	 */
	public static final int SMALLER_OR_EQUAL = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SMALLER_OR_EQUAL__PARAMETERS = RELATIONAL_CONSTRAINT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Smaller Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SMALLER_OR_EQUAL_FEATURE_COUNT = RELATIONAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.relational.Larger <em>Larger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.relational.Larger
	 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getLarger()
	 * @generated
	 */
	public static final int LARGER = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LARGER__PARAMETERS = RELATIONAL_CONSTRAINT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Larger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LARGER_FEATURE_COUNT = RELATIONAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.relational.LargerOrEqual <em>Larger Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.relational.LargerOrEqual
	 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getLargerOrEqual()
	 * @generated
	 */
	public static final int LARGER_OR_EQUAL = 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LARGER_OR_EQUAL__PARAMETERS = RELATIONAL_CONSTRAINT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Larger Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int LARGER_OR_EQUAL_FEATURE_COUNT = RELATIONAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unequalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallerOrEqualEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largerOrEqualEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationalConstraintPackage() {
		super(eNS_URI, RelationalConstraintFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RelationalConstraintPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationalConstraintPackage init() {
		if (isInited) return (RelationalConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(RelationalConstraintPackage.eNS_URI);

		// Obtain or create and register package
		RelationalConstraintPackage theRelationalConstraintPackage = (RelationalConstraintPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RelationalConstraintPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RelationalConstraintPackage());

		isInited = true;

		// Initialize simple dependencies
		SpecificationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRelationalConstraintPackage.createPackageContents();

		// Initialize created meta-data
		theRelationalConstraintPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationalConstraintPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationalConstraintPackage.eNS_URI, theRelationalConstraintPackage);
		return theRelationalConstraintPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint <em>Relational Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Constraint</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint
	 * @generated
	 */
	public EClass getRelationalConstraint() {
		return relationalConstraintEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.relational.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.relational.Equal
	 * @generated
	 */
	public EClass getEqual() {
		return equalEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.relational.Unequal <em>Unequal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unequal</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.relational.Unequal
	 * @generated
	 */
	public EClass getUnequal() {
		return unequalEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.relational.Smaller <em>Smaller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smaller</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.relational.Smaller
	 * @generated
	 */
	public EClass getSmaller() {
		return smallerEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.relational.SmallerOrEqual <em>Smaller Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smaller Or Equal</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.relational.SmallerOrEqual
	 * @generated
	 */
	public EClass getSmallerOrEqual() {
		return smallerOrEqualEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.relational.Larger <em>Larger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Larger</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.relational.Larger
	 * @generated
	 */
	public EClass getLarger() {
		return largerEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.relational.LargerOrEqual <em>Larger Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Larger Or Equal</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.relational.LargerOrEqual
	 * @generated
	 */
	public EClass getLargerOrEqual() {
		return largerOrEqualEClass;
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public RelationalConstraintFactory getRelationalConstraintFactory() {
		return (RelationalConstraintFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		relationalConstraintEClass = createEClass(RELATIONAL_CONSTRAINT);

		equalEClass = createEClass(EQUAL);

		unequalEClass = createEClass(UNEQUAL);

		smallerEClass = createEClass(SMALLER);

		smallerOrEqualEClass = createEClass(SMALLER_OR_EQUAL);

		largerEClass = createEClass(LARGER);

		largerOrEqualEClass = createEClass(LARGER_OR_EQUAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SpecificationPackage theSpecificationPackage = (SpecificationPackage)EPackage.Registry.INSTANCE.getEPackage(SpecificationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		relationalConstraintEClass.getESuperTypes().add(theSpecificationPackage.getConstraint());
		equalEClass.getESuperTypes().add(this.getRelationalConstraint());
		unequalEClass.getESuperTypes().add(this.getRelationalConstraint());
		smallerEClass.getESuperTypes().add(this.getRelationalConstraint());
		smallerOrEqualEClass.getESuperTypes().add(this.getRelationalConstraint());
		largerEClass.getESuperTypes().add(this.getRelationalConstraint());
		largerOrEqualEClass.getESuperTypes().add(this.getRelationalConstraint());

		// Initialize classes and features; add operations and parameters
		initEClass(relationalConstraintEClass, RelationalConstraint.class, "RelationalConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalEClass, Equal.class, "Equal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unequalEClass, Unequal.class, "Unequal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smallerEClass, Smaller.class, "Smaller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smallerOrEqualEClass, SmallerOrEqual.class, "SmallerOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(largerEClass, Larger.class, "Larger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(largerOrEqualEClass, LargerOrEqual.class, "LargerOrEqual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint <em>Relational Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraint
		 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getRelationalConstraint()
		 * @generated
		 */
		public static final EClass RELATIONAL_CONSTRAINT = eINSTANCE.getRelationalConstraint();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.relational.Equal <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.relational.Equal
		 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getEqual()
		 * @generated
		 */
		public static final EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.relational.Unequal <em>Unequal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.relational.Unequal
		 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getUnequal()
		 * @generated
		 */
		public static final EClass UNEQUAL = eINSTANCE.getUnequal();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.relational.Smaller <em>Smaller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.relational.Smaller
		 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getSmaller()
		 * @generated
		 */
		public static final EClass SMALLER = eINSTANCE.getSmaller();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.relational.SmallerOrEqual <em>Smaller Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.relational.SmallerOrEqual
		 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getSmallerOrEqual()
		 * @generated
		 */
		public static final EClass SMALLER_OR_EQUAL = eINSTANCE.getSmallerOrEqual();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.relational.Larger <em>Larger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.relational.Larger
		 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getLarger()
		 * @generated
		 */
		public static final EClass LARGER = eINSTANCE.getLarger();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.relational.LargerOrEqual <em>Larger Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.relational.LargerOrEqual
		 * @see org.gervarro.democles.specification.emf.constraint.relational.RelationalConstraintPackage#getLargerOrEqual()
		 * @generated
		 */
		public static final EClass LARGER_OR_EQUAL = eINSTANCE.getLargerOrEqual();

	}

} //RelationalConstraintPackage
