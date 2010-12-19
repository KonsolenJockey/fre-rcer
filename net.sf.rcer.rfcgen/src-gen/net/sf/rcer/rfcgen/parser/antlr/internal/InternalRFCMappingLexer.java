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
    public static final int Tokens=48;
    public static final int RULE_SL_COMMENT=8;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int RULE_ML_COMMENT=7;
    public static final int T44=44;
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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:11:5: ( '.' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:11:7: '.'
            {
            match('.'); 

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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:12:5: ( 'import' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:12:7: 'import'
            {
            match("import"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:13:5: ( 'as' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:13:7: 'as'
            {
            match("as"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:14:5: ( ';' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:14:7: ';'
            {
            match(';'); 

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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:15:5: ( 'structure' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:15:7: 'structure'
            {
            match("structure"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:16:5: ( '{' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:16:7: '{'
            {
            match('{'); 

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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:17:5: ( '}' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:17:7: '}'
            {
            match('}'); 

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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:18:5: ( 'class' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:18:7: 'class'
            {
            match("class"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:19:5: ( 'field' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:19:7: 'field'
            {
            match("field"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:20:5: ( '=' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:20:7: '='
            {
            match('='); 

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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:21:5: ( 'inactive' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:21:7: 'inactive'
            {
            match("inactive"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:22:5: ( 'comment' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:22:7: 'comment'
            {
            match("comment"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:23:5: ( 'function' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:23:7: 'function'
            {
            match("function"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:24:5: ( 'module' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:24:7: 'module'
            {
            match("module"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:25:5: ( 'request' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:25:7: 'request'
            {
            match("request"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:26:5: ( 'response' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:26:7: 'response'
            {
            match("response"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:27:5: ( 'importing' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:27:7: 'importing'
            {
            match("importing"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:28:5: ( 'external' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:28:7: 'external'
            {
            match("external"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:29:5: ( 'table' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:29:7: 'table'
            {
            match("table"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:30:5: ( 'exporting' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:30:7: 'exporting'
            {
            match("exporting"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:31:5: ( 'changing' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:31:7: 'changing'
            {
            match("changing"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:32:5: ( 'BigDecimal' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:32:7: 'BigDecimal'
            {
            match("BigDecimal"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:33:5: ( 'BigInteger' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:33:7: 'BigInteger'
            {
            match("BigInteger"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:34:5: ( 'Boolean' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:34:7: 'Boolean'
            {
            match("Boolean"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:35:5: ( 'Byte' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:35:7: 'Byte'
            {
            match("Byte"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:36:5: ( 'ByteArray' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:36:7: 'ByteArray'
            {
            match("ByteArray"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:37:5: ( 'Char' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:37:7: 'Char'
            {
            match("Char"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:38:5: ( 'CharArray' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:38:7: 'CharArray'
            {
            match("CharArray"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:39:5: ( 'Date' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:39:7: 'Date'
            {
            match("Date"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:40:5: ( 'Double' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:40:7: 'Double'
            {
            match("Double"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:41:5: ( 'Float' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:41:7: 'Float'
            {
            match("Float"); 


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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:42:5: ( 'Integer' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:42:7: 'Integer'
            {
            match("Integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:43:5: ( 'Long' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:43:7: 'Long'
            {
            match("Long"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:44:5: ( 'Short' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:44:7: 'Short'
            {
            match("Short"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:45:5: ( 'String' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:45:7: 'String'
            {
            match("String"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:46:5: ( 'Time' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:46:7: 'Time'
            {
            match("Time"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2947:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2947:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2947:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2947:11: '^'
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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2947:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2949:10: ( ( '0' .. '9' )+ )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2949:12: ( '0' .. '9' )+
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2949:12: ( '0' .. '9' )+
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
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2949:13: '0' .. '9'
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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2951:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2951:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2951:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("2951:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2951:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2951:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2951:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2951:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2951:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2951:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2951:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2951:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2953:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2953:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2953:24: ( options {greedy=false; } : . )*
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
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2953:52: .
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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2955:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2955:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2955:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2955:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2955:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2955:41: ( '\\r' )? '\\n'
                    {
                    // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2955:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2955:41: '\\r'
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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2957:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2957:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2957:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2959:16: ( . )
            // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:2959:18: .
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
        // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=44;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='p') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='a') ) {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='c') ) {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='k') ) {
                        int LA12_97 = input.LA(5);

                        if ( (LA12_97=='a') ) {
                            int LA12_125 = input.LA(6);

                            if ( (LA12_125=='g') ) {
                                int LA12_155 = input.LA(7);

                                if ( (LA12_155=='e') ) {
                                    int LA12_180 = input.LA(8);

                                    if ( ((LA12_180>='0' && LA12_180<='9')||(LA12_180>='A' && LA12_180<='Z')||LA12_180=='_'||(LA12_180>='a' && LA12_180<='z')) ) {
                                        alt12=38;
                                    }
                                    else {
                                        alt12=1;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=2;
        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA12_35 = input.LA(3);

                if ( (LA12_35=='p') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='o') ) {
                        int LA12_98 = input.LA(5);

                        if ( (LA12_98=='r') ) {
                            int LA12_126 = input.LA(6);

                            if ( (LA12_126=='t') ) {
                                switch ( input.LA(7) ) {
                                case 'i':
                                    {
                                    int LA12_181 = input.LA(8);

                                    if ( (LA12_181=='n') ) {
                                        int LA12_202 = input.LA(9);

                                        if ( (LA12_202=='g') ) {
                                            int LA12_218 = input.LA(10);

                                            if ( ((LA12_218>='0' && LA12_218<='9')||(LA12_218>='A' && LA12_218<='Z')||LA12_218=='_'||(LA12_218>='a' && LA12_218<='z')) ) {
                                                alt12=38;
                                            }
                                            else {
                                                alt12=18;}
                                        }
                                        else {
                                            alt12=38;}
                                    }
                                    else {
                                        alt12=38;}
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
                                case '_':
                                case 'a':
                                case 'b':
                                case 'c':
                                case 'd':
                                case 'e':
                                case 'f':
                                case 'g':
                                case 'h':
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
                                    alt12=38;
                                    }
                                    break;
                                default:
                                    alt12=3;}

                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            case 'n':
                {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='a') ) {
                    int LA12_71 = input.LA(4);

                    if ( (LA12_71=='c') ) {
                        int LA12_99 = input.LA(5);

                        if ( (LA12_99=='t') ) {
                            int LA12_127 = input.LA(6);

                            if ( (LA12_127=='i') ) {
                                int LA12_157 = input.LA(7);

                                if ( (LA12_157=='v') ) {
                                    int LA12_183 = input.LA(8);

                                    if ( (LA12_183=='e') ) {
                                        int LA12_203 = input.LA(9);

                                        if ( ((LA12_203>='0' && LA12_203<='9')||(LA12_203>='A' && LA12_203<='Z')||LA12_203=='_'||(LA12_203>='a' && LA12_203<='z')) ) {
                                            alt12=38;
                                        }
                                        else {
                                            alt12=12;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            default:
                alt12=38;}

        }
        else if ( (LA12_0=='a') ) {
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='s') ) {
                int LA12_37 = input.LA(3);

                if ( ((LA12_37>='0' && LA12_37<='9')||(LA12_37>='A' && LA12_37<='Z')||LA12_37=='_'||(LA12_37>='a' && LA12_37<='z')) ) {
                    alt12=38;
                }
                else {
                    alt12=4;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0==';') ) {
            alt12=5;
        }
        else if ( (LA12_0=='s') ) {
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='t') ) {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='r') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='u') ) {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='c') ) {
                            int LA12_128 = input.LA(6);

                            if ( (LA12_128=='t') ) {
                                int LA12_158 = input.LA(7);

                                if ( (LA12_158=='u') ) {
                                    int LA12_184 = input.LA(8);

                                    if ( (LA12_184=='r') ) {
                                        int LA12_204 = input.LA(9);

                                        if ( (LA12_204=='e') ) {
                                            int LA12_220 = input.LA(10);

                                            if ( ((LA12_220>='0' && LA12_220<='9')||(LA12_220>='A' && LA12_220<='Z')||LA12_220=='_'||(LA12_220>='a' && LA12_220<='z')) ) {
                                                alt12=38;
                                            }
                                            else {
                                                alt12=6;}
                                        }
                                        else {
                                            alt12=38;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=7;
        }
        else if ( (LA12_0=='}') ) {
            alt12=8;
        }
        else if ( (LA12_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='a') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='n') ) {
                        int LA12_101 = input.LA(5);

                        if ( (LA12_101=='g') ) {
                            int LA12_129 = input.LA(6);

                            if ( (LA12_129=='i') ) {
                                int LA12_159 = input.LA(7);

                                if ( (LA12_159=='n') ) {
                                    int LA12_185 = input.LA(8);

                                    if ( (LA12_185=='g') ) {
                                        int LA12_205 = input.LA(9);

                                        if ( ((LA12_205>='0' && LA12_205<='9')||(LA12_205>='A' && LA12_205<='Z')||LA12_205=='_'||(LA12_205>='a' && LA12_205<='z')) ) {
                                            alt12=38;
                                        }
                                        else {
                                            alt12=22;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            case 'o':
                {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='m') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='m') ) {
                        int LA12_102 = input.LA(5);

                        if ( (LA12_102=='e') ) {
                            int LA12_130 = input.LA(6);

                            if ( (LA12_130=='n') ) {
                                int LA12_160 = input.LA(7);

                                if ( (LA12_160=='t') ) {
                                    int LA12_186 = input.LA(8);

                                    if ( ((LA12_186>='0' && LA12_186<='9')||(LA12_186>='A' && LA12_186<='Z')||LA12_186=='_'||(LA12_186>='a' && LA12_186<='z')) ) {
                                        alt12=38;
                                    }
                                    else {
                                        alt12=13;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            case 'l':
                {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='a') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='s') ) {
                        int LA12_103 = input.LA(5);

                        if ( (LA12_103=='s') ) {
                            int LA12_131 = input.LA(6);

                            if ( ((LA12_131>='0' && LA12_131<='9')||(LA12_131>='A' && LA12_131<='Z')||LA12_131=='_'||(LA12_131>='a' && LA12_131<='z')) ) {
                                alt12=38;
                            }
                            else {
                                alt12=9;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            default:
                alt12=38;}

        }
        else if ( (LA12_0=='f') ) {
            switch ( input.LA(2) ) {
            case 'u':
                {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='n') ) {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='c') ) {
                        int LA12_104 = input.LA(5);

                        if ( (LA12_104=='t') ) {
                            int LA12_132 = input.LA(6);

                            if ( (LA12_132=='i') ) {
                                int LA12_162 = input.LA(7);

                                if ( (LA12_162=='o') ) {
                                    int LA12_187 = input.LA(8);

                                    if ( (LA12_187=='n') ) {
                                        int LA12_207 = input.LA(9);

                                        if ( ((LA12_207>='0' && LA12_207<='9')||(LA12_207>='A' && LA12_207<='Z')||LA12_207=='_'||(LA12_207>='a' && LA12_207<='z')) ) {
                                            alt12=38;
                                        }
                                        else {
                                            alt12=14;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            case 'i':
                {
                int LA12_46 = input.LA(3);

                if ( (LA12_46=='e') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='l') ) {
                        int LA12_105 = input.LA(5);

                        if ( (LA12_105=='d') ) {
                            int LA12_133 = input.LA(6);

                            if ( ((LA12_133>='0' && LA12_133<='9')||(LA12_133>='A' && LA12_133<='Z')||LA12_133=='_'||(LA12_133>='a' && LA12_133<='z')) ) {
                                alt12=38;
                            }
                            else {
                                alt12=10;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            default:
                alt12=38;}

        }
        else if ( (LA12_0=='=') ) {
            alt12=11;
        }
        else if ( (LA12_0=='m') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='o') ) {
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='d') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='u') ) {
                        int LA12_106 = input.LA(5);

                        if ( (LA12_106=='l') ) {
                            int LA12_134 = input.LA(6);

                            if ( (LA12_134=='e') ) {
                                int LA12_164 = input.LA(7);

                                if ( ((LA12_164>='0' && LA12_164<='9')||(LA12_164>='A' && LA12_164<='Z')||LA12_164=='_'||(LA12_164>='a' && LA12_164<='z')) ) {
                                    alt12=38;
                                }
                                else {
                                    alt12=15;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='r') ) {
            int LA12_13 = input.LA(2);

            if ( (LA12_13=='e') ) {
                switch ( input.LA(3) ) {
                case 's':
                    {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='p') ) {
                        int LA12_107 = input.LA(5);

                        if ( (LA12_107=='o') ) {
                            int LA12_135 = input.LA(6);

                            if ( (LA12_135=='n') ) {
                                int LA12_165 = input.LA(7);

                                if ( (LA12_165=='s') ) {
                                    int LA12_189 = input.LA(8);

                                    if ( (LA12_189=='e') ) {
                                        int LA12_208 = input.LA(9);

                                        if ( ((LA12_208>='0' && LA12_208<='9')||(LA12_208>='A' && LA12_208<='Z')||LA12_208=='_'||(LA12_208>='a' && LA12_208<='z')) ) {
                                            alt12=38;
                                        }
                                        else {
                                            alt12=17;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                    }
                    break;
                case 'q':
                    {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='u') ) {
                        int LA12_108 = input.LA(5);

                        if ( (LA12_108=='e') ) {
                            int LA12_136 = input.LA(6);

                            if ( (LA12_136=='s') ) {
                                int LA12_166 = input.LA(7);

                                if ( (LA12_166=='t') ) {
                                    int LA12_190 = input.LA(8);

                                    if ( ((LA12_190>='0' && LA12_190<='9')||(LA12_190>='A' && LA12_190<='Z')||LA12_190=='_'||(LA12_190>='a' && LA12_190<='z')) ) {
                                        alt12=38;
                                    }
                                    else {
                                        alt12=16;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                    }
                    break;
                default:
                    alt12=38;}

            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='e') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='x') ) {
                switch ( input.LA(3) ) {
                case 'p':
                    {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='o') ) {
                        int LA12_109 = input.LA(5);

                        if ( (LA12_109=='r') ) {
                            int LA12_137 = input.LA(6);

                            if ( (LA12_137=='t') ) {
                                int LA12_167 = input.LA(7);

                                if ( (LA12_167=='i') ) {
                                    int LA12_191 = input.LA(8);

                                    if ( (LA12_191=='n') ) {
                                        int LA12_210 = input.LA(9);

                                        if ( (LA12_210=='g') ) {
                                            int LA12_224 = input.LA(10);

                                            if ( ((LA12_224>='0' && LA12_224<='9')||(LA12_224>='A' && LA12_224<='Z')||LA12_224=='_'||(LA12_224>='a' && LA12_224<='z')) ) {
                                                alt12=38;
                                            }
                                            else {
                                                alt12=21;}
                                        }
                                        else {
                                            alt12=38;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                    }
                    break;
                case 't':
                    {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='e') ) {
                        int LA12_110 = input.LA(5);

                        if ( (LA12_110=='r') ) {
                            int LA12_138 = input.LA(6);

                            if ( (LA12_138=='n') ) {
                                int LA12_168 = input.LA(7);

                                if ( (LA12_168=='a') ) {
                                    int LA12_192 = input.LA(8);

                                    if ( (LA12_192=='l') ) {
                                        int LA12_211 = input.LA(9);

                                        if ( ((LA12_211>='0' && LA12_211<='9')||(LA12_211>='A' && LA12_211<='Z')||LA12_211=='_'||(LA12_211>='a' && LA12_211<='z')) ) {
                                            alt12=38;
                                        }
                                        else {
                                            alt12=19;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                    }
                    break;
                default:
                    alt12=38;}

            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='t') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='a') ) {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='b') ) {
                    int LA12_84 = input.LA(4);

                    if ( (LA12_84=='l') ) {
                        int LA12_111 = input.LA(5);

                        if ( (LA12_111=='e') ) {
                            int LA12_139 = input.LA(6);

                            if ( ((LA12_139>='0' && LA12_139<='9')||(LA12_139>='A' && LA12_139<='Z')||LA12_139=='_'||(LA12_139>='a' && LA12_139<='z')) ) {
                                alt12=38;
                            }
                            else {
                                alt12=20;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='B') ) {
            switch ( input.LA(2) ) {
            case 'i':
                {
                int LA12_52 = input.LA(3);

                if ( (LA12_52=='g') ) {
                    switch ( input.LA(4) ) {
                    case 'D':
                        {
                        int LA12_112 = input.LA(5);

                        if ( (LA12_112=='e') ) {
                            int LA12_140 = input.LA(6);

                            if ( (LA12_140=='c') ) {
                                int LA12_170 = input.LA(7);

                                if ( (LA12_170=='i') ) {
                                    int LA12_193 = input.LA(8);

                                    if ( (LA12_193=='m') ) {
                                        int LA12_212 = input.LA(9);

                                        if ( (LA12_212=='a') ) {
                                            int LA12_226 = input.LA(10);

                                            if ( (LA12_226=='l') ) {
                                                int LA12_233 = input.LA(11);

                                                if ( ((LA12_233>='0' && LA12_233<='9')||(LA12_233>='A' && LA12_233<='Z')||LA12_233=='_'||(LA12_233>='a' && LA12_233<='z')) ) {
                                                    alt12=38;
                                                }
                                                else {
                                                    alt12=23;}
                                            }
                                            else {
                                                alt12=38;}
                                        }
                                        else {
                                            alt12=38;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                        }
                        break;
                    case 'I':
                        {
                        int LA12_113 = input.LA(5);

                        if ( (LA12_113=='n') ) {
                            int LA12_141 = input.LA(6);

                            if ( (LA12_141=='t') ) {
                                int LA12_171 = input.LA(7);

                                if ( (LA12_171=='e') ) {
                                    int LA12_194 = input.LA(8);

                                    if ( (LA12_194=='g') ) {
                                        int LA12_213 = input.LA(9);

                                        if ( (LA12_213=='e') ) {
                                            int LA12_227 = input.LA(10);

                                            if ( (LA12_227=='r') ) {
                                                int LA12_234 = input.LA(11);

                                                if ( ((LA12_234>='0' && LA12_234<='9')||(LA12_234>='A' && LA12_234<='Z')||LA12_234=='_'||(LA12_234>='a' && LA12_234<='z')) ) {
                                                    alt12=38;
                                                }
                                                else {
                                                    alt12=24;}
                                            }
                                            else {
                                                alt12=38;}
                                        }
                                        else {
                                            alt12=38;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                        }
                        break;
                    default:
                        alt12=38;}

                }
                else {
                    alt12=38;}
                }
                break;
            case 'y':
                {
                int LA12_53 = input.LA(3);

                if ( (LA12_53=='t') ) {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='e') ) {
                        switch ( input.LA(5) ) {
                        case 'A':
                            {
                            int LA12_142 = input.LA(6);

                            if ( (LA12_142=='r') ) {
                                int LA12_172 = input.LA(7);

                                if ( (LA12_172=='r') ) {
                                    int LA12_195 = input.LA(8);

                                    if ( (LA12_195=='a') ) {
                                        int LA12_214 = input.LA(9);

                                        if ( (LA12_214=='y') ) {
                                            int LA12_228 = input.LA(10);

                                            if ( ((LA12_228>='0' && LA12_228<='9')||(LA12_228>='A' && LA12_228<='Z')||LA12_228=='_'||(LA12_228>='a' && LA12_228<='z')) ) {
                                                alt12=38;
                                            }
                                            else {
                                                alt12=27;}
                                        }
                                        else {
                                            alt12=38;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
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
                            alt12=38;
                            }
                            break;
                        default:
                            alt12=26;}

                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            case 'o':
                {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='o') ) {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='l') ) {
                        int LA12_115 = input.LA(5);

                        if ( (LA12_115=='e') ) {
                            int LA12_144 = input.LA(6);

                            if ( (LA12_144=='a') ) {
                                int LA12_173 = input.LA(7);

                                if ( (LA12_173=='n') ) {
                                    int LA12_196 = input.LA(8);

                                    if ( ((LA12_196>='0' && LA12_196<='9')||(LA12_196>='A' && LA12_196<='Z')||LA12_196=='_'||(LA12_196>='a' && LA12_196<='z')) ) {
                                        alt12=38;
                                    }
                                    else {
                                        alt12=25;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            default:
                alt12=38;}

        }
        else if ( (LA12_0=='C') ) {
            int LA12_17 = input.LA(2);

            if ( (LA12_17=='h') ) {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='a') ) {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='r') ) {
                        switch ( input.LA(5) ) {
                        case 'A':
                            {
                            int LA12_145 = input.LA(6);

                            if ( (LA12_145=='r') ) {
                                int LA12_174 = input.LA(7);

                                if ( (LA12_174=='r') ) {
                                    int LA12_197 = input.LA(8);

                                    if ( (LA12_197=='a') ) {
                                        int LA12_216 = input.LA(9);

                                        if ( (LA12_216=='y') ) {
                                            int LA12_229 = input.LA(10);

                                            if ( ((LA12_229>='0' && LA12_229<='9')||(LA12_229>='A' && LA12_229<='Z')||LA12_229=='_'||(LA12_229>='a' && LA12_229<='z')) ) {
                                                alt12=38;
                                            }
                                            else {
                                                alt12=29;}
                                        }
                                        else {
                                            alt12=38;}
                                    }
                                    else {
                                        alt12=38;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
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
                            alt12=38;
                            }
                            break;
                        default:
                            alt12=28;}

                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='u') ) {
                    int LA12_89 = input.LA(4);

                    if ( (LA12_89=='b') ) {
                        int LA12_117 = input.LA(5);

                        if ( (LA12_117=='l') ) {
                            int LA12_147 = input.LA(6);

                            if ( (LA12_147=='e') ) {
                                int LA12_175 = input.LA(7);

                                if ( ((LA12_175>='0' && LA12_175<='9')||(LA12_175>='A' && LA12_175<='Z')||LA12_175=='_'||(LA12_175>='a' && LA12_175<='z')) ) {
                                    alt12=38;
                                }
                                else {
                                    alt12=31;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            case 'a':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='t') ) {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='e') ) {
                        int LA12_118 = input.LA(5);

                        if ( ((LA12_118>='0' && LA12_118<='9')||(LA12_118>='A' && LA12_118<='Z')||LA12_118=='_'||(LA12_118>='a' && LA12_118<='z')) ) {
                            alt12=38;
                        }
                        else {
                            alt12=30;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            default:
                alt12=38;}

        }
        else if ( (LA12_0=='F') ) {
            int LA12_19 = input.LA(2);

            if ( (LA12_19=='l') ) {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='o') ) {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='a') ) {
                        int LA12_119 = input.LA(5);

                        if ( (LA12_119=='t') ) {
                            int LA12_149 = input.LA(6);

                            if ( ((LA12_149>='0' && LA12_149<='9')||(LA12_149>='A' && LA12_149<='Z')||LA12_149=='_'||(LA12_149>='a' && LA12_149<='z')) ) {
                                alt12=38;
                            }
                            else {
                                alt12=32;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='I') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='n') ) {
                int LA12_59 = input.LA(3);

                if ( (LA12_59=='t') ) {
                    int LA12_92 = input.LA(4);

                    if ( (LA12_92=='e') ) {
                        int LA12_120 = input.LA(5);

                        if ( (LA12_120=='g') ) {
                            int LA12_150 = input.LA(6);

                            if ( (LA12_150=='e') ) {
                                int LA12_177 = input.LA(7);

                                if ( (LA12_177=='r') ) {
                                    int LA12_199 = input.LA(8);

                                    if ( ((LA12_199>='0' && LA12_199<='9')||(LA12_199>='A' && LA12_199<='Z')||LA12_199=='_'||(LA12_199>='a' && LA12_199<='z')) ) {
                                        alt12=38;
                                    }
                                    else {
                                        alt12=33;}
                                }
                                else {
                                    alt12=38;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='L') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='o') ) {
                int LA12_60 = input.LA(3);

                if ( (LA12_60=='n') ) {
                    int LA12_93 = input.LA(4);

                    if ( (LA12_93=='g') ) {
                        int LA12_121 = input.LA(5);

                        if ( ((LA12_121>='0' && LA12_121<='9')||(LA12_121>='A' && LA12_121<='Z')||LA12_121=='_'||(LA12_121>='a' && LA12_121<='z')) ) {
                            alt12=38;
                        }
                        else {
                            alt12=34;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='S') ) {
            switch ( input.LA(2) ) {
            case 'h':
                {
                int LA12_61 = input.LA(3);

                if ( (LA12_61=='o') ) {
                    int LA12_94 = input.LA(4);

                    if ( (LA12_94=='r') ) {
                        int LA12_122 = input.LA(5);

                        if ( (LA12_122=='t') ) {
                            int LA12_152 = input.LA(6);

                            if ( ((LA12_152>='0' && LA12_152<='9')||(LA12_152>='A' && LA12_152<='Z')||LA12_152=='_'||(LA12_152>='a' && LA12_152<='z')) ) {
                                alt12=38;
                            }
                            else {
                                alt12=35;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            case 't':
                {
                int LA12_62 = input.LA(3);

                if ( (LA12_62=='r') ) {
                    int LA12_95 = input.LA(4);

                    if ( (LA12_95=='i') ) {
                        int LA12_123 = input.LA(5);

                        if ( (LA12_123=='n') ) {
                            int LA12_153 = input.LA(6);

                            if ( (LA12_153=='g') ) {
                                int LA12_179 = input.LA(7);

                                if ( ((LA12_179>='0' && LA12_179<='9')||(LA12_179>='A' && LA12_179<='Z')||LA12_179=='_'||(LA12_179>='a' && LA12_179<='z')) ) {
                                    alt12=38;
                                }
                                else {
                                    alt12=36;}
                            }
                            else {
                                alt12=38;}
                        }
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
                }
                break;
            default:
                alt12=38;}

        }
        else if ( (LA12_0=='T') ) {
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='i') ) {
                int LA12_63 = input.LA(3);

                if ( (LA12_63=='m') ) {
                    int LA12_96 = input.LA(4);

                    if ( (LA12_96=='e') ) {
                        int LA12_124 = input.LA(5);

                        if ( ((LA12_124>='0' && LA12_124<='9')||(LA12_124>='A' && LA12_124<='Z')||LA12_124=='_'||(LA12_124>='a' && LA12_124<='z')) ) {
                            alt12=38;
                        }
                        else {
                            alt12=37;}
                    }
                    else {
                        alt12=38;}
                }
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='^') ) {
            int LA12_24 = input.LA(2);

            if ( ((LA12_24>='A' && LA12_24<='Z')||LA12_24=='_'||(LA12_24>='a' && LA12_24<='z')) ) {
                alt12=38;
            }
            else {
                alt12=44;}
        }
        else if ( (LA12_0=='A'||LA12_0=='E'||(LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='R')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||LA12_0=='d'||(LA12_0>='g' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='l')||(LA12_0>='n' && LA12_0<='o')||LA12_0=='q'||(LA12_0>='u' && LA12_0<='z')) ) {
            alt12=38;
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=39;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_27 = input.LA(2);

            if ( ((LA12_27>='\u0000' && LA12_27<='\uFFFE')) ) {
                alt12=40;
            }
            else {
                alt12=44;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_28 = input.LA(2);

            if ( ((LA12_28>='\u0000' && LA12_28<='\uFFFE')) ) {
                alt12=40;
            }
            else {
                alt12=44;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '*':
                {
                alt12=41;
                }
                break;
            case '/':
                {
                alt12=42;
                }
                break;
            default:
                alt12=44;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=43;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='-')||LA12_0==':'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=44;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

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
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:158: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:166: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:175: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:187: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:203: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:219: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // ../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g:1:227: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}