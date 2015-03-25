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
import net.sf.rcer.rom.abapobj.ABAPInterface;
import net.sf.rcer.rom.abapobj.ABAPObjectsPackage;
import net.sf.rcer.rom.abapobj.ForwardDeclarations;
import net.sf.rcer.rom.abapobj.InterfaceAttribute;
import net.sf.rcer.rom.abapobj.InterfaceEvent;
import net.sf.rcer.rom.abapobj.InterfaceMethod;
import net.sf.rcer.rom.impl.LocalizedStringImpl;
import net.sf.rcer.rom.impl.RepositoryObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ABAP Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl#getTypePools <em>Type Pools</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl#getInterfaceForwardDefinitions <em>Interface Forward Definitions</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl#getClassForwardDefinitions <em>Class Forward Definitions</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl#isExitInterface <em>Exit Interface</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl#isUnicodeChecked <em>Unicode Checked</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ABAPInterfaceImpl extends RepositoryObjectImpl implements ABAPInterface {
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
	 * The default value of the '{@link #isExitInterface() <em>Exit Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExitInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXIT_INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExitInterface() <em>Exit Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExitInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean exitInterface = EXIT_INTERFACE_EDEFAULT;

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
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceMethod> methods;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<String> interfaces;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceAttribute> attributes;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceEvent> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ABAPInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ABAPObjectsPackage.Literals.ABAP_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Locale, String> getDescription() {
		if (description == null) {
			description = new EcoreEMap<Locale,String>(ROMPackage.Literals.LOCALIZED_STRING, LocalizedStringImpl.class, this, ABAPObjectsPackage.ABAP_INTERFACE__DESCRIPTION);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ABAPObjectsPackage.ABAP_INTERFACE__COLLECTION, oldCollection, collection));
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
	public boolean isExitInterface() {
		return exitInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitInterface(boolean newExitInterface) {
		boolean oldExitInterface = exitInterface;
		exitInterface = newExitInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.ABAP_INTERFACE__EXIT_INTERFACE, oldExitInterface, exitInterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.ABAP_INTERFACE__UNICODE_CHECKED, oldUnicodeChecked, unicodeChecked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectResolvingEList<InterfaceMethod>(InterfaceMethod.class, this, ABAPObjectsPackage.ABAP_INTERFACE__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EDataTypeUniqueEList<String>(String.class, this, ABAPObjectsPackage.ABAP_INTERFACE__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<InterfaceAttribute>(InterfaceAttribute.class, this, ABAPObjectsPackage.ABAP_INTERFACE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceEvent> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<InterfaceEvent>(InterfaceEvent.class, this, ABAPObjectsPackage.ABAP_INTERFACE__EVENTS);
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
			typePools = new EDataTypeUniqueEList<String>(String.class, this, ABAPObjectsPackage.ABAP_INTERFACE__TYPE_POOLS);
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
			interfaceForwardDefinitions = new EDataTypeUniqueEList<String>(String.class, this, ABAPObjectsPackage.ABAP_INTERFACE__INTERFACE_FORWARD_DEFINITIONS);
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
			classForwardDefinitions = new EDataTypeUniqueEList<String>(String.class, this, ABAPObjectsPackage.ABAP_INTERFACE__CLASS_FORWARD_DEFINITIONS);
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
			case ABAPObjectsPackage.ABAP_INTERFACE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case ABAPObjectsPackage.ABAP_INTERFACE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case ABAPObjectsPackage.ABAP_INTERFACE__EVENTS:
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
			case ABAPObjectsPackage.ABAP_INTERFACE__TYPE_POOLS:
				return getTypePools();
			case ABAPObjectsPackage.ABAP_INTERFACE__INTERFACE_FORWARD_DEFINITIONS:
				return getInterfaceForwardDefinitions();
			case ABAPObjectsPackage.ABAP_INTERFACE__CLASS_FORWARD_DEFINITIONS:
				return getClassForwardDefinitions();
			case ABAPObjectsPackage.ABAP_INTERFACE__DESCRIPTION:
				if (coreType) return getDescription();
				else return getDescription().map();
			case ABAPObjectsPackage.ABAP_INTERFACE__COLLECTION:
				if (resolve) return getCollection();
				return basicGetCollection();
			case ABAPObjectsPackage.ABAP_INTERFACE__EXIT_INTERFACE:
				return isExitInterface();
			case ABAPObjectsPackage.ABAP_INTERFACE__UNICODE_CHECKED:
				return isUnicodeChecked();
			case ABAPObjectsPackage.ABAP_INTERFACE__METHODS:
				return getMethods();
			case ABAPObjectsPackage.ABAP_INTERFACE__INTERFACES:
				return getInterfaces();
			case ABAPObjectsPackage.ABAP_INTERFACE__ATTRIBUTES:
				return getAttributes();
			case ABAPObjectsPackage.ABAP_INTERFACE__EVENTS:
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
			case ABAPObjectsPackage.ABAP_INTERFACE__TYPE_POOLS:
				getTypePools().clear();
				getTypePools().addAll((Collection<? extends String>)newValue);
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__INTERFACE_FORWARD_DEFINITIONS:
				getInterfaceForwardDefinitions().clear();
				getInterfaceForwardDefinitions().addAll((Collection<? extends String>)newValue);
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__CLASS_FORWARD_DEFINITIONS:
				getClassForwardDefinitions().clear();
				getClassForwardDefinitions().addAll((Collection<? extends String>)newValue);
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__EXIT_INTERFACE:
				setExitInterface((Boolean)newValue);
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__UNICODE_CHECKED:
				setUnicodeChecked((Boolean)newValue);
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends InterfaceMethod>)newValue);
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends String>)newValue);
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends InterfaceAttribute>)newValue);
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends InterfaceEvent>)newValue);
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
			case ABAPObjectsPackage.ABAP_INTERFACE__TYPE_POOLS:
				getTypePools().clear();
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__INTERFACE_FORWARD_DEFINITIONS:
				getInterfaceForwardDefinitions().clear();
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__CLASS_FORWARD_DEFINITIONS:
				getClassForwardDefinitions().clear();
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__EXIT_INTERFACE:
				setExitInterface(EXIT_INTERFACE_EDEFAULT);
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__UNICODE_CHECKED:
				setUnicodeChecked(UNICODE_CHECKED_EDEFAULT);
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__METHODS:
				getMethods().clear();
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__INTERFACES:
				getInterfaces().clear();
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case ABAPObjectsPackage.ABAP_INTERFACE__EVENTS:
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
			case ABAPObjectsPackage.ABAP_INTERFACE__TYPE_POOLS:
				return typePools != null && !typePools.isEmpty();
			case ABAPObjectsPackage.ABAP_INTERFACE__INTERFACE_FORWARD_DEFINITIONS:
				return interfaceForwardDefinitions != null && !interfaceForwardDefinitions.isEmpty();
			case ABAPObjectsPackage.ABAP_INTERFACE__CLASS_FORWARD_DEFINITIONS:
				return classForwardDefinitions != null && !classForwardDefinitions.isEmpty();
			case ABAPObjectsPackage.ABAP_INTERFACE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case ABAPObjectsPackage.ABAP_INTERFACE__COLLECTION:
				return collection != null;
			case ABAPObjectsPackage.ABAP_INTERFACE__EXIT_INTERFACE:
				return exitInterface != EXIT_INTERFACE_EDEFAULT;
			case ABAPObjectsPackage.ABAP_INTERFACE__UNICODE_CHECKED:
				return unicodeChecked != UNICODE_CHECKED_EDEFAULT;
			case ABAPObjectsPackage.ABAP_INTERFACE__METHODS:
				return methods != null && !methods.isEmpty();
			case ABAPObjectsPackage.ABAP_INTERFACE__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
			case ABAPObjectsPackage.ABAP_INTERFACE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case ABAPObjectsPackage.ABAP_INTERFACE__EVENTS:
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
				case ABAPObjectsPackage.ABAP_INTERFACE__TYPE_POOLS: return ABAPObjectsPackage.FORWARD_DECLARATIONS__TYPE_POOLS;
				case ABAPObjectsPackage.ABAP_INTERFACE__INTERFACE_FORWARD_DEFINITIONS: return ABAPObjectsPackage.FORWARD_DECLARATIONS__INTERFACE_FORWARD_DEFINITIONS;
				case ABAPObjectsPackage.ABAP_INTERFACE__CLASS_FORWARD_DEFINITIONS: return ABAPObjectsPackage.FORWARD_DECLARATIONS__CLASS_FORWARD_DEFINITIONS;
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
				case ABAPObjectsPackage.FORWARD_DECLARATIONS__TYPE_POOLS: return ABAPObjectsPackage.ABAP_INTERFACE__TYPE_POOLS;
				case ABAPObjectsPackage.FORWARD_DECLARATIONS__INTERFACE_FORWARD_DEFINITIONS: return ABAPObjectsPackage.ABAP_INTERFACE__INTERFACE_FORWARD_DEFINITIONS;
				case ABAPObjectsPackage.FORWARD_DECLARATIONS__CLASS_FORWARD_DEFINITIONS: return ABAPObjectsPackage.ABAP_INTERFACE__CLASS_FORWARD_DEFINITIONS;
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
		result.append(", exitInterface: "); //$NON-NLS-1$
		result.append(exitInterface);
		result.append(", unicodeChecked: "); //$NON-NLS-1$
		result.append(unicodeChecked);
		result.append(", interfaces: "); //$NON-NLS-1$
		result.append(interfaces);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see net.sf.rcer.rom.impl.RepositoryObjectImpl#getObjectType()
	 * @generated no
	 */
	@Override
	public RepositoryObjectType getObjectType() {
		return RepositoryObjectType.INTERFACE;
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
		return "INTF";
	}
	
} //ABAPInterfaceImpl
