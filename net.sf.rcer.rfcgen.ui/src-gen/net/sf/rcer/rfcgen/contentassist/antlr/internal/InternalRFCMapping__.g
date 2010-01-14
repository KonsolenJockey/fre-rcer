lexer grammar InternalRFCMapping;
@header {
package net.sf.rcer.rfcgen.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
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
T27 : 'structure' ;
T28 : '{' ;
T29 : '}' ;
T30 : 'class' ;
T31 : ';' ;
T32 : 'field' ;
T33 : '=' ;
T34 : 'comment' ;
T35 : 'function' ;
T36 : 'module' ;
T37 : 'request' ;
T38 : 'response' ;
T39 : 'importing' ;
T40 : 'exporting' ;
T41 : 'changing' ;
T42 : 'table' ;
T43 : 'inactive' ;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g" 4800
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g" 4802
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g" 4804
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g" 4806
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g" 4808
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g" 4810
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/rfcgen/contentassist/antlr/internal/InternalRFCMapping.g" 4812
RULE_ANY_OTHER : .;


