/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rFCMapping.impl;

import net.sf.rcer.rFCMapping.FunctionModulePOJOExportingParameter;
import net.sf.rcer.rFCMapping.RFCMappingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Module POJO Exporting Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOExportingParameterImpl#isIsStructure <em>Is Structure</em>}</li>
 *   <li>{@link net.sf.rcer.rFCMapping.impl.FunctionModulePOJOExportingParameterImpl#isIsTable <em>Is Table</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionModulePOJOExportingParameterImpl extends FunctionModulePOJOParameterMappingImpl implements FunctionModulePOJOExportingParameter
{
  /**
   * The default value of the '{@link #isIsStructure() <em>Is Structure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStructure()
   * @generated
   * @ordered
   */
  protected static final boolean IS_STRUCTURE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsStructure() <em>Is Structure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStructure()
   * @generated
   * @ordered
   */
  protected boolean isStructure = IS_STRUCTURE_EDEFAULT;

  /**
   * The default value of the '{@link #isIsTable() <em>Is Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTable()
   * @generated
   * @ordered
   */
  protected static final boolean IS_TABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsTable() <em>Is Table</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTable()
   * @generated
   * @ordered
   */
  protected boolean isTable = IS_TABLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionModulePOJOExportingParameterImpl()
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
    return RFCMappingPackage.Literals.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsStructure()
  {
    return isStructure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsStructure(boolean newIsStructure)
  {
    boolean oldIsStructure = isStructure;
    isStructure = newIsStructure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFCMappingPackage.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_STRUCTURE, oldIsStructure, isStructure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsTable()
  {
    return isTable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsTable(boolean newIsTable)
  {
    boolean oldIsTable = isTable;
    isTable = newIsTable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RFCMappingPackage.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_TABLE, oldIsTable, isTable));
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
      case RFCMappingPackage.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_STRUCTURE:
        return isIsStructure();
      case RFCMappingPackage.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_TABLE:
        return isIsTable();
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
      case RFCMappingPackage.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_STRUCTURE:
        setIsStructure((Boolean)newValue);
        return;
      case RFCMappingPackage.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_TABLE:
        setIsTable((Boolean)newValue);
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
      case RFCMappingPackage.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_STRUCTURE:
        setIsStructure(IS_STRUCTURE_EDEFAULT);
        return;
      case RFCMappingPackage.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_TABLE:
        setIsTable(IS_TABLE_EDEFAULT);
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
      case RFCMappingPackage.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_STRUCTURE:
        return isStructure != IS_STRUCTURE_EDEFAULT;
      case RFCMappingPackage.FUNCTION_MODULE_POJO_EXPORTING_PARAMETER__IS_TABLE:
        return isTable != IS_TABLE_EDEFAULT;
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
    result.append(" (isStructure: ");
    result.append(isStructure);
    result.append(", isTable: ");
    result.append(isTable);
    result.append(')');
    return result.toString();
  }

} //FunctionModulePOJOExportingParameterImpl
