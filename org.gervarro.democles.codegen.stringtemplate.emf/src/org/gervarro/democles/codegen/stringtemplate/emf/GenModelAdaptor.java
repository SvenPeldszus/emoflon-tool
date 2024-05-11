package org.gervarro.democles.codegen.stringtemplate.emf;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.ecore.EClass;
import org.stringtemplate.v4.Interpreter;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.misc.ObjectModelAdaptor;
import org.stringtemplate.v4.misc.STNoSuchPropertyException;

public class GenModelAdaptor extends ObjectModelAdaptor {
   public Object getProperty(Interpreter interpreter, ST template, Object object, Object property, String propertyName) throws STNoSuchPropertyException {
      if (object instanceof GenFeature) {
         GenFeature genFeature;
         if ("returnType".equals(propertyName)) {
            genFeature = (GenFeature)object;
            if (genFeature.isListType()) {
               return genFeature.getQualifiedListItemType(genFeature.getGenClass());
            }

            return genFeature.getRawBoundType();
         }

         if ("collidingSetAccessorOperation".equals(propertyName)) {
            genFeature = (GenFeature)object;
            return genFeature.getGenClass().hasCollidingSetAccessorOperation(genFeature);
         }
      } else if (object instanceof GenClass && "typeName".equals(propertyName)) {
         GenClass genClass = (GenClass)object;
         boolean includeTemplateArguments = false;
         EClass eClass = genClass.getEcoreClass();
         return eClass.getInstanceClassName() != null ? (includeTemplateArguments ? eClass.getInstanceTypeName() : eClass.getInstanceClassName()) : genClass.getGenPackage().getInterfacePackageName() + "." + genClass.getInterfaceName();
      }

      return super.getProperty(interpreter, template, object, property, propertyName);
   }
}
