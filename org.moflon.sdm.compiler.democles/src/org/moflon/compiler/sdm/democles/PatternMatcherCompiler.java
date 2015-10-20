package org.moflon.compiler.sdm.democles;

import org.gervarro.democles.codegen.Chain;
import org.gervarro.democles.codegen.GeneratorOperation;
import org.gervarro.democles.common.Adornment;
import org.gervarro.democles.compiler.CompilerPattern;
import org.gervarro.democles.compiler.CompilerPatternBody;
import org.gervarro.democles.compiler.CompilerPatternBuilder;
import org.gervarro.democles.specification.emf.EMFPatternBuilder;
import org.gervarro.democles.specification.emf.Pattern;
import org.gervarro.democles.specification.impl.DefaultPattern;
import org.gervarro.democles.specification.impl.DefaultPatternBody;

import ScopeValidation.impl.PatternMatcherImpl;
import ValidationResult.ErrorMessage;
import ValidationResult.Severity;
import ValidationResult.ValidationReport;
import ValidationResult.ValidationResultFactory;

public class PatternMatcherCompiler extends PatternMatcherImpl {
	final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> patternBuilder;
	final CompilerPatternBuilder compilablePatternBuilder;

	public PatternMatcherCompiler(final EMFPatternBuilder<DefaultPattern, DefaultPatternBody> patternBuilder,
			final CompilerPatternBuilder compilerPatternBuilder) {
		this.patternBuilder = patternBuilder;
		this.compilablePatternBuilder = compilerPatternBuilder;
	}

	@Override
   public ValidationReport generateSearchPlan(final Pattern pattern, final Adornment adornment, final boolean isMultipleMatch) {
		ValidationReport report = ValidationResultFactory.eINSTANCE.createValidationReport();
		try {
			generateSearchPlan(compilePattern(pattern, adornment), adornment);
		} catch (RuntimeException e) {
			ErrorMessage error = ValidationResultFactory.eINSTANCE.createErrorMessage();
			report.getErrorMessages().add(error);
         error.setId("No search plan found for pattern"); 
			error.setSeverity(Severity.ERROR);
		}
		return report;
	}
	
	protected CompilerPattern compilePattern(final Pattern pattern, final Adornment adornment) {
		org.gervarro.democles.specification.impl.DefaultPattern patternRuntime = 
				patternBuilder.build(pattern);
		return compilablePatternBuilder.build(patternRuntime);
	}
	
	static Chain<GeneratorOperation> generateSearchPlan(final CompilerPattern pattern, final Adornment adornment) {
		CompilerPatternBody body = pattern.getBodies().get(0);
		return generateSearchPlan(body, adornment);
	}
	
	static Chain<GeneratorOperation> generateSearchPlan(final CompilerPatternBody body, final Adornment adornment) {
		return body.getHeader().getBuilder().generateReverseSearchPlan(body.getOperations(), body.calculateAdornment(adornment));
	}
}
