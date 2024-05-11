package org.moflon.emf.injection.ide.contentassist.antlr.internal;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.moflon.emf.injection.services.InjectionLanguageGrammarAccess;

@SuppressWarnings("all")
public class InternalInjectionLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_CODE_BLOCK", "RULE_BLOCK_BEGIN", "RULE_BLOCK_END", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'static'", "'.'", "'.*'", "'partial'", "'class'", "'{'", "'}'", "'@'", "'('", "')'", "'@members'", "'@model'", "','"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_CODE_BLOCK=6;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_BLOCK_END=8;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_BLOCK_BEGIN=7;

    // delegates
    // delegators


        public InternalInjectionLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInjectionLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInjectionLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalInjectionLanguage.g"; }


    	private InjectionLanguageGrammarAccess grammarAccess;

    	public void setGrammarAccess(InjectionLanguageGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleInjectionFile"
    // InternalInjectionLanguage.g:53:1: entryRuleInjectionFile : ruleInjectionFile EOF ;
    public final void entryRuleInjectionFile() throws RecognitionException {
        try {
            // InternalInjectionLanguage.g:54:1: ( ruleInjectionFile EOF )
            // InternalInjectionLanguage.g:55:1: ruleInjectionFile EOF
            {
             before(grammarAccess.getInjectionFileRule()); 
            pushFollow(FOLLOW_1);
            ruleInjectionFile();

            state._fsp--;

             after(grammarAccess.getInjectionFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInjectionFile"


    // $ANTLR start "ruleInjectionFile"
    // InternalInjectionLanguage.g:62:1: ruleInjectionFile : ( ( rule__InjectionFile__Group__0 ) ) ;
    public final void ruleInjectionFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:66:2: ( ( ( rule__InjectionFile__Group__0 ) ) )
            // InternalInjectionLanguage.g:67:2: ( ( rule__InjectionFile__Group__0 ) )
            {
            // InternalInjectionLanguage.g:67:2: ( ( rule__InjectionFile__Group__0 ) )
            // InternalInjectionLanguage.g:68:3: ( rule__InjectionFile__Group__0 )
            {
             before(grammarAccess.getInjectionFileAccess().getGroup()); 
            // InternalInjectionLanguage.g:69:3: ( rule__InjectionFile__Group__0 )
            // InternalInjectionLanguage.g:69:4: rule__InjectionFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InjectionFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInjectionFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInjectionFile"


    // $ANTLR start "entryRuleRegularImport"
    // InternalInjectionLanguage.g:78:1: entryRuleRegularImport : ruleRegularImport EOF ;
    public final void entryRuleRegularImport() throws RecognitionException {
        try {
            // InternalInjectionLanguage.g:79:1: ( ruleRegularImport EOF )
            // InternalInjectionLanguage.g:80:1: ruleRegularImport EOF
            {
             before(grammarAccess.getRegularImportRule()); 
            pushFollow(FOLLOW_1);
            ruleRegularImport();

            state._fsp--;

             after(grammarAccess.getRegularImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegularImport"


    // $ANTLR start "ruleRegularImport"
    // InternalInjectionLanguage.g:87:1: ruleRegularImport : ( ( rule__RegularImport__Group__0 ) ) ;
    public final void ruleRegularImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:91:2: ( ( ( rule__RegularImport__Group__0 ) ) )
            // InternalInjectionLanguage.g:92:2: ( ( rule__RegularImport__Group__0 ) )
            {
            // InternalInjectionLanguage.g:92:2: ( ( rule__RegularImport__Group__0 ) )
            // InternalInjectionLanguage.g:93:3: ( rule__RegularImport__Group__0 )
            {
             before(grammarAccess.getRegularImportAccess().getGroup()); 
            // InternalInjectionLanguage.g:94:3: ( rule__RegularImport__Group__0 )
            // InternalInjectionLanguage.g:94:4: rule__RegularImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegularImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegularImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegularImport"


    // $ANTLR start "entryRuleStaticImport"
    // InternalInjectionLanguage.g:103:1: entryRuleStaticImport : ruleStaticImport EOF ;
    public final void entryRuleStaticImport() throws RecognitionException {
        try {
            // InternalInjectionLanguage.g:104:1: ( ruleStaticImport EOF )
            // InternalInjectionLanguage.g:105:1: ruleStaticImport EOF
            {
             before(grammarAccess.getStaticImportRule()); 
            pushFollow(FOLLOW_1);
            ruleStaticImport();

            state._fsp--;

             after(grammarAccess.getStaticImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStaticImport"


    // $ANTLR start "ruleStaticImport"
    // InternalInjectionLanguage.g:112:1: ruleStaticImport : ( ( rule__StaticImport__Group__0 ) ) ;
    public final void ruleStaticImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:116:2: ( ( ( rule__StaticImport__Group__0 ) ) )
            // InternalInjectionLanguage.g:117:2: ( ( rule__StaticImport__Group__0 ) )
            {
            // InternalInjectionLanguage.g:117:2: ( ( rule__StaticImport__Group__0 ) )
            // InternalInjectionLanguage.g:118:3: ( rule__StaticImport__Group__0 )
            {
             before(grammarAccess.getStaticImportAccess().getGroup()); 
            // InternalInjectionLanguage.g:119:3: ( rule__StaticImport__Group__0 )
            // InternalInjectionLanguage.g:119:4: rule__StaticImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StaticImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStaticImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStaticImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalInjectionLanguage.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalInjectionLanguage.g:129:1: ( ruleQualifiedName EOF )
            // InternalInjectionLanguage.g:130:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalInjectionLanguage.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalInjectionLanguage.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalInjectionLanguage.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalInjectionLanguage.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalInjectionLanguage.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalInjectionLanguage.g:144:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalInjectionLanguage.g:153:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalInjectionLanguage.g:154:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalInjectionLanguage.g:155:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalInjectionLanguage.g:162:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:166:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalInjectionLanguage.g:167:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalInjectionLanguage.g:167:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalInjectionLanguage.g:168:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalInjectionLanguage.g:169:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalInjectionLanguage.g:169:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalInjectionLanguage.g:178:1: entryRuleClassDeclaration : ruleClassDeclaration EOF ;
    public final void entryRuleClassDeclaration() throws RecognitionException {
        try {
            // InternalInjectionLanguage.g:179:1: ( ruleClassDeclaration EOF )
            // InternalInjectionLanguage.g:180:1: ruleClassDeclaration EOF
            {
             before(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalInjectionLanguage.g:187:1: ruleClassDeclaration : ( ( rule__ClassDeclaration__Group__0 ) ) ;
    public final void ruleClassDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:191:2: ( ( ( rule__ClassDeclaration__Group__0 ) ) )
            // InternalInjectionLanguage.g:192:2: ( ( rule__ClassDeclaration__Group__0 ) )
            {
            // InternalInjectionLanguage.g:192:2: ( ( rule__ClassDeclaration__Group__0 ) )
            // InternalInjectionLanguage.g:193:3: ( rule__ClassDeclaration__Group__0 )
            {
             before(grammarAccess.getClassDeclarationAccess().getGroup()); 
            // InternalInjectionLanguage.g:194:3: ( rule__ClassDeclaration__Group__0 )
            // InternalInjectionLanguage.g:194:4: rule__ClassDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleJavaAnnotation"
    // InternalInjectionLanguage.g:203:1: entryRuleJavaAnnotation : ruleJavaAnnotation EOF ;
    public final void entryRuleJavaAnnotation() throws RecognitionException {
        try {
            // InternalInjectionLanguage.g:204:1: ( ruleJavaAnnotation EOF )
            // InternalInjectionLanguage.g:205:1: ruleJavaAnnotation EOF
            {
             before(grammarAccess.getJavaAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleJavaAnnotation();

            state._fsp--;

             after(grammarAccess.getJavaAnnotationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJavaAnnotation"


    // $ANTLR start "ruleJavaAnnotation"
    // InternalInjectionLanguage.g:212:1: ruleJavaAnnotation : ( ( rule__JavaAnnotation__Group__0 ) ) ;
    public final void ruleJavaAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:216:2: ( ( ( rule__JavaAnnotation__Group__0 ) ) )
            // InternalInjectionLanguage.g:217:2: ( ( rule__JavaAnnotation__Group__0 ) )
            {
            // InternalInjectionLanguage.g:217:2: ( ( rule__JavaAnnotation__Group__0 ) )
            // InternalInjectionLanguage.g:218:3: ( rule__JavaAnnotation__Group__0 )
            {
             before(grammarAccess.getJavaAnnotationAccess().getGroup()); 
            // InternalInjectionLanguage.g:219:3: ( rule__JavaAnnotation__Group__0 )
            // InternalInjectionLanguage.g:219:4: rule__JavaAnnotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JavaAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJavaAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJavaAnnotation"


    // $ANTLR start "entryRuleClassInjectionDeclaration"
    // InternalInjectionLanguage.g:228:1: entryRuleClassInjectionDeclaration : ruleClassInjectionDeclaration EOF ;
    public final void entryRuleClassInjectionDeclaration() throws RecognitionException {
        try {
            // InternalInjectionLanguage.g:229:1: ( ruleClassInjectionDeclaration EOF )
            // InternalInjectionLanguage.g:230:1: ruleClassInjectionDeclaration EOF
            {
             before(grammarAccess.getClassInjectionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleClassInjectionDeclaration();

            state._fsp--;

             after(grammarAccess.getClassInjectionDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassInjectionDeclaration"


    // $ANTLR start "ruleClassInjectionDeclaration"
    // InternalInjectionLanguage.g:237:1: ruleClassInjectionDeclaration : ( ( rule__ClassInjectionDeclaration__Group__0 ) ) ;
    public final void ruleClassInjectionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:241:2: ( ( ( rule__ClassInjectionDeclaration__Group__0 ) ) )
            // InternalInjectionLanguage.g:242:2: ( ( rule__ClassInjectionDeclaration__Group__0 ) )
            {
            // InternalInjectionLanguage.g:242:2: ( ( rule__ClassInjectionDeclaration__Group__0 ) )
            // InternalInjectionLanguage.g:243:3: ( rule__ClassInjectionDeclaration__Group__0 )
            {
             before(grammarAccess.getClassInjectionDeclarationAccess().getGroup()); 
            // InternalInjectionLanguage.g:244:3: ( rule__ClassInjectionDeclaration__Group__0 )
            // InternalInjectionLanguage.g:244:4: rule__ClassInjectionDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassInjectionDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassInjectionDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassInjectionDeclaration"


    // $ANTLR start "entryRuleMethodDeclaration"
    // InternalInjectionLanguage.g:253:1: entryRuleMethodDeclaration : ruleMethodDeclaration EOF ;
    public final void entryRuleMethodDeclaration() throws RecognitionException {
        try {
            // InternalInjectionLanguage.g:254:1: ( ruleMethodDeclaration EOF )
            // InternalInjectionLanguage.g:255:1: ruleMethodDeclaration EOF
            {
             before(grammarAccess.getMethodDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodDeclaration();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodDeclaration"


    // $ANTLR start "ruleMethodDeclaration"
    // InternalInjectionLanguage.g:262:1: ruleMethodDeclaration : ( ( rule__MethodDeclaration__Group__0 ) ) ;
    public final void ruleMethodDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:266:2: ( ( ( rule__MethodDeclaration__Group__0 ) ) )
            // InternalInjectionLanguage.g:267:2: ( ( rule__MethodDeclaration__Group__0 ) )
            {
            // InternalInjectionLanguage.g:267:2: ( ( rule__MethodDeclaration__Group__0 ) )
            // InternalInjectionLanguage.g:268:3: ( rule__MethodDeclaration__Group__0 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getGroup()); 
            // InternalInjectionLanguage.g:269:3: ( rule__MethodDeclaration__Group__0 )
            // InternalInjectionLanguage.g:269:4: rule__MethodDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodDeclaration"


    // $ANTLR start "entryRuleParameterDeclaration"
    // InternalInjectionLanguage.g:278:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // InternalInjectionLanguage.g:279:1: ( ruleParameterDeclaration EOF )
            // InternalInjectionLanguage.g:280:1: ruleParameterDeclaration EOF
            {
             before(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // InternalInjectionLanguage.g:287:1: ruleParameterDeclaration : ( ( rule__ParameterDeclaration__Group__0 ) ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:291:2: ( ( ( rule__ParameterDeclaration__Group__0 ) ) )
            // InternalInjectionLanguage.g:292:2: ( ( rule__ParameterDeclaration__Group__0 ) )
            {
            // InternalInjectionLanguage.g:292:2: ( ( rule__ParameterDeclaration__Group__0 ) )
            // InternalInjectionLanguage.g:293:3: ( rule__ParameterDeclaration__Group__0 )
            {
             before(grammarAccess.getParameterDeclarationAccess().getGroup()); 
            // InternalInjectionLanguage.g:294:3: ( rule__ParameterDeclaration__Group__0 )
            // InternalInjectionLanguage.g:294:4: rule__ParameterDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "rule__InjectionFile__ImportsAlternatives_0_0"
    // InternalInjectionLanguage.g:302:1: rule__InjectionFile__ImportsAlternatives_0_0 : ( ( ruleRegularImport ) | ( ruleStaticImport ) );
    public final void rule__InjectionFile__ImportsAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:306:1: ( ( ruleRegularImport ) | ( ruleStaticImport ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    alt1=1;
                }
                else if ( (LA1_1==16) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalInjectionLanguage.g:307:2: ( ruleRegularImport )
                    {
                    // InternalInjectionLanguage.g:307:2: ( ruleRegularImport )
                    // InternalInjectionLanguage.g:308:3: ruleRegularImport
                    {
                     before(grammarAccess.getInjectionFileAccess().getImportsRegularImportParserRuleCall_0_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRegularImport();

                    state._fsp--;

                     after(grammarAccess.getInjectionFileAccess().getImportsRegularImportParserRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalInjectionLanguage.g:313:2: ( ruleStaticImport )
                    {
                    // InternalInjectionLanguage.g:313:2: ( ruleStaticImport )
                    // InternalInjectionLanguage.g:314:3: ruleStaticImport
                    {
                     before(grammarAccess.getInjectionFileAccess().getImportsStaticImportParserRuleCall_0_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStaticImport();

                    state._fsp--;

                     after(grammarAccess.getInjectionFileAccess().getImportsStaticImportParserRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InjectionFile__ImportsAlternatives_0_0"


    // $ANTLR start "rule__InjectionFile__Group__0"
    // InternalInjectionLanguage.g:323:1: rule__InjectionFile__Group__0 : rule__InjectionFile__Group__0__Impl rule__InjectionFile__Group__1 ;
    public final void rule__InjectionFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:327:1: ( rule__InjectionFile__Group__0__Impl rule__InjectionFile__Group__1 )
            // InternalInjectionLanguage.g:328:2: rule__InjectionFile__Group__0__Impl rule__InjectionFile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InjectionFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InjectionFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InjectionFile__Group__0"


    // $ANTLR start "rule__InjectionFile__Group__0__Impl"
    // InternalInjectionLanguage.g:335:1: rule__InjectionFile__Group__0__Impl : ( ( rule__InjectionFile__ImportsAssignment_0 )* ) ;
    public final void rule__InjectionFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:339:1: ( ( ( rule__InjectionFile__ImportsAssignment_0 )* ) )
            // InternalInjectionLanguage.g:340:1: ( ( rule__InjectionFile__ImportsAssignment_0 )* )
            {
            // InternalInjectionLanguage.g:340:1: ( ( rule__InjectionFile__ImportsAssignment_0 )* )
            // InternalInjectionLanguage.g:341:2: ( rule__InjectionFile__ImportsAssignment_0 )*
            {
             before(grammarAccess.getInjectionFileAccess().getImportsAssignment_0()); 
            // InternalInjectionLanguage.g:342:2: ( rule__InjectionFile__ImportsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalInjectionLanguage.g:342:3: rule__InjectionFile__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__InjectionFile__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getInjectionFileAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InjectionFile__Group__0__Impl"


    // $ANTLR start "rule__InjectionFile__Group__1"
    // InternalInjectionLanguage.g:350:1: rule__InjectionFile__Group__1 : rule__InjectionFile__Group__1__Impl ;
    public final void rule__InjectionFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:354:1: ( rule__InjectionFile__Group__1__Impl )
            // InternalInjectionLanguage.g:355:2: rule__InjectionFile__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InjectionFile__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InjectionFile__Group__1"


    // $ANTLR start "rule__InjectionFile__Group__1__Impl"
    // InternalInjectionLanguage.g:361:1: rule__InjectionFile__Group__1__Impl : ( ( rule__InjectionFile__ClassDeclarationAssignment_1 ) ) ;
    public final void rule__InjectionFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:365:1: ( ( ( rule__InjectionFile__ClassDeclarationAssignment_1 ) ) )
            // InternalInjectionLanguage.g:366:1: ( ( rule__InjectionFile__ClassDeclarationAssignment_1 ) )
            {
            // InternalInjectionLanguage.g:366:1: ( ( rule__InjectionFile__ClassDeclarationAssignment_1 ) )
            // InternalInjectionLanguage.g:367:2: ( rule__InjectionFile__ClassDeclarationAssignment_1 )
            {
             before(grammarAccess.getInjectionFileAccess().getClassDeclarationAssignment_1()); 
            // InternalInjectionLanguage.g:368:2: ( rule__InjectionFile__ClassDeclarationAssignment_1 )
            // InternalInjectionLanguage.g:368:3: rule__InjectionFile__ClassDeclarationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InjectionFile__ClassDeclarationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInjectionFileAccess().getClassDeclarationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InjectionFile__Group__1__Impl"


    // $ANTLR start "rule__RegularImport__Group__0"
    // InternalInjectionLanguage.g:377:1: rule__RegularImport__Group__0 : rule__RegularImport__Group__0__Impl rule__RegularImport__Group__1 ;
    public final void rule__RegularImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:381:1: ( rule__RegularImport__Group__0__Impl rule__RegularImport__Group__1 )
            // InternalInjectionLanguage.g:382:2: rule__RegularImport__Group__0__Impl rule__RegularImport__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RegularImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularImport__Group__0"


    // $ANTLR start "rule__RegularImport__Group__0__Impl"
    // InternalInjectionLanguage.g:389:1: rule__RegularImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__RegularImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:393:1: ( ( 'import' ) )
            // InternalInjectionLanguage.g:394:1: ( 'import' )
            {
            // InternalInjectionLanguage.g:394:1: ( 'import' )
            // InternalInjectionLanguage.g:395:2: 'import'
            {
             before(grammarAccess.getRegularImportAccess().getImportKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRegularImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularImport__Group__0__Impl"


    // $ANTLR start "rule__RegularImport__Group__1"
    // InternalInjectionLanguage.g:404:1: rule__RegularImport__Group__1 : rule__RegularImport__Group__1__Impl rule__RegularImport__Group__2 ;
    public final void rule__RegularImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:408:1: ( rule__RegularImport__Group__1__Impl rule__RegularImport__Group__2 )
            // InternalInjectionLanguage.g:409:2: rule__RegularImport__Group__1__Impl rule__RegularImport__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__RegularImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegularImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularImport__Group__1"


    // $ANTLR start "rule__RegularImport__Group__1__Impl"
    // InternalInjectionLanguage.g:416:1: rule__RegularImport__Group__1__Impl : ( ( rule__RegularImport__NamespaceAssignment_1 ) ) ;
    public final void rule__RegularImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:420:1: ( ( ( rule__RegularImport__NamespaceAssignment_1 ) ) )
            // InternalInjectionLanguage.g:421:1: ( ( rule__RegularImport__NamespaceAssignment_1 ) )
            {
            // InternalInjectionLanguage.g:421:1: ( ( rule__RegularImport__NamespaceAssignment_1 ) )
            // InternalInjectionLanguage.g:422:2: ( rule__RegularImport__NamespaceAssignment_1 )
            {
             before(grammarAccess.getRegularImportAccess().getNamespaceAssignment_1()); 
            // InternalInjectionLanguage.g:423:2: ( rule__RegularImport__NamespaceAssignment_1 )
            // InternalInjectionLanguage.g:423:3: rule__RegularImport__NamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RegularImport__NamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegularImportAccess().getNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularImport__Group__1__Impl"


    // $ANTLR start "rule__RegularImport__Group__2"
    // InternalInjectionLanguage.g:431:1: rule__RegularImport__Group__2 : rule__RegularImport__Group__2__Impl ;
    public final void rule__RegularImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:435:1: ( rule__RegularImport__Group__2__Impl )
            // InternalInjectionLanguage.g:436:2: rule__RegularImport__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegularImport__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularImport__Group__2"


    // $ANTLR start "rule__RegularImport__Group__2__Impl"
    // InternalInjectionLanguage.g:442:1: rule__RegularImport__Group__2__Impl : ( ';' ) ;
    public final void rule__RegularImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:446:1: ( ( ';' ) )
            // InternalInjectionLanguage.g:447:1: ( ';' )
            {
            // InternalInjectionLanguage.g:447:1: ( ';' )
            // InternalInjectionLanguage.g:448:2: ';'
            {
             before(grammarAccess.getRegularImportAccess().getSemicolonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRegularImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularImport__Group__2__Impl"


    // $ANTLR start "rule__StaticImport__Group__0"
    // InternalInjectionLanguage.g:458:1: rule__StaticImport__Group__0 : rule__StaticImport__Group__0__Impl rule__StaticImport__Group__1 ;
    public final void rule__StaticImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:462:1: ( rule__StaticImport__Group__0__Impl rule__StaticImport__Group__1 )
            // InternalInjectionLanguage.g:463:2: rule__StaticImport__Group__0__Impl rule__StaticImport__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__StaticImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticImport__Group__0"


    // $ANTLR start "rule__StaticImport__Group__0__Impl"
    // InternalInjectionLanguage.g:470:1: rule__StaticImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__StaticImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:474:1: ( ( 'import' ) )
            // InternalInjectionLanguage.g:475:1: ( 'import' )
            {
            // InternalInjectionLanguage.g:475:1: ( 'import' )
            // InternalInjectionLanguage.g:476:2: 'import'
            {
             before(grammarAccess.getStaticImportAccess().getImportKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStaticImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticImport__Group__0__Impl"


    // $ANTLR start "rule__StaticImport__Group__1"
    // InternalInjectionLanguage.g:485:1: rule__StaticImport__Group__1 : rule__StaticImport__Group__1__Impl rule__StaticImport__Group__2 ;
    public final void rule__StaticImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:489:1: ( rule__StaticImport__Group__1__Impl rule__StaticImport__Group__2 )
            // InternalInjectionLanguage.g:490:2: rule__StaticImport__Group__1__Impl rule__StaticImport__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__StaticImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticImport__Group__1"


    // $ANTLR start "rule__StaticImport__Group__1__Impl"
    // InternalInjectionLanguage.g:497:1: rule__StaticImport__Group__1__Impl : ( 'static' ) ;
    public final void rule__StaticImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:501:1: ( ( 'static' ) )
            // InternalInjectionLanguage.g:502:1: ( 'static' )
            {
            // InternalInjectionLanguage.g:502:1: ( 'static' )
            // InternalInjectionLanguage.g:503:2: 'static'
            {
             before(grammarAccess.getStaticImportAccess().getStaticKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStaticImportAccess().getStaticKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticImport__Group__1__Impl"


    // $ANTLR start "rule__StaticImport__Group__2"
    // InternalInjectionLanguage.g:512:1: rule__StaticImport__Group__2 : rule__StaticImport__Group__2__Impl rule__StaticImport__Group__3 ;
    public final void rule__StaticImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:516:1: ( rule__StaticImport__Group__2__Impl rule__StaticImport__Group__3 )
            // InternalInjectionLanguage.g:517:2: rule__StaticImport__Group__2__Impl rule__StaticImport__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__StaticImport__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StaticImport__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticImport__Group__2"


    // $ANTLR start "rule__StaticImport__Group__2__Impl"
    // InternalInjectionLanguage.g:524:1: rule__StaticImport__Group__2__Impl : ( ( rule__StaticImport__NamespaceAssignment_2 ) ) ;
    public final void rule__StaticImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:528:1: ( ( ( rule__StaticImport__NamespaceAssignment_2 ) ) )
            // InternalInjectionLanguage.g:529:1: ( ( rule__StaticImport__NamespaceAssignment_2 ) )
            {
            // InternalInjectionLanguage.g:529:1: ( ( rule__StaticImport__NamespaceAssignment_2 ) )
            // InternalInjectionLanguage.g:530:2: ( rule__StaticImport__NamespaceAssignment_2 )
            {
             before(grammarAccess.getStaticImportAccess().getNamespaceAssignment_2()); 
            // InternalInjectionLanguage.g:531:2: ( rule__StaticImport__NamespaceAssignment_2 )
            // InternalInjectionLanguage.g:531:3: rule__StaticImport__NamespaceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StaticImport__NamespaceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStaticImportAccess().getNamespaceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticImport__Group__2__Impl"


    // $ANTLR start "rule__StaticImport__Group__3"
    // InternalInjectionLanguage.g:539:1: rule__StaticImport__Group__3 : rule__StaticImport__Group__3__Impl ;
    public final void rule__StaticImport__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:543:1: ( rule__StaticImport__Group__3__Impl )
            // InternalInjectionLanguage.g:544:2: rule__StaticImport__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StaticImport__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticImport__Group__3"


    // $ANTLR start "rule__StaticImport__Group__3__Impl"
    // InternalInjectionLanguage.g:550:1: rule__StaticImport__Group__3__Impl : ( ';' ) ;
    public final void rule__StaticImport__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:554:1: ( ( ';' ) )
            // InternalInjectionLanguage.g:555:1: ( ';' )
            {
            // InternalInjectionLanguage.g:555:1: ( ';' )
            // InternalInjectionLanguage.g:556:2: ';'
            {
             before(grammarAccess.getStaticImportAccess().getSemicolonKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStaticImportAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticImport__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalInjectionLanguage.g:566:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:570:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalInjectionLanguage.g:571:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalInjectionLanguage.g:578:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:582:1: ( ( RULE_ID ) )
            // InternalInjectionLanguage.g:583:1: ( RULE_ID )
            {
            // InternalInjectionLanguage.g:583:1: ( RULE_ID )
            // InternalInjectionLanguage.g:584:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalInjectionLanguage.g:593:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:597:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalInjectionLanguage.g:598:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalInjectionLanguage.g:604:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:608:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalInjectionLanguage.g:609:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalInjectionLanguage.g:609:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalInjectionLanguage.g:610:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalInjectionLanguage.g:611:2: ( rule__QualifiedName__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalInjectionLanguage.g:611:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalInjectionLanguage.g:620:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:624:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalInjectionLanguage.g:625:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalInjectionLanguage.g:632:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:636:1: ( ( '.' ) )
            // InternalInjectionLanguage.g:637:1: ( '.' )
            {
            // InternalInjectionLanguage.g:637:1: ( '.' )
            // InternalInjectionLanguage.g:638:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalInjectionLanguage.g:647:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:651:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalInjectionLanguage.g:652:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalInjectionLanguage.g:658:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:662:1: ( ( RULE_ID ) )
            // InternalInjectionLanguage.g:663:1: ( RULE_ID )
            {
            // InternalInjectionLanguage.g:663:1: ( RULE_ID )
            // InternalInjectionLanguage.g:664:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalInjectionLanguage.g:674:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:678:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalInjectionLanguage.g:679:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalInjectionLanguage.g:686:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:690:1: ( ( ruleQualifiedName ) )
            // InternalInjectionLanguage.g:691:1: ( ruleQualifiedName )
            {
            // InternalInjectionLanguage.g:691:1: ( ruleQualifiedName )
            // InternalInjectionLanguage.g:692:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalInjectionLanguage.g:701:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:705:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalInjectionLanguage.g:706:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalInjectionLanguage.g:712:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:716:1: ( ( ( '.*' )? ) )
            // InternalInjectionLanguage.g:717:1: ( ( '.*' )? )
            {
            // InternalInjectionLanguage.g:717:1: ( ( '.*' )? )
            // InternalInjectionLanguage.g:718:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalInjectionLanguage.g:719:2: ( '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalInjectionLanguage.g:719:3: '.*'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__0"
    // InternalInjectionLanguage.g:728:1: rule__ClassDeclaration__Group__0 : rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 ;
    public final void rule__ClassDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:732:1: ( rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1 )
            // InternalInjectionLanguage.g:733:2: rule__ClassDeclaration__Group__0__Impl rule__ClassDeclaration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ClassDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__0"


    // $ANTLR start "rule__ClassDeclaration__Group__0__Impl"
    // InternalInjectionLanguage.g:740:1: rule__ClassDeclaration__Group__0__Impl : ( ( rule__ClassDeclaration__AnnotationsAssignment_0 )* ) ;
    public final void rule__ClassDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:744:1: ( ( ( rule__ClassDeclaration__AnnotationsAssignment_0 )* ) )
            // InternalInjectionLanguage.g:745:1: ( ( rule__ClassDeclaration__AnnotationsAssignment_0 )* )
            {
            // InternalInjectionLanguage.g:745:1: ( ( rule__ClassDeclaration__AnnotationsAssignment_0 )* )
            // InternalInjectionLanguage.g:746:2: ( rule__ClassDeclaration__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getAnnotationsAssignment_0()); 
            // InternalInjectionLanguage.g:747:2: ( rule__ClassDeclaration__AnnotationsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalInjectionLanguage.g:747:3: rule__ClassDeclaration__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ClassDeclaration__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getClassDeclarationAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__1"
    // InternalInjectionLanguage.g:755:1: rule__ClassDeclaration__Group__1 : rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 ;
    public final void rule__ClassDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:759:1: ( rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2 )
            // InternalInjectionLanguage.g:760:2: rule__ClassDeclaration__Group__1__Impl rule__ClassDeclaration__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ClassDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__1"


    // $ANTLR start "rule__ClassDeclaration__Group__1__Impl"
    // InternalInjectionLanguage.g:767:1: rule__ClassDeclaration__Group__1__Impl : ( 'partial' ) ;
    public final void rule__ClassDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:771:1: ( ( 'partial' ) )
            // InternalInjectionLanguage.g:772:1: ( 'partial' )
            {
            // InternalInjectionLanguage.g:772:1: ( 'partial' )
            // InternalInjectionLanguage.g:773:2: 'partial'
            {
             before(grammarAccess.getClassDeclarationAccess().getPartialKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getPartialKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__2"
    // InternalInjectionLanguage.g:782:1: rule__ClassDeclaration__Group__2 : rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 ;
    public final void rule__ClassDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:786:1: ( rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3 )
            // InternalInjectionLanguage.g:787:2: rule__ClassDeclaration__Group__2__Impl rule__ClassDeclaration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ClassDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__2"


    // $ANTLR start "rule__ClassDeclaration__Group__2__Impl"
    // InternalInjectionLanguage.g:794:1: rule__ClassDeclaration__Group__2__Impl : ( 'class' ) ;
    public final void rule__ClassDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:798:1: ( ( 'class' ) )
            // InternalInjectionLanguage.g:799:1: ( 'class' )
            {
            // InternalInjectionLanguage.g:799:1: ( 'class' )
            // InternalInjectionLanguage.g:800:2: 'class'
            {
             before(grammarAccess.getClassDeclarationAccess().getClassKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getClassKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__2__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__3"
    // InternalInjectionLanguage.g:809:1: rule__ClassDeclaration__Group__3 : rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 ;
    public final void rule__ClassDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:813:1: ( rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4 )
            // InternalInjectionLanguage.g:814:2: rule__ClassDeclaration__Group__3__Impl rule__ClassDeclaration__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ClassDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__3"


    // $ANTLR start "rule__ClassDeclaration__Group__3__Impl"
    // InternalInjectionLanguage.g:821:1: rule__ClassDeclaration__Group__3__Impl : ( ( rule__ClassDeclaration__ClassNameAssignment_3 ) ) ;
    public final void rule__ClassDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:825:1: ( ( ( rule__ClassDeclaration__ClassNameAssignment_3 ) ) )
            // InternalInjectionLanguage.g:826:1: ( ( rule__ClassDeclaration__ClassNameAssignment_3 ) )
            {
            // InternalInjectionLanguage.g:826:1: ( ( rule__ClassDeclaration__ClassNameAssignment_3 ) )
            // InternalInjectionLanguage.g:827:2: ( rule__ClassDeclaration__ClassNameAssignment_3 )
            {
             before(grammarAccess.getClassDeclarationAccess().getClassNameAssignment_3()); 
            // InternalInjectionLanguage.g:828:2: ( rule__ClassDeclaration__ClassNameAssignment_3 )
            // InternalInjectionLanguage.g:828:3: rule__ClassDeclaration__ClassNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__ClassNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclarationAccess().getClassNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__3__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__4"
    // InternalInjectionLanguage.g:836:1: rule__ClassDeclaration__Group__4 : rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5 ;
    public final void rule__ClassDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:840:1: ( rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5 )
            // InternalInjectionLanguage.g:841:2: rule__ClassDeclaration__Group__4__Impl rule__ClassDeclaration__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ClassDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__4"


    // $ANTLR start "rule__ClassDeclaration__Group__4__Impl"
    // InternalInjectionLanguage.g:848:1: rule__ClassDeclaration__Group__4__Impl : ( '{' ) ;
    public final void rule__ClassDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:852:1: ( ( '{' ) )
            // InternalInjectionLanguage.g:853:1: ( '{' )
            {
            // InternalInjectionLanguage.g:853:1: ( '{' )
            // InternalInjectionLanguage.g:854:2: '{'
            {
             before(grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__4__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__5"
    // InternalInjectionLanguage.g:863:1: rule__ClassDeclaration__Group__5 : rule__ClassDeclaration__Group__5__Impl rule__ClassDeclaration__Group__6 ;
    public final void rule__ClassDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:867:1: ( rule__ClassDeclaration__Group__5__Impl rule__ClassDeclaration__Group__6 )
            // InternalInjectionLanguage.g:868:2: rule__ClassDeclaration__Group__5__Impl rule__ClassDeclaration__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ClassDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__5"


    // $ANTLR start "rule__ClassDeclaration__Group__5__Impl"
    // InternalInjectionLanguage.g:875:1: rule__ClassDeclaration__Group__5__Impl : ( ( rule__ClassDeclaration__ClassInjectionDeclarationAssignment_5 )? ) ;
    public final void rule__ClassDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:879:1: ( ( ( rule__ClassDeclaration__ClassInjectionDeclarationAssignment_5 )? ) )
            // InternalInjectionLanguage.g:880:1: ( ( rule__ClassDeclaration__ClassInjectionDeclarationAssignment_5 )? )
            {
            // InternalInjectionLanguage.g:880:1: ( ( rule__ClassDeclaration__ClassInjectionDeclarationAssignment_5 )? )
            // InternalInjectionLanguage.g:881:2: ( rule__ClassDeclaration__ClassInjectionDeclarationAssignment_5 )?
            {
             before(grammarAccess.getClassDeclarationAccess().getClassInjectionDeclarationAssignment_5()); 
            // InternalInjectionLanguage.g:882:2: ( rule__ClassDeclaration__ClassInjectionDeclarationAssignment_5 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalInjectionLanguage.g:882:3: rule__ClassDeclaration__ClassInjectionDeclarationAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDeclaration__ClassInjectionDeclarationAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclarationAccess().getClassInjectionDeclarationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__5__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__6"
    // InternalInjectionLanguage.g:890:1: rule__ClassDeclaration__Group__6 : rule__ClassDeclaration__Group__6__Impl rule__ClassDeclaration__Group__7 ;
    public final void rule__ClassDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:894:1: ( rule__ClassDeclaration__Group__6__Impl rule__ClassDeclaration__Group__7 )
            // InternalInjectionLanguage.g:895:2: rule__ClassDeclaration__Group__6__Impl rule__ClassDeclaration__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__ClassDeclaration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__6"


    // $ANTLR start "rule__ClassDeclaration__Group__6__Impl"
    // InternalInjectionLanguage.g:902:1: rule__ClassDeclaration__Group__6__Impl : ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_6 )* ) ;
    public final void rule__ClassDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:906:1: ( ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_6 )* ) )
            // InternalInjectionLanguage.g:907:1: ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_6 )* )
            {
            // InternalInjectionLanguage.g:907:1: ( ( rule__ClassDeclaration__MethodDeclarationsAssignment_6 )* )
            // InternalInjectionLanguage.g:908:2: ( rule__ClassDeclaration__MethodDeclarationsAssignment_6 )*
            {
             before(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsAssignment_6()); 
            // InternalInjectionLanguage.g:909:2: ( rule__ClassDeclaration__MethodDeclarationsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalInjectionLanguage.g:909:3: rule__ClassDeclaration__MethodDeclarationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ClassDeclaration__MethodDeclarationsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__6__Impl"


    // $ANTLR start "rule__ClassDeclaration__Group__7"
    // InternalInjectionLanguage.g:917:1: rule__ClassDeclaration__Group__7 : rule__ClassDeclaration__Group__7__Impl ;
    public final void rule__ClassDeclaration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:921:1: ( rule__ClassDeclaration__Group__7__Impl )
            // InternalInjectionLanguage.g:922:2: rule__ClassDeclaration__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDeclaration__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__7"


    // $ANTLR start "rule__ClassDeclaration__Group__7__Impl"
    // InternalInjectionLanguage.g:928:1: rule__ClassDeclaration__Group__7__Impl : ( '}' ) ;
    public final void rule__ClassDeclaration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:932:1: ( ( '}' ) )
            // InternalInjectionLanguage.g:933:1: ( '}' )
            {
            // InternalInjectionLanguage.g:933:1: ( '}' )
            // InternalInjectionLanguage.g:934:2: '}'
            {
             before(grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__Group__7__Impl"


    // $ANTLR start "rule__JavaAnnotation__Group__0"
    // InternalInjectionLanguage.g:944:1: rule__JavaAnnotation__Group__0 : rule__JavaAnnotation__Group__0__Impl rule__JavaAnnotation__Group__1 ;
    public final void rule__JavaAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:948:1: ( rule__JavaAnnotation__Group__0__Impl rule__JavaAnnotation__Group__1 )
            // InternalInjectionLanguage.g:949:2: rule__JavaAnnotation__Group__0__Impl rule__JavaAnnotation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__JavaAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaAnnotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaAnnotation__Group__0"


    // $ANTLR start "rule__JavaAnnotation__Group__0__Impl"
    // InternalInjectionLanguage.g:956:1: rule__JavaAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__JavaAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:960:1: ( ( '@' ) )
            // InternalInjectionLanguage.g:961:1: ( '@' )
            {
            // InternalInjectionLanguage.g:961:1: ( '@' )
            // InternalInjectionLanguage.g:962:2: '@'
            {
             before(grammarAccess.getJavaAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJavaAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaAnnotation__Group__0__Impl"


    // $ANTLR start "rule__JavaAnnotation__Group__1"
    // InternalInjectionLanguage.g:971:1: rule__JavaAnnotation__Group__1 : rule__JavaAnnotation__Group__1__Impl rule__JavaAnnotation__Group__2 ;
    public final void rule__JavaAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:975:1: ( rule__JavaAnnotation__Group__1__Impl rule__JavaAnnotation__Group__2 )
            // InternalInjectionLanguage.g:976:2: rule__JavaAnnotation__Group__1__Impl rule__JavaAnnotation__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__JavaAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaAnnotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaAnnotation__Group__1"


    // $ANTLR start "rule__JavaAnnotation__Group__1__Impl"
    // InternalInjectionLanguage.g:983:1: rule__JavaAnnotation__Group__1__Impl : ( ( rule__JavaAnnotation__NameAssignment_1 ) ) ;
    public final void rule__JavaAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:987:1: ( ( ( rule__JavaAnnotation__NameAssignment_1 ) ) )
            // InternalInjectionLanguage.g:988:1: ( ( rule__JavaAnnotation__NameAssignment_1 ) )
            {
            // InternalInjectionLanguage.g:988:1: ( ( rule__JavaAnnotation__NameAssignment_1 ) )
            // InternalInjectionLanguage.g:989:2: ( rule__JavaAnnotation__NameAssignment_1 )
            {
             before(grammarAccess.getJavaAnnotationAccess().getNameAssignment_1()); 
            // InternalInjectionLanguage.g:990:2: ( rule__JavaAnnotation__NameAssignment_1 )
            // InternalInjectionLanguage.g:990:3: rule__JavaAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JavaAnnotation__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJavaAnnotationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaAnnotation__Group__1__Impl"


    // $ANTLR start "rule__JavaAnnotation__Group__2"
    // InternalInjectionLanguage.g:998:1: rule__JavaAnnotation__Group__2 : rule__JavaAnnotation__Group__2__Impl rule__JavaAnnotation__Group__3 ;
    public final void rule__JavaAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1002:1: ( rule__JavaAnnotation__Group__2__Impl rule__JavaAnnotation__Group__3 )
            // InternalInjectionLanguage.g:1003:2: rule__JavaAnnotation__Group__2__Impl rule__JavaAnnotation__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__JavaAnnotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaAnnotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaAnnotation__Group__2"


    // $ANTLR start "rule__JavaAnnotation__Group__2__Impl"
    // InternalInjectionLanguage.g:1010:1: rule__JavaAnnotation__Group__2__Impl : ( '(' ) ;
    public final void rule__JavaAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1014:1: ( ( '(' ) )
            // InternalInjectionLanguage.g:1015:1: ( '(' )
            {
            // InternalInjectionLanguage.g:1015:1: ( '(' )
            // InternalInjectionLanguage.g:1016:2: '('
            {
             before(grammarAccess.getJavaAnnotationAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJavaAnnotationAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaAnnotation__Group__2__Impl"


    // $ANTLR start "rule__JavaAnnotation__Group__3"
    // InternalInjectionLanguage.g:1025:1: rule__JavaAnnotation__Group__3 : rule__JavaAnnotation__Group__3__Impl rule__JavaAnnotation__Group__4 ;
    public final void rule__JavaAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1029:1: ( rule__JavaAnnotation__Group__3__Impl rule__JavaAnnotation__Group__4 )
            // InternalInjectionLanguage.g:1030:2: rule__JavaAnnotation__Group__3__Impl rule__JavaAnnotation__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__JavaAnnotation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JavaAnnotation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaAnnotation__Group__3"


    // $ANTLR start "rule__JavaAnnotation__Group__3__Impl"
    // InternalInjectionLanguage.g:1037:1: rule__JavaAnnotation__Group__3__Impl : ( ( rule__JavaAnnotation__ParameterAssignment_3 ) ) ;
    public final void rule__JavaAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1041:1: ( ( ( rule__JavaAnnotation__ParameterAssignment_3 ) ) )
            // InternalInjectionLanguage.g:1042:1: ( ( rule__JavaAnnotation__ParameterAssignment_3 ) )
            {
            // InternalInjectionLanguage.g:1042:1: ( ( rule__JavaAnnotation__ParameterAssignment_3 ) )
            // InternalInjectionLanguage.g:1043:2: ( rule__JavaAnnotation__ParameterAssignment_3 )
            {
             before(grammarAccess.getJavaAnnotationAccess().getParameterAssignment_3()); 
            // InternalInjectionLanguage.g:1044:2: ( rule__JavaAnnotation__ParameterAssignment_3 )
            // InternalInjectionLanguage.g:1044:3: rule__JavaAnnotation__ParameterAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__JavaAnnotation__ParameterAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJavaAnnotationAccess().getParameterAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaAnnotation__Group__3__Impl"


    // $ANTLR start "rule__JavaAnnotation__Group__4"
    // InternalInjectionLanguage.g:1052:1: rule__JavaAnnotation__Group__4 : rule__JavaAnnotation__Group__4__Impl ;
    public final void rule__JavaAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1056:1: ( rule__JavaAnnotation__Group__4__Impl )
            // InternalInjectionLanguage.g:1057:2: rule__JavaAnnotation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JavaAnnotation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaAnnotation__Group__4"


    // $ANTLR start "rule__JavaAnnotation__Group__4__Impl"
    // InternalInjectionLanguage.g:1063:1: rule__JavaAnnotation__Group__4__Impl : ( ')' ) ;
    public final void rule__JavaAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1067:1: ( ( ')' ) )
            // InternalInjectionLanguage.g:1068:1: ( ')' )
            {
            // InternalInjectionLanguage.g:1068:1: ( ')' )
            // InternalInjectionLanguage.g:1069:2: ')'
            {
             before(grammarAccess.getJavaAnnotationAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getJavaAnnotationAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaAnnotation__Group__4__Impl"


    // $ANTLR start "rule__ClassInjectionDeclaration__Group__0"
    // InternalInjectionLanguage.g:1079:1: rule__ClassInjectionDeclaration__Group__0 : rule__ClassInjectionDeclaration__Group__0__Impl rule__ClassInjectionDeclaration__Group__1 ;
    public final void rule__ClassInjectionDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1083:1: ( rule__ClassInjectionDeclaration__Group__0__Impl rule__ClassInjectionDeclaration__Group__1 )
            // InternalInjectionLanguage.g:1084:2: rule__ClassInjectionDeclaration__Group__0__Impl rule__ClassInjectionDeclaration__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ClassInjectionDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassInjectionDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassInjectionDeclaration__Group__0"


    // $ANTLR start "rule__ClassInjectionDeclaration__Group__0__Impl"
    // InternalInjectionLanguage.g:1091:1: rule__ClassInjectionDeclaration__Group__0__Impl : ( '@members' ) ;
    public final void rule__ClassInjectionDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1095:1: ( ( '@members' ) )
            // InternalInjectionLanguage.g:1096:1: ( '@members' )
            {
            // InternalInjectionLanguage.g:1096:1: ( '@members' )
            // InternalInjectionLanguage.g:1097:2: '@members'
            {
             before(grammarAccess.getClassInjectionDeclarationAccess().getMembersKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClassInjectionDeclarationAccess().getMembersKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassInjectionDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ClassInjectionDeclaration__Group__1"
    // InternalInjectionLanguage.g:1106:1: rule__ClassInjectionDeclaration__Group__1 : rule__ClassInjectionDeclaration__Group__1__Impl ;
    public final void rule__ClassInjectionDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1110:1: ( rule__ClassInjectionDeclaration__Group__1__Impl )
            // InternalInjectionLanguage.g:1111:2: rule__ClassInjectionDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassInjectionDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassInjectionDeclaration__Group__1"


    // $ANTLR start "rule__ClassInjectionDeclaration__Group__1__Impl"
    // InternalInjectionLanguage.g:1117:1: rule__ClassInjectionDeclaration__Group__1__Impl : ( ( rule__ClassInjectionDeclaration__BodyAssignment_1 ) ) ;
    public final void rule__ClassInjectionDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1121:1: ( ( ( rule__ClassInjectionDeclaration__BodyAssignment_1 ) ) )
            // InternalInjectionLanguage.g:1122:1: ( ( rule__ClassInjectionDeclaration__BodyAssignment_1 ) )
            {
            // InternalInjectionLanguage.g:1122:1: ( ( rule__ClassInjectionDeclaration__BodyAssignment_1 ) )
            // InternalInjectionLanguage.g:1123:2: ( rule__ClassInjectionDeclaration__BodyAssignment_1 )
            {
             before(grammarAccess.getClassInjectionDeclarationAccess().getBodyAssignment_1()); 
            // InternalInjectionLanguage.g:1124:2: ( rule__ClassInjectionDeclaration__BodyAssignment_1 )
            // InternalInjectionLanguage.g:1124:3: rule__ClassInjectionDeclaration__BodyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassInjectionDeclaration__BodyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassInjectionDeclarationAccess().getBodyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassInjectionDeclaration__Group__1__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__0"
    // InternalInjectionLanguage.g:1133:1: rule__MethodDeclaration__Group__0 : rule__MethodDeclaration__Group__0__Impl rule__MethodDeclaration__Group__1 ;
    public final void rule__MethodDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1137:1: ( rule__MethodDeclaration__Group__0__Impl rule__MethodDeclaration__Group__1 )
            // InternalInjectionLanguage.g:1138:2: rule__MethodDeclaration__Group__0__Impl rule__MethodDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MethodDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__0"


    // $ANTLR start "rule__MethodDeclaration__Group__0__Impl"
    // InternalInjectionLanguage.g:1145:1: rule__MethodDeclaration__Group__0__Impl : ( '@model' ) ;
    public final void rule__MethodDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1149:1: ( ( '@model' ) )
            // InternalInjectionLanguage.g:1150:1: ( '@model' )
            {
            // InternalInjectionLanguage.g:1150:1: ( '@model' )
            // InternalInjectionLanguage.g:1151:2: '@model'
            {
             before(grammarAccess.getMethodDeclarationAccess().getModelKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__0__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__1"
    // InternalInjectionLanguage.g:1160:1: rule__MethodDeclaration__Group__1 : rule__MethodDeclaration__Group__1__Impl rule__MethodDeclaration__Group__2 ;
    public final void rule__MethodDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1164:1: ( rule__MethodDeclaration__Group__1__Impl rule__MethodDeclaration__Group__2 )
            // InternalInjectionLanguage.g:1165:2: rule__MethodDeclaration__Group__1__Impl rule__MethodDeclaration__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__MethodDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__1"


    // $ANTLR start "rule__MethodDeclaration__Group__1__Impl"
    // InternalInjectionLanguage.g:1172:1: rule__MethodDeclaration__Group__1__Impl : ( ( rule__MethodDeclaration__MethodNameAssignment_1 ) ) ;
    public final void rule__MethodDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1176:1: ( ( ( rule__MethodDeclaration__MethodNameAssignment_1 ) ) )
            // InternalInjectionLanguage.g:1177:1: ( ( rule__MethodDeclaration__MethodNameAssignment_1 ) )
            {
            // InternalInjectionLanguage.g:1177:1: ( ( rule__MethodDeclaration__MethodNameAssignment_1 ) )
            // InternalInjectionLanguage.g:1178:2: ( rule__MethodDeclaration__MethodNameAssignment_1 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getMethodNameAssignment_1()); 
            // InternalInjectionLanguage.g:1179:2: ( rule__MethodDeclaration__MethodNameAssignment_1 )
            // InternalInjectionLanguage.g:1179:3: rule__MethodDeclaration__MethodNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__MethodNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getMethodNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__1__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__2"
    // InternalInjectionLanguage.g:1187:1: rule__MethodDeclaration__Group__2 : rule__MethodDeclaration__Group__2__Impl rule__MethodDeclaration__Group__3 ;
    public final void rule__MethodDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1191:1: ( rule__MethodDeclaration__Group__2__Impl rule__MethodDeclaration__Group__3 )
            // InternalInjectionLanguage.g:1192:2: rule__MethodDeclaration__Group__2__Impl rule__MethodDeclaration__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__MethodDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__2"


    // $ANTLR start "rule__MethodDeclaration__Group__2__Impl"
    // InternalInjectionLanguage.g:1199:1: rule__MethodDeclaration__Group__2__Impl : ( '(' ) ;
    public final void rule__MethodDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1203:1: ( ( '(' ) )
            // InternalInjectionLanguage.g:1204:1: ( '(' )
            {
            // InternalInjectionLanguage.g:1204:1: ( '(' )
            // InternalInjectionLanguage.g:1205:2: '('
            {
             before(grammarAccess.getMethodDeclarationAccess().getLeftParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__2__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__3"
    // InternalInjectionLanguage.g:1214:1: rule__MethodDeclaration__Group__3 : rule__MethodDeclaration__Group__3__Impl rule__MethodDeclaration__Group__4 ;
    public final void rule__MethodDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1218:1: ( rule__MethodDeclaration__Group__3__Impl rule__MethodDeclaration__Group__4 )
            // InternalInjectionLanguage.g:1219:2: rule__MethodDeclaration__Group__3__Impl rule__MethodDeclaration__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__MethodDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__3"


    // $ANTLR start "rule__MethodDeclaration__Group__3__Impl"
    // InternalInjectionLanguage.g:1226:1: rule__MethodDeclaration__Group__3__Impl : ( ( rule__MethodDeclaration__ParametersAssignment_3 )? ) ;
    public final void rule__MethodDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1230:1: ( ( ( rule__MethodDeclaration__ParametersAssignment_3 )? ) )
            // InternalInjectionLanguage.g:1231:1: ( ( rule__MethodDeclaration__ParametersAssignment_3 )? )
            {
            // InternalInjectionLanguage.g:1231:1: ( ( rule__MethodDeclaration__ParametersAssignment_3 )? )
            // InternalInjectionLanguage.g:1232:2: ( rule__MethodDeclaration__ParametersAssignment_3 )?
            {
             before(grammarAccess.getMethodDeclarationAccess().getParametersAssignment_3()); 
            // InternalInjectionLanguage.g:1233:2: ( rule__MethodDeclaration__ParametersAssignment_3 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalInjectionLanguage.g:1233:3: rule__MethodDeclaration__ParametersAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodDeclaration__ParametersAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodDeclarationAccess().getParametersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__3__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__4"
    // InternalInjectionLanguage.g:1241:1: rule__MethodDeclaration__Group__4 : rule__MethodDeclaration__Group__4__Impl rule__MethodDeclaration__Group__5 ;
    public final void rule__MethodDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1245:1: ( rule__MethodDeclaration__Group__4__Impl rule__MethodDeclaration__Group__5 )
            // InternalInjectionLanguage.g:1246:2: rule__MethodDeclaration__Group__4__Impl rule__MethodDeclaration__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__MethodDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__4"


    // $ANTLR start "rule__MethodDeclaration__Group__4__Impl"
    // InternalInjectionLanguage.g:1253:1: rule__MethodDeclaration__Group__4__Impl : ( ( rule__MethodDeclaration__Group_4__0 )* ) ;
    public final void rule__MethodDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1257:1: ( ( ( rule__MethodDeclaration__Group_4__0 )* ) )
            // InternalInjectionLanguage.g:1258:1: ( ( rule__MethodDeclaration__Group_4__0 )* )
            {
            // InternalInjectionLanguage.g:1258:1: ( ( rule__MethodDeclaration__Group_4__0 )* )
            // InternalInjectionLanguage.g:1259:2: ( rule__MethodDeclaration__Group_4__0 )*
            {
             before(grammarAccess.getMethodDeclarationAccess().getGroup_4()); 
            // InternalInjectionLanguage.g:1260:2: ( rule__MethodDeclaration__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalInjectionLanguage.g:1260:3: rule__MethodDeclaration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__MethodDeclaration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMethodDeclarationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__4__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__5"
    // InternalInjectionLanguage.g:1268:1: rule__MethodDeclaration__Group__5 : rule__MethodDeclaration__Group__5__Impl rule__MethodDeclaration__Group__6 ;
    public final void rule__MethodDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1272:1: ( rule__MethodDeclaration__Group__5__Impl rule__MethodDeclaration__Group__6 )
            // InternalInjectionLanguage.g:1273:2: rule__MethodDeclaration__Group__5__Impl rule__MethodDeclaration__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__MethodDeclaration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__5"


    // $ANTLR start "rule__MethodDeclaration__Group__5__Impl"
    // InternalInjectionLanguage.g:1280:1: rule__MethodDeclaration__Group__5__Impl : ( ')' ) ;
    public final void rule__MethodDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1284:1: ( ( ')' ) )
            // InternalInjectionLanguage.g:1285:1: ( ')' )
            {
            // InternalInjectionLanguage.g:1285:1: ( ')' )
            // InternalInjectionLanguage.g:1286:2: ')'
            {
             before(grammarAccess.getMethodDeclarationAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__5__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group__6"
    // InternalInjectionLanguage.g:1295:1: rule__MethodDeclaration__Group__6 : rule__MethodDeclaration__Group__6__Impl ;
    public final void rule__MethodDeclaration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1299:1: ( rule__MethodDeclaration__Group__6__Impl )
            // InternalInjectionLanguage.g:1300:2: rule__MethodDeclaration__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__6"


    // $ANTLR start "rule__MethodDeclaration__Group__6__Impl"
    // InternalInjectionLanguage.g:1306:1: rule__MethodDeclaration__Group__6__Impl : ( ( rule__MethodDeclaration__BodyAssignment_6 ) ) ;
    public final void rule__MethodDeclaration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1310:1: ( ( ( rule__MethodDeclaration__BodyAssignment_6 ) ) )
            // InternalInjectionLanguage.g:1311:1: ( ( rule__MethodDeclaration__BodyAssignment_6 ) )
            {
            // InternalInjectionLanguage.g:1311:1: ( ( rule__MethodDeclaration__BodyAssignment_6 ) )
            // InternalInjectionLanguage.g:1312:2: ( rule__MethodDeclaration__BodyAssignment_6 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getBodyAssignment_6()); 
            // InternalInjectionLanguage.g:1313:2: ( rule__MethodDeclaration__BodyAssignment_6 )
            // InternalInjectionLanguage.g:1313:3: rule__MethodDeclaration__BodyAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__BodyAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getBodyAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group__6__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group_4__0"
    // InternalInjectionLanguage.g:1322:1: rule__MethodDeclaration__Group_4__0 : rule__MethodDeclaration__Group_4__0__Impl rule__MethodDeclaration__Group_4__1 ;
    public final void rule__MethodDeclaration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1326:1: ( rule__MethodDeclaration__Group_4__0__Impl rule__MethodDeclaration__Group_4__1 )
            // InternalInjectionLanguage.g:1327:2: rule__MethodDeclaration__Group_4__0__Impl rule__MethodDeclaration__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__MethodDeclaration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_4__0"


    // $ANTLR start "rule__MethodDeclaration__Group_4__0__Impl"
    // InternalInjectionLanguage.g:1334:1: rule__MethodDeclaration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__MethodDeclaration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1338:1: ( ( ',' ) )
            // InternalInjectionLanguage.g:1339:1: ( ',' )
            {
            // InternalInjectionLanguage.g:1339:1: ( ',' )
            // InternalInjectionLanguage.g:1340:2: ','
            {
             before(grammarAccess.getMethodDeclarationAccess().getCommaKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_4__0__Impl"


    // $ANTLR start "rule__MethodDeclaration__Group_4__1"
    // InternalInjectionLanguage.g:1349:1: rule__MethodDeclaration__Group_4__1 : rule__MethodDeclaration__Group_4__1__Impl ;
    public final void rule__MethodDeclaration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1353:1: ( rule__MethodDeclaration__Group_4__1__Impl )
            // InternalInjectionLanguage.g:1354:2: rule__MethodDeclaration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_4__1"


    // $ANTLR start "rule__MethodDeclaration__Group_4__1__Impl"
    // InternalInjectionLanguage.g:1360:1: rule__MethodDeclaration__Group_4__1__Impl : ( ( rule__MethodDeclaration__ParametersAssignment_4_1 ) ) ;
    public final void rule__MethodDeclaration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1364:1: ( ( ( rule__MethodDeclaration__ParametersAssignment_4_1 ) ) )
            // InternalInjectionLanguage.g:1365:1: ( ( rule__MethodDeclaration__ParametersAssignment_4_1 ) )
            {
            // InternalInjectionLanguage.g:1365:1: ( ( rule__MethodDeclaration__ParametersAssignment_4_1 ) )
            // InternalInjectionLanguage.g:1366:2: ( rule__MethodDeclaration__ParametersAssignment_4_1 )
            {
             before(grammarAccess.getMethodDeclarationAccess().getParametersAssignment_4_1()); 
            // InternalInjectionLanguage.g:1367:2: ( rule__MethodDeclaration__ParametersAssignment_4_1 )
            // InternalInjectionLanguage.g:1367:3: rule__MethodDeclaration__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodDeclaration__ParametersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclarationAccess().getParametersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__Group_4__1__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__0"
    // InternalInjectionLanguage.g:1376:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1380:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // InternalInjectionLanguage.g:1381:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__0"


    // $ANTLR start "rule__ParameterDeclaration__Group__0__Impl"
    // InternalInjectionLanguage.g:1388:1: rule__ParameterDeclaration__Group__0__Impl : ( ( rule__ParameterDeclaration__ParameterTypeAssignment_0 ) ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1392:1: ( ( ( rule__ParameterDeclaration__ParameterTypeAssignment_0 ) ) )
            // InternalInjectionLanguage.g:1393:1: ( ( rule__ParameterDeclaration__ParameterTypeAssignment_0 ) )
            {
            // InternalInjectionLanguage.g:1393:1: ( ( rule__ParameterDeclaration__ParameterTypeAssignment_0 ) )
            // InternalInjectionLanguage.g:1394:2: ( rule__ParameterDeclaration__ParameterTypeAssignment_0 )
            {
             before(grammarAccess.getParameterDeclarationAccess().getParameterTypeAssignment_0()); 
            // InternalInjectionLanguage.g:1395:2: ( rule__ParameterDeclaration__ParameterTypeAssignment_0 )
            // InternalInjectionLanguage.g:1395:3: rule__ParameterDeclaration__ParameterTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__ParameterTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclarationAccess().getParameterTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__1"
    // InternalInjectionLanguage.g:1403:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1407:1: ( rule__ParameterDeclaration__Group__1__Impl )
            // InternalInjectionLanguage.g:1408:2: rule__ParameterDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__1"


    // $ANTLR start "rule__ParameterDeclaration__Group__1__Impl"
    // InternalInjectionLanguage.g:1414:1: rule__ParameterDeclaration__Group__1__Impl : ( ( rule__ParameterDeclaration__ParameterNameAssignment_1 ) ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1418:1: ( ( ( rule__ParameterDeclaration__ParameterNameAssignment_1 ) ) )
            // InternalInjectionLanguage.g:1419:1: ( ( rule__ParameterDeclaration__ParameterNameAssignment_1 ) )
            {
            // InternalInjectionLanguage.g:1419:1: ( ( rule__ParameterDeclaration__ParameterNameAssignment_1 ) )
            // InternalInjectionLanguage.g:1420:2: ( rule__ParameterDeclaration__ParameterNameAssignment_1 )
            {
             before(grammarAccess.getParameterDeclarationAccess().getParameterNameAssignment_1()); 
            // InternalInjectionLanguage.g:1421:2: ( rule__ParameterDeclaration__ParameterNameAssignment_1 )
            // InternalInjectionLanguage.g:1421:3: rule__ParameterDeclaration__ParameterNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__ParameterNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclarationAccess().getParameterNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__1__Impl"


    // $ANTLR start "rule__InjectionFile__ImportsAssignment_0"
    // InternalInjectionLanguage.g:1430:1: rule__InjectionFile__ImportsAssignment_0 : ( ( rule__InjectionFile__ImportsAlternatives_0_0 ) ) ;
    public final void rule__InjectionFile__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1434:1: ( ( ( rule__InjectionFile__ImportsAlternatives_0_0 ) ) )
            // InternalInjectionLanguage.g:1435:2: ( ( rule__InjectionFile__ImportsAlternatives_0_0 ) )
            {
            // InternalInjectionLanguage.g:1435:2: ( ( rule__InjectionFile__ImportsAlternatives_0_0 ) )
            // InternalInjectionLanguage.g:1436:3: ( rule__InjectionFile__ImportsAlternatives_0_0 )
            {
             before(grammarAccess.getInjectionFileAccess().getImportsAlternatives_0_0()); 
            // InternalInjectionLanguage.g:1437:3: ( rule__InjectionFile__ImportsAlternatives_0_0 )
            // InternalInjectionLanguage.g:1437:4: rule__InjectionFile__ImportsAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__InjectionFile__ImportsAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getInjectionFileAccess().getImportsAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InjectionFile__ImportsAssignment_0"


    // $ANTLR start "rule__InjectionFile__ClassDeclarationAssignment_1"
    // InternalInjectionLanguage.g:1445:1: rule__InjectionFile__ClassDeclarationAssignment_1 : ( ruleClassDeclaration ) ;
    public final void rule__InjectionFile__ClassDeclarationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1449:1: ( ( ruleClassDeclaration ) )
            // InternalInjectionLanguage.g:1450:2: ( ruleClassDeclaration )
            {
            // InternalInjectionLanguage.g:1450:2: ( ruleClassDeclaration )
            // InternalInjectionLanguage.g:1451:3: ruleClassDeclaration
            {
             before(grammarAccess.getInjectionFileAccess().getClassDeclarationClassDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClassDeclaration();

            state._fsp--;

             after(grammarAccess.getInjectionFileAccess().getClassDeclarationClassDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InjectionFile__ClassDeclarationAssignment_1"


    // $ANTLR start "rule__RegularImport__NamespaceAssignment_1"
    // InternalInjectionLanguage.g:1460:1: rule__RegularImport__NamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__RegularImport__NamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1464:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalInjectionLanguage.g:1465:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalInjectionLanguage.g:1465:2: ( ruleQualifiedNameWithWildcard )
            // InternalInjectionLanguage.g:1466:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getRegularImportAccess().getNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getRegularImportAccess().getNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegularImport__NamespaceAssignment_1"


    // $ANTLR start "rule__StaticImport__NamespaceAssignment_2"
    // InternalInjectionLanguage.g:1475:1: rule__StaticImport__NamespaceAssignment_2 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__StaticImport__NamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1479:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalInjectionLanguage.g:1480:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalInjectionLanguage.g:1480:2: ( ruleQualifiedNameWithWildcard )
            // InternalInjectionLanguage.g:1481:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getStaticImportAccess().getNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getStaticImportAccess().getNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StaticImport__NamespaceAssignment_2"


    // $ANTLR start "rule__ClassDeclaration__AnnotationsAssignment_0"
    // InternalInjectionLanguage.g:1490:1: rule__ClassDeclaration__AnnotationsAssignment_0 : ( ruleJavaAnnotation ) ;
    public final void rule__ClassDeclaration__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1494:1: ( ( ruleJavaAnnotation ) )
            // InternalInjectionLanguage.g:1495:2: ( ruleJavaAnnotation )
            {
            // InternalInjectionLanguage.g:1495:2: ( ruleJavaAnnotation )
            // InternalInjectionLanguage.g:1496:3: ruleJavaAnnotation
            {
             before(grammarAccess.getClassDeclarationAccess().getAnnotationsJavaAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJavaAnnotation();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getAnnotationsJavaAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__AnnotationsAssignment_0"


    // $ANTLR start "rule__ClassDeclaration__ClassNameAssignment_3"
    // InternalInjectionLanguage.g:1505:1: rule__ClassDeclaration__ClassNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ClassDeclaration__ClassNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1509:1: ( ( RULE_ID ) )
            // InternalInjectionLanguage.g:1510:2: ( RULE_ID )
            {
            // InternalInjectionLanguage.g:1510:2: ( RULE_ID )
            // InternalInjectionLanguage.g:1511:3: RULE_ID
            {
             before(grammarAccess.getClassDeclarationAccess().getClassNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassDeclarationAccess().getClassNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__ClassNameAssignment_3"


    // $ANTLR start "rule__ClassDeclaration__ClassInjectionDeclarationAssignment_5"
    // InternalInjectionLanguage.g:1520:1: rule__ClassDeclaration__ClassInjectionDeclarationAssignment_5 : ( ruleClassInjectionDeclaration ) ;
    public final void rule__ClassDeclaration__ClassInjectionDeclarationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1524:1: ( ( ruleClassInjectionDeclaration ) )
            // InternalInjectionLanguage.g:1525:2: ( ruleClassInjectionDeclaration )
            {
            // InternalInjectionLanguage.g:1525:2: ( ruleClassInjectionDeclaration )
            // InternalInjectionLanguage.g:1526:3: ruleClassInjectionDeclaration
            {
             before(grammarAccess.getClassDeclarationAccess().getClassInjectionDeclarationClassInjectionDeclarationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleClassInjectionDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getClassInjectionDeclarationClassInjectionDeclarationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__ClassInjectionDeclarationAssignment_5"


    // $ANTLR start "rule__ClassDeclaration__MethodDeclarationsAssignment_6"
    // InternalInjectionLanguage.g:1535:1: rule__ClassDeclaration__MethodDeclarationsAssignment_6 : ( ruleMethodDeclaration ) ;
    public final void rule__ClassDeclaration__MethodDeclarationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1539:1: ( ( ruleMethodDeclaration ) )
            // InternalInjectionLanguage.g:1540:2: ( ruleMethodDeclaration )
            {
            // InternalInjectionLanguage.g:1540:2: ( ruleMethodDeclaration )
            // InternalInjectionLanguage.g:1541:3: ruleMethodDeclaration
            {
             before(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsMethodDeclarationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodDeclaration();

            state._fsp--;

             after(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsMethodDeclarationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDeclaration__MethodDeclarationsAssignment_6"


    // $ANTLR start "rule__JavaAnnotation__NameAssignment_1"
    // InternalInjectionLanguage.g:1550:1: rule__JavaAnnotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__JavaAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1554:1: ( ( RULE_ID ) )
            // InternalInjectionLanguage.g:1555:2: ( RULE_ID )
            {
            // InternalInjectionLanguage.g:1555:2: ( RULE_ID )
            // InternalInjectionLanguage.g:1556:3: RULE_ID
            {
             before(grammarAccess.getJavaAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJavaAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaAnnotation__NameAssignment_1"


    // $ANTLR start "rule__JavaAnnotation__ParameterAssignment_3"
    // InternalInjectionLanguage.g:1565:1: rule__JavaAnnotation__ParameterAssignment_3 : ( RULE_STRING ) ;
    public final void rule__JavaAnnotation__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1569:1: ( ( RULE_STRING ) )
            // InternalInjectionLanguage.g:1570:2: ( RULE_STRING )
            {
            // InternalInjectionLanguage.g:1570:2: ( RULE_STRING )
            // InternalInjectionLanguage.g:1571:3: RULE_STRING
            {
             before(grammarAccess.getJavaAnnotationAccess().getParameterSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJavaAnnotationAccess().getParameterSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaAnnotation__ParameterAssignment_3"


    // $ANTLR start "rule__ClassInjectionDeclaration__BodyAssignment_1"
    // InternalInjectionLanguage.g:1580:1: rule__ClassInjectionDeclaration__BodyAssignment_1 : ( RULE_CODE_BLOCK ) ;
    public final void rule__ClassInjectionDeclaration__BodyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1584:1: ( ( RULE_CODE_BLOCK ) )
            // InternalInjectionLanguage.g:1585:2: ( RULE_CODE_BLOCK )
            {
            // InternalInjectionLanguage.g:1585:2: ( RULE_CODE_BLOCK )
            // InternalInjectionLanguage.g:1586:3: RULE_CODE_BLOCK
            {
             before(grammarAccess.getClassInjectionDeclarationAccess().getBodyCODE_BLOCKTerminalRuleCall_1_0()); 
            match(input,RULE_CODE_BLOCK,FOLLOW_2); 
             after(grammarAccess.getClassInjectionDeclarationAccess().getBodyCODE_BLOCKTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassInjectionDeclaration__BodyAssignment_1"


    // $ANTLR start "rule__MethodDeclaration__MethodNameAssignment_1"
    // InternalInjectionLanguage.g:1595:1: rule__MethodDeclaration__MethodNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MethodDeclaration__MethodNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1599:1: ( ( RULE_ID ) )
            // InternalInjectionLanguage.g:1600:2: ( RULE_ID )
            {
            // InternalInjectionLanguage.g:1600:2: ( RULE_ID )
            // InternalInjectionLanguage.g:1601:3: RULE_ID
            {
             before(grammarAccess.getMethodDeclarationAccess().getMethodNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getMethodNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__MethodNameAssignment_1"


    // $ANTLR start "rule__MethodDeclaration__ParametersAssignment_3"
    // InternalInjectionLanguage.g:1610:1: rule__MethodDeclaration__ParametersAssignment_3 : ( ruleParameterDeclaration ) ;
    public final void rule__MethodDeclaration__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1614:1: ( ( ruleParameterDeclaration ) )
            // InternalInjectionLanguage.g:1615:2: ( ruleParameterDeclaration )
            {
            // InternalInjectionLanguage.g:1615:2: ( ruleParameterDeclaration )
            // InternalInjectionLanguage.g:1616:3: ruleParameterDeclaration
            {
             before(grammarAccess.getMethodDeclarationAccess().getParametersParameterDeclarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getParametersParameterDeclarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__ParametersAssignment_3"


    // $ANTLR start "rule__MethodDeclaration__ParametersAssignment_4_1"
    // InternalInjectionLanguage.g:1625:1: rule__MethodDeclaration__ParametersAssignment_4_1 : ( ruleParameterDeclaration ) ;
    public final void rule__MethodDeclaration__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1629:1: ( ( ruleParameterDeclaration ) )
            // InternalInjectionLanguage.g:1630:2: ( ruleParameterDeclaration )
            {
            // InternalInjectionLanguage.g:1630:2: ( ruleParameterDeclaration )
            // InternalInjectionLanguage.g:1631:3: ruleParameterDeclaration
            {
             before(grammarAccess.getMethodDeclarationAccess().getParametersParameterDeclarationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getMethodDeclarationAccess().getParametersParameterDeclarationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__ParametersAssignment_4_1"


    // $ANTLR start "rule__MethodDeclaration__BodyAssignment_6"
    // InternalInjectionLanguage.g:1640:1: rule__MethodDeclaration__BodyAssignment_6 : ( RULE_CODE_BLOCK ) ;
    public final void rule__MethodDeclaration__BodyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1644:1: ( ( RULE_CODE_BLOCK ) )
            // InternalInjectionLanguage.g:1645:2: ( RULE_CODE_BLOCK )
            {
            // InternalInjectionLanguage.g:1645:2: ( RULE_CODE_BLOCK )
            // InternalInjectionLanguage.g:1646:3: RULE_CODE_BLOCK
            {
             before(grammarAccess.getMethodDeclarationAccess().getBodyCODE_BLOCKTerminalRuleCall_6_0()); 
            match(input,RULE_CODE_BLOCK,FOLLOW_2); 
             after(grammarAccess.getMethodDeclarationAccess().getBodyCODE_BLOCKTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDeclaration__BodyAssignment_6"


    // $ANTLR start "rule__ParameterDeclaration__ParameterTypeAssignment_0"
    // InternalInjectionLanguage.g:1655:1: rule__ParameterDeclaration__ParameterTypeAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__ParameterDeclaration__ParameterTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1659:1: ( ( ruleQualifiedName ) )
            // InternalInjectionLanguage.g:1660:2: ( ruleQualifiedName )
            {
            // InternalInjectionLanguage.g:1660:2: ( ruleQualifiedName )
            // InternalInjectionLanguage.g:1661:3: ruleQualifiedName
            {
             before(grammarAccess.getParameterDeclarationAccess().getParameterTypeQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationAccess().getParameterTypeQualifiedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__ParameterTypeAssignment_0"


    // $ANTLR start "rule__ParameterDeclaration__ParameterNameAssignment_1"
    // InternalInjectionLanguage.g:1670:1: rule__ParameterDeclaration__ParameterNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterDeclaration__ParameterNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalInjectionLanguage.g:1674:1: ( ( RULE_ID ) )
            // InternalInjectionLanguage.g:1675:2: ( RULE_ID )
            {
            // InternalInjectionLanguage.g:1675:2: ( RULE_ID )
            // InternalInjectionLanguage.g:1676:3: RULE_ID
            {
             before(grammarAccess.getParameterDeclarationAccess().getParameterNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterDeclarationAccess().getParameterNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__ParameterNameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000C400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000012000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000002L});

}