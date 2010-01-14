/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rfcgen.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Field POJO Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#isInactive <em>Inactive</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getStructureFieldPOJOMapping()
 * @model
 * @generated
 */
public interface StructureFieldPOJOMapping extends EObject
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
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getStructureFieldPOJOMapping_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Inactive</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inactive</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inactive</em>' attribute.
   * @see #setInactive(boolean)
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getStructureFieldPOJOMapping_Inactive()
   * @model
   * @generated
   */
  boolean isInactive();

  /**
   * Sets the value of the '{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#isInactive <em>Inactive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inactive</em>' attribute.
   * @see #isInactive()
   * @generated
   */
  void setInactive(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.rcer.rfcgen.mapping.DataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see net.sf.rcer.rfcgen.mapping.DataType
   * @see #setType(DataType)
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getStructureFieldPOJOMapping_Type()
   * @model
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see net.sf.rcer.rfcgen.mapping.DataType
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' attribute.
   * @see #setAttribute(String)
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getStructureFieldPOJOMapping_Attribute()
   * @model
   * @generated
   */
  String getAttribute();

  /**
   * Sets the value of the '{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getAttribute <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' attribute.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(String value);

  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute.
   * @see #setComment(String)
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getStructureFieldPOJOMapping_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link net.sf.rcer.rfcgen.mapping.StructureFieldPOJOMapping#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

} // StructureFieldPOJOMapping
