/**
 * Copyright (c) 2008, 2010 The RCER Development Team.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html. If redistributing this code,
 * this entire header must remain intact.
 * 
 * $Id$
 *
 * $Id$
 */
package net.sf.rcer.rom.abapobj.impl;

import java.util.Collection;

import net.sf.rcer.conn.locales.Locale;
import net.sf.rcer.rom.ROMPackage;
import net.sf.rcer.rom.RepositoryObjectCollection;
import net.sf.rcer.rom.RepositoryObjectType;
import net.sf.rcer.rom.abapobj.ABAPClass;
import net.sf.rcer.rom.abapobj.ABAPObjectsPackage;
import net.sf.rcer.rom.abapobj.ClassAttribute;
import net.sf.rcer.rom.abapobj.ClassCreationScope;
import net.sf.rcer.rom.abapobj.ClassEvent;
import net.sf.rcer.rom.abapobj.ClassMethod;
import net.sf.rcer.rom.abapobj.ForwardDeclarations;
import net.sf.rcer.rom.abapobj.InterfaceEvent;
import net.sf.rcer.rom.abapobj.InterfaceImplementation;
import net.sf.rcer.rom.impl.LocalizedStringImpl;
import net.sf.rcer.rom.impl.RepositoryObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ABAP Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#getTypePools <em>Type Pools</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#getInterfaceForwardDefinitions <em>Interface Forward Definitions</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#getClassForwardDefinitions <em>Class Forward Definitions</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#getSuperClassName <em>Super Class Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#getCreationScope <em>Creation Scope</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#isFixedPointArithmetics <em>Fixed Point Arithmetics</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#isUnicodeChecked <em>Unicode Checked</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#getFriendClassNames <em>Friend Class Names</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ABAPClassImpl extends RepositoryObjectImpl implements ABAPClass {
	/**
	 * The cached value of the '{@link #getTypePools() <em>Type Pools</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypePools()
	 * @generated
	 * @ordered
	 */
	protected EList<String> typePools;

	/**
	 * The cached value of the '{@link #getInterfaceForwardDefinitions() <em>Interface Forward Definitions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceForwardDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> interfaceForwardDefinitions;

	/**
	 * The cached value of the '{@link #getClassForwardDefinitions() <em>Class Forward Definitions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassForwardDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classForwardDefinitions;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EMap<Locale, String> description;

	/**
	 * The cached value of the '{@link #getCollection() <em>Collection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollection()
	 * @generated
	 * @ordered
	 */
	protected RepositoryObjectCollection collection;

	/**
	 * The default value of the '{@link #getSuperClassName() <em>Super Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPER_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuperClassName() <em>Super Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClassName()
	 * @generated
	 * @ordered
	 */
	protected String superClassName = SUPER_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationScope() <em>Creation Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationScope()
	 * @generated
	 * @ordered
	 */
	protected static final ClassCreationScope CREATION_SCOPE_EDEFAULT = ClassCreationScope.PRIVATE;

	/**
	 * The cached value of the '{@link #getCreationScope() <em>Creation Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationScope()
	 * @generated
	 * @ordered
	 */
	protected ClassCreationScope creationScope = CREATION_SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinal()
	 * @generated
	 * @ordered
	 */
	protected boolean final_ = FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isFixedPointArithmetics() <em>Fixed Point Arithmetics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixedPointArithmetics()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIXED_POINT_ARITHMETICS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isFixedPointArithmetics() <em>Fixed Point Arithmetics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixedPointArithmetics()
	 * @generated
	 * @ordered
	 */
	protected boolean fixedPointArithmetics = FIXED_POINT_ARITHMETICS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnicodeChecked() <em>Unicode Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnicodeChecked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNICODE_CHECKED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUnicodeChecked() <em>Unicode Checked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnicodeChecked()
	 * @generated
	 * @ordered
	 */
	protected boolean unicodeChecked = UNICODE_CHECKED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceImplementation> interfaces;

	/**
	 * The cached value of the '{@link #getFriendClassNames() <em>Friend Class Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriendClassNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> friendClassNames;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassAttribute> attributes;

	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassMethod> methods;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassEvent> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ABAPClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ABAPObjectsPackage.Literals.ABAP_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Locale, String> getDescription() {
		if (description == null) {
			description = new EcoreEMap<Locale,String>(ROMPackage.Literals.LOCALIZED_STRING, LocalizedStringImpl.class, this, ABAPObjectsPackage.ABAP_CLASS__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryObjectCollection getCollection() {
		if (collection != null && collection.eIsProxy()) {
			InternalEObject oldCollection = (InternalEObject)collection;
			collection = (RepositoryObjectCollection)eResolveProxy(oldCollection);
			if (collection != oldCollection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ABAPObjectsPackage.ABAP_CLASS__COLLECTION, oldCollection, collection));
			}
		}
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryObjectCollection basicGetCollection() {
		return collection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSuperClassName() {
		return superClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClassName(String newSuperClassName) {
		String oldSuperClassName = superClassName;
		superClassName = newSuperClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.ABAP_CLASS__SUPER_CLASS_NAME, oldSuperClassName, superClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassCreationScope getCreationScope() {
		return creationScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationScope(ClassCreationScope newCreationScope) {
		ClassCreationScope oldCreationScope = creationScope;
		creationScope = newCreationScope == null ? CREATION_SCOPE_EDEFAULT : newCreationScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.ABAP_CLASS__CREATION_SCOPE, oldCreationScope, creationScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(boolean newFinal) {
		boolean oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.ABAP_CLASS__FINAL, oldFinal, final_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFixedPointArithmetics() {
		return fixedPointArithmetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedPointArithmetics(boolean newFixedPointArithmetics) {
		boolean oldFixedPointArithmetics = fixedPointArithmetics;
		fixedPointArithmetics = newFixedPointArithmetics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.ABAP_CLASS__FIXED_POINT_ARITHMETICS, oldFixedPointArithmetics, fixedPointArithmetics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnicodeChecked() {
		return unicodeChecked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnicodeChecked(boolean newUnicodeChecked) {
		boolean oldUnicodeChecked = unicodeChecked;
		unicodeChecked = newUnicodeChecked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.ABAP_CLASS__UNICODE_CHECKED, oldUnicodeChecked, unicodeChecked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceImplementation> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<InterfaceImplementation>(InterfaceImplementation.class, this, ABAPObjectsPackage.ABAP_CLASS__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFriendClassNames() {
		if (friendClassNames == null) {
			friendClassNames = new EDataTypeEList<String>(String.class, this, ABAPObjectsPackage.ABAP_CLASS__FRIEND_CLASS_NAMES);
		}
		return friendClassNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<ClassAttribute>(ClassAttribute.class, this, ABAPObjectsPackage.ABAP_CLASS__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectResolvingEList<ClassMethod>(ClassMethod.class, this, ABAPObjectsPackage.ABAP_CLASS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<ClassEvent>(ClassEvent.class, this, ABAPObjectsPackage.ABAP_CLASS__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTypePools() {
		if (typePools == null) {
			typePools = new EDataTypeUniqueEList<String>(String.class, this, ABAPObjectsPackage.ABAP_CLASS__TYPE_POOLS);
		}
		return typePools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInterfaceForwardDefinitions() {
		if (interfaceForwardDefinitions == null) {
			interfaceForwardDefinitions = new EDataTypeUniqueEList<String>(String.class, this, ABAPObjectsPackage.ABAP_CLASS__INTERFACE_FORWARD_DEFINITIONS);
		}
		return interfaceForwardDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClassForwardDefinitions() {
		if (classForwardDefinitions == null) {
			classForwardDefinitions = new EDataTypeUniqueEList<String>(String.class, this, ABAPObjectsPackage.ABAP_CLASS__CLASS_FORWARD_DEFINITIONS);
		}
		return classForwardDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ABAPObjectsPackage.ABAP_CLASS__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case ABAPObjectsPackage.ABAP_CLASS__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
			case ABAPObjectsPackage.ABAP_CLASS__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case ABAPObjectsPackage.ABAP_CLASS__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ABAPObjectsPackage.ABAP_CLASS__TYPE_POOLS:
				return getTypePools();
			case ABAPObjectsPackage.ABAP_CLASS__INTERFACE_FORWARD_DEFINITIONS:
				return getInterfaceForwardDefinitions();
			case ABAPObjectsPackage.ABAP_CLASS__CLASS_FORWARD_DEFINITIONS:
				return getClassForwardDefinitions();
			case ABAPObjectsPackage.ABAP_CLASS__DESCRIPTION:
				if (coreType) return getDescription();
				else return getDescription().map();
			case ABAPObjectsPackage.ABAP_CLASS__COLLECTION:
				if (resolve) return getCollection();
				return basicGetCollection();
			case ABAPObjectsPackage.ABAP_CLASS__SUPER_CLASS_NAME:
				return getSuperClassName();
			case ABAPObjectsPackage.ABAP_CLASS__CREATION_SCOPE:
				return getCreationScope();
			case ABAPObjectsPackage.ABAP_CLASS__FINAL:
				return isFinal() ? Boolean.TRUE : Boolean.FALSE;
			case ABAPObjectsPackage.ABAP_CLASS__FIXED_POINT_ARITHMETICS:
				return isFixedPointArithmetics() ? Boolean.TRUE : Boolean.FALSE;
			case ABAPObjectsPackage.ABAP_CLASS__UNICODE_CHECKED:
				return isUnicodeChecked() ? Boolean.TRUE : Boolean.FALSE;
			case ABAPObjectsPackage.ABAP_CLASS__INTERFACES:
				return getInterfaces();
			case ABAPObjectsPackage.ABAP_CLASS__FRIEND_CLASS_NAMES:
				return getFriendClassNames();
			case ABAPObjectsPackage.ABAP_CLASS__ATTRIBUTES:
				return getAttributes();
			case ABAPObjectsPackage.ABAP_CLASS__METHODS:
				return getMethods();
			case ABAPObjectsPackage.ABAP_CLASS__EVENTS:
				return getEvents();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ABAPObjectsPackage.ABAP_CLASS__TYPE_POOLS:
				getTypePools().clear();
				getTypePools().addAll((Collection<? extends String>)newValue);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__INTERFACE_FORWARD_DEFINITIONS:
				getInterfaceForwardDefinitions().clear();
				getInterfaceForwardDefinitions().addAll((Collection<? extends String>)newValue);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__CLASS_FORWARD_DEFINITIONS:
				getClassForwardDefinitions().clear();
				getClassForwardDefinitions().addAll((Collection<? extends String>)newValue);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__SUPER_CLASS_NAME:
				setSuperClassName((String)newValue);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__CREATION_SCOPE:
				setCreationScope((ClassCreationScope)newValue);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__FINAL:
				setFinal(((Boolean)newValue).booleanValue());
				return;
			case ABAPObjectsPackage.ABAP_CLASS__FIXED_POINT_ARITHMETICS:
				setFixedPointArithmetics(((Boolean)newValue).booleanValue());
				return;
			case ABAPObjectsPackage.ABAP_CLASS__UNICODE_CHECKED:
				setUnicodeChecked(((Boolean)newValue).booleanValue());
				return;
			case ABAPObjectsPackage.ABAP_CLASS__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends InterfaceImplementation>)newValue);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__FRIEND_CLASS_NAMES:
				getFriendClassNames().clear();
				getFriendClassNames().addAll((Collection<? extends String>)newValue);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends ClassAttribute>)newValue);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends ClassMethod>)newValue);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends ClassEvent>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ABAPObjectsPackage.ABAP_CLASS__TYPE_POOLS:
				getTypePools().clear();
				return;
			case ABAPObjectsPackage.ABAP_CLASS__INTERFACE_FORWARD_DEFINITIONS:
				getInterfaceForwardDefinitions().clear();
				return;
			case ABAPObjectsPackage.ABAP_CLASS__CLASS_FORWARD_DEFINITIONS:
				getClassForwardDefinitions().clear();
				return;
			case ABAPObjectsPackage.ABAP_CLASS__SUPER_CLASS_NAME:
				setSuperClassName(SUPER_CLASS_NAME_EDEFAULT);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__CREATION_SCOPE:
				setCreationScope(CREATION_SCOPE_EDEFAULT);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__FINAL:
				setFinal(FINAL_EDEFAULT);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__FIXED_POINT_ARITHMETICS:
				setFixedPointArithmetics(FIXED_POINT_ARITHMETICS_EDEFAULT);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__UNICODE_CHECKED:
				setUnicodeChecked(UNICODE_CHECKED_EDEFAULT);
				return;
			case ABAPObjectsPackage.ABAP_CLASS__INTERFACES:
				getInterfaces().clear();
				return;
			case ABAPObjectsPackage.ABAP_CLASS__FRIEND_CLASS_NAMES:
				getFriendClassNames().clear();
				return;
			case ABAPObjectsPackage.ABAP_CLASS__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ABAPObjectsPackage.ABAP_CLASS__METHODS:
				getMethods().clear();
				return;
			case ABAPObjectsPackage.ABAP_CLASS__EVENTS:
				getEvents().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ABAPObjectsPackage.ABAP_CLASS__TYPE_POOLS:
				return typePools != null && !typePools.isEmpty();
			case ABAPObjectsPackage.ABAP_CLASS__INTERFACE_FORWARD_DEFINITIONS:
				return interfaceForwardDefinitions != null && !interfaceForwardDefinitions.isEmpty();
			case ABAPObjectsPackage.ABAP_CLASS__CLASS_FORWARD_DEFINITIONS:
				return classForwardDefinitions != null && !classForwardDefinitions.isEmpty();
			case ABAPObjectsPackage.ABAP_CLASS__DESCRIPTION:
				return description != null && !description.isEmpty();
			case ABAPObjectsPackage.ABAP_CLASS__COLLECTION:
				return collection != null;
			case ABAPObjectsPackage.ABAP_CLASS__SUPER_CLASS_NAME:
				return SUPER_CLASS_NAME_EDEFAULT == null ? superClassName != null : !SUPER_CLASS_NAME_EDEFAULT.equals(superClassName);
			case ABAPObjectsPackage.ABAP_CLASS__CREATION_SCOPE:
				return creationScope != CREATION_SCOPE_EDEFAULT;
			case ABAPObjectsPackage.ABAP_CLASS__FINAL:
				return final_ != FINAL_EDEFAULT;
			case ABAPObjectsPackage.ABAP_CLASS__FIXED_POINT_ARITHMETICS:
				return fixedPointArithmetics != FIXED_POINT_ARITHMETICS_EDEFAULT;
			case ABAPObjectsPackage.ABAP_CLASS__UNICODE_CHECKED:
				return unicodeChecked != UNICODE_CHECKED_EDEFAULT;
			case ABAPObjectsPackage.ABAP_CLASS__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case ABAPObjectsPackage.ABAP_CLASS__FRIEND_CLASS_NAMES:
				return friendClassNames != null && !friendClassNames.isEmpty();
			case ABAPObjectsPackage.ABAP_CLASS__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ABAPObjectsPackage.ABAP_CLASS__METHODS:
				return methods != null && !methods.isEmpty();
			case ABAPObjectsPackage.ABAP_CLASS__EVENTS:
				return events != null && !events.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ForwardDeclarations.class) {
			switch (derivedFeatureID) {
				case ABAPObjectsPackage.ABAP_CLASS__TYPE_POOLS: return ABAPObjectsPackage.FORWARD_DECLARATIONS__TYPE_POOLS;
				case ABAPObjectsPackage.ABAP_CLASS__INTERFACE_FORWARD_DEFINITIONS: return ABAPObjectsPackage.FORWARD_DECLARATIONS__INTERFACE_FORWARD_DEFINITIONS;
				case ABAPObjectsPackage.ABAP_CLASS__CLASS_FORWARD_DEFINITIONS: return ABAPObjectsPackage.FORWARD_DECLARATIONS__CLASS_FORWARD_DEFINITIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ForwardDeclarations.class) {
			switch (baseFeatureID) {
				case ABAPObjectsPackage.FORWARD_DECLARATIONS__TYPE_POOLS: return ABAPObjectsPackage.ABAP_CLASS__TYPE_POOLS;
				case ABAPObjectsPackage.FORWARD_DECLARATIONS__INTERFACE_FORWARD_DEFINITIONS: return ABAPObjectsPackage.ABAP_CLASS__INTERFACE_FORWARD_DEFINITIONS;
				case ABAPObjectsPackage.FORWARD_DECLARATIONS__CLASS_FORWARD_DEFINITIONS: return ABAPObjectsPackage.ABAP_CLASS__CLASS_FORWARD_DEFINITIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (typePools: "); //$NON-NLS-1$
		result.append(typePools);
		result.append(", interfaceForwardDefinitions: "); //$NON-NLS-1$
		result.append(interfaceForwardDefinitions);
		result.append(", classForwardDefinitions: "); //$NON-NLS-1$
		result.append(classForwardDefinitions);
		result.append(", superClassName: "); //$NON-NLS-1$
		result.append(superClassName);
		result.append(", creationScope: "); //$NON-NLS-1$
		result.append(creationScope);
		result.append(", final: "); //$NON-NLS-1$
		result.append(final_);
		result.append(", fixedPointArithmetics: "); //$NON-NLS-1$
		result.append(fixedPointArithmetics);
		result.append(", unicodeChecked: "); //$NON-NLS-1$
		result.append(unicodeChecked);
		result.append(", friendClassNames: "); //$NON-NLS-1$
		result.append(friendClassNames);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see net.sf.rcer.rom.impl.RepositoryObjectImpl#getObjectType()
	 * @generated no
	 */
	@Override
	public RepositoryObjectType getObjectType() {
		return RepositoryObjectType.CLASS;
	}

	/**
	 * @see net.sf.rcer.rom.impl.RepositoryObjectImpl#getProgramID()
	 * @generated no
	 */
	@Override
	public String getProgramID() {
		return "R3TR";
	}

	/**
	 * @generated no
	 * @see net.sf.rcer.rom.impl.RepositoryObjectImpl#getObjectTypeID()
	 */
	@Override
	public String getObjectTypeID() {
		return "CLAS";
	}
	
} //ABAPClassImpl
