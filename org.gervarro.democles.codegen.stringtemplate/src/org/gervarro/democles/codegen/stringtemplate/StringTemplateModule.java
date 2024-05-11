package org.gervarro.democles.codegen.stringtemplate;

import java.util.Iterator;
import java.util.Map.Entry;

import org.gervarro.democles.codegen.TemplateInvocation;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;

public final class StringTemplateModule {
   public static final STGroup createSession() {
      return new STGroup();
   }

   public static final void loadModule(STGroup group, String prefix, String url) {
      group.loadGroupFile(prefix, url);
   }

   public static final String apply(STGroup group, TemplateInvocation template) {
      ST st = group.getInstanceOf(template.getTemplateName());
      Iterator var4 = template.getAttributes().entrySet().iterator();

      while(var4.hasNext()) {
         Entry<String, Object> entry = (Entry)var4.next();
         st.add((String)entry.getKey(), entry.getValue());
      }

      return st.render();
   }
}
