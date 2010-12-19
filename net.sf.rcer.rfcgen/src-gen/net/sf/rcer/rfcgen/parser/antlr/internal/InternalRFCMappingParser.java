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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'.'", "'import'", "'as'", "';'", "'structure'", "'{'", "'}'", "'class'", "'field'", "'='", "'inactive'", "'comment'", "'function'", "'module'", "'request'", "'response'", "'importing'", "'external'", "'table'", "'exporting'", "'changing'", "'BigDecimal'", "'BigInteger'", "'Boolean'", "'Byte'", "'ByteArray'", "'Char'", "'CharArray'", "'Date'", "'Double'", "'Float'", "'Integer'", "'Long'", "'Short'", "'String'", "'Time'"
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:87:1: ruleModel returns [EObject current=null] : ( 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_structures_3_0= ruleStructure ) )* ( (lv_functionModules_4_0= ruleFunctionModule ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_packageName_1_0=null;
        EObject lv_imports_2_0 = null;

        EObject lv_structures_3_0 = null;

        EObject lv_functionModules_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:92:6: ( ( 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_structures_3_0= ruleStructure ) )* ( (lv_functionModules_4_0= ruleFunctionModule ) )* ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:93:1: ( 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_structures_3_0= ruleStructure ) )* ( (lv_functionModules_4_0= ruleFunctionModule ) )* )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:93:1: ( 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_structures_3_0= ruleStructure ) )* ( (lv_functionModules_4_0= ruleFunctionModule ) )* )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:93:3: 'package' ( (lv_packageName_1_0= RULE_STRING ) ) ( (lv_imports_2_0= ruleImport ) )* ( (lv_structures_3_0= ruleStructure ) )* ( (lv_functionModules_4_0= ruleFunctionModule ) )*
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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:121:2: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:122:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:122:1: (lv_imports_2_0= ruleImport )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:123:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel163);
            	    lv_imports_2_0=ruleImport();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"imports",
            	    	        		lv_imports_2_0, 
            	    	        		"Import", 
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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:145:3: ( (lv_structures_3_0= ruleStructure ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:146:1: (lv_structures_3_0= ruleStructure )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:146:1: (lv_structures_3_0= ruleStructure )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:147:3: lv_structures_3_0= ruleStructure
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getStructuresStructureParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructure_in_ruleModel185);
            	    lv_structures_3_0=ruleStructure();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"structures",
            	    	        		lv_structures_3_0, 
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
            	    break loop2;
                }
            } while (true);

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:169:3: ( (lv_functionModules_4_0= ruleFunctionModule ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:170:1: (lv_functionModules_4_0= ruleFunctionModule )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:170:1: (lv_functionModules_4_0= ruleFunctionModule )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:171:3: lv_functionModules_4_0= ruleFunctionModule
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getFunctionModulesFunctionModuleParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModule_in_ruleModel207);
            	    lv_functionModules_4_0=ruleFunctionModule();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"functionModules",
            	    	        		lv_functionModules_4_0, 
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
            	    break loop3;
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


    // $ANTLR start entryRuleQualifiedName
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:201:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:202:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:203:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             currentNode = createCompositeNode(grammarAccess.getQualifiedNameRule(), currentNode); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName245);
            iv_ruleQualifiedName=ruleQualifiedName();
            _fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName256); 

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
    // $ANTLR end entryRuleQualifiedName


    // $ANTLR start ruleQualifiedName
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:210:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:215:6: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:216:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:216:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:216:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName296); 

            		current.merge(this_ID_0);
                
             
                createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:223:1: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:224:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,12,FOLLOW_12_in_ruleQualifiedName315); 

            	            current.merge(kw);
            	            createLeafNode(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0(), null); 
            	        
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName330); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        createLeafNode(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end ruleQualifiedName


    // $ANTLR start entryRuleImport
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:244:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:245:2: (iv_ruleImport= ruleImport EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:246:2: iv_ruleImport= ruleImport EOF
            {
             currentNode = createCompositeNode(grammarAccess.getImportRule(), currentNode); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport377);
            iv_ruleImport=ruleImport();
            _fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport387); 

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
    // $ANTLR end entryRuleImport


    // $ANTLR start ruleImport
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:253:1: ruleImport returns [EObject current=null] : ( 'import' ( (lv_fullName_1_0= ruleQualifiedName ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_fullName_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:258:6: ( ( 'import' ( (lv_fullName_1_0= ruleQualifiedName ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:259:1: ( 'import' ( (lv_fullName_1_0= ruleQualifiedName ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:259:1: ( 'import' ( (lv_fullName_1_0= ruleQualifiedName ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:259:3: 'import' ( (lv_fullName_1_0= ruleQualifiedName ) ) 'as' ( (lv_name_3_0= RULE_ID ) ) ';'
            {
            match(input,13,FOLLOW_13_in_ruleImport422); 

                    createLeafNode(grammarAccess.getImportAccess().getImportKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:263:1: ( (lv_fullName_1_0= ruleQualifiedName ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:264:1: (lv_fullName_1_0= ruleQualifiedName )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:264:1: (lv_fullName_1_0= ruleQualifiedName )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:265:3: lv_fullName_1_0= ruleQualifiedName
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getImportAccess().getFullNameQualifiedNameParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleImport443);
            lv_fullName_1_0=ruleQualifiedName();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"fullName",
            	        		lv_fullName_1_0, 
            	        		"QualifiedName", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,14,FOLLOW_14_in_ruleImport453); 

                    createLeafNode(grammarAccess.getImportAccess().getAsKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:291:1: ( (lv_name_3_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:292:1: (lv_name_3_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:292:1: (lv_name_3_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:293:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImport470); 

            			createLeafNode(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getImportRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"name",
            	        		lv_name_3_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,15,FOLLOW_15_in_ruleImport485); 

                    createLeafNode(grammarAccess.getImportAccess().getSemicolonKeyword_4(), null); 
                

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
    // $ANTLR end ruleImport


    // $ANTLR start entryRuleStructure
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:327:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:328:2: (iv_ruleStructure= ruleStructure EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:329:2: iv_ruleStructure= ruleStructure EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructureRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure521);
            iv_ruleStructure=ruleStructure();
            _fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure531); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:336:1: ruleStructure returns [EObject current=null] : ( 'structure' ( (lv_name_1_0= RULE_STRING ) ) '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) '}' ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_mapping_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:341:6: ( ( 'structure' ( (lv_name_1_0= RULE_STRING ) ) '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:342:1: ( 'structure' ( (lv_name_1_0= RULE_STRING ) ) '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:342:1: ( 'structure' ( (lv_name_1_0= RULE_STRING ) ) '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:342:3: 'structure' ( (lv_name_1_0= RULE_STRING ) ) '{' ( (lv_mapping_3_0= ruleStructureMapping ) ) '}'
            {
            match(input,16,FOLLOW_16_in_ruleStructure566); 

                    createLeafNode(grammarAccess.getStructureAccess().getStructureKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:346:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:347:1: (lv_name_1_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:347:1: (lv_name_1_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:348:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructure583); 

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

            match(input,17,FOLLOW_17_in_ruleStructure598); 

                    createLeafNode(grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:374:1: ( (lv_mapping_3_0= ruleStructureMapping ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:375:1: (lv_mapping_3_0= ruleStructureMapping )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:375:1: (lv_mapping_3_0= ruleStructureMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:376:3: lv_mapping_3_0= ruleStructureMapping
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getStructureAccess().getMappingStructureMappingParserRuleCall_3_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleStructureMapping_in_ruleStructure619);
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

            match(input,18,FOLLOW_18_in_ruleStructure629); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:410:1: entryRuleStructureMapping returns [EObject current=null] : iv_ruleStructureMapping= ruleStructureMapping EOF ;
    public final EObject entryRuleStructureMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:411:2: (iv_ruleStructureMapping= ruleStructureMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:412:2: iv_ruleStructureMapping= ruleStructureMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructureMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructureMapping_in_entryRuleStructureMapping665);
            iv_ruleStructureMapping=ruleStructureMapping();
            _fsp--;

             current =iv_ruleStructureMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureMapping675); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:419:1: ruleStructureMapping returns [EObject current=null] : this_StructurePOJOMapping_0= ruleStructurePOJOMapping ;
    public final EObject ruleStructureMapping() throws RecognitionException {
        EObject current = null;

        EObject this_StructurePOJOMapping_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:424:6: (this_StructurePOJOMapping_0= ruleStructurePOJOMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:426:5: this_StructurePOJOMapping_0= ruleStructurePOJOMapping
            {
             
                    currentNode=createCompositeNode(grammarAccess.getStructureMappingAccess().getStructurePOJOMappingParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleStructurePOJOMapping_in_ruleStructureMapping721);
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:442:1: entryRuleStructurePOJOMapping returns [EObject current=null] : iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF ;
    public final EObject entryRuleStructurePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructurePOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:443:2: (iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:444:2: iv_ruleStructurePOJOMapping= ruleStructurePOJOMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructurePOJOMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructurePOJOMapping_in_entryRuleStructurePOJOMapping755);
            iv_ruleStructurePOJOMapping=ruleStructurePOJOMapping();
            _fsp--;

             current =iv_ruleStructurePOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructurePOJOMapping765); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:451:1: ruleStructurePOJOMapping returns [EObject current=null] : ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';' )* '}' ) ;
    public final EObject ruleStructurePOJOMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_fields_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:456:6: ( ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';' )* '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:457:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';' )* '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:457:1: ( 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';' )* '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:457:3: 'class' ( (lv_name_1_0= RULE_ID ) ) '{' ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';' )* '}'
            {
            match(input,19,FOLLOW_19_in_ruleStructurePOJOMapping800); 

                    createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getClassKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:461:1: ( (lv_name_1_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:462:1: (lv_name_1_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:462:1: (lv_name_1_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:463:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructurePOJOMapping817); 

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

            match(input,17,FOLLOW_17_in_ruleStructurePOJOMapping832); 

                    createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:489:1: ( ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:489:2: ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) ) ';'
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:489:2: ( (lv_fields_3_0= ruleStructureFieldPOJOMapping ) )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:490:1: (lv_fields_3_0= ruleStructureFieldPOJOMapping )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:490:1: (lv_fields_3_0= ruleStructureFieldPOJOMapping )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:491:3: lv_fields_3_0= ruleStructureFieldPOJOMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getStructurePOJOMappingAccess().getFieldsStructureFieldPOJOMappingParserRuleCall_3_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping854);
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

            	    match(input,15,FOLLOW_15_in_ruleStructurePOJOMapping864); 

            	            createLeafNode(grammarAccess.getStructurePOJOMappingAccess().getSemicolonKeyword_3_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleStructurePOJOMapping876); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:529:1: entryRuleStructureFieldPOJOMapping returns [EObject current=null] : iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF ;
    public final EObject entryRuleStructureFieldPOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureFieldPOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:530:2: (iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:531:2: iv_ruleStructureFieldPOJOMapping= ruleStructureFieldPOJOMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getStructureFieldPOJOMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_entryRuleStructureFieldPOJOMapping912);
            iv_ruleStructureFieldPOJOMapping=ruleStructureFieldPOJOMapping();
            _fsp--;

             current =iv_ruleStructureFieldPOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructureFieldPOJOMapping922); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:538:1: ruleStructureFieldPOJOMapping returns [EObject current=null] : ( 'field' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleStructureFieldPOJOMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_inactive_3_0=null;
        Token lv_attribute_5_0=null;
        Token lv_comment_7_0=null;
        Enumerator lv_type_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:543:6: ( ( 'field' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:544:1: ( 'field' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:544:1: ( 'field' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )? )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:544:3: 'field' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )?
            {
            match(input,20,FOLLOW_20_in_ruleStructureFieldPOJOMapping957); 

                    createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getFieldKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:548:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:549:1: (lv_name_1_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:549:1: (lv_name_1_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:550:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping974); 

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

            match(input,21,FOLLOW_21_in_ruleStructureFieldPOJOMapping989); 

                    createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getEqualsSignKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:576:1: ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) )
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
                    new NoViableAltException("576:1: ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:576:2: ( (lv_inactive_3_0= 'inactive' ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:576:2: ( (lv_inactive_3_0= 'inactive' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:577:1: (lv_inactive_3_0= 'inactive' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:577:1: (lv_inactive_3_0= 'inactive' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:578:3: lv_inactive_3_0= 'inactive'
                    {
                    lv_inactive_3_0=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleStructureFieldPOJOMapping1008); 

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:598:6: ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:598:6: ( ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:598:7: ( (lv_type_4_0= ruleDataType ) ) ( (lv_attribute_5_0= RULE_ID ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:598:7: ( (lv_type_4_0= ruleDataType ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:599:1: (lv_type_4_0= ruleDataType )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:599:1: (lv_type_4_0= ruleDataType )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:600:3: lv_type_4_0= ruleDataType
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getStructureFieldPOJOMappingAccess().getTypeDataTypeEnumRuleCall_3_1_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleDataType_in_ruleStructureFieldPOJOMapping1049);
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

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:622:2: ( (lv_attribute_5_0= RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:623:1: (lv_attribute_5_0= RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:623:1: (lv_attribute_5_0= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:624:3: lv_attribute_5_0= RULE_ID
                    {
                    lv_attribute_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping1066); 

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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:646:4: ( 'comment' ( (lv_comment_7_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:646:6: 'comment' ( (lv_comment_7_0= RULE_STRING ) )
                    {
                    match(input,23,FOLLOW_23_in_ruleStructureFieldPOJOMapping1084); 

                            createLeafNode(grammarAccess.getStructureFieldPOJOMappingAccess().getCommentKeyword_4_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:650:1: ( (lv_comment_7_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:651:1: (lv_comment_7_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:651:1: (lv_comment_7_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:652:3: lv_comment_7_0= RULE_STRING
                    {
                    lv_comment_7_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping1101); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:682:1: entryRuleFunctionModule returns [EObject current=null] : iv_ruleFunctionModule= ruleFunctionModule EOF ;
    public final EObject entryRuleFunctionModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModule = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:683:2: (iv_ruleFunctionModule= ruleFunctionModule EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:684:2: iv_ruleFunctionModule= ruleFunctionModule EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModuleRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModule_in_entryRuleFunctionModule1144);
            iv_ruleFunctionModule=ruleFunctionModule();
            _fsp--;

             current =iv_ruleFunctionModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModule1154); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:691:1: ruleFunctionModule returns [EObject current=null] : ( 'function' 'module' ( (lv_name_2_0= RULE_STRING ) ) '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) '}' ) ;
    public final EObject ruleFunctionModule() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_mapping_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:696:6: ( ( 'function' 'module' ( (lv_name_2_0= RULE_STRING ) ) '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:697:1: ( 'function' 'module' ( (lv_name_2_0= RULE_STRING ) ) '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:697:1: ( 'function' 'module' ( (lv_name_2_0= RULE_STRING ) ) '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:697:3: 'function' 'module' ( (lv_name_2_0= RULE_STRING ) ) '{' ( (lv_mapping_4_0= ruleFunctionModuleMapping ) ) '}'
            {
            match(input,24,FOLLOW_24_in_ruleFunctionModule1189); 

                    createLeafNode(grammarAccess.getFunctionModuleAccess().getFunctionKeyword_0(), null); 
                
            match(input,25,FOLLOW_25_in_ruleFunctionModule1199); 

                    createLeafNode(grammarAccess.getFunctionModuleAccess().getModuleKeyword_1(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:705:1: ( (lv_name_2_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:706:1: (lv_name_2_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:706:1: (lv_name_2_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:707:3: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModule1216); 

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

            match(input,17,FOLLOW_17_in_ruleFunctionModule1231); 

                    createLeafNode(grammarAccess.getFunctionModuleAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:733:1: ( (lv_mapping_4_0= ruleFunctionModuleMapping ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:734:1: (lv_mapping_4_0= ruleFunctionModuleMapping )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:734:1: (lv_mapping_4_0= ruleFunctionModuleMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:735:3: lv_mapping_4_0= ruleFunctionModuleMapping
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getFunctionModuleAccess().getMappingFunctionModuleMappingParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule1252);
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

            match(input,18,FOLLOW_18_in_ruleFunctionModule1262); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:769:1: entryRuleFunctionModuleMapping returns [EObject current=null] : iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF ;
    public final EObject entryRuleFunctionModuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModuleMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:770:2: (iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:771:2: iv_ruleFunctionModuleMapping= ruleFunctionModuleMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModuleMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_entryRuleFunctionModuleMapping1298);
            iv_ruleFunctionModuleMapping=ruleFunctionModuleMapping();
            _fsp--;

             current =iv_ruleFunctionModuleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModuleMapping1308); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:778:1: ruleFunctionModuleMapping returns [EObject current=null] : this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping ;
    public final EObject ruleFunctionModuleMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOMapping_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:783:6: (this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:785:5: this_FunctionModulePOJOMapping_0= ruleFunctionModulePOJOMapping
            {
             
                    currentNode=createCompositeNode(grammarAccess.getFunctionModuleMappingAccess().getFunctionModulePOJOMappingParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping1354);
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:801:1: entryRuleFunctionModulePOJOMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:802:2: (iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:803:2: iv_ruleFunctionModulePOJOMapping= ruleFunctionModulePOJOMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_entryRuleFunctionModulePOJOMapping1388);
            iv_ruleFunctionModulePOJOMapping=ruleFunctionModulePOJOMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJOMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOMapping1398); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:810:1: ruleFunctionModulePOJOMapping returns [EObject current=null] : (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping ) ;
    public final EObject ruleFunctionModulePOJOMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOCallMapping_0 = null;

        EObject this_FunctionModulePOJORequestResponseMapping_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:815:6: ( (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:816:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:816:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )
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
                    new NoViableAltException("816:1: (this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping | this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping )", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:817:5: this_FunctionModulePOJOCallMapping_0= ruleFunctionModulePOJOCallMapping
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJOCallMappingParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping1445);
                    this_FunctionModulePOJOCallMapping_0=ruleFunctionModulePOJOCallMapping();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOCallMapping_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:827:5: this_FunctionModulePOJORequestResponseMapping_1= ruleFunctionModulePOJORequestResponseMapping
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOMappingAccess().getFunctionModulePOJORequestResponseMappingParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping1472);
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:843:1: entryRuleFunctionModulePOJOCallMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOCallMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOCallMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:844:2: (iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:845:2: iv_ruleFunctionModulePOJOCallMapping= ruleFunctionModulePOJOCallMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOCallMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_entryRuleFunctionModulePOJOCallMapping1507);
            iv_ruleFunctionModulePOJOCallMapping=ruleFunctionModulePOJOCallMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJOCallMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOCallMapping1517); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:852:1: ruleFunctionModulePOJOCallMapping returns [EObject current=null] : ( 'class' ( (lv_className_1_0= RULE_ID ) ) '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* '}' ) ;
    public final EObject ruleFunctionModulePOJOCallMapping() throws RecognitionException {
        EObject current = null;

        Token lv_className_1_0=null;
        EObject lv_parameters_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:857:6: ( ( 'class' ( (lv_className_1_0= RULE_ID ) ) '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:858:1: ( 'class' ( (lv_className_1_0= RULE_ID ) ) '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:858:1: ( 'class' ( (lv_className_1_0= RULE_ID ) ) '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:858:3: 'class' ( (lv_className_1_0= RULE_ID ) ) '{' ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )* '}'
            {
            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJOCallMapping1552); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getClassKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:862:1: ( (lv_className_1_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:863:1: (lv_className_1_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:863:1: (lv_className_1_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:864:3: lv_className_1_0= RULE_ID
            {
            lv_className_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping1569); 

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

            match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOCallMapping1584); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:890:1: ( (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28||(LA9_0>=30 && LA9_0<=32)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:891:1: (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:891:1: (lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:892:3: lv_parameters_3_0= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOCallMappingAccess().getParametersFunctionModulePOJOParameterMappingParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping1605);
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
            	    break loop9;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOCallMapping1616); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:926:1: entryRuleFunctionModulePOJORequestResponseMapping returns [EObject current=null] : iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF ;
    public final EObject entryRuleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJORequestResponseMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:927:2: (iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:928:2: iv_ruleFunctionModulePOJORequestResponseMapping= ruleFunctionModulePOJORequestResponseMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_entryRuleFunctionModulePOJORequestResponseMapping1652);
            iv_ruleFunctionModulePOJORequestResponseMapping=ruleFunctionModulePOJORequestResponseMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJORequestResponseMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJORequestResponseMapping1662); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:935:1: ruleFunctionModulePOJORequestResponseMapping returns [EObject current=null] : ( 'request' 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* '}' 'response' 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* '}' ) ;
    public final EObject ruleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        EObject current = null;

        Token lv_requestClassName_2_0=null;
        Token lv_responseClassName_8_0=null;
        EObject lv_requestParameters_4_0 = null;

        EObject lv_responseParameters_10_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:940:6: ( ( 'request' 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* '}' 'response' 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* '}' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:941:1: ( 'request' 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* '}' 'response' 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* '}' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:941:1: ( 'request' 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* '}' 'response' 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:941:3: 'request' 'class' ( (lv_requestClassName_2_0= RULE_ID ) ) '{' ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )* '}' 'response' 'class' ( (lv_responseClassName_8_0= RULE_ID ) ) '{' ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )* '}'
            {
            match(input,26,FOLLOW_26_in_ruleFunctionModulePOJORequestResponseMapping1697); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestKeyword_0(), null); 
                
            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJORequestResponseMapping1707); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_1(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:949:1: ( (lv_requestClassName_2_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:950:1: (lv_requestClassName_2_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:950:1: (lv_requestClassName_2_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:951:3: lv_requestClassName_2_0= RULE_ID
            {
            lv_requestClassName_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1724); 

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

            match(input,17,FOLLOW_17_in_ruleFunctionModulePOJORequestResponseMapping1739); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_3(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:977:1: ( (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28||(LA10_0>=30 && LA10_0<=32)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:978:1: (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:978:1: (lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:979:3: lv_requestParameters_4_0= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRequestParametersFunctionModulePOJOParameterMappingParserRuleCall_4_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1760);
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
            	    break loop10;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJORequestResponseMapping1771); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getRightCurlyBracketKeyword_5(), null); 
                
            match(input,27,FOLLOW_27_in_ruleFunctionModulePOJORequestResponseMapping1781); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseKeyword_6(), null); 
                
            match(input,19,FOLLOW_19_in_ruleFunctionModulePOJORequestResponseMapping1791); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getClassKeyword_7(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1013:1: ( (lv_responseClassName_8_0= RULE_ID ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1014:1: (lv_responseClassName_8_0= RULE_ID )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1014:1: (lv_responseClassName_8_0= RULE_ID )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1015:3: lv_responseClassName_8_0= RULE_ID
            {
            lv_responseClassName_8_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1808); 

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

            match(input,17,FOLLOW_17_in_ruleFunctionModulePOJORequestResponseMapping1823); 

                    createLeafNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getLeftCurlyBracketKeyword_9(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1041:1: ( (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28||(LA11_0>=30 && LA11_0<=32)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1042:1: (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping )
            	    {
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1042:1: (lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping )
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1043:3: lv_responseParameters_10_0= ruleFunctionModulePOJOParameterMapping
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJORequestResponseMappingAccess().getResponseParametersFunctionModulePOJOParameterMappingParserRuleCall_10_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1844);
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
            	    break loop11;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJORequestResponseMapping1855); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1077:1: entryRuleFunctionModulePOJOParameterMapping returns [EObject current=null] : iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF ;
    public final EObject entryRuleFunctionModulePOJOParameterMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOParameterMapping = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1078:2: (iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1079:2: iv_ruleFunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_entryRuleFunctionModulePOJOParameterMapping1891);
            iv_ruleFunctionModulePOJOParameterMapping=ruleFunctionModulePOJOParameterMapping();
            _fsp--;

             current =iv_ruleFunctionModulePOJOParameterMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOParameterMapping1901); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1086:1: ruleFunctionModulePOJOParameterMapping returns [EObject current=null] : (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter ) ;
    public final EObject ruleFunctionModulePOJOParameterMapping() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionModulePOJOImportingParameter_0 = null;

        EObject this_FunctionModulePOJOExportingParameter_1 = null;

        EObject this_FunctionModulePOJOChangingParameter_2 = null;

        EObject this_FunctionModulePOJOTablesParameter_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1091:6: ( (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1092:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1092:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )
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
                    new NoViableAltException("1092:1: (this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter | this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter | this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter | this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1093:5: this_FunctionModulePOJOImportingParameter_0= ruleFunctionModulePOJOImportingParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOImportingParameterParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping1948);
                    this_FunctionModulePOJOImportingParameter_0=ruleFunctionModulePOJOImportingParameter();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOImportingParameter_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1103:5: this_FunctionModulePOJOExportingParameter_1= ruleFunctionModulePOJOExportingParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOExportingParameterParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping1975);
                    this_FunctionModulePOJOExportingParameter_1=ruleFunctionModulePOJOExportingParameter();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOExportingParameter_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1113:5: this_FunctionModulePOJOChangingParameter_2= ruleFunctionModulePOJOChangingParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOChangingParameterParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping2002);
                    this_FunctionModulePOJOChangingParameter_2=ruleFunctionModulePOJOChangingParameter();
                    _fsp--;

                     
                            current = this_FunctionModulePOJOChangingParameter_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1123:5: this_FunctionModulePOJOTablesParameter_3= ruleFunctionModulePOJOTablesParameter
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOParameterMappingAccess().getFunctionModulePOJOTablesParameterParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping2029);
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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1139:1: entryRuleFunctionModulePOJOImportingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOImportingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOImportingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1140:2: (iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1141:2: iv_ruleFunctionModulePOJOImportingParameter= ruleFunctionModulePOJOImportingParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOImportingParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_entryRuleFunctionModulePOJOImportingParameter2064);
            iv_ruleFunctionModulePOJOImportingParameter=ruleFunctionModulePOJOImportingParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOImportingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOImportingParameter2074); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1148:1: ruleFunctionModulePOJOImportingParameter returns [EObject current=null] : ( 'importing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOImportingParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_inactive_4_0=null;
        Token lv_attribute_6_0=null;
        Token lv_structure_7_0=null;
        Token lv_name_8_0=null;
        Token lv_inactive_10_0=null;
        Token lv_attribute_12_0=null;
        Token lv_external_13_0=null;
        Token lv_attribute_15_0=null;
        Token lv_table_16_0=null;
        Token lv_name_17_0=null;
        Token lv_inactive_19_0=null;
        Token lv_attribute_21_0=null;
        Token lv_external_22_0=null;
        Token lv_attribute_24_0=null;
        Token lv_comment_26_0=null;
        Enumerator lv_type_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1153:6: ( ( 'importing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1154:1: ( 'importing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1154:1: ( 'importing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1154:3: 'importing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';'
            {
            match(input,28,FOLLOW_28_in_ruleFunctionModulePOJOImportingParameter2109); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getImportingKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1158:1: ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) )
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
                    new NoViableAltException("1158:1: ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1158:2: ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1158:2: ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1158:4: 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOImportingParameter2121); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getFieldKeyword_1_0_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1162:1: ( (lv_name_2_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1163:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1163:1: (lv_name_2_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1164:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2138); 

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

                    match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOImportingParameter2153); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_0_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1190:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
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
                            new NoViableAltException("1190:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1190:2: ( (lv_inactive_4_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1190:2: ( (lv_inactive_4_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1191:1: (lv_inactive_4_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1191:1: (lv_inactive_4_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1192:3: lv_inactive_4_0= 'inactive'
                            {
                            lv_inactive_4_0=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOImportingParameter2172); 

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
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1212:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1212:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1212:7: ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1212:7: ( (lv_type_5_0= ruleDataType ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1213:1: (lv_type_5_0= ruleDataType )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1213:1: (lv_type_5_0= ruleDataType )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1214:3: lv_type_5_0= ruleDataType
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleFunctionModulePOJOImportingParameter2213);
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

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1236:2: ( (lv_attribute_6_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1237:1: (lv_attribute_6_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1237:1: (lv_attribute_6_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1238:3: lv_attribute_6_0= RULE_ID
                            {
                            lv_attribute_6_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2230); 

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1261:6: ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1261:6: ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1261:7: ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1261:7: ( (lv_structure_7_0= 'structure' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1262:1: (lv_structure_7_0= 'structure' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1262:1: (lv_structure_7_0= 'structure' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1263:3: lv_structure_7_0= 'structure'
                    {
                    lv_structure_7_0=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter2263); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureStructureKeyword_1_1_0_0(), "structure"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "structure", true, "structure", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1282:2: ( (lv_name_8_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1283:1: (lv_name_8_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1283:1: (lv_name_8_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1284:3: lv_name_8_0= RULE_STRING
                    {
                    lv_name_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2293); 

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

                    match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOImportingParameter2308); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_1_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1310:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )
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
                            new NoViableAltException("1310:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1310:2: ( (lv_inactive_10_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1310:2: ( (lv_inactive_10_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1311:1: (lv_inactive_10_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1311:1: (lv_inactive_10_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1312:3: lv_inactive_10_0= 'inactive'
                            {
                            lv_inactive_10_0=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOImportingParameter2327); 

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
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1332:6: ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1332:6: ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1332:7: ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1332:7: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1333:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1333:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1334:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2365); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_1_1_3_1_0_0(), "structureMapping"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1346:2: ( (lv_attribute_12_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1347:1: (lv_attribute_12_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1347:1: (lv_attribute_12_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1348:3: lv_attribute_12_0= RULE_ID
                            {
                            lv_attribute_12_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2382); 

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
                        case 3 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1371:6: ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1371:6: ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1371:7: ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1371:7: ( (lv_external_13_0= 'external' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1372:1: (lv_external_13_0= 'external' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1372:1: (lv_external_13_0= 'external' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1373:3: lv_external_13_0= 'external'
                            {
                            lv_external_13_0=(Token)input.LT(1);
                            match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOImportingParameter2413); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getExternalExternalKeyword_1_1_3_2_0_0(), "external"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "external", true, "external", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1392:2: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1393:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1393:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1394:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2444); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getExternalClassImportCrossReference_1_1_3_2_1_0(), "externalClass"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1406:2: ( (lv_attribute_15_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1407:1: (lv_attribute_15_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1407:1: (lv_attribute_15_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1408:3: lv_attribute_15_0= RULE_ID
                            {
                            lv_attribute_15_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2461); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_2_2_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_15_0, 
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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1431:6: ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1431:6: ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1431:7: ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1431:7: ( (lv_table_16_0= 'table' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1432:1: (lv_table_16_0= 'table' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1432:1: (lv_table_16_0= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1433:3: lv_table_16_0= 'table'
                    {
                    lv_table_16_0=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleFunctionModulePOJOImportingParameter2494); 

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

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1452:2: ( (lv_name_17_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1453:1: (lv_name_17_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1453:1: (lv_name_17_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1454:3: lv_name_17_0= RULE_STRING
                    {
                    lv_name_17_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2524); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_17_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOImportingParameter2539); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getEqualsSignKeyword_1_2_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1480:1: ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )
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
                            new NoViableAltException("1480:1: ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1480:2: ( (lv_inactive_19_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1480:2: ( (lv_inactive_19_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1481:1: (lv_inactive_19_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1481:1: (lv_inactive_19_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1482:3: lv_inactive_19_0= 'inactive'
                            {
                            lv_inactive_19_0=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOImportingParameter2558); 

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
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1502:6: ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1502:6: ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1502:7: ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1502:7: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1503:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1503:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1504:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2596); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_1_2_3_1_0_0(), "structureMapping"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1516:2: ( (lv_attribute_21_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1517:1: (lv_attribute_21_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1517:1: (lv_attribute_21_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1518:3: lv_attribute_21_0= RULE_ID
                            {
                            lv_attribute_21_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2613); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_21_0, 
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
                        case 3 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1541:6: ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1541:6: ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1541:7: ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1541:7: ( (lv_external_22_0= 'external' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1542:1: (lv_external_22_0= 'external' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1542:1: (lv_external_22_0= 'external' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1543:3: lv_external_22_0= 'external'
                            {
                            lv_external_22_0=(Token)input.LT(1);
                            match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOImportingParameter2644); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getExternalExternalKeyword_1_2_3_2_0_0(), "external"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "external", true, "external", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1562:2: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1563:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1563:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1564:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2675); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getExternalClassImportCrossReference_1_2_3_2_1_0(), "externalClass"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1576:2: ( (lv_attribute_24_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1577:1: (lv_attribute_24_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1577:1: (lv_attribute_24_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1578:3: lv_attribute_24_0= RULE_ID
                            {
                            lv_attribute_24_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2692); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_2_2_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_24_0, 
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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1600:6: ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1600:8: 'comment' ( (lv_comment_26_0= RULE_STRING ) )
                    {
                    match(input,23,FOLLOW_23_in_ruleFunctionModulePOJOImportingParameter2712); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentKeyword_2_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1604:1: ( (lv_comment_26_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1605:1: (lv_comment_26_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1605:1: (lv_comment_26_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1606:3: lv_comment_26_0= RULE_STRING
                    {
                    lv_comment_26_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2729); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOImportingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0(), "comment"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOImportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"comment",
                    	        		lv_comment_26_0, 
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

            match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOImportingParameter2746); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1640:1: entryRuleFunctionModulePOJOExportingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOExportingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOExportingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1641:2: (iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1642:2: iv_ruleFunctionModulePOJOExportingParameter= ruleFunctionModulePOJOExportingParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOExportingParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_entryRuleFunctionModulePOJOExportingParameter2782);
            iv_ruleFunctionModulePOJOExportingParameter=ruleFunctionModulePOJOExportingParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOExportingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOExportingParameter2792); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1649:1: ruleFunctionModulePOJOExportingParameter returns [EObject current=null] : ( 'exporting' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOExportingParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_inactive_4_0=null;
        Token lv_attribute_6_0=null;
        Token lv_structure_7_0=null;
        Token lv_name_8_0=null;
        Token lv_inactive_10_0=null;
        Token lv_attribute_12_0=null;
        Token lv_external_13_0=null;
        Token lv_attribute_15_0=null;
        Token lv_table_16_0=null;
        Token lv_name_17_0=null;
        Token lv_inactive_19_0=null;
        Token lv_attribute_21_0=null;
        Token lv_external_22_0=null;
        Token lv_attribute_24_0=null;
        Token lv_comment_26_0=null;
        Enumerator lv_type_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1654:6: ( ( 'exporting' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1655:1: ( 'exporting' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1655:1: ( 'exporting' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1655:3: 'exporting' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';'
            {
            match(input,31,FOLLOW_31_in_ruleFunctionModulePOJOExportingParameter2827); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExportingKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1659:1: ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) )
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
                    new NoViableAltException("1659:1: ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1659:2: ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1659:2: ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1659:4: 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOExportingParameter2839); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getFieldKeyword_1_0_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1663:1: ( (lv_name_2_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1664:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1664:1: (lv_name_2_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1665:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2856); 

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

                    match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOExportingParameter2871); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_0_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1691:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
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
                            new NoViableAltException("1691:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1691:2: ( (lv_inactive_4_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1691:2: ( (lv_inactive_4_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1692:1: (lv_inactive_4_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1692:1: (lv_inactive_4_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1693:3: lv_inactive_4_0= 'inactive'
                            {
                            lv_inactive_4_0=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOExportingParameter2890); 

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
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1713:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1713:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1713:7: ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1713:7: ( (lv_type_5_0= ruleDataType ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1714:1: (lv_type_5_0= ruleDataType )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1714:1: (lv_type_5_0= ruleDataType )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1715:3: lv_type_5_0= ruleDataType
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleFunctionModulePOJOExportingParameter2931);
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

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1737:2: ( (lv_attribute_6_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1738:1: (lv_attribute_6_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1738:1: (lv_attribute_6_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1739:3: lv_attribute_6_0= RULE_ID
                            {
                            lv_attribute_6_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2948); 

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1762:6: ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1762:6: ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1762:7: ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1762:7: ( (lv_structure_7_0= 'structure' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1763:1: (lv_structure_7_0= 'structure' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1763:1: (lv_structure_7_0= 'structure' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1764:3: lv_structure_7_0= 'structure'
                    {
                    lv_structure_7_0=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter2981); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureStructureKeyword_1_1_0_0(), "structure"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "structure", true, "structure", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1783:2: ( (lv_name_8_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1784:1: (lv_name_8_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1784:1: (lv_name_8_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1785:3: lv_name_8_0= RULE_STRING
                    {
                    lv_name_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3011); 

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

                    match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOExportingParameter3026); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_1_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1811:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )
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
                            new NoViableAltException("1811:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1811:2: ( (lv_inactive_10_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1811:2: ( (lv_inactive_10_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1812:1: (lv_inactive_10_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1812:1: (lv_inactive_10_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1813:3: lv_inactive_10_0= 'inactive'
                            {
                            lv_inactive_10_0=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOExportingParameter3045); 

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
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1833:6: ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1833:6: ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1833:7: ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1833:7: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1834:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1834:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1835:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3083); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_1_1_3_1_0_0(), "structureMapping"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1847:2: ( (lv_attribute_12_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1848:1: (lv_attribute_12_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1848:1: (lv_attribute_12_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1849:3: lv_attribute_12_0= RULE_ID
                            {
                            lv_attribute_12_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3100); 

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
                        case 3 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1872:6: ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1872:6: ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1872:7: ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1872:7: ( (lv_external_13_0= 'external' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1873:1: (lv_external_13_0= 'external' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1873:1: (lv_external_13_0= 'external' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1874:3: lv_external_13_0= 'external'
                            {
                            lv_external_13_0=(Token)input.LT(1);
                            match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOExportingParameter3131); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExternalExternalKeyword_1_1_3_2_0_0(), "external"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "external", true, "external", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1893:2: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1894:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1894:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1895:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3162); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExternalClassImportCrossReference_1_1_3_2_1_0(), "externalClass"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1907:2: ( (lv_attribute_15_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1908:1: (lv_attribute_15_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1908:1: (lv_attribute_15_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1909:3: lv_attribute_15_0= RULE_ID
                            {
                            lv_attribute_15_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3179); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_2_2_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_15_0, 
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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1932:6: ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1932:6: ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1932:7: ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1932:7: ( (lv_table_16_0= 'table' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1933:1: (lv_table_16_0= 'table' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1933:1: (lv_table_16_0= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1934:3: lv_table_16_0= 'table'
                    {
                    lv_table_16_0=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleFunctionModulePOJOExportingParameter3212); 

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

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1953:2: ( (lv_name_17_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1954:1: (lv_name_17_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1954:1: (lv_name_17_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1955:3: lv_name_17_0= RULE_STRING
                    {
                    lv_name_17_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3242); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_17_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOExportingParameter3257); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getEqualsSignKeyword_1_2_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1981:1: ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )
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
                            new NoViableAltException("1981:1: ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )", 20, 0, input);

                        throw nvae;
                    }

                    switch (alt20) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1981:2: ( (lv_inactive_19_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1981:2: ( (lv_inactive_19_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1982:1: (lv_inactive_19_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1982:1: (lv_inactive_19_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1983:3: lv_inactive_19_0= 'inactive'
                            {
                            lv_inactive_19_0=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOExportingParameter3276); 

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
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2003:6: ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2003:6: ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2003:7: ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2003:7: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2004:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2004:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2005:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3314); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_1_2_3_1_0_0(), "structureMapping"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2017:2: ( (lv_attribute_21_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2018:1: (lv_attribute_21_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2018:1: (lv_attribute_21_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2019:3: lv_attribute_21_0= RULE_ID
                            {
                            lv_attribute_21_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3331); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_21_0, 
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
                        case 3 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2042:6: ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2042:6: ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2042:7: ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2042:7: ( (lv_external_22_0= 'external' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2043:1: (lv_external_22_0= 'external' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2043:1: (lv_external_22_0= 'external' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2044:3: lv_external_22_0= 'external'
                            {
                            lv_external_22_0=(Token)input.LT(1);
                            match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOExportingParameter3362); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExternalExternalKeyword_1_2_3_2_0_0(), "external"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "external", true, "external", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2063:2: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2064:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2064:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2065:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3393); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getExternalClassImportCrossReference_1_2_3_2_1_0(), "externalClass"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2077:2: ( (lv_attribute_24_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2078:1: (lv_attribute_24_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2078:1: (lv_attribute_24_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2079:3: lv_attribute_24_0= RULE_ID
                            {
                            lv_attribute_24_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3410); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_2_2_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_24_0, 
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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2101:6: ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2101:8: 'comment' ( (lv_comment_26_0= RULE_STRING ) )
                    {
                    match(input,23,FOLLOW_23_in_ruleFunctionModulePOJOExportingParameter3430); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentKeyword_2_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2105:1: ( (lv_comment_26_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2106:1: (lv_comment_26_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2106:1: (lv_comment_26_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2107:3: lv_comment_26_0= RULE_STRING
                    {
                    lv_comment_26_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3447); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOExportingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0(), "comment"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOExportingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"comment",
                    	        		lv_comment_26_0, 
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

            match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOExportingParameter3464); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2141:1: entryRuleFunctionModulePOJOChangingParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOChangingParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOChangingParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2142:2: (iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2143:2: iv_ruleFunctionModulePOJOChangingParameter= ruleFunctionModulePOJOChangingParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOChangingParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_entryRuleFunctionModulePOJOChangingParameter3500);
            iv_ruleFunctionModulePOJOChangingParameter=ruleFunctionModulePOJOChangingParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOChangingParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOChangingParameter3510); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2150:1: ruleFunctionModulePOJOChangingParameter returns [EObject current=null] : ( 'changing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOChangingParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token lv_inactive_4_0=null;
        Token lv_attribute_6_0=null;
        Token lv_structure_7_0=null;
        Token lv_name_8_0=null;
        Token lv_inactive_10_0=null;
        Token lv_attribute_12_0=null;
        Token lv_external_13_0=null;
        Token lv_attribute_15_0=null;
        Token lv_table_16_0=null;
        Token lv_name_17_0=null;
        Token lv_inactive_19_0=null;
        Token lv_attribute_21_0=null;
        Token lv_external_22_0=null;
        Token lv_attribute_24_0=null;
        Token lv_comment_26_0=null;
        Enumerator lv_type_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2155:6: ( ( 'changing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2156:1: ( 'changing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2156:1: ( 'changing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2156:3: 'changing' ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) ) ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )? ';'
            {
            match(input,32,FOLLOW_32_in_ruleFunctionModulePOJOChangingParameter3545); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getChangingKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2160:1: ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) )
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
                    new NoViableAltException("2160:1: ( ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) ) | ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) ) | ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) ) )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2160:2: ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2160:2: ( 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2160:4: 'field' ( (lv_name_2_0= RULE_STRING ) ) '=' ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
                    {
                    match(input,20,FOLLOW_20_in_ruleFunctionModulePOJOChangingParameter3557); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getFieldKeyword_1_0_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2164:1: ( (lv_name_2_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2165:1: (lv_name_2_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2165:1: (lv_name_2_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2166:3: lv_name_2_0= RULE_STRING
                    {
                    lv_name_2_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3574); 

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

                    match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOChangingParameter3589); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_0_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2192:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )
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
                            new NoViableAltException("2192:1: ( ( (lv_inactive_4_0= 'inactive' ) ) | ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) ) )", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2192:2: ( (lv_inactive_4_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2192:2: ( (lv_inactive_4_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2193:1: (lv_inactive_4_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2193:1: (lv_inactive_4_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2194:3: lv_inactive_4_0= 'inactive'
                            {
                            lv_inactive_4_0=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOChangingParameter3608); 

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
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2214:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2214:6: ( ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2214:7: ( (lv_type_5_0= ruleDataType ) ) ( (lv_attribute_6_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2214:7: ( (lv_type_5_0= ruleDataType ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2215:1: (lv_type_5_0= ruleDataType )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2215:1: (lv_type_5_0= ruleDataType )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2216:3: lv_type_5_0= ruleDataType
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getTypeDataTypeEnumRuleCall_1_0_3_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleDataType_in_ruleFunctionModulePOJOChangingParameter3649);
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

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2238:2: ( (lv_attribute_6_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2239:1: (lv_attribute_6_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2239:1: (lv_attribute_6_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2240:3: lv_attribute_6_0= RULE_ID
                            {
                            lv_attribute_6_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3666); 

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2263:6: ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2263:6: ( ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2263:7: ( (lv_structure_7_0= 'structure' ) ) ( (lv_name_8_0= RULE_STRING ) ) '=' ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2263:7: ( (lv_structure_7_0= 'structure' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2264:1: (lv_structure_7_0= 'structure' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2264:1: (lv_structure_7_0= 'structure' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2265:3: lv_structure_7_0= 'structure'
                    {
                    lv_structure_7_0=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter3699); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureStructureKeyword_1_1_0_0(), "structure"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "structure", true, "structure", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2284:2: ( (lv_name_8_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2285:1: (lv_name_8_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2285:1: (lv_name_8_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2286:3: lv_name_8_0= RULE_STRING
                    {
                    lv_name_8_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3729); 

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

                    match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOChangingParameter3744); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_1_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2312:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )
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
                            new NoViableAltException("2312:1: ( ( (lv_inactive_10_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) ) | ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) ) )", 24, 0, input);

                        throw nvae;
                    }

                    switch (alt24) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2312:2: ( (lv_inactive_10_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2312:2: ( (lv_inactive_10_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2313:1: (lv_inactive_10_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2313:1: (lv_inactive_10_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2314:3: lv_inactive_10_0= 'inactive'
                            {
                            lv_inactive_10_0=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOChangingParameter3763); 

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
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2334:6: ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2334:6: ( ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2334:7: ( ( RULE_ID ) ) ( (lv_attribute_12_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2334:7: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2335:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2335:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2336:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3801); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_1_1_3_1_0_0(), "structureMapping"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2348:2: ( (lv_attribute_12_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2349:1: (lv_attribute_12_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2349:1: (lv_attribute_12_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2350:3: lv_attribute_12_0= RULE_ID
                            {
                            lv_attribute_12_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3818); 

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
                        case 3 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2373:6: ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2373:6: ( ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2373:7: ( (lv_external_13_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_15_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2373:7: ( (lv_external_13_0= 'external' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2374:1: (lv_external_13_0= 'external' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2374:1: (lv_external_13_0= 'external' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2375:3: lv_external_13_0= 'external'
                            {
                            lv_external_13_0=(Token)input.LT(1);
                            match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOChangingParameter3849); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getExternalExternalKeyword_1_1_3_2_0_0(), "external"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "external", true, "external", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2394:2: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2395:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2395:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2396:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3880); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getExternalClassImportCrossReference_1_1_3_2_1_0(), "externalClass"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2408:2: ( (lv_attribute_15_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2409:1: (lv_attribute_15_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2409:1: (lv_attribute_15_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2410:3: lv_attribute_15_0= RULE_ID
                            {
                            lv_attribute_15_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3897); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_1_3_2_2_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_15_0, 
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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2433:6: ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2433:6: ( ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2433:7: ( (lv_table_16_0= 'table' ) ) ( (lv_name_17_0= RULE_STRING ) ) '=' ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2433:7: ( (lv_table_16_0= 'table' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2434:1: (lv_table_16_0= 'table' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2434:1: (lv_table_16_0= 'table' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2435:3: lv_table_16_0= 'table'
                    {
                    lv_table_16_0=(Token)input.LT(1);
                    match(input,30,FOLLOW_30_in_ruleFunctionModulePOJOChangingParameter3930); 

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

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2454:2: ( (lv_name_17_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2455:1: (lv_name_17_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2455:1: (lv_name_17_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2456:3: lv_name_17_0= RULE_STRING
                    {
                    lv_name_17_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3960); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getNameSTRINGTerminalRuleCall_1_2_1_0(), "name"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"name",
                    	        		lv_name_17_0, 
                    	        		"STRING", 
                    	        		lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOChangingParameter3975); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getEqualsSignKeyword_1_2_2(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2482:1: ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )
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
                            new NoViableAltException("2482:1: ( ( (lv_inactive_19_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) ) | ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) ) )", 25, 0, input);

                        throw nvae;
                    }

                    switch (alt25) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2482:2: ( (lv_inactive_19_0= 'inactive' ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2482:2: ( (lv_inactive_19_0= 'inactive' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2483:1: (lv_inactive_19_0= 'inactive' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2483:1: (lv_inactive_19_0= 'inactive' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2484:3: lv_inactive_19_0= 'inactive'
                            {
                            lv_inactive_19_0=(Token)input.LT(1);
                            match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOChangingParameter3994); 

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
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2504:6: ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2504:6: ( ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2504:7: ( ( RULE_ID ) ) ( (lv_attribute_21_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2504:7: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2505:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2505:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2506:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4032); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_1_2_3_1_0_0(), "structureMapping"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2518:2: ( (lv_attribute_21_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2519:1: (lv_attribute_21_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2519:1: (lv_attribute_21_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2520:3: lv_attribute_21_0= RULE_ID
                            {
                            lv_attribute_21_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4049); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_1_1_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_21_0, 
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
                        case 3 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2543:6: ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2543:6: ( ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2543:7: ( (lv_external_22_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_24_0= RULE_ID ) )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2543:7: ( (lv_external_22_0= 'external' ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2544:1: (lv_external_22_0= 'external' )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2544:1: (lv_external_22_0= 'external' )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2545:3: lv_external_22_0= 'external'
                            {
                            lv_external_22_0=(Token)input.LT(1);
                            match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOChangingParameter4080); 

                                    createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getExternalExternalKeyword_1_2_3_2_0_0(), "external"); 
                                

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        
                            	        try {
                            	       		set(current, "external", true, "external", lastConsumedNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	    

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2564:2: ( ( RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2565:1: ( RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2565:1: ( RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2566:3: RULE_ID
                            {

                            			if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                                    
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4111); 

                            		createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getExternalClassImportCrossReference_1_2_3_2_1_0(), "externalClass"); 
                            	

                            }


                            }

                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2578:2: ( (lv_attribute_24_0= RULE_ID ) )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2579:1: (lv_attribute_24_0= RULE_ID )
                            {
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2579:1: (lv_attribute_24_0= RULE_ID )
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2580:3: lv_attribute_24_0= RULE_ID
                            {
                            lv_attribute_24_0=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4128); 

                            			createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getAttributeIDTerminalRuleCall_1_2_3_2_2_0(), "attribute"); 
                            		

                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode, current);
                            	        }
                            	        try {
                            	       		set(
                            	       			current, 
                            	       			"attribute",
                            	        		lv_attribute_24_0, 
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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2602:6: ( 'comment' ( (lv_comment_26_0= RULE_STRING ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2602:8: 'comment' ( (lv_comment_26_0= RULE_STRING ) )
                    {
                    match(input,23,FOLLOW_23_in_ruleFunctionModulePOJOChangingParameter4148); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentKeyword_2_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2606:1: ( (lv_comment_26_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2607:1: (lv_comment_26_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2607:1: (lv_comment_26_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2608:3: lv_comment_26_0= RULE_STRING
                    {
                    lv_comment_26_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter4165); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOChangingParameterAccess().getCommentSTRINGTerminalRuleCall_2_1_0(), "comment"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOChangingParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"comment",
                    	        		lv_comment_26_0, 
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

            match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOChangingParameter4182); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2642:1: entryRuleFunctionModulePOJOTablesParameter returns [EObject current=null] : iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF ;
    public final EObject entryRuleFunctionModulePOJOTablesParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionModulePOJOTablesParameter = null;


        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2643:2: (iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2644:2: iv_ruleFunctionModulePOJOTablesParameter= ruleFunctionModulePOJOTablesParameter EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFunctionModulePOJOTablesParameterRule(), currentNode); 
            pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_entryRuleFunctionModulePOJOTablesParameter4218);
            iv_ruleFunctionModulePOJOTablesParameter=ruleFunctionModulePOJOTablesParameter();
            _fsp--;

             current =iv_ruleFunctionModulePOJOTablesParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionModulePOJOTablesParameter4228); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2651:1: ruleFunctionModulePOJOTablesParameter returns [EObject current=null] : ( 'table' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) | ( ( (lv_external_6_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_10_0= RULE_STRING ) ) )? ';' ) ;
    public final EObject ruleFunctionModulePOJOTablesParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_inactive_3_0=null;
        Token lv_attribute_5_0=null;
        Token lv_external_6_0=null;
        Token lv_attribute_8_0=null;
        Token lv_comment_10_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2656:6: ( ( 'table' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) | ( ( (lv_external_6_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_10_0= RULE_STRING ) ) )? ';' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2657:1: ( 'table' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) | ( ( (lv_external_6_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_10_0= RULE_STRING ) ) )? ';' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2657:1: ( 'table' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) | ( ( (lv_external_6_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_10_0= RULE_STRING ) ) )? ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2657:3: 'table' ( (lv_name_1_0= RULE_STRING ) ) '=' ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) | ( ( (lv_external_6_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) ) ) ( 'comment' ( (lv_comment_10_0= RULE_STRING ) ) )? ';'
            {
            match(input,30,FOLLOW_30_in_ruleFunctionModulePOJOTablesParameter4263); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getTableKeyword_0(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2661:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2662:1: (lv_name_1_0= RULE_STRING )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2662:1: (lv_name_1_0= RULE_STRING )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2663:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter4280); 

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

            match(input,21,FOLLOW_21_in_ruleFunctionModulePOJOTablesParameter4295); 

                    createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getEqualsSignKeyword_2(), null); 
                
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2689:1: ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) | ( ( (lv_external_6_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) ) )
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
                    new NoViableAltException("2689:1: ( ( (lv_inactive_3_0= 'inactive' ) ) | ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) ) | ( ( (lv_external_6_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) ) )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2689:2: ( (lv_inactive_3_0= 'inactive' ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2689:2: ( (lv_inactive_3_0= 'inactive' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2690:1: (lv_inactive_3_0= 'inactive' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2690:1: (lv_inactive_3_0= 'inactive' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2691:3: lv_inactive_3_0= 'inactive'
                    {
                    lv_inactive_3_0=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruleFunctionModulePOJOTablesParameter4314); 

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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2711:6: ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2711:6: ( ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2711:7: ( ( RULE_ID ) ) ( (lv_attribute_5_0= RULE_ID ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2711:7: ( ( RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2712:1: ( RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2712:1: ( RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2713:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4352); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getStructureMappingStructurePOJOMappingCrossReference_3_1_0_0(), "structureMapping"); 
                    	

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2725:2: ( (lv_attribute_5_0= RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2726:1: (lv_attribute_5_0= RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2726:1: (lv_attribute_5_0= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2727:3: lv_attribute_5_0= RULE_ID
                    {
                    lv_attribute_5_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4369); 

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
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2750:6: ( ( (lv_external_6_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2750:6: ( ( (lv_external_6_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2750:7: ( (lv_external_6_0= 'external' ) ) ( ( RULE_ID ) ) ( (lv_attribute_8_0= RULE_ID ) )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2750:7: ( (lv_external_6_0= 'external' ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2751:1: (lv_external_6_0= 'external' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2751:1: (lv_external_6_0= 'external' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2752:3: lv_external_6_0= 'external'
                    {
                    lv_external_6_0=(Token)input.LT(1);
                    match(input,29,FOLLOW_29_in_ruleFunctionModulePOJOTablesParameter4400); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getExternalExternalKeyword_3_2_0_0(), "external"); 
                        

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        
                    	        try {
                    	       		set(current, "external", true, "external", lastConsumedNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	    

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2771:2: ( ( RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2772:1: ( RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2772:1: ( RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2773:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4431); 

                    		createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getExternalClassImportCrossReference_3_2_1_0(), "externalClass"); 
                    	

                    }


                    }

                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2785:2: ( (lv_attribute_8_0= RULE_ID ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2786:1: (lv_attribute_8_0= RULE_ID )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2786:1: (lv_attribute_8_0= RULE_ID )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2787:3: lv_attribute_8_0= RULE_ID
                    {
                    lv_attribute_8_0=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4448); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getAttributeIDTerminalRuleCall_3_2_2_0(), "attribute"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"attribute",
                    	        		lv_attribute_8_0, 
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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2809:4: ( 'comment' ( (lv_comment_10_0= RULE_STRING ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2809:6: 'comment' ( (lv_comment_10_0= RULE_STRING ) )
                    {
                    match(input,23,FOLLOW_23_in_ruleFunctionModulePOJOTablesParameter4466); 

                            createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentKeyword_4_0(), null); 
                        
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2813:1: ( (lv_comment_10_0= RULE_STRING ) )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2814:1: (lv_comment_10_0= RULE_STRING )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2814:1: (lv_comment_10_0= RULE_STRING )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2815:3: lv_comment_10_0= RULE_STRING
                    {
                    lv_comment_10_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter4483); 

                    			createLeafNode(grammarAccess.getFunctionModulePOJOTablesParameterAccess().getCommentSTRINGTerminalRuleCall_4_1_0(), "comment"); 
                    		

                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getFunctionModulePOJOTablesParameterRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"comment",
                    	        		lv_comment_10_0, 
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

            match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOTablesParameter4500); 

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
    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2849:1: ruleDataType returns [Enumerator current=null] : ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2853:6: ( ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2854:1: ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2854:1: ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) )
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
                    new NoViableAltException("2854:1: ( ( 'BigDecimal' ) | ( 'BigInteger' ) | ( 'Boolean' ) | ( 'Byte' ) | ( 'ByteArray' ) | ( 'Char' ) | ( 'CharArray' ) | ( 'Date' ) | ( 'Double' ) | ( 'Float' ) | ( 'Integer' ) | ( 'Long' ) | ( 'Short' ) | ( 'String' ) | ( 'Time' ) )", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2854:2: ( 'BigDecimal' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2854:2: ( 'BigDecimal' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2854:4: 'BigDecimal'
                    {
                    match(input,33,FOLLOW_33_in_ruleDataType4548); 

                            current = grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBIG_DECIMALEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2860:6: ( 'BigInteger' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2860:6: ( 'BigInteger' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2860:8: 'BigInteger'
                    {
                    match(input,34,FOLLOW_34_in_ruleDataType4563); 

                            current = grammarAccess.getDataTypeAccess().getBIG_INTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBIG_INTEGEREnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2866:6: ( 'Boolean' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2866:6: ( 'Boolean' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2866:8: 'Boolean'
                    {
                    match(input,35,FOLLOW_35_in_ruleDataType4578); 

                            current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2872:6: ( 'Byte' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2872:6: ( 'Byte' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2872:8: 'Byte'
                    {
                    match(input,36,FOLLOW_36_in_ruleDataType4593); 

                            current = grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBYTEEnumLiteralDeclaration_3(), null); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2878:6: ( 'ByteArray' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2878:6: ( 'ByteArray' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2878:8: 'ByteArray'
                    {
                    match(input,37,FOLLOW_37_in_ruleDataType4608); 

                            current = grammarAccess.getDataTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getBYTE_ARRAYEnumLiteralDeclaration_4(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2884:6: ( 'Char' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2884:6: ( 'Char' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2884:8: 'Char'
                    {
                    match(input,38,FOLLOW_38_in_ruleDataType4623); 

                            current = grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getCHAREnumLiteralDeclaration_5(), null); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2890:6: ( 'CharArray' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2890:6: ( 'CharArray' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2890:8: 'CharArray'
                    {
                    match(input,39,FOLLOW_39_in_ruleDataType4638); 

                            current = grammarAccess.getDataTypeAccess().getCHAR_ARRAYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getCHAR_ARRAYEnumLiteralDeclaration_6(), null); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2896:6: ( 'Date' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2896:6: ( 'Date' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2896:8: 'Date'
                    {
                    match(input,40,FOLLOW_40_in_ruleDataType4653); 

                            current = grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getDATEEnumLiteralDeclaration_7(), null); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2902:6: ( 'Double' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2902:6: ( 'Double' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2902:8: 'Double'
                    {
                    match(input,41,FOLLOW_41_in_ruleDataType4668); 

                            current = grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getDOUBLEEnumLiteralDeclaration_8(), null); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2908:6: ( 'Float' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2908:6: ( 'Float' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2908:8: 'Float'
                    {
                    match(input,42,FOLLOW_42_in_ruleDataType4683); 

                            current = grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getFLOATEnumLiteralDeclaration_9(), null); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2914:6: ( 'Integer' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2914:6: ( 'Integer' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2914:8: 'Integer'
                    {
                    match(input,43,FOLLOW_43_in_ruleDataType4698); 

                            current = grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getINTEGEREnumLiteralDeclaration_10(), null); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2920:6: ( 'Long' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2920:6: ( 'Long' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2920:8: 'Long'
                    {
                    match(input,44,FOLLOW_44_in_ruleDataType4713); 

                            current = grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getLONGEnumLiteralDeclaration_11(), null); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2926:6: ( 'Short' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2926:6: ( 'Short' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2926:8: 'Short'
                    {
                    match(input,45,FOLLOW_45_in_ruleDataType4728); 

                            current = grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getSHORTEnumLiteralDeclaration_12(), null); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2932:6: ( 'String' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2932:6: ( 'String' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2932:8: 'String'
                    {
                    match(input,46,FOLLOW_46_in_ruleDataType4743); 

                            current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_13(), null); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2938:6: ( 'Time' )
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2938:6: ( 'Time' )
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2938:8: 'Time'
                    {
                    match(input,47,FOLLOW_47_in_ruleDataType4758); 

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
    public static final BitSet FOLLOW_RULE_STRING_in_ruleModel137 = new BitSet(new long[]{0x0000000001012002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel163 = new BitSet(new long[]{0x0000000001012002L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleModel185 = new BitSet(new long[]{0x0000000001010002L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_ruleModel207 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName296 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedName315 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName330 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleImport422 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleImport443 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImport453 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImport470 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleImport485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleStructure566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructure583 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStructure598 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleStructureMapping_in_ruleStructure619 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructure629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureMapping_in_entryRuleStructureMapping665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureMapping675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructurePOJOMapping_in_ruleStructureMapping721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructurePOJOMapping_in_entryRuleStructurePOJOMapping755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructurePOJOMapping765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleStructurePOJOMapping800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructurePOJOMapping817 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStructurePOJOMapping832 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping854 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStructurePOJOMapping864 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_18_in_ruleStructurePOJOMapping876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_entryRuleStructureFieldPOJOMapping912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructureFieldPOJOMapping922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleStructureFieldPOJOMapping957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping974 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleStructureFieldPOJOMapping989 = new BitSet(new long[]{0x0000FFFE00400000L});
    public static final BitSet FOLLOW_22_in_ruleStructureFieldPOJOMapping1008 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleStructureFieldPOJOMapping1049 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping1066 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleStructureFieldPOJOMapping1084 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_entryRuleFunctionModule1144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModule1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModule1189 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModule1199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModule1216 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModule1231 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule1252 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModule1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_entryRuleFunctionModuleMapping1298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModuleMapping1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_entryRuleFunctionModulePOJOMapping1388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOMapping1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping1472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_entryRuleFunctionModulePOJOCallMapping1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOCallMapping1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJOCallMapping1552 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping1569 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOCallMapping1584 = new BitSet(new long[]{0x00000001D0040000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping1605 = new BitSet(new long[]{0x00000001D0040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOCallMapping1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_entryRuleFunctionModulePOJORequestResponseMapping1652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJORequestResponseMapping1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJORequestResponseMapping1697 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJORequestResponseMapping1707 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1724 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJORequestResponseMapping1739 = new BitSet(new long[]{0x00000001D0040000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1760 = new BitSet(new long[]{0x00000001D0040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJORequestResponseMapping1771 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionModulePOJORequestResponseMapping1781 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModulePOJORequestResponseMapping1791 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping1808 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJORequestResponseMapping1823 = new BitSet(new long[]{0x00000001D0040000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping1844 = new BitSet(new long[]{0x00000001D0040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJORequestResponseMapping1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_entryRuleFunctionModulePOJOParameterMapping1891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOParameterMapping1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_entryRuleFunctionModulePOJOImportingParameter2064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOImportingParameter2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFunctionModulePOJOImportingParameter2109 = new BitSet(new long[]{0x0000000040110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOImportingParameter2121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2138 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOImportingParameter2153 = new BitSet(new long[]{0x0000FFFE00400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOImportingParameter2172 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunctionModulePOJOImportingParameter2213 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2230 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter2263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2293 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOImportingParameter2308 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOImportingParameter2327 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2365 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2382 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOImportingParameter2413 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2444 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2461 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionModulePOJOImportingParameter2494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2524 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOImportingParameter2539 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOImportingParameter2558 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2613 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOImportingParameter2644 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2675 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter2692 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJOImportingParameter2712 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter2729 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOImportingParameter2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_entryRuleFunctionModulePOJOExportingParameter2782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOExportingParameter2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFunctionModulePOJOExportingParameter2827 = new BitSet(new long[]{0x0000000040110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOExportingParameter2839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter2856 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOExportingParameter2871 = new BitSet(new long[]{0x0000FFFE00400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOExportingParameter2890 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunctionModulePOJOExportingParameter2931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter2948 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter2981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3011 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOExportingParameter3026 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOExportingParameter3045 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3083 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3100 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOExportingParameter3131 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3179 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionModulePOJOExportingParameter3212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3242 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOExportingParameter3257 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOExportingParameter3276 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3331 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOExportingParameter3362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3393 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter3410 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJOExportingParameter3430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter3447 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOExportingParameter3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_entryRuleFunctionModulePOJOChangingParameter3500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOChangingParameter3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFunctionModulePOJOChangingParameter3545 = new BitSet(new long[]{0x0000000040110000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModulePOJOChangingParameter3557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3574 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOChangingParameter3589 = new BitSet(new long[]{0x0000FFFE00400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOChangingParameter3608 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_ruleDataType_in_ruleFunctionModulePOJOChangingParameter3649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3666 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter3699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3729 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOChangingParameter3744 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOChangingParameter3763 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3801 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3818 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOChangingParameter3849 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3880 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter3897 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionModulePOJOChangingParameter3930 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter3960 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOChangingParameter3975 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOChangingParameter3994 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4032 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4049 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOChangingParameter4080 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter4128 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJOChangingParameter4148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter4165 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOChangingParameter4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_entryRuleFunctionModulePOJOTablesParameter4218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionModulePOJOTablesParameter4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFunctionModulePOJOTablesParameter4263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter4280 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJOTablesParameter4295 = new BitSet(new long[]{0x0000000020400020L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJOTablesParameter4314 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4369 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModulePOJOTablesParameter4400 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4431 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter4448 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJOTablesParameter4466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter4483 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOTablesParameter4500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDataType4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDataType4563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleDataType4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleDataType4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDataType4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDataType4623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDataType4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleDataType4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDataType4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDataType4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDataType4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleDataType4713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDataType4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleDataType4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDataType4758 = new BitSet(new long[]{0x0000000000000002L});

}