/**
 * Copyright (c) 2008 The RCER Development Team.
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

import net.sf.rcer.rom.abapobj.ABAPObjectsPackage;
import net.sf.rcer.rom.abapobj.InterfaceMethod;
import net.sf.rcer.rom.abapobj.MethodException;
import net.sf.rcer.rom.abapobj.MethodParameter;
import net.sf.rcer.rom.abapobj.MethodScope;

import net.sf.rcer.rom.impl.LocalizedStringImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceMethodImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceMethodImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceMethodImpl#isEventHandler <em>Event Handler</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceMethodImpl#getEventClass <em>Event Class</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceMethodImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceMethodImpl#isClassBasedExceptions <em>Class Based Exceptions</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link net.sf.rcer.rom.abapobj.impl.InterfaceMethodImpl#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceMethodImpl extends EObjectImpl implements InterfaceMethod {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected EMap<Locale, String> description;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final MethodScope SCOPE_EDEFAULT = MethodScope.INSTANCE;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected MethodScope scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEventHandler() <em>Event Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEventHandler()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EVENT_HANDLER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEventHandler() <em>Event Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEventHandler()
	 * @generated
	 * @ordered
	 */
	protected boolean eventHandler = EVENT_HANDLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventClass() <em>Event Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventClass()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventClass() <em>Event Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventClass()
	 * @generated
	 * @ordered
	 */
	protected String eventClass = EVENT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected String eventName = EVENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isClassBasedExceptions() <em>Class Based Exceptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassBasedExceptions()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLASS_BASED_EXCEPTIONS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClassBasedExceptions() <em>Class Based Exceptions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClassBasedExceptions()
	 * @generated
	 * @ordered
	 */
	protected boolean classBasedExceptions = CLASS_BASED_EXCEPTIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodParameter> parameters;

	/**
	 * The cached value of the '{@link #getExceptions() <em>Exceptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodException> exceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ABAPObjectsPackage.Literals.INTERFACE_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.INTERFACE_METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Locale, String> getDescription() {
		if (description == null) {
			description = new EcoreEMap<Locale,String>(ROMPackage.Literals.LOCALIZED_STRING, LocalizedStringImpl.class, this, ABAPObjectsPackage.INTERFACE_METHOD__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodScope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(MethodScope newScope) {
		MethodScope oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.INTERFACE_METHOD__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEventHandler() {
		return eventHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventHandler(boolean newEventHandler) {
		boolean oldEventHandler = eventHandler;
		eventHandler = newEventHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.INTERFACE_METHOD__EVENT_HANDLER, oldEventHandler, eventHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventClass() {
		return eventClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventClass(String newEventClass) {
		String oldEventClass = eventClass;
		eventClass = newEventClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.INTERFACE_METHOD__EVENT_CLASS, oldEventClass, eventClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventName(String newEventName) {
		String oldEventName = eventName;
		eventName = newEventName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.INTERFACE_METHOD__EVENT_NAME, oldEventName, eventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClassBasedExceptions() {
		return classBasedExceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassBasedExceptions(boolean newClassBasedExceptions) {
		boolean oldClassBasedExceptions = classBasedExceptions;
		classBasedExceptions = newClassBasedExceptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ABAPObjectsPackage.INTERFACE_METHOD__CLASS_BASED_EXCEPTIONS, oldClassBasedExceptions, classBasedExceptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<MethodParameter>(MethodParameter.class, this, ABAPObjectsPackage.INTERFACE_METHOD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodException> getExceptions() {
		if (exceptions == null) {
			exceptions = new EObjectResolvingEList<MethodException>(MethodException.class, this, ABAPObjectsPackage.INTERFACE_METHOD__EXCEPTIONS);
		}
		return exceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ABAPObjectsPackage.INTERFACE_METHOD__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
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
			case ABAPObjectsPackage.INTERFACE_METHOD__NAME:
				return getName();
			case ABAPObjectsPackage.INTERFACE_METHOD__DESCRIPTION:
				if (coreType) return getDescription();
				else return getDescription().map();
			case ABAPObjectsPackage.INTERFACE_METHOD__SCOPE:
				return getScope();
			case ABAPObjectsPackage.INTERFACE_METHOD__EVENT_HANDLER:
				return isEventHandler() ? Boolean.TRUE : Boolean.FALSE;
			case ABAPObjectsPackage.INTERFACE_METHOD__EVENT_CLASS:
				return getEventClass();
			case ABAPObjectsPackage.INTERFACE_METHOD__EVENT_NAME:
				return getEventName();
			case ABAPObjectsPackage.INTERFACE_METHOD__CLASS_BASED_EXCEPTIONS:
				return isClassBasedExceptions() ? Boolean.TRUE : Boolean.FALSE;
			case ABAPObjectsPackage.INTERFACE_METHOD__PARAMETERS:
				return getParameters();
			case ABAPObjectsPackage.INTERFACE_METHOD__EXCEPTIONS:
				return getExceptions();
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
			case ABAPObjectsPackage.INTERFACE_METHOD__NAME:
				setName((String)newValue);
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__SCOPE:
				setScope((MethodScope)newValue);
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__EVENT_HANDLER:
				setEventHandler(((Boolean)newValue).booleanValue());
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__EVENT_CLASS:
				setEventClass((String)newValue);
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__EVENT_NAME:
				setEventName((String)newValue);
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__CLASS_BASED_EXCEPTIONS:
				setClassBasedExceptions(((Boolean)newValue).booleanValue());
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends MethodParameter>)newValue);
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends MethodException>)newValue);
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
			case ABAPObjectsPackage.INTERFACE_METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__EVENT_HANDLER:
				setEventHandler(EVENT_HANDLER_EDEFAULT);
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__EVENT_CLASS:
				setEventClass(EVENT_CLASS_EDEFAULT);
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__EVENT_NAME:
				setEventName(EVENT_NAME_EDEFAULT);
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__CLASS_BASED_EXCEPTIONS:
				setClassBasedExceptions(CLASS_BASED_EXCEPTIONS_EDEFAULT);
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case ABAPObjectsPackage.INTERFACE_METHOD__EXCEPTIONS:
				getExceptions().clear();
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
			case ABAPObjectsPackage.INTERFACE_METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ABAPObjectsPackage.INTERFACE_METHOD__DESCRIPTION:
				return description != null && !description.isEmpty();
			case ABAPObjectsPackage.INTERFACE_METHOD__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case ABAPObjectsPackage.INTERFACE_METHOD__EVENT_HANDLER:
				return eventHandler != EVENT_HANDLER_EDEFAULT;
			case ABAPObjectsPackage.INTERFACE_METHOD__EVENT_CLASS:
				return EVENT_CLASS_EDEFAULT == null ? eventClass != null : !EVENT_CLASS_EDEFAULT.equals(eventClass);
			case ABAPObjectsPackage.INTERFACE_METHOD__EVENT_NAME:
				return EVENT_NAME_EDEFAULT == null ? eventName != null : !EVENT_NAME_EDEFAULT.equals(eventName);
			case ABAPObjectsPackage.INTERFACE_METHOD__CLASS_BASED_EXCEPTIONS:
				return classBasedExceptions != CLASS_BASED_EXCEPTIONS_EDEFAULT;
			case ABAPObjectsPackage.INTERFACE_METHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ABAPObjectsPackage.INTERFACE_METHOD__EXCEPTIONS:
				return exceptions != null && !exceptions.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", scope: "); //$NON-NLS-1$
		result.append(scope);
		result.append(", eventHandler: "); //$NON-NLS-1$
		result.append(eventHandler);
		result.append(", eventClass: "); //$NON-NLS-1$
		result.append(eventClass);
		result.append(", eventName: "); //$NON-NLS-1$
		result.append(eventName);
		result.append(", classBasedExceptions: "); //$NON-NLS-1$
		result.append(classBasedExceptions);
		result.append(')');
		return result.toString();
	}

} //InterfaceMethodImpl
