package net.sf.rcer.rfcgen.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.sf.rcer.rfcgen.mapping.FunctionModule;
import net.sf.rcer.rfcgen.mapping.FunctionModulePOJOCallMapping;
import net.sf.rcer.rfcgen.mapping.FunctionModulePOJOChangingParameter;
import net.sf.rcer.rfcgen.mapping.FunctionModulePOJOExportingParameter;
import net.sf.rcer.rfcgen.mapping.FunctionModulePOJOImportingParameter;
import net.sf.rcer.rfcgen.mapping.FunctionModulePOJORequestResponseMapping;
import net.sf.rcer.rfcgen.mapping.FunctionModulePOJOTablesParameter;
import net.sf.rcer.rfcgen.mapping.Import;
import net.sf.rcer.rfcgen.mapping.MappingPackage;
import net.sf.rcer.rfcgen.mapping.Model;
import net.sf.rcer.rfcgen.mapping.Structure;
import net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping;
import net.sf.rcer.rfcgen.mapping.StructurePOJOMapping;
import net.sf.rcer.rfcgen.services.RFCMappingGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractRFCMappingSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RFCMappingGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == MappingPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case MappingPackage.FUNCTION_MODULE:
				if(context == grammarAccess.getFunctionModuleRule()) {
					sequence_FunctionModule(context, (FunctionModule) semanticObject); 
					return; 
				}
				else break;
			case MappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING:
				if(context == grammarAccess.getFunctionModuleMappingRule() ||
				   context == grammarAccess.getFunctionModulePOJOCallMappingRule() ||
				   context == grammarAccess.getFunctionModulePOJOMappingRule()) {
					sequence_FunctionModulePOJOCallMapping(context, (FunctionModulePOJOCallMapping) semanticObject); 
					return; 
				}
				else break;
			case MappingPackage.FUNCTION_MODULE_POJO_CHANGING_PARAMETER:
				if(context == grammarAccess.getFunctionModulePOJOChangingParameterRule() ||
				   context == grammarAccess.getFunctionModulePOJOParameterMappingRule()) {
					sequence_FunctionModulePOJOChangingParameter(context, (FunctionModulePOJOChangingParameter) semanticObject); 
					return; 
				}
				else break;
			case MappingPackage.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER:
				if(context == grammarAccess.getFunctionModulePOJOExportingParameterRule() ||
				   context == grammarAccess.getFunctionModulePOJOParameterMappingRule()) {
					sequence_FunctionModulePOJOExportingParameter(context, (FunctionModulePOJOExportingParameter) semanticObject); 
					return; 
				}
				else break;
			case MappingPackage.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER:
				if(context == grammarAccess.getFunctionModulePOJOImportingParameterRule() ||
				   context == grammarAccess.getFunctionModulePOJOParameterMappingRule()) {
					sequence_FunctionModulePOJOImportingParameter(context, (FunctionModulePOJOImportingParameter) semanticObject); 
					return; 
				}
				else break;
			case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING:
				if(context == grammarAccess.getFunctionModuleMappingRule() ||
				   context == grammarAccess.getFunctionModulePOJOMappingRule() ||
				   context == grammarAccess.getFunctionModulePOJORequestResponseMappingRule()) {
					sequence_FunctionModulePOJORequestResponseMapping(context, (FunctionModulePOJORequestResponseMapping) semanticObject); 
					return; 
				}
				else break;
			case MappingPackage.FUNCTION_MODULE_POJO_TABLES_PARAMETER:
				if(context == grammarAccess.getFunctionModulePOJOParameterMappingRule() ||
				   context == grammarAccess.getFunctionModulePOJOTablesParameterRule()) {
					sequence_FunctionModulePOJOTablesParameter(context, (FunctionModulePOJOTablesParameter) semanticObject); 
					return; 
				}
				else break;
			case MappingPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case MappingPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case MappingPackage.STRUCTURE:
				if(context == grammarAccess.getStructureRule()) {
					sequence_Structure(context, (Structure) semanticObject); 
					return; 
				}
				else break;
			case MappingPackage.STRUCTURE_FIELD_POJO_MAPPING:
				if(context == grammarAccess.getStructureFieldPOJOMappingRule()) {
					sequence_StructureFieldPOJOMapping(context, (StructureFieldPOJOMapping) semanticObject); 
					return; 
				}
				else break;
			case MappingPackage.STRUCTURE_POJO_MAPPING:
				if(context == grammarAccess.getStructureMappingRule() ||
				   context == grammarAccess.getStructurePOJOMappingRule()) {
					sequence_StructurePOJOMapping(context, (StructurePOJOMapping) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (className=ID parameters+=FunctionModulePOJOParameterMapping*)
	 */
	protected void sequence_FunctionModulePOJOCallMapping(EObject context, FunctionModulePOJOCallMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (name=STRING (inactive?='inactive' | (type=DataType attribute=ID))) | 
	 *             (
	 *                 structure?='structure' 
	 *                 name=STRING 
	 *                 (inactive?='inactive' | (structureMapping=[StructurePOJOMapping|ID] attribute=ID) | (external?='external' externalClass=[Import|ID] attribute=ID))
	 *             ) | 
	 *             (
	 *                 table?='table' 
	 *                 name=STRING 
	 *                 (inactive?='inactive' | (structureMapping=[StructurePOJOMapping|ID] attribute=ID) | (external?='external' externalClass=[Import|ID] attribute=ID))
	 *             )
	 *         ) 
	 *         comment=STRING?
	 *     )
	 */
	protected void sequence_FunctionModulePOJOChangingParameter(EObject context, FunctionModulePOJOChangingParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (name=STRING (inactive?='inactive' | (type=DataType attribute=ID))) | 
	 *             (
	 *                 structure?='structure' 
	 *                 name=STRING 
	 *                 (inactive?='inactive' | (structureMapping=[StructurePOJOMapping|ID] attribute=ID) | (external?='external' externalClass=[Import|ID] attribute=ID))
	 *             ) | 
	 *             (
	 *                 table?='table' 
	 *                 name=STRING 
	 *                 (inactive?='inactive' | (structureMapping=[StructurePOJOMapping|ID] attribute=ID) | (external?='external' externalClass=[Import|ID] attribute=ID))
	 *             )
	 *         ) 
	 *         comment=STRING?
	 *     )
	 */
	protected void sequence_FunctionModulePOJOExportingParameter(EObject context, FunctionModulePOJOExportingParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (name=STRING (inactive?='inactive' | (type=DataType attribute=ID))) | 
	 *             (
	 *                 structure?='structure' 
	 *                 name=STRING 
	 *                 (inactive?='inactive' | (structureMapping=[StructurePOJOMapping|ID] attribute=ID) | (external?='external' externalClass=[Import|ID] attribute=ID))
	 *             ) | 
	 *             (
	 *                 table?='table' 
	 *                 name=STRING 
	 *                 (inactive?='inactive' | (structureMapping=[StructurePOJOMapping|ID] attribute=ID) | (external?='external' externalClass=[Import|ID] attribute=ID))
	 *             )
	 *         ) 
	 *         comment=STRING?
	 *     )
	 */
	protected void sequence_FunctionModulePOJOImportingParameter(EObject context, FunctionModulePOJOImportingParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         requestClassName=ID 
	 *         requestParameters+=FunctionModulePOJOParameterMapping* 
	 *         responseClassName=ID 
	 *         responseParameters+=FunctionModulePOJOParameterMapping*
	 *     )
	 */
	protected void sequence_FunctionModulePOJORequestResponseMapping(EObject context, FunctionModulePOJORequestResponseMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         (inactive?='inactive' | (structureMapping=[StructurePOJOMapping|ID] attribute=ID) | (external?='external' externalClass=[Import|ID] attribute=ID)) 
	 *         comment=STRING?
	 *     )
	 */
	protected void sequence_FunctionModulePOJOTablesParameter(EObject context, FunctionModulePOJOTablesParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING mapping=FunctionModuleMapping)
	 */
	protected void sequence_FunctionModule(EObject context, FunctionModule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MappingPackage.Literals.FUNCTION_MODULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingPackage.Literals.FUNCTION_MODULE__NAME));
			if(transientValues.isValueTransient(semanticObject, MappingPackage.Literals.FUNCTION_MODULE__MAPPING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingPackage.Literals.FUNCTION_MODULE__MAPPING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionModuleAccess().getNameSTRINGTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFunctionModuleAccess().getMappingFunctionModuleMappingParserRuleCall_4_0(), semanticObject.getMapping());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fullName=QualifiedName name=ID)
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MappingPackage.Literals.IMPORT__FULL_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingPackage.Literals.IMPORT__FULL_NAME));
			if(transientValues.isValueTransient(semanticObject, MappingPackage.Literals.IMPORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingPackage.Literals.IMPORT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getFullNameQualifiedNameParserRuleCall_1_0(), semanticObject.getFullName());
		feeder.accept(grammarAccess.getImportAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (packageName=STRING imports+=Import* structures+=Structure* functionModules+=FunctionModule*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING (inactive?='inactive' | (type=DataType attribute=ID)) comment=STRING?)
	 */
	protected void sequence_StructureFieldPOJOMapping(EObject context, StructureFieldPOJOMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID fields+=StructureFieldPOJOMapping*)
	 */
	protected void sequence_StructurePOJOMapping(EObject context, StructurePOJOMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING mapping=StructureMapping)
	 */
	protected void sequence_Structure(EObject context, Structure semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, MappingPackage.Literals.STRUCTURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingPackage.Literals.STRUCTURE__NAME));
			if(transientValues.isValueTransient(semanticObject, MappingPackage.Literals.STRUCTURE__MAPPING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MappingPackage.Literals.STRUCTURE__MAPPING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStructureAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStructureAccess().getMappingStructureMappingParserRuleCall_3_0(), semanticObject.getMapping());
		feeder.finish();
	}
}
