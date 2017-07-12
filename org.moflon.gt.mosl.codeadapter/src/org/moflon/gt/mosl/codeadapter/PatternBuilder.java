package org.moflon.gt.mosl.codeadapter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.emf.PatternBody;
import org.gervarro.democles.specification.emf.SpecificationFactory;
import org.moflon.gt.mosl.codeadapter.transformplanrules.TransformPlanRule;
import org.moflon.gt.mosl.codeadapter.utils.PatternKind;
import org.moflon.gt.mosl.moslgt.EClassDef;
import org.moflon.gt.mosl.moslgt.LinkVariablePattern;
import org.moflon.gt.mosl.moslgt.MethodParameter;
import org.moflon.gt.mosl.moslgt.ObjectVariableDefinition;
import org.moflon.gt.mosl.moslgt.Operator;
import org.moflon.gt.mosl.moslgt.PatternDef;
import org.moflon.gt.mosl.moslgt.PatternObject;
import org.moflon.sdm.runtime.democles.CFNode;
import org.moflon.sdm.runtime.democles.CFVariable;
import org.moflon.sdm.runtime.democles.DemoclesFactory;
import org.moflon.sdm.runtime.democles.NodeDeletion;
import org.moflon.sdm.runtime.democles.PatternInvocation;
import org.moflon.sdm.runtime.democles.VariableReference;

public class PatternBuilder
{
   private static PatternBuilder instance;

   private final List<PatternKind> patternKindProcessingOrder = Arrays.asList(PatternKind.BLACK, PatternKind.RED, PatternKind.GREEN);

   private Map<String, Map<PatternKind, List<PatternObject>>> patternNameToPatternObjectsByPatternKind;

   private Map<PatternKind, TransformPlanRule> transformationPlanRuleCache;

   private Map<String, SortedMap<PatternKind, PatternInvocation>> patternInvocationCache;

   private Map<String, List<String>> nodeDeletionNameCache;

   private Map<PatternInvocation, PatternKind> patternTypes;

   private PatternBuilder()
   {
      patternNameToPatternObjectsByPatternKind = new HashMap<>();
      patternInvocationCache = new HashMap<>();
      transformationPlanRuleCache = new HashMap<>();
      patternTypes = new HashMap<>();
      nodeDeletionNameCache = new HashMap<>();
   }

   public static PatternBuilder getInstance()
   {
      if (instance == null)
         instance = new PatternBuilder();
      return instance;
   }

   public void addTransformPlanRule(PatternKind patternKind, TransformPlanRule transformPlanRule)
   {
      transformationPlanRuleCache.put(patternKind, transformPlanRule);
   }

   public void createPattern(PatternDef patternDef, Map<String, Boolean> bindings, Map<String, CFVariable> env, PatternNameGenerator patternNameGenerator)
   {
      final String patternName = patternDef.getName();

      validateTransformationRules();

      createTransformPlan(patternDef, bindings, env);

      final Map<PatternKind, List<PatternObject>> patternObjectsByKind = patternNameToPatternObjectsByPatternKind.getOrDefault(patternName, new HashMap<>());

      final List<PatternKind> patternKindsInTransformatinoPlan = extractUsedPatternKinds(patternObjectsByKind.keySet());

      final SortedMap<PatternKind, PatternInvocation> patternKindToInvocation = new TreeMap<>(new PatternKindProcessingOrderComparator());
      patternInvocationCache.put(patternName, patternKindToInvocation);
      patternKindsInTransformatinoPlan.stream().forEach(patternKind -> patternKindToInvocation.put(patternKind,
            createPatternInvocation(patternKind, patternObjectsByKind.get(patternKind), patternName, bindings, env,  patternNameGenerator)));
   }

   public SortedMap<PatternKind, PatternInvocation> getPatternInvocations(final String patternName)
   {
      return patternInvocationCache.get(patternName);
   }

   public boolean isConstructorPattern(CFNode cfNode, CFVariable cfVar, PatternInvocation currentInvocation, List<MethodParameter> methodParameters,
         String patternName)
   {
      if ("this".equals(cfVar.getName()))
         return false;

      if (isMethodParameter(cfVar, methodParameters))
         return false;

      final PatternInvocation blackInvocation = getInvocationIfVarExists(PatternKind.BLACK, cfNode, cfVar);
      if (blackInvocation != null && isCFVarCorrectKind(PatternKind.BLACK, cfVar, patternName))
         return blackInvocation.equals(currentInvocation);

      final PatternInvocation greenInvocation = getInvocationIfVarExists(PatternKind.GREEN, cfNode, cfVar);
      if (greenInvocation != null && isCFVarCorrectKind(PatternKind.GREEN, cfVar, patternName))
         return greenInvocation.equals(currentInvocation);

      return false;
   }

   private boolean isMethodParameter(final CFVariable cfVariable, final List<MethodParameter> methodParameters)
   {
      return methodParameters.stream().anyMatch(mp -> mp.getName().equals(cfVariable.getName()));
   }

