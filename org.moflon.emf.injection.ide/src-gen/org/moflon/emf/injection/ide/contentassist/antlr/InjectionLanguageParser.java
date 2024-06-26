/*
 * generated by Xtext 2.14.0
 */
package org.moflon.emf.injection.ide.contentassist.antlr;

import java.util.Map;

import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.moflon.emf.injection.ide.contentassist.antlr.internal.InternalInjectionLanguageParser;
import org.moflon.emf.injection.services.InjectionLanguageGrammarAccess;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

public class InjectionLanguageParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(InjectionLanguageGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, InjectionLanguageGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getInjectionFileAccess().getImportsAlternatives_0_0(), "rule__InjectionFile__ImportsAlternatives_0_0");
			builder.put(grammarAccess.getInjectionFileAccess().getGroup(), "rule__InjectionFile__Group__0");
			builder.put(grammarAccess.getRegularImportAccess().getGroup(), "rule__RegularImport__Group__0");
			builder.put(grammarAccess.getStaticImportAccess().getGroup(), "rule__StaticImport__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getClassDeclarationAccess().getGroup(), "rule__ClassDeclaration__Group__0");
			builder.put(grammarAccess.getJavaAnnotationAccess().getGroup(), "rule__JavaAnnotation__Group__0");
			builder.put(grammarAccess.getClassInjectionDeclarationAccess().getGroup(), "rule__ClassInjectionDeclaration__Group__0");
			builder.put(grammarAccess.getMethodDeclarationAccess().getGroup(), "rule__MethodDeclaration__Group__0");
			builder.put(grammarAccess.getMethodDeclarationAccess().getGroup_4(), "rule__MethodDeclaration__Group_4__0");
			builder.put(grammarAccess.getParameterDeclarationAccess().getGroup(), "rule__ParameterDeclaration__Group__0");
			builder.put(grammarAccess.getInjectionFileAccess().getImportsAssignment_0(), "rule__InjectionFile__ImportsAssignment_0");
			builder.put(grammarAccess.getInjectionFileAccess().getClassDeclarationAssignment_1(), "rule__InjectionFile__ClassDeclarationAssignment_1");
			builder.put(grammarAccess.getRegularImportAccess().getNamespaceAssignment_1(), "rule__RegularImport__NamespaceAssignment_1");
			builder.put(grammarAccess.getStaticImportAccess().getNamespaceAssignment_2(), "rule__StaticImport__NamespaceAssignment_2");
			builder.put(grammarAccess.getClassDeclarationAccess().getAnnotationsAssignment_0(), "rule__ClassDeclaration__AnnotationsAssignment_0");
			builder.put(grammarAccess.getClassDeclarationAccess().getClassNameAssignment_3(), "rule__ClassDeclaration__ClassNameAssignment_3");
			builder.put(grammarAccess.getClassDeclarationAccess().getClassInjectionDeclarationAssignment_5(), "rule__ClassDeclaration__ClassInjectionDeclarationAssignment_5");
			builder.put(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsAssignment_6(), "rule__ClassDeclaration__MethodDeclarationsAssignment_6");
			builder.put(grammarAccess.getJavaAnnotationAccess().getNameAssignment_1(), "rule__JavaAnnotation__NameAssignment_1");
			builder.put(grammarAccess.getJavaAnnotationAccess().getParameterAssignment_3(), "rule__JavaAnnotation__ParameterAssignment_3");
			builder.put(grammarAccess.getClassInjectionDeclarationAccess().getBodyAssignment_1(), "rule__ClassInjectionDeclaration__BodyAssignment_1");
			builder.put(grammarAccess.getMethodDeclarationAccess().getMethodNameAssignment_1(), "rule__MethodDeclaration__MethodNameAssignment_1");
			builder.put(grammarAccess.getMethodDeclarationAccess().getParametersAssignment_3(), "rule__MethodDeclaration__ParametersAssignment_3");
			builder.put(grammarAccess.getMethodDeclarationAccess().getParametersAssignment_4_1(), "rule__MethodDeclaration__ParametersAssignment_4_1");
			builder.put(grammarAccess.getMethodDeclarationAccess().getBodyAssignment_6(), "rule__MethodDeclaration__BodyAssignment_6");
			builder.put(grammarAccess.getParameterDeclarationAccess().getParameterTypeAssignment_0(), "rule__ParameterDeclaration__ParameterTypeAssignment_0");
			builder.put(grammarAccess.getParameterDeclarationAccess().getParameterNameAssignment_1(), "rule__ParameterDeclaration__ParameterNameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private InjectionLanguageGrammarAccess grammarAccess;

	@Override
	protected InternalInjectionLanguageParser createParser() {
		InternalInjectionLanguageParser result = new InternalInjectionLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public InjectionLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(InjectionLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
