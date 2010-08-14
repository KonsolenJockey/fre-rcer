lexer grammar InternalRFCMapping;
@header {
package net.sf.rcer.rfcgen.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'package' ;
T12 : 'structure' ;
T13 : '{' ;
T14 : '}' ;
T15 : 'class' ;
T16 : ';' ;
T17 : 'field' ;
T18 : '=' ;
T19 : 'inactive' ;
T20 : 'comment' ;
T21 : 'function' ;
T22 : 'module' ;
T23 : 'request' ;
T24 : 'response' ;
T25 : 'importing' ;
T26 : 'table' ;
T27 : 'exporting' ;
T28 : 'changing' ;
T29 : 'BigDecimal' ;
T30 : 'BigInteger' ;
T31 : 'Boolean' ;
T32 : 'Byte' ;
T33 : 'ByteArray' ;
T34 : 'Char' ;
T35 : 'CharArray' ;
T36 : 'Date' ;
T37 : 'Double' ;
T38 : 'Float' ;
T39 : 'Integer' ;
T40 : 'Long' ;
T41 : 'Short' ;
T42 : 'String' ;
T43 : 'Time' ;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2326
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2328
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2330
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2332
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2334
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2336
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2338
RULE_ANY_OTHER : .;


