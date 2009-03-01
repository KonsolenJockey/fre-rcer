// $ANTLR 3.0 ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g 2009-03-01 11:13:58

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'package'", "'structure'", "'{'", "'}'", "'class'", "'field'", "'='", "'comment'", "';'", "'function'", "'module'", "'request'", "'response'", "'import'", "'inactive'", "'table'", "'export'", "'change'"
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
            ruleMemo = new HashMap[47+1];
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:165:1: ruleStructure returns [EObject result] : ( ( 'structure' ) ( RULE_STRING ) ( '{' ) (temp_StructureMapping= ruleStructureMapping ) ( '}' ) ) ;
    public EObject ruleStructure() throws RecognitionException {
        EObject result = null;
        int ruleStructure_StartIndex = input.index();
        EObject temp_StructureMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:168:4: ( ( ( 'structure' ) ( RULE_STRING ) ( '{' ) (temp_StructureMapping= ruleStructureMapping ) ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:168:4: ( ( 'structure' ) ( RULE_STRING ) ( '{' ) (temp_StructureMapping= ruleStructureMapping ) ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Structure");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:171:1: ( ( 'structure' ) ( RULE_STRING ) ( '{' ) (temp_StructureMapping= ruleStructureMapping ) ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:171:2: ( 'structure' ) ( RULE_STRING ) ( '{' ) (temp_StructureMapping= ruleStructureMapping ) ( '}' )
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:187:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:187:2: '{'
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:193:1: (temp_StructureMapping= ruleStructureMapping )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:193:2: temp_StructureMapping= ruleStructureMapping
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)));
            }
            pushFollow(FOLLOW_ruleStructureMapping_in_ruleStructure201);
            temp_StructureMapping=ruleStructureMapping();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_StructureMapping != null) {
                hasContent = true;
                ptm.setModelElement(temp_StructureMapping);
                factory.set(result,"mapping",convert(temp_StructureMapping),false);
                ptm.ruleFinished(temp_StructureMapping);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:205:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:205:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleStructure209); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)));
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


    // $ANTLR start ruleStructureMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:218:1: ruleStructureMapping returns [EObject result] : temp_structurepojomapping= ruleStructurePOJOMapping ;
    public EObject ruleStructureMapping() throws RecognitionException {
        EObject result = null;
        int ruleStructureMapping_StartIndex = input.index();
        EObject temp_structurepojomapping = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:220:9: (temp_structurepojomapping= ruleStructurePOJOMapping )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:220:9: temp_structurepojomapping= ruleStructurePOJOMapping
            {
            pushFollow(FOLLOW_ruleStructurePOJOMapping_in_ruleStructureMapping244);
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
            if ( backtracking>0 ) { memoize(input, 4, ruleStructureMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleStructureMapping


    // $ANTLR start ruleStructurePOJOMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:222:1: ruleStructurePOJOMapping returns [EObject result] : ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping )* ( '}' ) ) ;
    public EObject ruleStructurePOJOMapping() throws RecognitionException {
        EObject result = null;
        int ruleStructurePOJOMapping_StartIndex = input.index();
        EObject temp_StructureFieldPOJOMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:225:4: ( ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:225:4: ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "StructurePOJOMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:228:1: ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:228:2: ( 'class' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:228:2: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:228:3: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleStructurePOJOMapping272); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:234:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:234:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructurePOJOMapping280); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"className",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:244:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:244:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleStructurePOJOMapping288); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:250:1: (temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:250:2: temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)));
            	    }
            	    pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping298);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:262:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:262:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleStructurePOJOMapping307); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)));
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
            if ( backtracking>0 ) { memoize(input, 5, ruleStructurePOJOMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleStructurePOJOMapping


    // $ANTLR start ruleStructureFieldPOJOMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:275:1: ruleStructureFieldPOJOMapping returns [EObject result] : ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleStructureFieldPOJOMapping() throws RecognitionException {
        EObject result = null;
        int ruleStructureFieldPOJOMapping_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:278:4: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:278:4: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "StructureFieldPOJOMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:281:1: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:281:2: ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( RULE_ID ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:281:2: ( 'field' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:281:3: 'field'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,15,FOLLOW_15_in_ruleStructureFieldPOJOMapping345); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:287:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:287:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping353); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:297:1: ( '=' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:297:2: '='
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleStructureFieldPOJOMapping361); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:303:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:303:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping369); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(3)));
                factory.set(result,"type",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:313:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:313:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping378); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(4)));
                factory.set(result,"attribute",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:323:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:323:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:323:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:323:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleStructureFieldPOJOMapping387); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(5)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:329:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:329:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping395); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(5)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:340:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:340:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleStructureFieldPOJOMapping406); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(6)));
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
            if ( backtracking>0 ) { memoize(input, 6, ruleStructureFieldPOJOMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleStructureFieldPOJOMapping


    // $ANTLR start ruleFunctionModule
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:353:1: ruleFunctionModule returns [EObject result] : ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) ) ;
    public EObject ruleFunctionModule() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModule_StartIndex = input.index();
        EObject temp_FunctionModuleMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:356:4: ( ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:356:4: ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModule");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:359:1: ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:359:2: ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:359:2: ( 'function' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:359:3: 'function'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,19,FOLLOW_19_in_ruleFunctionModule444); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:365:1: ( 'module' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:365:2: 'module'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,20,FOLLOW_20_in_ruleFunctionModule451); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:371:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:371:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModule459); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:381:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:381:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModule467); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:387:1: (temp_FunctionModuleMapping= ruleFunctionModuleMapping )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:387:2: temp_FunctionModuleMapping= ruleFunctionModuleMapping
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(4)));
            }
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule477);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:399:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:399:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModule485); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(5)));
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
            if ( backtracking>0 ) { memoize(input, 7, ruleFunctionModule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModule


    // $ANTLR start ruleFunctionModuleMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:412:1: ruleFunctionModuleMapping returns [EObject result] : temp_functionmodulepojomapping= ruleFunctionModulePOJOMapping ;
    public EObject ruleFunctionModuleMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleMapping_StartIndex = input.index();
        EObject temp_functionmodulepojomapping = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:414:9: (temp_functionmodulepojomapping= ruleFunctionModulePOJOMapping )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:414:9: temp_functionmodulepojomapping= ruleFunctionModulePOJOMapping
            {
            pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping520);
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
            if ( backtracking>0 ) { memoize(input, 8, ruleFunctionModuleMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleMapping


    // $ANTLR start ruleFunctionModulePOJOMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:416:1: ruleFunctionModulePOJOMapping returns [EObject result] : (temp_functionmodulepojocallmapping= ruleFunctionModulePOJOCallMapping | temp_functionmodulepojorequestresponsemapping= ruleFunctionModulePOJORequestResponseMapping );
    public EObject ruleFunctionModulePOJOMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOMapping_StartIndex = input.index();
        EObject temp_functionmodulepojocallmapping = null;

        EObject temp_functionmodulepojorequestresponsemapping = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:418:9: (temp_functionmodulepojocallmapping= ruleFunctionModulePOJOCallMapping | temp_functionmodulepojorequestresponsemapping= ruleFunctionModulePOJORequestResponseMapping )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("416:1: ruleFunctionModulePOJOMapping returns [EObject result] : (temp_functionmodulepojocallmapping= ruleFunctionModulePOJOCallMapping | temp_functionmodulepojorequestresponsemapping= ruleFunctionModulePOJORequestResponseMapping );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:418:9: temp_functionmodulepojocallmapping= ruleFunctionModulePOJOCallMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping545);
                    temp_functionmodulepojocallmapping=ruleFunctionModulePOJOCallMapping();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojocallmapping;
                    }

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:418:133: temp_functionmodulepojorequestresponsemapping= ruleFunctionModulePOJORequestResponseMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping560);
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
            if ( backtracking>0 ) { memoize(input, 9, ruleFunctionModulePOJOMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOMapping


    // $ANTLR start ruleFunctionModulePOJOCallMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:420:1: ruleFunctionModulePOJOCallMapping returns [EObject result] : ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ) ;
    public EObject ruleFunctionModulePOJOCallMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOCallMapping_StartIndex = input.index();
        EObject temp_FunctionModulePOJOParameterMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:423:4: ( ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:423:4: ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOCallMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:426:1: ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:426:2: ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:426:2: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:426:3: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJOCallMapping588); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:432:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:432:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping596); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"className",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:442:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:442:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModulePOJOCallMapping604); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:448:1: (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23||(LA6_0>=25 && LA6_0<=27)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:448:2: temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping614);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:460:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:460:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJOCallMapping623); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(4)));
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
            if ( backtracking>0 ) { memoize(input, 10, ruleFunctionModulePOJOCallMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOCallMapping


    // $ANTLR start ruleFunctionModulePOJORequestResponseMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:473:1: ruleFunctionModulePOJORequestResponseMapping returns [EObject result] : ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ) ;
    public EObject ruleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJORequestResponseMapping_StartIndex = input.index();
        EObject temp_FunctionModulePOJOParameterMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:476:4: ( ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:476:4: ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJORequestResponseMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:479:1: ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:479:2: ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:479:2: ( 'request' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:479:3: 'request'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,21,FOLLOW_21_in_ruleFunctionModulePOJORequestResponseMapping661); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:485:1: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:485:2: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping668); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:491:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:491:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping676); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"requestClassName",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:501:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:501:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModulePOJORequestResponseMapping684); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:507:1: (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==23||(LA7_0>=25 && LA7_0<=27)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:507:2: temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(4)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping694);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:519:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:519:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping703); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(5)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:525:1: ( 'response' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:525:2: 'response'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,22,FOLLOW_22_in_ruleFunctionModulePOJORequestResponseMapping710); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(6)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:531:1: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:531:2: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping717); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(7)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:537:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:537:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping725); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(8)));
                factory.set(result,"responseClassName",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:547:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:547:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModulePOJORequestResponseMapping733); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(9)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:553:1: (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23||(LA8_0>=25 && LA8_0<=27)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:553:2: temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(10)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping743);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:565:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:565:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping752); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(11)));
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
            if ( backtracking>0 ) { memoize(input, 11, ruleFunctionModulePOJORequestResponseMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJORequestResponseMapping


    // $ANTLR start ruleFunctionModulePOJOParameterMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:578:1: ruleFunctionModulePOJOParameterMapping returns [EObject result] : (temp_functionmodulepojoimportingparameter= ruleFunctionModulePOJOImportingParameter | temp_functionmodulepojoexportingparameter= ruleFunctionModulePOJOExportingParameter | temp_functionmodulepojochangingparameter= ruleFunctionModulePOJOChangingParameter | temp_functionmodulepojotablesparameter= ruleFunctionModulePOJOTablesParameter );
    public EObject ruleFunctionModulePOJOParameterMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOParameterMapping_StartIndex = input.index();
        EObject temp_functionmodulepojoimportingparameter = null;

        EObject temp_functionmodulepojoexportingparameter = null;

        EObject temp_functionmodulepojochangingparameter = null;

        EObject temp_functionmodulepojotablesparameter = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:580:9: (temp_functionmodulepojoimportingparameter= ruleFunctionModulePOJOImportingParameter | temp_functionmodulepojoexportingparameter= ruleFunctionModulePOJOExportingParameter | temp_functionmodulepojochangingparameter= ruleFunctionModulePOJOChangingParameter | temp_functionmodulepojotablesparameter= ruleFunctionModulePOJOTablesParameter )
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
                    new NoViableAltException("578:1: ruleFunctionModulePOJOParameterMapping returns [EObject result] : (temp_functionmodulepojoimportingparameter= ruleFunctionModulePOJOImportingParameter | temp_functionmodulepojoexportingparameter= ruleFunctionModulePOJOExportingParameter | temp_functionmodulepojochangingparameter= ruleFunctionModulePOJOChangingParameter | temp_functionmodulepojotablesparameter= ruleFunctionModulePOJOTablesParameter );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:580:9: temp_functionmodulepojoimportingparameter= ruleFunctionModulePOJOImportingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping787);
                    temp_functionmodulepojoimportingparameter=ruleFunctionModulePOJOImportingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojoimportingparameter;
                    }

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:580:154: temp_functionmodulepojoexportingparameter= ruleFunctionModulePOJOExportingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping802);
                    temp_functionmodulepojoexportingparameter=ruleFunctionModulePOJOExportingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojoexportingparameter;
                    }

                    }
                    break;
                case 3 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:580:299: temp_functionmodulepojochangingparameter= ruleFunctionModulePOJOChangingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping817);
                    temp_functionmodulepojochangingparameter=ruleFunctionModulePOJOChangingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojochangingparameter;
                    }

                    }
                    break;
                case 4 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:580:441: temp_functionmodulepojotablesparameter= ruleFunctionModulePOJOTablesParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping832);
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
            if ( backtracking>0 ) { memoize(input, 12, ruleFunctionModulePOJOParameterMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOParameterMapping


    // $ANTLR start ruleFunctionModulePOJOImportingParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:582:1: ruleFunctionModulePOJOImportingParameter returns [EObject result] : ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModulePOJOImportingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOImportingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:585:4: ( ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:585:4: ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOImportingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:588:1: ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:588:2: ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:588:2: ( 'import' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:588:3: 'import'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,23,FOLLOW_23_in_ruleFunctionModulePOJOImportingParameter860); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:594:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )
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
                    new NoViableAltException("594:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:594:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:594:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:594:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:594:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:594:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOImportingParameter869); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:600:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:600:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter877); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:610:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:610:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter885); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:616:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("616:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:616:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:616:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:616:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter894); if (failed) return result;
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
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:626:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:626:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:626:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:626:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:626:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter906); if (failed) return result;
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

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:636:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:636:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter915); if (failed) return result;
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:649:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:649:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:649:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:649:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:649:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModulePOJOImportingParameter933); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:659:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:659:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter942); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:669:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:669:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter950); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:675:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("675:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:675:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:675:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:675:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter959); if (failed) return result;
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
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:685:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:685:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:685:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:685:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:685:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter971); if (failed) return result;
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

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:695:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:695:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter980); if (failed) return result;
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:708:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:708:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:708:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:708:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:708:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter998); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:718:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:718:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1007); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:728:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:728:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter1015); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:734:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("734:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 12, 0, input);

                        throw nvae;
                    }
                    switch (alt12) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:734:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:734:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:734:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter1024); if (failed) return result;
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
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:744:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:744:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:744:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:744:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:744:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1036); if (failed) return result;
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

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:754:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:754:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1045); if (failed) return result;
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:768:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:768:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:768:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:768:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter1062); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:774:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:774:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1070); if (failed) return result;
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:785:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:785:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter1081); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 13, ruleFunctionModulePOJOImportingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOImportingParameter


    // $ANTLR start ruleFunctionModulePOJOExportingParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:798:1: ruleFunctionModulePOJOExportingParameter returns [EObject result] : ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModulePOJOExportingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOExportingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:801:4: ( ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:801:4: ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOExportingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:804:1: ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:804:2: ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:804:2: ( 'export' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:804:3: 'export'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOExportingParameter1119); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:810:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )
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
                    new NoViableAltException("810:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:810:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:810:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:810:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:810:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:810:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOExportingParameter1128); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:816:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:816:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1136); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:826:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:826:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1144); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:832:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("832:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:832:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:832:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:832:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOExportingParameter1153); if (failed) return result;
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
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:842:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:842:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:842:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:842:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:842:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1165); if (failed) return result;
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

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:852:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:852:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1174); if (failed) return result;
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:865:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:865:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:865:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:865:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:865:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModulePOJOExportingParameter1192); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:875:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:875:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1201); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:885:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:885:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1209); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:891:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("891:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:891:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:891:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:891:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOExportingParameter1218); if (failed) return result;
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
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:901:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:901:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:901:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:901:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:901:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1230); if (failed) return result;
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

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:911:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:911:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1239); if (failed) return result;
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:924:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:924:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:924:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:924:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:924:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter1257); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:934:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:934:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1266); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:944:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:944:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1274); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:950:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("950:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:950:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:950:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:950:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOExportingParameter1283); if (failed) return result;
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
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:960:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:960:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:960:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:960:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:960:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1295); if (failed) return result;
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

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:970:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:970:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1304); if (failed) return result;
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:984:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:984:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:984:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:984:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter1321); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:990:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:990:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1329); if (failed) return result;
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1001:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1001:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter1340); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 14, ruleFunctionModulePOJOExportingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOExportingParameter


    // $ANTLR start ruleFunctionModulePOJOChangingParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1014:1: ruleFunctionModulePOJOChangingParameter returns [EObject result] : ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModulePOJOChangingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOChangingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1017:4: ( ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1017:4: ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOChangingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1020:1: ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1020:2: ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1020:2: ( 'change' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1020:3: 'change'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,27,FOLLOW_27_in_ruleFunctionModulePOJOChangingParameter1378); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1026:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )
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
                    new NoViableAltException("1026:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1026:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1026:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1026:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1026:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1026:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOChangingParameter1387); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1032:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1032:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1395); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1042:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1042:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1403); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1048:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("1048:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1048:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1048:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1048:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOChangingParameter1412); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1058:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1058:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1058:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1058:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1058:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1424); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1068:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1068:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1433); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1081:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1081:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1081:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1081:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1081:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModulePOJOChangingParameter1451); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"isStructure",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1091:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1091:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1460); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1101:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1101:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1468); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1107:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("1107:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1107:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1107:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1107:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOChangingParameter1477); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1117:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1117:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1117:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1117:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1117:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1489); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1127:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1127:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1498); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1140:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1140:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1140:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1140:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1140:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter1516); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        factory.set(result,"isTable",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1150:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1150:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1525); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1160:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1160:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1533); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1166:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("1166:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1166:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1166:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1166:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOChangingParameter1542); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1176:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1176:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1176:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1176:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1176:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1554); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1186:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1186:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1563); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1200:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1200:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1200:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1200:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter1580); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1206:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1206:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1588); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1217:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1217:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter1599); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)));
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
            if ( backtracking>0 ) { memoize(input, 15, ruleFunctionModulePOJOChangingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOChangingParameter


    // $ANTLR start ruleFunctionModulePOJOTablesParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1230:1: ruleFunctionModulePOJOTablesParameter returns [EObject result] : ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModulePOJOTablesParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOTablesParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1233:4: ( ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1233:4: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOTablesParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1236:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1236:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1236:2: ( 'table' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1236:3: 'table'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOTablesParameter1637); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1242:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1242:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter1645); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1252:1: ( '=' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1252:2: '='
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOTablesParameter1653); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1258:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                    new NoViableAltException("1258:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1258:2: ( 'inactive' )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1258:2: ( 'inactive' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1258:3: 'inactive'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOTablesParameter1662); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                        factory.set(result,"isInactive",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1268:1: ( ( RULE_ID ) ( RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1268:1: ( ( RULE_ID ) ( RULE_ID ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1268:2: ( RULE_ID ) ( RULE_ID )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1268:2: ( RULE_ID )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1268:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter1674); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"type",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1278:1: ( RULE_ID )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1278:2: RULE_ID
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter1683); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"attribute",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1290:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1290:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1290:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1290:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOTablesParameter1696); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(4)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1296:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1296:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter1704); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(4)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1307:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1307:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOTablesParameter1715); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(5)));
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
            if ( backtracking>0 ) { memoize(input, 16, ruleFunctionModulePOJOTablesParameter_StartIndex); }
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
    public static final BitSet FOLLOW_11_in_ruleStructure175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructure183 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStructure191 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleStructureMapping_in_ruleStructure201 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructure209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructurePOJOMapping_in_ruleStructureMapping244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStructurePOJOMapping272 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructurePOJOMapping280 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStructurePOJOMapping288 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping298 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleStructurePOJOMapping307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStructureFieldPOJOMapping345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping353 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStructureFieldPOJOMapping361 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping369 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping378 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleStructureFieldPOJOMapping387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping395 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructureFieldPOJOMapping406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModule444 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModule451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModule459 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModule467 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule477 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModule485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJOCallMapping588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping596 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJOCallMapping604 = new BitSet(new long[]{0x000000000E802000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping614 = new BitSet(new long[]{0x000000000E802000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJOCallMapping623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModulePOJORequestResponseMapping661 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping668 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping676 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJORequestResponseMapping684 = new BitSet(new long[]{0x000000000E802000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping694 = new BitSet(new long[]{0x000000000E802000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping703 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJORequestResponseMapping710 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping725 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJORequestResponseMapping733 = new BitSet(new long[]{0x000000000E802000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping743 = new BitSet(new long[]{0x000000000E802000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJOImportingParameter860 = new BitSet(new long[]{0x0000000002008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOImportingParameter869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter877 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter885 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter894 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter906 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter915 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModulePOJOImportingParameter933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter942 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter950 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter959 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter971 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter980 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1007 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter1015 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter1024 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1036 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1045 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter1062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1070 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOExportingParameter1119 = new BitSet(new long[]{0x0000000002008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOExportingParameter1128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1136 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1144 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOExportingParameter1153 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1165 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1174 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModulePOJOExportingParameter1192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1201 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1209 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOExportingParameter1218 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1230 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1239 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter1257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1266 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1274 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOExportingParameter1283 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1304 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter1321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1329 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionModulePOJOChangingParameter1378 = new BitSet(new long[]{0x0000000002008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOChangingParameter1387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1395 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1403 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOChangingParameter1412 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1433 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModulePOJOChangingParameter1451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1460 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1468 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOChangingParameter1477 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1489 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1498 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter1516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1525 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1533 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOChangingParameter1542 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1563 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter1580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1588 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOTablesParameter1637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter1645 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOTablesParameter1653 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOTablesParameter1662 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter1674 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter1683 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOTablesParameter1696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter1704 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOTablesParameter1715 = new BitSet(new long[]{0x0000000000000002L});

}