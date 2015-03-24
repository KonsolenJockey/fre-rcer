package net.sf.rcer.rfcgen.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import net.sf.rcer.rfcgen.services.RFCMappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRFCMappingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'import'", "'as'", "';'", "'structure'", "'{'", "'}'", "'class'", "'field'", "'='", "'inactive'", "'comment'", "'function'", "'module'", "'request'", "'response'", "'importing'", "'external'", "'table'", "'exporting'", "'changing'", "'BigDecimal'", "'BigInteger'", "'Boolean'", "'Byte'", "'ByteArray'", "'Char'", "'CharArray'", "'Date'", "'Double'", "'Float'", "'Integer'", "'Long'", "'Short'", "'String'", "'Time'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalRFCMappingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRFCMappingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRFCMappingParser.tokenNames; }
    public String getGrammarFileName() { return "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g"; }



     	private RFCMappingGrammarAccess grammarAccess;
     	
        public InternalRFCMappingParser(TokenStream input, RFCMappingGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected RFCMappingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:77:1: ruleModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_structures_3_0= ruleStructure ) )* ( (lv_functionModules_4_0= ruleFunctionModule ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_packageName_1_0=null;
        EObject lv_imports_2_0 = null;

        EObject lv_structures_3_0 = null;

        EObject lv_functionModules_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:80:28: ( (otherlv_0= 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_structures_3_0= ruleStructure ) )* ( (lv_functionModules_4_0= ruleFunctionModule ) )* ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_structures_3_0= ruleStructure ) )* ( (lv_functionModules_4_0= ruleFunctionModule ) )* )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:81:1: (otherlv_0= 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_structures_3_0= ruleStructure ) )* ( (lv_functionModules_4_0= ruleFunctionModule ) )* )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:81:3: otherlv_0= 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_structures_3_0= ruleStructure ) )* ( (lv_functionModules_4_0= ruleFunctionModule ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getPackageKeyword_0());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:85:1: ( (lv_packageName_1_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:86:1: (lv_packageName_1_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:86:1: (lv_packageName_1_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:87:3: lv_packageName_1_0= RULE_STRING
            {
            lv_packageName_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel139); 

            			newLeafNode(lv_packageName_1_0, grammarAccess.getModelAccess().getPackageNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"packageName",
                    		lv_packageName_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:103:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:104:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:104:1: (lv_imports_2_0= ruleImport )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:105:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel165);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:121:3: ( (lv_structures_3_0= ruleStructure ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:122:1: (lv_structures_3_0= ruleStructure )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:122:1: (lv_structures_3_0= ruleStructure )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:123:3: lv_structures_3_0= ruleStructure
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getStructuresStructureParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructure_in_ruleModel187);
            	    lv_structures_3_0=ruleStructure();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"structures",
            	            		lv_structures_3_0, 
            	            		"Structure");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:139:3: ( (lv_functionModules_4_0= ruleFunctionModule ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:140:1: (lv_functionModules_4_0= ruleFunctionModule )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:140:1: (lv_functionModules_4_0= ruleFunctionModule )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:141:3: lv_functionModules_4_0= ruleFunctionModule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getFunctionModulesFunctionModuleParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModule_in_ruleModel209);
            	    lv_functionModules_4_0=ruleFunctionModule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"functionModules",
            	            		lv_functionModules_4_0, 
            	            		"FunctionModule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:165:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:166:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:167:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName247);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName258); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:174:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:177:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:178:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:178:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:178:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName298); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:185:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:186:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedName317); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName332); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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


    // $ANTLR start "entryRuleImport"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:206:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:207:2: (iv_ruleImport= ruleImport EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:208:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport379);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport389); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:215:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_fullName_1_0= ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_fullName_1_0 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:218:28: ( (otherlv_0= 'import' ( (lv_fullName_1_0= ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:219:1: (otherlv_0= 'import' ( (lv_fullName_1_0= ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:219:1: (otherlv_0= 'import' ( (lv_fullName_1_0= ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:219:3: otherlv_0= 'import' ( (lv_fullName_1_0= ruleQualifiedName ) ) otherlv_2= 'as' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleImport426); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:223:1: ( (lv_fullName_1_0= ruleQualifiedName ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:224:1: (lv_fullName_1_0= ruleQualifiedName )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:224:1: (lv_fullName_1_0= ruleQualifiedName )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:225:3: lv_fullName_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getImportAccess().getFullNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport447);
            lv_fullName_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImportRule());
            	        }
                   		set(
                   			current, 
                   			"fullName",
                    		lv_fullName_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleImport459); 

                	newLeafNode(otherlv_2, grammarAccess.getImportAccess().getAsKeyword_2());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:245:1: ( (lv_name_3_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:246:1: (lv_name_3_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:246:1: (lv_name_3_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:247:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImport476); 

            			newLeafNode(lv_name_3_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleImport493); 

                	newLeafNode(otherlv_4, grammarAccess.getImportAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleStructure"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:275:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:276:2: (iv_ruleStructure= ruleStructure EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:277:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure529);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure539); 

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
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:284:1: ruleStructure returns [EObject current=null] : (otherlv_0= 'structure' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) otherlv_4= '}' ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mapping_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:287:28: ( (otherlv_0= 'structure' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) otherlv_4= '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:288:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) otherlv_4= '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:288:1: (otherlv_0= 'structure' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) otherlv_4= '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:288:3: otherlv_0= 'structure' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleStructure576); 

                	newLeafNode(otherlv_0, grammarAccess.getStructureAccess().getStructureKeyword_0());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:292:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:293:1: (lv_name_1_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:293:1: (lv_name_1_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:294:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructure593); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStructureAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructureRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStructure610); 

                	newLeafNode(otherlv_2, grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:314:1: ( (lv_mapping_3_0= ruleStructureMapping ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:315:1: (lv_mapping_3_0= ruleStructureMapping )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:315:1: (lv_mapping_3_0= ruleStructureMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:316:3: lv_mapping_3_0= ruleStructureMapping
            {
             
            	        newCompositeNode(grammarAccess.getStructureAccess().getMappingStructureMappingParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStructureMapping_in_ruleStructure631);
            lv_mapping_3_0=ruleStructureMapping();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStructureRule());
            	        }
                   		set(
                   			current, 
                   			"mapping",
                    		lv_mapping_3_0, 
                    		"StructureMapping");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleStructure643); 

                	newLeafNode(otherlv_4, grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleStructureMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:344:1: entryRuleStructureMapping returns [EObject current=null] : iv_ruleStructureMapping= ruleStructureMapping EOF ;
    public final EObject entryRuleStructureMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:345:2: (iv_ruleStructureMapping= ruleStructureMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:346:2: iv_ruleStructureMapping= ruleStructureMapping EOF
            {
             newCompositeNode(grammarAccess.getStructureMappingRule()); 
            pushFollow(FOLLOW_ruleStructureMapping_in_entryRuleStructureMapping679);
            iv_ruleStructureMapping=ruleStructureMapping();

            state._fsp--;

             current =iv_ruleStructureMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureMapping689); 

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
    // $ANTLR end "entryRuleStructureMapping"


    // $ANTLR start "ruleStructureMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:353:1: ruleStructureMapping returns [EObject current=null] : this_StructurePOJOMapping_0= ruleStructurePOJOMapping ;
    public final EObject ruleStructureMapping() throws RecognitionException {
        EObject current = null;

        EObject this_StructurePOJOMapping_0 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:356:28: (this_StructurePOJOMapping_0= ruleStructurePOJOMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:358:5: this_StructurePOJOMapping_0= ruleStructurePOJOMapping
            {
             
                    newCompositeNode(grammarAccess.getStructureMappingAccess().getStructurePOJOMappingParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleStructurePOJOMapping_in_ruleStructureMapping735);
            this_StructurePOJOMapping_0=ruleStructurePOJOMapping();

            state._fsp--;

             
                    current = this_StructurePOJOMapping_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleStructureMapping"


    // $ANTLR start "entryRuleStructurePOJOMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:374:1: entryRuleStructurePOJOMapping returns [EObject current=null] : iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF ;
    public final EObject entryRuleStructurePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructurePOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:375:2: (iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:376:2: iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF
            {
             newCompositeNode(grammarAccess.getStructurePOJOMappingRule()); 
            pushFollow(FOLLOW_ruleStructurePOJOMapping_in_entryRuleStructurePOJOMapping769);
            iv_ruleStructurePOJOMapping=ruleStructurePOJOMapping();

            state._fsp--;

             current =iv_ruleStructurePOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructurePOJOMapping779); 

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
    // $ANTLR end "entryRuleStructurePOJOMapping"


    // $ANTLR start "ruleStructurePOJOMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:383:1: ruleStructurePOJOMapping returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) otherlv_4= ';' )* otherlv_5= '}' ) ;
    public final EObject ruleStructurePOJOMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_fields_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:386:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) otherlv_4= ';' )* otherlv_5= '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:387:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) otherlv_4= ';' )* otherlv_5= '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:387:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) otherlv_4= ';' )* otherlv_5= '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:387:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) otherlv_4= ';' )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleStructurePOJOMapping816); 

                	newLeafNode(otherlv_0, grammarAccess.getStructurePOJOMappingAccess().getClassKeyword_0());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:391:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:392:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:392:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:393:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructurePOJOMapping833); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStructurePOJOMappingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructurePOJOMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStructurePOJOMapping850); 

                	newLeafNode(otherlv_2, grammarAccess.getStructurePOJOMappingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:413:1: ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) otherlv_4= ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:413:2: ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) otherlv_4= ';'
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:413:2: ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:414:1: (lv_fields_3_0= ruleStructureFieldPOJOMapping )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:414:1: (lv_fields_3_0= ruleStructureFieldPOJOMapping )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:415:3: lv_fields_3_0= ruleStructureFieldPOJOMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructurePOJOMappingAccess().getFieldsStructureFieldPOJOMappingParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping872);
            	    lv_fields_3_0=ruleStructureFieldPOJOMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructurePOJOMappingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fields",
            	            		lv_fields_3_0, 
            	            		"StructureFieldPOJOMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleStructurePOJOMapping884); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStructurePOJOMappingAccess().getSemicolonKeyword_3_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleStructurePOJOMapping898); 

                	newLeafNode(otherlv_5, grammarAccess.getStructurePOJOMappingAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleStructurePOJOMapping"


    // $ANTLR start "entryRuleStructureFieldPOJOMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:447:1: entryRuleStructureFieldPOJOMapping returns [EObject current=null] : iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF ;
    public final EObject entryRuleStructureFieldPOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureFieldPOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:448:2: (iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:449:2: iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF
            {
             newCompositeNode(grammarAccess.getStructureFieldPOJOMappingRule()); 
            pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_entryRuleStructureFieldPOJOMapping934);
            iv_ruleStructureFieldPOJOMapping=ruleStructureFieldPOJOMapping();

            state._fsp--;

             current =iv_ruleStructureFieldPOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureFieldPOJOMapping944); 

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
    // $ANTLR end "entryRuleStructureFieldPOJOMapping"


    // $ANTLR start "ruleStructureFieldPOJOMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:456:1: ruleStructureFieldPOJOMapping returns [EObject current=null] : (otherlv_0= 'field' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) (otherlv_6= 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleStructureFieldPOJOMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_inactive_3_0=null;
        Token lv_attribute_5_0=null;
        Token otherlv_6=null;
        Token lv_comment_7_0=null;
        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:459:28: ( (otherlv_0= 'field' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) (otherlv_6= 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:460:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) (otherlv_6= 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:460:1: (otherlv_0= 'field' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) (otherlv_6= 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:460:3: otherlv_0= 'field' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) (otherlv_6= 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleStructureFieldPOJOMapping981); 

                	newLeafNode(otherlv_0, grammarAccess.getStructureFieldPOJOMappingAccess().getFieldKeyword_0());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:464:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:465:1: (lv_name_1_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:465:1: (lv_name_1_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:466:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping998); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStructureFieldPOJOMappingAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStructureFieldPOJOMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleStructureFieldPOJOMapping1015); 

                	newLeafNode(otherlv_2, grammarAccess.getStructureFieldPOJOMappingAccess().getEqualsSignKeyword_2());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:486:1: ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=33 && LA6_0<=47)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:486:2: ( (lv_inactive_3_0= 'inactive' ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:486:2: ( (lv_inactive_3_0= 'inactive' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:487:1: (lv_inactive_3_0= 'inactive' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:487:1: (lv_inactive_3_0= 'inactive' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:488:3: lv_inactive_3_0= 'inactive'
                    {
                    lv_inactive_3_0=(Token)match(input,22,FOLLOW_22_in_ruleStructureFieldPOJOMapping1034); 

                            newLeafNode(lv_inactive_3_0, grammarAccess.getStructureFieldPOJOMappingAccess().getInactiveInactiveKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructureFieldPOJOMappingRule());
                    	        }
                           		setWithLastConsumed(current, "inactive", true, "inactive");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:502:6: ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:502:6: ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:502:7: ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:502:7: ( (lv_type_4_0= ruleDataType ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:503:1: (lv_type_4_0= ruleDataType )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:503:1: (lv_type_4_0= ruleDataType )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:504:3: lv_type_4_0= ruleDataType
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructureFieldPOJOMappingAccess().getTypeDataTypeEnumRuleCall_3_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleStructureFieldPOJOMapping1075);
                    lv_type_4_0=ruleDataType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructureFieldPOJOMappingRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_4_0, 
                            		"DataType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:520:2: ( (lv_attribute_5_0= RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:521:1: (lv_attribute_5_0= RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:521:1: (lv_attribute_5_0= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:522:3: lv_attribute_5_0= RULE_ID
                    {
                    lv_attribute_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping1092); 

                    			newLeafNode(lv_attribute_5_0, grammarAccess.getStructureFieldPOJOMappingAccess().getAttributeIDTerminalRuleCall_3_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructureFieldPOJOMappingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"attribute",
                            		lv_attribute_5_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:538:4: (otherlv_6= 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:538:6: otherlv_6= 'comment' ( (lv_comment_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleStructureFieldPOJOMapping1112); 

                        	newLeafNode(otherlv_6, grammarAccess.getStructureFieldPOJOMappingAccess().getCommentKeyword_4_0());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:542:1: ( (lv_comment_7_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:543:1: (lv_comment_7_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:543:1: (lv_comment_7_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:544:3: lv_comment_7_0= RULE_STRING
                    {
                    lv_comment_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping1129); 

                    			newLeafNode(lv_comment_7_0, grammarAccess.getStructureFieldPOJOMappingAccess().getCommentSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStructureFieldPOJOMappingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_7_0, 
                            		"STRING");
                    	    

                    }


                    }


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
    // $ANTLR end "ruleStructureFieldPOJOMapping"


    // $ANTLR start "entryRuleFunctionModule"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:568:1: entryRuleFunctionModule returns [EObject current=null] : iv_ruleFunctionModule= ruleFunctionModule EOF ;
    public final EObject entryRuleFunctionModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModule = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:569:2: (iv_ruleFunctionModule= ruleFunctionModule EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:570:2: iv_ruleFunctionModule= ruleFunctionModule EOF
            {
             newCompositeNode(grammarAccess.getFunctionModuleRule()); 
            pushFollow(FOLLOW_ruleFunctionModule_in_entryRuleFunctionModule1172);
            iv_ruleFunctionModule=ruleFunctionModule();

            state._fsp--;

             current =iv_ruleFunctionModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModule1182); 

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
    // $ANTLR end "entryRuleFunctionModule"


    // $ANTLR start "ruleFunctionModule"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:577:1: ruleFunctionModule returns [EObject current=null] : (otherlv_0= 'function' otherlv_1= 'module' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) otherlv_5= '}' ) ;
    public final EObject ruleFunctionModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_mapping_4_0 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:580:28: ( (otherlv_0= 'function' otherlv_1= 'module' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) otherlv_5= '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:581:1: (otherlv_0= 'function' otherlv_1= 'module' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) otherlv_5= '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:581:1: (otherlv_0= 'function' otherlv_1= 'module' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) otherlv_5= '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:581:3: otherlv_0= 'function' otherlv_1= 'module' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleFunctionModule1219); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionModuleAccess().getFunctionKeyword_0());
                
            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleFunctionModule1231); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionModuleAccess().getModuleKeyword_1());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:589:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:590:1: (lv_name_2_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:590:1: (lv_name_2_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:591:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModule1248); 

            			newLeafNode(lv_name_2_0, grammarAccess.getFunctionModuleAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionModuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFunctionModule1265); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionModuleAccess().getLeftCurlyBracketKeyword_3());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:611:1: ( (lv_mapping_4_0= ruleFunctionModuleMapping ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:612:1: (lv_mapping_4_0= ruleFunctionModuleMapping )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:612:1: (lv_mapping_4_0= ruleFunctionModuleMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:613:3: lv_mapping_4_0= ruleFunctionModuleMapping
            {
             
            	        newCompositeNode(grammarAccess.getFunctionModuleAccess().getMappingFunctionModuleMappingParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule1286);
            lv_mapping_4_0=ruleFunctionModuleMapping();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionModuleRule());
            	        }
                   		set(
                   			current, 
                   			"mapping",
                    		lv_mapping_4_0, 
                    		"FunctionModuleMapping");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleFunctionModule1298); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionModuleAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleFunctionModule"


    // $ANTLR start "entryRuleFunctionModuleMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:641:1: entryRuleFunctionModuleMapping returns [EObject current=null] : iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF ;
    public final EObject entryRuleFunctionModuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModuleMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:642:2: (iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:643:2: iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF
            {
             newCompositeNode(grammarAccess.getFunctionModuleMappingRule()); 
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_entryRuleFunctionModuleMapping1334);
            iv_ruleFunctionModuleMapping=ruleFunctionModuleMapping();

            state._fsp--;

             current =iv_ruleFunctionModuleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModuleMapping1344); 

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
    // $ANTLR end "entryRuleFunctionModuleMapping"


    // $ANTLR start "ruleFunctionModuleMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:650:1: ruleFunctionModuleMapping returns [EObject current=null] : this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping ;
    public final EObject ruleFunctionModuleMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOMapping_0 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:653:28: (this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:655:5: this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping
            {
             
                    newCompositeNode(grammarAccess.getFunctionModuleMappingAccess().getFunctionModulePOJOMappingParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping1390);
            this_FunctionModulePOJOMapping_0=ruleFunctionModulePOJOMapping();

            state._fsp--;

             
                    current = this_FunctionModulePOJOMapping_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleFunctionModuleMapping"


    // $ANTLR start "entryRuleFunctionModulePOJOMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:671:1: entryRuleFunctionModulePOJOMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:672:2: (iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:673:2: iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF
            {
             newCompositeNode(grammarAccess.getFunctionModulePOJOMappingRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_entryRuleFunctionModulePOJOMapping1424);
            iv_ruleFunctionModulePOJOMapping=ruleFunctionModulePOJOMapping();

            state._fsp--;

             current =iv_ruleFunctionModulePOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOMapping1434); 

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
    // $ANTLR end "entryRuleFunctionModulePOJOMapping"


    // $ANTLR start "ruleFunctionModulePOJOMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:680:1: ruleFunctionModulePOJOMapping returns [EObject current=null] : (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping ) ;
    public final EObject ruleFunctionModulePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOCallMapping_0 = null;

        EObject this_FunctionModulePOJORequestResponseMapping_1 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:683:28: ( (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:684:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:684:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:685:5: this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJOCallMappingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping1481);
                    this_FunctionModulePOJOCallMapping_0=ruleFunctionModulePOJOCallMapping();

                    state._fsp--;

                     
                            current = this_FunctionModulePOJOCallMapping_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:695:5: this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJORequestResponseMappingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping1508);
                    this_FunctionModulePOJORequestResponseMapping_1=ruleFunctionModulePOJORequestResponseMapping();

                    state._fsp--;

                     
                            current = this_FunctionModulePOJORequestResponseMapping_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleFunctionModulePOJOMapping"


    // $ANTLR start "entryRuleFunctionModulePOJOCallMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:711:1: entryRuleFunctionModulePOJOCallMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOCallMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOCallMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:712:2: (iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:713:2: iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF
            {
             newCompositeNode(grammarAccess.getFunctionModulePOJOCallMappingRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_entryRuleFunctionModulePOJOCallMapping1543);
            iv_ruleFunctionModulePOJOCallMapping=ruleFunctionModulePOJOCallMapping();

            state._fsp--;

             current =iv_ruleFunctionModulePOJOCallMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOCallMapping1553); 

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
    // $ANTLR end "entryRuleFunctionModulePOJOCallMapping"


    // $ANTLR start "ruleFunctionModulePOJOCallMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:720:1: ruleFunctionModulePOJOCallMapping returns [EObject current=null] : (otherlv_0= 'class' ( (lv_className_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_4= '}' ) ;
    public final EObject ruleFunctionModulePOJOCallMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_className_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameters_3_0 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:723:28: ( (otherlv_0= 'class' ( (lv_className_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_4= '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:724:1: (otherlv_0= 'class' ( (lv_className_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_4= '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:724:1: (otherlv_0= 'class' ( (lv_className_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_4= '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:724:3: otherlv_0= 'class' ( (lv_className_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOCallMapping1590); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassKeyword_0());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:728:1: ( (lv_className_1_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:729:1: (lv_className_1_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:729:1: (lv_className_1_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:730:3: lv_className_1_0= RULE_ID
            {
            lv_className_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping1607); 

            			newLeafNode(lv_className_1_0, grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionModulePOJOCallMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"className",
                    		lv_className_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOCallMapping1624); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionModulePOJOCallMappingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:750:1: ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28||(LA9_0>=30 && LA9_0<=32)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:751:1: (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:751:1: (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:752:3: lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getParametersFunctionModulePOJOParameterMappingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping1645);
            	    lv_parameters_3_0=ruleFunctionModulePOJOParameterMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionModulePOJOCallMappingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameters",
            	            		lv_parameters_3_0, 
            	            		"FunctionModulePOJOParameterMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOCallMapping1658); 

                	newLeafNode(otherlv_4, grammarAccess.getFunctionModulePOJOCallMappingAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleFunctionModulePOJOCallMapping"


    // $ANTLR start "entryRuleFunctionModulePOJORequestResponseMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:780:1: entryRuleFunctionModulePOJORequestResponseMapping returns [EObject current=null] : iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF ;
    public final EObject entryRuleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJORequestResponseMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:781:2: (iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:782:2: iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF
            {
             newCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_entryRuleFunctionModulePOJORequestResponseMapping1694);
            iv_ruleFunctionModulePOJORequestResponseMapping=ruleFunctionModulePOJORequestResponseMapping();

            state._fsp--;

             current =iv_ruleFunctionModulePOJORequestResponseMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJORequestResponseMapping1704); 

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
    // $ANTLR end "entryRuleFunctionModulePOJORequestResponseMapping"


    // $ANTLR start "ruleFunctionModulePOJORequestResponseMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:789:1: ruleFunctionModulePOJORequestResponseMapping returns [EObject current=null] : (otherlv_0= 'request' otherlv_1= 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_5= '}' otherlv_6= 'response' otherlv_7= 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) otherlv_9= '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_11= '}' ) ;
    public final EObject ruleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_requestClassName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_responseClassName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_requestParameters_4_0 = null;

        EObject lv_responseParameters_10_0 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:792:28: ( (otherlv_0= 'request' otherlv_1= 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_5= '}' otherlv_6= 'response' otherlv_7= 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) otherlv_9= '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_11= '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:793:1: (otherlv_0= 'request' otherlv_1= 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_5= '}' otherlv_6= 'response' otherlv_7= 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) otherlv_9= '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_11= '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:793:1: (otherlv_0= 'request' otherlv_1= 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_5= '}' otherlv_6= 'response' otherlv_7= 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) otherlv_9= '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_11= '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:793:3: otherlv_0= 'request' otherlv_1= 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_5= '}' otherlv_6= 'response' otherlv_7= 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) otherlv_9= '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleFunctionModulePOJORequestResponseMapping1741); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleFunctionModulePOJORequestResponseMapping1753); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_1());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:801:1: ( (lv_requestClassName_2_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:802:1: (lv_requestClassName_2_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:802:1: (lv_requestClassName_2_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:803:3: lv_requestClassName_2_0= RULE_ID
            {
            lv_requestClassName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1770); 

            			newLeafNode(lv_requestClassName_2_0, grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestClassNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionModulePOJORequestResponseMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"requestClassName",
                    		lv_requestClassName_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFunctionModulePOJORequestResponseMapping1787); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_3());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:823:1: ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28||(LA10_0>=30 && LA10_0<=32)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:824:1: (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:824:1: (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:825:3: lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestParametersFunctionModulePOJOParameterMappingParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1808);
            	    lv_requestParameters_4_0=ruleFunctionModulePOJOParameterMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionModulePOJORequestResponseMappingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"requestParameters",
            	            		lv_requestParameters_4_0, 
            	            		"FunctionModulePOJOParameterMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleFunctionModulePOJORequestResponseMapping1821); 

                	newLeafNode(otherlv_5, grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRightCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleFunctionModulePOJORequestResponseMapping1833); 

                	newLeafNode(otherlv_6, grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseKeyword_6());
                
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleFunctionModulePOJORequestResponseMapping1845); 

                	newLeafNode(otherlv_7, grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_7());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:853:1: ( (lv_responseClassName_8_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:854:1: (lv_responseClassName_8_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:854:1: (lv_responseClassName_8_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:855:3: lv_responseClassName_8_0= RULE_ID
            {
            lv_responseClassName_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1862); 

            			newLeafNode(lv_responseClassName_8_0, grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseClassNameIDTerminalRuleCall_8_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionModulePOJORequestResponseMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"responseClassName",
                    		lv_responseClassName_8_0, 
                    		"ID");
            	    

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleFunctionModulePOJORequestResponseMapping1879); 

                	newLeafNode(otherlv_9, grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_9());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:875:1: ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28||(LA11_0>=30 && LA11_0<=32)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:876:1: (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:876:1: (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:877:3: lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseParametersFunctionModulePOJOParameterMappingParserRuleCall_10_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1900);
            	    lv_responseParameters_10_0=ruleFunctionModulePOJOParameterMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionModulePOJORequestResponseMappingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"responseParameters",
            	            		lv_responseParameters_10_0, 
            	            		"FunctionModulePOJOParameterMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleFunctionModulePOJORequestResponseMapping1913); 

                	newLeafNode(otherlv_11, grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleFunctionModulePOJORequestResponseMapping"


    // $ANTLR start "entryRuleFunctionModulePOJOParameterMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:905:1: entryRuleFunctionModulePOJOParameterMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOParameterMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOParameterMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:906:2: (iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:907:2: iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF
            {
             newCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_entryRuleFunctionModulePOJOParameterMapping1949);
            iv_ruleFunctionModulePOJOParameterMapping=ruleFunctionModulePOJOParameterMapping();

            state._fsp--;

             current =iv_ruleFunctionModulePOJOParameterMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOParameterMapping1959); 

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
    // $ANTLR end "entryRuleFunctionModulePOJOParameterMapping"


    // $ANTLR start "ruleFunctionModulePOJOParameterMapping"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:914:1: ruleFunctionModulePOJOParameterMapping returns [EObject current=null] : (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter ) ;
    public final EObject ruleFunctionModulePOJOParameterMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOImportingParameter_0 = null;

        EObject this_FunctionModulePOJOExportingParameter_1 = null;

        EObject this_FunctionModulePOJOChangingParameter_2 = null;

        EObject this_FunctionModulePOJOTablesParameter_3 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:917:28: ( (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:918:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:918:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 32:
                {
                alt12=3;
                }
                break;
            case 30:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:919:5: this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOImportingParameterParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping2006);
                    this_FunctionModulePOJOImportingParameter_0=ruleFunctionModulePOJOImportingParameter();

                    state._fsp--;

                     
                            current = this_FunctionModulePOJOImportingParameter_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:929:5: this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOExportingParameterParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping2033);
                    this_FunctionModulePOJOExportingParameter_1=ruleFunctionModulePOJOExportingParameter();

                    state._fsp--;

                     
                            current = this_FunctionModulePOJOExportingParameter_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:939:5: this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOChangingParameterParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping2060);
                    this_FunctionModulePOJOChangingParameter_2=ruleFunctionModulePOJOChangingParameter();

                    state._fsp--;

                     
                            current = this_FunctionModulePOJOChangingParameter_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:949:5: this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOTablesParameterParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping2087);
                    this_FunctionModulePOJOTablesParameter_3=ruleFunctionModulePOJOTablesParameter();

                    state._fsp--;

                     
                            current = this_FunctionModulePOJOTablesParameter_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleFunctionModulePOJOParameterMapping"


    // $ANTLR start "entryRuleFunctionModulePOJOImportingParameter"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:965:1: entryRuleFunctionModulePOJOImportingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOImportingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOImportingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:966:2: (iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:967:2: iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF
            {
             newCompositeNode(grammarAccess.getFunctionModulePOJOImportingParameterRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_entryRuleFunctionModulePOJOImportingParameter2122);
            iv_ruleFunctionModulePOJOImportingParameter=ruleFunctionModulePOJOImportingParameter();

            state._fsp--;

             current =iv_ruleFunctionModulePOJOImportingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOImportingParameter2132); 

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
    // $ANTLR end "entryRuleFunctionModulePOJOImportingParameter"


    // $ANTLR start "ruleFunctionModulePOJOImportingParameter"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:974:1: ruleFunctionModulePOJOImportingParameter returns [EObject current=null] : (otherlv_0= 'importing' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';' ) ;
    public final EObject ruleFunctionModulePOJOImportingParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_inactive_4_0=null;
        Token lv_attribute_6_0=null;
        Token lv_structure_7_0=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token lv_inactive_10_0=null;
        Token otherlv_11=null;
        Token lv_attribute_12_0=null;
        Token lv_external_13_0=null;
        Token otherlv_14=null;
        Token lv_attribute_15_0=null;
        Token lv_table_16_0=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token lv_inactive_19_0=null;
        Token otherlv_20=null;
        Token lv_attribute_21_0=null;
        Token lv_external_22_0=null;
        Token otherlv_23=null;
        Token lv_attribute_24_0=null;
        Token otherlv_25=null;
        Token lv_comment_26_0=null;
        Token otherlv_27=null;
        Enumerator lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:977:28: ( (otherlv_0= 'importing' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:978:1: (otherlv_0= 'importing' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:978:1: (otherlv_0= 'importing' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:978:3: otherlv_0= 'importing' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleFunctionModulePOJOImportingParameter2169); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getImportingKeyword_0());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:982:1: ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt16=1;
                }
                break;
            case 16:
                {
                alt16=2;
                }
                break;
            case 30:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:982:2: (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:982:2: (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:982:4: otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOImportingParameter2183); 

                        	newLeafNode(otherlv_1, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getFieldKeyword_1_0_0());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:986:1: ( (lv_name_2_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:987:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:987:1: (lv_name_2_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:988:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2200); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOImportingParameter2217); 

                        	newLeafNode(otherlv_3, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_0_2());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1008:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==22) ) {
                        alt13=1;
                    }
                    else if ( ((LA13_0>=33 && LA13_0<=47)) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1008:2: ( (lv_inactive_4_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1008:2: ( (lv_inactive_4_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1009:1: (lv_inactive_4_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1009:1: (lv_inactive_4_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1010:3: lv_inactive_4_0= 'inactive'
                            {
                            lv_inactive_4_0=(Token)match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOImportingParameter2236); 

                                    newLeafNode(lv_inactive_4_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "inactive", true, "inactive");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1024:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1024:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1024:7: ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1024:7: ( (lv_type_5_0= ruleDataType ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1025:1: (lv_type_5_0= ruleDataType )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1025:1: (lv_type_5_0= ruleDataType )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1026:3: lv_type_5_0= ruleDataType
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleFunctionModulePOJOImportingParameter2277);
                            lv_type_5_0=ruleDataType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_5_0, 
                                    		"DataType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1042:2: ( (lv_attribute_6_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1043:1: (lv_attribute_6_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1043:1: (lv_attribute_6_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1044:3: lv_attribute_6_0= RULE_ID
                            {
                            lv_attribute_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2294); 

                            			newLeafNode(lv_attribute_6_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_6_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1061:6: ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1061:6: ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1061:7: ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1061:7: ( (lv_structure_7_0= 'structure' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1062:1: (lv_structure_7_0= 'structure' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1062:1: (lv_structure_7_0= 'structure' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1063:3: lv_structure_7_0= 'structure'
                    {
                    lv_structure_7_0=(Token)match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter2327); 

                            newLeafNode(lv_structure_7_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                    	        }
                           		setWithLastConsumed(current, "structure", true, "structure");
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1076:2: ( (lv_name_8_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1077:1: (lv_name_8_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1077:1: (lv_name_8_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1078:3: lv_name_8_0= RULE_STRING
                    {
                    lv_name_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2357); 

                    			newLeafNode(lv_name_8_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_8_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOImportingParameter2374); 

                        	newLeafNode(otherlv_9, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_1_2());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1098:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )
                    int alt14=3;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt14=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt14=2;
                        }
                        break;
                    case 29:
                        {
                        alt14=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1098:2: ( (lv_inactive_10_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1098:2: ( (lv_inactive_10_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1099:1: (lv_inactive_10_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1099:1: (lv_inactive_10_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1100:3: lv_inactive_10_0= 'inactive'
                            {
                            lv_inactive_10_0=(Token)match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOImportingParameter2393); 

                                    newLeafNode(lv_inactive_10_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "inactive", true, "inactive");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1114:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1114:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1114:7: ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1114:7: ( (otherlv_11= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1115:1: (otherlv_11= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1115:1: (otherlv_11= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1116:3: otherlv_11= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                    
                            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2433); 

                            		newLeafNode(otherlv_11, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_1_1_3_1_0_0()); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1127:2: ( (lv_attribute_12_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1128:1: (lv_attribute_12_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1128:1: (lv_attribute_12_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1129:3: lv_attribute_12_0= RULE_ID
                            {
                            lv_attribute_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2450); 

                            			newLeafNode(lv_attribute_12_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_12_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1146:6: ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1146:6: ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1146:7: ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1146:7: ( (lv_external_13_0= 'external' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1147:1: (lv_external_13_0= 'external' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1147:1: (lv_external_13_0= 'external' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1148:3: lv_external_13_0= 'external'
                            {
                            lv_external_13_0=(Token)match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOImportingParameter2481); 

                                    newLeafNode(lv_external_13_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getExternalExternalKeyword_1_1_3_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "external", true, "external");
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1161:2: ( (otherlv_14= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1162:1: (otherlv_14= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1162:1: (otherlv_14= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1163:3: otherlv_14= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                    
                            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2514); 

                            		newLeafNode(otherlv_14, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getExternalClassImportCrossReference_1_1_3_2_1_0()); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1174:2: ( (lv_attribute_15_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1175:1: (lv_attribute_15_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1175:1: (lv_attribute_15_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1176:3: lv_attribute_15_0= RULE_ID
                            {
                            lv_attribute_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2531); 

                            			newLeafNode(lv_attribute_15_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_2_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_15_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1193:6: ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1193:6: ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1193:7: ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1193:7: ( (lv_table_16_0= 'table' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1194:1: (lv_table_16_0= 'table' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1194:1: (lv_table_16_0= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1195:3: lv_table_16_0= 'table'
                    {
                    lv_table_16_0=(Token)match(input,30,FOLLOW_30_in_ruleFunctionModulePOJOImportingParameter2564); 

                            newLeafNode(lv_table_16_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTableTableKeyword_1_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                    	        }
                           		setWithLastConsumed(current, "table", true, "table");
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1208:2: ( (lv_name_17_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1209:1: (lv_name_17_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1209:1: (lv_name_17_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1210:3: lv_name_17_0= RULE_STRING
                    {
                    lv_name_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2594); 

                    			newLeafNode(lv_name_17_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_17_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOImportingParameter2611); 

                        	newLeafNode(otherlv_18, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_2_2());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1230:1: ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )
                    int alt15=3;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt15=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt15=2;
                        }
                        break;
                    case 29:
                        {
                        alt15=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1230:2: ( (lv_inactive_19_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1230:2: ( (lv_inactive_19_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1231:1: (lv_inactive_19_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1231:1: (lv_inactive_19_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1232:3: lv_inactive_19_0= 'inactive'
                            {
                            lv_inactive_19_0=(Token)match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOImportingParameter2630); 

                                    newLeafNode(lv_inactive_19_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "inactive", true, "inactive");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1246:6: ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1246:6: ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1246:7: ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1246:7: ( (otherlv_20= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1247:1: (otherlv_20= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1247:1: (otherlv_20= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1248:3: otherlv_20= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                    
                            otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2670); 

                            		newLeafNode(otherlv_20, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_1_2_3_1_0_0()); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1259:2: ( (lv_attribute_21_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1260:1: (lv_attribute_21_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1260:1: (lv_attribute_21_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1261:3: lv_attribute_21_0= RULE_ID
                            {
                            lv_attribute_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2687); 

                            			newLeafNode(lv_attribute_21_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_21_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1278:6: ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1278:6: ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1278:7: ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1278:7: ( (lv_external_22_0= 'external' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1279:1: (lv_external_22_0= 'external' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1279:1: (lv_external_22_0= 'external' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1280:3: lv_external_22_0= 'external'
                            {
                            lv_external_22_0=(Token)match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOImportingParameter2718); 

                                    newLeafNode(lv_external_22_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getExternalExternalKeyword_1_2_3_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "external", true, "external");
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1293:2: ( (otherlv_23= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1294:1: (otherlv_23= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1294:1: (otherlv_23= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1295:3: otherlv_23= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                    
                            otherlv_23=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2751); 

                            		newLeafNode(otherlv_23, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getExternalClassImportCrossReference_1_2_3_2_1_0()); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1306:2: ( (lv_attribute_24_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1307:1: (lv_attribute_24_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1307:1: (lv_attribute_24_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1308:3: lv_attribute_24_0= RULE_ID
                            {
                            lv_attribute_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2768); 

                            			newLeafNode(lv_attribute_24_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_2_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_24_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1324:6: (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1324:8: otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) )
                    {
                    otherlv_25=(Token)match(input,23,FOLLOW_23_in_ruleFunctionModulePOJOImportingParameter2790); 

                        	newLeafNode(otherlv_25, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentKeyword_2_0());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1328:1: ( (lv_comment_26_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1329:1: (lv_comment_26_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1329:1: (lv_comment_26_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1330:3: lv_comment_26_0= RULE_STRING
                    {
                    lv_comment_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2807); 

                    			newLeafNode(lv_comment_26_0, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOImportingParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_26_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOImportingParameter2826); 

                	newLeafNode(otherlv_27, grammarAccess.getFunctionModulePOJOImportingParameterAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleFunctionModulePOJOImportingParameter"


    // $ANTLR start "entryRuleFunctionModulePOJOExportingParameter"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1358:1: entryRuleFunctionModulePOJOExportingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOExportingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOExportingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1359:2: (iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1360:2: iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF
            {
             newCompositeNode(grammarAccess.getFunctionModulePOJOExportingParameterRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_entryRuleFunctionModulePOJOExportingParameter2862);
            iv_ruleFunctionModulePOJOExportingParameter=ruleFunctionModulePOJOExportingParameter();

            state._fsp--;

             current =iv_ruleFunctionModulePOJOExportingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOExportingParameter2872); 

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
    // $ANTLR end "entryRuleFunctionModulePOJOExportingParameter"


    // $ANTLR start "ruleFunctionModulePOJOExportingParameter"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1367:1: ruleFunctionModulePOJOExportingParameter returns [EObject current=null] : (otherlv_0= 'exporting' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';' ) ;
    public final EObject ruleFunctionModulePOJOExportingParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_inactive_4_0=null;
        Token lv_attribute_6_0=null;
        Token lv_structure_7_0=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token lv_inactive_10_0=null;
        Token otherlv_11=null;
        Token lv_attribute_12_0=null;
        Token lv_external_13_0=null;
        Token otherlv_14=null;
        Token lv_attribute_15_0=null;
        Token lv_table_16_0=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token lv_inactive_19_0=null;
        Token otherlv_20=null;
        Token lv_attribute_21_0=null;
        Token lv_external_22_0=null;
        Token otherlv_23=null;
        Token lv_attribute_24_0=null;
        Token otherlv_25=null;
        Token lv_comment_26_0=null;
        Token otherlv_27=null;
        Enumerator lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1370:28: ( (otherlv_0= 'exporting' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1371:1: (otherlv_0= 'exporting' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1371:1: (otherlv_0= 'exporting' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1371:3: otherlv_0= 'exporting' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleFunctionModulePOJOExportingParameter2909); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExportingKeyword_0());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1375:1: ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt21=1;
                }
                break;
            case 16:
                {
                alt21=2;
                }
                break;
            case 30:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1375:2: (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1375:2: (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1375:4: otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOExportingParameter2923); 

                        	newLeafNode(otherlv_1, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getFieldKeyword_1_0_0());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1379:1: ( (lv_name_2_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1380:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1380:1: (lv_name_2_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1381:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2940); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOExportingParameter2957); 

                        	newLeafNode(otherlv_3, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_0_2());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1401:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==22) ) {
                        alt18=1;
                    }
                    else if ( ((LA18_0>=33 && LA18_0<=47)) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1401:2: ( (lv_inactive_4_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1401:2: ( (lv_inactive_4_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1402:1: (lv_inactive_4_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1402:1: (lv_inactive_4_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1403:3: lv_inactive_4_0= 'inactive'
                            {
                            lv_inactive_4_0=(Token)match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOExportingParameter2976); 

                                    newLeafNode(lv_inactive_4_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "inactive", true, "inactive");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1417:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1417:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1417:7: ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1417:7: ( (lv_type_5_0= ruleDataType ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1418:1: (lv_type_5_0= ruleDataType )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1418:1: (lv_type_5_0= ruleDataType )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1419:3: lv_type_5_0= ruleDataType
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleFunctionModulePOJOExportingParameter3017);
                            lv_type_5_0=ruleDataType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_5_0, 
                                    		"DataType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1435:2: ( (lv_attribute_6_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1436:1: (lv_attribute_6_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1436:1: (lv_attribute_6_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1437:3: lv_attribute_6_0= RULE_ID
                            {
                            lv_attribute_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3034); 

                            			newLeafNode(lv_attribute_6_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_6_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1454:6: ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1454:6: ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1454:7: ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1454:7: ( (lv_structure_7_0= 'structure' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1455:1: (lv_structure_7_0= 'structure' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1455:1: (lv_structure_7_0= 'structure' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1456:3: lv_structure_7_0= 'structure'
                    {
                    lv_structure_7_0=(Token)match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter3067); 

                            newLeafNode(lv_structure_7_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                    	        }
                           		setWithLastConsumed(current, "structure", true, "structure");
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1469:2: ( (lv_name_8_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1470:1: (lv_name_8_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1470:1: (lv_name_8_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1471:3: lv_name_8_0= RULE_STRING
                    {
                    lv_name_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3097); 

                    			newLeafNode(lv_name_8_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_8_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOExportingParameter3114); 

                        	newLeafNode(otherlv_9, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_1_2());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1491:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )
                    int alt19=3;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt19=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt19=2;
                        }
                        break;
                    case 29:
                        {
                        alt19=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1491:2: ( (lv_inactive_10_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1491:2: ( (lv_inactive_10_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1492:1: (lv_inactive_10_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1492:1: (lv_inactive_10_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1493:3: lv_inactive_10_0= 'inactive'
                            {
                            lv_inactive_10_0=(Token)match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOExportingParameter3133); 

                                    newLeafNode(lv_inactive_10_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "inactive", true, "inactive");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1507:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1507:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1507:7: ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1507:7: ( (otherlv_11= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1508:1: (otherlv_11= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1508:1: (otherlv_11= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1509:3: otherlv_11= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                    
                            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3173); 

                            		newLeafNode(otherlv_11, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_1_1_3_1_0_0()); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1520:2: ( (lv_attribute_12_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1521:1: (lv_attribute_12_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1521:1: (lv_attribute_12_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1522:3: lv_attribute_12_0= RULE_ID
                            {
                            lv_attribute_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3190); 

                            			newLeafNode(lv_attribute_12_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_12_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1539:6: ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1539:6: ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1539:7: ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1539:7: ( (lv_external_13_0= 'external' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1540:1: (lv_external_13_0= 'external' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1540:1: (lv_external_13_0= 'external' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1541:3: lv_external_13_0= 'external'
                            {
                            lv_external_13_0=(Token)match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOExportingParameter3221); 

                                    newLeafNode(lv_external_13_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExternalExternalKeyword_1_1_3_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "external", true, "external");
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1554:2: ( (otherlv_14= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1555:1: (otherlv_14= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1555:1: (otherlv_14= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1556:3: otherlv_14= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                    
                            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3254); 

                            		newLeafNode(otherlv_14, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExternalClassImportCrossReference_1_1_3_2_1_0()); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1567:2: ( (lv_attribute_15_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1568:1: (lv_attribute_15_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1568:1: (lv_attribute_15_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1569:3: lv_attribute_15_0= RULE_ID
                            {
                            lv_attribute_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3271); 

                            			newLeafNode(lv_attribute_15_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_2_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_15_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1586:6: ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1586:6: ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1586:7: ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1586:7: ( (lv_table_16_0= 'table' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1587:1: (lv_table_16_0= 'table' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1587:1: (lv_table_16_0= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1588:3: lv_table_16_0= 'table'
                    {
                    lv_table_16_0=(Token)match(input,30,FOLLOW_30_in_ruleFunctionModulePOJOExportingParameter3304); 

                            newLeafNode(lv_table_16_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTableTableKeyword_1_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                    	        }
                           		setWithLastConsumed(current, "table", true, "table");
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1601:2: ( (lv_name_17_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1602:1: (lv_name_17_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1602:1: (lv_name_17_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1603:3: lv_name_17_0= RULE_STRING
                    {
                    lv_name_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3334); 

                    			newLeafNode(lv_name_17_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_17_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOExportingParameter3351); 

                        	newLeafNode(otherlv_18, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_2_2());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1623:1: ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )
                    int alt20=3;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt20=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt20=2;
                        }
                        break;
                    case 29:
                        {
                        alt20=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }

                    switch (alt20) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1623:2: ( (lv_inactive_19_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1623:2: ( (lv_inactive_19_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1624:1: (lv_inactive_19_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1624:1: (lv_inactive_19_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1625:3: lv_inactive_19_0= 'inactive'
                            {
                            lv_inactive_19_0=(Token)match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOExportingParameter3370); 

                                    newLeafNode(lv_inactive_19_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "inactive", true, "inactive");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1639:6: ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1639:6: ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1639:7: ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1639:7: ( (otherlv_20= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1640:1: (otherlv_20= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1640:1: (otherlv_20= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1641:3: otherlv_20= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                    
                            otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3410); 

                            		newLeafNode(otherlv_20, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_1_2_3_1_0_0()); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1652:2: ( (lv_attribute_21_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1653:1: (lv_attribute_21_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1653:1: (lv_attribute_21_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1654:3: lv_attribute_21_0= RULE_ID
                            {
                            lv_attribute_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3427); 

                            			newLeafNode(lv_attribute_21_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_21_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1671:6: ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1671:6: ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1671:7: ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1671:7: ( (lv_external_22_0= 'external' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1672:1: (lv_external_22_0= 'external' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1672:1: (lv_external_22_0= 'external' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1673:3: lv_external_22_0= 'external'
                            {
                            lv_external_22_0=(Token)match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOExportingParameter3458); 

                                    newLeafNode(lv_external_22_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExternalExternalKeyword_1_2_3_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "external", true, "external");
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1686:2: ( (otherlv_23= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1687:1: (otherlv_23= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1687:1: (otherlv_23= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1688:3: otherlv_23= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                    
                            otherlv_23=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3491); 

                            		newLeafNode(otherlv_23, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExternalClassImportCrossReference_1_2_3_2_1_0()); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1699:2: ( (lv_attribute_24_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1700:1: (lv_attribute_24_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1700:1: (lv_attribute_24_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1701:3: lv_attribute_24_0= RULE_ID
                            {
                            lv_attribute_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3508); 

                            			newLeafNode(lv_attribute_24_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_2_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_24_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1717:6: (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1717:8: otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) )
                    {
                    otherlv_25=(Token)match(input,23,FOLLOW_23_in_ruleFunctionModulePOJOExportingParameter3530); 

                        	newLeafNode(otherlv_25, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentKeyword_2_0());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1721:1: ( (lv_comment_26_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1722:1: (lv_comment_26_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1722:1: (lv_comment_26_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1723:3: lv_comment_26_0= RULE_STRING
                    {
                    lv_comment_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3547); 

                    			newLeafNode(lv_comment_26_0, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOExportingParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_26_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOExportingParameter3566); 

                	newLeafNode(otherlv_27, grammarAccess.getFunctionModulePOJOExportingParameterAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleFunctionModulePOJOExportingParameter"


    // $ANTLR start "entryRuleFunctionModulePOJOChangingParameter"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1751:1: entryRuleFunctionModulePOJOChangingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOChangingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOChangingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1752:2: (iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1753:2: iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF
            {
             newCompositeNode(grammarAccess.getFunctionModulePOJOChangingParameterRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_entryRuleFunctionModulePOJOChangingParameter3602);
            iv_ruleFunctionModulePOJOChangingParameter=ruleFunctionModulePOJOChangingParameter();

            state._fsp--;

             current =iv_ruleFunctionModulePOJOChangingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOChangingParameter3612); 

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
    // $ANTLR end "entryRuleFunctionModulePOJOChangingParameter"


    // $ANTLR start "ruleFunctionModulePOJOChangingParameter"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1760:1: ruleFunctionModulePOJOChangingParameter returns [EObject current=null] : (otherlv_0= 'changing' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';' ) ;
    public final EObject ruleFunctionModulePOJOChangingParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_inactive_4_0=null;
        Token lv_attribute_6_0=null;
        Token lv_structure_7_0=null;
        Token lv_name_8_0=null;
        Token otherlv_9=null;
        Token lv_inactive_10_0=null;
        Token otherlv_11=null;
        Token lv_attribute_12_0=null;
        Token lv_external_13_0=null;
        Token otherlv_14=null;
        Token lv_attribute_15_0=null;
        Token lv_table_16_0=null;
        Token lv_name_17_0=null;
        Token otherlv_18=null;
        Token lv_inactive_19_0=null;
        Token otherlv_20=null;
        Token lv_attribute_21_0=null;
        Token lv_external_22_0=null;
        Token otherlv_23=null;
        Token lv_attribute_24_0=null;
        Token otherlv_25=null;
        Token lv_comment_26_0=null;
        Token otherlv_27=null;
        Enumerator lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1763:28: ( (otherlv_0= 'changing' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1764:1: (otherlv_0= 'changing' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1764:1: (otherlv_0= 'changing' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1764:3: otherlv_0= 'changing' ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleFunctionModulePOJOChangingParameter3649); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getChangingKeyword_0());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1768:1: ( (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt26=1;
                }
                break;
            case 16:
                {
                alt26=2;
                }
                break;
            case 30:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1768:2: (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1768:2: (otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1768:4: otherlv_1= 'field' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOChangingParameter3663); 

                        	newLeafNode(otherlv_1, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getFieldKeyword_1_0_0());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1772:1: ( (lv_name_2_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1773:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1773:1: (lv_name_2_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1774:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3680); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOChangingParameter3697); 

                        	newLeafNode(otherlv_3, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_0_2());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1794:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==22) ) {
                        alt23=1;
                    }
                    else if ( ((LA23_0>=33 && LA23_0<=47)) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1794:2: ( (lv_inactive_4_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1794:2: ( (lv_inactive_4_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1795:1: (lv_inactive_4_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1795:1: (lv_inactive_4_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1796:3: lv_inactive_4_0= 'inactive'
                            {
                            lv_inactive_4_0=(Token)match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOChangingParameter3716); 

                                    newLeafNode(lv_inactive_4_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "inactive", true, "inactive");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1810:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1810:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1810:7: ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1810:7: ( (lv_type_5_0= ruleDataType ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1811:1: (lv_type_5_0= ruleDataType )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1811:1: (lv_type_5_0= ruleDataType )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1812:3: lv_type_5_0= ruleDataType
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleFunctionModulePOJOChangingParameter3757);
                            lv_type_5_0=ruleDataType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_5_0, 
                                    		"DataType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1828:2: ( (lv_attribute_6_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1829:1: (lv_attribute_6_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1829:1: (lv_attribute_6_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1830:3: lv_attribute_6_0= RULE_ID
                            {
                            lv_attribute_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3774); 

                            			newLeafNode(lv_attribute_6_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_6_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1847:6: ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1847:6: ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1847:7: ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) otherlv_9= '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1847:7: ( (lv_structure_7_0= 'structure' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1848:1: (lv_structure_7_0= 'structure' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1848:1: (lv_structure_7_0= 'structure' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1849:3: lv_structure_7_0= 'structure'
                    {
                    lv_structure_7_0=(Token)match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter3807); 

                            newLeafNode(lv_structure_7_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureKeyword_1_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                    	        }
                           		setWithLastConsumed(current, "structure", true, "structure");
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1862:2: ( (lv_name_8_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1863:1: (lv_name_8_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1863:1: (lv_name_8_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1864:3: lv_name_8_0= RULE_STRING
                    {
                    lv_name_8_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3837); 

                    			newLeafNode(lv_name_8_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_8_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOChangingParameter3854); 

                        	newLeafNode(otherlv_9, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_1_2());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1884:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )
                    int alt24=3;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt24=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt24=2;
                        }
                        break;
                    case 29:
                        {
                        alt24=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1884:2: ( (lv_inactive_10_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1884:2: ( (lv_inactive_10_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1885:1: (lv_inactive_10_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1885:1: (lv_inactive_10_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1886:3: lv_inactive_10_0= 'inactive'
                            {
                            lv_inactive_10_0=(Token)match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOChangingParameter3873); 

                                    newLeafNode(lv_inactive_10_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "inactive", true, "inactive");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1900:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1900:6: ( ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1900:7: ( (otherlv_11= RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1900:7: ( (otherlv_11= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1901:1: (otherlv_11= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1901:1: (otherlv_11= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1902:3: otherlv_11= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                    
                            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3913); 

                            		newLeafNode(otherlv_11, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_1_1_3_1_0_0()); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1913:2: ( (lv_attribute_12_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1914:1: (lv_attribute_12_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1914:1: (lv_attribute_12_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1915:3: lv_attribute_12_0= RULE_ID
                            {
                            lv_attribute_12_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3930); 

                            			newLeafNode(lv_attribute_12_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_12_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1932:6: ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1932:6: ( ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1932:7: ( (lv_external_13_0= 'external' ) ) ( (otherlv_14= RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1932:7: ( (lv_external_13_0= 'external' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1933:1: (lv_external_13_0= 'external' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1933:1: (lv_external_13_0= 'external' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1934:3: lv_external_13_0= 'external'
                            {
                            lv_external_13_0=(Token)match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOChangingParameter3961); 

                                    newLeafNode(lv_external_13_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getExternalExternalKeyword_1_1_3_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "external", true, "external");
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1947:2: ( (otherlv_14= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1948:1: (otherlv_14= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1948:1: (otherlv_14= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1949:3: otherlv_14= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                    
                            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3994); 

                            		newLeafNode(otherlv_14, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getExternalClassImportCrossReference_1_1_3_2_1_0()); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1960:2: ( (lv_attribute_15_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1961:1: (lv_attribute_15_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1961:1: (lv_attribute_15_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1962:3: lv_attribute_15_0= RULE_ID
                            {
                            lv_attribute_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4011); 

                            			newLeafNode(lv_attribute_15_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_2_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_15_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1979:6: ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1979:6: ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1979:7: ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) otherlv_18= '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1979:7: ( (lv_table_16_0= 'table' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1980:1: (lv_table_16_0= 'table' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1980:1: (lv_table_16_0= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1981:3: lv_table_16_0= 'table'
                    {
                    lv_table_16_0=(Token)match(input,30,FOLLOW_30_in_ruleFunctionModulePOJOChangingParameter4044); 

                            newLeafNode(lv_table_16_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTableTableKeyword_1_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                    	        }
                           		setWithLastConsumed(current, "table", true, "table");
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1994:2: ( (lv_name_17_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1995:1: (lv_name_17_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1995:1: (lv_name_17_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1996:3: lv_name_17_0= RULE_STRING
                    {
                    lv_name_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter4074); 

                    			newLeafNode(lv_name_17_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_17_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOChangingParameter4091); 

                        	newLeafNode(otherlv_18, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_2_2());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2016:1: ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )
                    int alt25=3;
                    switch ( input.LA(1) ) {
                    case 22:
                        {
                        alt25=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt25=2;
                        }
                        break;
                    case 29:
                        {
                        alt25=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2016:2: ( (lv_inactive_19_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2016:2: ( (lv_inactive_19_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2017:1: (lv_inactive_19_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2017:1: (lv_inactive_19_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2018:3: lv_inactive_19_0= 'inactive'
                            {
                            lv_inactive_19_0=(Token)match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOChangingParameter4110); 

                                    newLeafNode(lv_inactive_19_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "inactive", true, "inactive");
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2032:6: ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2032:6: ( ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2032:7: ( (otherlv_20= RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2032:7: ( (otherlv_20= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2033:1: (otherlv_20= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2033:1: (otherlv_20= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2034:3: otherlv_20= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                    
                            otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4150); 

                            		newLeafNode(otherlv_20, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_1_2_3_1_0_0()); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2045:2: ( (lv_attribute_21_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2046:1: (lv_attribute_21_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2046:1: (lv_attribute_21_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2047:3: lv_attribute_21_0= RULE_ID
                            {
                            lv_attribute_21_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4167); 

                            			newLeafNode(lv_attribute_21_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_21_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2064:6: ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2064:6: ( ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2064:7: ( (lv_external_22_0= 'external' ) ) ( (otherlv_23= RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2064:7: ( (lv_external_22_0= 'external' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2065:1: (lv_external_22_0= 'external' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2065:1: (lv_external_22_0= 'external' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2066:3: lv_external_22_0= 'external'
                            {
                            lv_external_22_0=(Token)match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOChangingParameter4198); 

                                    newLeafNode(lv_external_22_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getExternalExternalKeyword_1_2_3_2_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                   		setWithLastConsumed(current, "external", true, "external");
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2079:2: ( (otherlv_23= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2080:1: (otherlv_23= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2080:1: (otherlv_23= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2081:3: otherlv_23= RULE_ID
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                    
                            otherlv_23=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4231); 

                            		newLeafNode(otherlv_23, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getExternalClassImportCrossReference_1_2_3_2_1_0()); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2092:2: ( (lv_attribute_24_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2093:1: (lv_attribute_24_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2093:1: (lv_attribute_24_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2094:3: lv_attribute_24_0= RULE_ID
                            {
                            lv_attribute_24_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4248); 

                            			newLeafNode(lv_attribute_24_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_2_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"attribute",
                                    		lv_attribute_24_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2110:6: (otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2110:8: otherlv_25= 'comment' ( (lv_comment_26_0= RULE_STRING ) )
                    {
                    otherlv_25=(Token)match(input,23,FOLLOW_23_in_ruleFunctionModulePOJOChangingParameter4270); 

                        	newLeafNode(otherlv_25, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentKeyword_2_0());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2114:1: ( (lv_comment_26_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2115:1: (lv_comment_26_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2115:1: (lv_comment_26_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2116:3: lv_comment_26_0= RULE_STRING
                    {
                    lv_comment_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter4287); 

                    			newLeafNode(lv_comment_26_0, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOChangingParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_26_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_27=(Token)match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOChangingParameter4306); 

                	newLeafNode(otherlv_27, grammarAccess.getFunctionModulePOJOChangingParameterAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleFunctionModulePOJOChangingParameter"


    // $ANTLR start "entryRuleFunctionModulePOJOTablesParameter"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2144:1: entryRuleFunctionModulePOJOTablesParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOTablesParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOTablesParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2145:2: (iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2146:2: iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF
            {
             newCompositeNode(grammarAccess.getFunctionModulePOJOTablesParameterRule()); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_entryRuleFunctionModulePOJOTablesParameter4342);
            iv_ruleFunctionModulePOJOTablesParameter=ruleFunctionModulePOJOTablesParameter();

            state._fsp--;

             current =iv_ruleFunctionModulePOJOTablesParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOTablesParameter4352); 

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
    // $ANTLR end "entryRuleFunctionModulePOJOTablesParameter"


    // $ANTLR start "ruleFunctionModulePOJOTablesParameter"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2153:1: ruleFunctionModulePOJOTablesParameter returns [EObject current=null] : (otherlv_0= 'table' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (otherlv_4= RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) | ( ( (lv_external_6_0= 'external' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) ) ) (otherlv_9= 'comment' ( (lv_comment_10_0= RULE_STRING ) ) )? otherlv_11= ';' ) ;
    public final EObject ruleFunctionModulePOJOTablesParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_inactive_3_0=null;
        Token otherlv_4=null;
        Token lv_attribute_5_0=null;
        Token lv_external_6_0=null;
        Token otherlv_7=null;
        Token lv_attribute_8_0=null;
        Token otherlv_9=null;
        Token lv_comment_10_0=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2156:28: ( (otherlv_0= 'table' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (otherlv_4= RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) | ( ( (lv_external_6_0= 'external' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) ) ) (otherlv_9= 'comment' ( (lv_comment_10_0= RULE_STRING ) ) )? otherlv_11= ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2157:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (otherlv_4= RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) | ( ( (lv_external_6_0= 'external' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) ) ) (otherlv_9= 'comment' ( (lv_comment_10_0= RULE_STRING ) ) )? otherlv_11= ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2157:1: (otherlv_0= 'table' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (otherlv_4= RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) | ( ( (lv_external_6_0= 'external' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) ) ) (otherlv_9= 'comment' ( (lv_comment_10_0= RULE_STRING ) ) )? otherlv_11= ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2157:3: otherlv_0= 'table' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (otherlv_4= RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) | ( ( (lv_external_6_0= 'external' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) ) ) (otherlv_9= 'comment' ( (lv_comment_10_0= RULE_STRING ) ) )? otherlv_11= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleFunctionModulePOJOTablesParameter4389); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionModulePOJOTablesParameterAccess().getTableKeyword_0());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2161:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2162:1: (lv_name_1_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2162:1: (lv_name_1_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2163:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter4406); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFunctionModulePOJOTablesParameterAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionModulePOJOTablesParameterRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOTablesParameter4423); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionModulePOJOTablesParameterAccess().getEqualsSignKeyword_2());
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2183:1: ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (otherlv_4= RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) | ( ( (lv_external_6_0= 'external' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt28=1;
                }
                break;
            case RULE_ID:
                {
                alt28=2;
                }
                break;
            case 29:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2183:2: ( (lv_inactive_3_0= 'inactive' ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2183:2: ( (lv_inactive_3_0= 'inactive' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2184:1: (lv_inactive_3_0= 'inactive' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2184:1: (lv_inactive_3_0= 'inactive' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2185:3: lv_inactive_3_0= 'inactive'
                    {
                    lv_inactive_3_0=(Token)match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOTablesParameter4442); 

                            newLeafNode(lv_inactive_3_0, grammarAccess.getFunctionModulePOJOTablesParameterAccess().getInactiveInactiveKeyword_3_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOTablesParameterRule());
                    	        }
                           		setWithLastConsumed(current, "inactive", true, "inactive");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2199:6: ( ( (otherlv_4= RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2199:6: ( ( (otherlv_4= RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2199:7: ( (otherlv_4= RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2199:7: ( (otherlv_4= RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2200:1: (otherlv_4= RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2200:1: (otherlv_4= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2201:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOTablesParameterRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4482); 

                    		newLeafNode(otherlv_4, grammarAccess.getFunctionModulePOJOTablesParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_3_1_0_0()); 
                    	

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2212:2: ( (lv_attribute_5_0= RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2213:1: (lv_attribute_5_0= RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2213:1: (lv_attribute_5_0= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2214:3: lv_attribute_5_0= RULE_ID
                    {
                    lv_attribute_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4499); 

                    			newLeafNode(lv_attribute_5_0, grammarAccess.getFunctionModulePOJOTablesParameterAccess().getAttributeIDTerminalRuleCall_3_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOTablesParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"attribute",
                            		lv_attribute_5_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2231:6: ( ( (lv_external_6_0= 'external' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2231:6: ( ( (lv_external_6_0= 'external' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2231:7: ( (lv_external_6_0= 'external' ) ) ( (otherlv_7= RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2231:7: ( (lv_external_6_0= 'external' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2232:1: (lv_external_6_0= 'external' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2232:1: (lv_external_6_0= 'external' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2233:3: lv_external_6_0= 'external'
                    {
                    lv_external_6_0=(Token)match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOTablesParameter4530); 

                            newLeafNode(lv_external_6_0, grammarAccess.getFunctionModulePOJOTablesParameterAccess().getExternalExternalKeyword_3_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOTablesParameterRule());
                    	        }
                           		setWithLastConsumed(current, "external", true, "external");
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2246:2: ( (otherlv_7= RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2247:1: (otherlv_7= RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2247:1: (otherlv_7= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2248:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOTablesParameterRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4563); 

                    		newLeafNode(otherlv_7, grammarAccess.getFunctionModulePOJOTablesParameterAccess().getExternalClassImportCrossReference_3_2_1_0()); 
                    	

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2259:2: ( (lv_attribute_8_0= RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2260:1: (lv_attribute_8_0= RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2260:1: (lv_attribute_8_0= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2261:3: lv_attribute_8_0= RULE_ID
                    {
                    lv_attribute_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4580); 

                    			newLeafNode(lv_attribute_8_0, grammarAccess.getFunctionModulePOJOTablesParameterAccess().getAttributeIDTerminalRuleCall_3_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOTablesParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"attribute",
                            		lv_attribute_8_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2277:4: (otherlv_9= 'comment' ( (lv_comment_10_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2277:6: otherlv_9= 'comment' ( (lv_comment_10_0= RULE_STRING ) )
                    {
                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleFunctionModulePOJOTablesParameter4600); 

                        	newLeafNode(otherlv_9, grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentKeyword_4_0());
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2281:1: ( (lv_comment_10_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2282:1: (lv_comment_10_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2282:1: (lv_comment_10_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2283:3: lv_comment_10_0= RULE_STRING
                    {
                    lv_comment_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter4617); 

                    			newLeafNode(lv_comment_10_0, grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentSTRINGTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionModulePOJOTablesParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_10_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOTablesParameter4636); 

                	newLeafNode(otherlv_11, grammarAccess.getFunctionModulePOJOTablesParameterAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleFunctionModulePOJOTablesParameter"


    // $ANTLR start "ruleDataType"
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2311:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'BigDecimal' ) | (enumLiteral_1= 'BigInteger' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Byte' ) | (enumLiteral_4= 'ByteArray' ) | (enumLiteral_5= 'Char' ) | (enumLiteral_6= 'CharArray' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'Double' ) | (enumLiteral_9= 'Float' ) | (enumLiteral_10= 'Integer' ) | (enumLiteral_11= 'Long' ) | (enumLiteral_12= 'Short' ) | (enumLiteral_13= 'String' ) | (enumLiteral_14= 'Time' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;

         enterRule(); 
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2313:28: ( ( (enumLiteral_0= 'BigDecimal' ) | (enumLiteral_1= 'BigInteger' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Byte' ) | (enumLiteral_4= 'ByteArray' ) | (enumLiteral_5= 'Char' ) | (enumLiteral_6= 'CharArray' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'Double' ) | (enumLiteral_9= 'Float' ) | (enumLiteral_10= 'Integer' ) | (enumLiteral_11= 'Long' ) | (enumLiteral_12= 'Short' ) | (enumLiteral_13= 'String' ) | (enumLiteral_14= 'Time' ) ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2314:1: ( (enumLiteral_0= 'BigDecimal' ) | (enumLiteral_1= 'BigInteger' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Byte' ) | (enumLiteral_4= 'ByteArray' ) | (enumLiteral_5= 'Char' ) | (enumLiteral_6= 'CharArray' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'Double' ) | (enumLiteral_9= 'Float' ) | (enumLiteral_10= 'Integer' ) | (enumLiteral_11= 'Long' ) | (enumLiteral_12= 'Short' ) | (enumLiteral_13= 'String' ) | (enumLiteral_14= 'Time' ) )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2314:1: ( (enumLiteral_0= 'BigDecimal' ) | (enumLiteral_1= 'BigInteger' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Byte' ) | (enumLiteral_4= 'ByteArray' ) | (enumLiteral_5= 'Char' ) | (enumLiteral_6= 'CharArray' ) | (enumLiteral_7= 'Date' ) | (enumLiteral_8= 'Double' ) | (enumLiteral_9= 'Float' ) | (enumLiteral_10= 'Integer' ) | (enumLiteral_11= 'Long' ) | (enumLiteral_12= 'Short' ) | (enumLiteral_13= 'String' ) | (enumLiteral_14= 'Time' ) )
            int alt30=15;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt30=1;
                }
                break;
            case 34:
                {
                alt30=2;
                }
                break;
            case 35:
                {
                alt30=3;
                }
                break;
            case 36:
                {
                alt30=4;
                }
                break;
            case 37:
                {
                alt30=5;
                }
                break;
            case 38:
                {
                alt30=6;
                }
                break;
            case 39:
                {
                alt30=7;
                }
                break;
            case 40:
                {
                alt30=8;
                }
                break;
            case 41:
                {
                alt30=9;
                }
                break;
            case 42:
                {
                alt30=10;
                }
                break;
            case 43:
                {
                alt30=11;
                }
                break;
            case 44:
                {
                alt30=12;
                }
                break;
            case 45:
                {
                alt30=13;
                }
                break;
            case 46:
                {
                alt30=14;
                }
                break;
            case 47:
                {
                alt30=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2314:2: (enumLiteral_0= 'BigDecimal' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2314:2: (enumLiteral_0= 'BigDecimal' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2314:4: enumLiteral_0= 'BigDecimal'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleDataType4686); 

                            current = grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2320:6: (enumLiteral_1= 'BigInteger' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2320:6: (enumLiteral_1= 'BigInteger' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2320:8: enumLiteral_1= 'BigInteger'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleDataType4703); 

                            current = grammarAccess.getDataTypeAccess().getBIG_INTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getBIG_INTEGEREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2326:6: (enumLiteral_2= 'Boolean' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2326:6: (enumLiteral_2= 'Boolean' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2326:8: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleDataType4720); 

                            current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2332:6: (enumLiteral_3= 'Byte' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2332:6: (enumLiteral_3= 'Byte' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2332:8: enumLiteral_3= 'Byte'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_36_in_ruleDataType4737); 

                            current = grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2338:6: (enumLiteral_4= 'ByteArray' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2338:6: (enumLiteral_4= 'ByteArray' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2338:8: enumLiteral_4= 'ByteArray'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_37_in_ruleDataType4754); 

                            current = grammarAccess.getDataTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getDataTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2344:6: (enumLiteral_5= 'Char' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2344:6: (enumLiteral_5= 'Char' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2344:8: enumLiteral_5= 'Char'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_38_in_ruleDataType4771); 

                            current = grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2350:6: (enumLiteral_6= 'CharArray' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2350:6: (enumLiteral_6= 'CharArray' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2350:8: enumLiteral_6= 'CharArray'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_39_in_ruleDataType4788); 

                            current = grammarAccess.getDataTypeAccess().getCHAR_ARRAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getDataTypeAccess().getCHAR_ARRAYEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2356:6: (enumLiteral_7= 'Date' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2356:6: (enumLiteral_7= 'Date' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2356:8: enumLiteral_7= 'Date'
                    {
                    enumLiteral_7=(Token)match(input,40,FOLLOW_40_in_ruleDataType4805); 

                            current = grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2362:6: (enumLiteral_8= 'Double' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2362:6: (enumLiteral_8= 'Double' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2362:8: enumLiteral_8= 'Double'
                    {
                    enumLiteral_8=(Token)match(input,41,FOLLOW_41_in_ruleDataType4822); 

                            current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2368:6: (enumLiteral_9= 'Float' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2368:6: (enumLiteral_9= 'Float' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2368:8: enumLiteral_9= 'Float'
                    {
                    enumLiteral_9=(Token)match(input,42,FOLLOW_42_in_ruleDataType4839); 

                            current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2374:6: (enumLiteral_10= 'Integer' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2374:6: (enumLiteral_10= 'Integer' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2374:8: enumLiteral_10= 'Integer'
                    {
                    enumLiteral_10=(Token)match(input,43,FOLLOW_43_in_ruleDataType4856); 

                            current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2380:6: (enumLiteral_11= 'Long' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2380:6: (enumLiteral_11= 'Long' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2380:8: enumLiteral_11= 'Long'
                    {
                    enumLiteral_11=(Token)match(input,44,FOLLOW_44_in_ruleDataType4873); 

                            current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2386:6: (enumLiteral_12= 'Short' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2386:6: (enumLiteral_12= 'Short' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2386:8: enumLiteral_12= 'Short'
                    {
                    enumLiteral_12=(Token)match(input,45,FOLLOW_45_in_ruleDataType4890); 

                            current = grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2392:6: (enumLiteral_13= 'String' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2392:6: (enumLiteral_13= 'String' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2392:8: enumLiteral_13= 'String'
                    {
                    enumLiteral_13=(Token)match(input,46,FOLLOW_46_in_ruleDataType4907); 

                            current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2398:6: (enumLiteral_14= 'Time' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2398:6: (enumLiteral_14= 'Time' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2398:8: enumLiteral_14= 'Time'
                    {
                    enumLiteral_14=(Token)match(input,47,FOLLOW_47_in_ruleDataType4924); 

                            current = grammarAccess.getDataTypeAccess().getTIMEEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getDataTypeAccess().getTIMEEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleDataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel139 = new BitSet(new long[]{0x0000000001012002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel165 = new BitSet(new long[]{0x0000000001012002L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleModel187 = new BitSet(new long[]{0x0000000001010002L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_ruleModel209 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName298 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName317 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName332 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport426 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport447 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImport459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImport476 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStructure576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructure593 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStructure610 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleStructureMapping_in_ruleStructure631 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructure643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureMapping_in_entryRuleStructureMapping679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureMapping689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructurePOJOMapping_in_ruleStructureMapping735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructurePOJOMapping_in_entryRuleStructurePOJOMapping769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructurePOJOMapping779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleStructurePOJOMapping816 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructurePOJOMapping833 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStructurePOJOMapping850 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping872 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStructurePOJOMapping884 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18_in_ruleStructurePOJOMapping898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_entryRuleStructureFieldPOJOMapping934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureFieldPOJOMapping944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleStructureFieldPOJOMapping981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping998 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStructureFieldPOJOMapping1015 = new BitSet(new long[]{0x0000FFFE00400000L});
    public static final BitSet FOLLOW_22_in_ruleStructureFieldPOJOMapping1034 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleStructureFieldPOJOMapping1075 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping1092 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleStructureFieldPOJOMapping1112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_entryRuleFunctionModule1172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModule1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModule1219 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModule1231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModule1248 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModule1265 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule1286 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModule1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_entryRuleFunctionModuleMapping1334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModuleMapping1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_entryRuleFunctionModulePOJOMapping1424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOMapping1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_entryRuleFunctionModulePOJOCallMapping1543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOCallMapping1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOCallMapping1590 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping1607 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOCallMapping1624 = new BitSet(new long[]{0x00000001D0040000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping1645 = new BitSet(new long[]{0x00000001D0040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOCallMapping1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_entryRuleFunctionModulePOJORequestResponseMapping1694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJORequestResponseMapping1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJORequestResponseMapping1741 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJORequestResponseMapping1753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1770 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJORequestResponseMapping1787 = new BitSet(new long[]{0x00000001D0040000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1808 = new BitSet(new long[]{0x00000001D0040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJORequestResponseMapping1821 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionModulePOJORequestResponseMapping1833 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJORequestResponseMapping1845 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1862 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJORequestResponseMapping1879 = new BitSet(new long[]{0x00000001D0040000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1900 = new BitSet(new long[]{0x00000001D0040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJORequestResponseMapping1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_entryRuleFunctionModulePOJOParameterMapping1949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOParameterMapping1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_entryRuleFunctionModulePOJOImportingParameter2122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOImportingParameter2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFunctionModulePOJOImportingParameter2169 = new BitSet(new long[]{0x0000000040110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOImportingParameter2183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2200 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOImportingParameter2217 = new BitSet(new long[]{0x0000FFFE00400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOImportingParameter2236 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunctionModulePOJOImportingParameter2277 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2294 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter2327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2357 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOImportingParameter2374 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOImportingParameter2393 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2450 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOImportingParameter2481 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2514 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2531 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionModulePOJOImportingParameter2564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2594 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOImportingParameter2611 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOImportingParameter2630 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2670 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2687 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOImportingParameter2718 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2751 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2768 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJOImportingParameter2790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2807 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOImportingParameter2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_entryRuleFunctionModulePOJOExportingParameter2862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOExportingParameter2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFunctionModulePOJOExportingParameter2909 = new BitSet(new long[]{0x0000000040110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOExportingParameter2923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2940 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOExportingParameter2957 = new BitSet(new long[]{0x0000FFFE00400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOExportingParameter2976 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunctionModulePOJOExportingParameter3017 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3034 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter3067 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3097 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOExportingParameter3114 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOExportingParameter3133 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3173 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3190 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOExportingParameter3221 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3254 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3271 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionModulePOJOExportingParameter3304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3334 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOExportingParameter3351 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOExportingParameter3370 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3427 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOExportingParameter3458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3491 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3508 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJOExportingParameter3530 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3547 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOExportingParameter3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_entryRuleFunctionModulePOJOChangingParameter3602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOChangingParameter3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFunctionModulePOJOChangingParameter3649 = new BitSet(new long[]{0x0000000040110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOChangingParameter3663 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3680 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOChangingParameter3697 = new BitSet(new long[]{0x0000FFFE00400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOChangingParameter3716 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunctionModulePOJOChangingParameter3757 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3774 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter3807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3837 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOChangingParameter3854 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOChangingParameter3873 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3913 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3930 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOChangingParameter3961 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3994 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4011 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionModulePOJOChangingParameter4044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter4074 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOChangingParameter4091 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOChangingParameter4110 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4167 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOChangingParameter4198 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4231 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4248 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJOChangingParameter4270 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter4287 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOChangingParameter4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_entryRuleFunctionModulePOJOTablesParameter4342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOTablesParameter4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFunctionModulePOJOTablesParameter4389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter4406 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOTablesParameter4423 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOTablesParameter4442 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4482 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4499 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOTablesParameter4530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4563 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4580 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJOTablesParameter4600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter4617 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOTablesParameter4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDataType4686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDataType4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDataType4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDataType4737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDataType4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataType4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDataType4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDataType4805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDataType4822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDataType4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDataType4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDataType4873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDataType4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDataType4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDataType4924 = new BitSet(new long[]{0x0000000000000002L});

}