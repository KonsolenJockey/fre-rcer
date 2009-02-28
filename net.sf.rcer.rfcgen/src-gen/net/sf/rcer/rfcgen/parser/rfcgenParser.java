// $ANTLR 3.0 ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g 2009-02-28 20:49:04

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
            ruleMemo = new HashMap[46+1];
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:165:1: ruleStructure returns [EObject result] : temp_structurepojomapping= ruleStructurePOJOMapping ;
    public EObject ruleStructure() throws RecognitionException {
        EObject result = null;
        int ruleStructure_StartIndex = input.index();
        EObject temp_structurepojomapping = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:167:9: (temp_structurepojomapping= ruleStructurePOJOMapping )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:167:9: temp_structurepojomapping= ruleStructurePOJOMapping
            {
            pushFollow(FOLLOW_ruleStructurePOJOMapping_in_ruleStructure172);
            temp_structurepojomapping=ruleStructurePOJOMapping();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              result =temp_structurepojomapping;
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


    // $ANTLR start ruleStructurePOJOMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:169:1: ruleStructurePOJOMapping returns [EObject result] : ( ( 'structure' ) ( RULE_STRING ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping )* ( '}' ) ) ;
    public EObject ruleStructurePOJOMapping() throws RecognitionException {
        EObject result = null;
        int ruleStructurePOJOMapping_StartIndex = input.index();
        EObject temp_StructureFieldPOJOMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:172:4: ( ( ( 'structure' ) ( RULE_STRING ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:172:4: ( ( 'structure' ) ( RULE_STRING ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "StructurePOJOMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:175:1: ( ( 'structure' ) ( RULE_STRING ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:175:2: ( 'structure' ) ( RULE_STRING ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:175:2: ( 'structure' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:175:3: 'structure'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,11,FOLLOW_11_in_ruleStructurePOJOMapping200); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:181:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:181:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructurePOJOMapping208); if (failed) return result;
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:191:1: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:191:2: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleStructurePOJOMapping216); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:197:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:197:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructurePOJOMapping224); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)));
                factory.set(result,"className",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:207:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:207:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleStructurePOJOMapping232); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(4)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:213:1: (temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:213:2: temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(5)));
            	    }
            	    pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping242);
            	    temp_StructureFieldPOJOMapping=ruleStructureFieldPOJOMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_StructureFieldPOJOMapping != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_StructureFieldPOJOMapping);
            	        factory.add(result,"fields",convert(temp_StructureFieldPOJOMapping),false);
            	        ptm.ruleFinished(temp_StructureFieldPOJOMapping);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:225:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:225:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleStructurePOJOMapping251); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 4, ruleStructurePOJOMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleStructurePOJOMapping


    // $ANTLR start ruleStructureFieldPOJOMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:238:1: ruleStructureFieldPOJOMapping returns [EObject result] : ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleStructureFieldPOJOMapping() throws RecognitionException {
        EObject result = null;
        int ruleStructureFieldPOJOMapping_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:241:4: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:241:4: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "StructureFieldPOJOMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:244:1: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:244:2: ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:244:2: ( 'field' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:244:3: 'field'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,15,FOLLOW_15_in_ruleStructureFieldPOJOMapping289); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:250:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:250:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping297); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:260:1: ( '=' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:260:2: '='
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleStructureFieldPOJOMapping305); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:266:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:266:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping313); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)));
                factory.set(result,"type",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:276:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:276:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping322); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)));
                factory.set(result,"attribute",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:286:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:286:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:286:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:286:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleStructureFieldPOJOMapping331); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(5)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:292:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:292:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping339); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(5)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:303:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:303:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleStructureFieldPOJOMapping350); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(6)));
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
            if ( backtracking>0 ) { memoize(input, 5, ruleStructureFieldPOJOMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleStructureFieldPOJOMapping


    // $ANTLR start ruleFunctionModule
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:316:1: ruleFunctionModule returns [EObject result] : ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) ) ;
    public EObject ruleFunctionModule() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModule_StartIndex = input.index();
        EObject temp_FunctionModuleMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:319:4: ( ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:319:4: ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModule");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:322:1: ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:322:2: ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:322:2: ( 'function' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:322:3: 'function'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,19,FOLLOW_19_in_ruleFunctionModule388); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:328:1: ( 'module' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:328:2: 'module'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,20,FOLLOW_20_in_ruleFunctionModule395); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:334:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:334:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModule403); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:344:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:344:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModule411); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:350:1: (temp_FunctionModuleMapping= ruleFunctionModuleMapping )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:350:2: temp_FunctionModuleMapping= ruleFunctionModuleMapping
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)));
            }
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule421);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:362:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:362:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModule429); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(5)));
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
            if ( backtracking>0 ) { memoize(input, 6, ruleFunctionModule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModule


    // $ANTLR start ruleFunctionModuleMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:375:1: ruleFunctionModuleMapping returns [EObject result] : temp_functionmodulepojomapping= ruleFunctionModulePOJOMapping ;
    public EObject ruleFunctionModuleMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleMapping_StartIndex = input.index();
        EObject temp_functionmodulepojomapping = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:377:9: (temp_functionmodulepojomapping= ruleFunctionModulePOJOMapping )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:377:9: temp_functionmodulepojomapping= ruleFunctionModulePOJOMapping
            {
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping464);
            temp_functionmodulepojomapping=ruleFunctionModulePOJOMapping();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              result =temp_functionmodulepojomapping;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, ruleFunctionModuleMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleMapping


    // $ANTLR start ruleFunctionModulePOJOMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:379:1: ruleFunctionModulePOJOMapping returns [EObject result] : (temp_functionmodulepojocallmapping= ruleFunctionModulePOJOCallMapping | temp_functionmodulepojorequestresponsemapping= ruleFunctionModulePOJORequestResponseMapping );
    public EObject ruleFunctionModulePOJOMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOMapping_StartIndex = input.index();
        EObject temp_functionmodulepojocallmapping = null;

        EObject temp_functionmodulepojorequestresponsemapping = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:381:9: (temp_functionmodulepojocallmapping= ruleFunctionModulePOJOCallMapping | temp_functionmodulepojorequestresponsemapping= ruleFunctionModulePOJORequestResponseMapping )
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
                    new NoViableAltException("379:1: ruleFunctionModulePOJOMapping returns [EObject result] : (temp_functionmodulepojocallmapping= ruleFunctionModulePOJOCallMapping | temp_functionmodulepojorequestresponsemapping= ruleFunctionModulePOJORequestResponseMapping );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:381:9: temp_functionmodulepojocallmapping= ruleFunctionModulePOJOCallMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping489);
                    temp_functionmodulepojocallmapping=ruleFunctionModulePOJOCallMapping();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojocallmapping;
                    }

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:381:133: temp_functionmodulepojorequestresponsemapping= ruleFunctionModulePOJORequestResponseMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping504);
                    temp_functionmodulepojorequestresponsemapping=ruleFunctionModulePOJORequestResponseMapping();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojorequestresponsemapping;
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
            if ( backtracking>0 ) { memoize(input, 8, ruleFunctionModulePOJOMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOMapping


    // $ANTLR start ruleFunctionModulePOJOCallMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:383:1: ruleFunctionModulePOJOCallMapping returns [EObject result] : ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ) ;
    public EObject ruleFunctionModulePOJOCallMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOCallMapping_StartIndex = input.index();
        EObject temp_FunctionModulePOJOParameterMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:386:4: ( ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:386:4: ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOCallMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:389:1: ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:389:2: ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:389:2: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:389:3: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModulePOJOCallMapping532); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:395:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:395:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping540); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"className",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:405:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:405:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJOCallMapping548); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:411:1: (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23||(LA6_0>=25 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:411:2: temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(3)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping558);
            	    temp_FunctionModulePOJOParameterMapping=ruleFunctionModulePOJOParameterMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_FunctionModulePOJOParameterMapping != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_FunctionModulePOJOParameterMapping);
            	        factory.add(result,"parameters",convert(temp_FunctionModulePOJOParameterMapping),false);
            	        ptm.ruleFinished(temp_FunctionModulePOJOParameterMapping);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:423:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:423:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJOCallMapping567); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(4)));
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
            if ( backtracking>0 ) { memoize(input, 9, ruleFunctionModulePOJOCallMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOCallMapping


    // $ANTLR start ruleFunctionModulePOJORequestResponseMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:436:1: ruleFunctionModulePOJORequestResponseMapping returns [EObject result] : ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ) ;
    public EObject ruleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJORequestResponseMapping_StartIndex = input.index();
        EObject temp_FunctionModulePOJOParameterMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:439:4: ( ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:439:4: ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJORequestResponseMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:442:1: ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:442:2: ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:442:2: ( 'request' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:442:3: 'request'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,21,FOLLOW_21_in_ruleFunctionModulePOJORequestResponseMapping605); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:448:1: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:448:2: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModulePOJORequestResponseMapping612); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:454:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:454:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping620); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"requestClassName",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:464:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:464:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping628); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:470:1: (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23||(LA7_0>=25 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:470:2: temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(4)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping638);
            	    temp_FunctionModulePOJOParameterMapping=ruleFunctionModulePOJOParameterMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_FunctionModulePOJOParameterMapping != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_FunctionModulePOJOParameterMapping);
            	        factory.add(result,"requestParameters",convert(temp_FunctionModulePOJOParameterMapping),false);
            	        ptm.ruleFinished(temp_FunctionModulePOJOParameterMapping);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:482:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:482:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping647); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(5)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:488:1: ( 'response' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:488:2: 'response'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,22,FOLLOW_22_in_ruleFunctionModulePOJORequestResponseMapping654); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(6)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:494:1: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:494:2: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModulePOJORequestResponseMapping661); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(7)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:500:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:500:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping669); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(8)));
                factory.set(result,"responseClassName",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:510:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:510:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping677); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(9)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:516:1: (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23||(LA8_0>=25 && LA8_0<=27)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:516:2: temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(10)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping687);
            	    temp_FunctionModulePOJOParameterMapping=ruleFunctionModulePOJOParameterMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_FunctionModulePOJOParameterMapping != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_FunctionModulePOJOParameterMapping);
            	        factory.add(result,"responseParameters",convert(temp_FunctionModulePOJOParameterMapping),false);
            	        ptm.ruleFinished(temp_FunctionModulePOJOParameterMapping);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:528:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:528:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping696); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(11)));
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
            if ( backtracking>0 ) { memoize(input, 10, ruleFunctionModulePOJORequestResponseMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJORequestResponseMapping


    // $ANTLR start ruleFunctionModulePOJOParameterMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:541:1: ruleFunctionModulePOJOParameterMapping returns [EObject result] : (temp_functionmodulepojoimportingparameter= ruleFunctionModulePOJOImportingParameter | temp_functionmodulepojoexportingparameter= ruleFunctionModulePOJOExportingParameter | temp_functionmodulepojochangingparameter= ruleFunctionModulePOJOChangingParameter | temp_functionmodulepojotablesparameter= ruleFunctionModulePOJOTablesParameter );
    public EObject ruleFunctionModulePOJOParameterMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOParameterMapping_StartIndex = input.index();
        EObject temp_functionmodulepojoimportingparameter = null;

        EObject temp_functionmodulepojoexportingparameter = null;

        EObject temp_functionmodulepojochangingparameter = null;

        EObject temp_functionmodulepojotablesparameter = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:543:9: (temp_functionmodulepojoimportingparameter= ruleFunctionModulePOJOImportingParameter | temp_functionmodulepojoexportingparameter= ruleFunctionModulePOJOExportingParameter | temp_functionmodulepojochangingparameter= ruleFunctionModulePOJOChangingParameter | temp_functionmodulepojotablesparameter= ruleFunctionModulePOJOTablesParameter )
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
                    new NoViableAltException("541:1: ruleFunctionModulePOJOParameterMapping returns [EObject result] : (temp_functionmodulepojoimportingparameter= ruleFunctionModulePOJOImportingParameter | temp_functionmodulepojoexportingparameter= ruleFunctionModulePOJOExportingParameter | temp_functionmodulepojochangingparameter= ruleFunctionModulePOJOChangingParameter | temp_functionmodulepojotablesparameter= ruleFunctionModulePOJOTablesParameter );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:543:9: temp_functionmodulepojoimportingparameter= ruleFunctionModulePOJOImportingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping731);
                    temp_functionmodulepojoimportingparameter=ruleFunctionModulePOJOImportingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojoimportingparameter;
                    }

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:543:154: temp_functionmodulepojoexportingparameter= ruleFunctionModulePOJOExportingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping746);
                    temp_functionmodulepojoexportingparameter=ruleFunctionModulePOJOExportingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojoexportingparameter;
                    }

                    }
                    break;
                case 3 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:543:299: temp_functionmodulepojochangingparameter= ruleFunctionModulePOJOChangingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping761);
                    temp_functionmodulepojochangingparameter=ruleFunctionModulePOJOChangingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojochangingparameter;
                    }

                    }
                    break;
                case 4 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:543:441: temp_functionmodulepojotablesparameter= ruleFunctionModulePOJOTablesParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping776);
                    temp_functionmodulepojotablesparameter=ruleFunctionModulePOJOTablesParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojotablesparameter;
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
            if ( backtracking>0 ) { memoize(input, 11, ruleFunctionModulePOJOParameterMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOParameterMapping


    // $ANTLR start ruleFunctionModulePOJOImportingParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:545:1: ruleFunctionModulePOJOImportingParameter returns [EObject result] : ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModulePOJOImportingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOImportingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:548:4: ( ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:548:4: ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOImportingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:551:1: ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:551:2: ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:551:2: ( 'import' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:551:3: 'import'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,23,FOLLOW_23_in_ruleFunctionModulePOJOImportingParameter804); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:557:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )
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
                    new NoViableAltException("557:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:557:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:557:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:557:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:557:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:557:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOImportingParameter813); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:563:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:563:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter821); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:573:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:573:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter829); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:579:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("579:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:579:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:579:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:579:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter838); if (failed) return result;
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
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:589:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:589:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:589:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:589:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:589:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter850); if (failed) return result;
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

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:599:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:599:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter859); if (failed) return result;
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:612:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:612:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:612:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:612:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:612:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModulePOJOImportingParameter877); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:622:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:622:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter886); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:632:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:632:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter894); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:638:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("638:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:638:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:638:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:638:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter903); if (failed) return result;
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
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:648:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:648:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:648:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:648:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:648:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter915); if (failed) return result;
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

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:658:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:658:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter924); if (failed) return result;
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:671:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:671:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:671:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:671:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:671:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter942); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:681:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:681:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter951); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:691:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:691:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter959); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:697:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("697:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:697:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:697:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:697:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter968); if (failed) return result;
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
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:707:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:707:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:707:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:707:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:707:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter980); if (failed) return result;
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

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:717:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:717:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter989); if (failed) return result;
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:731:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:731:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:731:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:731:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter1006); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:737:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:737:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1014); if (failed) return result;
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:748:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:748:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter1025); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 12, ruleFunctionModulePOJOImportingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOImportingParameter


    // $ANTLR start ruleFunctionModulePOJOExportingParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:761:1: ruleFunctionModulePOJOExportingParameter returns [EObject result] : ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModulePOJOExportingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOExportingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:764:4: ( ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:764:4: ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOExportingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:767:1: ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:767:2: ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:767:2: ( 'export' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:767:3: 'export'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOExportingParameter1063); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:773:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )
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
                    new NoViableAltException("773:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:773:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:773:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:773:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:773:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:773:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOExportingParameter1072); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:779:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:779:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1080); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:789:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:789:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1088); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:795:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("795:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:795:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:795:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:795:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOExportingParameter1097); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:805:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:805:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:805:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:805:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:805:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1109); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:815:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:815:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1118); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:828:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:828:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:828:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:828:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:828:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModulePOJOExportingParameter1136); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"isStructure",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:838:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:838:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1145); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:848:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:848:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1153); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:854:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("854:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:854:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:854:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:854:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOExportingParameter1162); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:864:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:864:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:864:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:864:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:864:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1174); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:874:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:874:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1183); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:887:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:887:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:887:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:887:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:887:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter1201); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        factory.set(result,"isTable",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:897:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:897:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1210); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:907:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:907:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1218); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:913:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("913:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:913:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:913:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:913:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOExportingParameter1227); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:923:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:923:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:923:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:923:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:923:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1239); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:933:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:933:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1248); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:947:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:947:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:947:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:947:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter1265); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:953:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:953:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1273); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:964:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:964:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter1284); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)));
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
            if ( backtracking>0 ) { memoize(input, 13, ruleFunctionModulePOJOExportingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOExportingParameter


    // $ANTLR start ruleFunctionModulePOJOChangingParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:977:1: ruleFunctionModulePOJOChangingParameter returns [EObject result] : ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModulePOJOChangingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOChangingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:980:4: ( ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:980:4: ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOChangingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:983:1: ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:983:2: ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:983:2: ( 'change' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:983:3: 'change'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,27,FOLLOW_27_in_ruleFunctionModulePOJOChangingParameter1322); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:989:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )
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
                    new NoViableAltException("989:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:989:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:989:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:989:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:989:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:989:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOChangingParameter1331); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:995:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:995:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1339); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1005:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1005:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1347); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1011:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("1011:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1011:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1011:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1011:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOChangingParameter1356); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1021:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1021:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1021:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1021:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1021:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1368); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1031:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1031:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1377); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1044:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1044:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1044:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1044:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1044:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModulePOJOChangingParameter1395); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"isStructure",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1054:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1054:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1404); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1064:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1064:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1412); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1070:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("1070:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1070:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1070:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1070:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOChangingParameter1421); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1080:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1080:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1080:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1080:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1080:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1433); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1090:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1090:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1442); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1103:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1103:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1103:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1103:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1103:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter1460); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        factory.set(result,"isTable",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1113:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1113:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1469); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1123:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1123:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1477); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1129:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("1129:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1129:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1129:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1129:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOChangingParameter1486); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1139:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1139:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1139:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1139:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1139:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1498); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1149:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1149:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1507); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1163:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1163:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1163:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1163:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter1524); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1169:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1169:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1532); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1180:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1180:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter1543); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)));
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
            if ( backtracking>0 ) { memoize(input, 14, ruleFunctionModulePOJOChangingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOChangingParameter


    // $ANTLR start ruleFunctionModulePOJOTablesParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1193:1: ruleFunctionModulePOJOTablesParameter returns [EObject result] : ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModulePOJOTablesParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOTablesParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1196:4: ( ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1196:4: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOTablesParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1199:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1199:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1199:2: ( 'table' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1199:3: 'table'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOTablesParameter1581); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1205:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1205:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter1589); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1215:1: ( '=' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1215:2: '='
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOTablesParameter1597); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1221:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                    new NoViableAltException("1221:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1221:2: ( 'inactive' )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1221:2: ( 'inactive' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1221:3: 'inactive'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOTablesParameter1606); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                        factory.set(result,"isInactive",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1231:1: ( ( RULE_ID ) ( RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1231:1: ( ( RULE_ID ) ( RULE_ID ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1231:2: ( RULE_ID ) ( RULE_ID )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1231:2: ( RULE_ID )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1231:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter1618); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"type",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1241:1: ( RULE_ID )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1241:2: RULE_ID
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter1627); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"attribute",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1253:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1253:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1253:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1253:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOTablesParameter1640); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(4)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1259:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1259:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter1648); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(4)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1270:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1270:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOTablesParameter1659); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(5)));
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
            if ( backtracking>0 ) { memoize(input, 15, ruleFunctionModulePOJOTablesParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOTablesParameter


 

    public static final BitSet FOLLOW_ruleGenSpec_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleGenSpec104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenSpec112 = new BitSet(new long[]{0x0000000000080802L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleGenSpec123 = new BitSet(new long[]{0x0000000000080802L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_ruleGenSpec135 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleStructurePOJOMapping_in_ruleStructure172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStructurePOJOMapping200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructurePOJOMapping208 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStructurePOJOMapping216 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructurePOJOMapping224 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructurePOJOMapping232 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping242 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleStructurePOJOMapping251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStructureFieldPOJOMapping289 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping297 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStructureFieldPOJOMapping305 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping313 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping322 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleStructureFieldPOJOMapping331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping339 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructureFieldPOJOMapping350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModule388 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModule395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModule403 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModule411 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule421 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModule429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJOCallMapping532 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping540 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJOCallMapping548 = new BitSet(new long[]{0x000000000E804000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping558 = new BitSet(new long[]{0x000000000E804000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJOCallMapping567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJORequestResponseMapping605 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJORequestResponseMapping612 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping620 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping628 = new BitSet(new long[]{0x000000000E804000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping638 = new BitSet(new long[]{0x000000000E804000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping647 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJORequestResponseMapping654 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJORequestResponseMapping661 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping669 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping677 = new BitSet(new long[]{0x000000000E804000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping687 = new BitSet(new long[]{0x000000000E804000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJOImportingParameter804 = new BitSet(new long[]{0x0000000002008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOImportingParameter813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter821 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter829 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter838 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter850 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter859 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModulePOJOImportingParameter877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter886 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter894 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter903 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter924 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter951 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter959 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter968 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter989 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter1006 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1014 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOExportingParameter1063 = new BitSet(new long[]{0x0000000002008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOExportingParameter1072 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1080 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1088 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOExportingParameter1097 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1118 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModulePOJOExportingParameter1136 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1145 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1153 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOExportingParameter1162 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1183 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter1201 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1210 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1218 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOExportingParameter1227 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1248 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter1265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1273 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionModulePOJOChangingParameter1322 = new BitSet(new long[]{0x0000000002008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOChangingParameter1331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1339 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1347 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOChangingParameter1356 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1377 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModulePOJOChangingParameter1395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1404 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1412 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOChangingParameter1421 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1442 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter1460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1469 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1477 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOChangingParameter1486 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1498 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1507 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter1524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1532 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOTablesParameter1581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter1589 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOTablesParameter1597 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOTablesParameter1606 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter1618 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter1627 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOTablesParameter1640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter1648 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOTablesParameter1659 = new BitSet(new long[]{0x0000000000000002L});

}