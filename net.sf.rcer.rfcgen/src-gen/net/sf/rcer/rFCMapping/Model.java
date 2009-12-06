/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rFCMapping;

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
 *   <li>{@link net.sf.rcer.rFCMapping.Model#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link net.sf.rcer.rFCMapping.Model#getStructures <em>Structures</em>}</li>
 *   <li>{@link net.sf.rcer.rFCMapping.Model#getFunctionModules <em>Function Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rFCMapping.RFCMappingPackage#getModel()
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
   * @see net.sf.rcer.rFCMapping.RFCMappingPackage#getModel_PackageName()
   * @model
   * @generated
   */
  String getPackageName();

  /**
   * Sets the value of the '{@link net.sf.rcer.rFCMapping.Model#getPackageName <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' attribute.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(String value);

  /**
   * Returns the value of the '<em><b>Structures</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.rcer.rFCMapping.Structure}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structures</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structures</em>' containment reference list.
   * @see net.sf.rcer.rFCMapping.RFCMappingPackage#getModel_Structures()
   * @model containment="true"
   * @generated
   */
  EList<Structure> getStructures();

  /**
   * Returns the value of the '<em><b>Function Modules</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.rcer.rFCMapping.FunctionModule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Modules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Modules</em>' containment reference list.
   * @see net.sf.rcer.rFCMapping.RFCMappingPackage#getModel_FunctionModules()
   * @model containment="true"
   * @generated
   */
  EList<FunctionModule> getFunctionModules();

} // Model
