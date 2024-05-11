/*
 * generated by Xtext 2.14.0
 */
package org.moflon.emf.injection.parser.antlr;

import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.moflon.emf.injection.parser.antlr.internal.InternalInjectionLanguageParser;
import org.moflon.emf.injection.services.InjectionLanguageGrammarAccess;

import com.google.inject.Inject;

public class InjectionLanguageParser extends AbstractAntlrParser {

	@Inject
	private InjectionLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalInjectionLanguageParser createParser(XtextTokenStream stream) {
		return new InternalInjectionLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "InjectionFile";
	}

	public InjectionLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(InjectionLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
