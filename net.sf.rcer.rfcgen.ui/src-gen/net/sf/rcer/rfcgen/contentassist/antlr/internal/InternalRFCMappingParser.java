package net.sf.rcer.rfcgen.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import net.sf.rcer.rfcgen.services.RFCMappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalRFCMappingParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BigDecimal'", "'BigInteger'", "'Boolean'", "'Byte'", "'ByteArray'", "'Char'", "'CharArray'", "'Date'", "'Double'", "'Float'", "'Integer'", "'Long'", "'Short'", "'String'", "'Time'", "'package'", "'structure'", "'{'", "'}'", "'class'", "';'", "'field'", "'='", "'comment'", "'function'", "'module'", "'request'", "'response'", "'importing'", "'exporting'", "'changing'", "'table'", "'inactive'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalRFCMappingParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g"; }


     
     	private RFCMappingGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RFCMappingGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleModel
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:60:16: ( ruleModel EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:61:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel60);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel67); 

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:68:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:72:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:73:1: ( ( rule__Model__Group__0 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:73:1: ( ( rule__Model__Group__0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:74:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:75:1: ( rule__Model__Group__0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:75:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleStructure
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:87:1: entryRuleStructure : ruleStructure EOF ;
    public final void entryRuleStructure() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:87:20: ( ruleStructure EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:88:1: ruleStructure EOF
            {
             before(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure120);
            ruleStructure();
            _fsp--;

             after(grammarAccess.getStructureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure127); 

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
    // $ANTLR end entryRuleStructure


    // $ANTLR start ruleStructure
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:95:1: ruleStructure : ( ( rule__Structure__Group__0 ) ) ;
    public final void ruleStructure() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:99:2: ( ( ( rule__Structure__Group__0 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:100:1: ( ( rule__Structure__Group__0 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:100:1: ( ( rule__Structure__Group__0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:101:1: ( rule__Structure__Group__0 )
            {
             before(grammarAccess.getStructureAccess().getGroup()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:102:1: ( rule__Structure__Group__0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:102:2: rule__Structure__Group__0
            {
            pushFollow(FOLLOW_rule__Structure__Group__0_in_ruleStructure154);
            rule__Structure__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStructureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStructure


    // $ANTLR start entryRuleStructureMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:114:1: entryRuleStructureMapping : ruleStructureMapping EOF ;
    public final void entryRuleStructureMapping() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:114:27: ( ruleStructureMapping EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:115:1: ruleStructureMapping EOF
            {
             before(grammarAccess.getStructureMappingRule()); 
            pushFollow(FOLLOW_ruleStructureMapping_in_entryRuleStructureMapping180);
            ruleStructureMapping();
            _fsp--;

             after(grammarAccess.getStructureMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureMapping187); 

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
    // $ANTLR end entryRuleStructureMapping


    // $ANTLR start ruleStructureMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:122:1: ruleStructureMapping : ( ruleStructurePOJOMapping ) ;
    public final void ruleStructureMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:126:2: ( ( ruleStructurePOJOMapping ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:127:1: ( ruleStructurePOJOMapping )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:127:1: ( ruleStructurePOJOMapping )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:128:1: ruleStructurePOJOMapping
            {
             before(grammarAccess.getStructureMappingAccess().getStructurePOJOMappingParserRuleCall()); 
            pushFollow(FOLLOW_ruleStructurePOJOMapping_in_ruleStructureMapping214);
            ruleStructurePOJOMapping();
            _fsp--;

             after(grammarAccess.getStructureMappingAccess().getStructurePOJOMappingParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStructureMapping


    // $ANTLR start entryRuleStructurePOJOMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:141:1: entryRuleStructurePOJOMapping : ruleStructurePOJOMapping EOF ;
    public final void entryRuleStructurePOJOMapping() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:141:31: ( ruleStructurePOJOMapping EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:142:1: ruleStructurePOJOMapping EOF
            {
             before(grammarAccess.getStructurePOJOMappingRule()); 
            pushFollow(FOLLOW_ruleStructurePOJOMapping_in_entryRuleStructurePOJOMapping239);
            ruleStructurePOJOMapping();
            _fsp--;

             after(grammarAccess.getStructurePOJOMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructurePOJOMapping246); 

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
    // $ANTLR end entryRuleStructurePOJOMapping


    // $ANTLR start ruleStructurePOJOMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:149:1: ruleStructurePOJOMapping : ( ( rule__StructurePOJOMapping__Group__0 ) ) ;
    public final void ruleStructurePOJOMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:153:2: ( ( ( rule__StructurePOJOMapping__Group__0 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:154:1: ( ( rule__StructurePOJOMapping__Group__0 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:154:1: ( ( rule__StructurePOJOMapping__Group__0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:155:1: ( rule__StructurePOJOMapping__Group__0 )
            {
             before(grammarAccess.getStructurePOJOMappingAccess().getGroup()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:156:1: ( rule__StructurePOJOMapping__Group__0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:156:2: rule__StructurePOJOMapping__Group__0
            {
            pushFollow(FOLLOW_rule__StructurePOJOMapping__Group__0_in_ruleStructurePOJOMapping273);
            rule__StructurePOJOMapping__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStructurePOJOMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStructurePOJOMapping


    // $ANTLR start entryRuleStructureFieldPOJOMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:168:1: entryRuleStructureFieldPOJOMapping : ruleStructureFieldPOJOMapping EOF ;
    public final void entryRuleStructureFieldPOJOMapping() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:168:36: ( ruleStructureFieldPOJOMapping EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:169:1: ruleStructureFieldPOJOMapping EOF
            {
             before(grammarAccess.getStructureFieldPOJOMappingRule()); 
            pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_entryRuleStructureFieldPOJOMapping299);
            ruleStructureFieldPOJOMapping();
            _fsp--;

             after(grammarAccess.getStructureFieldPOJOMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureFieldPOJOMapping306); 

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
    // $ANTLR end entryRuleStructureFieldPOJOMapping


    // $ANTLR start ruleStructureFieldPOJOMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:176:1: ruleStructureFieldPOJOMapping : ( ( rule__StructureFieldPOJOMapping__Group__0 ) ) ;
    public final void ruleStructureFieldPOJOMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:180:2: ( ( ( rule__StructureFieldPOJOMapping__Group__0 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:181:1: ( ( rule__StructureFieldPOJOMapping__Group__0 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:181:1: ( ( rule__StructureFieldPOJOMapping__Group__0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:182:1: ( rule__StructureFieldPOJOMapping__Group__0 )
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getGroup()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:183:1: ( rule__StructureFieldPOJOMapping__Group__0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:183:2: rule__StructureFieldPOJOMapping__Group__0
            {
            pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__Group__0_in_ruleStructureFieldPOJOMapping333);
            rule__StructureFieldPOJOMapping__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStructureFieldPOJOMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStructureFieldPOJOMapping


    // $ANTLR start entryRuleFunctionModule
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:195:1: entryRuleFunctionModule : ruleFunctionModule EOF ;
    public final void entryRuleFunctionModule() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:195:25: ( ruleFunctionModule EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:196:1: ruleFunctionModule EOF
            {
             before(grammarAccess.getFunctionModuleRule()); 
            pushFollow(FOLLOW_ruleFunctionModule_in_entryRuleFunctionModule359);
            ruleFunctionModule();
            _fsp--;

             after(grammarAccess.getFunctionModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModule366); 

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
    // $ANTLR end entryRuleFunctionModule


    // $ANTLR start ruleFunctionModule
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:203:1: ruleFunctionModule : ( ( rule__FunctionModule__Group__0 ) ) ;
    public final void ruleFunctionModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:207:2: ( ( ( rule__FunctionModule__Group__0 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:208:1: ( ( rule__FunctionModule__Group__0 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:208:1: ( ( rule__FunctionModule__Group__0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:209:1: ( rule__FunctionModule__Group__0 )
            {
             before(grammarAccess.getFunctionModuleAccess().getGroup()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:210:1: ( rule__FunctionModule__Group__0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:210:2: rule__FunctionModule__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionModule__Group__0_in_ruleFunctionModule393);
            rule__FunctionModule__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunctionModule


    // $ANTLR start entryRuleFunctionModuleMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:222:1: entryRuleFunctionModuleMapping : ruleFunctionModuleMapping EOF ;
    public final void entryRuleFunctionModuleMapping() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:222:32: ( ruleFunctionModuleMapping EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:223:1: ruleFunctionModuleMapping EOF
            {
             before(grammarAccess.getFunctionModuleMappingRule()); 
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_entryRuleFunctionModuleMapping419);
            ruleFunctionModuleMapping();
            _fsp--;

             after(grammarAccess.getFunctionModuleMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModuleMapping426); 

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
    // $ANTLR end entryRuleFunctionModuleMapping


    // $ANTLR start ruleFunctionModuleMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:230:1: ruleFunctionModuleMapping : ( ruleFunctionModulePOJOMapping ) ;
    public final void ruleFunctionModuleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:234:2: ( ( ruleFunctionModulePOJOMapping ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:235:1: ( ruleFunctionModulePOJOMapping )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:235:1: ( ruleFunctionModulePOJOMapping )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:236:1: ruleFunctionModulePOJOMapping
            {
             before(grammarAccess.getFunctionModuleMappingAccess().getFunctionModulePOJOMappingParserRuleCall()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping453);
            ruleFunctionModulePOJOMapping();
            _fsp--;

             after(grammarAccess.getFunctionModuleMappingAccess().getFunctionModulePOJOMappingParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunctionModuleMapping


    // $ANTLR start entryRuleFunctionModulePOJOMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:249:1: entryRuleFunctionModulePOJOMapping : ruleFunctionModulePOJOMapping EOF ;
    public final void entryRuleFunctionModulePOJOMapping() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:249:36: ( ruleFunctionModulePOJOMapping EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:250:1: ruleFunctionModulePOJOMapping EOF
            {
             before(grammarAccess.getFunctionModulePOJOMappingRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_entryRuleFunctionModulePOJOMapping478);
            ruleFunctionModulePOJOMapping();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJOMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOMapping485); 

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
    // $ANTLR end entryRuleFunctionModulePOJOMapping


    // $ANTLR start ruleFunctionModulePOJOMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:257:1: ruleFunctionModulePOJOMapping : ( ( rule__FunctionModulePOJOMapping__Alternatives ) ) ;
    public final void ruleFunctionModulePOJOMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:261:2: ( ( ( rule__FunctionModulePOJOMapping__Alternatives ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:262:1: ( ( rule__FunctionModulePOJOMapping__Alternatives ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:262:1: ( ( rule__FunctionModulePOJOMapping__Alternatives ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:263:1: ( rule__FunctionModulePOJOMapping__Alternatives )
            {
             before(grammarAccess.getFunctionModulePOJOMappingAccess().getAlternatives()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:264:1: ( rule__FunctionModulePOJOMapping__Alternatives )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:264:2: rule__FunctionModulePOJOMapping__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOMapping__Alternatives_in_ruleFunctionModulePOJOMapping512);
            rule__FunctionModulePOJOMapping__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOMappingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunctionModulePOJOMapping


    // $ANTLR start entryRuleFunctionModulePOJOCallMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:276:1: entryRuleFunctionModulePOJOCallMapping : ruleFunctionModulePOJOCallMapping EOF ;
    public final void entryRuleFunctionModulePOJOCallMapping() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:276:40: ( ruleFunctionModulePOJOCallMapping EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:277:1: ruleFunctionModulePOJOCallMapping EOF
            {
             before(grammarAccess.getFunctionModulePOJOCallMappingRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_entryRuleFunctionModulePOJOCallMapping538);
            ruleFunctionModulePOJOCallMapping();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJOCallMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOCallMapping545); 

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
    // $ANTLR end entryRuleFunctionModulePOJOCallMapping


    // $ANTLR start ruleFunctionModulePOJOCallMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:284:1: ruleFunctionModulePOJOCallMapping : ( ( rule__FunctionModulePOJOCallMapping__Group__0 ) ) ;
    public final void ruleFunctionModulePOJOCallMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:288:2: ( ( ( rule__FunctionModulePOJOCallMapping__Group__0 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:289:1: ( ( rule__FunctionModulePOJOCallMapping__Group__0 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:289:1: ( ( rule__FunctionModulePOJOCallMapping__Group__0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:290:1: ( rule__FunctionModulePOJOCallMapping__Group__0 )
            {
             before(grammarAccess.getFunctionModulePOJOCallMappingAccess().getGroup()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:291:1: ( rule__FunctionModulePOJOCallMapping__Group__0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:291:2: rule__FunctionModulePOJOCallMapping__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOCallMapping__Group__0_in_ruleFunctionModulePOJOCallMapping572);
            rule__FunctionModulePOJOCallMapping__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOCallMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunctionModulePOJOCallMapping


    // $ANTLR start entryRuleFunctionModulePOJORequestResponseMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:303:1: entryRuleFunctionModulePOJORequestResponseMapping : ruleFunctionModulePOJORequestResponseMapping EOF ;
    public final void entryRuleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:303:51: ( ruleFunctionModulePOJORequestResponseMapping EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:304:1: ruleFunctionModulePOJORequestResponseMapping EOF
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_entryRuleFunctionModulePOJORequestResponseMapping598);
            ruleFunctionModulePOJORequestResponseMapping();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJORequestResponseMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJORequestResponseMapping605); 

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
    // $ANTLR end entryRuleFunctionModulePOJORequestResponseMapping


    // $ANTLR start ruleFunctionModulePOJORequestResponseMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:311:1: ruleFunctionModulePOJORequestResponseMapping : ( ( rule__FunctionModulePOJORequestResponseMapping__Group__0 ) ) ;
    public final void ruleFunctionModulePOJORequestResponseMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:315:2: ( ( ( rule__FunctionModulePOJORequestResponseMapping__Group__0 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:316:1: ( ( rule__FunctionModulePOJORequestResponseMapping__Group__0 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:316:1: ( ( rule__FunctionModulePOJORequestResponseMapping__Group__0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:317:1: ( rule__FunctionModulePOJORequestResponseMapping__Group__0 )
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getGroup()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:318:1: ( rule__FunctionModulePOJORequestResponseMapping__Group__0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:318:2: rule__FunctionModulePOJORequestResponseMapping__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__0_in_ruleFunctionModulePOJORequestResponseMapping632);
            rule__FunctionModulePOJORequestResponseMapping__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunctionModulePOJORequestResponseMapping


    // $ANTLR start entryRuleFunctionModulePOJOParameterMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:330:1: entryRuleFunctionModulePOJOParameterMapping : ruleFunctionModulePOJOParameterMapping EOF ;
    public final void entryRuleFunctionModulePOJOParameterMapping() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:330:45: ( ruleFunctionModulePOJOParameterMapping EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:331:1: ruleFunctionModulePOJOParameterMapping EOF
            {
             before(grammarAccess.getFunctionModulePOJOParameterMappingRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_entryRuleFunctionModulePOJOParameterMapping658);
            ruleFunctionModulePOJOParameterMapping();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJOParameterMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOParameterMapping665); 

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
    // $ANTLR end entryRuleFunctionModulePOJOParameterMapping


    // $ANTLR start ruleFunctionModulePOJOParameterMapping
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:338:1: ruleFunctionModulePOJOParameterMapping : ( ( rule__FunctionModulePOJOParameterMapping__Alternatives ) ) ;
    public final void ruleFunctionModulePOJOParameterMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:342:2: ( ( ( rule__FunctionModulePOJOParameterMapping__Alternatives ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:343:1: ( ( rule__FunctionModulePOJOParameterMapping__Alternatives ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:343:1: ( ( rule__FunctionModulePOJOParameterMapping__Alternatives ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:344:1: ( rule__FunctionModulePOJOParameterMapping__Alternatives )
            {
             before(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getAlternatives()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:345:1: ( rule__FunctionModulePOJOParameterMapping__Alternatives )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:345:2: rule__FunctionModulePOJOParameterMapping__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOParameterMapping__Alternatives_in_ruleFunctionModulePOJOParameterMapping692);
            rule__FunctionModulePOJOParameterMapping__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunctionModulePOJOParameterMapping


    // $ANTLR start entryRuleFunctionModulePOJOImportingParameter
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:357:1: entryRuleFunctionModulePOJOImportingParameter : ruleFunctionModulePOJOImportingParameter EOF ;
    public final void entryRuleFunctionModulePOJOImportingParameter() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:357:47: ( ruleFunctionModulePOJOImportingParameter EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:358:1: ruleFunctionModulePOJOImportingParameter EOF
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_entryRuleFunctionModulePOJOImportingParameter718);
            ruleFunctionModulePOJOImportingParameter();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJOImportingParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOImportingParameter725); 

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
    // $ANTLR end entryRuleFunctionModulePOJOImportingParameter


    // $ANTLR start ruleFunctionModulePOJOImportingParameter
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:365:1: ruleFunctionModulePOJOImportingParameter : ( ( rule__FunctionModulePOJOImportingParameter__Group__0 ) ) ;
    public final void ruleFunctionModulePOJOImportingParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:369:2: ( ( ( rule__FunctionModulePOJOImportingParameter__Group__0 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:370:1: ( ( rule__FunctionModulePOJOImportingParameter__Group__0 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:370:1: ( ( rule__FunctionModulePOJOImportingParameter__Group__0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:371:1: ( rule__FunctionModulePOJOImportingParameter__Group__0 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:372:1: ( rule__FunctionModulePOJOImportingParameter__Group__0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:372:2: rule__FunctionModulePOJOImportingParameter__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group__0_in_ruleFunctionModulePOJOImportingParameter752);
            rule__FunctionModulePOJOImportingParameter__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunctionModulePOJOImportingParameter


    // $ANTLR start entryRuleFunctionModulePOJOExportingParameter
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:384:1: entryRuleFunctionModulePOJOExportingParameter : ruleFunctionModulePOJOExportingParameter EOF ;
    public final void entryRuleFunctionModulePOJOExportingParameter() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:384:47: ( ruleFunctionModulePOJOExportingParameter EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:385:1: ruleFunctionModulePOJOExportingParameter EOF
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_entryRuleFunctionModulePOJOExportingParameter778);
            ruleFunctionModulePOJOExportingParameter();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJOExportingParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOExportingParameter785); 

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
    // $ANTLR end entryRuleFunctionModulePOJOExportingParameter


    // $ANTLR start ruleFunctionModulePOJOExportingParameter
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:392:1: ruleFunctionModulePOJOExportingParameter : ( ( rule__FunctionModulePOJOExportingParameter__Group__0 ) ) ;
    public final void ruleFunctionModulePOJOExportingParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:396:2: ( ( ( rule__FunctionModulePOJOExportingParameter__Group__0 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:397:1: ( ( rule__FunctionModulePOJOExportingParameter__Group__0 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:397:1: ( ( rule__FunctionModulePOJOExportingParameter__Group__0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:398:1: ( rule__FunctionModulePOJOExportingParameter__Group__0 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:399:1: ( rule__FunctionModulePOJOExportingParameter__Group__0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:399:2: rule__FunctionModulePOJOExportingParameter__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group__0_in_ruleFunctionModulePOJOExportingParameter812);
            rule__FunctionModulePOJOExportingParameter__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunctionModulePOJOExportingParameter


    // $ANTLR start entryRuleFunctionModulePOJOChangingParameter
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:411:1: entryRuleFunctionModulePOJOChangingParameter : ruleFunctionModulePOJOChangingParameter EOF ;
    public final void entryRuleFunctionModulePOJOChangingParameter() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:411:46: ( ruleFunctionModulePOJOChangingParameter EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:412:1: ruleFunctionModulePOJOChangingParameter EOF
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_entryRuleFunctionModulePOJOChangingParameter838);
            ruleFunctionModulePOJOChangingParameter();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJOChangingParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOChangingParameter845); 

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
    // $ANTLR end entryRuleFunctionModulePOJOChangingParameter


    // $ANTLR start ruleFunctionModulePOJOChangingParameter
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:419:1: ruleFunctionModulePOJOChangingParameter : ( ( rule__FunctionModulePOJOChangingParameter__Group__0 ) ) ;
    public final void ruleFunctionModulePOJOChangingParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:423:2: ( ( ( rule__FunctionModulePOJOChangingParameter__Group__0 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:424:1: ( ( rule__FunctionModulePOJOChangingParameter__Group__0 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:424:1: ( ( rule__FunctionModulePOJOChangingParameter__Group__0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:425:1: ( rule__FunctionModulePOJOChangingParameter__Group__0 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:426:1: ( rule__FunctionModulePOJOChangingParameter__Group__0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:426:2: rule__FunctionModulePOJOChangingParameter__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group__0_in_ruleFunctionModulePOJOChangingParameter872);
            rule__FunctionModulePOJOChangingParameter__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunctionModulePOJOChangingParameter


    // $ANTLR start entryRuleFunctionModulePOJOTablesParameter
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:438:1: entryRuleFunctionModulePOJOTablesParameter : ruleFunctionModulePOJOTablesParameter EOF ;
    public final void entryRuleFunctionModulePOJOTablesParameter() throws RecognitionException {
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:438:44: ( ruleFunctionModulePOJOTablesParameter EOF )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:439:1: ruleFunctionModulePOJOTablesParameter EOF
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_entryRuleFunctionModulePOJOTablesParameter898);
            ruleFunctionModulePOJOTablesParameter();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJOTablesParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOTablesParameter905); 

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
    // $ANTLR end entryRuleFunctionModulePOJOTablesParameter


    // $ANTLR start ruleFunctionModulePOJOTablesParameter
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:446:1: ruleFunctionModulePOJOTablesParameter : ( ( rule__FunctionModulePOJOTablesParameter__Group__0 ) ) ;
    public final void ruleFunctionModulePOJOTablesParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:450:2: ( ( ( rule__FunctionModulePOJOTablesParameter__Group__0 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:451:1: ( ( rule__FunctionModulePOJOTablesParameter__Group__0 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:451:1: ( ( rule__FunctionModulePOJOTablesParameter__Group__0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:452:1: ( rule__FunctionModulePOJOTablesParameter__Group__0 )
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getGroup()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:453:1: ( rule__FunctionModulePOJOTablesParameter__Group__0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:453:2: rule__FunctionModulePOJOTablesParameter__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__Group__0_in_ruleFunctionModulePOJOTablesParameter932);
            rule__FunctionModulePOJOTablesParameter__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunctionModulePOJOTablesParameter


    // $ANTLR start ruleDataType
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:466:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:470:1: ( ( ( rule__DataType__Alternatives ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:471:1: ( ( rule__DataType__Alternatives ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:471:1: ( ( rule__DataType__Alternatives ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:472:1: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:473:1: ( rule__DataType__Alternatives )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:473:2: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_rule__DataType__Alternatives_in_ruleDataType969);
            rule__DataType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDataType


    // $ANTLR start rule__StructureFieldPOJOMapping__Alternatives_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:484:1: rule__StructureFieldPOJOMapping__Alternatives_3 : ( ( ( rule__StructureFieldPOJOMapping__InactiveAssignment_3_0 ) ) | ( ( rule__StructureFieldPOJOMapping__Group_3_1__0 ) ) );
    public final void rule__StructureFieldPOJOMapping__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:488:1: ( ( ( rule__StructureFieldPOJOMapping__InactiveAssignment_3_0 ) ) | ( ( rule__StructureFieldPOJOMapping__Group_3_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==43) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=11 && LA1_0<=25)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("484:1: rule__StructureFieldPOJOMapping__Alternatives_3 : ( ( ( rule__StructureFieldPOJOMapping__InactiveAssignment_3_0 ) ) | ( ( rule__StructureFieldPOJOMapping__Group_3_1__0 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:489:1: ( ( rule__StructureFieldPOJOMapping__InactiveAssignment_3_0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:489:1: ( ( rule__StructureFieldPOJOMapping__InactiveAssignment_3_0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:490:1: ( rule__StructureFieldPOJOMapping__InactiveAssignment_3_0 )
                    {
                     before(grammarAccess.getStructureFieldPOJOMappingAccess().getInactiveAssignment_3_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:491:1: ( rule__StructureFieldPOJOMapping__InactiveAssignment_3_0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:491:2: rule__StructureFieldPOJOMapping__InactiveAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__InactiveAssignment_3_0_in_rule__StructureFieldPOJOMapping__Alternatives_31004);
                    rule__StructureFieldPOJOMapping__InactiveAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getStructureFieldPOJOMappingAccess().getInactiveAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:495:6: ( ( rule__StructureFieldPOJOMapping__Group_3_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:495:6: ( ( rule__StructureFieldPOJOMapping__Group_3_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:496:1: ( rule__StructureFieldPOJOMapping__Group_3_1__0 )
                    {
                     before(grammarAccess.getStructureFieldPOJOMappingAccess().getGroup_3_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:497:1: ( rule__StructureFieldPOJOMapping__Group_3_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:497:2: rule__StructureFieldPOJOMapping__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__Group_3_1__0_in_rule__StructureFieldPOJOMapping__Alternatives_31022);
                    rule__StructureFieldPOJOMapping__Group_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStructureFieldPOJOMappingAccess().getGroup_3_1()); 

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
    // $ANTLR end rule__StructureFieldPOJOMapping__Alternatives_3


    // $ANTLR start rule__FunctionModulePOJOMapping__Alternatives
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:506:1: rule__FunctionModulePOJOMapping__Alternatives : ( ( ruleFunctionModulePOJOCallMapping ) | ( ruleFunctionModulePOJORequestResponseMapping ) );
    public final void rule__FunctionModulePOJOMapping__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:510:1: ( ( ruleFunctionModulePOJOCallMapping ) | ( ruleFunctionModulePOJORequestResponseMapping ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==37) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("506:1: rule__FunctionModulePOJOMapping__Alternatives : ( ( ruleFunctionModulePOJOCallMapping ) | ( ruleFunctionModulePOJORequestResponseMapping ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:511:1: ( ruleFunctionModulePOJOCallMapping )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:511:1: ( ruleFunctionModulePOJOCallMapping )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:512:1: ruleFunctionModulePOJOCallMapping
                    {
                     before(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJOCallMappingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_rule__FunctionModulePOJOMapping__Alternatives1055);
                    ruleFunctionModulePOJOCallMapping();
                    _fsp--;

                     after(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJOCallMappingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:517:6: ( ruleFunctionModulePOJORequestResponseMapping )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:517:6: ( ruleFunctionModulePOJORequestResponseMapping )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:518:1: ruleFunctionModulePOJORequestResponseMapping
                    {
                     before(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJORequestResponseMappingParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_rule__FunctionModulePOJOMapping__Alternatives1072);
                    ruleFunctionModulePOJORequestResponseMapping();
                    _fsp--;

                     after(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJORequestResponseMappingParserRuleCall_1()); 

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
    // $ANTLR end rule__FunctionModulePOJOMapping__Alternatives


    // $ANTLR start rule__FunctionModulePOJOParameterMapping__Alternatives
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:528:1: rule__FunctionModulePOJOParameterMapping__Alternatives : ( ( ruleFunctionModulePOJOImportingParameter ) | ( ruleFunctionModulePOJOExportingParameter ) | ( ruleFunctionModulePOJOChangingParameter ) | ( ruleFunctionModulePOJOTablesParameter ) );
    public final void rule__FunctionModulePOJOParameterMapping__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:532:1: ( ( ruleFunctionModulePOJOImportingParameter ) | ( ruleFunctionModulePOJOExportingParameter ) | ( ruleFunctionModulePOJOChangingParameter ) | ( ruleFunctionModulePOJOTablesParameter ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt3=1;
                }
                break;
            case 40:
                {
                alt3=2;
                }
                break;
            case 41:
                {
                alt3=3;
                }
                break;
            case 42:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("528:1: rule__FunctionModulePOJOParameterMapping__Alternatives : ( ( ruleFunctionModulePOJOImportingParameter ) | ( ruleFunctionModulePOJOExportingParameter ) | ( ruleFunctionModulePOJOChangingParameter ) | ( ruleFunctionModulePOJOTablesParameter ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:533:1: ( ruleFunctionModulePOJOImportingParameter )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:533:1: ( ruleFunctionModulePOJOImportingParameter )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:534:1: ruleFunctionModulePOJOImportingParameter
                    {
                     before(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOImportingParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_rule__FunctionModulePOJOParameterMapping__Alternatives1104);
                    ruleFunctionModulePOJOImportingParameter();
                    _fsp--;

                     after(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOImportingParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:539:6: ( ruleFunctionModulePOJOExportingParameter )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:539:6: ( ruleFunctionModulePOJOExportingParameter )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:540:1: ruleFunctionModulePOJOExportingParameter
                    {
                     before(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOExportingParameterParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_rule__FunctionModulePOJOParameterMapping__Alternatives1121);
                    ruleFunctionModulePOJOExportingParameter();
                    _fsp--;

                     after(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOExportingParameterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:545:6: ( ruleFunctionModulePOJOChangingParameter )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:545:6: ( ruleFunctionModulePOJOChangingParameter )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:546:1: ruleFunctionModulePOJOChangingParameter
                    {
                     before(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOChangingParameterParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_rule__FunctionModulePOJOParameterMapping__Alternatives1138);
                    ruleFunctionModulePOJOChangingParameter();
                    _fsp--;

                     after(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOChangingParameterParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:551:6: ( ruleFunctionModulePOJOTablesParameter )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:551:6: ( ruleFunctionModulePOJOTablesParameter )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:552:1: ruleFunctionModulePOJOTablesParameter
                    {
                     before(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOTablesParameterParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_rule__FunctionModulePOJOParameterMapping__Alternatives1155);
                    ruleFunctionModulePOJOTablesParameter();
                    _fsp--;

                     after(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOTablesParameterParserRuleCall_3()); 

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
    // $ANTLR end rule__FunctionModulePOJOParameterMapping__Alternatives


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Alternatives_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:562:1: rule__FunctionModulePOJOImportingParameter__Alternatives_1 : ( ( ( rule__FunctionModulePOJOImportingParameter__Group_1_0__0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_1__0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_2__0 ) ) );
    public final void rule__FunctionModulePOJOImportingParameter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:566:1: ( ( ( rule__FunctionModulePOJOImportingParameter__Group_1_0__0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_1__0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case 42:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("562:1: rule__FunctionModulePOJOImportingParameter__Alternatives_1 : ( ( ( rule__FunctionModulePOJOImportingParameter__Group_1_0__0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_1__0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_2__0 ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:567:1: ( ( rule__FunctionModulePOJOImportingParameter__Group_1_0__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:567:1: ( ( rule__FunctionModulePOJOImportingParameter__Group_1_0__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:568:1: ( rule__FunctionModulePOJOImportingParameter__Group_1_0__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_1_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:569:1: ( rule__FunctionModulePOJOImportingParameter__Group_1_0__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:569:2: rule__FunctionModulePOJOImportingParameter__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_0__0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_11187);
                    rule__FunctionModulePOJOImportingParameter__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:573:6: ( ( rule__FunctionModulePOJOImportingParameter__Group_1_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:573:6: ( ( rule__FunctionModulePOJOImportingParameter__Group_1_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:574:1: ( rule__FunctionModulePOJOImportingParameter__Group_1_1__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_1_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:575:1: ( rule__FunctionModulePOJOImportingParameter__Group_1_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:575:2: rule__FunctionModulePOJOImportingParameter__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_1__0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_11205);
                    rule__FunctionModulePOJOImportingParameter__Group_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:579:6: ( ( rule__FunctionModulePOJOImportingParameter__Group_1_2__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:579:6: ( ( rule__FunctionModulePOJOImportingParameter__Group_1_2__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:580:1: ( rule__FunctionModulePOJOImportingParameter__Group_1_2__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_1_2()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:581:1: ( rule__FunctionModulePOJOImportingParameter__Group_1_2__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:581:2: rule__FunctionModulePOJOImportingParameter__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_2__0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_11223);
                    rule__FunctionModulePOJOImportingParameter__Group_1_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_1_2()); 

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
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Alternatives_1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:590:1: rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3 : ( ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0 ) ) );
    public final void rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:594:1: ( ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==43) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=11 && LA5_0<=25)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("590:1: rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3 : ( ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:595:1: ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:595:1: ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:596:1: ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveAssignment_1_0_3_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:597:1: ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:597:2: rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_31256);
                    rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveAssignment_1_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:601:6: ( ( rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:601:6: ( ( rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:602:1: ( rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_1_0_3_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:603:1: ( rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:603:2: rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_31274);
                    rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_1_0_3_1()); 

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
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:612:1: rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3 : ( ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0 ) ) );
    public final void rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:616:1: ( ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==43) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("612:1: rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3 : ( ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:617:1: ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:617:1: ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:618:1: ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveAssignment_1_1_3_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:619:1: ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:619:2: rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_31307);
                    rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveAssignment_1_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:623:6: ( ( rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:623:6: ( ( rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:624:1: ( rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_1_1_3_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:625:1: ( rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:625:2: rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_31325);
                    rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_1_1_3_1()); 

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
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:634:1: rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3 : ( ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0 ) ) );
    public final void rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:638:1: ( ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("634:1: rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3 : ( ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0 ) ) | ( ( rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:639:1: ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:639:1: ( ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:640:1: ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveAssignment_1_2_3_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:641:1: ( rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:641:2: rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_31358);
                    rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveAssignment_1_2_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:645:6: ( ( rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:645:6: ( ( rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:646:1: ( rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_1_2_3_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:647:1: ( rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:647:2: rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_31376);
                    rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_1_2_3_1()); 

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
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Alternatives_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:656:1: rule__FunctionModulePOJOExportingParameter__Alternatives_1 : ( ( ( rule__FunctionModulePOJOExportingParameter__Group_1_0__0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_1__0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_2__0 ) ) );
    public final void rule__FunctionModulePOJOExportingParameter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:660:1: ( ( ( rule__FunctionModulePOJOExportingParameter__Group_1_0__0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_1__0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 42:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("656:1: rule__FunctionModulePOJOExportingParameter__Alternatives_1 : ( ( ( rule__FunctionModulePOJOExportingParameter__Group_1_0__0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_1__0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_2__0 ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:661:1: ( ( rule__FunctionModulePOJOExportingParameter__Group_1_0__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:661:1: ( ( rule__FunctionModulePOJOExportingParameter__Group_1_0__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:662:1: ( rule__FunctionModulePOJOExportingParameter__Group_1_0__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_1_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:663:1: ( rule__FunctionModulePOJOExportingParameter__Group_1_0__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:663:2: rule__FunctionModulePOJOExportingParameter__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_0__0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_11409);
                    rule__FunctionModulePOJOExportingParameter__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:667:6: ( ( rule__FunctionModulePOJOExportingParameter__Group_1_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:667:6: ( ( rule__FunctionModulePOJOExportingParameter__Group_1_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:668:1: ( rule__FunctionModulePOJOExportingParameter__Group_1_1__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_1_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:669:1: ( rule__FunctionModulePOJOExportingParameter__Group_1_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:669:2: rule__FunctionModulePOJOExportingParameter__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_1__0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_11427);
                    rule__FunctionModulePOJOExportingParameter__Group_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:673:6: ( ( rule__FunctionModulePOJOExportingParameter__Group_1_2__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:673:6: ( ( rule__FunctionModulePOJOExportingParameter__Group_1_2__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:674:1: ( rule__FunctionModulePOJOExportingParameter__Group_1_2__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_1_2()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:675:1: ( rule__FunctionModulePOJOExportingParameter__Group_1_2__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:675:2: rule__FunctionModulePOJOExportingParameter__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_2__0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_11445);
                    rule__FunctionModulePOJOExportingParameter__Group_1_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_1_2()); 

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
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Alternatives_1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:684:1: rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3 : ( ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0 ) ) );
    public final void rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:688:1: ( ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=11 && LA9_0<=25)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("684:1: rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3 : ( ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0 ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:689:1: ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:689:1: ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:690:1: ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveAssignment_1_0_3_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:691:1: ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:691:2: rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_31478);
                    rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveAssignment_1_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:695:6: ( ( rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:695:6: ( ( rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:696:1: ( rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_1_0_3_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:697:1: ( rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:697:2: rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_31496);
                    rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_1_0_3_1()); 

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
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:706:1: rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3 : ( ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0 ) ) );
    public final void rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:710:1: ( ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("706:1: rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3 : ( ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0 ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:711:1: ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:711:1: ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:712:1: ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveAssignment_1_1_3_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:713:1: ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:713:2: rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_31529);
                    rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveAssignment_1_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:717:6: ( ( rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:717:6: ( ( rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:718:1: ( rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_1_1_3_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:719:1: ( rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:719:2: rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_31547);
                    rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_1_1_3_1()); 

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
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:728:1: rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3 : ( ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0 ) ) );
    public final void rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:732:1: ( ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("728:1: rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3 : ( ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0 ) ) | ( ( rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0 ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:733:1: ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:733:1: ( ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:734:1: ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveAssignment_1_2_3_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:735:1: ( rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:735:2: rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_31580);
                    rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveAssignment_1_2_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:739:6: ( ( rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:739:6: ( ( rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:740:1: ( rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_1_2_3_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:741:1: ( rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:741:2: rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_31598);
                    rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_1_2_3_1()); 

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
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Alternatives_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:750:1: rule__FunctionModulePOJOChangingParameter__Alternatives_1 : ( ( ( rule__FunctionModulePOJOChangingParameter__Group_1_0__0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_1__0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_2__0 ) ) );
    public final void rule__FunctionModulePOJOChangingParameter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:754:1: ( ( ( rule__FunctionModulePOJOChangingParameter__Group_1_0__0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_1__0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_2__0 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 42:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("750:1: rule__FunctionModulePOJOChangingParameter__Alternatives_1 : ( ( ( rule__FunctionModulePOJOChangingParameter__Group_1_0__0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_1__0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_2__0 ) ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:755:1: ( ( rule__FunctionModulePOJOChangingParameter__Group_1_0__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:755:1: ( ( rule__FunctionModulePOJOChangingParameter__Group_1_0__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:756:1: ( rule__FunctionModulePOJOChangingParameter__Group_1_0__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_1_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:757:1: ( rule__FunctionModulePOJOChangingParameter__Group_1_0__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:757:2: rule__FunctionModulePOJOChangingParameter__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_0__0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_11631);
                    rule__FunctionModulePOJOChangingParameter__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:761:6: ( ( rule__FunctionModulePOJOChangingParameter__Group_1_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:761:6: ( ( rule__FunctionModulePOJOChangingParameter__Group_1_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:762:1: ( rule__FunctionModulePOJOChangingParameter__Group_1_1__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_1_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:763:1: ( rule__FunctionModulePOJOChangingParameter__Group_1_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:763:2: rule__FunctionModulePOJOChangingParameter__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_1__0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_11649);
                    rule__FunctionModulePOJOChangingParameter__Group_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:767:6: ( ( rule__FunctionModulePOJOChangingParameter__Group_1_2__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:767:6: ( ( rule__FunctionModulePOJOChangingParameter__Group_1_2__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:768:1: ( rule__FunctionModulePOJOChangingParameter__Group_1_2__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_1_2()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:769:1: ( rule__FunctionModulePOJOChangingParameter__Group_1_2__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:769:2: rule__FunctionModulePOJOChangingParameter__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_2__0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_11667);
                    rule__FunctionModulePOJOChangingParameter__Group_1_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_1_2()); 

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
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Alternatives_1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:778:1: rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3 : ( ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0 ) ) );
    public final void rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:782:1: ( ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=11 && LA13_0<=25)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("778:1: rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3 : ( ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0 ) ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:783:1: ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:783:1: ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:784:1: ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveAssignment_1_0_3_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:785:1: ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:785:2: rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_31700);
                    rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveAssignment_1_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:789:6: ( ( rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:789:6: ( ( rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:790:1: ( rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_1_0_3_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:791:1: ( rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:791:2: rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_31718);
                    rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_1_0_3_1()); 

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
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:800:1: rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3 : ( ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0 ) ) );
    public final void rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:804:1: ( ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("800:1: rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3 : ( ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0 ) ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:805:1: ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:805:1: ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:806:1: ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveAssignment_1_1_3_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:807:1: ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:807:2: rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_31751);
                    rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveAssignment_1_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:811:6: ( ( rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:811:6: ( ( rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:812:1: ( rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_1_1_3_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:813:1: ( rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:813:2: rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_31769);
                    rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_1_1_3_1()); 

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
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:822:1: rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3 : ( ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0 ) ) );
    public final void rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:826:1: ( ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("822:1: rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3 : ( ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0 ) ) | ( ( rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0 ) ) );", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:827:1: ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:827:1: ( ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:828:1: ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveAssignment_1_2_3_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:829:1: ( rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:829:2: rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_31802);
                    rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveAssignment_1_2_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:833:6: ( ( rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:833:6: ( ( rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:834:1: ( rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_1_2_3_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:835:1: ( rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:835:2: rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_31820);
                    rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_1_2_3_1()); 

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
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__Alternatives_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:844:1: rule__FunctionModulePOJOTablesParameter__Alternatives_3 : ( ( ( rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0 ) ) | ( ( rule__FunctionModulePOJOTablesParameter__Group_3_1__0 ) ) );
    public final void rule__FunctionModulePOJOTablesParameter__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:848:1: ( ( ( rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0 ) ) | ( ( rule__FunctionModulePOJOTablesParameter__Group_3_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("844:1: rule__FunctionModulePOJOTablesParameter__Alternatives_3 : ( ( ( rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0 ) ) | ( ( rule__FunctionModulePOJOTablesParameter__Group_3_1__0 ) ) );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:849:1: ( ( rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:849:1: ( ( rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:850:1: ( rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getInactiveAssignment_3_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:851:1: ( rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:851:2: rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0_in_rule__FunctionModulePOJOTablesParameter__Alternatives_31853);
                    rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getInactiveAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:855:6: ( ( rule__FunctionModulePOJOTablesParameter__Group_3_1__0 ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:855:6: ( ( rule__FunctionModulePOJOTablesParameter__Group_3_1__0 ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:856:1: ( rule__FunctionModulePOJOTablesParameter__Group_3_1__0 )
                    {
                     before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getGroup_3_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:857:1: ( rule__FunctionModulePOJOTablesParameter__Group_3_1__0 )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:857:2: rule__FunctionModulePOJOTablesParameter__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__Group_3_1__0_in_rule__FunctionModulePOJOTablesParameter__Alternatives_31871);
                    rule__FunctionModulePOJOTablesParameter__Group_3_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getGroup_3_1()); 

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
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__Alternatives_3


    // $ANTLR start rule__DataType__Alternatives
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:866:1: rule__DataType__Alternatives : ( ( ( 'BigDecimal' ) ) | ( ( 'BigInteger' ) ) | ( ( 'Boolean' ) ) | ( ( 'Byte' ) ) | ( ( 'ByteArray' ) ) | ( ( 'Char' ) ) | ( ( 'CharArray' ) ) | ( ( 'Date' ) ) | ( ( 'Double' ) ) | ( ( 'Float' ) ) | ( ( 'Integer' ) ) | ( ( 'Long' ) ) | ( ( 'Short' ) ) | ( ( 'String' ) ) | ( ( 'Time' ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:870:1: ( ( ( 'BigDecimal' ) ) | ( ( 'BigInteger' ) ) | ( ( 'Boolean' ) ) | ( ( 'Byte' ) ) | ( ( 'ByteArray' ) ) | ( ( 'Char' ) ) | ( ( 'CharArray' ) ) | ( ( 'Date' ) ) | ( ( 'Double' ) ) | ( ( 'Float' ) ) | ( ( 'Integer' ) ) | ( ( 'Long' ) ) | ( ( 'Short' ) ) | ( ( 'String' ) ) | ( ( 'Time' ) ) )
            int alt17=15;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt17=1;
                }
                break;
            case 12:
                {
                alt17=2;
                }
                break;
            case 13:
                {
                alt17=3;
                }
                break;
            case 14:
                {
                alt17=4;
                }
                break;
            case 15:
                {
                alt17=5;
                }
                break;
            case 16:
                {
                alt17=6;
                }
                break;
            case 17:
                {
                alt17=7;
                }
                break;
            case 18:
                {
                alt17=8;
                }
                break;
            case 19:
                {
                alt17=9;
                }
                break;
            case 20:
                {
                alt17=10;
                }
                break;
            case 21:
                {
                alt17=11;
                }
                break;
            case 22:
                {
                alt17=12;
                }
                break;
            case 23:
                {
                alt17=13;
                }
                break;
            case 24:
                {
                alt17=14;
                }
                break;
            case 25:
                {
                alt17=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("866:1: rule__DataType__Alternatives : ( ( ( 'BigDecimal' ) ) | ( ( 'BigInteger' ) ) | ( ( 'Boolean' ) ) | ( ( 'Byte' ) ) | ( ( 'ByteArray' ) ) | ( ( 'Char' ) ) | ( ( 'CharArray' ) ) | ( ( 'Date' ) ) | ( ( 'Double' ) ) | ( ( 'Float' ) ) | ( ( 'Integer' ) ) | ( ( 'Long' ) ) | ( ( 'Short' ) ) | ( ( 'String' ) ) | ( ( 'Time' ) ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:871:1: ( ( 'BigDecimal' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:871:1: ( ( 'BigDecimal' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:872:1: ( 'BigDecimal' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_0()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:873:1: ( 'BigDecimal' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:873:3: 'BigDecimal'
                    {
                    match(input,11,FOLLOW_11_in_rule__DataType__Alternatives1905); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:878:6: ( ( 'BigInteger' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:878:6: ( ( 'BigInteger' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:879:1: ( 'BigInteger' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBIG_INTEGEREnumLiteralDeclaration_1()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:880:1: ( 'BigInteger' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:880:3: 'BigInteger'
                    {
                    match(input,12,FOLLOW_12_in_rule__DataType__Alternatives1926); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBIG_INTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:885:6: ( ( 'Boolean' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:885:6: ( ( 'Boolean' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:886:1: ( 'Boolean' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:887:1: ( 'Boolean' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:887:3: 'Boolean'
                    {
                    match(input,13,FOLLOW_13_in_rule__DataType__Alternatives1947); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:892:6: ( ( 'Byte' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:892:6: ( ( 'Byte' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:893:1: ( 'Byte' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_3()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:894:1: ( 'Byte' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:894:3: 'Byte'
                    {
                    match(input,14,FOLLOW_14_in_rule__DataType__Alternatives1968); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:899:6: ( ( 'ByteArray' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:899:6: ( ( 'ByteArray' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:900:1: ( 'ByteArray' )
                    {
                     before(grammarAccess.getDataTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration_4()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:901:1: ( 'ByteArray' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:901:3: 'ByteArray'
                    {
                    match(input,15,FOLLOW_15_in_rule__DataType__Alternatives1989); 

                    }

                     after(grammarAccess.getDataTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:906:6: ( ( 'Char' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:906:6: ( ( 'Char' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:907:1: ( 'Char' )
                    {
                     before(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_5()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:908:1: ( 'Char' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:908:3: 'Char'
                    {
                    match(input,16,FOLLOW_16_in_rule__DataType__Alternatives2010); 

                    }

                     after(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:913:6: ( ( 'CharArray' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:913:6: ( ( 'CharArray' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:914:1: ( 'CharArray' )
                    {
                     before(grammarAccess.getDataTypeAccess().getCHAR_ARRAYEnumLiteralDeclaration_6()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:915:1: ( 'CharArray' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:915:3: 'CharArray'
                    {
                    match(input,17,FOLLOW_17_in_rule__DataType__Alternatives2031); 

                    }

                     after(grammarAccess.getDataTypeAccess().getCHAR_ARRAYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:920:6: ( ( 'Date' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:920:6: ( ( 'Date' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:921:1: ( 'Date' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:922:1: ( 'Date' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:922:3: 'Date'
                    {
                    match(input,18,FOLLOW_18_in_rule__DataType__Alternatives2052); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:927:6: ( ( 'Double' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:927:6: ( ( 'Double' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:928:1: ( 'Double' )
                    {
                     before(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_8()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:929:1: ( 'Double' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:929:3: 'Double'
                    {
                    match(input,19,FOLLOW_19_in_rule__DataType__Alternatives2073); 

                    }

                     after(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:934:6: ( ( 'Float' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:934:6: ( ( 'Float' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:935:1: ( 'Float' )
                    {
                     before(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_9()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:936:1: ( 'Float' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:936:3: 'Float'
                    {
                    match(input,20,FOLLOW_20_in_rule__DataType__Alternatives2094); 

                    }

                     after(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:941:6: ( ( 'Integer' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:941:6: ( ( 'Integer' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:942:1: ( 'Integer' )
                    {
                     before(grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_10()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:943:1: ( 'Integer' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:943:3: 'Integer'
                    {
                    match(input,21,FOLLOW_21_in_rule__DataType__Alternatives2115); 

                    }

                     after(grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:948:6: ( ( 'Long' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:948:6: ( ( 'Long' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:949:1: ( 'Long' )
                    {
                     before(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_11()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:950:1: ( 'Long' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:950:3: 'Long'
                    {
                    match(input,22,FOLLOW_22_in_rule__DataType__Alternatives2136); 

                    }

                     after(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:955:6: ( ( 'Short' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:955:6: ( ( 'Short' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:956:1: ( 'Short' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_12()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:957:1: ( 'Short' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:957:3: 'Short'
                    {
                    match(input,23,FOLLOW_23_in_rule__DataType__Alternatives2157); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:962:6: ( ( 'String' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:962:6: ( ( 'String' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:963:1: ( 'String' )
                    {
                     before(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_13()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:964:1: ( 'String' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:964:3: 'String'
                    {
                    match(input,24,FOLLOW_24_in_rule__DataType__Alternatives2178); 

                    }

                     after(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:969:6: ( ( 'Time' ) )
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:969:6: ( ( 'Time' ) )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:970:1: ( 'Time' )
                    {
                     before(grammarAccess.getDataTypeAccess().getTIMEEnumLiteralDeclaration_14()); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:971:1: ( 'Time' )
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:971:3: 'Time'
                    {
                    match(input,25,FOLLOW_25_in_rule__DataType__Alternatives2199); 

                    }

                     after(grammarAccess.getDataTypeAccess().getTIMEEnumLiteralDeclaration_14()); 

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
    // $ANTLR end rule__DataType__Alternatives


    // $ANTLR start rule__Model__Group__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:983:1: rule__Model__Group__0 : ( 'package' ) rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:987:1: ( ( 'package' ) rule__Model__Group__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:988:1: ( 'package' ) rule__Model__Group__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:988:1: ( 'package' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:989:1: 'package'
            {
             before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Model__Group__02237); 
             after(grammarAccess.getModelAccess().getPackageKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02247);
            rule__Model__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1003:1: rule__Model__Group__1 : ( ( rule__Model__PackageNameAssignment_1 ) ) rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1007:1: ( ( ( rule__Model__PackageNameAssignment_1 ) ) rule__Model__Group__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1008:1: ( ( rule__Model__PackageNameAssignment_1 ) ) rule__Model__Group__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1008:1: ( ( rule__Model__PackageNameAssignment_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1009:1: ( rule__Model__PackageNameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1010:1: ( rule__Model__PackageNameAssignment_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1010:2: rule__Model__PackageNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__12275);
            rule__Model__PackageNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getPackageNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12284);
            rule__Model__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Model__Group__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1021:1: rule__Model__Group__2 : ( ( rule__Model__StructuresAssignment_2 )* ) rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1025:1: ( ( ( rule__Model__StructuresAssignment_2 )* ) rule__Model__Group__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1026:1: ( ( rule__Model__StructuresAssignment_2 )* ) rule__Model__Group__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1026:1: ( ( rule__Model__StructuresAssignment_2 )* )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1027:1: ( rule__Model__StructuresAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getStructuresAssignment_2()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1028:1: ( rule__Model__StructuresAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1028:2: rule__Model__StructuresAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__StructuresAssignment_2_in_rule__Model__Group__22312);
            	    rule__Model__StructuresAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStructuresAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22322);
            rule__Model__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__2


    // $ANTLR start rule__Model__Group__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1039:1: rule__Model__Group__3 : ( ( rule__Model__FunctionModulesAssignment_3 )* ) ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1043:1: ( ( ( rule__Model__FunctionModulesAssignment_3 )* ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1044:1: ( ( rule__Model__FunctionModulesAssignment_3 )* )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1044:1: ( ( rule__Model__FunctionModulesAssignment_3 )* )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1045:1: ( rule__Model__FunctionModulesAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getFunctionModulesAssignment_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1046:1: ( rule__Model__FunctionModulesAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1046:2: rule__Model__FunctionModulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__FunctionModulesAssignment_3_in_rule__Model__Group__32350);
            	    rule__Model__FunctionModulesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFunctionModulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__3


    // $ANTLR start rule__Structure__Group__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1064:1: rule__Structure__Group__0 : ( 'structure' ) rule__Structure__Group__1 ;
    public final void rule__Structure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1068:1: ( ( 'structure' ) rule__Structure__Group__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1069:1: ( 'structure' ) rule__Structure__Group__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1069:1: ( 'structure' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1070:1: 'structure'
            {
             before(grammarAccess.getStructureAccess().getStructureKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Structure__Group__02394); 
             after(grammarAccess.getStructureAccess().getStructureKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__02404);
            rule__Structure__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Structure__Group__0


    // $ANTLR start rule__Structure__Group__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1084:1: rule__Structure__Group__1 : ( ( rule__Structure__NameAssignment_1 ) ) rule__Structure__Group__2 ;
    public final void rule__Structure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1088:1: ( ( ( rule__Structure__NameAssignment_1 ) ) rule__Structure__Group__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1089:1: ( ( rule__Structure__NameAssignment_1 ) ) rule__Structure__Group__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1089:1: ( ( rule__Structure__NameAssignment_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1090:1: ( rule__Structure__NameAssignment_1 )
            {
             before(grammarAccess.getStructureAccess().getNameAssignment_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1091:1: ( rule__Structure__NameAssignment_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1091:2: rule__Structure__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Structure__NameAssignment_1_in_rule__Structure__Group__12432);
            rule__Structure__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStructureAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__12441);
            rule__Structure__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Structure__Group__1


    // $ANTLR start rule__Structure__Group__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1102:1: rule__Structure__Group__2 : ( '{' ) rule__Structure__Group__3 ;
    public final void rule__Structure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1106:1: ( ( '{' ) rule__Structure__Group__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1107:1: ( '{' ) rule__Structure__Group__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1107:1: ( '{' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1108:1: '{'
            {
             before(grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Structure__Group__22470); 
             after(grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__Structure__Group__3_in_rule__Structure__Group__22480);
            rule__Structure__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Structure__Group__2


    // $ANTLR start rule__Structure__Group__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1122:1: rule__Structure__Group__3 : ( ( rule__Structure__MappingAssignment_3 ) ) rule__Structure__Group__4 ;
    public final void rule__Structure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1126:1: ( ( ( rule__Structure__MappingAssignment_3 ) ) rule__Structure__Group__4 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1127:1: ( ( rule__Structure__MappingAssignment_3 ) ) rule__Structure__Group__4
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1127:1: ( ( rule__Structure__MappingAssignment_3 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1128:1: ( rule__Structure__MappingAssignment_3 )
            {
             before(grammarAccess.getStructureAccess().getMappingAssignment_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1129:1: ( rule__Structure__MappingAssignment_3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1129:2: rule__Structure__MappingAssignment_3
            {
            pushFollow(FOLLOW_rule__Structure__MappingAssignment_3_in_rule__Structure__Group__32508);
            rule__Structure__MappingAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getStructureAccess().getMappingAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__Structure__Group__4_in_rule__Structure__Group__32517);
            rule__Structure__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Structure__Group__3


    // $ANTLR start rule__Structure__Group__4
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1140:1: rule__Structure__Group__4 : ( '}' ) ;
    public final void rule__Structure__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1144:1: ( ( '}' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1145:1: ( '}' )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1145:1: ( '}' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1146:1: '}'
            {
             before(grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Structure__Group__42546); 
             after(grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Structure__Group__4


    // $ANTLR start rule__StructurePOJOMapping__Group__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1169:1: rule__StructurePOJOMapping__Group__0 : ( 'class' ) rule__StructurePOJOMapping__Group__1 ;
    public final void rule__StructurePOJOMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1173:1: ( ( 'class' ) rule__StructurePOJOMapping__Group__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1174:1: ( 'class' ) rule__StructurePOJOMapping__Group__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1174:1: ( 'class' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1175:1: 'class'
            {
             before(grammarAccess.getStructurePOJOMappingAccess().getClassKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__StructurePOJOMapping__Group__02592); 
             after(grammarAccess.getStructurePOJOMappingAccess().getClassKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__StructurePOJOMapping__Group__1_in_rule__StructurePOJOMapping__Group__02602);
            rule__StructurePOJOMapping__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructurePOJOMapping__Group__0


    // $ANTLR start rule__StructurePOJOMapping__Group__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1189:1: rule__StructurePOJOMapping__Group__1 : ( ( rule__StructurePOJOMapping__ClassNameAssignment_1 ) ) rule__StructurePOJOMapping__Group__2 ;
    public final void rule__StructurePOJOMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1193:1: ( ( ( rule__StructurePOJOMapping__ClassNameAssignment_1 ) ) rule__StructurePOJOMapping__Group__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1194:1: ( ( rule__StructurePOJOMapping__ClassNameAssignment_1 ) ) rule__StructurePOJOMapping__Group__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1194:1: ( ( rule__StructurePOJOMapping__ClassNameAssignment_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1195:1: ( rule__StructurePOJOMapping__ClassNameAssignment_1 )
            {
             before(grammarAccess.getStructurePOJOMappingAccess().getClassNameAssignment_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1196:1: ( rule__StructurePOJOMapping__ClassNameAssignment_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1196:2: rule__StructurePOJOMapping__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__StructurePOJOMapping__ClassNameAssignment_1_in_rule__StructurePOJOMapping__Group__12630);
            rule__StructurePOJOMapping__ClassNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStructurePOJOMappingAccess().getClassNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StructurePOJOMapping__Group__2_in_rule__StructurePOJOMapping__Group__12639);
            rule__StructurePOJOMapping__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructurePOJOMapping__Group__1


    // $ANTLR start rule__StructurePOJOMapping__Group__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1207:1: rule__StructurePOJOMapping__Group__2 : ( '{' ) rule__StructurePOJOMapping__Group__3 ;
    public final void rule__StructurePOJOMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1211:1: ( ( '{' ) rule__StructurePOJOMapping__Group__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1212:1: ( '{' ) rule__StructurePOJOMapping__Group__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1212:1: ( '{' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1213:1: '{'
            {
             before(grammarAccess.getStructurePOJOMappingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__StructurePOJOMapping__Group__22668); 
             after(grammarAccess.getStructurePOJOMappingAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__StructurePOJOMapping__Group__3_in_rule__StructurePOJOMapping__Group__22678);
            rule__StructurePOJOMapping__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructurePOJOMapping__Group__2


    // $ANTLR start rule__StructurePOJOMapping__Group__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1227:1: rule__StructurePOJOMapping__Group__3 : ( ( rule__StructurePOJOMapping__Group_3__0 )* ) rule__StructurePOJOMapping__Group__4 ;
    public final void rule__StructurePOJOMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1231:1: ( ( ( rule__StructurePOJOMapping__Group_3__0 )* ) rule__StructurePOJOMapping__Group__4 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1232:1: ( ( rule__StructurePOJOMapping__Group_3__0 )* ) rule__StructurePOJOMapping__Group__4
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1232:1: ( ( rule__StructurePOJOMapping__Group_3__0 )* )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1233:1: ( rule__StructurePOJOMapping__Group_3__0 )*
            {
             before(grammarAccess.getStructurePOJOMappingAccess().getGroup_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1234:1: ( rule__StructurePOJOMapping__Group_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1234:2: rule__StructurePOJOMapping__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__StructurePOJOMapping__Group_3__0_in_rule__StructurePOJOMapping__Group__32706);
            	    rule__StructurePOJOMapping__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getStructurePOJOMappingAccess().getGroup_3()); 

            }

            pushFollow(FOLLOW_rule__StructurePOJOMapping__Group__4_in_rule__StructurePOJOMapping__Group__32716);
            rule__StructurePOJOMapping__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructurePOJOMapping__Group__3


    // $ANTLR start rule__StructurePOJOMapping__Group__4
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1245:1: rule__StructurePOJOMapping__Group__4 : ( '}' ) ;
    public final void rule__StructurePOJOMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1249:1: ( ( '}' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1250:1: ( '}' )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1250:1: ( '}' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1251:1: '}'
            {
             before(grammarAccess.getStructurePOJOMappingAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__StructurePOJOMapping__Group__42745); 
             after(grammarAccess.getStructurePOJOMappingAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructurePOJOMapping__Group__4


    // $ANTLR start rule__StructurePOJOMapping__Group_3__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1274:1: rule__StructurePOJOMapping__Group_3__0 : ( ( rule__StructurePOJOMapping__FieldsAssignment_3_0 ) ) rule__StructurePOJOMapping__Group_3__1 ;
    public final void rule__StructurePOJOMapping__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1278:1: ( ( ( rule__StructurePOJOMapping__FieldsAssignment_3_0 ) ) rule__StructurePOJOMapping__Group_3__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1279:1: ( ( rule__StructurePOJOMapping__FieldsAssignment_3_0 ) ) rule__StructurePOJOMapping__Group_3__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1279:1: ( ( rule__StructurePOJOMapping__FieldsAssignment_3_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1280:1: ( rule__StructurePOJOMapping__FieldsAssignment_3_0 )
            {
             before(grammarAccess.getStructurePOJOMappingAccess().getFieldsAssignment_3_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1281:1: ( rule__StructurePOJOMapping__FieldsAssignment_3_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1281:2: rule__StructurePOJOMapping__FieldsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__StructurePOJOMapping__FieldsAssignment_3_0_in_rule__StructurePOJOMapping__Group_3__02790);
            rule__StructurePOJOMapping__FieldsAssignment_3_0();
            _fsp--;


            }

             after(grammarAccess.getStructurePOJOMappingAccess().getFieldsAssignment_3_0()); 

            }

            pushFollow(FOLLOW_rule__StructurePOJOMapping__Group_3__1_in_rule__StructurePOJOMapping__Group_3__02799);
            rule__StructurePOJOMapping__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructurePOJOMapping__Group_3__0


    // $ANTLR start rule__StructurePOJOMapping__Group_3__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1292:1: rule__StructurePOJOMapping__Group_3__1 : ( ';' ) ;
    public final void rule__StructurePOJOMapping__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1296:1: ( ( ';' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1297:1: ( ';' )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1297:1: ( ';' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1298:1: ';'
            {
             before(grammarAccess.getStructurePOJOMappingAccess().getSemicolonKeyword_3_1()); 
            match(input,31,FOLLOW_31_in_rule__StructurePOJOMapping__Group_3__12828); 
             after(grammarAccess.getStructurePOJOMappingAccess().getSemicolonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructurePOJOMapping__Group_3__1


    // $ANTLR start rule__StructureFieldPOJOMapping__Group__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1315:1: rule__StructureFieldPOJOMapping__Group__0 : ( 'field' ) rule__StructureFieldPOJOMapping__Group__1 ;
    public final void rule__StructureFieldPOJOMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1319:1: ( ( 'field' ) rule__StructureFieldPOJOMapping__Group__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1320:1: ( 'field' ) rule__StructureFieldPOJOMapping__Group__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1320:1: ( 'field' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1321:1: 'field'
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getFieldKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__StructureFieldPOJOMapping__Group__02868); 
             after(grammarAccess.getStructureFieldPOJOMappingAccess().getFieldKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__Group__1_in_rule__StructureFieldPOJOMapping__Group__02878);
            rule__StructureFieldPOJOMapping__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__Group__0


    // $ANTLR start rule__StructureFieldPOJOMapping__Group__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1335:1: rule__StructureFieldPOJOMapping__Group__1 : ( ( rule__StructureFieldPOJOMapping__NameAssignment_1 ) ) rule__StructureFieldPOJOMapping__Group__2 ;
    public final void rule__StructureFieldPOJOMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1339:1: ( ( ( rule__StructureFieldPOJOMapping__NameAssignment_1 ) ) rule__StructureFieldPOJOMapping__Group__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1340:1: ( ( rule__StructureFieldPOJOMapping__NameAssignment_1 ) ) rule__StructureFieldPOJOMapping__Group__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1340:1: ( ( rule__StructureFieldPOJOMapping__NameAssignment_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1341:1: ( rule__StructureFieldPOJOMapping__NameAssignment_1 )
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getNameAssignment_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1342:1: ( rule__StructureFieldPOJOMapping__NameAssignment_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1342:2: rule__StructureFieldPOJOMapping__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__NameAssignment_1_in_rule__StructureFieldPOJOMapping__Group__12906);
            rule__StructureFieldPOJOMapping__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStructureFieldPOJOMappingAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__Group__2_in_rule__StructureFieldPOJOMapping__Group__12915);
            rule__StructureFieldPOJOMapping__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__Group__1


    // $ANTLR start rule__StructureFieldPOJOMapping__Group__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1353:1: rule__StructureFieldPOJOMapping__Group__2 : ( '=' ) rule__StructureFieldPOJOMapping__Group__3 ;
    public final void rule__StructureFieldPOJOMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1357:1: ( ( '=' ) rule__StructureFieldPOJOMapping__Group__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1358:1: ( '=' ) rule__StructureFieldPOJOMapping__Group__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1358:1: ( '=' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1359:1: '='
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getEqualsSignKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__StructureFieldPOJOMapping__Group__22944); 
             after(grammarAccess.getStructureFieldPOJOMappingAccess().getEqualsSignKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__Group__3_in_rule__StructureFieldPOJOMapping__Group__22954);
            rule__StructureFieldPOJOMapping__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__Group__2


    // $ANTLR start rule__StructureFieldPOJOMapping__Group__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1373:1: rule__StructureFieldPOJOMapping__Group__3 : ( ( rule__StructureFieldPOJOMapping__Alternatives_3 ) ) rule__StructureFieldPOJOMapping__Group__4 ;
    public final void rule__StructureFieldPOJOMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1377:1: ( ( ( rule__StructureFieldPOJOMapping__Alternatives_3 ) ) rule__StructureFieldPOJOMapping__Group__4 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1378:1: ( ( rule__StructureFieldPOJOMapping__Alternatives_3 ) ) rule__StructureFieldPOJOMapping__Group__4
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1378:1: ( ( rule__StructureFieldPOJOMapping__Alternatives_3 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1379:1: ( rule__StructureFieldPOJOMapping__Alternatives_3 )
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getAlternatives_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1380:1: ( rule__StructureFieldPOJOMapping__Alternatives_3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1380:2: rule__StructureFieldPOJOMapping__Alternatives_3
            {
            pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__Alternatives_3_in_rule__StructureFieldPOJOMapping__Group__32982);
            rule__StructureFieldPOJOMapping__Alternatives_3();
            _fsp--;


            }

             after(grammarAccess.getStructureFieldPOJOMappingAccess().getAlternatives_3()); 

            }

            pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__Group__4_in_rule__StructureFieldPOJOMapping__Group__32991);
            rule__StructureFieldPOJOMapping__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__Group__3


    // $ANTLR start rule__StructureFieldPOJOMapping__Group__4
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1391:1: rule__StructureFieldPOJOMapping__Group__4 : ( ( rule__StructureFieldPOJOMapping__Group_4__0 )? ) ;
    public final void rule__StructureFieldPOJOMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1395:1: ( ( ( rule__StructureFieldPOJOMapping__Group_4__0 )? ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1396:1: ( ( rule__StructureFieldPOJOMapping__Group_4__0 )? )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1396:1: ( ( rule__StructureFieldPOJOMapping__Group_4__0 )? )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1397:1: ( rule__StructureFieldPOJOMapping__Group_4__0 )?
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getGroup_4()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1398:1: ( rule__StructureFieldPOJOMapping__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==34) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1398:2: rule__StructureFieldPOJOMapping__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__Group_4__0_in_rule__StructureFieldPOJOMapping__Group__43019);
                    rule__StructureFieldPOJOMapping__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructureFieldPOJOMappingAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__Group__4


    // $ANTLR start rule__StructureFieldPOJOMapping__Group_3_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1418:1: rule__StructureFieldPOJOMapping__Group_3_1__0 : ( ( rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0 ) ) rule__StructureFieldPOJOMapping__Group_3_1__1 ;
    public final void rule__StructureFieldPOJOMapping__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1422:1: ( ( ( rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0 ) ) rule__StructureFieldPOJOMapping__Group_3_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1423:1: ( ( rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0 ) ) rule__StructureFieldPOJOMapping__Group_3_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1423:1: ( ( rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1424:1: ( rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0 )
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getTypeAssignment_3_1_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1425:1: ( rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1425:2: rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0_in_rule__StructureFieldPOJOMapping__Group_3_1__03064);
            rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getStructureFieldPOJOMappingAccess().getTypeAssignment_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__Group_3_1__1_in_rule__StructureFieldPOJOMapping__Group_3_1__03073);
            rule__StructureFieldPOJOMapping__Group_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__Group_3_1__0


    // $ANTLR start rule__StructureFieldPOJOMapping__Group_3_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1436:1: rule__StructureFieldPOJOMapping__Group_3_1__1 : ( ( rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1 ) ) ;
    public final void rule__StructureFieldPOJOMapping__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1440:1: ( ( ( rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1441:1: ( ( rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1441:1: ( ( rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1442:1: ( rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1 )
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getAttributeAssignment_3_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1443:1: ( rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1443:2: rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1_in_rule__StructureFieldPOJOMapping__Group_3_1__13101);
            rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getStructureFieldPOJOMappingAccess().getAttributeAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__Group_3_1__1


    // $ANTLR start rule__StructureFieldPOJOMapping__Group_4__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1457:1: rule__StructureFieldPOJOMapping__Group_4__0 : ( 'comment' ) rule__StructureFieldPOJOMapping__Group_4__1 ;
    public final void rule__StructureFieldPOJOMapping__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1461:1: ( ( 'comment' ) rule__StructureFieldPOJOMapping__Group_4__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1462:1: ( 'comment' ) rule__StructureFieldPOJOMapping__Group_4__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1462:1: ( 'comment' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1463:1: 'comment'
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getCommentKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__StructureFieldPOJOMapping__Group_4__03140); 
             after(grammarAccess.getStructureFieldPOJOMappingAccess().getCommentKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__Group_4__1_in_rule__StructureFieldPOJOMapping__Group_4__03150);
            rule__StructureFieldPOJOMapping__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__Group_4__0


    // $ANTLR start rule__StructureFieldPOJOMapping__Group_4__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1477:1: rule__StructureFieldPOJOMapping__Group_4__1 : ( ( rule__StructureFieldPOJOMapping__CommentAssignment_4_1 ) ) ;
    public final void rule__StructureFieldPOJOMapping__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1481:1: ( ( ( rule__StructureFieldPOJOMapping__CommentAssignment_4_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1482:1: ( ( rule__StructureFieldPOJOMapping__CommentAssignment_4_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1482:1: ( ( rule__StructureFieldPOJOMapping__CommentAssignment_4_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1483:1: ( rule__StructureFieldPOJOMapping__CommentAssignment_4_1 )
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getCommentAssignment_4_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1484:1: ( rule__StructureFieldPOJOMapping__CommentAssignment_4_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1484:2: rule__StructureFieldPOJOMapping__CommentAssignment_4_1
            {
            pushFollow(FOLLOW_rule__StructureFieldPOJOMapping__CommentAssignment_4_1_in_rule__StructureFieldPOJOMapping__Group_4__13178);
            rule__StructureFieldPOJOMapping__CommentAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getStructureFieldPOJOMappingAccess().getCommentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__Group_4__1


    // $ANTLR start rule__FunctionModule__Group__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1498:1: rule__FunctionModule__Group__0 : ( 'function' ) rule__FunctionModule__Group__1 ;
    public final void rule__FunctionModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1502:1: ( ( 'function' ) rule__FunctionModule__Group__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1503:1: ( 'function' ) rule__FunctionModule__Group__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1503:1: ( 'function' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1504:1: 'function'
            {
             before(grammarAccess.getFunctionModuleAccess().getFunctionKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__FunctionModule__Group__03217); 
             after(grammarAccess.getFunctionModuleAccess().getFunctionKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModule__Group__1_in_rule__FunctionModule__Group__03227);
            rule__FunctionModule__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModule__Group__0


    // $ANTLR start rule__FunctionModule__Group__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1518:1: rule__FunctionModule__Group__1 : ( 'module' ) rule__FunctionModule__Group__2 ;
    public final void rule__FunctionModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1522:1: ( ( 'module' ) rule__FunctionModule__Group__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1523:1: ( 'module' ) rule__FunctionModule__Group__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1523:1: ( 'module' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1524:1: 'module'
            {
             before(grammarAccess.getFunctionModuleAccess().getModuleKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__FunctionModule__Group__13256); 
             after(grammarAccess.getFunctionModuleAccess().getModuleKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModule__Group__2_in_rule__FunctionModule__Group__13266);
            rule__FunctionModule__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModule__Group__1


    // $ANTLR start rule__FunctionModule__Group__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1538:1: rule__FunctionModule__Group__2 : ( ( rule__FunctionModule__NameAssignment_2 ) ) rule__FunctionModule__Group__3 ;
    public final void rule__FunctionModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1542:1: ( ( ( rule__FunctionModule__NameAssignment_2 ) ) rule__FunctionModule__Group__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1543:1: ( ( rule__FunctionModule__NameAssignment_2 ) ) rule__FunctionModule__Group__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1543:1: ( ( rule__FunctionModule__NameAssignment_2 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1544:1: ( rule__FunctionModule__NameAssignment_2 )
            {
             before(grammarAccess.getFunctionModuleAccess().getNameAssignment_2()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1545:1: ( rule__FunctionModule__NameAssignment_2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1545:2: rule__FunctionModule__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__FunctionModule__NameAssignment_2_in_rule__FunctionModule__Group__23294);
            rule__FunctionModule__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFunctionModuleAccess().getNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModule__Group__3_in_rule__FunctionModule__Group__23303);
            rule__FunctionModule__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModule__Group__2


    // $ANTLR start rule__FunctionModule__Group__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1556:1: rule__FunctionModule__Group__3 : ( '{' ) rule__FunctionModule__Group__4 ;
    public final void rule__FunctionModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1560:1: ( ( '{' ) rule__FunctionModule__Group__4 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1561:1: ( '{' ) rule__FunctionModule__Group__4
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1561:1: ( '{' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1562:1: '{'
            {
             before(grammarAccess.getFunctionModuleAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__FunctionModule__Group__33332); 
             after(grammarAccess.getFunctionModuleAccess().getLeftCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__FunctionModule__Group__4_in_rule__FunctionModule__Group__33342);
            rule__FunctionModule__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModule__Group__3


    // $ANTLR start rule__FunctionModule__Group__4
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1576:1: rule__FunctionModule__Group__4 : ( ( rule__FunctionModule__MappingAssignment_4 ) ) rule__FunctionModule__Group__5 ;
    public final void rule__FunctionModule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1580:1: ( ( ( rule__FunctionModule__MappingAssignment_4 ) ) rule__FunctionModule__Group__5 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1581:1: ( ( rule__FunctionModule__MappingAssignment_4 ) ) rule__FunctionModule__Group__5
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1581:1: ( ( rule__FunctionModule__MappingAssignment_4 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1582:1: ( rule__FunctionModule__MappingAssignment_4 )
            {
             before(grammarAccess.getFunctionModuleAccess().getMappingAssignment_4()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1583:1: ( rule__FunctionModule__MappingAssignment_4 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1583:2: rule__FunctionModule__MappingAssignment_4
            {
            pushFollow(FOLLOW_rule__FunctionModule__MappingAssignment_4_in_rule__FunctionModule__Group__43370);
            rule__FunctionModule__MappingAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getFunctionModuleAccess().getMappingAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__FunctionModule__Group__5_in_rule__FunctionModule__Group__43379);
            rule__FunctionModule__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModule__Group__4


    // $ANTLR start rule__FunctionModule__Group__5
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1594:1: rule__FunctionModule__Group__5 : ( '}' ) ;
    public final void rule__FunctionModule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1598:1: ( ( '}' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1599:1: ( '}' )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1599:1: ( '}' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1600:1: '}'
            {
             before(grammarAccess.getFunctionModuleAccess().getRightCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__FunctionModule__Group__53408); 
             after(grammarAccess.getFunctionModuleAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModule__Group__5


    // $ANTLR start rule__FunctionModulePOJOCallMapping__Group__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1625:1: rule__FunctionModulePOJOCallMapping__Group__0 : ( 'class' ) rule__FunctionModulePOJOCallMapping__Group__1 ;
    public final void rule__FunctionModulePOJOCallMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1629:1: ( ( 'class' ) rule__FunctionModulePOJOCallMapping__Group__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1630:1: ( 'class' ) rule__FunctionModulePOJOCallMapping__Group__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1630:1: ( 'class' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1631:1: 'class'
            {
             before(grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__FunctionModulePOJOCallMapping__Group__03456); 
             after(grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOCallMapping__Group__1_in_rule__FunctionModulePOJOCallMapping__Group__03466);
            rule__FunctionModulePOJOCallMapping__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOCallMapping__Group__0


    // $ANTLR start rule__FunctionModulePOJOCallMapping__Group__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1645:1: rule__FunctionModulePOJOCallMapping__Group__1 : ( ( rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1 ) ) rule__FunctionModulePOJOCallMapping__Group__2 ;
    public final void rule__FunctionModulePOJOCallMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1649:1: ( ( ( rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1 ) ) rule__FunctionModulePOJOCallMapping__Group__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1650:1: ( ( rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1 ) ) rule__FunctionModulePOJOCallMapping__Group__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1650:1: ( ( rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1651:1: ( rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1 )
            {
             before(grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassNameAssignment_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1652:1: ( rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1652:2: rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1_in_rule__FunctionModulePOJOCallMapping__Group__13494);
            rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOCallMapping__Group__2_in_rule__FunctionModulePOJOCallMapping__Group__13503);
            rule__FunctionModulePOJOCallMapping__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOCallMapping__Group__1


    // $ANTLR start rule__FunctionModulePOJOCallMapping__Group__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1663:1: rule__FunctionModulePOJOCallMapping__Group__2 : ( '{' ) rule__FunctionModulePOJOCallMapping__Group__3 ;
    public final void rule__FunctionModulePOJOCallMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1667:1: ( ( '{' ) rule__FunctionModulePOJOCallMapping__Group__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1668:1: ( '{' ) rule__FunctionModulePOJOCallMapping__Group__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1668:1: ( '{' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1669:1: '{'
            {
             before(grammarAccess.getFunctionModulePOJOCallMappingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__FunctionModulePOJOCallMapping__Group__23532); 
             after(grammarAccess.getFunctionModulePOJOCallMappingAccess().getLeftCurlyBracketKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOCallMapping__Group__3_in_rule__FunctionModulePOJOCallMapping__Group__23542);
            rule__FunctionModulePOJOCallMapping__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOCallMapping__Group__2


    // $ANTLR start rule__FunctionModulePOJOCallMapping__Group__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1683:1: rule__FunctionModulePOJOCallMapping__Group__3 : ( ( rule__FunctionModulePOJOCallMapping__ParametersAssignment_3 )* ) rule__FunctionModulePOJOCallMapping__Group__4 ;
    public final void rule__FunctionModulePOJOCallMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1687:1: ( ( ( rule__FunctionModulePOJOCallMapping__ParametersAssignment_3 )* ) rule__FunctionModulePOJOCallMapping__Group__4 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1688:1: ( ( rule__FunctionModulePOJOCallMapping__ParametersAssignment_3 )* ) rule__FunctionModulePOJOCallMapping__Group__4
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1688:1: ( ( rule__FunctionModulePOJOCallMapping__ParametersAssignment_3 )* )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1689:1: ( rule__FunctionModulePOJOCallMapping__ParametersAssignment_3 )*
            {
             before(grammarAccess.getFunctionModulePOJOCallMappingAccess().getParametersAssignment_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1690:1: ( rule__FunctionModulePOJOCallMapping__ParametersAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=39 && LA22_0<=42)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1690:2: rule__FunctionModulePOJOCallMapping__ParametersAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__FunctionModulePOJOCallMapping__ParametersAssignment_3_in_rule__FunctionModulePOJOCallMapping__Group__33570);
            	    rule__FunctionModulePOJOCallMapping__ParametersAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getFunctionModulePOJOCallMappingAccess().getParametersAssignment_3()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOCallMapping__Group__4_in_rule__FunctionModulePOJOCallMapping__Group__33580);
            rule__FunctionModulePOJOCallMapping__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOCallMapping__Group__3


    // $ANTLR start rule__FunctionModulePOJOCallMapping__Group__4
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1701:1: rule__FunctionModulePOJOCallMapping__Group__4 : ( '}' ) ;
    public final void rule__FunctionModulePOJOCallMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1705:1: ( ( '}' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1706:1: ( '}' )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1706:1: ( '}' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1707:1: '}'
            {
             before(grammarAccess.getFunctionModulePOJOCallMappingAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__FunctionModulePOJOCallMapping__Group__43609); 
             after(grammarAccess.getFunctionModulePOJOCallMappingAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOCallMapping__Group__4


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__Group__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1730:1: rule__FunctionModulePOJORequestResponseMapping__Group__0 : ( 'request' ) rule__FunctionModulePOJORequestResponseMapping__Group__1 ;
    public final void rule__FunctionModulePOJORequestResponseMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1734:1: ( ( 'request' ) rule__FunctionModulePOJORequestResponseMapping__Group__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1735:1: ( 'request' ) rule__FunctionModulePOJORequestResponseMapping__Group__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1735:1: ( 'request' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1736:1: 'request'
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__FunctionModulePOJORequestResponseMapping__Group__03655); 
             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__1_in_rule__FunctionModulePOJORequestResponseMapping__Group__03665);
            rule__FunctionModulePOJORequestResponseMapping__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__Group__0


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__Group__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1750:1: rule__FunctionModulePOJORequestResponseMapping__Group__1 : ( 'class' ) rule__FunctionModulePOJORequestResponseMapping__Group__2 ;
    public final void rule__FunctionModulePOJORequestResponseMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1754:1: ( ( 'class' ) rule__FunctionModulePOJORequestResponseMapping__Group__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1755:1: ( 'class' ) rule__FunctionModulePOJORequestResponseMapping__Group__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1755:1: ( 'class' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1756:1: 'class'
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__FunctionModulePOJORequestResponseMapping__Group__13694); 
             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__2_in_rule__FunctionModulePOJORequestResponseMapping__Group__13704);
            rule__FunctionModulePOJORequestResponseMapping__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__Group__1


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__Group__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1770:1: rule__FunctionModulePOJORequestResponseMapping__Group__2 : ( ( rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2 ) ) rule__FunctionModulePOJORequestResponseMapping__Group__3 ;
    public final void rule__FunctionModulePOJORequestResponseMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1774:1: ( ( ( rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2 ) ) rule__FunctionModulePOJORequestResponseMapping__Group__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1775:1: ( ( rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2 ) ) rule__FunctionModulePOJORequestResponseMapping__Group__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1775:1: ( ( rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1776:1: ( rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2 )
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestClassNameAssignment_2()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1777:1: ( rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1777:2: rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2_in_rule__FunctionModulePOJORequestResponseMapping__Group__23732);
            rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestClassNameAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__3_in_rule__FunctionModulePOJORequestResponseMapping__Group__23741);
            rule__FunctionModulePOJORequestResponseMapping__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__Group__2


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__Group__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1788:1: rule__FunctionModulePOJORequestResponseMapping__Group__3 : ( '{' ) rule__FunctionModulePOJORequestResponseMapping__Group__4 ;
    public final void rule__FunctionModulePOJORequestResponseMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1792:1: ( ( '{' ) rule__FunctionModulePOJORequestResponseMapping__Group__4 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1793:1: ( '{' ) rule__FunctionModulePOJORequestResponseMapping__Group__4
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1793:1: ( '{' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1794:1: '{'
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__FunctionModulePOJORequestResponseMapping__Group__33770); 
             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__4_in_rule__FunctionModulePOJORequestResponseMapping__Group__33780);
            rule__FunctionModulePOJORequestResponseMapping__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__Group__3


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__Group__4
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1808:1: rule__FunctionModulePOJORequestResponseMapping__Group__4 : ( ( rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4 )* ) rule__FunctionModulePOJORequestResponseMapping__Group__5 ;
    public final void rule__FunctionModulePOJORequestResponseMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1812:1: ( ( ( rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4 )* ) rule__FunctionModulePOJORequestResponseMapping__Group__5 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1813:1: ( ( rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4 )* ) rule__FunctionModulePOJORequestResponseMapping__Group__5
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1813:1: ( ( rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4 )* )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1814:1: ( rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4 )*
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestParametersAssignment_4()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1815:1: ( rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=39 && LA23_0<=42)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1815:2: rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4_in_rule__FunctionModulePOJORequestResponseMapping__Group__43808);
            	    rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestParametersAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__5_in_rule__FunctionModulePOJORequestResponseMapping__Group__43818);
            rule__FunctionModulePOJORequestResponseMapping__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__Group__4


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__Group__5
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1826:1: rule__FunctionModulePOJORequestResponseMapping__Group__5 : ( '}' ) rule__FunctionModulePOJORequestResponseMapping__Group__6 ;
    public final void rule__FunctionModulePOJORequestResponseMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1830:1: ( ( '}' ) rule__FunctionModulePOJORequestResponseMapping__Group__6 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1831:1: ( '}' ) rule__FunctionModulePOJORequestResponseMapping__Group__6
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1831:1: ( '}' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1832:1: '}'
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__FunctionModulePOJORequestResponseMapping__Group__53847); 
             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRightCurlyBracketKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__6_in_rule__FunctionModulePOJORequestResponseMapping__Group__53857);
            rule__FunctionModulePOJORequestResponseMapping__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__Group__5


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__Group__6
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1846:1: rule__FunctionModulePOJORequestResponseMapping__Group__6 : ( 'response' ) rule__FunctionModulePOJORequestResponseMapping__Group__7 ;
    public final void rule__FunctionModulePOJORequestResponseMapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1850:1: ( ( 'response' ) rule__FunctionModulePOJORequestResponseMapping__Group__7 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1851:1: ( 'response' ) rule__FunctionModulePOJORequestResponseMapping__Group__7
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1851:1: ( 'response' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1852:1: 'response'
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseKeyword_6()); 
            match(input,38,FOLLOW_38_in_rule__FunctionModulePOJORequestResponseMapping__Group__63886); 
             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseKeyword_6()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__7_in_rule__FunctionModulePOJORequestResponseMapping__Group__63896);
            rule__FunctionModulePOJORequestResponseMapping__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__Group__6


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__Group__7
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1866:1: rule__FunctionModulePOJORequestResponseMapping__Group__7 : ( 'class' ) rule__FunctionModulePOJORequestResponseMapping__Group__8 ;
    public final void rule__FunctionModulePOJORequestResponseMapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1870:1: ( ( 'class' ) rule__FunctionModulePOJORequestResponseMapping__Group__8 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1871:1: ( 'class' ) rule__FunctionModulePOJORequestResponseMapping__Group__8
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1871:1: ( 'class' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1872:1: 'class'
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_7()); 
            match(input,30,FOLLOW_30_in_rule__FunctionModulePOJORequestResponseMapping__Group__73925); 
             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_7()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__8_in_rule__FunctionModulePOJORequestResponseMapping__Group__73935);
            rule__FunctionModulePOJORequestResponseMapping__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__Group__7


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__Group__8
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1886:1: rule__FunctionModulePOJORequestResponseMapping__Group__8 : ( ( rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8 ) ) rule__FunctionModulePOJORequestResponseMapping__Group__9 ;
    public final void rule__FunctionModulePOJORequestResponseMapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1890:1: ( ( ( rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8 ) ) rule__FunctionModulePOJORequestResponseMapping__Group__9 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1891:1: ( ( rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8 ) ) rule__FunctionModulePOJORequestResponseMapping__Group__9
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1891:1: ( ( rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1892:1: ( rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8 )
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseClassNameAssignment_8()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1893:1: ( rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1893:2: rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8_in_rule__FunctionModulePOJORequestResponseMapping__Group__83963);
            rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseClassNameAssignment_8()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__9_in_rule__FunctionModulePOJORequestResponseMapping__Group__83972);
            rule__FunctionModulePOJORequestResponseMapping__Group__9();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__Group__8


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__Group__9
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1904:1: rule__FunctionModulePOJORequestResponseMapping__Group__9 : ( '{' ) rule__FunctionModulePOJORequestResponseMapping__Group__10 ;
    public final void rule__FunctionModulePOJORequestResponseMapping__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1908:1: ( ( '{' ) rule__FunctionModulePOJORequestResponseMapping__Group__10 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1909:1: ( '{' ) rule__FunctionModulePOJORequestResponseMapping__Group__10
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1909:1: ( '{' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1910:1: '{'
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,28,FOLLOW_28_in_rule__FunctionModulePOJORequestResponseMapping__Group__94001); 
             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_9()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__10_in_rule__FunctionModulePOJORequestResponseMapping__Group__94011);
            rule__FunctionModulePOJORequestResponseMapping__Group__10();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__Group__9


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__Group__10
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1924:1: rule__FunctionModulePOJORequestResponseMapping__Group__10 : ( ( rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10 )* ) rule__FunctionModulePOJORequestResponseMapping__Group__11 ;
    public final void rule__FunctionModulePOJORequestResponseMapping__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1928:1: ( ( ( rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10 )* ) rule__FunctionModulePOJORequestResponseMapping__Group__11 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1929:1: ( ( rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10 )* ) rule__FunctionModulePOJORequestResponseMapping__Group__11
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1929:1: ( ( rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10 )* )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1930:1: ( rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10 )*
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseParametersAssignment_10()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1931:1: ( rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=39 && LA24_0<=42)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1931:2: rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10
            	    {
            	    pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10_in_rule__FunctionModulePOJORequestResponseMapping__Group__104039);
            	    rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseParametersAssignment_10()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__11_in_rule__FunctionModulePOJORequestResponseMapping__Group__104049);
            rule__FunctionModulePOJORequestResponseMapping__Group__11();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__Group__10


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__Group__11
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1942:1: rule__FunctionModulePOJORequestResponseMapping__Group__11 : ( '}' ) ;
    public final void rule__FunctionModulePOJORequestResponseMapping__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1946:1: ( ( '}' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1947:1: ( '}' )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1947:1: ( '}' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1948:1: '}'
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRightCurlyBracketKeyword_11()); 
            match(input,29,FOLLOW_29_in_rule__FunctionModulePOJORequestResponseMapping__Group__114078); 
             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__Group__11


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1985:1: rule__FunctionModulePOJOImportingParameter__Group__0 : ( 'importing' ) rule__FunctionModulePOJOImportingParameter__Group__1 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1989:1: ( ( 'importing' ) rule__FunctionModulePOJOImportingParameter__Group__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1990:1: ( 'importing' ) rule__FunctionModulePOJOImportingParameter__Group__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1990:1: ( 'importing' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:1991:1: 'importing'
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getImportingKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__FunctionModulePOJOImportingParameter__Group__04138); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getImportingKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group__1_in_rule__FunctionModulePOJOImportingParameter__Group__04148);
            rule__FunctionModulePOJOImportingParameter__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group__0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2005:1: rule__FunctionModulePOJOImportingParameter__Group__1 : ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1 ) ) rule__FunctionModulePOJOImportingParameter__Group__2 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2009:1: ( ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1 ) ) rule__FunctionModulePOJOImportingParameter__Group__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2010:1: ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1 ) ) rule__FunctionModulePOJOImportingParameter__Group__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2010:1: ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2011:1: ( rule__FunctionModulePOJOImportingParameter__Alternatives_1 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAlternatives_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2012:1: ( rule__FunctionModulePOJOImportingParameter__Alternatives_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2012:2: rule__FunctionModulePOJOImportingParameter__Alternatives_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Alternatives_1_in_rule__FunctionModulePOJOImportingParameter__Group__14176);
            rule__FunctionModulePOJOImportingParameter__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group__2_in_rule__FunctionModulePOJOImportingParameter__Group__14185);
            rule__FunctionModulePOJOImportingParameter__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group__1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2023:1: rule__FunctionModulePOJOImportingParameter__Group__2 : ( ( rule__FunctionModulePOJOImportingParameter__Group_2__0 )? ) rule__FunctionModulePOJOImportingParameter__Group__3 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2027:1: ( ( ( rule__FunctionModulePOJOImportingParameter__Group_2__0 )? ) rule__FunctionModulePOJOImportingParameter__Group__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2028:1: ( ( rule__FunctionModulePOJOImportingParameter__Group_2__0 )? ) rule__FunctionModulePOJOImportingParameter__Group__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2028:1: ( ( rule__FunctionModulePOJOImportingParameter__Group_2__0 )? )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2029:1: ( rule__FunctionModulePOJOImportingParameter__Group_2__0 )?
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_2()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2030:1: ( rule__FunctionModulePOJOImportingParameter__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2030:2: rule__FunctionModulePOJOImportingParameter__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_2__0_in_rule__FunctionModulePOJOImportingParameter__Group__24213);
                    rule__FunctionModulePOJOImportingParameter__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group__3_in_rule__FunctionModulePOJOImportingParameter__Group__24223);
            rule__FunctionModulePOJOImportingParameter__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group__2


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2041:1: rule__FunctionModulePOJOImportingParameter__Group__3 : ( ';' ) ;
    public final void rule__FunctionModulePOJOImportingParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2045:1: ( ( ';' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2046:1: ( ';' )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2046:1: ( ';' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2047:1: ';'
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getSemicolonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__FunctionModulePOJOImportingParameter__Group__34252); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group__3


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_0__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2068:1: rule__FunctionModulePOJOImportingParameter__Group_1_0__0 : ( 'field' ) rule__FunctionModulePOJOImportingParameter__Group_1_0__1 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2072:1: ( ( 'field' ) rule__FunctionModulePOJOImportingParameter__Group_1_0__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2073:1: ( 'field' ) rule__FunctionModulePOJOImportingParameter__Group_1_0__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2073:1: ( 'field' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2074:1: 'field'
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getFieldKeyword_1_0_0()); 
            match(input,32,FOLLOW_32_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__04296); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getFieldKeyword_1_0_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_0__1_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__04306);
            rule__FunctionModulePOJOImportingParameter__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_0__0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_0__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2088:1: rule__FunctionModulePOJOImportingParameter__Group_1_0__1 : ( ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_0__2 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2092:1: ( ( ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_0__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2093:1: ( ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_0__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2093:1: ( ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2094:1: ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameAssignment_1_0_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2095:1: ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2095:2: rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__14334);
            rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameAssignment_1_0_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_0__2_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__14343);
            rule__FunctionModulePOJOImportingParameter__Group_1_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_0__1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_0__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2106:1: rule__FunctionModulePOJOImportingParameter__Group_1_0__2 : ( '=' ) rule__FunctionModulePOJOImportingParameter__Group_1_0__3 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2110:1: ( ( '=' ) rule__FunctionModulePOJOImportingParameter__Group_1_0__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2111:1: ( '=' ) rule__FunctionModulePOJOImportingParameter__Group_1_0__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2111:1: ( '=' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2112:1: '='
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_0_2()); 
            match(input,33,FOLLOW_33_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__24372); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_0_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_0__3_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__24382);
            rule__FunctionModulePOJOImportingParameter__Group_1_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_0__2


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_0__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2126:1: rule__FunctionModulePOJOImportingParameter__Group_1_0__3 : ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3 ) ) ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2130:1: ( ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2131:1: ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2131:1: ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2132:1: ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAlternatives_1_0_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2133:1: ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2133:2: rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__34410);
            rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAlternatives_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_0__3


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2151:1: rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0 : ( ( rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__1 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2155:1: ( ( ( rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2156:1: ( ( rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2156:1: ( ( rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2157:1: ( rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTypeAssignment_1_0_3_1_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2158:1: ( rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2158:2: rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0_in_rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__04452);
            rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTypeAssignment_1_0_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__1_in_rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__04461);
            rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2169:1: rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__1 : ( ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1 ) ) ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2173:1: ( ( ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2174:1: ( ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2174:1: ( ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2175:1: ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeAssignment_1_0_3_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2176:1: ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2176:2: rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1_in_rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__14489);
            rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeAssignment_1_0_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2190:1: rule__FunctionModulePOJOImportingParameter__Group_1_1__0 : ( 'structure' ) rule__FunctionModulePOJOImportingParameter__Group_1_1__1 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2194:1: ( ( 'structure' ) rule__FunctionModulePOJOImportingParameter__Group_1_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2195:1: ( 'structure' ) rule__FunctionModulePOJOImportingParameter__Group_1_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2195:1: ( 'structure' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2196:1: 'structure'
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureKeyword_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__04528); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureKeyword_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_1__1_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__04538);
            rule__FunctionModulePOJOImportingParameter__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_1__0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2210:1: rule__FunctionModulePOJOImportingParameter__Group_1_1__1 : ( ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_1__2 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2214:1: ( ( ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_1__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2215:1: ( ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_1__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2215:1: ( ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2216:1: ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameAssignment_1_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2217:1: ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2217:2: rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__14566);
            rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameAssignment_1_1_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_1__2_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__14575);
            rule__FunctionModulePOJOImportingParameter__Group_1_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_1__1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_1__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2228:1: rule__FunctionModulePOJOImportingParameter__Group_1_1__2 : ( '=' ) rule__FunctionModulePOJOImportingParameter__Group_1_1__3 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2232:1: ( ( '=' ) rule__FunctionModulePOJOImportingParameter__Group_1_1__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2233:1: ( '=' ) rule__FunctionModulePOJOImportingParameter__Group_1_1__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2233:1: ( '=' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2234:1: '='
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_1_2()); 
            match(input,33,FOLLOW_33_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__24604); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_1_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_1__3_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__24614);
            rule__FunctionModulePOJOImportingParameter__Group_1_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_1__2


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_1__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2248:1: rule__FunctionModulePOJOImportingParameter__Group_1_1__3 : ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3 ) ) ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2252:1: ( ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2253:1: ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2253:1: ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2254:1: ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAlternatives_1_1_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2255:1: ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2255:2: rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__34642);
            rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAlternatives_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_1__3


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2273:1: rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0 : ( ( rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__1 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2277:1: ( ( ( rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2278:1: ( ( rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2278:1: ( ( rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2279:1: ( rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureAssignment_1_1_3_1_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2280:1: ( rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2280:2: rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0_in_rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__04684);
            rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureAssignment_1_1_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__1_in_rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__04693);
            rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2291:1: rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__1 : ( ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1 ) ) ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2295:1: ( ( ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2296:1: ( ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2296:1: ( ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2297:1: ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeAssignment_1_1_3_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2298:1: ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2298:2: rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1_in_rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__14721);
            rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeAssignment_1_1_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_2__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2312:1: rule__FunctionModulePOJOImportingParameter__Group_1_2__0 : ( ( rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_2__1 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2316:1: ( ( ( rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_2__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2317:1: ( ( rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_2__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2317:1: ( ( rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2318:1: ( rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTableAssignment_1_2_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2319:1: ( rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2319:2: rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__04759);
            rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTableAssignment_1_2_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_2__1_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__04768);
            rule__FunctionModulePOJOImportingParameter__Group_1_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_2__0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_2__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2330:1: rule__FunctionModulePOJOImportingParameter__Group_1_2__1 : ( ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_2__2 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2334:1: ( ( ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_2__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2335:1: ( ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_2__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2335:1: ( ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2336:1: ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameAssignment_1_2_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2337:1: ( rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2337:2: rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__14796);
            rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameAssignment_1_2_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_2__2_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__14805);
            rule__FunctionModulePOJOImportingParameter__Group_1_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_2__1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_2__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2348:1: rule__FunctionModulePOJOImportingParameter__Group_1_2__2 : ( '=' ) rule__FunctionModulePOJOImportingParameter__Group_1_2__3 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2352:1: ( ( '=' ) rule__FunctionModulePOJOImportingParameter__Group_1_2__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2353:1: ( '=' ) rule__FunctionModulePOJOImportingParameter__Group_1_2__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2353:1: ( '=' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2354:1: '='
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_2_2()); 
            match(input,33,FOLLOW_33_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__24834); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_2_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_2__3_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__24844);
            rule__FunctionModulePOJOImportingParameter__Group_1_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_2__2


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_2__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2368:1: rule__FunctionModulePOJOImportingParameter__Group_1_2__3 : ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3 ) ) ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2372:1: ( ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2373:1: ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2373:1: ( ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2374:1: ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAlternatives_1_2_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2375:1: ( rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2375:2: rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__34872);
            rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAlternatives_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_2__3


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2393:1: rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0 : ( ( rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__1 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2397:1: ( ( ( rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2398:1: ( ( rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0 ) ) rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2398:1: ( ( rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2399:1: ( rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureAssignment_1_2_3_1_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2400:1: ( rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2400:2: rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0_in_rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__04914);
            rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureAssignment_1_2_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__1_in_rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__04923);
            rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2411:1: rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__1 : ( ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1 ) ) ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2415:1: ( ( ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2416:1: ( ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2416:1: ( ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2417:1: ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeAssignment_1_2_3_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2418:1: ( rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2418:2: rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1_in_rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__14951);
            rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeAssignment_1_2_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_2__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2432:1: rule__FunctionModulePOJOImportingParameter__Group_2__0 : ( 'comment' ) rule__FunctionModulePOJOImportingParameter__Group_2__1 ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2436:1: ( ( 'comment' ) rule__FunctionModulePOJOImportingParameter__Group_2__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2437:1: ( 'comment' ) rule__FunctionModulePOJOImportingParameter__Group_2__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2437:1: ( 'comment' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2438:1: 'comment'
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__FunctionModulePOJOImportingParameter__Group_2__04990); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_2__1_in_rule__FunctionModulePOJOImportingParameter__Group_2__05000);
            rule__FunctionModulePOJOImportingParameter__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_2__0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__Group_2__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2452:1: rule__FunctionModulePOJOImportingParameter__Group_2__1 : ( ( rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1 ) ) ;
    public final void rule__FunctionModulePOJOImportingParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2456:1: ( ( ( rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2457:1: ( ( rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2457:1: ( ( rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2458:1: ( rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1 )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentAssignment_2_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2459:1: ( rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2459:2: rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1_in_rule__FunctionModulePOJOImportingParameter__Group_2__15028);
            rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__Group_2__1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2473:1: rule__FunctionModulePOJOExportingParameter__Group__0 : ( 'exporting' ) rule__FunctionModulePOJOExportingParameter__Group__1 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2477:1: ( ( 'exporting' ) rule__FunctionModulePOJOExportingParameter__Group__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2478:1: ( 'exporting' ) rule__FunctionModulePOJOExportingParameter__Group__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2478:1: ( 'exporting' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2479:1: 'exporting'
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExportingKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__FunctionModulePOJOExportingParameter__Group__05067); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExportingKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group__1_in_rule__FunctionModulePOJOExportingParameter__Group__05077);
            rule__FunctionModulePOJOExportingParameter__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group__0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2493:1: rule__FunctionModulePOJOExportingParameter__Group__1 : ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1 ) ) rule__FunctionModulePOJOExportingParameter__Group__2 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2497:1: ( ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1 ) ) rule__FunctionModulePOJOExportingParameter__Group__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2498:1: ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1 ) ) rule__FunctionModulePOJOExportingParameter__Group__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2498:1: ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2499:1: ( rule__FunctionModulePOJOExportingParameter__Alternatives_1 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAlternatives_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2500:1: ( rule__FunctionModulePOJOExportingParameter__Alternatives_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2500:2: rule__FunctionModulePOJOExportingParameter__Alternatives_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Alternatives_1_in_rule__FunctionModulePOJOExportingParameter__Group__15105);
            rule__FunctionModulePOJOExportingParameter__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group__2_in_rule__FunctionModulePOJOExportingParameter__Group__15114);
            rule__FunctionModulePOJOExportingParameter__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group__1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2511:1: rule__FunctionModulePOJOExportingParameter__Group__2 : ( ( rule__FunctionModulePOJOExportingParameter__Group_2__0 )? ) rule__FunctionModulePOJOExportingParameter__Group__3 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2515:1: ( ( ( rule__FunctionModulePOJOExportingParameter__Group_2__0 )? ) rule__FunctionModulePOJOExportingParameter__Group__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2516:1: ( ( rule__FunctionModulePOJOExportingParameter__Group_2__0 )? ) rule__FunctionModulePOJOExportingParameter__Group__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2516:1: ( ( rule__FunctionModulePOJOExportingParameter__Group_2__0 )? )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2517:1: ( rule__FunctionModulePOJOExportingParameter__Group_2__0 )?
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_2()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2518:1: ( rule__FunctionModulePOJOExportingParameter__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2518:2: rule__FunctionModulePOJOExportingParameter__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_2__0_in_rule__FunctionModulePOJOExportingParameter__Group__25142);
                    rule__FunctionModulePOJOExportingParameter__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group__3_in_rule__FunctionModulePOJOExportingParameter__Group__25152);
            rule__FunctionModulePOJOExportingParameter__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group__2


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2529:1: rule__FunctionModulePOJOExportingParameter__Group__3 : ( ';' ) ;
    public final void rule__FunctionModulePOJOExportingParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2533:1: ( ( ';' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2534:1: ( ';' )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2534:1: ( ';' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2535:1: ';'
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getSemicolonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__FunctionModulePOJOExportingParameter__Group__35181); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group__3


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_0__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2556:1: rule__FunctionModulePOJOExportingParameter__Group_1_0__0 : ( 'field' ) rule__FunctionModulePOJOExportingParameter__Group_1_0__1 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2560:1: ( ( 'field' ) rule__FunctionModulePOJOExportingParameter__Group_1_0__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2561:1: ( 'field' ) rule__FunctionModulePOJOExportingParameter__Group_1_0__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2561:1: ( 'field' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2562:1: 'field'
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getFieldKeyword_1_0_0()); 
            match(input,32,FOLLOW_32_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__05225); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getFieldKeyword_1_0_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_0__1_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__05235);
            rule__FunctionModulePOJOExportingParameter__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_0__0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_0__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2576:1: rule__FunctionModulePOJOExportingParameter__Group_1_0__1 : ( ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_0__2 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2580:1: ( ( ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_0__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2581:1: ( ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_0__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2581:1: ( ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2582:1: ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameAssignment_1_0_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2583:1: ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2583:2: rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__15263);
            rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameAssignment_1_0_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_0__2_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__15272);
            rule__FunctionModulePOJOExportingParameter__Group_1_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_0__1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_0__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2594:1: rule__FunctionModulePOJOExportingParameter__Group_1_0__2 : ( '=' ) rule__FunctionModulePOJOExportingParameter__Group_1_0__3 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2598:1: ( ( '=' ) rule__FunctionModulePOJOExportingParameter__Group_1_0__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2599:1: ( '=' ) rule__FunctionModulePOJOExportingParameter__Group_1_0__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2599:1: ( '=' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2600:1: '='
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_0_2()); 
            match(input,33,FOLLOW_33_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__25301); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_0_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_0__3_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__25311);
            rule__FunctionModulePOJOExportingParameter__Group_1_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_0__2


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_0__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2614:1: rule__FunctionModulePOJOExportingParameter__Group_1_0__3 : ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3 ) ) ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2618:1: ( ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2619:1: ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2619:1: ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2620:1: ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAlternatives_1_0_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2621:1: ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2621:2: rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__35339);
            rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAlternatives_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_0__3


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2639:1: rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0 : ( ( rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__1 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2643:1: ( ( ( rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2644:1: ( ( rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2644:1: ( ( rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2645:1: ( rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTypeAssignment_1_0_3_1_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2646:1: ( rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2646:2: rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0_in_rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__05381);
            rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTypeAssignment_1_0_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__1_in_rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__05390);
            rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2657:1: rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__1 : ( ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1 ) ) ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2661:1: ( ( ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2662:1: ( ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2662:1: ( ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2663:1: ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeAssignment_1_0_3_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2664:1: ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2664:2: rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1_in_rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__15418);
            rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeAssignment_1_0_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2678:1: rule__FunctionModulePOJOExportingParameter__Group_1_1__0 : ( 'structure' ) rule__FunctionModulePOJOExportingParameter__Group_1_1__1 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2682:1: ( ( 'structure' ) rule__FunctionModulePOJOExportingParameter__Group_1_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2683:1: ( 'structure' ) rule__FunctionModulePOJOExportingParameter__Group_1_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2683:1: ( 'structure' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2684:1: 'structure'
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureKeyword_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__05457); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureKeyword_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_1__1_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__05467);
            rule__FunctionModulePOJOExportingParameter__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_1__0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2698:1: rule__FunctionModulePOJOExportingParameter__Group_1_1__1 : ( ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_1__2 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2702:1: ( ( ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_1__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2703:1: ( ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_1__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2703:1: ( ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2704:1: ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameAssignment_1_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2705:1: ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2705:2: rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__15495);
            rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameAssignment_1_1_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_1__2_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__15504);
            rule__FunctionModulePOJOExportingParameter__Group_1_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_1__1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_1__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2716:1: rule__FunctionModulePOJOExportingParameter__Group_1_1__2 : ( '=' ) rule__FunctionModulePOJOExportingParameter__Group_1_1__3 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2720:1: ( ( '=' ) rule__FunctionModulePOJOExportingParameter__Group_1_1__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2721:1: ( '=' ) rule__FunctionModulePOJOExportingParameter__Group_1_1__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2721:1: ( '=' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2722:1: '='
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_1_2()); 
            match(input,33,FOLLOW_33_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__25533); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_1_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_1__3_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__25543);
            rule__FunctionModulePOJOExportingParameter__Group_1_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_1__2


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_1__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2736:1: rule__FunctionModulePOJOExportingParameter__Group_1_1__3 : ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3 ) ) ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2740:1: ( ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2741:1: ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2741:1: ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2742:1: ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAlternatives_1_1_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2743:1: ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2743:2: rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__35571);
            rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAlternatives_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_1__3


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2761:1: rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0 : ( ( rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__1 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2765:1: ( ( ( rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2766:1: ( ( rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2766:1: ( ( rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2767:1: ( rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureAssignment_1_1_3_1_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2768:1: ( rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2768:2: rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0_in_rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__05613);
            rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureAssignment_1_1_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__1_in_rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__05622);
            rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2779:1: rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__1 : ( ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1 ) ) ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2783:1: ( ( ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2784:1: ( ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2784:1: ( ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2785:1: ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeAssignment_1_1_3_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2786:1: ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2786:2: rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1_in_rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__15650);
            rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeAssignment_1_1_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_2__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2800:1: rule__FunctionModulePOJOExportingParameter__Group_1_2__0 : ( ( rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_2__1 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2804:1: ( ( ( rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_2__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2805:1: ( ( rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_2__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2805:1: ( ( rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2806:1: ( rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTableAssignment_1_2_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2807:1: ( rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2807:2: rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__05688);
            rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTableAssignment_1_2_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_2__1_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__05697);
            rule__FunctionModulePOJOExportingParameter__Group_1_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_2__0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_2__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2818:1: rule__FunctionModulePOJOExportingParameter__Group_1_2__1 : ( ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_2__2 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2822:1: ( ( ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_2__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2823:1: ( ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_2__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2823:1: ( ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2824:1: ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameAssignment_1_2_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2825:1: ( rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2825:2: rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__15725);
            rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameAssignment_1_2_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_2__2_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__15734);
            rule__FunctionModulePOJOExportingParameter__Group_1_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_2__1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_2__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2836:1: rule__FunctionModulePOJOExportingParameter__Group_1_2__2 : ( '=' ) rule__FunctionModulePOJOExportingParameter__Group_1_2__3 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2840:1: ( ( '=' ) rule__FunctionModulePOJOExportingParameter__Group_1_2__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2841:1: ( '=' ) rule__FunctionModulePOJOExportingParameter__Group_1_2__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2841:1: ( '=' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2842:1: '='
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_2_2()); 
            match(input,33,FOLLOW_33_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__25763); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_2_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_2__3_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__25773);
            rule__FunctionModulePOJOExportingParameter__Group_1_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_2__2


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_2__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2856:1: rule__FunctionModulePOJOExportingParameter__Group_1_2__3 : ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3 ) ) ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2860:1: ( ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2861:1: ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2861:1: ( ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2862:1: ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAlternatives_1_2_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2863:1: ( rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2863:2: rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__35801);
            rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAlternatives_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_2__3


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2881:1: rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0 : ( ( rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__1 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2885:1: ( ( ( rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2886:1: ( ( rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0 ) ) rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2886:1: ( ( rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2887:1: ( rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureAssignment_1_2_3_1_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2888:1: ( rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2888:2: rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0_in_rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__05843);
            rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureAssignment_1_2_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__1_in_rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__05852);
            rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2899:1: rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__1 : ( ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1 ) ) ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2903:1: ( ( ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2904:1: ( ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2904:1: ( ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2905:1: ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeAssignment_1_2_3_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2906:1: ( rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2906:2: rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1_in_rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__15880);
            rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeAssignment_1_2_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_2__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2920:1: rule__FunctionModulePOJOExportingParameter__Group_2__0 : ( 'comment' ) rule__FunctionModulePOJOExportingParameter__Group_2__1 ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2924:1: ( ( 'comment' ) rule__FunctionModulePOJOExportingParameter__Group_2__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2925:1: ( 'comment' ) rule__FunctionModulePOJOExportingParameter__Group_2__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2925:1: ( 'comment' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2926:1: 'comment'
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__FunctionModulePOJOExportingParameter__Group_2__05919); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_2__1_in_rule__FunctionModulePOJOExportingParameter__Group_2__05929);
            rule__FunctionModulePOJOExportingParameter__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_2__0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__Group_2__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2940:1: rule__FunctionModulePOJOExportingParameter__Group_2__1 : ( ( rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1 ) ) ;
    public final void rule__FunctionModulePOJOExportingParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2944:1: ( ( ( rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2945:1: ( ( rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2945:1: ( ( rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2946:1: ( rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1 )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentAssignment_2_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2947:1: ( rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2947:2: rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1_in_rule__FunctionModulePOJOExportingParameter__Group_2__15957);
            rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__Group_2__1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2961:1: rule__FunctionModulePOJOChangingParameter__Group__0 : ( 'changing' ) rule__FunctionModulePOJOChangingParameter__Group__1 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2965:1: ( ( 'changing' ) rule__FunctionModulePOJOChangingParameter__Group__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2966:1: ( 'changing' ) rule__FunctionModulePOJOChangingParameter__Group__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2966:1: ( 'changing' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2967:1: 'changing'
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getChangingKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__FunctionModulePOJOChangingParameter__Group__05996); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getChangingKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group__1_in_rule__FunctionModulePOJOChangingParameter__Group__06006);
            rule__FunctionModulePOJOChangingParameter__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group__0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2981:1: rule__FunctionModulePOJOChangingParameter__Group__1 : ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1 ) ) rule__FunctionModulePOJOChangingParameter__Group__2 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2985:1: ( ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1 ) ) rule__FunctionModulePOJOChangingParameter__Group__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2986:1: ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1 ) ) rule__FunctionModulePOJOChangingParameter__Group__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2986:1: ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2987:1: ( rule__FunctionModulePOJOChangingParameter__Alternatives_1 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAlternatives_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2988:1: ( rule__FunctionModulePOJOChangingParameter__Alternatives_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2988:2: rule__FunctionModulePOJOChangingParameter__Alternatives_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Alternatives_1_in_rule__FunctionModulePOJOChangingParameter__Group__16034);
            rule__FunctionModulePOJOChangingParameter__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAlternatives_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group__2_in_rule__FunctionModulePOJOChangingParameter__Group__16043);
            rule__FunctionModulePOJOChangingParameter__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group__1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:2999:1: rule__FunctionModulePOJOChangingParameter__Group__2 : ( ( rule__FunctionModulePOJOChangingParameter__Group_2__0 )? ) rule__FunctionModulePOJOChangingParameter__Group__3 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3003:1: ( ( ( rule__FunctionModulePOJOChangingParameter__Group_2__0 )? ) rule__FunctionModulePOJOChangingParameter__Group__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3004:1: ( ( rule__FunctionModulePOJOChangingParameter__Group_2__0 )? ) rule__FunctionModulePOJOChangingParameter__Group__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3004:1: ( ( rule__FunctionModulePOJOChangingParameter__Group_2__0 )? )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3005:1: ( rule__FunctionModulePOJOChangingParameter__Group_2__0 )?
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_2()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3006:1: ( rule__FunctionModulePOJOChangingParameter__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3006:2: rule__FunctionModulePOJOChangingParameter__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_2__0_in_rule__FunctionModulePOJOChangingParameter__Group__26071);
                    rule__FunctionModulePOJOChangingParameter__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group__3_in_rule__FunctionModulePOJOChangingParameter__Group__26081);
            rule__FunctionModulePOJOChangingParameter__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group__2


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3017:1: rule__FunctionModulePOJOChangingParameter__Group__3 : ( ';' ) ;
    public final void rule__FunctionModulePOJOChangingParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3021:1: ( ( ';' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3022:1: ( ';' )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3022:1: ( ';' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3023:1: ';'
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getSemicolonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__FunctionModulePOJOChangingParameter__Group__36110); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group__3


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_0__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3044:1: rule__FunctionModulePOJOChangingParameter__Group_1_0__0 : ( 'field' ) rule__FunctionModulePOJOChangingParameter__Group_1_0__1 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3048:1: ( ( 'field' ) rule__FunctionModulePOJOChangingParameter__Group_1_0__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3049:1: ( 'field' ) rule__FunctionModulePOJOChangingParameter__Group_1_0__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3049:1: ( 'field' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3050:1: 'field'
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getFieldKeyword_1_0_0()); 
            match(input,32,FOLLOW_32_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__06154); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getFieldKeyword_1_0_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_0__1_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__06164);
            rule__FunctionModulePOJOChangingParameter__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_0__0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_0__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3064:1: rule__FunctionModulePOJOChangingParameter__Group_1_0__1 : ( ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_0__2 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3068:1: ( ( ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_0__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3069:1: ( ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_0__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3069:1: ( ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3070:1: ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameAssignment_1_0_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3071:1: ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3071:2: rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__16192);
            rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameAssignment_1_0_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_0__2_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__16201);
            rule__FunctionModulePOJOChangingParameter__Group_1_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_0__1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_0__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3082:1: rule__FunctionModulePOJOChangingParameter__Group_1_0__2 : ( '=' ) rule__FunctionModulePOJOChangingParameter__Group_1_0__3 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3086:1: ( ( '=' ) rule__FunctionModulePOJOChangingParameter__Group_1_0__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3087:1: ( '=' ) rule__FunctionModulePOJOChangingParameter__Group_1_0__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3087:1: ( '=' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3088:1: '='
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_0_2()); 
            match(input,33,FOLLOW_33_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__26230); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_0_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_0__3_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__26240);
            rule__FunctionModulePOJOChangingParameter__Group_1_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_0__2


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_0__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3102:1: rule__FunctionModulePOJOChangingParameter__Group_1_0__3 : ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3 ) ) ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3106:1: ( ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3107:1: ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3107:1: ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3108:1: ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAlternatives_1_0_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3109:1: ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3109:2: rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__36268);
            rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAlternatives_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_0__3


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3127:1: rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0 : ( ( rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__1 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3131:1: ( ( ( rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3132:1: ( ( rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3132:1: ( ( rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3133:1: ( rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTypeAssignment_1_0_3_1_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3134:1: ( rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3134:2: rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0_in_rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__06310);
            rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTypeAssignment_1_0_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__1_in_rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__06319);
            rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3145:1: rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__1 : ( ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1 ) ) ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3149:1: ( ( ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3150:1: ( ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3150:1: ( ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3151:1: ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeAssignment_1_0_3_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3152:1: ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3152:2: rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1_in_rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__16347);
            rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeAssignment_1_0_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3166:1: rule__FunctionModulePOJOChangingParameter__Group_1_1__0 : ( 'structure' ) rule__FunctionModulePOJOChangingParameter__Group_1_1__1 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3170:1: ( ( 'structure' ) rule__FunctionModulePOJOChangingParameter__Group_1_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3171:1: ( 'structure' ) rule__FunctionModulePOJOChangingParameter__Group_1_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3171:1: ( 'structure' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3172:1: 'structure'
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureKeyword_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__06386); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureKeyword_1_1_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_1__1_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__06396);
            rule__FunctionModulePOJOChangingParameter__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_1__0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3186:1: rule__FunctionModulePOJOChangingParameter__Group_1_1__1 : ( ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_1__2 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3190:1: ( ( ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_1__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3191:1: ( ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_1__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3191:1: ( ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3192:1: ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameAssignment_1_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3193:1: ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3193:2: rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__16424);
            rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameAssignment_1_1_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_1__2_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__16433);
            rule__FunctionModulePOJOChangingParameter__Group_1_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_1__1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_1__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3204:1: rule__FunctionModulePOJOChangingParameter__Group_1_1__2 : ( '=' ) rule__FunctionModulePOJOChangingParameter__Group_1_1__3 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3208:1: ( ( '=' ) rule__FunctionModulePOJOChangingParameter__Group_1_1__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3209:1: ( '=' ) rule__FunctionModulePOJOChangingParameter__Group_1_1__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3209:1: ( '=' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3210:1: '='
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_1_2()); 
            match(input,33,FOLLOW_33_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__26462); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_1_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_1__3_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__26472);
            rule__FunctionModulePOJOChangingParameter__Group_1_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_1__2


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_1__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3224:1: rule__FunctionModulePOJOChangingParameter__Group_1_1__3 : ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3 ) ) ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3228:1: ( ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3229:1: ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3229:1: ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3230:1: ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAlternatives_1_1_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3231:1: ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3231:2: rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__36500);
            rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAlternatives_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_1__3


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3249:1: rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0 : ( ( rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__1 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3253:1: ( ( ( rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3254:1: ( ( rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3254:1: ( ( rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3255:1: ( rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureAssignment_1_1_3_1_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3256:1: ( rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3256:2: rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0_in_rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__06542);
            rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureAssignment_1_1_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__1_in_rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__06551);
            rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3267:1: rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__1 : ( ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1 ) ) ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3271:1: ( ( ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3272:1: ( ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3272:1: ( ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3273:1: ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeAssignment_1_1_3_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3274:1: ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3274:2: rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1_in_rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__16579);
            rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeAssignment_1_1_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_2__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3288:1: rule__FunctionModulePOJOChangingParameter__Group_1_2__0 : ( ( rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_2__1 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3292:1: ( ( ( rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_2__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3293:1: ( ( rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_2__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3293:1: ( ( rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3294:1: ( rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTableAssignment_1_2_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3295:1: ( rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3295:2: rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__06617);
            rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTableAssignment_1_2_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_2__1_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__06626);
            rule__FunctionModulePOJOChangingParameter__Group_1_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_2__0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_2__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3306:1: rule__FunctionModulePOJOChangingParameter__Group_1_2__1 : ( ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_2__2 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3310:1: ( ( ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_2__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3311:1: ( ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_2__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3311:1: ( ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3312:1: ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameAssignment_1_2_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3313:1: ( rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3313:2: rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__16654);
            rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameAssignment_1_2_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_2__2_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__16663);
            rule__FunctionModulePOJOChangingParameter__Group_1_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_2__1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_2__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3324:1: rule__FunctionModulePOJOChangingParameter__Group_1_2__2 : ( '=' ) rule__FunctionModulePOJOChangingParameter__Group_1_2__3 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3328:1: ( ( '=' ) rule__FunctionModulePOJOChangingParameter__Group_1_2__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3329:1: ( '=' ) rule__FunctionModulePOJOChangingParameter__Group_1_2__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3329:1: ( '=' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3330:1: '='
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_2_2()); 
            match(input,33,FOLLOW_33_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__26692); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_2_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_2__3_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__26702);
            rule__FunctionModulePOJOChangingParameter__Group_1_2__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_2__2


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_2__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3344:1: rule__FunctionModulePOJOChangingParameter__Group_1_2__3 : ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3 ) ) ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3348:1: ( ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3349:1: ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3349:1: ( ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3350:1: ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAlternatives_1_2_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3351:1: ( rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3351:2: rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__36730);
            rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAlternatives_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_2__3


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3369:1: rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0 : ( ( rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__1 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3373:1: ( ( ( rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3374:1: ( ( rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0 ) ) rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3374:1: ( ( rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3375:1: ( rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureAssignment_1_2_3_1_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3376:1: ( rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3376:2: rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0_in_rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__06772);
            rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureAssignment_1_2_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__1_in_rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__06781);
            rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3387:1: rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__1 : ( ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1 ) ) ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3391:1: ( ( ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3392:1: ( ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3392:1: ( ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3393:1: ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeAssignment_1_2_3_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3394:1: ( rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3394:2: rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1_in_rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__16809);
            rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeAssignment_1_2_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_2__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3408:1: rule__FunctionModulePOJOChangingParameter__Group_2__0 : ( 'comment' ) rule__FunctionModulePOJOChangingParameter__Group_2__1 ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3412:1: ( ( 'comment' ) rule__FunctionModulePOJOChangingParameter__Group_2__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3413:1: ( 'comment' ) rule__FunctionModulePOJOChangingParameter__Group_2__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3413:1: ( 'comment' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3414:1: 'comment'
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__FunctionModulePOJOChangingParameter__Group_2__06848); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_2__1_in_rule__FunctionModulePOJOChangingParameter__Group_2__06858);
            rule__FunctionModulePOJOChangingParameter__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_2__0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__Group_2__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3428:1: rule__FunctionModulePOJOChangingParameter__Group_2__1 : ( ( rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1 ) ) ;
    public final void rule__FunctionModulePOJOChangingParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3432:1: ( ( ( rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3433:1: ( ( rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3433:1: ( ( rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3434:1: ( rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1 )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentAssignment_2_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3435:1: ( rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3435:2: rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1_in_rule__FunctionModulePOJOChangingParameter__Group_2__16886);
            rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__Group_2__1


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__Group__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3449:1: rule__FunctionModulePOJOTablesParameter__Group__0 : ( 'table' ) rule__FunctionModulePOJOTablesParameter__Group__1 ;
    public final void rule__FunctionModulePOJOTablesParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3453:1: ( ( 'table' ) rule__FunctionModulePOJOTablesParameter__Group__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3454:1: ( 'table' ) rule__FunctionModulePOJOTablesParameter__Group__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3454:1: ( 'table' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3455:1: 'table'
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getTableKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__FunctionModulePOJOTablesParameter__Group__06925); 
             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getTableKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__Group__1_in_rule__FunctionModulePOJOTablesParameter__Group__06935);
            rule__FunctionModulePOJOTablesParameter__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__Group__0


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__Group__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3469:1: rule__FunctionModulePOJOTablesParameter__Group__1 : ( ( rule__FunctionModulePOJOTablesParameter__NameAssignment_1 ) ) rule__FunctionModulePOJOTablesParameter__Group__2 ;
    public final void rule__FunctionModulePOJOTablesParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3473:1: ( ( ( rule__FunctionModulePOJOTablesParameter__NameAssignment_1 ) ) rule__FunctionModulePOJOTablesParameter__Group__2 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3474:1: ( ( rule__FunctionModulePOJOTablesParameter__NameAssignment_1 ) ) rule__FunctionModulePOJOTablesParameter__Group__2
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3474:1: ( ( rule__FunctionModulePOJOTablesParameter__NameAssignment_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3475:1: ( rule__FunctionModulePOJOTablesParameter__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getNameAssignment_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3476:1: ( rule__FunctionModulePOJOTablesParameter__NameAssignment_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3476:2: rule__FunctionModulePOJOTablesParameter__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__NameAssignment_1_in_rule__FunctionModulePOJOTablesParameter__Group__16963);
            rule__FunctionModulePOJOTablesParameter__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__Group__2_in_rule__FunctionModulePOJOTablesParameter__Group__16972);
            rule__FunctionModulePOJOTablesParameter__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__Group__1


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__Group__2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3487:1: rule__FunctionModulePOJOTablesParameter__Group__2 : ( '=' ) rule__FunctionModulePOJOTablesParameter__Group__3 ;
    public final void rule__FunctionModulePOJOTablesParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3491:1: ( ( '=' ) rule__FunctionModulePOJOTablesParameter__Group__3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3492:1: ( '=' ) rule__FunctionModulePOJOTablesParameter__Group__3
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3492:1: ( '=' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3493:1: '='
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getEqualsSignKeyword_2()); 
            match(input,33,FOLLOW_33_in_rule__FunctionModulePOJOTablesParameter__Group__27001); 
             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getEqualsSignKeyword_2()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__Group__3_in_rule__FunctionModulePOJOTablesParameter__Group__27011);
            rule__FunctionModulePOJOTablesParameter__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__Group__2


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__Group__3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3507:1: rule__FunctionModulePOJOTablesParameter__Group__3 : ( ( rule__FunctionModulePOJOTablesParameter__Alternatives_3 ) ) rule__FunctionModulePOJOTablesParameter__Group__4 ;
    public final void rule__FunctionModulePOJOTablesParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3511:1: ( ( ( rule__FunctionModulePOJOTablesParameter__Alternatives_3 ) ) rule__FunctionModulePOJOTablesParameter__Group__4 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3512:1: ( ( rule__FunctionModulePOJOTablesParameter__Alternatives_3 ) ) rule__FunctionModulePOJOTablesParameter__Group__4
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3512:1: ( ( rule__FunctionModulePOJOTablesParameter__Alternatives_3 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3513:1: ( rule__FunctionModulePOJOTablesParameter__Alternatives_3 )
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getAlternatives_3()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3514:1: ( rule__FunctionModulePOJOTablesParameter__Alternatives_3 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3514:2: rule__FunctionModulePOJOTablesParameter__Alternatives_3
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__Alternatives_3_in_rule__FunctionModulePOJOTablesParameter__Group__37039);
            rule__FunctionModulePOJOTablesParameter__Alternatives_3();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getAlternatives_3()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__Group__4_in_rule__FunctionModulePOJOTablesParameter__Group__37048);
            rule__FunctionModulePOJOTablesParameter__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__Group__3


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__Group__4
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3525:1: rule__FunctionModulePOJOTablesParameter__Group__4 : ( ( rule__FunctionModulePOJOTablesParameter__Group_4__0 )? ) rule__FunctionModulePOJOTablesParameter__Group__5 ;
    public final void rule__FunctionModulePOJOTablesParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3529:1: ( ( ( rule__FunctionModulePOJOTablesParameter__Group_4__0 )? ) rule__FunctionModulePOJOTablesParameter__Group__5 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3530:1: ( ( rule__FunctionModulePOJOTablesParameter__Group_4__0 )? ) rule__FunctionModulePOJOTablesParameter__Group__5
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3530:1: ( ( rule__FunctionModulePOJOTablesParameter__Group_4__0 )? )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3531:1: ( rule__FunctionModulePOJOTablesParameter__Group_4__0 )?
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getGroup_4()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3532:1: ( rule__FunctionModulePOJOTablesParameter__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3532:2: rule__FunctionModulePOJOTablesParameter__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__Group_4__0_in_rule__FunctionModulePOJOTablesParameter__Group__47076);
                    rule__FunctionModulePOJOTablesParameter__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getGroup_4()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__Group__5_in_rule__FunctionModulePOJOTablesParameter__Group__47086);
            rule__FunctionModulePOJOTablesParameter__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__Group__4


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__Group__5
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3543:1: rule__FunctionModulePOJOTablesParameter__Group__5 : ( ';' ) ;
    public final void rule__FunctionModulePOJOTablesParameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3547:1: ( ( ';' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3548:1: ( ';' )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3548:1: ( ';' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3549:1: ';'
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getSemicolonKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__FunctionModulePOJOTablesParameter__Group__57115); 
             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__Group__5


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__Group_3_1__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3574:1: rule__FunctionModulePOJOTablesParameter__Group_3_1__0 : ( ( rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0 ) ) rule__FunctionModulePOJOTablesParameter__Group_3_1__1 ;
    public final void rule__FunctionModulePOJOTablesParameter__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3578:1: ( ( ( rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0 ) ) rule__FunctionModulePOJOTablesParameter__Group_3_1__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3579:1: ( ( rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0 ) ) rule__FunctionModulePOJOTablesParameter__Group_3_1__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3579:1: ( ( rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3580:1: ( rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0 )
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getStructureAssignment_3_1_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3581:1: ( rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3581:2: rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0_in_rule__FunctionModulePOJOTablesParameter__Group_3_1__07162);
            rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getStructureAssignment_3_1_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__Group_3_1__1_in_rule__FunctionModulePOJOTablesParameter__Group_3_1__07171);
            rule__FunctionModulePOJOTablesParameter__Group_3_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__Group_3_1__0


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__Group_3_1__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3592:1: rule__FunctionModulePOJOTablesParameter__Group_3_1__1 : ( ( rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1 ) ) ;
    public final void rule__FunctionModulePOJOTablesParameter__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3596:1: ( ( ( rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3597:1: ( ( rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3597:1: ( ( rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3598:1: ( rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1 )
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getAttributeAssignment_3_1_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3599:1: ( rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3599:2: rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1_in_rule__FunctionModulePOJOTablesParameter__Group_3_1__17199);
            rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getAttributeAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__Group_3_1__1


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__Group_4__0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3613:1: rule__FunctionModulePOJOTablesParameter__Group_4__0 : ( 'comment' ) rule__FunctionModulePOJOTablesParameter__Group_4__1 ;
    public final void rule__FunctionModulePOJOTablesParameter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3617:1: ( ( 'comment' ) rule__FunctionModulePOJOTablesParameter__Group_4__1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3618:1: ( 'comment' ) rule__FunctionModulePOJOTablesParameter__Group_4__1
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3618:1: ( 'comment' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3619:1: 'comment'
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentKeyword_4_0()); 
            match(input,34,FOLLOW_34_in_rule__FunctionModulePOJOTablesParameter__Group_4__07238); 
             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentKeyword_4_0()); 

            }

            pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__Group_4__1_in_rule__FunctionModulePOJOTablesParameter__Group_4__07248);
            rule__FunctionModulePOJOTablesParameter__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__Group_4__0


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__Group_4__1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3633:1: rule__FunctionModulePOJOTablesParameter__Group_4__1 : ( ( rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1 ) ) ;
    public final void rule__FunctionModulePOJOTablesParameter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3637:1: ( ( ( rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1 ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3638:1: ( ( rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1 ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3638:1: ( ( rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1 ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3639:1: ( rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1 )
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentAssignment_4_1()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3640:1: ( rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1 )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3640:2: rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1_in_rule__FunctionModulePOJOTablesParameter__Group_4__17276);
            rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__Group_4__1


    // $ANTLR start rule__Model__PackageNameAssignment_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3654:1: rule__Model__PackageNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Model__PackageNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3658:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3659:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3659:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3660:1: RULE_STRING
            {
             before(grammarAccess.getModelAccess().getPackageNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Model__PackageNameAssignment_17314); 
             after(grammarAccess.getModelAccess().getPackageNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__PackageNameAssignment_1


    // $ANTLR start rule__Model__StructuresAssignment_2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3669:1: rule__Model__StructuresAssignment_2 : ( ruleStructure ) ;
    public final void rule__Model__StructuresAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3673:1: ( ( ruleStructure ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3674:1: ( ruleStructure )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3674:1: ( ruleStructure )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3675:1: ruleStructure
            {
             before(grammarAccess.getModelAccess().getStructuresStructureParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStructure_in_rule__Model__StructuresAssignment_27345);
            ruleStructure();
            _fsp--;

             after(grammarAccess.getModelAccess().getStructuresStructureParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__StructuresAssignment_2


    // $ANTLR start rule__Model__FunctionModulesAssignment_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3684:1: rule__Model__FunctionModulesAssignment_3 : ( ruleFunctionModule ) ;
    public final void rule__Model__FunctionModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3688:1: ( ( ruleFunctionModule ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3689:1: ( ruleFunctionModule )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3689:1: ( ruleFunctionModule )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3690:1: ruleFunctionModule
            {
             before(grammarAccess.getModelAccess().getFunctionModulesFunctionModuleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFunctionModule_in_rule__Model__FunctionModulesAssignment_37376);
            ruleFunctionModule();
            _fsp--;

             after(grammarAccess.getModelAccess().getFunctionModulesFunctionModuleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__FunctionModulesAssignment_3


    // $ANTLR start rule__Structure__NameAssignment_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3699:1: rule__Structure__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Structure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3703:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3704:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3704:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3705:1: RULE_STRING
            {
             before(grammarAccess.getStructureAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Structure__NameAssignment_17407); 
             after(grammarAccess.getStructureAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Structure__NameAssignment_1


    // $ANTLR start rule__Structure__MappingAssignment_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3714:1: rule__Structure__MappingAssignment_3 : ( ruleStructureMapping ) ;
    public final void rule__Structure__MappingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3718:1: ( ( ruleStructureMapping ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3719:1: ( ruleStructureMapping )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3719:1: ( ruleStructureMapping )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3720:1: ruleStructureMapping
            {
             before(grammarAccess.getStructureAccess().getMappingStructureMappingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStructureMapping_in_rule__Structure__MappingAssignment_37438);
            ruleStructureMapping();
            _fsp--;

             after(grammarAccess.getStructureAccess().getMappingStructureMappingParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Structure__MappingAssignment_3


    // $ANTLR start rule__StructurePOJOMapping__ClassNameAssignment_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3729:1: rule__StructurePOJOMapping__ClassNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StructurePOJOMapping__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3733:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3734:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3734:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3735:1: RULE_ID
            {
             before(grammarAccess.getStructurePOJOMappingAccess().getClassNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructurePOJOMapping__ClassNameAssignment_17469); 
             after(grammarAccess.getStructurePOJOMappingAccess().getClassNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructurePOJOMapping__ClassNameAssignment_1


    // $ANTLR start rule__StructurePOJOMapping__FieldsAssignment_3_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3744:1: rule__StructurePOJOMapping__FieldsAssignment_3_0 : ( ruleStructureFieldPOJOMapping ) ;
    public final void rule__StructurePOJOMapping__FieldsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3748:1: ( ( ruleStructureFieldPOJOMapping ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3749:1: ( ruleStructureFieldPOJOMapping )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3749:1: ( ruleStructureFieldPOJOMapping )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3750:1: ruleStructureFieldPOJOMapping
            {
             before(grammarAccess.getStructurePOJOMappingAccess().getFieldsStructureFieldPOJOMappingParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_rule__StructurePOJOMapping__FieldsAssignment_3_07500);
            ruleStructureFieldPOJOMapping();
            _fsp--;

             after(grammarAccess.getStructurePOJOMappingAccess().getFieldsStructureFieldPOJOMappingParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructurePOJOMapping__FieldsAssignment_3_0


    // $ANTLR start rule__StructureFieldPOJOMapping__NameAssignment_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3759:1: rule__StructureFieldPOJOMapping__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StructureFieldPOJOMapping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3763:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3764:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3764:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3765:1: RULE_STRING
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StructureFieldPOJOMapping__NameAssignment_17531); 
             after(grammarAccess.getStructureFieldPOJOMappingAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__NameAssignment_1


    // $ANTLR start rule__StructureFieldPOJOMapping__InactiveAssignment_3_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3774:1: rule__StructureFieldPOJOMapping__InactiveAssignment_3_0 : ( ( 'inactive' ) ) ;
    public final void rule__StructureFieldPOJOMapping__InactiveAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3778:1: ( ( ( 'inactive' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3779:1: ( ( 'inactive' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3779:1: ( ( 'inactive' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3780:1: ( 'inactive' )
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getInactiveInactiveKeyword_3_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3781:1: ( 'inactive' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3782:1: 'inactive'
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getInactiveInactiveKeyword_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__StructureFieldPOJOMapping__InactiveAssignment_3_07567); 
             after(grammarAccess.getStructureFieldPOJOMappingAccess().getInactiveInactiveKeyword_3_0_0()); 

            }

             after(grammarAccess.getStructureFieldPOJOMappingAccess().getInactiveInactiveKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__InactiveAssignment_3_0


    // $ANTLR start rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3797:1: rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0 : ( ruleDataType ) ;
    public final void rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3801:1: ( ( ruleDataType ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3802:1: ( ruleDataType )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3802:1: ( ruleDataType )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3803:1: ruleDataType
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getTypeDataTypeEnumRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__StructureFieldPOJOMapping__TypeAssignment_3_1_07606);
            ruleDataType();
            _fsp--;

             after(grammarAccess.getStructureFieldPOJOMappingAccess().getTypeDataTypeEnumRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0


    // $ANTLR start rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3812:1: rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1 : ( RULE_ID ) ;
    public final void rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3816:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3817:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3817:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3818:1: RULE_ID
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getAttributeIDTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_17637); 
             after(grammarAccess.getStructureFieldPOJOMappingAccess().getAttributeIDTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1


    // $ANTLR start rule__StructureFieldPOJOMapping__CommentAssignment_4_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3827:1: rule__StructureFieldPOJOMapping__CommentAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__StructureFieldPOJOMapping__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3831:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3832:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3832:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3833:1: RULE_STRING
            {
             before(grammarAccess.getStructureFieldPOJOMappingAccess().getCommentSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StructureFieldPOJOMapping__CommentAssignment_4_17668); 
             after(grammarAccess.getStructureFieldPOJOMappingAccess().getCommentSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__StructureFieldPOJOMapping__CommentAssignment_4_1


    // $ANTLR start rule__FunctionModule__NameAssignment_2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3842:1: rule__FunctionModule__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FunctionModule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3846:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3847:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3847:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3848:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModuleAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModule__NameAssignment_27699); 
             after(grammarAccess.getFunctionModuleAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModule__NameAssignment_2


    // $ANTLR start rule__FunctionModule__MappingAssignment_4
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3857:1: rule__FunctionModule__MappingAssignment_4 : ( ruleFunctionModuleMapping ) ;
    public final void rule__FunctionModule__MappingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3861:1: ( ( ruleFunctionModuleMapping ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3862:1: ( ruleFunctionModuleMapping )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3862:1: ( ruleFunctionModuleMapping )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3863:1: ruleFunctionModuleMapping
            {
             before(grammarAccess.getFunctionModuleAccess().getMappingFunctionModuleMappingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_rule__FunctionModule__MappingAssignment_47730);
            ruleFunctionModuleMapping();
            _fsp--;

             after(grammarAccess.getFunctionModuleAccess().getMappingFunctionModuleMappingParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModule__MappingAssignment_4


    // $ANTLR start rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3872:1: rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3876:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3877:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3877:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3878:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOCallMapping__ClassNameAssignment_17761); 
             after(grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1


    // $ANTLR start rule__FunctionModulePOJOCallMapping__ParametersAssignment_3
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3887:1: rule__FunctionModulePOJOCallMapping__ParametersAssignment_3 : ( ruleFunctionModulePOJOParameterMapping ) ;
    public final void rule__FunctionModulePOJOCallMapping__ParametersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3891:1: ( ( ruleFunctionModulePOJOParameterMapping ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3892:1: ( ruleFunctionModulePOJOParameterMapping )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3892:1: ( ruleFunctionModulePOJOParameterMapping )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3893:1: ruleFunctionModulePOJOParameterMapping
            {
             before(grammarAccess.getFunctionModulePOJOCallMappingAccess().getParametersFunctionModulePOJOParameterMappingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_rule__FunctionModulePOJOCallMapping__ParametersAssignment_37792);
            ruleFunctionModulePOJOParameterMapping();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJOCallMappingAccess().getParametersFunctionModulePOJOParameterMappingParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOCallMapping__ParametersAssignment_3


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3902:1: rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3906:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3907:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3907:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3908:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestClassNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_27823); 
             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestClassNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3917:1: rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4 : ( ruleFunctionModulePOJOParameterMapping ) ;
    public final void rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3921:1: ( ( ruleFunctionModulePOJOParameterMapping ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3922:1: ( ruleFunctionModulePOJOParameterMapping )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3922:1: ( ruleFunctionModulePOJOParameterMapping )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3923:1: ruleFunctionModulePOJOParameterMapping
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestParametersFunctionModulePOJOParameterMappingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_47854);
            ruleFunctionModulePOJOParameterMapping();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestParametersFunctionModulePOJOParameterMappingParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3932:1: rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8 : ( RULE_ID ) ;
    public final void rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3936:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3937:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3937:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3938:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseClassNameIDTerminalRuleCall_8_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_87885); 
             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseClassNameIDTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8


    // $ANTLR start rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3947:1: rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10 : ( ruleFunctionModulePOJOParameterMapping ) ;
    public final void rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3951:1: ( ( ruleFunctionModulePOJOParameterMapping ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3952:1: ( ruleFunctionModulePOJOParameterMapping )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3952:1: ( ruleFunctionModulePOJOParameterMapping )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3953:1: ruleFunctionModulePOJOParameterMapping
            {
             before(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseParametersFunctionModulePOJOParameterMappingParserRuleCall_10_0()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_107916);
            ruleFunctionModulePOJOParameterMapping();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseParametersFunctionModulePOJOParameterMappingParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3962:1: rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3966:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3967:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3967:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3968:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_17947); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3977:1: rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0 : ( ( 'inactive' ) ) ;
    public final void rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3981:1: ( ( ( 'inactive' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3982:1: ( ( 'inactive' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3982:1: ( ( 'inactive' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3983:1: ( 'inactive' )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3984:1: ( 'inactive' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:3985:1: 'inactive'
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_07983); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0()); 

            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4000:1: rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0 : ( ruleDataType ) ;
    public final void rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4004:1: ( ( ruleDataType ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4005:1: ( ruleDataType )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4005:1: ( ruleDataType )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4006:1: ruleDataType
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_08022);
            ruleDataType();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4015:1: rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4019:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4020:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4020:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4021:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_18053); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4030:1: rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4034:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4035:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4035:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4036:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_18084); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4045:1: rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0 : ( ( 'inactive' ) ) ;
    public final void rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4049:1: ( ( ( 'inactive' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4050:1: ( ( 'inactive' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4050:1: ( ( 'inactive' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4051:1: ( 'inactive' )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4052:1: ( 'inactive' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4053:1: 'inactive'
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_08120); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0()); 

            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4068:1: rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4072:1: ( ( ( RULE_ID ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4073:1: ( ( RULE_ID ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4073:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4074:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureCrossReference_1_1_3_1_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4075:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4076:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureIDTerminalRuleCall_1_1_3_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_08163); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureIDTerminalRuleCall_1_1_3_1_0_0_1()); 

            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureCrossReference_1_1_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4087:1: rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4091:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4092:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4092:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4093:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_18198); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4102:1: rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0 : ( ( 'table' ) ) ;
    public final void rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4106:1: ( ( ( 'table' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4107:1: ( ( 'table' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4107:1: ( ( 'table' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4108:1: ( 'table' )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTableTableKeyword_1_2_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4109:1: ( 'table' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4110:1: 'table'
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTableTableKeyword_1_2_0_0()); 
            match(input,42,FOLLOW_42_in_rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_08234); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTableTableKeyword_1_2_0_0()); 

            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTableTableKeyword_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4125:1: rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4129:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4130:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4130:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4131:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_18273); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4140:1: rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0 : ( ( 'inactive' ) ) ;
    public final void rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4144:1: ( ( ( 'inactive' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4145:1: ( ( 'inactive' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4145:1: ( ( 'inactive' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4146:1: ( 'inactive' )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4147:1: ( 'inactive' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4148:1: 'inactive'
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_08309); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0()); 

            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4163:1: rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4167:1: ( ( ( RULE_ID ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4168:1: ( ( RULE_ID ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4168:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4169:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureCrossReference_1_2_3_1_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4170:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4171:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureIDTerminalRuleCall_1_2_3_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_08352); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureIDTerminalRuleCall_1_2_3_1_0_0_1()); 

            }

             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureCrossReference_1_2_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4182:1: rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4186:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4187:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4187:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4188:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_18387); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1


    // $ANTLR start rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4197:1: rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4201:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4202:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4202:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4203:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_18418); 
             after(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4212:1: rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4216:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4217:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4217:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4218:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_18449); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4227:1: rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0 : ( ( 'inactive' ) ) ;
    public final void rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4231:1: ( ( ( 'inactive' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4232:1: ( ( 'inactive' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4232:1: ( ( 'inactive' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4233:1: ( 'inactive' )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4234:1: ( 'inactive' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4235:1: 'inactive'
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_08485); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0()); 

            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4250:1: rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0 : ( ruleDataType ) ;
    public final void rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4254:1: ( ( ruleDataType ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4255:1: ( ruleDataType )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4255:1: ( ruleDataType )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4256:1: ruleDataType
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_08524);
            ruleDataType();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4265:1: rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4269:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4270:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4270:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4271:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_18555); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4280:1: rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4284:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4285:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4285:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4286:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_18586); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4295:1: rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0 : ( ( 'inactive' ) ) ;
    public final void rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4299:1: ( ( ( 'inactive' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4300:1: ( ( 'inactive' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4300:1: ( ( 'inactive' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4301:1: ( 'inactive' )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4302:1: ( 'inactive' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4303:1: 'inactive'
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_08622); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0()); 

            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4318:1: rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4322:1: ( ( ( RULE_ID ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4323:1: ( ( RULE_ID ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4323:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4324:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureCrossReference_1_1_3_1_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4325:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4326:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureIDTerminalRuleCall_1_1_3_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_08665); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureIDTerminalRuleCall_1_1_3_1_0_0_1()); 

            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureCrossReference_1_1_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4337:1: rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4341:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4342:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4342:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4343:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_18700); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4352:1: rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0 : ( ( 'table' ) ) ;
    public final void rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4356:1: ( ( ( 'table' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4357:1: ( ( 'table' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4357:1: ( ( 'table' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4358:1: ( 'table' )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTableTableKeyword_1_2_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4359:1: ( 'table' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4360:1: 'table'
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTableTableKeyword_1_2_0_0()); 
            match(input,42,FOLLOW_42_in_rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_08736); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTableTableKeyword_1_2_0_0()); 

            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTableTableKeyword_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4375:1: rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4379:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4380:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4380:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4381:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_18775); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4390:1: rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0 : ( ( 'inactive' ) ) ;
    public final void rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4394:1: ( ( ( 'inactive' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4395:1: ( ( 'inactive' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4395:1: ( ( 'inactive' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4396:1: ( 'inactive' )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4397:1: ( 'inactive' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4398:1: 'inactive'
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_08811); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0()); 

            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4413:1: rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4417:1: ( ( ( RULE_ID ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4418:1: ( ( RULE_ID ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4418:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4419:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureCrossReference_1_2_3_1_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4420:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4421:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureIDTerminalRuleCall_1_2_3_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_08854); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureIDTerminalRuleCall_1_2_3_1_0_0_1()); 

            }

             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureCrossReference_1_2_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4432:1: rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4436:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4437:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4437:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4438:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_18889); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1


    // $ANTLR start rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4447:1: rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4451:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4452:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4452:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4453:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_18920); 
             after(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4462:1: rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4466:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4467:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4467:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4468:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_18951); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4477:1: rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0 : ( ( 'inactive' ) ) ;
    public final void rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4481:1: ( ( ( 'inactive' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4482:1: ( ( 'inactive' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4482:1: ( ( 'inactive' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4483:1: ( 'inactive' )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4484:1: ( 'inactive' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4485:1: 'inactive'
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_08987); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0()); 

            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4500:1: rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0 : ( ruleDataType ) ;
    public final void rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4504:1: ( ( ruleDataType ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4505:1: ( ruleDataType )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4505:1: ( ruleDataType )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4506:1: ruleDataType
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0()); 
            pushFollow(FOLLOW_ruleDataType_in_rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_09026);
            ruleDataType();
            _fsp--;

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4515:1: rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4519:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4520:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4520:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4521:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_19057); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4530:1: rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4534:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4535:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4535:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4536:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_19088); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4545:1: rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0 : ( ( 'inactive' ) ) ;
    public final void rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4549:1: ( ( ( 'inactive' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4550:1: ( ( 'inactive' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4550:1: ( ( 'inactive' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4551:1: ( 'inactive' )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4552:1: ( 'inactive' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4553:1: 'inactive'
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_09124); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0()); 

            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4568:1: rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4572:1: ( ( ( RULE_ID ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4573:1: ( ( RULE_ID ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4573:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4574:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureCrossReference_1_1_3_1_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4575:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4576:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureIDTerminalRuleCall_1_1_3_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_09167); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureIDTerminalRuleCall_1_1_3_1_0_0_1()); 

            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureCrossReference_1_1_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4587:1: rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4591:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4592:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4592:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4593:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_19202); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4602:1: rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0 : ( ( 'table' ) ) ;
    public final void rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4606:1: ( ( ( 'table' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4607:1: ( ( 'table' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4607:1: ( ( 'table' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4608:1: ( 'table' )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTableTableKeyword_1_2_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4609:1: ( 'table' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4610:1: 'table'
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTableTableKeyword_1_2_0_0()); 
            match(input,42,FOLLOW_42_in_rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_09238); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTableTableKeyword_1_2_0_0()); 

            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTableTableKeyword_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4625:1: rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4629:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4630:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4630:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4631:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_19277); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4640:1: rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0 : ( ( 'inactive' ) ) ;
    public final void rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4644:1: ( ( ( 'inactive' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4645:1: ( ( 'inactive' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4645:1: ( ( 'inactive' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4646:1: ( 'inactive' )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4647:1: ( 'inactive' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4648:1: 'inactive'
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_09313); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0()); 

            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4663:1: rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4667:1: ( ( ( RULE_ID ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4668:1: ( ( RULE_ID ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4668:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4669:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureCrossReference_1_2_3_1_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4670:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4671:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureIDTerminalRuleCall_1_2_3_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_09356); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureIDTerminalRuleCall_1_2_3_1_0_0_1()); 

            }

             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureCrossReference_1_2_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4682:1: rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4686:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4687:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4687:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4688:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_19391); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1


    // $ANTLR start rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4697:1: rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4701:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4702:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4702:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4703:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_19422); 
             after(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__NameAssignment_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4712:1: rule__FunctionModulePOJOTablesParameter__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOTablesParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4716:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4717:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4717:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4718:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOTablesParameter__NameAssignment_19453); 
             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__NameAssignment_1


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4727:1: rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0 : ( ( 'inactive' ) ) ;
    public final void rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4731:1: ( ( ( 'inactive' ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4732:1: ( ( 'inactive' ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4732:1: ( ( 'inactive' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4733:1: ( 'inactive' )
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getInactiveInactiveKeyword_3_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4734:1: ( 'inactive' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4735:1: 'inactive'
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getInactiveInactiveKeyword_3_0_0()); 
            match(input,43,FOLLOW_43_in_rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_09489); 
             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getInactiveInactiveKeyword_3_0_0()); 

            }

             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getInactiveInactiveKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4750:1: rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4754:1: ( ( ( RULE_ID ) ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4755:1: ( ( RULE_ID ) )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4755:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4756:1: ( RULE_ID )
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getStructureStructureCrossReference_3_1_0_0()); 
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4757:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4758:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getStructureStructureIDTerminalRuleCall_3_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_09532); 
             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getStructureStructureIDTerminalRuleCall_3_1_0_0_1()); 

            }

             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getStructureStructureCrossReference_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4769:1: rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1 : ( RULE_ID ) ;
    public final void rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4773:1: ( ( RULE_ID ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4774:1: ( RULE_ID )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4774:1: ( RULE_ID )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4775:1: RULE_ID
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getAttributeIDTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_19567); 
             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getAttributeIDTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1


    // $ANTLR start rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1
    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4784:1: rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4788:1: ( ( RULE_STRING ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4789:1: ( RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4789:1: ( RULE_STRING )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g:4790:1: RULE_STRING
            {
             before(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_19598); 
             after(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel60 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__Group__0_in_ruleStructure154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureMapping_in_entryRuleStructureMapping180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureMapping187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructurePOJOMapping_in_ruleStructureMapping214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructurePOJOMapping_in_entryRuleStructurePOJOMapping239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructurePOJOMapping246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructurePOJOMapping__Group__0_in_ruleStructurePOJOMapping273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_entryRuleStructureFieldPOJOMapping299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureFieldPOJOMapping306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__Group__0_in_ruleStructureFieldPOJOMapping333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_entryRuleFunctionModule359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModule366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModule__Group__0_in_ruleFunctionModule393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_entryRuleFunctionModuleMapping419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModuleMapping426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_entryRuleFunctionModulePOJOMapping478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOMapping485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOMapping__Alternatives_in_ruleFunctionModulePOJOMapping512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_entryRuleFunctionModulePOJOCallMapping538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOCallMapping545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOCallMapping__Group__0_in_ruleFunctionModulePOJOCallMapping572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_entryRuleFunctionModulePOJORequestResponseMapping598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJORequestResponseMapping605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__0_in_ruleFunctionModulePOJORequestResponseMapping632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_entryRuleFunctionModulePOJOParameterMapping658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOParameterMapping665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOParameterMapping__Alternatives_in_ruleFunctionModulePOJOParameterMapping692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_entryRuleFunctionModulePOJOImportingParameter718 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOImportingParameter725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group__0_in_ruleFunctionModulePOJOImportingParameter752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_entryRuleFunctionModulePOJOExportingParameter778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOExportingParameter785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group__0_in_ruleFunctionModulePOJOExportingParameter812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_entryRuleFunctionModulePOJOChangingParameter838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOChangingParameter845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group__0_in_ruleFunctionModulePOJOChangingParameter872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_entryRuleFunctionModulePOJOTablesParameter898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOTablesParameter905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__Group__0_in_ruleFunctionModulePOJOTablesParameter932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataType__Alternatives_in_ruleDataType969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__InactiveAssignment_3_0_in_rule__StructureFieldPOJOMapping__Alternatives_31004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__Group_3_1__0_in_rule__StructureFieldPOJOMapping__Alternatives_31022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_rule__FunctionModulePOJOMapping__Alternatives1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_rule__FunctionModulePOJOMapping__Alternatives1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_rule__FunctionModulePOJOParameterMapping__Alternatives1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_rule__FunctionModulePOJOParameterMapping__Alternatives1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_rule__FunctionModulePOJOParameterMapping__Alternatives1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_rule__FunctionModulePOJOParameterMapping__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_0__0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_11187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_1__0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_11205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_2__0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_11223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_31256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_31274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_31307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_31325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_31358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__0_in_rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_31376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_0__0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_11409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_1__0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_11427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_2__0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_11445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_31478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_31496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_31529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_31547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_31580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__0_in_rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_31598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_0__0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_11631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_1__0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_11649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_2__0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_11667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_31700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_31718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_31751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_31769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_31802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__0_in_rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_31820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_0_in_rule__FunctionModulePOJOTablesParameter__Alternatives_31853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__Group_3_1__0_in_rule__FunctionModulePOJOTablesParameter__Alternatives_31871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__DataType__Alternatives1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DataType__Alternatives1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DataType__Alternatives1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DataType__Alternatives1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DataType__Alternatives1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DataType__Alternatives2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DataType__Alternatives2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DataType__Alternatives2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DataType__Alternatives2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DataType__Alternatives2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DataType__Alternatives2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DataType__Alternatives2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DataType__Alternatives2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DataType__Alternatives2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DataType__Alternatives2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Model__Group__02237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackageNameAssignment_1_in_rule__Model__Group__12275 = new BitSet(new long[]{0x0000000808000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StructuresAssignment_2_in_rule__Model__Group__22312 = new BitSet(new long[]{0x0000000808000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FunctionModulesAssignment_3_in_rule__Model__Group__32350 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_27_in_rule__Structure__Group__02394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Structure__Group__1_in_rule__Structure__Group__02404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__NameAssignment_1_in_rule__Structure__Group__12432 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Structure__Group__2_in_rule__Structure__Group__12441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Structure__Group__22470 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Structure__Group__3_in_rule__Structure__Group__22480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Structure__MappingAssignment_3_in_rule__Structure__Group__32508 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Structure__Group__4_in_rule__Structure__Group__32517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Structure__Group__42546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__StructurePOJOMapping__Group__02592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StructurePOJOMapping__Group__1_in_rule__StructurePOJOMapping__Group__02602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructurePOJOMapping__ClassNameAssignment_1_in_rule__StructurePOJOMapping__Group__12630 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__StructurePOJOMapping__Group__2_in_rule__StructurePOJOMapping__Group__12639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__StructurePOJOMapping__Group__22668 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_rule__StructurePOJOMapping__Group__3_in_rule__StructurePOJOMapping__Group__22678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructurePOJOMapping__Group_3__0_in_rule__StructurePOJOMapping__Group__32706 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_rule__StructurePOJOMapping__Group__4_in_rule__StructurePOJOMapping__Group__32716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__StructurePOJOMapping__Group__42745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructurePOJOMapping__FieldsAssignment_3_0_in_rule__StructurePOJOMapping__Group_3__02790 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__StructurePOJOMapping__Group_3__1_in_rule__StructurePOJOMapping__Group_3__02799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__StructurePOJOMapping__Group_3__12828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__StructureFieldPOJOMapping__Group__02868 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__Group__1_in_rule__StructureFieldPOJOMapping__Group__02878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__NameAssignment_1_in_rule__StructureFieldPOJOMapping__Group__12906 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__Group__2_in_rule__StructureFieldPOJOMapping__Group__12915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__StructureFieldPOJOMapping__Group__22944 = new BitSet(new long[]{0x0000080003FFF800L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__Group__3_in_rule__StructureFieldPOJOMapping__Group__22954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__Alternatives_3_in_rule__StructureFieldPOJOMapping__Group__32982 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__Group__4_in_rule__StructureFieldPOJOMapping__Group__32991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__Group_4__0_in_rule__StructureFieldPOJOMapping__Group__43019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__TypeAssignment_3_1_0_in_rule__StructureFieldPOJOMapping__Group_3_1__03064 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__Group_3_1__1_in_rule__StructureFieldPOJOMapping__Group_3_1__03073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_1_in_rule__StructureFieldPOJOMapping__Group_3_1__13101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__StructureFieldPOJOMapping__Group_4__03140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__Group_4__1_in_rule__StructureFieldPOJOMapping__Group_4__03150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructureFieldPOJOMapping__CommentAssignment_4_1_in_rule__StructureFieldPOJOMapping__Group_4__13178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FunctionModule__Group__03217 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__FunctionModule__Group__1_in_rule__FunctionModule__Group__03227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FunctionModule__Group__13256 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModule__Group__2_in_rule__FunctionModule__Group__13266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModule__NameAssignment_2_in_rule__FunctionModule__Group__23294 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FunctionModule__Group__3_in_rule__FunctionModule__Group__23303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FunctionModule__Group__33332 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_rule__FunctionModule__Group__4_in_rule__FunctionModule__Group__33342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModule__MappingAssignment_4_in_rule__FunctionModule__Group__43370 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__FunctionModule__Group__5_in_rule__FunctionModule__Group__43379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionModule__Group__53408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionModulePOJOCallMapping__Group__03456 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOCallMapping__Group__1_in_rule__FunctionModulePOJOCallMapping__Group__03466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOCallMapping__ClassNameAssignment_1_in_rule__FunctionModulePOJOCallMapping__Group__13494 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOCallMapping__Group__2_in_rule__FunctionModulePOJOCallMapping__Group__13503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FunctionModulePOJOCallMapping__Group__23532 = new BitSet(new long[]{0x0000078020000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOCallMapping__Group__3_in_rule__FunctionModulePOJOCallMapping__Group__23542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOCallMapping__ParametersAssignment_3_in_rule__FunctionModulePOJOCallMapping__Group__33570 = new BitSet(new long[]{0x0000078020000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOCallMapping__Group__4_in_rule__FunctionModulePOJOCallMapping__Group__33580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionModulePOJOCallMapping__Group__43609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FunctionModulePOJORequestResponseMapping__Group__03655 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__1_in_rule__FunctionModulePOJORequestResponseMapping__Group__03665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionModulePOJORequestResponseMapping__Group__13694 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__2_in_rule__FunctionModulePOJORequestResponseMapping__Group__13704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_2_in_rule__FunctionModulePOJORequestResponseMapping__Group__23732 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__3_in_rule__FunctionModulePOJORequestResponseMapping__Group__23741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FunctionModulePOJORequestResponseMapping__Group__33770 = new BitSet(new long[]{0x0000078020000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__4_in_rule__FunctionModulePOJORequestResponseMapping__Group__33780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_4_in_rule__FunctionModulePOJORequestResponseMapping__Group__43808 = new BitSet(new long[]{0x0000078020000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__5_in_rule__FunctionModulePOJORequestResponseMapping__Group__43818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionModulePOJORequestResponseMapping__Group__53847 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__6_in_rule__FunctionModulePOJORequestResponseMapping__Group__53857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FunctionModulePOJORequestResponseMapping__Group__63886 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__7_in_rule__FunctionModulePOJORequestResponseMapping__Group__63896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionModulePOJORequestResponseMapping__Group__73925 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__8_in_rule__FunctionModulePOJORequestResponseMapping__Group__73935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_8_in_rule__FunctionModulePOJORequestResponseMapping__Group__83963 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__9_in_rule__FunctionModulePOJORequestResponseMapping__Group__83972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FunctionModulePOJORequestResponseMapping__Group__94001 = new BitSet(new long[]{0x0000078020000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__10_in_rule__FunctionModulePOJORequestResponseMapping__Group__94011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_10_in_rule__FunctionModulePOJORequestResponseMapping__Group__104039 = new BitSet(new long[]{0x0000078020000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJORequestResponseMapping__Group__11_in_rule__FunctionModulePOJORequestResponseMapping__Group__104049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionModulePOJORequestResponseMapping__Group__114078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FunctionModulePOJOImportingParameter__Group__04138 = new BitSet(new long[]{0x0000040108000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group__1_in_rule__FunctionModulePOJOImportingParameter__Group__04148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Alternatives_1_in_rule__FunctionModulePOJOImportingParameter__Group__14176 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group__2_in_rule__FunctionModulePOJOImportingParameter__Group__14185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_2__0_in_rule__FunctionModulePOJOImportingParameter__Group__24213 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group__3_in_rule__FunctionModulePOJOImportingParameter__Group__24223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FunctionModulePOJOImportingParameter__Group__34252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__04296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_0__1_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__04306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_1_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__14334 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_0__2_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__14343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__24372 = new BitSet(new long[]{0x0000080003FFF800L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_0__3_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__24382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Alternatives_1_0_3_in_rule__FunctionModulePOJOImportingParameter__Group_1_0__34410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_0_in_rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__04452 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__1_in_rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__04461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_1_in_rule__FunctionModulePOJOImportingParameter__Group_1_0_3_1__14489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__04528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_1__1_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__04538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_1_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__14566 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_1__2_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__14575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__24604 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_1__3_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__24614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Alternatives_1_1_3_in_rule__FunctionModulePOJOImportingParameter__Group_1_1__34642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_0_in_rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__04684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__1_in_rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__04693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_1_in_rule__FunctionModulePOJOImportingParameter__Group_1_1_3_1__14721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_0_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__04759 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_2__1_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__04768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_1_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__14796 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_2__2_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__14805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__24834 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_2__3_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__24844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Alternatives_1_2_3_in_rule__FunctionModulePOJOImportingParameter__Group_1_2__34872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_0_in_rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__04914 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__1_in_rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__04923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_1_in_rule__FunctionModulePOJOImportingParameter__Group_1_2_3_1__14951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FunctionModulePOJOImportingParameter__Group_2__04990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__Group_2__1_in_rule__FunctionModulePOJOImportingParameter__Group_2__05000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_1_in_rule__FunctionModulePOJOImportingParameter__Group_2__15028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__FunctionModulePOJOExportingParameter__Group__05067 = new BitSet(new long[]{0x0000040108000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group__1_in_rule__FunctionModulePOJOExportingParameter__Group__05077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Alternatives_1_in_rule__FunctionModulePOJOExportingParameter__Group__15105 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group__2_in_rule__FunctionModulePOJOExportingParameter__Group__15114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_2__0_in_rule__FunctionModulePOJOExportingParameter__Group__25142 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group__3_in_rule__FunctionModulePOJOExportingParameter__Group__25152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FunctionModulePOJOExportingParameter__Group__35181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__05225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_0__1_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__05235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_1_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__15263 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_0__2_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__15272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__25301 = new BitSet(new long[]{0x0000080003FFF800L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_0__3_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__25311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Alternatives_1_0_3_in_rule__FunctionModulePOJOExportingParameter__Group_1_0__35339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_0_in_rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__05381 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__1_in_rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__05390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_1_in_rule__FunctionModulePOJOExportingParameter__Group_1_0_3_1__15418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__05457 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_1__1_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__05467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_1_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__15495 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_1__2_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__15504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__25533 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_1__3_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__25543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Alternatives_1_1_3_in_rule__FunctionModulePOJOExportingParameter__Group_1_1__35571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_0_in_rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__05613 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__1_in_rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__05622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_1_in_rule__FunctionModulePOJOExportingParameter__Group_1_1_3_1__15650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_0_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__05688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_2__1_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__05697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_1_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__15725 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_2__2_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__15734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__25763 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_2__3_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__25773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Alternatives_1_2_3_in_rule__FunctionModulePOJOExportingParameter__Group_1_2__35801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_0_in_rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__05843 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__1_in_rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__05852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_1_in_rule__FunctionModulePOJOExportingParameter__Group_1_2_3_1__15880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FunctionModulePOJOExportingParameter__Group_2__05919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__Group_2__1_in_rule__FunctionModulePOJOExportingParameter__Group_2__05929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_1_in_rule__FunctionModulePOJOExportingParameter__Group_2__15957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__FunctionModulePOJOChangingParameter__Group__05996 = new BitSet(new long[]{0x0000040108000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group__1_in_rule__FunctionModulePOJOChangingParameter__Group__06006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Alternatives_1_in_rule__FunctionModulePOJOChangingParameter__Group__16034 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group__2_in_rule__FunctionModulePOJOChangingParameter__Group__16043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_2__0_in_rule__FunctionModulePOJOChangingParameter__Group__26071 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group__3_in_rule__FunctionModulePOJOChangingParameter__Group__26081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FunctionModulePOJOChangingParameter__Group__36110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__06154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_0__1_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__06164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_1_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__16192 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_0__2_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__16201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__26230 = new BitSet(new long[]{0x0000080003FFF800L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_0__3_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__26240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Alternatives_1_0_3_in_rule__FunctionModulePOJOChangingParameter__Group_1_0__36268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_0_in_rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__06310 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__1_in_rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__06319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_1_in_rule__FunctionModulePOJOChangingParameter__Group_1_0_3_1__16347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__06386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_1__1_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__06396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_1_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__16424 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_1__2_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__16433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__26462 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_1__3_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__26472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Alternatives_1_1_3_in_rule__FunctionModulePOJOChangingParameter__Group_1_1__36500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_0_in_rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__06542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__1_in_rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__06551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_1_in_rule__FunctionModulePOJOChangingParameter__Group_1_1_3_1__16579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_0_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__06617 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_2__1_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__06626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_1_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__16654 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_2__2_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__16663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__26692 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_2__3_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__26702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Alternatives_1_2_3_in_rule__FunctionModulePOJOChangingParameter__Group_1_2__36730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_0_in_rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__06772 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__1_in_rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__06781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_1_in_rule__FunctionModulePOJOChangingParameter__Group_1_2_3_1__16809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FunctionModulePOJOChangingParameter__Group_2__06848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__Group_2__1_in_rule__FunctionModulePOJOChangingParameter__Group_2__06858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_1_in_rule__FunctionModulePOJOChangingParameter__Group_2__16886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FunctionModulePOJOTablesParameter__Group__06925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__Group__1_in_rule__FunctionModulePOJOTablesParameter__Group__06935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__NameAssignment_1_in_rule__FunctionModulePOJOTablesParameter__Group__16963 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__Group__2_in_rule__FunctionModulePOJOTablesParameter__Group__16972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionModulePOJOTablesParameter__Group__27001 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__Group__3_in_rule__FunctionModulePOJOTablesParameter__Group__27011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__Alternatives_3_in_rule__FunctionModulePOJOTablesParameter__Group__37039 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__Group__4_in_rule__FunctionModulePOJOTablesParameter__Group__37048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__Group_4__0_in_rule__FunctionModulePOJOTablesParameter__Group__47076 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__Group__5_in_rule__FunctionModulePOJOTablesParameter__Group__47086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FunctionModulePOJOTablesParameter__Group__57115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_0_in_rule__FunctionModulePOJOTablesParameter__Group_3_1__07162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__Group_3_1__1_in_rule__FunctionModulePOJOTablesParameter__Group_3_1__07171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_1_in_rule__FunctionModulePOJOTablesParameter__Group_3_1__17199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FunctionModulePOJOTablesParameter__Group_4__07238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__Group_4__1_in_rule__FunctionModulePOJOTablesParameter__Group_4__07248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_1_in_rule__FunctionModulePOJOTablesParameter__Group_4__17276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Model__PackageNameAssignment_17314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_rule__Model__StructuresAssignment_27345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_rule__Model__FunctionModulesAssignment_37376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Structure__NameAssignment_17407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureMapping_in_rule__Structure__MappingAssignment_37438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructurePOJOMapping__ClassNameAssignment_17469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_rule__StructurePOJOMapping__FieldsAssignment_3_07500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StructureFieldPOJOMapping__NameAssignment_17531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__StructureFieldPOJOMapping__InactiveAssignment_3_07567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__StructureFieldPOJOMapping__TypeAssignment_3_1_07606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StructureFieldPOJOMapping__AttributeAssignment_3_1_17637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StructureFieldPOJOMapping__CommentAssignment_4_17668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModule__NameAssignment_27699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_rule__FunctionModule__MappingAssignment_47730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOCallMapping__ClassNameAssignment_17761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_rule__FunctionModulePOJOCallMapping__ParametersAssignment_37792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJORequestResponseMapping__RequestClassNameAssignment_27823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_rule__FunctionModulePOJORequestResponseMapping__RequestParametersAssignment_47854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJORequestResponseMapping__ResponseClassNameAssignment_87885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_rule__FunctionModulePOJORequestResponseMapping__ResponseParametersAssignment_107916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOImportingParameter__NameAssignment_1_0_17947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_0_3_07983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__FunctionModulePOJOImportingParameter__TypeAssignment_1_0_3_1_08022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_0_3_1_18053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOImportingParameter__NameAssignment_1_1_18084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_1_3_08120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_1_3_1_08163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_1_3_1_18198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FunctionModulePOJOImportingParameter__TableAssignment_1_2_08234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOImportingParameter__NameAssignment_1_2_18273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FunctionModulePOJOImportingParameter__InactiveAssignment_1_2_3_08309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOImportingParameter__StructureAssignment_1_2_3_1_08352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOImportingParameter__AttributeAssignment_1_2_3_1_18387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOImportingParameter__CommentAssignment_2_18418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOExportingParameter__NameAssignment_1_0_18449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_0_3_08485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__FunctionModulePOJOExportingParameter__TypeAssignment_1_0_3_1_08524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_0_3_1_18555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOExportingParameter__NameAssignment_1_1_18586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_1_3_08622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_1_3_1_08665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_1_3_1_18700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FunctionModulePOJOExportingParameter__TableAssignment_1_2_08736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOExportingParameter__NameAssignment_1_2_18775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FunctionModulePOJOExportingParameter__InactiveAssignment_1_2_3_08811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOExportingParameter__StructureAssignment_1_2_3_1_08854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOExportingParameter__AttributeAssignment_1_2_3_1_18889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOExportingParameter__CommentAssignment_2_18920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOChangingParameter__NameAssignment_1_0_18951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_0_3_08987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataType_in_rule__FunctionModulePOJOChangingParameter__TypeAssignment_1_0_3_1_09026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_0_3_1_19057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOChangingParameter__NameAssignment_1_1_19088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_1_3_09124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_1_3_1_09167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_1_3_1_19202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FunctionModulePOJOChangingParameter__TableAssignment_1_2_09238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOChangingParameter__NameAssignment_1_2_19277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FunctionModulePOJOChangingParameter__InactiveAssignment_1_2_3_09313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOChangingParameter__StructureAssignment_1_2_3_1_09356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOChangingParameter__AttributeAssignment_1_2_3_1_19391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOChangingParameter__CommentAssignment_2_19422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOTablesParameter__NameAssignment_19453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__FunctionModulePOJOTablesParameter__InactiveAssignment_3_09489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOTablesParameter__StructureAssignment_3_1_09532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionModulePOJOTablesParameter__AttributeAssignment_3_1_19567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__FunctionModulePOJOTablesParameter__CommentAssignment_4_19598 = new BitSet(new long[]{0x0000000000000002L});

}