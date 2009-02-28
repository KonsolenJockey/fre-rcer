// $ANTLR 3.0 ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g 2009-02-28 21:35:06

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
    public static final int T28=28;
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
    public static final int Tokens=29;
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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:24:7: ( '{' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:24:7: '{'
            {
            match('{'); 

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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:25:7: ( '}' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:25:7: '}'
            {
            match('}'); 

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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:26:7: ( 'class' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:26:7: 'class'
            {
            match("class"); 


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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:31:7: ( 'EClass' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:31:7: 'EClass'
            {
            match("EClass"); 


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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:32:7: ( 'function' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:32:7: 'function'
            {
            match("function"); 


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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:33:7: ( 'module' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:33:7: 'module'
            {
            match("module"); 


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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:34:7: ( 'request' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:34:7: 'request'
            {
            match("request"); 


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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:35:7: ( 'response' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:35:7: 'response'
            {
            match("response"); 


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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:36:7: ( 'import' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:36:7: 'import'
            {
            match("import"); 


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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:37:7: ( 'inactive' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:37:7: 'inactive'
            {
            match("inactive"); 


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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:38:7: ( 'table' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:38:7: 'table'
            {
            match("table"); 


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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:39:7: ( 'export' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:39:7: 'export'
            {
            match("export"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:40:7: ( 'change' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:40:7: 'change'
            {
            match("change"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start RULE_ID
    public void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2152:3: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2152:3: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2152:3: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2152:4: '^'
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2152:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2158:3: ( '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' )
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
                    new NoViableAltException("2156:1: RULE_STRING : ( '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\'' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2158:3: '\\\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )* '\\\"'
                    {
                    match('\"'); 
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2158:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\\"' ) )*
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
                    	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2158:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2158:54: ~ ( '\\\\' | '\\\"' )
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
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2159:3: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2159:8: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | ~ ( '\\\\' | '\\'' ) )*
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
                    	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2159:10: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2159:54: ~ ( '\\\\' | '\\'' )
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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2165:3: ( ( '-' )? ( '0' .. '9' )+ )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2165:3: ( '-' )? ( '0' .. '9' )+
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2165:3: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2165:4: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2165:9: ( '0' .. '9' )+
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
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2165:10: '0' .. '9'
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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2171:3: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2171:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2171:3: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2177:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2177:3: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2177:8: ( options {greedy=false; } : . )*
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
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2177:36: .
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
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2183:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2183:3: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2183:8: (~ ( '\\n' | '\\r' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFE')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2183:8: ~ ( '\\n' | '\\r' )
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

            // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2183:22: ( '\\r' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:2183:22: '\\r'
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
        // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:10: ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt12=25;
        switch ( input.LA(1) ) {
        case 'p':
            {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='a') ) {
                int LA12_20 = input.LA(3);

                if ( (LA12_20=='c') ) {
                    int LA12_36 = input.LA(4);

                    if ( (LA12_36=='k') ) {
                        int LA12_51 = input.LA(5);

                        if ( (LA12_51=='a') ) {
                            int LA12_66 = input.LA(6);

                            if ( (LA12_66=='g') ) {
                                int LA12_81 = input.LA(7);

                                if ( (LA12_81=='e') ) {
                                    int LA12_96 = input.LA(8);

                                    if ( ((LA12_96>='0' && LA12_96<='9')||(LA12_96>='A' && LA12_96<='Z')||LA12_96=='_'||(LA12_96>='a' && LA12_96<='z')) ) {
                                        alt12=20;
                                    }
                                    else {
                                        alt12=1;}
                                }
                                else {
                                    alt12=20;}
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=20;}
            }
            else {
                alt12=20;}
            }
            break;
        case 's':
            {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='t') ) {
                int LA12_21 = input.LA(3);

                if ( (LA12_21=='r') ) {
                    int LA12_37 = input.LA(4);

                    if ( (LA12_37=='u') ) {
                        int LA12_52 = input.LA(5);

                        if ( (LA12_52=='c') ) {
                            int LA12_67 = input.LA(6);

                            if ( (LA12_67=='t') ) {
                                int LA12_82 = input.LA(7);

                                if ( (LA12_82=='u') ) {
                                    int LA12_97 = input.LA(8);

                                    if ( (LA12_97=='r') ) {
                                        int LA12_109 = input.LA(9);

                                        if ( (LA12_109=='e') ) {
                                            int LA12_115 = input.LA(10);

                                            if ( ((LA12_115>='0' && LA12_115<='9')||(LA12_115>='A' && LA12_115<='Z')||LA12_115=='_'||(LA12_115>='a' && LA12_115<='z')) ) {
                                                alt12=20;
                                            }
                                            else {
                                                alt12=2;}
                                        }
                                        else {
                                            alt12=20;}
                                    }
                                    else {
                                        alt12=20;}
                                }
                                else {
                                    alt12=20;}
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=20;}
            }
            else {
                alt12=20;}
            }
            break;
        case '{':
            {
            alt12=3;
            }
            break;
        case '}':
            {
            alt12=4;
            }
            break;
        case 'c':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA12_22 = input.LA(3);

                if ( (LA12_22=='a') ) {
                    int LA12_38 = input.LA(4);

                    if ( (LA12_38=='s') ) {
                        int LA12_53 = input.LA(5);

                        if ( (LA12_53=='s') ) {
                            int LA12_68 = input.LA(6);

                            if ( ((LA12_68>='0' && LA12_68<='9')||(LA12_68>='A' && LA12_68<='Z')||LA12_68=='_'||(LA12_68>='a' && LA12_68<='z')) ) {
                                alt12=20;
                            }
                            else {
                                alt12=5;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=20;}
                }
                break;
            case 'o':
                {
                int LA12_23 = input.LA(3);

                if ( (LA12_23=='m') ) {
                    int LA12_39 = input.LA(4);

                    if ( (LA12_39=='m') ) {
                        int LA12_54 = input.LA(5);

                        if ( (LA12_54=='e') ) {
                            int LA12_69 = input.LA(6);

                            if ( (LA12_69=='n') ) {
                                int LA12_84 = input.LA(7);

                                if ( (LA12_84=='t') ) {
                                    int LA12_98 = input.LA(8);

                                    if ( ((LA12_98>='0' && LA12_98<='9')||(LA12_98>='A' && LA12_98<='Z')||LA12_98=='_'||(LA12_98>='a' && LA12_98<='z')) ) {
                                        alt12=20;
                                    }
                                    else {
                                        alt12=8;}
                                }
                                else {
                                    alt12=20;}
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=20;}
                }
                break;
            case 'h':
                {
                int LA12_24 = input.LA(3);

                if ( (LA12_24=='a') ) {
                    int LA12_40 = input.LA(4);

                    if ( (LA12_40=='n') ) {
                        int LA12_55 = input.LA(5);

                        if ( (LA12_55=='g') ) {
                            int LA12_70 = input.LA(6);

                            if ( (LA12_70=='e') ) {
                                int LA12_85 = input.LA(7);

                                if ( ((LA12_85>='0' && LA12_85<='9')||(LA12_85>='A' && LA12_85<='Z')||LA12_85=='_'||(LA12_85>='a' && LA12_85<='z')) ) {
                                    alt12=20;
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=20;}
                }
                break;
            default:
                alt12=20;}

            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_25 = input.LA(3);

                if ( (LA12_25=='e') ) {
                    int LA12_41 = input.LA(4);

                    if ( (LA12_41=='l') ) {
                        int LA12_56 = input.LA(5);

                        if ( (LA12_56=='d') ) {
                            int LA12_71 = input.LA(6);

                            if ( ((LA12_71>='0' && LA12_71<='9')||(LA12_71>='A' && LA12_71<='Z')||LA12_71=='_'||(LA12_71>='a' && LA12_71<='z')) ) {
                                alt12=20;
                            }
                            else {
                                alt12=6;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=20;}
                }
                break;
            case 'u':
                {
                int LA12_26 = input.LA(3);

                if ( (LA12_26=='n') ) {
                    int LA12_42 = input.LA(4);

                    if ( (LA12_42=='c') ) {
                        int LA12_57 = input.LA(5);

                        if ( (LA12_57=='t') ) {
                            int LA12_72 = input.LA(6);

                            if ( (LA12_72=='i') ) {
                                int LA12_87 = input.LA(7);

                                if ( (LA12_87=='o') ) {
                                    int LA12_100 = input.LA(8);

                                    if ( (LA12_100=='n') ) {
                                        int LA12_111 = input.LA(9);

                                        if ( ((LA12_111>='0' && LA12_111<='9')||(LA12_111>='A' && LA12_111<='Z')||LA12_111=='_'||(LA12_111>='a' && LA12_111<='z')) ) {
                                            alt12=20;
                                        }
                                        else {
                                            alt12=11;}
                                    }
                                    else {
                                        alt12=20;}
                                }
                                else {
                                    alt12=20;}
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=20;}
                }
                break;
            default:
                alt12=20;}

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
        case 'E':
            {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='C') ) {
                int LA12_27 = input.LA(3);

                if ( (LA12_27=='l') ) {
                    int LA12_43 = input.LA(4);

                    if ( (LA12_43=='a') ) {
                        int LA12_58 = input.LA(5);

                        if ( (LA12_58=='s') ) {
                            int LA12_73 = input.LA(6);

                            if ( (LA12_73=='s') ) {
                                int LA12_88 = input.LA(7);

                                if ( ((LA12_88>='0' && LA12_88<='9')||(LA12_88>='A' && LA12_88<='Z')||LA12_88=='_'||(LA12_88>='a' && LA12_88<='z')) ) {
                                    alt12=20;
                                }
                                else {
                                    alt12=10;}
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=20;}
            }
            else {
                alt12=20;}
            }
            break;
        case 'm':
            {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='o') ) {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='d') ) {
                    int LA12_44 = input.LA(4);

                    if ( (LA12_44=='u') ) {
                        int LA12_59 = input.LA(5);

                        if ( (LA12_59=='l') ) {
                            int LA12_74 = input.LA(6);

                            if ( (LA12_74=='e') ) {
                                int LA12_89 = input.LA(7);

                                if ( ((LA12_89>='0' && LA12_89<='9')||(LA12_89>='A' && LA12_89<='Z')||LA12_89=='_'||(LA12_89>='a' && LA12_89<='z')) ) {
                                    alt12=20;
                                }
                                else {
                                    alt12=12;}
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=20;}
            }
            else {
                alt12=20;}
            }
            break;
        case 'r':
            {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='e') ) {
                switch ( input.LA(3) ) {
                case 's':
                    {
                    int LA12_45 = input.LA(4);

                    if ( (LA12_45=='p') ) {
                        int LA12_60 = input.LA(5);

                        if ( (LA12_60=='o') ) {
                            int LA12_75 = input.LA(6);

                            if ( (LA12_75=='n') ) {
                                int LA12_90 = input.LA(7);

                                if ( (LA12_90=='s') ) {
                                    int LA12_103 = input.LA(8);

                                    if ( (LA12_103=='e') ) {
                                        int LA12_112 = input.LA(9);

                                        if ( ((LA12_112>='0' && LA12_112<='9')||(LA12_112>='A' && LA12_112<='Z')||LA12_112=='_'||(LA12_112>='a' && LA12_112<='z')) ) {
                                            alt12=20;
                                        }
                                        else {
                                            alt12=14;}
                                    }
                                    else {
                                        alt12=20;}
                                }
                                else {
                                    alt12=20;}
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                    }
                    break;
                case 'q':
                    {
                    int LA12_46 = input.LA(4);

                    if ( (LA12_46=='u') ) {
                        int LA12_61 = input.LA(5);

                        if ( (LA12_61=='e') ) {
                            int LA12_76 = input.LA(6);

                            if ( (LA12_76=='s') ) {
                                int LA12_91 = input.LA(7);

                                if ( (LA12_91=='t') ) {
                                    int LA12_104 = input.LA(8);

                                    if ( ((LA12_104>='0' && LA12_104<='9')||(LA12_104>='A' && LA12_104<='Z')||LA12_104=='_'||(LA12_104>='a' && LA12_104<='z')) ) {
                                        alt12=20;
                                    }
                                    else {
                                        alt12=13;}
                                }
                                else {
                                    alt12=20;}
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                    }
                    break;
                default:
                    alt12=20;}

            }
            else {
                alt12=20;}
            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='a') ) {
                    int LA12_47 = input.LA(4);

                    if ( (LA12_47=='c') ) {
                        int LA12_62 = input.LA(5);

                        if ( (LA12_62=='t') ) {
                            int LA12_77 = input.LA(6);

                            if ( (LA12_77=='i') ) {
                                int LA12_92 = input.LA(7);

                                if ( (LA12_92=='v') ) {
                                    int LA12_105 = input.LA(8);

                                    if ( (LA12_105=='e') ) {
                                        int LA12_114 = input.LA(9);

                                        if ( ((LA12_114>='0' && LA12_114<='9')||(LA12_114>='A' && LA12_114<='Z')||LA12_114=='_'||(LA12_114>='a' && LA12_114<='z')) ) {
                                            alt12=20;
                                        }
                                        else {
                                            alt12=16;}
                                    }
                                    else {
                                        alt12=20;}
                                }
                                else {
                                    alt12=20;}
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=20;}
                }
                break;
            case 'm':
                {
                int LA12_31 = input.LA(3);

                if ( (LA12_31=='p') ) {
                    int LA12_48 = input.LA(4);

                    if ( (LA12_48=='o') ) {
                        int LA12_63 = input.LA(5);

                        if ( (LA12_63=='r') ) {
                            int LA12_78 = input.LA(6);

                            if ( (LA12_78=='t') ) {
                                int LA12_93 = input.LA(7);

                                if ( ((LA12_93>='0' && LA12_93<='9')||(LA12_93>='A' && LA12_93<='Z')||LA12_93=='_'||(LA12_93>='a' && LA12_93<='z')) ) {
                                    alt12=20;
                                }
                                else {
                                    alt12=15;}
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=20;}
                }
                break;
            default:
                alt12=20;}

            }
            break;
        case 't':
            {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='a') ) {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='b') ) {
                    int LA12_49 = input.LA(4);

                    if ( (LA12_49=='l') ) {
                        int LA12_64 = input.LA(5);

                        if ( (LA12_64=='e') ) {
                            int LA12_79 = input.LA(6);

                            if ( ((LA12_79>='0' && LA12_79<='9')||(LA12_79>='A' && LA12_79<='Z')||LA12_79=='_'||(LA12_79>='a' && LA12_79<='z')) ) {
                                alt12=20;
                            }
                            else {
                                alt12=17;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=20;}
            }
            else {
                alt12=20;}
            }
            break;
        case 'e':
            {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='x') ) {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='p') ) {
                    int LA12_50 = input.LA(4);

                    if ( (LA12_50=='o') ) {
                        int LA12_65 = input.LA(5);

                        if ( (LA12_65=='r') ) {
                            int LA12_80 = input.LA(6);

                            if ( (LA12_80=='t') ) {
                                int LA12_95 = input.LA(7);

                                if ( ((LA12_95>='0' && LA12_95<='9')||(LA12_95>='A' && LA12_95<='Z')||LA12_95=='_'||(LA12_95>='a' && LA12_95<='z')) ) {
                                    alt12=20;
                                }
                                else {
                                    alt12=18;}
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=20;}
                    }
                    else {
                        alt12=20;}
                }
                else {
                    alt12=20;}
            }
            else {
                alt12=20;}
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
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
            alt12=20;
            }
            break;
        case '\"':
        case '\'':
            {
            alt12=21;
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
            alt12=22;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt12=23;
            }
            break;
        case '/':
            {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='/') ) {
                alt12=25;
            }
            else if ( (LA12_19=='*') ) {
                alt12=24;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 19, input);

                throw nvae;
            }
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | RULE_ID | RULE_STRING | RULE_INT | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );", 12, 0, input);

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
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:82: T28
                {
                mT28(); 

                }
                break;
            case 20 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:86: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:94: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:106: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:115: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:123: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 25 :
                // ..//net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/rfcgen.g:1:139: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


 

}