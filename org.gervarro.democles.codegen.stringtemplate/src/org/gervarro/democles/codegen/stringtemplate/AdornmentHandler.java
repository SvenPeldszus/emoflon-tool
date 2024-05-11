package org.gervarro.democles.codegen.stringtemplate;

import org.stringtemplate.v4.Interpreter;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.misc.ObjectModelAdaptor;
import org.stringtemplate.v4.misc.STNoSuchPropertyException;

public final class AdornmentHandler extends ObjectModelAdaptor {
   public final Object getProperty(Interpreter interp, ST self, Object o, Object property, String propertyName) throws STNoSuchPropertyException {
      Integer value = (Integer)o;
      if ("isBound".equals(propertyName)) {
         return value == 0 ? true : false;
      } else if ("isNotTypeChecked".equals(propertyName)) {
         return value == 1 ? true : false;
      } else if ("isFree".equals(propertyName)) {
         return value == 2 ? true : false;
      } else {
         return super.getProperty(interp, self, o, property, propertyName);
      }
   }
}
