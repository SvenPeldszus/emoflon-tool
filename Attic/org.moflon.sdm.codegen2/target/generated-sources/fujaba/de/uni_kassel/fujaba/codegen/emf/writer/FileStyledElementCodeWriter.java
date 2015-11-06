/*
 * generated by Fujaba - CodeGen2
 */
package de.uni_kassel.fujaba.codegen.emf.writer;
import java.util.Iterator;

import de.uni_kassel.fujaba.codegen.classdiag.FStyledElementCodeWriter;
import de.uni_kassel.fujaba.codegen.rules.Token;
import de.uni_paderborn.fujaba.metamodel.common.FElement;
import de.uni_paderborn.fujaba.metamodel.common.FFile;
import de.uni_paderborn.fujaba.metamodel.common.FStereotype;
import de.uni_paderborn.fujaba.metamodel.structure.FClass;
import de.upb.tools.sdm.JavaSDM; // requires Fujaba5/libs/RuntimeTools.jar in classpath
import de.upb.tools.sdm.JavaSDMException;


public class FileStyledElementCodeWriter extends FStyledElementCodeWriter
{


   public boolean checkStereotype (FElement elem )
   {
      boolean fujaba__Success = false;
      Object _TmpObject = null;
      FFile file = null;
      Iterator fujaba__IterClazzToStereotype = null;
      FStereotype stereotype = null;
      Iterator fujaba__IterFileToClazz = null;
      FClass clazz = null;

      // story pattern 
      try 
      {
         fujaba__Success = false; 

         _TmpObject = elem;

         // ensure correct type and really bound of object file
         JavaSDM.ensure ( _TmpObject instanceof FFile );
         file = (FFile) _TmpObject;

         // iterate to-many link hasClasses from file to clazz
         fujaba__Success = false;
         fujaba__IterFileToClazz = file.iteratorOfContains ();

         while ( !(fujaba__Success) && fujaba__IterFileToClazz.hasNext () )
         {
            try
            {
               clazz = (FClass) fujaba__IterFileToClazz.next ();

               // check object clazz is really bound
               JavaSDM.ensure ( clazz != null );
               // check negative bindings
               try
               {
                  fujaba__Success = false;

                  // iterate to-many link stereotypes from clazz to stereotype
                  fujaba__Success = false;
                  fujaba__IterClazzToStereotype = clazz.iteratorOfStereotypes ();

                  while ( !(fujaba__Success) && fujaba__IterClazzToStereotype.hasNext () )
                  {
                     try
                     {
                        stereotype = (FStereotype) fujaba__IterClazzToStereotype.next ();

                        // check object stereotype is really bound
                        JavaSDM.ensure ( stereotype != null );
                        // attribute condition name == FStereotype.REFERENCE
                        JavaSDM.ensure ( JavaSDM.stringCompare ((String) stereotype.getName (), FStereotype.REFERENCE) == 0 );


                        fujaba__Success = true;
                     }
                     catch ( JavaSDMException fujaba__InternalException )
                     {
                        fujaba__Success = false;
                     }
                  }
                  JavaSDM.ensure (fujaba__Success);

                  fujaba__Success = true;
               }
               catch ( JavaSDMException fujaba__InternalException )
               {
                  fujaba__Success = false;
               }

               fujaba__Success = !(fujaba__Success);

               JavaSDM.ensure ( fujaba__Success );

               // constraint super.checkStereotype (clazz)
               JavaSDM.ensure ( super.checkStereotype (clazz) );

               fujaba__Success = true;
            }
            catch ( JavaSDMException fujaba__InternalException )
            {
               fujaba__Success = false;
            }
         }
         JavaSDM.ensure (fujaba__Success);
         fujaba__Success = true;
      }
      catch ( JavaSDMException fujaba__InternalException )
      {
         fujaba__Success = false;
      }

      if ( fujaba__Success )
      {
         return true;

      }
      return false;
   }

   public String getAccessStyle (Token operation )
   {

      return this.getStereotypeText();
   }

}

