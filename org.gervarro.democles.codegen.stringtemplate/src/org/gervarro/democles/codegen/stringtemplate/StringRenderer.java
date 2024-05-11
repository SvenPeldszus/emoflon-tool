package org.gervarro.democles.codegen.stringtemplate;

import java.util.Locale;

import org.stringtemplate.v4.AttributeRenderer;

public class StringRenderer implements AttributeRenderer {
   public String toString(Object o, String formatString, Locale locale) {
      return renderString((String)o, formatString, locale);
   }

   public static final String renderString(String string, String formatString, Locale locale) {
      if ("lowercase".equals(formatString)) {
         return string.substring(0, 1).toLowerCase() + string.substring(1);
      } else {
         return "uppercase".equals(formatString) ? string.substring(0, 1).toUpperCase() + string.substring(1) : string;
      }
   }
}
