package net.sf.rcer.rfcgen.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRFCMappingLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int EOF=-1;
    public static final int T24=24;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_INT=6;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T43=43;
    public static final int Tokens=44;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=4;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int T15=15;
    public static final int RULE_WS=9;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalRFCMappingLexer() {;} 
    public InternalRFCMappingLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:10:5: ( 'package' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:10:7: 'package'
            {
            match("package"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:11:5: ( 'structure' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:11:7: 'structure'
            {
            match("structure"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:12:5: ( '{' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:12:7: '{'
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
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:13:5: ( '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:13:7: '}'
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
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:14:5: ( 'class' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:14:7: 'class'
            {
            match("class"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:15:5: ( ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:15:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:16:5: ( 'field' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:16:7: 'field'
            {
            match("field"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:17:5: ( '=' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:17:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:18:5: ( 'inactive' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:18:7: 'inactive'
            {
            match("inactive"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:19:5: ( 'comment' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:19:7: 'comment'
            {
            match("comment"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:20:5: ( 'function' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:20:7: 'function'
            {
            match("function"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:21:5: ( 'module' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:21:7: 'module'
            {
            match("module"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:22:5: ( 'request' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:22:7: 'request'
            {
            match("request"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:23:5: ( 'response' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:23:7: 'response'
            {
            match("response"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:24:5: ( 'importing' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:24:7: 'importing'
            {
            match("importing"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:25:5: ( 'table' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:25:7: 'table'
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
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:26:5: ( 'exporting' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:26:7: 'exporting'
            {
            match("exporting"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:27:5: ( 'changing' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:27:7: 'changing'
            {
            match("changing"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:28:5: ( 'BigDecimal' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:28:7: 'BigDecimal'
            {
            match("BigDecimal"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:29:5: ( 'BigInteger' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:29:7: 'BigInteger'
            {
            match("BigInteger"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:30:5: ( 'Boolean' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:30:7: 'Boolean'
            {
            match("Boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:31:5: ( 'Byte' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:31:7: 'Byte'
            {
            match("Byte"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:32:5: ( 'ByteArray' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:32:7: 'ByteArray'
            {
            match("ByteArray"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:33:5: ( 'Char' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:33:7: 'Char'
            {
            match("Char"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:34:5: ( 'CharArray' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:34:7: 'CharArray'
            {
            match("CharArray"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:35:5: ( 'Date' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:35:7: 'Date'
            {
            match("Date"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:36:5: ( 'Double' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:36:7: 'Double'
            {
            match("Double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:37:5: ( 'Float' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:37:7: 'Float'
            {
            match("Float"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:38:5: ( 'Integer' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:38:7: 'Integer'
            {
            match("Integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:39:5: ( 'Long' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:39:7: 'Long'
            {
            match("Long"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:40:5: ( 'Short' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:40:7: 'Short'
            {
            match("Short"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:41:5: ( 'String' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:41:7: 'String'
            {
            match("String"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:42:5: ( 'Time' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:42:7: 'Time'
            {
            match("Time"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2326:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2326:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2326:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2326:11: '^'
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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2326:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:
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

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2328:10: ( ( '0' .. '9' )+ )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2328:12: ( '0' .. '9' )+
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2328:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2328:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2330:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2330:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2330:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("2330:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2330:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2330:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2330:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2330:62: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2330:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2330:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2330:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2330:129: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2332:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2332:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2332:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2332:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2334:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2334:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2334:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2334:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2334:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2334:41: ( '\\r' )? '\\n'
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2334:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2334:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2336:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2336:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2336:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2338:16: ( . )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2338:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=40;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='p') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='a') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='c') ) {
                    int LA12_65 = input.LA(4);

                    if ( (LA12_65=='k') ) {
                        int LA12_91 = input.LA(5);

                        if ( (LA12_91=='a') ) {
                            int LA12_118 = input.LA(6);

                            if ( (LA12_118=='g') ) {
                                int LA12_147 = input.LA(7);

                                if ( (LA12_147=='e') ) {
                                    int LA12_171 = input.LA(8);

                                    if ( ((LA12_171>='0' && LA12_171<='9')||(LA12_171>='A' && LA12_171<='Z')||LA12_171=='_'||(LA12_171>='a' && LA12_171<='z')) ) {
                                        alt12=34;
                                    }
                                    else {
                                        alt12=1;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='s') ) {
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='t') ) {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='r') ) {
                    int LA12_66 = input.LA(4);

                    if ( (LA12_66=='u') ) {
                        int LA12_92 = input.LA(5);

                        if ( (LA12_92=='c') ) {
                            int LA12_119 = input.LA(6);

                            if ( (LA12_119=='t') ) {
                                int LA12_148 = input.LA(7);

                                if ( (LA12_148=='u') ) {
                                    int LA12_172 = input.LA(8);

                                    if ( (LA12_172=='r') ) {
                                        int LA12_191 = input.LA(9);

                                        if ( (LA12_191=='e') ) {
                                            int LA12_206 = input.LA(10);

                                            if ( ((LA12_206>='0' && LA12_206<='9')||(LA12_206>='A' && LA12_206<='Z')||LA12_206=='_'||(LA12_206>='a' && LA12_206<='z')) ) {
                                                alt12=34;
                                            }
                                            else {
                                                alt12=2;}
                                        }
                                        else {
                                            alt12=34;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=3;
        }
        else if ( (LA12_0=='}') ) {
            alt12=4;
        }
        else if ( (LA12_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='m') ) {
                    int LA12_67 = input.LA(4);

                    if ( (LA12_67=='m') ) {
                        int LA12_93 = input.LA(5);

                        if ( (LA12_93=='e') ) {
                            int LA12_120 = input.LA(6);

                            if ( (LA12_120=='n') ) {
                                int LA12_149 = input.LA(7);

                                if ( (LA12_149=='t') ) {
                                    int LA12_173 = input.LA(8);

                                    if ( ((LA12_173>='0' && LA12_173<='9')||(LA12_173>='A' && LA12_173<='Z')||LA12_173=='_'||(LA12_173>='a' && LA12_173<='z')) ) {
                                        alt12=34;
                                    }
                                    else {
                                        alt12=10;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            case 'l':
                {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='a') ) {
                    int LA12_68 = input.LA(4);

                    if ( (LA12_68=='s') ) {
                        int LA12_94 = input.LA(5);

                        if ( (LA12_94=='s') ) {
                            int LA12_121 = input.LA(6);

                            if ( ((LA12_121>='0' && LA12_121<='9')||(LA12_121>='A' && LA12_121<='Z')||LA12_121=='_'||(LA12_121>='a' && LA12_121<='z')) ) {
                                alt12=34;
                            }
                            else {
                                alt12=5;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            case 'h':
                {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='a') ) {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='n') ) {
                        int LA12_95 = input.LA(5);

                        if ( (LA12_95=='g') ) {
                            int LA12_122 = input.LA(6);

                            if ( (LA12_122=='i') ) {
                                int LA12_151 = input.LA(7);

                                if ( (LA12_151=='n') ) {
                                    int LA12_174 = input.LA(8);

                                    if ( (LA12_174=='g') ) {
                                        int LA12_193 = input.LA(9);

                                        if ( ((LA12_193>='0' && LA12_193<='9')||(LA12_193>='A' && LA12_193<='Z')||LA12_193=='_'||(LA12_193>='a' && LA12_193<='z')) ) {
                                            alt12=34;
                                        }
                                        else {
                                            alt12=18;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            default:
                alt12=34;}

        }
        else if ( (LA12_0==';') ) {
            alt12=6;
        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='n') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='c') ) {
                        int LA12_96 = input.LA(5);

                        if ( (LA12_96=='t') ) {
                            int LA12_123 = input.LA(6);

                            if ( (LA12_123=='i') ) {
                                int LA12_152 = input.LA(7);

                                if ( (LA12_152=='o') ) {
                                    int LA12_175 = input.LA(8);

                                    if ( (LA12_175=='n') ) {
                                        int LA12_194 = input.LA(9);

                                        if ( ((LA12_194>='0' && LA12_194<='9')||(LA12_194>='A' && LA12_194<='Z')||LA12_194=='_'||(LA12_194>='a' && LA12_194<='z')) ) {
                                            alt12=34;
                                        }
                                        else {
                                            alt12=11;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            case 'i':
                {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='e') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='l') ) {
                        int LA12_97 = input.LA(5);

                        if ( (LA12_97=='d') ) {
                            int LA12_124 = input.LA(6);

                            if ( ((LA12_124>='0' && LA12_124<='9')||(LA12_124>='A' && LA12_124<='Z')||LA12_124=='_'||(LA12_124>='a' && LA12_124<='z')) ) {
                                alt12=34;
                            }
                            else {
                                alt12=7;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            default:
                alt12=34;}

        }
        else if ( (LA12_0=='=') ) {
            alt12=8;
        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='a') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='c') ) {
                        int LA12_98 = input.LA(5);

                        if ( (LA12_98=='t') ) {
                            int LA12_125 = input.LA(6);

                            if ( (LA12_125=='i') ) {
                                int LA12_154 = input.LA(7);

                                if ( (LA12_154=='v') ) {
                                    int LA12_176 = input.LA(8);

                                    if ( (LA12_176=='e') ) {
                                        int LA12_195 = input.LA(9);

                                        if ( ((LA12_195>='0' && LA12_195<='9')||(LA12_195>='A' && LA12_195<='Z')||LA12_195=='_'||(LA12_195>='a' && LA12_195<='z')) ) {
                                            alt12=34;
                                        }
                                        else {
                                            alt12=9;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            case 'm':
                {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='p') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='o') ) {
                        int LA12_99 = input.LA(5);

                        if ( (LA12_99=='r') ) {
                            int LA12_126 = input.LA(6);

                            if ( (LA12_126=='t') ) {
                                int LA12_155 = input.LA(7);

                                if ( (LA12_155=='i') ) {
                                    int LA12_177 = input.LA(8);

                                    if ( (LA12_177=='n') ) {
                                        int LA12_196 = input.LA(9);

                                        if ( (LA12_196=='g') ) {
                                            int LA12_210 = input.LA(10);

                                            if ( ((LA12_210>='0' && LA12_210<='9')||(LA12_210>='A' && LA12_210<='Z')||LA12_210=='_'||(LA12_210>='a' && LA12_210<='z')) ) {
                                                alt12=34;
                                            }
                                            else {
                                                alt12=15;}
                                        }
                                        else {
                                            alt12=34;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            default:
                alt12=34;}

        }
        else if ( (LA12_0=='m') ) {
            int LA12_10 = input.LA(2);

            if ( (LA12_10=='o') ) {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='d') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='u') ) {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='l') ) {
                            int LA12_127 = input.LA(6);

                            if ( (LA12_127=='e') ) {
                                int LA12_156 = input.LA(7);

                                if ( ((LA12_156>='0' && LA12_156<='9')||(LA12_156>='A' && LA12_156<='Z')||LA12_156=='_'||(LA12_156>='a' && LA12_156<='z')) ) {
                                    alt12=34;
                                }
                                else {
                                    alt12=12;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='r') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='e') ) {
                switch ( input.LA(3) ) {
                case 's':
                    {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='p') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='o') ) {
                            int LA12_128 = input.LA(6);

                            if ( (LA12_128=='n') ) {
                                int LA12_157 = input.LA(7);

                                if ( (LA12_157=='s') ) {
                                    int LA12_179 = input.LA(8);

                                    if ( (LA12_179=='e') ) {
                                        int LA12_197 = input.LA(9);

                                        if ( ((LA12_197>='0' && LA12_197<='9')||(LA12_197>='A' && LA12_197<='Z')||LA12_197=='_'||(LA12_197>='a' && LA12_197<='z')) ) {
                                            alt12=34;
                                        }
                                        else {
                                            alt12=14;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                    }
                    break;
                case 'q':
                    {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='u') ) {
                        int LA12_102 = input.LA(5);

                        if ( (LA12_102=='e') ) {
                            int LA12_129 = input.LA(6);

                            if ( (LA12_129=='s') ) {
                                int LA12_158 = input.LA(7);

                                if ( (LA12_158=='t') ) {
                                    int LA12_180 = input.LA(8);

                                    if ( ((LA12_180>='0' && LA12_180<='9')||(LA12_180>='A' && LA12_180<='Z')||LA12_180=='_'||(LA12_180>='a' && LA12_180<='z')) ) {
                                        alt12=34;
                                    }
                                    else {
                                        alt12=13;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                    }
                    break;
                default:
                    alt12=34;}

            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='a') ) {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='b') ) {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='l') ) {
                        int LA12_103 = input.LA(5);

                        if ( (LA12_103=='e') ) {
                            int LA12_130 = input.LA(6);

                            if ( ((LA12_130>='0' && LA12_130<='9')||(LA12_130>='A' && LA12_130<='Z')||LA12_130=='_'||(LA12_130>='a' && LA12_130<='z')) ) {
                                alt12=34;
                            }
                            else {
                                alt12=16;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='e') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='x') ) {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='p') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='o') ) {
                        int LA12_104 = input.LA(5);

                        if ( (LA12_104=='r') ) {
                            int LA12_131 = input.LA(6);

                            if ( (LA12_131=='t') ) {
                                int LA12_160 = input.LA(7);

                                if ( (LA12_160=='i') ) {
                                    int LA12_181 = input.LA(8);

                                    if ( (LA12_181=='n') ) {
                                        int LA12_199 = input.LA(9);

                                        if ( (LA12_199=='g') ) {
                                            int LA12_212 = input.LA(10);

                                            if ( ((LA12_212>='0' && LA12_212<='9')||(LA12_212>='A' && LA12_212<='Z')||LA12_212=='_'||(LA12_212>='a' && LA12_212<='z')) ) {
                                                alt12=34;
                                            }
                                            else {
                                                alt12=17;}
                                        }
                                        else {
                                            alt12=34;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='B') ) {
            switch ( input.LA(2) ) {
            case 'y':
                {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='t') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='e') ) {
                        switch ( input.LA(5) ) {
                        case 'A':
                            {
                            int LA12_132 = input.LA(6);

                            if ( (LA12_132=='r') ) {
                                int LA12_161 = input.LA(7);

                                if ( (LA12_161=='r') ) {
                                    int LA12_182 = input.LA(8);

                                    if ( (LA12_182=='a') ) {
                                        int LA12_200 = input.LA(9);

                                        if ( (LA12_200=='y') ) {
                                            int LA12_213 = input.LA(10);

                                            if ( ((LA12_213>='0' && LA12_213<='9')||(LA12_213>='A' && LA12_213<='Z')||LA12_213=='_'||(LA12_213>='a' && LA12_213<='z')) ) {
                                                alt12=34;
                                            }
                                            else {
                                                alt12=23;}
                                        }
                                        else {
                                            alt12=34;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                            }
                            break;
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
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt12=34;
                            }
                            break;
                        default:
                            alt12=22;}

                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            case 'i':
                {
                int LA12_49 = input.LA(3);

                if ( (LA12_49=='g') ) {
                    switch ( input.LA(4) ) {
                    case 'D':
                        {
                        int LA12_106 = input.LA(5);

                        if ( (LA12_106=='e') ) {
                            int LA12_134 = input.LA(6);

                            if ( (LA12_134=='c') ) {
                                int LA12_162 = input.LA(7);

                                if ( (LA12_162=='i') ) {
                                    int LA12_183 = input.LA(8);

                                    if ( (LA12_183=='m') ) {
                                        int LA12_201 = input.LA(9);

                                        if ( (LA12_201=='a') ) {
                                            int LA12_214 = input.LA(10);

                                            if ( (LA12_214=='l') ) {
                                                int LA12_221 = input.LA(11);

                                                if ( ((LA12_221>='0' && LA12_221<='9')||(LA12_221>='A' && LA12_221<='Z')||LA12_221=='_'||(LA12_221>='a' && LA12_221<='z')) ) {
                                                    alt12=34;
                                                }
                                                else {
                                                    alt12=19;}
                                            }
                                            else {
                                                alt12=34;}
                                        }
                                        else {
                                            alt12=34;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                        }
                        break;
                    case 'I':
                        {
                        int LA12_107 = input.LA(5);

                        if ( (LA12_107=='n') ) {
                            int LA12_135 = input.LA(6);

                            if ( (LA12_135=='t') ) {
                                int LA12_163 = input.LA(7);

                                if ( (LA12_163=='e') ) {
                                    int LA12_184 = input.LA(8);

                                    if ( (LA12_184=='g') ) {
                                        int LA12_202 = input.LA(9);

                                        if ( (LA12_202=='e') ) {
                                            int LA12_215 = input.LA(10);

                                            if ( (LA12_215=='r') ) {
                                                int LA12_222 = input.LA(11);

                                                if ( ((LA12_222>='0' && LA12_222<='9')||(LA12_222>='A' && LA12_222<='Z')||LA12_222=='_'||(LA12_222>='a' && LA12_222<='z')) ) {
                                                    alt12=34;
                                                }
                                                else {
                                                    alt12=20;}
                                            }
                                            else {
                                                alt12=34;}
                                        }
                                        else {
                                            alt12=34;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                        }
                        break;
                    default:
                        alt12=34;}

                }
                else {
                    alt12=34;}
                }
                break;
            case 'o':
                {
                int LA12_50 = input.LA(3);

                if ( (LA12_50=='o') ) {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='l') ) {
                        int LA12_108 = input.LA(5);

                        if ( (LA12_108=='e') ) {
                            int LA12_136 = input.LA(6);

                            if ( (LA12_136=='a') ) {
                                int LA12_164 = input.LA(7);

                                if ( (LA12_164=='n') ) {
                                    int LA12_185 = input.LA(8);

                                    if ( ((LA12_185>='0' && LA12_185<='9')||(LA12_185>='A' && LA12_185<='Z')||LA12_185=='_'||(LA12_185>='a' && LA12_185<='z')) ) {
                                        alt12=34;
                                    }
                                    else {
                                        alt12=21;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            default:
                alt12=34;}

        }
        else if ( (LA12_0=='C') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='h') ) {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='a') ) {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='r') ) {
                        switch ( input.LA(5) ) {
                        case 'A':
                            {
                            int LA12_137 = input.LA(6);

                            if ( (LA12_137=='r') ) {
                                int LA12_165 = input.LA(7);

                                if ( (LA12_165=='r') ) {
                                    int LA12_186 = input.LA(8);

                                    if ( (LA12_186=='a') ) {
                                        int LA12_204 = input.LA(9);

                                        if ( (LA12_204=='y') ) {
                                            int LA12_216 = input.LA(10);

                                            if ( ((LA12_216>='0' && LA12_216<='9')||(LA12_216>='A' && LA12_216<='Z')||LA12_216=='_'||(LA12_216>='a' && LA12_216<='z')) ) {
                                                alt12=34;
                                            }
                                            else {
                                                alt12=25;}
                                        }
                                        else {
                                            alt12=34;}
                                    }
                                    else {
                                        alt12=34;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                            }
                            break;
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
                        case '_':
                        case 'a':
                        case 'b':
                        case 'c':
                        case 'd':
                        case 'e':
                        case 'f':
                        case 'g':
                        case 'h':
                        case 'i':
                        case 'j':
                        case 'k':
                        case 'l':
                        case 'm':
                        case 'n':
                        case 'o':
                        case 'p':
                        case 'q':
                        case 'r':
                        case 's':
                        case 't':
                        case 'u':
                        case 'v':
                        case 'w':
                        case 'x':
                        case 'y':
                        case 'z':
                            {
                            alt12=34;
                            }
                            break;
                        default:
                            alt12=24;}

                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='t') ) {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='e') ) {
                        int LA12_110 = input.LA(5);

                        if ( ((LA12_110>='0' && LA12_110<='9')||(LA12_110>='A' && LA12_110<='Z')||LA12_110=='_'||(LA12_110>='a' && LA12_110<='z')) ) {
                            alt12=34;
                        }
                        else {
                            alt12=26;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            case 'o':
                {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='u') ) {
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='b') ) {
                        int LA12_111 = input.LA(5);

                        if ( (LA12_111=='l') ) {
                            int LA12_140 = input.LA(6);

                            if ( (LA12_140=='e') ) {
                                int LA12_166 = input.LA(7);

                                if ( ((LA12_166>='0' && LA12_166<='9')||(LA12_166>='A' && LA12_166<='Z')||LA12_166=='_'||(LA12_166>='a' && LA12_166<='z')) ) {
                                    alt12=34;
                                }
                                else {
                                    alt12=27;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            default:
                alt12=34;}

        }
        else if ( (LA12_0=='F') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='l') ) {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='o') ) {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='a') ) {
                        int LA12_112 = input.LA(5);

                        if ( (LA12_112=='t') ) {
                            int LA12_141 = input.LA(6);

                            if ( ((LA12_141>='0' && LA12_141<='9')||(LA12_141>='A' && LA12_141<='Z')||LA12_141=='_'||(LA12_141>='a' && LA12_141<='z')) ) {
                                alt12=34;
                            }
                            else {
                                alt12=28;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='I') ) {
            int LA12_18 = input.LA(2);

            if ( (LA12_18=='n') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='t') ) {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='e') ) {
                        int LA12_113 = input.LA(5);

                        if ( (LA12_113=='g') ) {
                            int LA12_142 = input.LA(6);

                            if ( (LA12_142=='e') ) {
                                int LA12_168 = input.LA(7);

                                if ( (LA12_168=='r') ) {
                                    int LA12_188 = input.LA(8);

                                    if ( ((LA12_188>='0' && LA12_188<='9')||(LA12_188>='A' && LA12_188<='Z')||LA12_188=='_'||(LA12_188>='a' && LA12_188<='z')) ) {
                                        alt12=34;
                                    }
                                    else {
                                        alt12=29;}
                                }
                                else {
                                    alt12=34;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='L') ) {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='o') ) {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='n') ) {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='g') ) {
                        int LA12_114 = input.LA(5);

                        if ( ((LA12_114>='0' && LA12_114<='9')||(LA12_114>='A' && LA12_114<='Z')||LA12_114=='_'||(LA12_114>='a' && LA12_114<='z')) ) {
                            alt12=34;
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='S') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='r') ) {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='i') ) {
                        int LA12_115 = input.LA(5);

                        if ( (LA12_115=='n') ) {
                            int LA12_144 = input.LA(6);

                            if ( (LA12_144=='g') ) {
                                int LA12_169 = input.LA(7);

                                if ( ((LA12_169>='0' && LA12_169<='9')||(LA12_169>='A' && LA12_169<='Z')||LA12_169=='_'||(LA12_169>='a' && LA12_169<='z')) ) {
                                    alt12=34;
                                }
                                else {
                                    alt12=32;}
                            }
                            else {
                                alt12=34;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            case 'h':
                {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='o') ) {
                    int LA12_89 = input.LA(4);

                    if ( (LA12_89=='r') ) {
                        int LA12_116 = input.LA(5);

                        if ( (LA12_116=='t') ) {
                            int LA12_145 = input.LA(6);

                            if ( ((LA12_145>='0' && LA12_145<='9')||(LA12_145>='A' && LA12_145<='Z')||LA12_145=='_'||(LA12_145>='a' && LA12_145<='z')) ) {
                                alt12=34;
                            }
                            else {
                                alt12=31;}
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
                }
                break;
            default:
                alt12=34;}

        }
        else if ( (LA12_0=='T') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='i') ) {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='m') ) {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='e') ) {
                        int LA12_117 = input.LA(5);

                        if ( ((LA12_117>='0' && LA12_117<='9')||(LA12_117>='A' && LA12_117<='Z')||LA12_117=='_'||(LA12_117>='a' && LA12_117<='z')) ) {
                            alt12=34;
                        }
                        else {
                            alt12=33;}
                    }
                    else {
                        alt12=34;}
                }
                else {
                    alt12=34;}
            }
            else {
                alt12=34;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_22 = input.LA(2);

            if ( ((LA12_22>='A' && LA12_22<='Z')||LA12_22=='_'||(LA12_22>='a' && LA12_22<='z')) ) {
                alt12=34;
            }
            else {
                alt12=40;}
        }
        else if ( (LA12_0=='A'||LA12_0=='E'||(LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='R')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||LA12_0=='d'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='o')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='z')) ) {
            alt12=34;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=35;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_25 = input.LA(2);

            if ( ((LA12_25>='\u0000' && LA12_25<='\uFFFE')) ) {
                alt12=36;
            }
            else {
                alt12=40;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_26 = input.LA(2);

            if ( ((LA12_26>='\u0000' && LA12_26<='\uFFFE')) ) {
                alt12=36;
            }
            else {
                alt12=40;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=38;
                }
                break;
            case '*':
                {
                alt12=37;
                }
                break;
            default:
                alt12=40;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=39;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||LA12_0==':'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=40;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:142: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:150: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:159: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:171: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:187: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:203: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:211: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}