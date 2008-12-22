grammar rfcgen;
 options{backtrack=true; memoize=true;} 

@lexer::header {
package net.sf.rcer.rfcgen.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

@parser::header {
package net.sf.rcer.rfcgen.parser;

import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManager;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import net.sf.rcer.rfcgen.MetaModelRegistration;

}
@lexer::members {
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

@parser::members {

	private Token getLastToken() {
		return input.LT(-1);
	}
	private Token getNextToken() {
		return input.LT(1);
	}

	private int line() {
		Token t = getNextToken();
		if (t==null)
			return 1;
		return t.getLine();
	}

	private int start() {
		Token t = getNextToken();
		if (t==null)
			return 0;
		if (t instanceof CommonToken) {
			return ((CommonToken)t).getStartIndex();
		}
		return t.getTokenIndex();
	}

	private int end() {
		Token t = getLastToken();
		if (t==null)
			return 1;
		if (t instanceof CommonToken) {
			return ((CommonToken)t).getStopIndex()+1;
		}
		return t.getTokenIndex();
	}

	protected Object convert(Object arg) {
		if (arg instanceof org.antlr.runtime.Token) {
			Token t = (Token) arg;
			String s = t.getText();
			if (t.getType() == rfcgenLexer.RULE_ID && s.startsWith("^")) {
				return s.substring(1);
			} else if (t.getType()==rfcgenLexer.RULE_STRING) {
				return s.substring(1,s.length()-1);
			} else if (t.getType()==rfcgenLexer.RULE_INT) {
				return Integer.valueOf(s);
			}
			return s;
		}
		return arg;
	}


	private EcoreModelFactory factory = new EcoreModelFactory(MetaModelRegistration.getEPackage());
    private ParseTreeManager ptm = new ParseTreeManager();
	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
	
	{
		
	}

	public ParseTreeManager getResult() {
		return ptm;
	}

	private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	@Override
		public void reportError(RecognitionException e) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
			ptm.addError(msg, e);
			ptm.ruleFinished(null, end());
		}

}


parse returns [Node r]:
	 result=ruleGenSpec EOF
{ptm.ruleFinished(result,end());$r = ptm.getCurrent();};

ruleGenSpec returns [EObject result] :
			{
				$result = factory.create("", "GenSpec");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(0)),line(),start());}'package'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(1)),line(),start());}temp_packageName=RULE_STRING {factory.set($result,"packageName",convert(temp_packageName),false); ptm.ruleFinished(temp_packageName,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(2)),line(),start());}temp_structures=ruleStructure {factory.add($result,"structures",convert(temp_structures),false); ptm.ruleFinished(temp_structures,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)).eContents().get(3)),line(),start());}temp_functionModules=ruleFunctionModule {factory.add($result,"functionModules",convert(temp_functionModules),false); ptm.ruleFinished(temp_functionModules,end()); }
)*
)
;

ruleStructure returns [EObject result] :
			{
				$result = factory.create("", "Structure");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}'structure'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}'class'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)),line(),start());}temp_className=RULE_ID {factory.set($result,"className",convert(temp_className),false); ptm.ruleFinished(temp_className,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)),line(),start());}'{'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(5)),line(),start());}temp_fields=ruleStructureFieldMapping {factory.add($result,"fields",convert(temp_fields),false); ptm.ruleFinished(temp_fields,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(6)),line(),start());}'}'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleStructureFieldMapping returns [EObject result] :
			{
				$result = factory.create("", "StructureFieldMapping");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)),line(),start());}'field'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)),line(),start());}'<->'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(3)),line(),start());}temp_type=RULE_ID {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(4)),line(),start());}temp_attribute=RULE_ID {factory.set($result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); }
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(5)).eContents().get(0)),line(),start());}'comment'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(5)).eContents().get(1)),line(),start());}temp_comment=RULE_STRING {factory.set($result,"comment",convert(temp_comment),false); ptm.ruleFinished(temp_comment,end()); }
)
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(6)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleFunctionModule returns [EObject result] :
			{
				$result = factory.create("", "FunctionModule");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}'function'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}'module'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(2)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(3)),line(),start());}'{'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(4)),line(),start());}temp_mapping=ruleFunctionModuleMapping {factory.set($result,"mapping",convert(temp_mapping),false); ptm.ruleFinished(temp_mapping,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)).eContents().get(5)),line(),start());}'}'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleFunctionModuleMapping returns [EObject result] :
        temp_functionmodulecallmapping=ruleFunctionModuleCallMapping {$result=temp_functionmodulecallmapping;}	|        temp_functionmodulerequestresponsemapping=ruleFunctionModuleRequestResponseMapping {$result=temp_functionmodulerequestresponsemapping;}	;

