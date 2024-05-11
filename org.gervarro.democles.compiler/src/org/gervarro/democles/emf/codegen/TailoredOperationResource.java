/*
 * Democles, Declarative Model Query Framework for Monitoring Heterogeneous Embedded Systems
 * Copyright (C) 2010  Gergely Varro
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.democles.emf.codegen;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreSwitch;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.codegen.GeneratorVariable;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.common.runtime.OperationBuilder;
import org.gervarro.democles.constraint.emf.EMFConstraint;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.gervarro.democles.constraint.emf.Reference;
import org.gervarro.democles.constraint.emf.StructuralFeature;
import org.gervarro.democles.specification.impl.Constraint;
import org.gervarro.democles.specification.impl.Variable;

@Deprecated
public class TailoredOperationResource implements AdapterFactory, OperationBuilder<GeneratorOperation,GeneratorVariable> {
	private final GenModel genModel;

	private final EcoreSwitch<Adapter> modelSwitch = new EcoreSwitch<Adapter>() {

		public Adapter caseEStructuralFeature(EStructuralFeature eStructuralFeature) {
			GenClass genClassifier = (GenClass) genModel.findGenClassifier(eStructuralFeature.getEContainingClass());
			for (GenFeature genFeature : genClassifier.getGenFeatures()) {
				if (genFeature.getEcoreFeature() == eStructuralFeature) {
					GenFeatureAdapter result = new GenFeatureAdapter();
					result.factory = TailoredOperationResource.this;
					result.setGenElement(genFeature);
					return result;
				}
			}
			System.out.println("Warning: Unsuccessful GenFeatureAdapter creation for " + eStructuralFeature.getName());
			return null;
		}

		public Adapter caseEClass(EClass eClass) {
			GenClassifier genClassifier = genModel.findGenClassifier(eClass);
			if (genClassifier != null && genClassifier instanceof GenClass) {
				GenClassAdapter result = new GenClassAdapter();
				result.factory = TailoredOperationResource.this;
				result.setGenElement((GenClass) genClassifier);
				return result;
			}
			System.out.println("Warning: Unsuccessful GenClassAdapter creation for " + eClass.getName());
			return null;
		}
		
		public Adapter caseEDataType(EDataType eDataType) {
			GenClassifier genClassifier = genModel.findGenClassifier(eDataType);
			if (genClassifier != null && genClassifier instanceof GenDataType) {
				GenDataTypeAdapter result = new GenDataTypeAdapter();
				result.factory = TailoredOperationResource.this;
				result.setGenElement((GenDataType) genClassifier);
				return result;
			}
			System.out.println("Warning: Unsuccessful GenDataTypeAdapter creation for " + eDataType.getName());
			return null;
		}

		public Adapter caseEPackage(EPackage ePackage) {
			GenPackage genPackage = genModel.findGenPackage(ePackage);
			if (genPackage != null) {
				GenPackageAdapter result = new GenPackageAdapter();
				result.factory = TailoredOperationResource.this;
				result.setGenElement(genPackage);
				return result;
			}
			System.out.println("Warning: Unsuccessful GenPackageAdapter creation for " + ePackage.getName());
			return null;
		}
	};
	
	public TailoredOperationResource(GenModel genModel) {
		genModel.reconcile();
		this.genModel = genModel;
		for (GenPackage genPackage : genModel.getGenPackages()) {
			EPackage ePackage = genPackage.getEcorePackage();
			adapt(ePackage, GenPackageAdapter.class);
			
			for (GenEnum genEnum : genPackage.getGenEnums()) {
				EEnum eEnum = genEnum.getEcoreEnum();
				adapt(eEnum, GenDataTypeAdapter.class);
			}
			
			for (GenDataType genDataType : genPackage.getGenDataTypes()) {
				EDataType eDataType = genDataType.getEcoreDataType();
				adapt(eDataType, GenDataTypeAdapter.class);
			}
			
			for (GenClass genClass : genPackage.getGenClasses()) {
				EClass eClass = genClass.getEcoreClass();
				adapt(eClass, GenClassAdapter.class);
				for (GenFeature genFeature : genClass.getGenFeatures()) {
					if (genFeature.isGet() && (!genClass.isExternalInterface() && (!genModel.isSuppressInterfaces() || genClass.isInterface()) || !genFeature.isSuppressedGetVisibility())) {
						EStructuralFeature eStructuralFeature = genFeature.getEcoreFeature();
						adapt(eStructuralFeature, GenFeatureAdapter.class);
//						if (genFeature.isBidirectional()) {
//							EReference ref = (EReference) genFeature.getEcoreFeature();
//							EcoreUtil.getRegisteredAdapter(ref.getEOpposite(), EMFPackage.Literals.STRUCTURAL_FEATURE_CONSTRAINT);
//						}
					}
				}
			}
		}

	}

	// OperationBuilder methods
	public final GeneratorOperation getVariableOperation(Variable variable, GeneratorVariable runtimeVariable) {
		if (variable.getType() instanceof EMFVariable) {
			EClassifier eClassifier = ((EMFVariable) variable.getType()).getLinkedElement();
			if (eClassifier instanceof EClass) {
				GenClassAdapter type = (GenClassAdapter) adapt(eClassifier, GenClassAdapter.class);
				return new GeneratorOperation(variable,
						Collections.singletonList(runtimeVariable),
						Adornment.create(Adornment.NOT_TYPECHECKED),
						Adornment.create(Adornment.BOUND),
						type);
			} else if (eClassifier instanceof EDataType) {
				GenDataTypeAdapter type = (GenDataTypeAdapter) adapt(eClassifier, GenDataTypeAdapter.class);
				return new GeneratorOperation(variable,
						Collections.singletonList(runtimeVariable),
						Adornment.create(Adornment.NOT_TYPECHECKED),
						Adornment.create(Adornment.BOUND),
						type);
			}
		}
		return null;
	}
	
	private final EClass lookupEClass(GeneratorVariable runtimeVariable) {
		Variable variable = (Variable) runtimeVariable.getSpecification();
		EMFVariable emfVariable = (EMFVariable) variable.getType();
		return (EClass) emfVariable.getLinkedElement();
	}

	public final List<GeneratorOperation> getConstraintOperations(Constraint constraint, List<GeneratorVariable> parameters) {
		if (constraint.getType() instanceof EMFConstraint<?>) {
			List<GeneratorOperation> result = new LinkedList<GeneratorOperation>();
			EMFConstraint<?> cType = (EMFConstraint<?>) constraint.getType();
			if (cType instanceof Reference && ((Reference) cType).isBidirectional()) {
				EReference eReference = ((Reference) cType).getLinkedElement();
				GenFeatureAdapter forwardType = (GenFeatureAdapter) adapt(eReference, GenFeatureAdapter.class);
				result.add(new GeneratorOperation(constraint, parameters,
						Adornment.create(Adornment.BOUND, Adornment.BOUND),
						Adornment.create(Adornment.BOUND, Adornment.BOUND),
						forwardType));
				final boolean isTargetTypeCheckNeeded = !lookupEClass(parameters.get(1)).isSuperTypeOf((EClass) eReference.getEType());
				result.add(new GeneratorOperation(constraint, parameters,
						Adornment.create(Adornment.BOUND, Adornment.FREE),
						Adornment.create(Adornment.BOUND, isTargetTypeCheckNeeded ? Adornment.NOT_TYPECHECKED : Adornment.BOUND),
						forwardType));
				final boolean isSourceTypeCheckNeeded = !lookupEClass(parameters.get(0)).isSuperTypeOf(eReference.getEContainingClass());
				result.add(new GeneratorOperation(constraint, parameters,
						Adornment.create(Adornment.FREE, Adornment.BOUND),
						Adornment.create(isSourceTypeCheckNeeded ? Adornment.NOT_TYPECHECKED : Adornment.BOUND, Adornment.BOUND),
						forwardType));
				return result;
			} else if (cType instanceof StructuralFeature<?>) {
				EStructuralFeature eStructuralFeature = ((StructuralFeature<?>) cType).getLinkedElement();
				GenFeatureAdapter forwardType = (GenFeatureAdapter) adapt(eStructuralFeature, GenFeatureAdapter.class);
				result.add(new GeneratorOperation(constraint, parameters,
						Adornment.create(Adornment.BOUND, Adornment.BOUND),
						Adornment.create(Adornment.BOUND, Adornment.BOUND),
						forwardType));
				final boolean isTargetTypeCheckNeeded = eStructuralFeature instanceof EReference && 
					!lookupEClass(parameters.get(1)).isSuperTypeOf((EClass) eStructuralFeature.getEType());
				result.add(new GeneratorOperation(constraint, parameters,
						Adornment.create(Adornment.BOUND, Adornment.FREE),
						Adornment.create(Adornment.BOUND, isTargetTypeCheckNeeded ? Adornment.NOT_TYPECHECKED : Adornment.BOUND),
						forwardType));
				//		} else if (constraint instanceof ClassConstraint) {
				//			EClass eClass = ((ClassConstraint) constraint).getType();
				//			GenClassAdapter classType = (GenClassAdapter) adapt(eClass, CodegenPackage.Literals.GEN_CLASS_ADAPTER);
				//			boolean includeTemplateArguments = false;
				//			final String typeName = eClass.getInstanceClassName() != null ?
				//		      includeTemplateArguments ? eClass.getInstanceTypeName() : eClass.getInstanceClassName() :
				//		      classType.getGenElement().getGenPackage().getInterfacePackageName() + "." + classType.getGenElement().getInterfaceName();
				//			result.add(new GeneratorOperation(constraint, parameters, Adornment.BOUND, typeName));
				//		} else if (constraint instanceof DataTypeConstraint) {
				//			EDataType eDataType = ((DataTypeConstraint) constraint).getType();
				//			GenDataTypeAdapter dataTypeType = (GenDataTypeAdapter) adapt(eDataType, CodegenPackage.Literals.GEN_DATA_TYPE_ADAPTER);
				//			result.add(new GeneratorOperation(constraint, parameters, Adornment.BOUND, dataTypeType.getGenElement().getQualifiedInstanceClassName()));
			}
			return result;
		}
		return null;
	}
	
	protected void unloaded(InternalEObject internalEObject) {
		internalEObject.eAdapters().clear();
	}
	
	// AdapterFactory methods
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}
	
	public boolean isFactoryForType(Object type) {
		return false;
	}

	public Object adapt(Object target, Object type) {
		if (target instanceof Notifier) {
			return adapt((Notifier)target, type);
		} else {
			return target;
		}
	}

	public Adapter adapt(Notifier target, Object type) {
		for (Adapter adapter : target.eAdapters()) {
			if (adapter.isAdapterForType(type)) {
				if (((GenModelElementAdapter<?, ?>) adapter).factory == this) {
					return adapter;
				}
			}
		}
		return adaptNew(target, type);
	}

	public Adapter adaptNew(Notifier target, Object type) {
		Adapter adapter = createAdapter(target);
		associate(adapter, target);
		return adapter;
	}

	public void adaptAllNew(Notifier target) {
		Adapter adapter = createAdapter(target);
		associate(adapter, target);
	}

	private void associate(Adapter adapter, Notifier target) {
		if (adapter != null) {
			target.eAdapters().add(adapter);
		}
	}
}