/**
 */
package net.sf.rcer.rfcgen.mapping.util;

import net.sf.rcer.rfcgen.mapping.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rfcgen.mapping.MappingPackage
 * @generated
 */
public class MappingSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MappingPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MappingPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MappingPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.STRUCTURE:
      {
        Structure structure = (Structure)theEObject;
        T result = caseStructure(structure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.STRUCTURE_MAPPING:
      {
        StructureMapping structureMapping = (StructureMapping)theEObject;
        T result = caseStructureMapping(structureMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.STRUCTURE_POJO_MAPPING:
      {
        StructurePOJOMapping structurePOJOMapping = (StructurePOJOMapping)theEObject;
        T result = caseStructurePOJOMapping(structurePOJOMapping);
        if (result == null) result = caseStructureMapping(structurePOJOMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.STRUCTURE_FIELD_POJO_MAPPING:
      {
        StructureFieldPOJOMapping structureFieldPOJOMapping = (StructureFieldPOJOMapping)theEObject;
        T result = caseStructureFieldPOJOMapping(structureFieldPOJOMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.FUNCTION_MODULE:
      {
        FunctionModule functionModule = (FunctionModule)theEObject;
        T result = caseFunctionModule(functionModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.FUNCTION_MODULE_MAPPING:
      {
        FunctionModuleMapping functionModuleMapping = (FunctionModuleMapping)theEObject;
        T result = caseFunctionModuleMapping(functionModuleMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.FUNCTION_MODULE_POJO_MAPPING:
      {
        FunctionModulePOJOMapping functionModulePOJOMapping = (FunctionModulePOJOMapping)theEObject;
        T result = caseFunctionModulePOJOMapping(functionModulePOJOMapping);
        if (result == null) result = caseFunctionModuleMapping(functionModulePOJOMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING:
      {
        FunctionModulePOJOCallMapping functionModulePOJOCallMapping = (FunctionModulePOJOCallMapping)theEObject;
        T result = caseFunctionModulePOJOCallMapping(functionModulePOJOCallMapping);
        if (result == null) result = caseFunctionModulePOJOMapping(functionModulePOJOCallMapping);
        if (result == null) result = caseFunctionModuleMapping(functionModulePOJOCallMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING:
      {
        FunctionModulePOJORequestResponseMapping functionModulePOJORequestResponseMapping = (FunctionModulePOJORequestResponseMapping)theEObject;
        T result = caseFunctionModulePOJORequestResponseMapping(functionModulePOJORequestResponseMapping);
        if (result == null) result = caseFunctionModulePOJOMapping(functionModulePOJORequestResponseMapping);
        if (result == null) result = caseFunctionModuleMapping(functionModulePOJORequestResponseMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING:
      {
        FunctionModulePOJOParameterMapping functionModulePOJOParameterMapping = (FunctionModulePOJOParameterMapping)theEObject;
        T result = caseFunctionModulePOJOParameterMapping(functionModulePOJOParameterMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER:
      {
        FunctionModulePOJOImportingParameter functionModulePOJOImportingParameter = (FunctionModulePOJOImportingParameter)theEObject;
        T result = caseFunctionModulePOJOImportingParameter(functionModulePOJOImportingParameter);
        if (result == null) result = caseFunctionModulePOJOParameterMapping(functionModulePOJOImportingParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER:
      {
        FunctionModulePOJOExportingParameter functionModulePOJOExportingParameter = (FunctionModulePOJOExportingParameter)theEObject;
        T result = caseFunctionModulePOJOExportingParameter(functionModulePOJOExportingParameter);
        if (result == null) result = caseFunctionModulePOJOParameterMapping(functionModulePOJOExportingParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.FUNCTION_MODULE_POJO_CHANGING_PARAMETER:
      {
        FunctionModulePOJOChangingParameter functionModulePOJOChangingParameter = (FunctionModulePOJOChangingParameter)theEObject;
        T result = caseFunctionModulePOJOChangingParameter(functionModulePOJOChangingParameter);
        if (result == null) result = caseFunctionModulePOJOParameterMapping(functionModulePOJOChangingParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingPackage.FUNCTION_MODULE_POJO_TABLES_PARAMETER:
      {
        FunctionModulePOJOTablesParameter functionModulePOJOTablesParameter = (FunctionModulePOJOTablesParameter)theEObject;
        T result = caseFunctionModulePOJOTablesParameter(functionModulePOJOTablesParameter);
        if (result == null) result = caseFunctionModulePOJOParameterMapping(functionModulePOJOTablesParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructure(Structure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructureMapping(StructureMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure POJO Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure POJO Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructurePOJOMapping(StructurePOJOMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structure Field POJO Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structure Field POJO Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructureFieldPOJOMapping(StructureFieldPOJOMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionModule(FunctionModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Module Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Module Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionModuleMapping(FunctionModuleMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Module POJO Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Module POJO Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionModulePOJOMapping(FunctionModulePOJOMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Module POJO Call Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Module POJO Call Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionModulePOJOCallMapping(FunctionModulePOJOCallMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Module POJO Request Response Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Module POJO Request Response Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionModulePOJORequestResponseMapping(FunctionModulePOJORequestResponseMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Module POJO Parameter Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Module POJO Parameter Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionModulePOJOParameterMapping(FunctionModulePOJOParameterMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Module POJO Importing Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Module POJO Importing Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionModulePOJOImportingParameter(FunctionModulePOJOImportingParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Module POJO Exporting Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Module POJO Exporting Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionModulePOJOExportingParameter(FunctionModulePOJOExportingParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Module POJO Changing Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Module POJO Changing Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionModulePOJOChangingParameter(FunctionModulePOJOChangingParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Module POJO Tables Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Module POJO Tables Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionModulePOJOTablesParameter(FunctionModulePOJOTablesParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MappingSwitch