   public NodeDeletion getNodeDeletion(String patternName, List<CFVariable> cfVars)
   {
      final List<String> nameList = nodeDeletionNameCache.get(patternName);
      if (nameList == null)
      {
         return null;
      } else
      {
         final NodeDeletion nodeDeletion = DemoclesFactory.eINSTANCE.createNodeDeletion();
         nodeDeletion.getDestructedVariables().addAll(cfVars.stream().filter(cfVar -> nameList.contains(cfVar.getName())).collect(Collectors.toList()));
         return nodeDeletion;
      }
   }

   /**
    * A view of {@link #patternKindProcessingOrder} that contains only {@link PatternKind}s contained in 'patternKindsToKeep' 
    */
   private List<PatternKind> extractUsedPatternKinds(final Set<PatternKind> patternKindsToKeep)
   {
      return patternKindProcessingOrder.stream().filter(pk -> patternKindsToKeep.contains(pk)).collect(Collectors.toList());
   }

   /**
    * Throws an {@link IllegalStateException} iff the {@link #transformationPlanRuleCache} does not contain a transformation rule for each of the pattern kinds returned by {@link #getPatternKindProcessingOrder} 
    */
   private void validateTransformationRules()
   {
      List<PatternKind> patternKindsWithMissingRule = this.getPatternKindProcessingOrder().stream()
            .filter(patternKind -> !this.transformationPlanRuleCache.containsKey(patternKind)).collect(Collectors.toList());
      if (!patternKindsWithMissingRule.isEmpty())
      {
         final String formattedPatternKindList = patternKindsWithMissingRule.stream().map(Object::toString).collect(Collectors.joining(", "));
         throw new IllegalStateException(
               String.format("No transformation rules have been registered for the following pattern kinds: [%s]", formattedPatternKindList));
      }
   }

   /**
    * Creates a search plan
    * @param patternDef the pattern definition from XText
    * @param bindings the information which ControlFlowVariable is bound
    * @param env the environment where the ControlVariables are available
    */
   private void createTransformPlan(PatternDef patternDef, Map<String, Boolean> bindings, Map<String, CFVariable> env)
   {
      final String patternName = patternDef.getName();
      for (final PatternKind patternKind : this.getPatternKindProcessingOrder())
      {
         final TransformPlanRule transformationRule = transformationPlanRuleCache.get(patternKind);
         if (transformationRule.isTransformable(patternKind, patternDef, bindings, env))
         {
            final List<PatternObject> patternObjectIndex = transformationRule.getPatterObjectIndex();
            final Map<PatternKind, List<PatternObject>> patternKindIndex = patternNameToPatternObjectsByPatternKind.containsKey(patternName)
                  ? patternNameToPatternObjectsByPatternKind.get(patternName) : new HashMap<>();
            patternKindIndex.put(patternKind, patternObjectIndex);
            patternNameToPatternObjectsByPatternKind.put(patternName, patternKindIndex);
         }
      }
      createNodeDeletion(patternName, patternDef);
   }

   private void createNodeDeletion(String patternName, PatternDef patternDef)
   {
      if (patternNameToPatternObjectsByPatternKind.containsKey(patternName) && patternNameToPatternObjectsByPatternKind.get(patternName).containsKey(PatternKind.RED))
      {
         final List<PatternObject> redObjects = patternNameToPatternObjectsByPatternKind.get(patternName).get(PatternKind.RED);
         final List<String> deletions = redObjects.stream()
               .filter(po -> po instanceof ObjectVariableDefinition && ObjectVariableDefinition.class.cast(po).getOp() != null
                     && ObjectVariableDefinition.class.cast(po).getOp().getValue().equals("--"))
               .map(po -> ObjectVariableDefinition.class.cast(po).getName()).collect(Collectors.toList());
         if (!deletions.isEmpty())
            nodeDeletionNameCache.put(patternName, deletions);
      }
   }