ruleFunctionModuleCallMapping returns [EObject result] :
			{
				$result = factory.create("", "FunctionModuleCallMapping");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(0)),line(),start());}'class'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(1)),line(),start());}temp_className=RULE_ID {factory.set($result,"className",convert(temp_className),false); ptm.ruleFinished(temp_className,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(2)),line(),start());}'{'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(3)),line(),start());}temp_parameters=ruleFunctionModuleParameterMapping {factory.add($result,"parameters",convert(temp_parameters),false); ptm.ruleFinished(temp_parameters,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)).eContents().get(4)),line(),start());}'}'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleFunctionModuleRequestResponseMapping returns [EObject result] :
			{
				$result = factory.create("", "FunctionModuleRequestResponseMapping");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(0)),line(),start());}'request'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(1)),line(),start());}'class'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(2)),line(),start());}temp_requestClassName=RULE_ID {factory.set($result,"requestClassName",convert(temp_requestClassName),false); ptm.ruleFinished(temp_requestClassName,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(3)),line(),start());}'{'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(4)),line(),start());}temp_requestParameters=ruleFunctionModuleParameterMapping {factory.add($result,"requestParameters",convert(temp_requestParameters),false); ptm.ruleFinished(temp_requestParameters,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(5)),line(),start());}'}'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(6)),line(),start());}'response'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(7)),line(),start());}'class'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(8)),line(),start());}temp_responseClassName=RULE_ID {factory.set($result,"responseClassName",convert(temp_responseClassName),false); ptm.ruleFinished(temp_responseClassName,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(9)),line(),start());}'{'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(10)),line(),start());}temp_responseParameters=ruleFunctionModuleParameterMapping {factory.add($result,"responseParameters",convert(temp_responseParameters),false); ptm.ruleFinished(temp_responseParameters,end()); }
)*

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)).eContents().get(11)),line(),start());}'}'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleFunctionModuleParameterMapping returns [EObject result] :
        temp_functionmoduleimportingparameter=ruleFunctionModuleImportingParameter {$result=temp_functionmoduleimportingparameter;}	|        temp_functionmoduleexportingparameter=ruleFunctionModuleExportingParameter {$result=temp_functionmoduleexportingparameter;}	|        temp_functionmodulechangingparameter=ruleFunctionModuleChangingParameter {$result=temp_functionmodulechangingparameter;}	|        temp_functionmoduletablesparameter=ruleFunctionModuleTablesParameter {$result=temp_functionmoduletablesparameter;}	;

ruleFunctionModuleImportingParameter returns [EObject result] :
			{
				$result = factory.create("", "FunctionModuleImportingParameter");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)),line(),start());}'import'{ptm.ruleFinished(getLastToken(),end());})

((({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}'field'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)),line(),start());}'<--'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)),line(),start());}temp_isInactive='inactive' {factory.set($result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); }
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}temp_type=RULE_ID {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}temp_attribute=RULE_ID {factory.set($result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); }
)
)
)
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}temp_isStructure='structure' {factory.set($result,"isStructure",true); ptm.ruleFinished(temp_isStructure,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}'<--'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());}temp_isInactive='inactive' {factory.set($result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); }
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}temp_type=RULE_ID {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}temp_attribute=RULE_ID {factory.set($result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); }
)
)
)
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());}temp_isTable='table' {factory.set($result,"isTable",true); ptm.ruleFinished(temp_isTable,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)),line(),start());}'<--'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)),line(),start());}temp_isInactive='inactive' {factory.set($result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); }
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}temp_type=RULE_ID {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}temp_attribute=RULE_ID {factory.set($result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); }
)
)
)
)
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());}'comment'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());}temp_comment=RULE_STRING {factory.set($result,"comment",convert(temp_comment),false); ptm.ruleFinished(temp_comment,end()); }
)
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleFunctionModuleExportingParameter returns [EObject result] :
			{
				$result = factory.create("", "FunctionModuleExportingParameter");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(0)),line(),start());}'export'{ptm.ruleFinished(getLastToken(),end());})

