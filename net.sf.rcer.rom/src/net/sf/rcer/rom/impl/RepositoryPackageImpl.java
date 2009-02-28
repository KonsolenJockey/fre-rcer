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
package net.sf.rcer.rom.impl;

import java.text.MessageFormat;
import java.util.Collection;

import net.sf.rcer.conn.locales.Locale;
import net.sf.rcer.conn.locales.LocaleRegistry;
import net.sf.rcer.conn.tools.ITableContents;
import net.sf.rcer.conn.tools.ITableLine;
import net.sf.rcer.conn.tools.TableReader;
import net.sf.rcer.conn.tools.TableReaderBuffer;
import net.sf.rcer.rom.IRepositoryObjectContainer;
import net.sf.rcer.rom.PackagePermittedObjectTypes;
import net.sf.rcer.rom.PackageType;
import net.sf.rcer.rom.ROMFactory;
import net.sf.rcer.rom.ROMPackage;
import net.sf.rcer.rom.RepositoryObject;
import net.sf.rcer.rom.RepositoryObjectType;
import net.sf.rcer.rom.RepositoryPackage;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#isChangeRecodingEnabled <em>Change Recoding Enabled</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getResponsibleUser <em>Responsible User</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getTransportLayer <em>Transport Layer</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getInterfacePrefix <em>Interface Prefix</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getPermittedObjectTypes <em>Permitted Object Types</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#isObjectCreationRestricted <em>Object Creation Restricted</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#isCheckedAsServer <em>Checked As Server</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#isCheckedAsClient <em>Checked As Client</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryPackageImpl extends RepositoryObjectImpl implements RepositoryPackage {
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryObject> objects;

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
	 * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryPackage> subPackages;

	/**
	 * The default value of the '{@link #isChangeRecodingEnabled() <em>Change Recoding Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeRecodingEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGE_RECODING_ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isChangeRecodingEnabled() <em>Change Recoding Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeRecodingEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean changeRecodingEnabled = CHANGE_RECODING_ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponsibleUser() <em>Responsible User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleUser()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSIBLE_USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponsibleUser() <em>Responsible User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleUser()
	 * @generated
	 * @ordered
	 */
	protected String responsibleUser = RESPONSIBLE_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransportLayer() <em>Transport Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportLayer()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSPORT_LAYER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransportLayer() <em>Transport Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportLayer()
	 * @generated
	 * @ordered
	 */
	protected String transportLayer = TRANSPORT_LAYER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfacePrefix() <em>Interface Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacePrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfacePrefix() <em>Interface Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacePrefix()
	 * @generated
	 * @ordered
	 */
	protected String interfacePrefix = INTERFACE_PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermittedObjectTypes() <em>Permitted Object Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedObjectTypes()
	 * @generated
	 * @ordered
	 */
	protected static final PackagePermittedObjectTypes PERMITTED_OBJECT_TYPES_EDEFAULT = PackagePermittedObjectTypes.ALL;

	/**
	 * The cached value of the '{@link #getPermittedObjectTypes() <em>Permitted Object Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedObjectTypes()
	 * @generated
	 * @ordered
	 */
	protected PackagePermittedObjectTypes permittedObjectTypes = PERMITTED_OBJECT_TYPES_EDEFAULT;

	/**
	 * The default value of the '{@link #isObjectCreationRestricted() <em>Object Creation Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObjectCreationRestricted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBJECT_CREATION_RESTRICTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObjectCreationRestricted() <em>Object Creation Restricted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObjectCreationRestricted()
	 * @generated
	 * @ordered
	 */
	protected boolean objectCreationRestricted = OBJECT_CREATION_RESTRICTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PackageType TYPE_EDEFAULT = PackageType.STANDARD;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PackageType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckedAsServer() <em>Checked As Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedAsServer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_AS_SERVER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckedAsServer() <em>Checked As Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedAsServer()
	 * @generated
	 * @ordered
	 */
	protected boolean checkedAsServer = CHECKED_AS_SERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckedAsClient() <em>Checked As Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedAsClient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_AS_CLIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckedAsClient() <em>Checked As Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckedAsClient()
	 * @generated
	 * @ordered
	 */
	protected boolean checkedAsClient = CHECKED_AS_CLIENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ROMPackage.Literals.REPOSITORY_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepositoryObject> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentWithInverseEList<RepositoryObject>(RepositoryObject.class, this, ROMPackage.REPOSITORY_PACKAGE__OBJECTS, ROMPackage.REPOSITORY_OBJECT__CONTAINER);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Locale, String> getDescription() {
		if (description == null) {
			description = new EcoreEMap<Locale,String>(ROMPackage.Literals.LOCALIZED_STRING, LocalizedStringImpl.class, this, ROMPackage.REPOSITORY_PACKAGE__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isChangeRecodingEnabled() {
		return changeRecodingEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeRecodingEnabled(boolean newChangeRecodingEnabled) {
		boolean oldChangeRecodingEnabled = changeRecodingEnabled;
		changeRecodingEnabled = newChangeRecodingEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_PACKAGE__CHANGE_RECODING_ENABLED, oldChangeRecodingEnabled, changeRecodingEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponsibleUser() {
		return responsibleUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsibleUser(String newResponsibleUser) {
		String oldResponsibleUser = responsibleUser;
		responsibleUser = newResponsibleUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_PACKAGE__RESPONSIBLE_USER, oldResponsibleUser, responsibleUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTransportLayer() {
		return transportLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportLayer(String newTransportLayer) {
		String oldTransportLayer = transportLayer;
		transportLayer = newTransportLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_PACKAGE__TRANSPORT_LAYER, oldTransportLayer, transportLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_PACKAGE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfacePrefix() {
		return interfacePrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfacePrefix(String newInterfacePrefix) {
		String oldInterfacePrefix = interfacePrefix;
		interfacePrefix = newInterfacePrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_PACKAGE__INTERFACE_PREFIX, oldInterfacePrefix, interfacePrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagePermittedObjectTypes getPermittedObjectTypes() {
		return permittedObjectTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermittedObjectTypes(PackagePermittedObjectTypes newPermittedObjectTypes) {
		PackagePermittedObjectTypes oldPermittedObjectTypes = permittedObjectTypes;
		permittedObjectTypes = newPermittedObjectTypes == null ? PERMITTED_OBJECT_TYPES_EDEFAULT : newPermittedObjectTypes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_PACKAGE__PERMITTED_OBJECT_TYPES, oldPermittedObjectTypes, permittedObjectTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObjectCreationRestricted() {
		return objectCreationRestricted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectCreationRestricted(boolean newObjectCreationRestricted) {
		boolean oldObjectCreationRestricted = objectCreationRestricted;
		objectCreationRestricted = newObjectCreationRestricted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_PACKAGE__OBJECT_CREATION_RESTRICTED, oldObjectCreationRestricted, objectCreationRestricted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PackageType newType) {
		PackageType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_PACKAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedAsServer() {
		return checkedAsServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckedAsServer(boolean newCheckedAsServer) {
		boolean oldCheckedAsServer = checkedAsServer;
		checkedAsServer = newCheckedAsServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_PACKAGE__CHECKED_AS_SERVER, oldCheckedAsServer, checkedAsServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedAsClient() {
		return checkedAsClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckedAsClient(boolean newCheckedAsClient) {
		boolean oldCheckedAsClient = checkedAsClient;
		checkedAsClient = newCheckedAsClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_PACKAGE__CHECKED_AS_CLIENT, oldCheckedAsClient, checkedAsClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjects()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RepositoryPackage> getSubPackages() {
		if (subPackages == null) {
			subPackages = new EObjectResolvingEList<RepositoryPackage>(RepositoryPackage.class, this, ROMPackage.REPOSITORY_PACKAGE__SUB_PACKAGES);
		}
		return subPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
			case ROMPackage.REPOSITORY_PACKAGE__DESCRIPTION:
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
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS:
				return getObjects();
			case ROMPackage.REPOSITORY_PACKAGE__DESCRIPTION:
				if (coreType) return getDescription();
				else return getDescription().map();
			case ROMPackage.REPOSITORY_PACKAGE__SUB_PACKAGES:
				return getSubPackages();
			case ROMPackage.REPOSITORY_PACKAGE__CHANGE_RECODING_ENABLED:
				return isChangeRecodingEnabled() ? Boolean.TRUE : Boolean.FALSE;
			case ROMPackage.REPOSITORY_PACKAGE__RESPONSIBLE_USER:
				return getResponsibleUser();
			case ROMPackage.REPOSITORY_PACKAGE__TRANSPORT_LAYER:
				return getTransportLayer();
			case ROMPackage.REPOSITORY_PACKAGE__NAMESPACE:
				return getNamespace();
			case ROMPackage.REPOSITORY_PACKAGE__INTERFACE_PREFIX:
				return getInterfacePrefix();
			case ROMPackage.REPOSITORY_PACKAGE__PERMITTED_OBJECT_TYPES:
				return getPermittedObjectTypes();
			case ROMPackage.REPOSITORY_PACKAGE__OBJECT_CREATION_RESTRICTED:
				return isObjectCreationRestricted() ? Boolean.TRUE : Boolean.FALSE;
			case ROMPackage.REPOSITORY_PACKAGE__TYPE:
				return getType();
			case ROMPackage.REPOSITORY_PACKAGE__CHECKED_AS_SERVER:
				return isCheckedAsServer() ? Boolean.TRUE : Boolean.FALSE;
			case ROMPackage.REPOSITORY_PACKAGE__CHECKED_AS_CLIENT:
				return isCheckedAsClient() ? Boolean.TRUE : Boolean.FALSE;
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
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends RepositoryObject>)newValue);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				getSubPackages().addAll((Collection<? extends RepositoryPackage>)newValue);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__CHANGE_RECODING_ENABLED:
				setChangeRecodingEnabled(((Boolean)newValue).booleanValue());
				return;
			case ROMPackage.REPOSITORY_PACKAGE__RESPONSIBLE_USER:
				setResponsibleUser((String)newValue);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__TRANSPORT_LAYER:
				setTransportLayer((String)newValue);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__INTERFACE_PREFIX:
				setInterfacePrefix((String)newValue);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__PERMITTED_OBJECT_TYPES:
				setPermittedObjectTypes((PackagePermittedObjectTypes)newValue);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__OBJECT_CREATION_RESTRICTED:
				setObjectCreationRestricted(((Boolean)newValue).booleanValue());
				return;
			case ROMPackage.REPOSITORY_PACKAGE__TYPE:
				setType((PackageType)newValue);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__CHECKED_AS_SERVER:
				setCheckedAsServer(((Boolean)newValue).booleanValue());
				return;
			case ROMPackage.REPOSITORY_PACKAGE__CHECKED_AS_CLIENT:
				setCheckedAsClient(((Boolean)newValue).booleanValue());
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
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS:
				getObjects().clear();
				return;
			case ROMPackage.REPOSITORY_PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				return;
			case ROMPackage.REPOSITORY_PACKAGE__CHANGE_RECODING_ENABLED:
				setChangeRecodingEnabled(CHANGE_RECODING_ENABLED_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__RESPONSIBLE_USER:
				setResponsibleUser(RESPONSIBLE_USER_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__TRANSPORT_LAYER:
				setTransportLayer(TRANSPORT_LAYER_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__INTERFACE_PREFIX:
				setInterfacePrefix(INTERFACE_PREFIX_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__PERMITTED_OBJECT_TYPES:
				setPermittedObjectTypes(PERMITTED_OBJECT_TYPES_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__OBJECT_CREATION_RESTRICTED:
				setObjectCreationRestricted(OBJECT_CREATION_RESTRICTED_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__CHECKED_AS_SERVER:
				setCheckedAsServer(CHECKED_AS_SERVER_EDEFAULT);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__CHECKED_AS_CLIENT:
				setCheckedAsClient(CHECKED_AS_CLIENT_EDEFAULT);
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
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS:
				return objects != null && !objects.isEmpty();
			case ROMPackage.REPOSITORY_PACKAGE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case ROMPackage.REPOSITORY_PACKAGE__SUB_PACKAGES:
				return subPackages != null && !subPackages.isEmpty();
			case ROMPackage.REPOSITORY_PACKAGE__CHANGE_RECODING_ENABLED:
				return changeRecodingEnabled != CHANGE_RECODING_ENABLED_EDEFAULT;
			case ROMPackage.REPOSITORY_PACKAGE__RESPONSIBLE_USER:
				return RESPONSIBLE_USER_EDEFAULT == null ? responsibleUser != null : !RESPONSIBLE_USER_EDEFAULT.equals(responsibleUser);
			case ROMPackage.REPOSITORY_PACKAGE__TRANSPORT_LAYER:
				return TRANSPORT_LAYER_EDEFAULT == null ? transportLayer != null : !TRANSPORT_LAYER_EDEFAULT.equals(transportLayer);
			case ROMPackage.REPOSITORY_PACKAGE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case ROMPackage.REPOSITORY_PACKAGE__INTERFACE_PREFIX:
				return INTERFACE_PREFIX_EDEFAULT == null ? interfacePrefix != null : !INTERFACE_PREFIX_EDEFAULT.equals(interfacePrefix);
			case ROMPackage.REPOSITORY_PACKAGE__PERMITTED_OBJECT_TYPES:
				return permittedObjectTypes != PERMITTED_OBJECT_TYPES_EDEFAULT;
			case ROMPackage.REPOSITORY_PACKAGE__OBJECT_CREATION_RESTRICTED:
				return objectCreationRestricted != OBJECT_CREATION_RESTRICTED_EDEFAULT;
			case ROMPackage.REPOSITORY_PACKAGE__TYPE:
				return type != TYPE_EDEFAULT;
			case ROMPackage.REPOSITORY_PACKAGE__CHECKED_AS_SERVER:
				return checkedAsServer != CHECKED_AS_SERVER_EDEFAULT;
			case ROMPackage.REPOSITORY_PACKAGE__CHECKED_AS_CLIENT:
				return checkedAsClient != CHECKED_AS_CLIENT_EDEFAULT;
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
		if (baseClass == IRepositoryObjectContainer.class) {
			switch (derivedFeatureID) {
				case ROMPackage.REPOSITORY_PACKAGE__OBJECTS: return ROMPackage.IREPOSITORY_OBJECT_CONTAINER__OBJECTS;
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
		if (baseClass == IRepositoryObjectContainer.class) {
			switch (baseFeatureID) {
				case ROMPackage.IREPOSITORY_OBJECT_CONTAINER__OBJECTS: return ROMPackage.REPOSITORY_PACKAGE__OBJECTS;
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
		result.append(" (changeRecodingEnabled: "); //$NON-NLS-1$
		result.append(changeRecodingEnabled);
		result.append(", responsibleUser: "); //$NON-NLS-1$
		result.append(responsibleUser);
		result.append(", transportLayer: "); //$NON-NLS-1$
		result.append(transportLayer);
		result.append(", namespace: "); //$NON-NLS-1$
		result.append(namespace);
		result.append(", interfacePrefix: "); //$NON-NLS-1$
		result.append(interfacePrefix);
		result.append(", permittedObjectTypes: "); //$NON-NLS-1$
		result.append(permittedObjectTypes);
		result.append(", objectCreationRestricted: "); //$NON-NLS-1$
		result.append(objectCreationRestricted);
		result.append(", type: "); //$NON-NLS-1$
		result.append(type);
		result.append(", checkedAsServer: "); //$NON-NLS-1$
		result.append(checkedAsServer);
		result.append(", checkedAsClient: "); //$NON-NLS-1$
		result.append(checkedAsClient);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see net.sf.rcer.rom.impl.RepositoryObjectImpl#getObjectType()
	 * @generated no
	 */
	@Override
	public RepositoryObjectType getObjectType() {
		return RepositoryObjectType.PACKAGE;
	}

	/**
	 * @see net.sf.rcer.rom.impl.RepositoryObjectImpl#loadObjectData(JCoDestination)
	 * @generated no
	 */
	@Override
	public IStatus loadObjectData(JCoDestination dest) {
		try {
			
			// --- read the package data from TDEVC --------------------------------------------------------------------
			
			TableReader reader = TableReaderBuffer.getInstance(dest).getTableReader("TDEVC");
			ITableContents result = reader.read(MessageFormat.format("DEVCLASS = ''{0}''", getName()));

			if (result.isEmpty()) {
				return new Status(IStatus.ERROR, ROMPackage.PLUGIN_ID, MessageFormat.format(
						"Unable to read the package data (TDEVC) for package {0}", getName()));
			}
			if (result.size() > 1) {
				return new Status(IStatus.ERROR, ROMPackage.PLUGIN_ID, MessageFormat.format(
						"Received multiple lines while reading the package data (TDEVC) for package {0}", getName()));				
			}

			try {
				final ITableLine line = result.getLine(0);
				// IMPORTANT - we overwrite the value from TADIR because that line (R3TR DEVC) always points to itself!
				setPackageName(line.getValue("PARENTCL"));
				
				setChangeRecodingEnabled(line.getBooleanValue("KORRFLAG"));
				setResponsibleUser(line.getValue("AS4USER"));
				setTransportLayer(line.getValue("PDEVCLASS"));
				setNamespace(line.getValue("NAMESPACE"));
				setInterfacePrefix(line.getValue("INTFPREFX"));
				setObjectCreationRestricted(line.getBooleanValue("RESTRICTED"));
				setCheckedAsServer(line.getBooleanValue("SRV_CHECK"));
				setCheckedAsClient(line.getBooleanValue("CLI_CHECK"));

				final String packtype = line.getValue("PACKTYPE");
				if (packtype.equals("")) {
					setPermittedObjectTypes(PackagePermittedObjectTypes.ALL);
				} else {
					switch(packtype.charAt(0)) {
					case ' ': 
						setPermittedObjectTypes(PackagePermittedObjectTypes.ALL);
						break;
					case 'D':
						setPermittedObjectTypes(PackagePermittedObjectTypes.DESCRIPTIVE_OBJECTS_ONLY);
						break;
					case 'F':
						setPermittedObjectTypes(PackagePermittedObjectTypes.FUNCTIONAL_OBJECTS_ONLY);
						break;
					case 'O':
						setPermittedObjectTypes(PackagePermittedObjectTypes.OTR_OBJECTS_ONLY);
						break;
					default: 
						return new Status(IStatus.ERROR, ROMPackage.PLUGIN_ID, MessageFormat.format(
								"Unexpected value {0} in field PACKTYPE of the package data (TDEVC) for package {1}",
								packtype, getName())) ;				
					}
				}

				final String mainpack = line.getValue("MAINPACK");
				if (mainpack.equals("")) {
					setType(PackageType.STANDARD);
				} else {
					switch(mainpack.charAt(0)) {
					case ' ': 
						setType(PackageType.STANDARD);
						break;
					case 'X':
						setType(PackageType.MAIN);
						break;
					case 'S':
						setType(PackageType.STRUCTURAL);
						break;
					default: 
						return new Status(IStatus.ERROR, ROMPackage.PLUGIN_ID, MessageFormat.format(
								"Unexpected value {0} in field MAINPACK of the package data (TDEVC) for package {1}", 
								packtype, getName())) ;				
					}
				}
			} catch (Exception e) {
				return new Status(IStatus.ERROR, ROMPackage.PLUGIN_ID, MessageFormat.format(
						"Error converting the package data from TDEVC for package {0}", getName()), e);				
			}		

			// --- read the package texts from TDEVCT ------------------------------------------------------------------

			reader = TableReaderBuffer.getInstance(dest).getTableReader("TDEVCT");
			result = reader.read(MessageFormat.format("DEVCLASS = ''{0}''", getName()));
			
			getDescription().clear();
			for (final ITableLine line: result) {
				try {
					final String id = line.getValue("SPRAS");
					if (id.length() > 0) {
						final Locale locale = LocaleRegistry.getInstance().getLocaleByID(id);
						getDescription().put(locale, line.getValue("CTEXT"));
					}
				} catch (Exception e) {
					// ignore this for now, it's only the description after all
				}
			}
			
			// --- read the contained subpackages ----------------------------------------------------------------------
			
			reader = TableReaderBuffer.getInstance(dest).getTableReader("TDEVC");
			result = reader.read(MessageFormat.format("PARENTCL = ''{0}''", getName()));
			
			for (final ITableLine line: result) {
				try {
					RepositoryPackage subPackage = ROMFactory.eINSTANCE.createRepositoryPackage();
					subPackage.setName(line.getValue("DEVCLASS"));
					subPackage.setPackageName(getName());
					getSubPackages().add(subPackage);
					getCollection().getObjects().add(subPackage);
				} catch (Exception e) {
					return new Status(IStatus.ERROR, ROMPackage.PLUGIN_ID, MessageFormat.format(
							"Error converting the package data from TDEVC for package {0}", getName()), e);				
				}		
			}

			// --- read the contained objects --------------------------------------------------------------------------
			
			reader = TableReaderBuffer.getInstance(dest).getTableReader("TADIR");
			result = reader.read(MessageFormat.format("DEVCLASS = ''{0}''", getName()));
			
			for (final ITableLine line: result) {
				try {
					final String pgmid   = line.getValue("PGMID");
					final String object  = line.getValue("OBJECT");
					final String objName = line.getValue("OBJ_NAME");
					
					if (pgmid.equalsIgnoreCase("R3TR")) {
						
						// TODO Read the actual package contents
						
					} else {
						// ignore these objects for now
					}
				} catch (Exception e) {
					return new Status(IStatus.ERROR, ROMPackage.PLUGIN_ID, MessageFormat.format(
							"Error reading the contents of package {0}", getName()), e);				
				}		
			}
			
			return Status.OK_STATUS;
		} catch (JCoException e) {
			return new Status(IStatus.ERROR, ROMPackage.PLUGIN_ID, MessageFormat.format(
					"Error loading the package data from TDEVC/TDEVCT for package {0}", getName()), e);				
		}
	}

} //RepositoryPackageImpl
