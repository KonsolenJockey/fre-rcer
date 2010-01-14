/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rfcgen.mapping.impl;

import net.sf.rcer.rfcgen.mapping.DataType;
import net.sf.rcer.rfcgen.mapping.FunctionModulePOJOImportingParameter;
import net.sf.rcer.rfcgen.mapping.MappingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Module POJO Importing Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOImportingParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOImportingParameterImpl#isTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionModulePOJOImportingParameterImpl extends FunctionModulePOJOParameterMappingImpl implements FunctionModulePOJOImportingParameter
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final DataType TYPE_EDEFAULT = DataType.BIG_DECIMAL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DataType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTable()
   * @generated
   * @ordered
   */
  protected static final boolean TABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTable() <em>Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTable()
   * @generated
   * @ordered
   */
  protected boolean table = TABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionModulePOJOImportingParameterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MappingPackage.Literals.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DataType newType)
  {
    DataType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTable()
  {
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTable(boolean newTable)
  {
    boolean oldTable = table;
    table = newTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TABLE, oldTable, table));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MappingPackage.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TYPE:
        return getType();
      case MappingPackage.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TABLE:
        return isTable();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MappingPackage.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TYPE:
        setType((DataType)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TABLE:
        setTable((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MappingPackage.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TABLE:
        setTable(TABLE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MappingPackage.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TYPE:
        return type != TYPE_EDEFAULT;
      case MappingPackage.FUNCTION_MODULE_POJO_IMPORTING_PARAMETER__TABLE:
        return table != TABLE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", table: ");
    result.append(table);
    result.append(')');
    return result.toString();
  }

} //FunctionModulePOJOImportingParameterImpl
