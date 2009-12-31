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
T16 : 'field' ;
T17 : '=' ;
T18 : 'comment' ;
T19 : ';' ;
T20 : 'function' ;
T21 : 'module' ;
T22 : 'request' ;
T23 : 'response' ;
T24 : 'import' ;
T25 : 'inactive' ;
T26 : 'table' ;
T27 : 'export' ;
T28 : 'change' ;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2086
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2088
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2090
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2092
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2094
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2096
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.sf.rcer.rfcgen/src-gen/net/sf/rcer/rfcgen/parser/antlr/internal/InternalRFCMapping.g" 2098
RULE_ANY_OTHER : .;


