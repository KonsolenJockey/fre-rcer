/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rFCMapping.impl;

import net.sf.rcer.rFCMapping.FunctionModule;
import net.sf.rcer.rFCMapping.FunctionModuleMapping;
import net.sf.rcer.rFCMapping.FunctionModulePOJOCallMapping;
import net.sf.rcer.rFCMapping.FunctionModulePOJOChangingParameter;
import net.sf.rcer.rFCMapping.FunctionModulePOJOExportingParameter;
import net.sf.rcer.rFCMapping.FunctionModulePOJOImportingParameter;
import net.sf.rcer.rFCMapping.FunctionModulePOJOMapping;
import net.sf.rcer.rFCMapping.FunctionModulePOJOParameterMapping;
import net.sf.rcer.rFCMapping.FunctionModulePOJORequestResponseMapping;
import net.sf.rcer.rFCMapping.FunctionModulePOJOTablesParameter;
import net.sf.rcer.rFCMapping.Model;
import net.sf.rcer.rFCMapping.RFCMappingFactory;
import net.sf.rcer.rFCMapping.RFCMappingPackage;
import net.sf.rcer.rFCMapping.Structure;
import net.sf.rcer.rFCMapping.StructureFieldPOJOMapping;
import net.sf.rcer.rFCMapping.StructureMapping;
import net.sf.rcer.rFCMapping.StructurePOJOMapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RFCMappingPackageImpl extends EPackageImpl implements RFCMappingPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structureMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structurePOJOMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structureFieldPOJOMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionModuleMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionModulePOJOMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionModulePOJOCallMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionModulePOJORequestResponseMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionModulePOJOParameterMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionModulePOJOImportingParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionModulePOJOExportingParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionModulePOJOChangingParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionModulePOJOTablesParameterEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see net.sf.rcer.rFCMapping.RFCMappingPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RFCMappingPackageImpl()
  {
    super(eNS_URI, RFCMappingFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link RFCMappingPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RFCMappingPackage init()
  {
    if (isInited) return (RFCMappingPackage)EPackage.Registry.INSTANCE.getEPackage(RFCMappingPackage.eNS_URI);

    // Obtain or create and register package
    RFCMappingPackageImpl theRFCMappingPackage = (RFCMappingPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RFCMappingPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RFCMappingPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRFCMappingPackage.createPackageContents();

    // Initialize created meta-data
    theRFCMappingPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRFCMappingPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RFCMappingPackage.eNS_URI, theRFCMappingPackage);
    return theRFCMappingPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_PackageName()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Structures()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_FunctionModules()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructure()
  {
    return structureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructure_Name()
  {
    return (EAttribute)structureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructure_Mapping()
  {
    return (EReference)structureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructureMapping()
  {
    return structureMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructurePOJOMapping()
  {
    return structurePOJOMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructurePOJOMapping_ClassName()
  {
    return (EAttribute)structurePOJOMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructurePOJOMapping_Fields()
  {
    return (EReference)structurePOJOMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructureFieldPOJOMapping()
  {
    return structureFieldPOJOMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructureFieldPOJOMapping_Name()
  {
    return (EAttribute)structureFieldPOJOMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructureFieldPOJOMapping_Type()
  {
    return (EAttribute)structureFieldPOJOMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructureFieldPOJOMapping_Attribute()
  {
    return (EAttribute)structureFieldPOJOMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructureFieldPOJOMapping_Comment()
  {
    return (EAttribute)structureFieldPOJOMappingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionModule()
  {
    return functionModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModule_Name()
  {
    return (EAttribute)functionModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionModule_Mapping()
  {
    return (EReference)functionModuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionModuleMapping()
  {
    return functionModuleMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionModulePOJOMapping()
  {
    return functionModulePOJOMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionModulePOJOCallMapping()
  {
    return functionModulePOJOCallMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJOCallMapping_ClassName()
  {
    return (EAttribute)functionModulePOJOCallMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionModulePOJOCallMapping_Parameters()
  {
    return (EReference)functionModulePOJOCallMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionModulePOJORequestResponseMapping()
  {
    return functionModulePOJORequestResponseMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJORequestResponseMapping_RequestClassName()
  {
    return (EAttribute)functionModulePOJORequestResponseMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionModulePOJORequestResponseMapping_RequestParameters()
  {
    return (EReference)functionModulePOJORequestResponseMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJORequestResponseMapping_ResponseClassName()
  {
    return (EAttribute)functionModulePOJORequestResponseMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionModulePOJORequestResponseMapping_ResponseParameters()
  {
    return (EReference)functionModulePOJORequestResponseMappingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionModulePOJOParameterMapping()
  {
    return functionModulePOJOParameterMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJOParameterMapping_Name()
  {
    return (EAttribute)functionModulePOJOParameterMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJOParameterMapping_IsInactive()
  {
    return (EAttribute)functionModulePOJOParameterMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJOParameterMapping_Type()
  {
    return (EAttribute)functionModulePOJOParameterMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJOParameterMapping_Attribute()
  {
    return (EAttribute)functionModulePOJOParameterMappingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJOParameterMapping_Comment()
  {
    return (EAttribute)functionModulePOJOParameterMappingEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionModulePOJOImportingParameter()
  {
    return functionModulePOJOImportingParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJOImportingParameter_IsStructure()
  {
    return (EAttribute)functionModulePOJOImportingParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJOImportingParameter_IsTable()
  {
    return (EAttribute)functionModulePOJOImportingParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionModulePOJOExportingParameter()
  {
    return functionModulePOJOExportingParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJOExportingParameter_IsStructure()
  {
    return (EAttribute)functionModulePOJOExportingParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJOExportingParameter_IsTable()
  {
    return (EAttribute)functionModulePOJOExportingParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionModulePOJOChangingParameter()
  {
    return functionModulePOJOChangingParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJOChangingParameter_IsStructure()
  {
    return (EAttribute)functionModulePOJOChangingParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionModulePOJOChangingParameter_IsTable()
  {
    return (EAttribute)functionModulePOJOChangingParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionModulePOJOTablesParameter()
  {
    return functionModulePOJOTablesParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RFCMappingFactory getRFCMappingFactory()
  {
    return (RFCMappingFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEAttribute(modelEClass, MODEL__PACKAGE_NAME);
    createEReference(modelEClass, MODEL__STRUCTURES);
    createEReference(modelEClass, MODEL__FUNCTION_MODULES);

    structureEClass = createEClass(STRUCTURE);
    createEAttribute(structureEClass, STRUCTURE__NAME);
    createEReference(structureEClass, STRUCTURE__MAPPING);

    structureMappingEClass = createEClass(STRUCTURE_MAPPING);

    structurePOJOMappingEClass = createEClass(STRUCTURE_POJO_MAPPING);
    createEAttribute(structurePOJOMappingEClass, STRUCTURE_POJO_MAPPING__CLASS_NAME);
    createEReference(structurePOJOMappingEClass, STRUCTURE_POJO_MAPPING__FIELDS);

    structureFieldPOJOMappingEClass = createEClass(STRUCTURE_FIELD_POJO_MAPPING);
    createEAttribute(structureFieldPOJOMappingEClass, STRUCTURE_FIELD_POJO_MAPPING__NAME);
    createEAttribute(structureFieldPOJOMappingEClass, STRUCTURE_FIELD_POJO_MAPPING__TYPE);
    createEAttribute(structureFieldPOJOMappingEClass, STRUCTURE_FIELD_POJO_MAPPING__ATTRIBUTE);
    createEAttribute(structureFieldPOJOMappingEClass, STRUCTURE_FIELD_POJO_MAPPING__COMMENT);

    functionModuleEClass = createEClass(FUNCTION_MODULE);
    createEAttribute(functionModuleEClass, FUNCTION_MODULE__NAME);
    createEReference(functionModuleEClass, FUNCTION_MODULE__MAPPING);

    functionModuleMappingEClass = createEClass(FUNCTION_MODULE_MAPPING);

    functionModulePOJOMappingEClass = createEClass(FUNCTION_MODULE_POJO_MAPPING);

    functionModulePOJOCallMappingEClass = createEClass(FUNCTION_MODULE_POJO_CALL_MAPPING);
    createEAttribute(functionModulePOJOCallMappingEClass, FUNCTION_MODULE_POJO_CALL_MAPPING__CLASS_NAME);
    createEReference(functionModulePOJOCallMappingEClass, FUNCTION_MODULE_POJO_CALL_MAPPING__PARAMETERS);

    functionModulePOJORequestResponseMappingEClass = createEClass(FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING);
    createEAttribute(functionModulePOJORequestResponseMappingEClass, FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_CLASS_NAME);
    createEReference(functionModulePOJORequestResponseMappingEClass, FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_PARAMETERS);
    createEAttribute(functionModulePOJORequestResponseMappingEClass, FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_CLASS_NAME);
    createEReference(functionModulePOJORequestResponseMappingEClass, FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_PARAMETERS);

    functionModulePOJOParameterMappingEClass = createEClass(FUNCTION_MODULE_POJO_PARAMETER_MAPPING);
    createEAttribute(functionModulePOJOParameterMappingEClass, FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME);
    createEAttribute(functionModulePOJOParameterMappingEClass, FUNCTION_MODULE_POJO_PARAMETER_MAPPING__IS_INACTIVE);
    createEAttribute(functionModulePOJOParameterMappingEClass, FUNCTION_MODULE_POJO_PARAMETER_MAPPING__TYPE);
    createEAttribute(functionModulePOJOParameterMappingEClass, FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE);
    createEAttribute(functionModulePOJOParameterMappingEClass, FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT);

    functionModulePOJOImportingParameterEClass = createEClass(FUNCTION_MODULE_POJO_IMPORTING_PARAMETER);
    createEAttribute(functionModulePOJOImportingParameterEClass, FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__IS_STRUCTURE);
    createEAttribute(functionModulePOJOImportingParameterEClass, FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__IS_TABLE);

    functionModulePOJOExportingParameterEClass = createEClass(FUNCTION_MODULE_POJO_EXPORTING_PARAMETER);
    createEAttribute(functionModulePOJOExportingParameterEClass, FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_STRUCTURE);
    createEAttribute(functionModulePOJOExportingParameterEClass, FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_TABLE);

    functionModulePOJOChangingParameterEClass = createEClass(FUNCTION_MODULE_POJO_CHANGING_PARAMETER);
    createEAttribute(functionModulePOJOChangingParameterEClass, FUNCTION_MODULE_POJO_CHANGING_PARAMETER__IS_STRUCTURE);
    createEAttribute(functionModulePOJOChangingParameterEClass, FUNCTION_MODULE_POJO_CHANGING_PARAMETER__IS_TABLE);

    functionModulePOJOTablesParameterEClass = createEClass(FUNCTION_MODULE_POJO_TABLES_PARAMETER);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    structurePOJOMappingEClass.getESuperTypes().add(this.getStructureMapping());
    functionModulePOJOMappingEClass.getESuperTypes().add(this.getFunctionModuleMapping());
    functionModulePOJOCallMappingEClass.getESuperTypes().add(this.getFunctionModulePOJOMapping());
    functionModulePOJORequestResponseMappingEClass.getESuperTypes().add(this.getFunctionModulePOJOMapping());
    functionModulePOJOImportingParameterEClass.getESuperTypes().add(this.getFunctionModulePOJOParameterMapping());
    functionModulePOJOExportingParameterEClass.getESuperTypes().add(this.getFunctionModulePOJOParameterMapping());
    functionModulePOJOChangingParameterEClass.getESuperTypes().add(this.getFunctionModulePOJOParameterMapping());
    functionModulePOJOTablesParameterEClass.getESuperTypes().add(this.getFunctionModulePOJOParameterMapping());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModel_PackageName(), ecorePackage.getEString(), "packageName", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_Structures(), this.getStructure(), null, "structures", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_FunctionModules(), this.getFunctionModule(), null, "functionModules", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStructure_Name(), ecorePackage.getEString(), "name", null, 0, 1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructure_Mapping(), this.getStructureMapping(), null, "mapping", null, 0, 1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structureMappingEClass, StructureMapping.class, "StructureMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(structurePOJOMappingEClass, StructurePOJOMapping.class, "StructurePOJOMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStructurePOJOMapping_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, StructurePOJOMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructurePOJOMapping_Fields(), this.getStructureFieldPOJOMapping(), null, "fields", null, 0, -1, StructurePOJOMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structureFieldPOJOMappingEClass, StructureFieldPOJOMapping.class, "StructureFieldPOJOMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStructureFieldPOJOMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, StructureFieldPOJOMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStructureFieldPOJOMapping_Type(), ecorePackage.getEString(), "type", null, 0, 1, StructureFieldPOJOMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStructureFieldPOJOMapping_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, StructureFieldPOJOMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStructureFieldPOJOMapping_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, StructureFieldPOJOMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionModuleEClass, FunctionModule.class, "FunctionModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionModule_Mapping(), this.getFunctionModuleMapping(), null, "mapping", null, 0, 1, FunctionModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionModuleMappingEClass, FunctionModuleMapping.class, "FunctionModuleMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionModulePOJOMappingEClass, FunctionModulePOJOMapping.class, "FunctionModulePOJOMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionModulePOJOCallMappingEClass, FunctionModulePOJOCallMapping.class, "FunctionModulePOJOCallMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionModulePOJOCallMapping_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, FunctionModulePOJOCallMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionModulePOJOCallMapping_Parameters(), this.getFunctionModulePOJOParameterMapping(), null, "parameters", null, 0, -1, FunctionModulePOJOCallMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionModulePOJORequestResponseMappingEClass, FunctionModulePOJORequestResponseMapping.class, "FunctionModulePOJORequestResponseMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionModulePOJORequestResponseMapping_RequestClassName(), ecorePackage.getEString(), "requestClassName", null, 0, 1, FunctionModulePOJORequestResponseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionModulePOJORequestResponseMapping_RequestParameters(), this.getFunctionModulePOJOParameterMapping(), null, "requestParameters", null, 0, -1, FunctionModulePOJORequestResponseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionModulePOJORequestResponseMapping_ResponseClassName(), ecorePackage.getEString(), "responseClassName", null, 0, 1, FunctionModulePOJORequestResponseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionModulePOJORequestResponseMapping_ResponseParameters(), this.getFunctionModulePOJOParameterMapping(), null, "responseParameters", null, 0, -1, FunctionModulePOJORequestResponseMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionModulePOJOParameterMappingEClass, FunctionModulePOJOParameterMapping.class, "FunctionModulePOJOParameterMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionModulePOJOParameterMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionModulePOJOParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionModulePOJOParameterMapping_IsInactive(), ecorePackage.getEBoolean(), "isInactive", null, 0, 1, FunctionModulePOJOParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionModulePOJOParameterMapping_Type(), ecorePackage.getEString(), "type", null, 0, 1, FunctionModulePOJOParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionModulePOJOParameterMapping_Attribute(), ecorePackage.getEString(), "attribute", null, 0, 1, FunctionModulePOJOParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionModulePOJOParameterMapping_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, FunctionModulePOJOParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionModulePOJOImportingParameterEClass, FunctionModulePOJOImportingParameter.class, "FunctionModulePOJOImportingParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionModulePOJOImportingParameter_IsStructure(), ecorePackage.getEBoolean(), "isStructure", null, 0, 1, FunctionModulePOJOImportingParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionModulePOJOImportingParameter_IsTable(), ecorePackage.getEBoolean(), "isTable", null, 0, 1, FunctionModulePOJOImportingParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionModulePOJOExportingParameterEClass, FunctionModulePOJOExportingParameter.class, "FunctionModulePOJOExportingParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionModulePOJOExportingParameter_IsStructure(), ecorePackage.getEBoolean(), "isStructure", null, 0, 1, FunctionModulePOJOExportingParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionModulePOJOExportingParameter_IsTable(), ecorePackage.getEBoolean(), "isTable", null, 0, 1, FunctionModulePOJOExportingParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionModulePOJOChangingParameterEClass, FunctionModulePOJOChangingParameter.class, "FunctionModulePOJOChangingParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionModulePOJOChangingParameter_IsStructure(), ecorePackage.getEBoolean(), "isStructure", null, 0, 1, FunctionModulePOJOChangingParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunctionModulePOJOChangingParameter_IsTable(), ecorePackage.getEBoolean(), "isTable", null, 0, 1, FunctionModulePOJOChangingParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionModulePOJOTablesParameterEClass, FunctionModulePOJOTablesParameter.class, "FunctionModulePOJOTablesParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //RFCMappingPackageImpl
