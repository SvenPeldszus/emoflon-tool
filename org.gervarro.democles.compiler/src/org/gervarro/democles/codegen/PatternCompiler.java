/*
 * Democles, Declarative Model Query Framework for Monitoring Heterogeneous Embedded Systems
 * Copyright (C) 2010-2012  Gergely Varro
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  
 * Contributors:
 * 		Gergely Varro <gervarro@cs.bme.hu> - initial API and implementation and/or initial documentation
 */
package org.gervarro.democles.codegen;

import java.util.LinkedList;
import java.util.List;

import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.compiler.CompilerPattern;
import org.gervarro.democles.compiler.CompilerPatternBody;
import org.gervarro.democles.compiler.CompilerPatternBuilder;

public class PatternCompiler<T extends TemplateEngine> {
	private final T engine; 
	private final OperationSequenceCompiler operationCompiler; 
	
	public PatternCompiler(final T engine,
			final OperationSequenceCompiler operationCompiler) {
		this.engine = engine;
		this.operationCompiler = operationCompiler;
	}
	
	protected final MainTemplateController getPatternDataFrameGenerator(CompilerPattern pattern) throws Exception {
		final String packageName = pattern.getBuilder().getPackageName();
		final String className = pattern.getDataFrameName();
		final DefaultImportManager importManager =
				new DefaultImportManager(packageName, className);
		
		TemplateInvocation template = new TemplateInvocation("CompiledPattern/PatternDataFrameClass",
				new String[] { "engine", "import", "package", "pattern" },
				new Object[] { engine, importManager, packageName, pattern });
		return new MainTemplateController(engine, importManager, template, packageName, className);
	}
	
	protected final MainTemplateController getSimplePatternGenerator(CompilerPattern pattern, Adornment... adornments) throws Exception {
		final String packageName = pattern.getBuilder().getPackageName();
		final String className = pattern.getClassName();
		final DefaultImportManager importManager =
				new DefaultImportManager(packageName, className);
		
		final CompilerPatternBody body = pattern.getBodies().get(0);
		final CompilerPatternBuilder module = body.getHeader().getBuilder();
		
		Chain<TemplateController> matchSingleSuccess =
				new Chain<TemplateController>(new TemplateController("CompiledPattern/SuccessfulSingleMatching"));
		
		Chain<TemplateController> matchAllSuccess =
				new Chain<TemplateController>(new TemplateController("CompiledPattern/SuccessfulAllMatching"));
		
		List<TemplateInvocation> methods = 
			new LinkedList<TemplateInvocation>();
		for (Adornment adornment : adornments) {
			final Chain<GeneratorOperation> reverseSearchPlan =
				module.generateReverseSearchPlan(body.getOperations(),
						body.calculateAdornment(adornment));
			methods.add(preparePatternMatchingMethodGenerator(importManager, pattern, adornment, body, "CompiledPattern/MatchSingleMethod", reverseSearchPlan, matchSingleSuccess));
			methods.add(preparePatternMatchingMethodGenerator(importManager, pattern, adornment, body, "CompiledPattern/MatchAllMethod", reverseSearchPlan, matchAllSuccess));
		}
		
		TemplateInvocation template = new TemplateInvocation("CompiledPattern/SimplePatternClass",
				new String[] { "engine", "import", "package", "pattern", "adornments", "methods" },
				new Object[] { engine, importManager, packageName, pattern, adornments, methods });
		return new MainTemplateController(engine, importManager, template, packageName, className);
	}
	
	protected final MainTemplateController getRegularPatternGenerator(CompilerPattern pattern, Adornment... adornments) throws Exception {
		final String packageName = pattern.getBuilder().getPackageName();
		final String className = pattern.getClassName();
		final DefaultImportManager importManager =
				new DefaultImportManager(packageName, className);
		
		TemplateInvocation template = new TemplateInvocation("CompiledPattern/RegularPatternClass",
				new String[] { "engine", "import", "package", "pattern", "adornments" },
				new Object[] { engine, importManager, packageName, pattern, adornments });
		return new MainTemplateController(engine, importManager, template, packageName, className);
	}
	
	protected final MainTemplateController getAbstractPatternBodyGenerator(CompilerPattern pattern, Adornment... adornments) throws Exception {
		final String packageName = pattern.getBuilder().getPackageName();
		final String className = pattern.getBodyName();
		final DefaultImportManager importManager =
				new DefaultImportManager(packageName, className);
		
		TemplateInvocation template = new TemplateInvocation("CompiledPattern/AbstractPatternBodyClass", 
				new String[] { "engine", "import", "package", "pattern", "adornments" },
				new Object[] { engine, importManager, packageName, pattern, adornments });
		return new MainTemplateController(engine, importManager, template, packageName, className);
	}
	