   /**
    * Transform a Pattern using a found search plan
    * @param patternKind the PatternKind which will be registered
    * @param patternObjectIndex Plan the search plan
    * @param patternName which the patternName without the suffix
    * @param bindings the information which ControlFlowVariable is bound
    * @param env the environment where the ControlVariables are available
    * @param patternNameGenerator 
    * @param patternNameGenerator generates a pattern name to save using a suffix
    * @return A patternInvocation where the belonged pattern is registered
    */
   private PatternInvocation createPatternInvocation(PatternKind patternKind, List<PatternObject> patternObjectIndex, String patternName,
         Map<String, Boolean> bindings, Map<String, CFVariable> env, PatternNameGenerator patternNameGenerator)
   {
      // creating Pattern hull
      Pattern pattern = SpecificationFactory.eINSTANCE.createPattern();
      PatternBody patternBody = SpecificationFactory.eINSTANCE.createPatternBody();
      patternBody.setHeader(pattern);
      PatternInvocation invocation = createNewPatternInvocation(patternName, pattern);
      patternTypes.put(invocation, patternKind);

      // handle ObjectVariables
      patternObjectIndex.stream().filter(po -> po instanceof ObjectVariableDefinition).map(po -> ObjectVariableDefinition.class.cast(po))
            .forEach(ov -> VariableTransformator.getInstance().transformObjectVariable(pattern, ov, env, invocation));

      // handle LinkVariables
      VariableTransformator.getInstance().transformPatternObjects(patternObjectIndex.stream().filter(po -> po instanceof LinkVariablePattern)
            .map(po -> LinkVariablePattern.class.cast(po)).collect(Collectors.toList()), bindings, patternBody, patternKind);

      //special case for black pattern
      if (patternKind == PatternKind.BLACK)
         VariableTransformator.getInstance().addUnequals(pattern, patternBody);

      //register Pattern
      patternNameGenerator.setSuffix(patternKind.getSuffix());
      pattern.setName(patternNameGenerator.generateName());
      EClass eClass = EClassDef.class.cast(StatementBuilder.getInstance().getCurrentMethod().eContainer()).getName();
      CodeadapterTrafo.getInstance().saveAsRegisteredAdapter(pattern, CodeadapterTrafo.getInstance().getTypeContext(eClass), patternKind.getSuffix());

      //return value
      return invocation;
   }

   /**
    * Creates a new PatternInvocation
    * @param readAblePatternName which the patternName without the suffix
    * @param pattern the generated Pattern
    * @return a new PatternInvocation
    */
   private PatternInvocation createNewPatternInvocation(String readAblePatternName, Pattern pattern)
   {
      final PatternInvocation invocation = DemoclesFactory.eINSTANCE.createRegularPatternInvocation();
      invocation.setPattern(pattern);
      return invocation;
   }

   private boolean isCFVarCorrectKind(PatternKind patternKind, CFVariable cfVar, String patternName)
   {
      List<ObjectVariableDefinition> objectVariables = patternNameToPatternObjectsByPatternKind.get(patternName).get(patternKind).stream().filter(po -> po instanceof ObjectVariableDefinition)
            .map(po -> ObjectVariableDefinition.class.cast(po)).filter(ov -> ov.getName().equals(cfVar.getName())).collect(Collectors.toList());

      Optional<ObjectVariableDefinition> option = objectVariables.stream().filter(objectVariable -> isCorrectType(objectVariable.getOp(), patternKind)).findFirst();
      return option.isPresent();
   }

   private boolean isCorrectType(Operator op, PatternKind pk)
   {
      if (pk == PatternKind.GREEN && op != null && op.getValue() != null && op.getValue().equals("++"))
         return true;
      else if (pk == PatternKind.BLACK && !(op != null && op.getValue() != null && !op.getValue().equals("")))
         return true;
      else
         return false;
   }

   private PatternInvocation getInvocationIfVarExists(PatternKind patternKind, CFNode cfNode, CFVariable cfVariable)
   {
      final List<PatternInvocation> invocationsOfKind = cfNode.getActions().stream().filter(action -> action instanceof PatternInvocation)
            .map(action -> PatternInvocation.class.cast(action)).filter(pi -> isCorrectPatternInvocation(pi, patternKind)).collect(Collectors.toList());
      
      if (!invocationsOfKind.isEmpty())
      {
         final PatternInvocation invocation = invocationsOfKind.get(0);
         final Optional<VariableReference> varRefMonad = invocation.getParameters().stream().filter(parameter -> parameter.getFrom().equals(cfVariable)).findFirst();
         if (varRefMonad.isPresent())
            return invocation;
         else
            return null;
      }
      
      return null;
   }

   private boolean isCorrectPatternInvocation(PatternInvocation invocation, PatternKind patternKind)
   {
      PatternKind otherPK = patternTypes.get(invocation);
      return otherPK != null && otherPK.equals(patternKind);
   }

   /**
    * The returned list specifies the order of creating Democles patterns
    * @return
    */
   private List<PatternKind> getPatternKindProcessingOrder()
   {
      return this.patternKindProcessingOrder;
   }

   /**
    * This comparator reflects the order of the outer class's {@link PatternBuilder#getPatternKindProcessingOrder()}
    * 
    * @author Roland Kluge - Initial implementation
    */
   public class PatternKindProcessingOrderComparator implements Comparator<PatternKind>
   {
      /**
       * compare(firstKind, secondKind) < 0 if firstKind appears earlier in the pattern kind order than secondKind 
       */
      @Override
      public int compare(final PatternKind firstKind, final PatternKind secondKind)
      {
         final int indexOfFirstKind = getPatternKindProcessingOrder().indexOf(firstKind);
         final int indexOfSecondKind = getPatternKindProcessingOrder().indexOf(secondKind);
         return indexOfFirstKind - indexOfSecondKind;
      }
   }
}
