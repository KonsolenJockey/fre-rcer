package net.sf.rcer.rfcgen.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import net.sf.rcer.rfcgen.services.RFCMappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRFCMappingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'structure'", "'{'", "'}'", "'class'", "';'", "'field'", "'='", "'inactive'", "'comment'", "'function'", "'module'", "'request'", "'response'", "'importing'", "'table'", "'exporting'", "'changing'", "'BigDecimal'", "'BigInteger'", "'Boolean'", "'Byte'", "'ByteArray'", "'Char'", "'CharArray'", "'Date'", "'Double'", "'Float'", "'Integer'", "'Long'", "'Short'", "'String'", "'Time'"
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
    public String getGrammarFileName() { return "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g"; }



     	private RFCMappingGrammarAccess grammarAccess;
     	
        public InternalRFCMappingParser(TokenStream input, IAstFactory factory, RFCMappingGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected RFCMappingGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:78:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:79:2: (iv_ruleModel= ruleModel EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:80:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:87:1: ruleModel returns [EObject current=null] : ( 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_structures_2_0= ruleStructure ) )* ( (lv_functionModules_3_0= ruleFunctionModule ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_packageName_1_0=null;
        EObject lv_structures_2_0 = null;

        EObject lv_functionModules_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:92:6: ( ( 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_structures_2_0= ruleStructure ) )* ( (lv_functionModules_3_0= ruleFunctionModule ) )* ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:93:1: ( 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_structures_2_0= ruleStructure ) )* ( (lv_functionModules_3_0= ruleFunctionModule ) )* )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:93:1: ( 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_structures_2_0= ruleStructure ) )* ( (lv_functionModules_3_0= ruleFunctionModule ) )* )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:93:3: 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_structures_2_0= ruleStructure ) )* ( (lv_functionModules_3_0= ruleFunctionModule ) )*
            {
            match(input,11,FOLLOW_11_in_ruleModel120); 

                    createLeafNode(grammarAccess.getModelAccess().getPackageKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:97:1: ( (lv_packageName_1_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:98:1: (lv_packageName_1_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:98:1: (lv_packageName_1_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:99:3: lv_packageName_1_0= RULE_STRING
            {
            lv_packageName_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel137); 

            			createLeafNode(grammarAccess.getModelAccess().getPackageNameSTRINGTerminalRuleCall_1_0(), "packageName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"packageName",
            	        		lv_packageName_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:121:2: ( (lv_structures_2_0= ruleStructure ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:122:1: (lv_structures_2_0= ruleStructure )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:122:1: (lv_structures_2_0= ruleStructure )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:123:3: lv_structures_2_0= ruleStructure
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getStructuresStructureParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructure_in_ruleModel163);
            	    lv_structures_2_0=ruleStructure();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"structures",
            	    	        		lv_structures_2_0, 
            	    	        		"Structure", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:145:3: ( (lv_functionModules_3_0= ruleFunctionModule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:146:1: (lv_functionModules_3_0= ruleFunctionModule )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:146:1: (lv_functionModules_3_0= ruleFunctionModule )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:147:3: lv_functionModules_3_0= ruleFunctionModule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getFunctionModulesFunctionModuleParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModule_in_ruleModel185);
            	    lv_functionModules_3_0=ruleFunctionModule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"functionModules",
            	    	        		lv_functionModules_3_0, 
            	    	        		"FunctionModule", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleStructure
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:177:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:178:2: (iv_ruleStructure= ruleStructure EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:179:2: iv_ruleStructure= ruleStructure EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructureRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure222);
            iv_ruleStructure=ruleStructure();
            _fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure232); 

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
    // $ANTLR end entryRuleStructure


    // $ANTLR start ruleStructure
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:186:1: ruleStructure returns [EObject current=null] : ( 'structure' ( (lv_name_1_0= RULE_STRING ) ) '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) '}' ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_mapping_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:191:6: ( ( 'structure' ( (lv_name_1_0= RULE_STRING ) ) '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:192:1: ( 'structure' ( (lv_name_1_0= RULE_STRING ) ) '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:192:1: ( 'structure' ( (lv_name_1_0= RULE_STRING ) ) '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:192:3: 'structure' ( (lv_name_1_0= RULE_STRING ) ) '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) '}'
            {
            match(input,12,FOLLOW_12_in_ruleStructure267); 

                    createLeafNode(grammarAccess.getStructureAccess().getStructureKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:196:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:197:1: (lv_name_1_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:197:1: (lv_name_1_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:198:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructure284); 

            			createLeafNode(grammarAccess.getStructureAccess().getNameSTRINGTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleStructure299); 

                    createLeafNode(grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:224:1: ( (lv_mapping_3_0= ruleStructureMapping ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:225:1: (lv_mapping_3_0= ruleStructureMapping )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:225:1: (lv_mapping_3_0= ruleStructureMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:226:3: lv_mapping_3_0= ruleStructureMapping
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructureAccess().getMappingStructureMappingParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStructureMapping_in_ruleStructure320);
            lv_mapping_3_0=ruleStructureMapping();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"mapping",
            	        		lv_mapping_3_0, 
            	        		"StructureMapping", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleStructure330); 

                    createLeafNode(grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStructure


    // $ANTLR start entryRuleStructureMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:260:1: entryRuleStructureMapping returns [EObject current=null] : iv_ruleStructureMapping= ruleStructureMapping EOF ;
    public final EObject entryRuleStructureMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:261:2: (iv_ruleStructureMapping= ruleStructureMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:262:2: iv_ruleStructureMapping= ruleStructureMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructureMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructureMapping_in_entryRuleStructureMapping366);
            iv_ruleStructureMapping=ruleStructureMapping();
            _fsp--;

             current =iv_ruleStructureMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureMapping376); 

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
    // $ANTLR end entryRuleStructureMapping


    // $ANTLR start ruleStructureMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:269:1: ruleStructureMapping returns [EObject current=null] : this_StructurePOJOMapping_0= ruleStructurePOJOMapping ;
    public final EObject ruleStructureMapping() throws RecognitionException {
        EObject current = null;

        EObject this_StructurePOJOMapping_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:274:6: (this_StructurePOJOMapping_0= ruleStructurePOJOMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:276:5: this_StructurePOJOMapping_0= ruleStructurePOJOMapping
            {
             
                    currentNode=createCompositeNode(grammarAccess.getStructureMappingAccess().getStructurePOJOMappingParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleStructurePOJOMapping_in_ruleStructureMapping422);
            this_StructurePOJOMapping_0=ruleStructurePOJOMapping();
            _fsp--;

             
                    current = this_StructurePOJOMapping_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStructureMapping


    // $ANTLR start entryRuleStructurePOJOMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:292:1: entryRuleStructurePOJOMapping returns [EObject current=null] : iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF ;
    public final EObject entryRuleStructurePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructurePOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:293:2: (iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:294:2: iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructurePOJOMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructurePOJOMapping_in_entryRuleStructurePOJOMapping456);
            iv_ruleStructurePOJOMapping=ruleStructurePOJOMapping();
            _fsp--;

             current =iv_ruleStructurePOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructurePOJOMapping466); 

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
    // $ANTLR end entryRuleStructurePOJOMapping


    // $ANTLR start ruleStructurePOJOMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:301:1: ruleStructurePOJOMapping returns [EObject current=null] : ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';' )* '}' ) ;
    public final EObject ruleStructurePOJOMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_fields_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:306:6: ( ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';' )* '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:307:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';' )* '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:307:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';' )* '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:307:3: 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';' )* '}'
            {
            match(input,15,FOLLOW_15_in_ruleStructurePOJOMapping501); 

                    createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getClassKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:311:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:312:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:312:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:313:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructurePOJOMapping518); 

            			createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructurePOJOMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleStructurePOJOMapping533); 

                    createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:339:1: ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:339:2: ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';'
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:339:2: ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:340:1: (lv_fields_3_0= ruleStructureFieldPOJOMapping )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:340:1: (lv_fields_3_0= ruleStructureFieldPOJOMapping )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:341:3: lv_fields_3_0= ruleStructureFieldPOJOMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStructurePOJOMappingAccess().getFieldsStructureFieldPOJOMappingParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping555);
            	    lv_fields_3_0=ruleStructureFieldPOJOMapping();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStructurePOJOMappingRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"fields",
            	    	        		lv_fields_3_0, 
            	    	        		"StructureFieldPOJOMapping", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }

            	    match(input,16,FOLLOW_16_in_ruleStructurePOJOMapping565); 

            	            createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getSemicolonKeyword_3_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleStructurePOJOMapping577); 

                    createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStructurePOJOMapping


    // $ANTLR start entryRuleStructureFieldPOJOMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:379:1: entryRuleStructureFieldPOJOMapping returns [EObject current=null] : iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF ;
    public final EObject entryRuleStructureFieldPOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureFieldPOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:380:2: (iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:381:2: iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructureFieldPOJOMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_entryRuleStructureFieldPOJOMapping613);
            iv_ruleStructureFieldPOJOMapping=ruleStructureFieldPOJOMapping();
            _fsp--;

             current =iv_ruleStructureFieldPOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureFieldPOJOMapping623); 

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
    // $ANTLR end entryRuleStructureFieldPOJOMapping


    // $ANTLR start ruleStructureFieldPOJOMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:388:1: ruleStructureFieldPOJOMapping returns [EObject current=null] : ( 'field' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleStructureFieldPOJOMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_inactive_3_0=null;
        Token lv_attribute_5_0=null;
        Token lv_comment_7_0=null;
        Enumerator lv_type_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:393:6: ( ( 'field' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:394:1: ( 'field' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:394:1: ( 'field' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:394:3: 'field' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )?
            {
            match(input,17,FOLLOW_17_in_ruleStructureFieldPOJOMapping658); 

                    createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getFieldKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:398:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:399:1: (lv_name_1_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:399:1: (lv_name_1_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:400:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping675); 

            			createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getNameSTRINGTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructureFieldPOJOMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleStructureFieldPOJOMapping690); 

                    createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getEqualsSignKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:426:1: ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=29 && LA4_0<=43)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("426:1: ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:426:2: ( (lv_inactive_3_0= 'inactive' ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:426:2: ( (lv_inactive_3_0= 'inactive' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:427:1: (lv_inactive_3_0= 'inactive' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:427:1: (lv_inactive_3_0= 'inactive' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:428:3: lv_inactive_3_0= 'inactive'
                    {
                    lv_inactive_3_0=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleStructureFieldPOJOMapping709); 

                            createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getInactiveInactiveKeyword_3_0_0(), "inactive"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStructureFieldPOJOMappingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "inactive", true, "inactive", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:448:6: ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:448:6: ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:448:7: ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:448:7: ( (lv_type_4_0= ruleDataType ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:449:1: (lv_type_4_0= ruleDataType )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:449:1: (lv_type_4_0= ruleDataType )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:450:3: lv_type_4_0= ruleDataType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStructureFieldPOJOMappingAccess().getTypeDataTypeEnumRuleCall_3_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleStructureFieldPOJOMapping750);
                    lv_type_4_0=ruleDataType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStructureFieldPOJOMappingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"type",
                    	        		lv_type_4_0, 
                    	        		"DataType", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:472:2: ( (lv_attribute_5_0= RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:473:1: (lv_attribute_5_0= RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:473:1: (lv_attribute_5_0= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:474:3: lv_attribute_5_0= RULE_ID
                    {
                    lv_attribute_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping767); 

                    			createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getAttributeIDTerminalRuleCall_3_1_1_0(), "attribute"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStructureFieldPOJOMappingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"attribute",
                    	        		lv_attribute_5_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:496:4: ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:496:6: 'comment' ( (lv_comment_7_0= RULE_STRING ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleStructureFieldPOJOMapping785); 

                            createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getCommentKeyword_4_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:500:1: ( (lv_comment_7_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:501:1: (lv_comment_7_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:501:1: (lv_comment_7_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:502:3: lv_comment_7_0= RULE_STRING
                    {
                    lv_comment_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping802); 

                    			createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getCommentSTRINGTerminalRuleCall_4_1_0(), "comment"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStructureFieldPOJOMappingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"comment",
                    	        		lv_comment_7_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleStructureFieldPOJOMapping


    // $ANTLR start entryRuleFunctionModule
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:532:1: entryRuleFunctionModule returns [EObject current=null] : iv_ruleFunctionModule= ruleFunctionModule EOF ;
    public final EObject entryRuleFunctionModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModule = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:533:2: (iv_ruleFunctionModule= ruleFunctionModule EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:534:2: iv_ruleFunctionModule= ruleFunctionModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModule_in_entryRuleFunctionModule845);
            iv_ruleFunctionModule=ruleFunctionModule();
            _fsp--;

             current =iv_ruleFunctionModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModule855); 

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
    // $ANTLR end entryRuleFunctionModule


    // $ANTLR start ruleFunctionModule
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:541:1: ruleFunctionModule returns [EObject current=null] : ( 'function' 'module' ( (lv_name_2_0= RULE_STRING ) ) '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) '}' ) ;
    public final EObject ruleFunctionModule() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_mapping_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:546:6: ( ( 'function' 'module' ( (lv_name_2_0= RULE_STRING ) ) '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:547:1: ( 'function' 'module' ( (lv_name_2_0= RULE_STRING ) ) '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:547:1: ( 'function' 'module' ( (lv_name_2_0= RULE_STRING ) ) '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:547:3: 'function' 'module' ( (lv_name_2_0= RULE_STRING ) ) '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) '}'
            {
            match(input,21,FOLLOW_21_in_ruleFunctionModule890); 

                    createLeafNode(grammarAccess.getFunctionModuleAccess().getFunctionKeyword_0(), null); 
                
            match(input,22,FOLLOW_22_in_ruleFunctionModule900); 

                    createLeafNode(grammarAccess.getFunctionModuleAccess().getModuleKeyword_1(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:555:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:556:1: (lv_name_2_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:556:1: (lv_name_2_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:557:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModule917); 

            			createLeafNode(grammarAccess.getFunctionModuleAccess().getNameSTRINGTerminalRuleCall_2_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_2_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleFunctionModule932); 

                    createLeafNode(grammarAccess.getFunctionModuleAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:583:1: ( (lv_mapping_4_0= ruleFunctionModuleMapping ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:584:1: (lv_mapping_4_0= ruleFunctionModuleMapping )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:584:1: (lv_mapping_4_0= ruleFunctionModuleMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:585:3: lv_mapping_4_0= ruleFunctionModuleMapping
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionModuleAccess().getMappingFunctionModuleMappingParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule953);
            lv_mapping_4_0=ruleFunctionModuleMapping();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"mapping",
            	        		lv_mapping_4_0, 
            	        		"FunctionModuleMapping", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleFunctionModule963); 

                    createLeafNode(grammarAccess.getFunctionModuleAccess().getRightCurlyBracketKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionModule


    // $ANTLR start entryRuleFunctionModuleMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:619:1: entryRuleFunctionModuleMapping returns [EObject current=null] : iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF ;
    public final EObject entryRuleFunctionModuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModuleMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:620:2: (iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:621:2: iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModuleMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_entryRuleFunctionModuleMapping999);
            iv_ruleFunctionModuleMapping=ruleFunctionModuleMapping();
            _fsp--;

             current =iv_ruleFunctionModuleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModuleMapping1009); 

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
    // $ANTLR end entryRuleFunctionModuleMapping


    // $ANTLR start ruleFunctionModuleMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:628:1: ruleFunctionModuleMapping returns [EObject current=null] : this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping ;
    public final EObject ruleFunctionModuleMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOMapping_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:633:6: (this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:635:5: this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping
            {
             
                    currentNode=createCompositeNode(grammarAccess.getFunctionModuleMappingAccess().getFunctionModulePOJOMappingParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping1055);
            this_FunctionModulePOJOMapping_0=ruleFunctionModulePOJOMapping();
            _fsp--;

             
                    current = this_FunctionModulePOJOMapping_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionModuleMapping


    // $ANTLR start entryRuleFunctionModulePOJOMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:651:1: entryRuleFunctionModulePOJOMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:652:2: (iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:653:2: iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_entryRuleFunctionModulePOJOMapping1089);
            iv_ruleFunctionModulePOJOMapping=ruleFunctionModulePOJOMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOMapping1099); 

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
    // $ANTLR end entryRuleFunctionModulePOJOMapping


    // $ANTLR start ruleFunctionModulePOJOMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:660:1: ruleFunctionModulePOJOMapping returns [EObject current=null] : (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping ) ;
    public final EObject ruleFunctionModulePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOCallMapping_0 = null;

        EObject this_FunctionModulePOJORequestResponseMapping_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:665:6: ( (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:666:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:666:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("666:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:667:5: this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJOCallMappingParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping1146);
                    this_FunctionModulePOJOCallMapping_0=ruleFunctionModulePOJOCallMapping();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOCallMapping_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:677:5: this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJORequestResponseMappingParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping1173);
                    this_FunctionModulePOJORequestResponseMapping_1=ruleFunctionModulePOJORequestResponseMapping();
                    _fsp--;

                     
                            current = this_FunctionModulePOJORequestResponseMapping_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionModulePOJOMapping


    // $ANTLR start entryRuleFunctionModulePOJOCallMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:693:1: entryRuleFunctionModulePOJOCallMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOCallMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOCallMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:694:2: (iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:695:2: iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOCallMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_entryRuleFunctionModulePOJOCallMapping1208);
            iv_ruleFunctionModulePOJOCallMapping=ruleFunctionModulePOJOCallMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJOCallMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOCallMapping1218); 

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
    // $ANTLR end entryRuleFunctionModulePOJOCallMapping


    // $ANTLR start ruleFunctionModulePOJOCallMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:702:1: ruleFunctionModulePOJOCallMapping returns [EObject current=null] : ( 'class' ( (lv_className_1_0= RULE_ID ) ) '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* '}' ) ;
    public final EObject ruleFunctionModulePOJOCallMapping() throws RecognitionException {
        EObject current = null;

        Token lv_className_1_0=null;
        EObject lv_parameters_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:707:6: ( ( 'class' ( (lv_className_1_0= RULE_ID ) ) '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:708:1: ( 'class' ( (lv_className_1_0= RULE_ID ) ) '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:708:1: ( 'class' ( (lv_className_1_0= RULE_ID ) ) '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:708:3: 'class' ( (lv_className_1_0= RULE_ID ) ) '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* '}'
            {
            match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOCallMapping1253); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:712:1: ( (lv_className_1_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:713:1: (lv_className_1_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:713:1: (lv_className_1_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:714:3: lv_className_1_0= RULE_ID
            {
            lv_className_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping1270); 

            			createLeafNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassNameIDTerminalRuleCall_1_0(), "className"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionModulePOJOCallMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"className",
            	        		lv_className_1_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJOCallMapping1285); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:740:1: ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=25 && LA7_0<=28)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:741:1: (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:741:1: (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:742:3: lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getParametersFunctionModulePOJOParameterMappingParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping1306);
            	    lv_parameters_3_0=ruleFunctionModulePOJOParameterMapping();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFunctionModulePOJOCallMappingRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"parameters",
            	    	        		lv_parameters_3_0, 
            	    	        		"FunctionModulePOJOParameterMapping", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJOCallMapping1317); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionModulePOJOCallMapping


    // $ANTLR start entryRuleFunctionModulePOJORequestResponseMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:776:1: entryRuleFunctionModulePOJORequestResponseMapping returns [EObject current=null] : iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF ;
    public final EObject entryRuleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJORequestResponseMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:777:2: (iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:778:2: iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_entryRuleFunctionModulePOJORequestResponseMapping1353);
            iv_ruleFunctionModulePOJORequestResponseMapping=ruleFunctionModulePOJORequestResponseMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJORequestResponseMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJORequestResponseMapping1363); 

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
    // $ANTLR end entryRuleFunctionModulePOJORequestResponseMapping


    // $ANTLR start ruleFunctionModulePOJORequestResponseMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:785:1: ruleFunctionModulePOJORequestResponseMapping returns [EObject current=null] : ( 'request' 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* '}' 'response' 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* '}' ) ;
    public final EObject ruleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        EObject current = null;

        Token lv_requestClassName_2_0=null;
        Token lv_responseClassName_8_0=null;
        EObject lv_requestParameters_4_0 = null;

        EObject lv_responseParameters_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:790:6: ( ( 'request' 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* '}' 'response' 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:791:1: ( 'request' 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* '}' 'response' 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:791:1: ( 'request' 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* '}' 'response' 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:791:3: 'request' 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* '}' 'response' 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* '}'
            {
            match(input,23,FOLLOW_23_in_ruleFunctionModulePOJORequestResponseMapping1398); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestKeyword_0(), null); 
                
            match(input,15,FOLLOW_15_in_ruleFunctionModulePOJORequestResponseMapping1408); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_1(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:799:1: ( (lv_requestClassName_2_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:800:1: (lv_requestClassName_2_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:800:1: (lv_requestClassName_2_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:801:3: lv_requestClassName_2_0= RULE_ID
            {
            lv_requestClassName_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1425); 

            			createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestClassNameIDTerminalRuleCall_2_0(), "requestClassName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionModulePOJORequestResponseMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"requestClassName",
            	        		lv_requestClassName_2_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping1440); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:827:1: ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=25 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:828:1: (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:828:1: (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:829:3: lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestParametersFunctionModulePOJOParameterMappingParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1461);
            	    lv_requestParameters_4_0=ruleFunctionModulePOJOParameterMapping();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFunctionModulePOJORequestResponseMappingRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"requestParameters",
            	    	        		lv_requestParameters_4_0, 
            	    	        		"FunctionModulePOJOParameterMapping", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping1472); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRightCurlyBracketKeyword_5(), null); 
                
            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJORequestResponseMapping1482); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseKeyword_6(), null); 
                
            match(input,15,FOLLOW_15_in_ruleFunctionModulePOJORequestResponseMapping1492); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_7(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:863:1: ( (lv_responseClassName_8_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:864:1: (lv_responseClassName_8_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:864:1: (lv_responseClassName_8_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:865:3: lv_responseClassName_8_0= RULE_ID
            {
            lv_responseClassName_8_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1509); 

            			createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseClassNameIDTerminalRuleCall_8_0(), "responseClassName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionModulePOJORequestResponseMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"responseClassName",
            	        		lv_responseClassName_8_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping1524); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_9(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:891:1: ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=25 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:892:1: (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:892:1: (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:893:3: lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseParametersFunctionModulePOJOParameterMappingParserRuleCall_10_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1545);
            	    lv_responseParameters_10_0=ruleFunctionModulePOJOParameterMapping();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFunctionModulePOJORequestResponseMappingRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"responseParameters",
            	    	        		lv_responseParameters_10_0, 
            	    	        		"FunctionModulePOJOParameterMapping", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping1556); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRightCurlyBracketKeyword_11(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionModulePOJORequestResponseMapping


    // $ANTLR start entryRuleFunctionModulePOJOParameterMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:927:1: entryRuleFunctionModulePOJOParameterMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOParameterMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOParameterMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:928:2: (iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:929:2: iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_entryRuleFunctionModulePOJOParameterMapping1592);
            iv_ruleFunctionModulePOJOParameterMapping=ruleFunctionModulePOJOParameterMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJOParameterMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOParameterMapping1602); 

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
    // $ANTLR end entryRuleFunctionModulePOJOParameterMapping


    // $ANTLR start ruleFunctionModulePOJOParameterMapping
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:936:1: ruleFunctionModulePOJOParameterMapping returns [EObject current=null] : (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter ) ;
    public final EObject ruleFunctionModulePOJOParameterMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOImportingParameter_0 = null;

        EObject this_FunctionModulePOJOExportingParameter_1 = null;

        EObject this_FunctionModulePOJOChangingParameter_2 = null;

        EObject this_FunctionModulePOJOTablesParameter_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:941:6: ( (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:942:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:942:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt10=1;
                }
                break;
            case 27:
                {
                alt10=2;
                }
                break;
            case 28:
                {
                alt10=3;
                }
                break;
            case 26:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("942:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:943:5: this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOImportingParameterParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping1649);
                    this_FunctionModulePOJOImportingParameter_0=ruleFunctionModulePOJOImportingParameter();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOImportingParameter_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:953:5: this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOExportingParameterParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping1676);
                    this_FunctionModulePOJOExportingParameter_1=ruleFunctionModulePOJOExportingParameter();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOExportingParameter_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:963:5: this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOChangingParameterParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping1703);
                    this_FunctionModulePOJOChangingParameter_2=ruleFunctionModulePOJOChangingParameter();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOChangingParameter_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:973:5: this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOTablesParameterParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping1730);
                    this_FunctionModulePOJOTablesParameter_3=ruleFunctionModulePOJOTablesParameter();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOTablesParameter_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionModulePOJOParameterMapping


    // $ANTLR start entryRuleFunctionModulePOJOImportingParameter
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:989:1: entryRuleFunctionModulePOJOImportingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOImportingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOImportingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:990:2: (iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:991:2: iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOImportingParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_entryRuleFunctionModulePOJOImportingParameter1765);
            iv_ruleFunctionModulePOJOImportingParameter=ruleFunctionModulePOJOImportingParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOImportingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOImportingParameter1775); 

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
    // $ANTLR end entryRuleFunctionModulePOJOImportingParameter


    // $ANTLR start ruleFunctionModulePOJOImportingParameter
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:998:1: ruleFunctionModulePOJOImportingParameter returns [EObject current=null] : ( 'importing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOImportingParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_inactive_4_0=null;
        Token lv_attribute_6_0=null;
        Token lv_name_8_0=null;
        Token lv_inactive_10_0=null;
        Token lv_attribute_12_0=null;
        Token lv_table_13_0=null;
        Token lv_name_14_0=null;
        Token lv_inactive_16_0=null;
        Token lv_attribute_18_0=null;
        Token lv_comment_20_0=null;
        Enumerator lv_type_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1003:6: ( ( 'importing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1004:1: ( 'importing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1004:1: ( 'importing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1004:3: 'importing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';'
            {
            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter1810); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getImportingKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1008:1: ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt14=1;
                }
                break;
            case 12:
                {
                alt14=2;
                }
                break;
            case 26:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1008:1: ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1008:2: ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1008:2: ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1008:4: 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter1822); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getFieldKeyword_1_0_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1012:1: ( (lv_name_2_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1013:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1013:1: (lv_name_2_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1014:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1839); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter1854); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_0_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1040:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==19) ) {
                        alt11=1;
                    }
                    else if ( ((LA11_0>=29 && LA11_0<=43)) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1040:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1040:2: ( (lv_inactive_4_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1040:2: ( (lv_inactive_4_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1041:1: (lv_inactive_4_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1041:1: (lv_inactive_4_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1042:3: lv_inactive_4_0= 'inactive'
                            {
                            lv_inactive_4_0=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter1873); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0(), "inactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "inactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1062:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1062:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1062:7: ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1062:7: ( (lv_type_5_0= ruleDataType ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1063:1: (lv_type_5_0= ruleDataType )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1063:1: (lv_type_5_0= ruleDataType )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1064:3: lv_type_5_0= ruleDataType
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleFunctionModulePOJOImportingParameter1914);
                            lv_type_5_0=ruleDataType();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"type",
                            	        		lv_type_5_0, 
                            	        		"DataType", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1086:2: ( (lv_attribute_6_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1087:1: (lv_attribute_6_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1087:1: (lv_attribute_6_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1088:3: lv_attribute_6_0= RULE_ID
                            {
                            lv_attribute_6_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1931); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_6_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1111:6: ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1111:6: ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1111:8: 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleFunctionModulePOJOImportingParameter1956); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureKeyword_1_1_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1115:1: ( (lv_name_8_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1116:1: (lv_name_8_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1116:1: (lv_name_8_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1117:3: lv_name_8_0= RULE_STRING
                    {
                    lv_name_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1973); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_8_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter1988); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_1_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1143:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==19) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==RULE_ID) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1143:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) )", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1143:2: ( (lv_inactive_10_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1143:2: ( (lv_inactive_10_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1144:1: (lv_inactive_10_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1144:1: (lv_inactive_10_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1145:3: lv_inactive_10_0= 'inactive'
                            {
                            lv_inactive_10_0=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter2007); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0(), "inactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "inactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1165:6: ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1165:6: ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1165:7: ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1165:7: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1166:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1166:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1167:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2045); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureMappingCrossReference_1_1_3_1_0_0(), "structure"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1179:2: ( (lv_attribute_12_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1180:1: (lv_attribute_12_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1180:1: (lv_attribute_12_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1181:3: lv_attribute_12_0= RULE_ID
                            {
                            lv_attribute_12_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2062); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_12_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1204:6: ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1204:6: ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1204:7: ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1204:7: ( (lv_table_13_0= 'table' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1205:1: (lv_table_13_0= 'table' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1205:1: (lv_table_13_0= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1206:3: lv_table_13_0= 'table'
                    {
                    lv_table_13_0=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOImportingParameter2095); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTableTableKeyword_1_2_0_0(), "table"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "table", true, "table", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1225:2: ( (lv_name_14_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1226:1: (lv_name_14_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1226:1: (lv_name_14_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1227:3: lv_name_14_0= RULE_STRING
                    {
                    lv_name_14_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2125); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_14_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter2140); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_2_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1253:1: ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==19) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_ID) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1253:1: ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) )", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1253:2: ( (lv_inactive_16_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1253:2: ( (lv_inactive_16_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1254:1: (lv_inactive_16_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1254:1: (lv_inactive_16_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1255:3: lv_inactive_16_0= 'inactive'
                            {
                            lv_inactive_16_0=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter2159); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0(), "inactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "inactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1275:6: ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1275:6: ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1275:7: ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1275:7: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1276:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1276:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1277:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2197); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureMappingCrossReference_1_2_3_1_0_0(), "structure"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1289:2: ( (lv_attribute_18_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1290:1: (lv_attribute_18_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1290:1: (lv_attribute_18_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1291:3: lv_attribute_18_0= RULE_ID
                            {
                            lv_attribute_18_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2214); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_18_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1313:6: ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1313:8: 'comment' ( (lv_comment_20_0= RULE_STRING ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOImportingParameter2234); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentKeyword_2_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1317:1: ( (lv_comment_20_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1318:1: (lv_comment_20_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1318:1: (lv_comment_20_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1319:3: lv_comment_20_0= RULE_STRING
                    {
                    lv_comment_20_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2251); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0(), "comment"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"comment",
                    	        		lv_comment_20_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter2268); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionModulePOJOImportingParameter


    // $ANTLR start entryRuleFunctionModulePOJOExportingParameter
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1353:1: entryRuleFunctionModulePOJOExportingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOExportingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOExportingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1354:2: (iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1355:2: iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOExportingParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_entryRuleFunctionModulePOJOExportingParameter2304);
            iv_ruleFunctionModulePOJOExportingParameter=ruleFunctionModulePOJOExportingParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOExportingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOExportingParameter2314); 

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
    // $ANTLR end entryRuleFunctionModulePOJOExportingParameter


    // $ANTLR start ruleFunctionModulePOJOExportingParameter
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1362:1: ruleFunctionModulePOJOExportingParameter returns [EObject current=null] : ( 'exporting' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOExportingParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_inactive_4_0=null;
        Token lv_attribute_6_0=null;
        Token lv_name_8_0=null;
        Token lv_inactive_10_0=null;
        Token lv_attribute_12_0=null;
        Token lv_table_13_0=null;
        Token lv_name_14_0=null;
        Token lv_inactive_16_0=null;
        Token lv_attribute_18_0=null;
        Token lv_comment_20_0=null;
        Enumerator lv_type_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1367:6: ( ( 'exporting' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1368:1: ( 'exporting' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1368:1: ( 'exporting' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1368:3: 'exporting' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';'
            {
            match(input,27,FOLLOW_27_in_ruleFunctionModulePOJOExportingParameter2349); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExportingKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1372:1: ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt19=1;
                }
                break;
            case 12:
                {
                alt19=2;
                }
                break;
            case 26:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1372:1: ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1372:2: ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1372:2: ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1372:4: 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter2361); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getFieldKeyword_1_0_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1376:1: ( (lv_name_2_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1377:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1377:1: (lv_name_2_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1378:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2378); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter2393); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_0_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1404:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==19) ) {
                        alt16=1;
                    }
                    else if ( ((LA16_0>=29 && LA16_0<=43)) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1404:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1404:2: ( (lv_inactive_4_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1404:2: ( (lv_inactive_4_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1405:1: (lv_inactive_4_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1405:1: (lv_inactive_4_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1406:3: lv_inactive_4_0= 'inactive'
                            {
                            lv_inactive_4_0=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter2412); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0(), "inactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "inactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1426:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1426:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1426:7: ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1426:7: ( (lv_type_5_0= ruleDataType ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1427:1: (lv_type_5_0= ruleDataType )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1427:1: (lv_type_5_0= ruleDataType )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1428:3: lv_type_5_0= ruleDataType
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleFunctionModulePOJOExportingParameter2453);
                            lv_type_5_0=ruleDataType();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"type",
                            	        		lv_type_5_0, 
                            	        		"DataType", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1450:2: ( (lv_attribute_6_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1451:1: (lv_attribute_6_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1451:1: (lv_attribute_6_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1452:3: lv_attribute_6_0= RULE_ID
                            {
                            lv_attribute_6_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2470); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_6_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1475:6: ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1475:6: ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1475:8: 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleFunctionModulePOJOExportingParameter2495); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureKeyword_1_1_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1479:1: ( (lv_name_8_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1480:1: (lv_name_8_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1480:1: (lv_name_8_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1481:3: lv_name_8_0= RULE_STRING
                    {
                    lv_name_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2512); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_8_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter2527); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_1_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1507:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==19) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==RULE_ID) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1507:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) )", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1507:2: ( (lv_inactive_10_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1507:2: ( (lv_inactive_10_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1508:1: (lv_inactive_10_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1508:1: (lv_inactive_10_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1509:3: lv_inactive_10_0= 'inactive'
                            {
                            lv_inactive_10_0=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter2546); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0(), "inactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "inactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1529:6: ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1529:6: ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1529:7: ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1529:7: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1530:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1530:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1531:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2584); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureMappingCrossReference_1_1_3_1_0_0(), "structure"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1543:2: ( (lv_attribute_12_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1544:1: (lv_attribute_12_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1544:1: (lv_attribute_12_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1545:3: lv_attribute_12_0= RULE_ID
                            {
                            lv_attribute_12_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2601); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_12_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1568:6: ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1568:6: ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1568:7: ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1568:7: ( (lv_table_13_0= 'table' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1569:1: (lv_table_13_0= 'table' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1569:1: (lv_table_13_0= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1570:3: lv_table_13_0= 'table'
                    {
                    lv_table_13_0=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOExportingParameter2634); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTableTableKeyword_1_2_0_0(), "table"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "table", true, "table", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1589:2: ( (lv_name_14_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1590:1: (lv_name_14_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1590:1: (lv_name_14_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1591:3: lv_name_14_0= RULE_STRING
                    {
                    lv_name_14_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2664); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_14_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter2679); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_2_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1617:1: ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==19) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==RULE_ID) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1617:1: ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) )", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1617:2: ( (lv_inactive_16_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1617:2: ( (lv_inactive_16_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1618:1: (lv_inactive_16_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1618:1: (lv_inactive_16_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1619:3: lv_inactive_16_0= 'inactive'
                            {
                            lv_inactive_16_0=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter2698); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0(), "inactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "inactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1639:6: ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1639:6: ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1639:7: ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1639:7: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1640:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1640:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1641:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2736); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureMappingCrossReference_1_2_3_1_0_0(), "structure"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1653:2: ( (lv_attribute_18_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1654:1: (lv_attribute_18_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1654:1: (lv_attribute_18_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1655:3: lv_attribute_18_0= RULE_ID
                            {
                            lv_attribute_18_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2753); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_18_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1677:6: ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1677:8: 'comment' ( (lv_comment_20_0= RULE_STRING ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOExportingParameter2773); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentKeyword_2_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1681:1: ( (lv_comment_20_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1682:1: (lv_comment_20_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1682:1: (lv_comment_20_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1683:3: lv_comment_20_0= RULE_STRING
                    {
                    lv_comment_20_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2790); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0(), "comment"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"comment",
                    	        		lv_comment_20_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter2807); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionModulePOJOExportingParameter


    // $ANTLR start entryRuleFunctionModulePOJOChangingParameter
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1717:1: entryRuleFunctionModulePOJOChangingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOChangingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOChangingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1718:2: (iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1719:2: iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOChangingParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_entryRuleFunctionModulePOJOChangingParameter2843);
            iv_ruleFunctionModulePOJOChangingParameter=ruleFunctionModulePOJOChangingParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOChangingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOChangingParameter2853); 

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
    // $ANTLR end entryRuleFunctionModulePOJOChangingParameter


    // $ANTLR start ruleFunctionModulePOJOChangingParameter
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1726:1: ruleFunctionModulePOJOChangingParameter returns [EObject current=null] : ( 'changing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOChangingParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_inactive_4_0=null;
        Token lv_attribute_6_0=null;
        Token lv_name_8_0=null;
        Token lv_inactive_10_0=null;
        Token lv_attribute_12_0=null;
        Token lv_table_13_0=null;
        Token lv_name_14_0=null;
        Token lv_inactive_16_0=null;
        Token lv_attribute_18_0=null;
        Token lv_comment_20_0=null;
        Enumerator lv_type_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1731:6: ( ( 'changing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1732:1: ( 'changing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1732:1: ( 'changing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1732:3: 'changing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )? ';'
            {
            match(input,28,FOLLOW_28_in_ruleFunctionModulePOJOChangingParameter2888); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getChangingKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1736:1: ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt24=1;
                }
                break;
            case 12:
                {
                alt24=2;
                }
                break;
            case 26:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1736:1: ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) ) )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1736:2: ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1736:2: ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1736:4: 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter2900); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getFieldKeyword_1_0_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1740:1: ( (lv_name_2_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1741:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1741:1: (lv_name_2_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1742:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter2917); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_2_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter2932); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_0_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1768:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==19) ) {
                        alt21=1;
                    }
                    else if ( ((LA21_0>=29 && LA21_0<=43)) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1768:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1768:2: ( (lv_inactive_4_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1768:2: ( (lv_inactive_4_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1769:1: (lv_inactive_4_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1769:1: (lv_inactive_4_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1770:3: lv_inactive_4_0= 'inactive'
                            {
                            lv_inactive_4_0=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter2951); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_0_3_0_0(), "inactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "inactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1790:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1790:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1790:7: ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1790:7: ( (lv_type_5_0= ruleDataType ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1791:1: (lv_type_5_0= ruleDataType )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1791:1: (lv_type_5_0= ruleDataType )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1792:3: lv_type_5_0= ruleDataType
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleFunctionModulePOJOChangingParameter2992);
                            lv_type_5_0=ruleDataType();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"type",
                            	        		lv_type_5_0, 
                            	        		"DataType", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1814:2: ( (lv_attribute_6_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1815:1: (lv_attribute_6_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1815:1: (lv_attribute_6_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1816:3: lv_attribute_6_0= RULE_ID
                            {
                            lv_attribute_6_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3009); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_6_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1839:6: ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1839:6: ( 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1839:8: 'structure' ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleFunctionModulePOJOChangingParameter3034); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureKeyword_1_1_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1843:1: ( (lv_name_8_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1844:1: (lv_name_8_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1844:1: (lv_name_8_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1845:3: lv_name_8_0= RULE_STRING
                    {
                    lv_name_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3051); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_8_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter3066); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_1_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1871:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==19) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_ID) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1871:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1871:2: ( (lv_inactive_10_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1871:2: ( (lv_inactive_10_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1872:1: (lv_inactive_10_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1872:1: (lv_inactive_10_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1873:3: lv_inactive_10_0= 'inactive'
                            {
                            lv_inactive_10_0=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter3085); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_1_3_0_0(), "inactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "inactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1893:6: ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1893:6: ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1893:7: ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1893:7: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1894:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1894:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1895:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3123); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureMappingCrossReference_1_1_3_1_0_0(), "structure"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1907:2: ( (lv_attribute_12_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1908:1: (lv_attribute_12_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1908:1: (lv_attribute_12_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1909:3: lv_attribute_12_0= RULE_ID
                            {
                            lv_attribute_12_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3140); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_12_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1932:6: ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1932:6: ( ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1932:7: ( (lv_table_13_0= 'table' ) ) ( (lv_name_14_0= RULE_STRING ) ) '=' ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1932:7: ( (lv_table_13_0= 'table' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1933:1: (lv_table_13_0= 'table' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1933:1: (lv_table_13_0= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1934:3: lv_table_13_0= 'table'
                    {
                    lv_table_13_0=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOChangingParameter3173); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTableTableKeyword_1_2_0_0(), "table"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "table", true, "table", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1953:2: ( (lv_name_14_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1954:1: (lv_name_14_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1954:1: (lv_name_14_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1955:3: lv_name_14_0= RULE_STRING
                    {
                    lv_name_14_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3203); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_14_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter3218); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_2_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1981:1: ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==19) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==RULE_ID) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1981:1: ( ( (lv_inactive_16_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) ) )", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1981:2: ( (lv_inactive_16_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1981:2: ( (lv_inactive_16_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1982:1: (lv_inactive_16_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1982:1: (lv_inactive_16_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1983:3: lv_inactive_16_0= 'inactive'
                            {
                            lv_inactive_16_0=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter3237); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getInactiveInactiveKeyword_1_2_3_0_0(), "inactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "inactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2003:6: ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2003:6: ( ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2003:7: ( ( RULE_ID ) ) ( (lv_attribute_18_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2003:7: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2004:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2004:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2005:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3275); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureMappingCrossReference_1_2_3_1_0_0(), "structure"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2017:2: ( (lv_attribute_18_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2018:1: (lv_attribute_18_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2018:1: (lv_attribute_18_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2019:3: lv_attribute_18_0= RULE_ID
                            {
                            lv_attribute_18_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3292); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_18_0, 
                            	        		"ID", 
                            	        		lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2041:6: ( 'comment' ( (lv_comment_20_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2041:8: 'comment' ( (lv_comment_20_0= RULE_STRING ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOChangingParameter3312); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentKeyword_2_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2045:1: ( (lv_comment_20_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2046:1: (lv_comment_20_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2046:1: (lv_comment_20_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2047:3: lv_comment_20_0= RULE_STRING
                    {
                    lv_comment_20_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3329); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0(), "comment"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"comment",
                    	        		lv_comment_20_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter3346); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getSemicolonKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionModulePOJOChangingParameter


    // $ANTLR start entryRuleFunctionModulePOJOTablesParameter
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2081:1: entryRuleFunctionModulePOJOTablesParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOTablesParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOTablesParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2082:2: (iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2083:2: iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOTablesParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_entryRuleFunctionModulePOJOTablesParameter3382);
            iv_ruleFunctionModulePOJOTablesParameter=ruleFunctionModulePOJOTablesParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOTablesParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOTablesParameter3392); 

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
    // $ANTLR end entryRuleFunctionModulePOJOTablesParameter


    // $ANTLR start ruleFunctionModulePOJOTablesParameter
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2090:1: ruleFunctionModulePOJOTablesParameter returns [EObject current=null] : ( 'table' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOTablesParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_inactive_3_0=null;
        Token lv_attribute_5_0=null;
        Token lv_comment_7_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2095:6: ( ( 'table' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2096:1: ( 'table' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2096:1: ( 'table' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2096:3: 'table' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? ';'
            {
            match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOTablesParameter3427); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getTableKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2100:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2101:1: (lv_name_1_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2101:1: (lv_name_1_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2102:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter3444); 

            			createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getNameSTRINGTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_1_0, 
            	        		"STRING", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOTablesParameter3459); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getEqualsSignKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2128:1: ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2128:1: ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2128:2: ( (lv_inactive_3_0= 'inactive' ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2128:2: ( (lv_inactive_3_0= 'inactive' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2129:1: (lv_inactive_3_0= 'inactive' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2129:1: (lv_inactive_3_0= 'inactive' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2130:3: lv_inactive_3_0= 'inactive'
                    {
                    lv_inactive_3_0=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOTablesParameter3478); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getInactiveInactiveKeyword_3_0_0(), "inactive"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "inactive", true, "inactive", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2150:6: ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2150:6: ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2150:7: ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2150:7: ( ( RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2151:1: ( RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2151:1: ( RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2152:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter3516); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getStructureStructureMappingCrossReference_3_1_0_0(), "structure"); 
                    	

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2164:2: ( (lv_attribute_5_0= RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2165:1: (lv_attribute_5_0= RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2165:1: (lv_attribute_5_0= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2166:3: lv_attribute_5_0= RULE_ID
                    {
                    lv_attribute_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter3533); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getAttributeIDTerminalRuleCall_3_1_1_0(), "attribute"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"attribute",
                    	        		lv_attribute_5_0, 
                    	        		"ID", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2188:4: ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2188:6: 'comment' ( (lv_comment_7_0= RULE_STRING ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOTablesParameter3551); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentKeyword_4_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2192:1: ( (lv_comment_7_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2193:1: (lv_comment_7_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2193:1: (lv_comment_7_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2194:3: lv_comment_7_0= RULE_STRING
                    {
                    lv_comment_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter3568); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentSTRINGTerminalRuleCall_4_1_0(), "comment"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"comment",
                    	        		lv_comment_7_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOTablesParameter3585); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getSemicolonKeyword_5(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFunctionModulePOJOTablesParameter


    // $ANTLR start ruleDataType
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2228:1: ruleDataType returns [Enumerator current=null] : ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2232:6: ( ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2233:1: ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2233:1: ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) )
            int alt28=15;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt28=1;
                }
                break;
            case 30:
                {
                alt28=2;
                }
                break;
            case 31:
                {
                alt28=3;
                }
                break;
            case 32:
                {
                alt28=4;
                }
                break;
            case 33:
                {
                alt28=5;
                }
                break;
            case 34:
                {
                alt28=6;
                }
                break;
            case 35:
                {
                alt28=7;
                }
                break;
            case 36:
                {
                alt28=8;
                }
                break;
            case 37:
                {
                alt28=9;
                }
                break;
            case 38:
                {
                alt28=10;
                }
                break;
            case 39:
                {
                alt28=11;
                }
                break;
            case 40:
                {
                alt28=12;
                }
                break;
            case 41:
                {
                alt28=13;
                }
                break;
            case 42:
                {
                alt28=14;
                }
                break;
            case 43:
                {
                alt28=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("2233:1: ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2233:2: ( 'BigDecimal' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2233:2: ( 'BigDecimal' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2233:4: 'BigDecimal'
                    {
                    match(input,29,FOLLOW_29_in_ruleDataType3633); 

                            current = grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2239:6: ( 'BigInteger' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2239:6: ( 'BigInteger' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2239:8: 'BigInteger'
                    {
                    match(input,30,FOLLOW_30_in_ruleDataType3648); 

                            current = grammarAccess.getDataTypeAccess().getBIG_INTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBIG_INTEGEREnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2245:6: ( 'Boolean' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2245:6: ( 'Boolean' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2245:8: 'Boolean'
                    {
                    match(input,31,FOLLOW_31_in_ruleDataType3663); 

                            current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2251:6: ( 'Byte' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2251:6: ( 'Byte' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2251:8: 'Byte'
                    {
                    match(input,32,FOLLOW_32_in_ruleDataType3678); 

                            current = grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2257:6: ( 'ByteArray' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2257:6: ( 'ByteArray' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2257:8: 'ByteArray'
                    {
                    match(input,33,FOLLOW_33_in_ruleDataType3693); 

                            current = grammarAccess.getDataTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2263:6: ( 'Char' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2263:6: ( 'Char' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2263:8: 'Char'
                    {
                    match(input,34,FOLLOW_34_in_ruleDataType3708); 

                            current = grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2269:6: ( 'CharArray' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2269:6: ( 'CharArray' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2269:8: 'CharArray'
                    {
                    match(input,35,FOLLOW_35_in_ruleDataType3723); 

                            current = grammarAccess.getDataTypeAccess().getCHAR_ARRAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getCHAR_ARRAYEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2275:6: ( 'Date' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2275:6: ( 'Date' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2275:8: 'Date'
                    {
                    match(input,36,FOLLOW_36_in_ruleDataType3738); 

                            current = grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2281:6: ( 'Double' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2281:6: ( 'Double' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2281:8: 'Double'
                    {
                    match(input,37,FOLLOW_37_in_ruleDataType3753); 

                            current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2287:6: ( 'Float' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2287:6: ( 'Float' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2287:8: 'Float'
                    {
                    match(input,38,FOLLOW_38_in_ruleDataType3768); 

                            current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2293:6: ( 'Integer' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2293:6: ( 'Integer' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2293:8: 'Integer'
                    {
                    match(input,39,FOLLOW_39_in_ruleDataType3783); 

                            current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2299:6: ( 'Long' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2299:6: ( 'Long' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2299:8: 'Long'
                    {
                    match(input,40,FOLLOW_40_in_ruleDataType3798); 

                            current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2305:6: ( 'Short' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2305:6: ( 'Short' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2305:8: 'Short'
                    {
                    match(input,41,FOLLOW_41_in_ruleDataType3813); 

                            current = grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2311:6: ( 'String' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2311:6: ( 'String' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2311:8: 'String'
                    {
                    match(input,42,FOLLOW_42_in_ruleDataType3828); 

                            current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2317:6: ( 'Time' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2317:6: ( 'Time' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2317:8: 'Time'
                    {
                    match(input,43,FOLLOW_43_in_ruleDataType3843); 

                            current = grammarAccess.getDataTypeAccess().getTIMEEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getTIMEEnumLiteralDeclaration_14(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDataType


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel137 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleModel163 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_ruleModel185 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStructure267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructure284 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructure299 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleStructureMapping_in_ruleStructure320 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStructure330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureMapping_in_entryRuleStructureMapping366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureMapping376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructurePOJOMapping_in_ruleStructureMapping422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructurePOJOMapping_in_entryRuleStructurePOJOMapping456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructurePOJOMapping466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStructurePOJOMapping501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructurePOJOMapping518 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructurePOJOMapping533 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping555 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStructurePOJOMapping565 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleStructurePOJOMapping577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_entryRuleStructureFieldPOJOMapping613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureFieldPOJOMapping623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStructureFieldPOJOMapping658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping675 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructureFieldPOJOMapping690 = new BitSet(new long[]{0x00000FFFE0080000L});
    public static final BitSet FOLLOW_19_in_ruleStructureFieldPOJOMapping709 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleStructureFieldPOJOMapping750 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping767 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleStructureFieldPOJOMapping785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_entryRuleFunctionModule845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModule855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModule890 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModule900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModule917 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModule932 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule953 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModule963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_entryRuleFunctionModuleMapping999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModuleMapping1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_entryRuleFunctionModulePOJOMapping1089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOMapping1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping1146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_entryRuleFunctionModulePOJOCallMapping1208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOCallMapping1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOCallMapping1253 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping1270 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJOCallMapping1285 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping1306 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJOCallMapping1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_entryRuleFunctionModulePOJORequestResponseMapping1353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJORequestResponseMapping1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJORequestResponseMapping1398 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJORequestResponseMapping1408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1425 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping1440 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1461 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping1472 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJORequestResponseMapping1482 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJORequestResponseMapping1492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1509 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping1524 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1545 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_entryRuleFunctionModulePOJOParameterMapping1592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOParameterMapping1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_entryRuleFunctionModulePOJOImportingParameter1765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOImportingParameter1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter1810 = new BitSet(new long[]{0x0000000004021000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter1822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1839 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter1854 = new BitSet(new long[]{0x00000FFFE0080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter1873 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunctionModulePOJOImportingParameter1914 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1931 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJOImportingParameter1956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1973 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter1988 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter2007 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2045 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2062 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOImportingParameter2095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2125 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter2140 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter2159 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2197 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2214 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOImportingParameter2234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2251 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_entryRuleFunctionModulePOJOExportingParameter2304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOExportingParameter2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionModulePOJOExportingParameter2349 = new BitSet(new long[]{0x0000000004021000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter2361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2378 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter2393 = new BitSet(new long[]{0x00000FFFE0080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter2412 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunctionModulePOJOExportingParameter2453 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2470 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJOExportingParameter2495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2512 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter2527 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter2546 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2584 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2601 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOExportingParameter2634 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2664 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter2679 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter2698 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2736 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2753 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOExportingParameter2773 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2790 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_entryRuleFunctionModulePOJOChangingParameter2843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOChangingParameter2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFunctionModulePOJOChangingParameter2888 = new BitSet(new long[]{0x0000000004021000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter2900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter2917 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter2932 = new BitSet(new long[]{0x00000FFFE0080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter2951 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunctionModulePOJOChangingParameter2992 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3009 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJOChangingParameter3034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3051 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter3066 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter3085 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3123 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3140 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOChangingParameter3173 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3203 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter3218 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter3237 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3275 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3292 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOChangingParameter3312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3329 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_entryRuleFunctionModulePOJOTablesParameter3382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOTablesParameter3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOTablesParameter3427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter3444 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOTablesParameter3459 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOTablesParameter3478 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter3516 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter3533 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOTablesParameter3551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter3568 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOTablesParameter3585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDataType3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDataType3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDataType3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDataType3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDataType3693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDataType3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDataType3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDataType3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDataType3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataType3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDataType3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDataType3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDataType3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDataType3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDataType3843 = new BitSet(new long[]{0x0000000000000002L});

}