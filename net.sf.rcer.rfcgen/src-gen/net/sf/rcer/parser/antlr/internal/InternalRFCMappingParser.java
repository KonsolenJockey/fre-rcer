package net.sf.rcer.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import net.sf.rcer.services.RFCMappingGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class InternalRFCMappingParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'structure'", "'{'", "'}'", "'class'", "'field'", "'='", "'comment'", "';'", "'function'", "'module'", "'request'", "'response'", "'import'", "'inactive'", "'table'", "'export'", "'change'"
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
    public String getGrammarFileName() { return "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g"; }


     
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
        	return classLoader.getResourceAsStream("net/sf/rcer/parser/antlr/internal/InternalRFCMapping.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	} 



    // $ANTLR start entryRuleModel
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:72:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:72:47: (iv_ruleModel= ruleModel EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:73:2: iv_ruleModel= ruleModel EOF
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:80:1: ruleModel returns [EObject current=null] : ( 'package' (lv_packageName_1= RULE_STRING ) (lv_structures_2= ruleStructure )* (lv_functionModules_3= ruleFunctionModule )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_packageName_1=null;
        EObject lv_structures_2 = null;

        EObject lv_functionModules_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:85:6: ( ( 'package' (lv_packageName_1= RULE_STRING ) (lv_structures_2= ruleStructure )* (lv_functionModules_3= ruleFunctionModule )* ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:86:1: ( 'package' (lv_packageName_1= RULE_STRING ) (lv_structures_2= ruleStructure )* (lv_functionModules_3= ruleFunctionModule )* )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:86:1: ( 'package' (lv_packageName_1= RULE_STRING ) (lv_structures_2= ruleStructure )* (lv_functionModules_3= ruleFunctionModule )* )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:86:2: 'package' (lv_packageName_1= RULE_STRING ) (lv_structures_2= ruleStructure )* (lv_functionModules_3= ruleFunctionModule )*
            {
            match(input,11,FOLLOW_11_in_ruleModel117); 

                    createLeafNode(grammarAccess.getModelAccess().getPackageKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:90:1: (lv_packageName_1= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:92:6: lv_packageName_1= RULE_STRING
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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:110:2: (lv_structures_2= ruleStructure )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:113:6: lv_structures_2= ruleStructure
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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:131:3: (lv_functionModules_3= ruleFunctionModule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:134:6: lv_functionModules_3= ruleFunctionModule
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:159:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:159:51: (iv_ruleStructure= ruleStructure EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:160:2: iv_ruleStructure= ruleStructure EOF
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:167:1: ruleStructure returns [EObject current=null] : ( 'structure' (lv_name_1= RULE_STRING ) '{' (lv_mapping_3= ruleStructureMapping ) '}' ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        EObject lv_mapping_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:172:6: ( ( 'structure' (lv_name_1= RULE_STRING ) '{' (lv_mapping_3= ruleStructureMapping ) '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:173:1: ( 'structure' (lv_name_1= RULE_STRING ) '{' (lv_mapping_3= ruleStructureMapping ) '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:173:1: ( 'structure' (lv_name_1= RULE_STRING ) '{' (lv_mapping_3= ruleStructureMapping ) '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:173:2: 'structure' (lv_name_1= RULE_STRING ) '{' (lv_mapping_3= ruleStructureMapping ) '}'
            {
            match(input,12,FOLLOW_12_in_ruleStructure302); 

                    createLeafNode(grammarAccess.getStructureAccess().getStructureKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:177:1: (lv_name_1= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:179:6: lv_name_1= RULE_STRING
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
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:201:1: (lv_mapping_3= ruleStructureMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:204:6: lv_mapping_3= ruleStructureMapping
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:233:1: entryRuleStructureMapping returns [EObject current=null] : iv_ruleStructureMapping= ruleStructureMapping EOF ;
    public final EObject entryRuleStructureMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:233:58: (iv_ruleStructureMapping= ruleStructureMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:234:2: iv_ruleStructureMapping= ruleStructureMapping EOF
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:241:1: ruleStructureMapping returns [EObject current=null] : this_StructurePOJOMapping_0= ruleStructurePOJOMapping ;
    public final EObject ruleStructureMapping() throws RecognitionException {
        EObject current = null;

        EObject this_StructurePOJOMapping_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:246:6: (this_StructurePOJOMapping_0= ruleStructurePOJOMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:248:5: this_StructurePOJOMapping_0= ruleStructurePOJOMapping
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:263:1: entryRuleStructurePOJOMapping returns [EObject current=null] : iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF ;
    public final EObject entryRuleStructurePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructurePOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:263:62: (iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:264:2: iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:271:1: ruleStructurePOJOMapping returns [EObject current=null] : ( 'class' (lv_className_1= RULE_ID ) '{' (lv_fields_3= ruleStructureFieldPOJOMapping )* '}' ) ;
    public final EObject ruleStructurePOJOMapping() throws RecognitionException {
        EObject current = null;

        Token lv_className_1=null;
        EObject lv_fields_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:276:6: ( ( 'class' (lv_className_1= RULE_ID ) '{' (lv_fields_3= ruleStructureFieldPOJOMapping )* '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:277:1: ( 'class' (lv_className_1= RULE_ID ) '{' (lv_fields_3= ruleStructureFieldPOJOMapping )* '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:277:1: ( 'class' (lv_className_1= RULE_ID ) '{' (lv_fields_3= ruleStructureFieldPOJOMapping )* '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:277:2: 'class' (lv_className_1= RULE_ID ) '{' (lv_fields_3= ruleStructureFieldPOJOMapping )* '}'
            {
            match(input,15,FOLLOW_15_in_ruleStructurePOJOMapping552); 

                    createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getClassKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:281:1: (lv_className_1= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:283:6: lv_className_1= RULE_ID
            {
            lv_className_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructurePOJOMapping574); 

            		createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getClassNameIDTerminalRuleCall_1_0(), "className"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructurePOJOMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "className", lv_className_1, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            match(input,13,FOLLOW_13_in_ruleStructurePOJOMapping591); 

                    createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:305:1: (lv_fields_3= ruleStructureFieldPOJOMapping )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:308:6: lv_fields_3= ruleStructureFieldPOJOMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStructurePOJOMappingAccess().getFieldsStructureFieldPOJOMappingParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping625);
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
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleStructurePOJOMapping639); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:337:1: entryRuleStructureFieldPOJOMapping returns [EObject current=null] : iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF ;
    public final EObject entryRuleStructureFieldPOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureFieldPOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:337:67: (iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:338:2: iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructureFieldPOJOMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_entryRuleStructureFieldPOJOMapping672);
            iv_ruleStructureFieldPOJOMapping=ruleStructureFieldPOJOMapping();
            _fsp--;

             current =iv_ruleStructureFieldPOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureFieldPOJOMapping682); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:345:1: ruleStructureFieldPOJOMapping returns [EObject current=null] : ( 'field' (lv_name_1= RULE_STRING ) '=' (lv_type_3= RULE_ID ) (lv_attribute_4= RULE_ID ) ( 'comment' (lv_comment_6= RULE_STRING ) )? ';' ) ;
    public final EObject ruleStructureFieldPOJOMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_type_3=null;
        Token lv_attribute_4=null;
        Token lv_comment_6=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:350:6: ( ( 'field' (lv_name_1= RULE_STRING ) '=' (lv_type_3= RULE_ID ) (lv_attribute_4= RULE_ID ) ( 'comment' (lv_comment_6= RULE_STRING ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:351:1: ( 'field' (lv_name_1= RULE_STRING ) '=' (lv_type_3= RULE_ID ) (lv_attribute_4= RULE_ID ) ( 'comment' (lv_comment_6= RULE_STRING ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:351:1: ( 'field' (lv_name_1= RULE_STRING ) '=' (lv_type_3= RULE_ID ) (lv_attribute_4= RULE_ID ) ( 'comment' (lv_comment_6= RULE_STRING ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:351:2: 'field' (lv_name_1= RULE_STRING ) '=' (lv_type_3= RULE_ID ) (lv_attribute_4= RULE_ID ) ( 'comment' (lv_comment_6= RULE_STRING ) )? ';'
            {
            match(input,16,FOLLOW_16_in_ruleStructureFieldPOJOMapping716); 

                    createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getFieldKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:355:1: (lv_name_1= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:357:6: lv_name_1= RULE_STRING
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping738); 

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

            match(input,17,FOLLOW_17_in_ruleStructureFieldPOJOMapping755); 

                    createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getEqualsSignKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:379:1: (lv_type_3= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:381:6: lv_type_3= RULE_ID
            {
            lv_type_3=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping777); 

            		createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getTypeIDTerminalRuleCall_3_0(), "type"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructureFieldPOJOMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "type", lv_type_3, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:399:2: (lv_attribute_4= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:401:6: lv_attribute_4= RULE_ID
            {
            lv_attribute_4=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping807); 

            		createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getAttributeIDTerminalRuleCall_4_0(), "attribute"); 
            	

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getStructureFieldPOJOMappingRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        
            	        try {
            	       		set(current, "attribute", lv_attribute_4, "ID", lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:419:2: ( 'comment' (lv_comment_6= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:419:3: 'comment' (lv_comment_6= RULE_STRING )
                    {
                    match(input,18,FOLLOW_18_in_ruleStructureFieldPOJOMapping825); 

                            createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getCommentKeyword_5_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:423:1: (lv_comment_6= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:425:6: lv_comment_6= RULE_STRING
                    {
                    lv_comment_6=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping847); 

                    		createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getCommentSTRINGTerminalRuleCall_5_1_0(), "comment"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getStructureFieldPOJOMappingRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "comment", lv_comment_6, "STRING", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;

            }

            match(input,19,FOLLOW_19_in_ruleStructureFieldPOJOMapping866); 

                    createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getSemicolonKeyword_6(), null); 
                

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:454:1: entryRuleFunctionModule returns [EObject current=null] : iv_ruleFunctionModule= ruleFunctionModule EOF ;
    public final EObject entryRuleFunctionModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModule = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:454:56: (iv_ruleFunctionModule= ruleFunctionModule EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:455:2: iv_ruleFunctionModule= ruleFunctionModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModule_in_entryRuleFunctionModule899);
            iv_ruleFunctionModule=ruleFunctionModule();
            _fsp--;

             current =iv_ruleFunctionModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModule909); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:462:1: ruleFunctionModule returns [EObject current=null] : ( 'function' 'module' (lv_name_2= RULE_STRING ) '{' (lv_mapping_4= ruleFunctionModuleMapping ) '}' ) ;
    public final EObject ruleFunctionModule() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        EObject lv_mapping_4 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:467:6: ( ( 'function' 'module' (lv_name_2= RULE_STRING ) '{' (lv_mapping_4= ruleFunctionModuleMapping ) '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:468:1: ( 'function' 'module' (lv_name_2= RULE_STRING ) '{' (lv_mapping_4= ruleFunctionModuleMapping ) '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:468:1: ( 'function' 'module' (lv_name_2= RULE_STRING ) '{' (lv_mapping_4= ruleFunctionModuleMapping ) '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:468:2: 'function' 'module' (lv_name_2= RULE_STRING ) '{' (lv_mapping_4= ruleFunctionModuleMapping ) '}'
            {
            match(input,20,FOLLOW_20_in_ruleFunctionModule943); 

                    createLeafNode(grammarAccess.getFunctionModuleAccess().getFunctionKeyword_0(), null); 
                
            match(input,21,FOLLOW_21_in_ruleFunctionModule952); 

                    createLeafNode(grammarAccess.getFunctionModuleAccess().getModuleKeyword_1(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:476:1: (lv_name_2= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:478:6: lv_name_2= RULE_STRING
            {
            lv_name_2=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModule974); 

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

            match(input,13,FOLLOW_13_in_ruleFunctionModule991); 

                    createLeafNode(grammarAccess.getFunctionModuleAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:500:1: (lv_mapping_4= ruleFunctionModuleMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:503:6: lv_mapping_4= ruleFunctionModuleMapping
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionModuleAccess().getMappingFunctionModuleMappingParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule1025);
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

            match(input,14,FOLLOW_14_in_ruleFunctionModule1038); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:532:1: entryRuleFunctionModuleMapping returns [EObject current=null] : iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF ;
    public final EObject entryRuleFunctionModuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModuleMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:532:63: (iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:533:2: iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModuleMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_entryRuleFunctionModuleMapping1071);
            iv_ruleFunctionModuleMapping=ruleFunctionModuleMapping();
            _fsp--;

             current =iv_ruleFunctionModuleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModuleMapping1081); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:540:1: ruleFunctionModuleMapping returns [EObject current=null] : this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping ;
    public final EObject ruleFunctionModuleMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOMapping_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:545:6: (this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:547:5: this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping
            {
             
                    currentNode=createCompositeNode(grammarAccess.getFunctionModuleMappingAccess().getFunctionModulePOJOMappingParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping1127);
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:562:1: entryRuleFunctionModulePOJOMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:562:67: (iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:563:2: iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_entryRuleFunctionModulePOJOMapping1158);
            iv_ruleFunctionModulePOJOMapping=ruleFunctionModulePOJOMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOMapping1168); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:570:1: ruleFunctionModulePOJOMapping returns [EObject current=null] : (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping ) ;
    public final EObject ruleFunctionModulePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOCallMapping_0 = null;

        EObject this_FunctionModulePOJORequestResponseMapping_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:575:6: ( (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:576:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:576:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("576:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:577:5: this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJOCallMappingParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping1215);
                    this_FunctionModulePOJOCallMapping_0=ruleFunctionModulePOJOCallMapping();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOCallMapping_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:587:5: this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJORequestResponseMappingParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping1242);
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:602:1: entryRuleFunctionModulePOJOCallMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOCallMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOCallMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:602:71: (iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:603:2: iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOCallMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_entryRuleFunctionModulePOJOCallMapping1274);
            iv_ruleFunctionModulePOJOCallMapping=ruleFunctionModulePOJOCallMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJOCallMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOCallMapping1284); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:610:1: ruleFunctionModulePOJOCallMapping returns [EObject current=null] : ( 'class' (lv_className_1= RULE_ID ) '{' (lv_parameters_3= ruleFunctionModulePOJOParameterMapping )* '}' ) ;
    public final EObject ruleFunctionModulePOJOCallMapping() throws RecognitionException {
        EObject current = null;

        Token lv_className_1=null;
        EObject lv_parameters_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:615:6: ( ( 'class' (lv_className_1= RULE_ID ) '{' (lv_parameters_3= ruleFunctionModulePOJOParameterMapping )* '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:616:1: ( 'class' (lv_className_1= RULE_ID ) '{' (lv_parameters_3= ruleFunctionModulePOJOParameterMapping )* '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:616:1: ( 'class' (lv_className_1= RULE_ID ) '{' (lv_parameters_3= ruleFunctionModulePOJOParameterMapping )* '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:616:2: 'class' (lv_className_1= RULE_ID ) '{' (lv_parameters_3= ruleFunctionModulePOJOParameterMapping )* '}'
            {
            match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOCallMapping1318); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:620:1: (lv_className_1= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:622:6: lv_className_1= RULE_ID
            {
            lv_className_1=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping1340); 

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

            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJOCallMapping1357); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:644:1: (lv_parameters_3= ruleFunctionModulePOJOParameterMapping )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24||(LA6_0>=26 && LA6_0<=28)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:647:6: lv_parameters_3= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getParametersFunctionModulePOJOParameterMappingParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping1391);
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
            	    break loop6;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJOCallMapping1405); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:676:1: entryRuleFunctionModulePOJORequestResponseMapping returns [EObject current=null] : iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF ;
    public final EObject entryRuleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJORequestResponseMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:676:82: (iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:677:2: iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_entryRuleFunctionModulePOJORequestResponseMapping1438);
            iv_ruleFunctionModulePOJORequestResponseMapping=ruleFunctionModulePOJORequestResponseMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJORequestResponseMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJORequestResponseMapping1448); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:684:1: ruleFunctionModulePOJORequestResponseMapping returns [EObject current=null] : ( 'request' 'class' (lv_requestClassName_2= RULE_ID ) '{' (lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping )* '}' 'response' 'class' (lv_responseClassName_8= RULE_ID ) '{' (lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping )* '}' ) ;
    public final EObject ruleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        EObject current = null;

        Token lv_requestClassName_2=null;
        Token lv_responseClassName_8=null;
        EObject lv_requestParameters_4 = null;

        EObject lv_responseParameters_10 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:689:6: ( ( 'request' 'class' (lv_requestClassName_2= RULE_ID ) '{' (lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping )* '}' 'response' 'class' (lv_responseClassName_8= RULE_ID ) '{' (lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping )* '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:690:1: ( 'request' 'class' (lv_requestClassName_2= RULE_ID ) '{' (lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping )* '}' 'response' 'class' (lv_responseClassName_8= RULE_ID ) '{' (lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping )* '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:690:1: ( 'request' 'class' (lv_requestClassName_2= RULE_ID ) '{' (lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping )* '}' 'response' 'class' (lv_responseClassName_8= RULE_ID ) '{' (lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping )* '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:690:2: 'request' 'class' (lv_requestClassName_2= RULE_ID ) '{' (lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping )* '}' 'response' 'class' (lv_responseClassName_8= RULE_ID ) '{' (lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping )* '}'
            {
            match(input,22,FOLLOW_22_in_ruleFunctionModulePOJORequestResponseMapping1482); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestKeyword_0(), null); 
                
            match(input,15,FOLLOW_15_in_ruleFunctionModulePOJORequestResponseMapping1491); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_1(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:698:1: (lv_requestClassName_2= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:700:6: lv_requestClassName_2= RULE_ID
            {
            lv_requestClassName_2=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1513); 

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

            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping1530); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:722:1: (lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24||(LA7_0>=26 && LA7_0<=28)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:725:6: lv_requestParameters_4= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestParametersFunctionModulePOJOParameterMappingParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1564);
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
            	    break loop7;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping1578); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRightCurlyBracketKeyword_5(), null); 
                
            match(input,23,FOLLOW_23_in_ruleFunctionModulePOJORequestResponseMapping1587); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseKeyword_6(), null); 
                
            match(input,15,FOLLOW_15_in_ruleFunctionModulePOJORequestResponseMapping1596); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_7(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:755:1: (lv_responseClassName_8= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:757:6: lv_responseClassName_8= RULE_ID
            {
            lv_responseClassName_8=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1618); 

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

            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping1635); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_9(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:779:1: (lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24||(LA8_0>=26 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:782:6: lv_responseParameters_10= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseParametersFunctionModulePOJOParameterMappingParserRuleCall_10_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1669);
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
            	    break loop8;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping1683); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:811:1: entryRuleFunctionModulePOJOParameterMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOParameterMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOParameterMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:811:76: (iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:812:2: iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_entryRuleFunctionModulePOJOParameterMapping1716);
            iv_ruleFunctionModulePOJOParameterMapping=ruleFunctionModulePOJOParameterMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJOParameterMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOParameterMapping1726); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:819:1: ruleFunctionModulePOJOParameterMapping returns [EObject current=null] : (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter ) ;
    public final EObject ruleFunctionModulePOJOParameterMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOImportingParameter_0 = null;

        EObject this_FunctionModulePOJOExportingParameter_1 = null;

        EObject this_FunctionModulePOJOChangingParameter_2 = null;

        EObject this_FunctionModulePOJOTablesParameter_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:824:6: ( (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:825:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:825:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 28:
                {
                alt9=3;
                }
                break;
            case 26:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("825:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:826:5: this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOImportingParameterParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping1773);
                    this_FunctionModulePOJOImportingParameter_0=ruleFunctionModulePOJOImportingParameter();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOImportingParameter_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:836:5: this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOExportingParameterParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping1800);
                    this_FunctionModulePOJOExportingParameter_1=ruleFunctionModulePOJOExportingParameter();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOExportingParameter_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:846:5: this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOChangingParameterParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping1827);
                    this_FunctionModulePOJOChangingParameter_2=ruleFunctionModulePOJOChangingParameter();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOChangingParameter_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:856:5: this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOTablesParameterParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping1854);
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:871:1: entryRuleFunctionModulePOJOImportingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOImportingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOImportingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:871:78: (iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:872:2: iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOImportingParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_entryRuleFunctionModulePOJOImportingParameter1886);
            iv_ruleFunctionModulePOJOImportingParameter=ruleFunctionModulePOJOImportingParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOImportingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOImportingParameter1896); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:879:1: ruleFunctionModulePOJOImportingParameter returns [EObject current=null] : ( 'import' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOImportingParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Token lv_isInactive_4=null;
        Token lv_type_5=null;
        Token lv_attribute_6=null;
        Token lv_isStructure_7=null;
        Token lv_name_8=null;
        Token lv_isInactive_10=null;
        Token lv_type_11=null;
        Token lv_attribute_12=null;
        Token lv_isTable_13=null;
        Token lv_name_14=null;
        Token lv_isInactive_16=null;
        Token lv_type_17=null;
        Token lv_attribute_18=null;
        Token lv_comment_20=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:884:6: ( ( 'import' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:885:1: ( 'import' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:885:1: ( 'import' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:885:2: 'import' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';'
            {
            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter1930); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getImportKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:889:1: ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt13=1;
                }
                break;
            case 12:
                {
                alt13=2;
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("889:1: ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:889:2: ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:889:2: ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:889:3: 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) )
                    {
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter1941); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getFieldKeyword_1_0_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:893:1: (lv_name_2= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:895:6: lv_name_2= RULE_STRING
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1963); 

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

                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter1980); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_0_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:917:1: ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==25) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_ID) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("917:1: ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) )", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:917:2: (lv_isInactive_4= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:917:2: (lv_isInactive_4= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:919:6: lv_isInactive_4= 'inactive'
                            {
                            lv_isInactive_4=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter2002); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getIsInactiveInactiveKeyword_1_0_3_0_0(), "isInactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "isInactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:939:6: ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:939:6: ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:939:7: (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:939:7: (lv_type_5= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:941:6: lv_type_5= RULE_ID
                            {
                            lv_type_5=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2044); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTypeIDTerminalRuleCall_1_0_3_1_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_5, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:959:2: (lv_attribute_6= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:961:6: lv_attribute_6= RULE_ID
                            {
                            lv_attribute_6=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2074); 

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:980:6: ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:980:6: ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:980:7: (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:980:7: (lv_isStructure_7= 'structure' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:982:6: lv_isStructure_7= 'structure'
                    {
                    lv_isStructure_7=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleFunctionModulePOJOImportingParameter2113); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getIsStructureStructureKeyword_1_1_0_0(), "isStructure"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isStructure", true, "structure", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1001:2: (lv_name_8= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1003:6: lv_name_8= RULE_STRING
                    {
                    lv_name_8=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2148); 

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

                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter2165); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_1_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1025:1: ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==25) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==RULE_ID) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1025:1: ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) )", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1025:2: (lv_isInactive_10= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1025:2: (lv_isInactive_10= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1027:6: lv_isInactive_10= 'inactive'
                            {
                            lv_isInactive_10=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter2187); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getIsInactiveInactiveKeyword_1_1_3_0_0(), "isInactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "isInactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1047:6: ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1047:6: ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1047:7: (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1047:7: (lv_type_11= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1049:6: lv_type_11= RULE_ID
                            {
                            lv_type_11=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2229); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTypeIDTerminalRuleCall_1_1_3_1_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_11, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1067:2: (lv_attribute_12= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1069:6: lv_attribute_12= RULE_ID
                            {
                            lv_attribute_12=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2259); 

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1088:6: ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1088:6: ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1088:7: (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1088:7: (lv_isTable_13= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1090:6: lv_isTable_13= 'table'
                    {
                    lv_isTable_13=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOImportingParameter2298); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getIsTableTableKeyword_1_2_0_0(), "isTable"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isTable", true, "table", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1109:2: (lv_name_14= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1111:6: lv_name_14= RULE_STRING
                    {
                    lv_name_14=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2333); 

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

                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter2350); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_2_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1133:1: ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==25) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==RULE_ID) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1133:1: ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) )", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1133:2: (lv_isInactive_16= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1133:2: (lv_isInactive_16= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1135:6: lv_isInactive_16= 'inactive'
                            {
                            lv_isInactive_16=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter2372); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getIsInactiveInactiveKeyword_1_2_3_0_0(), "isInactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "isInactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1155:6: ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1155:6: ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1155:7: (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1155:7: (lv_type_17= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1157:6: lv_type_17= RULE_ID
                            {
                            lv_type_17=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2414); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTypeIDTerminalRuleCall_1_2_3_1_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_17, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1175:2: (lv_attribute_18= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1177:6: lv_attribute_18= RULE_ID
                            {
                            lv_attribute_18=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2444); 

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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1195:6: ( 'comment' (lv_comment_20= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1195:7: 'comment' (lv_comment_20= RULE_STRING )
                    {
                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter2466); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentKeyword_2_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1199:1: (lv_comment_20= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1201:6: lv_comment_20= RULE_STRING
                    {
                    lv_comment_20=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2488); 

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

            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter2507); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1230:1: entryRuleFunctionModulePOJOExportingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOExportingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOExportingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1230:78: (iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1231:2: iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOExportingParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_entryRuleFunctionModulePOJOExportingParameter2540);
            iv_ruleFunctionModulePOJOExportingParameter=ruleFunctionModulePOJOExportingParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOExportingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOExportingParameter2550); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1238:1: ruleFunctionModulePOJOExportingParameter returns [EObject current=null] : ( 'export' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOExportingParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Token lv_isInactive_4=null;
        Token lv_type_5=null;
        Token lv_attribute_6=null;
        Token lv_isStructure_7=null;
        Token lv_name_8=null;
        Token lv_isInactive_10=null;
        Token lv_type_11=null;
        Token lv_attribute_12=null;
        Token lv_isTable_13=null;
        Token lv_name_14=null;
        Token lv_isInactive_16=null;
        Token lv_type_17=null;
        Token lv_attribute_18=null;
        Token lv_comment_20=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1243:6: ( ( 'export' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1244:1: ( 'export' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1244:1: ( 'export' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1244:2: 'export' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';'
            {
            match(input,27,FOLLOW_27_in_ruleFunctionModulePOJOExportingParameter2584); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExportKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1248:1: ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt18=1;
                }
                break;
            case 12:
                {
                alt18=2;
                }
                break;
            case 26:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1248:1: ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1248:2: ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1248:2: ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1248:3: 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) )
                    {
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter2595); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getFieldKeyword_1_0_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1252:1: (lv_name_2= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1254:6: lv_name_2= RULE_STRING
                    {
                    lv_name_2=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2617); 

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

                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter2634); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_0_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1276:1: ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==25) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_ID) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1276:1: ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) )", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1276:2: (lv_isInactive_4= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1276:2: (lv_isInactive_4= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1278:6: lv_isInactive_4= 'inactive'
                            {
                            lv_isInactive_4=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter2656); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getIsInactiveInactiveKeyword_1_0_3_0_0(), "isInactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "isInactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1298:6: ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1298:6: ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1298:7: (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1298:7: (lv_type_5= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1300:6: lv_type_5= RULE_ID
                            {
                            lv_type_5=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2698); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTypeIDTerminalRuleCall_1_0_3_1_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_5, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1318:2: (lv_attribute_6= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1320:6: lv_attribute_6= RULE_ID
                            {
                            lv_attribute_6=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2728); 

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1339:6: ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1339:6: ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1339:7: (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1339:7: (lv_isStructure_7= 'structure' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1341:6: lv_isStructure_7= 'structure'
                    {
                    lv_isStructure_7=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleFunctionModulePOJOExportingParameter2767); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getIsStructureStructureKeyword_1_1_0_0(), "isStructure"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isStructure", true, "structure", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1360:2: (lv_name_8= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1362:6: lv_name_8= RULE_STRING
                    {
                    lv_name_8=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2802); 

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

                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter2819); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_1_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1384:1: ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==25) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==RULE_ID) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1384:1: ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) )", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1384:2: (lv_isInactive_10= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1384:2: (lv_isInactive_10= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1386:6: lv_isInactive_10= 'inactive'
                            {
                            lv_isInactive_10=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter2841); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getIsInactiveInactiveKeyword_1_1_3_0_0(), "isInactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "isInactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1406:6: ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1406:6: ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1406:7: (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1406:7: (lv_type_11= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1408:6: lv_type_11= RULE_ID
                            {
                            lv_type_11=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2883); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTypeIDTerminalRuleCall_1_1_3_1_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_11, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1426:2: (lv_attribute_12= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1428:6: lv_attribute_12= RULE_ID
                            {
                            lv_attribute_12=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2913); 

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1447:6: ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1447:6: ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1447:7: (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1447:7: (lv_isTable_13= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1449:6: lv_isTable_13= 'table'
                    {
                    lv_isTable_13=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOExportingParameter2952); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getIsTableTableKeyword_1_2_0_0(), "isTable"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isTable", true, "table", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1468:2: (lv_name_14= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1470:6: lv_name_14= RULE_STRING
                    {
                    lv_name_14=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2987); 

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

                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter3004); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_2_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1492:1: ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==25) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==RULE_ID) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1492:1: ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) )", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1492:2: (lv_isInactive_16= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1492:2: (lv_isInactive_16= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1494:6: lv_isInactive_16= 'inactive'
                            {
                            lv_isInactive_16=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter3026); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getIsInactiveInactiveKeyword_1_2_3_0_0(), "isInactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "isInactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1514:6: ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1514:6: ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1514:7: (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1514:7: (lv_type_17= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1516:6: lv_type_17= RULE_ID
                            {
                            lv_type_17=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3068); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTypeIDTerminalRuleCall_1_2_3_1_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_17, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1534:2: (lv_attribute_18= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1536:6: lv_attribute_18= RULE_ID
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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1554:6: ( 'comment' (lv_comment_20= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1554:7: 'comment' (lv_comment_20= RULE_STRING )
                    {
                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter3120); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentKeyword_2_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1558:1: (lv_comment_20= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1560:6: lv_comment_20= RULE_STRING
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

            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter3161); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1589:1: entryRuleFunctionModulePOJOChangingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOChangingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOChangingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1589:77: (iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1590:2: iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1597:1: ruleFunctionModulePOJOChangingParameter returns [EObject current=null] : ( 'change' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOChangingParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2=null;
        Token lv_isInactive_4=null;
        Token lv_type_5=null;
        Token lv_attribute_6=null;
        Token lv_isStructure_7=null;
        Token lv_name_8=null;
        Token lv_isInactive_10=null;
        Token lv_type_11=null;
        Token lv_attribute_12=null;
        Token lv_isTable_13=null;
        Token lv_name_14=null;
        Token lv_isInactive_16=null;
        Token lv_type_17=null;
        Token lv_attribute_18=null;
        Token lv_comment_20=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1602:6: ( ( 'change' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1603:1: ( 'change' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1603:1: ( 'change' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1603:2: 'change' ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) ) ( 'comment' (lv_comment_20= RULE_STRING ) )? ';'
            {
            match(input,28,FOLLOW_28_in_ruleFunctionModulePOJOChangingParameter3238); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getChangeKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1607:1: ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt23=1;
                }
                break;
            case 12:
                {
                alt23=2;
                }
                break;
            case 26:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1607:1: ( ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) ) | ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) ) | ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1607:2: ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1607:2: ( 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1607:3: 'field' (lv_name_2= RULE_STRING ) '=' ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) )
                    {
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter3249); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getFieldKeyword_1_0_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1611:1: (lv_name_2= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1613:6: lv_name_2= RULE_STRING
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

                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter3288); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_0_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1635:1: ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==25) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==RULE_ID) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1635:1: ( (lv_isInactive_4= 'inactive' ) | ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) ) )", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1635:2: (lv_isInactive_4= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1635:2: (lv_isInactive_4= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1637:6: lv_isInactive_4= 'inactive'
                            {
                            lv_isInactive_4=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter3310); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getIsInactiveInactiveKeyword_1_0_3_0_0(), "isInactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "isInactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1657:6: ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1657:6: ( (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1657:7: (lv_type_5= RULE_ID ) (lv_attribute_6= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1657:7: (lv_type_5= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1659:6: lv_type_5= RULE_ID
                            {
                            lv_type_5=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3352); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTypeIDTerminalRuleCall_1_0_3_1_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_5, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1677:2: (lv_attribute_6= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1679:6: lv_attribute_6= RULE_ID
                            {
                            lv_attribute_6=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3382); 

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1698:6: ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1698:6: ( (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1698:7: (lv_isStructure_7= 'structure' ) (lv_name_8= RULE_STRING ) '=' ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1698:7: (lv_isStructure_7= 'structure' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1700:6: lv_isStructure_7= 'structure'
                    {
                    lv_isStructure_7=(Token)input.LT(1);
                    match(input,12,FOLLOW_12_in_ruleFunctionModulePOJOChangingParameter3421); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getIsStructureStructureKeyword_1_1_0_0(), "isStructure"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isStructure", true, "structure", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1719:2: (lv_name_8= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1721:6: lv_name_8= RULE_STRING
                    {
                    lv_name_8=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3456); 

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

                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter3473); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_1_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1743:1: ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==25) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==RULE_ID) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1743:1: ( (lv_isInactive_10= 'inactive' ) | ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) ) )", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1743:2: (lv_isInactive_10= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1743:2: (lv_isInactive_10= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1745:6: lv_isInactive_10= 'inactive'
                            {
                            lv_isInactive_10=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter3495); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getIsInactiveInactiveKeyword_1_1_3_0_0(), "isInactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "isInactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1765:6: ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1765:6: ( (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1765:7: (lv_type_11= RULE_ID ) (lv_attribute_12= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1765:7: (lv_type_11= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1767:6: lv_type_11= RULE_ID
                            {
                            lv_type_11=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3537); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTypeIDTerminalRuleCall_1_1_3_1_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_11, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1785:2: (lv_attribute_12= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1787:6: lv_attribute_12= RULE_ID
                            {
                            lv_attribute_12=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3567); 

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1806:6: ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1806:6: ( (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1806:7: (lv_isTable_13= 'table' ) (lv_name_14= RULE_STRING ) '=' ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1806:7: (lv_isTable_13= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1808:6: lv_isTable_13= 'table'
                    {
                    lv_isTable_13=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOChangingParameter3606); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getIsTableTableKeyword_1_2_0_0(), "isTable"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isTable", true, "table", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1827:2: (lv_name_14= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1829:6: lv_name_14= RULE_STRING
                    {
                    lv_name_14=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3641); 

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

                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter3658); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_2_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1851:1: ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==25) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_ID) ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1851:1: ( (lv_isInactive_16= 'inactive' ) | ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) ) )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1851:2: (lv_isInactive_16= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1851:2: (lv_isInactive_16= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1853:6: lv_isInactive_16= 'inactive'
                            {
                            lv_isInactive_16=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter3680); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getIsInactiveInactiveKeyword_1_2_3_0_0(), "isInactive"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "isInactive", true, "inactive", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }
                            break;
                        case 2 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1873:6: ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1873:6: ( (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1873:7: (lv_type_17= RULE_ID ) (lv_attribute_18= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1873:7: (lv_type_17= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1875:6: lv_type_17= RULE_ID
                            {
                            lv_type_17=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3722); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTypeIDTerminalRuleCall_1_2_3_1_0_0(), "type"); 
                            	

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "type", lv_type_17, "ID", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1893:2: (lv_attribute_18= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1895:6: lv_attribute_18= RULE_ID
                            {
                            lv_attribute_18=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3752); 

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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1913:6: ( 'comment' (lv_comment_20= RULE_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==18) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1913:7: 'comment' (lv_comment_20= RULE_STRING )
                    {
                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter3774); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentKeyword_2_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1917:1: (lv_comment_20= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1919:6: lv_comment_20= RULE_STRING
                    {
                    lv_comment_20=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3796); 

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

            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter3815); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1948:1: entryRuleFunctionModulePOJOTablesParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOTablesParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOTablesParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1948:75: (iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1949:2: iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOTablesParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_entryRuleFunctionModulePOJOTablesParameter3848);
            iv_ruleFunctionModulePOJOTablesParameter=ruleFunctionModulePOJOTablesParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOTablesParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOTablesParameter3858); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1956:1: ruleFunctionModulePOJOTablesParameter returns [EObject current=null] : ( 'table' (lv_name_1= RULE_STRING ) '=' ( (lv_isInactive_3= 'inactive' ) | ( (lv_type_4= RULE_ID ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOTablesParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1=null;
        Token lv_isInactive_3=null;
        Token lv_type_4=null;
        Token lv_attribute_5=null;
        Token lv_comment_7=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1961:6: ( ( 'table' (lv_name_1= RULE_STRING ) '=' ( (lv_isInactive_3= 'inactive' ) | ( (lv_type_4= RULE_ID ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1962:1: ( 'table' (lv_name_1= RULE_STRING ) '=' ( (lv_isInactive_3= 'inactive' ) | ( (lv_type_4= RULE_ID ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1962:1: ( 'table' (lv_name_1= RULE_STRING ) '=' ( (lv_isInactive_3= 'inactive' ) | ( (lv_type_4= RULE_ID ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1962:2: 'table' (lv_name_1= RULE_STRING ) '=' ( (lv_isInactive_3= 'inactive' ) | ( (lv_type_4= RULE_ID ) (lv_attribute_5= RULE_ID ) ) ) ( 'comment' (lv_comment_7= RULE_STRING ) )? ';'
            {
            match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOTablesParameter3892); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getTableKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1966:1: (lv_name_1= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1968:6: lv_name_1= RULE_STRING
            {
            lv_name_1=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter3914); 

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

            match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOTablesParameter3931); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getEqualsSignKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1990:1: ( (lv_isInactive_3= 'inactive' ) | ( (lv_type_4= RULE_ID ) (lv_attribute_5= RULE_ID ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1990:1: ( (lv_isInactive_3= 'inactive' ) | ( (lv_type_4= RULE_ID ) (lv_attribute_5= RULE_ID ) ) )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1990:2: (lv_isInactive_3= 'inactive' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1990:2: (lv_isInactive_3= 'inactive' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:1992:6: lv_isInactive_3= 'inactive'
                    {
                    lv_isInactive_3=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOTablesParameter3953); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getIsInactiveInactiveKeyword_3_0_0(), "isInactive"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "isInactive", true, "inactive", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:2012:6: ( (lv_type_4= RULE_ID ) (lv_attribute_5= RULE_ID ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:2012:6: ( (lv_type_4= RULE_ID ) (lv_attribute_5= RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:2012:7: (lv_type_4= RULE_ID ) (lv_attribute_5= RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:2012:7: (lv_type_4= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:2014:6: lv_type_4= RULE_ID
                    {
                    lv_type_4=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter3995); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getTypeIDTerminalRuleCall_3_1_0_0(), "type"); 
                    	

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "type", lv_type_4, "ID", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:2032:2: (lv_attribute_5= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:2034:6: lv_attribute_5= RULE_ID
                    {
                    lv_attribute_5=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4025); 

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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:2052:4: ( 'comment' (lv_comment_7= RULE_STRING ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:2052:5: 'comment' (lv_comment_7= RULE_STRING )
                    {
                    match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOTablesParameter4045); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentKeyword_4_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:2056:1: (lv_comment_7= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/parser/antlr/internal/InternalRFCMapping.g:2058:6: lv_comment_7= RULE_STRING
                    {
                    lv_comment_7=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter4067); 

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

            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOTablesParameter4086); 

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


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel73 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleModel117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel139 = new BitSet(new long[]{0x0000000000101002L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleModel181 = new BitSet(new long[]{0x0000000000101002L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_ruleModel220 = new BitSet(new long[]{0x0000000000100002L});
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
    public static final BitSet FOLLOW_13_in_ruleStructurePOJOMapping591 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping625 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_14_in_ruleStructurePOJOMapping639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_entryRuleStructureFieldPOJOMapping672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureFieldPOJOMapping682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStructureFieldPOJOMapping716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping738 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStructureFieldPOJOMapping755 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping807 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleStructureFieldPOJOMapping825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping847 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStructureFieldPOJOMapping866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_entryRuleFunctionModule899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModule909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModule943 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModule952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModule974 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModule991 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule1025 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModule1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_entryRuleFunctionModuleMapping1071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModuleMapping1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_entryRuleFunctionModulePOJOMapping1158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOMapping1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_entryRuleFunctionModulePOJOCallMapping1274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOCallMapping1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOCallMapping1318 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping1340 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJOCallMapping1357 = new BitSet(new long[]{0x000000001D004000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping1391 = new BitSet(new long[]{0x000000001D004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJOCallMapping1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_entryRuleFunctionModulePOJORequestResponseMapping1438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJORequestResponseMapping1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJORequestResponseMapping1482 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJORequestResponseMapping1491 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1513 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping1530 = new BitSet(new long[]{0x000000001D004000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1564 = new BitSet(new long[]{0x000000001D004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping1578 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJORequestResponseMapping1587 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJORequestResponseMapping1596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1618 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping1635 = new BitSet(new long[]{0x000000001D004000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1669 = new BitSet(new long[]{0x000000001D004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_entryRuleFunctionModulePOJOParameterMapping1716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOParameterMapping1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_entryRuleFunctionModulePOJOImportingParameter1886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOImportingParameter1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter1930 = new BitSet(new long[]{0x0000000004011000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter1941 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1963 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter1980 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter2002 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2044 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2074 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJOImportingParameter2113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2148 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter2165 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter2187 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2259 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOImportingParameter2298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2333 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter2350 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter2372 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2444 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter2466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2488 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOImportingParameter2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_entryRuleFunctionModulePOJOExportingParameter2540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOExportingParameter2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionModulePOJOExportingParameter2584 = new BitSet(new long[]{0x0000000004011000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter2595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2617 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter2634 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter2656 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2698 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2728 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJOExportingParameter2767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2802 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter2819 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter2841 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2883 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2913 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOExportingParameter2952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2987 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter3004 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter3026 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3068 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3098 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter3120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3142 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOExportingParameter3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_entryRuleFunctionModulePOJOChangingParameter3194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOChangingParameter3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFunctionModulePOJOChangingParameter3238 = new BitSet(new long[]{0x0000000004011000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter3249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3271 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter3288 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter3310 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3382 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJOChangingParameter3421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3456 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter3473 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter3495 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3537 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3567 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOChangingParameter3606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3641 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter3658 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter3680 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3722 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3752 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter3774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3796 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOChangingParameter3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_entryRuleFunctionModulePOJOTablesParameter3848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOTablesParameter3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOTablesParameter3892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter3914 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOTablesParameter3931 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOTablesParameter3953 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter3995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4025 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOTablesParameter4045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter4067 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOTablesParameter4086 = new BitSet(new long[]{0x0000000000000002L});

}