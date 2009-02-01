// $ANTLR 3.0 ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g 2009-02-01 17:11:01

package net.sf.rcer.rfcgen.parser;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManagerNeu;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'package'", "'structure'", "'class'", "'{'", "'}'", "'field'", "'='", "'comment'", "';'", "'function'", "'module'", "'request'", "'response'", "'import'", "'inactive'", "'table'", "'export'", "'change'"
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
    public String getGrammarFileName() { return "..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g"; }



    	private Token getLastToken() {
    		return input.LT(-1);
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
        private ParseTreeManagerNeu ptm = new ParseTreeManagerNeu();
    	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
    	
    	{
    		
    	}

    	public ParseTreeManagerNeu getResult() {
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
    		// This doesn't work. ANTLR may simply report an superfluous token. In that case,
    		// two nodes will be finished instead of one.
    		// ptm.ruleFinished(null, end());
    	}

        private boolean skipCurrentToken;
        
    	@Override
    	protected boolean recoverFromMismatchedElement(IntStream arg0, RecognitionException arg1, BitSet arg2) {
    		skipCurrentToken = true;
    		return super.recoverFromMismatchedElement(arg0, arg1, arg2);
    	}



    // $ANTLR start parse
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:101:1: parse returns [Node r] : result= ruleGenSpec EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:102:3: (result= ruleGenSpec EOF )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:102:3: result= ruleGenSpec EOF
            {
            pushFollow(FOLLOW_ruleGenSpec_in_parse67);
            result=ruleGenSpec();
            _fsp--;
            if (failed) return r;
            if ( backtracking==0 ) {

              if (result != null)
                ptm.setModelElement(result);
              r = ptm.getCurrent();
              ptm.ruleFinished(result);
            }
            match(input,EOF,FOLLOW_EOF_in_parse78); if (failed) return r;

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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:112:1: ruleGenSpec returns [EObject result] : ( ( 'package' ) ( RULE_STRING ) (temp_Structure= ruleStructure )* (temp_FunctionModule= ruleFunctionModule )* ) ;
    public EObject ruleGenSpec() throws RecognitionException {
        EObject result = null;
        int ruleGenSpec_StartIndex = input.index();
        EObject temp_Structure = null;

        EObject temp_FunctionModule = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:115:4: ( ( ( 'package' ) ( RULE_STRING ) (temp_Structure= ruleStructure )* (temp_FunctionModule= ruleFunctionModule )* ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:115:4: ( ( 'package' ) ( RULE_STRING ) (temp_Structure= ruleStructure )* (temp_FunctionModule= ruleFunctionModule )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "GenSpec");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:118:1: ( ( 'package' ) ( RULE_STRING ) (temp_Structure= ruleStructure )* (temp_FunctionModule= ruleFunctionModule )* )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:118:2: ( 'package' ) ( RULE_STRING ) (temp_Structure= ruleStructure )* (temp_FunctionModule= ruleFunctionModule )*
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:118:2: ( 'package' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:118:3: 'package'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,10,FOLLOW_10_in_ruleGenSpec104); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:124:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:124:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGenSpec112); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"packageName",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:134:1: (temp_Structure= ruleStructure )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:134:2: temp_Structure= ruleStructure
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)));
            	    }
            	    pushFollow(FOLLOW_ruleStructure_in_ruleGenSpec123);
            	    temp_Structure=ruleStructure();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Structure != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_Structure);
            	        factory.add(result,"structures",convert(temp_Structure),false);
            	        ptm.ruleFinished(temp_Structure);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:146:1: (temp_FunctionModule= ruleFunctionModule )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:146:2: temp_FunctionModule= ruleFunctionModule
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(3)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModule_in_ruleGenSpec135);
            	    temp_FunctionModule=ruleFunctionModule();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_FunctionModule != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_FunctionModule);
            	        factory.add(result,"functionModules",convert(temp_FunctionModule),false);
            	        ptm.ruleFinished(temp_FunctionModule);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:165:1: ruleStructure returns [EObject result] : ( ( 'structure' ) ( RULE_STRING ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldMapping= ruleStructureFieldMapping )* ( '}' ) ) ;
    public EObject ruleStructure() throws RecognitionException {
        EObject result = null;
        int ruleStructure_StartIndex = input.index();
        EObject temp_StructureFieldMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:168:4: ( ( ( 'structure' ) ( RULE_STRING ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldMapping= ruleStructureFieldMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:168:4: ( ( 'structure' ) ( RULE_STRING ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldMapping= ruleStructureFieldMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Structure");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:171:1: ( ( 'structure' ) ( RULE_STRING ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldMapping= ruleStructureFieldMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:171:2: ( 'structure' ) ( RULE_STRING ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldMapping= ruleStructureFieldMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:171:2: ( 'structure' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:171:3: 'structure'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,11,FOLLOW_11_in_ruleStructure175); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:177:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:177:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructure183); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:187:1: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:187:2: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleStructure191); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:193:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:193:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructure199); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)));
                factory.set(result,"className",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:203:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:203:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleStructure207); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:209:1: (temp_StructureFieldMapping= ruleStructureFieldMapping )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:209:2: temp_StructureFieldMapping= ruleStructureFieldMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(5)));
            	    }
            	    pushFollow(FOLLOW_ruleStructureFieldMapping_in_ruleStructure217);
            	    temp_StructureFieldMapping=ruleStructureFieldMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_StructureFieldMapping != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_StructureFieldMapping);
            	        factory.add(result,"fields",convert(temp_StructureFieldMapping),false);
            	        ptm.ruleFinished(temp_StructureFieldMapping);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:221:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:221:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleStructure226); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(6)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:234:1: ruleStructureFieldMapping returns [EObject result] : ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleStructureFieldMapping() throws RecognitionException {
        EObject result = null;
        int ruleStructureFieldMapping_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:237:4: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:237:4: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "StructureFieldMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:240:1: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:240:2: ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:240:2: ( 'field' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:240:3: 'field'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,15,FOLLOW_15_in_ruleStructureFieldMapping264); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:246:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:246:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldMapping272); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:256:1: ( '=' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:256:2: '='
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleStructureFieldMapping280); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:262:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:262:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldMapping288); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)));
                factory.set(result,"type",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:272:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:272:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldMapping297); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(4)));
                factory.set(result,"attribute",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:282:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:282:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:282:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:282:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleStructureFieldMapping306); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(5)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:288:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:288:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldMapping314); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(5)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:299:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:299:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleStructureFieldMapping325); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(6)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:312:1: ruleFunctionModule returns [EObject result] : ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) ) ;
    public EObject ruleFunctionModule() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModule_StartIndex = input.index();
        EObject temp_FunctionModuleMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:315:4: ( ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:315:4: ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModule");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:318:1: ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:318:2: ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:318:2: ( 'function' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:318:3: 'function'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,19,FOLLOW_19_in_ruleFunctionModule363); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:324:1: ( 'module' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:324:2: 'module'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,20,FOLLOW_20_in_ruleFunctionModule370); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:330:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:330:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModule378); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:340:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:340:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModule386); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:346:1: (temp_FunctionModuleMapping= ruleFunctionModuleMapping )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:346:2: temp_FunctionModuleMapping= ruleFunctionModuleMapping
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)));
            }
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule396);
            temp_FunctionModuleMapping=ruleFunctionModuleMapping();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_FunctionModuleMapping != null) {
                hasContent = true;
                ptm.setModelElement(temp_FunctionModuleMapping);
                factory.set(result,"mapping",convert(temp_FunctionModuleMapping),false);
                ptm.ruleFinished(temp_FunctionModuleMapping);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:358:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:358:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModule404); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(5)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:371:1: ruleFunctionModuleMapping returns [EObject result] : (temp_functionmodulecallmapping= ruleFunctionModuleCallMapping | temp_functionmodulerequestresponsemapping= ruleFunctionModuleRequestResponseMapping );
    public EObject ruleFunctionModuleMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleMapping_StartIndex = input.index();
        EObject temp_functionmodulecallmapping = null;

        EObject temp_functionmodulerequestresponsemapping = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:373:9: (temp_functionmodulecallmapping= ruleFunctionModuleCallMapping | temp_functionmodulerequestresponsemapping= ruleFunctionModuleRequestResponseMapping )
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
                    new NoViableAltException("371:1: ruleFunctionModuleMapping returns [EObject result] : (temp_functionmodulecallmapping= ruleFunctionModuleCallMapping | temp_functionmodulerequestresponsemapping= ruleFunctionModuleRequestResponseMapping );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:373:9: temp_functionmodulecallmapping= ruleFunctionModuleCallMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleCallMapping_in_ruleFunctionModuleMapping439);
                    temp_functionmodulecallmapping=ruleFunctionModuleCallMapping();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulecallmapping;
                    }

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:373:121: temp_functionmodulerequestresponsemapping= ruleFunctionModuleRequestResponseMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleRequestResponseMapping_in_ruleFunctionModuleMapping454);
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:375:1: ruleFunctionModuleCallMapping returns [EObject result] : ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' ) ) ;
    public EObject ruleFunctionModuleCallMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleCallMapping_StartIndex = input.index();
        EObject temp_FunctionModuleParameterMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:378:4: ( ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:378:4: ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleCallMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:381:1: ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:381:2: ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:381:2: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:381:3: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModuleCallMapping482); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:387:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:387:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleCallMapping490); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"className",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:397:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:397:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModuleCallMapping498); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:403:1: (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23||(LA6_0>=25 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:403:2: temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModuleParameterMapping_in_ruleFunctionModuleCallMapping508);
            	    temp_FunctionModuleParameterMapping=ruleFunctionModuleParameterMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_FunctionModuleParameterMapping != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_FunctionModuleParameterMapping);
            	        factory.add(result,"parameters",convert(temp_FunctionModuleParameterMapping),false);
            	        ptm.ruleFinished(temp_FunctionModuleParameterMapping);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:415:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:415:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModuleCallMapping517); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(4)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:428:1: ruleFunctionModuleRequestResponseMapping returns [EObject result] : ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' ) ) ;
    public EObject ruleFunctionModuleRequestResponseMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleRequestResponseMapping_StartIndex = input.index();
        EObject temp_FunctionModuleParameterMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:431:4: ( ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:431:4: ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleRequestResponseMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:434:1: ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:434:2: ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:434:2: ( 'request' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:434:3: 'request'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,21,FOLLOW_21_in_ruleFunctionModuleRequestResponseMapping555); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:440:1: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:440:2: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModuleRequestResponseMapping562); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:446:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:446:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleRequestResponseMapping570); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"requestClassName",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:456:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:456:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModuleRequestResponseMapping578); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:462:1: (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23||(LA7_0>=25 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:462:2: temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(4)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModuleParameterMapping_in_ruleFunctionModuleRequestResponseMapping588);
            	    temp_FunctionModuleParameterMapping=ruleFunctionModuleParameterMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_FunctionModuleParameterMapping != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_FunctionModuleParameterMapping);
            	        factory.add(result,"requestParameters",convert(temp_FunctionModuleParameterMapping),false);
            	        ptm.ruleFinished(temp_FunctionModuleParameterMapping);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:474:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:474:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModuleRequestResponseMapping597); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:480:1: ( 'response' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:480:2: 'response'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,22,FOLLOW_22_in_ruleFunctionModuleRequestResponseMapping604); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(6)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:486:1: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:486:2: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModuleRequestResponseMapping611); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(7)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:492:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:492:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleRequestResponseMapping619); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(8)));
                factory.set(result,"responseClassName",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:502:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:502:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModuleRequestResponseMapping627); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(9)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:508:1: (temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23||(LA8_0>=25 && LA8_0<=27)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:508:2: temp_FunctionModuleParameterMapping= ruleFunctionModuleParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(10)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModuleParameterMapping_in_ruleFunctionModuleRequestResponseMapping637);
            	    temp_FunctionModuleParameterMapping=ruleFunctionModuleParameterMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_FunctionModuleParameterMapping != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_FunctionModuleParameterMapping);
            	        factory.add(result,"responseParameters",convert(temp_FunctionModuleParameterMapping),false);
            	        ptm.ruleFinished(temp_FunctionModuleParameterMapping);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:520:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:520:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModuleRequestResponseMapping646); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(11)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:533:1: ruleFunctionModuleParameterMapping returns [EObject result] : (temp_functionmoduleimportingparameter= ruleFunctionModuleImportingParameter | temp_functionmoduleexportingparameter= ruleFunctionModuleExportingParameter | temp_functionmodulechangingparameter= ruleFunctionModuleChangingParameter | temp_functionmoduletablesparameter= ruleFunctionModuleTablesParameter );
    public EObject ruleFunctionModuleParameterMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleParameterMapping_StartIndex = input.index();
        EObject temp_functionmoduleimportingparameter = null;

        EObject temp_functionmoduleexportingparameter = null;

        EObject temp_functionmodulechangingparameter = null;

        EObject temp_functionmoduletablesparameter = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:535:9: (temp_functionmoduleimportingparameter= ruleFunctionModuleImportingParameter | temp_functionmoduleexportingparameter= ruleFunctionModuleExportingParameter | temp_functionmodulechangingparameter= ruleFunctionModuleChangingParameter | temp_functionmoduletablesparameter= ruleFunctionModuleTablesParameter )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("533:1: ruleFunctionModuleParameterMapping returns [EObject result] : (temp_functionmoduleimportingparameter= ruleFunctionModuleImportingParameter | temp_functionmoduleexportingparameter= ruleFunctionModuleExportingParameter | temp_functionmodulechangingparameter= ruleFunctionModuleChangingParameter | temp_functionmoduletablesparameter= ruleFunctionModuleTablesParameter );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:535:9: temp_functionmoduleimportingparameter= ruleFunctionModuleImportingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleImportingParameter_in_ruleFunctionModuleParameterMapping681);
                    temp_functionmoduleimportingparameter=ruleFunctionModuleImportingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmoduleimportingparameter;
                    }

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:535:142: temp_functionmoduleexportingparameter= ruleFunctionModuleExportingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleExportingParameter_in_ruleFunctionModuleParameterMapping696);
                    temp_functionmoduleexportingparameter=ruleFunctionModuleExportingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmoduleexportingparameter;
                    }

                    }
                    break;
                case 3 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:535:275: temp_functionmodulechangingparameter= ruleFunctionModuleChangingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleChangingParameter_in_ruleFunctionModuleParameterMapping711);
                    temp_functionmodulechangingparameter=ruleFunctionModuleChangingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulechangingparameter;
                    }

                    }
                    break;
                case 4 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:535:405: temp_functionmoduletablesparameter= ruleFunctionModuleTablesParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleTablesParameter_in_ruleFunctionModuleParameterMapping726);
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:537:1: ruleFunctionModuleImportingParameter returns [EObject result] : ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModuleImportingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleImportingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:540:4: ( ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:540:4: ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleImportingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:543:1: ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:543:2: ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:543:2: ( 'import' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:543:3: 'import'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,23,FOLLOW_23_in_ruleFunctionModuleImportingParameter754); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:549:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )
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
            case 25:
                {
                alt13=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("549:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:549:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:549:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:549:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:549:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:549:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModuleImportingParameter763); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:555:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:555:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter771); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:565:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:565:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleImportingParameter779); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:571:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==24) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==RULE_ID) ) {
                        alt10=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("571:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:571:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:571:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:571:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModuleImportingParameter788); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:581:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:581:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:581:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:581:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:581:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter800); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:591:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:591:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter809); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:604:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:604:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:604:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:604:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:604:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModuleImportingParameter827); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"isStructure",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:614:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:614:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter836); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:624:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:624:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleImportingParameter844); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:630:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==RULE_ID) ) {
                        alt11=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("630:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:630:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:630:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:630:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModuleImportingParameter853); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:640:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:640:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:640:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:640:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:640:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter865); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:650:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:650:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter874); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:663:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:663:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:663:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:663:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:663:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,25,FOLLOW_25_in_ruleFunctionModuleImportingParameter892); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        factory.set(result,"isTable",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:673:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:673:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter901); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:683:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:683:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleImportingParameter909); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:689:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==24) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==RULE_ID) ) {
                        alt12=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("689:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:689:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:689:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:689:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModuleImportingParameter918); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:699:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:699:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:699:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:699:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:699:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter930); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:709:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:709:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter939); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:723:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:723:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:723:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:723:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModuleImportingParameter956); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:729:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:729:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter964); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:740:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:740:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModuleImportingParameter975); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:753:1: ruleFunctionModuleExportingParameter returns [EObject result] : ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModuleExportingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleExportingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:756:4: ( ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:756:4: ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleExportingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:759:1: ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:759:2: ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:759:2: ( 'export' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:759:3: 'export'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,26,FOLLOW_26_in_ruleFunctionModuleExportingParameter1013); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:765:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )
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
            case 25:
                {
                alt18=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("765:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:765:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:765:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:765:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:765:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:765:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModuleExportingParameter1022); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:771:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:771:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1030); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:781:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:781:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleExportingParameter1038); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:787:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==24) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==RULE_ID) ) {
                        alt15=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("787:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:787:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:787:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:787:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModuleExportingParameter1047); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:797:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:797:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:797:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:797:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:797:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1059); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:807:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:807:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1068); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:820:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:820:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:820:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:820:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:820:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModuleExportingParameter1086); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"isStructure",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:830:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:830:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1095); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:840:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:840:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleExportingParameter1103); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:846:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==24) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==RULE_ID) ) {
                        alt16=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("846:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:846:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:846:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:846:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModuleExportingParameter1112); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:856:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:856:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:856:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:856:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:856:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1124); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:866:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:866:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1133); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:879:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:879:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:879:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:879:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:879:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,25,FOLLOW_25_in_ruleFunctionModuleExportingParameter1151); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        factory.set(result,"isTable",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:889:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:889:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1160); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:899:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:899:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleExportingParameter1168); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:905:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==24) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==RULE_ID) ) {
                        alt17=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("905:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:905:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:905:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:905:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModuleExportingParameter1177); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:915:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:915:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:915:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:915:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:915:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1189); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:925:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:925:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1198); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:939:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:939:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:939:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:939:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModuleExportingParameter1215); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:945:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:945:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1223); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:956:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:956:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModuleExportingParameter1234); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:969:1: ruleFunctionModuleChangingParameter returns [EObject result] : ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModuleChangingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleChangingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:972:4: ( ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:972:4: ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleChangingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:975:1: ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:975:2: ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:975:2: ( 'change' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:975:3: 'change'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,27,FOLLOW_27_in_ruleFunctionModuleChangingParameter1272); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:981:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )
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
            case 25:
                {
                alt23=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("981:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:981:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:981:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:981:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:981:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:981:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModuleChangingParameter1281); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:987:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:987:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1289); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:997:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:997:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleChangingParameter1297); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1003:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==24) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==RULE_ID) ) {
                        alt20=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("1003:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1003:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1003:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1003:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModuleChangingParameter1306); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1013:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1013:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1013:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1013:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1013:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1318); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1023:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1023:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1327); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1036:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1036:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1036:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1036:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1036:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModuleChangingParameter1345); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"isStructure",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1046:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1046:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1354); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1056:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1056:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleChangingParameter1362); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1062:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==24) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==RULE_ID) ) {
                        alt21=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("1062:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1062:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1062:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1062:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModuleChangingParameter1371); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1072:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1072:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1072:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1072:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1072:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1383); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1082:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1082:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1392); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1095:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1095:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1095:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1095:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1095:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,25,FOLLOW_25_in_ruleFunctionModuleChangingParameter1410); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        factory.set(result,"isTable",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1105:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1105:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1419); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1115:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1115:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleChangingParameter1427); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1121:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==24) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==RULE_ID) ) {
                        alt22=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("1121:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1121:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1121:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1121:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModuleChangingParameter1436); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1131:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1131:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1131:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1131:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1131:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1448); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1141:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1141:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1457); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1155:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1155:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1155:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1155:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModuleChangingParameter1474); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1161:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1161:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1482); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1172:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1172:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModuleChangingParameter1493); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1185:1: ruleFunctionModuleTablesParameter returns [EObject result] : ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModuleTablesParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleTablesParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1188:4: ( ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1188:4: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleTablesParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1191:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1191:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1191:2: ( 'table' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1191:3: 'table'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,25,FOLLOW_25_in_ruleFunctionModuleTablesParameter1531); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1197:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1197:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleTablesParameter1539); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1207:1: ( '=' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1207:2: '='
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleFunctionModuleTablesParameter1547); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1213:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("1213:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1213:2: ( 'inactive' )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1213:2: ( 'inactive' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1213:3: 'inactive'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,24,FOLLOW_24_in_ruleFunctionModuleTablesParameter1556); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                        factory.set(result,"isInactive",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1223:1: ( ( RULE_ID ) ( RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1223:1: ( ( RULE_ID ) ( RULE_ID ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1223:2: ( RULE_ID ) ( RULE_ID )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1223:2: ( RULE_ID )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1223:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleTablesParameter1568); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"type",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1233:1: ( RULE_ID )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1233:2: RULE_ID
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleTablesParameter1577); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"attribute",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1245:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1245:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1245:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1245:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModuleTablesParameter1590); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(4)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1251:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1251:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleTablesParameter1598); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(4)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1262:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1262:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModuleTablesParameter1609); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(5)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
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
    public static final BitSet FOLLOW_EOF_in_parse78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleGenSpec104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenSpec112 = new BitSet(new long[]{0x0000000000080802L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleGenSpec123 = new BitSet(new long[]{0x0000000000080802L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_ruleGenSpec135 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11_in_ruleStructure175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructure183 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStructure191 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructure199 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructure207 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleStructureFieldMapping_in_ruleStructure217 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleStructure226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStructureFieldMapping264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldMapping272 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStructureFieldMapping280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldMapping288 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldMapping297 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleStructureFieldMapping306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldMapping314 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructureFieldMapping325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModule363 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModule370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModule378 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModule386 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule396 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModule404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleCallMapping_in_ruleFunctionModuleMapping439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleRequestResponseMapping_in_ruleFunctionModuleMapping454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModuleCallMapping482 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleCallMapping490 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModuleCallMapping498 = new BitSet(new long[]{0x000000000E804000L});
    public static final BitSet FOLLOW_ruleFunctionModuleParameterMapping_in_ruleFunctionModuleCallMapping508 = new BitSet(new long[]{0x000000000E804000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModuleCallMapping517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModuleRequestResponseMapping555 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModuleRequestResponseMapping562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleRequestResponseMapping570 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModuleRequestResponseMapping578 = new BitSet(new long[]{0x000000000E804000L});
    public static final BitSet FOLLOW_ruleFunctionModuleParameterMapping_in_ruleFunctionModuleRequestResponseMapping588 = new BitSet(new long[]{0x000000000E804000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModuleRequestResponseMapping597 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModuleRequestResponseMapping604 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModuleRequestResponseMapping611 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleRequestResponseMapping619 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModuleRequestResponseMapping627 = new BitSet(new long[]{0x000000000E804000L});
    public static final BitSet FOLLOW_ruleFunctionModuleParameterMapping_in_ruleFunctionModuleRequestResponseMapping637 = new BitSet(new long[]{0x000000000E804000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModuleRequestResponseMapping646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleImportingParameter_in_ruleFunctionModuleParameterMapping681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleExportingParameter_in_ruleFunctionModuleParameterMapping696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleChangingParameter_in_ruleFunctionModuleParameterMapping711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleTablesParameter_in_ruleFunctionModuleParameterMapping726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModuleImportingParameter754 = new BitSet(new long[]{0x0000000002008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModuleImportingParameter763 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter771 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleImportingParameter779 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleImportingParameter788 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter809 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModuleImportingParameter827 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter836 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleImportingParameter844 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleImportingParameter853 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter874 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleImportingParameter892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter901 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleImportingParameter909 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleImportingParameter918 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter930 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleImportingParameter939 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModuleImportingParameter956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleImportingParameter964 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModuleImportingParameter975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModuleExportingParameter1013 = new BitSet(new long[]{0x0000000002008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModuleExportingParameter1022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1030 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleExportingParameter1038 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleExportingParameter1047 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1059 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1068 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModuleExportingParameter1086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1095 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleExportingParameter1103 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleExportingParameter1112 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1133 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleExportingParameter1151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1160 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleExportingParameter1168 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleExportingParameter1177 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1189 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleExportingParameter1198 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModuleExportingParameter1215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleExportingParameter1223 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModuleExportingParameter1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionModuleChangingParameter1272 = new BitSet(new long[]{0x0000000002008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModuleChangingParameter1281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1289 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleChangingParameter1297 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleChangingParameter1306 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1318 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1327 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModuleChangingParameter1345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1354 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleChangingParameter1362 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleChangingParameter1371 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1383 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1392 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleChangingParameter1410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1419 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleChangingParameter1427 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleChangingParameter1436 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleChangingParameter1457 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModuleChangingParameter1474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleChangingParameter1482 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModuleChangingParameter1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleTablesParameter1531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleTablesParameter1539 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleTablesParameter1547 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleTablesParameter1556 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleTablesParameter1568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleTablesParameter1577 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModuleTablesParameter1590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleTablesParameter1598 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModuleTablesParameter1609 = new BitSet(new long[]{0x0000000000000002L});

}