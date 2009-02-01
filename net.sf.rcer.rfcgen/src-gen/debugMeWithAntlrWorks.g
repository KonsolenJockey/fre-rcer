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

('class')

(RULE_ID)

('{')

(ruleStructureFieldMapping)*

('}')
)
;

ruleStructureFieldMapping 

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
        temp_functionmodulecallmapping=ruleFunctionModuleCallMapping 	|        temp_functionmodulerequestresponsemapping=ruleFunctionModuleRequestResponseMapping 	;

ruleFunctionModuleCallMapping 

:
(('class')

(RULE_ID)

('{')

(ruleFunctionModuleParameterMapping)*

('}')
)
;

ruleFunctionModuleRequestResponseMapping 

:
(('request')

('class')

(RULE_ID)

('{')

(ruleFunctionModuleParameterMapping)*

('}')

('response')

('class')

(RULE_ID)

('{')

(ruleFunctionModuleParameterMapping)*

('}')
)
;

ruleFunctionModuleParameterMapping 
:
        temp_functionmoduleimportingparameter=ruleFunctionModuleImportingParameter 	|        temp_functionmoduleexportingparameter=ruleFunctionModuleExportingParameter 	|        temp_functionmodulechangingparameter=ruleFunctionModuleChangingParameter 	|        temp_functionmoduletablesparameter=ruleFunctionModuleTablesParameter 	;

ruleFunctionModuleImportingParameter 

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

ruleFunctionModuleExportingParameter 

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

ruleFunctionModuleChangingParameter 

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

ruleFunctionModuleTablesParameter 

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

