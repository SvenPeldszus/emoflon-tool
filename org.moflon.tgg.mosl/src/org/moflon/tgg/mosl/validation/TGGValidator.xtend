/*
 * generated by Xtext
 */
package org.moflon.tgg.mosl.validation

import org.moflon.tgg.mosl.tgg.Adornment
import org.moflon.tgg.mosl.tgg.TggPackage
import org.eclipse.xtext.validation.Check
import org.moflon.tgg.mosl.tgg.AttributeVariable
import org.eclipse.emf.common.util.BasicEList
import org.moflon.tgg.mosl.tgg.ObjectVariablePattern
import org.moflon.tgg.mosl.tgg.Rule
import java.util.HashSet
import java.util.Set
import java.util.Collection
import java.util.List
import java.util.ArrayList

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class TGGValidator extends AbstractTGGValidator {

  public static val INVALID_ADORNMENT = 'invalidAdornmentValue'
  public static val INVALID_ATTRIBUTE_VARIABLE = 'invalidAttributeVariableAttribute'
  public static val NOT_UNIQUE_OBJECT_VARIABLE_NAME = 'notUniqueObjectVariableName'
  public static val TYPE_IS_ABSTRACT = 'typeIsAbstract'
  public static val RULE_REFINEMENT_CREATES_A_CYCLE = 'RuleRefinementCreatesACycle'

	@Check
	def checkAdornmentValue(Adornment adornment){
		for (character : adornment.value.toCharArray) {
			if(character.compareTo('B')!=0 && character.compareTo('F')!=0){
				error("Adornment value may only contain capital letters B or F", TggPackage.Literals.ADORNMENT__VALUE, org.moflon.tgg.mosl.validation.TGGValidator.INVALID_ADORNMENT);
			}
		}
	}
	
	@Check
	def checkAttributeVariable(AttributeVariable attrVar){
		var attrNames = new BasicEList()
		for (attr : attrVar.objectVar.type.EAllAttributes) {
			attrNames.add(attr.name)
		}
		if (!attrNames.contains(attrVar.attribute)) {
			error("EClass " + attrVar.objectVar.type.name + " does not contain EAttribute " + attrVar.attribute + ".", TggPackage.Literals.ATTRIBUTE_VARIABLE__ATTRIBUTE, org.moflon.tgg.mosl.validation.TGGValidator.INVALID_ATTRIBUTE_VARIABLE);
		}
	}

	def boolean checkObjectVariableNamesAreUniqueInPattern(Set<String> ovNames, Collection<ObjectVariablePattern> objectVariables){
		for(ov : objectVariables){
			if(ovNames.contains(ov.name)){
				return false;
			}
			else{
				ovNames.add(ov.name);
			}
		}
		return true;	
	}

	def boolean checkObjectVariableNamesAreUniqueWithSuperTypes(Rule rule, Set<String> ovNames){
		var isUnique = checkObjectVariableNamesAreUniqueInPattern(ovNames,rule.sourcePatterns)&&
		checkObjectVariableNamesAreUniqueInPattern(ovNames,rule.targetPatterns);
		return isUnique;
	}
	
	@Check
	def checkObjectVariableNamesAreUnique(ObjectVariablePattern objectVariablePattern){
		var container = objectVariablePattern.eContainer;
		if(container instanceof Rule && !checkObjectVariableNamesAreUniqueWithSuperTypes(container as Rule, new HashSet<String>())){
			error("Object Variables must be unique. Object Variable '" + objectVariablePattern.name + "' already exist", TggPackage.Literals.VARIABLE_PATTERN__NAME, org.moflon.tgg.mosl.validation.TGGValidator.NOT_UNIQUE_OBJECT_VARIABLE_NAME);
		}
	}
	
	@Check
	def checkIfTheTryingToGenerateObjectVariableIsAbstract(ObjectVariablePattern objectVariablePattern){
		val type = objectVariablePattern.type
		val eContainer = objectVariablePattern.eContainer;		
		if(eContainer instanceof Rule){
		  var rule = eContainer as Rule;
		  var operator = objectVariablePattern.op;
		  var ruleIsAbstract = rule.abstractRule;
		  var typeIsAbstract = type.abstract;
		  var isGeneration = operator != null && operator.value != null && operator.value.equalsIgnoreCase("++ ");
		  var isAnError = !ruleIsAbstract && typeIsAbstract && isGeneration;
		  if(isAnError){
		  	error("The type of the Object Variable '" + objectVariablePattern.name + "' is abstract or the Rule '" + Rule.name + "' is not abstract", TggPackage.Literals.OBJECT_VARIABLE_PATTERN__TYPE, org.moflon.tgg.mosl.validation.TGGValidator.TYPE_IS_ABSTRACT);
		  }
		  
		}		
	} 
	
	def boolean findCycleInRule(Rule rule, List<Rule> visited){
		if(visited.contains(rule)){
			return true;
		}else {
			visited.add(rule);
			for(superType : rule.supertypes){
				if (findCycleInRule(superType, visited)){
					return true;
				}
				else{
					visited.remove(superType);	
				}
			}			
			return false;
		}
	}
	
	@Check
	def checkForCycleRefinments(Rule rule){
		var foundSuperTypes = new ArrayList<Rule>();
		if(findCycleInRule(rule, foundSuperTypes)){
			var refinementName = "<Placeholder>";
			if(foundSuperTypes.size() >= 2)
				refinementName = foundSuperTypes.get(1).name;
			error("The Rule '" + rule.name + "' creates a Cycle with the Refinement '" + refinementName +"'", TggPackage.Literals.RULE__SUPERTYPES, org.moflon.tgg.mosl.validation.TGGValidator.RULE_REFINEMENT_CREATES_A_CYCLE);
		}
	}
}
