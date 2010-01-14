/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rfcgen.mapping;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Module POJO Exporting Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOExportingParameter#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOExportingParameter#isTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getFunctionModulePOJOExportingParameter()
 * @model
 * @generated
 */
public interface FunctionModulePOJOExportingParameter extends FunctionModulePOJOParameterMapping
{
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
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getFunctionModulePOJOExportingParameter_Type()
   * @model
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOExportingParameter#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see net.sf.rcer.rfcgen.mapping.DataType
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

  /**
   * Returns the value of the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table</em>' attribute.
   * @see #setTable(boolean)
   * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getFunctionModulePOJOExportingParameter_Table()
   * @model
   * @generated
   */
  boolean isTable();

  /**
   * Sets the value of the '{@link net.sf.rcer.rfcgen.mapping.FunctionModulePOJOExportingParameter#isTable <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table</em>' attribute.
   * @see #isTable()
   * @generated
   */
  void setTable(boolean value);

} // FunctionModulePOJOExportingParameter
