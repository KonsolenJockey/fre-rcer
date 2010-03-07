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



    // $ANTLR start entryRuleModel
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:73:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:73:47: (iv_ruleModel= ruleModel EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:74:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel73);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel83); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:81:1: ruleModel returns [EObject current=null] : ( 'package' (lv_packageName_1= RULE_STRING ) (lv_structures_2= ruleStructure )* (lv_functionModules_3= ruleFunctionModule )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_packageName_1=null;
        EObject lv_structures_2 = null;

        EObject lv_functionModules_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:86:6: ( ( 'package' (lv_packageName_1= RULE_STRING ) (lv_structures_2= ruleStructure )* (lv_functionModules_3= ruleFunctionModule )* ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:87:1: ( 'package' (lv_packageName_1= RULE_STRING ) (lv_structures_2= ruleStructure )* (lv_functionModules_3= ruleFunctionModule )* )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:87:1: ( 'package' (lv_packageName_1= RULE_STRING ) (lv_structures_2= ruleStructure )* (lv_functionModules_3= ruleFunctionModule )* )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:87:2: 'package' (lv_packageName_1= RULE_STRING ) (lv_structures_2= ruleStructure )* (lv_functionModules_3= ruleFunctionModule )*
            {
            match(input,11,FOLLOW_11_in_ruleModel117); 

                    createLeafNode(grammarAccess.getModelAccess().getPackageKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:91:1: (lv_packageName_1= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:93:6: lv_packageName_1= RULE_STRING
            {
            lv_packageName_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleModel139); 

            		createLeafNode(grammarAccess.getModelAccess().getPackageNameSTRINGTerminalRuleCall_1_0(), "packageName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "packageName", lv_packageName_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:111:2: (lv_structures_2= ruleStructure )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:114:6: lv_structures_2= ruleStructure
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getStructuresStructureParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructure_in_ruleModel181);
            	    lv_structures_2=ruleStructure();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "structures", lv_structures_2, "Structure", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:132:3: (lv_functionModules_3= ruleFunctionModule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:135:6: lv_functionModules_3= ruleFunctionModule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getFunctionModulesFunctionModuleParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModule_in_ruleModel220);
            	    lv_functionModules_3=ruleFunctionModule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "functionModules", lv_functionModules_3, "FunctionModule", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:160:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:160:51: (iv_ruleStructure= ruleStructure EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:161:2: iv_ruleStructure= ruleStructure EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructureRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure258);
            iv_ruleStructure=ruleStructure();
            _fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure268); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:168:1: ruleStructure returns [EObject current=null] : ( 'structure' (lv_name_1= RULE_STRING ) '{' (lv_mapping_3= ruleStructureMapping ) '}' ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_mapping_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:173:6: ( ( 'structure' (lv_name_1= RULE_STRING ) '{' (lv_mapping_3= ruleStructureMapping ) '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:174:1: ( 'structure' (lv_name_1= RULE_STRING ) '{' (lv_mapping_3= ruleStructureMapping ) '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:174:1: ( 'structure' (lv_name_1= RULE_STRING ) '{' (lv_mapping_3= ruleStructureMapping ) '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:174:2: 'structure' (lv_name_1= RULE_STRING ) '{' (lv_mapping_3= ruleStructureMapping ) '}'
            {
            match(input,12,FOLLOW_12_in_ruleStructure302); 

                    createLeafNode(grammarAccess.getStructureAccess().getStructureKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:178:1: (lv_name_1= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:180:6: lv_name_1= RULE_STRING
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructure324); 

            		createLeafNode(grammarAccess.getStructureAccess().getNameSTRINGTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,13,FOLLOW_13_in_ruleStructure341); 

                    createLeafNode(grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:202:1: (lv_mapping_3= ruleStructureMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:205:6: lv_mapping_3= ruleStructureMapping
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructureAccess().getMappingStructureMappingParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStructureMapping_in_ruleStructure375);
            lv_mapping_3=ruleStructureMapping();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "mapping", lv_mapping_3, "StructureMapping", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,14,FOLLOW_14_in_ruleStructure388); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:234:1: entryRuleStructureMapping returns [EObject current=null] : iv_ruleStructureMapping= ruleStructureMapping EOF ;
    public final EObject entryRuleStructureMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:234:58: (iv_ruleStructureMapping= ruleStructureMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:235:2: iv_ruleStructureMapping= ruleStructureMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructureMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructureMapping_in_entryRuleStructureMapping421);
            iv_ruleStructureMapping=ruleStructureMapping();
            _fsp--;

             current =iv_ruleStructureMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureMapping431); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:242:1: ruleStructureMapping returns [EObject current=null] : this_StructurePOJOMapping_0= ruleStructurePOJOMapping ;
    public final EObject ruleStructureMapping() throws RecognitionException {
        EObject current = null;

        EObject this_StructurePOJOMapping_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:247:6: (this_StructurePOJOMapping_0= ruleStructurePOJOMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:249:5: this_StructurePOJOMapping_0= ruleStructurePOJOMapping
            {
             
                    currentNode=createCompositeNode(grammarAccess.getStructureMappingAccess().getStructurePOJOMappingParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleStructurePOJOMapping_in_ruleStructureMapping477);
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:264:1: entryRuleStructurePOJOMapping returns [EObject current=null] : iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF ;
    public final EObject entryRuleStructurePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructurePOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:264:62: (iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:265:2: iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructurePOJOMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructurePOJOMapping_in_entryRuleStructurePOJOMapping508);
            iv_ruleStructurePOJOMapping=ruleStructurePOJOMapping();
            _fsp--;

             current =iv_ruleStructurePOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructurePOJOMapping518); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:272:1: ruleStructurePOJOMapping returns [EObject current=null] : ( 'class' (lv_name_1= RULE_ID ) '{' ( (lv_fields_3= ruleStructureFieldPOJOMapping ) ';' )* '}' ) ;
    public final EObject ruleStructurePOJOMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_fields_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:277:6: ( ( 'class' (lv_name_1= RULE_ID ) '{' ( (lv_fields_3= ruleStructureFieldPOJOMapping ) ';' )* '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:278:1: ( 'class' (lv_name_1= RULE_ID ) '{' ( (lv_fields_3= ruleStructureFieldPOJOMapping ) ';' )* '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:278:1: ( 'class' (lv_name_1= RULE_ID ) '{' ( (lv_fields_3= ruleStructureFieldPOJOMapping ) ';' )* '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:278:2: 'class' (lv_name_1= RULE_ID ) '{' ( (lv_fields_3= ruleStructureFieldPOJOMapping ) ';' )* '}'
            {
            match(input,15,FOLLOW_15_in_ruleStructurePOJOMapping552); 

                    createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getClassKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:282:1: (lv_name_1= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:284:6: lv_name_1= RULE_ID
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructurePOJOMapping574); 

            		createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructurePOJOMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,13,FOLLOW_13_in_ruleStructurePOJOMapping591); 

                    createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:306:1: ( (lv_fields_3= ruleStructureFieldPOJOMapping ) ';' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:306:2: (lv_fields_3= ruleStructureFieldPOJOMapping ) ';'
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:306:2: (lv_fields_3= ruleStructureFieldPOJOMapping )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:309:6: lv_fields_3= ruleStructureFieldPOJOMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStructurePOJOMappingAccess().getFieldsStructureFieldPOJOMappingParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping626);
            	    lv_fields_3=ruleStructureFieldPOJOMapping();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getStructurePOJOMappingRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "fields", lv_fields_3, "StructureFieldPOJOMapping", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }

            	    match(input,16,FOLLOW_16_in_ruleStructurePOJOMapping639); 

            	            createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getSemicolonKeyword_3_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleStructurePOJOMapping650); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:342:1: entryRuleStructureFieldPOJOMapping returns [EObject current=null] : iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF ;
    public final EObject entryRuleStructureFieldPOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureFieldPOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:342:67: (iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:343:2: iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructureFieldPOJOMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_entryRuleStructureFieldPOJOMapping683);
            iv_ruleStructureFieldPOJOMapping=ruleStructureFieldPOJOMapping();
            _fsp--;

             current =iv_ruleStructureFieldPOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureFieldPOJOMapping693); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:350:1: ruleStructureFieldPOJOMapping returns [EObject current=null] : ( 'field' (lv_name_1= RULE_STRING ) '=' ( (lv_inactive_3= 'inactive' ) | ( (lv_type_4= ruleDataType ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? ) ;
    public final EObject ruleStructureFieldPOJOMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_inactive_3=null;
        Token lv_attribute_5=null;
        Token lv_comment_7=null;
        Enumerator lv_type_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:355:6: ( ( 'field' (lv_name_1= RULE_STRING ) '=' ( (lv_inactive_3= 'inactive' ) | ( (lv_type_4= ruleDataType ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:356:1: ( 'field' (lv_name_1= RULE_STRING ) '=' ( (lv_inactive_3= 'inactive' ) | ( (lv_type_4= ruleDataType ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:356:1: ( 'field' (lv_name_1= RULE_STRING ) '=' ( (lv_inactive_3= 'inactive' ) | ( (lv_type_4= ruleDataType ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:356:2: 'field' (lv_name_1= RULE_STRING ) '=' ( (lv_inactive_3= 'inactive' ) | ( (lv_type_4= ruleDataType ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )?
            {
            match(input,17,FOLLOW_17_in_ruleStructureFieldPOJOMapping727); 

                    createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getFieldKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:360:1: (lv_name_1= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:362:6: lv_name_1= RULE_STRING
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping749); 

            		createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getNameSTRINGTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructureFieldPOJOMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,18,FOLLOW_18_in_ruleStructureFieldPOJOMapping766); 

                    createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getEqualsSignKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:384:1: ( (lv_inactive_3= 'inactive' ) | ( (lv_type_4= ruleDataType ) (lv_attribute_5= RULE_ID ) ) )
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
                    new NoViableAltException("384:1: ( (lv_inactive_3= 'inactive' ) | ( (lv_type_4= ruleDataType ) (lv_attribute_5= RULE_ID ) ) )", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:384:2: (lv_inactive_3= 'inactive' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:384:2: (lv_inactive_3= 'inactive' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:386:6: lv_inactive_3= 'inactive'
                    {
                    lv_inactive_3=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleStructureFieldPOJOMapping788); 

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
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:406:6: ( (lv_type_4= ruleDataType ) (lv_attribute_5= RULE_ID ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:406:6: ( (lv_type_4= ruleDataType ) (lv_attribute_5= RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:406:7: (lv_type_4= ruleDataType ) (lv_attribute_5= RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:406:7: (lv_type_4= ruleDataType )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:409:6: lv_type_4= ruleDataType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStructureFieldPOJOMappingAccess().getTypeDataTypeEnumRuleCall_3_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleStructureFieldPOJOMapping842);
                    lv_type_4=ruleDataType();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStructureFieldPOJOMappingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_4, "DataType", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:427:2: (lv_attribute_5= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:429:6: lv_attribute_5= RULE_ID
                    {
                    lv_attribute_5=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping868); 

                    		createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getAttributeIDTerminalRuleCall_3_1_1_0(), "attribute"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStructureFieldPOJOMappingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "attribute", lv_attribute_5, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:447:4: ( 'comment' (lv_comment_7= RULE_STRING ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:447:5: 'comment' (lv_comment_7= RULE_STRING )
                    {
                    match(input,20,FOLLOW_20_in_ruleStructureFieldPOJOMapping888); 

                            createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getCommentKeyword_4_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:451:1: (lv_comment_7= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:453:6: lv_comment_7= RULE_STRING
                    {
                    lv_comment_7=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping910); 

                    		createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getCommentSTRINGTerminalRuleCall_4_1_0(), "comment"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStructureFieldPOJOMappingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "comment", lv_comment_7, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:478:1: entryRuleFunctionModule returns [EObject current=null] : iv_ruleFunctionModule= ruleFunctionModule EOF ;
    public final EObject entryRuleFunctionModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModule = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:478:56: (iv_ruleFunctionModule= ruleFunctionModule EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:479:2: iv_ruleFunctionModule= ruleFunctionModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModule_in_entryRuleFunctionModule953);
            iv_ruleFunctionModule=ruleFunctionModule();
            _fsp--;

             current =iv_ruleFunctionModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModule963); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:486:1: ruleFunctionModule returns [EObject current=null] : ( 'function' 'module' (lv_name_2= RULE_STRING ) '{' (lv_mapping_4= ruleFunctionModuleMapping ) '}' ) ;
    public final EObject ruleFunctionModule() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        EObject lv_mapping_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:491:6: ( ( 'function' 'module' (lv_name_2= RULE_STRING ) '{' (lv_mapping_4= ruleFunctionModuleMapping ) '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:492:1: ( 'function' 'module' (lv_name_2= RULE_STRING ) '{' (lv_mapping_4= ruleFunctionModuleMapping ) '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:492:1: ( 'function' 'module' (lv_name_2= RULE_STRING ) '{' (lv_mapping_4= ruleFunctionModuleMapping ) '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:492:2: 'function' 'module' (lv_name_2= RULE_STRING ) '{' (lv_mapping_4= ruleFunctionModuleMapping ) '}'
            {
            match(input,21,FOLLOW_21_in_ruleFunctionModule997); 

                    createLeafNode(grammarAccess.getFunctionModuleAccess().getFunctionKeyword_0(), null); 
                
            match(input,22,FOLLOW_22_in_ruleFunctionModule1006); 

                    createLeafNode(grammarAccess.getFunctionModuleAccess().getModuleKeyword_1(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:500:1: (lv_name_2= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:502:6: lv_name_2= RULE_STRING
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModule1028); 

            		createLeafNode(grammarAccess.getFunctionModuleAccess().getNameSTRINGTerminalRuleCall_2_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_2, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,13,FOLLOW_13_in_ruleFunctionModule1045); 

                    createLeafNode(grammarAccess.getFunctionModuleAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:524:1: (lv_mapping_4= ruleFunctionModuleMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:527:6: lv_mapping_4= ruleFunctionModuleMapping
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionModuleAccess().getMappingFunctionModuleMappingParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule1079);
            lv_mapping_4=ruleFunctionModuleMapping();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionModuleRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        
            	        try {
            	       		set(current, "mapping", lv_mapping_4, "FunctionModuleMapping", currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }

            match(input,14,FOLLOW_14_in_ruleFunctionModule1092); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:556:1: entryRuleFunctionModuleMapping returns [EObject current=null] : iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF ;
    public final EObject entryRuleFunctionModuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModuleMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:556:63: (iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:557:2: iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModuleMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_entryRuleFunctionModuleMapping1125);
            iv_ruleFunctionModuleMapping=ruleFunctionModuleMapping();
            _fsp--;

             current =iv_ruleFunctionModuleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModuleMapping1135); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:564:1: ruleFunctionModuleMapping returns [EObject current=null] : this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping ;
    public final EObject ruleFunctionModuleMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOMapping_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:569:6: (this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:571:5: this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping
            {
             
                    currentNode=createCompositeNode(grammarAccess.getFunctionModuleMappingAccess().getFunctionModulePOJOMappingParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping1181);
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:586:1: entryRuleFunctionModulePOJOMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:586:67: (iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:587:2: iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_entryRuleFunctionModulePOJOMapping1212);
            iv_ruleFunctionModulePOJOMapping=ruleFunctionModulePOJOMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOMapping1222); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:594:1: ruleFunctionModulePOJOMapping returns [EObject current=null] : (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping ) ;
    public final EObject ruleFunctionModulePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOCallMapping_0 = null;

        EObject this_FunctionModulePOJORequestResponseMapping_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:599:6: ( (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:600:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:600:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )
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
                    new NoViableAltException("600:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:601:5: this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJOCallMappingParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping1269);
                    this_FunctionModulePOJOCallMapping_0=ruleFunctionModulePOJOCallMapping();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOCallMapping_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:611:5: this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJORequestResponseMappingParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping1296);
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:626:1: entryRuleFunctionModulePOJOCallMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOCallMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOCallMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:626:71: (iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:627:2: iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOCallMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_entryRuleFunctionModulePOJOCallMapping1328);
            iv_ruleFunctionModulePOJOCallMapping=ruleFunctionModulePOJOCallMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJOCallMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOCallMapping1338); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:634:1: ruleFunctionModulePOJOCallMapping returns [EObject current=null] : ( 'class' (lv_className_1= RULE_ID ) '{' (lv_parameters_3= ruleFunctionModulePOJOParameterMapping )* '}' ) ;
    public final EObject ruleFunctionModulePOJOCallMapping() throws RecognitionException {
        EObject current = null;

        Token lv_className_1=null;
        EObject lv_parameters_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:639:6: ( ( 'class' (lv_className_1= RULE_ID ) '{' (lv_parameters_3= ruleFunctionModulePOJOParameterMapping )* '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:640:1: ( 'class' (lv_className_1= RULE_ID ) '{' (lv_parameters_3= ruleFunctionModulePOJOParameterMapping )* '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:640:1: ( 'class' (lv_className_1= RULE_ID ) '{' (lv_parameters_3= ruleFunctionModulePOJOParameterMapping )* '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:640:2: 'class' (lv_className_1= RULE_ID ) '{' (lv_parameters_3= ruleFunctionModulePOJOParameterMapping )* '}'
            {
            match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOCallMapping1372); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:644:1: (lv_className_1= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:646:6: lv_className_1= RULE_ID
            {
            lv_className_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping1394); 

            		createLeafNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassNameIDTerminalRuleCall_1_0(), "className"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionModulePOJOCallMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "className", lv_className_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJOCallMapping1411); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:668:1: (lv_parameters_3= ruleFunctionModulePOJOParameterMapping )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=25 && LA7_0<=28)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:671:6: lv_parameters_3= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getParametersFunctionModulePOJOParameterMappingParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping1445);
            	    lv_parameters_3=ruleFunctionModulePOJOParameterMapping();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFunctionModulePOJOCallMappingRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "parameters", lv_parameters_3, "FunctionModulePOJOParameterMapping", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJOCallMapping1459); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:700:1: entryRuleFunctionModulePOJORequestResponseMapping returns [EObject current=null] : iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF ;
    public final EObject entryRuleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJORequestResponseMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:700:82: (iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:701:2: iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_entryRuleFunctionModulePOJORequestResponseMapping1492);
            iv_ruleFunctionModulePOJORequestResponseMapping=ruleFunctionModulePOJORequestResponseMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJORequestResponseMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJORequestResponseMapping1502); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:708:1: ruleFunctionModulePOJORequestResponseMapping returns [EObject current=null] : ( 'request' 'class' (lv_requestClassName_2= RULE_ID ) '{' (lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping )* '}' 'response' 'class' (lv_responseClassName_8= RULE_ID ) '{' (lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping )* '}' ) ;
    public final EObject ruleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        EObject current = null;

        Token lv_requestClassName_2=null;
        Token lv_responseClassName_8=null;
        EObject lv_requestParameters_4 = null;

        EObject lv_responseParameters_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:713:6: ( ( 'request' 'class' (lv_requestClassName_2= RULE_ID ) '{' (lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping )* '}' 'response' 'class' (lv_responseClassName_8= RULE_ID ) '{' (lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping )* '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:714:1: ( 'request' 'class' (lv_requestClassName_2= RULE_ID ) '{' (lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping )* '}' 'response' 'class' (lv_responseClassName_8= RULE_ID ) '{' (lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping )* '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:714:1: ( 'request' 'class' (lv_requestClassName_2= RULE_ID ) '{' (lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping )* '}' 'response' 'class' (lv_responseClassName_8= RULE_ID ) '{' (lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping )* '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:714:2: 'request' 'class' (lv_requestClassName_2= RULE_ID ) '{' (lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping )* '}' 'response' 'class' (lv_responseClassName_8= RULE_ID ) '{' (lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping )* '}'
            {
            match(input,23,FOLLOW_23_in_ruleFunctionModulePOJORequestResponseMapping1536); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestKeyword_0(), null); 
                
            match(input,15,FOLLOW_15_in_ruleFunctionModulePOJORequestResponseMapping1545); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_1(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:722:1: (lv_requestClassName_2= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:724:6: lv_requestClassName_2= RULE_ID
            {
            lv_requestClassName_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1567); 

            		createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestClassNameIDTerminalRuleCall_2_0(), "requestClassName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionModulePOJORequestResponseMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "requestClassName", lv_requestClassName_2, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping1584); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:746:1: (lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=25 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:749:6: lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestParametersFunctionModulePOJOParameterMappingParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1618);
            	    lv_requestParameters_4=ruleFunctionModulePOJOParameterMapping();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFunctionModulePOJORequestResponseMappingRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "requestParameters", lv_requestParameters_4, "FunctionModulePOJOParameterMapping", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping1632); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRightCurlyBracketKeyword_5(), null); 
                
            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJORequestResponseMapping1641); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseKeyword_6(), null); 
                
            match(input,15,FOLLOW_15_in_ruleFunctionModulePOJORequestResponseMapping1650); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_7(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:779:1: (lv_responseClassName_8= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:781:6: lv_responseClassName_8= RULE_ID
            {
            lv_responseClassName_8=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1672); 

            		createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseClassNameIDTerminalRuleCall_8_0(), "responseClassName"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionModulePOJORequestResponseMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "responseClassName", lv_responseClassName_8, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping1689); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_9(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:803:1: (lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=25 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:806:6: lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseParametersFunctionModulePOJOParameterMappingParserRuleCall_10_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1723);
            	    lv_responseParameters_10=ruleFunctionModulePOJOParameterMapping();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getFunctionModulePOJORequestResponseMappingRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        
            	    	        try {
            	    	       		add(current, "responseParameters", lv_responseParameters_10, "FunctionModulePOJOParameterMapping", currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping1737); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:835:1: entryRuleFunctionModulePOJOParameterMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOParameterMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOParameterMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:835:76: (iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:836:2: iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_entryRuleFunctionModulePOJOParameterMapping1770);
            iv_ruleFunctionModulePOJOParameterMapping=ruleFunctionModulePOJOParameterMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJOParameterMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOParameterMapping1780); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:843:1: ruleFunctionModulePOJOParameterMapping returns [EObject current=null] : (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter ) ;
    public final EObject ruleFunctionModulePOJOParameterMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOImportingParameter_0 = null;

        EObject this_FunctionModulePOJOExportingParameter_1 = null;

        EObject this_FunctionModulePOJOChangingParameter_2 = null;

        EObject this_FunctionModulePOJOTablesParameter_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:848:6: ( (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:849:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:849:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )
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
                    new NoViableAltException("849:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:850:5: this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOImportingParameterParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping1827);
                    this_FunctionModulePOJOImportingParameter_0=ruleFunctionModulePOJOImportingParameter();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOImportingParameter_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:860:5: this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOExportingParameterParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping1854);
                    this_FunctionModulePOJOExportingParameter_1=ruleFunctionModulePOJOExportingParameter();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOExportingParameter_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:870:5: this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOChangingParameterParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping1881);
                    this_FunctionModulePOJOChangingParameter_2=ruleFunctionModulePOJOChangingParameter();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOChangingParameter_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:880:5: this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOTablesParameterParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping1908);
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:895:1: entryRuleFunctionModulePOJOImportingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOImportingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOImportingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:895:78: (iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:896:2: iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOImportingParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_entryRuleFunctionModulePOJOImportingParameter1940);
            iv_ruleFunctionModulePOJOImportingParameter=ruleFunctionModulePOJOImportingParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOImportingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOImportingParameter1950); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:903:1: ruleFunctionModulePOJOImportingParameter returns [EObject current=null] : ( 'importing' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOImportingParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Token lv_inactive_4=null;
        Token lv_attribute_6=null;
        Token lv_name_8=null;
        Token lv_inactive_10=null;
        Token lv_attribute_12=null;
        Token lv_table_13=null;
        Token lv_name_14=null;
        Token lv_inactive_16=null;
        Token lv_attribute_18=null;
        Token lv_comment_20=null;
        Enumerator lv_type_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:908:6: ( ( 'importing' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:909:1: ( 'importing' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:909:1: ( 'importing' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:909:2: 'importing' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';'
            {
            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter1984); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getImportingKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:913:1: ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) )
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
                    new NoViableAltException("913:1: ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:913:2: ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:913:2: ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:913:3: 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter1995); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getFieldKeyword_1_0_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:917:1: (lv_name_2= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:919:6: lv_name_2= RULE_STRING
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2017); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_2, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter2034); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_0_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:941:1: ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) )
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
                            new NoViableAltException("941:1: ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) )", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:941:2: (lv_inactive_4= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:941:2: (lv_inactive_4= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:943:6: lv_inactive_4= 'inactive'
                            {
                            lv_inactive_4=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter2056); 

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
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:963:6: ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:963:6: ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:963:7: (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:963:7: (lv_type_5= ruleDataType )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:966:6: lv_type_5= ruleDataType
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleFunctionModulePOJOImportingParameter2110);
                            lv_type_5=ruleDataType();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_5, "DataType", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:984:2: (lv_attribute_6= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:986:6: lv_attribute_6= RULE_ID
                            {
                            lv_attribute_6=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2136); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0(), "attribute"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "attribute", lv_attribute_6, "ID", lastConsumedNode);
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
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1005:6: ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1005:6: ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1005:7: 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleFunctionModulePOJOImportingParameter2163); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureKeyword_1_1_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1009:1: (lv_name_8= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1011:6: lv_name_8= RULE_STRING
                    {
                    lv_name_8=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2185); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_8, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter2202); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_1_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1033:1: ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) )
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
                            new NoViableAltException("1033:1: ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) )", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1033:2: (lv_inactive_10= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1033:2: (lv_inactive_10= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1035:6: lv_inactive_10= 'inactive'
                            {
                            lv_inactive_10=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter2224); 

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
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1055:6: ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1055:6: ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1055:7: ( RULE_ID ) (lv_attribute_12= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1055:7: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1058:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2266); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureMappingCrossReference_1_1_3_1_0_0(), "structure"); 
                            	

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1071:2: (lv_attribute_12= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1073:6: lv_attribute_12= RULE_ID
                            {
                            lv_attribute_12=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2291); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0(), "attribute"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "attribute", lv_attribute_12, "ID", lastConsumedNode);
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
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1092:6: ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1092:6: ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1092:7: (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1092:7: (lv_table_13= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1094:6: lv_table_13= 'table'
                    {
                    lv_table_13=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOImportingParameter2330); 

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

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1113:2: (lv_name_14= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1115:6: lv_name_14= RULE_STRING
                    {
                    lv_name_14=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2365); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_14, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter2382); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_2_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1137:1: ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) )
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
                            new NoViableAltException("1137:1: ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) )", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1137:2: (lv_inactive_16= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1137:2: (lv_inactive_16= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1139:6: lv_inactive_16= 'inactive'
                            {
                            lv_inactive_16=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter2404); 

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
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1159:6: ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1159:6: ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1159:7: ( RULE_ID ) (lv_attribute_18= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1159:7: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1162:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2446); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureMappingCrossReference_1_2_3_1_0_0(), "structure"); 
                            	

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1175:2: (lv_attribute_18= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1177:6: lv_attribute_18= RULE_ID
                            {
                            lv_attribute_18=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2471); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0(), "attribute"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "attribute", lv_attribute_18, "ID", lastConsumedNode);
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
                    break;

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1195:6: ( 'comment' (lv_comment_20= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1195:7: 'comment' (lv_comment_20= RULE_STRING )
                    {
                    match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOImportingParameter2493); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentKeyword_2_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1199:1: (lv_comment_20= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1201:6: lv_comment_20= RULE_STRING
                    {
                    lv_comment_20=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2515); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0(), "comment"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "comment", lv_comment_20, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter2534); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1230:1: entryRuleFunctionModulePOJOExportingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOExportingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOExportingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1230:78: (iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1231:2: iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOExportingParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_entryRuleFunctionModulePOJOExportingParameter2567);
            iv_ruleFunctionModulePOJOExportingParameter=ruleFunctionModulePOJOExportingParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOExportingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOExportingParameter2577); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1238:1: ruleFunctionModulePOJOExportingParameter returns [EObject current=null] : ( 'exporting' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOExportingParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Token lv_inactive_4=null;
        Token lv_attribute_6=null;
        Token lv_name_8=null;
        Token lv_inactive_10=null;
        Token lv_attribute_12=null;
        Token lv_table_13=null;
        Token lv_name_14=null;
        Token lv_inactive_16=null;
        Token lv_attribute_18=null;
        Token lv_comment_20=null;
        Enumerator lv_type_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1243:6: ( ( 'exporting' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1244:1: ( 'exporting' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1244:1: ( 'exporting' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1244:2: 'exporting' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';'
            {
            match(input,27,FOLLOW_27_in_ruleFunctionModulePOJOExportingParameter2611); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExportingKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1248:1: ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) )
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
                    new NoViableAltException("1248:1: ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1248:2: ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1248:2: ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1248:3: 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter2622); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getFieldKeyword_1_0_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1252:1: (lv_name_2= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1254:6: lv_name_2= RULE_STRING
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2644); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_2, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter2661); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_0_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1276:1: ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) )
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
                            new NoViableAltException("1276:1: ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) )", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1276:2: (lv_inactive_4= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1276:2: (lv_inactive_4= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1278:6: lv_inactive_4= 'inactive'
                            {
                            lv_inactive_4=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter2683); 

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
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1298:6: ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1298:6: ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1298:7: (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1298:7: (lv_type_5= ruleDataType )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1301:6: lv_type_5= ruleDataType
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleFunctionModulePOJOExportingParameter2737);
                            lv_type_5=ruleDataType();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_5, "DataType", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1319:2: (lv_attribute_6= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1321:6: lv_attribute_6= RULE_ID
                            {
                            lv_attribute_6=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2763); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0(), "attribute"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "attribute", lv_attribute_6, "ID", lastConsumedNode);
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
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1340:6: ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1340:6: ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1340:7: 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleFunctionModulePOJOExportingParameter2790); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureKeyword_1_1_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1344:1: (lv_name_8= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1346:6: lv_name_8= RULE_STRING
                    {
                    lv_name_8=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2812); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_8, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter2829); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_1_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1368:1: ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) )
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
                            new NoViableAltException("1368:1: ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) )", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1368:2: (lv_inactive_10= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1368:2: (lv_inactive_10= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1370:6: lv_inactive_10= 'inactive'
                            {
                            lv_inactive_10=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter2851); 

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
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1390:6: ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1390:6: ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1390:7: ( RULE_ID ) (lv_attribute_12= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1390:7: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1393:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2893); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureMappingCrossReference_1_1_3_1_0_0(), "structure"); 
                            	

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1406:2: (lv_attribute_12= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1408:6: lv_attribute_12= RULE_ID
                            {
                            lv_attribute_12=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2918); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0(), "attribute"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "attribute", lv_attribute_12, "ID", lastConsumedNode);
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
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1427:6: ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1427:6: ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1427:7: (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1427:7: (lv_table_13= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1429:6: lv_table_13= 'table'
                    {
                    lv_table_13=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOExportingParameter2957); 

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

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1448:2: (lv_name_14= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1450:6: lv_name_14= RULE_STRING
                    {
                    lv_name_14=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2992); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_14, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter3009); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_2_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1472:1: ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) )
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
                            new NoViableAltException("1472:1: ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) )", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1472:2: (lv_inactive_16= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1472:2: (lv_inactive_16= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1474:6: lv_inactive_16= 'inactive'
                            {
                            lv_inactive_16=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter3031); 

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
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1494:6: ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1494:6: ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1494:7: ( RULE_ID ) (lv_attribute_18= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1494:7: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1497:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3073); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureMappingCrossReference_1_2_3_1_0_0(), "structure"); 
                            	

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1510:2: (lv_attribute_18= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1512:6: lv_attribute_18= RULE_ID
                            {
                            lv_attribute_18=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3098); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0(), "attribute"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "attribute", lv_attribute_18, "ID", lastConsumedNode);
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
                    break;

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1530:6: ( 'comment' (lv_comment_20= RULE_STRING ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1530:7: 'comment' (lv_comment_20= RULE_STRING )
                    {
                    match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOExportingParameter3120); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentKeyword_2_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1534:1: (lv_comment_20= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1536:6: lv_comment_20= RULE_STRING
                    {
                    lv_comment_20=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3142); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0(), "comment"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "comment", lv_comment_20, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter3161); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1565:1: entryRuleFunctionModulePOJOChangingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOChangingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOChangingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1565:77: (iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1566:2: iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOChangingParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_entryRuleFunctionModulePOJOChangingParameter3194);
            iv_ruleFunctionModulePOJOChangingParameter=ruleFunctionModulePOJOChangingParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOChangingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOChangingParameter3204); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1573:1: ruleFunctionModulePOJOChangingParameter returns [EObject current=null] : ( 'changing' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOChangingParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Token lv_inactive_4=null;
        Token lv_attribute_6=null;
        Token lv_name_8=null;
        Token lv_inactive_10=null;
        Token lv_attribute_12=null;
        Token lv_table_13=null;
        Token lv_name_14=null;
        Token lv_inactive_16=null;
        Token lv_attribute_18=null;
        Token lv_comment_20=null;
        Enumerator lv_type_5 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1578:6: ( ( 'changing' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1579:1: ( 'changing' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1579:1: ( 'changing' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1579:2: 'changing' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';'
            {
            match(input,28,FOLLOW_28_in_ruleFunctionModulePOJOChangingParameter3238); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getChangingKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1583:1: ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) )
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
                    new NoViableAltException("1583:1: ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) ) | ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1583:2: ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1583:2: ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1583:3: 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) )
                    {
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter3249); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getFieldKeyword_1_0_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1587:1: (lv_name_2= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1589:6: lv_name_2= RULE_STRING
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3271); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_0_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_2, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter3288); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_0_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1611:1: ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) )
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
                            new NoViableAltException("1611:1: ( (lv_inactive_4= 'inactive' ) | ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) ) )", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1611:2: (lv_inactive_4= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1611:2: (lv_inactive_4= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1613:6: lv_inactive_4= 'inactive'
                            {
                            lv_inactive_4=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter3310); 

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
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1633:6: ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1633:6: ( (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1633:7: (lv_type_5= ruleDataType ) (lv_attribute_6= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1633:7: (lv_type_5= ruleDataType )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1636:6: lv_type_5= ruleDataType
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleFunctionModulePOJOChangingParameter3364);
                            lv_type_5=ruleDataType();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_5, "DataType", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1654:2: (lv_attribute_6= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1656:6: lv_attribute_6= RULE_ID
                            {
                            lv_attribute_6=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3390); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_0_3_1_1_0(), "attribute"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "attribute", lv_attribute_6, "ID", lastConsumedNode);
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
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1675:6: ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1675:6: ( 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1675:7: 'structure' (lv_name_8= RULE_STRING ) '=' ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) )
                    {
                    match(input,12,FOLLOW_12_in_ruleFunctionModulePOJOChangingParameter3417); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureKeyword_1_1_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1679:1: (lv_name_8= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1681:6: lv_name_8= RULE_STRING
                    {
                    lv_name_8=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3439); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_1_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_8, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter3456); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_1_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1703:1: ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) )
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
                            new NoViableAltException("1703:1: ( (lv_inactive_10= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) ) )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1703:2: (lv_inactive_10= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1703:2: (lv_inactive_10= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1705:6: lv_inactive_10= 'inactive'
                            {
                            lv_inactive_10=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter3478); 

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
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1725:6: ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1725:6: ( ( RULE_ID ) (lv_attribute_12= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1725:7: ( RULE_ID ) (lv_attribute_12= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1725:7: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1728:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3520); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureMappingCrossReference_1_1_3_1_0_0(), "structure"); 
                            	

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1741:2: (lv_attribute_12= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1743:6: lv_attribute_12= RULE_ID
                            {
                            lv_attribute_12=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3545); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_1_1_0(), "attribute"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "attribute", lv_attribute_12, "ID", lastConsumedNode);
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
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1762:6: ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1762:6: ( (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1762:7: (lv_table_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1762:7: (lv_table_13= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1764:6: lv_table_13= 'table'
                    {
                    lv_table_13=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOChangingParameter3584); 

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

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1783:2: (lv_name_14= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1785:6: lv_name_14= RULE_STRING
                    {
                    lv_name_14=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3619); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0(), "name"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "name", lv_name_14, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter3636); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_2_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1807:1: ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) )
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
                            new NoViableAltException("1807:1: ( (lv_inactive_16= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) ) )", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1807:2: (lv_inactive_16= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1807:2: (lv_inactive_16= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1809:6: lv_inactive_16= 'inactive'
                            {
                            lv_inactive_16=(Token)input.LT(1);
                            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter3658); 

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
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1829:6: ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1829:6: ( ( RULE_ID ) (lv_attribute_18= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1829:7: ( RULE_ID ) (lv_attribute_18= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1829:7: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1832:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3700); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureMappingCrossReference_1_2_3_1_0_0(), "structure"); 
                            	

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1845:2: (lv_attribute_18= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1847:6: lv_attribute_18= RULE_ID
                            {
                            lv_attribute_18=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3725); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0(), "attribute"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "attribute", lv_attribute_18, "ID", lastConsumedNode);
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
                    break;

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1865:6: ( 'comment' (lv_comment_20= RULE_STRING ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1865:7: 'comment' (lv_comment_20= RULE_STRING )
                    {
                    match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOChangingParameter3747); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentKeyword_2_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1869:1: (lv_comment_20= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1871:6: lv_comment_20= RULE_STRING
                    {
                    lv_comment_20=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3769); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0(), "comment"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "comment", lv_comment_20, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter3788); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1900:1: entryRuleFunctionModulePOJOTablesParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOTablesParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOTablesParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1900:75: (iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1901:2: iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOTablesParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_entryRuleFunctionModulePOJOTablesParameter3821);
            iv_ruleFunctionModulePOJOTablesParameter=ruleFunctionModulePOJOTablesParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOTablesParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOTablesParameter3831); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1908:1: ruleFunctionModulePOJOTablesParameter returns [EObject current=null] : ( 'table' (lv_name_1= RULE_STRING ) '=' ( (lv_inactive_3= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOTablesParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_inactive_3=null;
        Token lv_attribute_5=null;
        Token lv_comment_7=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1913:6: ( ( 'table' (lv_name_1= RULE_STRING ) '=' ( (lv_inactive_3= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1914:1: ( 'table' (lv_name_1= RULE_STRING ) '=' ( (lv_inactive_3= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1914:1: ( 'table' (lv_name_1= RULE_STRING ) '=' ( (lv_inactive_3= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1914:2: 'table' (lv_name_1= RULE_STRING ) '=' ( (lv_inactive_3= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? ';'
            {
            match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOTablesParameter3865); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getTableKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1918:1: (lv_name_1= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1920:6: lv_name_1= RULE_STRING
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter3887); 

            		createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getNameSTRINGTerminalRuleCall_1_0(), "name"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "name", lv_name_1, "STRING", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOTablesParameter3904); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getEqualsSignKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1942:1: ( (lv_inactive_3= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_5= RULE_ID ) ) )
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
                    new NoViableAltException("1942:1: ( (lv_inactive_3= 'inactive' ) | ( ( RULE_ID ) (lv_attribute_5= RULE_ID ) ) )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1942:2: (lv_inactive_3= 'inactive' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1942:2: (lv_inactive_3= 'inactive' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1944:6: lv_inactive_3= 'inactive'
                    {
                    lv_inactive_3=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOTablesParameter3926); 

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
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1964:6: ( ( RULE_ID ) (lv_attribute_5= RULE_ID ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1964:6: ( ( RULE_ID ) (lv_attribute_5= RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1964:7: ( RULE_ID ) (lv_attribute_5= RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1964:7: ( RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1967:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter3968); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getStructureStructureMappingCrossReference_3_1_0_0(), "structure"); 
                    	

                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1980:2: (lv_attribute_5= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1982:6: lv_attribute_5= RULE_ID
                    {
                    lv_attribute_5=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter3993); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getAttributeIDTerminalRuleCall_3_1_1_0(), "attribute"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "attribute", lv_attribute_5, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2000:4: ( 'comment' (lv_comment_7= RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2000:5: 'comment' (lv_comment_7= RULE_STRING )
                    {
                    match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOTablesParameter4013); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentKeyword_4_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2004:1: (lv_comment_7= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2006:6: lv_comment_7= RULE_STRING
                    {
                    lv_comment_7=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter4035); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentSTRINGTerminalRuleCall_4_1_0(), "comment"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "comment", lv_comment_7, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOTablesParameter4054); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2035:1: ruleDataType returns [Enumerator current=null] : ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2039:6: ( ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2040:1: ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2040:1: ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) )
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
                    new NoViableAltException("2040:1: ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2040:2: ( 'BigDecimal' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2040:2: ( 'BigDecimal' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2040:4: 'BigDecimal'
                    {
                    match(input,29,FOLLOW_29_in_ruleDataType4101); 

                            current = grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2046:6: ( 'BigInteger' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2046:6: ( 'BigInteger' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2046:8: 'BigInteger'
                    {
                    match(input,30,FOLLOW_30_in_ruleDataType4116); 

                            current = grammarAccess.getDataTypeAccess().getBIG_INTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBIG_INTEGEREnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2052:6: ( 'Boolean' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2052:6: ( 'Boolean' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2052:8: 'Boolean'
                    {
                    match(input,31,FOLLOW_31_in_ruleDataType4131); 

                            current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2058:6: ( 'Byte' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2058:6: ( 'Byte' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2058:8: 'Byte'
                    {
                    match(input,32,FOLLOW_32_in_ruleDataType4146); 

                            current = grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2064:6: ( 'ByteArray' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2064:6: ( 'ByteArray' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2064:8: 'ByteArray'
                    {
                    match(input,33,FOLLOW_33_in_ruleDataType4161); 

                            current = grammarAccess.getDataTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2070:6: ( 'Char' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2070:6: ( 'Char' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2070:8: 'Char'
                    {
                    match(input,34,FOLLOW_34_in_ruleDataType4176); 

                            current = grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2076:6: ( 'CharArray' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2076:6: ( 'CharArray' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2076:8: 'CharArray'
                    {
                    match(input,35,FOLLOW_35_in_ruleDataType4191); 

                            current = grammarAccess.getDataTypeAccess().getCHAR_ARRAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getCHAR_ARRAYEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2082:6: ( 'Date' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2082:6: ( 'Date' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2082:8: 'Date'
                    {
                    match(input,36,FOLLOW_36_in_ruleDataType4206); 

                            current = grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2088:6: ( 'Double' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2088:6: ( 'Double' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2088:8: 'Double'
                    {
                    match(input,37,FOLLOW_37_in_ruleDataType4221); 

                            current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2094:6: ( 'Float' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2094:6: ( 'Float' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2094:8: 'Float'
                    {
                    match(input,38,FOLLOW_38_in_ruleDataType4236); 

                            current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2100:6: ( 'Integer' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2100:6: ( 'Integer' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2100:8: 'Integer'
                    {
                    match(input,39,FOLLOW_39_in_ruleDataType4251); 

                            current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2106:6: ( 'Long' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2106:6: ( 'Long' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2106:8: 'Long'
                    {
                    match(input,40,FOLLOW_40_in_ruleDataType4266); 

                            current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2112:6: ( 'Short' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2112:6: ( 'Short' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2112:8: 'Short'
                    {
                    match(input,41,FOLLOW_41_in_ruleDataType4281); 

                            current = grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2118:6: ( 'String' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2118:6: ( 'String' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2118:8: 'String'
                    {
                    match(input,42,FOLLOW_42_in_ruleDataType4296); 

                            current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2124:6: ( 'Time' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2124:6: ( 'Time' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2124:8: 'Time'
                    {
                    match(input,43,FOLLOW_43_in_ruleDataType4311); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel139 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleModel181 = new BitSet(new long[]{0x0000000000201002L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_ruleModel220 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStructure302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructure324 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructure341 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleStructureMapping_in_ruleStructure375 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStructure388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureMapping_in_entryRuleStructureMapping421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureMapping431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructurePOJOMapping_in_ruleStructureMapping477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructurePOJOMapping_in_entryRuleStructurePOJOMapping508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructurePOJOMapping518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStructurePOJOMapping552 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructurePOJOMapping574 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructurePOJOMapping591 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping626 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStructurePOJOMapping639 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleStructurePOJOMapping650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_entryRuleStructureFieldPOJOMapping683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureFieldPOJOMapping693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStructureFieldPOJOMapping727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping749 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructureFieldPOJOMapping766 = new BitSet(new long[]{0x00000FFFE0080000L});
    public static final BitSet FOLLOW_19_in_ruleStructureFieldPOJOMapping788 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleStructureFieldPOJOMapping842 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping868 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleStructureFieldPOJOMapping888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_entryRuleFunctionModule953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModule963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModule997 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModule1006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModule1028 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModule1045 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule1079 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModule1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_entryRuleFunctionModuleMapping1125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModuleMapping1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_entryRuleFunctionModulePOJOMapping1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOMapping1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_entryRuleFunctionModulePOJOCallMapping1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOCallMapping1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOCallMapping1372 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping1394 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJOCallMapping1411 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping1445 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJOCallMapping1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_entryRuleFunctionModulePOJORequestResponseMapping1492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJORequestResponseMapping1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJORequestResponseMapping1536 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJORequestResponseMapping1545 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1567 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping1584 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1618 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping1632 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJORequestResponseMapping1641 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJORequestResponseMapping1650 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1672 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping1689 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1723 = new BitSet(new long[]{0x000000001E004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_entryRuleFunctionModulePOJOParameterMapping1770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOParameterMapping1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_entryRuleFunctionModulePOJOImportingParameter1940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOImportingParameter1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter1984 = new BitSet(new long[]{0x0000000004021000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter1995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2017 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter2034 = new BitSet(new long[]{0x00000FFFE0080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter2056 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunctionModulePOJOImportingParameter2110 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2136 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJOImportingParameter2163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2185 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter2202 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter2224 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2291 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOImportingParameter2330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2365 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter2382 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter2404 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2446 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2471 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOImportingParameter2493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2515 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_entryRuleFunctionModulePOJOExportingParameter2567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOExportingParameter2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionModulePOJOExportingParameter2611 = new BitSet(new long[]{0x0000000004021000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter2622 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2644 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter2661 = new BitSet(new long[]{0x00000FFFE0080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter2683 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunctionModulePOJOExportingParameter2737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2763 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJOExportingParameter2790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2812 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter2829 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter2851 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2893 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2918 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOExportingParameter2957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2992 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter3009 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter3031 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3073 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3098 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOExportingParameter3120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3142 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_entryRuleFunctionModulePOJOChangingParameter3194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOChangingParameter3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFunctionModulePOJOChangingParameter3238 = new BitSet(new long[]{0x0000000004021000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter3249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3271 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter3288 = new BitSet(new long[]{0x00000FFFE0080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter3310 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunctionModulePOJOChangingParameter3364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3390 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJOChangingParameter3417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3439 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter3456 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter3478 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3520 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3545 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOChangingParameter3584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3619 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter3636 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter3658 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3700 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3725 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOChangingParameter3747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3769 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_entryRuleFunctionModulePOJOTablesParameter3821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOTablesParameter3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOTablesParameter3865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter3887 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOTablesParameter3904 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOTablesParameter3926 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter3968 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter3993 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOTablesParameter4013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter4035 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOTablesParameter4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleDataType4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDataType4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDataType4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDataType4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDataType4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDataType4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDataType4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDataType4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDataType4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataType4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDataType4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDataType4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDataType4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDataType4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDataType4311 = new BitSet(new long[]{0x0000000000000002L});

}