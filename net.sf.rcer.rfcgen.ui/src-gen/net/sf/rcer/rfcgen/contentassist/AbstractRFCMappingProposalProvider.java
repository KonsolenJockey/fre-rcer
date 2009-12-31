/*
* generated by Xtext
*/
package net.sf.rcer.rfcgen.contentassist;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.*;
import org.eclipse.xtext.common.contentassist.TerminalsProposalProvider;
import org.eclipse.xtext.ui.core.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.core.editor.contentassist.ContentAssistContext;

/**
 * Represents a generated, default implementation of interface {@link IProposalProvider}.
 * Methods are dynamically dispatched on the first parameter, i.e., you can override them 
 * with a more concrete subtype. 
 */
public class AbstractRFCMappingProposalProvider extends TerminalsProposalProvider {
		
	private final static Logger logger = Logger.getLogger(AbstractRFCMappingProposalProvider.class);
	
	public void completeModel_PackageName(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeModel_PackageName feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeModel_Structures(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeModel_Structures feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeModel_FunctionModules(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeModel_FunctionModules feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeStructure_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeStructure_Name feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeStructure_Mapping(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeStructure_Mapping feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeStructurePOJOMapping_ClassName(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeStructurePOJOMapping_ClassName feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeStructurePOJOMapping_Fields(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeStructurePOJOMapping_Fields feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeStructureFieldPOJOMapping_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeStructureFieldPOJOMapping_Name feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeStructureFieldPOJOMapping_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeStructureFieldPOJOMapping_Type feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeStructureFieldPOJOMapping_Attribute(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeStructureFieldPOJOMapping_Attribute feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeStructureFieldPOJOMapping_Comment(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeStructureFieldPOJOMapping_Comment feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModule_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModule_Name feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModule_Mapping(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModule_Mapping feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOCallMapping_ClassName(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOCallMapping_ClassName feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOCallMapping_Parameters(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOCallMapping_Parameters feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJORequestResponseMapping_RequestClassName(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJORequestResponseMapping_RequestClassName feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJORequestResponseMapping_RequestParameters(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJORequestResponseMapping_RequestParameters feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJORequestResponseMapping_ResponseClassName(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJORequestResponseMapping_ResponseClassName feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJORequestResponseMapping_ResponseParameters(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJORequestResponseMapping_ResponseParameters feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOImportingParameter_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOImportingParameter_Name feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOImportingParameter_IsInactive(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOImportingParameter_IsInactive feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void completeFunctionModulePOJOImportingParameter_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOImportingParameter_Type feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOImportingParameter_Attribute(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOImportingParameter_Attribute feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOImportingParameter_IsStructure(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOImportingParameter_IsStructure feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void completeFunctionModulePOJOImportingParameter_IsTable(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOImportingParameter_IsTable feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void completeFunctionModulePOJOImportingParameter_Comment(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOImportingParameter_Comment feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOExportingParameter_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOExportingParameter_Name feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOExportingParameter_IsInactive(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOExportingParameter_IsInactive feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void completeFunctionModulePOJOExportingParameter_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOExportingParameter_Type feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOExportingParameter_Attribute(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOExportingParameter_Attribute feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOExportingParameter_IsStructure(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOExportingParameter_IsStructure feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void completeFunctionModulePOJOExportingParameter_IsTable(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOExportingParameter_IsTable feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void completeFunctionModulePOJOExportingParameter_Comment(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOExportingParameter_Comment feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOChangingParameter_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOChangingParameter_Name feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOChangingParameter_IsInactive(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOChangingParameter_IsInactive feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void completeFunctionModulePOJOChangingParameter_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOChangingParameter_Type feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOChangingParameter_Attribute(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOChangingParameter_Attribute feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOChangingParameter_IsStructure(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOChangingParameter_IsStructure feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void completeFunctionModulePOJOChangingParameter_IsTable(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOChangingParameter_IsTable feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void completeFunctionModulePOJOChangingParameter_Comment(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOChangingParameter_Comment feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOTablesParameter_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOTablesParameter_Name feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOTablesParameter_IsInactive(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOTablesParameter_IsInactive feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void completeFunctionModulePOJOTablesParameter_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOTablesParameter_Type feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOTablesParameter_Attribute(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOTablesParameter_Attribute feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
	public void completeFunctionModulePOJOTablesParameter_Comment(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("completeFunctionModulePOJOTablesParameter_Comment feature '" + assignment.getFeature() + "' terminal '"
					+ assignment.getTerminal() + "' cardinality '" + assignment.getCardinality() + "' and prefix '"
					+ context.getPrefix() + "'");
		}
		completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
	}
    
	public void complete_Model(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Model '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_Structure(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_Structure '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_StructureMapping(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_StructureMapping '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_StructurePOJOMapping(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_StructurePOJOMapping '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_StructureFieldPOJOMapping(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_StructureFieldPOJOMapping '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_FunctionModule(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_FunctionModule '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_FunctionModuleMapping(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_FunctionModuleMapping '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_FunctionModulePOJOMapping(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_FunctionModulePOJOMapping '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_FunctionModulePOJOCallMapping(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_FunctionModulePOJOCallMapping '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_FunctionModulePOJORequestResponseMapping(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_FunctionModulePOJORequestResponseMapping '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_FunctionModulePOJOParameterMapping(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_FunctionModulePOJOParameterMapping '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_FunctionModulePOJOImportingParameter(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_FunctionModulePOJOImportingParameter '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_FunctionModulePOJOExportingParameter(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_FunctionModulePOJOExportingParameter '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_FunctionModulePOJOChangingParameter(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_FunctionModulePOJOChangingParameter '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
	public void complete_FunctionModulePOJOTablesParameter(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (logger.isDebugEnabled()) {
			logger.debug("complete_FunctionModulePOJOTablesParameter '" + ruleCall.getRule().getName() + "' cardinality '" + ruleCall.getCardinality()
					+ "' for model '" + context.getCurrentModel() + "' and prefix '" + context.getPrefix() + "'");
		}
		// subclasses may override
	}
}