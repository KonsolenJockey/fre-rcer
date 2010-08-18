/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rfcgen.mapping.impl;

import net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping;
import net.sf.rcer.rfcgen.mapping.MappingPackage;
import net.sf.rcer.rfcgen.mapping.StructurePOJOMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl#isInactive <em>Inactive</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl#getStructure <em>Structure</em>}</li>
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
   * The default value of the '{@link #isInactive() <em>Inactive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInactive()
   * @generated
   * @ordered
   */
  protected static final boolean INACTIVE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInactive() <em>Inactive</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInactive()
   * @generated
   * @ordered
   */
  protected boolean inactive = INACTIVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getStructure() <em>Structure</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructure()
   * @generated
   * @ordered
   */
  protected StructurePOJOMapping structure;

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
  public boolean isInactive()
  {
    return inactive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInactive(boolean newInactive)
  {
    boolean oldInactive = inactive;
    inactive = newInactive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__INACTIVE, oldInactive, inactive));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructurePOJOMapping getStructure()
  {
    if (structure != null && structure.eIsProxy())
    {
      InternalEObject oldStructure = (InternalEObject)structure;
      structure = (StructurePOJOMapping)eResolveProxy(oldStructure);
      if (structure != oldStructure)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE, oldStructure, structure));
      }
    }
    return structure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructurePOJOMapping basicGetStructure()
  {
    return structure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructure(StructurePOJOMapping newStructure)
  {
    StructurePOJOMapping oldStructure = structure;
    structure = newStructure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE, oldStructure, structure));
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
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__INACTIVE:
        return isInactive();
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE:
        if (resolve) return getStructure();
        return basicGetStructure();
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
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__INACTIVE:
        setInactive((Boolean)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE:
        setStructure((StructurePOJOMapping)newValue);
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
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__INACTIVE:
        setInactive(INACTIVE_EDEFAULT);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE:
        setStructure((StructurePOJOMapping)null);
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
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__INACTIVE:
        return inactive != INACTIVE_EDEFAULT;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE:
        return structure != null;
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
    result.append(", inactive: ");
    result.append(inactive);
    result.append(", attribute: ");
    result.append(attribute);
    result.append(", comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //FunctionModulePOJOParameterMappingImpl
