// $ANTLR 3.0 ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g 2009-02-01 17:11:02

package net.sf.rcer.rfcgen.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class rfcgenLexer extends Lexer {
    public static final int T21=21;
    public static final int RULE_ML_COMMENT=8;
    public static final int T14=14;
    public static final int RULE_ID=5;
    public static final int T22=22;
    public static final int T11=11;
    public static final int RULE_STRING=4;
    public static final int T12=12;
    public static final int T23=23;
    public static final int T13=13;
    public static final int T20=20;
    public static final int T10=10;
    public static final int T25=25;
    public static final int T18=18;
    public static final int RULE_WS=7;
    public static final int T26=26;
    public static final int T15=15;
    public static final int RULE_INT=6;
    public static final int EOF=-1;
    public static final int T17=17;
    public static final int Tokens=28;
    public static final int T16=16;
    public static final int T27=27;
    public static final int RULE_SL_COMMENT=9;
    public static final int T24=24;
    public static final int T19=19;

    	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
    	public List<ErrorMsg> getErrors() {
    		return errors;
    	}

    	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    		String msg = super.getErrorMessage(e,tokenNames);
    		errors.add(AntlrUtil.create(msg,e,tokenNames));
    		return msg;
    	}

    public rfcgenLexer() {;} 
    public rfcgenLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g"; }

    // $ANTLR start T10
    public void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:22:7: ( 'package' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:22:7: 'package'
            {
            match("package"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:23:7: ( 'structure' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:23:7: 'structure'
            {
            match("structure"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:24:7: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:24:7: 'class'
            {
            match("class"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:25:7: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:25:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:26:7: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:26:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:27:7: ( 'field' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:27:7: 'field'
            {
            match("field"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:28:7: ( '=' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:28:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:29:7: ( 'comment' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:29:7: 'comment'
            {
            match("comment"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:30:7: ( ';' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:30:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:31:7: ( 'function' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:31:7: 'function'
            {
            match("function"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:32:7: ( 'module' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:32:7: 'module'
            {
            match("module"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:33:7: ( 'request' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:33:7: 'request'
            {
            match("request"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:34:7: ( 'response' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:34:7: 'response'
            {
            match("response"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:35:7: ( 'import' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:35:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:36:7: ( 'inactive' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:36:7: 'inactive'
            {
            match("inactive"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:37:7: ( 'table' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:37:7: 'table'
            {
            match("table"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:38:7: ( 'export' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:38:7: 'export'
            {
            match("export"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:39:7: ( 'change' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:39:7: 'change'
            {
            match("change"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1277:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1277:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1277:3: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1277:4: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1277:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_STRING
    public void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1283:3: ( '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\"') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\'') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1281:1: RULE_STRING : ( '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1283:3: '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"'
                    {
                    match('\"'); 
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1283:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1283:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1283:54: ~ ( '\\\\' | '\\\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1284:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1284:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='&')||(LA4_0>='(' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1284:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1284:54: ~ ( '\\\\' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_INT
    public void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1290:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1290:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1290:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1290:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1290:9: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1290:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_WS
    public void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1296:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1296:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1296:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\t' && LA8_0<='\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ML_COMMENT
    public void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1302:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1302:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1302:8: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFE')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFE')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1302:36: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1308:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1308:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1308:8: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1308:8: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1308:22: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1308:22: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    public void mTokens() throws RecognitionException {
        // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt12=24;
        switch ( input.LA(1) ) {
        case 'p':
            {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='a') ) {
                int LA12_19 = input.LA(3);

                if ( (LA12_19=='c') ) {
                    int LA12_34 = input.LA(4);

                    if ( (LA12_34=='k') ) {
                        int LA12_48 = input.LA(5);

                        if ( (LA12_48=='a') ) {
                            int LA12_62 = input.LA(6);

                            if ( (LA12_62=='g') ) {
                                int LA12_76 = input.LA(7);

                                if ( (LA12_76=='e') ) {
                                    int LA12_90 = input.LA(8);

                                    if ( ((LA12_90>='0' && LA12_90<='9')||(LA12_90>='A' && LA12_90<='Z')||LA12_90=='_'||(LA12_90>='a' && LA12_90<='z')) ) {
                                        alt12=19;
                                    }
                                    else {
                                        alt12=1;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
            }
            break;
        case 's':
            {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='t') ) {
                int LA12_20 = input.LA(3);

                if ( (LA12_20=='r') ) {
                    int LA12_35 = input.LA(4);

                    if ( (LA12_35=='u') ) {
                        int LA12_49 = input.LA(5);

                        if ( (LA12_49=='c') ) {
                            int LA12_63 = input.LA(6);

                            if ( (LA12_63=='t') ) {
                                int LA12_77 = input.LA(7);

                                if ( (LA12_77=='u') ) {
                                    int LA12_91 = input.LA(8);

                                    if ( (LA12_91=='r') ) {
                                        int LA12_102 = input.LA(9);

                                        if ( (LA12_102=='e') ) {
                                            int LA12_108 = input.LA(10);

                                            if ( ((LA12_108>='0' && LA12_108<='9')||(LA12_108>='A' && LA12_108<='Z')||LA12_108=='_'||(LA12_108>='a' && LA12_108<='z')) ) {
                                                alt12=19;
                                            }
                                            else {
                                                alt12=2;}
                                        }
                                        else {
                                            alt12=19;}
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
            }
            break;
        case 'c':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA12_21 = input.LA(3);

                if ( (LA12_21=='a') ) {
                    int LA12_36 = input.LA(4);

                    if ( (LA12_36=='s') ) {
                        int LA12_50 = input.LA(5);

                        if ( (LA12_50=='s') ) {
                            int LA12_64 = input.LA(6);

                            if ( ((LA12_64>='0' && LA12_64<='9')||(LA12_64>='A' && LA12_64<='Z')||LA12_64=='_'||(LA12_64>='a' && LA12_64<='z')) ) {
                                alt12=19;
                            }
                            else {
                                alt12=3;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            case 'o':
                {
                int LA12_22 = input.LA(3);

                if ( (LA12_22=='m') ) {
                    int LA12_37 = input.LA(4);

                    if ( (LA12_37=='m') ) {
                        int LA12_51 = input.LA(5);

                        if ( (LA12_51=='e') ) {
                            int LA12_65 = input.LA(6);

                            if ( (LA12_65=='n') ) {
                                int LA12_79 = input.LA(7);

                                if ( (LA12_79=='t') ) {
                                    int LA12_92 = input.LA(8);

                                    if ( ((LA12_92>='0' && LA12_92<='9')||(LA12_92>='A' && LA12_92<='Z')||LA12_92=='_'||(LA12_92>='a' && LA12_92<='z')) ) {
                                        alt12=19;
                                    }
                                    else {
                                        alt12=8;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            case 'h':
                {
                int LA12_23 = input.LA(3);

                if ( (LA12_23=='a') ) {
                    int LA12_38 = input.LA(4);

                    if ( (LA12_38=='n') ) {
                        int LA12_52 = input.LA(5);

                        if ( (LA12_52=='g') ) {
                            int LA12_66 = input.LA(6);

                            if ( (LA12_66=='e') ) {
                                int LA12_80 = input.LA(7);

                                if ( ((LA12_80>='0' && LA12_80<='9')||(LA12_80>='A' && LA12_80<='Z')||LA12_80=='_'||(LA12_80>='a' && LA12_80<='z')) ) {
                                    alt12=19;
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            default:
                alt12=19;}

            }
            break;
        case '{':
            {
            alt12=4;
            }
            break;
        case '}':
            {
            alt12=5;
            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_24 = input.LA(3);

                if ( (LA12_24=='e') ) {
                    int LA12_39 = input.LA(4);

                    if ( (LA12_39=='l') ) {
                        int LA12_53 = input.LA(5);

                        if ( (LA12_53=='d') ) {
                            int LA12_67 = input.LA(6);

                            if ( ((LA12_67>='0' && LA12_67<='9')||(LA12_67>='A' && LA12_67<='Z')||LA12_67=='_'||(LA12_67>='a' && LA12_67<='z')) ) {
                                alt12=19;
                            }
                            else {
                                alt12=6;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            case 'u':
                {
                int LA12_25 = input.LA(3);

                if ( (LA12_25=='n') ) {
                    int LA12_40 = input.LA(4);

                    if ( (LA12_40=='c') ) {
                        int LA12_54 = input.LA(5);

                        if ( (LA12_54=='t') ) {
                            int LA12_68 = input.LA(6);

                            if ( (LA12_68=='i') ) {
                                int LA12_82 = input.LA(7);

                                if ( (LA12_82=='o') ) {
                                    int LA12_94 = input.LA(8);

                                    if ( (LA12_94=='n') ) {
                                        int LA12_104 = input.LA(9);

                                        if ( ((LA12_104>='0' && LA12_104<='9')||(LA12_104>='A' && LA12_104<='Z')||LA12_104=='_'||(LA12_104>='a' && LA12_104<='z')) ) {
                                            alt12=19;
                                        }
                                        else {
                                            alt12=10;}
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            default:
                alt12=19;}

            }
            break;
        case '=':
            {
            alt12=7;
            }
            break;
        case ';':
            {
            alt12=9;
            }
            break;
        case 'm':
            {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='o') ) {
                int LA12_26 = input.LA(3);

                if ( (LA12_26=='d') ) {
                    int LA12_41 = input.LA(4);

                    if ( (LA12_41=='u') ) {
                        int LA12_55 = input.LA(5);

                        if ( (LA12_55=='l') ) {
                            int LA12_69 = input.LA(6);

                            if ( (LA12_69=='e') ) {
                                int LA12_83 = input.LA(7);

                                if ( ((LA12_83>='0' && LA12_83<='9')||(LA12_83>='A' && LA12_83<='Z')||LA12_83=='_'||(LA12_83>='a' && LA12_83<='z')) ) {
                                    alt12=19;
                                }
                                else {
                                    alt12=11;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
            }
            break;
        case 'r':
            {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='e') ) {
                switch ( input.LA(3) ) {
                case 'q':
                    {
                    int LA12_42 = input.LA(4);

                    if ( (LA12_42=='u') ) {
                        int LA12_56 = input.LA(5);

                        if ( (LA12_56=='e') ) {
                            int LA12_70 = input.LA(6);

                            if ( (LA12_70=='s') ) {
                                int LA12_84 = input.LA(7);

                                if ( (LA12_84=='t') ) {
                                    int LA12_96 = input.LA(8);

                                    if ( ((LA12_96>='0' && LA12_96<='9')||(LA12_96>='A' && LA12_96<='Z')||LA12_96=='_'||(LA12_96>='a' && LA12_96<='z')) ) {
                                        alt12=19;
                                    }
                                    else {
                                        alt12=12;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                    }
                    break;
                case 's':
                    {
                    int LA12_43 = input.LA(4);

                    if ( (LA12_43=='p') ) {
                        int LA12_57 = input.LA(5);

                        if ( (LA12_57=='o') ) {
                            int LA12_71 = input.LA(6);

                            if ( (LA12_71=='n') ) {
                                int LA12_85 = input.LA(7);

                                if ( (LA12_85=='s') ) {
                                    int LA12_97 = input.LA(8);

                                    if ( (LA12_97=='e') ) {
                                        int LA12_106 = input.LA(9);

                                        if ( ((LA12_106>='0' && LA12_106<='9')||(LA12_106>='A' && LA12_106<='Z')||LA12_106=='_'||(LA12_106>='a' && LA12_106<='z')) ) {
                                            alt12=19;
                                        }
                                        else {
                                            alt12=13;}
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                    }
                    break;
                default:
                    alt12=19;}

            }
            else {
                alt12=19;}
            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='a') ) {
                    int LA12_44 = input.LA(4);

                    if ( (LA12_44=='c') ) {
                        int LA12_58 = input.LA(5);

                        if ( (LA12_58=='t') ) {
                            int LA12_72 = input.LA(6);

                            if ( (LA12_72=='i') ) {
                                int LA12_86 = input.LA(7);

                                if ( (LA12_86=='v') ) {
                                    int LA12_98 = input.LA(8);

                                    if ( (LA12_98=='e') ) {
                                        int LA12_107 = input.LA(9);

                                        if ( ((LA12_107>='0' && LA12_107<='9')||(LA12_107>='A' && LA12_107<='Z')||LA12_107=='_'||(LA12_107>='a' && LA12_107<='z')) ) {
                                            alt12=19;
                                        }
                                        else {
                                            alt12=15;}
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            case 'm':
                {
                int LA12_29 = input.LA(3);

                if ( (LA12_29=='p') ) {
                    int LA12_45 = input.LA(4);

                    if ( (LA12_45=='o') ) {
                        int LA12_59 = input.LA(5);

                        if ( (LA12_59=='r') ) {
                            int LA12_73 = input.LA(6);

                            if ( (LA12_73=='t') ) {
                                int LA12_87 = input.LA(7);

                                if ( ((LA12_87>='0' && LA12_87<='9')||(LA12_87>='A' && LA12_87<='Z')||LA12_87=='_'||(LA12_87>='a' && LA12_87<='z')) ) {
                                    alt12=19;
                                }
                                else {
                                    alt12=14;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            default:
                alt12=19;}

            }
            break;
        case 't':
            {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='a') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='b') ) {
                    int LA12_46 = input.LA(4);

                    if ( (LA12_46=='l') ) {
                        int LA12_60 = input.LA(5);

                        if ( (LA12_60=='e') ) {
                            int LA12_74 = input.LA(6);

                            if ( ((LA12_74>='0' && LA12_74<='9')||(LA12_74>='A' && LA12_74<='Z')||LA12_74=='_'||(LA12_74>='a' && LA12_74<='z')) ) {
                                alt12=19;
                            }
                            else {
                                alt12=16;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
            }
            break;
        case 'e':
            {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='x') ) {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='p') ) {
                    int LA12_47 = input.LA(4);

                    if ( (LA12_47=='o') ) {
                        int LA12_61 = input.LA(5);

                        if ( (LA12_61=='r') ) {
                            int LA12_75 = input.LA(6);

                            if ( (LA12_75=='t') ) {
                                int LA12_89 = input.LA(7);

                                if ( ((LA12_89>='0' && LA12_89<='9')||(LA12_89>='A' && LA12_89<='Z')||LA12_89=='_'||(LA12_89>='a' && LA12_89<='z')) ) {
                                    alt12=19;
                                }
                                else {
                                    alt12=17;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '^':
        case '_':
        case 'a':
        case 'b':
        case 'd':
        case 'g':
        case 'h':
        case 'j':
        case 'k':
        case 'l':
        case 'n':
        case 'o':
        case 'q':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt12=19;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=20;
            }
            break;
        case '-':
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt12=21;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=22;
            }
            break;
        case '/':
            {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='*') ) {
                alt12=23;
            }
            else if ( (LA12_18=='/') ) {
                alt12=24;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 18, input);

                throw nvae;
            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 0, input);

            throw nvae;
        }

        switch (alt12) {
            case 1 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:10: T10
                {
                mT10(); 

                }
                break;
            case 2 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:14: T11
                {
                mT11(); 

                }
                break;
            case 3 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:18: T12
                {
                mT12(); 

                }
                break;
            case 4 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:22: T13
                {
                mT13(); 

                }
                break;
            case 5 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:26: T14
                {
                mT14(); 

                }
                break;
            case 6 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:30: T15
                {
                mT15(); 

                }
                break;
            case 7 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:34: T16
                {
                mT16(); 

                }
                break;
            case 8 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:38: T17
                {
                mT17(); 

                }
                break;
            case 9 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:42: T18
                {
                mT18(); 

                }
                break;
            case 10 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:46: T19
                {
                mT19(); 

                }
                break;
            case 11 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:50: T20
                {
                mT20(); 

                }
                break;
            case 12 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:54: T21
                {
                mT21(); 

                }
                break;
            case 13 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:58: T22
                {
                mT22(); 

                }
                break;
            case 14 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:62: T23
                {
                mT23(); 

                }
                break;
            case 15 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:66: T24
                {
                mT24(); 

                }
                break;
            case 16 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:70: T25
                {
                mT25(); 

                }
                break;
            case 17 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:74: T26
                {
                mT26(); 

                }
                break;
            case 18 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:78: T27
                {
                mT27(); 

                }
                break;
            case 19 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:82: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:90: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:102: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 22 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:111: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:119: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 24 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:135: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


 

}