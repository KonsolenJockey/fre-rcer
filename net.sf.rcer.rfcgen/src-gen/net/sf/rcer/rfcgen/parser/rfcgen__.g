lexer grammar rfcgen;
@members {
	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		return msg;
	}
}
@header {
package net.sf.rcer.rfcgen.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

T10 : 'package' ;
T11 : 'structure' ;
T12 : 'class' ;
T13 : '{' ;
T14 : '}' ;
T15 : 'field' ;
T16 : '<->' ;
T17 : 'comment' ;
T18 : ';' ;
T19 : 'function' ;
T20 : 'module' ;
T21 : 'request' ;
T22 : 'response' ;
T23 : 'import' ;
T24 : '<--' ;
T25 : 'inactive' ;
T26 : 'table' ;
T27 : 'export' ;
T28 : '-->' ;
T29 : 'change' ;

// $ANTLR src "..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g" 540
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g" 546
RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g" 553
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g" 559
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g" 565
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//net.sf.rcer.rfcgen/src-gen//net/sf/rcer/rfcgen/parser/rfcgen.g" 571
RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

