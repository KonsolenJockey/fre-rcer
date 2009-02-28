// $ANTLR 3.0 ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g 2009-02-28 21:35:05

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'package'", "'structure'", "'{'", "'}'", "'class'", "'field'", "'='", "'comment'", "';'", "'EClass'", "'function'", "'module'", "'request'", "'response'", "'import'", "'inactive'", "'table'", "'export'", "'change'"
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
            ruleMemo = new HashMap[83+1];
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

                if ( (LA2_0==20) ) {
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
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:218:1: ruleStructureMapping returns [EObject result] : (temp_structurepojomapping= ruleStructurePOJOMapping | temp_structureemfmapping= ruleStructureEMFMapping );
    public EObject ruleStructureMapping() throws RecognitionException {
        EObject result = null;
        int ruleStructureMapping_StartIndex = input.index();
        EObject temp_structurepojomapping = null;

        EObject temp_structureemfmapping = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:220:9: (temp_structurepojomapping= ruleStructurePOJOMapping | temp_structureemfmapping= ruleStructureEMFMapping )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("218:1: ruleStructureMapping returns [EObject result] : (temp_structurepojomapping= ruleStructurePOJOMapping | temp_structureemfmapping= ruleStructureEMFMapping );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
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
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:220:106: temp_structureemfmapping= ruleStructureEMFMapping
                    {
                    pushFollow(FOLLOW_ruleStructureEMFMapping_in_ruleStructureMapping259);
                    temp_structureemfmapping=ruleStructureEMFMapping();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_structureemfmapping;
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
            match(input,14,FOLLOW_14_in_ruleStructurePOJOMapping287); if (failed) return result;
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructurePOJOMapping295); if (failed) return result;
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
            match(input,12,FOLLOW_12_in_ruleStructurePOJOMapping303); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:250:1: (temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:250:2: temp_StructureFieldPOJOMapping= ruleStructureFieldPOJOMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)));
            	    }
            	    pushFollow(FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping313);
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
            	    break loop4;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:262:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:262:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleStructurePOJOMapping322); if (failed) return result;
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
            match(input,15,FOLLOW_15_in_ruleStructureFieldPOJOMapping360); if (failed) return result;
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
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping368); if (failed) return result;
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
            match(input,16,FOLLOW_16_in_ruleStructureFieldPOJOMapping376); if (failed) return result;
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping384); if (failed) return result;
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
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping393); if (failed) return result;
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
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:323:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:323:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:323:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleStructureFieldPOJOMapping402); if (failed) return result;
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
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping410); if (failed) return result;
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
            match(input,18,FOLLOW_18_in_ruleStructureFieldPOJOMapping421); if (failed) return result;
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


    // $ANTLR start ruleStructureEMFMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:353:1: ruleStructureEMFMapping returns [EObject result] : ( ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldEMFMapping= ruleStructureFieldEMFMapping )* ( '}' ) ) ;
    public EObject ruleStructureEMFMapping() throws RecognitionException {
        EObject result = null;
        int ruleStructureEMFMapping_StartIndex = input.index();
        EObject temp_StructureFieldEMFMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:356:4: ( ( ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldEMFMapping= ruleStructureFieldEMFMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:356:4: ( ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldEMFMapping= ruleStructureFieldEMFMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "StructureEMFMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:359:1: ( ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldEMFMapping= ruleStructureFieldEMFMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:359:2: ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_StructureFieldEMFMapping= ruleStructureFieldEMFMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:359:2: ( 'EClass' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:359:3: 'EClass'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,19,FOLLOW_19_in_ruleStructureEMFMapping459); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:365:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:365:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureEMFMapping467); if (failed) return result;
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:375:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:375:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleStructureEMFMapping475); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:381:1: (temp_StructureFieldEMFMapping= ruleStructureFieldEMFMapping )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:381:2: temp_StructureFieldEMFMapping= ruleStructureFieldEMFMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)));
            	    }
            	    pushFollow(FOLLOW_ruleStructureFieldEMFMapping_in_ruleStructureEMFMapping485);
            	    temp_StructureFieldEMFMapping=ruleStructureFieldEMFMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_StructureFieldEMFMapping != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_StructureFieldEMFMapping);
            	        factory.add(result,"fields",convert(temp_StructureFieldEMFMapping),false);
            	        ptm.ruleFinished(temp_StructureFieldEMFMapping);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:393:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:393:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleStructureEMFMapping494); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 7, ruleStructureEMFMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleStructureEMFMapping


    // $ANTLR start ruleStructureFieldEMFMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:406:1: ruleStructureFieldEMFMapping returns [EObject result] : ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( ';' ) ) ;
    public EObject ruleStructureFieldEMFMapping() throws RecognitionException {
        EObject result = null;
        int ruleStructureFieldEMFMapping_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:409:4: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:409:4: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "StructureFieldEMFMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:412:1: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:412:2: ( 'field' ) ( RULE_STRING ) ( '=' ) ( RULE_ID ) ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:412:2: ( 'field' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:412:3: 'field'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,15,FOLLOW_15_in_ruleStructureFieldEMFMapping532); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:418:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:418:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStructureFieldEMFMapping540); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:428:1: ( '=' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:428:2: '='
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleStructureFieldEMFMapping548); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:434:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:434:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStructureFieldEMFMapping556); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(3)));
                factory.set(result,"attribute",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:444:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:444:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleStructureFieldEMFMapping564); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(4)));
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
            if ( backtracking>0 ) { memoize(input, 8, ruleStructureFieldEMFMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleStructureFieldEMFMapping


    // $ANTLR start ruleFunctionModule
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:457:1: ruleFunctionModule returns [EObject result] : ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) ) ;
    public EObject ruleFunctionModule() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModule_StartIndex = input.index();
        EObject temp_FunctionModuleMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:460:4: ( ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:460:4: ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModule");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:463:1: ( ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:463:2: ( 'function' ) ( 'module' ) ( RULE_STRING ) ( '{' ) (temp_FunctionModuleMapping= ruleFunctionModuleMapping ) ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:463:2: ( 'function' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:463:3: 'function'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,20,FOLLOW_20_in_ruleFunctionModule602); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:469:1: ( 'module' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:469:2: 'module'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,21,FOLLOW_21_in_ruleFunctionModule609); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:475:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:475:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModule617); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:485:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:485:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModule625); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:491:1: (temp_FunctionModuleMapping= ruleFunctionModuleMapping )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:491:2: temp_FunctionModuleMapping= ruleFunctionModuleMapping
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(4)));
            }
            pushFollow(FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule635);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:503:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:503:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModule643); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(5)));
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
            if ( backtracking>0 ) { memoize(input, 9, ruleFunctionModule_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModule


    // $ANTLR start ruleFunctionModuleMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:516:1: ruleFunctionModuleMapping returns [EObject result] : (temp_functionmodulepojomapping= ruleFunctionModulePOJOMapping | temp_functionmoduleemfmapping= ruleFunctionModuleEMFMapping );
    public EObject ruleFunctionModuleMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleMapping_StartIndex = input.index();
        EObject temp_functionmodulepojomapping = null;

        EObject temp_functionmoduleemfmapping = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:518:9: (temp_functionmodulepojomapping= ruleFunctionModulePOJOMapping | temp_functionmoduleemfmapping= ruleFunctionModuleEMFMapping )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==19) ) {
                    alt7=2;
                }
                else if ( (LA7_2==14) ) {
                    alt7=1;
                }
                else {
                    if (backtracking>0) {failed=true; return result;}
                    NoViableAltException nvae =
                        new NoViableAltException("516:1: ruleFunctionModuleMapping returns [EObject result] : (temp_functionmodulepojomapping= ruleFunctionModulePOJOMapping | temp_functionmoduleemfmapping= ruleFunctionModuleEMFMapping );", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("516:1: ruleFunctionModuleMapping returns [EObject result] : (temp_functionmodulepojomapping= ruleFunctionModulePOJOMapping | temp_functionmoduleemfmapping= ruleFunctionModuleEMFMapping );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:518:9: temp_functionmodulepojomapping= ruleFunctionModulePOJOMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping678);
                    temp_functionmodulepojomapping=ruleFunctionModulePOJOMapping();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojomapping;
                    }

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:518:121: temp_functionmoduleemfmapping= ruleFunctionModuleEMFMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleEMFMapping_in_ruleFunctionModuleMapping693);
                    temp_functionmoduleemfmapping=ruleFunctionModuleEMFMapping();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmoduleemfmapping;
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
            if ( backtracking>0 ) { memoize(input, 10, ruleFunctionModuleMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleMapping


    // $ANTLR start ruleFunctionModulePOJOMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:520:1: ruleFunctionModulePOJOMapping returns [EObject result] : (temp_functionmodulepojocallmapping= ruleFunctionModulePOJOCallMapping | temp_functionmodulepojorequestresponsemapping= ruleFunctionModulePOJORequestResponseMapping );
    public EObject ruleFunctionModulePOJOMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOMapping_StartIndex = input.index();
        EObject temp_functionmodulepojocallmapping = null;

        EObject temp_functionmodulepojorequestresponsemapping = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:522:9: (temp_functionmodulepojocallmapping= ruleFunctionModulePOJOCallMapping | temp_functionmodulepojorequestresponsemapping= ruleFunctionModulePOJORequestResponseMapping )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("520:1: ruleFunctionModulePOJOMapping returns [EObject result] : (temp_functionmodulepojocallmapping= ruleFunctionModulePOJOCallMapping | temp_functionmodulepojorequestresponsemapping= ruleFunctionModulePOJORequestResponseMapping );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:522:9: temp_functionmodulepojocallmapping= ruleFunctionModulePOJOCallMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping718);
                    temp_functionmodulepojocallmapping=ruleFunctionModulePOJOCallMapping();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojocallmapping;
                    }

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:522:133: temp_functionmodulepojorequestresponsemapping= ruleFunctionModulePOJORequestResponseMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping733);
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
            if ( backtracking>0 ) { memoize(input, 11, ruleFunctionModulePOJOMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOMapping


    // $ANTLR start ruleFunctionModulePOJOCallMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:524:1: ruleFunctionModulePOJOCallMapping returns [EObject result] : ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ) ;
    public EObject ruleFunctionModulePOJOCallMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOCallMapping_StartIndex = input.index();
        EObject temp_FunctionModulePOJOParameterMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:527:4: ( ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:527:4: ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOCallMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:530:1: ( ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:530:2: ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:530:2: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:530:3: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJOCallMapping761); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:536:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:536:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping769); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"className",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:546:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:546:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModulePOJOCallMapping777); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:552:1: (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24||(LA9_0>=26 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:552:2: temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(3)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping787);
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
            	    break loop9;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:564:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:564:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJOCallMapping796); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(4)));
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
            if ( backtracking>0 ) { memoize(input, 12, ruleFunctionModulePOJOCallMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOCallMapping


    // $ANTLR start ruleFunctionModulePOJORequestResponseMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:577:1: ruleFunctionModulePOJORequestResponseMapping returns [EObject result] : ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ) ;
    public EObject ruleFunctionModulePOJORequestResponseMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJORequestResponseMapping_StartIndex = input.index();
        EObject temp_FunctionModulePOJOParameterMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:580:4: ( ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:580:4: ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJORequestResponseMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:583:1: ( ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:583:2: ( 'request' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' ) ( 'response' ) ( 'class' ) ( RULE_ID ) ( '{' ) (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:583:2: ( 'request' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:583:3: 'request'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,22,FOLLOW_22_in_ruleFunctionModulePOJORequestResponseMapping834); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:589:1: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:589:2: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping841); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:595:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:595:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping849); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"requestClassName",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:605:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:605:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModulePOJORequestResponseMapping857); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:611:1: (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24||(LA10_0>=26 && LA10_0<=28)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:611:2: temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(4)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping867);
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
            	    break loop10;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:623:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:623:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping876); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(5)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:629:1: ( 'response' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:629:2: 'response'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,23,FOLLOW_23_in_ruleFunctionModulePOJORequestResponseMapping883); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(6)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:635:1: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:635:2: 'class'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping890); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(7)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:641:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:641:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping898); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(8)));
                factory.set(result,"responseClassName",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:651:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:651:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModulePOJORequestResponseMapping906); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(9)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:657:1: (temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24||(LA11_0>=26 && LA11_0<=28)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:657:2: temp_FunctionModulePOJOParameterMapping= ruleFunctionModulePOJOParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(10)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping916);
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
            	    break loop11;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:669:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:669:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping925); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(11)));
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
            if ( backtracking>0 ) { memoize(input, 13, ruleFunctionModulePOJORequestResponseMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJORequestResponseMapping


    // $ANTLR start ruleFunctionModulePOJOParameterMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:682:1: ruleFunctionModulePOJOParameterMapping returns [EObject result] : (temp_functionmodulepojoimportingparameter= ruleFunctionModulePOJOImportingParameter | temp_functionmodulepojoexportingparameter= ruleFunctionModulePOJOExportingParameter | temp_functionmodulepojochangingparameter= ruleFunctionModulePOJOChangingParameter | temp_functionmodulepojotablesparameter= ruleFunctionModulePOJOTablesParameter );
    public EObject ruleFunctionModulePOJOParameterMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOParameterMapping_StartIndex = input.index();
        EObject temp_functionmodulepojoimportingparameter = null;

        EObject temp_functionmodulepojoexportingparameter = null;

        EObject temp_functionmodulepojochangingparameter = null;

        EObject temp_functionmodulepojotablesparameter = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:684:9: (temp_functionmodulepojoimportingparameter= ruleFunctionModulePOJOImportingParameter | temp_functionmodulepojoexportingparameter= ruleFunctionModulePOJOExportingParameter | temp_functionmodulepojochangingparameter= ruleFunctionModulePOJOChangingParameter | temp_functionmodulepojotablesparameter= ruleFunctionModulePOJOTablesParameter )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            case 26:
                {
                alt12=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("682:1: ruleFunctionModulePOJOParameterMapping returns [EObject result] : (temp_functionmodulepojoimportingparameter= ruleFunctionModulePOJOImportingParameter | temp_functionmodulepojoexportingparameter= ruleFunctionModulePOJOExportingParameter | temp_functionmodulepojochangingparameter= ruleFunctionModulePOJOChangingParameter | temp_functionmodulepojotablesparameter= ruleFunctionModulePOJOTablesParameter );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:684:9: temp_functionmodulepojoimportingparameter= ruleFunctionModulePOJOImportingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping960);
                    temp_functionmodulepojoimportingparameter=ruleFunctionModulePOJOImportingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojoimportingparameter;
                    }

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:684:154: temp_functionmodulepojoexportingparameter= ruleFunctionModulePOJOExportingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping975);
                    temp_functionmodulepojoexportingparameter=ruleFunctionModulePOJOExportingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojoexportingparameter;
                    }

                    }
                    break;
                case 3 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:684:299: temp_functionmodulepojochangingparameter= ruleFunctionModulePOJOChangingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping990);
                    temp_functionmodulepojochangingparameter=ruleFunctionModulePOJOChangingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmodulepojochangingparameter;
                    }

                    }
                    break;
                case 4 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:684:441: temp_functionmodulepojotablesparameter= ruleFunctionModulePOJOTablesParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping1005);
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
            if ( backtracking>0 ) { memoize(input, 14, ruleFunctionModulePOJOParameterMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOParameterMapping


    // $ANTLR start ruleFunctionModulePOJOImportingParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:686:1: ruleFunctionModulePOJOImportingParameter returns [EObject result] : ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModulePOJOImportingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOImportingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:689:4: ( ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:689:4: ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOImportingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:692:1: ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:692:2: ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:692:2: ( 'import' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:692:3: 'import'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,24,FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter1033); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:698:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt16=1;
                }
                break;
            case 11:
                {
                alt16=2;
                }
                break;
            case 26:
                {
                alt16=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("698:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:698:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:698:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:698:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:698:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:698:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOImportingParameter1042); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:704:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:704:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1050); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:714:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:714:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter1058); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:720:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==25) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_ID) ) {
                        alt13=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("720:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:720:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:720:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:720:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter1067); if (failed) return result;
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
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:730:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:730:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:730:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:730:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:730:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1079); if (failed) return result;
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

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:740:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:740:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1088); if (failed) return result;
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:753:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:753:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:753:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:753:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:753:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModulePOJOImportingParameter1106); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:763:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:763:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1115); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:773:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:773:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter1123); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:779:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==25) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==RULE_ID) ) {
                        alt14=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("779:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:779:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:779:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:779:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter1132); if (failed) return result;
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
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:789:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:789:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:789:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:789:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:789:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1144); if (failed) return result;
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

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:799:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:799:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1153); if (failed) return result;
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:812:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:812:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:812:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:812:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:812:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOImportingParameter1171); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:822:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:822:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1180); if (failed) return result;
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

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:832:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:832:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter1188); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:838:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("838:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:838:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:838:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:838:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter1197); if (failed) return result;
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
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:848:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:848:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:848:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:848:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:848:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1209); if (failed) return result;
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

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:858:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:858:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1218); if (failed) return result;
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:872:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:872:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:872:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:872:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter1235); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:878:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:878:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1243); if (failed) return result;
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:889:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:889:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter1254); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 15, ruleFunctionModulePOJOImportingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOImportingParameter


    // $ANTLR start ruleFunctionModulePOJOExportingParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:902:1: ruleFunctionModulePOJOExportingParameter returns [EObject result] : ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModulePOJOExportingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOExportingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:905:4: ( ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:905:4: ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOExportingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:908:1: ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:908:2: ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:908:2: ( 'export' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:908:3: 'export'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,27,FOLLOW_27_in_ruleFunctionModulePOJOExportingParameter1292); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:914:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt21=1;
                }
                break;
            case 11:
                {
                alt21=2;
                }
                break;
            case 26:
                {
                alt21=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("914:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:914:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:914:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:914:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:914:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:914:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOExportingParameter1301); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:920:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:920:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1309); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:930:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:930:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1317); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:936:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==25) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==RULE_ID) ) {
                        alt18=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("936:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:936:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:936:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:936:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter1326); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:946:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:946:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:946:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:946:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:946:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1338); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:956:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:956:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1347); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:969:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:969:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:969:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:969:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:969:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModulePOJOExportingParameter1365); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"isStructure",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:979:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:979:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1374); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:989:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:989:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1382); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:995:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==25) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==RULE_ID) ) {
                        alt19=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("995:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:995:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:995:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:995:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter1391); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1005:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1005:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1005:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1005:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1005:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1403); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1015:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1015:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1412); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1028:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1028:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1028:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1028:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1028:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOExportingParameter1430); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        factory.set(result,"isTable",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1038:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1038:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1439); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1048:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1048:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1447); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1054:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("1054:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1054:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1054:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1054:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter1456); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1064:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1064:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1064:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1064:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1064:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1468); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1074:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1074:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1477); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1088:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1088:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1088:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1088:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter1494); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1094:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1094:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1502); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1105:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1105:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter1513); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(3)));
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
            if ( backtracking>0 ) { memoize(input, 16, ruleFunctionModulePOJOExportingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOExportingParameter


    // $ANTLR start ruleFunctionModulePOJOChangingParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1118:1: ruleFunctionModulePOJOChangingParameter returns [EObject result] : ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModulePOJOChangingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOChangingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1121:4: ( ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1121:4: ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOChangingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1124:1: ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1124:2: ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1124:2: ( 'change' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1124:3: 'change'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,28,FOLLOW_28_in_ruleFunctionModulePOJOChangingParameter1551); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1130:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt26=1;
                }
                break;
            case 11:
                {
                alt26=2;
                }
                break;
            case 26:
                {
                alt26=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("1130:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ) )", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1130:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1130:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1130:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1130:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1130:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModulePOJOChangingParameter1560); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1136:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1136:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1568); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1146:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1146:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1576); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1152:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==25) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==RULE_ID) ) {
                        alt23=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("1152:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1152:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1152:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1152:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter1585); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1162:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1162:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1162:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1162:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1162:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1597); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1172:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1172:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1606); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1185:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1185:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1185:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1185:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1185:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModulePOJOChangingParameter1624); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"isStructure",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1195:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1195:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1633); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1205:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1205:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1641); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1211:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==25) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==RULE_ID) ) {
                        alt24=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("1211:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1211:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1211:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1211:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter1650); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1221:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1221:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1221:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1221:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1221:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1662); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1231:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1231:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1671); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1244:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1244:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1244:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1244:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1244:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOChangingParameter1689); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        factory.set(result,"isTable",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1254:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1254:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1698); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1264:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1264:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1706); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1270:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
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
                            new NoViableAltException("1270:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1270:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1270:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1270:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter1715); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1280:1: ( ( RULE_ID ) ( RULE_ID ) )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1280:1: ( ( RULE_ID ) ( RULE_ID ) )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1280:2: ( RULE_ID ) ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1280:2: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1280:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1727); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                                factory.set(result,"type",convert(temp),false);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }

                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1290:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1290:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1736); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1304:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1304:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1304:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1304:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter1753); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1310:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1310:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1761); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1321:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1321:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter1772); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)).eContents().get(3)));
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
            if ( backtracking>0 ) { memoize(input, 17, ruleFunctionModulePOJOChangingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOChangingParameter


    // $ANTLR start ruleFunctionModulePOJOTablesParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1334:1: ruleFunctionModulePOJOTablesParameter returns [EObject result] : ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) ;
    public EObject ruleFunctionModulePOJOTablesParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModulePOJOTablesParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1337:4: ( ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1337:4: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModulePOJOTablesParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1340:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1340:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) ) ( ( 'comment' ) ( RULE_STRING ) )? ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1340:2: ( 'table' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1340:3: 'table'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,26,FOLLOW_26_in_ruleFunctionModulePOJOTablesParameter1810); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1346:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1346:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter1818); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1356:1: ( '=' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1356:2: '='
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleFunctionModulePOJOTablesParameter1826); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1362:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_ID) ) {
                alt28=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("1362:1: ( ( 'inactive' ) | ( ( RULE_ID ) ( RULE_ID ) ) )", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1362:2: ( 'inactive' )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1362:2: ( 'inactive' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1362:3: 'inactive'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,25,FOLLOW_25_in_ruleFunctionModulePOJOTablesParameter1835); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                        factory.set(result,"isInactive",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1372:1: ( ( RULE_ID ) ( RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1372:1: ( ( RULE_ID ) ( RULE_ID ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1372:2: ( RULE_ID ) ( RULE_ID )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1372:2: ( RULE_ID )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1372:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter1847); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"type",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1382:1: ( RULE_ID )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1382:2: RULE_ID
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter1856); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"attribute",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1394:1: ( ( 'comment' ) ( RULE_STRING ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1394:2: ( 'comment' ) ( RULE_STRING )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1394:2: ( 'comment' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1394:3: 'comment'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,17,FOLLOW_17_in_ruleFunctionModulePOJOTablesParameter1869); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(4)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1400:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1400:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter1877); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(4)).eContents().get(1)));
                        factory.set(result,"comment",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1411:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1411:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModulePOJOTablesParameter1888); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(5)));
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
            if ( backtracking>0 ) { memoize(input, 18, ruleFunctionModulePOJOTablesParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModulePOJOTablesParameter


    // $ANTLR start ruleFunctionModuleEMFMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1424:1: ruleFunctionModuleEMFMapping returns [EObject result] : (temp_functionmoduleemfcallmapping= ruleFunctionModuleEMFCallMapping | temp_functionmoduleemfrequestresponsemapping= ruleFunctionModuleEMFRequestResponseMapping );
    public EObject ruleFunctionModuleEMFMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleEMFMapping_StartIndex = input.index();
        EObject temp_functionmoduleemfcallmapping = null;

        EObject temp_functionmoduleemfrequestresponsemapping = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1426:9: (temp_functionmoduleemfcallmapping= ruleFunctionModuleEMFCallMapping | temp_functionmoduleemfrequestresponsemapping= ruleFunctionModuleEMFRequestResponseMapping )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==19) ) {
                alt30=1;
            }
            else if ( (LA30_0==22) ) {
                alt30=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("1424:1: ruleFunctionModuleEMFMapping returns [EObject result] : (temp_functionmoduleemfcallmapping= ruleFunctionModuleEMFCallMapping | temp_functionmoduleemfrequestresponsemapping= ruleFunctionModuleEMFRequestResponseMapping );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1426:9: temp_functionmoduleemfcallmapping= ruleFunctionModuleEMFCallMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleEMFCallMapping_in_ruleFunctionModuleEMFMapping1923);
                    temp_functionmoduleemfcallmapping=ruleFunctionModuleEMFCallMapping();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmoduleemfcallmapping;
                    }

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1426:130: temp_functionmoduleemfrequestresponsemapping= ruleFunctionModuleEMFRequestResponseMapping
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleEMFRequestResponseMapping_in_ruleFunctionModuleEMFMapping1938);
                    temp_functionmoduleemfrequestresponsemapping=ruleFunctionModuleEMFRequestResponseMapping();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmoduleemfrequestresponsemapping;
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
            if ( backtracking>0 ) { memoize(input, 19, ruleFunctionModuleEMFMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleEMFMapping


    // $ANTLR start ruleFunctionModuleEMFCallMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1428:1: ruleFunctionModuleEMFCallMapping returns [EObject result] : ( ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' ) ) ;
    public EObject ruleFunctionModuleEMFCallMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleEMFCallMapping_StartIndex = input.index();
        EObject temp_FunctionModuleEMFParameterMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1431:4: ( ( ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1431:4: ( ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleEMFCallMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1434:1: ( ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1434:2: ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1434:2: ( 'EClass' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1434:3: 'EClass'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,19,FOLLOW_19_in_ruleFunctionModuleEMFCallMapping1966); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1440:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1440:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleEMFCallMapping1974); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"className",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1450:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1450:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModuleEMFCallMapping1982); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1456:1: (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==24||(LA31_0>=26 && LA31_0<=28)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1456:2: temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(3)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModuleEMFParameterMapping_in_ruleFunctionModuleEMFCallMapping1992);
            	    temp_FunctionModuleEMFParameterMapping=ruleFunctionModuleEMFParameterMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_FunctionModuleEMFParameterMapping != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_FunctionModuleEMFParameterMapping);
            	        factory.add(result,"parameters",convert(temp_FunctionModuleEMFParameterMapping),false);
            	        ptm.ruleFinished(temp_FunctionModuleEMFParameterMapping);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1468:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1468:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModuleEMFCallMapping2001); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(4)));
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
            if ( backtracking>0 ) { memoize(input, 20, ruleFunctionModuleEMFCallMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleEMFCallMapping


    // $ANTLR start ruleFunctionModuleEMFRequestResponseMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1481:1: ruleFunctionModuleEMFRequestResponseMapping returns [EObject result] : ( ( 'request' ) ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' ) ( 'response' ) ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' ) ) ;
    public EObject ruleFunctionModuleEMFRequestResponseMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleEMFRequestResponseMapping_StartIndex = input.index();
        EObject temp_FunctionModuleEMFParameterMapping = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1484:4: ( ( ( 'request' ) ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' ) ( 'response' ) ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1484:4: ( ( 'request' ) ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' ) ( 'response' ) ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleEMFRequestResponseMapping");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1487:1: ( ( 'request' ) ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' ) ( 'response' ) ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1487:2: ( 'request' ) ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' ) ( 'response' ) ( 'EClass' ) ( RULE_ID ) ( '{' ) (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )* ( '}' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1487:2: ( 'request' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1487:3: 'request'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,22,FOLLOW_22_in_ruleFunctionModuleEMFRequestResponseMapping2039); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1493:1: ( 'EClass' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1493:2: 'EClass'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,19,FOLLOW_19_in_ruleFunctionModuleEMFRequestResponseMapping2046); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1499:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1499:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleEMFRequestResponseMapping2054); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(2)));
                factory.set(result,"requestClassName",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1509:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1509:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModuleEMFRequestResponseMapping2062); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(3)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1515:1: (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==24||(LA32_0>=26 && LA32_0<=28)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1515:2: temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(4)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModuleEMFParameterMapping_in_ruleFunctionModuleEMFRequestResponseMapping2072);
            	    temp_FunctionModuleEMFParameterMapping=ruleFunctionModuleEMFParameterMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_FunctionModuleEMFParameterMapping != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_FunctionModuleEMFParameterMapping);
            	        factory.add(result,"requestParameters",convert(temp_FunctionModuleEMFParameterMapping),false);
            	        ptm.ruleFinished(temp_FunctionModuleEMFParameterMapping);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1527:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1527:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModuleEMFRequestResponseMapping2081); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(5)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1533:1: ( 'response' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1533:2: 'response'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,23,FOLLOW_23_in_ruleFunctionModuleEMFRequestResponseMapping2088); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(6)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1539:1: ( 'EClass' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1539:2: 'EClass'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,19,FOLLOW_19_in_ruleFunctionModuleEMFRequestResponseMapping2095); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(7)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1545:1: ( RULE_ID )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1545:2: RULE_ID
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleEMFRequestResponseMapping2103); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(8)));
                factory.set(result,"responseClassName",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1555:1: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1555:2: '{'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleFunctionModuleEMFRequestResponseMapping2111); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(9)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1561:1: (temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==24||(LA33_0>=26 && LA33_0<=28)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1561:2: temp_FunctionModuleEMFParameterMapping= ruleFunctionModuleEMFParameterMapping
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(10)));
            	    }
            	    pushFollow(FOLLOW_ruleFunctionModuleEMFParameterMapping_in_ruleFunctionModuleEMFRequestResponseMapping2121);
            	    temp_FunctionModuleEMFParameterMapping=ruleFunctionModuleEMFParameterMapping();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_FunctionModuleEMFParameterMapping != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_FunctionModuleEMFParameterMapping);
            	        factory.add(result,"responseParameters",convert(temp_FunctionModuleEMFParameterMapping),false);
            	        ptm.ruleFinished(temp_FunctionModuleEMFParameterMapping);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1573:1: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1573:2: '}'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleFunctionModuleEMFRequestResponseMapping2130); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)).eContents().get(11)));
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
            if ( backtracking>0 ) { memoize(input, 21, ruleFunctionModuleEMFRequestResponseMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleEMFRequestResponseMapping


    // $ANTLR start ruleFunctionModuleEMFParameterMapping
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1586:1: ruleFunctionModuleEMFParameterMapping returns [EObject result] : (temp_functionmoduleemfimportingparameter= ruleFunctionModuleEMFImportingParameter | temp_functionmoduleemfexportingparameter= ruleFunctionModuleEMFExportingParameter | temp_functionmoduleemfchangingparameter= ruleFunctionModuleEMFChangingParameter | temp_functionmoduleemftablesparameter= ruleFunctionModuleEMFTablesParameter );
    public EObject ruleFunctionModuleEMFParameterMapping() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleEMFParameterMapping_StartIndex = input.index();
        EObject temp_functionmoduleemfimportingparameter = null;

        EObject temp_functionmoduleemfexportingparameter = null;

        EObject temp_functionmoduleemfchangingparameter = null;

        EObject temp_functionmoduleemftablesparameter = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1588:9: (temp_functionmoduleemfimportingparameter= ruleFunctionModuleEMFImportingParameter | temp_functionmoduleemfexportingparameter= ruleFunctionModuleEMFExportingParameter | temp_functionmoduleemfchangingparameter= ruleFunctionModuleEMFChangingParameter | temp_functionmoduleemftablesparameter= ruleFunctionModuleEMFTablesParameter )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt34=1;
                }
                break;
            case 27:
                {
                alt34=2;
                }
                break;
            case 28:
                {
                alt34=3;
                }
                break;
            case 26:
                {
                alt34=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("1586:1: ruleFunctionModuleEMFParameterMapping returns [EObject result] : (temp_functionmoduleemfimportingparameter= ruleFunctionModuleEMFImportingParameter | temp_functionmoduleemfexportingparameter= ruleFunctionModuleEMFExportingParameter | temp_functionmoduleemfchangingparameter= ruleFunctionModuleEMFChangingParameter | temp_functionmoduleemftablesparameter= ruleFunctionModuleEMFTablesParameter );", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1588:9: temp_functionmoduleemfimportingparameter= ruleFunctionModuleEMFImportingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleEMFImportingParameter_in_ruleFunctionModuleEMFParameterMapping2165);
                    temp_functionmoduleemfimportingparameter=ruleFunctionModuleEMFImportingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmoduleemfimportingparameter;
                    }

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1588:151: temp_functionmoduleemfexportingparameter= ruleFunctionModuleEMFExportingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleEMFExportingParameter_in_ruleFunctionModuleEMFParameterMapping2180);
                    temp_functionmoduleemfexportingparameter=ruleFunctionModuleEMFExportingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmoduleemfexportingparameter;
                    }

                    }
                    break;
                case 3 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1588:293: temp_functionmoduleemfchangingparameter= ruleFunctionModuleEMFChangingParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleEMFChangingParameter_in_ruleFunctionModuleEMFParameterMapping2195);
                    temp_functionmoduleemfchangingparameter=ruleFunctionModuleEMFChangingParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmoduleemfchangingparameter;
                    }

                    }
                    break;
                case 4 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1588:432: temp_functionmoduleemftablesparameter= ruleFunctionModuleEMFTablesParameter
                    {
                    pushFollow(FOLLOW_ruleFunctionModuleEMFTablesParameter_in_ruleFunctionModuleEMFParameterMapping2210);
                    temp_functionmoduleemftablesparameter=ruleFunctionModuleEMFTablesParameter();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_functionmoduleemftablesparameter;
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
            if ( backtracking>0 ) { memoize(input, 22, ruleFunctionModuleEMFParameterMapping_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleEMFParameterMapping


    // $ANTLR start ruleFunctionModuleEMFImportingParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1590:1: ruleFunctionModuleEMFImportingParameter returns [EObject result] : ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' ) ) ;
    public EObject ruleFunctionModuleEMFImportingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleEMFImportingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1593:4: ( ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1593:4: ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleEMFImportingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1596:1: ( ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1596:2: ( 'import' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1596:2: ( 'import' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1596:3: 'import'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,24,FOLLOW_24_in_ruleFunctionModuleEMFImportingParameter2238); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1602:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt38=1;
                }
                break;
            case 11:
                {
                alt38=2;
                }
                break;
            case 26:
                {
                alt38=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("1602:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) )", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1602:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1602:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1602:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1602:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1602:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModuleEMFImportingParameter2247); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1608:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1608:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFImportingParameter2255); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1618:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1618:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleEMFImportingParameter2263); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1624:1: ( ( 'inactive' ) | ( RULE_ID ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==25) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==RULE_ID) ) {
                        alt35=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("1624:1: ( ( 'inactive' ) | ( RULE_ID ) )", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1624:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1624:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1624:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleEMFImportingParameter2272); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1634:1: ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1634:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1634:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleEMFImportingParameter2283); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1646:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1646:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1646:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1646:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1646:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModuleEMFImportingParameter2299); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"isStructure",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1656:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1656:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFImportingParameter2308); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1666:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1666:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleEMFImportingParameter2316); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1672:1: ( ( 'inactive' ) | ( RULE_ID ) )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==25) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==RULE_ID) ) {
                        alt36=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("1672:1: ( ( 'inactive' ) | ( RULE_ID ) )", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1672:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1672:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1672:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleEMFImportingParameter2325); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1682:1: ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1682:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1682:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleEMFImportingParameter2336); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1694:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1694:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1694:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1694:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1694:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,26,FOLLOW_26_in_ruleFunctionModuleEMFImportingParameter2352); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        factory.set(result,"isTable",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1704:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1704:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFImportingParameter2361); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1714:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1714:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleEMFImportingParameter2369); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1720:1: ( ( 'inactive' ) | ( RULE_ID ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==25) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==RULE_ID) ) {
                        alt37=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("1720:1: ( ( 'inactive' ) | ( RULE_ID ) )", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1720:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1720:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1720:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleEMFImportingParameter2378); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1730:1: ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1730:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1730:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleEMFImportingParameter2389); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1743:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1743:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModuleEMFImportingParameter2403); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)).eContents().get(2)));
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
            if ( backtracking>0 ) { memoize(input, 23, ruleFunctionModuleEMFImportingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleEMFImportingParameter


    // $ANTLR start ruleFunctionModuleEMFExportingParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1756:1: ruleFunctionModuleEMFExportingParameter returns [EObject result] : ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' ) ) ;
    public EObject ruleFunctionModuleEMFExportingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleEMFExportingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1759:4: ( ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1759:4: ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleEMFExportingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1762:1: ( ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1762:2: ( 'export' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1762:2: ( 'export' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1762:3: 'export'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,27,FOLLOW_27_in_ruleFunctionModuleEMFExportingParameter2441); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1768:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt42=1;
                }
                break;
            case 11:
                {
                alt42=2;
                }
                break;
            case 26:
                {
                alt42=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("1768:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) )", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1768:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1768:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1768:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1768:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1768:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModuleEMFExportingParameter2450); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1774:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1774:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFExportingParameter2458); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1784:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1784:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleEMFExportingParameter2466); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1790:1: ( ( 'inactive' ) | ( RULE_ID ) )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==25) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==RULE_ID) ) {
                        alt39=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("1790:1: ( ( 'inactive' ) | ( RULE_ID ) )", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1790:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1790:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1790:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleEMFExportingParameter2475); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1800:1: ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1800:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1800:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleEMFExportingParameter2486); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1812:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1812:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1812:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1812:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1812:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModuleEMFExportingParameter2502); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"isStructure",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1822:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1822:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFExportingParameter2511); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1832:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1832:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleEMFExportingParameter2519); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1838:1: ( ( 'inactive' ) | ( RULE_ID ) )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==25) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==RULE_ID) ) {
                        alt40=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("1838:1: ( ( 'inactive' ) | ( RULE_ID ) )", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1838:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1838:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1838:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleEMFExportingParameter2528); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1848:1: ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1848:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1848:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleEMFExportingParameter2539); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1860:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1860:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1860:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1860:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1860:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,26,FOLLOW_26_in_ruleFunctionModuleEMFExportingParameter2555); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        factory.set(result,"isTable",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1870:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1870:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFExportingParameter2564); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1880:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1880:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleEMFExportingParameter2572); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1886:1: ( ( 'inactive' ) | ( RULE_ID ) )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==25) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==RULE_ID) ) {
                        alt41=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("1886:1: ( ( 'inactive' ) | ( RULE_ID ) )", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1886:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1886:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1886:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleEMFExportingParameter2581); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1896:1: ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1896:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1896:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleEMFExportingParameter2592); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1909:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1909:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModuleEMFExportingParameter2606); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(2)));
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
            if ( backtracking>0 ) { memoize(input, 24, ruleFunctionModuleEMFExportingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleEMFExportingParameter


    // $ANTLR start ruleFunctionModuleEMFChangingParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1922:1: ruleFunctionModuleEMFChangingParameter returns [EObject result] : ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' ) ) ;
    public EObject ruleFunctionModuleEMFChangingParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleEMFChangingParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1925:4: ( ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1925:4: ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleEMFChangingParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1928:1: ( ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1928:2: ( 'change' ) ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) ) ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1928:2: ( 'change' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1928:3: 'change'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,28,FOLLOW_28_in_ruleFunctionModuleEMFChangingParameter2644); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1934:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt46=1;
                }
                break;
            case 11:
                {
                alt46=2;
                }
                break;
            case 26:
                {
                alt46=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("1934:1: ( ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) | ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ) )", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1934:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1934:2: ( ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1934:3: ( 'field' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1934:3: ( 'field' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1934:4: 'field'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,15,FOLLOW_15_in_ruleFunctionModuleEMFChangingParameter2653); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1940:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1940:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFChangingParameter2661); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1950:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1950:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleEMFChangingParameter2669); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1956:1: ( ( 'inactive' ) | ( RULE_ID ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==25) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==RULE_ID) ) {
                        alt43=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("1956:1: ( ( 'inactive' ) | ( RULE_ID ) )", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1956:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1956:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1956:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleEMFChangingParameter2678); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1966:1: ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1966:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1966:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleEMFChangingParameter2689); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1978:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1978:1: ( ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1978:2: ( 'structure' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1978:2: ( 'structure' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1978:3: 'structure'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,11,FOLLOW_11_in_ruleFunctionModuleEMFChangingParameter2705); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)));
                        factory.set(result,"isStructure",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1988:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1988:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFChangingParameter2714); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1998:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1998:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleEMFChangingParameter2722); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2004:1: ( ( 'inactive' ) | ( RULE_ID ) )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==25) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==RULE_ID) ) {
                        alt44=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("2004:1: ( ( 'inactive' ) | ( RULE_ID ) )", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2004:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2004:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2004:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleEMFChangingParameter2731); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2014:1: ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2014:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2014:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleEMFChangingParameter2742); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2026:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2026:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2026:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2026:2: ( 'table' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2026:3: 'table'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,26,FOLLOW_26_in_ruleFunctionModuleEMFChangingParameter2758); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)));
                        factory.set(result,"isTable",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2036:1: ( RULE_STRING )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2036:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFChangingParameter2767); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)));
                        factory.set(result,"name",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2046:1: ( '=' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2046:2: '='
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,16,FOLLOW_16_in_ruleFunctionModuleEMFChangingParameter2775); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)));
                        ptm.ruleFinished(getLastToken());
                      }
                    }

                    }

                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2052:1: ( ( 'inactive' ) | ( RULE_ID ) )
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==25) ) {
                        alt45=1;
                    }
                    else if ( (LA45_0==RULE_ID) ) {
                        alt45=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return result;}
                        NoViableAltException nvae =
                            new NoViableAltException("2052:1: ( ( 'inactive' ) | ( RULE_ID ) )", 45, 0, input);

                        throw nvae;
                    }
                    switch (alt45) {
                        case 1 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2052:2: ( 'inactive' )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2052:2: ( 'inactive' )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2052:3: 'inactive'
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,25,FOLLOW_25_in_ruleFunctionModuleEMFChangingParameter2784); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)));
                                factory.set(result,"isInactive",true);
                                ptm.ruleFinished(temp);
                              }
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2062:1: ( RULE_ID )
                            {
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2062:1: ( RULE_ID )
                            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2062:2: RULE_ID
                            {
                            if ( backtracking==0 ) {
                              skipCurrentToken = false;
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleEMFChangingParameter2795); if (failed) return result;
                            if ( backtracking==0 ) {
                              if (!skipCurrentToken) {
                                hasContent = true;
                                Token temp = getLastToken();
                                ptm.createNode(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)));
                                factory.set(result,"attribute",convert(temp),false);
                                ptm.ruleFinished(temp);
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2075:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2075:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModuleEMFChangingParameter2809); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)).eContents().get(2)));
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
            if ( backtracking>0 ) { memoize(input, 25, ruleFunctionModuleEMFChangingParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleEMFChangingParameter


    // $ANTLR start ruleFunctionModuleEMFTablesParameter
    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2088:1: ruleFunctionModuleEMFTablesParameter returns [EObject result] : ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ( ';' ) ) ;
    public EObject ruleFunctionModuleEMFTablesParameter() throws RecognitionException {
        EObject result = null;
        int ruleFunctionModuleEMFTablesParameter_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return result; }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2091:4: ( ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ( ';' ) ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2091:4: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ( ';' ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FunctionModuleEMFTablesParameter");
              			 
            }
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2094:1: ( ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ( ';' ) )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2094:2: ( 'table' ) ( RULE_STRING ) ( '=' ) ( ( 'inactive' ) | ( RULE_ID ) ) ( ';' )
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2094:2: ( 'table' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2094:3: 'table'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,26,FOLLOW_26_in_ruleFunctionModuleEMFTablesParameter2847); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(0)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2100:1: ( RULE_STRING )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2100:2: RULE_STRING
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFTablesParameter2855); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(1)));
                factory.set(result,"name",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2110:1: ( '=' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2110:2: '='
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleFunctionModuleEMFTablesParameter2863); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(2)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2116:1: ( ( 'inactive' ) | ( RULE_ID ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==25) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_ID) ) {
                alt47=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("2116:1: ( ( 'inactive' ) | ( RULE_ID ) )", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2116:2: ( 'inactive' )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2116:2: ( 'inactive' )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2116:3: 'inactive'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,25,FOLLOW_25_in_ruleFunctionModuleEMFTablesParameter2872); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(3)).eContents().get(0)));
                        factory.set(result,"isInactive",true);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2126:1: ( RULE_ID )
                    {
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2126:1: ( RULE_ID )
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2126:2: RULE_ID
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionModuleEMFTablesParameter2883); if (failed) return result;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(3)).eContents().get(1)));
                        factory.set(result,"attribute",convert(temp),false);
                        ptm.ruleFinished(temp);
                      }
                    }

                    }


                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2137:1: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2137:2: ';'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleFunctionModuleEMFTablesParameter2893); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(4)));
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
            if ( backtracking>0 ) { memoize(input, 26, ruleFunctionModuleEMFTablesParameter_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFunctionModuleEMFTablesParameter


 

    public static final BitSet FOLLOW_ruleGenSpec_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleGenSpec104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGenSpec112 = new BitSet(new long[]{0x0000000000100802L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleGenSpec123 = new BitSet(new long[]{0x0000000000100802L});
    public static final BitSet FOLLOW_ruleFunctionModule_in_ruleGenSpec135 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11_in_ruleStructure175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructure183 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStructure191 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_ruleStructureMapping_in_ruleStructure201 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructure209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructurePOJOMapping_in_ruleStructureMapping244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructureEMFMapping_in_ruleStructureMapping259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStructurePOJOMapping287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructurePOJOMapping295 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStructurePOJOMapping303 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ruleStructureFieldPOJOMapping_in_ruleStructurePOJOMapping313 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleStructurePOJOMapping322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStructureFieldPOJOMapping360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping368 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStructureFieldPOJOMapping376 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldPOJOMapping393 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleStructureFieldPOJOMapping402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldPOJOMapping410 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructureFieldPOJOMapping421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleStructureEMFMapping459 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureEMFMapping467 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStructureEMFMapping475 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ruleStructureFieldEMFMapping_in_ruleStructureEMFMapping485 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleStructureEMFMapping494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStructureFieldEMFMapping532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStructureFieldEMFMapping540 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStructureFieldEMFMapping548 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStructureFieldEMFMapping556 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructureFieldEMFMapping564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleFunctionModule602 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFunctionModule609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModule617 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModule625 = new BitSet(new long[]{0x0000000000484000L});
    public static final BitSet FOLLOW_ruleFunctionModuleMapping_in_ruleFunctionModule635 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModule643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOMapping_in_ruleFunctionModuleMapping678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleEMFMapping_in_ruleFunctionModuleMapping693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOCallMapping_in_ruleFunctionModulePOJOMapping718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJORequestResponseMapping_in_ruleFunctionModulePOJOMapping733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJOCallMapping761 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOCallMapping769 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJOCallMapping777 = new BitSet(new long[]{0x000000001D002000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJOCallMapping787 = new BitSet(new long[]{0x000000001D002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJOCallMapping796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModulePOJORequestResponseMapping834 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping841 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping849 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJORequestResponseMapping857 = new BitSet(new long[]{0x000000001D002000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping867 = new BitSet(new long[]{0x000000001D002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping876 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModulePOJORequestResponseMapping883 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionModulePOJORequestResponseMapping890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJORequestResponseMapping898 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModulePOJORequestResponseMapping906 = new BitSet(new long[]{0x000000001D002000L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOParameterMapping_in_ruleFunctionModulePOJORequestResponseMapping916 = new BitSet(new long[]{0x000000001D002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModulePOJORequestResponseMapping925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOImportingParameter_in_ruleFunctionModulePOJOParameterMapping960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOExportingParameter_in_ruleFunctionModulePOJOParameterMapping975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOChangingParameter_in_ruleFunctionModulePOJOParameterMapping990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModulePOJOTablesParameter_in_ruleFunctionModulePOJOParameterMapping1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModulePOJOImportingParameter1033 = new BitSet(new long[]{0x0000000004008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOImportingParameter1042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1050 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter1058 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter1067 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1079 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1088 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModulePOJOImportingParameter1106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1115 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter1123 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter1132 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1144 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1153 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOImportingParameter1171 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1180 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOImportingParameter1188 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOImportingParameter1197 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1209 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOImportingParameter1218 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOImportingParameter1235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOImportingParameter1243 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOImportingParameter1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionModulePOJOExportingParameter1292 = new BitSet(new long[]{0x0000000004008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOExportingParameter1301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1309 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1317 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter1326 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1338 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1347 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModulePOJOExportingParameter1365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1374 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1382 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter1391 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1403 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1412 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOExportingParameter1430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1439 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOExportingParameter1447 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOExportingParameter1456 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1468 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOExportingParameter1477 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOExportingParameter1494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOExportingParameter1502 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOExportingParameter1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFunctionModulePOJOChangingParameter1551 = new BitSet(new long[]{0x0000000004008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModulePOJOChangingParameter1560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1568 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1576 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter1585 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1606 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModulePOJOChangingParameter1624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1633 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1641 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter1650 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1662 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1671 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOChangingParameter1689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1698 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOChangingParameter1706 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOChangingParameter1715 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1727 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOChangingParameter1736 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOChangingParameter1753 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOChangingParameter1761 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOChangingParameter1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModulePOJOTablesParameter1810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter1818 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModulePOJOTablesParameter1826 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModulePOJOTablesParameter1835 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter1847 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModulePOJOTablesParameter1856 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionModulePOJOTablesParameter1869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModulePOJOTablesParameter1877 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModulePOJOTablesParameter1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleEMFCallMapping_in_ruleFunctionModuleEMFMapping1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleEMFRequestResponseMapping_in_ruleFunctionModuleEMFMapping1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModuleEMFCallMapping1966 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleEMFCallMapping1974 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModuleEMFCallMapping1982 = new BitSet(new long[]{0x000000001D002000L});
    public static final BitSet FOLLOW_ruleFunctionModuleEMFParameterMapping_in_ruleFunctionModuleEMFCallMapping1992 = new BitSet(new long[]{0x000000001D002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModuleEMFCallMapping2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleFunctionModuleEMFRequestResponseMapping2039 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModuleEMFRequestResponseMapping2046 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleEMFRequestResponseMapping2054 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModuleEMFRequestResponseMapping2062 = new BitSet(new long[]{0x000000001D002000L});
    public static final BitSet FOLLOW_ruleFunctionModuleEMFParameterMapping_in_ruleFunctionModuleEMFRequestResponseMapping2072 = new BitSet(new long[]{0x000000001D002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModuleEMFRequestResponseMapping2081 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleFunctionModuleEMFRequestResponseMapping2088 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleFunctionModuleEMFRequestResponseMapping2095 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleEMFRequestResponseMapping2103 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFunctionModuleEMFRequestResponseMapping2111 = new BitSet(new long[]{0x000000001D002000L});
    public static final BitSet FOLLOW_ruleFunctionModuleEMFParameterMapping_in_ruleFunctionModuleEMFRequestResponseMapping2121 = new BitSet(new long[]{0x000000001D002000L});
    public static final BitSet FOLLOW_13_in_ruleFunctionModuleEMFRequestResponseMapping2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleEMFImportingParameter_in_ruleFunctionModuleEMFParameterMapping2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleEMFExportingParameter_in_ruleFunctionModuleEMFParameterMapping2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleEMFChangingParameter_in_ruleFunctionModuleEMFParameterMapping2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionModuleEMFTablesParameter_in_ruleFunctionModuleEMFParameterMapping2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleFunctionModuleEMFImportingParameter2238 = new BitSet(new long[]{0x0000000004008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModuleEMFImportingParameter2247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFImportingParameter2255 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleEMFImportingParameter2263 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleEMFImportingParameter2272 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleEMFImportingParameter2283 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModuleEMFImportingParameter2299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFImportingParameter2308 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleEMFImportingParameter2316 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleEMFImportingParameter2325 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleEMFImportingParameter2336 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModuleEMFImportingParameter2352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFImportingParameter2361 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleEMFImportingParameter2369 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleEMFImportingParameter2378 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleEMFImportingParameter2389 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModuleEMFImportingParameter2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionModuleEMFExportingParameter2441 = new BitSet(new long[]{0x0000000004008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModuleEMFExportingParameter2450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFExportingParameter2458 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleEMFExportingParameter2466 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleEMFExportingParameter2475 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleEMFExportingParameter2486 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModuleEMFExportingParameter2502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFExportingParameter2511 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleEMFExportingParameter2519 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleEMFExportingParameter2528 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleEMFExportingParameter2539 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModuleEMFExportingParameter2555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFExportingParameter2564 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleEMFExportingParameter2572 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleEMFExportingParameter2581 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleEMFExportingParameter2592 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModuleEMFExportingParameter2606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFunctionModuleEMFChangingParameter2644 = new BitSet(new long[]{0x0000000004008800L});
    public static final BitSet FOLLOW_15_in_ruleFunctionModuleEMFChangingParameter2653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFChangingParameter2661 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleEMFChangingParameter2669 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleEMFChangingParameter2678 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleEMFChangingParameter2689 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11_in_ruleFunctionModuleEMFChangingParameter2705 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFChangingParameter2714 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleEMFChangingParameter2722 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleEMFChangingParameter2731 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleEMFChangingParameter2742 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModuleEMFChangingParameter2758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFChangingParameter2767 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleEMFChangingParameter2775 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleEMFChangingParameter2784 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleEMFChangingParameter2795 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModuleEMFChangingParameter2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionModuleEMFTablesParameter2847 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionModuleEMFTablesParameter2855 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionModuleEMFTablesParameter2863 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_25_in_ruleFunctionModuleEMFTablesParameter2872 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionModuleEMFTablesParameter2883 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionModuleEMFTablesParameter2893 = new BitSet(new long[]{0x0000000000000002L});

}