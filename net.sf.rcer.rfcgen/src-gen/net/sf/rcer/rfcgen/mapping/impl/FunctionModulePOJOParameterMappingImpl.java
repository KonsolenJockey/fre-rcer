/**
 */
package net.sf.rcer.rfcgen.mapping.impl;

import net.sf.rcer.rfcgen.mapping.FunctionModulePOJOParameterMapping;
import net.sf.rcer.rfcgen.mapping.Import;
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
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl#getStructureMapping <em>Structure Mapping</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl#isExternal <em>External</em>}</li>
 *   <li>{@link net.sf.rcer.rfcgen.mapping.impl.FunctionModulePOJOParameterMappingImpl#getExternalClass <em>External Class</em>}</li>
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
   * The cached value of the '{@link #getStructureMapping() <em>Structure Mapping</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStructureMapping()
   * @generated
   * @ordered
   */
  protected StructurePOJOMapping structureMapping;

  /**
   * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExternal()
   * @generated
   * @ordered
   */
  protected static final boolean EXTERNAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExternal()
   * @generated
   * @ordered
   */
  protected boolean external = EXTERNAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getExternalClass() <em>External Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExternalClass()
   * @generated
   * @ordered
   */
  protected Import externalClass;

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
  public StructurePOJOMapping getStructureMapping()
  {
    if (structureMapping != null && structureMapping.eIsProxy())
    {
      InternalEObject oldStructureMapping = (InternalEObject)structureMapping;
      structureMapping = (StructurePOJOMapping)eResolveProxy(oldStructureMapping);
      if (structureMapping != oldStructureMapping)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE_MAPPING, oldStructureMapping, structureMapping));
      }
    }
    return structureMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructurePOJOMapping basicGetStructureMapping()
  {
    return structureMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStructureMapping(StructurePOJOMapping newStructureMapping)
  {
    StructurePOJOMapping oldStructureMapping = structureMapping;
    structureMapping = newStructureMapping;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE_MAPPING, oldStructureMapping, structureMapping));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isExternal()
  {
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternal(boolean newExternal)
  {
    boolean oldExternal = external;
    external = newExternal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL, oldExternal, external));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import getExternalClass()
  {
    if (externalClass != null && externalClass.eIsProxy())
    {
      InternalEObject oldExternalClass = (InternalEObject)externalClass;
      externalClass = (Import)eResolveProxy(oldExternalClass);
      if (externalClass != oldExternalClass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL_CLASS, oldExternalClass, externalClass));
      }
    }
    return externalClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import basicGetExternalClass()
  {
    return externalClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExternalClass(Import newExternalClass)
  {
    Import oldExternalClass = externalClass;
    externalClass = newExternalClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL_CLASS, oldExternalClass, externalClass));
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
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE:
        return getAttribute();
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE_MAPPING:
        if (resolve) return getStructureMapping();
        return basicGetStructureMapping();
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL:
        return isExternal();
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL_CLASS:
        if (resolve) return getExternalClass();
        return basicGetExternalClass();
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
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE:
        setAttribute((String)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE_MAPPING:
        setStructureMapping((StructurePOJOMapping)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL:
        setExternal((Boolean)newValue);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL_CLASS:
        setExternalClass((Import)newValue);
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
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE:
        setAttribute(ATTRIBUTE_EDEFAULT);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE_MAPPING:
        setStructureMapping((StructurePOJOMapping)null);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL:
        setExternal(EXTERNAL_EDEFAULT);
        return;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL_CLASS:
        setExternalClass((Import)null);
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
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__ATTRIBUTE:
        return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__STRUCTURE_MAPPING:
        return structureMapping != null;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL:
        return external != EXTERNAL_EDEFAULT;
      case MappingPackage.FUNCTION_MODULE_POJO_PARAMETER_MAPPING__EXTERNAL_CLASS:
        return externalClass != null;
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
    result.append(", external: ");
    result.append(external);
    result.append(", comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //FunctionModulePOJOParameterMappingImpl
