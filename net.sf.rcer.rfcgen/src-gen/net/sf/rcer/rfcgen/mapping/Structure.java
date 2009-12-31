/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rfcgen.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.Structure#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.Structure#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends EObject
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
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getStructure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.rcer.rfcgen.mapping.Structure#getName <em>Name</em>}' attribute.
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
   * @see #setMapping(StructureMapping)
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getStructure_Mapping()
   * @model containment="true"
   * @generated
   */
  StructureMapping getMapping();

  /**
   * Sets the value of the '{@link net.sf.rcer.rfcgen.mapping.Structure#getMapping <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping</em>' containment reference.
   * @see #getMapping()
   * @generated
   */
  void setMapping(StructureMapping value);

} // Structure
