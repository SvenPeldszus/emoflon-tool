package org.gervarro.democles.codegen.stringtemplate.emf;

import java.util.HashMap;
import java.util.Map;

public class ClassUtils {
   private static final Map<Class<?>, Class<?>> primitiveWrapperMap = new HashMap();

   static {
      primitiveWrapperMap.put(Boolean.TYPE, Boolean.class);
      primitiveWrapperMap.put(Byte.TYPE, Byte.class);
      primitiveWrapperMap.put(Character.TYPE, Character.class);
      primitiveWrapperMap.put(Short.TYPE, Short.class);
      primitiveWrapperMap.put(Integer.TYPE, Integer.class);
      primitiveWrapperMap.put(Long.TYPE, Long.class);
      primitiveWrapperMap.put(Double.TYPE, Double.class);
      primitiveWrapperMap.put(Float.TYPE, Float.class);
      primitiveWrapperMap.put(Void.TYPE, Void.TYPE);
   }

   public static final Class<?> primitiveToWrapper(Class<?> cls) {
      Class<?> convertedClass = cls;
      if (cls != null && cls.isPrimitive()) {
         convertedClass = (Class)primitiveWrapperMap.get(cls);
      }

      return convertedClass;
   }
}
