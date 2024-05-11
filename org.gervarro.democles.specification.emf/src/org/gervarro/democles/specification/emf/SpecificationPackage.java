/**
 */
package org.gervarro.democles.specification.emf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see org.gervarro.democles.specification.emf.SpecificationFactory
 * @model kind="package"
 * @generated
 */
public class SpecificationPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "specification";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://gervarro.org/democles/specification.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "specification";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SpecificationPackage eINSTANCE = org.gervarro.democles.specification.emf.SpecificationPackage.init();

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.Pattern <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.Pattern
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPattern()
	 * @generated
	 */
	public static final int PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Symbolic Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN__SYMBOLIC_PARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Bodies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN__BODIES = 2;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.PatternBody <em>Pattern Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.PatternBody
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPatternBody()
	 * @generated
	 */
	public static final int PATTERN_BODY = 1;

	/**
	 * The feature id for the '<em><b>Header</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_BODY__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_BODY__LOCAL_VARIABLES = 1;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_BODY__CONSTANTS = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_BODY__CONSTRAINTS = 3;

	/**
	 * The number of structural features of the '<em>Pattern Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_BODY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.Constraint <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.Constraint
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getConstraint()
	 * @generated
	 */
	public static final int CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRAINT__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.ConstraintVariable <em>Constraint Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.ConstraintVariable
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getConstraintVariable()
	 * @generated
	 */
	public static final int CONSTRAINT_VARIABLE = 3;

	/**
	 * The number of structural features of the '<em>Constraint Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRAINT_VARIABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.Variable <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.Variable
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getVariable()
	 * @generated
	 */
	public static final int VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE__NAME = CONSTRAINT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int VARIABLE_FEATURE_COUNT = CONSTRAINT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.Constant <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.Constant
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getConstant()
	 * @generated
	 */
	public static final int CONSTANT = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT__VALUE = CONSTRAINT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT_FEATURE_COUNT = CONSTRAINT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.PatternInvocationConstraint <em>Pattern Invocation Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.PatternInvocationConstraint
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPatternInvocationConstraint()
	 * @generated
	 */
	public static final int PATTERN_INVOCATION_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_INVOCATION_CONSTRAINT__PARAMETERS = CONSTRAINT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Positive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_INVOCATION_CONSTRAINT__POSITIVE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Invoked Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_INVOCATION_CONSTRAINT__INVOKED_PATTERN = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pattern Invocation Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_INVOCATION_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.ConstraintParameter <em>Constraint Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.ConstraintParameter
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getConstraintParameter()
	 * @generated
	 */
	public static final int CONSTRAINT_PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRAINT_PARAMETER__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Constraint Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRAINT_PARAMETER_FEATURE_COUNT = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternInvocationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintParameterEClass = null;

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
	 * @see org.gervarro.democles.specification.emf.SpecificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpecificationPackage() {
		super(eNS_URI, SpecificationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SpecificationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpecificationPackage init() {
		if (isInited) return (SpecificationPackage)EPackage.Registry.INSTANCE.getEPackage(SpecificationPackage.eNS_URI);

		// Obtain or create and register package
		SpecificationPackage theSpecificationPackage = (SpecificationPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpecificationPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpecificationPackage());

		isInited = true;

		// Create package meta-data objects
		theSpecificationPackage.createPackageContents();

		// Initialize created meta-data
		theSpecificationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpecificationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpecificationPackage.eNS_URI, theSpecificationPackage);
		return theSpecificationPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see org.gervarro.democles.specification.emf.Pattern
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.gervarro.democles.specification.emf.Pattern#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gervarro.democles.specification.emf.Pattern#getName()
	 * @see #getPattern()
	 * @generated
	 */
	public EAttribute getPattern_Name() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.gervarro.democles.specification.emf.Pattern#getSymbolicParameters <em>Symbolic Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symbolic Parameters</em>'.
	 * @see org.gervarro.democles.specification.emf.Pattern#getSymbolicParameters()
	 * @see #getPattern()
	 * @generated
	 */
	public EReference getPattern_SymbolicParameters() {
		return (EReference)patternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.gervarro.democles.specification.emf.Pattern#getBodies <em>Bodies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bodies</em>'.
	 * @see org.gervarro.democles.specification.emf.Pattern#getBodies()
	 * @see #getPattern()
	 * @generated
	 */
	public EReference getPattern_Bodies() {
		return (EReference)patternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.PatternBody <em>Pattern Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Body</em>'.
	 * @see org.gervarro.democles.specification.emf.PatternBody
	 * @generated
	 */
	public EClass getPatternBody() {
		return patternBodyEClass;
	}

	/**
	 * Returns the meta object for the container reference '{@link org.gervarro.democles.specification.emf.PatternBody#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Header</em>'.
	 * @see org.gervarro.democles.specification.emf.PatternBody#getHeader()
	 * @see #getPatternBody()
	 * @generated
	 */
	public EReference getPatternBody_Header() {
		return (EReference)patternBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.gervarro.democles.specification.emf.PatternBody#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variables</em>'.
	 * @see org.gervarro.democles.specification.emf.PatternBody#getLocalVariables()
	 * @see #getPatternBody()
	 * @generated
	 */
	public EReference getPatternBody_LocalVariables() {
		return (EReference)patternBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.gervarro.democles.specification.emf.PatternBody#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see org.gervarro.democles.specification.emf.PatternBody#getConstants()
	 * @see #getPatternBody()
	 * @generated
	 */
	public EReference getPatternBody_Constants() {
		return (EReference)patternBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.gervarro.democles.specification.emf.PatternBody#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.gervarro.democles.specification.emf.PatternBody#getConstraints()
	 * @see #getPatternBody()
	 * @generated
	 */
	public EReference getPatternBody_Constraints() {
		return (EReference)patternBodyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.gervarro.democles.specification.emf.Constraint
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.gervarro.democles.specification.emf.Constraint#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.gervarro.democles.specification.emf.Constraint#getParameters()
	 * @see #getConstraint()
	 * @generated
	 */
	public EReference getConstraint_Parameters() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.ConstraintVariable <em>Constraint Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Variable</em>'.
	 * @see org.gervarro.democles.specification.emf.ConstraintVariable
	 * @generated
	 */
	public EClass getConstraintVariable() {
		return constraintVariableEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.gervarro.democles.specification.emf.Variable
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.gervarro.democles.specification.emf.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gervarro.democles.specification.emf.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.gervarro.democles.specification.emf.Constant
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.gervarro.democles.specification.emf.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.gervarro.democles.specification.emf.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	public EAttribute getConstant_Value() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.PatternInvocationConstraint <em>Pattern Invocation Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern Invocation Constraint</em>'.
	 * @see org.gervarro.democles.specification.emf.PatternInvocationConstraint
	 * @generated
	 */
	public EClass getPatternInvocationConstraint() {
		return patternInvocationConstraintEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.gervarro.democles.specification.emf.PatternInvocationConstraint#isPositive <em>Positive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Positive</em>'.
	 * @see org.gervarro.democles.specification.emf.PatternInvocationConstraint#isPositive()
	 * @see #getPatternInvocationConstraint()
	 * @generated
	 */
	public EAttribute getPatternInvocationConstraint_Positive() {
		return (EAttribute)patternInvocationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.gervarro.democles.specification.emf.PatternInvocationConstraint#getInvokedPattern <em>Invoked Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoked Pattern</em>'.
	 * @see org.gervarro.democles.specification.emf.PatternInvocationConstraint#getInvokedPattern()
	 * @see #getPatternInvocationConstraint()
	 * @generated
	 */
	public EReference getPatternInvocationConstraint_InvokedPattern() {
		return (EReference)patternInvocationConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.ConstraintParameter <em>Constraint Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Parameter</em>'.
	 * @see org.gervarro.democles.specification.emf.ConstraintParameter
	 * @generated
	 */
	public EClass getConstraintParameter() {
		return constraintParameterEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.gervarro.democles.specification.emf.ConstraintParameter#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.gervarro.democles.specification.emf.ConstraintParameter#getReference()
	 * @see #getConstraintParameter()
	 * @generated
	 */
	public EReference getConstraintParameter_Reference() {
		return (EReference)constraintParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SpecificationFactory getSpecificationFactory() {
		return (SpecificationFactory)getEFactoryInstance();
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
		patternEClass = createEClass(PATTERN);
		createEAttribute(patternEClass, PATTERN__NAME);
		createEReference(patternEClass, PATTERN__SYMBOLIC_PARAMETERS);
		createEReference(patternEClass, PATTERN__BODIES);

		patternBodyEClass = createEClass(PATTERN_BODY);
		createEReference(patternBodyEClass, PATTERN_BODY__HEADER);
		createEReference(patternBodyEClass, PATTERN_BODY__LOCAL_VARIABLES);
		createEReference(patternBodyEClass, PATTERN_BODY__CONSTANTS);
		createEReference(patternBodyEClass, PATTERN_BODY__CONSTRAINTS);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__PARAMETERS);

		constraintVariableEClass = createEClass(CONSTRAINT_VARIABLE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);

		constantEClass = createEClass(CONSTANT);
		createEAttribute(constantEClass, CONSTANT__VALUE);

		patternInvocationConstraintEClass = createEClass(PATTERN_INVOCATION_CONSTRAINT);
		createEAttribute(patternInvocationConstraintEClass, PATTERN_INVOCATION_CONSTRAINT__POSITIVE);
		createEReference(patternInvocationConstraintEClass, PATTERN_INVOCATION_CONSTRAINT__INVOKED_PATTERN);

		constraintParameterEClass = createEClass(CONSTRAINT_PARAMETER);
		createEReference(constraintParameterEClass, CONSTRAINT_PARAMETER__REFERENCE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableEClass.getESuperTypes().add(this.getConstraintVariable());
		constantEClass.getESuperTypes().add(this.getConstraintVariable());
		patternInvocationConstraintEClass.getESuperTypes().add(this.getConstraint());

		// Initialize classes and features; add operations and parameters
		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_SymbolicParameters(), this.getVariable(), null, "symbolicParameters", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPattern_Bodies(), this.getPatternBody(), this.getPatternBody_Header(), "bodies", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(patternBodyEClass, PatternBody.class, "PatternBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatternBody_Header(), this.getPattern(), this.getPattern_Bodies(), "header", null, 1, 1, PatternBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternBody_LocalVariables(), this.getVariable(), null, "localVariables", null, 0, -1, PatternBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternBody_Constants(), this.getConstant(), null, "constants", null, 0, -1, PatternBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternBody_Constraints(), this.getConstraint(), null, "constraints", null, 0, -1, PatternBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Parameters(), this.getConstraintParameter(), null, "parameters", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintVariableEClass, ConstraintVariable.class, "ConstraintVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", "", 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstant_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternInvocationConstraintEClass, PatternInvocationConstraint.class, "PatternInvocationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatternInvocationConstraint_Positive(), ecorePackage.getEBoolean(), "positive", null, 1, 1, PatternInvocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatternInvocationConstraint_InvokedPattern(), this.getPattern(), null, "invokedPattern", null, 1, 1, PatternInvocationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintParameterEClass, ConstraintParameter.class, "ConstraintParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintParameter_Reference(), this.getConstraintVariable(), null, "reference", null, 1, 1, ConstraintParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.Pattern <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.Pattern
		 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPattern()
		 * @generated
		 */
		public static final EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PATTERN__NAME = eINSTANCE.getPattern_Name();

		/**
		 * The meta object literal for the '<em><b>Symbolic Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PATTERN__SYMBOLIC_PARAMETERS = eINSTANCE.getPattern_SymbolicParameters();

		/**
		 * The meta object literal for the '<em><b>Bodies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PATTERN__BODIES = eINSTANCE.getPattern_Bodies();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.PatternBody <em>Pattern Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.PatternBody
		 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPatternBody()
		 * @generated
		 */
		public static final EClass PATTERN_BODY = eINSTANCE.getPatternBody();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PATTERN_BODY__HEADER = eINSTANCE.getPatternBody_Header();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PATTERN_BODY__LOCAL_VARIABLES = eINSTANCE.getPatternBody_LocalVariables();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PATTERN_BODY__CONSTANTS = eINSTANCE.getPatternBody_Constants();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PATTERN_BODY__CONSTRAINTS = eINSTANCE.getPatternBody_Constraints();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.Constraint <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.Constraint
		 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getConstraint()
		 * @generated
		 */
		public static final EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONSTRAINT__PARAMETERS = eINSTANCE.getConstraint_Parameters();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.ConstraintVariable <em>Constraint Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.ConstraintVariable
		 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getConstraintVariable()
		 * @generated
		 */
		public static final EClass CONSTRAINT_VARIABLE = eINSTANCE.getConstraintVariable();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.Variable <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.Variable
		 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getVariable()
		 * @generated
		 */
		public static final EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.Constant <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.Constant
		 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getConstant()
		 * @generated
		 */
		public static final EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.PatternInvocationConstraint <em>Pattern Invocation Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.PatternInvocationConstraint
		 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getPatternInvocationConstraint()
		 * @generated
		 */
		public static final EClass PATTERN_INVOCATION_CONSTRAINT = eINSTANCE.getPatternInvocationConstraint();

		/**
		 * The meta object literal for the '<em><b>Positive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute PATTERN_INVOCATION_CONSTRAINT__POSITIVE = eINSTANCE.getPatternInvocationConstraint_Positive();

		/**
		 * The meta object literal for the '<em><b>Invoked Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference PATTERN_INVOCATION_CONSTRAINT__INVOKED_PATTERN = eINSTANCE.getPatternInvocationConstraint_InvokedPattern();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.ConstraintParameter <em>Constraint Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.ConstraintParameter
		 * @see org.gervarro.democles.specification.emf.SpecificationPackage#getConstraintParameter()
		 * @generated
		 */
		public static final EClass CONSTRAINT_PARAMETER = eINSTANCE.getConstraintParameter();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference CONSTRAINT_PARAMETER__REFERENCE = eINSTANCE.getConstraintParameter_Reference();

	}

} //SpecificationPackage
