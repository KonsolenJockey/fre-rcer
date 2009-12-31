/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rfcgen.mapping.impl;

import net.sf.rcer.rfcgen.mapping.FunctionModule;
import net.sf.rcer.rfcgen.mapping.FunctionModuleMapping;
import net.sf.rcer.rfcgen.mapping.MappingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModuleImpl#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionModuleImpl extends MinimalEObjectImpl.Container implements FunctionModule
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping()
   * @generated
   * @ordered
   */
  protected FunctionModuleMapping mapping;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionModuleImpl()
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
    return MappingPackage.Literals.FUNCTION_MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionModuleMapping getMapping()
  {
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapping(FunctionModuleMapping newMapping, NotificationChain msgs)
  {
    FunctionModuleMapping oldMapping = mapping;
    mapping = newMapping;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE__MAPPING, oldMapping, newMapping);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapping(FunctionModuleMapping newMapping)
  {
    if (newMapping != mapping)
    {
      NotificationChain msgs = null;
      if (mapping != null)
        msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MappingPackage.FUNCTION_MODULE__MAPPING, null, msgs);
      if (newMapping != null)
        msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MappingPackage.FUNCTION_MODULE__MAPPING, null, msgs);
      msgs = basicSetMapping(newMapping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE__MAPPING, newMapping, newMapping));
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
      case MappingPackage.FUNCTION_MODULE__MAPPING:
        return basicSetMapping(null, msgs);
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
      case MappingPackage.FUNCTION_MODULE__NAME:
        return getName();
      case MappingPackage.FUNCTION_MODULE__MAPPING:
        return getMapping();
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
      case MappingPackage.FUNCTION_MODULE__NAME:
        setName((String)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE__MAPPING:
        setMapping((FunctionModuleMapping)newValue);
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
      case MappingPackage.FUNCTION_MODULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MappingPackage.FUNCTION_MODULE__MAPPING:
        setMapping((FunctionModuleMapping)null);
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
      case MappingPackage.FUNCTION_MODULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MappingPackage.FUNCTION_MODULE__MAPPING:
        return mapping != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FunctionModuleImpl
