package net.sf.rcer.rfcgen.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRFCMappingLexer extends Lexer {
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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
    public String getGrammarFileName() { return "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:10:5: ( 'BigDecimal' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:10:7: 'BigDecimal'
            {
            match("BigDecimal"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:11:5: ( 'BigInteger' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:11:7: 'BigInteger'
            {
            match("BigInteger"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:12:5: ( 'Boolean' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:12:7: 'Boolean'
            {
            match("Boolean"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:13:5: ( 'Byte' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:13:7: 'Byte'
            {
            match("Byte"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:14:5: ( 'ByteArray' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:14:7: 'ByteArray'
            {
            match("ByteArray"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:15:5: ( 'Char' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:15:7: 'Char'
            {
            match("Char"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:16:5: ( 'CharArray' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:16:7: 'CharArray'
            {
            match("CharArray"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:17:5: ( 'Date' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:17:7: 'Date'
            {
            match("Date"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:18:5: ( 'Double' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:18:7: 'Double'
            {
            match("Double"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:19:5: ( 'Float' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:19:7: 'Float'
            {
            match("Float"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:20:5: ( 'Integer' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:20:7: 'Integer'
            {
            match("Integer"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:21:5: ( 'Long' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:21:7: 'Long'
            {
            match("Long"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:22:5: ( 'Short' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:22:7: 'Short'
            {
            match("Short"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:23:5: ( 'String' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:23:7: 'String'
            {
            match("String"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:24:5: ( 'Time' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:24:7: 'Time'
            {
            match("Time"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:25:5: ( 'package' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:25:7: 'package'
            {
            match("package"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:26:5: ( '.' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:26:7: '.'
            {
            match('.'); 

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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:27:5: ( 'import' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:27:7: 'import'
            {
            match("import"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:28:5: ( 'as' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:28:7: 'as'
            {
            match("as"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:29:5: ( ';' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:29:7: ';'
            {
            match(';'); 

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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:30:5: ( 'structure' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:30:7: 'structure'
            {
            match("structure"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:31:5: ( '{' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:31:7: '{'
            {
            match('{'); 

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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:32:5: ( '}' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:32:7: '}'
            {
            match('}'); 

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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:33:5: ( 'class' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:33:7: 'class'
            {
            match("class"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:34:5: ( 'field' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:34:7: 'field'
            {
            match("field"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:35:5: ( '=' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:35:7: '='
            {
            match('='); 

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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:36:5: ( 'comment' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:36:7: 'comment'
            {
            match("comment"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:37:5: ( 'function' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:37:7: 'function'
            {
            match("function"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:38:5: ( 'module' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:38:7: 'module'
            {
            match("module"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:39:5: ( 'request' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:39:7: 'request'
            {
            match("request"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:40:5: ( 'response' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:40:7: 'response'
            {
            match("response"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:41:5: ( 'importing' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:41:7: 'importing'
            {
            match("importing"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:42:5: ( 'exporting' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:42:7: 'exporting'
            {
            match("exporting"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:43:5: ( 'changing' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:43:7: 'changing'
            {
            match("changing"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:44:5: ( 'table' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:44:7: 'table'
            {
            match("table"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:45:5: ( 'inactive' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:45:7: 'inactive'
            {
            match("inactive"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:46:5: ( 'external' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:46:7: 'external'
            {
            match("external"); 


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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7811:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7811:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7811:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7811:11: '^'
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

            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7811:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:
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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7813:10: ( ( '0' .. '9' )+ )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7813:12: ( '0' .. '9' )+
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7813:12: ( '0' .. '9' )+
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
            	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7813:13: '0' .. '9'
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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7815:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7815:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7815:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    new NoViableAltException("7815:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7815:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7815:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7815:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7815:62: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7815:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7815:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7815:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7815:129: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7817:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7817:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7817:24: ( options {greedy=false; } : . )*
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
            	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7817:52: .
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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7819:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7819:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7819:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7819:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7819:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7819:41: ( '\\r' )? '\\n'
                    {
                    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7819:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7819:41: '\\r'
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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7821:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7821:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7821:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:
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
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7823:16: ( . )
            // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:7823:18: .
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
        // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=44;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='B') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_32 = input.LA(3);

                if ( (LA12_32=='o') ) {
                    int LA12_69 = input.LA(4);

                    if ( (LA12_69=='l') ) {
                        int LA12_97 = input.LA(5);

                        if ( (LA12_97=='e') ) {
                            int LA12_125 = input.LA(6);

                            if ( (LA12_125=='a') ) {
                                int LA12_155 = input.LA(7);

                                if ( (LA12_155=='n') ) {
                                    int LA12_180 = input.LA(8);

                                    if ( ((LA12_180>='0' && LA12_180<='9')||(LA12_180>='A' && LA12_180<='Z')||LA12_180=='_'||(LA12_180>='a' && LA12_180<='z')) ) {
                                        alt12=38;
                                    }
                                    else {
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
                else {
                    alt12=38;}
                }
                break;
            case 'y':
                {
                int LA12_33 = input.LA(3);

                if ( (LA12_33=='t') ) {
                    int LA12_70 = input.LA(4);

                    if ( (LA12_70=='e') ) {
                        switch ( input.LA(5) ) {
                        case 'A':
                            {
                            int LA12_126 = input.LA(6);

                            if ( (LA12_126=='r') ) {
                                int LA12_156 = input.LA(7);

                                if ( (LA12_156=='r') ) {
                                    int LA12_181 = input.LA(8);

                                    if ( (LA12_181=='a') ) {
                                        int LA12_202 = input.LA(9);

                                        if ( (LA12_202=='y') ) {
                                            int LA12_218 = input.LA(10);

                                            if ( ((LA12_218>='0' && LA12_218<='9')||(LA12_218>='A' && LA12_218<='Z')||LA12_218=='_'||(LA12_218>='a' && LA12_218<='z')) ) {
                                                alt12=38;
                                            }
                                            else {
                                                alt12=5;}
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
                            alt12=4;}

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
                int LA12_34 = input.LA(3);

                if ( (LA12_34=='g') ) {
                    switch ( input.LA(4) ) {
                    case 'I':
                        {
                        int LA12_99 = input.LA(5);

                        if ( (LA12_99=='n') ) {
                            int LA12_128 = input.LA(6);

                            if ( (LA12_128=='t') ) {
                                int LA12_157 = input.LA(7);

                                if ( (LA12_157=='e') ) {
                                    int LA12_182 = input.LA(8);

                                    if ( (LA12_182=='g') ) {
                                        int LA12_203 = input.LA(9);

                                        if ( (LA12_203=='e') ) {
                                            int LA12_219 = input.LA(10);

                                            if ( (LA12_219=='r') ) {
                                                int LA12_231 = input.LA(11);

                                                if ( ((LA12_231>='0' && LA12_231<='9')||(LA12_231>='A' && LA12_231<='Z')||LA12_231=='_'||(LA12_231>='a' && LA12_231<='z')) ) {
                                                    alt12=38;
                                                }
                                                else {
                                                    alt12=2;}
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
                    case 'D':
                        {
                        int LA12_100 = input.LA(5);

                        if ( (LA12_100=='e') ) {
                            int LA12_129 = input.LA(6);

                            if ( (LA12_129=='c') ) {
                                int LA12_158 = input.LA(7);

                                if ( (LA12_158=='i') ) {
                                    int LA12_183 = input.LA(8);

                                    if ( (LA12_183=='m') ) {
                                        int LA12_204 = input.LA(9);

                                        if ( (LA12_204=='a') ) {
                                            int LA12_220 = input.LA(10);

                                            if ( (LA12_220=='l') ) {
                                                int LA12_232 = input.LA(11);

                                                if ( ((LA12_232>='0' && LA12_232<='9')||(LA12_232>='A' && LA12_232<='Z')||LA12_232=='_'||(LA12_232>='a' && LA12_232<='z')) ) {
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
                        break;
                    default:
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
            int LA12_2 = input.LA(2);

            if ( (LA12_2=='h') ) {
                int LA12_36 = input.LA(3);

                if ( (LA12_36=='a') ) {
                    int LA12_72 = input.LA(4);

                    if ( (LA12_72=='r') ) {
                        switch ( input.LA(5) ) {
                        case 'A':
                            {
                            int LA12_130 = input.LA(6);

                            if ( (LA12_130=='r') ) {
                                int LA12_159 = input.LA(7);

                                if ( (LA12_159=='r') ) {
                                    int LA12_184 = input.LA(8);

                                    if ( (LA12_184=='a') ) {
                                        int LA12_205 = input.LA(9);

                                        if ( (LA12_205=='y') ) {
                                            int LA12_221 = input.LA(10);

                                            if ( ((LA12_221>='0' && LA12_221<='9')||(LA12_221>='A' && LA12_221<='Z')||LA12_221=='_'||(LA12_221>='a' && LA12_221<='z')) ) {
                                                alt12=38;
                                            }
                                            else {
                                                alt12=7;}
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
        else if ( (LA12_0=='D') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA12_37 = input.LA(3);

                if ( (LA12_37=='u') ) {
                    int LA12_73 = input.LA(4);

                    if ( (LA12_73=='b') ) {
                        int LA12_102 = input.LA(5);

                        if ( (LA12_102=='l') ) {
                            int LA12_132 = input.LA(6);

                            if ( (LA12_132=='e') ) {
                                int LA12_160 = input.LA(7);

                                if ( ((LA12_160>='0' && LA12_160<='9')||(LA12_160>='A' && LA12_160<='Z')||LA12_160=='_'||(LA12_160>='a' && LA12_160<='z')) ) {
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
                else {
                    alt12=38;}
                }
                break;
            case 'a':
                {
                int LA12_38 = input.LA(3);

                if ( (LA12_38=='t') ) {
                    int LA12_74 = input.LA(4);

                    if ( (LA12_74=='e') ) {
                        int LA12_103 = input.LA(5);

                        if ( ((LA12_103>='0' && LA12_103<='9')||(LA12_103>='A' && LA12_103<='Z')||LA12_103=='_'||(LA12_103>='a' && LA12_103<='z')) ) {
                            alt12=38;
                        }
                        else {
                            alt12=8;}
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
            int LA12_4 = input.LA(2);

            if ( (LA12_4=='l') ) {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='o') ) {
                    int LA12_75 = input.LA(4);

                    if ( (LA12_75=='a') ) {
                        int LA12_104 = input.LA(5);

                        if ( (LA12_104=='t') ) {
                            int LA12_134 = input.LA(6);

                            if ( ((LA12_134>='0' && LA12_134<='9')||(LA12_134>='A' && LA12_134<='Z')||LA12_134=='_'||(LA12_134>='a' && LA12_134<='z')) ) {
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
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='I') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='n') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='t') ) {
                    int LA12_76 = input.LA(4);

                    if ( (LA12_76=='e') ) {
                        int LA12_105 = input.LA(5);

                        if ( (LA12_105=='g') ) {
                            int LA12_135 = input.LA(6);

                            if ( (LA12_135=='e') ) {
                                int LA12_162 = input.LA(7);

                                if ( (LA12_162=='r') ) {
                                    int LA12_186 = input.LA(8);

                                    if ( ((LA12_186>='0' && LA12_186<='9')||(LA12_186>='A' && LA12_186<='Z')||LA12_186=='_'||(LA12_186>='a' && LA12_186<='z')) ) {
                                        alt12=38;
                                    }
                                    else {
                                        alt12=11;}
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
            int LA12_6 = input.LA(2);

            if ( (LA12_6=='o') ) {
                int LA12_41 = input.LA(3);

                if ( (LA12_41=='n') ) {
                    int LA12_77 = input.LA(4);

                    if ( (LA12_77=='g') ) {
                        int LA12_106 = input.LA(5);

                        if ( ((LA12_106>='0' && LA12_106<='9')||(LA12_106>='A' && LA12_106<='Z')||LA12_106=='_'||(LA12_106>='a' && LA12_106<='z')) ) {
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
        else if ( (LA12_0=='S') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA12_42 = input.LA(3);

                if ( (LA12_42=='r') ) {
                    int LA12_78 = input.LA(4);

                    if ( (LA12_78=='i') ) {
                        int LA12_107 = input.LA(5);

                        if ( (LA12_107=='n') ) {
                            int LA12_137 = input.LA(6);

                            if ( (LA12_137=='g') ) {
                                int LA12_163 = input.LA(7);

                                if ( ((LA12_163>='0' && LA12_163<='9')||(LA12_163>='A' && LA12_163<='Z')||LA12_163=='_'||(LA12_163>='a' && LA12_163<='z')) ) {
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
                break;
            case 'h':
                {
                int LA12_43 = input.LA(3);

                if ( (LA12_43=='o') ) {
                    int LA12_79 = input.LA(4);

                    if ( (LA12_79=='r') ) {
                        int LA12_108 = input.LA(5);

                        if ( (LA12_108=='t') ) {
                            int LA12_138 = input.LA(6);

                            if ( ((LA12_138>='0' && LA12_138<='9')||(LA12_138>='A' && LA12_138<='Z')||LA12_138=='_'||(LA12_138>='a' && LA12_138<='z')) ) {
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
                break;
            default:
                alt12=38;}

        }
        else if ( (LA12_0=='T') ) {
            int LA12_8 = input.LA(2);

            if ( (LA12_8=='i') ) {
                int LA12_44 = input.LA(3);

                if ( (LA12_44=='m') ) {
                    int LA12_80 = input.LA(4);

                    if ( (LA12_80=='e') ) {
                        int LA12_109 = input.LA(5);

                        if ( ((LA12_109>='0' && LA12_109<='9')||(LA12_109>='A' && LA12_109<='Z')||LA12_109=='_'||(LA12_109>='a' && LA12_109<='z')) ) {
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
        else if ( (LA12_0=='p') ) {
            int LA12_9 = input.LA(2);

            if ( (LA12_9=='a') ) {
                int LA12_45 = input.LA(3);

                if ( (LA12_45=='c') ) {
                    int LA12_81 = input.LA(4);

                    if ( (LA12_81=='k') ) {
                        int LA12_110 = input.LA(5);

                        if ( (LA12_110=='a') ) {
                            int LA12_140 = input.LA(6);

                            if ( (LA12_140=='g') ) {
                                int LA12_165 = input.LA(7);

                                if ( (LA12_165=='e') ) {
                                    int LA12_188 = input.LA(8);

                                    if ( ((LA12_188>='0' && LA12_188<='9')||(LA12_188>='A' && LA12_188<='Z')||LA12_188=='_'||(LA12_188>='a' && LA12_188<='z')) ) {
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
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='.') ) {
            alt12=17;
        }
        else if ( (LA12_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'm':
                {
                int LA12_47 = input.LA(3);

                if ( (LA12_47=='p') ) {
                    int LA12_82 = input.LA(4);

                    if ( (LA12_82=='o') ) {
                        int LA12_111 = input.LA(5);

                        if ( (LA12_111=='r') ) {
                            int LA12_141 = input.LA(6);

                            if ( (LA12_141=='t') ) {
                                switch ( input.LA(7) ) {
                                case 'i':
                                    {
                                    int LA12_189 = input.LA(8);

                                    if ( (LA12_189=='n') ) {
                                        int LA12_208 = input.LA(9);

                                        if ( (LA12_208=='g') ) {
                                            int LA12_222 = input.LA(10);

                                            if ( ((LA12_222>='0' && LA12_222<='9')||(LA12_222>='A' && LA12_222<='Z')||LA12_222=='_'||(LA12_222>='a' && LA12_222<='z')) ) {
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
                                    alt12=18;}

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
                int LA12_48 = input.LA(3);

                if ( (LA12_48=='a') ) {
                    int LA12_83 = input.LA(4);

                    if ( (LA12_83=='c') ) {
                        int LA12_112 = input.LA(5);

                        if ( (LA12_112=='t') ) {
                            int LA12_142 = input.LA(6);

                            if ( (LA12_142=='i') ) {
                                int LA12_167 = input.LA(7);

                                if ( (LA12_167=='v') ) {
                                    int LA12_191 = input.LA(8);

                                    if ( (LA12_191=='e') ) {
                                        int LA12_209 = input.LA(9);

                                        if ( ((LA12_209>='0' && LA12_209<='9')||(LA12_209>='A' && LA12_209<='Z')||LA12_209=='_'||(LA12_209>='a' && LA12_209<='z')) ) {
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
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='s') ) {
                int LA12_49 = input.LA(3);

                if ( ((LA12_49>='0' && LA12_49<='9')||(LA12_49>='A' && LA12_49<='Z')||LA12_49=='_'||(LA12_49>='a' && LA12_49<='z')) ) {
                    alt12=38;
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0==';') ) {
            alt12=20;
        }
        else if ( (LA12_0=='s') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='t') ) {
                int LA12_51 = input.LA(3);

                if ( (LA12_51=='r') ) {
                    int LA12_85 = input.LA(4);

                    if ( (LA12_85=='u') ) {
                        int LA12_113 = input.LA(5);

                        if ( (LA12_113=='c') ) {
                            int LA12_143 = input.LA(6);

                            if ( (LA12_143=='t') ) {
                                int LA12_168 = input.LA(7);

                                if ( (LA12_168=='u') ) {
                                    int LA12_192 = input.LA(8);

                                    if ( (LA12_192=='r') ) {
                                        int LA12_210 = input.LA(9);

                                        if ( (LA12_210=='e') ) {
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
                else {
                    alt12=38;}
            }
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='{') ) {
            alt12=22;
        }
        else if ( (LA12_0=='}') ) {
            alt12=23;
        }
        else if ( (LA12_0=='c') ) {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA12_54 = input.LA(3);

                if ( (LA12_54=='a') ) {
                    int LA12_86 = input.LA(4);

                    if ( (LA12_86=='s') ) {
                        int LA12_114 = input.LA(5);

                        if ( (LA12_114=='s') ) {
                            int LA12_144 = input.LA(6);

                            if ( ((LA12_144>='0' && LA12_144<='9')||(LA12_144>='A' && LA12_144<='Z')||LA12_144=='_'||(LA12_144>='a' && LA12_144<='z')) ) {
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
                break;
            case 'o':
                {
                int LA12_55 = input.LA(3);

                if ( (LA12_55=='m') ) {
                    int LA12_87 = input.LA(4);

                    if ( (LA12_87=='m') ) {
                        int LA12_115 = input.LA(5);

                        if ( (LA12_115=='e') ) {
                            int LA12_145 = input.LA(6);

                            if ( (LA12_145=='n') ) {
                                int LA12_170 = input.LA(7);

                                if ( (LA12_170=='t') ) {
                                    int LA12_193 = input.LA(8);

                                    if ( ((LA12_193>='0' && LA12_193<='9')||(LA12_193>='A' && LA12_193<='Z')||LA12_193=='_'||(LA12_193>='a' && LA12_193<='z')) ) {
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
                else {
                    alt12=38;}
                }
                break;
            case 'h':
                {
                int LA12_56 = input.LA(3);

                if ( (LA12_56=='a') ) {
                    int LA12_88 = input.LA(4);

                    if ( (LA12_88=='n') ) {
                        int LA12_116 = input.LA(5);

                        if ( (LA12_116=='g') ) {
                            int LA12_146 = input.LA(6);

                            if ( (LA12_146=='i') ) {
                                int LA12_171 = input.LA(7);

                                if ( (LA12_171=='n') ) {
                                    int LA12_194 = input.LA(8);

                                    if ( (LA12_194=='g') ) {
                                        int LA12_212 = input.LA(9);

                                        if ( ((LA12_212>='0' && LA12_212<='9')||(LA12_212>='A' && LA12_212<='Z')||LA12_212=='_'||(LA12_212>='a' && LA12_212<='z')) ) {
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
            case 'i':
                {
                int LA12_57 = input.LA(3);

                if ( (LA12_57=='e') ) {
                    int LA12_89 = input.LA(4);

                    if ( (LA12_89=='l') ) {
                        int LA12_117 = input.LA(5);

                        if ( (LA12_117=='d') ) {
                            int LA12_147 = input.LA(6);

                            if ( ((LA12_147>='0' && LA12_147<='9')||(LA12_147>='A' && LA12_147<='Z')||LA12_147=='_'||(LA12_147>='a' && LA12_147<='z')) ) {
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
                break;
            case 'u':
                {
                int LA12_58 = input.LA(3);

                if ( (LA12_58=='n') ) {
                    int LA12_90 = input.LA(4);

                    if ( (LA12_90=='c') ) {
                        int LA12_118 = input.LA(5);

                        if ( (LA12_118=='t') ) {
                            int LA12_148 = input.LA(6);

                            if ( (LA12_148=='i') ) {
                                int LA12_173 = input.LA(7);

                                if ( (LA12_173=='o') ) {
                                    int LA12_195 = input.LA(8);

                                    if ( (LA12_195=='n') ) {
                                        int LA12_213 = input.LA(9);

                                        if ( ((LA12_213>='0' && LA12_213<='9')||(LA12_213>='A' && LA12_213<='Z')||LA12_213=='_'||(LA12_213>='a' && LA12_213<='z')) ) {
                                            alt12=38;
                                        }
                                        else {
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
            alt12=26;
        }
        else if ( (LA12_0=='m') ) {
            int LA12_20 = input.LA(2);

            if ( (LA12_20=='o') ) {
                int LA12_60 = input.LA(3);

                if ( (LA12_60=='d') ) {
                    int LA12_91 = input.LA(4);

                    if ( (LA12_91=='u') ) {
                        int LA12_119 = input.LA(5);

                        if ( (LA12_119=='l') ) {
                            int LA12_149 = input.LA(6);

                            if ( (LA12_149=='e') ) {
                                int LA12_174 = input.LA(7);

                                if ( ((LA12_174>='0' && LA12_174<='9')||(LA12_174>='A' && LA12_174<='Z')||LA12_174=='_'||(LA12_174>='a' && LA12_174<='z')) ) {
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
            else {
                alt12=38;}
        }
        else if ( (LA12_0=='r') ) {
            int LA12_21 = input.LA(2);

            if ( (LA12_21=='e') ) {
                switch ( input.LA(3) ) {
                case 'q':
                    {
                    int LA12_92 = input.LA(4);

                    if ( (LA12_92=='u') ) {
                        int LA12_120 = input.LA(5);

                        if ( (LA12_120=='e') ) {
                            int LA12_150 = input.LA(6);

                            if ( (LA12_150=='s') ) {
                                int LA12_175 = input.LA(7);

                                if ( (LA12_175=='t') ) {
                                    int LA12_197 = input.LA(8);

                                    if ( ((LA12_197>='0' && LA12_197<='9')||(LA12_197>='A' && LA12_197<='Z')||LA12_197=='_'||(LA12_197>='a' && LA12_197<='z')) ) {
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
                        else {
                            alt12=38;}
                    }
                    else {
                        alt12=38;}
                    }
                    break;
                case 's':
                    {
                    int LA12_93 = input.LA(4);

                    if ( (LA12_93=='p') ) {
                        int LA12_121 = input.LA(5);

                        if ( (LA12_121=='o') ) {
                            int LA12_151 = input.LA(6);

                            if ( (LA12_151=='n') ) {
                                int LA12_176 = input.LA(7);

                                if ( (LA12_176=='s') ) {
                                    int LA12_198 = input.LA(8);

                                    if ( (LA12_198=='e') ) {
                                        int LA12_215 = input.LA(9);

                                        if ( ((LA12_215>='0' && LA12_215<='9')||(LA12_215>='A' && LA12_215<='Z')||LA12_215=='_'||(LA12_215>='a' && LA12_215<='z')) ) {
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
            int LA12_22 = input.LA(2);

            if ( (LA12_22=='x') ) {
                switch ( input.LA(3) ) {
                case 'p':
                    {
                    int LA12_94 = input.LA(4);

                    if ( (LA12_94=='o') ) {
                        int LA12_122 = input.LA(5);

                        if ( (LA12_122=='r') ) {
                            int LA12_152 = input.LA(6);

                            if ( (LA12_152=='t') ) {
                                int LA12_177 = input.LA(7);

                                if ( (LA12_177=='i') ) {
                                    int LA12_199 = input.LA(8);

                                    if ( (LA12_199=='n') ) {
                                        int LA12_216 = input.LA(9);

                                        if ( (LA12_216=='g') ) {
                                            int LA12_228 = input.LA(10);

                                            if ( ((LA12_228>='0' && LA12_228<='9')||(LA12_228>='A' && LA12_228<='Z')||LA12_228=='_'||(LA12_228>='a' && LA12_228<='z')) ) {
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
                    break;
                case 't':
                    {
                    int LA12_95 = input.LA(4);

                    if ( (LA12_95=='e') ) {
                        int LA12_123 = input.LA(5);

                        if ( (LA12_123=='r') ) {
                            int LA12_153 = input.LA(6);

                            if ( (LA12_153=='n') ) {
                                int LA12_178 = input.LA(7);

                                if ( (LA12_178=='a') ) {
                                    int LA12_200 = input.LA(8);

                                    if ( (LA12_200=='l') ) {
                                        int LA12_217 = input.LA(9);

                                        if ( ((LA12_217>='0' && LA12_217<='9')||(LA12_217>='A' && LA12_217<='Z')||LA12_217=='_'||(LA12_217>='a' && LA12_217<='z')) ) {
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
            int LA12_23 = input.LA(2);

            if ( (LA12_23=='a') ) {
                int LA12_63 = input.LA(3);

                if ( (LA12_63=='b') ) {
                    int LA12_96 = input.LA(4);

                    if ( (LA12_96=='l') ) {
                        int LA12_124 = input.LA(5);

                        if ( (LA12_124=='e') ) {
                            int LA12_154 = input.LA(6);

                            if ( ((LA12_154>='0' && LA12_154<='9')||(LA12_154>='A' && LA12_154<='Z')||LA12_154=='_'||(LA12_154>='a' && LA12_154<='z')) ) {
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
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:158: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:166: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:175: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:187: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:203: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:219: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // ../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g:1:227: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}