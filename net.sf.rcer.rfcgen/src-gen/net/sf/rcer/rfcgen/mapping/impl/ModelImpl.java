/**
 */
package net.sf.rcer.rfcgen.mapping.impl;

import java.util.Collection;

import net.sf.rcer.rfcgen.mapping.FunctionModule;
import net.sf.rcer.rfcgen.mapping.Import;
import net.sf.rcer.rfcgen.mapping.MappingPackage;
import net.sf.rcer.rfcgen.mapping.Model;
import net.sf.rcer.rfcgen.mapping.Structure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.ModelImpl#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.ModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.ModelImpl#getStructures <em>Structures</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.ModelImpl#getFunctionModules <em>Function Modules</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected static final String PACKAGE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected String packageName = PACKAGE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getStructures() <em>Structures</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructures()
   * @generated
   * @ordered
   */
  protected EList<Structure> structures;

  /**
   * The cached value of the '{@link #getFunctionModules() <em>Function Modules</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionModules()
   * @generated
   * @ordered
   */
  protected EList<FunctionModule> functionModules;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return MappingPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPackageName()
  {
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageName(String newPackageName)
  {
    String oldPackageName = packageName;
    packageName = newPackageName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MODEL__PACKAGE_NAME, oldPackageName, packageName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, MappingPackage.MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Structure> getStructures()
  {
    if (structures == null)
    {
      structures = new EObjectContainmentEList<Structure>(Structure.class, this, MappingPackage.MODEL__STRUCTURES);
    }
    return structures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionModule> getFunctionModules()
  {
    if (functionModules == null)
    {
      functionModules = new EObjectContainmentEList<FunctionModule>(FunctionModule.class, this, MappingPackage.MODEL__FUNCTION_MODULES);
    }
    return functionModules;
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
      case MappingPackage.MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case MappingPackage.MODEL__STRUCTURES:
        return ((InternalEList<?>)getStructures()).basicRemove(otherEnd, msgs);
      case MappingPackage.MODEL__FUNCTION_MODULES:
        return ((InternalEList<?>)getFunctionModules()).basicRemove(otherEnd, msgs);
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
      case MappingPackage.MODEL__PACKAGE_NAME:
        return getPackageName();
      case MappingPackage.MODEL__IMPORTS:
        return getImports();
      case MappingPackage.MODEL__STRUCTURES:
        return getStructures();
      case MappingPackage.MODEL__FUNCTION_MODULES:
        return getFunctionModules();
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
      case MappingPackage.MODEL__PACKAGE_NAME:
        setPackageName((String)newValue);
        return;
      case MappingPackage.MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case MappingPackage.MODEL__STRUCTURES:
        getStructures().clear();
        getStructures().addAll((Collection<? extends Structure>)newValue);
        return;
      case MappingPackage.MODEL__FUNCTION_MODULES:
        getFunctionModules().clear();
        getFunctionModules().addAll((Collection<? extends FunctionModule>)newValue);
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
      case MappingPackage.MODEL__PACKAGE_NAME:
        setPackageName(PACKAGE_NAME_EDEFAULT);
        return;
      case MappingPackage.MODEL__IMPORTS:
        getImports().clear();
        return;
      case MappingPackage.MODEL__STRUCTURES:
        getStructures().clear();
        return;
      case MappingPackage.MODEL__FUNCTION_MODULES:
        getFunctionModules().clear();
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
      case MappingPackage.MODEL__PACKAGE_NAME:
        return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
      case MappingPackage.MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case MappingPackage.MODEL__STRUCTURES:
        return structures != null && !structures.isEmpty();
      case MappingPackage.MODEL__FUNCTION_MODULES:
        return functionModules != null && !functionModules.isEmpty();
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
    result.append(" (packageName: ");
    result.append(packageName);
    result.append(')');
    return result.toString();
  }

} //ModelImpl
