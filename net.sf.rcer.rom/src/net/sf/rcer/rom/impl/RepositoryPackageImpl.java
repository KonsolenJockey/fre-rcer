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

import java.util.Collection;
import java.util.List;
import java.util.Vector;

import net.sf.rcer.conn.locales.Locale;
import net.sf.rcer.rom.PackagePermittedObjectTypes;
import net.sf.rcer.rom.PackageType;
import net.sf.rcer.rom.ROMPackage;
import net.sf.rcer.rom.RepositoryObject;
import net.sf.rcer.rom.RepositoryObjectCollection;
import net.sf.rcer.rom.RepositoryObjectKey;
import net.sf.rcer.rom.RepositoryObjectType;
import net.sf.rcer.rom.RepositoryPackage;
import net.sf.rcer.rom.util.ObjectLoadingException;
import net.sf.rcer.rom.util.ObjectNotFoundException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getObjectKeys <em>Object Keys</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getSubPackageNames <em>Sub Package Names</em>}</li>
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
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link net.sf.rcer.rom.impl.RepositoryPackageImpl#isObjectsLoaded <em>Objects Loaded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryPackageImpl extends RepositoryObjectImpl implements RepositoryPackage {
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
	 * The cached value of the '{@link #getObjectKeys() <em>Object Keys</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryObjectKey> objectKeys;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<RepositoryObject> objects;

	/**
	 * The cached value of the '{@link #getSubPackageNames() <em>Sub Package Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackageNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> subPackageNames;

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
	 * The default value of the '{@link #isObjectsLoaded() <em>Objects Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObjectsLoaded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBJECTS_LOADED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObjectsLoaded() <em>Objects Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObjectsLoaded()
	 * @generated
	 * @ordered
	 */
	protected boolean objectsLoaded = OBJECTS_LOADED_EDEFAULT;

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
			objects = new EObjectResolvingEList<RepositoryObject>(RepositoryObject.class, this, ROMPackage.REPOSITORY_PACKAGE__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSubPackageNames() {
		if (subPackageNames == null) {
			subPackageNames = new EDataTypeUniqueEList<String>(String.class, this, ROMPackage.REPOSITORY_PACKAGE__SUB_PACKAGE_NAMES);
		}
		return subPackageNames;
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
	public EList<RepositoryObjectKey> getObjectKeys() {
		if (objectKeys == null) {
			objectKeys = new EObjectResolvingEList<RepositoryObjectKey>(RepositoryObjectKey.class, this, ROMPackage.REPOSITORY_PACKAGE__OBJECT_KEYS);
		}
		return objectKeys;
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
	@Override
	public RepositoryObjectCollection getCollection() {
		if (eContainerFeatureID != ROMPackage.REPOSITORY_PACKAGE__COLLECTION) return null;
		return (RepositoryObjectCollection)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isObjectsLoaded() {
		return objectsLoaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectsLoaded(boolean newObjectsLoaded) {
		boolean oldObjectsLoaded = objectsLoaded;
		objectsLoaded = newObjectsLoaded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ROMPackage.REPOSITORY_PACKAGE__OBJECTS_LOADED, oldObjectsLoaded, objectsLoaded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated and changed
	 */
	public void loadContents(boolean failOnError) throws ObjectNotFoundException, ObjectLoadingException {
		List<RepositoryObjectKey> keys = new Vector<RepositoryObjectKey>(getObjectKeys());
		for (RepositoryObjectKey key: keys) {
			try {
				RepositoryObject obj = getCollection().loadObject(key);
				getObjects().add(obj);
				getObjectKeys().remove(key);
			} catch (ObjectNotFoundException e) {
				if (failOnError) {
					throw e;
				}
			} catch (ObjectLoadingException e) {
				if (failOnError) {
					throw e;
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_PACKAGE__COLLECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, ROMPackage.REPOSITORY_PACKAGE__COLLECTION, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_PACKAGE__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case ROMPackage.REPOSITORY_PACKAGE__COLLECTION:
				return eBasicSetContainer(null, ROMPackage.REPOSITORY_PACKAGE__COLLECTION, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case ROMPackage.REPOSITORY_PACKAGE__COLLECTION:
				return eInternalContainer().eInverseRemove(this, ROMPackage.REPOSITORY_OBJECT_COLLECTION__PACKAGES, RepositoryObjectCollection.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ROMPackage.REPOSITORY_PACKAGE__DESCRIPTION:
				if (coreType) return getDescription();
				else return getDescription().map();
			case ROMPackage.REPOSITORY_PACKAGE__OBJECT_KEYS:
				return getObjectKeys();
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS:
				return getObjects();
			case ROMPackage.REPOSITORY_PACKAGE__SUB_PACKAGE_NAMES:
				return getSubPackageNames();
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
			case ROMPackage.REPOSITORY_PACKAGE__COLLECTION:
				return getCollection();
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS_LOADED:
				return isObjectsLoaded() ? Boolean.TRUE : Boolean.FALSE;
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
			case ROMPackage.REPOSITORY_PACKAGE__OBJECT_KEYS:
				getObjectKeys().clear();
				getObjectKeys().addAll((Collection<? extends RepositoryObjectKey>)newValue);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends RepositoryObject>)newValue);
				return;
			case ROMPackage.REPOSITORY_PACKAGE__SUB_PACKAGE_NAMES:
				getSubPackageNames().clear();
				getSubPackageNames().addAll((Collection<? extends String>)newValue);
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
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS_LOADED:
				setObjectsLoaded(((Boolean)newValue).booleanValue());
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
			case ROMPackage.REPOSITORY_PACKAGE__OBJECT_KEYS:
				getObjectKeys().clear();
				return;
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS:
				getObjects().clear();
				return;
			case ROMPackage.REPOSITORY_PACKAGE__SUB_PACKAGE_NAMES:
				getSubPackageNames().clear();
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
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS_LOADED:
				setObjectsLoaded(OBJECTS_LOADED_EDEFAULT);
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
			case ROMPackage.REPOSITORY_PACKAGE__DESCRIPTION:
				return description != null && !description.isEmpty();
			case ROMPackage.REPOSITORY_PACKAGE__OBJECT_KEYS:
				return objectKeys != null && !objectKeys.isEmpty();
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS:
				return objects != null && !objects.isEmpty();
			case ROMPackage.REPOSITORY_PACKAGE__SUB_PACKAGE_NAMES:
				return subPackageNames != null && !subPackageNames.isEmpty();
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
			case ROMPackage.REPOSITORY_PACKAGE__COLLECTION:
				return getCollection() != null;
			case ROMPackage.REPOSITORY_PACKAGE__OBJECTS_LOADED:
				return objectsLoaded != OBJECTS_LOADED_EDEFAULT;
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
		result.append(" (subPackageNames: "); //$NON-NLS-1$
		result.append(subPackageNames);
		result.append(", changeRecodingEnabled: "); //$NON-NLS-1$
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
		result.append(", objectsLoaded: "); //$NON-NLS-1$
		result.append(objectsLoaded);
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
		return "DEVC";
	}
	
} //RepositoryPackageImpl
