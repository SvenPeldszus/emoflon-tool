package org.moflon.gt.mosl.codeadapter.utils;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.moflon.gt.mosl.moslgt.AttributeAssignment;
import org.moflon.gt.mosl.moslgt.AttributeConstraint;
import org.moflon.gt.mosl.moslgt.LinkVariablePattern;
import org.moflon.gt.mosl.moslgt.NACGroup;
import org.moflon.gt.mosl.moslgt.ObjectVariablePattern;
import org.moflon.gt.mosl.moslgt.PatternDef;
import org.moflon.gt.mosl.moslgt.PatternObject;
import org.moflon.gt.mosl.moslgt.PatternParameter;

public class PatternUtil
{
   public static ObjectVariablePattern getCorrespondingOV(PatternParameter pp, PatternDef patternDef)
   {
      List<ObjectVariablePattern> allNonParameterObjectVariablesOfPatternDef = MOSLUtil.mapToSubtype(patternDef.getVariables(), ObjectVariablePattern.class);
      allNonParameterObjectVariablesOfPatternDef.addAll(getAllNonUsedNacObjectVariables(allNonParameterObjectVariablesOfPatternDef, patternDef));
      Optional<ObjectVariablePattern> optOV = allNonParameterObjectVariablesOfPatternDef.stream().filter(ov -> ov.getName().compareTo(pp.getOv().getName()) == 0).findAny();
      if (optOV.isPresent())
         return optOV.get();
      else
         return pp.getOv();
   }
   
   private static List<ObjectVariablePattern> getAllNonUsedNacObjectVariables(List<ObjectVariablePattern> allNonParameterObjectVariablesOfPatternDef, PatternDef patternDef){
      Set<String> ovNames = allNonParameterObjectVariablesOfPatternDef.stream().map(ov -> ov.getName()).collect(Collectors.toSet());
      List<NACGroup> nacGroups = MOSLUtil.mapToSubtype(patternDef.getVariables(), NACGroup.class);
      List<ObjectVariablePattern> nacObjectVariablesDefinitions = nacGroups.stream().flatMap(nacGroup -> nacGroup.getObjects().stream()).collect(Collectors.toList());
      return nacObjectVariablesDefinitions.stream().filter(ov -> !ovNames.contains(ov.getName())).collect(Collectors.toList());      
   }

   public static ObjectVariablePattern getCorrespondingOV(ObjectVariablePattern ov)
   {
      EObject container = ov.eContainer();
      if(container instanceof PatternParameter)
         return getCorrespondingOV(PatternParameter.class.cast(container), PatternDef.class.cast(container.eContainer()));
      return ov;
   }
   
   public static Collection<PatternObject> collectObjects(Collection<PatternObject> collect, Collection<ObjectVariablePattern> objectVariables){
      return collectObjects(collect, objectVariables, PatternUtil::alwaysTrue, PatternUtil::getDefaultFromObjectVariable,
            PatternUtil::getDefaultFromObjectVariable, PatternUtil::getDefaultFromObjectVariable);
   }
   
   public static Collection<PatternObject> collectObjects(Collection<PatternObject> collect, Collection<ObjectVariablePattern> objectVariables, 
         Predicate<? super ObjectVariablePattern> objectVariableFilter, Function<ObjectVariablePattern, Predicate<? super LinkVariablePattern>> linkVariableFilterFun,
         Function<ObjectVariablePattern, Predicate<? super AttributeAssignment>> assignmentFilterFun, 
         Function<ObjectVariablePattern, Predicate<? super AttributeConstraint>> constraintFilterFun){
      collect.addAll(objectVariables.stream().filter(objectVariableFilter).collect(Collectors.toList()));
      objectVariables.forEach(objectVariable -> collectInnerObjects(collect, objectVariable, linkVariableFilterFun.apply(objectVariable), 
            assignmentFilterFun.apply(objectVariable), constraintFilterFun.apply(objectVariable)));
      return collect;
   }
   
   private static void collectInnerObjects(Collection<PatternObject> collect, ObjectVariablePattern objectVariable, Predicate<? super LinkVariablePattern> linkVariableFilter,
         Predicate<? super AttributeAssignment> assignmentFilter, Predicate<? super AttributeConstraint> constraintFilter){
      collect.addAll(objectVariable.getLinkVariablePatterns().stream().filter(linkVariableFilter).collect(Collectors.toList()));
      collect.addAll(objectVariable.getAttributeAssignments().stream().filter(assignmentFilter).map(as -> as.getValueExp()).collect(Collectors.toSet()));
      collect.addAll(objectVariable.getAttributeConstraints().stream().filter(constraintFilter).map(as -> as.getValueExp()).collect(Collectors.toSet()));
   }
   
   private static boolean alwaysTrue(Object obj){
      return true;
   }
   
   private static Predicate<Object> getDefaultFromObjectVariable(ObjectVariablePattern ov) {
      return PatternUtil::alwaysTrue;
   }
   
   public static String getNormalizedVariableName(String name)
   {
      // TODO@rkluge: Implement proper normalization (e.g., by inserting _)
      return name;
   }
}