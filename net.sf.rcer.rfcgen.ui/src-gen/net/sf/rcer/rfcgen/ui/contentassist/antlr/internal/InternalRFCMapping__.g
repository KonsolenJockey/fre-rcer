lexer grammar InternalRFCMapping;
@header {
package net.sf.rcer.rfcgen.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'BigDecimal' ;
T12 : 'BigInteger' ;
T13 : 'Boolean' ;
T14 : 'Byte' ;
T15 : 'ByteArray' ;
T16 : 'Char' ;
T17 : 'CharArray' ;
T18 : 'Date' ;
T19 : 'Double' ;
T20 : 'Float' ;
T21 : 'Integer' ;
T22 : 'Long' ;
T23 : 'Short' ;
T24 : 'String' ;
T25 : 'Time' ;
T26 : 'package' ;
T27 : '.' ;
T28 : 'import' ;
T29 : 'as' ;
T30 : ';' ;
T31 : 'structure' ;
T32 : '{' ;
T33 : '}' ;
T34 : 'class' ;
T35 : 'field' ;
T36 : '=' ;
T37 : 'comment' ;
T38 : 'function' ;
T39 : 'module' ;
T40 : 'request' ;
T41 : 'response' ;
T42 : 'importing' ;
T43 : 'exporting' ;
T44 : 'changing' ;
T45 : 'table' ;
T46 : 'inactive' ;
T47 : 'external' ;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g" 7811
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g" 7813
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g" 7815
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g" 7817
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g" 7819
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g" 7821
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/ui/contentassist/antlr/internal/InternalRFCMapping.g" 7823
RULE_ANY_OTHER : .;


