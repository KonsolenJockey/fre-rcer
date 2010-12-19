lexer grammar InternalRFCMapping;
@header {
package net.sf.rcer.rfcgen.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'package' ;
T12 : '.' ;
T13 : 'import' ;
T14 : 'as' ;
T15 : ';' ;
T16 : 'structure' ;
T17 : '{' ;
T18 : '}' ;
T19 : 'class' ;
T20 : 'field' ;
T21 : '=' ;
T22 : 'inactive' ;
T23 : 'comment' ;
T24 : 'function' ;
T25 : 'module' ;
T26 : 'request' ;
T27 : 'response' ;
T28 : 'importing' ;
T29 : 'external' ;
T30 : 'table' ;
T31 : 'exporting' ;
T32 : 'changing' ;
T33 : 'BigDecimal' ;
T34 : 'BigInteger' ;
T35 : 'Boolean' ;
T36 : 'Byte' ;
T37 : 'ByteArray' ;
T38 : 'Char' ;
T39 : 'CharArray' ;
T40 : 'Date' ;
T41 : 'Double' ;
T42 : 'Float' ;
T43 : 'Integer' ;
T44 : 'Long' ;
T45 : 'Short' ;
T46 : 'String' ;
T47 : 'Time' ;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2947
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2949
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2951
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2953
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2955
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2957
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2959
RULE_ANY_OTHER : .;


