package org.gervarro.democles.codegen.stringtemplate;

import org.gervarro.democles.codegen.ImportManager;

public final class FullyQualifiedName {
   private final ImportManager importManager;
   private final String fqn;

   FullyQualifiedName(FullyQualifiedName origin, String postfix) {
      this.importManager = origin.importManager;
      this.fqn = origin.fqn + '.' + postfix;
   }

   FullyQualifiedName(ImportManager importManager, String fqn) {
      this.importManager = importManager;
      this.fqn = fqn;
   }

   public final String toString() {
      return this.importManager.getImportedName(this.fqn);
   }
}
