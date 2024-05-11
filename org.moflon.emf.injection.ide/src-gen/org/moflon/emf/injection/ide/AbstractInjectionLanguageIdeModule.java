/*
 * generated by Xtext 2.14.0
 */
package org.moflon.emf.injection.ide;

import org.eclipse.xtext.ide.DefaultIdeModule;
import org.eclipse.xtext.ide.LexerIdeBindings;
import org.eclipse.xtext.ide.editor.contentassist.FQNPrefixMatcher;
import org.eclipse.xtext.ide.editor.contentassist.IPrefixMatcher;
import org.eclipse.xtext.ide.editor.contentassist.IProposalConflictHelper;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AntlrProposalConflictHelper;
import org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
import org.eclipse.xtext.ide.refactoring.IRenameStrategy2;
import org.eclipse.xtext.ide.server.rename.IRenameService2;
import org.eclipse.xtext.ide.server.rename.RenameService2;
import org.moflon.emf.injection.ide.contentassist.antlr.InjectionLanguageParser;
import org.moflon.emf.injection.ide.contentassist.antlr.internal.InternalInjectionLanguageLexer;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Manual modifications go to {@link InjectionLanguageIdeModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractInjectionLanguageIdeModule extends DefaultIdeModule {

	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public void configureContentAssistLexer(final Binder binder) {
		binder.bind(Lexer.class)
		.annotatedWith(Names.named(LexerIdeBindings.CONTENT_ASSIST))
		.to(InternalInjectionLanguageLexer.class);
	}

	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return InjectionLanguageParser.class;
	}

	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IProposalConflictHelper> bindIProposalConflictHelper() {
		return AntlrProposalConflictHelper.class;
	}

	// contributed by org.eclipse.xtext.xtext.generator.exporting.QualifiedNamesFragment2
	public Class<? extends IPrefixMatcher> bindIPrefixMatcher() {
		return FQNPrefixMatcher.class;
	}

	// contributed by org.eclipse.xtext.xtext.generator.ui.refactoring.RefactorElementNameFragment2
	public Class<? extends IRenameService2> bindIRenameService() {
		return RenameService2.class;
	}

	// contributed by org.eclipse.xtext.xtext.generator.ui.refactoring.RefactorElementNameFragment2
	public Class<? extends IRenameStrategy2> bindIRenameStrategy2() {
		return IRenameStrategy2.DefaultImpl.class;
	}

}
