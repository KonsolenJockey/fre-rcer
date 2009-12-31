/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rfcgen.mapping.impl;

import java.util.Collection;

import net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping;
import net.sf.rcer.rfcgen.mapping.FunctionModulePOJORequestResponseMapping;
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
 * An implementation of the model object '<em><b>Function Module POJO Request Response Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJORequestResponseMappingImpl#getRequestClassName <em>Request Class Name</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJORequestResponseMappingImpl#getRequestParameters <em>Request Parameters</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJORequestResponseMappingImpl#getResponseClassName <em>Response Class Name</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJORequestResponseMappingImpl#getResponseParameters <em>Response Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionModulePOJORequestResponseMappingImpl extends FunctionModulePOJOMappingImpl implements FunctionModulePOJORequestResponseMapping
{
  /**
   * The default value of the '{@link #getRequestClassName() <em>Request Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequestClassName()
   * @generated
   * @ordered
   */
  protected static final String REQUEST_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRequestClassName() <em>Request Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequestClassName()
   * @generated
   * @ordered
   */
  protected String requestClassName = REQUEST_CLASS_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getRequestParameters() <em>Request Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequestParameters()
   * @generated
   * @ordered
   */
  protected EList<FunctionModulePOJOParameterMapping> requestParameters;

  /**
   * The default value of the '{@link #getResponseClassName() <em>Response Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponseClassName()
   * @generated
   * @ordered
   */
  protected static final String RESPONSE_CLASS_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getResponseClassName() <em>Response Class Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponseClassName()
   * @generated
   * @ordered
   */
  protected String responseClassName = RESPONSE_CLASS_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getResponseParameters() <em>Response Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponseParameters()
   * @generated
   * @ordered
   */
  protected EList<FunctionModulePOJOParameterMapping> responseParameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionModulePOJORequestResponseMappingImpl()
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
    return MappingPackage.Literals.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRequestClassName()
  {
    return requestClassName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequestClassName(String newRequestClassName)
  {
    String oldRequestClassName = requestClassName;
    requestClassName = newRequestClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_CLASS_NAME, oldRequestClassName, requestClassName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionModulePOJOParameterMapping> getRequestParameters()
  {
    if (requestParameters == null)
    {
      requestParameters = new EObjectContainmentEList<FunctionModulePOJOParameterMapping>(FunctionModulePOJOParameterMapping.class, this, MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_PARAMETERS);
    }
    return requestParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getResponseClassName()
  {
    return responseClassName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResponseClassName(String newResponseClassName)
  {
    String oldResponseClassName = responseClassName;
    responseClassName = newResponseClassName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_CLASS_NAME, oldResponseClassName, responseClassName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionModulePOJOParameterMapping> getResponseParameters()
  {
    if (responseParameters == null)
    {
      responseParameters = new EObjectContainmentEList<FunctionModulePOJOParameterMapping>(FunctionModulePOJOParameterMapping.class, this, MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_PARAMETERS);
    }
    return responseParameters;
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
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_PARAMETERS:
        return ((InternalEList<?>)getRequestParameters()).basicRemove(otherEnd, msgs);
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_PARAMETERS:
        return ((InternalEList<?>)getResponseParameters()).basicRemove(otherEnd, msgs);
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
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_CLASS_NAME:
        return getRequestClassName();
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_PARAMETERS:
        return getRequestParameters();
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_CLASS_NAME:
        return getResponseClassName();
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_PARAMETERS:
        return getResponseParameters();
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
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_CLASS_NAME:
        setRequestClassName((String)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_PARAMETERS:
        getRequestParameters().clear();
        getRequestParameters().addAll((Collection<? extends FunctionModulePOJOParameterMapping>)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_CLASS_NAME:
        setResponseClassName((String)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_PARAMETERS:
        getResponseParameters().clear();
        getResponseParameters().addAll((Collection<? extends FunctionModulePOJOParameterMapping>)newValue);
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
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_CLASS_NAME:
        setRequestClassName(REQUEST_CLASS_NAME_EDEFAULT);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_PARAMETERS:
        getRequestParameters().clear();
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_CLASS_NAME:
        setResponseClassName(RESPONSE_CLASS_NAME_EDEFAULT);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_PARAMETERS:
        getResponseParameters().clear();
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
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_CLASS_NAME:
        return REQUEST_CLASS_NAME_EDEFAULT == null ? requestClassName != null : !REQUEST_CLASS_NAME_EDEFAULT.equals(requestClassName);
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__REQUEST_PARAMETERS:
        return requestParameters != null && !requestParameters.isEmpty();
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_CLASS_NAME:
        return RESPONSE_CLASS_NAME_EDEFAULT == null ? responseClassName != null : !RESPONSE_CLASS_NAME_EDEFAULT.equals(responseClassName);
      case MappingPackage.FUNCTION_MODULE_POJO_REQUEST_RESPONSE_MAPPING__RESPONSE_PARAMETERS:
        return responseParameters != null && !responseParameters.isEmpty();
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
    result.append(" (requestClassName: ");
    result.append(requestClassName);
    result.append(", responseClassName: ");
    result.append(responseClassName);
    result.append(')');
    return result.toString();
  }

} //FunctionModulePOJORequestResponseMappingImpl
