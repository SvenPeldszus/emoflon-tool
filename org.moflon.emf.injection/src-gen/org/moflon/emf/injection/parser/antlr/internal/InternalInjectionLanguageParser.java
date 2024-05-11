package org.moflon.emf.injection.parser.antlr.internal;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.moflon.emf.injection.services.InjectionLanguageGrammarAccess;

@SuppressWarnings("all")
public class InternalInjectionLanguageParser extends AbstractInternalAntlrParser {
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

        public InternalInjectionLanguageParser(TokenStream input, InjectionLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "InjectionFile";
       	}

       	@Override
       	protected InjectionLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleInjectionFile"
    // InternalInjectionLanguage.g:64:1: entryRuleInjectionFile returns [EObject current=null] : iv_ruleInjectionFile= ruleInjectionFile EOF ;
    public final EObject entryRuleInjectionFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInjectionFile = null;


        try {
            // InternalInjectionLanguage.g:64:54: (iv_ruleInjectionFile= ruleInjectionFile EOF )
            // InternalInjectionLanguage.g:65:2: iv_ruleInjectionFile= ruleInjectionFile EOF
            {
             newCompositeNode(grammarAccess.getInjectionFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInjectionFile=ruleInjectionFile();

            state._fsp--;

             current =iv_ruleInjectionFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInjectionFile"


    // $ANTLR start "ruleInjectionFile"
    // InternalInjectionLanguage.g:71:1: ruleInjectionFile returns [EObject current=null] : ( ( ( (lv_imports_0_1= ruleRegularImport | lv_imports_0_2= ruleStaticImport ) ) )* ( (lv_classDeclaration_1_0= ruleClassDeclaration ) ) ) ;
    public final EObject ruleInjectionFile() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_1 = null;

        EObject lv_imports_0_2 = null;

        EObject lv_classDeclaration_1_0 = null;



        	enterRule();

        try {
            // InternalInjectionLanguage.g:77:2: ( ( ( ( (lv_imports_0_1= ruleRegularImport | lv_imports_0_2= ruleStaticImport ) ) )* ( (lv_classDeclaration_1_0= ruleClassDeclaration ) ) ) )
            // InternalInjectionLanguage.g:78:2: ( ( ( (lv_imports_0_1= ruleRegularImport | lv_imports_0_2= ruleStaticImport ) ) )* ( (lv_classDeclaration_1_0= ruleClassDeclaration ) ) )
            {
            // InternalInjectionLanguage.g:78:2: ( ( ( (lv_imports_0_1= ruleRegularImport | lv_imports_0_2= ruleStaticImport ) ) )* ( (lv_classDeclaration_1_0= ruleClassDeclaration ) ) )
            // InternalInjectionLanguage.g:79:3: ( ( (lv_imports_0_1= ruleRegularImport | lv_imports_0_2= ruleStaticImport ) ) )* ( (lv_classDeclaration_1_0= ruleClassDeclaration ) )
            {
            // InternalInjectionLanguage.g:79:3: ( ( (lv_imports_0_1= ruleRegularImport | lv_imports_0_2= ruleStaticImport ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalInjectionLanguage.g:80:4: ( (lv_imports_0_1= ruleRegularImport | lv_imports_0_2= ruleStaticImport ) )
            	    {
            	    // InternalInjectionLanguage.g:80:4: ( (lv_imports_0_1= ruleRegularImport | lv_imports_0_2= ruleStaticImport ) )
            	    // InternalInjectionLanguage.g:81:5: (lv_imports_0_1= ruleRegularImport | lv_imports_0_2= ruleStaticImport )
            	    {
            	    // InternalInjectionLanguage.g:81:5: (lv_imports_0_1= ruleRegularImport | lv_imports_0_2= ruleStaticImport )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==14) ) {
            	        int LA1_1 = input.LA(2);

            	        if ( (LA1_1==16) ) {
            	            alt1=2;
            	        }
            	        else if ( (LA1_1==RULE_ID) ) {
            	            alt1=1;
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
            	            // InternalInjectionLanguage.g:82:6: lv_imports_0_1= ruleRegularImport
            	            {

            	            						newCompositeNode(grammarAccess.getInjectionFileAccess().getImportsRegularImportParserRuleCall_0_0_0());
            	            					
            	            pushFollow(FOLLOW_3);
            	            lv_imports_0_1=ruleRegularImport();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getInjectionFileRule());
            	            						}
            	            						add(
            	            							current,
            	            							"imports",
            	            							lv_imports_0_1,
            	            							"org.moflon.emf.injection.InjectionLanguage.RegularImport");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalInjectionLanguage.g:98:6: lv_imports_0_2= ruleStaticImport
            	            {

            	            						newCompositeNode(grammarAccess.getInjectionFileAccess().getImportsStaticImportParserRuleCall_0_0_1());
            	            					
            	            pushFollow(FOLLOW_3);
            	            lv_imports_0_2=ruleStaticImport();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getInjectionFileRule());
            	            						}
            	            						add(
            	            							current,
            	            							"imports",
            	            							lv_imports_0_2,
            	            							"org.moflon.emf.injection.InjectionLanguage.StaticImport");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalInjectionLanguage.g:116:3: ( (lv_classDeclaration_1_0= ruleClassDeclaration ) )
            // InternalInjectionLanguage.g:117:4: (lv_classDeclaration_1_0= ruleClassDeclaration )
            {
            // InternalInjectionLanguage.g:117:4: (lv_classDeclaration_1_0= ruleClassDeclaration )
            // InternalInjectionLanguage.g:118:5: lv_classDeclaration_1_0= ruleClassDeclaration
            {

            					newCompositeNode(grammarAccess.getInjectionFileAccess().getClassDeclarationClassDeclarationParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_classDeclaration_1_0=ruleClassDeclaration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInjectionFileRule());
            					}
            					set(
            						current,
            						"classDeclaration",
            						lv_classDeclaration_1_0,
            						"org.moflon.emf.injection.InjectionLanguage.ClassDeclaration");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInjectionFile"


    // $ANTLR start "entryRuleRegularImport"
    // InternalInjectionLanguage.g:139:1: entryRuleRegularImport returns [EObject current=null] : iv_ruleRegularImport= ruleRegularImport EOF ;
    public final EObject entryRuleRegularImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularImport = null;


        try {
            // InternalInjectionLanguage.g:139:54: (iv_ruleRegularImport= ruleRegularImport EOF )
            // InternalInjectionLanguage.g:140:2: iv_ruleRegularImport= ruleRegularImport EOF
            {
             newCompositeNode(grammarAccess.getRegularImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularImport=ruleRegularImport();

            state._fsp--;

             current =iv_ruleRegularImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegularImport"


    // $ANTLR start "ruleRegularImport"
    // InternalInjectionLanguage.g:146:1: ruleRegularImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_namespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleRegularImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_namespace_1_0 = null;



        	enterRule();

        try {
            // InternalInjectionLanguage.g:152:2: ( (otherlv_0= 'import' ( (lv_namespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // InternalInjectionLanguage.g:153:2: (otherlv_0= 'import' ( (lv_namespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // InternalInjectionLanguage.g:153:2: (otherlv_0= 'import' ( (lv_namespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // InternalInjectionLanguage.g:154:3: otherlv_0= 'import' ( (lv_namespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRegularImportAccess().getImportKeyword_0());
            		
            // InternalInjectionLanguage.g:158:3: ( (lv_namespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalInjectionLanguage.g:159:4: (lv_namespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalInjectionLanguage.g:159:4: (lv_namespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalInjectionLanguage.g:160:5: lv_namespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getRegularImportAccess().getNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_namespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularImportRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_1_0,
            						"org.moflon.emf.injection.InjectionLanguage.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRegularImportAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegularImport"


    // $ANTLR start "entryRuleStaticImport"
    // InternalInjectionLanguage.g:185:1: entryRuleStaticImport returns [EObject current=null] : iv_ruleStaticImport= ruleStaticImport EOF ;
    public final EObject entryRuleStaticImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticImport = null;


        try {
            // InternalInjectionLanguage.g:185:53: (iv_ruleStaticImport= ruleStaticImport EOF )
            // InternalInjectionLanguage.g:186:2: iv_ruleStaticImport= ruleStaticImport EOF
            {
             newCompositeNode(grammarAccess.getStaticImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaticImport=ruleStaticImport();

            state._fsp--;

             current =iv_ruleStaticImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticImport"


    // $ANTLR start "ruleStaticImport"
    // InternalInjectionLanguage.g:192:1: ruleStaticImport returns [EObject current=null] : (otherlv_0= 'import' otherlv_1= 'static' ( (lv_namespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' ) ;
    public final EObject ruleStaticImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_namespace_2_0 = null;



        	enterRule();

        try {
            // InternalInjectionLanguage.g:198:2: ( (otherlv_0= 'import' otherlv_1= 'static' ( (lv_namespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' ) )
            // InternalInjectionLanguage.g:199:2: (otherlv_0= 'import' otherlv_1= 'static' ( (lv_namespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' )
            {
            // InternalInjectionLanguage.g:199:2: (otherlv_0= 'import' otherlv_1= 'static' ( (lv_namespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' )
            // InternalInjectionLanguage.g:200:3: otherlv_0= 'import' otherlv_1= 'static' ( (lv_namespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getStaticImportAccess().getImportKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStaticImportAccess().getStaticKeyword_1());
            		
            // InternalInjectionLanguage.g:208:3: ( (lv_namespace_2_0= ruleQualifiedNameWithWildcard ) )
            // InternalInjectionLanguage.g:209:4: (lv_namespace_2_0= ruleQualifiedNameWithWildcard )
            {
            // InternalInjectionLanguage.g:209:4: (lv_namespace_2_0= ruleQualifiedNameWithWildcard )
            // InternalInjectionLanguage.g:210:5: lv_namespace_2_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getStaticImportAccess().getNamespaceQualifiedNameWithWildcardParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_namespace_2_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaticImportRule());
            					}
            					set(
            						current,
            						"namespace",
            						lv_namespace_2_0,
            						"org.moflon.emf.injection.InjectionLanguage.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStaticImportAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticImport"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalInjectionLanguage.g:235:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalInjectionLanguage.g:235:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalInjectionLanguage.g:236:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalInjectionLanguage.g:242:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalInjectionLanguage.g:248:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalInjectionLanguage.g:249:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalInjectionLanguage.g:249:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalInjectionLanguage.g:250:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalInjectionLanguage.g:257:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalInjectionLanguage.g:258:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalInjectionLanguage.g:275:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalInjectionLanguage.g:275:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalInjectionLanguage.g:276:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalInjectionLanguage.g:282:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalInjectionLanguage.g:288:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalInjectionLanguage.g:289:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalInjectionLanguage.g:289:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalInjectionLanguage.g:290:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalInjectionLanguage.g:300:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalInjectionLanguage.g:301:4: kw= '.*'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleClassDeclaration"
    // InternalInjectionLanguage.g:311:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // InternalInjectionLanguage.g:311:57: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // InternalInjectionLanguage.g:312:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
            {
             newCompositeNode(grammarAccess.getClassDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDeclaration=ruleClassDeclaration();

            state._fsp--;

             current =iv_ruleClassDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // InternalInjectionLanguage.g:318:1: ruleClassDeclaration returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleJavaAnnotation ) )* otherlv_1= 'partial' otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_classInjectionDeclaration_5_0= ruleClassInjectionDeclaration ) )? ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}' ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_className_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_classInjectionDeclaration_5_0 = null;

        EObject lv_methodDeclarations_6_0 = null;



        	enterRule();

        try {
            // InternalInjectionLanguage.g:324:2: ( ( ( (lv_annotations_0_0= ruleJavaAnnotation ) )* otherlv_1= 'partial' otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_classInjectionDeclaration_5_0= ruleClassInjectionDeclaration ) )? ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}' ) )
            // InternalInjectionLanguage.g:325:2: ( ( (lv_annotations_0_0= ruleJavaAnnotation ) )* otherlv_1= 'partial' otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_classInjectionDeclaration_5_0= ruleClassInjectionDeclaration ) )? ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}' )
            {
            // InternalInjectionLanguage.g:325:2: ( ( (lv_annotations_0_0= ruleJavaAnnotation ) )* otherlv_1= 'partial' otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_classInjectionDeclaration_5_0= ruleClassInjectionDeclaration ) )? ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}' )
            // InternalInjectionLanguage.g:326:3: ( (lv_annotations_0_0= ruleJavaAnnotation ) )* otherlv_1= 'partial' otherlv_2= 'class' ( (lv_className_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_classInjectionDeclaration_5_0= ruleClassInjectionDeclaration ) )? ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )* otherlv_7= '}'
            {
            // InternalInjectionLanguage.g:326:3: ( (lv_annotations_0_0= ruleJavaAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalInjectionLanguage.g:327:4: (lv_annotations_0_0= ruleJavaAnnotation )
            	    {
            	    // InternalInjectionLanguage.g:327:4: (lv_annotations_0_0= ruleJavaAnnotation )
            	    // InternalInjectionLanguage.g:328:5: lv_annotations_0_0= ruleJavaAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getClassDeclarationAccess().getAnnotationsJavaAnnotationParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_annotations_0_0=ruleJavaAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_0_0,
            	    						"org.moflon.emf.injection.InjectionLanguage.JavaAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getClassDeclarationAccess().getPartialKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getClassDeclarationAccess().getClassKeyword_2());
            		
            // InternalInjectionLanguage.g:353:3: ( (lv_className_3_0= RULE_ID ) )
            // InternalInjectionLanguage.g:354:4: (lv_className_3_0= RULE_ID )
            {
            // InternalInjectionLanguage.g:354:4: (lv_className_3_0= RULE_ID )
            // InternalInjectionLanguage.g:355:5: lv_className_3_0= RULE_ID
            {
            lv_className_3_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_className_3_0, grammarAccess.getClassDeclarationAccess().getClassNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"className",
            						lv_className_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getClassDeclarationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalInjectionLanguage.g:375:3: ( (lv_classInjectionDeclaration_5_0= ruleClassInjectionDeclaration ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalInjectionLanguage.g:376:4: (lv_classInjectionDeclaration_5_0= ruleClassInjectionDeclaration )
                    {
                    // InternalInjectionLanguage.g:376:4: (lv_classInjectionDeclaration_5_0= ruleClassInjectionDeclaration )
                    // InternalInjectionLanguage.g:377:5: lv_classInjectionDeclaration_5_0= ruleClassInjectionDeclaration
                    {

                    					newCompositeNode(grammarAccess.getClassDeclarationAccess().getClassInjectionDeclarationClassInjectionDeclarationParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_classInjectionDeclaration_5_0=ruleClassInjectionDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                    					}
                    					set(
                    						current,
                    						"classInjectionDeclaration",
                    						lv_classInjectionDeclaration_5_0,
                    						"org.moflon.emf.injection.InjectionLanguage.ClassInjectionDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalInjectionLanguage.g:394:3: ( (lv_methodDeclarations_6_0= ruleMethodDeclaration ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalInjectionLanguage.g:395:4: (lv_methodDeclarations_6_0= ruleMethodDeclaration )
            	    {
            	    // InternalInjectionLanguage.g:395:4: (lv_methodDeclarations_6_0= ruleMethodDeclaration )
            	    // InternalInjectionLanguage.g:396:5: lv_methodDeclarations_6_0= ruleMethodDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getClassDeclarationAccess().getMethodDeclarationsMethodDeclarationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_methodDeclarations_6_0=ruleMethodDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methodDeclarations",
            	    						lv_methodDeclarations_6_0,
            	    						"org.moflon.emf.injection.InjectionLanguage.MethodDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getClassDeclarationAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleJavaAnnotation"
    // InternalInjectionLanguage.g:421:1: entryRuleJavaAnnotation returns [EObject current=null] : iv_ruleJavaAnnotation= ruleJavaAnnotation EOF ;
    public final EObject entryRuleJavaAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaAnnotation = null;


        try {
            // InternalInjectionLanguage.g:421:55: (iv_ruleJavaAnnotation= ruleJavaAnnotation EOF )
            // InternalInjectionLanguage.g:422:2: iv_ruleJavaAnnotation= ruleJavaAnnotation EOF
            {
             newCompositeNode(grammarAccess.getJavaAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJavaAnnotation=ruleJavaAnnotation();

            state._fsp--;

             current =iv_ruleJavaAnnotation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJavaAnnotation"


    // $ANTLR start "ruleJavaAnnotation"
    // InternalInjectionLanguage.g:428:1: ruleJavaAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_STRING ) ) otherlv_4= ')' ) ;
    public final EObject ruleJavaAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_parameter_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalInjectionLanguage.g:434:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_STRING ) ) otherlv_4= ')' ) )
            // InternalInjectionLanguage.g:435:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_STRING ) ) otherlv_4= ')' )
            {
            // InternalInjectionLanguage.g:435:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_STRING ) ) otherlv_4= ')' )
            // InternalInjectionLanguage.g:436:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= RULE_STRING ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getJavaAnnotationAccess().getCommercialAtKeyword_0());
            		
            // InternalInjectionLanguage.g:440:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalInjectionLanguage.g:441:4: (lv_name_1_0= RULE_ID )
            {
            // InternalInjectionLanguage.g:441:4: (lv_name_1_0= RULE_ID )
            // InternalInjectionLanguage.g:442:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJavaAnnotationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJavaAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getJavaAnnotationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalInjectionLanguage.g:462:3: ( (lv_parameter_3_0= RULE_STRING ) )
            // InternalInjectionLanguage.g:463:4: (lv_parameter_3_0= RULE_STRING )
            {
            // InternalInjectionLanguage.g:463:4: (lv_parameter_3_0= RULE_STRING )
            // InternalInjectionLanguage.g:464:5: lv_parameter_3_0= RULE_STRING
            {
            lv_parameter_3_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

            					newLeafNode(lv_parameter_3_0, grammarAccess.getJavaAnnotationAccess().getParameterSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJavaAnnotationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parameter",
            						lv_parameter_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJavaAnnotationAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJavaAnnotation"


    // $ANTLR start "entryRuleClassInjectionDeclaration"
    // InternalInjectionLanguage.g:488:1: entryRuleClassInjectionDeclaration returns [EObject current=null] : iv_ruleClassInjectionDeclaration= ruleClassInjectionDeclaration EOF ;
    public final EObject entryRuleClassInjectionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassInjectionDeclaration = null;


        try {
            // InternalInjectionLanguage.g:488:66: (iv_ruleClassInjectionDeclaration= ruleClassInjectionDeclaration EOF )
            // InternalInjectionLanguage.g:489:2: iv_ruleClassInjectionDeclaration= ruleClassInjectionDeclaration EOF
            {
             newCompositeNode(grammarAccess.getClassInjectionDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassInjectionDeclaration=ruleClassInjectionDeclaration();

            state._fsp--;

             current =iv_ruleClassInjectionDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassInjectionDeclaration"


    // $ANTLR start "ruleClassInjectionDeclaration"
    // InternalInjectionLanguage.g:495:1: ruleClassInjectionDeclaration returns [EObject current=null] : (otherlv_0= '@members' ( (lv_body_1_0= RULE_CODE_BLOCK ) ) ) ;
    public final EObject ruleClassInjectionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_body_1_0=null;


        	enterRule();

        try {
            // InternalInjectionLanguage.g:501:2: ( (otherlv_0= '@members' ( (lv_body_1_0= RULE_CODE_BLOCK ) ) ) )
            // InternalInjectionLanguage.g:502:2: (otherlv_0= '@members' ( (lv_body_1_0= RULE_CODE_BLOCK ) ) )
            {
            // InternalInjectionLanguage.g:502:2: (otherlv_0= '@members' ( (lv_body_1_0= RULE_CODE_BLOCK ) ) )
            // InternalInjectionLanguage.g:503:3: otherlv_0= '@members' ( (lv_body_1_0= RULE_CODE_BLOCK ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getClassInjectionDeclarationAccess().getMembersKeyword_0());
            		
            // InternalInjectionLanguage.g:507:3: ( (lv_body_1_0= RULE_CODE_BLOCK ) )
            // InternalInjectionLanguage.g:508:4: (lv_body_1_0= RULE_CODE_BLOCK )
            {
            // InternalInjectionLanguage.g:508:4: (lv_body_1_0= RULE_CODE_BLOCK )
            // InternalInjectionLanguage.g:509:5: lv_body_1_0= RULE_CODE_BLOCK
            {
            lv_body_1_0=(Token)match(input,RULE_CODE_BLOCK,FOLLOW_2); 

            					newLeafNode(lv_body_1_0, grammarAccess.getClassInjectionDeclarationAccess().getBodyCODE_BLOCKTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassInjectionDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_1_0,
            						"org.moflon.emf.injection.InjectionLanguage.CODE_BLOCK");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassInjectionDeclaration"


    // $ANTLR start "entryRuleMethodDeclaration"
    // InternalInjectionLanguage.g:529:1: entryRuleMethodDeclaration returns [EObject current=null] : iv_ruleMethodDeclaration= ruleMethodDeclaration EOF ;
    public final EObject entryRuleMethodDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDeclaration = null;


        try {
            // InternalInjectionLanguage.g:529:58: (iv_ruleMethodDeclaration= ruleMethodDeclaration EOF )
            // InternalInjectionLanguage.g:530:2: iv_ruleMethodDeclaration= ruleMethodDeclaration EOF
            {
             newCompositeNode(grammarAccess.getMethodDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodDeclaration=ruleMethodDeclaration();

            state._fsp--;

             current =iv_ruleMethodDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodDeclaration"


    // $ANTLR start "ruleMethodDeclaration"
    // InternalInjectionLanguage.g:536:1: ruleMethodDeclaration returns [EObject current=null] : (otherlv_0= '@model' ( (lv_methodName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameterDeclaration ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' ( (lv_body_7_0= RULE_CODE_BLOCK ) ) ) ;
    public final EObject ruleMethodDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_methodName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_body_7_0=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalInjectionLanguage.g:542:2: ( (otherlv_0= '@model' ( (lv_methodName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameterDeclaration ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' ( (lv_body_7_0= RULE_CODE_BLOCK ) ) ) )
            // InternalInjectionLanguage.g:543:2: (otherlv_0= '@model' ( (lv_methodName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameterDeclaration ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' ( (lv_body_7_0= RULE_CODE_BLOCK ) ) )
            {
            // InternalInjectionLanguage.g:543:2: (otherlv_0= '@model' ( (lv_methodName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameterDeclaration ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' ( (lv_body_7_0= RULE_CODE_BLOCK ) ) )
            // InternalInjectionLanguage.g:544:3: otherlv_0= '@model' ( (lv_methodName_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameters_3_0= ruleParameterDeclaration ) )? (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' ( (lv_body_7_0= RULE_CODE_BLOCK ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodDeclarationAccess().getModelKeyword_0());
            		
            // InternalInjectionLanguage.g:548:3: ( (lv_methodName_1_0= RULE_ID ) )
            // InternalInjectionLanguage.g:549:4: (lv_methodName_1_0= RULE_ID )
            {
            // InternalInjectionLanguage.g:549:4: (lv_methodName_1_0= RULE_ID )
            // InternalInjectionLanguage.g:550:5: lv_methodName_1_0= RULE_ID
            {
            lv_methodName_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_methodName_1_0, grammarAccess.getMethodDeclarationAccess().getMethodNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"methodName",
            						lv_methodName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodDeclarationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalInjectionLanguage.g:570:3: ( (lv_parameters_3_0= ruleParameterDeclaration ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalInjectionLanguage.g:571:4: (lv_parameters_3_0= ruleParameterDeclaration )
                    {
                    // InternalInjectionLanguage.g:571:4: (lv_parameters_3_0= ruleParameterDeclaration )
                    // InternalInjectionLanguage.g:572:5: lv_parameters_3_0= ruleParameterDeclaration
                    {

                    					newCompositeNode(grammarAccess.getMethodDeclarationAccess().getParametersParameterDeclarationParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_19);
                    lv_parameters_3_0=ruleParameterDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
                    					}
                    					add(
                    						current,
                    						"parameters",
                    						lv_parameters_3_0,
                    						"org.moflon.emf.injection.InjectionLanguage.ParameterDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalInjectionLanguage.g:589:3: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalInjectionLanguage.g:590:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameterDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMethodDeclarationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalInjectionLanguage.g:594:4: ( (lv_parameters_5_0= ruleParameterDeclaration ) )
            	    // InternalInjectionLanguage.g:595:5: (lv_parameters_5_0= ruleParameterDeclaration )
            	    {
            	    // InternalInjectionLanguage.g:595:5: (lv_parameters_5_0= ruleParameterDeclaration )
            	    // InternalInjectionLanguage.g:596:6: lv_parameters_5_0= ruleParameterDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getMethodDeclarationAccess().getParametersParameterDeclarationParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_parameters_5_0=ruleParameterDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMethodDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_5_0,
            	    							"org.moflon.emf.injection.InjectionLanguage.ParameterDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodDeclarationAccess().getRightParenthesisKeyword_5());
            		
            // InternalInjectionLanguage.g:618:3: ( (lv_body_7_0= RULE_CODE_BLOCK ) )
            // InternalInjectionLanguage.g:619:4: (lv_body_7_0= RULE_CODE_BLOCK )
            {
            // InternalInjectionLanguage.g:619:4: (lv_body_7_0= RULE_CODE_BLOCK )
            // InternalInjectionLanguage.g:620:5: lv_body_7_0= RULE_CODE_BLOCK
            {
            lv_body_7_0=(Token)match(input,RULE_CODE_BLOCK,FOLLOW_2); 

            					newLeafNode(lv_body_7_0, grammarAccess.getMethodDeclarationAccess().getBodyCODE_BLOCKTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"body",
            						lv_body_7_0,
            						"org.moflon.emf.injection.InjectionLanguage.CODE_BLOCK");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodDeclaration"


    // $ANTLR start "entryRuleParameterDeclaration"
    // InternalInjectionLanguage.g:640:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // InternalInjectionLanguage.g:640:61: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // InternalInjectionLanguage.g:641:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;

             current =iv_ruleParameterDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // InternalInjectionLanguage.g:647:1: ruleParameterDeclaration returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleQualifiedName ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_parameterName_1_0=null;
        AntlrDatatypeRuleToken lv_parameterType_0_0 = null;



        	enterRule();

        try {
            // InternalInjectionLanguage.g:653:2: ( ( ( (lv_parameterType_0_0= ruleQualifiedName ) ) ( (lv_parameterName_1_0= RULE_ID ) ) ) )
            // InternalInjectionLanguage.g:654:2: ( ( (lv_parameterType_0_0= ruleQualifiedName ) ) ( (lv_parameterName_1_0= RULE_ID ) ) )
            {
            // InternalInjectionLanguage.g:654:2: ( ( (lv_parameterType_0_0= ruleQualifiedName ) ) ( (lv_parameterName_1_0= RULE_ID ) ) )
            // InternalInjectionLanguage.g:655:3: ( (lv_parameterType_0_0= ruleQualifiedName ) ) ( (lv_parameterName_1_0= RULE_ID ) )
            {
            // InternalInjectionLanguage.g:655:3: ( (lv_parameterType_0_0= ruleQualifiedName ) )
            // InternalInjectionLanguage.g:656:4: (lv_parameterType_0_0= ruleQualifiedName )
            {
            // InternalInjectionLanguage.g:656:4: (lv_parameterType_0_0= ruleQualifiedName )
            // InternalInjectionLanguage.g:657:5: lv_parameterType_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getParameterDeclarationAccess().getParameterTypeQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_parameterType_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
            					}
            					set(
            						current,
            						"parameterType",
            						lv_parameterType_0_0,
            						"org.moflon.emf.injection.InjectionLanguage.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalInjectionLanguage.g:674:3: ( (lv_parameterName_1_0= RULE_ID ) )
            // InternalInjectionLanguage.g:675:4: (lv_parameterName_1_0= RULE_ID )
            {
            // InternalInjectionLanguage.g:675:4: (lv_parameterName_1_0= RULE_ID )
            // InternalInjectionLanguage.g:676:5: lv_parameterName_1_0= RULE_ID
            {
            lv_parameterName_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_parameterName_1_0, grammarAccess.getParameterDeclarationAccess().getParameterNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"parameterName",
            						lv_parameterName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDeclaration"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000884000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000C400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000012000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000012000000L});

}