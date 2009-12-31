/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rfcgen.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.FunctionModule#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.FunctionModule#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getFunctionModule()
 * @model
 * @generated
 */
public interface FunctionModule extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getFunctionModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.rcer.rfcgen.mapping.FunctionModule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping</em>' containment reference.
   * @see #setMapping(FunctionModuleMapping)
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getFunctionModule_Mapping()
   * @model containment="true"
   * @generated
   */
  FunctionModuleMapping getMapping();

  /**
   * Sets the value of the '{@link net.sf.rcer.rfcgen.mapping.FunctionModule#getMapping <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping</em>' containment reference.
   * @see #getMapping()
   * @generated
   */
  void setMapping(FunctionModuleMapping value);

} // FunctionModule
