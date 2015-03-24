/**
 */
package net.sf.rcer.rfcgen.mapping.impl;

import java.util.Collection;

import net.sf.rcer.rfcgen.mapping.FunctionModulePOJOCallMapping;
import net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping;
import net.sf.rcer.rfcgen.mapping.MappingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Module POJO Call Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOCallMappingImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOCallMappingImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionModulePOJOCallMappingImpl extends FunctionModulePOJOMappingImpl implements FunctionModulePOJOCallMapping
{
  /**
   * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected static final String CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassName()
   * @generated
   * @ordered
   */
  protected String className = CLASS_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<FunctionModulePOJOParameterMapping> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionModulePOJOCallMappingImpl()
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
    return MappingPackage.Literals.FUNCTION_MODULE_POJO_CALL_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClassName()
  {
    return className;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassName(String newClassName)
  {
    String oldClassName = className;
    className = newClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING__CLASS_NAME, oldClassName, className));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionModulePOJOParameterMapping> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<FunctionModulePOJOParameterMapping>(FunctionModulePOJOParameterMapping.class, this, MappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING__CLASS_NAME:
        return getClassName();
      case MappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING__PARAMETERS:
        return getParameters();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING__CLASS_NAME:
        setClassName((String)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends FunctionModulePOJOParameterMapping>)newValue);
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
      case MappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING__CLASS_NAME:
        setClassName(CLASS_NAME_EDEFAULT);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING__PARAMETERS:
        getParameters().clear();
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
      case MappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING__CLASS_NAME:
        return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
      case MappingPackage.FUNCTION_MODULE_POJO_CALL_MAPPING__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
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
    result.append(" (className: ");
    result.append(className);
    result.append(')');
    return result.toString();
  }

} //FunctionModulePOJOCallMappingImpl
