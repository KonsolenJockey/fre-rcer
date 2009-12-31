/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rfcgen.mapping.impl;

import net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping;
import net.sf.rcer.rfcgen.mapping.MappingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Module POJO Parameter Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl#isIsInactive <em>Is Inactive</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl#getComment <em>Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionModulePOJOParameterMappingImpl extends MinimalEObjectImpl.Container implements FunctionModulePOJOParameterMapping
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
   * The default value of the '{@link #isIsInactive() <em>Is Inactive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInactive()
   * @generated
   * @ordered
   */
  protected static final boolean IS_INACTIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsInactive() <em>Is Inactive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInactive()
   * @generated
   * @ordered
   */
  protected boolean isInactive = IS_INACTIVE_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute()
   * @generated
   * @ordered
   */
  protected String attribute = ATTRIBUTE_EDEFAULT;

  /**
   * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected static final String COMMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected String comment = COMMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionModulePOJOParameterMappingImpl()
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
    return MappingPackage.Literals.FUNCTION_MODULE_POJO_PARAMETER_MAPPING;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsInactive()
  {
    return isInactive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsInactive(boolean newIsInactive)
  {
    boolean oldIsInactive = isInactive;
    isInactive = newIsInactive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__IS_INACTIVE, oldIsInactive, isInactive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttribute()
  {
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute(String newAttribute)
  {
    String oldAttribute = attribute;
    attribute = newAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE, oldAttribute, attribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComment()
  {
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComment(String newComment)
  {
    String oldComment = comment;
    comment = newComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT, oldComment, comment));
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
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME:
        return getName();
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__IS_INACTIVE:
        return isIsInactive();
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__TYPE:
        return getType();
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE:
        return getAttribute();
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT:
        return getComment();
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
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME:
        setName((String)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__IS_INACTIVE:
        setIsInactive((Boolean)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__TYPE:
        setType((String)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE:
        setAttribute((String)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT:
        setComment((String)newValue);
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
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__IS_INACTIVE:
        setIsInactive(IS_INACTIVE_EDEFAULT);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE:
        setAttribute(ATTRIBUTE_EDEFAULT);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT:
        setComment(COMMENT_EDEFAULT);
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
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__IS_INACTIVE:
        return isInactive != IS_INACTIVE_EDEFAULT;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE:
        return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__COMMENT:
        return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
    result.append(", isInactive: ");
    result.append(isInactive);
    result.append(", type: ");
    result.append(type);
    result.append(", attribute: ");
    result.append(attribute);
    result.append(", comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //FunctionModulePOJOParameterMappingImpl
