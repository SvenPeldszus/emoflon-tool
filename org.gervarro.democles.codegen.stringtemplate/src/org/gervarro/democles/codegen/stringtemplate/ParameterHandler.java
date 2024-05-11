package org.gervarro.democles.codegen.stringtemplate;

import java.util.Locale;

import org.gervarro.democles.codegen.GeneratorVariable;
import org.gervarro.democles.specification.impl.Constant;
import org.gervarro.democles.specification.impl.Variable;
import org.stringtemplate.v4.AttributeRenderer;
import org.stringtemplate.v4.Interpreter;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.misc.ObjectModelAdaptor;
import org.stringtemplate.v4.misc.STNoSuchPropertyException;

public class ParameterHandler extends ObjectModelAdaptor implements AttributeRenderer {
   public synchronized Object getProperty(Interpreter interpreter, ST template, Object object, Object property, String propertyName) throws STNoSuchPropertyException {
      if (object instanceof GeneratorVariable) {
         GeneratorVariable variable = (GeneratorVariable)object;
         if ("name".equals(propertyName)) {
            return this.getProperty(interpreter, template, variable.getSpecification(), property, propertyName);
         }

         if ("type".equals(propertyName)) {
            return this.getProperty(interpreter, template, variable.getSpecification(), property, propertyName);
         }
      } else if (object instanceof Variable) {
         Variable variable = (Variable)object;
         if ("name".equals(propertyName)) {
            return variable.getName();
         }

         if ("type".equals(propertyName)) {
            return variable.getType();
         }
      } else if (object instanceof Constant) {
         Constant constant = (Constant)object;
         if ("name".equals(propertyName)) {
            Object value = constant.getValue();
            if (value instanceof String) {
               StringBuilder builder = new StringBuilder();
               builder.append('"');
               builder.append((String)value);
               builder.append('"');
               return builder.toString();
            }

            return value.toString();
         }

         if ("type".equals(propertyName)) {
            return constant.getValue().getClass().getName();
         }
      }

      return super.getProperty(interpreter, template, object, property, propertyName);
   }

   public String toString(Object o, String formatString, Locale locale) {
      if (o instanceof GeneratorVariable) {
         return this.toString(((GeneratorVariable)o).getSpecification(), formatString, locale);
      } else if (o instanceof Variable) {
         return this.toString(((Variable)o).getName(), formatString, locale);
      } else if (o instanceof Constant) {
         Object value = ((Constant)o).getValue();
         String result = this.toString(value.toString(), formatString, locale);
         if (value instanceof String) {
            StringBuilder builder = new StringBuilder();
            builder.append('"');
            builder.append(result);
            builder.append('"');
            return builder.toString();
         } else {
            return result;
         }
      } else {
         return null;
      }
   }
}
