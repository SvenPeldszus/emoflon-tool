package org.gervarro.democles.codegen.stringtemplate.emf;

import java.util.Locale;

import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.gervarro.democles.codegen.emf.EcoreToGenModelConverter;
import org.gervarro.democles.constraint.emf.EMFVariable;
import org.stringtemplate.v4.AttributeRenderer;
import org.stringtemplate.v4.Interpreter;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.misc.ObjectModelAdaptor;
import org.stringtemplate.v4.misc.STNoSuchPropertyException;

public class EcoreModelAdaptor extends ObjectModelAdaptor implements AttributeRenderer {
   private final EcoreToGenModelConverter converter;

   public EcoreModelAdaptor(EcoreToGenModelConverter converter) {
      this.converter = converter;
   }

   public synchronized Object getProperty(Interpreter interpreter, ST template, Object object, Object property, String propertyName) throws STNoSuchPropertyException {
      if (object instanceof EClassifier && "defaultValue".equals(propertyName)) {
         return object instanceof EDataType ? ((EDataType)object).getDefaultValue() : "null";
      } else {
         if (object instanceof EModelElement && "genModelElement".equals(propertyName)) {
            GenBase result = this.converter.getGenModelElement((EModelElement)object);
            if (result != null) {
               return result;
            }
         }

         if (object instanceof EMFVariable) {
            Class<?> instanceClass = ((EMFVariable)object).getLinkedElement().getInstanceClass();
            if ("primitive".equals(propertyName)) {
               return instanceClass != null ? instanceClass.isPrimitive() : false;
            }

            if ("wrapperClass".equals(propertyName)) {
               return ClassUtils.primitiveToWrapper(instanceClass);
            }
         }

         return super.getProperty(interpreter, template, object, property, propertyName);
      }
   }

   public String toString(Object object, String formatString, Locale locale) {
      if (object instanceof EMFVariable) {
         return this.converter.toString(((EMFVariable)object).getLinkedElement());
      } else if (object instanceof EClassifier) {
         return this.converter.toString(this.converter.getGenModelElement((EClassifier)object));
      } else {
         return object instanceof GenClassifier ? this.converter.toString((GenClassifier)object) : null;
      }
   }
}
