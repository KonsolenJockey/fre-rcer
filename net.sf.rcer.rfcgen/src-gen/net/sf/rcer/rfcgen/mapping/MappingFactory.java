/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rfcgen.mapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rfcgen.mapping.MappingPackage
 * @generated
 */
public interface MappingFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MappingFactory eINSTANCE = net.sf.rcer.rfcgen.mapping.impl.MappingFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Structure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure</em>'.
   * @generated
   */
  Structure createStructure();

  /**
   * Returns a new object of class '<em>Structure Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure Mapping</em>'.
   * @generated
   */
  StructureMapping createStructureMapping();

  /**
   * Returns a new object of class '<em>Structure POJO Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure POJO Mapping</em>'.
   * @generated
   */
  StructurePOJOMapping createStructurePOJOMapping();

  /**
   * Returns a new object of class '<em>Structure Field POJO Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structure Field POJO Mapping</em>'.
   * @generated
   */
  StructureFieldPOJOMapping createStructureFieldPOJOMapping();

  /**
   * Returns a new object of class '<em>Function Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Module</em>'.
   * @generated
   */
  FunctionModule createFunctionModule();

  /**
   * Returns a new object of class '<em>Function Module Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Module Mapping</em>'.
   * @generated
   */
  FunctionModuleMapping createFunctionModuleMapping();

  /**
   * Returns a new object of class '<em>Function Module POJO Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Module POJO Mapping</em>'.
   * @generated
   */
  FunctionModulePOJOMapping createFunctionModulePOJOMapping();

  /**
   * Returns a new object of class '<em>Function Module POJO Call Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Module POJO Call Mapping</em>'.
   * @generated
   */
  FunctionModulePOJOCallMapping createFunctionModulePOJOCallMapping();

  /**
   * Returns a new object of class '<em>Function Module POJO Request Response Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Module POJO Request Response Mapping</em>'.
   * @generated
   */
  FunctionModulePOJORequestResponseMapping createFunctionModulePOJORequestResponseMapping();

  /**
   * Returns a new object of class '<em>Function Module POJO Parameter Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Module POJO Parameter Mapping</em>'.
   * @generated
   */
  FunctionModulePOJOParameterMapping createFunctionModulePOJOParameterMapping();

  /**
   * Returns a new object of class '<em>Function Module POJO Importing Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Module POJO Importing Parameter</em>'.
   * @generated
   */
  FunctionModulePOJOImportingParameter createFunctionModulePOJOImportingParameter();

  /**
   * Returns a new object of class '<em>Function Module POJO Exporting Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Module POJO Exporting Parameter</em>'.
   * @generated
   */
  FunctionModulePOJOExportingParameter createFunctionModulePOJOExportingParameter();

  /**
   * Returns a new object of class '<em>Function Module POJO Changing Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Module POJO Changing Parameter</em>'.
   * @generated
   */
  FunctionModulePOJOChangingParameter createFunctionModulePOJOChangingParameter();

  /**
   * Returns a new object of class '<em>Function Module POJO Tables Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Module POJO Tables Parameter</em>'.
   * @generated
   */
  FunctionModulePOJOTablesParameter createFunctionModulePOJOTablesParameter();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MappingPackage getMappingPackage();

} //MappingFactory
