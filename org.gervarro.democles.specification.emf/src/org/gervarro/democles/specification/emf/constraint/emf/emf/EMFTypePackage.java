/**
 */
package org.gervarro.democles.specification.emf.constraint.emf.emf;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
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
 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypeFactory
 * @model kind="package"
 * @generated
 */
public class EMFTypePackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "emf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://gervarro.org/democles/constraint/emf.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "emf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EMFTypePackage eINSTANCE = org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage.init();

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable <em>EMF Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getEMFVariable()
	 * @generated
	 */
	public static final int EMF_VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMF_VARIABLE__NAME = SpecificationPackage.VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>EClassifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMF_VARIABLE__ECLASSIFIER = SpecificationPackage.VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMF_VARIABLE_FEATURE_COUNT = SpecificationPackage.VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.EMFConstraint <em>EMF Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFConstraint
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getEMFConstraint()
	 * @generated
	 */
	public static final int EMF_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMF_CONSTRAINT__PARAMETERS = SpecificationPackage.CONSTRAINT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMF_CONSTRAINT__EMODEL_ELEMENT = SpecificationPackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EMF Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int EMF_CONSTRAINT_FEATURE_COUNT = SpecificationPackage.CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.StructuralFeature <em>Structural Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.StructuralFeature
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getStructuralFeature()
	 * @generated
	 */
	public static final int STRUCTURAL_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURAL_FEATURE__PARAMETERS = EMF_CONSTRAINT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURAL_FEATURE__EMODEL_ELEMENT = EMF_CONSTRAINT__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Structural Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURAL_FEATURE_FEATURE_COUNT = EMF_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getAttribute()
	 * @generated
	 */
	public static final int ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE__PARAMETERS = STRUCTURAL_FEATURE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE__EMODEL_ELEMENT = STRUCTURAL_FEATURE__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ATTRIBUTE_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.Reference <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.Reference
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getReference()
	 * @generated
	 */
	public static final int REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE__PARAMETERS = STRUCTURAL_FEATURE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE__EMODEL_ELEMENT = STRUCTURAL_FEATURE__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_FEATURE_COUNT = STRUCTURAL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.Operation <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.Operation
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getOperation()
	 * @generated
	 */
	public static final int OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION__PARAMETERS = EMF_CONSTRAINT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>EModel Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION__EMODEL_ELEMENT = EMF_CONSTRAINT__EMODEL_ELEMENT;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_FEATURE_COUNT = EMF_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.InstanceOf <em>Instance Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.InstanceOf
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getInstanceOf()
	 * @generated
	 */
	public static final int INSTANCE_OF = 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_OF__PARAMETERS = SpecificationPackage.CONSTRAINT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Instance Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_OF_FEATURE_COUNT = SpecificationPackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.ResourceContents <em>Resource Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.ResourceContents
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getResourceContents()
	 * @generated
	 */
	public static final int RESOURCE_CONTENTS = 7;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_CONTENTS__PARAMETERS = SpecificationPackage.CONSTRAINT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Resource Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_CONTENTS_FEATURE_COUNT = SpecificationPackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.ResourceSetResources <em>Resource Set Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.ResourceSetResources
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getResourceSetResources()
	 * @generated
	 */
	public static final int RESOURCE_SET_RESOURCES = 8;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_SET_RESOURCES__PARAMETERS = SpecificationPackage.CONSTRAINT__PARAMETERS;

	/**
	 * The number of structural features of the '<em>Resource Set Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_SET_RESOURCES_FEATURE_COUNT = SpecificationPackage.CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceContentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceSetResourcesEClass = null;

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
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EMFTypePackage() {
		super(eNS_URI, EMFTypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EMFTypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EMFTypePackage init() {
		if (isInited) return (EMFTypePackage)EPackage.Registry.INSTANCE.getEPackage(EMFTypePackage.eNS_URI);

		// Obtain or create and register package
		EMFTypePackage theEMFTypePackage = (EMFTypePackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFTypePackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFTypePackage());

		isInited = true;

		// Initialize simple dependencies
		SpecificationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEMFTypePackage.createPackageContents();

		// Initialize created meta-data
		theEMFTypePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFTypePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFTypePackage.eNS_URI, theEMFTypePackage);
		return theEMFTypePackage;
	}


	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable <em>EMF Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Variable</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable
	 * @generated
	 */
	public EClass getEMFVariable() {
		return emfVariableEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable#getEClassifier <em>EClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClassifier</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable#getEClassifier()
	 * @see #getEMFVariable()
	 * @generated
	 */
	public EReference getEMFVariable_EClassifier() {
		return (EReference)emfVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.EMFConstraint <em>EMF Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMF Constraint</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFConstraint
	 * @generated
	 */
	public EClass getEMFConstraint() {
		return emfConstraintEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.EMFConstraint#getEModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EModel Element</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFConstraint#getEModelElement()
	 * @see #getEMFConstraint()
	 * @generated
	 */
	public EReference getEMFConstraint_EModelElement() {
		return (EReference)emfConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structural Feature</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.StructuralFeature
	 * @generated
	 */
	public EClass getStructuralFeature() {
		return structuralFeatureEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.Reference
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.Operation
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.InstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Of</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.InstanceOf
	 * @generated
	 */
	public EClass getInstanceOf() {
		return instanceOfEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.ResourceContents <em>Resource Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Contents</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.ResourceContents
	 * @generated
	 */
	public EClass getResourceContents() {
		return resourceContentsEClass;
	}


	/**
	 * Returns the meta object for class '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.ResourceSetResources <em>Resource Set Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Set Resources</em>'.
	 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.ResourceSetResources
	 * @generated
	 */
	public EClass getResourceSetResources() {
		return resourceSetResourcesEClass;
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public EMFTypeFactory getEMFTypeFactory() {
		return (EMFTypeFactory)getEFactoryInstance();
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
		emfVariableEClass = createEClass(EMF_VARIABLE);
		createEReference(emfVariableEClass, EMF_VARIABLE__ECLASSIFIER);

		emfConstraintEClass = createEClass(EMF_CONSTRAINT);
		createEReference(emfConstraintEClass, EMF_CONSTRAINT__EMODEL_ELEMENT);

		structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);

		attributeEClass = createEClass(ATTRIBUTE);

		referenceEClass = createEClass(REFERENCE);

		operationEClass = createEClass(OPERATION);

		instanceOfEClass = createEClass(INSTANCE_OF);

		resourceContentsEClass = createEClass(RESOURCE_CONTENTS);

		resourceSetResourcesEClass = createEClass(RESOURCE_SET_RESOURCES);
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
		ETypeParameter emfConstraintEClass_E = addETypeParameter(emfConstraintEClass, "E");
		ETypeParameter structuralFeatureEClass_E = addETypeParameter(structuralFeatureEClass, "E");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(ecorePackage.getETypedElement());
		emfConstraintEClass_E.getEBounds().add(g1);
		g1 = createEGenericType(ecorePackage.getEStructuralFeature());
		structuralFeatureEClass_E.getEBounds().add(g1);

		// Add supertypes to classes
		emfVariableEClass.getESuperTypes().add(theSpecificationPackage.getVariable());
		emfConstraintEClass.getESuperTypes().add(theSpecificationPackage.getConstraint());
		g1 = createEGenericType(this.getEMFConstraint());
		EGenericType g2 = createEGenericType(structuralFeatureEClass_E);
		g1.getETypeArguments().add(g2);
		structuralFeatureEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStructuralFeature());
		g2 = createEGenericType(ecorePackage.getEAttribute());
		g1.getETypeArguments().add(g2);
		attributeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStructuralFeature());
		g2 = createEGenericType(ecorePackage.getEReference());
		g1.getETypeArguments().add(g2);
		referenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getEMFConstraint());
		g2 = createEGenericType(ecorePackage.getEOperation());
		g1.getETypeArguments().add(g2);
		operationEClass.getEGenericSuperTypes().add(g1);
		instanceOfEClass.getESuperTypes().add(theSpecificationPackage.getConstraint());
		resourceContentsEClass.getESuperTypes().add(theSpecificationPackage.getConstraint());
		resourceSetResourcesEClass.getESuperTypes().add(theSpecificationPackage.getConstraint());

		// Initialize classes and features; add operations and parameters
		initEClass(emfVariableEClass, EMFVariable.class, "EMFVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEMFVariable_EClassifier(), ecorePackage.getEClassifier(), null, "eClassifier", null, 1, 1, EMFVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emfConstraintEClass, EMFConstraint.class, "EMFConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(emfConstraintEClass_E);
		initEReference(getEMFConstraint_EModelElement(), g1, null, "eModelElement", null, 1, 1, EMFConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instanceOfEClass, InstanceOf.class, "InstanceOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceContentsEClass, ResourceContents.class, "ResourceContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceSetResourcesEClass, ResourceSetResources.class, "ResourceSetResources", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable <em>EMF Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFVariable
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getEMFVariable()
		 * @generated
		 */
		public static final EClass EMF_VARIABLE = eINSTANCE.getEMFVariable();

		/**
		 * The meta object literal for the '<em><b>EClassifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EMF_VARIABLE__ECLASSIFIER = eINSTANCE.getEMFVariable_EClassifier();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.EMFConstraint <em>EMF Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFConstraint
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getEMFConstraint()
		 * @generated
		 */
		public static final EClass EMF_CONSTRAINT = eINSTANCE.getEMFConstraint();

		/**
		 * The meta object literal for the '<em><b>EModel Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference EMF_CONSTRAINT__EMODEL_ELEMENT = eINSTANCE.getEMFConstraint_EModelElement();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.StructuralFeature <em>Structural Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.StructuralFeature
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getStructuralFeature()
		 * @generated
		 */
		public static final EClass STRUCTURAL_FEATURE = eINSTANCE.getStructuralFeature();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.Attribute
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getAttribute()
		 * @generated
		 */
		public static final EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.Reference <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.Reference
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getReference()
		 * @generated
		 */
		public static final EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.Operation <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.Operation
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getOperation()
		 * @generated
		 */
		public static final EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.InstanceOf <em>Instance Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.InstanceOf
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getInstanceOf()
		 * @generated
		 */
		public static final EClass INSTANCE_OF = eINSTANCE.getInstanceOf();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.ResourceContents <em>Resource Contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.ResourceContents
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getResourceContents()
		 * @generated
		 */
		public static final EClass RESOURCE_CONTENTS = eINSTANCE.getResourceContents();

		/**
		 * The meta object literal for the '{@link org.gervarro.democles.specification.emf.constraint.emf.emf.ResourceSetResources <em>Resource Set Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.ResourceSetResources
		 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage#getResourceSetResources()
		 * @generated
		 */
		public static final EClass RESOURCE_SET_RESOURCES = eINSTANCE.getResourceSetResources();

	}

} //EMFTypePackage
