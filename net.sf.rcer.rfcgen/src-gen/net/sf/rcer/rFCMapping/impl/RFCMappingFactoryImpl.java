/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rFCMapping.impl;

import net.sf.rcer.rFCMapping.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RFCMappingFactoryImpl extends EFactoryImpl implements RFCMappingFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RFCMappingFactory init()
  {
    try
    {
      RFCMappingFactory theRFCMappingFactory = (RFCMappingFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/rcer/RFCMapping"); 
      if (theRFCMappingFactory != null)
      {
        return theRFCMappingFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RFCMappingFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RFCMappingFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RFCMappingPackage.MODEL: return createModel();
      case RFCMappingPackage.STRUCTURE: return createStructure();
      case RFCMappingPackage.STRUCTURE_MAPPING: return createStructureMapping();
      case RFCMappingPackage.STRUCTURE_POJO_MAPPING: return createStructurePOJOMapping();
      case RFCMappingPackage.STRUCTURE_FIELD_POJO_MAPPING: return createStructureFieldPOJOMapping();
      case RFCMappingPackage.FUNCTION_MODULE: return createFunctionModule();
      case RFCMappingPackage.FUNCTION_MODULE_MAPPING: return createFunctionModuleMapping();
      case RFCMappingPackage.FUNCTION_MODULE_POJO_MAPPING: return createFunctionModulePOJOMapping();
      case RFCMappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING: return createFunctionModulePOJOCallMapping();
      case RFCMappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING: return createFunctionModulePOJORequestResponseMapping();
      case RFCMappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING: return createFunctionModulePOJOParameterMapping();
      case RFCMappingPackage.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER: return createFunctionModulePOJOImportingParameter();
      case RFCMappingPackage.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER: return createFunctionModulePOJOExportingParameter();
      case RFCMappingPackage.FUNCTION_MODULE_POJO_CHANGING_PARAMETER: return createFunctionModulePOJOChangingParameter();
      case RFCMappingPackage.FUNCTION_MODULE_POJO_TABLES_PARAMETER: return createFunctionModulePOJOTablesParameter();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Structure createStructure()
  {
    StructureImpl structure = new StructureImpl();
    return structure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureMapping createStructureMapping()
  {
    StructureMappingImpl structureMapping = new StructureMappingImpl();
    return structureMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructurePOJOMapping createStructurePOJOMapping()
  {
    StructurePOJOMappingImpl structurePOJOMapping = new StructurePOJOMappingImpl();
    return structurePOJOMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructureFieldPOJOMapping createStructureFieldPOJOMapping()
  {
    StructureFieldPOJOMappingImpl structureFieldPOJOMapping = new StructureFieldPOJOMappingImpl();
    return structureFieldPOJOMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionModule createFunctionModule()
  {
    FunctionModuleImpl functionModule = new FunctionModuleImpl();
    return functionModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionModuleMapping createFunctionModuleMapping()
  {
    FunctionModuleMappingImpl functionModuleMapping = new FunctionModuleMappingImpl();
    return functionModuleMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionModulePOJOMapping createFunctionModulePOJOMapping()
  {
    FunctionModulePOJOMappingImpl functionModulePOJOMapping = new FunctionModulePOJOMappingImpl();
    return functionModulePOJOMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionModulePOJOCallMapping createFunctionModulePOJOCallMapping()
  {
    FunctionModulePOJOCallMappingImpl functionModulePOJOCallMapping = new FunctionModulePOJOCallMappingImpl();
    return functionModulePOJOCallMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionModulePOJORequestResponseMapping createFunctionModulePOJORequestResponseMapping()
  {
    FunctionModulePOJORequestResponseMappingImpl functionModulePOJORequestResponseMapping = new FunctionModulePOJORequestResponseMappingImpl();
    return functionModulePOJORequestResponseMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionModulePOJOParameterMapping createFunctionModulePOJOParameterMapping()
  {
    FunctionModulePOJOParameterMappingImpl functionModulePOJOParameterMapping = new FunctionModulePOJOParameterMappingImpl();
    return functionModulePOJOParameterMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionModulePOJOImportingParameter createFunctionModulePOJOImportingParameter()
  {
    FunctionModulePOJOImportingParameterImpl functionModulePOJOImportingParameter = new FunctionModulePOJOImportingParameterImpl();
    return functionModulePOJOImportingParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionModulePOJOExportingParameter createFunctionModulePOJOExportingParameter()
  {
    FunctionModulePOJOExportingParameterImpl functionModulePOJOExportingParameter = new FunctionModulePOJOExportingParameterImpl();
    return functionModulePOJOExportingParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionModulePOJOChangingParameter createFunctionModulePOJOChangingParameter()
  {
    FunctionModulePOJOChangingParameterImpl functionModulePOJOChangingParameter = new FunctionModulePOJOChangingParameterImpl();
    return functionModulePOJOChangingParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionModulePOJOTablesParameter createFunctionModulePOJOTablesParameter()
  {
    FunctionModulePOJOTablesParameterImpl functionModulePOJOTablesParameter = new FunctionModulePOJOTablesParameterImpl();
    return functionModulePOJOTablesParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RFCMappingPackage getRFCMappingPackage()
  {
    return (RFCMappingPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RFCMappingPackage getPackage()
  {
    return RFCMappingPackage.eINSTANCE;
  }

} //RFCMappingFactoryImpl
