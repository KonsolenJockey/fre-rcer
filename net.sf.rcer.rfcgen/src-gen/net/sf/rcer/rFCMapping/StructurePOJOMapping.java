/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rFCMapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure POJO Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rFCMapping.StructurePOJOMapping#getClassName <em>Class Name</em>}</li>
 *   <li>{@link net.sf.rcer.rFCMapping.StructurePOJOMapping#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rFCMapping.RFCMappingPackage#getStructurePOJOMapping()
 * @model
 * @generated
 */
public interface StructurePOJOMapping extends StructureMapping
{
  /**
   * Returns the value of the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Name</em>' attribute.
   * @see #setClassName(String)
   * @see net.sf.rcer.rFCMapping.RFCMappingPackage#getStructurePOJOMapping_ClassName()
   * @model
   * @generated
   */
  String getClassName();

  /**
   * Sets the value of the '{@link net.sf.rcer.rFCMapping.StructurePOJOMapping#getClassName <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Name</em>' attribute.
   * @see #getClassName()
   * @generated
   */
  void setClassName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link net.sf.rcer.rFCMapping.StructureFieldPOJOMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see net.sf.rcer.rFCMapping.RFCMappingPackage#getStructurePOJOMapping_Fields()
   * @model containment="true"
   * @generated
   */
  EList<StructureFieldPOJOMapping> getFields();

} // StructurePOJOMapping