((({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}'field'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)),line(),start());}'-->'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)),line(),start());}temp_isInactive='inactive' {factory.set($result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); }
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}temp_type=RULE_ID {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}temp_attribute=RULE_ID {factory.set($result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); }
)
)
)
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}temp_isStructure='structure' {factory.set($result,"isStructure",true); ptm.ruleFinished(temp_isStructure,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}'-->'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());}temp_isInactive='inactive' {factory.set($result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); }
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}temp_type=RULE_ID {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}temp_attribute=RULE_ID {factory.set($result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); }
)
)
)
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());}temp_isTable='table' {factory.set($result,"isTable",true); ptm.ruleFinished(temp_isTable,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)),line(),start());}'-->'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)),line(),start());}temp_isInactive='inactive' {factory.set($result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); }
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}temp_type=RULE_ID {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}temp_attribute=RULE_ID {factory.set($result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); }
)
)
)
)
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());}'comment'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());}temp_comment=RULE_STRING {factory.set($result,"comment",convert(temp_comment),false); ptm.ruleFinished(temp_comment,end()); }
)
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)).eContents().get(3)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleFunctionModuleChangingParameter returns [EObject result] :
			{
				$result = factory.create("", "FunctionModuleChangingParameter");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)),line(),start());}'change'{ptm.ruleFinished(getLastToken(),end());})

((({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(0)),line(),start());}'field'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(2)),line(),start());}'<->'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(0)),line(),start());}temp_isInactive='inactive' {factory.set($result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); }
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}temp_type=RULE_ID {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(0)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}temp_attribute=RULE_ID {factory.set($result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); }
)
)
)
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(0)),line(),start());}temp_isStructure='structure' {factory.set($result,"isStructure",true); ptm.ruleFinished(temp_isStructure,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(2)),line(),start());}'<->'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());}temp_isInactive='inactive' {factory.set($result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); }
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}temp_type=RULE_ID {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}temp_attribute=RULE_ID {factory.set($result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); }
)
)
)
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());}temp_isTable='table' {factory.set($result,"isTable",true); ptm.ruleFinished(temp_isTable,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(2)),line(),start());}'<->'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(0)),line(),start());}temp_isInactive='inactive' {factory.set($result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); }
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}temp_type=RULE_ID {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)).eContents().get(2)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}temp_attribute=RULE_ID {factory.set($result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); }
)
)
)
)
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)).eContents().get(0)),line(),start());}'comment'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(2)).eContents().get(1)),line(),start());}temp_comment=RULE_STRING {factory.set($result,"comment",convert(temp_comment),false); ptm.ruleFinished(temp_comment,end()); }
)
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(3)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
)
;

ruleFunctionModuleTablesParameter returns [EObject result] :
			{
				$result = factory.create("", "FunctionModuleTablesParameter");
				ptm.setModelElement($result);
			 }
(({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)),line(),start());}'table'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)),line(),start());}temp_name=RULE_STRING {factory.set($result,"name",convert(temp_name),false); ptm.ruleFinished(temp_name,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)),line(),start());}'<->'{ptm.ruleFinished(getLastToken(),end());})

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)).eContents().get(0)),line(),start());}temp_isInactive='inactive' {factory.set($result,"isInactive",true); ptm.ruleFinished(temp_isInactive,end()); }
)
	|
(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(0)),line(),start());}temp_type=RULE_ID {factory.set($result,"type",convert(temp_type),false); ptm.ruleFinished(temp_type,end()); }
)

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)).eContents().get(1)).eContents().get(1)),line(),start());}temp_attribute=RULE_ID {factory.set($result,"attribute",convert(temp_attribute),false); ptm.ruleFinished(temp_attribute,end()); }
)
)
)

(({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(4)).eContents().get(0)),line(),start());}'comment'{ptm.ruleFinished(getLastToken(),end());})

({ptm.invokeRule(((EObject)((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(4)).eContents().get(1)),line(),start());}temp_comment=RULE_STRING {factory.set($result,"comment",convert(temp_comment),false); ptm.ruleFinished(temp_comment,end()); }
)
)?

({ptm.invokeRule(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(5)),line(),start());}';'{ptm.ruleFinished(getLastToken(),end());})
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

