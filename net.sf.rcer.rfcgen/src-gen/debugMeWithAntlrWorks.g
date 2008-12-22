grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=ruleGenSpec EOF
;

ruleGenSpec  :
(('package')

(temp_packageName=RULE_STRING )

(temp_structures=ruleStructure )*

(temp_functionModules=ruleFunctionModule )*
)
;

ruleStructure  :
(('structure')

(temp_name=RULE_STRING )

('class')

(temp_className=RULE_ID )

('{')

(temp_fields=ruleStructureFieldMapping )*

('}')
)
;

ruleStructureFieldMapping  :
(('field')

(temp_name=RULE_STRING )

('<->')

(temp_type=RULE_ID )

(temp_attribute=RULE_ID )

(('comment')

(temp_comment=RULE_STRING )
)?

(';')
)
;

ruleFunctionModule  :
(('function')

('module')

(temp_name=RULE_STRING )

('{')

(temp_mapping=ruleFunctionModuleMapping )

('}')
)
;

ruleFunctionModuleMapping  :
        temp_functionmodulecallmapping=ruleFunctionModuleCallMapping 	|        temp_functionmodulerequestresponsemapping=ruleFunctionModuleRequestResponseMapping 	;

ruleFunctionModuleCallMapping  :
(('class')

(temp_className=RULE_ID )

('{')

(temp_parameters=ruleFunctionModuleParameterMapping )*

('}')
)
;

ruleFunctionModuleRequestResponseMapping  :
(('request')

('class')

(temp_requestClassName=RULE_ID )

('{')

(temp_requestParameters=ruleFunctionModuleParameterMapping )*

('}')

('response')

('class')

(temp_responseClassName=RULE_ID )

('{')

(temp_responseParameters=ruleFunctionModuleParameterMapping )*

('}')
)
;

ruleFunctionModuleParameterMapping  :
        temp_functionmoduleimportingparameter=ruleFunctionModuleImportingParameter 	|        temp_functionmoduleexportingparameter=ruleFunctionModuleExportingParameter 	|        temp_functionmodulechangingparameter=ruleFunctionModuleChangingParameter 	|        temp_functionmoduletablesparameter=ruleFunctionModuleTablesParameter 	;

ruleFunctionModuleImportingParameter  :
(('import')

((('field')

(temp_name=RULE_STRING )

('<--')

((temp_isInactive='inactive' )
	|
((temp_type=RULE_ID )

(temp_attribute=RULE_ID )
)
)
)
	|
((temp_isStructure='structure' )

(temp_name=RULE_STRING )

('<--')

((temp_isInactive='inactive' )
	|
((temp_type=RULE_ID )

(temp_attribute=RULE_ID )
)
)
)
	|
((temp_isTable='table' )

(temp_name=RULE_STRING )

('<--')

((temp_isInactive='inactive' )
	|
((temp_type=RULE_ID )

(temp_attribute=RULE_ID )
)
)
)
)

(('comment')

(temp_comment=RULE_STRING )
)?

(';')
)
;

ruleFunctionModuleExportingParameter  :
(('export')

((('field')

(temp_name=RULE_STRING )

('-->')

((temp_isInactive='inactive' )
	|
((temp_type=RULE_ID )

(temp_attribute=RULE_ID )
)
)
)
	|
((temp_isStructure='structure' )

(temp_name=RULE_STRING )

('-->')

((temp_isInactive='inactive' )
	|
((temp_type=RULE_ID )

(temp_attribute=RULE_ID )
)
)
)
	|
((temp_isTable='table' )

(temp_name=RULE_STRING )

('-->')

((temp_isInactive='inactive' )
	|
((temp_type=RULE_ID )

(temp_attribute=RULE_ID )
)
)
)
)

(('comment')

(temp_comment=RULE_STRING )
)?

(';')
)
;

ruleFunctionModuleChangingParameter  :
(('change')

((('field')

(temp_name=RULE_STRING )

('<->')

((temp_isInactive='inactive' )
	|
((temp_type=RULE_ID )

(temp_attribute=RULE_ID )
)
)
)
	|
((temp_isStructure='structure' )

(temp_name=RULE_STRING )

('<->')

((temp_isInactive='inactive' )
	|
((temp_type=RULE_ID )

(temp_attribute=RULE_ID )
)
)
)
	|
((temp_isTable='table' )

(temp_name=RULE_STRING )

('<->')

((temp_isInactive='inactive' )
	|
((temp_type=RULE_ID )

(temp_attribute=RULE_ID )
)
)
)
)

(('comment')

(temp_comment=RULE_STRING )
)?

(';')
)
;

ruleFunctionModuleTablesParameter  :
(('table')

(temp_name=RULE_STRING )

('<->')

((temp_isInactive='inactive' )
	|
((temp_type=RULE_ID )

(temp_attribute=RULE_ID )
)
)

(('comment')

(temp_comment=RULE_STRING )
)?

(';')
)
;

RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

RULE_STRING :

	 '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'"') )* '"' |
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

