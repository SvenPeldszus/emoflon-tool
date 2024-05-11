package org.gervarro.democles.codegen.stringtemplate;

import org.gervarro.democles.codegen.ImportManager;
import org.stringtemplate.v4.Interpreter;
import org.stringtemplate.v4.ModelAdaptor;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.misc.STNoSuchPropertyException;

public final class ImportHandler implements ModelAdaptor {
   public final Object getProperty(Interpreter interp, ST self, Object o, Object property, String propertyName) throws STNoSuchPropertyException {
      if (o instanceof FullyQualifiedName) {
         FullyQualifiedName fqn = (FullyQualifiedName)o;
         return new FullyQualifiedName(fqn, propertyName);
      } else {
         return o instanceof ImportManager ? new FullyQualifiedName((ImportManager)o, propertyName) : null;
      }
   }
}
