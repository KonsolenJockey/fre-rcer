/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rfcgen.mapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.sf.rcer.rfcgen.mapping.MappingFactory
 * @model kind="package"
 * @generated
 */
public interface MappingPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mapping";

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
  String eNS_PREFIX = "mapping";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MappingPackage eINSTANCE = net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl.init();

  /**
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.ModelImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getModel()
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
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Structures</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__STRUCTURES = 2;

  /**
   * The feature id for the '<em><b>Function Modules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FUNCTION_MODULES = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.ImportImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Full Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__FULL_NAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__NAME = 1;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.StructureImpl <em>Structure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.StructureImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getStructure()
   * @generated
   */
  int STRUCTURE = 2;

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
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.StructureMappingImpl <em>Structure Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.StructureMappingImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getStructureMapping()
   * @generated
   */
  int STRUCTURE_MAPPING = 3;

  /**
   * The number of structural features of the '<em>Structure Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_MAPPING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.StructurePOJOMappingImpl <em>Structure POJO Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.StructurePOJOMappingImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getStructurePOJOMapping()
   * @generated
   */
  int STRUCTURE_POJO_MAPPING = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_POJO_MAPPING__NAME = STRUCTURE_MAPPING_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.StructureFieldPOJOMappingImpl <em>Structure Field POJO Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.StructureFieldPOJOMappingImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getStructureFieldPOJOMapping()
   * @generated
   */
  int STRUCTURE_FIELD_POJO_MAPPING = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FIELD_POJO_MAPPING__NAME = 0;

  /**
   * The feature id for the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FIELD_POJO_MAPPING__INACTIVE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FIELD_POJO_MAPPING__TYPE = 2;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FIELD_POJO_MAPPING__ATTRIBUTE = 3;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FIELD_POJO_MAPPING__COMMENT = 4;

  /**
   * The number of structural features of the '<em>Structure Field POJO Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FIELD_POJO_MAPPING_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModuleImpl <em>Function Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModuleImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModule()
   * @generated
   */
  int FUNCTION_MODULE = 6;

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
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModuleMappingImpl <em>Function Module Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModuleMappingImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModuleMapping()
   * @generated
   */
  int FUNCTION_MODULE_MAPPING = 7;

  /**
   * The number of structural features of the '<em>Function Module Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_MAPPING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOMappingImpl <em>Function Module POJO Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOMappingImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOMapping()
   * @generated
   */
  int FUNCTION_MODULE_POJO_MAPPING = 8;

  /**
   * The number of structural features of the '<em>Function Module POJO Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_MAPPING_FEATURE_COUNT = FUNCTION_MODULE_MAPPING_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOCallMappingImpl <em>Function Module POJO Call Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOCallMappingImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOCallMapping()
   * @generated
   */
  int FUNCTION_MODULE_POJO_CALL_MAPPING = 9;

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
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJORequestResponseMappingImpl <em>Function Module POJO Request Response Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJORequestResponseMappingImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJORequestResponseMapping()
   * @generated
   */
  int FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING = 10;

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
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl <em>Function Module POJO Parameter Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOParameterMapping()
   * @generated
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME = 0;

  /**
   * The feature id for the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING__INACTIVE = 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Structure Mapping</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE_MAPPING = 3;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL = 4;

  /**
   * The feature id for the '<em><b>External Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL_CLASS = 5;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT = 6;

  /**
   * The number of structural features of the '<em>Function Module POJO Parameter Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOImportingParameterImpl <em>Function Module POJO Importing Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOImportingParameterImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOImportingParameter()
   * @generated
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__NAME = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME;

  /**
   * The feature id for the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__INACTIVE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__INACTIVE;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__ATTRIBUTE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Structure Mapping</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__STRUCTURE_MAPPING = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE_MAPPING;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__EXTERNAL = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL;

  /**
   * The feature id for the '<em><b>External Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__EXTERNAL_CLASS = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL_CLASS;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__COMMENT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TYPE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__STRUCTURE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TABLE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Function Module POJO Importing Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_IMPORTING_PARAMETER_FEATURE_COUNT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOExportingParameterImpl <em>Function Module POJO Exporting Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOExportingParameterImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOExportingParameter()
   * @generated
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__NAME = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME;

  /**
   * The feature id for the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__INACTIVE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__INACTIVE;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__ATTRIBUTE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Structure Mapping</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__STRUCTURE_MAPPING = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE_MAPPING;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__EXTERNAL = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL;

  /**
   * The feature id for the '<em><b>External Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__EXTERNAL_CLASS = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL_CLASS;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__COMMENT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__TYPE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__STRUCTURE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__TABLE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Function Module POJO Exporting Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_EXPORTING_PARAMETER_FEATURE_COUNT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOChangingParameterImpl <em>Function Module POJO Changing Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOChangingParameterImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOChangingParameter()
   * @generated
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__NAME = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME;

  /**
   * The feature id for the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__INACTIVE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__INACTIVE;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__ATTRIBUTE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Structure Mapping</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__STRUCTURE_MAPPING = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE_MAPPING;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__EXTERNAL = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL;

  /**
   * The feature id for the '<em><b>External Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__EXTERNAL_CLASS = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL_CLASS;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__COMMENT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__TYPE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Structure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__STRUCTURE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER__TABLE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Function Module POJO Changing Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_CHANGING_PARAMETER_FEATURE_COUNT = FUNCTION_MODULE_POJO_PARAMETER_MAPPING_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOTablesParameterImpl <em>Function Module POJO Tables Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOTablesParameterImpl
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOTablesParameter()
   * @generated
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER__NAME = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME;

  /**
   * The feature id for the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER__INACTIVE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__INACTIVE;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER__ATTRIBUTE = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Structure Mapping</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER__STRUCTURE_MAPPING = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE_MAPPING;

  /**
   * The feature id for the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER__EXTERNAL = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL;

  /**
   * The feature id for the '<em><b>External Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_MODULE_POJO_TABLES_PARAMETER__EXTERNAL_CLASS = FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL_CLASS;

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
   * The meta object id for the '{@link net.sf.rcer.rfcgen.mapping.DataType <em>Data Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.rcer.rfcgen.mapping.DataType
   * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 16;


  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see net.sf.rcer.rfcgen.mapping.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.Model#getPackageName <em>Package Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package Name</em>'.
   * @see net.sf.rcer.rfcgen.mapping.Model#getPackageName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_PackageName();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.rcer.rfcgen.mapping.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see net.sf.rcer.rfcgen.mapping.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.rcer.rfcgen.mapping.Model#getStructures <em>Structures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Structures</em>'.
   * @see net.sf.rcer.rfcgen.mapping.Model#getStructures()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Structures();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.rcer.rfcgen.mapping.Model#getFunctionModules <em>Function Modules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function Modules</em>'.
   * @see net.sf.rcer.rfcgen.mapping.Model#getFunctionModules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_FunctionModules();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see net.sf.rcer.rfcgen.mapping.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.Import#getFullName <em>Full Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Full Name</em>'.
   * @see net.sf.rcer.rfcgen.mapping.Import#getFullName()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_FullName();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.Import#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.rcer.rfcgen.mapping.Import#getName()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Name();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.Structure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure</em>'.
   * @see net.sf.rcer.rfcgen.mapping.Structure
   * @generated
   */
  EClass getStructure();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.Structure#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.rcer.rfcgen.mapping.Structure#getName()
   * @see #getStructure()
   * @generated
   */
  EAttribute getStructure_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.rcer.rfcgen.mapping.Structure#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see net.sf.rcer.rfcgen.mapping.Structure#getMapping()
   * @see #getStructure()
   * @generated
   */
  EReference getStructure_Mapping();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.StructureMapping <em>Structure Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Mapping</em>'.
   * @see net.sf.rcer.rfcgen.mapping.StructureMapping
   * @generated
   */
  EClass getStructureMapping();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.StructurePOJOMapping <em>Structure POJO Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure POJO Mapping</em>'.
   * @see net.sf.rcer.rfcgen.mapping.StructurePOJOMapping
   * @generated
   */
  EClass getStructurePOJOMapping();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.StructurePOJOMapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.rcer.rfcgen.mapping.StructurePOJOMapping#getName()
   * @see #getStructurePOJOMapping()
   * @generated
   */
  EAttribute getStructurePOJOMapping_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.rcer.rfcgen.mapping.StructurePOJOMapping#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see net.sf.rcer.rfcgen.mapping.StructurePOJOMapping#getFields()
   * @see #getStructurePOJOMapping()
   * @generated
   */
  EReference getStructurePOJOMapping_Fields();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping <em>Structure Field POJO Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structure Field POJO Mapping</em>'.
   * @see net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping
   * @generated
   */
  EClass getStructureFieldPOJOMapping();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getName()
   * @see #getStructureFieldPOJOMapping()
   * @generated
   */
  EAttribute getStructureFieldPOJOMapping_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#isInactive <em>Inactive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inactive</em>'.
   * @see net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#isInactive()
   * @see #getStructureFieldPOJOMapping()
   * @generated
   */
  EAttribute getStructureFieldPOJOMapping_Inactive();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getType()
   * @see #getStructureFieldPOJOMapping()
   * @generated
   */
  EAttribute getStructureFieldPOJOMapping_Type();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getAttribute()
   * @see #getStructureFieldPOJOMapping()
   * @generated
   */
  EAttribute getStructureFieldPOJOMapping_Attribute();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getComment()
   * @see #getStructureFieldPOJOMapping()
   * @generated
   */
  EAttribute getStructureFieldPOJOMapping_Comment();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.FunctionModule <em>Function Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModule
   * @generated
   */
  EClass getFunctionModule();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModule#getName()
   * @see #getFunctionModule()
   * @generated
   */
  EAttribute getFunctionModule_Name();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.rcer.rfcgen.mapping.FunctionModule#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModule#getMapping()
   * @see #getFunctionModule()
   * @generated
   */
  EReference getFunctionModule_Mapping();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.FunctionModuleMapping <em>Function Module Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module Mapping</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModuleMapping
   * @generated
   */
  EClass getFunctionModuleMapping();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOMapping <em>Function Module POJO Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Mapping</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOMapping
   * @generated
   */
  EClass getFunctionModulePOJOMapping();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOCallMapping <em>Function Module POJO Call Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Call Mapping</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOCallMapping
   * @generated
   */
  EClass getFunctionModulePOJOCallMapping();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOCallMapping#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOCallMapping#getClassName()
   * @see #getFunctionModulePOJOCallMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJOCallMapping_ClassName();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOCallMapping#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOCallMapping#getParameters()
   * @see #getFunctionModulePOJOCallMapping()
   * @generated
   */
  EReference getFunctionModulePOJOCallMapping_Parameters();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJORequestResponseMapping <em>Function Module POJO Request Response Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Request Response Mapping</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJORequestResponseMapping
   * @generated
   */
  EClass getFunctionModulePOJORequestResponseMapping();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJORequestResponseMapping#getRequestClassName <em>Request Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Request Class Name</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJORequestResponseMapping#getRequestClassName()
   * @see #getFunctionModulePOJORequestResponseMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJORequestResponseMapping_RequestClassName();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJORequestResponseMapping#getRequestParameters <em>Request Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Request Parameters</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJORequestResponseMapping#getRequestParameters()
   * @see #getFunctionModulePOJORequestResponseMapping()
   * @generated
   */
  EReference getFunctionModulePOJORequestResponseMapping_RequestParameters();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJORequestResponseMapping#getResponseClassName <em>Response Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Response Class Name</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJORequestResponseMapping#getResponseClassName()
   * @see #getFunctionModulePOJORequestResponseMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJORequestResponseMapping_ResponseClassName();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJORequestResponseMapping#getResponseParameters <em>Response Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Response Parameters</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJORequestResponseMapping#getResponseParameters()
   * @see #getFunctionModulePOJORequestResponseMapping()
   * @generated
   */
  EReference getFunctionModulePOJORequestResponseMapping_ResponseParameters();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping <em>Function Module POJO Parameter Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Parameter Mapping</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping
   * @generated
   */
  EClass getFunctionModulePOJOParameterMapping();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#getName()
   * @see #getFunctionModulePOJOParameterMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJOParameterMapping_Name();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#isInactive <em>Inactive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inactive</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#isInactive()
   * @see #getFunctionModulePOJOParameterMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJOParameterMapping_Inactive();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#getAttribute()
   * @see #getFunctionModulePOJOParameterMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJOParameterMapping_Attribute();

  /**
   * Returns the meta object for the reference '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#getStructureMapping <em>Structure Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Structure Mapping</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#getStructureMapping()
   * @see #getFunctionModulePOJOParameterMapping()
   * @generated
   */
  EReference getFunctionModulePOJOParameterMapping_StructureMapping();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#isExternal <em>External</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>External</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#isExternal()
   * @see #getFunctionModulePOJOParameterMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJOParameterMapping_External();

  /**
   * Returns the meta object for the reference '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#getExternalClass <em>External Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>External Class</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#getExternalClass()
   * @see #getFunctionModulePOJOParameterMapping()
   * @generated
   */
  EReference getFunctionModulePOJOParameterMapping_ExternalClass();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping#getComment()
   * @see #getFunctionModulePOJOParameterMapping()
   * @generated
   */
  EAttribute getFunctionModulePOJOParameterMapping_Comment();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOImportingParameter <em>Function Module POJO Importing Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Importing Parameter</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOImportingParameter
   * @generated
   */
  EClass getFunctionModulePOJOImportingParameter();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOImportingParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOImportingParameter#getType()
   * @see #getFunctionModulePOJOImportingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOImportingParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOImportingParameter#isStructure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Structure</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOImportingParameter#isStructure()
   * @see #getFunctionModulePOJOImportingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOImportingParameter_Structure();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOImportingParameter#isTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOImportingParameter#isTable()
   * @see #getFunctionModulePOJOImportingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOImportingParameter_Table();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOExportingParameter <em>Function Module POJO Exporting Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Exporting Parameter</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOExportingParameter
   * @generated
   */
  EClass getFunctionModulePOJOExportingParameter();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOExportingParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOExportingParameter#getType()
   * @see #getFunctionModulePOJOExportingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOExportingParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOExportingParameter#isStructure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Structure</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOExportingParameter#isStructure()
   * @see #getFunctionModulePOJOExportingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOExportingParameter_Structure();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOExportingParameter#isTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOExportingParameter#isTable()
   * @see #getFunctionModulePOJOExportingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOExportingParameter_Table();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOChangingParameter <em>Function Module POJO Changing Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Changing Parameter</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOChangingParameter
   * @generated
   */
  EClass getFunctionModulePOJOChangingParameter();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOChangingParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOChangingParameter#getType()
   * @see #getFunctionModulePOJOChangingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOChangingParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOChangingParameter#isStructure <em>Structure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Structure</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOChangingParameter#isStructure()
   * @see #getFunctionModulePOJOChangingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOChangingParameter_Structure();

  /**
   * Returns the meta object for the attribute '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOChangingParameter#isTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOChangingParameter#isTable()
   * @see #getFunctionModulePOJOChangingParameter()
   * @generated
   */
  EAttribute getFunctionModulePOJOChangingParameter_Table();

  /**
   * Returns the meta object for class '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOTablesParameter <em>Function Module POJO Tables Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Module POJO Tables Parameter</em>'.
   * @see net.sf.rcer.rfcgen.mapping.FunctionModulePOJOTablesParameter
   * @generated
   */
  EClass getFunctionModulePOJOTablesParameter();

  /**
   * Returns the meta object for enum '{@link net.sf.rcer.rfcgen.mapping.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Type</em>'.
   * @see net.sf.rcer.rfcgen.mapping.DataType
   * @generated
   */
  EEnum getDataType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MappingFactory getMappingFactory();

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
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.ModelImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getModel()
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
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

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
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.ImportImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__FULL_NAME = eINSTANCE.getImport_FullName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__NAME = eINSTANCE.getImport_Name();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.StructureImpl <em>Structure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.StructureImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getStructure()
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
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.StructureMappingImpl <em>Structure Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.StructureMappingImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getStructureMapping()
     * @generated
     */
    EClass STRUCTURE_MAPPING = eINSTANCE.getStructureMapping();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.StructurePOJOMappingImpl <em>Structure POJO Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.StructurePOJOMappingImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getStructurePOJOMapping()
     * @generated
     */
    EClass STRUCTURE_POJO_MAPPING = eINSTANCE.getStructurePOJOMapping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE_POJO_MAPPING__NAME = eINSTANCE.getStructurePOJOMapping_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURE_POJO_MAPPING__FIELDS = eINSTANCE.getStructurePOJOMapping_Fields();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.StructureFieldPOJOMappingImpl <em>Structure Field POJO Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.StructureFieldPOJOMappingImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getStructureFieldPOJOMapping()
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
     * The meta object literal for the '<em><b>Inactive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRUCTURE_FIELD_POJO_MAPPING__INACTIVE = eINSTANCE.getStructureFieldPOJOMapping_Inactive();

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
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModuleImpl <em>Function Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModuleImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModule()
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
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModuleMappingImpl <em>Function Module Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModuleMappingImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModuleMapping()
     * @generated
     */
    EClass FUNCTION_MODULE_MAPPING = eINSTANCE.getFunctionModuleMapping();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOMappingImpl <em>Function Module POJO Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOMappingImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOMapping()
     * @generated
     */
    EClass FUNCTION_MODULE_POJO_MAPPING = eINSTANCE.getFunctionModulePOJOMapping();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOCallMappingImpl <em>Function Module POJO Call Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOCallMappingImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOCallMapping()
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
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJORequestResponseMappingImpl <em>Function Module POJO Request Response Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJORequestResponseMappingImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJORequestResponseMapping()
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
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl <em>Function Module POJO Parameter Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOParameterMapping()
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
     * The meta object literal for the '<em><b>Inactive</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_PARAMETER_MAPPING__INACTIVE = eINSTANCE.getFunctionModulePOJOParameterMapping_Inactive();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE = eINSTANCE.getFunctionModulePOJOParameterMapping_Attribute();

    /**
     * The meta object literal for the '<em><b>Structure Mapping</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE_MAPPING = eINSTANCE.getFunctionModulePOJOParameterMapping_StructureMapping();

    /**
     * The meta object literal for the '<em><b>External</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL = eINSTANCE.getFunctionModulePOJOParameterMapping_External();

    /**
     * The meta object literal for the '<em><b>External Class</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL_CLASS = eINSTANCE.getFunctionModulePOJOParameterMapping_ExternalClass();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT = eINSTANCE.getFunctionModulePOJOParameterMapping_Comment();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOImportingParameterImpl <em>Function Module POJO Importing Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOImportingParameterImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOImportingParameter()
     * @generated
     */
    EClass FUNCTION_MODULE_POJO_IMPORTING_PARAMETER = eINSTANCE.getFunctionModulePOJOImportingParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TYPE = eINSTANCE.getFunctionModulePOJOImportingParameter_Type();

    /**
     * The meta object literal for the '<em><b>Structure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__STRUCTURE = eINSTANCE.getFunctionModulePOJOImportingParameter_Structure();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TABLE = eINSTANCE.getFunctionModulePOJOImportingParameter_Table();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOExportingParameterImpl <em>Function Module POJO Exporting Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOExportingParameterImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOExportingParameter()
     * @generated
     */
    EClass FUNCTION_MODULE_POJO_EXPORTING_PARAMETER = eINSTANCE.getFunctionModulePOJOExportingParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__TYPE = eINSTANCE.getFunctionModulePOJOExportingParameter_Type();

    /**
     * The meta object literal for the '<em><b>Structure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__STRUCTURE = eINSTANCE.getFunctionModulePOJOExportingParameter_Structure();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__TABLE = eINSTANCE.getFunctionModulePOJOExportingParameter_Table();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOChangingParameterImpl <em>Function Module POJO Changing Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOChangingParameterImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOChangingParameter()
     * @generated
     */
    EClass FUNCTION_MODULE_POJO_CHANGING_PARAMETER = eINSTANCE.getFunctionModulePOJOChangingParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_CHANGING_PARAMETER__TYPE = eINSTANCE.getFunctionModulePOJOChangingParameter_Type();

    /**
     * The meta object literal for the '<em><b>Structure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_CHANGING_PARAMETER__STRUCTURE = eINSTANCE.getFunctionModulePOJOChangingParameter_Structure();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_MODULE_POJO_CHANGING_PARAMETER__TABLE = eINSTANCE.getFunctionModulePOJOChangingParameter_Table();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOTablesParameterImpl <em>Function Module POJO Tables Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOTablesParameterImpl
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getFunctionModulePOJOTablesParameter()
     * @generated
     */
    EClass FUNCTION_MODULE_POJO_TABLES_PARAMETER = eINSTANCE.getFunctionModulePOJOTablesParameter();

    /**
     * The meta object literal for the '{@link net.sf.rcer.rfcgen.mapping.DataType <em>Data Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.rcer.rfcgen.mapping.DataType
     * @see net.sf.rcer.rfcgen.mapping.impl.MappingPackageImpl#getDataType()
     * @generated
     */
    EEnum DATA_TYPE = eINSTANCE.getDataType();

  }

} //MappingPackage
