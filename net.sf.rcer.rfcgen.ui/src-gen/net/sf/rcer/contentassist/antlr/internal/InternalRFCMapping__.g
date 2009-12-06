lexer grammar InternalRFCMapping;
@header {
package net.sf.rcer.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.common.editor.contentassist.antlr.internal.Lexer;
}

T11 : 'package' ;
T12 : 'structure' ;
T13 : '{' ;
T14 : '}' ;
T15 : 'class' ;
T16 : 'field' ;
T17 : '=' ;
T18 : ';' ;
T19 : 'comment' ;
T20 : 'function' ;
T21 : 'module' ;
T22 : 'request' ;
T23 : 'response' ;
T24 : 'import' ;
T25 : 'export' ;
T26 : 'change' ;
T27 : 'table' ;
T28 : 'inactive' ;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/contentassist/antlr/internal/InternalRFCMapping.g" 4618
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/contentassist/antlr/internal/InternalRFCMapping.g" 4620
RULE_INT : ('0'..'9')+;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/contentassist/antlr/internal/InternalRFCMapping.g" 4622
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/contentassist/antlr/internal/InternalRFCMapping.g" 4624
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/contentassist/antlr/internal/InternalRFCMapping.g" 4626
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/contentassist/antlr/internal/InternalRFCMapping.g" 4628
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../net.sf.rcer.rfcgen.ui/src-gen/net/sf/rcer/contentassist/antlr/internal/InternalRFCMapping.g" 4630
RULE_ANY_OTHER : .;