	protected final MainTemplateController getPatternBodyDataFrameGenerator(CompilerPatternBody body) throws Exception {
		final String packageName = body.getHeader().getBuilder().getPackageName();
		final String className = body.getDataFrameName();
		final DefaultImportManager importManager =
				new DefaultImportManager(packageName, className);
		
		TemplateInvocation template = new TemplateInvocation("CompiledPattern/PatternBodyDataFrameClass",
					new String[] { "engine", "import", "package", "body" },
					new Object[] { engine, importManager, packageName, body });
		return new MainTemplateController(engine, importManager, template, packageName, className);
	}
	
	protected final MainTemplateController getPatternBodyGenerator(CompilerPatternBody body, Adornment... adornments) throws Exception {
		final CompilerPatternBuilder module = body.getHeader().getBuilder();
		final String packageName = module.getPackageName();
		final String className = body.getClassName();
		final DefaultImportManager importManager =
				new DefaultImportManager(packageName, className);
		
		Chain<TemplateController> matchSingleSuccess =
				new Chain<TemplateController>(new TemplateController("CompiledPattern/SuccessfulSingleMatching"));

		Chain<TemplateController> matchAllSuccess =
				new Chain<TemplateController>(new TemplateController("CompiledPattern/SuccessfulAllMatching"));
		
		List<TemplateInvocation> methods = 
			new LinkedList<TemplateInvocation>();
		for (Adornment adornment : adornments) {
			Chain<GeneratorOperation> reverseSearchPlan =
				module.generateReverseSearchPlan(body.getOperations(), body.calculateAdornment(adornment));
			methods.add(preparePatternMatchingMethodGenerator(importManager, body.getHeader(), adornment, body, "CompiledPattern/MatchSingleMethod", reverseSearchPlan, matchSingleSuccess));
			methods.add(preparePatternMatchingMethodGenerator(importManager, body.getHeader(), adornment, body, "CompiledPattern/MatchAllMethod", reverseSearchPlan, matchAllSuccess));
		}
		
		TemplateInvocation template = new TemplateInvocation("CompiledPattern/PatternBodyClass",
				new String[] { "engine", "import", "package", "body", "adornments", "methods" },
				new Object[] { engine, importManager, packageName, body, adornments, methods });
		return new MainTemplateController(engine, importManager, template, packageName, className);
	}
	
	public final TemplateInvocation preparePatternMatchingMethodGenerator(
			ImportManager importManager,
			CompilerPattern pattern,
			Adornment adornment,
			CompilerPatternBody body,
			String methodTemplate,
			Chain<GeneratorOperation> operationChain,
			Chain<TemplateController> tail) throws Exception {
		tail = operationCompiler.buildOperationChain(operationChain, tail);
		return new TemplateInvocation(methodTemplate,
				// engine import body chain
				new String[] { "engine", "import", "pattern", "adornment", "body", "chain" },
				new Object[] { engine, importManager, pattern, adornment, body, tail });
	}
	
	public final List<Generator> createGenerators(CompilerPattern pattern, Adornment... adornments) throws Exception {
		List<Generator> result =
			new LinkedList<Generator>();
		// File preparation and code generation
		int numberOfBodies = pattern.getBodies().size();
		result.add(getPatternDataFrameGenerator(pattern));
		if (numberOfBodies == 1) {
			result.add(getSimplePatternGenerator(pattern, adornments));
			CompilerPatternBody body = pattern.getBodies().get(0);
			if (body.getLocalVariables().size() > 0) {
				result.add(getPatternBodyDataFrameGenerator(body));
			}
		} else if (numberOfBodies > 1) {
			result.add(getAbstractPatternBodyGenerator(pattern, adornments));
			result.add(getRegularPatternGenerator(pattern, adornments));
			for (CompilerPatternBody body : pattern.getBodies()) {
				if (body.getLocalVariables().size() > 0) {
					result.add(getPatternBodyDataFrameGenerator(body));
				}
				result.add(getPatternBodyGenerator(body, adornments));
			}
		}
		return result;
		// Code formatting
		//		String source = writer.toString();
		//		IDocument document = new Document(source);
		//		Map<String, Object> compilerOptions = new HashMap<String, Object>();
		//		compilerOptions.put("org.eclipse.jdt.core.compiler.source", "1.5");
		//		CodeFormatter formatter = ToolFactory.createCodeFormatter(compilerOptions);
		//		TextEdit textEdit = formatter.format(CodeFormatter.K_COMPILATION_UNIT, source, 0, source.length(), 0, null);
		//		textEdit.apply(document);
		//		FileWriter fileWriter = new FileWriter(sourceCodeFile);
		//		fileWriter.write(document.get());
		//		fileWriter.flush();
		//		fileWriter.close();

		// Code compilation
		//		File binDir = new File(projectDir, "bin");
		//		if (BatchCompiler.compile("\"" + packageDir.toString() + "\" -d \"" + binDir.toString() + "\" -1.5", new PrintWriter(System.out), new PrintWriter(System.err), null)) {
		//			Class<?> clazz = getClass().getClassLoader().loadClass(packageName + "." + className);
		//			Object o = clazz.newInstance();
		//			
		//		}
	}
}
