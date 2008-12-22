// $ANTLR 3.0 ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g 2008-12-22 20:52:19

package net.sf.rcer.rfcgen.parser;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import net.sf.rcer.rfcgen.MetaModelRegistration;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class rfcgenParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'package'", "'structure'", "'class'", "'{'", "'}'", "'field'", "'<->'", "'comment'", "';'", "'function'", "'module'", "'request'", "'response'", "'import'", "'<--'", "'inactive'", "'table'", "'export'", "'-->'", "'change'"
    };
    public static final int RULE_ML_COMMENT=8;
    public static final int RULE_ID=5;
    public static final int RULE_WS=7;
    public static final int EOF=-1;
    public static final int RULE_INT=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;

        public rfcgenParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[44+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g"; }



    	private Token getLastToken() {
    		return input.LT(-1);
    	}
    	private Token getNextToken() {
    		return input.LT(1);
    	}

    	private int line() {
    		Token t = getNextToken();
    		if (t==null)
    			return 1;
    		return t.getLine();
    	}

    	private int start() {
    		Token t = getNextToken();
    		if (t==null)
    			return 0;
    		if (t instanceof CommonToken) {
    			return ((CommonToken)t).getStartIndex();
    		}
    		return t.getTokenIndex();
    	}

    	private int end() {
    		Token t = getLastToken();
    		if (t==null)
    			return 1;
    		if (t instanceof CommonToken) {
    			return ((CommonToken)t).getStopIndex()+1;
    		}
    		return t.getTokenIndex();
    	}

    	protected Object convert(Object arg) {
    		if (arg instanceof org.antlr.runtime.Token) {
    			Token t = (Token) arg;
    			String s = t.getText();
    			if (t.getType() == rfcgenLexer.RULE_ID && s.startsWith("^")) {
    				return s.substring(1);
    			} else if (t.getType()==rfcgenLexer.RULE_STRING) {
    				return s.substring(1,s.length()-1);
    			} else if (t.getType()==rfcgenLexer.RULE_INT) {
    				return Integer.valueOf(s);
    			}
    			return s;
    		}
    		return arg;
    	}


    	private EcoreModelFactory factory = new EcoreModelFactory(MetaModelRegistration.getEPackage());
        private ParseTreeManager ptm = new ParseTreeManager();
    	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
    	
    	{
    		
    	}

    	public ParseTreeManager getResult() {
    		return ptm;
    	}

    	private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}

    	@Override
    		public void reportError(RecognitionException e) {
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(AntlrUtil.create(msg,e,tokenNames));
    			ptm.addError(msg, e);
    			ptm.ruleFinished(null, end());
    		}




    // $ANTLR start parse
    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:121:1: parse returns [Node r] : result= ruleGenSpec EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:122:3: (result= ruleGenSpec EOF )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:122:3: result= ruleGenSpec EOF
            {
            pushFollow(FOLLOW_ruleGenSpec_in_parse67);
            result=ruleGenSpec();
            _fsp--;
            if (failed) return r;
            match(input,EOF,FOLLOW_EOF_in_parse69); if (failed) return r;
            if ( backtracking==0 ) {
              ptm.ruleFinished(result,end());r = ptm.getCurrent();
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, parse_StartIndex); }
        }
        return r;
    }
    // $ANTLR end parse


    // $ANTLR start ruleGenSpec
    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:125:1: ruleGenSpec returns [EObject result] : ( ( 'package' ) (temp_packageName= RULE_STRING ) (temp_structures= ruleStructure )* (temp_functionModules= ruleFunctionModule )* ) ;
    public EObject ruleGenSpec() throws RecognitionException {
        EObject result = null;
        int ruleGenSpec_StartIndex = input.index();
        Token temp_packageName=null;
        EObject temp_structures = null;

        EObject temp_functionModules = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:126:4: ( ( ( 'package' ) (temp_packageName= RULE_STRING ) (temp_structures= ruleStructure )* (temp_functionModules= ruleFunctionModule )* ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:126:4: ( ( 'package' ) (temp_packageName= RULE_STRING ) (temp_structures= ruleStructure )* (temp_functionModules= ruleFunctionModule )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "GenSpec");
              				ptm.setModelElement(result);
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:130:1: ( ( 'package' ) (temp_packageName= RULE_STRING ) (temp_structures= ruleStructure )* (temp_functionModules= ruleFunctionModule )* )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:130:2: ( 'package' ) (temp_packageName= RULE_STRING ) (temp_structures= ruleStructure )* (temp_functionModules= ruleFunctionModule )*
            {
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:130:2: ( 'package' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:130:3: 'package'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,10,FOLLOW_10_in_ruleGenSpec91); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:132:1: (temp_packageName= RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:132:2: temp_packageName= RULE_STRING
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_packageName=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenSpec100); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"packageName",convert(temp_packageName),false); ptm.ruleFinished(temp_packageName,end()); 
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:135:1: (temp_structures= ruleStructure )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:135:2: temp_structures= ruleStructure
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleStructure_in_ruleGenSpec111);
            	    temp_structures=ruleStructure();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"structures",convert(temp_structures),false); ptm.ruleFinished(temp_structures,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:138:1: (temp_functionModules= ruleFunctionModule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:138:2: temp_functionModules= ruleFunctionModule
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(3)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModule_in_ruleGenSpec123);
            	    temp_functionModules=ruleFunctionModule();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"functionModules",convert(temp_functionModules),false); ptm.ruleFinished(temp_functionModules,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, ruleGenSpec_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleGenSpec


    // $ANTLR start ruleStructure
    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:143:1: ruleStructure returns [EObject result] : ( ( 'structure' ) (temp_name= RULE_STRING ) ( 'class' ) (temp_className= RULE_ID ) ( '{' ) (temp_fields= ruleStructureFieldMapping )* ( '}' ) ) ;
    public EObject ruleStructure() throws RecognitionException {
        EObject result = null;
        int ruleStructure_StartIndex = input.index();
        Token temp_name=null;
        Token temp_className=null;
        EObject temp_fields = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:144:4: ( ( ( 'structure' ) (temp_name= RULE_STRING ) ( 'class' ) (temp_className= RULE_ID ) ( '{' ) (temp_fields= ruleStructureFieldMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:144:4: ( ( 'structure' ) (temp_name= RULE_STRING ) ( 'class' ) (temp_className= RULE_ID ) ( '{' ) (temp_fields= ruleStructureFieldMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Structure");
              				ptm.setModelElement(result);
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:148:1: ( ( 'structure' ) (temp_name= RULE_STRING ) ( 'class' ) (temp_className= RULE_ID ) ( '{' ) (temp_fields= ruleStructureFieldMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:148:2: ( 'structure' ) (temp_name= RULE_STRING ) ( 'class' ) (temp_className= RULE_ID ) ( '{' ) (temp_fields= ruleStructureFieldMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:148:2: ( 'structure' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:148:3: 'structure'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,11,FOLLOW_11_in_ruleStructure151); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:150:1: (temp_name= RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:150:2: temp_name= RULE_STRING
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructure160); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:153:1: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:153:2: 'class'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleStructure169); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:155:1: (temp_className= RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:155:2: temp_className= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_className=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructure178); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"className",convert(temp_className),false); ptm.ruleFinished(temp_className,end()); 
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:158:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:158:2: '{'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleStructure187); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:160:1: (temp_fields= ruleStructureFieldMapping )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:160:2: temp_fields= ruleStructureFieldMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(5)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleStructureFieldMapping_in_ruleStructure196);
            	    temp_fields=ruleStructureFieldMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"fields",convert(temp_fields),false); ptm.ruleFinished(temp_fields,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:163:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:163:2: '}'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleStructure206); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, ruleStructure_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleStructure


    // $ANTLR start ruleStructureFieldMapping
    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:167:1: ruleStructureFieldMapping returns [EObject result] : ( ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleStructureFieldMapping() throws RecognitionException {
        EObject result = null;
        int ruleStructureFieldMapping_StartIndex = input.index();
        Token temp_name=null;
        Token temp_type=null;
        Token temp_attribute=null;
        Token temp_comment=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:168:4: ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:168:4: ( ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "StructureFieldMapping");
              				ptm.setModelElement(result);
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:172:1: ( ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:172:2: ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:172:2: ( 'field' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:172:3: 'field'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,15,FOLLOW_15_in_ruleStructureFieldMapping231); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:174:1: (temp_name= RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:174:2: temp_name= RULE_STRING
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldMapping240); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:177:1: ( '<->' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:177:2: '<->'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,16,FOLLOW_16_in_ruleStructureFieldMapping249); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:179:1: (temp_type= RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:179:2: temp_type= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            temp_type=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldMapping258); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:182:1: (temp_attribute= RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:182:2: temp_attribute= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            temp_attribute=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldMapping269); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); 
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:185:1: ( ( 'comment' ) (temp_comment= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:185:2: ( 'comment' ) (temp_comment= RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:185:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:185:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());
                    }
                    match(input,17,FOLLOW_17_in_ruleStructureFieldMapping279); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:187:1: (temp_comment= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:187:2: temp_comment= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(5)).eContents().get(1)),line(),start());
                    }
                    temp_comment=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldMapping288); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"comment",convert(temp_comment),false); ptm.ruleFinished(temp_comment,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:191:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:191:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleStructureFieldMapping300); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, ruleStructureFieldMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleStructureFieldMapping


    // $ANTLR start ruleFunctionModule
    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:195:1: ruleFunctionModule returns [EObject result] : ( ( 'function' ) ( 'module' ) (temp_name= RULE_STRING ) ( '{' ) (temp_mapping= ruleFunctionModuleMapping ) ( '}' ) ) ;
    public EObject ruleFunctionModule() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModule_StartIndex = input.index();
        Token temp_name=null;
        EObject temp_mapping = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:196:4: ( ( ( 'function' ) ( 'module' ) (temp_name= RULE_STRING ) ( '{' ) (temp_mapping= ruleFunctionModuleMapping ) ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:196:4: ( ( 'function' ) ( 'module' ) (temp_name= RULE_STRING ) ( '{' ) (temp_mapping= ruleFunctionModuleMapping ) ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModule");
              				ptm.setModelElement(result);
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:200:1: ( ( 'function' ) ( 'module' ) (temp_name= RULE_STRING ) ( '{' ) (temp_mapping= ruleFunctionModuleMapping ) ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:200:2: ( 'function' ) ( 'module' ) (temp_name= RULE_STRING ) ( '{' ) (temp_mapping= ruleFunctionModuleMapping ) ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:200:2: ( 'function' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:200:3: 'function'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,19,FOLLOW_19_in_ruleFunctionModule325); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:202:1: ( 'module' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:202:2: 'module'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,20,FOLLOW_20_in_ruleFunctionModule332); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:204:1: (temp_name= RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:204:2: temp_name= RULE_STRING
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModule341); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:207:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:207:2: '{'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModule350); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:209:1: (temp_mapping= ruleFunctionModuleMapping )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:209:2: temp_mapping= ruleFunctionModuleMapping
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule359);
            temp_mapping=ruleFunctionModuleMapping();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"mapping",convert(temp_mapping),false); ptm.ruleFinished(temp_mapping,end()); 
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:212:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:212:2: '}'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModule368); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, ruleFunctionModule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModule


    // $ANTLR start ruleFunctionModuleMapping
    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:216:1: ruleFunctionModuleMapping returns [EObject result] : (temp_functionmodulecallmapping= ruleFunctionModuleCallMapping | temp_functionmodulerequestresponsemapping= ruleFunctionModuleRequestResponseMapping );
    public EObject ruleFunctionModuleMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleMapping_StartIndex = input.index();
        EObject temp_functionmodulecallmapping = null;

        EObject temp_functionmodulerequestresponsemapping = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:217:9: (temp_functionmodulecallmapping= ruleFunctionModuleCallMapping | temp_functionmodulerequestresponsemapping= ruleFunctionModuleRequestResponseMapping )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("216:1: ruleFunctionModuleMapping returns [EObject result] : (temp_functionmodulecallmapping= ruleFunctionModuleCallMapping | temp_functionmodulerequestresponsemapping= ruleFunctionModuleRequestResponseMapping );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:217:9: temp_functionmodulecallmapping= ruleFunctionModuleCallMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleCallMapping_in_ruleFunctionModuleMapping395);
                    temp_functionmodulecallmapping=ruleFunctionModuleCallMapping();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulecallmapping;
                    }

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:217:121: temp_functionmodulerequestresponsemapping= ruleFunctionModuleRequestResponseMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleRequestResponseMapping_in_ruleFunctionModuleMapping410);
                    temp_functionmodulerequestresponsemapping=ruleFunctionModuleRequestResponseMapping();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulerequestresponsemapping;
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
            if ( backtracking>0 ) { memoize(input, 6, ruleFunctionModuleMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleMapping


    // $ANTLR start ruleFunctionModuleCallMapping
    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:219:1: ruleFunctionModuleCallMapping returns [EObject result] : ( ( 'class' ) (temp_className= RULE_ID ) ( '{' ) (temp_parameters= ruleFunctionModuleParameterMapping )* ( '}' ) ) ;
    public EObject ruleFunctionModuleCallMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleCallMapping_StartIndex = input.index();
        Token temp_className=null;
        EObject temp_parameters = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:220:4: ( ( ( 'class' ) (temp_className= RULE_ID ) ( '{' ) (temp_parameters= ruleFunctionModuleParameterMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:220:4: ( ( 'class' ) (temp_className= RULE_ID ) ( '{' ) (temp_parameters= ruleFunctionModuleParameterMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleCallMapping");
              				ptm.setModelElement(result);
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:224:1: ( ( 'class' ) (temp_className= RULE_ID ) ( '{' ) (temp_parameters= ruleFunctionModuleParameterMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:224:2: ( 'class' ) (temp_className= RULE_ID ) ( '{' ) (temp_parameters= ruleFunctionModuleParameterMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:224:2: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:224:3: 'class'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModuleCallMapping433); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:226:1: (temp_className= RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:226:2: temp_className= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_className=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleCallMapping442); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"className",convert(temp_className),false); ptm.ruleFinished(temp_className,end()); 
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:229:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:229:2: '{'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModuleCallMapping451); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:231:1: (temp_parameters= ruleFunctionModuleParameterMapping )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23||(LA6_0>=26 && LA6_0<=27)||LA6_0==29) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:231:2: temp_parameters= ruleFunctionModuleParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModuleParameterMapping_in_ruleFunctionModuleCallMapping460);
            	    temp_parameters=ruleFunctionModuleParameterMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"parameters",convert(temp_parameters),false); ptm.ruleFinished(temp_parameters,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:234:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:234:2: '}'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(4)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModuleCallMapping470); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, ruleFunctionModuleCallMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleCallMapping


    // $ANTLR start ruleFunctionModuleRequestResponseMapping
    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:238:1: ruleFunctionModuleRequestResponseMapping returns [EObject result] : ( ( 'request' ) ( 'class' ) (temp_requestClassName= RULE_ID ) ( '{' ) (temp_requestParameters= ruleFunctionModuleParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) (temp_responseClassName= RULE_ID ) ( '{' ) (temp_responseParameters= ruleFunctionModuleParameterMapping )* ( '}' ) ) ;
    public EObject ruleFunctionModuleRequestResponseMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleRequestResponseMapping_StartIndex = input.index();
        Token temp_requestClassName=null;
        Token temp_responseClassName=null;
        EObject temp_requestParameters = null;

        EObject temp_responseParameters = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:239:4: ( ( ( 'request' ) ( 'class' ) (temp_requestClassName= RULE_ID ) ( '{' ) (temp_requestParameters= ruleFunctionModuleParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) (temp_responseClassName= RULE_ID ) ( '{' ) (temp_responseParameters= ruleFunctionModuleParameterMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:239:4: ( ( 'request' ) ( 'class' ) (temp_requestClassName= RULE_ID ) ( '{' ) (temp_requestParameters= ruleFunctionModuleParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) (temp_responseClassName= RULE_ID ) ( '{' ) (temp_responseParameters= ruleFunctionModuleParameterMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleRequestResponseMapping");
              				ptm.setModelElement(result);
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:243:1: ( ( 'request' ) ( 'class' ) (temp_requestClassName= RULE_ID ) ( '{' ) (temp_requestParameters= ruleFunctionModuleParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) (temp_responseClassName= RULE_ID ) ( '{' ) (temp_responseParameters= ruleFunctionModuleParameterMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:243:2: ( 'request' ) ( 'class' ) (temp_requestClassName= RULE_ID ) ( '{' ) (temp_requestParameters= ruleFunctionModuleParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) (temp_responseClassName= RULE_ID ) ( '{' ) (temp_responseParameters= ruleFunctionModuleParameterMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:243:2: ( 'request' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:243:3: 'request'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,21,FOLLOW_21_in_ruleFunctionModuleRequestResponseMapping495); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:245:1: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:245:2: 'class'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModuleRequestResponseMapping502); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:247:1: (temp_requestClassName= RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:247:2: temp_requestClassName= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            temp_requestClassName=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleRequestResponseMapping511); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"requestClassName",convert(temp_requestClassName),false); ptm.ruleFinished(temp_requestClassName,end()); 
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:250:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:250:2: '{'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModuleRequestResponseMapping520); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:252:1: (temp_requestParameters= ruleFunctionModuleParameterMapping )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23||(LA7_0>=26 && LA7_0<=27)||LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:252:2: temp_requestParameters= ruleFunctionModuleParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(4)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModuleParameterMapping_in_ruleFunctionModuleRequestResponseMapping529);
            	    temp_requestParameters=ruleFunctionModuleParameterMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"requestParameters",convert(temp_requestParameters),false); ptm.ruleFinished(temp_requestParameters,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:255:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:255:2: '}'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModuleRequestResponseMapping539); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:257:1: ( 'response' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:257:2: 'response'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(6)),line(),start());
            }
            match(input,22,FOLLOW_22_in_ruleFunctionModuleRequestResponseMapping546); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:259:1: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:259:2: 'class'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(7)),line(),start());
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModuleRequestResponseMapping553); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:261:1: (temp_responseClassName= RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:261:2: temp_responseClassName= RULE_ID
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(8)),line(),start());
            }
            temp_responseClassName=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleRequestResponseMapping562); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"responseClassName",convert(temp_responseClassName),false); ptm.ruleFinished(temp_responseClassName,end()); 
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:264:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:264:2: '{'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(9)),line(),start());
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModuleRequestResponseMapping571); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:266:1: (temp_responseParameters= ruleFunctionModuleParameterMapping )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23||(LA8_0>=26 && LA8_0<=27)||LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:266:2: temp_responseParameters= ruleFunctionModuleParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(10)),line(),start());
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModuleParameterMapping_in_ruleFunctionModuleRequestResponseMapping580);
            	    temp_responseParameters=ruleFunctionModuleParameterMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      factory.add(result,"responseParameters",convert(temp_responseParameters),false); ptm.ruleFinished(temp_responseParameters,end()); 
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:269:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:269:2: '}'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(11)),line(),start());
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModuleRequestResponseMapping590); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, ruleFunctionModuleRequestResponseMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleRequestResponseMapping


    // $ANTLR start ruleFunctionModuleParameterMapping
    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:273:1: ruleFunctionModuleParameterMapping returns [EObject result] : (temp_functionmoduleimportingparameter= ruleFunctionModuleImportingParameter | temp_functionmoduleexportingparameter= ruleFunctionModuleExportingParameter | temp_functionmodulechangingparameter= ruleFunctionModuleChangingParameter | temp_functionmoduletablesparameter= ruleFunctionModuleTablesParameter );
    public EObject ruleFunctionModuleParameterMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleParameterMapping_StartIndex = input.index();
        EObject temp_functionmoduleimportingparameter = null;

        EObject temp_functionmoduleexportingparameter = null;

        EObject temp_functionmodulechangingparameter = null;

        EObject temp_functionmoduletablesparameter = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:274:9: (temp_functionmoduleimportingparameter= ruleFunctionModuleImportingParameter | temp_functionmoduleexportingparameter= ruleFunctionModuleExportingParameter | temp_functionmodulechangingparameter= ruleFunctionModuleChangingParameter | temp_functionmoduletablesparameter= ruleFunctionModuleTablesParameter )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 27:
                {
                alt9=2;
                }
                break;
            case 29:
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
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("273:1: ruleFunctionModuleParameterMapping returns [EObject result] : (temp_functionmoduleimportingparameter= ruleFunctionModuleImportingParameter | temp_functionmoduleexportingparameter= ruleFunctionModuleExportingParameter | temp_functionmodulechangingparameter= ruleFunctionModuleChangingParameter | temp_functionmoduletablesparameter= ruleFunctionModuleTablesParameter );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:274:9: temp_functionmoduleimportingparameter= ruleFunctionModuleImportingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleImportingParameter_in_ruleFunctionModuleParameterMapping617);
                    temp_functionmoduleimportingparameter=ruleFunctionModuleImportingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmoduleimportingparameter;
                    }

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:274:142: temp_functionmoduleexportingparameter= ruleFunctionModuleExportingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleExportingParameter_in_ruleFunctionModuleParameterMapping632);
                    temp_functionmoduleexportingparameter=ruleFunctionModuleExportingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmoduleexportingparameter;
                    }

                    }
                    break;
                case 3 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:274:275: temp_functionmodulechangingparameter= ruleFunctionModuleChangingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleChangingParameter_in_ruleFunctionModuleParameterMapping647);
                    temp_functionmodulechangingparameter=ruleFunctionModuleChangingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulechangingparameter;
                    }

                    }
                    break;
                case 4 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:274:405: temp_functionmoduletablesparameter= ruleFunctionModuleTablesParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleTablesParameter_in_ruleFunctionModuleParameterMapping662);
                    temp_functionmoduletablesparameter=ruleFunctionModuleTablesParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmoduletablesparameter;
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
            if ( backtracking>0 ) { memoize(input, 9, ruleFunctionModuleParameterMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleParameterMapping


    // $ANTLR start ruleFunctionModuleImportingParameter
    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:276:1: ruleFunctionModuleImportingParameter returns [EObject result] : ( ( 'import' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModuleImportingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleImportingParameter_StartIndex = input.index();
        Token temp_name=null;
        Token temp_isInactive=null;
        Token temp_type=null;
        Token temp_attribute=null;
        Token temp_isStructure=null;
        Token temp_isTable=null;
        Token temp_comment=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:277:4: ( ( ( 'import' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:277:4: ( ( 'import' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleImportingParameter");
              				ptm.setModelElement(result);
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:281:1: ( ( 'import' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:281:2: ( 'import' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:281:2: ( 'import' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:281:3: 'import'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,23,FOLLOW_23_in_ruleFunctionModuleImportingParameter685); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:283:1: ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt13=1;
                }
                break;
            case 11:
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
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("283:1: ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:283:2: ( ( 'field' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:283:2: ( ( 'field' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:283:3: ( 'field' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:283:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:283:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModuleImportingParameter694); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:285:1: (temp_name= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:285:2: temp_name= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)),line(),start());
                    }
                    temp_name=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter703); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:288:1: ( '<--' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:288:2: '<--'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)),line(),start());
                    }
                    match(input,24,FOLLOW_24_in_ruleFunctionModuleImportingParameter712); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:290:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==25) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_ID) ) {
                        alt10=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("290:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:290:2: (temp_isInactive= 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:290:2: (temp_isInactive= 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:290:3: temp_isInactive= 'inactive'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)),line(),start());
                            }
                            temp_isInactive=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleImportingParameter722); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:293:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:293:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:293:2: (temp_type= RULE_ID ) (temp_attribute= RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:293:2: (temp_type= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:293:3: temp_type= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_type=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter736); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:296:1: (temp_attribute= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:296:2: temp_attribute= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            temp_attribute=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter747); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); 
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
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:302:1: ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:302:1: ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:302:2: (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:302:2: (temp_isStructure= 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:302:3: temp_isStructure= 'structure'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_isStructure=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleFunctionModuleImportingParameter767); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"isStructure",true); ptm.ruleFinished(temp_isStructure,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:305:1: (temp_name= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:305:2: temp_name= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    temp_name=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter778); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:308:1: ( '<--' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:308:2: '<--'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
                    }
                    match(input,24,FOLLOW_24_in_ruleFunctionModuleImportingParameter787); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:310:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==25) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==RULE_ID) ) {
                        alt11=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("310:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:310:2: (temp_isInactive= 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:310:2: (temp_isInactive= 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:310:3: temp_isInactive= 'inactive'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                            }
                            temp_isInactive=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleImportingParameter797); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:313:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:313:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:313:2: (temp_type= RULE_ID ) (temp_attribute= RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:313:2: (temp_type= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:313:3: temp_type= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_type=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter811); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:316:1: (temp_attribute= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:316:2: temp_attribute= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            temp_attribute=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter822); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); 
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
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:322:1: ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:322:1: ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:322:2: (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<--' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:322:2: (temp_isTable= 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:322:3: temp_isTable= 'table'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());
                    }
                    temp_isTable=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleFunctionModuleImportingParameter842); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"isTable",true); ptm.ruleFinished(temp_isTable,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:325:1: (temp_name= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:325:2: temp_name= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());
                    }
                    temp_name=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter853); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:328:1: ( '<--' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:328:2: '<--'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)),line(),start());
                    }
                    match(input,24,FOLLOW_24_in_ruleFunctionModuleImportingParameter862); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:330:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==25) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==RULE_ID) ) {
                        alt12=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("330:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:330:2: (temp_isInactive= 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:330:2: (temp_isInactive= 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:330:3: temp_isInactive= 'inactive'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)),line(),start());
                            }
                            temp_isInactive=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleImportingParameter872); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:333:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:333:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:333:2: (temp_type= RULE_ID ) (temp_attribute= RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:333:2: (temp_type= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:333:3: temp_type= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_type=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter886); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:336:1: (temp_attribute= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:336:2: temp_attribute= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            temp_attribute=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter897); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); 
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

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:343:1: ( ( 'comment' ) (temp_comment= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:343:2: ( 'comment' ) (temp_comment= RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:343:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:343:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModuleImportingParameter915); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:345:1: (temp_comment= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:345:2: temp_comment= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());
                    }
                    temp_comment=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter924); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"comment",convert(temp_comment),false); ptm.ruleFinished(temp_comment,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:349:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:349:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModuleImportingParameter936); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 10, ruleFunctionModuleImportingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleImportingParameter


    // $ANTLR start ruleFunctionModuleExportingParameter
    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:353:1: ruleFunctionModuleExportingParameter returns [EObject result] : ( ( 'export' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModuleExportingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleExportingParameter_StartIndex = input.index();
        Token temp_name=null;
        Token temp_isInactive=null;
        Token temp_type=null;
        Token temp_attribute=null;
        Token temp_isStructure=null;
        Token temp_isTable=null;
        Token temp_comment=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:354:4: ( ( ( 'export' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:354:4: ( ( 'export' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleExportingParameter");
              				ptm.setModelElement(result);
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:358:1: ( ( 'export' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:358:2: ( 'export' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:358:2: ( 'export' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:358:3: 'export'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,27,FOLLOW_27_in_ruleFunctionModuleExportingParameter961); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:360:1: ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt18=1;
                }
                break;
            case 11:
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
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("360:1: ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:360:2: ( ( 'field' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:360:2: ( ( 'field' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:360:3: ( 'field' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:360:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:360:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModuleExportingParameter970); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:362:1: (temp_name= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:362:2: temp_name= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)),line(),start());
                    }
                    temp_name=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter979); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:365:1: ( '-->' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:365:2: '-->'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)),line(),start());
                    }
                    match(input,28,FOLLOW_28_in_ruleFunctionModuleExportingParameter988); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:367:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==25) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_ID) ) {
                        alt15=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("367:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:367:2: (temp_isInactive= 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:367:2: (temp_isInactive= 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:367:3: temp_isInactive= 'inactive'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)),line(),start());
                            }
                            temp_isInactive=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleExportingParameter998); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:370:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:370:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:370:2: (temp_type= RULE_ID ) (temp_attribute= RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:370:2: (temp_type= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:370:3: temp_type= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_type=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1012); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:373:1: (temp_attribute= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:373:2: temp_attribute= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            temp_attribute=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1023); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); 
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
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:379:1: ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:379:1: ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:379:2: (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:379:2: (temp_isStructure= 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:379:3: temp_isStructure= 'structure'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_isStructure=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleFunctionModuleExportingParameter1043); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"isStructure",true); ptm.ruleFinished(temp_isStructure,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:382:1: (temp_name= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:382:2: temp_name= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    temp_name=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1054); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:385:1: ( '-->' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:385:2: '-->'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
                    }
                    match(input,28,FOLLOW_28_in_ruleFunctionModuleExportingParameter1063); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:387:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==25) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==RULE_ID) ) {
                        alt16=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("387:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:387:2: (temp_isInactive= 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:387:2: (temp_isInactive= 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:387:3: temp_isInactive= 'inactive'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                            }
                            temp_isInactive=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleExportingParameter1073); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:390:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:390:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:390:2: (temp_type= RULE_ID ) (temp_attribute= RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:390:2: (temp_type= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:390:3: temp_type= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_type=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1087); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:393:1: (temp_attribute= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:393:2: temp_attribute= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            temp_attribute=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1098); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); 
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
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:399:1: ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:399:1: ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:399:2: (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '-->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:399:2: (temp_isTable= 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:399:3: temp_isTable= 'table'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());
                    }
                    temp_isTable=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleFunctionModuleExportingParameter1118); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"isTable",true); ptm.ruleFinished(temp_isTable,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:402:1: (temp_name= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:402:2: temp_name= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());
                    }
                    temp_name=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1129); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:405:1: ( '-->' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:405:2: '-->'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)),line(),start());
                    }
                    match(input,28,FOLLOW_28_in_ruleFunctionModuleExportingParameter1138); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:407:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==25) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==RULE_ID) ) {
                        alt17=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("407:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:407:2: (temp_isInactive= 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:407:2: (temp_isInactive= 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:407:3: temp_isInactive= 'inactive'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)),line(),start());
                            }
                            temp_isInactive=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleExportingParameter1148); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:410:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:410:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:410:2: (temp_type= RULE_ID ) (temp_attribute= RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:410:2: (temp_type= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:410:3: temp_type= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_type=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1162); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:413:1: (temp_attribute= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:413:2: temp_attribute= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            temp_attribute=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1173); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); 
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

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:420:1: ( ( 'comment' ) (temp_comment= RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:420:2: ( 'comment' ) (temp_comment= RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:420:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:420:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModuleExportingParameter1191); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:422:1: (temp_comment= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:422:2: temp_comment= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());
                    }
                    temp_comment=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1200); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"comment",convert(temp_comment),false); ptm.ruleFinished(temp_comment,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:426:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:426:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModuleExportingParameter1212); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 11, ruleFunctionModuleExportingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleExportingParameter


    // $ANTLR start ruleFunctionModuleChangingParameter
    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:430:1: ruleFunctionModuleChangingParameter returns [EObject result] : ( ( 'change' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModuleChangingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleChangingParameter_StartIndex = input.index();
        Token temp_name=null;
        Token temp_isInactive=null;
        Token temp_type=null;
        Token temp_attribute=null;
        Token temp_isStructure=null;
        Token temp_isTable=null;
        Token temp_comment=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:431:4: ( ( ( 'change' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:431:4: ( ( 'change' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleChangingParameter");
              				ptm.setModelElement(result);
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:435:1: ( ( 'change' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:435:2: ( 'change' ) ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:435:2: ( 'change' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:435:3: 'change'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,29,FOLLOW_29_in_ruleFunctionModuleChangingParameter1237); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:437:1: ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt23=1;
                }
                break;
            case 11:
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
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("437:1: ( ( ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) | ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:437:2: ( ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:437:2: ( ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:437:3: ( 'field' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:437:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:437:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModuleChangingParameter1246); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:439:1: (temp_name= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:439:2: temp_name= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)),line(),start());
                    }
                    temp_name=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1255); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:442:1: ( '<->' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:442:2: '<->'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)),line(),start());
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleChangingParameter1264); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:444:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==25) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==RULE_ID) ) {
                        alt20=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("444:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:444:2: (temp_isInactive= 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:444:2: (temp_isInactive= 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:444:3: temp_isInactive= 'inactive'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)),line(),start());
                            }
                            temp_isInactive=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleChangingParameter1274); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:447:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:447:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:447:2: (temp_type= RULE_ID ) (temp_attribute= RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:447:2: (temp_type= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:447:3: temp_type= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_type=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1288); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:450:1: (temp_attribute= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:450:2: temp_attribute= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            temp_attribute=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1299); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); 
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
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:456:1: ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:456:1: ( (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:456:2: (temp_isStructure= 'structure' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:456:2: (temp_isStructure= 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:456:3: temp_isStructure= 'structure'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_isStructure=(Token)input.LT(1);
                    match(input,11,FOLLOW_11_in_ruleFunctionModuleChangingParameter1319); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"isStructure",true); ptm.ruleFinished(temp_isStructure,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:459:1: (temp_name= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:459:2: temp_name= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    temp_name=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1330); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:462:1: ( '<->' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:462:2: '<->'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleChangingParameter1339); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:464:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==25) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==RULE_ID) ) {
                        alt21=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("464:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:464:2: (temp_isInactive= 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:464:2: (temp_isInactive= 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:464:3: temp_isInactive= 'inactive'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                            }
                            temp_isInactive=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleChangingParameter1349); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:467:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:467:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:467:2: (temp_type= RULE_ID ) (temp_attribute= RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:467:2: (temp_type= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:467:3: temp_type= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_type=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1363); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:470:1: (temp_attribute= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:470:2: temp_attribute= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            temp_attribute=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1374); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); 
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
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:476:1: ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:476:1: ( (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:476:2: (temp_isTable= 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:476:2: (temp_isTable= 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:476:3: temp_isTable= 'table'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());
                    }
                    temp_isTable=(Token)input.LT(1);
                    match(input,26,FOLLOW_26_in_ruleFunctionModuleChangingParameter1394); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"isTable",true); ptm.ruleFinished(temp_isTable,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:479:1: (temp_name= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:479:2: temp_name= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());
                    }
                    temp_name=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1405); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:482:1: ( '<->' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:482:2: '<->'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)),line(),start());
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleChangingParameter1414); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:484:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==25) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_ID) ) {
                        alt22=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("484:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:484:2: (temp_isInactive= 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:484:2: (temp_isInactive= 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:484:3: temp_isInactive= 'inactive'
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)),line(),start());
                            }
                            temp_isInactive=(Token)input.LT(1);
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleChangingParameter1424); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); 
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:487:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:487:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:487:2: (temp_type= RULE_ID ) (temp_attribute= RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:487:2: (temp_type= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:487:3: temp_type= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                            }
                            temp_type=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1438); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:490:1: (temp_attribute= RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:490:2: temp_attribute= RULE_ID
                            {
                            if ( backtracking==0 ) {
                              ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
                            }
                            temp_attribute=(Token)input.LT(1);
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1449); if (failed) return result;
                            if ( backtracking==0 ) {
                              factory.set(result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); 
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

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:497:1: ( ( 'comment' ) (temp_comment= RULE_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:497:2: ( 'comment' ) (temp_comment= RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:497:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:497:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModuleChangingParameter1467); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:499:1: (temp_comment= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:499:2: temp_comment= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());
                    }
                    temp_comment=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1476); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"comment",convert(temp_comment),false); ptm.ruleFinished(temp_comment,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:503:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:503:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(3)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModuleChangingParameter1488); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, ruleFunctionModuleChangingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleChangingParameter


    // $ANTLR start ruleFunctionModuleTablesParameter
    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:507:1: ruleFunctionModuleTablesParameter returns [EObject result] : ( ( 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModuleTablesParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleTablesParameter_StartIndex = input.index();
        Token temp_name=null;
        Token temp_isInactive=null;
        Token temp_type=null;
        Token temp_attribute=null;
        Token temp_comment=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:508:4: ( ( ( 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:508:4: ( ( 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleTablesParameter");
              				ptm.setModelElement(result);
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:512:1: ( ( 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:512:2: ( 'table' ) (temp_name= RULE_STRING ) ( '<->' ) ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) ) ( ( 'comment' ) (temp_comment= RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:512:2: ( 'table' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:512:3: 'table'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)),line(),start());
            }
            match(input,26,FOLLOW_26_in_ruleFunctionModuleTablesParameter1513); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:514:1: (temp_name= RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:514:2: temp_name= RULE_STRING
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)),line(),start());
            }
            temp_name=(Token)input.LT(1);
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleTablesParameter1522); if (failed) return result;
            if ( backtracking==0 ) {
              factory.set(result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); 
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:517:1: ( '<->' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:517:2: '<->'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)),line(),start());
            }
            match(input,16,FOLLOW_16_in_ruleFunctionModuleTablesParameter1531); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:519:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("519:1: ( (temp_isInactive= 'inactive' ) | ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) ) )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:519:2: (temp_isInactive= 'inactive' )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:519:2: (temp_isInactive= 'inactive' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:519:3: temp_isInactive= 'inactive'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());
                    }
                    temp_isInactive=(Token)input.LT(1);
                    match(input,25,FOLLOW_25_in_ruleFunctionModuleTablesParameter1541); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:522:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:522:1: ( (temp_type= RULE_ID ) (temp_attribute= RULE_ID ) )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:522:2: (temp_type= RULE_ID ) (temp_attribute= RULE_ID )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:522:2: (temp_type= RULE_ID )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:522:3: temp_type= RULE_ID
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());
                    }
                    temp_type=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleTablesParameter1555); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); 
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:525:1: (temp_attribute= RULE_ID )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:525:2: temp_attribute= RULE_ID
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());
                    }
                    temp_attribute=(Token)input.LT(1);
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleTablesParameter1566); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); 
                    }

                    }


                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:530:1: ( ( 'comment' ) (temp_comment= RULE_STRING ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:530:2: ( 'comment' ) (temp_comment= RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:530:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:530:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModuleTablesParameter1580); if (failed) return result;
                    if ( backtracking==0 ) {
                      ptm.ruleFinished(getLastToken(),end());
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:532:1: (temp_comment= RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:532:2: temp_comment= RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());
                    }
                    temp_comment=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleTablesParameter1589); if (failed) return result;
                    if ( backtracking==0 ) {
                      factory.set(result,"comment",convert(temp_comment),false); ptm.ruleFinished(temp_comment,end()); 
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:536:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g:536:2: ';'
            {
            if ( backtracking==0 ) {
              ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(5)),line(),start());
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModuleTablesParameter1601); if (failed) return result;
            if ( backtracking==0 ) {
              ptm.ruleFinished(getLastToken(),end());
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, ruleFunctionModuleTablesParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleTablesParameter


 

    public static final BitSet FOLLOW_ruleGenSpec_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleGenSpec91 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenSpec100 = new BitSet(new long[]{0x0000000000080802L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleGenSpec111 = new BitSet(new long[]{0x0000000000080802L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_ruleGenSpec123 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11_in_ruleStructure151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructure160 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStructure169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructure178 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructure187 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleStructureFieldMapping_in_ruleStructure196 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleStructure206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStructureFieldMapping231 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldMapping240 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStructureFieldMapping249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldMapping258 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldMapping269 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleStructureFieldMapping279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldMapping288 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructureFieldMapping300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModule325 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModule332 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModule341 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModule350 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule359 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModule368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleCallMapping_in_ruleFunctionModuleMapping395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleRequestResponseMapping_in_ruleFunctionModuleMapping410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModuleCallMapping433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleCallMapping442 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModuleCallMapping451 = new BitSet(new long[]{0x000000002C804000L});
    public static final BitSet FOLLOW_ruleFunctionModuleParameterMapping_in_ruleFunctionModuleCallMapping460 = new BitSet(new long[]{0x000000002C804000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModuleCallMapping470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModuleRequestResponseMapping495 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModuleRequestResponseMapping502 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleRequestResponseMapping511 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModuleRequestResponseMapping520 = new BitSet(new long[]{0x000000002C804000L});
    public static final BitSet FOLLOW_ruleFunctionModuleParameterMapping_in_ruleFunctionModuleRequestResponseMapping529 = new BitSet(new long[]{0x000000002C804000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModuleRequestResponseMapping539 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModuleRequestResponseMapping546 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModuleRequestResponseMapping553 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleRequestResponseMapping562 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModuleRequestResponseMapping571 = new BitSet(new long[]{0x000000002C804000L});
    public static final BitSet FOLLOW_ruleFunctionModuleParameterMapping_in_ruleFunctionModuleRequestResponseMapping580 = new BitSet(new long[]{0x000000002C804000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModuleRequestResponseMapping590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleImportingParameter_in_ruleFunctionModuleParameterMapping617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleExportingParameter_in_ruleFunctionModuleParameterMapping632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleChangingParameter_in_ruleFunctionModuleParameterMapping647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleTablesParameter_in_ruleFunctionModuleParameterMapping662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModuleImportingParameter685 = new BitSet(new long[]{0x0000000004008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModuleImportingParameter694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter703 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleImportingParameter712 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleImportingParameter722 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter736 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter747 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModuleImportingParameter767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter778 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleImportingParameter787 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleImportingParameter797 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter822 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModuleImportingParameter842 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter853 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleImportingParameter862 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleImportingParameter872 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter886 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter897 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModuleImportingParameter915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter924 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModuleImportingParameter936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionModuleExportingParameter961 = new BitSet(new long[]{0x0000000004008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModuleExportingParameter970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter979 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionModuleExportingParameter988 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleExportingParameter998 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1012 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1023 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModuleExportingParameter1043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1054 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionModuleExportingParameter1063 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleExportingParameter1073 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1087 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1098 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModuleExportingParameter1118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1129 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionModuleExportingParameter1138 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleExportingParameter1148 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1173 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModuleExportingParameter1191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1200 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModuleExportingParameter1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFunctionModuleChangingParameter1237 = new BitSet(new long[]{0x0000000004008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModuleChangingParameter1246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1255 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleChangingParameter1264 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleChangingParameter1274 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1288 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1299 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModuleChangingParameter1319 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1330 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleChangingParameter1339 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleChangingParameter1349 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1363 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1374 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModuleChangingParameter1394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1405 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleChangingParameter1414 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleChangingParameter1424 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1438 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1449 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModuleChangingParameter1467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1476 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModuleChangingParameter1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModuleTablesParameter1513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleTablesParameter1522 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleTablesParameter1531 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleTablesParameter1541 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleTablesParameter1555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleTablesParameter1566 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModuleTablesParameter1580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleTablesParameter1589 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModuleTablesParameter1601 = new BitSet(new long[]{0x0000000000000002L});

}