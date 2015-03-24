/**
 */
package net.sf.rcer.rfcgen.mapping;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.Model#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.Model#getStructures <em>Structures</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.Model#getFunctionModules <em>Function Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' attribute.
   * @see #setPackageName(String)
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getModel_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link net.sf.rcer.rfcgen.mapping.Model#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.rcer.rfcgen.mapping.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.rcer.rfcgen.mapping.Structure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structures</em>' containment reference list.
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getModel_Structures()
   * @model containment="true"
   * @generated
   */
  EList<Structure> getStructures();

  /**
   * Returns the value of the '<em><b>Function Modules</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.rcer.rfcgen.mapping.FunctionModule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Modules</em>' containment reference list.
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getModel_FunctionModules()
   * @model containment="true"
   * @generated
   */
  EList<FunctionModule> getFunctionModules();

} // Model
