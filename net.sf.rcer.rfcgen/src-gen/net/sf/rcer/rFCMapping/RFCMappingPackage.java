/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rFCMapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rFCMapping.RFCMappingFactory
 * @model kind="package"
 * @generated
 */
public interface RFCMappingPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "rFCMapping";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sf.net/rcer/RFCMapping";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "rFCMapping";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RFCMappingPackage eINSTANCE = net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl.init();

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.ModelImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGE_NAME = 0;

  /**
   * The feature id for the '<em><b>Structures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STRUCTURES = 1;

  /**
   * The feature id for the '<em><b>Function Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FUNCTION_MODULES = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.StructureImpl <em>Structure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.StructureImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getStructure()
   * @generated
   */
  int STRUCTURE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE__MAPPING = 1;

  /**
   * The number of structural features of the '<em>Structure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.StructureMappingImpl <em>Structure Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.StructureMappingImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getStructureMapping()
   * @generated
   */
  int STRUCTURE_MAPPING = 2;

  /**
   * The number of structural features of the '<em>Structure Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_MAPPING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.StructurePOJOMappingImpl <em>Structure POJO Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.StructurePOJOMappingImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getStructurePOJOMapping()
   * @generated
   */
  int STRUCTURE_POJO_MAPPING = 3;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_POJO_MAPPING__CLASS_NAME = STRUCTURE_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_POJO_MAPPING__FIELDS = STRUCTURE_MAPPING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Structure POJO Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_POJO_MAPPING_FEATURE_COUNT = STRUCTURE_MAPPING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.StructureFieldPOJOMappingImpl <em>Structure Field POJO Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.StructureFieldPOJOMappingImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getStructureFieldPOJOMapping()
   * @generated
   */
  int STRUCTURE_FIELD_POJO_MAPPING = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FIELD_POJO_MAPPING__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FIELD_POJO_MAPPING__TYPE = 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FIELD_POJO_MAPPING__ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FIELD_POJO_MAPPING__COMMENT = 3;

  /**
   * The number of structural features of the '<em>Structure Field POJO Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FIELD_POJO_MAPPING_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModuleImpl <em>Function Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.FunctionModuleImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModule()
   * @generated
   */
  int FUNCTION_MODULE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE__MAPPING = 1;

  /**
   * The number of structural features of the '<em>Function Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModuleMappingImpl <em>Function Module Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.FunctionModuleMappingImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModuleMapping()
   * @generated
   */
  int FUNCTION_MODULE_MAPPING = 6;

  /**
   * The number of structural features of the '<em>Function Module Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_MAPPING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOMappingImpl <em>Function Module POJO Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOMappingImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOMapping()
   * @generated
   */
  int FUNCTION_MODULE_POJO_MAPPING = 7;

  /**
   * The number of structural features of the '<em>Function Module POJO Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_MAPPING_FEATURE_COUNT = FUNCTION_MODULE_MAPPING_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOCallMappingImpl <em>Function Module POJO Call Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOCallMappingImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOCallMapping()
   * @generated
   */
  int FUNCTION_MODULE_POJO_CALL_MAPPING = 8;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CALL_MAPPING__CLASS_NAME = FUNCTION_MODULE_POJO_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CALL_MAPPING__PARAMETERS = FUNCTION_MODULE_POJO_MAPPING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Module POJO Call Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CALL_MAPPING_FEATURE_COUNT = FUNCTION_MODULE_POJO_MAPPING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJORequestResponseMappingImpl <em>Function Module POJO Request Response Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJORequestResponseMappingImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJORequestResponseMapping()
   * @generated
   */
  int FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING = 9;

  /**
   * The feature id for the '<em><b>Request Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_CLASS_NAME = FUNCTION_MODULE_POJO_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Request Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_PARAMETERS = FUNCTION_MODULE_POJO_MAPPING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Response Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_CLASS_NAME = FUNCTION_MODULE_POJO_MAPPING_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Response Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_PARAMETERS = FUNCTION_MODULE_POJO_MAPPING_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Function Module POJO Request Response Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING_FEATURE_COUNT = FUNCTION_MODULE_POJO_MAPPING_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOParameterMappingImpl <em>Function Module POJO Parameter Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOParameterMappingImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOParameterMapping()
   * @generated
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME = 0;

  /**
   * The feature id for the '<em><b>Is Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING__IS_INACTIVE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING__TYPE = 2;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT = 4;

  /**
   * The number of structural features of the '<em>Function Module POJO Parameter Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOImportingParameterImpl <em>Function Module POJO Importing Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOImportingParameterImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOImportingParameter()
   * @generated
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__NAME = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME;

  /**
   * The feature id for the '<em><b>Is Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__IS_INACTIVE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__IS_INACTIVE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TYPE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__TYPE;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__ATTRIBUTE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__COMMENT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT;

  /**
   * The feature id for the '<em><b>Is Structure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__IS_STRUCTURE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__IS_TABLE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Module POJO Importing Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER_FEATURE_COUNT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOExportingParameterImpl <em>Function Module POJO Exporting Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOExportingParameterImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOExportingParameter()
   * @generated
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__NAME = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME;

  /**
   * The feature id for the '<em><b>Is Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_INACTIVE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__IS_INACTIVE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__TYPE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__TYPE;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__ATTRIBUTE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__COMMENT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT;

  /**
   * The feature id for the '<em><b>Is Structure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_STRUCTURE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_TABLE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Module POJO Exporting Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER_FEATURE_COUNT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOChangingParameterImpl <em>Function Module POJO Changing Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOChangingParameterImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOChangingParameter()
   * @generated
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__NAME = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME;

  /**
   * The feature id for the '<em><b>Is Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__IS_INACTIVE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__IS_INACTIVE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__TYPE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__TYPE;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__ATTRIBUTE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__COMMENT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT;

  /**
   * The feature id for the '<em><b>Is Structure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__IS_STRUCTURE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__IS_TABLE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Module POJO Changing Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER_FEATURE_COUNT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOTablesParameterImpl <em>Function Module POJO Tables Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOTablesParameterImpl
   * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOTablesParameter()
   * @generated
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER__NAME = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME;

  /**
   * The feature id for the '<em><b>Is Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER__IS_INACTIVE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__IS_INACTIVE;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER__TYPE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__TYPE;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER__ATTRIBUTE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER__COMMENT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT;

  /**
   * The number of structural features of the '<em>Function Module POJO Tables Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER_FEATURE_COUNT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see net.sf.rcer.rFCMapping.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.Model#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see net.sf.rcer.rFCMapping.Model#getPackageName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_PackageName();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.rcer.rFCMapping.Model#getStructures <em>Structures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Structures</em>'.
   * @see net.sf.rcer.rFCMapping.Model#getStructures()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Structures();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.rcer.rFCMapping.Model#getFunctionModules <em>Function Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function Modules</em>'.
   * @see net.sf.rcer.rFCMapping.Model#getFunctionModules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_FunctionModules();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.Structure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure</em>'.
   * @see net.sf.rcer.rFCMapping.Structure
   * @generated
   */
  EClass getStructure();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.Structure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.rcer.rFCMapping.Structure#getName()
   * @see #getStructure()
   * @generated
   */
  EAttribute getStructure_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.rcer.rFCMapping.Structure#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see net.sf.rcer.rFCMapping.Structure#getMapping()
   * @see #getStructure()
   * @generated
   */
  EReference getStructure_Mapping();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.StructureMapping <em>Structure Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Mapping</em>'.
   * @see net.sf.rcer.rFCMapping.StructureMapping
   * @generated
   */
  EClass getStructureMapping();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.StructurePOJOMapping <em>Structure POJO Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure POJO Mapping</em>'.
   * @see net.sf.rcer.rFCMapping.StructurePOJOMapping
   * @generated
   */
  EClass getStructurePOJOMapping();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.StructurePOJOMapping#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see net.sf.rcer.rFCMapping.StructurePOJOMapping#getClassName()
   * @see #getStructurePOJOMapping()
   * @generated
   */
  EAttribute getStructurePOJOMapping_ClassName();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.rcer.rFCMapping.StructurePOJOMapping#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see net.sf.rcer.rFCMapping.StructurePOJOMapping#getFields()
   * @see #getStructurePOJOMapping()
   * @generated
   */
  EReference getStructurePOJOMapping_Fields();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.StructureFieldPOJOMapping <em>Structure Field POJO Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Field POJO Mapping</em>'.
   * @see net.sf.rcer.rFCMapping.StructureFieldPOJOMapping
   * @generated
   */
  EClass getStructureFieldPOJOMapping();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.StructureFieldPOJOMapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.rcer.rFCMapping.StructureFieldPOJOMapping#getName()
   * @see #getStructureFieldPOJOMapping()
   * @generated
   */
  EAttribute getStructureFieldPOJOMapping_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.StructureFieldPOJOMapping#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see net.sf.rcer.rFCMapping.StructureFieldPOJOMapping#getType()
   * @see #getStructureFieldPOJOMapping()
   * @generated
   */
  EAttribute getStructureFieldPOJOMapping_Type();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.StructureFieldPOJOMapping#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see net.sf.rcer.rFCMapping.StructureFieldPOJOMapping#getAttribute()
   * @see #getStructureFieldPOJOMapping()
   * @generated
   */
  EAttribute getStructureFieldPOJOMapping_Attribute();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.StructureFieldPOJOMapping#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see net.sf.rcer.rFCMapping.StructureFieldPOJOMapping#getComment()
   * @see #getStructureFieldPOJOMapping()
   * @generated
   */
  EAttribute getStructureFieldPOJOMapping_Comment();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.FunctionModule <em>Function Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModule
   * @generated
   */
  EClass getFunctionModule();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModule#getName()
   * @see #getFunctionModule()
   * @generated
   */
  EAttribute getFunctionModule_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.rcer.rFCMapping.FunctionModule#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModule#getMapping()
   * @see #getFunctionModule()
   * @generated
   */
  EReference getFunctionModule_Mapping();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.FunctionModuleMapping <em>Function Module Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module Mapping</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModuleMapping
   * @generated
   */
  EClass getFunctionModuleMapping();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOMapping <em>Function Module POJO Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Mapping</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOMapping
   * @generated
   */
  EClass getFunctionModulePOJOMapping();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOCallMapping <em>Function Module POJO Call Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Call Mapping</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOCallMapping
   * @generated
   */
  EClass getFunctionModulePOJOCallMapping();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOCallMapping#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOCallMapping#getClassName()
   * @see #getFunctionModulePOJOCallMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJOCallMapping_ClassName();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOCallMapping#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOCallMapping#getParameters()
   * @see #getFunctionModulePOJOCallMapping()
   * @generated
   */
  EReference getFunctionModulePOJOCallMapping_Parameters();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJORequestResponseMapping <em>Function Module POJO Request Response Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Request Response Mapping</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJORequestResponseMapping
   * @generated
   */
  EClass getFunctionModulePOJORequestResponseMapping();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJORequestResponseMapping#getRequestClassName <em>Request Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Request Class Name</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJORequestResponseMapping#getRequestClassName()
   * @see #getFunctionModulePOJORequestResponseMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJORequestResponseMapping_RequestClassName();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.rcer.rFCMapping.FunctionModulePOJORequestResponseMapping#getRequestParameters <em>Request Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Request Parameters</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJORequestResponseMapping#getRequestParameters()
   * @see #getFunctionModulePOJORequestResponseMapping()
   * @generated
   */
  EReference getFunctionModulePOJORequestResponseMapping_RequestParameters();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJORequestResponseMapping#getResponseClassName <em>Response Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Response Class Name</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJORequestResponseMapping#getResponseClassName()
   * @see #getFunctionModulePOJORequestResponseMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJORequestResponseMapping_ResponseClassName();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.rcer.rFCMapping.FunctionModulePOJORequestResponseMapping#getResponseParameters <em>Response Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Response Parameters</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJORequestResponseMapping#getResponseParameters()
   * @see #getFunctionModulePOJORequestResponseMapping()
   * @generated
   */
  EReference getFunctionModulePOJORequestResponseMapping_ResponseParameters();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping <em>Function Module POJO Parameter Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Parameter Mapping</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping
   * @generated
   */
  EClass getFunctionModulePOJOParameterMapping();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping#getName()
   * @see #getFunctionModulePOJOParameterMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJOParameterMapping_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping#isIsInactive <em>Is Inactive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Inactive</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping#isIsInactive()
   * @see #getFunctionModulePOJOParameterMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJOParameterMapping_IsInactive();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping#getType()
   * @see #getFunctionModulePOJOParameterMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJOParameterMapping_Type();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping#getAttribute()
   * @see #getFunctionModulePOJOParameterMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJOParameterMapping_Attribute();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping#getComment()
   * @see #getFunctionModulePOJOParameterMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJOParameterMapping_Comment();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOImportingParameter <em>Function Module POJO Importing Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Importing Parameter</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOImportingParameter
   * @generated
   */
  EClass getFunctionModulePOJOImportingParameter();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOImportingParameter#isIsStructure <em>Is Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Structure</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOImportingParameter#isIsStructure()
   * @see #getFunctionModulePOJOImportingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOImportingParameter_IsStructure();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOImportingParameter#isIsTable <em>Is Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Table</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOImportingParameter#isIsTable()
   * @see #getFunctionModulePOJOImportingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOImportingParameter_IsTable();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOExportingParameter <em>Function Module POJO Exporting Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Exporting Parameter</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOExportingParameter
   * @generated
   */
  EClass getFunctionModulePOJOExportingParameter();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOExportingParameter#isIsStructure <em>Is Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Structure</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOExportingParameter#isIsStructure()
   * @see #getFunctionModulePOJOExportingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOExportingParameter_IsStructure();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOExportingParameter#isIsTable <em>Is Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Table</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOExportingParameter#isIsTable()
   * @see #getFunctionModulePOJOExportingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOExportingParameter_IsTable();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOChangingParameter <em>Function Module POJO Changing Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Changing Parameter</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOChangingParameter
   * @generated
   */
  EClass getFunctionModulePOJOChangingParameter();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOChangingParameter#isIsStructure <em>Is Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Structure</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOChangingParameter#isIsStructure()
   * @see #getFunctionModulePOJOChangingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOChangingParameter_IsStructure();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOChangingParameter#isIsTable <em>Is Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Table</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOChangingParameter#isIsTable()
   * @see #getFunctionModulePOJOChangingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOChangingParameter_IsTable();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rFCMapping.FunctionModulePOJOTablesParameter <em>Function Module POJO Tables Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Tables Parameter</em>'.
   * @see net.sf.rcer.rFCMapping.FunctionModulePOJOTablesParameter
   * @generated
   */
  EClass getFunctionModulePOJOTablesParameter();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RFCMappingFactory getRFCMappingFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.ModelImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__PACKAGE_NAME = eINSTANCE.getModel_PackageName();

    /**
     * The meta object literal for the '<em><b>Structures</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__STRUCTURES = eINSTANCE.getModel_Structures();

    /**
     * The meta object literal for the '<em><b>Function Modules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FUNCTION_MODULES = eINSTANCE.getModel_FunctionModules();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.StructureImpl <em>Structure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.StructureImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getStructure()
     * @generated
     */
    EClass STRUCTURE = eINSTANCE.getStructure();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE__NAME = eINSTANCE.getStructure_Name();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE__MAPPING = eINSTANCE.getStructure_Mapping();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.StructureMappingImpl <em>Structure Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.StructureMappingImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getStructureMapping()
     * @generated
     */
    EClass STRUCTURE_MAPPING = eINSTANCE.getStructureMapping();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.StructurePOJOMappingImpl <em>Structure POJO Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.StructurePOJOMappingImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getStructurePOJOMapping()
     * @generated
     */
    EClass STRUCTURE_POJO_MAPPING = eINSTANCE.getStructurePOJOMapping();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE_POJO_MAPPING__CLASS_NAME = eINSTANCE.getStructurePOJOMapping_ClassName();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE_POJO_MAPPING__FIELDS = eINSTANCE.getStructurePOJOMapping_Fields();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.StructureFieldPOJOMappingImpl <em>Structure Field POJO Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.StructureFieldPOJOMappingImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getStructureFieldPOJOMapping()
     * @generated
     */
    EClass STRUCTURE_FIELD_POJO_MAPPING = eINSTANCE.getStructureFieldPOJOMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE_FIELD_POJO_MAPPING__NAME = eINSTANCE.getStructureFieldPOJOMapping_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE_FIELD_POJO_MAPPING__TYPE = eINSTANCE.getStructureFieldPOJOMapping_Type();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE_FIELD_POJO_MAPPING__ATTRIBUTE = eINSTANCE.getStructureFieldPOJOMapping_Attribute();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE_FIELD_POJO_MAPPING__COMMENT = eINSTANCE.getStructureFieldPOJOMapping_Comment();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModuleImpl <em>Function Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.FunctionModuleImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModule()
     * @generated
     */
    EClass FUNCTION_MODULE = eINSTANCE.getFunctionModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE__NAME = eINSTANCE.getFunctionModule_Name();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_MODULE__MAPPING = eINSTANCE.getFunctionModule_Mapping();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModuleMappingImpl <em>Function Module Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.FunctionModuleMappingImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModuleMapping()
     * @generated
     */
    EClass FUNCTION_MODULE_MAPPING = eINSTANCE.getFunctionModuleMapping();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOMappingImpl <em>Function Module POJO Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOMappingImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOMapping()
     * @generated
     */
    EClass FUNCTION_MODULE_POJO_MAPPING = eINSTANCE.getFunctionModulePOJOMapping();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOCallMappingImpl <em>Function Module POJO Call Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOCallMappingImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOCallMapping()
     * @generated
     */
    EClass FUNCTION_MODULE_POJO_CALL_MAPPING = eINSTANCE.getFunctionModulePOJOCallMapping();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_CALL_MAPPING__CLASS_NAME = eINSTANCE.getFunctionModulePOJOCallMapping_ClassName();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_MODULE_POJO_CALL_MAPPING__PARAMETERS = eINSTANCE.getFunctionModulePOJOCallMapping_Parameters();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJORequestResponseMappingImpl <em>Function Module POJO Request Response Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJORequestResponseMappingImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJORequestResponseMapping()
     * @generated
     */
    EClass FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING = eINSTANCE.getFunctionModulePOJORequestResponseMapping();

    /**
     * The meta object literal for the '<em><b>Request Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_CLASS_NAME = eINSTANCE.getFunctionModulePOJORequestResponseMapping_RequestClassName();

    /**
     * The meta object literal for the '<em><b>Request Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_PARAMETERS = eINSTANCE.getFunctionModulePOJORequestResponseMapping_RequestParameters();

    /**
     * The meta object literal for the '<em><b>Response Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_CLASS_NAME = eINSTANCE.getFunctionModulePOJORequestResponseMapping_ResponseClassName();

    /**
     * The meta object literal for the '<em><b>Response Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_PARAMETERS = eINSTANCE.getFunctionModulePOJORequestResponseMapping_ResponseParameters();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOParameterMappingImpl <em>Function Module POJO Parameter Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOParameterMappingImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOParameterMapping()
     * @generated
     */
    EClass FUNCTION_MODULE_POJO_PARAMETER_MAPPING = eINSTANCE.getFunctionModulePOJOParameterMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME = eINSTANCE.getFunctionModulePOJOParameterMapping_Name();

    /**
     * The meta object literal for the '<em><b>Is Inactive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_PARAMETER_MAPPING__IS_INACTIVE = eINSTANCE.getFunctionModulePOJOParameterMapping_IsInactive();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_PARAMETER_MAPPING__TYPE = eINSTANCE.getFunctionModulePOJOParameterMapping_Type();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE = eINSTANCE.getFunctionModulePOJOParameterMapping_Attribute();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT = eINSTANCE.getFunctionModulePOJOParameterMapping_Comment();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOImportingParameterImpl <em>Function Module POJO Importing Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOImportingParameterImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOImportingParameter()
     * @generated
     */
    EClass FUNCTION_MODULE_POJO_IMPORTING_PARAMETER = eINSTANCE.getFunctionModulePOJOImportingParameter();

    /**
     * The meta object literal for the '<em><b>Is Structure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__IS_STRUCTURE = eINSTANCE.getFunctionModulePOJOImportingParameter_IsStructure();

    /**
     * The meta object literal for the '<em><b>Is Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__IS_TABLE = eINSTANCE.getFunctionModulePOJOImportingParameter_IsTable();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOExportingParameterImpl <em>Function Module POJO Exporting Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOExportingParameterImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOExportingParameter()
     * @generated
     */
    EClass FUNCTION_MODULE_POJO_EXPORTING_PARAMETER = eINSTANCE.getFunctionModulePOJOExportingParameter();

    /**
     * The meta object literal for the '<em><b>Is Structure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_STRUCTURE = eINSTANCE.getFunctionModulePOJOExportingParameter_IsStructure();

    /**
     * The meta object literal for the '<em><b>Is Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_TABLE = eINSTANCE.getFunctionModulePOJOExportingParameter_IsTable();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOChangingParameterImpl <em>Function Module POJO Changing Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOChangingParameterImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOChangingParameter()
     * @generated
     */
    EClass FUNCTION_MODULE_POJO_CHANGING_PARAMETER = eINSTANCE.getFunctionModulePOJOChangingParameter();

    /**
     * The meta object literal for the '<em><b>Is Structure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_CHANGING_PARAMETER__IS_STRUCTURE = eINSTANCE.getFunctionModulePOJOChangingParameter_IsStructure();

    /**
     * The meta object literal for the '<em><b>Is Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_CHANGING_PARAMETER__IS_TABLE = eINSTANCE.getFunctionModulePOJOChangingParameter_IsTable();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOTablesParameterImpl <em>Function Module POJO Tables Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rFCMapping.impl.FunctionModulePOJOTablesParameterImpl
     * @see net.sf.rcer.rFCMapping.impl.RFCMappingPackageImpl#getFunctionModulePOJOTablesParameter()
     * @generated
     */
    EClass FUNCTION_MODULE_POJO_TABLES_PARAMETER = eINSTANCE.getFunctionModulePOJOTablesParameter();

  }

} //RFCMappingPackage
