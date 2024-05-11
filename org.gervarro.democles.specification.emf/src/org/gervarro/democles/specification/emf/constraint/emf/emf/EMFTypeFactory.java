/**
 */
package org.gervarro.democles.specification.emf.constraint.emf.emf;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.gervarro.democles.specification.emf.constraint.emf.emf.EMFTypePackage
 * @generated
 */
public class EMFTypeFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EMFTypeFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMFTypeFactory init() {
		try {
			EMFTypeFactory theEMFTypeFactory = (EMFTypeFactory)EPackage.Registry.INSTANCE.getEFactory(EMFTypePackage.eNS_URI);
			if (theEMFTypeFactory != null) {
				return theEMFTypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFTypeFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFTypeFactory() {
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
			case EMFTypePackage.EMF_VARIABLE: return createEMFVariable();
			case EMFTypePackage.STRUCTURAL_FEATURE: return createStructuralFeature();
			case EMFTypePackage.ATTRIBUTE: return createAttribute();
			case EMFTypePackage.REFERENCE: return createReference();
			case EMFTypePackage.OPERATION: return createOperation();
			case EMFTypePackage.INSTANCE_OF: return createInstanceOf();
			case EMFTypePackage.RESOURCE_CONTENTS: return createResourceContents();
			case EMFTypePackage.RESOURCE_SET_RESOURCES: return createResourceSetResources();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFVariable createEMFVariable() {
		EMFVariable emfVariable = new EMFVariable();
		return emfVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <E extends EStructuralFeature> StructuralFeature<E> createStructuralFeature() {
		StructuralFeature<E> structuralFeature = new StructuralFeature<E>();
		return structuralFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		Attribute attribute = new Attribute();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		Reference reference = new Reference();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		Operation operation = new Operation();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceOf createInstanceOf() {
		InstanceOf instanceOf = new InstanceOf();
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContents createResourceContents() {
		ResourceContents resourceContents = new ResourceContents();
		return resourceContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSetResources createResourceSetResources() {
		ResourceSetResources resourceSetResources = new ResourceSetResources();
		return resourceSetResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFTypePackage getEMFTypePackage() {
		return (EMFTypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EMFTypePackage getPackage() {
		return EMFTypePackage.eINSTANCE;
	}

} //EMFTypeFactory
