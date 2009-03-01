grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=ruleGenSpec
	 // Always return the root node! This prevents that this method is called multiple times
	 // with interesting side effects.
	 EOF
;

ruleGenSpec 

:
(('package')

(RULE_STRING)

(ruleStructure)*

(ruleFunctionModule)*
)
;

ruleStructure 

:
(('structure')

(RULE_STRING)

('{')

(ruleStructureMapping)

('}')
)
;

ruleStructureMapping 
:
        temp_structurepojomapping=ruleStructurePOJOMapping 	;

ruleStructurePOJOMapping 

:
(('class')

(RULE_ID)

('{')

(ruleStructureFieldPOJOMapping)*

('}')
)
;

ruleStructureFieldPOJOMapping 

:
(('field')

(RULE_STRING)

('=')

(RULE_ID)

(RULE_ID)

(('comment')

(RULE_STRING)
)?

(';')
)
;

ruleFunctionModule 

:
(('function')

('module')

(RULE_STRING)

('{')

(ruleFunctionModuleMapping)

('}')
)
;

ruleFunctionModuleMapping 
:
        temp_functionmodulepojomapping=ruleFunctionModulePOJOMapping 	;

ruleFunctionModulePOJOMapping 
:
        temp_functionmodulepojocallmapping=ruleFunctionModulePOJOCallMapping 	|        temp_functionmodulepojorequestresponsemapping=ruleFunctionModulePOJORequestResponseMapping 	;

ruleFunctionModulePOJOCallMapping 

:
(('class')

(RULE_ID)

('{')

(ruleFunctionModulePOJOParameterMapping)*

('}')
)
;

ruleFunctionModulePOJORequestResponseMapping 

:
(('request')

('class')

(RULE_ID)

('{')

(ruleFunctionModulePOJOParameterMapping)*

('}')

('response')

('class')

(RULE_ID)

('{')

(ruleFunctionModulePOJOParameterMapping)*

('}')
)
;

ruleFunctionModulePOJOParameterMapping 
:
        temp_functionmodulepojoimportingparameter=ruleFunctionModulePOJOImportingParameter 	|        temp_functionmodulepojoexportingparameter=ruleFunctionModulePOJOExportingParameter 	|        temp_functionmodulepojochangingparameter=ruleFunctionModulePOJOChangingParameter 	|        temp_functionmodulepojotablesparameter=ruleFunctionModulePOJOTablesParameter 	;

ruleFunctionModulePOJOImportingParameter 

:
(('import')

((('field')

(RULE_STRING)

('=')

(('inactive')
	|
((RULE_ID)

(RULE_ID)
)
)
)
	|
(('structure')

(RULE_STRING)

('=')

(('inactive')
	|
((RULE_ID)

(RULE_ID)
)
)
)
	|
(('table')

(RULE_STRING)

('=')

(('inactive')
	|
((RULE_ID)

(RULE_ID)
)
)
)
)

(('comment')

(RULE_STRING)
)?

(';')
)
;

ruleFunctionModulePOJOExportingParameter 

:
(('export')

((('field')

(RULE_STRING)

('=')

(('inactive')
	|
((RULE_ID)

(RULE_ID)
)
)
)
	|
(('structure')

(RULE_STRING)

('=')

(('inactive')
	|
((RULE_ID)

(RULE_ID)
)
)
)
	|
(('table')

(RULE_STRING)

('=')

(('inactive')
	|
((RULE_ID)

(RULE_ID)
)
)
)
)

(('comment')

(RULE_STRING)
)?

(';')
)
;

ruleFunctionModulePOJOChangingParameter 

:
(('change')

((('field')

(RULE_STRING)

('=')

(('inactive')
	|
((RULE_ID)

(RULE_ID)
)
)
)
	|
(('structure')

(RULE_STRING)

('=')

(('inactive')
	|
((RULE_ID)

(RULE_ID)
)
)
)
	|
(('table')

(RULE_STRING)

('=')

(('inactive')
	|
((RULE_ID)

(RULE_ID)
)
)
)
)

(('comment')

(RULE_STRING)
)?

(';')
)
;

ruleFunctionModulePOJOTablesParameter 

:
(('table')

(RULE_STRING)

('=')

(('inactive')
	|
((RULE_ID)

(RULE_ID)
)
)

(('comment')

(RULE_STRING)
)?

(';')
)
;

RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

RULE_STRING :

	 '\"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\"') )* '\"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

RULE_INT :

	 ('-')?('0'..'9')+
	 
;

RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

RULE_SL_COMMENT :

	 '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	 
;

