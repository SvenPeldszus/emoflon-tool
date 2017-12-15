/*
 * generated by Xtext 2.10.0
 */
package org.moflon.gt.mosl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.moflon.gt.mosl.moslgt.EClassDef

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MOSLGTGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(EClassDef classDef : resource.allContents.filter(typeof(EClassDef)).toIterable){
			classDef.className = classDef.name.name;
		}
	}
}