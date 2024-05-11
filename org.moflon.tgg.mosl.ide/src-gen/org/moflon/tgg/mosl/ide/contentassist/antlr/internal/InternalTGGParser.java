package org.moflon.tgg.mosl.ide.contentassist.antlr.internal;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.moflon.tgg.mosl.services.TGGGrammarAccess;

@SuppressWarnings("all")
public class InternalTGGParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOL", "RULE_ID", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'<='", "'>='", "'>'", "'<'", "'++'", "'!'", "'--'", "'#schema'", "'#source'", "'{'", "'}'", "'#target'", "'#correspondence'", "'#attributeConditions'", "'#extends'", "'#src->'", "'#trg->'", "'('", "')'", "'#sync:'", "','", "'#gen:'", "':'", "'.'", "'#rule'", "'#with'", "'#complements'", "'#library'", "'enum::'", "'::'", "'-'", "'->'", "'#import'", "'#using'", "'.*'", "'#userDefined'", "'#abstract'", "':='"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=6;
    public static final int RULE_DECIMAL=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_BOOL=5;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTGGParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTGGParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTGGParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTGG.g"; }


    	private TGGGrammarAccess grammarAccess;

    	public void setGrammarAccess(TGGGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTripleGraphGrammarFile"
    // InternalTGG.g:53:1: entryRuleTripleGraphGrammarFile : ruleTripleGraphGrammarFile EOF ;
    public final void entryRuleTripleGraphGrammarFile() throws RecognitionException {
        try {
            // InternalTGG.g:54:1: ( ruleTripleGraphGrammarFile EOF )
            // InternalTGG.g:55:1: ruleTripleGraphGrammarFile EOF
            {
             before(grammarAccess.getTripleGraphGrammarFileRule()); 
            pushFollow(FOLLOW_1);
            ruleTripleGraphGrammarFile();

            state._fsp--;

             after(grammarAccess.getTripleGraphGrammarFileRule()); 
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
    // $ANTLR end "entryRuleTripleGraphGrammarFile"


    // $ANTLR start "ruleTripleGraphGrammarFile"
    // InternalTGG.g:62:1: ruleTripleGraphGrammarFile : ( ( rule__TripleGraphGrammarFile__Group__0 ) ) ;
    public final void ruleTripleGraphGrammarFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:66:2: ( ( ( rule__TripleGraphGrammarFile__Group__0 ) ) )
            // InternalTGG.g:67:2: ( ( rule__TripleGraphGrammarFile__Group__0 ) )
            {
            // InternalTGG.g:67:2: ( ( rule__TripleGraphGrammarFile__Group__0 ) )
            // InternalTGG.g:68:3: ( rule__TripleGraphGrammarFile__Group__0 )
            {
             before(grammarAccess.getTripleGraphGrammarFileAccess().getGroup()); 
            // InternalTGG.g:69:3: ( rule__TripleGraphGrammarFile__Group__0 )
            // InternalTGG.g:69:4: rule__TripleGraphGrammarFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TripleGraphGrammarFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTripleGraphGrammarFileAccess().getGroup()); 

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
    // $ANTLR end "ruleTripleGraphGrammarFile"


    // $ANTLR start "entryRuleSchema"
    // InternalTGG.g:78:1: entryRuleSchema : ruleSchema EOF ;
    public final void entryRuleSchema() throws RecognitionException {
        try {
            // InternalTGG.g:79:1: ( ruleSchema EOF )
            // InternalTGG.g:80:1: ruleSchema EOF
            {
             before(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getSchemaRule()); 
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
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalTGG.g:87:1: ruleSchema : ( ( rule__Schema__Group__0 ) ) ;
    public final void ruleSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:91:2: ( ( ( rule__Schema__Group__0 ) ) )
            // InternalTGG.g:92:2: ( ( rule__Schema__Group__0 ) )
            {
            // InternalTGG.g:92:2: ( ( rule__Schema__Group__0 ) )
            // InternalTGG.g:93:3: ( rule__Schema__Group__0 )
            {
             before(grammarAccess.getSchemaAccess().getGroup()); 
            // InternalTGG.g:94:3: ( rule__Schema__Group__0 )
            // InternalTGG.g:94:4: rule__Schema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getGroup()); 

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
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleCorrType"
    // InternalTGG.g:103:1: entryRuleCorrType : ruleCorrType EOF ;
    public final void entryRuleCorrType() throws RecognitionException {
        try {
            // InternalTGG.g:104:1: ( ruleCorrType EOF )
            // InternalTGG.g:105:1: ruleCorrType EOF
            {
             before(grammarAccess.getCorrTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCorrType();

            state._fsp--;

             after(grammarAccess.getCorrTypeRule()); 
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
    // $ANTLR end "entryRuleCorrType"


    // $ANTLR start "ruleCorrType"
    // InternalTGG.g:112:1: ruleCorrType : ( ( rule__CorrType__Group__0 ) ) ;
    public final void ruleCorrType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:116:2: ( ( ( rule__CorrType__Group__0 ) ) )
            // InternalTGG.g:117:2: ( ( rule__CorrType__Group__0 ) )
            {
            // InternalTGG.g:117:2: ( ( rule__CorrType__Group__0 ) )
            // InternalTGG.g:118:3: ( rule__CorrType__Group__0 )
            {
             before(grammarAccess.getCorrTypeAccess().getGroup()); 
            // InternalTGG.g:119:3: ( rule__CorrType__Group__0 )
            // InternalTGG.g:119:4: rule__CorrType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CorrType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCorrTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleCorrType"


    // $ANTLR start "entryRuleAttrCondDef"
    // InternalTGG.g:128:1: entryRuleAttrCondDef : ruleAttrCondDef EOF ;
    public final void entryRuleAttrCondDef() throws RecognitionException {
        try {
            // InternalTGG.g:129:1: ( ruleAttrCondDef EOF )
            // InternalTGG.g:130:1: ruleAttrCondDef EOF
            {
             before(grammarAccess.getAttrCondDefRule()); 
            pushFollow(FOLLOW_1);
            ruleAttrCondDef();

            state._fsp--;

             after(grammarAccess.getAttrCondDefRule()); 
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
    // $ANTLR end "entryRuleAttrCondDef"


    // $ANTLR start "ruleAttrCondDef"
    // InternalTGG.g:137:1: ruleAttrCondDef : ( ( rule__AttrCondDef__Group__0 ) ) ;
    public final void ruleAttrCondDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:141:2: ( ( ( rule__AttrCondDef__Group__0 ) ) )
            // InternalTGG.g:142:2: ( ( rule__AttrCondDef__Group__0 ) )
            {
            // InternalTGG.g:142:2: ( ( rule__AttrCondDef__Group__0 ) )
            // InternalTGG.g:143:3: ( rule__AttrCondDef__Group__0 )
            {
             before(grammarAccess.getAttrCondDefAccess().getGroup()); 
            // InternalTGG.g:144:3: ( rule__AttrCondDef__Group__0 )
            // InternalTGG.g:144:4: rule__AttrCondDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondDefAccess().getGroup()); 

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
    // $ANTLR end "ruleAttrCondDef"


    // $ANTLR start "entryRuleParam"
    // InternalTGG.g:153:1: entryRuleParam : ruleParam EOF ;
    public final void entryRuleParam() throws RecognitionException {
        try {
            // InternalTGG.g:154:1: ( ruleParam EOF )
            // InternalTGG.g:155:1: ruleParam EOF
            {
             before(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getParamRule()); 
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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalTGG.g:162:1: ruleParam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:166:2: ( ( ( rule__Param__Group__0 ) ) )
            // InternalTGG.g:167:2: ( ( rule__Param__Group__0 ) )
            {
            // InternalTGG.g:167:2: ( ( rule__Param__Group__0 ) )
            // InternalTGG.g:168:3: ( rule__Param__Group__0 )
            {
             before(grammarAccess.getParamAccess().getGroup()); 
            // InternalTGG.g:169:3: ( rule__Param__Group__0 )
            // InternalTGG.g:169:4: rule__Param__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getGroup()); 

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleParamType"
    // InternalTGG.g:178:1: entryRuleParamType : ruleParamType EOF ;
    public final void entryRuleParamType() throws RecognitionException {
        try {
            // InternalTGG.g:179:1: ( ruleParamType EOF )
            // InternalTGG.g:180:1: ruleParamType EOF
            {
             before(grammarAccess.getParamTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleParamType();

            state._fsp--;

             after(grammarAccess.getParamTypeRule()); 
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
    // $ANTLR end "entryRuleParamType"


    // $ANTLR start "ruleParamType"
    // InternalTGG.g:187:1: ruleParamType : ( ( rule__ParamType__Group__0 )? ) ;
    public final void ruleParamType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:191:2: ( ( ( rule__ParamType__Group__0 )? ) )
            // InternalTGG.g:192:2: ( ( rule__ParamType__Group__0 )? )
            {
            // InternalTGG.g:192:2: ( ( rule__ParamType__Group__0 )? )
            // InternalTGG.g:193:3: ( rule__ParamType__Group__0 )?
            {
             before(grammarAccess.getParamTypeAccess().getGroup()); 
            // InternalTGG.g:194:3: ( rule__ParamType__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalTGG.g:194:4: rule__ParamType__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParamType__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParamTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleParamType"


    // $ANTLR start "entryRuleRule"
    // InternalTGG.g:203:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalTGG.g:204:1: ( ruleRule EOF )
            // InternalTGG.g:205:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalTGG.g:212:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:216:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalTGG.g:217:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalTGG.g:217:2: ( ( rule__Rule__Group__0 ) )
            // InternalTGG.g:218:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalTGG.g:219:3: ( rule__Rule__Group__0 )
            // InternalTGG.g:219:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleAttrCond"
    // InternalTGG.g:228:1: entryRuleAttrCond : ruleAttrCond EOF ;
    public final void entryRuleAttrCond() throws RecognitionException {
        try {
            // InternalTGG.g:229:1: ( ruleAttrCond EOF )
            // InternalTGG.g:230:1: ruleAttrCond EOF
            {
             before(grammarAccess.getAttrCondRule()); 
            pushFollow(FOLLOW_1);
            ruleAttrCond();

            state._fsp--;

             after(grammarAccess.getAttrCondRule()); 
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
    // $ANTLR end "entryRuleAttrCond"


    // $ANTLR start "ruleAttrCond"
    // InternalTGG.g:237:1: ruleAttrCond : ( ( rule__AttrCond__Group__0 ) ) ;
    public final void ruleAttrCond() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:241:2: ( ( ( rule__AttrCond__Group__0 ) ) )
            // InternalTGG.g:242:2: ( ( rule__AttrCond__Group__0 ) )
            {
            // InternalTGG.g:242:2: ( ( rule__AttrCond__Group__0 ) )
            // InternalTGG.g:243:3: ( rule__AttrCond__Group__0 )
            {
             before(grammarAccess.getAttrCondAccess().getGroup()); 
            // InternalTGG.g:244:3: ( rule__AttrCond__Group__0 )
            // InternalTGG.g:244:4: rule__AttrCond__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttrCond__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondAccess().getGroup()); 

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
    // $ANTLR end "ruleAttrCond"


    // $ANTLR start "entryRuleAttrCondDefLibrary"
    // InternalTGG.g:253:1: entryRuleAttrCondDefLibrary : ruleAttrCondDefLibrary EOF ;
    public final void entryRuleAttrCondDefLibrary() throws RecognitionException {
        try {
            // InternalTGG.g:254:1: ( ruleAttrCondDefLibrary EOF )
            // InternalTGG.g:255:1: ruleAttrCondDefLibrary EOF
            {
             before(grammarAccess.getAttrCondDefLibraryRule()); 
            pushFollow(FOLLOW_1);
            ruleAttrCondDefLibrary();

            state._fsp--;

             after(grammarAccess.getAttrCondDefLibraryRule()); 
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
    // $ANTLR end "entryRuleAttrCondDefLibrary"


    // $ANTLR start "ruleAttrCondDefLibrary"
    // InternalTGG.g:262:1: ruleAttrCondDefLibrary : ( ( rule__AttrCondDefLibrary__Group__0 ) ) ;
    public final void ruleAttrCondDefLibrary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:266:2: ( ( ( rule__AttrCondDefLibrary__Group__0 ) ) )
            // InternalTGG.g:267:2: ( ( rule__AttrCondDefLibrary__Group__0 ) )
            {
            // InternalTGG.g:267:2: ( ( rule__AttrCondDefLibrary__Group__0 ) )
            // InternalTGG.g:268:3: ( rule__AttrCondDefLibrary__Group__0 )
            {
             before(grammarAccess.getAttrCondDefLibraryAccess().getGroup()); 
            // InternalTGG.g:269:3: ( rule__AttrCondDefLibrary__Group__0 )
            // InternalTGG.g:269:4: rule__AttrCondDefLibrary__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDefLibrary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondDefLibraryAccess().getGroup()); 

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
    // $ANTLR end "ruleAttrCondDefLibrary"


    // $ANTLR start "entryRuleAdornment"
    // InternalTGG.g:278:1: entryRuleAdornment : ruleAdornment EOF ;
    public final void entryRuleAdornment() throws RecognitionException {
        try {
            // InternalTGG.g:279:1: ( ruleAdornment EOF )
            // InternalTGG.g:280:1: ruleAdornment EOF
            {
             before(grammarAccess.getAdornmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAdornment();

            state._fsp--;

             after(grammarAccess.getAdornmentRule()); 
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
    // $ANTLR end "entryRuleAdornment"


    // $ANTLR start "ruleAdornment"
    // InternalTGG.g:287:1: ruleAdornment : ( ( rule__Adornment__ValueAssignment ) ) ;
    public final void ruleAdornment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:291:2: ( ( ( rule__Adornment__ValueAssignment ) ) )
            // InternalTGG.g:292:2: ( ( rule__Adornment__ValueAssignment ) )
            {
            // InternalTGG.g:292:2: ( ( rule__Adornment__ValueAssignment ) )
            // InternalTGG.g:293:3: ( rule__Adornment__ValueAssignment )
            {
             before(grammarAccess.getAdornmentAccess().getValueAssignment()); 
            // InternalTGG.g:294:3: ( rule__Adornment__ValueAssignment )
            // InternalTGG.g:294:4: rule__Adornment__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Adornment__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAdornmentAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleAdornment"


    // $ANTLR start "entryRuleParamValue"
    // InternalTGG.g:303:1: entryRuleParamValue : ruleParamValue EOF ;
    public final void entryRuleParamValue() throws RecognitionException {
        try {
            // InternalTGG.g:304:1: ( ruleParamValue EOF )
            // InternalTGG.g:305:1: ruleParamValue EOF
            {
             before(grammarAccess.getParamValueRule()); 
            pushFollow(FOLLOW_1);
            ruleParamValue();

            state._fsp--;

             after(grammarAccess.getParamValueRule()); 
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
    // $ANTLR end "entryRuleParamValue"


    // $ANTLR start "ruleParamValue"
    // InternalTGG.g:312:1: ruleParamValue : ( ( rule__ParamValue__Alternatives ) ) ;
    public final void ruleParamValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:316:2: ( ( ( rule__ParamValue__Alternatives ) ) )
            // InternalTGG.g:317:2: ( ( rule__ParamValue__Alternatives ) )
            {
            // InternalTGG.g:317:2: ( ( rule__ParamValue__Alternatives ) )
            // InternalTGG.g:318:3: ( rule__ParamValue__Alternatives )
            {
             before(grammarAccess.getParamValueAccess().getAlternatives()); 
            // InternalTGG.g:319:3: ( rule__ParamValue__Alternatives )
            // InternalTGG.g:319:4: rule__ParamValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ParamValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParamValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleParamValue"


    // $ANTLR start "entryRuleAttributeVariable"
    // InternalTGG.g:328:1: entryRuleAttributeVariable : ruleAttributeVariable EOF ;
    public final void entryRuleAttributeVariable() throws RecognitionException {
        try {
            // InternalTGG.g:329:1: ( ruleAttributeVariable EOF )
            // InternalTGG.g:330:1: ruleAttributeVariable EOF
            {
             before(grammarAccess.getAttributeVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeVariable();

            state._fsp--;

             after(grammarAccess.getAttributeVariableRule()); 
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
    // $ANTLR end "entryRuleAttributeVariable"


    // $ANTLR start "ruleAttributeVariable"
    // InternalTGG.g:337:1: ruleAttributeVariable : ( ( rule__AttributeVariable__Group__0 ) ) ;
    public final void ruleAttributeVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:341:2: ( ( ( rule__AttributeVariable__Group__0 ) ) )
            // InternalTGG.g:342:2: ( ( rule__AttributeVariable__Group__0 ) )
            {
            // InternalTGG.g:342:2: ( ( rule__AttributeVariable__Group__0 ) )
            // InternalTGG.g:343:3: ( rule__AttributeVariable__Group__0 )
            {
             before(grammarAccess.getAttributeVariableAccess().getGroup()); 
            // InternalTGG.g:344:3: ( rule__AttributeVariable__Group__0 )
            // InternalTGG.g:344:4: rule__AttributeVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeVariable"


    // $ANTLR start "entryRuleLocalVariable"
    // InternalTGG.g:353:1: entryRuleLocalVariable : ruleLocalVariable EOF ;
    public final void entryRuleLocalVariable() throws RecognitionException {
        try {
            // InternalTGG.g:354:1: ( ruleLocalVariable EOF )
            // InternalTGG.g:355:1: ruleLocalVariable EOF
            {
             before(grammarAccess.getLocalVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalVariable();

            state._fsp--;

             after(grammarAccess.getLocalVariableRule()); 
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
    // $ANTLR end "entryRuleLocalVariable"


    // $ANTLR start "ruleLocalVariable"
    // InternalTGG.g:362:1: ruleLocalVariable : ( ( rule__LocalVariable__NameAssignment ) ) ;
    public final void ruleLocalVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:366:2: ( ( ( rule__LocalVariable__NameAssignment ) ) )
            // InternalTGG.g:367:2: ( ( rule__LocalVariable__NameAssignment ) )
            {
            // InternalTGG.g:367:2: ( ( rule__LocalVariable__NameAssignment ) )
            // InternalTGG.g:368:3: ( rule__LocalVariable__NameAssignment )
            {
             before(grammarAccess.getLocalVariableAccess().getNameAssignment()); 
            // InternalTGG.g:369:3: ( rule__LocalVariable__NameAssignment )
            // InternalTGG.g:369:4: rule__LocalVariable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LocalVariable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleLocalVariable"


    // $ANTLR start "entryRuleCorrVariablePattern"
    // InternalTGG.g:378:1: entryRuleCorrVariablePattern : ruleCorrVariablePattern EOF ;
    public final void entryRuleCorrVariablePattern() throws RecognitionException {
        try {
            // InternalTGG.g:379:1: ( ruleCorrVariablePattern EOF )
            // InternalTGG.g:380:1: ruleCorrVariablePattern EOF
            {
             before(grammarAccess.getCorrVariablePatternRule()); 
            pushFollow(FOLLOW_1);
            ruleCorrVariablePattern();

            state._fsp--;

             after(grammarAccess.getCorrVariablePatternRule()); 
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
    // $ANTLR end "entryRuleCorrVariablePattern"


    // $ANTLR start "ruleCorrVariablePattern"
    // InternalTGG.g:387:1: ruleCorrVariablePattern : ( ( rule__CorrVariablePattern__Group__0 ) ) ;
    public final void ruleCorrVariablePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:391:2: ( ( ( rule__CorrVariablePattern__Group__0 ) ) )
            // InternalTGG.g:392:2: ( ( rule__CorrVariablePattern__Group__0 ) )
            {
            // InternalTGG.g:392:2: ( ( rule__CorrVariablePattern__Group__0 ) )
            // InternalTGG.g:393:3: ( rule__CorrVariablePattern__Group__0 )
            {
             before(grammarAccess.getCorrVariablePatternAccess().getGroup()); 
            // InternalTGG.g:394:3: ( rule__CorrVariablePattern__Group__0 )
            // InternalTGG.g:394:4: rule__CorrVariablePattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCorrVariablePatternAccess().getGroup()); 

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
    // $ANTLR end "ruleCorrVariablePattern"


    // $ANTLR start "entryRuleObjectVariablePattern"
    // InternalTGG.g:403:1: entryRuleObjectVariablePattern : ruleObjectVariablePattern EOF ;
    public final void entryRuleObjectVariablePattern() throws RecognitionException {
        try {
            // InternalTGG.g:404:1: ( ruleObjectVariablePattern EOF )
            // InternalTGG.g:405:1: ruleObjectVariablePattern EOF
            {
             before(grammarAccess.getObjectVariablePatternRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectVariablePattern();

            state._fsp--;

             after(grammarAccess.getObjectVariablePatternRule()); 
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
    // $ANTLR end "entryRuleObjectVariablePattern"


    // $ANTLR start "ruleObjectVariablePattern"
    // InternalTGG.g:412:1: ruleObjectVariablePattern : ( ( rule__ObjectVariablePattern__Group__0 ) ) ;
    public final void ruleObjectVariablePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:416:2: ( ( ( rule__ObjectVariablePattern__Group__0 ) ) )
            // InternalTGG.g:417:2: ( ( rule__ObjectVariablePattern__Group__0 ) )
            {
            // InternalTGG.g:417:2: ( ( rule__ObjectVariablePattern__Group__0 ) )
            // InternalTGG.g:418:3: ( rule__ObjectVariablePattern__Group__0 )
            {
             before(grammarAccess.getObjectVariablePatternAccess().getGroup()); 
            // InternalTGG.g:419:3: ( rule__ObjectVariablePattern__Group__0 )
            // InternalTGG.g:419:4: rule__ObjectVariablePattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectVariablePattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectVariablePatternAccess().getGroup()); 

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
    // $ANTLR end "ruleObjectVariablePattern"


    // $ANTLR start "entryRuleAttributeConstraint"
    // InternalTGG.g:428:1: entryRuleAttributeConstraint : ruleAttributeConstraint EOF ;
    public final void entryRuleAttributeConstraint() throws RecognitionException {
        try {
            // InternalTGG.g:429:1: ( ruleAttributeConstraint EOF )
            // InternalTGG.g:430:1: ruleAttributeConstraint EOF
            {
             before(grammarAccess.getAttributeConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeConstraint();

            state._fsp--;

             after(grammarAccess.getAttributeConstraintRule()); 
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
    // $ANTLR end "entryRuleAttributeConstraint"


    // $ANTLR start "ruleAttributeConstraint"
    // InternalTGG.g:437:1: ruleAttributeConstraint : ( ( rule__AttributeConstraint__Group__0 ) ) ;
    public final void ruleAttributeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:441:2: ( ( ( rule__AttributeConstraint__Group__0 ) ) )
            // InternalTGG.g:442:2: ( ( rule__AttributeConstraint__Group__0 ) )
            {
            // InternalTGG.g:442:2: ( ( rule__AttributeConstraint__Group__0 ) )
            // InternalTGG.g:443:3: ( rule__AttributeConstraint__Group__0 )
            {
             before(grammarAccess.getAttributeConstraintAccess().getGroup()); 
            // InternalTGG.g:444:3: ( rule__AttributeConstraint__Group__0 )
            // InternalTGG.g:444:4: rule__AttributeConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeConstraint"


    // $ANTLR start "entryRuleAttributeAssignment"
    // InternalTGG.g:453:1: entryRuleAttributeAssignment : ruleAttributeAssignment EOF ;
    public final void entryRuleAttributeAssignment() throws RecognitionException {
        try {
            // InternalTGG.g:454:1: ( ruleAttributeAssignment EOF )
            // InternalTGG.g:455:1: ruleAttributeAssignment EOF
            {
             before(grammarAccess.getAttributeAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeAssignment();

            state._fsp--;

             after(grammarAccess.getAttributeAssignmentRule()); 
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
    // $ANTLR end "entryRuleAttributeAssignment"


    // $ANTLR start "ruleAttributeAssignment"
    // InternalTGG.g:462:1: ruleAttributeAssignment : ( ( rule__AttributeAssignment__Group__0 ) ) ;
    public final void ruleAttributeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:466:2: ( ( ( rule__AttributeAssignment__Group__0 ) ) )
            // InternalTGG.g:467:2: ( ( rule__AttributeAssignment__Group__0 ) )
            {
            // InternalTGG.g:467:2: ( ( rule__AttributeAssignment__Group__0 ) )
            // InternalTGG.g:468:3: ( rule__AttributeAssignment__Group__0 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getGroup()); 
            // InternalTGG.g:469:3: ( rule__AttributeAssignment__Group__0 )
            // InternalTGG.g:469:4: rule__AttributeAssignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeAssignment"


    // $ANTLR start "entryRuleExpression"
    // InternalTGG.g:478:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalTGG.g:479:1: ( ruleExpression EOF )
            // InternalTGG.g:480:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTGG.g:487:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:491:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalTGG.g:492:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalTGG.g:492:2: ( ( rule__Expression__Alternatives ) )
            // InternalTGG.g:493:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalTGG.g:494:3: ( rule__Expression__Alternatives )
            // InternalTGG.g:494:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEnumExpression"
    // InternalTGG.g:503:1: entryRuleEnumExpression : ruleEnumExpression EOF ;
    public final void entryRuleEnumExpression() throws RecognitionException {
        try {
            // InternalTGG.g:504:1: ( ruleEnumExpression EOF )
            // InternalTGG.g:505:1: ruleEnumExpression EOF
            {
             before(grammarAccess.getEnumExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumExpression();

            state._fsp--;

             after(grammarAccess.getEnumExpressionRule()); 
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
    // $ANTLR end "entryRuleEnumExpression"


    // $ANTLR start "ruleEnumExpression"
    // InternalTGG.g:512:1: ruleEnumExpression : ( ( rule__EnumExpression__Group__0 ) ) ;
    public final void ruleEnumExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:516:2: ( ( ( rule__EnumExpression__Group__0 ) ) )
            // InternalTGG.g:517:2: ( ( rule__EnumExpression__Group__0 ) )
            {
            // InternalTGG.g:517:2: ( ( rule__EnumExpression__Group__0 ) )
            // InternalTGG.g:518:3: ( rule__EnumExpression__Group__0 )
            {
             before(grammarAccess.getEnumExpressionAccess().getGroup()); 
            // InternalTGG.g:519:3: ( rule__EnumExpression__Group__0 )
            // InternalTGG.g:519:4: rule__EnumExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleEnumExpression"


    // $ANTLR start "entryRuleAttributeExpression"
    // InternalTGG.g:528:1: entryRuleAttributeExpression : ruleAttributeExpression EOF ;
    public final void entryRuleAttributeExpression() throws RecognitionException {
        try {
            // InternalTGG.g:529:1: ( ruleAttributeExpression EOF )
            // InternalTGG.g:530:1: ruleAttributeExpression EOF
            {
             before(grammarAccess.getAttributeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeExpression();

            state._fsp--;

             after(grammarAccess.getAttributeExpressionRule()); 
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
    // $ANTLR end "entryRuleAttributeExpression"


    // $ANTLR start "ruleAttributeExpression"
    // InternalTGG.g:537:1: ruleAttributeExpression : ( ( rule__AttributeExpression__Group__0 ) ) ;
    public final void ruleAttributeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:541:2: ( ( ( rule__AttributeExpression__Group__0 ) ) )
            // InternalTGG.g:542:2: ( ( rule__AttributeExpression__Group__0 ) )
            {
            // InternalTGG.g:542:2: ( ( rule__AttributeExpression__Group__0 ) )
            // InternalTGG.g:543:3: ( rule__AttributeExpression__Group__0 )
            {
             before(grammarAccess.getAttributeExpressionAccess().getGroup()); 
            // InternalTGG.g:544:3: ( rule__AttributeExpression__Group__0 )
            // InternalTGG.g:544:4: rule__AttributeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalTGG.g:553:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalTGG.g:554:1: ( ruleLiteralExpression EOF )
            // InternalTGG.g:555:1: ruleLiteralExpression EOF
            {
             before(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionRule()); 
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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalTGG.g:562:1: ruleLiteralExpression : ( ( rule__LiteralExpression__ValueAssignment ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:566:2: ( ( ( rule__LiteralExpression__ValueAssignment ) ) )
            // InternalTGG.g:567:2: ( ( rule__LiteralExpression__ValueAssignment ) )
            {
            // InternalTGG.g:567:2: ( ( rule__LiteralExpression__ValueAssignment ) )
            // InternalTGG.g:568:3: ( rule__LiteralExpression__ValueAssignment )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAssignment()); 
            // InternalTGG.g:569:3: ( rule__LiteralExpression__ValueAssignment )
            // InternalTGG.g:569:4: rule__LiteralExpression__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LiteralExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLinkVariablePattern"
    // InternalTGG.g:578:1: entryRuleLinkVariablePattern : ruleLinkVariablePattern EOF ;
    public final void entryRuleLinkVariablePattern() throws RecognitionException {
        try {
            // InternalTGG.g:579:1: ( ruleLinkVariablePattern EOF )
            // InternalTGG.g:580:1: ruleLinkVariablePattern EOF
            {
             before(grammarAccess.getLinkVariablePatternRule()); 
            pushFollow(FOLLOW_1);
            ruleLinkVariablePattern();

            state._fsp--;

             after(grammarAccess.getLinkVariablePatternRule()); 
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
    // $ANTLR end "entryRuleLinkVariablePattern"


    // $ANTLR start "ruleLinkVariablePattern"
    // InternalTGG.g:587:1: ruleLinkVariablePattern : ( ( rule__LinkVariablePattern__Group__0 ) ) ;
    public final void ruleLinkVariablePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:591:2: ( ( ( rule__LinkVariablePattern__Group__0 ) ) )
            // InternalTGG.g:592:2: ( ( rule__LinkVariablePattern__Group__0 ) )
            {
            // InternalTGG.g:592:2: ( ( rule__LinkVariablePattern__Group__0 ) )
            // InternalTGG.g:593:3: ( rule__LinkVariablePattern__Group__0 )
            {
             before(grammarAccess.getLinkVariablePatternAccess().getGroup()); 
            // InternalTGG.g:594:3: ( rule__LinkVariablePattern__Group__0 )
            // InternalTGG.g:594:4: rule__LinkVariablePattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LinkVariablePattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkVariablePatternAccess().getGroup()); 

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
    // $ANTLR end "ruleLinkVariablePattern"


    // $ANTLR start "entryRuleOperator"
    // InternalTGG.g:603:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalTGG.g:604:1: ( ruleOperator EOF )
            // InternalTGG.g:605:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalTGG.g:612:1: ruleOperator : ( ( rule__Operator__ValueAssignment ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:616:2: ( ( ( rule__Operator__ValueAssignment ) ) )
            // InternalTGG.g:617:2: ( ( rule__Operator__ValueAssignment ) )
            {
            // InternalTGG.g:617:2: ( ( rule__Operator__ValueAssignment ) )
            // InternalTGG.g:618:3: ( rule__Operator__ValueAssignment )
            {
             before(grammarAccess.getOperatorAccess().getValueAssignment()); 
            // InternalTGG.g:619:3: ( rule__Operator__ValueAssignment )
            // InternalTGG.g:619:4: rule__Operator__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleImport"
    // InternalTGG.g:628:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalTGG.g:629:1: ( ruleImport EOF )
            // InternalTGG.g:630:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalTGG.g:637:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:641:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalTGG.g:642:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalTGG.g:642:2: ( ( rule__Import__Group__0 ) )
            // InternalTGG.g:643:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalTGG.g:644:3: ( rule__Import__Group__0 )
            // InternalTGG.g:644:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleUsing"
    // InternalTGG.g:653:1: entryRuleUsing : ruleUsing EOF ;
    public final void entryRuleUsing() throws RecognitionException {
        try {
            // InternalTGG.g:654:1: ( ruleUsing EOF )
            // InternalTGG.g:655:1: ruleUsing EOF
            {
             before(grammarAccess.getUsingRule()); 
            pushFollow(FOLLOW_1);
            ruleUsing();

            state._fsp--;

             after(grammarAccess.getUsingRule()); 
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
    // $ANTLR end "entryRuleUsing"


    // $ANTLR start "ruleUsing"
    // InternalTGG.g:662:1: ruleUsing : ( ( rule__Using__Group__0 ) ) ;
    public final void ruleUsing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:666:2: ( ( ( rule__Using__Group__0 ) ) )
            // InternalTGG.g:667:2: ( ( rule__Using__Group__0 ) )
            {
            // InternalTGG.g:667:2: ( ( rule__Using__Group__0 ) )
            // InternalTGG.g:668:3: ( rule__Using__Group__0 )
            {
             before(grammarAccess.getUsingAccess().getGroup()); 
            // InternalTGG.g:669:3: ( rule__Using__Group__0 )
            // InternalTGG.g:669:4: rule__Using__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Using__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsingAccess().getGroup()); 

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
    // $ANTLR end "ruleUsing"


    // $ANTLR start "entryRuleLiteralValue"
    // InternalTGG.g:678:1: entryRuleLiteralValue : ruleLiteralValue EOF ;
    public final void entryRuleLiteralValue() throws RecognitionException {
        try {
            // InternalTGG.g:679:1: ( ruleLiteralValue EOF )
            // InternalTGG.g:680:1: ruleLiteralValue EOF
            {
             before(grammarAccess.getLiteralValueRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteralValue();

            state._fsp--;

             after(grammarAccess.getLiteralValueRule()); 
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
    // $ANTLR end "entryRuleLiteralValue"


    // $ANTLR start "ruleLiteralValue"
    // InternalTGG.g:687:1: ruleLiteralValue : ( ( rule__LiteralValue__Alternatives ) ) ;
    public final void ruleLiteralValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:691:2: ( ( ( rule__LiteralValue__Alternatives ) ) )
            // InternalTGG.g:692:2: ( ( rule__LiteralValue__Alternatives ) )
            {
            // InternalTGG.g:692:2: ( ( rule__LiteralValue__Alternatives ) )
            // InternalTGG.g:693:3: ( rule__LiteralValue__Alternatives )
            {
             before(grammarAccess.getLiteralValueAccess().getAlternatives()); 
            // InternalTGG.g:694:3: ( rule__LiteralValue__Alternatives )
            // InternalTGG.g:694:4: rule__LiteralValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LiteralValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLiteralValue"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalTGG.g:703:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalTGG.g:704:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalTGG.g:705:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalTGG.g:712:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:716:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalTGG.g:717:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalTGG.g:717:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalTGG.g:718:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalTGG.g:719:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalTGG.g:719:4: rule__QualifiedNameWithWildcard__Group__0
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalTGG.g:728:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalTGG.g:729:1: ( ruleQualifiedName EOF )
            // InternalTGG.g:730:1: ruleQualifiedName EOF
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
    // InternalTGG.g:737:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:741:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalTGG.g:742:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalTGG.g:742:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalTGG.g:743:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalTGG.g:744:3: ( rule__QualifiedName__Group__0 )
            // InternalTGG.g:744:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleNamePattern"
    // InternalTGG.g:753:1: entryRuleNamePattern : ruleNamePattern EOF ;
    public final void entryRuleNamePattern() throws RecognitionException {
        try {
            // InternalTGG.g:754:1: ( ruleNamePattern EOF )
            // InternalTGG.g:755:1: ruleNamePattern EOF
            {
             before(grammarAccess.getNamePatternRule()); 
            pushFollow(FOLLOW_1);
            ruleNamePattern();

            state._fsp--;

             after(grammarAccess.getNamePatternRule()); 
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
    // $ANTLR end "entryRuleNamePattern"


    // $ANTLR start "ruleNamePattern"
    // InternalTGG.g:762:1: ruleNamePattern : ( ( rule__NamePattern__Alternatives ) ) ;
    public final void ruleNamePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:766:2: ( ( ( rule__NamePattern__Alternatives ) ) )
            // InternalTGG.g:767:2: ( ( rule__NamePattern__Alternatives ) )
            {
            // InternalTGG.g:767:2: ( ( rule__NamePattern__Alternatives ) )
            // InternalTGG.g:768:3: ( rule__NamePattern__Alternatives )
            {
             before(grammarAccess.getNamePatternAccess().getAlternatives()); 
            // InternalTGG.g:769:3: ( rule__NamePattern__Alternatives )
            // InternalTGG.g:769:4: rule__NamePattern__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NamePattern__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamePatternAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNamePattern"


    // $ANTLR start "rule__CorrType__Alternatives_1"
    // InternalTGG.g:777:1: rule__CorrType__Alternatives_1 : ( ( ( rule__CorrType__Group_1_0__0 ) ) | ( ( rule__CorrType__Group_1_1__0 ) ) );
    public final void rule__CorrType__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:781:1: ( ( ( rule__CorrType__Group_1_0__0 ) ) | ( ( rule__CorrType__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            else if ( (LA2_0==24) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTGG.g:782:2: ( ( rule__CorrType__Group_1_0__0 ) )
                    {
                    // InternalTGG.g:782:2: ( ( rule__CorrType__Group_1_0__0 ) )
                    // InternalTGG.g:783:3: ( rule__CorrType__Group_1_0__0 )
                    {
                     before(grammarAccess.getCorrTypeAccess().getGroup_1_0()); 
                    // InternalTGG.g:784:3: ( rule__CorrType__Group_1_0__0 )
                    // InternalTGG.g:784:4: rule__CorrType__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CorrType__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCorrTypeAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTGG.g:788:2: ( ( rule__CorrType__Group_1_1__0 ) )
                    {
                    // InternalTGG.g:788:2: ( ( rule__CorrType__Group_1_1__0 ) )
                    // InternalTGG.g:789:3: ( rule__CorrType__Group_1_1__0 )
                    {
                     before(grammarAccess.getCorrTypeAccess().getGroup_1_1()); 
                    // InternalTGG.g:790:3: ( rule__CorrType__Group_1_1__0 )
                    // InternalTGG.g:790:4: rule__CorrType__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CorrType__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCorrTypeAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__CorrType__Alternatives_1"


    // $ANTLR start "rule__ParamValue__Alternatives"
    // InternalTGG.g:798:1: rule__ParamValue__Alternatives : ( ( ruleLocalVariable ) | ( ruleLiteralExpression ) | ( ruleAttributeVariable ) | ( ruleEnumExpression ) );
    public final void rule__ParamValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:802:1: ( ( ruleLocalVariable ) | ( ruleLiteralExpression ) | ( ruleAttributeVariable ) | ( ruleEnumExpression ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==38) ) {
                    alt3=3;
                }
                else if ( (LA3_1==EOF||LA3_1==33||LA3_1==35) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_BOOL:
            case RULE_INT:
            case RULE_DECIMAL:
            case 45:
                {
                alt3=2;
                }
                break;
            case 43:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalTGG.g:803:2: ( ruleLocalVariable )
                    {
                    // InternalTGG.g:803:2: ( ruleLocalVariable )
                    // InternalTGG.g:804:3: ruleLocalVariable
                    {
                     before(grammarAccess.getParamValueAccess().getLocalVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLocalVariable();

                    state._fsp--;

                     after(grammarAccess.getParamValueAccess().getLocalVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTGG.g:809:2: ( ruleLiteralExpression )
                    {
                    // InternalTGG.g:809:2: ( ruleLiteralExpression )
                    // InternalTGG.g:810:3: ruleLiteralExpression
                    {
                     before(grammarAccess.getParamValueAccess().getLiteralExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getParamValueAccess().getLiteralExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTGG.g:815:2: ( ruleAttributeVariable )
                    {
                    // InternalTGG.g:815:2: ( ruleAttributeVariable )
                    // InternalTGG.g:816:3: ruleAttributeVariable
                    {
                     before(grammarAccess.getParamValueAccess().getAttributeVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeVariable();

                    state._fsp--;

                     after(grammarAccess.getParamValueAccess().getAttributeVariableParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTGG.g:821:2: ( ruleEnumExpression )
                    {
                    // InternalTGG.g:821:2: ( ruleEnumExpression )
                    // InternalTGG.g:822:3: ruleEnumExpression
                    {
                     before(grammarAccess.getParamValueAccess().getEnumExpressionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumExpression();

                    state._fsp--;

                     after(grammarAccess.getParamValueAccess().getEnumExpressionParserRuleCall_3()); 

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
    // $ANTLR end "rule__ParamValue__Alternatives"


    // $ANTLR start "rule__AttributeConstraint__OpAlternatives_1_0"
    // InternalTGG.g:831:1: rule__AttributeConstraint__OpAlternatives_1_0 : ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '>' ) | ( '<' ) );
    public final void rule__AttributeConstraint__OpAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:835:1: ( ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '>' ) | ( '<' ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalTGG.g:836:2: ( '==' )
                    {
                    // InternalTGG.g:836:2: ( '==' )
                    // InternalTGG.g:837:3: '=='
                    {
                     before(grammarAccess.getAttributeConstraintAccess().getOpEqualsSignEqualsSignKeyword_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAttributeConstraintAccess().getOpEqualsSignEqualsSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTGG.g:842:2: ( '!=' )
                    {
                    // InternalTGG.g:842:2: ( '!=' )
                    // InternalTGG.g:843:3: '!='
                    {
                     before(grammarAccess.getAttributeConstraintAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAttributeConstraintAccess().getOpExclamationMarkEqualsSignKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTGG.g:848:2: ( '<=' )
                    {
                    // InternalTGG.g:848:2: ( '<=' )
                    // InternalTGG.g:849:3: '<='
                    {
                     before(grammarAccess.getAttributeConstraintAccess().getOpLessThanSignEqualsSignKeyword_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getAttributeConstraintAccess().getOpLessThanSignEqualsSignKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTGG.g:854:2: ( '>=' )
                    {
                    // InternalTGG.g:854:2: ( '>=' )
                    // InternalTGG.g:855:3: '>='
                    {
                     before(grammarAccess.getAttributeConstraintAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getAttributeConstraintAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTGG.g:860:2: ( '>' )
                    {
                    // InternalTGG.g:860:2: ( '>' )
                    // InternalTGG.g:861:3: '>'
                    {
                     before(grammarAccess.getAttributeConstraintAccess().getOpGreaterThanSignKeyword_1_0_4()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getAttributeConstraintAccess().getOpGreaterThanSignKeyword_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTGG.g:866:2: ( '<' )
                    {
                    // InternalTGG.g:866:2: ( '<' )
                    // InternalTGG.g:867:3: '<'
                    {
                     before(grammarAccess.getAttributeConstraintAccess().getOpLessThanSignKeyword_1_0_5()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getAttributeConstraintAccess().getOpLessThanSignKeyword_1_0_5()); 

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
    // $ANTLR end "rule__AttributeConstraint__OpAlternatives_1_0"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalTGG.g:876:1: rule__Expression__Alternatives : ( ( ruleLiteralExpression ) | ( ruleAttributeExpression ) | ( ruleEnumExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:880:1: ( ( ruleLiteralExpression ) | ( ruleAttributeExpression ) | ( ruleEnumExpression ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_BOOL:
            case RULE_INT:
            case RULE_DECIMAL:
            case 45:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
                {
                alt5=2;
                }
                break;
            case 43:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTGG.g:881:2: ( ruleLiteralExpression )
                    {
                    // InternalTGG.g:881:2: ( ruleLiteralExpression )
                    // InternalTGG.g:882:3: ruleLiteralExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLiteralExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTGG.g:887:2: ( ruleAttributeExpression )
                    {
                    // InternalTGG.g:887:2: ( ruleAttributeExpression )
                    // InternalTGG.g:888:3: ruleAttributeExpression
                    {
                     before(grammarAccess.getExpressionAccess().getAttributeExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAttributeExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getAttributeExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTGG.g:893:2: ( ruleEnumExpression )
                    {
                    // InternalTGG.g:893:2: ( ruleEnumExpression )
                    // InternalTGG.g:894:3: ruleEnumExpression
                    {
                     before(grammarAccess.getExpressionAccess().getEnumExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getEnumExpressionParserRuleCall_2()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Operator__ValueAlternatives_0"
    // InternalTGG.g:903:1: rule__Operator__ValueAlternatives_0 : ( ( '++' ) | ( '!' ) | ( '--' ) );
    public final void rule__Operator__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:907:1: ( ( '++' ) | ( '!' ) | ( '--' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTGG.g:908:2: ( '++' )
                    {
                    // InternalTGG.g:908:2: ( '++' )
                    // InternalTGG.g:909:3: '++'
                    {
                     before(grammarAccess.getOperatorAccess().getValuePlusSignPlusSignKeyword_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getValuePlusSignPlusSignKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTGG.g:914:2: ( '!' )
                    {
                    // InternalTGG.g:914:2: ( '!' )
                    // InternalTGG.g:915:3: '!'
                    {
                     before(grammarAccess.getOperatorAccess().getValueExclamationMarkKeyword_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getValueExclamationMarkKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTGG.g:920:2: ( '--' )
                    {
                    // InternalTGG.g:920:2: ( '--' )
                    // InternalTGG.g:921:3: '--'
                    {
                     before(grammarAccess.getOperatorAccess().getValueHyphenMinusHyphenMinusKeyword_0_2()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getValueHyphenMinusHyphenMinusKeyword_0_2()); 

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
    // $ANTLR end "rule__Operator__ValueAlternatives_0"


    // $ANTLR start "rule__LiteralValue__Alternatives"
    // InternalTGG.g:930:1: rule__LiteralValue__Alternatives : ( ( RULE_STRING ) | ( ( rule__LiteralValue__Group_1__0 ) ) | ( ( rule__LiteralValue__Group_2__0 ) ) | ( RULE_BOOL ) );
    public final void rule__LiteralValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:934:1: ( ( RULE_STRING ) | ( ( rule__LiteralValue__Group_1__0 ) ) | ( ( rule__LiteralValue__Group_2__0 ) ) | ( RULE_BOOL ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case 45:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_DECIMAL) ) {
                    alt7=3;
                }
                else if ( (LA7_2==RULE_INT) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt7=3;
                }
                break;
            case RULE_BOOL:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalTGG.g:935:2: ( RULE_STRING )
                    {
                    // InternalTGG.g:935:2: ( RULE_STRING )
                    // InternalTGG.g:936:3: RULE_STRING
                    {
                     before(grammarAccess.getLiteralValueAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getLiteralValueAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTGG.g:941:2: ( ( rule__LiteralValue__Group_1__0 ) )
                    {
                    // InternalTGG.g:941:2: ( ( rule__LiteralValue__Group_1__0 ) )
                    // InternalTGG.g:942:3: ( rule__LiteralValue__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralValueAccess().getGroup_1()); 
                    // InternalTGG.g:943:3: ( rule__LiteralValue__Group_1__0 )
                    // InternalTGG.g:943:4: rule__LiteralValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LiteralValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralValueAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTGG.g:947:2: ( ( rule__LiteralValue__Group_2__0 ) )
                    {
                    // InternalTGG.g:947:2: ( ( rule__LiteralValue__Group_2__0 ) )
                    // InternalTGG.g:948:3: ( rule__LiteralValue__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralValueAccess().getGroup_2()); 
                    // InternalTGG.g:949:3: ( rule__LiteralValue__Group_2__0 )
                    // InternalTGG.g:949:4: rule__LiteralValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LiteralValue__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralValueAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTGG.g:953:2: ( RULE_BOOL )
                    {
                    // InternalTGG.g:953:2: ( RULE_BOOL )
                    // InternalTGG.g:954:3: RULE_BOOL
                    {
                     before(grammarAccess.getLiteralValueAccess().getBOOLTerminalRuleCall_3()); 
                    match(input,RULE_BOOL,FOLLOW_2); 
                     after(grammarAccess.getLiteralValueAccess().getBOOLTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__LiteralValue__Alternatives"


    // $ANTLR start "rule__NamePattern__Alternatives"
    // InternalTGG.g:963:1: rule__NamePattern__Alternatives : ( ( ruleCorrVariablePattern ) | ( ruleObjectVariablePattern ) );
    public final void rule__NamePattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:967:1: ( ( ruleCorrVariablePattern ) | ( ruleObjectVariablePattern ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalTGG.g:968:2: ( ruleCorrVariablePattern )
                    {
                    // InternalTGG.g:968:2: ( ruleCorrVariablePattern )
                    // InternalTGG.g:969:3: ruleCorrVariablePattern
                    {
                     before(grammarAccess.getNamePatternAccess().getCorrVariablePatternParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCorrVariablePattern();

                    state._fsp--;

                     after(grammarAccess.getNamePatternAccess().getCorrVariablePatternParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTGG.g:974:2: ( ruleObjectVariablePattern )
                    {
                    // InternalTGG.g:974:2: ( ruleObjectVariablePattern )
                    // InternalTGG.g:975:3: ruleObjectVariablePattern
                    {
                     before(grammarAccess.getNamePatternAccess().getObjectVariablePatternParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectVariablePattern();

                    state._fsp--;

                     after(grammarAccess.getNamePatternAccess().getObjectVariablePatternParserRuleCall_1()); 

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
    // $ANTLR end "rule__NamePattern__Alternatives"


    // $ANTLR start "rule__TripleGraphGrammarFile__Group__0"
    // InternalTGG.g:984:1: rule__TripleGraphGrammarFile__Group__0 : rule__TripleGraphGrammarFile__Group__0__Impl rule__TripleGraphGrammarFile__Group__1 ;
    public final void rule__TripleGraphGrammarFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:988:1: ( rule__TripleGraphGrammarFile__Group__0__Impl rule__TripleGraphGrammarFile__Group__1 )
            // InternalTGG.g:989:2: rule__TripleGraphGrammarFile__Group__0__Impl rule__TripleGraphGrammarFile__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TripleGraphGrammarFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripleGraphGrammarFile__Group__1();

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
    // $ANTLR end "rule__TripleGraphGrammarFile__Group__0"


    // $ANTLR start "rule__TripleGraphGrammarFile__Group__0__Impl"
    // InternalTGG.g:996:1: rule__TripleGraphGrammarFile__Group__0__Impl : ( ( rule__TripleGraphGrammarFile__SchemaAssignment_0 )? ) ;
    public final void rule__TripleGraphGrammarFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1000:1: ( ( ( rule__TripleGraphGrammarFile__SchemaAssignment_0 )? ) )
            // InternalTGG.g:1001:1: ( ( rule__TripleGraphGrammarFile__SchemaAssignment_0 )? )
            {
            // InternalTGG.g:1001:1: ( ( rule__TripleGraphGrammarFile__SchemaAssignment_0 )? )
            // InternalTGG.g:1002:2: ( rule__TripleGraphGrammarFile__SchemaAssignment_0 )?
            {
             before(grammarAccess.getTripleGraphGrammarFileAccess().getSchemaAssignment_0()); 
            // InternalTGG.g:1003:2: ( rule__TripleGraphGrammarFile__SchemaAssignment_0 )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalTGG.g:1003:3: rule__TripleGraphGrammarFile__SchemaAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TripleGraphGrammarFile__SchemaAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTripleGraphGrammarFileAccess().getSchemaAssignment_0()); 

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
    // $ANTLR end "rule__TripleGraphGrammarFile__Group__0__Impl"


    // $ANTLR start "rule__TripleGraphGrammarFile__Group__1"
    // InternalTGG.g:1011:1: rule__TripleGraphGrammarFile__Group__1 : rule__TripleGraphGrammarFile__Group__1__Impl rule__TripleGraphGrammarFile__Group__2 ;
    public final void rule__TripleGraphGrammarFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1015:1: ( rule__TripleGraphGrammarFile__Group__1__Impl rule__TripleGraphGrammarFile__Group__2 )
            // InternalTGG.g:1016:2: rule__TripleGraphGrammarFile__Group__1__Impl rule__TripleGraphGrammarFile__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__TripleGraphGrammarFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TripleGraphGrammarFile__Group__2();

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
    // $ANTLR end "rule__TripleGraphGrammarFile__Group__1"


    // $ANTLR start "rule__TripleGraphGrammarFile__Group__1__Impl"
    // InternalTGG.g:1023:1: rule__TripleGraphGrammarFile__Group__1__Impl : ( ( rule__TripleGraphGrammarFile__RulesAssignment_1 )* ) ;
    public final void rule__TripleGraphGrammarFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1027:1: ( ( ( rule__TripleGraphGrammarFile__RulesAssignment_1 )* ) )
            // InternalTGG.g:1028:1: ( ( rule__TripleGraphGrammarFile__RulesAssignment_1 )* )
            {
            // InternalTGG.g:1028:1: ( ( rule__TripleGraphGrammarFile__RulesAssignment_1 )* )
            // InternalTGG.g:1029:2: ( rule__TripleGraphGrammarFile__RulesAssignment_1 )*
            {
             before(grammarAccess.getTripleGraphGrammarFileAccess().getRulesAssignment_1()); 
            // InternalTGG.g:1030:2: ( rule__TripleGraphGrammarFile__RulesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==39||(LA10_0>=47 && LA10_0<=48)||LA10_0==51) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTGG.g:1030:3: rule__TripleGraphGrammarFile__RulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__TripleGraphGrammarFile__RulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTripleGraphGrammarFileAccess().getRulesAssignment_1()); 

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
    // $ANTLR end "rule__TripleGraphGrammarFile__Group__1__Impl"


    // $ANTLR start "rule__TripleGraphGrammarFile__Group__2"
    // InternalTGG.g:1038:1: rule__TripleGraphGrammarFile__Group__2 : rule__TripleGraphGrammarFile__Group__2__Impl ;
    public final void rule__TripleGraphGrammarFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1042:1: ( rule__TripleGraphGrammarFile__Group__2__Impl )
            // InternalTGG.g:1043:2: rule__TripleGraphGrammarFile__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TripleGraphGrammarFile__Group__2__Impl();

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
    // $ANTLR end "rule__TripleGraphGrammarFile__Group__2"


    // $ANTLR start "rule__TripleGraphGrammarFile__Group__2__Impl"
    // InternalTGG.g:1049:1: rule__TripleGraphGrammarFile__Group__2__Impl : ( ( rule__TripleGraphGrammarFile__LibraryAssignment_2 )? ) ;
    public final void rule__TripleGraphGrammarFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1053:1: ( ( ( rule__TripleGraphGrammarFile__LibraryAssignment_2 )? ) )
            // InternalTGG.g:1054:1: ( ( rule__TripleGraphGrammarFile__LibraryAssignment_2 )? )
            {
            // InternalTGG.g:1054:1: ( ( rule__TripleGraphGrammarFile__LibraryAssignment_2 )? )
            // InternalTGG.g:1055:2: ( rule__TripleGraphGrammarFile__LibraryAssignment_2 )?
            {
             before(grammarAccess.getTripleGraphGrammarFileAccess().getLibraryAssignment_2()); 
            // InternalTGG.g:1056:2: ( rule__TripleGraphGrammarFile__LibraryAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTGG.g:1056:3: rule__TripleGraphGrammarFile__LibraryAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TripleGraphGrammarFile__LibraryAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTripleGraphGrammarFileAccess().getLibraryAssignment_2()); 

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
    // $ANTLR end "rule__TripleGraphGrammarFile__Group__2__Impl"


    // $ANTLR start "rule__Schema__Group__0"
    // InternalTGG.g:1065:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1069:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // InternalTGG.g:1070:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Schema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__1();

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
    // $ANTLR end "rule__Schema__Group__0"


    // $ANTLR start "rule__Schema__Group__0__Impl"
    // InternalTGG.g:1077:1: rule__Schema__Group__0__Impl : ( ( rule__Schema__ImportsAssignment_0 )* ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1081:1: ( ( ( rule__Schema__ImportsAssignment_0 )* ) )
            // InternalTGG.g:1082:1: ( ( rule__Schema__ImportsAssignment_0 )* )
            {
            // InternalTGG.g:1082:1: ( ( rule__Schema__ImportsAssignment_0 )* )
            // InternalTGG.g:1083:2: ( rule__Schema__ImportsAssignment_0 )*
            {
             before(grammarAccess.getSchemaAccess().getImportsAssignment_0()); 
            // InternalTGG.g:1084:2: ( rule__Schema__ImportsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==47) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTGG.g:1084:3: rule__Schema__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Schema__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Schema__Group__0__Impl"


    // $ANTLR start "rule__Schema__Group__1"
    // InternalTGG.g:1092:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1096:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // InternalTGG.g:1097:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Schema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__2();

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
    // $ANTLR end "rule__Schema__Group__1"


    // $ANTLR start "rule__Schema__Group__1__Impl"
    // InternalTGG.g:1104:1: rule__Schema__Group__1__Impl : ( ( rule__Schema__UsingAssignment_1 )* ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1108:1: ( ( ( rule__Schema__UsingAssignment_1 )* ) )
            // InternalTGG.g:1109:1: ( ( rule__Schema__UsingAssignment_1 )* )
            {
            // InternalTGG.g:1109:1: ( ( rule__Schema__UsingAssignment_1 )* )
            // InternalTGG.g:1110:2: ( rule__Schema__UsingAssignment_1 )*
            {
             before(grammarAccess.getSchemaAccess().getUsingAssignment_1()); 
            // InternalTGG.g:1111:2: ( rule__Schema__UsingAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==48) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTGG.g:1111:3: rule__Schema__UsingAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Schema__UsingAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getUsingAssignment_1()); 

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
    // $ANTLR end "rule__Schema__Group__1__Impl"


    // $ANTLR start "rule__Schema__Group__2"
    // InternalTGG.g:1119:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl rule__Schema__Group__3 ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1123:1: ( rule__Schema__Group__2__Impl rule__Schema__Group__3 )
            // InternalTGG.g:1124:2: rule__Schema__Group__2__Impl rule__Schema__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Schema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__3();

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
    // $ANTLR end "rule__Schema__Group__2"


    // $ANTLR start "rule__Schema__Group__2__Impl"
    // InternalTGG.g:1131:1: rule__Schema__Group__2__Impl : ( '#schema' ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1135:1: ( ( '#schema' ) )
            // InternalTGG.g:1136:1: ( '#schema' )
            {
            // InternalTGG.g:1136:1: ( '#schema' )
            // InternalTGG.g:1137:2: '#schema'
            {
             before(grammarAccess.getSchemaAccess().getSchemaKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getSchemaKeyword_2()); 

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
    // $ANTLR end "rule__Schema__Group__2__Impl"


    // $ANTLR start "rule__Schema__Group__3"
    // InternalTGG.g:1146:1: rule__Schema__Group__3 : rule__Schema__Group__3__Impl rule__Schema__Group__4 ;
    public final void rule__Schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1150:1: ( rule__Schema__Group__3__Impl rule__Schema__Group__4 )
            // InternalTGG.g:1151:2: rule__Schema__Group__3__Impl rule__Schema__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Schema__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__4();

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
    // $ANTLR end "rule__Schema__Group__3"


    // $ANTLR start "rule__Schema__Group__3__Impl"
    // InternalTGG.g:1158:1: rule__Schema__Group__3__Impl : ( ( rule__Schema__NameAssignment_3 ) ) ;
    public final void rule__Schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1162:1: ( ( ( rule__Schema__NameAssignment_3 ) ) )
            // InternalTGG.g:1163:1: ( ( rule__Schema__NameAssignment_3 ) )
            {
            // InternalTGG.g:1163:1: ( ( rule__Schema__NameAssignment_3 ) )
            // InternalTGG.g:1164:2: ( rule__Schema__NameAssignment_3 )
            {
             before(grammarAccess.getSchemaAccess().getNameAssignment_3()); 
            // InternalTGG.g:1165:2: ( rule__Schema__NameAssignment_3 )
            // InternalTGG.g:1165:3: rule__Schema__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Schema__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Schema__Group__3__Impl"


    // $ANTLR start "rule__Schema__Group__4"
    // InternalTGG.g:1173:1: rule__Schema__Group__4 : rule__Schema__Group__4__Impl rule__Schema__Group__5 ;
    public final void rule__Schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1177:1: ( rule__Schema__Group__4__Impl rule__Schema__Group__5 )
            // InternalTGG.g:1178:2: rule__Schema__Group__4__Impl rule__Schema__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Schema__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__5();

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
    // $ANTLR end "rule__Schema__Group__4"


    // $ANTLR start "rule__Schema__Group__4__Impl"
    // InternalTGG.g:1185:1: rule__Schema__Group__4__Impl : ( ( rule__Schema__Group_4__0 )? ) ;
    public final void rule__Schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1189:1: ( ( ( rule__Schema__Group_4__0 )? ) )
            // InternalTGG.g:1190:1: ( ( rule__Schema__Group_4__0 )? )
            {
            // InternalTGG.g:1190:1: ( ( rule__Schema__Group_4__0 )? )
            // InternalTGG.g:1191:2: ( rule__Schema__Group_4__0 )?
            {
             before(grammarAccess.getSchemaAccess().getGroup_4()); 
            // InternalTGG.g:1192:2: ( rule__Schema__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTGG.g:1192:3: rule__Schema__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemaAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Schema__Group__4__Impl"


    // $ANTLR start "rule__Schema__Group__5"
    // InternalTGG.g:1200:1: rule__Schema__Group__5 : rule__Schema__Group__5__Impl rule__Schema__Group__6 ;
    public final void rule__Schema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1204:1: ( rule__Schema__Group__5__Impl rule__Schema__Group__6 )
            // InternalTGG.g:1205:2: rule__Schema__Group__5__Impl rule__Schema__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Schema__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__6();

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
    // $ANTLR end "rule__Schema__Group__5"


    // $ANTLR start "rule__Schema__Group__5__Impl"
    // InternalTGG.g:1212:1: rule__Schema__Group__5__Impl : ( ( rule__Schema__Group_5__0 )? ) ;
    public final void rule__Schema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1216:1: ( ( ( rule__Schema__Group_5__0 )? ) )
            // InternalTGG.g:1217:1: ( ( rule__Schema__Group_5__0 )? )
            {
            // InternalTGG.g:1217:1: ( ( rule__Schema__Group_5__0 )? )
            // InternalTGG.g:1218:2: ( rule__Schema__Group_5__0 )?
            {
             before(grammarAccess.getSchemaAccess().getGroup_5()); 
            // InternalTGG.g:1219:2: ( rule__Schema__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTGG.g:1219:3: rule__Schema__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemaAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Schema__Group__5__Impl"


    // $ANTLR start "rule__Schema__Group__6"
    // InternalTGG.g:1227:1: rule__Schema__Group__6 : rule__Schema__Group__6__Impl rule__Schema__Group__7 ;
    public final void rule__Schema__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1231:1: ( rule__Schema__Group__6__Impl rule__Schema__Group__7 )
            // InternalTGG.g:1232:2: rule__Schema__Group__6__Impl rule__Schema__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Schema__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__7();

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
    // $ANTLR end "rule__Schema__Group__6"


    // $ANTLR start "rule__Schema__Group__6__Impl"
    // InternalTGG.g:1239:1: rule__Schema__Group__6__Impl : ( ( rule__Schema__Group_6__0 )? ) ;
    public final void rule__Schema__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1243:1: ( ( ( rule__Schema__Group_6__0 )? ) )
            // InternalTGG.g:1244:1: ( ( rule__Schema__Group_6__0 )? )
            {
            // InternalTGG.g:1244:1: ( ( rule__Schema__Group_6__0 )? )
            // InternalTGG.g:1245:2: ( rule__Schema__Group_6__0 )?
            {
             before(grammarAccess.getSchemaAccess().getGroup_6()); 
            // InternalTGG.g:1246:2: ( rule__Schema__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTGG.g:1246:3: rule__Schema__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemaAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Schema__Group__6__Impl"


    // $ANTLR start "rule__Schema__Group__7"
    // InternalTGG.g:1254:1: rule__Schema__Group__7 : rule__Schema__Group__7__Impl ;
    public final void rule__Schema__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1258:1: ( rule__Schema__Group__7__Impl )
            // InternalTGG.g:1259:2: rule__Schema__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__7__Impl();

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
    // $ANTLR end "rule__Schema__Group__7"


    // $ANTLR start "rule__Schema__Group__7__Impl"
    // InternalTGG.g:1265:1: rule__Schema__Group__7__Impl : ( ( rule__Schema__Group_7__0 )? ) ;
    public final void rule__Schema__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1269:1: ( ( ( rule__Schema__Group_7__0 )? ) )
            // InternalTGG.g:1270:1: ( ( rule__Schema__Group_7__0 )? )
            {
            // InternalTGG.g:1270:1: ( ( rule__Schema__Group_7__0 )? )
            // InternalTGG.g:1271:2: ( rule__Schema__Group_7__0 )?
            {
             before(grammarAccess.getSchemaAccess().getGroup_7()); 
            // InternalTGG.g:1272:2: ( rule__Schema__Group_7__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTGG.g:1272:3: rule__Schema__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemaAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Schema__Group__7__Impl"


    // $ANTLR start "rule__Schema__Group_4__0"
    // InternalTGG.g:1281:1: rule__Schema__Group_4__0 : rule__Schema__Group_4__0__Impl rule__Schema__Group_4__1 ;
    public final void rule__Schema__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1285:1: ( rule__Schema__Group_4__0__Impl rule__Schema__Group_4__1 )
            // InternalTGG.g:1286:2: rule__Schema__Group_4__0__Impl rule__Schema__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Schema__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_4__1();

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
    // $ANTLR end "rule__Schema__Group_4__0"


    // $ANTLR start "rule__Schema__Group_4__0__Impl"
    // InternalTGG.g:1293:1: rule__Schema__Group_4__0__Impl : ( '#source' ) ;
    public final void rule__Schema__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1297:1: ( ( '#source' ) )
            // InternalTGG.g:1298:1: ( '#source' )
            {
            // InternalTGG.g:1298:1: ( '#source' )
            // InternalTGG.g:1299:2: '#source'
            {
             before(grammarAccess.getSchemaAccess().getSourceKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getSourceKeyword_4_0()); 

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
    // $ANTLR end "rule__Schema__Group_4__0__Impl"


    // $ANTLR start "rule__Schema__Group_4__1"
    // InternalTGG.g:1308:1: rule__Schema__Group_4__1 : rule__Schema__Group_4__1__Impl rule__Schema__Group_4__2 ;
    public final void rule__Schema__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1312:1: ( rule__Schema__Group_4__1__Impl rule__Schema__Group_4__2 )
            // InternalTGG.g:1313:2: rule__Schema__Group_4__1__Impl rule__Schema__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Schema__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_4__2();

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
    // $ANTLR end "rule__Schema__Group_4__1"


    // $ANTLR start "rule__Schema__Group_4__1__Impl"
    // InternalTGG.g:1320:1: rule__Schema__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Schema__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1324:1: ( ( '{' ) )
            // InternalTGG.g:1325:1: ( '{' )
            {
            // InternalTGG.g:1325:1: ( '{' )
            // InternalTGG.g:1326:2: '{'
            {
             before(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Schema__Group_4__1__Impl"


    // $ANTLR start "rule__Schema__Group_4__2"
    // InternalTGG.g:1335:1: rule__Schema__Group_4__2 : rule__Schema__Group_4__2__Impl rule__Schema__Group_4__3 ;
    public final void rule__Schema__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1339:1: ( rule__Schema__Group_4__2__Impl rule__Schema__Group_4__3 )
            // InternalTGG.g:1340:2: rule__Schema__Group_4__2__Impl rule__Schema__Group_4__3
            {
            pushFollow(FOLLOW_11);
            rule__Schema__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_4__3();

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
    // $ANTLR end "rule__Schema__Group_4__2"


    // $ANTLR start "rule__Schema__Group_4__2__Impl"
    // InternalTGG.g:1347:1: rule__Schema__Group_4__2__Impl : ( ( rule__Schema__SourceTypesAssignment_4_2 )* ) ;
    public final void rule__Schema__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1351:1: ( ( ( rule__Schema__SourceTypesAssignment_4_2 )* ) )
            // InternalTGG.g:1352:1: ( ( rule__Schema__SourceTypesAssignment_4_2 )* )
            {
            // InternalTGG.g:1352:1: ( ( rule__Schema__SourceTypesAssignment_4_2 )* )
            // InternalTGG.g:1353:2: ( rule__Schema__SourceTypesAssignment_4_2 )*
            {
             before(grammarAccess.getSchemaAccess().getSourceTypesAssignment_4_2()); 
            // InternalTGG.g:1354:2: ( rule__Schema__SourceTypesAssignment_4_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTGG.g:1354:3: rule__Schema__SourceTypesAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Schema__SourceTypesAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getSourceTypesAssignment_4_2()); 

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
    // $ANTLR end "rule__Schema__Group_4__2__Impl"


    // $ANTLR start "rule__Schema__Group_4__3"
    // InternalTGG.g:1362:1: rule__Schema__Group_4__3 : rule__Schema__Group_4__3__Impl ;
    public final void rule__Schema__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1366:1: ( rule__Schema__Group_4__3__Impl )
            // InternalTGG.g:1367:2: rule__Schema__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_4__3__Impl();

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
    // $ANTLR end "rule__Schema__Group_4__3"


    // $ANTLR start "rule__Schema__Group_4__3__Impl"
    // InternalTGG.g:1373:1: rule__Schema__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Schema__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1377:1: ( ( '}' ) )
            // InternalTGG.g:1378:1: ( '}' )
            {
            // InternalTGG.g:1378:1: ( '}' )
            // InternalTGG.g:1379:2: '}'
            {
             before(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_4_3()); 

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
    // $ANTLR end "rule__Schema__Group_4__3__Impl"


    // $ANTLR start "rule__Schema__Group_5__0"
    // InternalTGG.g:1389:1: rule__Schema__Group_5__0 : rule__Schema__Group_5__0__Impl rule__Schema__Group_5__1 ;
    public final void rule__Schema__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1393:1: ( rule__Schema__Group_5__0__Impl rule__Schema__Group_5__1 )
            // InternalTGG.g:1394:2: rule__Schema__Group_5__0__Impl rule__Schema__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Schema__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_5__1();

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
    // $ANTLR end "rule__Schema__Group_5__0"


    // $ANTLR start "rule__Schema__Group_5__0__Impl"
    // InternalTGG.g:1401:1: rule__Schema__Group_5__0__Impl : ( '#target' ) ;
    public final void rule__Schema__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1405:1: ( ( '#target' ) )
            // InternalTGG.g:1406:1: ( '#target' )
            {
            // InternalTGG.g:1406:1: ( '#target' )
            // InternalTGG.g:1407:2: '#target'
            {
             before(grammarAccess.getSchemaAccess().getTargetKeyword_5_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getTargetKeyword_5_0()); 

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
    // $ANTLR end "rule__Schema__Group_5__0__Impl"


    // $ANTLR start "rule__Schema__Group_5__1"
    // InternalTGG.g:1416:1: rule__Schema__Group_5__1 : rule__Schema__Group_5__1__Impl rule__Schema__Group_5__2 ;
    public final void rule__Schema__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1420:1: ( rule__Schema__Group_5__1__Impl rule__Schema__Group_5__2 )
            // InternalTGG.g:1421:2: rule__Schema__Group_5__1__Impl rule__Schema__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Schema__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_5__2();

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
    // $ANTLR end "rule__Schema__Group_5__1"


    // $ANTLR start "rule__Schema__Group_5__1__Impl"
    // InternalTGG.g:1428:1: rule__Schema__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Schema__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1432:1: ( ( '{' ) )
            // InternalTGG.g:1433:1: ( '{' )
            {
            // InternalTGG.g:1433:1: ( '{' )
            // InternalTGG.g:1434:2: '{'
            {
             before(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Schema__Group_5__1__Impl"


    // $ANTLR start "rule__Schema__Group_5__2"
    // InternalTGG.g:1443:1: rule__Schema__Group_5__2 : rule__Schema__Group_5__2__Impl rule__Schema__Group_5__3 ;
    public final void rule__Schema__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1447:1: ( rule__Schema__Group_5__2__Impl rule__Schema__Group_5__3 )
            // InternalTGG.g:1448:2: rule__Schema__Group_5__2__Impl rule__Schema__Group_5__3
            {
            pushFollow(FOLLOW_11);
            rule__Schema__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_5__3();

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
    // $ANTLR end "rule__Schema__Group_5__2"


    // $ANTLR start "rule__Schema__Group_5__2__Impl"
    // InternalTGG.g:1455:1: rule__Schema__Group_5__2__Impl : ( ( rule__Schema__TargetTypesAssignment_5_2 )* ) ;
    public final void rule__Schema__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1459:1: ( ( ( rule__Schema__TargetTypesAssignment_5_2 )* ) )
            // InternalTGG.g:1460:1: ( ( rule__Schema__TargetTypesAssignment_5_2 )* )
            {
            // InternalTGG.g:1460:1: ( ( rule__Schema__TargetTypesAssignment_5_2 )* )
            // InternalTGG.g:1461:2: ( rule__Schema__TargetTypesAssignment_5_2 )*
            {
             before(grammarAccess.getSchemaAccess().getTargetTypesAssignment_5_2()); 
            // InternalTGG.g:1462:2: ( rule__Schema__TargetTypesAssignment_5_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTGG.g:1462:3: rule__Schema__TargetTypesAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Schema__TargetTypesAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getTargetTypesAssignment_5_2()); 

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
    // $ANTLR end "rule__Schema__Group_5__2__Impl"


    // $ANTLR start "rule__Schema__Group_5__3"
    // InternalTGG.g:1470:1: rule__Schema__Group_5__3 : rule__Schema__Group_5__3__Impl ;
    public final void rule__Schema__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1474:1: ( rule__Schema__Group_5__3__Impl )
            // InternalTGG.g:1475:2: rule__Schema__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_5__3__Impl();

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
    // $ANTLR end "rule__Schema__Group_5__3"


    // $ANTLR start "rule__Schema__Group_5__3__Impl"
    // InternalTGG.g:1481:1: rule__Schema__Group_5__3__Impl : ( '}' ) ;
    public final void rule__Schema__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1485:1: ( ( '}' ) )
            // InternalTGG.g:1486:1: ( '}' )
            {
            // InternalTGG.g:1486:1: ( '}' )
            // InternalTGG.g:1487:2: '}'
            {
             before(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_5_3()); 

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
    // $ANTLR end "rule__Schema__Group_5__3__Impl"


    // $ANTLR start "rule__Schema__Group_6__0"
    // InternalTGG.g:1497:1: rule__Schema__Group_6__0 : rule__Schema__Group_6__0__Impl rule__Schema__Group_6__1 ;
    public final void rule__Schema__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1501:1: ( rule__Schema__Group_6__0__Impl rule__Schema__Group_6__1 )
            // InternalTGG.g:1502:2: rule__Schema__Group_6__0__Impl rule__Schema__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__Schema__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_6__1();

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
    // $ANTLR end "rule__Schema__Group_6__0"


    // $ANTLR start "rule__Schema__Group_6__0__Impl"
    // InternalTGG.g:1509:1: rule__Schema__Group_6__0__Impl : ( '#correspondence' ) ;
    public final void rule__Schema__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1513:1: ( ( '#correspondence' ) )
            // InternalTGG.g:1514:1: ( '#correspondence' )
            {
            // InternalTGG.g:1514:1: ( '#correspondence' )
            // InternalTGG.g:1515:2: '#correspondence'
            {
             before(grammarAccess.getSchemaAccess().getCorrespondenceKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getCorrespondenceKeyword_6_0()); 

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
    // $ANTLR end "rule__Schema__Group_6__0__Impl"


    // $ANTLR start "rule__Schema__Group_6__1"
    // InternalTGG.g:1524:1: rule__Schema__Group_6__1 : rule__Schema__Group_6__1__Impl rule__Schema__Group_6__2 ;
    public final void rule__Schema__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1528:1: ( rule__Schema__Group_6__1__Impl rule__Schema__Group_6__2 )
            // InternalTGG.g:1529:2: rule__Schema__Group_6__1__Impl rule__Schema__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__Schema__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_6__2();

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
    // $ANTLR end "rule__Schema__Group_6__1"


    // $ANTLR start "rule__Schema__Group_6__1__Impl"
    // InternalTGG.g:1536:1: rule__Schema__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Schema__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1540:1: ( ( '{' ) )
            // InternalTGG.g:1541:1: ( '{' )
            {
            // InternalTGG.g:1541:1: ( '{' )
            // InternalTGG.g:1542:2: '{'
            {
             before(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__Schema__Group_6__1__Impl"


    // $ANTLR start "rule__Schema__Group_6__2"
    // InternalTGG.g:1551:1: rule__Schema__Group_6__2 : rule__Schema__Group_6__2__Impl rule__Schema__Group_6__3 ;
    public final void rule__Schema__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1555:1: ( rule__Schema__Group_6__2__Impl rule__Schema__Group_6__3 )
            // InternalTGG.g:1556:2: rule__Schema__Group_6__2__Impl rule__Schema__Group_6__3
            {
            pushFollow(FOLLOW_11);
            rule__Schema__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_6__3();

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
    // $ANTLR end "rule__Schema__Group_6__2"


    // $ANTLR start "rule__Schema__Group_6__2__Impl"
    // InternalTGG.g:1563:1: rule__Schema__Group_6__2__Impl : ( ( rule__Schema__CorrespondenceTypesAssignment_6_2 )* ) ;
    public final void rule__Schema__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1567:1: ( ( ( rule__Schema__CorrespondenceTypesAssignment_6_2 )* ) )
            // InternalTGG.g:1568:1: ( ( rule__Schema__CorrespondenceTypesAssignment_6_2 )* )
            {
            // InternalTGG.g:1568:1: ( ( rule__Schema__CorrespondenceTypesAssignment_6_2 )* )
            // InternalTGG.g:1569:2: ( rule__Schema__CorrespondenceTypesAssignment_6_2 )*
            {
             before(grammarAccess.getSchemaAccess().getCorrespondenceTypesAssignment_6_2()); 
            // InternalTGG.g:1570:2: ( rule__Schema__CorrespondenceTypesAssignment_6_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTGG.g:1570:3: rule__Schema__CorrespondenceTypesAssignment_6_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Schema__CorrespondenceTypesAssignment_6_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getCorrespondenceTypesAssignment_6_2()); 

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
    // $ANTLR end "rule__Schema__Group_6__2__Impl"


    // $ANTLR start "rule__Schema__Group_6__3"
    // InternalTGG.g:1578:1: rule__Schema__Group_6__3 : rule__Schema__Group_6__3__Impl ;
    public final void rule__Schema__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1582:1: ( rule__Schema__Group_6__3__Impl )
            // InternalTGG.g:1583:2: rule__Schema__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_6__3__Impl();

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
    // $ANTLR end "rule__Schema__Group_6__3"


    // $ANTLR start "rule__Schema__Group_6__3__Impl"
    // InternalTGG.g:1589:1: rule__Schema__Group_6__3__Impl : ( '}' ) ;
    public final void rule__Schema__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1593:1: ( ( '}' ) )
            // InternalTGG.g:1594:1: ( '}' )
            {
            // InternalTGG.g:1594:1: ( '}' )
            // InternalTGG.g:1595:2: '}'
            {
             before(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_6_3()); 

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
    // $ANTLR end "rule__Schema__Group_6__3__Impl"


    // $ANTLR start "rule__Schema__Group_7__0"
    // InternalTGG.g:1605:1: rule__Schema__Group_7__0 : rule__Schema__Group_7__0__Impl rule__Schema__Group_7__1 ;
    public final void rule__Schema__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1609:1: ( rule__Schema__Group_7__0__Impl rule__Schema__Group_7__1 )
            // InternalTGG.g:1610:2: rule__Schema__Group_7__0__Impl rule__Schema__Group_7__1
            {
            pushFollow(FOLLOW_10);
            rule__Schema__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_7__1();

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
    // $ANTLR end "rule__Schema__Group_7__0"


    // $ANTLR start "rule__Schema__Group_7__0__Impl"
    // InternalTGG.g:1617:1: rule__Schema__Group_7__0__Impl : ( '#attributeConditions' ) ;
    public final void rule__Schema__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1621:1: ( ( '#attributeConditions' ) )
            // InternalTGG.g:1622:1: ( '#attributeConditions' )
            {
            // InternalTGG.g:1622:1: ( '#attributeConditions' )
            // InternalTGG.g:1623:2: '#attributeConditions'
            {
             before(grammarAccess.getSchemaAccess().getAttributeConditionsKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getAttributeConditionsKeyword_7_0()); 

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
    // $ANTLR end "rule__Schema__Group_7__0__Impl"


    // $ANTLR start "rule__Schema__Group_7__1"
    // InternalTGG.g:1632:1: rule__Schema__Group_7__1 : rule__Schema__Group_7__1__Impl rule__Schema__Group_7__2 ;
    public final void rule__Schema__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1636:1: ( rule__Schema__Group_7__1__Impl rule__Schema__Group_7__2 )
            // InternalTGG.g:1637:2: rule__Schema__Group_7__1__Impl rule__Schema__Group_7__2
            {
            pushFollow(FOLLOW_13);
            rule__Schema__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_7__2();

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
    // $ANTLR end "rule__Schema__Group_7__1"


    // $ANTLR start "rule__Schema__Group_7__1__Impl"
    // InternalTGG.g:1644:1: rule__Schema__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Schema__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1648:1: ( ( '{' ) )
            // InternalTGG.g:1649:1: ( '{' )
            {
            // InternalTGG.g:1649:1: ( '{' )
            // InternalTGG.g:1650:2: '{'
            {
             before(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_7_1()); 

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
    // $ANTLR end "rule__Schema__Group_7__1__Impl"


    // $ANTLR start "rule__Schema__Group_7__2"
    // InternalTGG.g:1659:1: rule__Schema__Group_7__2 : rule__Schema__Group_7__2__Impl rule__Schema__Group_7__3 ;
    public final void rule__Schema__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1663:1: ( rule__Schema__Group_7__2__Impl rule__Schema__Group_7__3 )
            // InternalTGG.g:1664:2: rule__Schema__Group_7__2__Impl rule__Schema__Group_7__3
            {
            pushFollow(FOLLOW_13);
            rule__Schema__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_7__3();

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
    // $ANTLR end "rule__Schema__Group_7__2"


    // $ANTLR start "rule__Schema__Group_7__2__Impl"
    // InternalTGG.g:1671:1: rule__Schema__Group_7__2__Impl : ( ( rule__Schema__AttributeCondDefsAssignment_7_2 )* ) ;
    public final void rule__Schema__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1675:1: ( ( ( rule__Schema__AttributeCondDefsAssignment_7_2 )* ) )
            // InternalTGG.g:1676:1: ( ( rule__Schema__AttributeCondDefsAssignment_7_2 )* )
            {
            // InternalTGG.g:1676:1: ( ( rule__Schema__AttributeCondDefsAssignment_7_2 )* )
            // InternalTGG.g:1677:2: ( rule__Schema__AttributeCondDefsAssignment_7_2 )*
            {
             before(grammarAccess.getSchemaAccess().getAttributeCondDefsAssignment_7_2()); 
            // InternalTGG.g:1678:2: ( rule__Schema__AttributeCondDefsAssignment_7_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==50) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTGG.g:1678:3: rule__Schema__AttributeCondDefsAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Schema__AttributeCondDefsAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getAttributeCondDefsAssignment_7_2()); 

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
    // $ANTLR end "rule__Schema__Group_7__2__Impl"


    // $ANTLR start "rule__Schema__Group_7__3"
    // InternalTGG.g:1686:1: rule__Schema__Group_7__3 : rule__Schema__Group_7__3__Impl ;
    public final void rule__Schema__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1690:1: ( rule__Schema__Group_7__3__Impl )
            // InternalTGG.g:1691:2: rule__Schema__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_7__3__Impl();

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
    // $ANTLR end "rule__Schema__Group_7__3"


    // $ANTLR start "rule__Schema__Group_7__3__Impl"
    // InternalTGG.g:1697:1: rule__Schema__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Schema__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1701:1: ( ( '}' ) )
            // InternalTGG.g:1702:1: ( '}' )
            {
            // InternalTGG.g:1702:1: ( '}' )
            // InternalTGG.g:1703:2: '}'
            {
             before(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end "rule__Schema__Group_7__3__Impl"


    // $ANTLR start "rule__CorrType__Group__0"
    // InternalTGG.g:1713:1: rule__CorrType__Group__0 : rule__CorrType__Group__0__Impl rule__CorrType__Group__1 ;
    public final void rule__CorrType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1717:1: ( rule__CorrType__Group__0__Impl rule__CorrType__Group__1 )
            // InternalTGG.g:1718:2: rule__CorrType__Group__0__Impl rule__CorrType__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__CorrType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrType__Group__1();

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
    // $ANTLR end "rule__CorrType__Group__0"


    // $ANTLR start "rule__CorrType__Group__0__Impl"
    // InternalTGG.g:1725:1: rule__CorrType__Group__0__Impl : ( ( rule__CorrType__NameAssignment_0 ) ) ;
    public final void rule__CorrType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1729:1: ( ( ( rule__CorrType__NameAssignment_0 ) ) )
            // InternalTGG.g:1730:1: ( ( rule__CorrType__NameAssignment_0 ) )
            {
            // InternalTGG.g:1730:1: ( ( rule__CorrType__NameAssignment_0 ) )
            // InternalTGG.g:1731:2: ( rule__CorrType__NameAssignment_0 )
            {
             before(grammarAccess.getCorrTypeAccess().getNameAssignment_0()); 
            // InternalTGG.g:1732:2: ( rule__CorrType__NameAssignment_0 )
            // InternalTGG.g:1732:3: rule__CorrType__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CorrType__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCorrTypeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__CorrType__Group__0__Impl"


    // $ANTLR start "rule__CorrType__Group__1"
    // InternalTGG.g:1740:1: rule__CorrType__Group__1 : rule__CorrType__Group__1__Impl ;
    public final void rule__CorrType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1744:1: ( rule__CorrType__Group__1__Impl )
            // InternalTGG.g:1745:2: rule__CorrType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CorrType__Group__1__Impl();

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
    // $ANTLR end "rule__CorrType__Group__1"


    // $ANTLR start "rule__CorrType__Group__1__Impl"
    // InternalTGG.g:1751:1: rule__CorrType__Group__1__Impl : ( ( rule__CorrType__Alternatives_1 ) ) ;
    public final void rule__CorrType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1755:1: ( ( ( rule__CorrType__Alternatives_1 ) ) )
            // InternalTGG.g:1756:1: ( ( rule__CorrType__Alternatives_1 ) )
            {
            // InternalTGG.g:1756:1: ( ( rule__CorrType__Alternatives_1 ) )
            // InternalTGG.g:1757:2: ( rule__CorrType__Alternatives_1 )
            {
             before(grammarAccess.getCorrTypeAccess().getAlternatives_1()); 
            // InternalTGG.g:1758:2: ( rule__CorrType__Alternatives_1 )
            // InternalTGG.g:1758:3: rule__CorrType__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__CorrType__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getCorrTypeAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__CorrType__Group__1__Impl"


    // $ANTLR start "rule__CorrType__Group_1_0__0"
    // InternalTGG.g:1767:1: rule__CorrType__Group_1_0__0 : rule__CorrType__Group_1_0__0__Impl rule__CorrType__Group_1_0__1 ;
    public final void rule__CorrType__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1771:1: ( rule__CorrType__Group_1_0__0__Impl rule__CorrType__Group_1_0__1 )
            // InternalTGG.g:1772:2: rule__CorrType__Group_1_0__0__Impl rule__CorrType__Group_1_0__1
            {
            pushFollow(FOLLOW_8);
            rule__CorrType__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrType__Group_1_0__1();

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
    // $ANTLR end "rule__CorrType__Group_1_0__0"


    // $ANTLR start "rule__CorrType__Group_1_0__0__Impl"
    // InternalTGG.g:1779:1: rule__CorrType__Group_1_0__0__Impl : ( '#extends' ) ;
    public final void rule__CorrType__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1783:1: ( ( '#extends' ) )
            // InternalTGG.g:1784:1: ( '#extends' )
            {
            // InternalTGG.g:1784:1: ( '#extends' )
            // InternalTGG.g:1785:2: '#extends'
            {
             before(grammarAccess.getCorrTypeAccess().getExtendsKeyword_1_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCorrTypeAccess().getExtendsKeyword_1_0_0()); 

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
    // $ANTLR end "rule__CorrType__Group_1_0__0__Impl"


    // $ANTLR start "rule__CorrType__Group_1_0__1"
    // InternalTGG.g:1794:1: rule__CorrType__Group_1_0__1 : rule__CorrType__Group_1_0__1__Impl ;
    public final void rule__CorrType__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1798:1: ( rule__CorrType__Group_1_0__1__Impl )
            // InternalTGG.g:1799:2: rule__CorrType__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CorrType__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__CorrType__Group_1_0__1"


    // $ANTLR start "rule__CorrType__Group_1_0__1__Impl"
    // InternalTGG.g:1805:1: rule__CorrType__Group_1_0__1__Impl : ( ( rule__CorrType__SuperAssignment_1_0_1 ) ) ;
    public final void rule__CorrType__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1809:1: ( ( ( rule__CorrType__SuperAssignment_1_0_1 ) ) )
            // InternalTGG.g:1810:1: ( ( rule__CorrType__SuperAssignment_1_0_1 ) )
            {
            // InternalTGG.g:1810:1: ( ( rule__CorrType__SuperAssignment_1_0_1 ) )
            // InternalTGG.g:1811:2: ( rule__CorrType__SuperAssignment_1_0_1 )
            {
             before(grammarAccess.getCorrTypeAccess().getSuperAssignment_1_0_1()); 
            // InternalTGG.g:1812:2: ( rule__CorrType__SuperAssignment_1_0_1 )
            // InternalTGG.g:1812:3: rule__CorrType__SuperAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CorrType__SuperAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCorrTypeAccess().getSuperAssignment_1_0_1()); 

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
    // $ANTLR end "rule__CorrType__Group_1_0__1__Impl"


    // $ANTLR start "rule__CorrType__Group_1_1__0"
    // InternalTGG.g:1821:1: rule__CorrType__Group_1_1__0 : rule__CorrType__Group_1_1__0__Impl rule__CorrType__Group_1_1__1 ;
    public final void rule__CorrType__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1825:1: ( rule__CorrType__Group_1_1__0__Impl rule__CorrType__Group_1_1__1 )
            // InternalTGG.g:1826:2: rule__CorrType__Group_1_1__0__Impl rule__CorrType__Group_1_1__1
            {
            pushFollow(FOLLOW_16);
            rule__CorrType__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrType__Group_1_1__1();

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
    // $ANTLR end "rule__CorrType__Group_1_1__0"


    // $ANTLR start "rule__CorrType__Group_1_1__0__Impl"
    // InternalTGG.g:1833:1: rule__CorrType__Group_1_1__0__Impl : ( '{' ) ;
    public final void rule__CorrType__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1837:1: ( ( '{' ) )
            // InternalTGG.g:1838:1: ( '{' )
            {
            // InternalTGG.g:1838:1: ( '{' )
            // InternalTGG.g:1839:2: '{'
            {
             before(grammarAccess.getCorrTypeAccess().getLeftCurlyBracketKeyword_1_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCorrTypeAccess().getLeftCurlyBracketKeyword_1_1_0()); 

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
    // $ANTLR end "rule__CorrType__Group_1_1__0__Impl"


    // $ANTLR start "rule__CorrType__Group_1_1__1"
    // InternalTGG.g:1848:1: rule__CorrType__Group_1_1__1 : rule__CorrType__Group_1_1__1__Impl rule__CorrType__Group_1_1__2 ;
    public final void rule__CorrType__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1852:1: ( rule__CorrType__Group_1_1__1__Impl rule__CorrType__Group_1_1__2 )
            // InternalTGG.g:1853:2: rule__CorrType__Group_1_1__1__Impl rule__CorrType__Group_1_1__2
            {
            pushFollow(FOLLOW_8);
            rule__CorrType__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrType__Group_1_1__2();

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
    // $ANTLR end "rule__CorrType__Group_1_1__1"


    // $ANTLR start "rule__CorrType__Group_1_1__1__Impl"
    // InternalTGG.g:1860:1: rule__CorrType__Group_1_1__1__Impl : ( '#src->' ) ;
    public final void rule__CorrType__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1864:1: ( ( '#src->' ) )
            // InternalTGG.g:1865:1: ( '#src->' )
            {
            // InternalTGG.g:1865:1: ( '#src->' )
            // InternalTGG.g:1866:2: '#src->'
            {
             before(grammarAccess.getCorrTypeAccess().getSrcKeyword_1_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCorrTypeAccess().getSrcKeyword_1_1_1()); 

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
    // $ANTLR end "rule__CorrType__Group_1_1__1__Impl"


    // $ANTLR start "rule__CorrType__Group_1_1__2"
    // InternalTGG.g:1875:1: rule__CorrType__Group_1_1__2 : rule__CorrType__Group_1_1__2__Impl rule__CorrType__Group_1_1__3 ;
    public final void rule__CorrType__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1879:1: ( rule__CorrType__Group_1_1__2__Impl rule__CorrType__Group_1_1__3 )
            // InternalTGG.g:1880:2: rule__CorrType__Group_1_1__2__Impl rule__CorrType__Group_1_1__3
            {
            pushFollow(FOLLOW_17);
            rule__CorrType__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrType__Group_1_1__3();

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
    // $ANTLR end "rule__CorrType__Group_1_1__2"


    // $ANTLR start "rule__CorrType__Group_1_1__2__Impl"
    // InternalTGG.g:1887:1: rule__CorrType__Group_1_1__2__Impl : ( ( rule__CorrType__SourceAssignment_1_1_2 ) ) ;
    public final void rule__CorrType__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1891:1: ( ( ( rule__CorrType__SourceAssignment_1_1_2 ) ) )
            // InternalTGG.g:1892:1: ( ( rule__CorrType__SourceAssignment_1_1_2 ) )
            {
            // InternalTGG.g:1892:1: ( ( rule__CorrType__SourceAssignment_1_1_2 ) )
            // InternalTGG.g:1893:2: ( rule__CorrType__SourceAssignment_1_1_2 )
            {
             before(grammarAccess.getCorrTypeAccess().getSourceAssignment_1_1_2()); 
            // InternalTGG.g:1894:2: ( rule__CorrType__SourceAssignment_1_1_2 )
            // InternalTGG.g:1894:3: rule__CorrType__SourceAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CorrType__SourceAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCorrTypeAccess().getSourceAssignment_1_1_2()); 

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
    // $ANTLR end "rule__CorrType__Group_1_1__2__Impl"


    // $ANTLR start "rule__CorrType__Group_1_1__3"
    // InternalTGG.g:1902:1: rule__CorrType__Group_1_1__3 : rule__CorrType__Group_1_1__3__Impl rule__CorrType__Group_1_1__4 ;
    public final void rule__CorrType__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1906:1: ( rule__CorrType__Group_1_1__3__Impl rule__CorrType__Group_1_1__4 )
            // InternalTGG.g:1907:2: rule__CorrType__Group_1_1__3__Impl rule__CorrType__Group_1_1__4
            {
            pushFollow(FOLLOW_8);
            rule__CorrType__Group_1_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrType__Group_1_1__4();

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
    // $ANTLR end "rule__CorrType__Group_1_1__3"


    // $ANTLR start "rule__CorrType__Group_1_1__3__Impl"
    // InternalTGG.g:1914:1: rule__CorrType__Group_1_1__3__Impl : ( '#trg->' ) ;
    public final void rule__CorrType__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1918:1: ( ( '#trg->' ) )
            // InternalTGG.g:1919:1: ( '#trg->' )
            {
            // InternalTGG.g:1919:1: ( '#trg->' )
            // InternalTGG.g:1920:2: '#trg->'
            {
             before(grammarAccess.getCorrTypeAccess().getTrgKeyword_1_1_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCorrTypeAccess().getTrgKeyword_1_1_3()); 

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
    // $ANTLR end "rule__CorrType__Group_1_1__3__Impl"


    // $ANTLR start "rule__CorrType__Group_1_1__4"
    // InternalTGG.g:1929:1: rule__CorrType__Group_1_1__4 : rule__CorrType__Group_1_1__4__Impl rule__CorrType__Group_1_1__5 ;
    public final void rule__CorrType__Group_1_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1933:1: ( rule__CorrType__Group_1_1__4__Impl rule__CorrType__Group_1_1__5 )
            // InternalTGG.g:1934:2: rule__CorrType__Group_1_1__4__Impl rule__CorrType__Group_1_1__5
            {
            pushFollow(FOLLOW_18);
            rule__CorrType__Group_1_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrType__Group_1_1__5();

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
    // $ANTLR end "rule__CorrType__Group_1_1__4"


    // $ANTLR start "rule__CorrType__Group_1_1__4__Impl"
    // InternalTGG.g:1941:1: rule__CorrType__Group_1_1__4__Impl : ( ( rule__CorrType__TargetAssignment_1_1_4 ) ) ;
    public final void rule__CorrType__Group_1_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1945:1: ( ( ( rule__CorrType__TargetAssignment_1_1_4 ) ) )
            // InternalTGG.g:1946:1: ( ( rule__CorrType__TargetAssignment_1_1_4 ) )
            {
            // InternalTGG.g:1946:1: ( ( rule__CorrType__TargetAssignment_1_1_4 ) )
            // InternalTGG.g:1947:2: ( rule__CorrType__TargetAssignment_1_1_4 )
            {
             before(grammarAccess.getCorrTypeAccess().getTargetAssignment_1_1_4()); 
            // InternalTGG.g:1948:2: ( rule__CorrType__TargetAssignment_1_1_4 )
            // InternalTGG.g:1948:3: rule__CorrType__TargetAssignment_1_1_4
            {
            pushFollow(FOLLOW_2);
            rule__CorrType__TargetAssignment_1_1_4();

            state._fsp--;


            }

             after(grammarAccess.getCorrTypeAccess().getTargetAssignment_1_1_4()); 

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
    // $ANTLR end "rule__CorrType__Group_1_1__4__Impl"


    // $ANTLR start "rule__CorrType__Group_1_1__5"
    // InternalTGG.g:1956:1: rule__CorrType__Group_1_1__5 : rule__CorrType__Group_1_1__5__Impl ;
    public final void rule__CorrType__Group_1_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1960:1: ( rule__CorrType__Group_1_1__5__Impl )
            // InternalTGG.g:1961:2: rule__CorrType__Group_1_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CorrType__Group_1_1__5__Impl();

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
    // $ANTLR end "rule__CorrType__Group_1_1__5"


    // $ANTLR start "rule__CorrType__Group_1_1__5__Impl"
    // InternalTGG.g:1967:1: rule__CorrType__Group_1_1__5__Impl : ( '}' ) ;
    public final void rule__CorrType__Group_1_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1971:1: ( ( '}' ) )
            // InternalTGG.g:1972:1: ( '}' )
            {
            // InternalTGG.g:1972:1: ( '}' )
            // InternalTGG.g:1973:2: '}'
            {
             before(grammarAccess.getCorrTypeAccess().getRightCurlyBracketKeyword_1_1_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCorrTypeAccess().getRightCurlyBracketKeyword_1_1_5()); 

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
    // $ANTLR end "rule__CorrType__Group_1_1__5__Impl"


    // $ANTLR start "rule__AttrCondDef__Group__0"
    // InternalTGG.g:1983:1: rule__AttrCondDef__Group__0 : rule__AttrCondDef__Group__0__Impl rule__AttrCondDef__Group__1 ;
    public final void rule__AttrCondDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1987:1: ( rule__AttrCondDef__Group__0__Impl rule__AttrCondDef__Group__1 )
            // InternalTGG.g:1988:2: rule__AttrCondDef__Group__0__Impl rule__AttrCondDef__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AttrCondDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group__1();

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
    // $ANTLR end "rule__AttrCondDef__Group__0"


    // $ANTLR start "rule__AttrCondDef__Group__0__Impl"
    // InternalTGG.g:1995:1: rule__AttrCondDef__Group__0__Impl : ( ( rule__AttrCondDef__UserDefinedAssignment_0 )? ) ;
    public final void rule__AttrCondDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:1999:1: ( ( ( rule__AttrCondDef__UserDefinedAssignment_0 )? ) )
            // InternalTGG.g:2000:1: ( ( rule__AttrCondDef__UserDefinedAssignment_0 )? )
            {
            // InternalTGG.g:2000:1: ( ( rule__AttrCondDef__UserDefinedAssignment_0 )? )
            // InternalTGG.g:2001:2: ( rule__AttrCondDef__UserDefinedAssignment_0 )?
            {
             before(grammarAccess.getAttrCondDefAccess().getUserDefinedAssignment_0()); 
            // InternalTGG.g:2002:2: ( rule__AttrCondDef__UserDefinedAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTGG.g:2002:3: rule__AttrCondDef__UserDefinedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttrCondDef__UserDefinedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttrCondDefAccess().getUserDefinedAssignment_0()); 

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
    // $ANTLR end "rule__AttrCondDef__Group__0__Impl"


    // $ANTLR start "rule__AttrCondDef__Group__1"
    // InternalTGG.g:2010:1: rule__AttrCondDef__Group__1 : rule__AttrCondDef__Group__1__Impl rule__AttrCondDef__Group__2 ;
    public final void rule__AttrCondDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2014:1: ( rule__AttrCondDef__Group__1__Impl rule__AttrCondDef__Group__2 )
            // InternalTGG.g:2015:2: rule__AttrCondDef__Group__1__Impl rule__AttrCondDef__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__AttrCondDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group__2();

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
    // $ANTLR end "rule__AttrCondDef__Group__1"


    // $ANTLR start "rule__AttrCondDef__Group__1__Impl"
    // InternalTGG.g:2022:1: rule__AttrCondDef__Group__1__Impl : ( ( rule__AttrCondDef__NameAssignment_1 ) ) ;
    public final void rule__AttrCondDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2026:1: ( ( ( rule__AttrCondDef__NameAssignment_1 ) ) )
            // InternalTGG.g:2027:1: ( ( rule__AttrCondDef__NameAssignment_1 ) )
            {
            // InternalTGG.g:2027:1: ( ( rule__AttrCondDef__NameAssignment_1 ) )
            // InternalTGG.g:2028:2: ( rule__AttrCondDef__NameAssignment_1 )
            {
             before(grammarAccess.getAttrCondDefAccess().getNameAssignment_1()); 
            // InternalTGG.g:2029:2: ( rule__AttrCondDef__NameAssignment_1 )
            // InternalTGG.g:2029:3: rule__AttrCondDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondDefAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AttrCondDef__Group__1__Impl"


    // $ANTLR start "rule__AttrCondDef__Group__2"
    // InternalTGG.g:2037:1: rule__AttrCondDef__Group__2 : rule__AttrCondDef__Group__2__Impl rule__AttrCondDef__Group__3 ;
    public final void rule__AttrCondDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2041:1: ( rule__AttrCondDef__Group__2__Impl rule__AttrCondDef__Group__3 )
            // InternalTGG.g:2042:2: rule__AttrCondDef__Group__2__Impl rule__AttrCondDef__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__AttrCondDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group__3();

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
    // $ANTLR end "rule__AttrCondDef__Group__2"


    // $ANTLR start "rule__AttrCondDef__Group__2__Impl"
    // InternalTGG.g:2049:1: rule__AttrCondDef__Group__2__Impl : ( '(' ) ;
    public final void rule__AttrCondDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2053:1: ( ( '(' ) )
            // InternalTGG.g:2054:1: ( '(' )
            {
            // InternalTGG.g:2054:1: ( '(' )
            // InternalTGG.g:2055:2: '('
            {
             before(grammarAccess.getAttrCondDefAccess().getLeftParenthesisKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__AttrCondDef__Group__2__Impl"


    // $ANTLR start "rule__AttrCondDef__Group__3"
    // InternalTGG.g:2064:1: rule__AttrCondDef__Group__3 : rule__AttrCondDef__Group__3__Impl rule__AttrCondDef__Group__4 ;
    public final void rule__AttrCondDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2068:1: ( rule__AttrCondDef__Group__3__Impl rule__AttrCondDef__Group__4 )
            // InternalTGG.g:2069:2: rule__AttrCondDef__Group__3__Impl rule__AttrCondDef__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__AttrCondDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group__4();

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
    // $ANTLR end "rule__AttrCondDef__Group__3"


    // $ANTLR start "rule__AttrCondDef__Group__3__Impl"
    // InternalTGG.g:2076:1: rule__AttrCondDef__Group__3__Impl : ( ( rule__AttrCondDef__Group_3__0 )? ) ;
    public final void rule__AttrCondDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2080:1: ( ( ( rule__AttrCondDef__Group_3__0 )? ) )
            // InternalTGG.g:2081:1: ( ( rule__AttrCondDef__Group_3__0 )? )
            {
            // InternalTGG.g:2081:1: ( ( rule__AttrCondDef__Group_3__0 )? )
            // InternalTGG.g:2082:2: ( rule__AttrCondDef__Group_3__0 )?
            {
             before(grammarAccess.getAttrCondDefAccess().getGroup_3()); 
            // InternalTGG.g:2083:2: ( rule__AttrCondDef__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTGG.g:2083:3: rule__AttrCondDef__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttrCondDef__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttrCondDefAccess().getGroup_3()); 

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
    // $ANTLR end "rule__AttrCondDef__Group__3__Impl"


    // $ANTLR start "rule__AttrCondDef__Group__4"
    // InternalTGG.g:2091:1: rule__AttrCondDef__Group__4 : rule__AttrCondDef__Group__4__Impl rule__AttrCondDef__Group__5 ;
    public final void rule__AttrCondDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2095:1: ( rule__AttrCondDef__Group__4__Impl rule__AttrCondDef__Group__5 )
            // InternalTGG.g:2096:2: rule__AttrCondDef__Group__4__Impl rule__AttrCondDef__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__AttrCondDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group__5();

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
    // $ANTLR end "rule__AttrCondDef__Group__4"


    // $ANTLR start "rule__AttrCondDef__Group__4__Impl"
    // InternalTGG.g:2103:1: rule__AttrCondDef__Group__4__Impl : ( ')' ) ;
    public final void rule__AttrCondDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2107:1: ( ( ')' ) )
            // InternalTGG.g:2108:1: ( ')' )
            {
            // InternalTGG.g:2108:1: ( ')' )
            // InternalTGG.g:2109:2: ')'
            {
             before(grammarAccess.getAttrCondDefAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__AttrCondDef__Group__4__Impl"


    // $ANTLR start "rule__AttrCondDef__Group__5"
    // InternalTGG.g:2118:1: rule__AttrCondDef__Group__5 : rule__AttrCondDef__Group__5__Impl rule__AttrCondDef__Group__6 ;
    public final void rule__AttrCondDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2122:1: ( rule__AttrCondDef__Group__5__Impl rule__AttrCondDef__Group__6 )
            // InternalTGG.g:2123:2: rule__AttrCondDef__Group__5__Impl rule__AttrCondDef__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__AttrCondDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group__6();

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
    // $ANTLR end "rule__AttrCondDef__Group__5"


    // $ANTLR start "rule__AttrCondDef__Group__5__Impl"
    // InternalTGG.g:2130:1: rule__AttrCondDef__Group__5__Impl : ( '{' ) ;
    public final void rule__AttrCondDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2134:1: ( ( '{' ) )
            // InternalTGG.g:2135:1: ( '{' )
            {
            // InternalTGG.g:2135:1: ( '{' )
            // InternalTGG.g:2136:2: '{'
            {
             before(grammarAccess.getAttrCondDefAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__AttrCondDef__Group__5__Impl"


    // $ANTLR start "rule__AttrCondDef__Group__6"
    // InternalTGG.g:2145:1: rule__AttrCondDef__Group__6 : rule__AttrCondDef__Group__6__Impl rule__AttrCondDef__Group__7 ;
    public final void rule__AttrCondDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2149:1: ( rule__AttrCondDef__Group__6__Impl rule__AttrCondDef__Group__7 )
            // InternalTGG.g:2150:2: rule__AttrCondDef__Group__6__Impl rule__AttrCondDef__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__AttrCondDef__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group__7();

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
    // $ANTLR end "rule__AttrCondDef__Group__6"


    // $ANTLR start "rule__AttrCondDef__Group__6__Impl"
    // InternalTGG.g:2157:1: rule__AttrCondDef__Group__6__Impl : ( '#sync:' ) ;
    public final void rule__AttrCondDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2161:1: ( ( '#sync:' ) )
            // InternalTGG.g:2162:1: ( '#sync:' )
            {
            // InternalTGG.g:2162:1: ( '#sync:' )
            // InternalTGG.g:2163:2: '#sync:'
            {
             before(grammarAccess.getAttrCondDefAccess().getSyncKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefAccess().getSyncKeyword_6()); 

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
    // $ANTLR end "rule__AttrCondDef__Group__6__Impl"


    // $ANTLR start "rule__AttrCondDef__Group__7"
    // InternalTGG.g:2172:1: rule__AttrCondDef__Group__7 : rule__AttrCondDef__Group__7__Impl rule__AttrCondDef__Group__8 ;
    public final void rule__AttrCondDef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2176:1: ( rule__AttrCondDef__Group__7__Impl rule__AttrCondDef__Group__8 )
            // InternalTGG.g:2177:2: rule__AttrCondDef__Group__7__Impl rule__AttrCondDef__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__AttrCondDef__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group__8();

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
    // $ANTLR end "rule__AttrCondDef__Group__7"


    // $ANTLR start "rule__AttrCondDef__Group__7__Impl"
    // InternalTGG.g:2184:1: rule__AttrCondDef__Group__7__Impl : ( ( rule__AttrCondDef__AllowedSyncAdornmentsAssignment_7 ) ) ;
    public final void rule__AttrCondDef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2188:1: ( ( ( rule__AttrCondDef__AllowedSyncAdornmentsAssignment_7 ) ) )
            // InternalTGG.g:2189:1: ( ( rule__AttrCondDef__AllowedSyncAdornmentsAssignment_7 ) )
            {
            // InternalTGG.g:2189:1: ( ( rule__AttrCondDef__AllowedSyncAdornmentsAssignment_7 ) )
            // InternalTGG.g:2190:2: ( rule__AttrCondDef__AllowedSyncAdornmentsAssignment_7 )
            {
             before(grammarAccess.getAttrCondDefAccess().getAllowedSyncAdornmentsAssignment_7()); 
            // InternalTGG.g:2191:2: ( rule__AttrCondDef__AllowedSyncAdornmentsAssignment_7 )
            // InternalTGG.g:2191:3: rule__AttrCondDef__AllowedSyncAdornmentsAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__AllowedSyncAdornmentsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondDefAccess().getAllowedSyncAdornmentsAssignment_7()); 

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
    // $ANTLR end "rule__AttrCondDef__Group__7__Impl"


    // $ANTLR start "rule__AttrCondDef__Group__8"
    // InternalTGG.g:2199:1: rule__AttrCondDef__Group__8 : rule__AttrCondDef__Group__8__Impl rule__AttrCondDef__Group__9 ;
    public final void rule__AttrCondDef__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2203:1: ( rule__AttrCondDef__Group__8__Impl rule__AttrCondDef__Group__9 )
            // InternalTGG.g:2204:2: rule__AttrCondDef__Group__8__Impl rule__AttrCondDef__Group__9
            {
            pushFollow(FOLLOW_23);
            rule__AttrCondDef__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group__9();

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
    // $ANTLR end "rule__AttrCondDef__Group__8"


    // $ANTLR start "rule__AttrCondDef__Group__8__Impl"
    // InternalTGG.g:2211:1: rule__AttrCondDef__Group__8__Impl : ( ( rule__AttrCondDef__Group_8__0 )* ) ;
    public final void rule__AttrCondDef__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2215:1: ( ( ( rule__AttrCondDef__Group_8__0 )* ) )
            // InternalTGG.g:2216:1: ( ( rule__AttrCondDef__Group_8__0 )* )
            {
            // InternalTGG.g:2216:1: ( ( rule__AttrCondDef__Group_8__0 )* )
            // InternalTGG.g:2217:2: ( rule__AttrCondDef__Group_8__0 )*
            {
             before(grammarAccess.getAttrCondDefAccess().getGroup_8()); 
            // InternalTGG.g:2218:2: ( rule__AttrCondDef__Group_8__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTGG.g:2218:3: rule__AttrCondDef__Group_8__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__AttrCondDef__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getAttrCondDefAccess().getGroup_8()); 

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
    // $ANTLR end "rule__AttrCondDef__Group__8__Impl"


    // $ANTLR start "rule__AttrCondDef__Group__9"
    // InternalTGG.g:2226:1: rule__AttrCondDef__Group__9 : rule__AttrCondDef__Group__9__Impl rule__AttrCondDef__Group__10 ;
    public final void rule__AttrCondDef__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2230:1: ( rule__AttrCondDef__Group__9__Impl rule__AttrCondDef__Group__10 )
            // InternalTGG.g:2231:2: rule__AttrCondDef__Group__9__Impl rule__AttrCondDef__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__AttrCondDef__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group__10();

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
    // $ANTLR end "rule__AttrCondDef__Group__9"


    // $ANTLR start "rule__AttrCondDef__Group__9__Impl"
    // InternalTGG.g:2238:1: rule__AttrCondDef__Group__9__Impl : ( ( rule__AttrCondDef__Group_9__0 )? ) ;
    public final void rule__AttrCondDef__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2242:1: ( ( ( rule__AttrCondDef__Group_9__0 )? ) )
            // InternalTGG.g:2243:1: ( ( rule__AttrCondDef__Group_9__0 )? )
            {
            // InternalTGG.g:2243:1: ( ( rule__AttrCondDef__Group_9__0 )? )
            // InternalTGG.g:2244:2: ( rule__AttrCondDef__Group_9__0 )?
            {
             before(grammarAccess.getAttrCondDefAccess().getGroup_9()); 
            // InternalTGG.g:2245:2: ( rule__AttrCondDef__Group_9__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTGG.g:2245:3: rule__AttrCondDef__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttrCondDef__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttrCondDefAccess().getGroup_9()); 

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
    // $ANTLR end "rule__AttrCondDef__Group__9__Impl"


    // $ANTLR start "rule__AttrCondDef__Group__10"
    // InternalTGG.g:2253:1: rule__AttrCondDef__Group__10 : rule__AttrCondDef__Group__10__Impl ;
    public final void rule__AttrCondDef__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2257:1: ( rule__AttrCondDef__Group__10__Impl )
            // InternalTGG.g:2258:2: rule__AttrCondDef__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group__10__Impl();

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
    // $ANTLR end "rule__AttrCondDef__Group__10"


    // $ANTLR start "rule__AttrCondDef__Group__10__Impl"
    // InternalTGG.g:2264:1: rule__AttrCondDef__Group__10__Impl : ( '}' ) ;
    public final void rule__AttrCondDef__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2268:1: ( ( '}' ) )
            // InternalTGG.g:2269:1: ( '}' )
            {
            // InternalTGG.g:2269:1: ( '}' )
            // InternalTGG.g:2270:2: '}'
            {
             before(grammarAccess.getAttrCondDefAccess().getRightCurlyBracketKeyword_10()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefAccess().getRightCurlyBracketKeyword_10()); 

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
    // $ANTLR end "rule__AttrCondDef__Group__10__Impl"


    // $ANTLR start "rule__AttrCondDef__Group_3__0"
    // InternalTGG.g:2280:1: rule__AttrCondDef__Group_3__0 : rule__AttrCondDef__Group_3__0__Impl rule__AttrCondDef__Group_3__1 ;
    public final void rule__AttrCondDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2284:1: ( rule__AttrCondDef__Group_3__0__Impl rule__AttrCondDef__Group_3__1 )
            // InternalTGG.g:2285:2: rule__AttrCondDef__Group_3__0__Impl rule__AttrCondDef__Group_3__1
            {
            pushFollow(FOLLOW_25);
            rule__AttrCondDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group_3__1();

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
    // $ANTLR end "rule__AttrCondDef__Group_3__0"


    // $ANTLR start "rule__AttrCondDef__Group_3__0__Impl"
    // InternalTGG.g:2292:1: rule__AttrCondDef__Group_3__0__Impl : ( ( rule__AttrCondDef__ParamsAssignment_3_0 ) ) ;
    public final void rule__AttrCondDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2296:1: ( ( ( rule__AttrCondDef__ParamsAssignment_3_0 ) ) )
            // InternalTGG.g:2297:1: ( ( rule__AttrCondDef__ParamsAssignment_3_0 ) )
            {
            // InternalTGG.g:2297:1: ( ( rule__AttrCondDef__ParamsAssignment_3_0 ) )
            // InternalTGG.g:2298:2: ( rule__AttrCondDef__ParamsAssignment_3_0 )
            {
             before(grammarAccess.getAttrCondDefAccess().getParamsAssignment_3_0()); 
            // InternalTGG.g:2299:2: ( rule__AttrCondDef__ParamsAssignment_3_0 )
            // InternalTGG.g:2299:3: rule__AttrCondDef__ParamsAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__ParamsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondDefAccess().getParamsAssignment_3_0()); 

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
    // $ANTLR end "rule__AttrCondDef__Group_3__0__Impl"


    // $ANTLR start "rule__AttrCondDef__Group_3__1"
    // InternalTGG.g:2307:1: rule__AttrCondDef__Group_3__1 : rule__AttrCondDef__Group_3__1__Impl ;
    public final void rule__AttrCondDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2311:1: ( rule__AttrCondDef__Group_3__1__Impl )
            // InternalTGG.g:2312:2: rule__AttrCondDef__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group_3__1__Impl();

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
    // $ANTLR end "rule__AttrCondDef__Group_3__1"


    // $ANTLR start "rule__AttrCondDef__Group_3__1__Impl"
    // InternalTGG.g:2318:1: rule__AttrCondDef__Group_3__1__Impl : ( ( rule__AttrCondDef__Group_3_1__0 )* ) ;
    public final void rule__AttrCondDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2322:1: ( ( ( rule__AttrCondDef__Group_3_1__0 )* ) )
            // InternalTGG.g:2323:1: ( ( rule__AttrCondDef__Group_3_1__0 )* )
            {
            // InternalTGG.g:2323:1: ( ( rule__AttrCondDef__Group_3_1__0 )* )
            // InternalTGG.g:2324:2: ( rule__AttrCondDef__Group_3_1__0 )*
            {
             before(grammarAccess.getAttrCondDefAccess().getGroup_3_1()); 
            // InternalTGG.g:2325:2: ( rule__AttrCondDef__Group_3_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalTGG.g:2325:3: rule__AttrCondDef__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__AttrCondDef__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getAttrCondDefAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__AttrCondDef__Group_3__1__Impl"


    // $ANTLR start "rule__AttrCondDef__Group_3_1__0"
    // InternalTGG.g:2334:1: rule__AttrCondDef__Group_3_1__0 : rule__AttrCondDef__Group_3_1__0__Impl rule__AttrCondDef__Group_3_1__1 ;
    public final void rule__AttrCondDef__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2338:1: ( rule__AttrCondDef__Group_3_1__0__Impl rule__AttrCondDef__Group_3_1__1 )
            // InternalTGG.g:2339:2: rule__AttrCondDef__Group_3_1__0__Impl rule__AttrCondDef__Group_3_1__1
            {
            pushFollow(FOLLOW_26);
            rule__AttrCondDef__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group_3_1__1();

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
    // $ANTLR end "rule__AttrCondDef__Group_3_1__0"


    // $ANTLR start "rule__AttrCondDef__Group_3_1__0__Impl"
    // InternalTGG.g:2346:1: rule__AttrCondDef__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__AttrCondDef__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2350:1: ( ( ',' ) )
            // InternalTGG.g:2351:1: ( ',' )
            {
            // InternalTGG.g:2351:1: ( ',' )
            // InternalTGG.g:2352:2: ','
            {
             before(grammarAccess.getAttrCondDefAccess().getCommaKeyword_3_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__AttrCondDef__Group_3_1__0__Impl"


    // $ANTLR start "rule__AttrCondDef__Group_3_1__1"
    // InternalTGG.g:2361:1: rule__AttrCondDef__Group_3_1__1 : rule__AttrCondDef__Group_3_1__1__Impl ;
    public final void rule__AttrCondDef__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2365:1: ( rule__AttrCondDef__Group_3_1__1__Impl )
            // InternalTGG.g:2366:2: rule__AttrCondDef__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__AttrCondDef__Group_3_1__1"


    // $ANTLR start "rule__AttrCondDef__Group_3_1__1__Impl"
    // InternalTGG.g:2372:1: rule__AttrCondDef__Group_3_1__1__Impl : ( ( rule__AttrCondDef__ParamsAssignment_3_1_1 ) ) ;
    public final void rule__AttrCondDef__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2376:1: ( ( ( rule__AttrCondDef__ParamsAssignment_3_1_1 ) ) )
            // InternalTGG.g:2377:1: ( ( rule__AttrCondDef__ParamsAssignment_3_1_1 ) )
            {
            // InternalTGG.g:2377:1: ( ( rule__AttrCondDef__ParamsAssignment_3_1_1 ) )
            // InternalTGG.g:2378:2: ( rule__AttrCondDef__ParamsAssignment_3_1_1 )
            {
             before(grammarAccess.getAttrCondDefAccess().getParamsAssignment_3_1_1()); 
            // InternalTGG.g:2379:2: ( rule__AttrCondDef__ParamsAssignment_3_1_1 )
            // InternalTGG.g:2379:3: rule__AttrCondDef__ParamsAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__ParamsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondDefAccess().getParamsAssignment_3_1_1()); 

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
    // $ANTLR end "rule__AttrCondDef__Group_3_1__1__Impl"


    // $ANTLR start "rule__AttrCondDef__Group_8__0"
    // InternalTGG.g:2388:1: rule__AttrCondDef__Group_8__0 : rule__AttrCondDef__Group_8__0__Impl rule__AttrCondDef__Group_8__1 ;
    public final void rule__AttrCondDef__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2392:1: ( rule__AttrCondDef__Group_8__0__Impl rule__AttrCondDef__Group_8__1 )
            // InternalTGG.g:2393:2: rule__AttrCondDef__Group_8__0__Impl rule__AttrCondDef__Group_8__1
            {
            pushFollow(FOLLOW_8);
            rule__AttrCondDef__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group_8__1();

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
    // $ANTLR end "rule__AttrCondDef__Group_8__0"


    // $ANTLR start "rule__AttrCondDef__Group_8__0__Impl"
    // InternalTGG.g:2400:1: rule__AttrCondDef__Group_8__0__Impl : ( ',' ) ;
    public final void rule__AttrCondDef__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2404:1: ( ( ',' ) )
            // InternalTGG.g:2405:1: ( ',' )
            {
            // InternalTGG.g:2405:1: ( ',' )
            // InternalTGG.g:2406:2: ','
            {
             before(grammarAccess.getAttrCondDefAccess().getCommaKeyword_8_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefAccess().getCommaKeyword_8_0()); 

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
    // $ANTLR end "rule__AttrCondDef__Group_8__0__Impl"


    // $ANTLR start "rule__AttrCondDef__Group_8__1"
    // InternalTGG.g:2415:1: rule__AttrCondDef__Group_8__1 : rule__AttrCondDef__Group_8__1__Impl ;
    public final void rule__AttrCondDef__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2419:1: ( rule__AttrCondDef__Group_8__1__Impl )
            // InternalTGG.g:2420:2: rule__AttrCondDef__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group_8__1__Impl();

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
    // $ANTLR end "rule__AttrCondDef__Group_8__1"


    // $ANTLR start "rule__AttrCondDef__Group_8__1__Impl"
    // InternalTGG.g:2426:1: rule__AttrCondDef__Group_8__1__Impl : ( ( rule__AttrCondDef__AllowedSyncAdornmentsAssignment_8_1 ) ) ;
    public final void rule__AttrCondDef__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2430:1: ( ( ( rule__AttrCondDef__AllowedSyncAdornmentsAssignment_8_1 ) ) )
            // InternalTGG.g:2431:1: ( ( rule__AttrCondDef__AllowedSyncAdornmentsAssignment_8_1 ) )
            {
            // InternalTGG.g:2431:1: ( ( rule__AttrCondDef__AllowedSyncAdornmentsAssignment_8_1 ) )
            // InternalTGG.g:2432:2: ( rule__AttrCondDef__AllowedSyncAdornmentsAssignment_8_1 )
            {
             before(grammarAccess.getAttrCondDefAccess().getAllowedSyncAdornmentsAssignment_8_1()); 
            // InternalTGG.g:2433:2: ( rule__AttrCondDef__AllowedSyncAdornmentsAssignment_8_1 )
            // InternalTGG.g:2433:3: rule__AttrCondDef__AllowedSyncAdornmentsAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__AllowedSyncAdornmentsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondDefAccess().getAllowedSyncAdornmentsAssignment_8_1()); 

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
    // $ANTLR end "rule__AttrCondDef__Group_8__1__Impl"


    // $ANTLR start "rule__AttrCondDef__Group_9__0"
    // InternalTGG.g:2442:1: rule__AttrCondDef__Group_9__0 : rule__AttrCondDef__Group_9__0__Impl rule__AttrCondDef__Group_9__1 ;
    public final void rule__AttrCondDef__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2446:1: ( rule__AttrCondDef__Group_9__0__Impl rule__AttrCondDef__Group_9__1 )
            // InternalTGG.g:2447:2: rule__AttrCondDef__Group_9__0__Impl rule__AttrCondDef__Group_9__1
            {
            pushFollow(FOLLOW_8);
            rule__AttrCondDef__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group_9__1();

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
    // $ANTLR end "rule__AttrCondDef__Group_9__0"


    // $ANTLR start "rule__AttrCondDef__Group_9__0__Impl"
    // InternalTGG.g:2454:1: rule__AttrCondDef__Group_9__0__Impl : ( '#gen:' ) ;
    public final void rule__AttrCondDef__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2458:1: ( ( '#gen:' ) )
            // InternalTGG.g:2459:1: ( '#gen:' )
            {
            // InternalTGG.g:2459:1: ( '#gen:' )
            // InternalTGG.g:2460:2: '#gen:'
            {
             before(grammarAccess.getAttrCondDefAccess().getGenKeyword_9_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefAccess().getGenKeyword_9_0()); 

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
    // $ANTLR end "rule__AttrCondDef__Group_9__0__Impl"


    // $ANTLR start "rule__AttrCondDef__Group_9__1"
    // InternalTGG.g:2469:1: rule__AttrCondDef__Group_9__1 : rule__AttrCondDef__Group_9__1__Impl ;
    public final void rule__AttrCondDef__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2473:1: ( rule__AttrCondDef__Group_9__1__Impl )
            // InternalTGG.g:2474:2: rule__AttrCondDef__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group_9__1__Impl();

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
    // $ANTLR end "rule__AttrCondDef__Group_9__1"


    // $ANTLR start "rule__AttrCondDef__Group_9__1__Impl"
    // InternalTGG.g:2480:1: rule__AttrCondDef__Group_9__1__Impl : ( ( rule__AttrCondDef__Group_9_1__0 )? ) ;
    public final void rule__AttrCondDef__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2484:1: ( ( ( rule__AttrCondDef__Group_9_1__0 )? ) )
            // InternalTGG.g:2485:1: ( ( rule__AttrCondDef__Group_9_1__0 )? )
            {
            // InternalTGG.g:2485:1: ( ( rule__AttrCondDef__Group_9_1__0 )? )
            // InternalTGG.g:2486:2: ( rule__AttrCondDef__Group_9_1__0 )?
            {
             before(grammarAccess.getAttrCondDefAccess().getGroup_9_1()); 
            // InternalTGG.g:2487:2: ( rule__AttrCondDef__Group_9_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTGG.g:2487:3: rule__AttrCondDef__Group_9_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttrCondDef__Group_9_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttrCondDefAccess().getGroup_9_1()); 

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
    // $ANTLR end "rule__AttrCondDef__Group_9__1__Impl"


    // $ANTLR start "rule__AttrCondDef__Group_9_1__0"
    // InternalTGG.g:2496:1: rule__AttrCondDef__Group_9_1__0 : rule__AttrCondDef__Group_9_1__0__Impl rule__AttrCondDef__Group_9_1__1 ;
    public final void rule__AttrCondDef__Group_9_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2500:1: ( rule__AttrCondDef__Group_9_1__0__Impl rule__AttrCondDef__Group_9_1__1 )
            // InternalTGG.g:2501:2: rule__AttrCondDef__Group_9_1__0__Impl rule__AttrCondDef__Group_9_1__1
            {
            pushFollow(FOLLOW_25);
            rule__AttrCondDef__Group_9_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group_9_1__1();

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
    // $ANTLR end "rule__AttrCondDef__Group_9_1__0"


    // $ANTLR start "rule__AttrCondDef__Group_9_1__0__Impl"
    // InternalTGG.g:2508:1: rule__AttrCondDef__Group_9_1__0__Impl : ( ( rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_0 ) ) ;
    public final void rule__AttrCondDef__Group_9_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2512:1: ( ( ( rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_0 ) ) )
            // InternalTGG.g:2513:1: ( ( rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_0 ) )
            {
            // InternalTGG.g:2513:1: ( ( rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_0 ) )
            // InternalTGG.g:2514:2: ( rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_0 )
            {
             before(grammarAccess.getAttrCondDefAccess().getAllowedGenAdornmentsAssignment_9_1_0()); 
            // InternalTGG.g:2515:2: ( rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_0 )
            // InternalTGG.g:2515:3: rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondDefAccess().getAllowedGenAdornmentsAssignment_9_1_0()); 

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
    // $ANTLR end "rule__AttrCondDef__Group_9_1__0__Impl"


    // $ANTLR start "rule__AttrCondDef__Group_9_1__1"
    // InternalTGG.g:2523:1: rule__AttrCondDef__Group_9_1__1 : rule__AttrCondDef__Group_9_1__1__Impl ;
    public final void rule__AttrCondDef__Group_9_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2527:1: ( rule__AttrCondDef__Group_9_1__1__Impl )
            // InternalTGG.g:2528:2: rule__AttrCondDef__Group_9_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group_9_1__1__Impl();

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
    // $ANTLR end "rule__AttrCondDef__Group_9_1__1"


    // $ANTLR start "rule__AttrCondDef__Group_9_1__1__Impl"
    // InternalTGG.g:2534:1: rule__AttrCondDef__Group_9_1__1__Impl : ( ( rule__AttrCondDef__Group_9_1_1__0 )* ) ;
    public final void rule__AttrCondDef__Group_9_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2538:1: ( ( ( rule__AttrCondDef__Group_9_1_1__0 )* ) )
            // InternalTGG.g:2539:1: ( ( rule__AttrCondDef__Group_9_1_1__0 )* )
            {
            // InternalTGG.g:2539:1: ( ( rule__AttrCondDef__Group_9_1_1__0 )* )
            // InternalTGG.g:2540:2: ( rule__AttrCondDef__Group_9_1_1__0 )*
            {
             before(grammarAccess.getAttrCondDefAccess().getGroup_9_1_1()); 
            // InternalTGG.g:2541:2: ( rule__AttrCondDef__Group_9_1_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==35) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTGG.g:2541:3: rule__AttrCondDef__Group_9_1_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__AttrCondDef__Group_9_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getAttrCondDefAccess().getGroup_9_1_1()); 

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
    // $ANTLR end "rule__AttrCondDef__Group_9_1__1__Impl"


    // $ANTLR start "rule__AttrCondDef__Group_9_1_1__0"
    // InternalTGG.g:2550:1: rule__AttrCondDef__Group_9_1_1__0 : rule__AttrCondDef__Group_9_1_1__0__Impl rule__AttrCondDef__Group_9_1_1__1 ;
    public final void rule__AttrCondDef__Group_9_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2554:1: ( rule__AttrCondDef__Group_9_1_1__0__Impl rule__AttrCondDef__Group_9_1_1__1 )
            // InternalTGG.g:2555:2: rule__AttrCondDef__Group_9_1_1__0__Impl rule__AttrCondDef__Group_9_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__AttrCondDef__Group_9_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group_9_1_1__1();

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
    // $ANTLR end "rule__AttrCondDef__Group_9_1_1__0"


    // $ANTLR start "rule__AttrCondDef__Group_9_1_1__0__Impl"
    // InternalTGG.g:2562:1: rule__AttrCondDef__Group_9_1_1__0__Impl : ( ',' ) ;
    public final void rule__AttrCondDef__Group_9_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2566:1: ( ( ',' ) )
            // InternalTGG.g:2567:1: ( ',' )
            {
            // InternalTGG.g:2567:1: ( ',' )
            // InternalTGG.g:2568:2: ','
            {
             before(grammarAccess.getAttrCondDefAccess().getCommaKeyword_9_1_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefAccess().getCommaKeyword_9_1_1_0()); 

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
    // $ANTLR end "rule__AttrCondDef__Group_9_1_1__0__Impl"


    // $ANTLR start "rule__AttrCondDef__Group_9_1_1__1"
    // InternalTGG.g:2577:1: rule__AttrCondDef__Group_9_1_1__1 : rule__AttrCondDef__Group_9_1_1__1__Impl ;
    public final void rule__AttrCondDef__Group_9_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2581:1: ( rule__AttrCondDef__Group_9_1_1__1__Impl )
            // InternalTGG.g:2582:2: rule__AttrCondDef__Group_9_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__Group_9_1_1__1__Impl();

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
    // $ANTLR end "rule__AttrCondDef__Group_9_1_1__1"


    // $ANTLR start "rule__AttrCondDef__Group_9_1_1__1__Impl"
    // InternalTGG.g:2588:1: rule__AttrCondDef__Group_9_1_1__1__Impl : ( ( rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_1_1 ) ) ;
    public final void rule__AttrCondDef__Group_9_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2592:1: ( ( ( rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_1_1 ) ) )
            // InternalTGG.g:2593:1: ( ( rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_1_1 ) )
            {
            // InternalTGG.g:2593:1: ( ( rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_1_1 ) )
            // InternalTGG.g:2594:2: ( rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_1_1 )
            {
             before(grammarAccess.getAttrCondDefAccess().getAllowedGenAdornmentsAssignment_9_1_1_1()); 
            // InternalTGG.g:2595:2: ( rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_1_1 )
            // InternalTGG.g:2595:3: rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondDefAccess().getAllowedGenAdornmentsAssignment_9_1_1_1()); 

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
    // $ANTLR end "rule__AttrCondDef__Group_9_1_1__1__Impl"


    // $ANTLR start "rule__Param__Group__0"
    // InternalTGG.g:2604:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2608:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // InternalTGG.g:2609:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Param__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group__1();

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
    // $ANTLR end "rule__Param__Group__0"


    // $ANTLR start "rule__Param__Group__0__Impl"
    // InternalTGG.g:2616:1: rule__Param__Group__0__Impl : ( ( rule__Param__IndexAssignment_0 ) ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2620:1: ( ( ( rule__Param__IndexAssignment_0 ) ) )
            // InternalTGG.g:2621:1: ( ( rule__Param__IndexAssignment_0 ) )
            {
            // InternalTGG.g:2621:1: ( ( rule__Param__IndexAssignment_0 ) )
            // InternalTGG.g:2622:2: ( rule__Param__IndexAssignment_0 )
            {
             before(grammarAccess.getParamAccess().getIndexAssignment_0()); 
            // InternalTGG.g:2623:2: ( rule__Param__IndexAssignment_0 )
            // InternalTGG.g:2623:3: rule__Param__IndexAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Param__IndexAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getIndexAssignment_0()); 

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
    // $ANTLR end "rule__Param__Group__0__Impl"


    // $ANTLR start "rule__Param__Group__1"
    // InternalTGG.g:2631:1: rule__Param__Group__1 : rule__Param__Group__1__Impl rule__Param__Group__2 ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2635:1: ( rule__Param__Group__1__Impl rule__Param__Group__2 )
            // InternalTGG.g:2636:2: rule__Param__Group__1__Impl rule__Param__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Param__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Param__Group__2();

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
    // $ANTLR end "rule__Param__Group__1"


    // $ANTLR start "rule__Param__Group__1__Impl"
    // InternalTGG.g:2643:1: rule__Param__Group__1__Impl : ( ':' ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2647:1: ( ( ':' ) )
            // InternalTGG.g:2648:1: ( ':' )
            {
            // InternalTGG.g:2648:1: ( ':' )
            // InternalTGG.g:2649:2: ':'
            {
             before(grammarAccess.getParamAccess().getColonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Param__Group__1__Impl"


    // $ANTLR start "rule__Param__Group__2"
    // InternalTGG.g:2658:1: rule__Param__Group__2 : rule__Param__Group__2__Impl ;
    public final void rule__Param__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2662:1: ( rule__Param__Group__2__Impl )
            // InternalTGG.g:2663:2: rule__Param__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Param__Group__2__Impl();

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
    // $ANTLR end "rule__Param__Group__2"


    // $ANTLR start "rule__Param__Group__2__Impl"
    // InternalTGG.g:2669:1: rule__Param__Group__2__Impl : ( ( rule__Param__TypeAssignment_2 ) ) ;
    public final void rule__Param__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2673:1: ( ( ( rule__Param__TypeAssignment_2 ) ) )
            // InternalTGG.g:2674:1: ( ( rule__Param__TypeAssignment_2 ) )
            {
            // InternalTGG.g:2674:1: ( ( rule__Param__TypeAssignment_2 ) )
            // InternalTGG.g:2675:2: ( rule__Param__TypeAssignment_2 )
            {
             before(grammarAccess.getParamAccess().getTypeAssignment_2()); 
            // InternalTGG.g:2676:2: ( rule__Param__TypeAssignment_2 )
            // InternalTGG.g:2676:3: rule__Param__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Param__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParamAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Param__Group__2__Impl"


    // $ANTLR start "rule__ParamType__Group__0"
    // InternalTGG.g:2685:1: rule__ParamType__Group__0 : rule__ParamType__Group__0__Impl rule__ParamType__Group__1 ;
    public final void rule__ParamType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2689:1: ( rule__ParamType__Group__0__Impl rule__ParamType__Group__1 )
            // InternalTGG.g:2690:2: rule__ParamType__Group__0__Impl rule__ParamType__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__ParamType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamType__Group__1();

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
    // $ANTLR end "rule__ParamType__Group__0"


    // $ANTLR start "rule__ParamType__Group__0__Impl"
    // InternalTGG.g:2697:1: rule__ParamType__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ParamType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2701:1: ( ( RULE_ID ) )
            // InternalTGG.g:2702:1: ( RULE_ID )
            {
            // InternalTGG.g:2702:1: ( RULE_ID )
            // InternalTGG.g:2703:2: RULE_ID
            {
             before(grammarAccess.getParamTypeAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamTypeAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__ParamType__Group__0__Impl"


    // $ANTLR start "rule__ParamType__Group__1"
    // InternalTGG.g:2712:1: rule__ParamType__Group__1 : rule__ParamType__Group__1__Impl ;
    public final void rule__ParamType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2716:1: ( rule__ParamType__Group__1__Impl )
            // InternalTGG.g:2717:2: rule__ParamType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamType__Group__1__Impl();

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
    // $ANTLR end "rule__ParamType__Group__1"


    // $ANTLR start "rule__ParamType__Group__1__Impl"
    // InternalTGG.g:2723:1: rule__ParamType__Group__1__Impl : ( ( rule__ParamType__Group_1__0 )* ) ;
    public final void rule__ParamType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2727:1: ( ( ( rule__ParamType__Group_1__0 )* ) )
            // InternalTGG.g:2728:1: ( ( rule__ParamType__Group_1__0 )* )
            {
            // InternalTGG.g:2728:1: ( ( rule__ParamType__Group_1__0 )* )
            // InternalTGG.g:2729:2: ( rule__ParamType__Group_1__0 )*
            {
             before(grammarAccess.getParamTypeAccess().getGroup_1()); 
            // InternalTGG.g:2730:2: ( rule__ParamType__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==38) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalTGG.g:2730:3: rule__ParamType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__ParamType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getParamTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ParamType__Group__1__Impl"


    // $ANTLR start "rule__ParamType__Group_1__0"
    // InternalTGG.g:2739:1: rule__ParamType__Group_1__0 : rule__ParamType__Group_1__0__Impl rule__ParamType__Group_1__1 ;
    public final void rule__ParamType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2743:1: ( rule__ParamType__Group_1__0__Impl rule__ParamType__Group_1__1 )
            // InternalTGG.g:2744:2: rule__ParamType__Group_1__0__Impl rule__ParamType__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__ParamType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamType__Group_1__1();

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
    // $ANTLR end "rule__ParamType__Group_1__0"


    // $ANTLR start "rule__ParamType__Group_1__0__Impl"
    // InternalTGG.g:2751:1: rule__ParamType__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ParamType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2755:1: ( ( '.' ) )
            // InternalTGG.g:2756:1: ( '.' )
            {
            // InternalTGG.g:2756:1: ( '.' )
            // InternalTGG.g:2757:2: '.'
            {
             before(grammarAccess.getParamTypeAccess().getFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getParamTypeAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__ParamType__Group_1__0__Impl"


    // $ANTLR start "rule__ParamType__Group_1__1"
    // InternalTGG.g:2766:1: rule__ParamType__Group_1__1 : rule__ParamType__Group_1__1__Impl ;
    public final void rule__ParamType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2770:1: ( rule__ParamType__Group_1__1__Impl )
            // InternalTGG.g:2771:2: rule__ParamType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamType__Group_1__1__Impl();

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
    // $ANTLR end "rule__ParamType__Group_1__1"


    // $ANTLR start "rule__ParamType__Group_1__1__Impl"
    // InternalTGG.g:2777:1: rule__ParamType__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ParamType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2781:1: ( ( RULE_ID ) )
            // InternalTGG.g:2782:1: ( RULE_ID )
            {
            // InternalTGG.g:2782:1: ( RULE_ID )
            // InternalTGG.g:2783:2: RULE_ID
            {
             before(grammarAccess.getParamTypeAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamTypeAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__ParamType__Group_1__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalTGG.g:2793:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2797:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalTGG.g:2798:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalTGG.g:2805:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__ImportsAssignment_0 )* ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2809:1: ( ( ( rule__Rule__ImportsAssignment_0 )* ) )
            // InternalTGG.g:2810:1: ( ( rule__Rule__ImportsAssignment_0 )* )
            {
            // InternalTGG.g:2810:1: ( ( rule__Rule__ImportsAssignment_0 )* )
            // InternalTGG.g:2811:2: ( rule__Rule__ImportsAssignment_0 )*
            {
             before(grammarAccess.getRuleAccess().getImportsAssignment_0()); 
            // InternalTGG.g:2812:2: ( rule__Rule__ImportsAssignment_0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==47) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalTGG.g:2812:3: rule__Rule__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Rule__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getImportsAssignment_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalTGG.g:2820:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2824:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalTGG.g:2825:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalTGG.g:2832:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__UsingAssignment_1 )* ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2836:1: ( ( ( rule__Rule__UsingAssignment_1 )* ) )
            // InternalTGG.g:2837:1: ( ( rule__Rule__UsingAssignment_1 )* )
            {
            // InternalTGG.g:2837:1: ( ( rule__Rule__UsingAssignment_1 )* )
            // InternalTGG.g:2838:2: ( rule__Rule__UsingAssignment_1 )*
            {
             before(grammarAccess.getRuleAccess().getUsingAssignment_1()); 
            // InternalTGG.g:2839:2: ( rule__Rule__UsingAssignment_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==48) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalTGG.g:2839:3: rule__Rule__UsingAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Rule__UsingAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getUsingAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalTGG.g:2847:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2851:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalTGG.g:2852:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalTGG.g:2859:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__AbstractRuleAssignment_2 )? ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2863:1: ( ( ( rule__Rule__AbstractRuleAssignment_2 )? ) )
            // InternalTGG.g:2864:1: ( ( rule__Rule__AbstractRuleAssignment_2 )? )
            {
            // InternalTGG.g:2864:1: ( ( rule__Rule__AbstractRuleAssignment_2 )? )
            // InternalTGG.g:2865:2: ( rule__Rule__AbstractRuleAssignment_2 )?
            {
             before(grammarAccess.getRuleAccess().getAbstractRuleAssignment_2()); 
            // InternalTGG.g:2866:2: ( rule__Rule__AbstractRuleAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTGG.g:2866:3: rule__Rule__AbstractRuleAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__AbstractRuleAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getAbstractRuleAssignment_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalTGG.g:2874:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2878:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalTGG.g:2879:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalTGG.g:2886:1: rule__Rule__Group__3__Impl : ( '#rule' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2890:1: ( ( '#rule' ) )
            // InternalTGG.g:2891:1: ( '#rule' )
            {
            // InternalTGG.g:2891:1: ( '#rule' )
            // InternalTGG.g:2892:2: '#rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalTGG.g:2901:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2905:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalTGG.g:2906:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalTGG.g:2913:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__NameAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2917:1: ( ( ( rule__Rule__NameAssignment_4 ) ) )
            // InternalTGG.g:2918:1: ( ( rule__Rule__NameAssignment_4 ) )
            {
            // InternalTGG.g:2918:1: ( ( rule__Rule__NameAssignment_4 ) )
            // InternalTGG.g:2919:2: ( rule__Rule__NameAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_4()); 
            // InternalTGG.g:2920:2: ( rule__Rule__NameAssignment_4 )
            // InternalTGG.g:2920:3: rule__Rule__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalTGG.g:2928:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2932:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalTGG.g:2933:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

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
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalTGG.g:2940:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 )? ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2944:1: ( ( ( rule__Rule__Group_5__0 )? ) )
            // InternalTGG.g:2945:1: ( ( rule__Rule__Group_5__0 )? )
            {
            // InternalTGG.g:2945:1: ( ( rule__Rule__Group_5__0 )? )
            // InternalTGG.g:2946:2: ( rule__Rule__Group_5__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_5()); 
            // InternalTGG.g:2947:2: ( rule__Rule__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTGG.g:2947:3: rule__Rule__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalTGG.g:2955:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2959:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalTGG.g:2960:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

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
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalTGG.g:2967:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )? ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2971:1: ( ( ( rule__Rule__Group_6__0 )? ) )
            // InternalTGG.g:2972:1: ( ( rule__Rule__Group_6__0 )? )
            {
            // InternalTGG.g:2972:1: ( ( rule__Rule__Group_6__0 )? )
            // InternalTGG.g:2973:2: ( rule__Rule__Group_6__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_6()); 
            // InternalTGG.g:2974:2: ( rule__Rule__Group_6__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==41) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalTGG.g:2974:3: rule__Rule__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalTGG.g:2982:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2986:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalTGG.g:2987:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__8();

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
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalTGG.g:2994:1: rule__Rule__Group__7__Impl : ( '#with' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:2998:1: ( ( '#with' ) )
            // InternalTGG.g:2999:1: ( '#with' )
            {
            // InternalTGG.g:2999:1: ( '#with' )
            // InternalTGG.g:3000:2: '#with'
            {
             before(grammarAccess.getRuleAccess().getWithKeyword_7()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getWithKeyword_7()); 

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
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group__8"
    // InternalTGG.g:3009:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3013:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalTGG.g:3014:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__9();

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
    // $ANTLR end "rule__Rule__Group__8"


    // $ANTLR start "rule__Rule__Group__8__Impl"
    // InternalTGG.g:3021:1: rule__Rule__Group__8__Impl : ( ( rule__Rule__SchemaAssignment_8 ) ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3025:1: ( ( ( rule__Rule__SchemaAssignment_8 ) ) )
            // InternalTGG.g:3026:1: ( ( rule__Rule__SchemaAssignment_8 ) )
            {
            // InternalTGG.g:3026:1: ( ( rule__Rule__SchemaAssignment_8 ) )
            // InternalTGG.g:3027:2: ( rule__Rule__SchemaAssignment_8 )
            {
             before(grammarAccess.getRuleAccess().getSchemaAssignment_8()); 
            // InternalTGG.g:3028:2: ( rule__Rule__SchemaAssignment_8 )
            // InternalTGG.g:3028:3: rule__Rule__SchemaAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Rule__SchemaAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getSchemaAssignment_8()); 

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
    // $ANTLR end "rule__Rule__Group__8__Impl"


    // $ANTLR start "rule__Rule__Group__9"
    // InternalTGG.g:3036:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl rule__Rule__Group__10 ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3040:1: ( rule__Rule__Group__9__Impl rule__Rule__Group__10 )
            // InternalTGG.g:3041:2: rule__Rule__Group__9__Impl rule__Rule__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__10();

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
    // $ANTLR end "rule__Rule__Group__9"


    // $ANTLR start "rule__Rule__Group__9__Impl"
    // InternalTGG.g:3048:1: rule__Rule__Group__9__Impl : ( ( rule__Rule__Group_9__0 )? ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3052:1: ( ( ( rule__Rule__Group_9__0 )? ) )
            // InternalTGG.g:3053:1: ( ( rule__Rule__Group_9__0 )? )
            {
            // InternalTGG.g:3053:1: ( ( rule__Rule__Group_9__0 )? )
            // InternalTGG.g:3054:2: ( rule__Rule__Group_9__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_9()); 
            // InternalTGG.g:3055:2: ( rule__Rule__Group_9__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTGG.g:3055:3: rule__Rule__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Rule__Group__9__Impl"


    // $ANTLR start "rule__Rule__Group__10"
    // InternalTGG.g:3063:1: rule__Rule__Group__10 : rule__Rule__Group__10__Impl rule__Rule__Group__11 ;
    public final void rule__Rule__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3067:1: ( rule__Rule__Group__10__Impl rule__Rule__Group__11 )
            // InternalTGG.g:3068:2: rule__Rule__Group__10__Impl rule__Rule__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__11();

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
    // $ANTLR end "rule__Rule__Group__10"


    // $ANTLR start "rule__Rule__Group__10__Impl"
    // InternalTGG.g:3075:1: rule__Rule__Group__10__Impl : ( ( rule__Rule__Group_10__0 )? ) ;
    public final void rule__Rule__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3079:1: ( ( ( rule__Rule__Group_10__0 )? ) )
            // InternalTGG.g:3080:1: ( ( rule__Rule__Group_10__0 )? )
            {
            // InternalTGG.g:3080:1: ( ( rule__Rule__Group_10__0 )? )
            // InternalTGG.g:3081:2: ( rule__Rule__Group_10__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_10()); 
            // InternalTGG.g:3082:2: ( rule__Rule__Group_10__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalTGG.g:3082:3: rule__Rule__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Rule__Group__10__Impl"


    // $ANTLR start "rule__Rule__Group__11"
    // InternalTGG.g:3090:1: rule__Rule__Group__11 : rule__Rule__Group__11__Impl rule__Rule__Group__12 ;
    public final void rule__Rule__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3094:1: ( rule__Rule__Group__11__Impl rule__Rule__Group__12 )
            // InternalTGG.g:3095:2: rule__Rule__Group__11__Impl rule__Rule__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__12();

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
    // $ANTLR end "rule__Rule__Group__11"


    // $ANTLR start "rule__Rule__Group__11__Impl"
    // InternalTGG.g:3102:1: rule__Rule__Group__11__Impl : ( ( rule__Rule__Group_11__0 )? ) ;
    public final void rule__Rule__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3106:1: ( ( ( rule__Rule__Group_11__0 )? ) )
            // InternalTGG.g:3107:1: ( ( rule__Rule__Group_11__0 )? )
            {
            // InternalTGG.g:3107:1: ( ( rule__Rule__Group_11__0 )? )
            // InternalTGG.g:3108:2: ( rule__Rule__Group_11__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_11()); 
            // InternalTGG.g:3109:2: ( rule__Rule__Group_11__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==27) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalTGG.g:3109:3: rule__Rule__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_11()); 

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
    // $ANTLR end "rule__Rule__Group__11__Impl"


    // $ANTLR start "rule__Rule__Group__12"
    // InternalTGG.g:3117:1: rule__Rule__Group__12 : rule__Rule__Group__12__Impl ;
    public final void rule__Rule__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3121:1: ( rule__Rule__Group__12__Impl )
            // InternalTGG.g:3122:2: rule__Rule__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__12__Impl();

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
    // $ANTLR end "rule__Rule__Group__12"


    // $ANTLR start "rule__Rule__Group__12__Impl"
    // InternalTGG.g:3128:1: rule__Rule__Group__12__Impl : ( ( rule__Rule__Group_12__0 )? ) ;
    public final void rule__Rule__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3132:1: ( ( ( rule__Rule__Group_12__0 )? ) )
            // InternalTGG.g:3133:1: ( ( rule__Rule__Group_12__0 )? )
            {
            // InternalTGG.g:3133:1: ( ( rule__Rule__Group_12__0 )? )
            // InternalTGG.g:3134:2: ( rule__Rule__Group_12__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_12()); 
            // InternalTGG.g:3135:2: ( rule__Rule__Group_12__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==28) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalTGG.g:3135:3: rule__Rule__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_12()); 

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
    // $ANTLR end "rule__Rule__Group__12__Impl"


    // $ANTLR start "rule__Rule__Group_5__0"
    // InternalTGG.g:3144:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3148:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // InternalTGG.g:3149:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__1();

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
    // $ANTLR end "rule__Rule__Group_5__0"


    // $ANTLR start "rule__Rule__Group_5__0__Impl"
    // InternalTGG.g:3156:1: rule__Rule__Group_5__0__Impl : ( '#extends' ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3160:1: ( ( '#extends' ) )
            // InternalTGG.g:3161:1: ( '#extends' )
            {
            // InternalTGG.g:3161:1: ( '#extends' )
            // InternalTGG.g:3162:2: '#extends'
            {
             before(grammarAccess.getRuleAccess().getExtendsKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getExtendsKeyword_5_0()); 

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
    // $ANTLR end "rule__Rule__Group_5__0__Impl"


    // $ANTLR start "rule__Rule__Group_5__1"
    // InternalTGG.g:3171:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3175:1: ( rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2 )
            // InternalTGG.g:3176:2: rule__Rule__Group_5__1__Impl rule__Rule__Group_5__2
            {
            pushFollow(FOLLOW_25);
            rule__Rule__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__2();

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
    // $ANTLR end "rule__Rule__Group_5__1"


    // $ANTLR start "rule__Rule__Group_5__1__Impl"
    // InternalTGG.g:3183:1: rule__Rule__Group_5__1__Impl : ( ( rule__Rule__SupertypesAssignment_5_1 ) ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3187:1: ( ( ( rule__Rule__SupertypesAssignment_5_1 ) ) )
            // InternalTGG.g:3188:1: ( ( rule__Rule__SupertypesAssignment_5_1 ) )
            {
            // InternalTGG.g:3188:1: ( ( rule__Rule__SupertypesAssignment_5_1 ) )
            // InternalTGG.g:3189:2: ( rule__Rule__SupertypesAssignment_5_1 )
            {
             before(grammarAccess.getRuleAccess().getSupertypesAssignment_5_1()); 
            // InternalTGG.g:3190:2: ( rule__Rule__SupertypesAssignment_5_1 )
            // InternalTGG.g:3190:3: rule__Rule__SupertypesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__SupertypesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getSupertypesAssignment_5_1()); 

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
    // $ANTLR end "rule__Rule__Group_5__1__Impl"


    // $ANTLR start "rule__Rule__Group_5__2"
    // InternalTGG.g:3198:1: rule__Rule__Group_5__2 : rule__Rule__Group_5__2__Impl ;
    public final void rule__Rule__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3202:1: ( rule__Rule__Group_5__2__Impl )
            // InternalTGG.g:3203:2: rule__Rule__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__2__Impl();

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
    // $ANTLR end "rule__Rule__Group_5__2"


    // $ANTLR start "rule__Rule__Group_5__2__Impl"
    // InternalTGG.g:3209:1: rule__Rule__Group_5__2__Impl : ( ( rule__Rule__Group_5_2__0 )* ) ;
    public final void rule__Rule__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3213:1: ( ( ( rule__Rule__Group_5_2__0 )* ) )
            // InternalTGG.g:3214:1: ( ( rule__Rule__Group_5_2__0 )* )
            {
            // InternalTGG.g:3214:1: ( ( rule__Rule__Group_5_2__0 )* )
            // InternalTGG.g:3215:2: ( rule__Rule__Group_5_2__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_5_2()); 
            // InternalTGG.g:3216:2: ( rule__Rule__Group_5_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==35) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalTGG.g:3216:3: rule__Rule__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Rule__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__Rule__Group_5__2__Impl"


    // $ANTLR start "rule__Rule__Group_5_2__0"
    // InternalTGG.g:3225:1: rule__Rule__Group_5_2__0 : rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1 ;
    public final void rule__Rule__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3229:1: ( rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1 )
            // InternalTGG.g:3230:2: rule__Rule__Group_5_2__0__Impl rule__Rule__Group_5_2__1
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_5_2__1();

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
    // $ANTLR end "rule__Rule__Group_5_2__0"


    // $ANTLR start "rule__Rule__Group_5_2__0__Impl"
    // InternalTGG.g:3237:1: rule__Rule__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3241:1: ( ( ',' ) )
            // InternalTGG.g:3242:1: ( ',' )
            {
            // InternalTGG.g:3242:1: ( ',' )
            // InternalTGG.g:3243:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_5_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__Rule__Group_5_2__0__Impl"


    // $ANTLR start "rule__Rule__Group_5_2__1"
    // InternalTGG.g:3252:1: rule__Rule__Group_5_2__1 : rule__Rule__Group_5_2__1__Impl ;
    public final void rule__Rule__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3256:1: ( rule__Rule__Group_5_2__1__Impl )
            // InternalTGG.g:3257:2: rule__Rule__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_5_2__1"


    // $ANTLR start "rule__Rule__Group_5_2__1__Impl"
    // InternalTGG.g:3263:1: rule__Rule__Group_5_2__1__Impl : ( ( rule__Rule__SupertypesAssignment_5_2_1 ) ) ;
    public final void rule__Rule__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3267:1: ( ( ( rule__Rule__SupertypesAssignment_5_2_1 ) ) )
            // InternalTGG.g:3268:1: ( ( rule__Rule__SupertypesAssignment_5_2_1 ) )
            {
            // InternalTGG.g:3268:1: ( ( rule__Rule__SupertypesAssignment_5_2_1 ) )
            // InternalTGG.g:3269:2: ( rule__Rule__SupertypesAssignment_5_2_1 )
            {
             before(grammarAccess.getRuleAccess().getSupertypesAssignment_5_2_1()); 
            // InternalTGG.g:3270:2: ( rule__Rule__SupertypesAssignment_5_2_1 )
            // InternalTGG.g:3270:3: rule__Rule__SupertypesAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__SupertypesAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getSupertypesAssignment_5_2_1()); 

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
    // $ANTLR end "rule__Rule__Group_5_2__1__Impl"


    // $ANTLR start "rule__Rule__Group_6__0"
    // InternalTGG.g:3279:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3283:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalTGG.g:3284:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1();

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
    // $ANTLR end "rule__Rule__Group_6__0"


    // $ANTLR start "rule__Rule__Group_6__0__Impl"
    // InternalTGG.g:3291:1: rule__Rule__Group_6__0__Impl : ( '#complements' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3295:1: ( ( '#complements' ) )
            // InternalTGG.g:3296:1: ( '#complements' )
            {
            // InternalTGG.g:3296:1: ( '#complements' )
            // InternalTGG.g:3297:2: '#complements'
            {
             before(grammarAccess.getRuleAccess().getComplementsKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getComplementsKeyword_6_0()); 

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
    // $ANTLR end "rule__Rule__Group_6__0__Impl"


    // $ANTLR start "rule__Rule__Group_6__1"
    // InternalTGG.g:3306:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3310:1: ( rule__Rule__Group_6__1__Impl )
            // InternalTGG.g:3311:2: rule__Rule__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1__Impl();

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
    // $ANTLR end "rule__Rule__Group_6__1"


    // $ANTLR start "rule__Rule__Group_6__1__Impl"
    // InternalTGG.g:3317:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__KernelAssignment_6_1 ) ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3321:1: ( ( ( rule__Rule__KernelAssignment_6_1 ) ) )
            // InternalTGG.g:3322:1: ( ( rule__Rule__KernelAssignment_6_1 ) )
            {
            // InternalTGG.g:3322:1: ( ( rule__Rule__KernelAssignment_6_1 ) )
            // InternalTGG.g:3323:2: ( rule__Rule__KernelAssignment_6_1 )
            {
             before(grammarAccess.getRuleAccess().getKernelAssignment_6_1()); 
            // InternalTGG.g:3324:2: ( rule__Rule__KernelAssignment_6_1 )
            // InternalTGG.g:3324:3: rule__Rule__KernelAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__KernelAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getKernelAssignment_6_1()); 

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
    // $ANTLR end "rule__Rule__Group_6__1__Impl"


    // $ANTLR start "rule__Rule__Group_9__0"
    // InternalTGG.g:3333:1: rule__Rule__Group_9__0 : rule__Rule__Group_9__0__Impl rule__Rule__Group_9__1 ;
    public final void rule__Rule__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3337:1: ( rule__Rule__Group_9__0__Impl rule__Rule__Group_9__1 )
            // InternalTGG.g:3338:2: rule__Rule__Group_9__0__Impl rule__Rule__Group_9__1
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_9__1();

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
    // $ANTLR end "rule__Rule__Group_9__0"


    // $ANTLR start "rule__Rule__Group_9__0__Impl"
    // InternalTGG.g:3345:1: rule__Rule__Group_9__0__Impl : ( '#source' ) ;
    public final void rule__Rule__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3349:1: ( ( '#source' ) )
            // InternalTGG.g:3350:1: ( '#source' )
            {
            // InternalTGG.g:3350:1: ( '#source' )
            // InternalTGG.g:3351:2: '#source'
            {
             before(grammarAccess.getRuleAccess().getSourceKeyword_9_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSourceKeyword_9_0()); 

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
    // $ANTLR end "rule__Rule__Group_9__0__Impl"


    // $ANTLR start "rule__Rule__Group_9__1"
    // InternalTGG.g:3360:1: rule__Rule__Group_9__1 : rule__Rule__Group_9__1__Impl rule__Rule__Group_9__2 ;
    public final void rule__Rule__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3364:1: ( rule__Rule__Group_9__1__Impl rule__Rule__Group_9__2 )
            // InternalTGG.g:3365:2: rule__Rule__Group_9__1__Impl rule__Rule__Group_9__2
            {
            pushFollow(FOLLOW_32);
            rule__Rule__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_9__2();

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
    // $ANTLR end "rule__Rule__Group_9__1"


    // $ANTLR start "rule__Rule__Group_9__1__Impl"
    // InternalTGG.g:3372:1: rule__Rule__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Rule__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3376:1: ( ( '{' ) )
            // InternalTGG.g:3377:1: ( '{' )
            {
            // InternalTGG.g:3377:1: ( '{' )
            // InternalTGG.g:3378:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_9_1()); 

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
    // $ANTLR end "rule__Rule__Group_9__1__Impl"


    // $ANTLR start "rule__Rule__Group_9__2"
    // InternalTGG.g:3387:1: rule__Rule__Group_9__2 : rule__Rule__Group_9__2__Impl rule__Rule__Group_9__3 ;
    public final void rule__Rule__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3391:1: ( rule__Rule__Group_9__2__Impl rule__Rule__Group_9__3 )
            // InternalTGG.g:3392:2: rule__Rule__Group_9__2__Impl rule__Rule__Group_9__3
            {
            pushFollow(FOLLOW_32);
            rule__Rule__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_9__3();

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
    // $ANTLR end "rule__Rule__Group_9__2"


    // $ANTLR start "rule__Rule__Group_9__2__Impl"
    // InternalTGG.g:3399:1: rule__Rule__Group_9__2__Impl : ( ( rule__Rule__SourcePatternsAssignment_9_2 )* ) ;
    public final void rule__Rule__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3403:1: ( ( ( rule__Rule__SourcePatternsAssignment_9_2 )* ) )
            // InternalTGG.g:3404:1: ( ( rule__Rule__SourcePatternsAssignment_9_2 )* )
            {
            // InternalTGG.g:3404:1: ( ( rule__Rule__SourcePatternsAssignment_9_2 )* )
            // InternalTGG.g:3405:2: ( rule__Rule__SourcePatternsAssignment_9_2 )*
            {
             before(grammarAccess.getRuleAccess().getSourcePatternsAssignment_9_2()); 
            // InternalTGG.g:3406:2: ( rule__Rule__SourcePatternsAssignment_9_2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||(LA40_0>=19 && LA40_0<=21)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalTGG.g:3406:3: rule__Rule__SourcePatternsAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Rule__SourcePatternsAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getSourcePatternsAssignment_9_2()); 

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
    // $ANTLR end "rule__Rule__Group_9__2__Impl"


    // $ANTLR start "rule__Rule__Group_9__3"
    // InternalTGG.g:3414:1: rule__Rule__Group_9__3 : rule__Rule__Group_9__3__Impl ;
    public final void rule__Rule__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3418:1: ( rule__Rule__Group_9__3__Impl )
            // InternalTGG.g:3419:2: rule__Rule__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_9__3__Impl();

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
    // $ANTLR end "rule__Rule__Group_9__3"


    // $ANTLR start "rule__Rule__Group_9__3__Impl"
    // InternalTGG.g:3425:1: rule__Rule__Group_9__3__Impl : ( '}' ) ;
    public final void rule__Rule__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3429:1: ( ( '}' ) )
            // InternalTGG.g:3430:1: ( '}' )
            {
            // InternalTGG.g:3430:1: ( '}' )
            // InternalTGG.g:3431:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_9_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_9_3()); 

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
    // $ANTLR end "rule__Rule__Group_9__3__Impl"


    // $ANTLR start "rule__Rule__Group_10__0"
    // InternalTGG.g:3441:1: rule__Rule__Group_10__0 : rule__Rule__Group_10__0__Impl rule__Rule__Group_10__1 ;
    public final void rule__Rule__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3445:1: ( rule__Rule__Group_10__0__Impl rule__Rule__Group_10__1 )
            // InternalTGG.g:3446:2: rule__Rule__Group_10__0__Impl rule__Rule__Group_10__1
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_10__1();

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
    // $ANTLR end "rule__Rule__Group_10__0"


    // $ANTLR start "rule__Rule__Group_10__0__Impl"
    // InternalTGG.g:3453:1: rule__Rule__Group_10__0__Impl : ( '#target' ) ;
    public final void rule__Rule__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3457:1: ( ( '#target' ) )
            // InternalTGG.g:3458:1: ( '#target' )
            {
            // InternalTGG.g:3458:1: ( '#target' )
            // InternalTGG.g:3459:2: '#target'
            {
             before(grammarAccess.getRuleAccess().getTargetKeyword_10_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getTargetKeyword_10_0()); 

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
    // $ANTLR end "rule__Rule__Group_10__0__Impl"


    // $ANTLR start "rule__Rule__Group_10__1"
    // InternalTGG.g:3468:1: rule__Rule__Group_10__1 : rule__Rule__Group_10__1__Impl rule__Rule__Group_10__2 ;
    public final void rule__Rule__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3472:1: ( rule__Rule__Group_10__1__Impl rule__Rule__Group_10__2 )
            // InternalTGG.g:3473:2: rule__Rule__Group_10__1__Impl rule__Rule__Group_10__2
            {
            pushFollow(FOLLOW_32);
            rule__Rule__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_10__2();

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
    // $ANTLR end "rule__Rule__Group_10__1"


    // $ANTLR start "rule__Rule__Group_10__1__Impl"
    // InternalTGG.g:3480:1: rule__Rule__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Rule__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3484:1: ( ( '{' ) )
            // InternalTGG.g:3485:1: ( '{' )
            {
            // InternalTGG.g:3485:1: ( '{' )
            // InternalTGG.g:3486:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_10_1()); 

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
    // $ANTLR end "rule__Rule__Group_10__1__Impl"


    // $ANTLR start "rule__Rule__Group_10__2"
    // InternalTGG.g:3495:1: rule__Rule__Group_10__2 : rule__Rule__Group_10__2__Impl rule__Rule__Group_10__3 ;
    public final void rule__Rule__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3499:1: ( rule__Rule__Group_10__2__Impl rule__Rule__Group_10__3 )
            // InternalTGG.g:3500:2: rule__Rule__Group_10__2__Impl rule__Rule__Group_10__3
            {
            pushFollow(FOLLOW_32);
            rule__Rule__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_10__3();

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
    // $ANTLR end "rule__Rule__Group_10__2"


    // $ANTLR start "rule__Rule__Group_10__2__Impl"
    // InternalTGG.g:3507:1: rule__Rule__Group_10__2__Impl : ( ( rule__Rule__TargetPatternsAssignment_10_2 )* ) ;
    public final void rule__Rule__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3511:1: ( ( ( rule__Rule__TargetPatternsAssignment_10_2 )* ) )
            // InternalTGG.g:3512:1: ( ( rule__Rule__TargetPatternsAssignment_10_2 )* )
            {
            // InternalTGG.g:3512:1: ( ( rule__Rule__TargetPatternsAssignment_10_2 )* )
            // InternalTGG.g:3513:2: ( rule__Rule__TargetPatternsAssignment_10_2 )*
            {
             before(grammarAccess.getRuleAccess().getTargetPatternsAssignment_10_2()); 
            // InternalTGG.g:3514:2: ( rule__Rule__TargetPatternsAssignment_10_2 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID||(LA41_0>=19 && LA41_0<=21)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalTGG.g:3514:3: rule__Rule__TargetPatternsAssignment_10_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Rule__TargetPatternsAssignment_10_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getTargetPatternsAssignment_10_2()); 

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
    // $ANTLR end "rule__Rule__Group_10__2__Impl"


    // $ANTLR start "rule__Rule__Group_10__3"
    // InternalTGG.g:3522:1: rule__Rule__Group_10__3 : rule__Rule__Group_10__3__Impl ;
    public final void rule__Rule__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3526:1: ( rule__Rule__Group_10__3__Impl )
            // InternalTGG.g:3527:2: rule__Rule__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_10__3__Impl();

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
    // $ANTLR end "rule__Rule__Group_10__3"


    // $ANTLR start "rule__Rule__Group_10__3__Impl"
    // InternalTGG.g:3533:1: rule__Rule__Group_10__3__Impl : ( '}' ) ;
    public final void rule__Rule__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3537:1: ( ( '}' ) )
            // InternalTGG.g:3538:1: ( '}' )
            {
            // InternalTGG.g:3538:1: ( '}' )
            // InternalTGG.g:3539:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_10_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_10_3()); 

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
    // $ANTLR end "rule__Rule__Group_10__3__Impl"


    // $ANTLR start "rule__Rule__Group_11__0"
    // InternalTGG.g:3549:1: rule__Rule__Group_11__0 : rule__Rule__Group_11__0__Impl rule__Rule__Group_11__1 ;
    public final void rule__Rule__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3553:1: ( rule__Rule__Group_11__0__Impl rule__Rule__Group_11__1 )
            // InternalTGG.g:3554:2: rule__Rule__Group_11__0__Impl rule__Rule__Group_11__1
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_11__1();

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
    // $ANTLR end "rule__Rule__Group_11__0"


    // $ANTLR start "rule__Rule__Group_11__0__Impl"
    // InternalTGG.g:3561:1: rule__Rule__Group_11__0__Impl : ( '#correspondence' ) ;
    public final void rule__Rule__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3565:1: ( ( '#correspondence' ) )
            // InternalTGG.g:3566:1: ( '#correspondence' )
            {
            // InternalTGG.g:3566:1: ( '#correspondence' )
            // InternalTGG.g:3567:2: '#correspondence'
            {
             before(grammarAccess.getRuleAccess().getCorrespondenceKeyword_11_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCorrespondenceKeyword_11_0()); 

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
    // $ANTLR end "rule__Rule__Group_11__0__Impl"


    // $ANTLR start "rule__Rule__Group_11__1"
    // InternalTGG.g:3576:1: rule__Rule__Group_11__1 : rule__Rule__Group_11__1__Impl rule__Rule__Group_11__2 ;
    public final void rule__Rule__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3580:1: ( rule__Rule__Group_11__1__Impl rule__Rule__Group_11__2 )
            // InternalTGG.g:3581:2: rule__Rule__Group_11__1__Impl rule__Rule__Group_11__2
            {
            pushFollow(FOLLOW_32);
            rule__Rule__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_11__2();

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
    // $ANTLR end "rule__Rule__Group_11__1"


    // $ANTLR start "rule__Rule__Group_11__1__Impl"
    // InternalTGG.g:3588:1: rule__Rule__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Rule__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3592:1: ( ( '{' ) )
            // InternalTGG.g:3593:1: ( '{' )
            {
            // InternalTGG.g:3593:1: ( '{' )
            // InternalTGG.g:3594:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_11_1()); 

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
    // $ANTLR end "rule__Rule__Group_11__1__Impl"


    // $ANTLR start "rule__Rule__Group_11__2"
    // InternalTGG.g:3603:1: rule__Rule__Group_11__2 : rule__Rule__Group_11__2__Impl rule__Rule__Group_11__3 ;
    public final void rule__Rule__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3607:1: ( rule__Rule__Group_11__2__Impl rule__Rule__Group_11__3 )
            // InternalTGG.g:3608:2: rule__Rule__Group_11__2__Impl rule__Rule__Group_11__3
            {
            pushFollow(FOLLOW_32);
            rule__Rule__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_11__3();

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
    // $ANTLR end "rule__Rule__Group_11__2"


    // $ANTLR start "rule__Rule__Group_11__2__Impl"
    // InternalTGG.g:3615:1: rule__Rule__Group_11__2__Impl : ( ( rule__Rule__CorrespondencePatternsAssignment_11_2 )* ) ;
    public final void rule__Rule__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3619:1: ( ( ( rule__Rule__CorrespondencePatternsAssignment_11_2 )* ) )
            // InternalTGG.g:3620:1: ( ( rule__Rule__CorrespondencePatternsAssignment_11_2 )* )
            {
            // InternalTGG.g:3620:1: ( ( rule__Rule__CorrespondencePatternsAssignment_11_2 )* )
            // InternalTGG.g:3621:2: ( rule__Rule__CorrespondencePatternsAssignment_11_2 )*
            {
             before(grammarAccess.getRuleAccess().getCorrespondencePatternsAssignment_11_2()); 
            // InternalTGG.g:3622:2: ( rule__Rule__CorrespondencePatternsAssignment_11_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID||(LA42_0>=19 && LA42_0<=21)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalTGG.g:3622:3: rule__Rule__CorrespondencePatternsAssignment_11_2
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Rule__CorrespondencePatternsAssignment_11_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getCorrespondencePatternsAssignment_11_2()); 

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
    // $ANTLR end "rule__Rule__Group_11__2__Impl"


    // $ANTLR start "rule__Rule__Group_11__3"
    // InternalTGG.g:3630:1: rule__Rule__Group_11__3 : rule__Rule__Group_11__3__Impl ;
    public final void rule__Rule__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3634:1: ( rule__Rule__Group_11__3__Impl )
            // InternalTGG.g:3635:2: rule__Rule__Group_11__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_11__3__Impl();

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
    // $ANTLR end "rule__Rule__Group_11__3"


    // $ANTLR start "rule__Rule__Group_11__3__Impl"
    // InternalTGG.g:3641:1: rule__Rule__Group_11__3__Impl : ( '}' ) ;
    public final void rule__Rule__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3645:1: ( ( '}' ) )
            // InternalTGG.g:3646:1: ( '}' )
            {
            // InternalTGG.g:3646:1: ( '}' )
            // InternalTGG.g:3647:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_11_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_11_3()); 

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
    // $ANTLR end "rule__Rule__Group_11__3__Impl"


    // $ANTLR start "rule__Rule__Group_12__0"
    // InternalTGG.g:3657:1: rule__Rule__Group_12__0 : rule__Rule__Group_12__0__Impl rule__Rule__Group_12__1 ;
    public final void rule__Rule__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3661:1: ( rule__Rule__Group_12__0__Impl rule__Rule__Group_12__1 )
            // InternalTGG.g:3662:2: rule__Rule__Group_12__0__Impl rule__Rule__Group_12__1
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_12__1();

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
    // $ANTLR end "rule__Rule__Group_12__0"


    // $ANTLR start "rule__Rule__Group_12__0__Impl"
    // InternalTGG.g:3669:1: rule__Rule__Group_12__0__Impl : ( '#attributeConditions' ) ;
    public final void rule__Rule__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3673:1: ( ( '#attributeConditions' ) )
            // InternalTGG.g:3674:1: ( '#attributeConditions' )
            {
            // InternalTGG.g:3674:1: ( '#attributeConditions' )
            // InternalTGG.g:3675:2: '#attributeConditions'
            {
             before(grammarAccess.getRuleAccess().getAttributeConditionsKeyword_12_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getAttributeConditionsKeyword_12_0()); 

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
    // $ANTLR end "rule__Rule__Group_12__0__Impl"


    // $ANTLR start "rule__Rule__Group_12__1"
    // InternalTGG.g:3684:1: rule__Rule__Group_12__1 : rule__Rule__Group_12__1__Impl rule__Rule__Group_12__2 ;
    public final void rule__Rule__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3688:1: ( rule__Rule__Group_12__1__Impl rule__Rule__Group_12__2 )
            // InternalTGG.g:3689:2: rule__Rule__Group_12__1__Impl rule__Rule__Group_12__2
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_12__2();

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
    // $ANTLR end "rule__Rule__Group_12__1"


    // $ANTLR start "rule__Rule__Group_12__1__Impl"
    // InternalTGG.g:3696:1: rule__Rule__Group_12__1__Impl : ( '{' ) ;
    public final void rule__Rule__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3700:1: ( ( '{' ) )
            // InternalTGG.g:3701:1: ( '{' )
            {
            // InternalTGG.g:3701:1: ( '{' )
            // InternalTGG.g:3702:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_12_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_12_1()); 

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
    // $ANTLR end "rule__Rule__Group_12__1__Impl"


    // $ANTLR start "rule__Rule__Group_12__2"
    // InternalTGG.g:3711:1: rule__Rule__Group_12__2 : rule__Rule__Group_12__2__Impl rule__Rule__Group_12__3 ;
    public final void rule__Rule__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3715:1: ( rule__Rule__Group_12__2__Impl rule__Rule__Group_12__3 )
            // InternalTGG.g:3716:2: rule__Rule__Group_12__2__Impl rule__Rule__Group_12__3
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_12__3();

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
    // $ANTLR end "rule__Rule__Group_12__2"


    // $ANTLR start "rule__Rule__Group_12__2__Impl"
    // InternalTGG.g:3723:1: rule__Rule__Group_12__2__Impl : ( ( rule__Rule__AttrConditionsAssignment_12_2 )* ) ;
    public final void rule__Rule__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3727:1: ( ( ( rule__Rule__AttrConditionsAssignment_12_2 )* ) )
            // InternalTGG.g:3728:1: ( ( rule__Rule__AttrConditionsAssignment_12_2 )* )
            {
            // InternalTGG.g:3728:1: ( ( rule__Rule__AttrConditionsAssignment_12_2 )* )
            // InternalTGG.g:3729:2: ( rule__Rule__AttrConditionsAssignment_12_2 )*
            {
             before(grammarAccess.getRuleAccess().getAttrConditionsAssignment_12_2()); 
            // InternalTGG.g:3730:2: ( rule__Rule__AttrConditionsAssignment_12_2 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalTGG.g:3730:3: rule__Rule__AttrConditionsAssignment_12_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Rule__AttrConditionsAssignment_12_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getAttrConditionsAssignment_12_2()); 

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
    // $ANTLR end "rule__Rule__Group_12__2__Impl"


    // $ANTLR start "rule__Rule__Group_12__3"
    // InternalTGG.g:3738:1: rule__Rule__Group_12__3 : rule__Rule__Group_12__3__Impl ;
    public final void rule__Rule__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3742:1: ( rule__Rule__Group_12__3__Impl )
            // InternalTGG.g:3743:2: rule__Rule__Group_12__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_12__3__Impl();

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
    // $ANTLR end "rule__Rule__Group_12__3"


    // $ANTLR start "rule__Rule__Group_12__3__Impl"
    // InternalTGG.g:3749:1: rule__Rule__Group_12__3__Impl : ( '}' ) ;
    public final void rule__Rule__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3753:1: ( ( '}' ) )
            // InternalTGG.g:3754:1: ( '}' )
            {
            // InternalTGG.g:3754:1: ( '}' )
            // InternalTGG.g:3755:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_12_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_12_3()); 

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
    // $ANTLR end "rule__Rule__Group_12__3__Impl"


    // $ANTLR start "rule__AttrCond__Group__0"
    // InternalTGG.g:3765:1: rule__AttrCond__Group__0 : rule__AttrCond__Group__0__Impl rule__AttrCond__Group__1 ;
    public final void rule__AttrCond__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3769:1: ( rule__AttrCond__Group__0__Impl rule__AttrCond__Group__1 )
            // InternalTGG.g:3770:2: rule__AttrCond__Group__0__Impl rule__AttrCond__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__AttrCond__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCond__Group__1();

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
    // $ANTLR end "rule__AttrCond__Group__0"


    // $ANTLR start "rule__AttrCond__Group__0__Impl"
    // InternalTGG.g:3777:1: rule__AttrCond__Group__0__Impl : ( ( rule__AttrCond__NameAssignment_0 ) ) ;
    public final void rule__AttrCond__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3781:1: ( ( ( rule__AttrCond__NameAssignment_0 ) ) )
            // InternalTGG.g:3782:1: ( ( rule__AttrCond__NameAssignment_0 ) )
            {
            // InternalTGG.g:3782:1: ( ( rule__AttrCond__NameAssignment_0 ) )
            // InternalTGG.g:3783:2: ( rule__AttrCond__NameAssignment_0 )
            {
             before(grammarAccess.getAttrCondAccess().getNameAssignment_0()); 
            // InternalTGG.g:3784:2: ( rule__AttrCond__NameAssignment_0 )
            // InternalTGG.g:3784:3: rule__AttrCond__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttrCond__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__AttrCond__Group__0__Impl"


    // $ANTLR start "rule__AttrCond__Group__1"
    // InternalTGG.g:3792:1: rule__AttrCond__Group__1 : rule__AttrCond__Group__1__Impl rule__AttrCond__Group__2 ;
    public final void rule__AttrCond__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3796:1: ( rule__AttrCond__Group__1__Impl rule__AttrCond__Group__2 )
            // InternalTGG.g:3797:2: rule__AttrCond__Group__1__Impl rule__AttrCond__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__AttrCond__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCond__Group__2();

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
    // $ANTLR end "rule__AttrCond__Group__1"


    // $ANTLR start "rule__AttrCond__Group__1__Impl"
    // InternalTGG.g:3804:1: rule__AttrCond__Group__1__Impl : ( '(' ) ;
    public final void rule__AttrCond__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3808:1: ( ( '(' ) )
            // InternalTGG.g:3809:1: ( '(' )
            {
            // InternalTGG.g:3809:1: ( '(' )
            // InternalTGG.g:3810:2: '('
            {
             before(grammarAccess.getAttrCondAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAttrCondAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__AttrCond__Group__1__Impl"


    // $ANTLR start "rule__AttrCond__Group__2"
    // InternalTGG.g:3819:1: rule__AttrCond__Group__2 : rule__AttrCond__Group__2__Impl rule__AttrCond__Group__3 ;
    public final void rule__AttrCond__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3823:1: ( rule__AttrCond__Group__2__Impl rule__AttrCond__Group__3 )
            // InternalTGG.g:3824:2: rule__AttrCond__Group__2__Impl rule__AttrCond__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__AttrCond__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCond__Group__3();

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
    // $ANTLR end "rule__AttrCond__Group__2"


    // $ANTLR start "rule__AttrCond__Group__2__Impl"
    // InternalTGG.g:3831:1: rule__AttrCond__Group__2__Impl : ( ( rule__AttrCond__Group_2__0 )? ) ;
    public final void rule__AttrCond__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3835:1: ( ( ( rule__AttrCond__Group_2__0 )? ) )
            // InternalTGG.g:3836:1: ( ( rule__AttrCond__Group_2__0 )? )
            {
            // InternalTGG.g:3836:1: ( ( rule__AttrCond__Group_2__0 )? )
            // InternalTGG.g:3837:2: ( rule__AttrCond__Group_2__0 )?
            {
             before(grammarAccess.getAttrCondAccess().getGroup_2()); 
            // InternalTGG.g:3838:2: ( rule__AttrCond__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=RULE_STRING && LA44_0<=RULE_DECIMAL)||LA44_0==43||LA44_0==45) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalTGG.g:3838:3: rule__AttrCond__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttrCond__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttrCondAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AttrCond__Group__2__Impl"


    // $ANTLR start "rule__AttrCond__Group__3"
    // InternalTGG.g:3846:1: rule__AttrCond__Group__3 : rule__AttrCond__Group__3__Impl ;
    public final void rule__AttrCond__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3850:1: ( rule__AttrCond__Group__3__Impl )
            // InternalTGG.g:3851:2: rule__AttrCond__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrCond__Group__3__Impl();

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
    // $ANTLR end "rule__AttrCond__Group__3"


    // $ANTLR start "rule__AttrCond__Group__3__Impl"
    // InternalTGG.g:3857:1: rule__AttrCond__Group__3__Impl : ( ')' ) ;
    public final void rule__AttrCond__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3861:1: ( ( ')' ) )
            // InternalTGG.g:3862:1: ( ')' )
            {
            // InternalTGG.g:3862:1: ( ')' )
            // InternalTGG.g:3863:2: ')'
            {
             before(grammarAccess.getAttrCondAccess().getRightParenthesisKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttrCondAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__AttrCond__Group__3__Impl"


    // $ANTLR start "rule__AttrCond__Group_2__0"
    // InternalTGG.g:3873:1: rule__AttrCond__Group_2__0 : rule__AttrCond__Group_2__0__Impl rule__AttrCond__Group_2__1 ;
    public final void rule__AttrCond__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3877:1: ( rule__AttrCond__Group_2__0__Impl rule__AttrCond__Group_2__1 )
            // InternalTGG.g:3878:2: rule__AttrCond__Group_2__0__Impl rule__AttrCond__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__AttrCond__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCond__Group_2__1();

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
    // $ANTLR end "rule__AttrCond__Group_2__0"


    // $ANTLR start "rule__AttrCond__Group_2__0__Impl"
    // InternalTGG.g:3885:1: rule__AttrCond__Group_2__0__Impl : ( ( rule__AttrCond__ValuesAssignment_2_0 ) ) ;
    public final void rule__AttrCond__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3889:1: ( ( ( rule__AttrCond__ValuesAssignment_2_0 ) ) )
            // InternalTGG.g:3890:1: ( ( rule__AttrCond__ValuesAssignment_2_0 ) )
            {
            // InternalTGG.g:3890:1: ( ( rule__AttrCond__ValuesAssignment_2_0 ) )
            // InternalTGG.g:3891:2: ( rule__AttrCond__ValuesAssignment_2_0 )
            {
             before(grammarAccess.getAttrCondAccess().getValuesAssignment_2_0()); 
            // InternalTGG.g:3892:2: ( rule__AttrCond__ValuesAssignment_2_0 )
            // InternalTGG.g:3892:3: rule__AttrCond__ValuesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__AttrCond__ValuesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondAccess().getValuesAssignment_2_0()); 

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
    // $ANTLR end "rule__AttrCond__Group_2__0__Impl"


    // $ANTLR start "rule__AttrCond__Group_2__1"
    // InternalTGG.g:3900:1: rule__AttrCond__Group_2__1 : rule__AttrCond__Group_2__1__Impl ;
    public final void rule__AttrCond__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3904:1: ( rule__AttrCond__Group_2__1__Impl )
            // InternalTGG.g:3905:2: rule__AttrCond__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrCond__Group_2__1__Impl();

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
    // $ANTLR end "rule__AttrCond__Group_2__1"


    // $ANTLR start "rule__AttrCond__Group_2__1__Impl"
    // InternalTGG.g:3911:1: rule__AttrCond__Group_2__1__Impl : ( ( rule__AttrCond__Group_2_1__0 )* ) ;
    public final void rule__AttrCond__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3915:1: ( ( ( rule__AttrCond__Group_2_1__0 )* ) )
            // InternalTGG.g:3916:1: ( ( rule__AttrCond__Group_2_1__0 )* )
            {
            // InternalTGG.g:3916:1: ( ( rule__AttrCond__Group_2_1__0 )* )
            // InternalTGG.g:3917:2: ( rule__AttrCond__Group_2_1__0 )*
            {
             before(grammarAccess.getAttrCondAccess().getGroup_2_1()); 
            // InternalTGG.g:3918:2: ( rule__AttrCond__Group_2_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==35) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalTGG.g:3918:3: rule__AttrCond__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__AttrCond__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getAttrCondAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__AttrCond__Group_2__1__Impl"


    // $ANTLR start "rule__AttrCond__Group_2_1__0"
    // InternalTGG.g:3927:1: rule__AttrCond__Group_2_1__0 : rule__AttrCond__Group_2_1__0__Impl rule__AttrCond__Group_2_1__1 ;
    public final void rule__AttrCond__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3931:1: ( rule__AttrCond__Group_2_1__0__Impl rule__AttrCond__Group_2_1__1 )
            // InternalTGG.g:3932:2: rule__AttrCond__Group_2_1__0__Impl rule__AttrCond__Group_2_1__1
            {
            pushFollow(FOLLOW_35);
            rule__AttrCond__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCond__Group_2_1__1();

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
    // $ANTLR end "rule__AttrCond__Group_2_1__0"


    // $ANTLR start "rule__AttrCond__Group_2_1__0__Impl"
    // InternalTGG.g:3939:1: rule__AttrCond__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__AttrCond__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3943:1: ( ( ',' ) )
            // InternalTGG.g:3944:1: ( ',' )
            {
            // InternalTGG.g:3944:1: ( ',' )
            // InternalTGG.g:3945:2: ','
            {
             before(grammarAccess.getAttrCondAccess().getCommaKeyword_2_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAttrCondAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__AttrCond__Group_2_1__0__Impl"


    // $ANTLR start "rule__AttrCond__Group_2_1__1"
    // InternalTGG.g:3954:1: rule__AttrCond__Group_2_1__1 : rule__AttrCond__Group_2_1__1__Impl ;
    public final void rule__AttrCond__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3958:1: ( rule__AttrCond__Group_2_1__1__Impl )
            // InternalTGG.g:3959:2: rule__AttrCond__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrCond__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__AttrCond__Group_2_1__1"


    // $ANTLR start "rule__AttrCond__Group_2_1__1__Impl"
    // InternalTGG.g:3965:1: rule__AttrCond__Group_2_1__1__Impl : ( ( rule__AttrCond__ValuesAssignment_2_1_1 ) ) ;
    public final void rule__AttrCond__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3969:1: ( ( ( rule__AttrCond__ValuesAssignment_2_1_1 ) ) )
            // InternalTGG.g:3970:1: ( ( rule__AttrCond__ValuesAssignment_2_1_1 ) )
            {
            // InternalTGG.g:3970:1: ( ( rule__AttrCond__ValuesAssignment_2_1_1 ) )
            // InternalTGG.g:3971:2: ( rule__AttrCond__ValuesAssignment_2_1_1 )
            {
             before(grammarAccess.getAttrCondAccess().getValuesAssignment_2_1_1()); 
            // InternalTGG.g:3972:2: ( rule__AttrCond__ValuesAssignment_2_1_1 )
            // InternalTGG.g:3972:3: rule__AttrCond__ValuesAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AttrCond__ValuesAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondAccess().getValuesAssignment_2_1_1()); 

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
    // $ANTLR end "rule__AttrCond__Group_2_1__1__Impl"


    // $ANTLR start "rule__AttrCondDefLibrary__Group__0"
    // InternalTGG.g:3981:1: rule__AttrCondDefLibrary__Group__0 : rule__AttrCondDefLibrary__Group__0__Impl rule__AttrCondDefLibrary__Group__1 ;
    public final void rule__AttrCondDefLibrary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3985:1: ( rule__AttrCondDefLibrary__Group__0__Impl rule__AttrCondDefLibrary__Group__1 )
            // InternalTGG.g:3986:2: rule__AttrCondDefLibrary__Group__0__Impl rule__AttrCondDefLibrary__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__AttrCondDefLibrary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDefLibrary__Group__1();

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
    // $ANTLR end "rule__AttrCondDefLibrary__Group__0"


    // $ANTLR start "rule__AttrCondDefLibrary__Group__0__Impl"
    // InternalTGG.g:3993:1: rule__AttrCondDefLibrary__Group__0__Impl : ( '#library' ) ;
    public final void rule__AttrCondDefLibrary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:3997:1: ( ( '#library' ) )
            // InternalTGG.g:3998:1: ( '#library' )
            {
            // InternalTGG.g:3998:1: ( '#library' )
            // InternalTGG.g:3999:2: '#library'
            {
             before(grammarAccess.getAttrCondDefLibraryAccess().getLibraryKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefLibraryAccess().getLibraryKeyword_0()); 

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
    // $ANTLR end "rule__AttrCondDefLibrary__Group__0__Impl"


    // $ANTLR start "rule__AttrCondDefLibrary__Group__1"
    // InternalTGG.g:4008:1: rule__AttrCondDefLibrary__Group__1 : rule__AttrCondDefLibrary__Group__1__Impl rule__AttrCondDefLibrary__Group__2 ;
    public final void rule__AttrCondDefLibrary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4012:1: ( rule__AttrCondDefLibrary__Group__1__Impl rule__AttrCondDefLibrary__Group__2 )
            // InternalTGG.g:4013:2: rule__AttrCondDefLibrary__Group__1__Impl rule__AttrCondDefLibrary__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__AttrCondDefLibrary__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDefLibrary__Group__2();

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
    // $ANTLR end "rule__AttrCondDefLibrary__Group__1"


    // $ANTLR start "rule__AttrCondDefLibrary__Group__1__Impl"
    // InternalTGG.g:4020:1: rule__AttrCondDefLibrary__Group__1__Impl : ( ( rule__AttrCondDefLibrary__NameAssignment_1 ) ) ;
    public final void rule__AttrCondDefLibrary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4024:1: ( ( ( rule__AttrCondDefLibrary__NameAssignment_1 ) ) )
            // InternalTGG.g:4025:1: ( ( rule__AttrCondDefLibrary__NameAssignment_1 ) )
            {
            // InternalTGG.g:4025:1: ( ( rule__AttrCondDefLibrary__NameAssignment_1 ) )
            // InternalTGG.g:4026:2: ( rule__AttrCondDefLibrary__NameAssignment_1 )
            {
             before(grammarAccess.getAttrCondDefLibraryAccess().getNameAssignment_1()); 
            // InternalTGG.g:4027:2: ( rule__AttrCondDefLibrary__NameAssignment_1 )
            // InternalTGG.g:4027:3: rule__AttrCondDefLibrary__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDefLibrary__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttrCondDefLibraryAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AttrCondDefLibrary__Group__1__Impl"


    // $ANTLR start "rule__AttrCondDefLibrary__Group__2"
    // InternalTGG.g:4035:1: rule__AttrCondDefLibrary__Group__2 : rule__AttrCondDefLibrary__Group__2__Impl ;
    public final void rule__AttrCondDefLibrary__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4039:1: ( rule__AttrCondDefLibrary__Group__2__Impl )
            // InternalTGG.g:4040:2: rule__AttrCondDefLibrary__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDefLibrary__Group__2__Impl();

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
    // $ANTLR end "rule__AttrCondDefLibrary__Group__2"


    // $ANTLR start "rule__AttrCondDefLibrary__Group__2__Impl"
    // InternalTGG.g:4046:1: rule__AttrCondDefLibrary__Group__2__Impl : ( ( rule__AttrCondDefLibrary__Group_2__0 )? ) ;
    public final void rule__AttrCondDefLibrary__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4050:1: ( ( ( rule__AttrCondDefLibrary__Group_2__0 )? ) )
            // InternalTGG.g:4051:1: ( ( rule__AttrCondDefLibrary__Group_2__0 )? )
            {
            // InternalTGG.g:4051:1: ( ( rule__AttrCondDefLibrary__Group_2__0 )? )
            // InternalTGG.g:4052:2: ( rule__AttrCondDefLibrary__Group_2__0 )?
            {
             before(grammarAccess.getAttrCondDefLibraryAccess().getGroup_2()); 
            // InternalTGG.g:4053:2: ( rule__AttrCondDefLibrary__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalTGG.g:4053:3: rule__AttrCondDefLibrary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttrCondDefLibrary__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttrCondDefLibraryAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AttrCondDefLibrary__Group__2__Impl"


    // $ANTLR start "rule__AttrCondDefLibrary__Group_2__0"
    // InternalTGG.g:4062:1: rule__AttrCondDefLibrary__Group_2__0 : rule__AttrCondDefLibrary__Group_2__0__Impl rule__AttrCondDefLibrary__Group_2__1 ;
    public final void rule__AttrCondDefLibrary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4066:1: ( rule__AttrCondDefLibrary__Group_2__0__Impl rule__AttrCondDefLibrary__Group_2__1 )
            // InternalTGG.g:4067:2: rule__AttrCondDefLibrary__Group_2__0__Impl rule__AttrCondDefLibrary__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__AttrCondDefLibrary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDefLibrary__Group_2__1();

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
    // $ANTLR end "rule__AttrCondDefLibrary__Group_2__0"


    // $ANTLR start "rule__AttrCondDefLibrary__Group_2__0__Impl"
    // InternalTGG.g:4074:1: rule__AttrCondDefLibrary__Group_2__0__Impl : ( '{' ) ;
    public final void rule__AttrCondDefLibrary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4078:1: ( ( '{' ) )
            // InternalTGG.g:4079:1: ( '{' )
            {
            // InternalTGG.g:4079:1: ( '{' )
            // InternalTGG.g:4080:2: '{'
            {
             before(grammarAccess.getAttrCondDefLibraryAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefLibraryAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__AttrCondDefLibrary__Group_2__0__Impl"


    // $ANTLR start "rule__AttrCondDefLibrary__Group_2__1"
    // InternalTGG.g:4089:1: rule__AttrCondDefLibrary__Group_2__1 : rule__AttrCondDefLibrary__Group_2__1__Impl rule__AttrCondDefLibrary__Group_2__2 ;
    public final void rule__AttrCondDefLibrary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4093:1: ( rule__AttrCondDefLibrary__Group_2__1__Impl rule__AttrCondDefLibrary__Group_2__2 )
            // InternalTGG.g:4094:2: rule__AttrCondDefLibrary__Group_2__1__Impl rule__AttrCondDefLibrary__Group_2__2
            {
            pushFollow(FOLLOW_13);
            rule__AttrCondDefLibrary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttrCondDefLibrary__Group_2__2();

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
    // $ANTLR end "rule__AttrCondDefLibrary__Group_2__1"


    // $ANTLR start "rule__AttrCondDefLibrary__Group_2__1__Impl"
    // InternalTGG.g:4101:1: rule__AttrCondDefLibrary__Group_2__1__Impl : ( ( rule__AttrCondDefLibrary__AttributeCondDefsAssignment_2_1 )* ) ;
    public final void rule__AttrCondDefLibrary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4105:1: ( ( ( rule__AttrCondDefLibrary__AttributeCondDefsAssignment_2_1 )* ) )
            // InternalTGG.g:4106:1: ( ( rule__AttrCondDefLibrary__AttributeCondDefsAssignment_2_1 )* )
            {
            // InternalTGG.g:4106:1: ( ( rule__AttrCondDefLibrary__AttributeCondDefsAssignment_2_1 )* )
            // InternalTGG.g:4107:2: ( rule__AttrCondDefLibrary__AttributeCondDefsAssignment_2_1 )*
            {
             before(grammarAccess.getAttrCondDefLibraryAccess().getAttributeCondDefsAssignment_2_1()); 
            // InternalTGG.g:4108:2: ( rule__AttrCondDefLibrary__AttributeCondDefsAssignment_2_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID||LA47_0==50) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalTGG.g:4108:3: rule__AttrCondDefLibrary__AttributeCondDefsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AttrCondDefLibrary__AttributeCondDefsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getAttrCondDefLibraryAccess().getAttributeCondDefsAssignment_2_1()); 

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
    // $ANTLR end "rule__AttrCondDefLibrary__Group_2__1__Impl"


    // $ANTLR start "rule__AttrCondDefLibrary__Group_2__2"
    // InternalTGG.g:4116:1: rule__AttrCondDefLibrary__Group_2__2 : rule__AttrCondDefLibrary__Group_2__2__Impl ;
    public final void rule__AttrCondDefLibrary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4120:1: ( rule__AttrCondDefLibrary__Group_2__2__Impl )
            // InternalTGG.g:4121:2: rule__AttrCondDefLibrary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttrCondDefLibrary__Group_2__2__Impl();

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
    // $ANTLR end "rule__AttrCondDefLibrary__Group_2__2"


    // $ANTLR start "rule__AttrCondDefLibrary__Group_2__2__Impl"
    // InternalTGG.g:4127:1: rule__AttrCondDefLibrary__Group_2__2__Impl : ( '}' ) ;
    public final void rule__AttrCondDefLibrary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4131:1: ( ( '}' ) )
            // InternalTGG.g:4132:1: ( '}' )
            {
            // InternalTGG.g:4132:1: ( '}' )
            // InternalTGG.g:4133:2: '}'
            {
             before(grammarAccess.getAttrCondDefLibraryAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefLibraryAccess().getRightCurlyBracketKeyword_2_2()); 

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
    // $ANTLR end "rule__AttrCondDefLibrary__Group_2__2__Impl"


    // $ANTLR start "rule__AttributeVariable__Group__0"
    // InternalTGG.g:4143:1: rule__AttributeVariable__Group__0 : rule__AttributeVariable__Group__0__Impl rule__AttributeVariable__Group__1 ;
    public final void rule__AttributeVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4147:1: ( rule__AttributeVariable__Group__0__Impl rule__AttributeVariable__Group__1 )
            // InternalTGG.g:4148:2: rule__AttributeVariable__Group__0__Impl rule__AttributeVariable__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AttributeVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeVariable__Group__1();

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
    // $ANTLR end "rule__AttributeVariable__Group__0"


    // $ANTLR start "rule__AttributeVariable__Group__0__Impl"
    // InternalTGG.g:4155:1: rule__AttributeVariable__Group__0__Impl : ( ( rule__AttributeVariable__ObjectVarAssignment_0 ) ) ;
    public final void rule__AttributeVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4159:1: ( ( ( rule__AttributeVariable__ObjectVarAssignment_0 ) ) )
            // InternalTGG.g:4160:1: ( ( rule__AttributeVariable__ObjectVarAssignment_0 ) )
            {
            // InternalTGG.g:4160:1: ( ( rule__AttributeVariable__ObjectVarAssignment_0 ) )
            // InternalTGG.g:4161:2: ( rule__AttributeVariable__ObjectVarAssignment_0 )
            {
             before(grammarAccess.getAttributeVariableAccess().getObjectVarAssignment_0()); 
            // InternalTGG.g:4162:2: ( rule__AttributeVariable__ObjectVarAssignment_0 )
            // InternalTGG.g:4162:3: rule__AttributeVariable__ObjectVarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeVariable__ObjectVarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeVariableAccess().getObjectVarAssignment_0()); 

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
    // $ANTLR end "rule__AttributeVariable__Group__0__Impl"


    // $ANTLR start "rule__AttributeVariable__Group__1"
    // InternalTGG.g:4170:1: rule__AttributeVariable__Group__1 : rule__AttributeVariable__Group__1__Impl rule__AttributeVariable__Group__2 ;
    public final void rule__AttributeVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4174:1: ( rule__AttributeVariable__Group__1__Impl rule__AttributeVariable__Group__2 )
            // InternalTGG.g:4175:2: rule__AttributeVariable__Group__1__Impl rule__AttributeVariable__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AttributeVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeVariable__Group__2();

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
    // $ANTLR end "rule__AttributeVariable__Group__1"


    // $ANTLR start "rule__AttributeVariable__Group__1__Impl"
    // InternalTGG.g:4182:1: rule__AttributeVariable__Group__1__Impl : ( '.' ) ;
    public final void rule__AttributeVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4186:1: ( ( '.' ) )
            // InternalTGG.g:4187:1: ( '.' )
            {
            // InternalTGG.g:4187:1: ( '.' )
            // InternalTGG.g:4188:2: '.'
            {
             before(grammarAccess.getAttributeVariableAccess().getFullStopKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAttributeVariableAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__AttributeVariable__Group__1__Impl"


    // $ANTLR start "rule__AttributeVariable__Group__2"
    // InternalTGG.g:4197:1: rule__AttributeVariable__Group__2 : rule__AttributeVariable__Group__2__Impl ;
    public final void rule__AttributeVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4201:1: ( rule__AttributeVariable__Group__2__Impl )
            // InternalTGG.g:4202:2: rule__AttributeVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeVariable__Group__2__Impl();

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
    // $ANTLR end "rule__AttributeVariable__Group__2"


    // $ANTLR start "rule__AttributeVariable__Group__2__Impl"
    // InternalTGG.g:4208:1: rule__AttributeVariable__Group__2__Impl : ( ( rule__AttributeVariable__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4212:1: ( ( ( rule__AttributeVariable__AttributeAssignment_2 ) ) )
            // InternalTGG.g:4213:1: ( ( rule__AttributeVariable__AttributeAssignment_2 ) )
            {
            // InternalTGG.g:4213:1: ( ( rule__AttributeVariable__AttributeAssignment_2 ) )
            // InternalTGG.g:4214:2: ( rule__AttributeVariable__AttributeAssignment_2 )
            {
             before(grammarAccess.getAttributeVariableAccess().getAttributeAssignment_2()); 
            // InternalTGG.g:4215:2: ( rule__AttributeVariable__AttributeAssignment_2 )
            // InternalTGG.g:4215:3: rule__AttributeVariable__AttributeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeVariable__AttributeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeVariableAccess().getAttributeAssignment_2()); 

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
    // $ANTLR end "rule__AttributeVariable__Group__2__Impl"


    // $ANTLR start "rule__CorrVariablePattern__Group__0"
    // InternalTGG.g:4224:1: rule__CorrVariablePattern__Group__0 : rule__CorrVariablePattern__Group__0__Impl rule__CorrVariablePattern__Group__1 ;
    public final void rule__CorrVariablePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4228:1: ( rule__CorrVariablePattern__Group__0__Impl rule__CorrVariablePattern__Group__1 )
            // InternalTGG.g:4229:2: rule__CorrVariablePattern__Group__0__Impl rule__CorrVariablePattern__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__CorrVariablePattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__Group__1();

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
    // $ANTLR end "rule__CorrVariablePattern__Group__0"


    // $ANTLR start "rule__CorrVariablePattern__Group__0__Impl"
    // InternalTGG.g:4236:1: rule__CorrVariablePattern__Group__0__Impl : ( ( rule__CorrVariablePattern__OpAssignment_0 )? ) ;
    public final void rule__CorrVariablePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4240:1: ( ( ( rule__CorrVariablePattern__OpAssignment_0 )? ) )
            // InternalTGG.g:4241:1: ( ( rule__CorrVariablePattern__OpAssignment_0 )? )
            {
            // InternalTGG.g:4241:1: ( ( rule__CorrVariablePattern__OpAssignment_0 )? )
            // InternalTGG.g:4242:2: ( rule__CorrVariablePattern__OpAssignment_0 )?
            {
             before(grammarAccess.getCorrVariablePatternAccess().getOpAssignment_0()); 
            // InternalTGG.g:4243:2: ( rule__CorrVariablePattern__OpAssignment_0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=19 && LA48_0<=21)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalTGG.g:4243:3: rule__CorrVariablePattern__OpAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CorrVariablePattern__OpAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCorrVariablePatternAccess().getOpAssignment_0()); 

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
    // $ANTLR end "rule__CorrVariablePattern__Group__0__Impl"


    // $ANTLR start "rule__CorrVariablePattern__Group__1"
    // InternalTGG.g:4251:1: rule__CorrVariablePattern__Group__1 : rule__CorrVariablePattern__Group__1__Impl rule__CorrVariablePattern__Group__2 ;
    public final void rule__CorrVariablePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4255:1: ( rule__CorrVariablePattern__Group__1__Impl rule__CorrVariablePattern__Group__2 )
            // InternalTGG.g:4256:2: rule__CorrVariablePattern__Group__1__Impl rule__CorrVariablePattern__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__CorrVariablePattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__Group__2();

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
    // $ANTLR end "rule__CorrVariablePattern__Group__1"


    // $ANTLR start "rule__CorrVariablePattern__Group__1__Impl"
    // InternalTGG.g:4263:1: rule__CorrVariablePattern__Group__1__Impl : ( ( rule__CorrVariablePattern__NameAssignment_1 ) ) ;
    public final void rule__CorrVariablePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4267:1: ( ( ( rule__CorrVariablePattern__NameAssignment_1 ) ) )
            // InternalTGG.g:4268:1: ( ( rule__CorrVariablePattern__NameAssignment_1 ) )
            {
            // InternalTGG.g:4268:1: ( ( rule__CorrVariablePattern__NameAssignment_1 ) )
            // InternalTGG.g:4269:2: ( rule__CorrVariablePattern__NameAssignment_1 )
            {
             before(grammarAccess.getCorrVariablePatternAccess().getNameAssignment_1()); 
            // InternalTGG.g:4270:2: ( rule__CorrVariablePattern__NameAssignment_1 )
            // InternalTGG.g:4270:3: rule__CorrVariablePattern__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCorrVariablePatternAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__CorrVariablePattern__Group__1__Impl"


    // $ANTLR start "rule__CorrVariablePattern__Group__2"
    // InternalTGG.g:4278:1: rule__CorrVariablePattern__Group__2 : rule__CorrVariablePattern__Group__2__Impl rule__CorrVariablePattern__Group__3 ;
    public final void rule__CorrVariablePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4282:1: ( rule__CorrVariablePattern__Group__2__Impl rule__CorrVariablePattern__Group__3 )
            // InternalTGG.g:4283:2: rule__CorrVariablePattern__Group__2__Impl rule__CorrVariablePattern__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__CorrVariablePattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__Group__3();

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
    // $ANTLR end "rule__CorrVariablePattern__Group__2"


    // $ANTLR start "rule__CorrVariablePattern__Group__2__Impl"
    // InternalTGG.g:4290:1: rule__CorrVariablePattern__Group__2__Impl : ( ':' ) ;
    public final void rule__CorrVariablePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4294:1: ( ( ':' ) )
            // InternalTGG.g:4295:1: ( ':' )
            {
            // InternalTGG.g:4295:1: ( ':' )
            // InternalTGG.g:4296:2: ':'
            {
             before(grammarAccess.getCorrVariablePatternAccess().getColonKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCorrVariablePatternAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__CorrVariablePattern__Group__2__Impl"


    // $ANTLR start "rule__CorrVariablePattern__Group__3"
    // InternalTGG.g:4305:1: rule__CorrVariablePattern__Group__3 : rule__CorrVariablePattern__Group__3__Impl rule__CorrVariablePattern__Group__4 ;
    public final void rule__CorrVariablePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4309:1: ( rule__CorrVariablePattern__Group__3__Impl rule__CorrVariablePattern__Group__4 )
            // InternalTGG.g:4310:2: rule__CorrVariablePattern__Group__3__Impl rule__CorrVariablePattern__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__CorrVariablePattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__Group__4();

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
    // $ANTLR end "rule__CorrVariablePattern__Group__3"


    // $ANTLR start "rule__CorrVariablePattern__Group__3__Impl"
    // InternalTGG.g:4317:1: rule__CorrVariablePattern__Group__3__Impl : ( ( rule__CorrVariablePattern__TypeAssignment_3 ) ) ;
    public final void rule__CorrVariablePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4321:1: ( ( ( rule__CorrVariablePattern__TypeAssignment_3 ) ) )
            // InternalTGG.g:4322:1: ( ( rule__CorrVariablePattern__TypeAssignment_3 ) )
            {
            // InternalTGG.g:4322:1: ( ( rule__CorrVariablePattern__TypeAssignment_3 ) )
            // InternalTGG.g:4323:2: ( rule__CorrVariablePattern__TypeAssignment_3 )
            {
             before(grammarAccess.getCorrVariablePatternAccess().getTypeAssignment_3()); 
            // InternalTGG.g:4324:2: ( rule__CorrVariablePattern__TypeAssignment_3 )
            // InternalTGG.g:4324:3: rule__CorrVariablePattern__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCorrVariablePatternAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__CorrVariablePattern__Group__3__Impl"


    // $ANTLR start "rule__CorrVariablePattern__Group__4"
    // InternalTGG.g:4332:1: rule__CorrVariablePattern__Group__4 : rule__CorrVariablePattern__Group__4__Impl rule__CorrVariablePattern__Group__5 ;
    public final void rule__CorrVariablePattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4336:1: ( rule__CorrVariablePattern__Group__4__Impl rule__CorrVariablePattern__Group__5 )
            // InternalTGG.g:4337:2: rule__CorrVariablePattern__Group__4__Impl rule__CorrVariablePattern__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__CorrVariablePattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__Group__5();

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
    // $ANTLR end "rule__CorrVariablePattern__Group__4"


    // $ANTLR start "rule__CorrVariablePattern__Group__4__Impl"
    // InternalTGG.g:4344:1: rule__CorrVariablePattern__Group__4__Impl : ( '{' ) ;
    public final void rule__CorrVariablePattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4348:1: ( ( '{' ) )
            // InternalTGG.g:4349:1: ( '{' )
            {
            // InternalTGG.g:4349:1: ( '{' )
            // InternalTGG.g:4350:2: '{'
            {
             before(grammarAccess.getCorrVariablePatternAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCorrVariablePatternAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__CorrVariablePattern__Group__4__Impl"


    // $ANTLR start "rule__CorrVariablePattern__Group__5"
    // InternalTGG.g:4359:1: rule__CorrVariablePattern__Group__5 : rule__CorrVariablePattern__Group__5__Impl rule__CorrVariablePattern__Group__6 ;
    public final void rule__CorrVariablePattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4363:1: ( rule__CorrVariablePattern__Group__5__Impl rule__CorrVariablePattern__Group__6 )
            // InternalTGG.g:4364:2: rule__CorrVariablePattern__Group__5__Impl rule__CorrVariablePattern__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__CorrVariablePattern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__Group__6();

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
    // $ANTLR end "rule__CorrVariablePattern__Group__5"


    // $ANTLR start "rule__CorrVariablePattern__Group__5__Impl"
    // InternalTGG.g:4371:1: rule__CorrVariablePattern__Group__5__Impl : ( '#src->' ) ;
    public final void rule__CorrVariablePattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4375:1: ( ( '#src->' ) )
            // InternalTGG.g:4376:1: ( '#src->' )
            {
            // InternalTGG.g:4376:1: ( '#src->' )
            // InternalTGG.g:4377:2: '#src->'
            {
             before(grammarAccess.getCorrVariablePatternAccess().getSrcKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCorrVariablePatternAccess().getSrcKeyword_5()); 

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
    // $ANTLR end "rule__CorrVariablePattern__Group__5__Impl"


    // $ANTLR start "rule__CorrVariablePattern__Group__6"
    // InternalTGG.g:4386:1: rule__CorrVariablePattern__Group__6 : rule__CorrVariablePattern__Group__6__Impl rule__CorrVariablePattern__Group__7 ;
    public final void rule__CorrVariablePattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4390:1: ( rule__CorrVariablePattern__Group__6__Impl rule__CorrVariablePattern__Group__7 )
            // InternalTGG.g:4391:2: rule__CorrVariablePattern__Group__6__Impl rule__CorrVariablePattern__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__CorrVariablePattern__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__Group__7();

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
    // $ANTLR end "rule__CorrVariablePattern__Group__6"


    // $ANTLR start "rule__CorrVariablePattern__Group__6__Impl"
    // InternalTGG.g:4398:1: rule__CorrVariablePattern__Group__6__Impl : ( ( rule__CorrVariablePattern__SourceAssignment_6 ) ) ;
    public final void rule__CorrVariablePattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4402:1: ( ( ( rule__CorrVariablePattern__SourceAssignment_6 ) ) )
            // InternalTGG.g:4403:1: ( ( rule__CorrVariablePattern__SourceAssignment_6 ) )
            {
            // InternalTGG.g:4403:1: ( ( rule__CorrVariablePattern__SourceAssignment_6 ) )
            // InternalTGG.g:4404:2: ( rule__CorrVariablePattern__SourceAssignment_6 )
            {
             before(grammarAccess.getCorrVariablePatternAccess().getSourceAssignment_6()); 
            // InternalTGG.g:4405:2: ( rule__CorrVariablePattern__SourceAssignment_6 )
            // InternalTGG.g:4405:3: rule__CorrVariablePattern__SourceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__SourceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCorrVariablePatternAccess().getSourceAssignment_6()); 

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
    // $ANTLR end "rule__CorrVariablePattern__Group__6__Impl"


    // $ANTLR start "rule__CorrVariablePattern__Group__7"
    // InternalTGG.g:4413:1: rule__CorrVariablePattern__Group__7 : rule__CorrVariablePattern__Group__7__Impl rule__CorrVariablePattern__Group__8 ;
    public final void rule__CorrVariablePattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4417:1: ( rule__CorrVariablePattern__Group__7__Impl rule__CorrVariablePattern__Group__8 )
            // InternalTGG.g:4418:2: rule__CorrVariablePattern__Group__7__Impl rule__CorrVariablePattern__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__CorrVariablePattern__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__Group__8();

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
    // $ANTLR end "rule__CorrVariablePattern__Group__7"


    // $ANTLR start "rule__CorrVariablePattern__Group__7__Impl"
    // InternalTGG.g:4425:1: rule__CorrVariablePattern__Group__7__Impl : ( '#trg->' ) ;
    public final void rule__CorrVariablePattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4429:1: ( ( '#trg->' ) )
            // InternalTGG.g:4430:1: ( '#trg->' )
            {
            // InternalTGG.g:4430:1: ( '#trg->' )
            // InternalTGG.g:4431:2: '#trg->'
            {
             before(grammarAccess.getCorrVariablePatternAccess().getTrgKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCorrVariablePatternAccess().getTrgKeyword_7()); 

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
    // $ANTLR end "rule__CorrVariablePattern__Group__7__Impl"


    // $ANTLR start "rule__CorrVariablePattern__Group__8"
    // InternalTGG.g:4440:1: rule__CorrVariablePattern__Group__8 : rule__CorrVariablePattern__Group__8__Impl rule__CorrVariablePattern__Group__9 ;
    public final void rule__CorrVariablePattern__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4444:1: ( rule__CorrVariablePattern__Group__8__Impl rule__CorrVariablePattern__Group__9 )
            // InternalTGG.g:4445:2: rule__CorrVariablePattern__Group__8__Impl rule__CorrVariablePattern__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__CorrVariablePattern__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__Group__9();

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
    // $ANTLR end "rule__CorrVariablePattern__Group__8"


    // $ANTLR start "rule__CorrVariablePattern__Group__8__Impl"
    // InternalTGG.g:4452:1: rule__CorrVariablePattern__Group__8__Impl : ( ( rule__CorrVariablePattern__TargetAssignment_8 ) ) ;
    public final void rule__CorrVariablePattern__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4456:1: ( ( ( rule__CorrVariablePattern__TargetAssignment_8 ) ) )
            // InternalTGG.g:4457:1: ( ( rule__CorrVariablePattern__TargetAssignment_8 ) )
            {
            // InternalTGG.g:4457:1: ( ( rule__CorrVariablePattern__TargetAssignment_8 ) )
            // InternalTGG.g:4458:2: ( rule__CorrVariablePattern__TargetAssignment_8 )
            {
             before(grammarAccess.getCorrVariablePatternAccess().getTargetAssignment_8()); 
            // InternalTGG.g:4459:2: ( rule__CorrVariablePattern__TargetAssignment_8 )
            // InternalTGG.g:4459:3: rule__CorrVariablePattern__TargetAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__TargetAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCorrVariablePatternAccess().getTargetAssignment_8()); 

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
    // $ANTLR end "rule__CorrVariablePattern__Group__8__Impl"


    // $ANTLR start "rule__CorrVariablePattern__Group__9"
    // InternalTGG.g:4467:1: rule__CorrVariablePattern__Group__9 : rule__CorrVariablePattern__Group__9__Impl ;
    public final void rule__CorrVariablePattern__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4471:1: ( rule__CorrVariablePattern__Group__9__Impl )
            // InternalTGG.g:4472:2: rule__CorrVariablePattern__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CorrVariablePattern__Group__9__Impl();

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
    // $ANTLR end "rule__CorrVariablePattern__Group__9"


    // $ANTLR start "rule__CorrVariablePattern__Group__9__Impl"
    // InternalTGG.g:4478:1: rule__CorrVariablePattern__Group__9__Impl : ( '}' ) ;
    public final void rule__CorrVariablePattern__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4482:1: ( ( '}' ) )
            // InternalTGG.g:4483:1: ( '}' )
            {
            // InternalTGG.g:4483:1: ( '}' )
            // InternalTGG.g:4484:2: '}'
            {
             before(grammarAccess.getCorrVariablePatternAccess().getRightCurlyBracketKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCorrVariablePatternAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__CorrVariablePattern__Group__9__Impl"


    // $ANTLR start "rule__ObjectVariablePattern__Group__0"
    // InternalTGG.g:4494:1: rule__ObjectVariablePattern__Group__0 : rule__ObjectVariablePattern__Group__0__Impl rule__ObjectVariablePattern__Group__1 ;
    public final void rule__ObjectVariablePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4498:1: ( rule__ObjectVariablePattern__Group__0__Impl rule__ObjectVariablePattern__Group__1 )
            // InternalTGG.g:4499:2: rule__ObjectVariablePattern__Group__0__Impl rule__ObjectVariablePattern__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ObjectVariablePattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectVariablePattern__Group__1();

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
    // $ANTLR end "rule__ObjectVariablePattern__Group__0"


    // $ANTLR start "rule__ObjectVariablePattern__Group__0__Impl"
    // InternalTGG.g:4506:1: rule__ObjectVariablePattern__Group__0__Impl : ( ( rule__ObjectVariablePattern__OpAssignment_0 )? ) ;
    public final void rule__ObjectVariablePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4510:1: ( ( ( rule__ObjectVariablePattern__OpAssignment_0 )? ) )
            // InternalTGG.g:4511:1: ( ( rule__ObjectVariablePattern__OpAssignment_0 )? )
            {
            // InternalTGG.g:4511:1: ( ( rule__ObjectVariablePattern__OpAssignment_0 )? )
            // InternalTGG.g:4512:2: ( rule__ObjectVariablePattern__OpAssignment_0 )?
            {
             before(grammarAccess.getObjectVariablePatternAccess().getOpAssignment_0()); 
            // InternalTGG.g:4513:2: ( rule__ObjectVariablePattern__OpAssignment_0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=19 && LA49_0<=21)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTGG.g:4513:3: rule__ObjectVariablePattern__OpAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectVariablePattern__OpAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectVariablePatternAccess().getOpAssignment_0()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__Group__0__Impl"


    // $ANTLR start "rule__ObjectVariablePattern__Group__1"
    // InternalTGG.g:4521:1: rule__ObjectVariablePattern__Group__1 : rule__ObjectVariablePattern__Group__1__Impl rule__ObjectVariablePattern__Group__2 ;
    public final void rule__ObjectVariablePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4525:1: ( rule__ObjectVariablePattern__Group__1__Impl rule__ObjectVariablePattern__Group__2 )
            // InternalTGG.g:4526:2: rule__ObjectVariablePattern__Group__1__Impl rule__ObjectVariablePattern__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ObjectVariablePattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectVariablePattern__Group__2();

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
    // $ANTLR end "rule__ObjectVariablePattern__Group__1"


    // $ANTLR start "rule__ObjectVariablePattern__Group__1__Impl"
    // InternalTGG.g:4533:1: rule__ObjectVariablePattern__Group__1__Impl : ( ( rule__ObjectVariablePattern__NameAssignment_1 ) ) ;
    public final void rule__ObjectVariablePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4537:1: ( ( ( rule__ObjectVariablePattern__NameAssignment_1 ) ) )
            // InternalTGG.g:4538:1: ( ( rule__ObjectVariablePattern__NameAssignment_1 ) )
            {
            // InternalTGG.g:4538:1: ( ( rule__ObjectVariablePattern__NameAssignment_1 ) )
            // InternalTGG.g:4539:2: ( rule__ObjectVariablePattern__NameAssignment_1 )
            {
             before(grammarAccess.getObjectVariablePatternAccess().getNameAssignment_1()); 
            // InternalTGG.g:4540:2: ( rule__ObjectVariablePattern__NameAssignment_1 )
            // InternalTGG.g:4540:3: rule__ObjectVariablePattern__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectVariablePattern__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectVariablePatternAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__Group__1__Impl"


    // $ANTLR start "rule__ObjectVariablePattern__Group__2"
    // InternalTGG.g:4548:1: rule__ObjectVariablePattern__Group__2 : rule__ObjectVariablePattern__Group__2__Impl rule__ObjectVariablePattern__Group__3 ;
    public final void rule__ObjectVariablePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4552:1: ( rule__ObjectVariablePattern__Group__2__Impl rule__ObjectVariablePattern__Group__3 )
            // InternalTGG.g:4553:2: rule__ObjectVariablePattern__Group__2__Impl rule__ObjectVariablePattern__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ObjectVariablePattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectVariablePattern__Group__3();

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
    // $ANTLR end "rule__ObjectVariablePattern__Group__2"


    // $ANTLR start "rule__ObjectVariablePattern__Group__2__Impl"
    // InternalTGG.g:4560:1: rule__ObjectVariablePattern__Group__2__Impl : ( ':' ) ;
    public final void rule__ObjectVariablePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4564:1: ( ( ':' ) )
            // InternalTGG.g:4565:1: ( ':' )
            {
            // InternalTGG.g:4565:1: ( ':' )
            // InternalTGG.g:4566:2: ':'
            {
             before(grammarAccess.getObjectVariablePatternAccess().getColonKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getObjectVariablePatternAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__Group__2__Impl"


    // $ANTLR start "rule__ObjectVariablePattern__Group__3"
    // InternalTGG.g:4575:1: rule__ObjectVariablePattern__Group__3 : rule__ObjectVariablePattern__Group__3__Impl rule__ObjectVariablePattern__Group__4 ;
    public final void rule__ObjectVariablePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4579:1: ( rule__ObjectVariablePattern__Group__3__Impl rule__ObjectVariablePattern__Group__4 )
            // InternalTGG.g:4580:2: rule__ObjectVariablePattern__Group__3__Impl rule__ObjectVariablePattern__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ObjectVariablePattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectVariablePattern__Group__4();

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
    // $ANTLR end "rule__ObjectVariablePattern__Group__3"


    // $ANTLR start "rule__ObjectVariablePattern__Group__3__Impl"
    // InternalTGG.g:4587:1: rule__ObjectVariablePattern__Group__3__Impl : ( ( rule__ObjectVariablePattern__TypeAssignment_3 ) ) ;
    public final void rule__ObjectVariablePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4591:1: ( ( ( rule__ObjectVariablePattern__TypeAssignment_3 ) ) )
            // InternalTGG.g:4592:1: ( ( rule__ObjectVariablePattern__TypeAssignment_3 ) )
            {
            // InternalTGG.g:4592:1: ( ( rule__ObjectVariablePattern__TypeAssignment_3 ) )
            // InternalTGG.g:4593:2: ( rule__ObjectVariablePattern__TypeAssignment_3 )
            {
             before(grammarAccess.getObjectVariablePatternAccess().getTypeAssignment_3()); 
            // InternalTGG.g:4594:2: ( rule__ObjectVariablePattern__TypeAssignment_3 )
            // InternalTGG.g:4594:3: rule__ObjectVariablePattern__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ObjectVariablePattern__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObjectVariablePatternAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__Group__3__Impl"


    // $ANTLR start "rule__ObjectVariablePattern__Group__4"
    // InternalTGG.g:4602:1: rule__ObjectVariablePattern__Group__4 : rule__ObjectVariablePattern__Group__4__Impl ;
    public final void rule__ObjectVariablePattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4606:1: ( rule__ObjectVariablePattern__Group__4__Impl )
            // InternalTGG.g:4607:2: rule__ObjectVariablePattern__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectVariablePattern__Group__4__Impl();

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
    // $ANTLR end "rule__ObjectVariablePattern__Group__4"


    // $ANTLR start "rule__ObjectVariablePattern__Group__4__Impl"
    // InternalTGG.g:4613:1: rule__ObjectVariablePattern__Group__4__Impl : ( ( rule__ObjectVariablePattern__Group_4__0 )? ) ;
    public final void rule__ObjectVariablePattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4617:1: ( ( ( rule__ObjectVariablePattern__Group_4__0 )? ) )
            // InternalTGG.g:4618:1: ( ( rule__ObjectVariablePattern__Group_4__0 )? )
            {
            // InternalTGG.g:4618:1: ( ( rule__ObjectVariablePattern__Group_4__0 )? )
            // InternalTGG.g:4619:2: ( rule__ObjectVariablePattern__Group_4__0 )?
            {
             before(grammarAccess.getObjectVariablePatternAccess().getGroup_4()); 
            // InternalTGG.g:4620:2: ( rule__ObjectVariablePattern__Group_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==24) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalTGG.g:4620:3: rule__ObjectVariablePattern__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectVariablePattern__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectVariablePatternAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__Group__4__Impl"


    // $ANTLR start "rule__ObjectVariablePattern__Group_4__0"
    // InternalTGG.g:4629:1: rule__ObjectVariablePattern__Group_4__0 : rule__ObjectVariablePattern__Group_4__0__Impl rule__ObjectVariablePattern__Group_4__1 ;
    public final void rule__ObjectVariablePattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4633:1: ( rule__ObjectVariablePattern__Group_4__0__Impl rule__ObjectVariablePattern__Group_4__1 )
            // InternalTGG.g:4634:2: rule__ObjectVariablePattern__Group_4__0__Impl rule__ObjectVariablePattern__Group_4__1
            {
            pushFollow(FOLLOW_37);
            rule__ObjectVariablePattern__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectVariablePattern__Group_4__1();

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
    // $ANTLR end "rule__ObjectVariablePattern__Group_4__0"


    // $ANTLR start "rule__ObjectVariablePattern__Group_4__0__Impl"
    // InternalTGG.g:4641:1: rule__ObjectVariablePattern__Group_4__0__Impl : ( '{' ) ;
    public final void rule__ObjectVariablePattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4645:1: ( ( '{' ) )
            // InternalTGG.g:4646:1: ( '{' )
            {
            // InternalTGG.g:4646:1: ( '{' )
            // InternalTGG.g:4647:2: '{'
            {
             before(grammarAccess.getObjectVariablePatternAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getObjectVariablePatternAccess().getLeftCurlyBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__Group_4__0__Impl"


    // $ANTLR start "rule__ObjectVariablePattern__Group_4__1"
    // InternalTGG.g:4656:1: rule__ObjectVariablePattern__Group_4__1 : rule__ObjectVariablePattern__Group_4__1__Impl rule__ObjectVariablePattern__Group_4__2 ;
    public final void rule__ObjectVariablePattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4660:1: ( rule__ObjectVariablePattern__Group_4__1__Impl rule__ObjectVariablePattern__Group_4__2 )
            // InternalTGG.g:4661:2: rule__ObjectVariablePattern__Group_4__1__Impl rule__ObjectVariablePattern__Group_4__2
            {
            pushFollow(FOLLOW_37);
            rule__ObjectVariablePattern__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectVariablePattern__Group_4__2();

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
    // $ANTLR end "rule__ObjectVariablePattern__Group_4__1"


    // $ANTLR start "rule__ObjectVariablePattern__Group_4__1__Impl"
    // InternalTGG.g:4668:1: rule__ObjectVariablePattern__Group_4__1__Impl : ( ( rule__ObjectVariablePattern__AttributeAssignmentsAssignment_4_1 )* ) ;
    public final void rule__ObjectVariablePattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4672:1: ( ( ( rule__ObjectVariablePattern__AttributeAssignmentsAssignment_4_1 )* ) )
            // InternalTGG.g:4673:1: ( ( rule__ObjectVariablePattern__AttributeAssignmentsAssignment_4_1 )* )
            {
            // InternalTGG.g:4673:1: ( ( rule__ObjectVariablePattern__AttributeAssignmentsAssignment_4_1 )* )
            // InternalTGG.g:4674:2: ( rule__ObjectVariablePattern__AttributeAssignmentsAssignment_4_1 )*
            {
             before(grammarAccess.getObjectVariablePatternAccess().getAttributeAssignmentsAssignment_4_1()); 
            // InternalTGG.g:4675:2: ( rule__ObjectVariablePattern__AttributeAssignmentsAssignment_4_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_ID) ) {
                    int LA51_1 = input.LA(2);

                    if ( (LA51_1==52) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // InternalTGG.g:4675:3: rule__ObjectVariablePattern__AttributeAssignmentsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ObjectVariablePattern__AttributeAssignmentsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getObjectVariablePatternAccess().getAttributeAssignmentsAssignment_4_1()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__Group_4__1__Impl"


    // $ANTLR start "rule__ObjectVariablePattern__Group_4__2"
    // InternalTGG.g:4683:1: rule__ObjectVariablePattern__Group_4__2 : rule__ObjectVariablePattern__Group_4__2__Impl rule__ObjectVariablePattern__Group_4__3 ;
    public final void rule__ObjectVariablePattern__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4687:1: ( rule__ObjectVariablePattern__Group_4__2__Impl rule__ObjectVariablePattern__Group_4__3 )
            // InternalTGG.g:4688:2: rule__ObjectVariablePattern__Group_4__2__Impl rule__ObjectVariablePattern__Group_4__3
            {
            pushFollow(FOLLOW_37);
            rule__ObjectVariablePattern__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectVariablePattern__Group_4__3();

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
    // $ANTLR end "rule__ObjectVariablePattern__Group_4__2"


    // $ANTLR start "rule__ObjectVariablePattern__Group_4__2__Impl"
    // InternalTGG.g:4695:1: rule__ObjectVariablePattern__Group_4__2__Impl : ( ( rule__ObjectVariablePattern__AttributeConstraintsAssignment_4_2 )* ) ;
    public final void rule__ObjectVariablePattern__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4699:1: ( ( ( rule__ObjectVariablePattern__AttributeConstraintsAssignment_4_2 )* ) )
            // InternalTGG.g:4700:1: ( ( rule__ObjectVariablePattern__AttributeConstraintsAssignment_4_2 )* )
            {
            // InternalTGG.g:4700:1: ( ( rule__ObjectVariablePattern__AttributeConstraintsAssignment_4_2 )* )
            // InternalTGG.g:4701:2: ( rule__ObjectVariablePattern__AttributeConstraintsAssignment_4_2 )*
            {
             before(grammarAccess.getObjectVariablePatternAccess().getAttributeConstraintsAssignment_4_2()); 
            // InternalTGG.g:4702:2: ( rule__ObjectVariablePattern__AttributeConstraintsAssignment_4_2 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalTGG.g:4702:3: rule__ObjectVariablePattern__AttributeConstraintsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ObjectVariablePattern__AttributeConstraintsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getObjectVariablePatternAccess().getAttributeConstraintsAssignment_4_2()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__Group_4__2__Impl"


    // $ANTLR start "rule__ObjectVariablePattern__Group_4__3"
    // InternalTGG.g:4710:1: rule__ObjectVariablePattern__Group_4__3 : rule__ObjectVariablePattern__Group_4__3__Impl rule__ObjectVariablePattern__Group_4__4 ;
    public final void rule__ObjectVariablePattern__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4714:1: ( rule__ObjectVariablePattern__Group_4__3__Impl rule__ObjectVariablePattern__Group_4__4 )
            // InternalTGG.g:4715:2: rule__ObjectVariablePattern__Group_4__3__Impl rule__ObjectVariablePattern__Group_4__4
            {
            pushFollow(FOLLOW_37);
            rule__ObjectVariablePattern__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectVariablePattern__Group_4__4();

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
    // $ANTLR end "rule__ObjectVariablePattern__Group_4__3"


    // $ANTLR start "rule__ObjectVariablePattern__Group_4__3__Impl"
    // InternalTGG.g:4722:1: rule__ObjectVariablePattern__Group_4__3__Impl : ( ( rule__ObjectVariablePattern__LinkVariablePatternsAssignment_4_3 )* ) ;
    public final void rule__ObjectVariablePattern__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4726:1: ( ( ( rule__ObjectVariablePattern__LinkVariablePatternsAssignment_4_3 )* ) )
            // InternalTGG.g:4727:1: ( ( rule__ObjectVariablePattern__LinkVariablePatternsAssignment_4_3 )* )
            {
            // InternalTGG.g:4727:1: ( ( rule__ObjectVariablePattern__LinkVariablePatternsAssignment_4_3 )* )
            // InternalTGG.g:4728:2: ( rule__ObjectVariablePattern__LinkVariablePatternsAssignment_4_3 )*
            {
             before(grammarAccess.getObjectVariablePatternAccess().getLinkVariablePatternsAssignment_4_3()); 
            // InternalTGG.g:4729:2: ( rule__ObjectVariablePattern__LinkVariablePatternsAssignment_4_3 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=19 && LA53_0<=21)||LA53_0==45) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalTGG.g:4729:3: rule__ObjectVariablePattern__LinkVariablePatternsAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__ObjectVariablePattern__LinkVariablePatternsAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getObjectVariablePatternAccess().getLinkVariablePatternsAssignment_4_3()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__Group_4__3__Impl"


    // $ANTLR start "rule__ObjectVariablePattern__Group_4__4"
    // InternalTGG.g:4737:1: rule__ObjectVariablePattern__Group_4__4 : rule__ObjectVariablePattern__Group_4__4__Impl ;
    public final void rule__ObjectVariablePattern__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4741:1: ( rule__ObjectVariablePattern__Group_4__4__Impl )
            // InternalTGG.g:4742:2: rule__ObjectVariablePattern__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectVariablePattern__Group_4__4__Impl();

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
    // $ANTLR end "rule__ObjectVariablePattern__Group_4__4"


    // $ANTLR start "rule__ObjectVariablePattern__Group_4__4__Impl"
    // InternalTGG.g:4748:1: rule__ObjectVariablePattern__Group_4__4__Impl : ( '}' ) ;
    public final void rule__ObjectVariablePattern__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4752:1: ( ( '}' ) )
            // InternalTGG.g:4753:1: ( '}' )
            {
            // InternalTGG.g:4753:1: ( '}' )
            // InternalTGG.g:4754:2: '}'
            {
             before(grammarAccess.getObjectVariablePatternAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getObjectVariablePatternAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__Group_4__4__Impl"


    // $ANTLR start "rule__AttributeConstraint__Group__0"
    // InternalTGG.g:4764:1: rule__AttributeConstraint__Group__0 : rule__AttributeConstraint__Group__0__Impl rule__AttributeConstraint__Group__1 ;
    public final void rule__AttributeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4768:1: ( rule__AttributeConstraint__Group__0__Impl rule__AttributeConstraint__Group__1 )
            // InternalTGG.g:4769:2: rule__AttributeConstraint__Group__0__Impl rule__AttributeConstraint__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__AttributeConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeConstraint__Group__1();

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
    // $ANTLR end "rule__AttributeConstraint__Group__0"


    // $ANTLR start "rule__AttributeConstraint__Group__0__Impl"
    // InternalTGG.g:4776:1: rule__AttributeConstraint__Group__0__Impl : ( ( rule__AttributeConstraint__AttributeAssignment_0 ) ) ;
    public final void rule__AttributeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4780:1: ( ( ( rule__AttributeConstraint__AttributeAssignment_0 ) ) )
            // InternalTGG.g:4781:1: ( ( rule__AttributeConstraint__AttributeAssignment_0 ) )
            {
            // InternalTGG.g:4781:1: ( ( rule__AttributeConstraint__AttributeAssignment_0 ) )
            // InternalTGG.g:4782:2: ( rule__AttributeConstraint__AttributeAssignment_0 )
            {
             before(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_0()); 
            // InternalTGG.g:4783:2: ( rule__AttributeConstraint__AttributeAssignment_0 )
            // InternalTGG.g:4783:3: rule__AttributeConstraint__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeConstraint__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_0()); 

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
    // $ANTLR end "rule__AttributeConstraint__Group__0__Impl"


    // $ANTLR start "rule__AttributeConstraint__Group__1"
    // InternalTGG.g:4791:1: rule__AttributeConstraint__Group__1 : rule__AttributeConstraint__Group__1__Impl rule__AttributeConstraint__Group__2 ;
    public final void rule__AttributeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4795:1: ( rule__AttributeConstraint__Group__1__Impl rule__AttributeConstraint__Group__2 )
            // InternalTGG.g:4796:2: rule__AttributeConstraint__Group__1__Impl rule__AttributeConstraint__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__AttributeConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeConstraint__Group__2();

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
    // $ANTLR end "rule__AttributeConstraint__Group__1"


    // $ANTLR start "rule__AttributeConstraint__Group__1__Impl"
    // InternalTGG.g:4803:1: rule__AttributeConstraint__Group__1__Impl : ( ( rule__AttributeConstraint__OpAssignment_1 ) ) ;
    public final void rule__AttributeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4807:1: ( ( ( rule__AttributeConstraint__OpAssignment_1 ) ) )
            // InternalTGG.g:4808:1: ( ( rule__AttributeConstraint__OpAssignment_1 ) )
            {
            // InternalTGG.g:4808:1: ( ( rule__AttributeConstraint__OpAssignment_1 ) )
            // InternalTGG.g:4809:2: ( rule__AttributeConstraint__OpAssignment_1 )
            {
             before(grammarAccess.getAttributeConstraintAccess().getOpAssignment_1()); 
            // InternalTGG.g:4810:2: ( rule__AttributeConstraint__OpAssignment_1 )
            // InternalTGG.g:4810:3: rule__AttributeConstraint__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeConstraint__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeConstraintAccess().getOpAssignment_1()); 

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
    // $ANTLR end "rule__AttributeConstraint__Group__1__Impl"


    // $ANTLR start "rule__AttributeConstraint__Group__2"
    // InternalTGG.g:4818:1: rule__AttributeConstraint__Group__2 : rule__AttributeConstraint__Group__2__Impl ;
    public final void rule__AttributeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4822:1: ( rule__AttributeConstraint__Group__2__Impl )
            // InternalTGG.g:4823:2: rule__AttributeConstraint__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeConstraint__Group__2__Impl();

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
    // $ANTLR end "rule__AttributeConstraint__Group__2"


    // $ANTLR start "rule__AttributeConstraint__Group__2__Impl"
    // InternalTGG.g:4829:1: rule__AttributeConstraint__Group__2__Impl : ( ( rule__AttributeConstraint__ValueExpAssignment_2 ) ) ;
    public final void rule__AttributeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4833:1: ( ( ( rule__AttributeConstraint__ValueExpAssignment_2 ) ) )
            // InternalTGG.g:4834:1: ( ( rule__AttributeConstraint__ValueExpAssignment_2 ) )
            {
            // InternalTGG.g:4834:1: ( ( rule__AttributeConstraint__ValueExpAssignment_2 ) )
            // InternalTGG.g:4835:2: ( rule__AttributeConstraint__ValueExpAssignment_2 )
            {
             before(grammarAccess.getAttributeConstraintAccess().getValueExpAssignment_2()); 
            // InternalTGG.g:4836:2: ( rule__AttributeConstraint__ValueExpAssignment_2 )
            // InternalTGG.g:4836:3: rule__AttributeConstraint__ValueExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeConstraint__ValueExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeConstraintAccess().getValueExpAssignment_2()); 

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
    // $ANTLR end "rule__AttributeConstraint__Group__2__Impl"


    // $ANTLR start "rule__AttributeAssignment__Group__0"
    // InternalTGG.g:4845:1: rule__AttributeAssignment__Group__0 : rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1 ;
    public final void rule__AttributeAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4849:1: ( rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1 )
            // InternalTGG.g:4850:2: rule__AttributeAssignment__Group__0__Impl rule__AttributeAssignment__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__AttributeAssignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group__1();

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
    // $ANTLR end "rule__AttributeAssignment__Group__0"


    // $ANTLR start "rule__AttributeAssignment__Group__0__Impl"
    // InternalTGG.g:4857:1: rule__AttributeAssignment__Group__0__Impl : ( ( rule__AttributeAssignment__AttributeAssignment_0 ) ) ;
    public final void rule__AttributeAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4861:1: ( ( ( rule__AttributeAssignment__AttributeAssignment_0 ) ) )
            // InternalTGG.g:4862:1: ( ( rule__AttributeAssignment__AttributeAssignment_0 ) )
            {
            // InternalTGG.g:4862:1: ( ( rule__AttributeAssignment__AttributeAssignment_0 ) )
            // InternalTGG.g:4863:2: ( rule__AttributeAssignment__AttributeAssignment_0 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttributeAssignment_0()); 
            // InternalTGG.g:4864:2: ( rule__AttributeAssignment__AttributeAssignment_0 )
            // InternalTGG.g:4864:3: rule__AttributeAssignment__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAssignmentAccess().getAttributeAssignment_0()); 

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
    // $ANTLR end "rule__AttributeAssignment__Group__0__Impl"


    // $ANTLR start "rule__AttributeAssignment__Group__1"
    // InternalTGG.g:4872:1: rule__AttributeAssignment__Group__1 : rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2 ;
    public final void rule__AttributeAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4876:1: ( rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2 )
            // InternalTGG.g:4877:2: rule__AttributeAssignment__Group__1__Impl rule__AttributeAssignment__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__AttributeAssignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group__2();

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
    // $ANTLR end "rule__AttributeAssignment__Group__1"


    // $ANTLR start "rule__AttributeAssignment__Group__1__Impl"
    // InternalTGG.g:4884:1: rule__AttributeAssignment__Group__1__Impl : ( ( rule__AttributeAssignment__OpAssignment_1 ) ) ;
    public final void rule__AttributeAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4888:1: ( ( ( rule__AttributeAssignment__OpAssignment_1 ) ) )
            // InternalTGG.g:4889:1: ( ( rule__AttributeAssignment__OpAssignment_1 ) )
            {
            // InternalTGG.g:4889:1: ( ( rule__AttributeAssignment__OpAssignment_1 ) )
            // InternalTGG.g:4890:2: ( rule__AttributeAssignment__OpAssignment_1 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getOpAssignment_1()); 
            // InternalTGG.g:4891:2: ( rule__AttributeAssignment__OpAssignment_1 )
            // InternalTGG.g:4891:3: rule__AttributeAssignment__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAssignmentAccess().getOpAssignment_1()); 

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
    // $ANTLR end "rule__AttributeAssignment__Group__1__Impl"


    // $ANTLR start "rule__AttributeAssignment__Group__2"
    // InternalTGG.g:4899:1: rule__AttributeAssignment__Group__2 : rule__AttributeAssignment__Group__2__Impl ;
    public final void rule__AttributeAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4903:1: ( rule__AttributeAssignment__Group__2__Impl )
            // InternalTGG.g:4904:2: rule__AttributeAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__Group__2__Impl();

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
    // $ANTLR end "rule__AttributeAssignment__Group__2"


    // $ANTLR start "rule__AttributeAssignment__Group__2__Impl"
    // InternalTGG.g:4910:1: rule__AttributeAssignment__Group__2__Impl : ( ( rule__AttributeAssignment__ValueExpAssignment_2 ) ) ;
    public final void rule__AttributeAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4914:1: ( ( ( rule__AttributeAssignment__ValueExpAssignment_2 ) ) )
            // InternalTGG.g:4915:1: ( ( rule__AttributeAssignment__ValueExpAssignment_2 ) )
            {
            // InternalTGG.g:4915:1: ( ( rule__AttributeAssignment__ValueExpAssignment_2 ) )
            // InternalTGG.g:4916:2: ( rule__AttributeAssignment__ValueExpAssignment_2 )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getValueExpAssignment_2()); 
            // InternalTGG.g:4917:2: ( rule__AttributeAssignment__ValueExpAssignment_2 )
            // InternalTGG.g:4917:3: rule__AttributeAssignment__ValueExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeAssignment__ValueExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAssignmentAccess().getValueExpAssignment_2()); 

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
    // $ANTLR end "rule__AttributeAssignment__Group__2__Impl"


    // $ANTLR start "rule__EnumExpression__Group__0"
    // InternalTGG.g:4926:1: rule__EnumExpression__Group__0 : rule__EnumExpression__Group__0__Impl rule__EnumExpression__Group__1 ;
    public final void rule__EnumExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4930:1: ( rule__EnumExpression__Group__0__Impl rule__EnumExpression__Group__1 )
            // InternalTGG.g:4931:2: rule__EnumExpression__Group__0__Impl rule__EnumExpression__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EnumExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumExpression__Group__1();

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
    // $ANTLR end "rule__EnumExpression__Group__0"


    // $ANTLR start "rule__EnumExpression__Group__0__Impl"
    // InternalTGG.g:4938:1: rule__EnumExpression__Group__0__Impl : ( 'enum::' ) ;
    public final void rule__EnumExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4942:1: ( ( 'enum::' ) )
            // InternalTGG.g:4943:1: ( 'enum::' )
            {
            // InternalTGG.g:4943:1: ( 'enum::' )
            // InternalTGG.g:4944:2: 'enum::'
            {
             before(grammarAccess.getEnumExpressionAccess().getEnumKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getEnumExpressionAccess().getEnumKeyword_0()); 

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
    // $ANTLR end "rule__EnumExpression__Group__0__Impl"


    // $ANTLR start "rule__EnumExpression__Group__1"
    // InternalTGG.g:4953:1: rule__EnumExpression__Group__1 : rule__EnumExpression__Group__1__Impl rule__EnumExpression__Group__2 ;
    public final void rule__EnumExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4957:1: ( rule__EnumExpression__Group__1__Impl rule__EnumExpression__Group__2 )
            // InternalTGG.g:4958:2: rule__EnumExpression__Group__1__Impl rule__EnumExpression__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__EnumExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumExpression__Group__2();

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
    // $ANTLR end "rule__EnumExpression__Group__1"


    // $ANTLR start "rule__EnumExpression__Group__1__Impl"
    // InternalTGG.g:4965:1: rule__EnumExpression__Group__1__Impl : ( ( rule__EnumExpression__EenumAssignment_1 ) ) ;
    public final void rule__EnumExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4969:1: ( ( ( rule__EnumExpression__EenumAssignment_1 ) ) )
            // InternalTGG.g:4970:1: ( ( rule__EnumExpression__EenumAssignment_1 ) )
            {
            // InternalTGG.g:4970:1: ( ( rule__EnumExpression__EenumAssignment_1 ) )
            // InternalTGG.g:4971:2: ( rule__EnumExpression__EenumAssignment_1 )
            {
             before(grammarAccess.getEnumExpressionAccess().getEenumAssignment_1()); 
            // InternalTGG.g:4972:2: ( rule__EnumExpression__EenumAssignment_1 )
            // InternalTGG.g:4972:3: rule__EnumExpression__EenumAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumExpression__EenumAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumExpressionAccess().getEenumAssignment_1()); 

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
    // $ANTLR end "rule__EnumExpression__Group__1__Impl"


    // $ANTLR start "rule__EnumExpression__Group__2"
    // InternalTGG.g:4980:1: rule__EnumExpression__Group__2 : rule__EnumExpression__Group__2__Impl rule__EnumExpression__Group__3 ;
    public final void rule__EnumExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4984:1: ( rule__EnumExpression__Group__2__Impl rule__EnumExpression__Group__3 )
            // InternalTGG.g:4985:2: rule__EnumExpression__Group__2__Impl rule__EnumExpression__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__EnumExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumExpression__Group__3();

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
    // $ANTLR end "rule__EnumExpression__Group__2"


    // $ANTLR start "rule__EnumExpression__Group__2__Impl"
    // InternalTGG.g:4992:1: rule__EnumExpression__Group__2__Impl : ( '::' ) ;
    public final void rule__EnumExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:4996:1: ( ( '::' ) )
            // InternalTGG.g:4997:1: ( '::' )
            {
            // InternalTGG.g:4997:1: ( '::' )
            // InternalTGG.g:4998:2: '::'
            {
             before(grammarAccess.getEnumExpressionAccess().getColonColonKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getEnumExpressionAccess().getColonColonKeyword_2()); 

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
    // $ANTLR end "rule__EnumExpression__Group__2__Impl"


    // $ANTLR start "rule__EnumExpression__Group__3"
    // InternalTGG.g:5007:1: rule__EnumExpression__Group__3 : rule__EnumExpression__Group__3__Impl ;
    public final void rule__EnumExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5011:1: ( rule__EnumExpression__Group__3__Impl )
            // InternalTGG.g:5012:2: rule__EnumExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumExpression__Group__3__Impl();

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
    // $ANTLR end "rule__EnumExpression__Group__3"


    // $ANTLR start "rule__EnumExpression__Group__3__Impl"
    // InternalTGG.g:5018:1: rule__EnumExpression__Group__3__Impl : ( ( rule__EnumExpression__LiteralAssignment_3 ) ) ;
    public final void rule__EnumExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5022:1: ( ( ( rule__EnumExpression__LiteralAssignment_3 ) ) )
            // InternalTGG.g:5023:1: ( ( rule__EnumExpression__LiteralAssignment_3 ) )
            {
            // InternalTGG.g:5023:1: ( ( rule__EnumExpression__LiteralAssignment_3 ) )
            // InternalTGG.g:5024:2: ( rule__EnumExpression__LiteralAssignment_3 )
            {
             before(grammarAccess.getEnumExpressionAccess().getLiteralAssignment_3()); 
            // InternalTGG.g:5025:2: ( rule__EnumExpression__LiteralAssignment_3 )
            // InternalTGG.g:5025:3: rule__EnumExpression__LiteralAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EnumExpression__LiteralAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumExpressionAccess().getLiteralAssignment_3()); 

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
    // $ANTLR end "rule__EnumExpression__Group__3__Impl"


    // $ANTLR start "rule__AttributeExpression__Group__0"
    // InternalTGG.g:5034:1: rule__AttributeExpression__Group__0 : rule__AttributeExpression__Group__0__Impl rule__AttributeExpression__Group__1 ;
    public final void rule__AttributeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5038:1: ( rule__AttributeExpression__Group__0__Impl rule__AttributeExpression__Group__1 )
            // InternalTGG.g:5039:2: rule__AttributeExpression__Group__0__Impl rule__AttributeExpression__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__AttributeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeExpression__Group__1();

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
    // $ANTLR end "rule__AttributeExpression__Group__0"


    // $ANTLR start "rule__AttributeExpression__Group__0__Impl"
    // InternalTGG.g:5046:1: rule__AttributeExpression__Group__0__Impl : ( ( rule__AttributeExpression__ObjectVarAssignment_0 ) ) ;
    public final void rule__AttributeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5050:1: ( ( ( rule__AttributeExpression__ObjectVarAssignment_0 ) ) )
            // InternalTGG.g:5051:1: ( ( rule__AttributeExpression__ObjectVarAssignment_0 ) )
            {
            // InternalTGG.g:5051:1: ( ( rule__AttributeExpression__ObjectVarAssignment_0 ) )
            // InternalTGG.g:5052:2: ( rule__AttributeExpression__ObjectVarAssignment_0 )
            {
             before(grammarAccess.getAttributeExpressionAccess().getObjectVarAssignment_0()); 
            // InternalTGG.g:5053:2: ( rule__AttributeExpression__ObjectVarAssignment_0 )
            // InternalTGG.g:5053:3: rule__AttributeExpression__ObjectVarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeExpression__ObjectVarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeExpressionAccess().getObjectVarAssignment_0()); 

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
    // $ANTLR end "rule__AttributeExpression__Group__0__Impl"


    // $ANTLR start "rule__AttributeExpression__Group__1"
    // InternalTGG.g:5061:1: rule__AttributeExpression__Group__1 : rule__AttributeExpression__Group__1__Impl rule__AttributeExpression__Group__2 ;
    public final void rule__AttributeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5065:1: ( rule__AttributeExpression__Group__1__Impl rule__AttributeExpression__Group__2 )
            // InternalTGG.g:5066:2: rule__AttributeExpression__Group__1__Impl rule__AttributeExpression__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__AttributeExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeExpression__Group__2();

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
    // $ANTLR end "rule__AttributeExpression__Group__1"


    // $ANTLR start "rule__AttributeExpression__Group__1__Impl"
    // InternalTGG.g:5073:1: rule__AttributeExpression__Group__1__Impl : ( '.' ) ;
    public final void rule__AttributeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5077:1: ( ( '.' ) )
            // InternalTGG.g:5078:1: ( '.' )
            {
            // InternalTGG.g:5078:1: ( '.' )
            // InternalTGG.g:5079:2: '.'
            {
             before(grammarAccess.getAttributeExpressionAccess().getFullStopKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAttributeExpressionAccess().getFullStopKeyword_1()); 

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
    // $ANTLR end "rule__AttributeExpression__Group__1__Impl"


    // $ANTLR start "rule__AttributeExpression__Group__2"
    // InternalTGG.g:5088:1: rule__AttributeExpression__Group__2 : rule__AttributeExpression__Group__2__Impl ;
    public final void rule__AttributeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5092:1: ( rule__AttributeExpression__Group__2__Impl )
            // InternalTGG.g:5093:2: rule__AttributeExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeExpression__Group__2__Impl();

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
    // $ANTLR end "rule__AttributeExpression__Group__2"


    // $ANTLR start "rule__AttributeExpression__Group__2__Impl"
    // InternalTGG.g:5099:1: rule__AttributeExpression__Group__2__Impl : ( ( rule__AttributeExpression__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5103:1: ( ( ( rule__AttributeExpression__AttributeAssignment_2 ) ) )
            // InternalTGG.g:5104:1: ( ( rule__AttributeExpression__AttributeAssignment_2 ) )
            {
            // InternalTGG.g:5104:1: ( ( rule__AttributeExpression__AttributeAssignment_2 ) )
            // InternalTGG.g:5105:2: ( rule__AttributeExpression__AttributeAssignment_2 )
            {
             before(grammarAccess.getAttributeExpressionAccess().getAttributeAssignment_2()); 
            // InternalTGG.g:5106:2: ( rule__AttributeExpression__AttributeAssignment_2 )
            // InternalTGG.g:5106:3: rule__AttributeExpression__AttributeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeExpression__AttributeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeExpressionAccess().getAttributeAssignment_2()); 

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
    // $ANTLR end "rule__AttributeExpression__Group__2__Impl"


    // $ANTLR start "rule__LinkVariablePattern__Group__0"
    // InternalTGG.g:5115:1: rule__LinkVariablePattern__Group__0 : rule__LinkVariablePattern__Group__0__Impl rule__LinkVariablePattern__Group__1 ;
    public final void rule__LinkVariablePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5119:1: ( rule__LinkVariablePattern__Group__0__Impl rule__LinkVariablePattern__Group__1 )
            // InternalTGG.g:5120:2: rule__LinkVariablePattern__Group__0__Impl rule__LinkVariablePattern__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__LinkVariablePattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkVariablePattern__Group__1();

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
    // $ANTLR end "rule__LinkVariablePattern__Group__0"


    // $ANTLR start "rule__LinkVariablePattern__Group__0__Impl"
    // InternalTGG.g:5127:1: rule__LinkVariablePattern__Group__0__Impl : ( ( rule__LinkVariablePattern__OpAssignment_0 )? ) ;
    public final void rule__LinkVariablePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5131:1: ( ( ( rule__LinkVariablePattern__OpAssignment_0 )? ) )
            // InternalTGG.g:5132:1: ( ( rule__LinkVariablePattern__OpAssignment_0 )? )
            {
            // InternalTGG.g:5132:1: ( ( rule__LinkVariablePattern__OpAssignment_0 )? )
            // InternalTGG.g:5133:2: ( rule__LinkVariablePattern__OpAssignment_0 )?
            {
             before(grammarAccess.getLinkVariablePatternAccess().getOpAssignment_0()); 
            // InternalTGG.g:5134:2: ( rule__LinkVariablePattern__OpAssignment_0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=19 && LA54_0<=21)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalTGG.g:5134:3: rule__LinkVariablePattern__OpAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LinkVariablePattern__OpAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinkVariablePatternAccess().getOpAssignment_0()); 

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
    // $ANTLR end "rule__LinkVariablePattern__Group__0__Impl"


    // $ANTLR start "rule__LinkVariablePattern__Group__1"
    // InternalTGG.g:5142:1: rule__LinkVariablePattern__Group__1 : rule__LinkVariablePattern__Group__1__Impl rule__LinkVariablePattern__Group__2 ;
    public final void rule__LinkVariablePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5146:1: ( rule__LinkVariablePattern__Group__1__Impl rule__LinkVariablePattern__Group__2 )
            // InternalTGG.g:5147:2: rule__LinkVariablePattern__Group__1__Impl rule__LinkVariablePattern__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__LinkVariablePattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkVariablePattern__Group__2();

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
    // $ANTLR end "rule__LinkVariablePattern__Group__1"


    // $ANTLR start "rule__LinkVariablePattern__Group__1__Impl"
    // InternalTGG.g:5154:1: rule__LinkVariablePattern__Group__1__Impl : ( '-' ) ;
    public final void rule__LinkVariablePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5158:1: ( ( '-' ) )
            // InternalTGG.g:5159:1: ( '-' )
            {
            // InternalTGG.g:5159:1: ( '-' )
            // InternalTGG.g:5160:2: '-'
            {
             before(grammarAccess.getLinkVariablePatternAccess().getHyphenMinusKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLinkVariablePatternAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__LinkVariablePattern__Group__1__Impl"


    // $ANTLR start "rule__LinkVariablePattern__Group__2"
    // InternalTGG.g:5169:1: rule__LinkVariablePattern__Group__2 : rule__LinkVariablePattern__Group__2__Impl rule__LinkVariablePattern__Group__3 ;
    public final void rule__LinkVariablePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5173:1: ( rule__LinkVariablePattern__Group__2__Impl rule__LinkVariablePattern__Group__3 )
            // InternalTGG.g:5174:2: rule__LinkVariablePattern__Group__2__Impl rule__LinkVariablePattern__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__LinkVariablePattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkVariablePattern__Group__3();

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
    // $ANTLR end "rule__LinkVariablePattern__Group__2"


    // $ANTLR start "rule__LinkVariablePattern__Group__2__Impl"
    // InternalTGG.g:5181:1: rule__LinkVariablePattern__Group__2__Impl : ( ( rule__LinkVariablePattern__TypeAssignment_2 ) ) ;
    public final void rule__LinkVariablePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5185:1: ( ( ( rule__LinkVariablePattern__TypeAssignment_2 ) ) )
            // InternalTGG.g:5186:1: ( ( rule__LinkVariablePattern__TypeAssignment_2 ) )
            {
            // InternalTGG.g:5186:1: ( ( rule__LinkVariablePattern__TypeAssignment_2 ) )
            // InternalTGG.g:5187:2: ( rule__LinkVariablePattern__TypeAssignment_2 )
            {
             before(grammarAccess.getLinkVariablePatternAccess().getTypeAssignment_2()); 
            // InternalTGG.g:5188:2: ( rule__LinkVariablePattern__TypeAssignment_2 )
            // InternalTGG.g:5188:3: rule__LinkVariablePattern__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LinkVariablePattern__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkVariablePatternAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__LinkVariablePattern__Group__2__Impl"


    // $ANTLR start "rule__LinkVariablePattern__Group__3"
    // InternalTGG.g:5196:1: rule__LinkVariablePattern__Group__3 : rule__LinkVariablePattern__Group__3__Impl rule__LinkVariablePattern__Group__4 ;
    public final void rule__LinkVariablePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5200:1: ( rule__LinkVariablePattern__Group__3__Impl rule__LinkVariablePattern__Group__4 )
            // InternalTGG.g:5201:2: rule__LinkVariablePattern__Group__3__Impl rule__LinkVariablePattern__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__LinkVariablePattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LinkVariablePattern__Group__4();

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
    // $ANTLR end "rule__LinkVariablePattern__Group__3"


    // $ANTLR start "rule__LinkVariablePattern__Group__3__Impl"
    // InternalTGG.g:5208:1: rule__LinkVariablePattern__Group__3__Impl : ( '->' ) ;
    public final void rule__LinkVariablePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5212:1: ( ( '->' ) )
            // InternalTGG.g:5213:1: ( '->' )
            {
            // InternalTGG.g:5213:1: ( '->' )
            // InternalTGG.g:5214:2: '->'
            {
             before(grammarAccess.getLinkVariablePatternAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLinkVariablePatternAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__LinkVariablePattern__Group__3__Impl"


    // $ANTLR start "rule__LinkVariablePattern__Group__4"
    // InternalTGG.g:5223:1: rule__LinkVariablePattern__Group__4 : rule__LinkVariablePattern__Group__4__Impl ;
    public final void rule__LinkVariablePattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5227:1: ( rule__LinkVariablePattern__Group__4__Impl )
            // InternalTGG.g:5228:2: rule__LinkVariablePattern__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LinkVariablePattern__Group__4__Impl();

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
    // $ANTLR end "rule__LinkVariablePattern__Group__4"


    // $ANTLR start "rule__LinkVariablePattern__Group__4__Impl"
    // InternalTGG.g:5234:1: rule__LinkVariablePattern__Group__4__Impl : ( ( rule__LinkVariablePattern__TargetAssignment_4 ) ) ;
    public final void rule__LinkVariablePattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5238:1: ( ( ( rule__LinkVariablePattern__TargetAssignment_4 ) ) )
            // InternalTGG.g:5239:1: ( ( rule__LinkVariablePattern__TargetAssignment_4 ) )
            {
            // InternalTGG.g:5239:1: ( ( rule__LinkVariablePattern__TargetAssignment_4 ) )
            // InternalTGG.g:5240:2: ( rule__LinkVariablePattern__TargetAssignment_4 )
            {
             before(grammarAccess.getLinkVariablePatternAccess().getTargetAssignment_4()); 
            // InternalTGG.g:5241:2: ( rule__LinkVariablePattern__TargetAssignment_4 )
            // InternalTGG.g:5241:3: rule__LinkVariablePattern__TargetAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LinkVariablePattern__TargetAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLinkVariablePatternAccess().getTargetAssignment_4()); 

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
    // $ANTLR end "rule__LinkVariablePattern__Group__4__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalTGG.g:5250:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5254:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalTGG.g:5255:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalTGG.g:5262:1: rule__Import__Group__0__Impl : ( '#import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5266:1: ( ( '#import' ) )
            // InternalTGG.g:5267:1: ( '#import' )
            {
            // InternalTGG.g:5267:1: ( '#import' )
            // InternalTGG.g:5268:2: '#import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalTGG.g:5277:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5281:1: ( rule__Import__Group__1__Impl )
            // InternalTGG.g:5282:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalTGG.g:5288:1: rule__Import__Group__1__Impl : ( ( rule__Import__NameAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5292:1: ( ( ( rule__Import__NameAssignment_1 ) ) )
            // InternalTGG.g:5293:1: ( ( rule__Import__NameAssignment_1 ) )
            {
            // InternalTGG.g:5293:1: ( ( rule__Import__NameAssignment_1 ) )
            // InternalTGG.g:5294:2: ( rule__Import__NameAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getNameAssignment_1()); 
            // InternalTGG.g:5295:2: ( rule__Import__NameAssignment_1 )
            // InternalTGG.g:5295:3: rule__Import__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Using__Group__0"
    // InternalTGG.g:5304:1: rule__Using__Group__0 : rule__Using__Group__0__Impl rule__Using__Group__1 ;
    public final void rule__Using__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5308:1: ( rule__Using__Group__0__Impl rule__Using__Group__1 )
            // InternalTGG.g:5309:2: rule__Using__Group__0__Impl rule__Using__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Using__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Using__Group__1();

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
    // $ANTLR end "rule__Using__Group__0"


    // $ANTLR start "rule__Using__Group__0__Impl"
    // InternalTGG.g:5316:1: rule__Using__Group__0__Impl : ( '#using' ) ;
    public final void rule__Using__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5320:1: ( ( '#using' ) )
            // InternalTGG.g:5321:1: ( '#using' )
            {
            // InternalTGG.g:5321:1: ( '#using' )
            // InternalTGG.g:5322:2: '#using'
            {
             before(grammarAccess.getUsingAccess().getUsingKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getUsingAccess().getUsingKeyword_0()); 

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
    // $ANTLR end "rule__Using__Group__0__Impl"


    // $ANTLR start "rule__Using__Group__1"
    // InternalTGG.g:5331:1: rule__Using__Group__1 : rule__Using__Group__1__Impl ;
    public final void rule__Using__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5335:1: ( rule__Using__Group__1__Impl )
            // InternalTGG.g:5336:2: rule__Using__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Using__Group__1__Impl();

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
    // $ANTLR end "rule__Using__Group__1"


    // $ANTLR start "rule__Using__Group__1__Impl"
    // InternalTGG.g:5342:1: rule__Using__Group__1__Impl : ( ( rule__Using__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Using__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5346:1: ( ( ( rule__Using__ImportedNamespaceAssignment_1 ) ) )
            // InternalTGG.g:5347:1: ( ( rule__Using__ImportedNamespaceAssignment_1 ) )
            {
            // InternalTGG.g:5347:1: ( ( rule__Using__ImportedNamespaceAssignment_1 ) )
            // InternalTGG.g:5348:2: ( rule__Using__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getUsingAccess().getImportedNamespaceAssignment_1()); 
            // InternalTGG.g:5349:2: ( rule__Using__ImportedNamespaceAssignment_1 )
            // InternalTGG.g:5349:3: rule__Using__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Using__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUsingAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Using__Group__1__Impl"


    // $ANTLR start "rule__LiteralValue__Group_1__0"
    // InternalTGG.g:5358:1: rule__LiteralValue__Group_1__0 : rule__LiteralValue__Group_1__0__Impl rule__LiteralValue__Group_1__1 ;
    public final void rule__LiteralValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5362:1: ( rule__LiteralValue__Group_1__0__Impl rule__LiteralValue__Group_1__1 )
            // InternalTGG.g:5363:2: rule__LiteralValue__Group_1__0__Impl rule__LiteralValue__Group_1__1
            {
            pushFollow(FOLLOW_45);
            rule__LiteralValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiteralValue__Group_1__1();

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
    // $ANTLR end "rule__LiteralValue__Group_1__0"


    // $ANTLR start "rule__LiteralValue__Group_1__0__Impl"
    // InternalTGG.g:5370:1: rule__LiteralValue__Group_1__0__Impl : ( ( '-' )? ) ;
    public final void rule__LiteralValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5374:1: ( ( ( '-' )? ) )
            // InternalTGG.g:5375:1: ( ( '-' )? )
            {
            // InternalTGG.g:5375:1: ( ( '-' )? )
            // InternalTGG.g:5376:2: ( '-' )?
            {
             before(grammarAccess.getLiteralValueAccess().getHyphenMinusKeyword_1_0()); 
            // InternalTGG.g:5377:2: ( '-' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==45) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalTGG.g:5377:3: '-'
                    {
                    match(input,45,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLiteralValueAccess().getHyphenMinusKeyword_1_0()); 

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
    // $ANTLR end "rule__LiteralValue__Group_1__0__Impl"


    // $ANTLR start "rule__LiteralValue__Group_1__1"
    // InternalTGG.g:5385:1: rule__LiteralValue__Group_1__1 : rule__LiteralValue__Group_1__1__Impl ;
    public final void rule__LiteralValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5389:1: ( rule__LiteralValue__Group_1__1__Impl )
            // InternalTGG.g:5390:2: rule__LiteralValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralValue__Group_1__1__Impl();

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
    // $ANTLR end "rule__LiteralValue__Group_1__1"


    // $ANTLR start "rule__LiteralValue__Group_1__1__Impl"
    // InternalTGG.g:5396:1: rule__LiteralValue__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__LiteralValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5400:1: ( ( RULE_INT ) )
            // InternalTGG.g:5401:1: ( RULE_INT )
            {
            // InternalTGG.g:5401:1: ( RULE_INT )
            // InternalTGG.g:5402:2: RULE_INT
            {
             before(grammarAccess.getLiteralValueAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLiteralValueAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__LiteralValue__Group_1__1__Impl"


    // $ANTLR start "rule__LiteralValue__Group_2__0"
    // InternalTGG.g:5412:1: rule__LiteralValue__Group_2__0 : rule__LiteralValue__Group_2__0__Impl rule__LiteralValue__Group_2__1 ;
    public final void rule__LiteralValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5416:1: ( rule__LiteralValue__Group_2__0__Impl rule__LiteralValue__Group_2__1 )
            // InternalTGG.g:5417:2: rule__LiteralValue__Group_2__0__Impl rule__LiteralValue__Group_2__1
            {
            pushFollow(FOLLOW_46);
            rule__LiteralValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LiteralValue__Group_2__1();

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
    // $ANTLR end "rule__LiteralValue__Group_2__0"


    // $ANTLR start "rule__LiteralValue__Group_2__0__Impl"
    // InternalTGG.g:5424:1: rule__LiteralValue__Group_2__0__Impl : ( ( '-' )? ) ;
    public final void rule__LiteralValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5428:1: ( ( ( '-' )? ) )
            // InternalTGG.g:5429:1: ( ( '-' )? )
            {
            // InternalTGG.g:5429:1: ( ( '-' )? )
            // InternalTGG.g:5430:2: ( '-' )?
            {
             before(grammarAccess.getLiteralValueAccess().getHyphenMinusKeyword_2_0()); 
            // InternalTGG.g:5431:2: ( '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==45) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalTGG.g:5431:3: '-'
                    {
                    match(input,45,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLiteralValueAccess().getHyphenMinusKeyword_2_0()); 

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
    // $ANTLR end "rule__LiteralValue__Group_2__0__Impl"


    // $ANTLR start "rule__LiteralValue__Group_2__1"
    // InternalTGG.g:5439:1: rule__LiteralValue__Group_2__1 : rule__LiteralValue__Group_2__1__Impl ;
    public final void rule__LiteralValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5443:1: ( rule__LiteralValue__Group_2__1__Impl )
            // InternalTGG.g:5444:2: rule__LiteralValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LiteralValue__Group_2__1__Impl();

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
    // $ANTLR end "rule__LiteralValue__Group_2__1"


    // $ANTLR start "rule__LiteralValue__Group_2__1__Impl"
    // InternalTGG.g:5450:1: rule__LiteralValue__Group_2__1__Impl : ( RULE_DECIMAL ) ;
    public final void rule__LiteralValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5454:1: ( ( RULE_DECIMAL ) )
            // InternalTGG.g:5455:1: ( RULE_DECIMAL )
            {
            // InternalTGG.g:5455:1: ( RULE_DECIMAL )
            // InternalTGG.g:5456:2: RULE_DECIMAL
            {
             before(grammarAccess.getLiteralValueAccess().getDECIMALTerminalRuleCall_2_1()); 
            match(input,RULE_DECIMAL,FOLLOW_2); 
             after(grammarAccess.getLiteralValueAccess().getDECIMALTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__LiteralValue__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalTGG.g:5466:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5470:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalTGG.g:5471:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalTGG.g:5478:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5482:1: ( ( ruleQualifiedName ) )
            // InternalTGG.g:5483:1: ( ruleQualifiedName )
            {
            // InternalTGG.g:5483:1: ( ruleQualifiedName )
            // InternalTGG.g:5484:2: ruleQualifiedName
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
    // InternalTGG.g:5493:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5497:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalTGG.g:5498:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalTGG.g:5504:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( '.*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5508:1: ( ( '.*' ) )
            // InternalTGG.g:5509:1: ( '.*' )
            {
            // InternalTGG.g:5509:1: ( '.*' )
            // InternalTGG.g:5510:2: '.*'
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            match(input,49,FOLLOW_2); 
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalTGG.g:5520:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5524:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalTGG.g:5525:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalTGG.g:5532:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5536:1: ( ( RULE_ID ) )
            // InternalTGG.g:5537:1: ( RULE_ID )
            {
            // InternalTGG.g:5537:1: ( RULE_ID )
            // InternalTGG.g:5538:2: RULE_ID
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
    // InternalTGG.g:5547:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5551:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalTGG.g:5552:2: rule__QualifiedName__Group__1__Impl
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
    // InternalTGG.g:5558:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5562:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalTGG.g:5563:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalTGG.g:5563:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalTGG.g:5564:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalTGG.g:5565:2: ( rule__QualifiedName__Group_1__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==38) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalTGG.g:5565:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // InternalTGG.g:5574:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5578:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalTGG.g:5579:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalTGG.g:5586:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5590:1: ( ( '.' ) )
            // InternalTGG.g:5591:1: ( '.' )
            {
            // InternalTGG.g:5591:1: ( '.' )
            // InternalTGG.g:5592:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTGG.g:5601:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5605:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalTGG.g:5606:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalTGG.g:5612:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5616:1: ( ( RULE_ID ) )
            // InternalTGG.g:5617:1: ( RULE_ID )
            {
            // InternalTGG.g:5617:1: ( RULE_ID )
            // InternalTGG.g:5618:2: RULE_ID
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


    // $ANTLR start "rule__TripleGraphGrammarFile__SchemaAssignment_0"
    // InternalTGG.g:5628:1: rule__TripleGraphGrammarFile__SchemaAssignment_0 : ( ruleSchema ) ;
    public final void rule__TripleGraphGrammarFile__SchemaAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5632:1: ( ( ruleSchema ) )
            // InternalTGG.g:5633:2: ( ruleSchema )
            {
            // InternalTGG.g:5633:2: ( ruleSchema )
            // InternalTGG.g:5634:3: ruleSchema
            {
             before(grammarAccess.getTripleGraphGrammarFileAccess().getSchemaSchemaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getTripleGraphGrammarFileAccess().getSchemaSchemaParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TripleGraphGrammarFile__SchemaAssignment_0"


    // $ANTLR start "rule__TripleGraphGrammarFile__RulesAssignment_1"
    // InternalTGG.g:5643:1: rule__TripleGraphGrammarFile__RulesAssignment_1 : ( ruleRule ) ;
    public final void rule__TripleGraphGrammarFile__RulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5647:1: ( ( ruleRule ) )
            // InternalTGG.g:5648:2: ( ruleRule )
            {
            // InternalTGG.g:5648:2: ( ruleRule )
            // InternalTGG.g:5649:3: ruleRule
            {
             before(grammarAccess.getTripleGraphGrammarFileAccess().getRulesRuleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getTripleGraphGrammarFileAccess().getRulesRuleParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TripleGraphGrammarFile__RulesAssignment_1"


    // $ANTLR start "rule__TripleGraphGrammarFile__LibraryAssignment_2"
    // InternalTGG.g:5658:1: rule__TripleGraphGrammarFile__LibraryAssignment_2 : ( ruleAttrCondDefLibrary ) ;
    public final void rule__TripleGraphGrammarFile__LibraryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5662:1: ( ( ruleAttrCondDefLibrary ) )
            // InternalTGG.g:5663:2: ( ruleAttrCondDefLibrary )
            {
            // InternalTGG.g:5663:2: ( ruleAttrCondDefLibrary )
            // InternalTGG.g:5664:3: ruleAttrCondDefLibrary
            {
             before(grammarAccess.getTripleGraphGrammarFileAccess().getLibraryAttrCondDefLibraryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttrCondDefLibrary();

            state._fsp--;

             after(grammarAccess.getTripleGraphGrammarFileAccess().getLibraryAttrCondDefLibraryParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TripleGraphGrammarFile__LibraryAssignment_2"


    // $ANTLR start "rule__Schema__ImportsAssignment_0"
    // InternalTGG.g:5673:1: rule__Schema__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Schema__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5677:1: ( ( ruleImport ) )
            // InternalTGG.g:5678:2: ( ruleImport )
            {
            // InternalTGG.g:5678:2: ( ruleImport )
            // InternalTGG.g:5679:3: ruleImport
            {
             before(grammarAccess.getSchemaAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Schema__ImportsAssignment_0"


    // $ANTLR start "rule__Schema__UsingAssignment_1"
    // InternalTGG.g:5688:1: rule__Schema__UsingAssignment_1 : ( ruleUsing ) ;
    public final void rule__Schema__UsingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5692:1: ( ( ruleUsing ) )
            // InternalTGG.g:5693:2: ( ruleUsing )
            {
            // InternalTGG.g:5693:2: ( ruleUsing )
            // InternalTGG.g:5694:3: ruleUsing
            {
             before(grammarAccess.getSchemaAccess().getUsingUsingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUsing();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getUsingUsingParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Schema__UsingAssignment_1"


    // $ANTLR start "rule__Schema__NameAssignment_3"
    // InternalTGG.g:5703:1: rule__Schema__NameAssignment_3 : ( ruleQualifiedName ) ;
    public final void rule__Schema__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5707:1: ( ( ruleQualifiedName ) )
            // InternalTGG.g:5708:2: ( ruleQualifiedName )
            {
            // InternalTGG.g:5708:2: ( ruleQualifiedName )
            // InternalTGG.g:5709:3: ruleQualifiedName
            {
             before(grammarAccess.getSchemaAccess().getNameQualifiedNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getNameQualifiedNameParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Schema__NameAssignment_3"


    // $ANTLR start "rule__Schema__SourceTypesAssignment_4_2"
    // InternalTGG.g:5718:1: rule__Schema__SourceTypesAssignment_4_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Schema__SourceTypesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5722:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTGG.g:5723:2: ( ( ruleQualifiedName ) )
            {
            // InternalTGG.g:5723:2: ( ( ruleQualifiedName ) )
            // InternalTGG.g:5724:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSchemaAccess().getSourceTypesEPackageCrossReference_4_2_0()); 
            // InternalTGG.g:5725:3: ( ruleQualifiedName )
            // InternalTGG.g:5726:4: ruleQualifiedName
            {
             before(grammarAccess.getSchemaAccess().getSourceTypesEPackageQualifiedNameParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getSourceTypesEPackageQualifiedNameParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getSchemaAccess().getSourceTypesEPackageCrossReference_4_2_0()); 

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
    // $ANTLR end "rule__Schema__SourceTypesAssignment_4_2"


    // $ANTLR start "rule__Schema__TargetTypesAssignment_5_2"
    // InternalTGG.g:5737:1: rule__Schema__TargetTypesAssignment_5_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Schema__TargetTypesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5741:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTGG.g:5742:2: ( ( ruleQualifiedName ) )
            {
            // InternalTGG.g:5742:2: ( ( ruleQualifiedName ) )
            // InternalTGG.g:5743:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSchemaAccess().getTargetTypesEPackageCrossReference_5_2_0()); 
            // InternalTGG.g:5744:3: ( ruleQualifiedName )
            // InternalTGG.g:5745:4: ruleQualifiedName
            {
             before(grammarAccess.getSchemaAccess().getTargetTypesEPackageQualifiedNameParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getTargetTypesEPackageQualifiedNameParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getSchemaAccess().getTargetTypesEPackageCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__Schema__TargetTypesAssignment_5_2"


    // $ANTLR start "rule__Schema__CorrespondenceTypesAssignment_6_2"
    // InternalTGG.g:5756:1: rule__Schema__CorrespondenceTypesAssignment_6_2 : ( ruleCorrType ) ;
    public final void rule__Schema__CorrespondenceTypesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5760:1: ( ( ruleCorrType ) )
            // InternalTGG.g:5761:2: ( ruleCorrType )
            {
            // InternalTGG.g:5761:2: ( ruleCorrType )
            // InternalTGG.g:5762:3: ruleCorrType
            {
             before(grammarAccess.getSchemaAccess().getCorrespondenceTypesCorrTypeParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCorrType();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getCorrespondenceTypesCorrTypeParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Schema__CorrespondenceTypesAssignment_6_2"


    // $ANTLR start "rule__Schema__AttributeCondDefsAssignment_7_2"
    // InternalTGG.g:5771:1: rule__Schema__AttributeCondDefsAssignment_7_2 : ( ruleAttrCondDef ) ;
    public final void rule__Schema__AttributeCondDefsAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5775:1: ( ( ruleAttrCondDef ) )
            // InternalTGG.g:5776:2: ( ruleAttrCondDef )
            {
            // InternalTGG.g:5776:2: ( ruleAttrCondDef )
            // InternalTGG.g:5777:3: ruleAttrCondDef
            {
             before(grammarAccess.getSchemaAccess().getAttributeCondDefsAttrCondDefParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttrCondDef();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getAttributeCondDefsAttrCondDefParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Schema__AttributeCondDefsAssignment_7_2"


    // $ANTLR start "rule__CorrType__NameAssignment_0"
    // InternalTGG.g:5786:1: rule__CorrType__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CorrType__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5790:1: ( ( RULE_ID ) )
            // InternalTGG.g:5791:2: ( RULE_ID )
            {
            // InternalTGG.g:5791:2: ( RULE_ID )
            // InternalTGG.g:5792:3: RULE_ID
            {
             before(grammarAccess.getCorrTypeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCorrTypeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__CorrType__NameAssignment_0"


    // $ANTLR start "rule__CorrType__SuperAssignment_1_0_1"
    // InternalTGG.g:5801:1: rule__CorrType__SuperAssignment_1_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__CorrType__SuperAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5805:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:5806:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:5806:2: ( ( RULE_ID ) )
            // InternalTGG.g:5807:3: ( RULE_ID )
            {
             before(grammarAccess.getCorrTypeAccess().getSuperCorrTypeCrossReference_1_0_1_0()); 
            // InternalTGG.g:5808:3: ( RULE_ID )
            // InternalTGG.g:5809:4: RULE_ID
            {
             before(grammarAccess.getCorrTypeAccess().getSuperCorrTypeIDTerminalRuleCall_1_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCorrTypeAccess().getSuperCorrTypeIDTerminalRuleCall_1_0_1_0_1()); 

            }

             after(grammarAccess.getCorrTypeAccess().getSuperCorrTypeCrossReference_1_0_1_0()); 

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
    // $ANTLR end "rule__CorrType__SuperAssignment_1_0_1"


    // $ANTLR start "rule__CorrType__SourceAssignment_1_1_2"
    // InternalTGG.g:5820:1: rule__CorrType__SourceAssignment_1_1_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CorrType__SourceAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5824:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTGG.g:5825:2: ( ( ruleQualifiedName ) )
            {
            // InternalTGG.g:5825:2: ( ( ruleQualifiedName ) )
            // InternalTGG.g:5826:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCorrTypeAccess().getSourceEClassCrossReference_1_1_2_0()); 
            // InternalTGG.g:5827:3: ( ruleQualifiedName )
            // InternalTGG.g:5828:4: ruleQualifiedName
            {
             before(grammarAccess.getCorrTypeAccess().getSourceEClassQualifiedNameParserRuleCall_1_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCorrTypeAccess().getSourceEClassQualifiedNameParserRuleCall_1_1_2_0_1()); 

            }

             after(grammarAccess.getCorrTypeAccess().getSourceEClassCrossReference_1_1_2_0()); 

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
    // $ANTLR end "rule__CorrType__SourceAssignment_1_1_2"


    // $ANTLR start "rule__CorrType__TargetAssignment_1_1_4"
    // InternalTGG.g:5839:1: rule__CorrType__TargetAssignment_1_1_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CorrType__TargetAssignment_1_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5843:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTGG.g:5844:2: ( ( ruleQualifiedName ) )
            {
            // InternalTGG.g:5844:2: ( ( ruleQualifiedName ) )
            // InternalTGG.g:5845:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCorrTypeAccess().getTargetEClassCrossReference_1_1_4_0()); 
            // InternalTGG.g:5846:3: ( ruleQualifiedName )
            // InternalTGG.g:5847:4: ruleQualifiedName
            {
             before(grammarAccess.getCorrTypeAccess().getTargetEClassQualifiedNameParserRuleCall_1_1_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCorrTypeAccess().getTargetEClassQualifiedNameParserRuleCall_1_1_4_0_1()); 

            }

             after(grammarAccess.getCorrTypeAccess().getTargetEClassCrossReference_1_1_4_0()); 

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
    // $ANTLR end "rule__CorrType__TargetAssignment_1_1_4"


    // $ANTLR start "rule__AttrCondDef__UserDefinedAssignment_0"
    // InternalTGG.g:5858:1: rule__AttrCondDef__UserDefinedAssignment_0 : ( ( '#userDefined' ) ) ;
    public final void rule__AttrCondDef__UserDefinedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5862:1: ( ( ( '#userDefined' ) ) )
            // InternalTGG.g:5863:2: ( ( '#userDefined' ) )
            {
            // InternalTGG.g:5863:2: ( ( '#userDefined' ) )
            // InternalTGG.g:5864:3: ( '#userDefined' )
            {
             before(grammarAccess.getAttrCondDefAccess().getUserDefinedUserDefinedKeyword_0_0()); 
            // InternalTGG.g:5865:3: ( '#userDefined' )
            // InternalTGG.g:5866:4: '#userDefined'
            {
             before(grammarAccess.getAttrCondDefAccess().getUserDefinedUserDefinedKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefAccess().getUserDefinedUserDefinedKeyword_0_0()); 

            }

             after(grammarAccess.getAttrCondDefAccess().getUserDefinedUserDefinedKeyword_0_0()); 

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
    // $ANTLR end "rule__AttrCondDef__UserDefinedAssignment_0"


    // $ANTLR start "rule__AttrCondDef__NameAssignment_1"
    // InternalTGG.g:5877:1: rule__AttrCondDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttrCondDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5881:1: ( ( RULE_ID ) )
            // InternalTGG.g:5882:2: ( RULE_ID )
            {
            // InternalTGG.g:5882:2: ( RULE_ID )
            // InternalTGG.g:5883:3: RULE_ID
            {
             before(grammarAccess.getAttrCondDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttrCondDefAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AttrCondDef__NameAssignment_1"


    // $ANTLR start "rule__AttrCondDef__ParamsAssignment_3_0"
    // InternalTGG.g:5892:1: rule__AttrCondDef__ParamsAssignment_3_0 : ( ruleParam ) ;
    public final void rule__AttrCondDef__ParamsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5896:1: ( ( ruleParam ) )
            // InternalTGG.g:5897:2: ( ruleParam )
            {
            // InternalTGG.g:5897:2: ( ruleParam )
            // InternalTGG.g:5898:3: ruleParam
            {
             before(grammarAccess.getAttrCondDefAccess().getParamsParamParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getAttrCondDefAccess().getParamsParamParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__AttrCondDef__ParamsAssignment_3_0"


    // $ANTLR start "rule__AttrCondDef__ParamsAssignment_3_1_1"
    // InternalTGG.g:5907:1: rule__AttrCondDef__ParamsAssignment_3_1_1 : ( ruleParam ) ;
    public final void rule__AttrCondDef__ParamsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5911:1: ( ( ruleParam ) )
            // InternalTGG.g:5912:2: ( ruleParam )
            {
            // InternalTGG.g:5912:2: ( ruleParam )
            // InternalTGG.g:5913:3: ruleParam
            {
             before(grammarAccess.getAttrCondDefAccess().getParamsParamParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParam();

            state._fsp--;

             after(grammarAccess.getAttrCondDefAccess().getParamsParamParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__AttrCondDef__ParamsAssignment_3_1_1"


    // $ANTLR start "rule__AttrCondDef__AllowedSyncAdornmentsAssignment_7"
    // InternalTGG.g:5922:1: rule__AttrCondDef__AllowedSyncAdornmentsAssignment_7 : ( ruleAdornment ) ;
    public final void rule__AttrCondDef__AllowedSyncAdornmentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5926:1: ( ( ruleAdornment ) )
            // InternalTGG.g:5927:2: ( ruleAdornment )
            {
            // InternalTGG.g:5927:2: ( ruleAdornment )
            // InternalTGG.g:5928:3: ruleAdornment
            {
             before(grammarAccess.getAttrCondDefAccess().getAllowedSyncAdornmentsAdornmentParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleAdornment();

            state._fsp--;

             after(grammarAccess.getAttrCondDefAccess().getAllowedSyncAdornmentsAdornmentParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__AttrCondDef__AllowedSyncAdornmentsAssignment_7"


    // $ANTLR start "rule__AttrCondDef__AllowedSyncAdornmentsAssignment_8_1"
    // InternalTGG.g:5937:1: rule__AttrCondDef__AllowedSyncAdornmentsAssignment_8_1 : ( ruleAdornment ) ;
    public final void rule__AttrCondDef__AllowedSyncAdornmentsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5941:1: ( ( ruleAdornment ) )
            // InternalTGG.g:5942:2: ( ruleAdornment )
            {
            // InternalTGG.g:5942:2: ( ruleAdornment )
            // InternalTGG.g:5943:3: ruleAdornment
            {
             before(grammarAccess.getAttrCondDefAccess().getAllowedSyncAdornmentsAdornmentParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdornment();

            state._fsp--;

             after(grammarAccess.getAttrCondDefAccess().getAllowedSyncAdornmentsAdornmentParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__AttrCondDef__AllowedSyncAdornmentsAssignment_8_1"


    // $ANTLR start "rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_0"
    // InternalTGG.g:5952:1: rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_0 : ( ruleAdornment ) ;
    public final void rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5956:1: ( ( ruleAdornment ) )
            // InternalTGG.g:5957:2: ( ruleAdornment )
            {
            // InternalTGG.g:5957:2: ( ruleAdornment )
            // InternalTGG.g:5958:3: ruleAdornment
            {
             before(grammarAccess.getAttrCondDefAccess().getAllowedGenAdornmentsAdornmentParserRuleCall_9_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAdornment();

            state._fsp--;

             after(grammarAccess.getAttrCondDefAccess().getAllowedGenAdornmentsAdornmentParserRuleCall_9_1_0_0()); 

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
    // $ANTLR end "rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_0"


    // $ANTLR start "rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_1_1"
    // InternalTGG.g:5967:1: rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_1_1 : ( ruleAdornment ) ;
    public final void rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5971:1: ( ( ruleAdornment ) )
            // InternalTGG.g:5972:2: ( ruleAdornment )
            {
            // InternalTGG.g:5972:2: ( ruleAdornment )
            // InternalTGG.g:5973:3: ruleAdornment
            {
             before(grammarAccess.getAttrCondDefAccess().getAllowedGenAdornmentsAdornmentParserRuleCall_9_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdornment();

            state._fsp--;

             after(grammarAccess.getAttrCondDefAccess().getAllowedGenAdornmentsAdornmentParserRuleCall_9_1_1_1_0()); 

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
    // $ANTLR end "rule__AttrCondDef__AllowedGenAdornmentsAssignment_9_1_1_1"


    // $ANTLR start "rule__Param__IndexAssignment_0"
    // InternalTGG.g:5982:1: rule__Param__IndexAssignment_0 : ( RULE_INT ) ;
    public final void rule__Param__IndexAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:5986:1: ( ( RULE_INT ) )
            // InternalTGG.g:5987:2: ( RULE_INT )
            {
            // InternalTGG.g:5987:2: ( RULE_INT )
            // InternalTGG.g:5988:3: RULE_INT
            {
             before(grammarAccess.getParamAccess().getIndexINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getParamAccess().getIndexINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Param__IndexAssignment_0"


    // $ANTLR start "rule__Param__TypeAssignment_2"
    // InternalTGG.g:5997:1: rule__Param__TypeAssignment_2 : ( ruleParamType ) ;
    public final void rule__Param__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6001:1: ( ( ruleParamType ) )
            // InternalTGG.g:6002:2: ( ruleParamType )
            {
            // InternalTGG.g:6002:2: ( ruleParamType )
            // InternalTGG.g:6003:3: ruleParamType
            {
             before(grammarAccess.getParamAccess().getTypeParamTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParamType();

            state._fsp--;

             after(grammarAccess.getParamAccess().getTypeParamTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Param__TypeAssignment_2"


    // $ANTLR start "rule__Rule__ImportsAssignment_0"
    // InternalTGG.g:6012:1: rule__Rule__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Rule__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6016:1: ( ( ruleImport ) )
            // InternalTGG.g:6017:2: ( ruleImport )
            {
            // InternalTGG.g:6017:2: ( ruleImport )
            // InternalTGG.g:6018:3: ruleImport
            {
             before(grammarAccess.getRuleAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getImportsImportParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Rule__ImportsAssignment_0"


    // $ANTLR start "rule__Rule__UsingAssignment_1"
    // InternalTGG.g:6027:1: rule__Rule__UsingAssignment_1 : ( ruleUsing ) ;
    public final void rule__Rule__UsingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6031:1: ( ( ruleUsing ) )
            // InternalTGG.g:6032:2: ( ruleUsing )
            {
            // InternalTGG.g:6032:2: ( ruleUsing )
            // InternalTGG.g:6033:3: ruleUsing
            {
             before(grammarAccess.getRuleAccess().getUsingUsingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUsing();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getUsingUsingParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rule__UsingAssignment_1"


    // $ANTLR start "rule__Rule__AbstractRuleAssignment_2"
    // InternalTGG.g:6042:1: rule__Rule__AbstractRuleAssignment_2 : ( ( '#abstract' ) ) ;
    public final void rule__Rule__AbstractRuleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6046:1: ( ( ( '#abstract' ) ) )
            // InternalTGG.g:6047:2: ( ( '#abstract' ) )
            {
            // InternalTGG.g:6047:2: ( ( '#abstract' ) )
            // InternalTGG.g:6048:3: ( '#abstract' )
            {
             before(grammarAccess.getRuleAccess().getAbstractRuleAbstractKeyword_2_0()); 
            // InternalTGG.g:6049:3: ( '#abstract' )
            // InternalTGG.g:6050:4: '#abstract'
            {
             before(grammarAccess.getRuleAccess().getAbstractRuleAbstractKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getAbstractRuleAbstractKeyword_2_0()); 

            }

             after(grammarAccess.getRuleAccess().getAbstractRuleAbstractKeyword_2_0()); 

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
    // $ANTLR end "rule__Rule__AbstractRuleAssignment_2"


    // $ANTLR start "rule__Rule__NameAssignment_4"
    // InternalTGG.g:6061:1: rule__Rule__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6065:1: ( ( RULE_ID ) )
            // InternalTGG.g:6066:2: ( RULE_ID )
            {
            // InternalTGG.g:6066:2: ( RULE_ID )
            // InternalTGG.g:6067:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rule__NameAssignment_4"


    // $ANTLR start "rule__Rule__SupertypesAssignment_5_1"
    // InternalTGG.g:6076:1: rule__Rule__SupertypesAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__SupertypesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6080:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:6081:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:6081:2: ( ( RULE_ID ) )
            // InternalTGG.g:6082:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getSupertypesRuleCrossReference_5_1_0()); 
            // InternalTGG.g:6083:3: ( RULE_ID )
            // InternalTGG.g:6084:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getSupertypesRuleIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSupertypesRuleIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getSupertypesRuleCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Rule__SupertypesAssignment_5_1"


    // $ANTLR start "rule__Rule__SupertypesAssignment_5_2_1"
    // InternalTGG.g:6095:1: rule__Rule__SupertypesAssignment_5_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__SupertypesAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6099:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:6100:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:6100:2: ( ( RULE_ID ) )
            // InternalTGG.g:6101:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getSupertypesRuleCrossReference_5_2_1_0()); 
            // InternalTGG.g:6102:3: ( RULE_ID )
            // InternalTGG.g:6103:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getSupertypesRuleIDTerminalRuleCall_5_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getSupertypesRuleIDTerminalRuleCall_5_2_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getSupertypesRuleCrossReference_5_2_1_0()); 

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
    // $ANTLR end "rule__Rule__SupertypesAssignment_5_2_1"


    // $ANTLR start "rule__Rule__KernelAssignment_6_1"
    // InternalTGG.g:6114:1: rule__Rule__KernelAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__KernelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6118:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:6119:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:6119:2: ( ( RULE_ID ) )
            // InternalTGG.g:6120:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getKernelRuleCrossReference_6_1_0()); 
            // InternalTGG.g:6121:3: ( RULE_ID )
            // InternalTGG.g:6122:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getKernelRuleIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getKernelRuleIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getKernelRuleCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Rule__KernelAssignment_6_1"


    // $ANTLR start "rule__Rule__SchemaAssignment_8"
    // InternalTGG.g:6133:1: rule__Rule__SchemaAssignment_8 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Rule__SchemaAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6137:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTGG.g:6138:2: ( ( ruleQualifiedName ) )
            {
            // InternalTGG.g:6138:2: ( ( ruleQualifiedName ) )
            // InternalTGG.g:6139:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRuleAccess().getSchemaSchemaCrossReference_8_0()); 
            // InternalTGG.g:6140:3: ( ruleQualifiedName )
            // InternalTGG.g:6141:4: ruleQualifiedName
            {
             before(grammarAccess.getRuleAccess().getSchemaSchemaQualifiedNameParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getSchemaSchemaQualifiedNameParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getSchemaSchemaCrossReference_8_0()); 

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
    // $ANTLR end "rule__Rule__SchemaAssignment_8"


    // $ANTLR start "rule__Rule__SourcePatternsAssignment_9_2"
    // InternalTGG.g:6152:1: rule__Rule__SourcePatternsAssignment_9_2 : ( ruleObjectVariablePattern ) ;
    public final void rule__Rule__SourcePatternsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6156:1: ( ( ruleObjectVariablePattern ) )
            // InternalTGG.g:6157:2: ( ruleObjectVariablePattern )
            {
            // InternalTGG.g:6157:2: ( ruleObjectVariablePattern )
            // InternalTGG.g:6158:3: ruleObjectVariablePattern
            {
             before(grammarAccess.getRuleAccess().getSourcePatternsObjectVariablePatternParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectVariablePattern();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getSourcePatternsObjectVariablePatternParserRuleCall_9_2_0()); 

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
    // $ANTLR end "rule__Rule__SourcePatternsAssignment_9_2"


    // $ANTLR start "rule__Rule__TargetPatternsAssignment_10_2"
    // InternalTGG.g:6167:1: rule__Rule__TargetPatternsAssignment_10_2 : ( ruleObjectVariablePattern ) ;
    public final void rule__Rule__TargetPatternsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6171:1: ( ( ruleObjectVariablePattern ) )
            // InternalTGG.g:6172:2: ( ruleObjectVariablePattern )
            {
            // InternalTGG.g:6172:2: ( ruleObjectVariablePattern )
            // InternalTGG.g:6173:3: ruleObjectVariablePattern
            {
             before(grammarAccess.getRuleAccess().getTargetPatternsObjectVariablePatternParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectVariablePattern();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getTargetPatternsObjectVariablePatternParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__Rule__TargetPatternsAssignment_10_2"


    // $ANTLR start "rule__Rule__CorrespondencePatternsAssignment_11_2"
    // InternalTGG.g:6182:1: rule__Rule__CorrespondencePatternsAssignment_11_2 : ( ruleCorrVariablePattern ) ;
    public final void rule__Rule__CorrespondencePatternsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6186:1: ( ( ruleCorrVariablePattern ) )
            // InternalTGG.g:6187:2: ( ruleCorrVariablePattern )
            {
            // InternalTGG.g:6187:2: ( ruleCorrVariablePattern )
            // InternalTGG.g:6188:3: ruleCorrVariablePattern
            {
             before(grammarAccess.getRuleAccess().getCorrespondencePatternsCorrVariablePatternParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCorrVariablePattern();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getCorrespondencePatternsCorrVariablePatternParserRuleCall_11_2_0()); 

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
    // $ANTLR end "rule__Rule__CorrespondencePatternsAssignment_11_2"


    // $ANTLR start "rule__Rule__AttrConditionsAssignment_12_2"
    // InternalTGG.g:6197:1: rule__Rule__AttrConditionsAssignment_12_2 : ( ruleAttrCond ) ;
    public final void rule__Rule__AttrConditionsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6201:1: ( ( ruleAttrCond ) )
            // InternalTGG.g:6202:2: ( ruleAttrCond )
            {
            // InternalTGG.g:6202:2: ( ruleAttrCond )
            // InternalTGG.g:6203:3: ruleAttrCond
            {
             before(grammarAccess.getRuleAccess().getAttrConditionsAttrCondParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttrCond();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAttrConditionsAttrCondParserRuleCall_12_2_0()); 

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
    // $ANTLR end "rule__Rule__AttrConditionsAssignment_12_2"


    // $ANTLR start "rule__AttrCond__NameAssignment_0"
    // InternalTGG.g:6212:1: rule__AttrCond__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AttrCond__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6216:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:6217:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:6217:2: ( ( RULE_ID ) )
            // InternalTGG.g:6218:3: ( RULE_ID )
            {
             before(grammarAccess.getAttrCondAccess().getNameAttrCondDefCrossReference_0_0()); 
            // InternalTGG.g:6219:3: ( RULE_ID )
            // InternalTGG.g:6220:4: RULE_ID
            {
             before(grammarAccess.getAttrCondAccess().getNameAttrCondDefIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttrCondAccess().getNameAttrCondDefIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttrCondAccess().getNameAttrCondDefCrossReference_0_0()); 

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
    // $ANTLR end "rule__AttrCond__NameAssignment_0"


    // $ANTLR start "rule__AttrCond__ValuesAssignment_2_0"
    // InternalTGG.g:6231:1: rule__AttrCond__ValuesAssignment_2_0 : ( ruleParamValue ) ;
    public final void rule__AttrCond__ValuesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6235:1: ( ( ruleParamValue ) )
            // InternalTGG.g:6236:2: ( ruleParamValue )
            {
            // InternalTGG.g:6236:2: ( ruleParamValue )
            // InternalTGG.g:6237:3: ruleParamValue
            {
             before(grammarAccess.getAttrCondAccess().getValuesParamValueParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParamValue();

            state._fsp--;

             after(grammarAccess.getAttrCondAccess().getValuesParamValueParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__AttrCond__ValuesAssignment_2_0"


    // $ANTLR start "rule__AttrCond__ValuesAssignment_2_1_1"
    // InternalTGG.g:6246:1: rule__AttrCond__ValuesAssignment_2_1_1 : ( ruleParamValue ) ;
    public final void rule__AttrCond__ValuesAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6250:1: ( ( ruleParamValue ) )
            // InternalTGG.g:6251:2: ( ruleParamValue )
            {
            // InternalTGG.g:6251:2: ( ruleParamValue )
            // InternalTGG.g:6252:3: ruleParamValue
            {
             before(grammarAccess.getAttrCondAccess().getValuesParamValueParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParamValue();

            state._fsp--;

             after(grammarAccess.getAttrCondAccess().getValuesParamValueParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__AttrCond__ValuesAssignment_2_1_1"


    // $ANTLR start "rule__AttrCondDefLibrary__NameAssignment_1"
    // InternalTGG.g:6261:1: rule__AttrCondDefLibrary__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AttrCondDefLibrary__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6265:1: ( ( ruleQualifiedName ) )
            // InternalTGG.g:6266:2: ( ruleQualifiedName )
            {
            // InternalTGG.g:6266:2: ( ruleQualifiedName )
            // InternalTGG.g:6267:3: ruleQualifiedName
            {
             before(grammarAccess.getAttrCondDefLibraryAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttrCondDefLibraryAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__AttrCondDefLibrary__NameAssignment_1"


    // $ANTLR start "rule__AttrCondDefLibrary__AttributeCondDefsAssignment_2_1"
    // InternalTGG.g:6276:1: rule__AttrCondDefLibrary__AttributeCondDefsAssignment_2_1 : ( ruleAttrCondDef ) ;
    public final void rule__AttrCondDefLibrary__AttributeCondDefsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6280:1: ( ( ruleAttrCondDef ) )
            // InternalTGG.g:6281:2: ( ruleAttrCondDef )
            {
            // InternalTGG.g:6281:2: ( ruleAttrCondDef )
            // InternalTGG.g:6282:3: ruleAttrCondDef
            {
             before(grammarAccess.getAttrCondDefLibraryAccess().getAttributeCondDefsAttrCondDefParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttrCondDef();

            state._fsp--;

             after(grammarAccess.getAttrCondDefLibraryAccess().getAttributeCondDefsAttrCondDefParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__AttrCondDefLibrary__AttributeCondDefsAssignment_2_1"


    // $ANTLR start "rule__Adornment__ValueAssignment"
    // InternalTGG.g:6291:1: rule__Adornment__ValueAssignment : ( RULE_ID ) ;
    public final void rule__Adornment__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6295:1: ( ( RULE_ID ) )
            // InternalTGG.g:6296:2: ( RULE_ID )
            {
            // InternalTGG.g:6296:2: ( RULE_ID )
            // InternalTGG.g:6297:3: RULE_ID
            {
             before(grammarAccess.getAdornmentAccess().getValueIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAdornmentAccess().getValueIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Adornment__ValueAssignment"


    // $ANTLR start "rule__AttributeVariable__ObjectVarAssignment_0"
    // InternalTGG.g:6306:1: rule__AttributeVariable__ObjectVarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeVariable__ObjectVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6310:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:6311:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:6311:2: ( ( RULE_ID ) )
            // InternalTGG.g:6312:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeVariableAccess().getObjectVarObjectVariablePatternCrossReference_0_0()); 
            // InternalTGG.g:6313:3: ( RULE_ID )
            // InternalTGG.g:6314:4: RULE_ID
            {
             before(grammarAccess.getAttributeVariableAccess().getObjectVarObjectVariablePatternIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeVariableAccess().getObjectVarObjectVariablePatternIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeVariableAccess().getObjectVarObjectVariablePatternCrossReference_0_0()); 

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
    // $ANTLR end "rule__AttributeVariable__ObjectVarAssignment_0"


    // $ANTLR start "rule__AttributeVariable__AttributeAssignment_2"
    // InternalTGG.g:6325:1: rule__AttributeVariable__AttributeAssignment_2 : ( RULE_ID ) ;
    public final void rule__AttributeVariable__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6329:1: ( ( RULE_ID ) )
            // InternalTGG.g:6330:2: ( RULE_ID )
            {
            // InternalTGG.g:6330:2: ( RULE_ID )
            // InternalTGG.g:6331:3: RULE_ID
            {
             before(grammarAccess.getAttributeVariableAccess().getAttributeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeVariableAccess().getAttributeIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__AttributeVariable__AttributeAssignment_2"


    // $ANTLR start "rule__LocalVariable__NameAssignment"
    // InternalTGG.g:6340:1: rule__LocalVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__LocalVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6344:1: ( ( RULE_ID ) )
            // InternalTGG.g:6345:2: ( RULE_ID )
            {
            // InternalTGG.g:6345:2: ( RULE_ID )
            // InternalTGG.g:6346:3: RULE_ID
            {
             before(grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__LocalVariable__NameAssignment"


    // $ANTLR start "rule__CorrVariablePattern__OpAssignment_0"
    // InternalTGG.g:6355:1: rule__CorrVariablePattern__OpAssignment_0 : ( ruleOperator ) ;
    public final void rule__CorrVariablePattern__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6359:1: ( ( ruleOperator ) )
            // InternalTGG.g:6360:2: ( ruleOperator )
            {
            // InternalTGG.g:6360:2: ( ruleOperator )
            // InternalTGG.g:6361:3: ruleOperator
            {
             before(grammarAccess.getCorrVariablePatternAccess().getOpOperatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getCorrVariablePatternAccess().getOpOperatorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__CorrVariablePattern__OpAssignment_0"


    // $ANTLR start "rule__CorrVariablePattern__NameAssignment_1"
    // InternalTGG.g:6370:1: rule__CorrVariablePattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CorrVariablePattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6374:1: ( ( RULE_ID ) )
            // InternalTGG.g:6375:2: ( RULE_ID )
            {
            // InternalTGG.g:6375:2: ( RULE_ID )
            // InternalTGG.g:6376:3: RULE_ID
            {
             before(grammarAccess.getCorrVariablePatternAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCorrVariablePatternAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CorrVariablePattern__NameAssignment_1"


    // $ANTLR start "rule__CorrVariablePattern__TypeAssignment_3"
    // InternalTGG.g:6385:1: rule__CorrVariablePattern__TypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CorrVariablePattern__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6389:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTGG.g:6390:2: ( ( ruleQualifiedName ) )
            {
            // InternalTGG.g:6390:2: ( ( ruleQualifiedName ) )
            // InternalTGG.g:6391:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCorrVariablePatternAccess().getTypeCorrTypeCrossReference_3_0()); 
            // InternalTGG.g:6392:3: ( ruleQualifiedName )
            // InternalTGG.g:6393:4: ruleQualifiedName
            {
             before(grammarAccess.getCorrVariablePatternAccess().getTypeCorrTypeQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCorrVariablePatternAccess().getTypeCorrTypeQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCorrVariablePatternAccess().getTypeCorrTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__CorrVariablePattern__TypeAssignment_3"


    // $ANTLR start "rule__CorrVariablePattern__SourceAssignment_6"
    // InternalTGG.g:6404:1: rule__CorrVariablePattern__SourceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__CorrVariablePattern__SourceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6408:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:6409:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:6409:2: ( ( RULE_ID ) )
            // InternalTGG.g:6410:3: ( RULE_ID )
            {
             before(grammarAccess.getCorrVariablePatternAccess().getSourceObjectVariablePatternCrossReference_6_0()); 
            // InternalTGG.g:6411:3: ( RULE_ID )
            // InternalTGG.g:6412:4: RULE_ID
            {
             before(grammarAccess.getCorrVariablePatternAccess().getSourceObjectVariablePatternIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCorrVariablePatternAccess().getSourceObjectVariablePatternIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCorrVariablePatternAccess().getSourceObjectVariablePatternCrossReference_6_0()); 

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
    // $ANTLR end "rule__CorrVariablePattern__SourceAssignment_6"


    // $ANTLR start "rule__CorrVariablePattern__TargetAssignment_8"
    // InternalTGG.g:6423:1: rule__CorrVariablePattern__TargetAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__CorrVariablePattern__TargetAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6427:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:6428:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:6428:2: ( ( RULE_ID ) )
            // InternalTGG.g:6429:3: ( RULE_ID )
            {
             before(grammarAccess.getCorrVariablePatternAccess().getTargetObjectVariablePatternCrossReference_8_0()); 
            // InternalTGG.g:6430:3: ( RULE_ID )
            // InternalTGG.g:6431:4: RULE_ID
            {
             before(grammarAccess.getCorrVariablePatternAccess().getTargetObjectVariablePatternIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCorrVariablePatternAccess().getTargetObjectVariablePatternIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getCorrVariablePatternAccess().getTargetObjectVariablePatternCrossReference_8_0()); 

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
    // $ANTLR end "rule__CorrVariablePattern__TargetAssignment_8"


    // $ANTLR start "rule__ObjectVariablePattern__OpAssignment_0"
    // InternalTGG.g:6442:1: rule__ObjectVariablePattern__OpAssignment_0 : ( ruleOperator ) ;
    public final void rule__ObjectVariablePattern__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6446:1: ( ( ruleOperator ) )
            // InternalTGG.g:6447:2: ( ruleOperator )
            {
            // InternalTGG.g:6447:2: ( ruleOperator )
            // InternalTGG.g:6448:3: ruleOperator
            {
             before(grammarAccess.getObjectVariablePatternAccess().getOpOperatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getObjectVariablePatternAccess().getOpOperatorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__OpAssignment_0"


    // $ANTLR start "rule__ObjectVariablePattern__NameAssignment_1"
    // InternalTGG.g:6457:1: rule__ObjectVariablePattern__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjectVariablePattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6461:1: ( ( RULE_ID ) )
            // InternalTGG.g:6462:2: ( RULE_ID )
            {
            // InternalTGG.g:6462:2: ( RULE_ID )
            // InternalTGG.g:6463:3: RULE_ID
            {
             before(grammarAccess.getObjectVariablePatternAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectVariablePatternAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__NameAssignment_1"


    // $ANTLR start "rule__ObjectVariablePattern__TypeAssignment_3"
    // InternalTGG.g:6472:1: rule__ObjectVariablePattern__TypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ObjectVariablePattern__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6476:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTGG.g:6477:2: ( ( ruleQualifiedName ) )
            {
            // InternalTGG.g:6477:2: ( ( ruleQualifiedName ) )
            // InternalTGG.g:6478:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getObjectVariablePatternAccess().getTypeEClassCrossReference_3_0()); 
            // InternalTGG.g:6479:3: ( ruleQualifiedName )
            // InternalTGG.g:6480:4: ruleQualifiedName
            {
             before(grammarAccess.getObjectVariablePatternAccess().getTypeEClassQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getObjectVariablePatternAccess().getTypeEClassQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getObjectVariablePatternAccess().getTypeEClassCrossReference_3_0()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__TypeAssignment_3"


    // $ANTLR start "rule__ObjectVariablePattern__AttributeAssignmentsAssignment_4_1"
    // InternalTGG.g:6491:1: rule__ObjectVariablePattern__AttributeAssignmentsAssignment_4_1 : ( ruleAttributeAssignment ) ;
    public final void rule__ObjectVariablePattern__AttributeAssignmentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6495:1: ( ( ruleAttributeAssignment ) )
            // InternalTGG.g:6496:2: ( ruleAttributeAssignment )
            {
            // InternalTGG.g:6496:2: ( ruleAttributeAssignment )
            // InternalTGG.g:6497:3: ruleAttributeAssignment
            {
             before(grammarAccess.getObjectVariablePatternAccess().getAttributeAssignmentsAttributeAssignmentParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeAssignment();

            state._fsp--;

             after(grammarAccess.getObjectVariablePatternAccess().getAttributeAssignmentsAttributeAssignmentParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__AttributeAssignmentsAssignment_4_1"


    // $ANTLR start "rule__ObjectVariablePattern__AttributeConstraintsAssignment_4_2"
    // InternalTGG.g:6506:1: rule__ObjectVariablePattern__AttributeConstraintsAssignment_4_2 : ( ruleAttributeConstraint ) ;
    public final void rule__ObjectVariablePattern__AttributeConstraintsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6510:1: ( ( ruleAttributeConstraint ) )
            // InternalTGG.g:6511:2: ( ruleAttributeConstraint )
            {
            // InternalTGG.g:6511:2: ( ruleAttributeConstraint )
            // InternalTGG.g:6512:3: ruleAttributeConstraint
            {
             before(grammarAccess.getObjectVariablePatternAccess().getAttributeConstraintsAttributeConstraintParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeConstraint();

            state._fsp--;

             after(grammarAccess.getObjectVariablePatternAccess().getAttributeConstraintsAttributeConstraintParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__AttributeConstraintsAssignment_4_2"


    // $ANTLR start "rule__ObjectVariablePattern__LinkVariablePatternsAssignment_4_3"
    // InternalTGG.g:6521:1: rule__ObjectVariablePattern__LinkVariablePatternsAssignment_4_3 : ( ruleLinkVariablePattern ) ;
    public final void rule__ObjectVariablePattern__LinkVariablePatternsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6525:1: ( ( ruleLinkVariablePattern ) )
            // InternalTGG.g:6526:2: ( ruleLinkVariablePattern )
            {
            // InternalTGG.g:6526:2: ( ruleLinkVariablePattern )
            // InternalTGG.g:6527:3: ruleLinkVariablePattern
            {
             before(grammarAccess.getObjectVariablePatternAccess().getLinkVariablePatternsLinkVariablePatternParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLinkVariablePattern();

            state._fsp--;

             after(grammarAccess.getObjectVariablePatternAccess().getLinkVariablePatternsLinkVariablePatternParserRuleCall_4_3_0()); 

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
    // $ANTLR end "rule__ObjectVariablePattern__LinkVariablePatternsAssignment_4_3"


    // $ANTLR start "rule__AttributeConstraint__AttributeAssignment_0"
    // InternalTGG.g:6536:1: rule__AttributeConstraint__AttributeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeConstraint__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6540:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:6541:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:6541:2: ( ( RULE_ID ) )
            // InternalTGG.g:6542:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeConstraintAccess().getAttributeEAttributeCrossReference_0_0()); 
            // InternalTGG.g:6543:3: ( RULE_ID )
            // InternalTGG.g:6544:4: RULE_ID
            {
             before(grammarAccess.getAttributeConstraintAccess().getAttributeEAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeConstraintAccess().getAttributeEAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeConstraintAccess().getAttributeEAttributeCrossReference_0_0()); 

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
    // $ANTLR end "rule__AttributeConstraint__AttributeAssignment_0"


    // $ANTLR start "rule__AttributeConstraint__OpAssignment_1"
    // InternalTGG.g:6555:1: rule__AttributeConstraint__OpAssignment_1 : ( ( rule__AttributeConstraint__OpAlternatives_1_0 ) ) ;
    public final void rule__AttributeConstraint__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6559:1: ( ( ( rule__AttributeConstraint__OpAlternatives_1_0 ) ) )
            // InternalTGG.g:6560:2: ( ( rule__AttributeConstraint__OpAlternatives_1_0 ) )
            {
            // InternalTGG.g:6560:2: ( ( rule__AttributeConstraint__OpAlternatives_1_0 ) )
            // InternalTGG.g:6561:3: ( rule__AttributeConstraint__OpAlternatives_1_0 )
            {
             before(grammarAccess.getAttributeConstraintAccess().getOpAlternatives_1_0()); 
            // InternalTGG.g:6562:3: ( rule__AttributeConstraint__OpAlternatives_1_0 )
            // InternalTGG.g:6562:4: rule__AttributeConstraint__OpAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeConstraint__OpAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeConstraintAccess().getOpAlternatives_1_0()); 

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
    // $ANTLR end "rule__AttributeConstraint__OpAssignment_1"


    // $ANTLR start "rule__AttributeConstraint__ValueExpAssignment_2"
    // InternalTGG.g:6570:1: rule__AttributeConstraint__ValueExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__AttributeConstraint__ValueExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6574:1: ( ( ruleExpression ) )
            // InternalTGG.g:6575:2: ( ruleExpression )
            {
            // InternalTGG.g:6575:2: ( ruleExpression )
            // InternalTGG.g:6576:3: ruleExpression
            {
             before(grammarAccess.getAttributeConstraintAccess().getValueExpExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAttributeConstraintAccess().getValueExpExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AttributeConstraint__ValueExpAssignment_2"


    // $ANTLR start "rule__AttributeAssignment__AttributeAssignment_0"
    // InternalTGG.g:6585:1: rule__AttributeAssignment__AttributeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeAssignment__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6589:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:6590:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:6590:2: ( ( RULE_ID ) )
            // InternalTGG.g:6591:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttributeEAttributeCrossReference_0_0()); 
            // InternalTGG.g:6592:3: ( RULE_ID )
            // InternalTGG.g:6593:4: RULE_ID
            {
             before(grammarAccess.getAttributeAssignmentAccess().getAttributeEAttributeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAssignmentAccess().getAttributeEAttributeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeAssignmentAccess().getAttributeEAttributeCrossReference_0_0()); 

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
    // $ANTLR end "rule__AttributeAssignment__AttributeAssignment_0"


    // $ANTLR start "rule__AttributeAssignment__OpAssignment_1"
    // InternalTGG.g:6604:1: rule__AttributeAssignment__OpAssignment_1 : ( ( ':=' ) ) ;
    public final void rule__AttributeAssignment__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6608:1: ( ( ( ':=' ) ) )
            // InternalTGG.g:6609:2: ( ( ':=' ) )
            {
            // InternalTGG.g:6609:2: ( ( ':=' ) )
            // InternalTGG.g:6610:3: ( ':=' )
            {
             before(grammarAccess.getAttributeAssignmentAccess().getOpColonEqualsSignKeyword_1_0()); 
            // InternalTGG.g:6611:3: ( ':=' )
            // InternalTGG.g:6612:4: ':='
            {
             before(grammarAccess.getAttributeAssignmentAccess().getOpColonEqualsSignKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAttributeAssignmentAccess().getOpColonEqualsSignKeyword_1_0()); 

            }

             after(grammarAccess.getAttributeAssignmentAccess().getOpColonEqualsSignKeyword_1_0()); 

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
    // $ANTLR end "rule__AttributeAssignment__OpAssignment_1"


    // $ANTLR start "rule__AttributeAssignment__ValueExpAssignment_2"
    // InternalTGG.g:6623:1: rule__AttributeAssignment__ValueExpAssignment_2 : ( ruleExpression ) ;
    public final void rule__AttributeAssignment__ValueExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6627:1: ( ( ruleExpression ) )
            // InternalTGG.g:6628:2: ( ruleExpression )
            {
            // InternalTGG.g:6628:2: ( ruleExpression )
            // InternalTGG.g:6629:3: ruleExpression
            {
             before(grammarAccess.getAttributeAssignmentAccess().getValueExpExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAttributeAssignmentAccess().getValueExpExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AttributeAssignment__ValueExpAssignment_2"


    // $ANTLR start "rule__EnumExpression__EenumAssignment_1"
    // InternalTGG.g:6638:1: rule__EnumExpression__EenumAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EnumExpression__EenumAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6642:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTGG.g:6643:2: ( ( ruleQualifiedName ) )
            {
            // InternalTGG.g:6643:2: ( ( ruleQualifiedName ) )
            // InternalTGG.g:6644:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEnumExpressionAccess().getEenumEEnumCrossReference_1_0()); 
            // InternalTGG.g:6645:3: ( ruleQualifiedName )
            // InternalTGG.g:6646:4: ruleQualifiedName
            {
             before(grammarAccess.getEnumExpressionAccess().getEenumEEnumQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEnumExpressionAccess().getEenumEEnumQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEnumExpressionAccess().getEenumEEnumCrossReference_1_0()); 

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
    // $ANTLR end "rule__EnumExpression__EenumAssignment_1"


    // $ANTLR start "rule__EnumExpression__LiteralAssignment_3"
    // InternalTGG.g:6657:1: rule__EnumExpression__LiteralAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__EnumExpression__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6661:1: ( ( ( ruleQualifiedName ) ) )
            // InternalTGG.g:6662:2: ( ( ruleQualifiedName ) )
            {
            // InternalTGG.g:6662:2: ( ( ruleQualifiedName ) )
            // InternalTGG.g:6663:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEnumExpressionAccess().getLiteralEEnumLiteralCrossReference_3_0()); 
            // InternalTGG.g:6664:3: ( ruleQualifiedName )
            // InternalTGG.g:6665:4: ruleQualifiedName
            {
             before(grammarAccess.getEnumExpressionAccess().getLiteralEEnumLiteralQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEnumExpressionAccess().getLiteralEEnumLiteralQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getEnumExpressionAccess().getLiteralEEnumLiteralCrossReference_3_0()); 

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
    // $ANTLR end "rule__EnumExpression__LiteralAssignment_3"


    // $ANTLR start "rule__AttributeExpression__ObjectVarAssignment_0"
    // InternalTGG.g:6676:1: rule__AttributeExpression__ObjectVarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeExpression__ObjectVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6680:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:6681:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:6681:2: ( ( RULE_ID ) )
            // InternalTGG.g:6682:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeExpressionAccess().getObjectVarObjectVariablePatternCrossReference_0_0()); 
            // InternalTGG.g:6683:3: ( RULE_ID )
            // InternalTGG.g:6684:4: RULE_ID
            {
             before(grammarAccess.getAttributeExpressionAccess().getObjectVarObjectVariablePatternIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeExpressionAccess().getObjectVarObjectVariablePatternIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeExpressionAccess().getObjectVarObjectVariablePatternCrossReference_0_0()); 

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
    // $ANTLR end "rule__AttributeExpression__ObjectVarAssignment_0"


    // $ANTLR start "rule__AttributeExpression__AttributeAssignment_2"
    // InternalTGG.g:6695:1: rule__AttributeExpression__AttributeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeExpression__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6699:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:6700:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:6700:2: ( ( RULE_ID ) )
            // InternalTGG.g:6701:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeExpressionAccess().getAttributeEAttributeCrossReference_2_0()); 
            // InternalTGG.g:6702:3: ( RULE_ID )
            // InternalTGG.g:6703:4: RULE_ID
            {
             before(grammarAccess.getAttributeExpressionAccess().getAttributeEAttributeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeExpressionAccess().getAttributeEAttributeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttributeExpressionAccess().getAttributeEAttributeCrossReference_2_0()); 

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
    // $ANTLR end "rule__AttributeExpression__AttributeAssignment_2"


    // $ANTLR start "rule__LiteralExpression__ValueAssignment"
    // InternalTGG.g:6714:1: rule__LiteralExpression__ValueAssignment : ( ruleLiteralValue ) ;
    public final void rule__LiteralExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6718:1: ( ( ruleLiteralValue ) )
            // InternalTGG.g:6719:2: ( ruleLiteralValue )
            {
            // InternalTGG.g:6719:2: ( ruleLiteralValue )
            // InternalTGG.g:6720:3: ruleLiteralValue
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueLiteralValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteralValue();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionAccess().getValueLiteralValueParserRuleCall_0()); 

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
    // $ANTLR end "rule__LiteralExpression__ValueAssignment"


    // $ANTLR start "rule__LinkVariablePattern__OpAssignment_0"
    // InternalTGG.g:6729:1: rule__LinkVariablePattern__OpAssignment_0 : ( ruleOperator ) ;
    public final void rule__LinkVariablePattern__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6733:1: ( ( ruleOperator ) )
            // InternalTGG.g:6734:2: ( ruleOperator )
            {
            // InternalTGG.g:6734:2: ( ruleOperator )
            // InternalTGG.g:6735:3: ruleOperator
            {
             before(grammarAccess.getLinkVariablePatternAccess().getOpOperatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getLinkVariablePatternAccess().getOpOperatorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LinkVariablePattern__OpAssignment_0"


    // $ANTLR start "rule__LinkVariablePattern__TypeAssignment_2"
    // InternalTGG.g:6744:1: rule__LinkVariablePattern__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__LinkVariablePattern__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6748:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:6749:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:6749:2: ( ( RULE_ID ) )
            // InternalTGG.g:6750:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkVariablePatternAccess().getTypeEReferenceCrossReference_2_0()); 
            // InternalTGG.g:6751:3: ( RULE_ID )
            // InternalTGG.g:6752:4: RULE_ID
            {
             before(grammarAccess.getLinkVariablePatternAccess().getTypeEReferenceIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkVariablePatternAccess().getTypeEReferenceIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLinkVariablePatternAccess().getTypeEReferenceCrossReference_2_0()); 

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
    // $ANTLR end "rule__LinkVariablePattern__TypeAssignment_2"


    // $ANTLR start "rule__LinkVariablePattern__TargetAssignment_4"
    // InternalTGG.g:6763:1: rule__LinkVariablePattern__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__LinkVariablePattern__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6767:1: ( ( ( RULE_ID ) ) )
            // InternalTGG.g:6768:2: ( ( RULE_ID ) )
            {
            // InternalTGG.g:6768:2: ( ( RULE_ID ) )
            // InternalTGG.g:6769:3: ( RULE_ID )
            {
             before(grammarAccess.getLinkVariablePatternAccess().getTargetObjectVariablePatternCrossReference_4_0()); 
            // InternalTGG.g:6770:3: ( RULE_ID )
            // InternalTGG.g:6771:4: RULE_ID
            {
             before(grammarAccess.getLinkVariablePatternAccess().getTargetObjectVariablePatternIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLinkVariablePatternAccess().getTargetObjectVariablePatternIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getLinkVariablePatternAccess().getTargetObjectVariablePatternCrossReference_4_0()); 

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
    // $ANTLR end "rule__LinkVariablePattern__TargetAssignment_4"


    // $ANTLR start "rule__Operator__ValueAssignment"
    // InternalTGG.g:6782:1: rule__Operator__ValueAssignment : ( ( rule__Operator__ValueAlternatives_0 ) ) ;
    public final void rule__Operator__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6786:1: ( ( ( rule__Operator__ValueAlternatives_0 ) ) )
            // InternalTGG.g:6787:2: ( ( rule__Operator__ValueAlternatives_0 ) )
            {
            // InternalTGG.g:6787:2: ( ( rule__Operator__ValueAlternatives_0 ) )
            // InternalTGG.g:6788:3: ( rule__Operator__ValueAlternatives_0 )
            {
             before(grammarAccess.getOperatorAccess().getValueAlternatives_0()); 
            // InternalTGG.g:6789:3: ( rule__Operator__ValueAlternatives_0 )
            // InternalTGG.g:6789:4: rule__Operator__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Operator__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getValueAlternatives_0()); 

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
    // $ANTLR end "rule__Operator__ValueAssignment"


    // $ANTLR start "rule__Import__NameAssignment_1"
    // InternalTGG.g:6797:1: rule__Import__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6801:1: ( ( RULE_STRING ) )
            // InternalTGG.g:6802:2: ( RULE_STRING )
            {
            // InternalTGG.g:6802:2: ( RULE_STRING )
            // InternalTGG.g:6803:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__NameAssignment_1"


    // $ANTLR start "rule__Using__ImportedNamespaceAssignment_1"
    // InternalTGG.g:6812:1: rule__Using__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Using__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTGG.g:6816:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalTGG.g:6817:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalTGG.g:6817:2: ( ruleQualifiedNameWithWildcard )
            // InternalTGG.g:6818:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getUsingAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getUsingAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Using__ImportedNamespaceAssignment_1"

    // Delegated rules


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\6\uffff\1\11\3\uffff\1\11\1\uffff";
    static final String dfa_3s = "\4\6\1\45\1\6\1\30\2\6\1\uffff\1\30\1\uffff";
    static final String dfa_4s = "\1\25\3\6\1\45\1\6\1\46\1\6\1\55\1\uffff\1\46\1\uffff";
    static final String dfa_5s = "\11\uffff\1\2\1\uffff\1\1";
    static final String dfa_6s = "\14\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\14\uffff\1\1\1\2\1\3",
            "\1\4",
            "\1\4",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\10\15\uffff\1\7",
            "\1\12",
            "\1\11\14\uffff\3\11\3\uffff\1\11\4\uffff\1\13\16\uffff\1\11",
            "",
            "\1\10\15\uffff\1\7",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "963:1: rule__NamePattern__Alternatives : ( ( ruleCorrVariablePattern ) | ( ruleObjectVariablePattern ) );";
        }
    }
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\1\4\11\uffff";
    static final String dfa_10s = "\1\26\1\4\1\6\2\uffff\1\26\1\46\1\6\1\26\1\46";
    static final String dfa_11s = "\1\63\1\4\1\6\2\uffff\1\63\1\61\1\6\1\63\1\61";
    static final String dfa_12s = "\3\uffff\1\1\1\2\5\uffff";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\3\20\uffff\1\4\2\uffff\1\4\4\uffff\1\1\1\2\2\uffff\1\4",
            "\1\5",
            "\1\6",
            "",
            "",
            "\1\3\20\uffff\1\4\7\uffff\1\1\1\2\2\uffff\1\4",
            "\1\7\12\uffff\1\10",
            "\1\11",
            "\1\3\20\uffff\1\4\10\uffff\1\2\2\uffff\1\4",
            "\1\7\12\uffff\1\10"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1003:2: ( rule__TripleGraphGrammarFile__SchemaAssignment_0 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0009848000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0009808000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000001C800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0004000002000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0004000000000042L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001802000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0009808000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000030020000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002380040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000380042L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00002802000001F0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00002800000001F0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000380040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200002380040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000380002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000380000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000000080L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000100L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0002000000000000L});

}