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
package net.sf.rcer.rom;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rom.ROMFactory
 * @model kind="package"
 * @generated
 */
public interface ROMPackage extends EPackage {
	
	/**
	 * The ID of the plug-in (in absence of an Activator, this will have to do).
	 * @generated no
	 */
	String PLUGIN_ID = "net.sf.rcer.rom";
	
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rom"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rcer.sf.net/rom"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.sf.rcer"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ROMPackage eINSTANCE = net.sf.rcer.rom.impl.ROMPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.impl.LocalizedStringImpl <em>Localized String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.impl.LocalizedStringImpl
	 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getLocalizedString()
	 * @generated
	 */
	int LOCALIZED_STRING = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_STRING__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_STRING__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Localized String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCALIZED_STRING_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.impl.RepositoryObjectKeyImpl <em>Repository Object Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.impl.RepositoryObjectKeyImpl
	 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getRepositoryObjectKey()
	 * @generated
	 */
	int REPOSITORY_OBJECT_KEY = 1;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_KEY__PROGRAM_ID = 0;

	/**
	 * The feature id for the '<em><b>Object Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_KEY__OBJECT_TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_KEY__NAME = 2;

	/**
	 * The number of structural features of the '<em>Repository Object Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_KEY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.impl.RepositoryObjectImpl <em>Repository Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.impl.RepositoryObjectImpl
	 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getRepositoryObject()
	 * @generated
	 */
	int REPOSITORY_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT__OBJECT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT__LOADED = 2;

	/**
	 * The feature id for the '<em><b>Source System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT__SOURCE_SYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT__AUTHOR = 4;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT__GENERATED = 5;

	/**
	 * The feature id for the '<em><b>Original Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT__ORIGINAL_LOCALE = 6;

	/**
	 * The feature id for the '<em><b>Software Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT__SOFTWARE_COMPONENT = 7;

	/**
	 * The feature id for the '<em><b>Component Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT__COMPONENT_RELEASE = 8;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT__PACKAGE_NAME = 9;

	/**
	 * The number of structural features of the '<em>Repository Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.impl.RepositoryObjectCollectionImpl <em>Repository Object Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.impl.RepositoryObjectCollectionImpl
	 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getRepositoryObjectCollection()
	 * @generated
	 */
	int REPOSITORY_OBJECT_COLLECTION = 3;

	/**
	 * The feature id for the '<em><b>Source Connection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_COLLECTION__SOURCE_CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_COLLECTION__PACKAGES = 1;

	/**
	 * The feature id for the '<em><b>Domains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_COLLECTION__DOMAINS = 2;

	/**
	 * The feature id for the '<em><b>Data Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_COLLECTION__DATA_ELEMENTS = 3;

	/**
	 * The feature id for the '<em><b>Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_COLLECTION__STRUCTURES = 4;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_COLLECTION__TABLES = 5;

	/**
	 * The feature id for the '<em><b>Table Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_COLLECTION__TABLE_TYPES = 6;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_COLLECTION__VIEWS = 7;

	/**
	 * The feature id for the '<em><b>Seach Helps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_COLLECTION__SEACH_HELPS = 8;

	/**
	 * The feature id for the '<em><b>Enqueue Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_COLLECTION__ENQUEUE_OBJECTS = 9;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_COLLECTION__INTERFACES = 10;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_COLLECTION__CLASSES = 11;

	/**
	 * The number of structural features of the '<em>Repository Object Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OBJECT_COLLECTION_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.impl.RepositoryPackageImpl <em>Repository Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.impl.RepositoryPackageImpl
	 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getRepositoryPackage()
	 * @generated
	 */
	int REPOSITORY_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__OBJECT_TYPE = REPOSITORY_OBJECT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__NAME = REPOSITORY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__LOADED = REPOSITORY_OBJECT__LOADED;

	/**
	 * The feature id for the '<em><b>Source System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__SOURCE_SYSTEM = REPOSITORY_OBJECT__SOURCE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__AUTHOR = REPOSITORY_OBJECT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__GENERATED = REPOSITORY_OBJECT__GENERATED;

	/**
	 * The feature id for the '<em><b>Original Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__ORIGINAL_LOCALE = REPOSITORY_OBJECT__ORIGINAL_LOCALE;

	/**
	 * The feature id for the '<em><b>Software Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__SOFTWARE_COMPONENT = REPOSITORY_OBJECT__SOFTWARE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Component Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__COMPONENT_RELEASE = REPOSITORY_OBJECT__COMPONENT_RELEASE;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__PACKAGE_NAME = REPOSITORY_OBJECT__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__DESCRIPTION = REPOSITORY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Keys</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__OBJECT_KEYS = REPOSITORY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__OBJECTS = REPOSITORY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Package Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__SUB_PACKAGE_NAMES = REPOSITORY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Change Recoding Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__CHANGE_RECODING_ENABLED = REPOSITORY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Responsible User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__RESPONSIBLE_USER = REPOSITORY_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Transport Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__TRANSPORT_LAYER = REPOSITORY_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__NAMESPACE = REPOSITORY_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Interface Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__INTERFACE_PREFIX = REPOSITORY_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Permitted Object Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__PERMITTED_OBJECT_TYPES = REPOSITORY_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Object Creation Restricted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__OBJECT_CREATION_RESTRICTED = REPOSITORY_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__TYPE = REPOSITORY_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Checked As Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__CHECKED_AS_SERVER = REPOSITORY_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Checked As Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__CHECKED_AS_CLIENT = REPOSITORY_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__COLLECTION = REPOSITORY_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Objects Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE__OBJECTS_LOADED = REPOSITORY_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>Repository Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_PACKAGE_FEATURE_COUNT = REPOSITORY_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.RepositoryObjectType <em>Repository Object Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.RepositoryObjectType
	 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getRepositoryObjectType()
	 * @generated
	 */
	int REPOSITORY_OBJECT_TYPE = 5;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.PackageType <em>Package Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.PackageType
	 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getPackageType()
	 * @generated
	 */
	int PACKAGE_TYPE = 6;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.PackagePermittedObjectTypes <em>Package Permitted Object Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.PackagePermittedObjectTypes
	 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getPackagePermittedObjectTypes()
	 * @generated
	 */
	int PACKAGE_PERMITTED_OBJECT_TYPES = 7;

	/**
	 * The meta object id for the '<em>Locale</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.conn.locales.Locale
	 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getLocale()
	 * @generated
	 */
	int LOCALE = 8;


	/**
	 * The meta object id for the '<em>IStatus</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.runtime.IStatus
	 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getIStatus()
	 * @generated
	 */
	int ISTATUS = 9;

	/**
	 * The meta object id for the '<em>JCo Destination</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.sap.conn.jco.JCoDestination
	 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getJCoDestination()
	 * @generated
	 */
	int JCO_DESTINATION = 10;


	/**
	 * The meta object id for the '<em>Object Not Found Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.util.ObjectNotFoundException
	 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getObjectNotFoundException()
	 * @generated
	 */
	int OBJECT_NOT_FOUND_EXCEPTION = 11;


	/**
	 * The meta object id for the '<em>Object Loading Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.util.ObjectLoadingException
	 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getObjectLoadingException()
	 * @generated
	 */
	int OBJECT_LOADING_EXCEPTION = 12;


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Localized String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Localized String</em>'.
	 * @see java.util.Map.Entry
	 * @model keyUnique="false" keyDataType="net.sf.rcer.rom.Locale" keyRequired="true" keyOrdered="false"
	 *        valueUnique="false" valueDataType="org.eclipse.emf.ecore.EString" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	EClass getLocalizedString();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLocalizedString()
	 * @generated
	 */
	EAttribute getLocalizedString_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getLocalizedString()
	 * @generated
	 */
	EAttribute getLocalizedString_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.RepositoryObjectKey <em>Repository Object Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Object Key</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectKey
	 * @generated
	 */
	EClass getRepositoryObjectKey();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObjectKey#getProgramID <em>Program ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program ID</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectKey#getProgramID()
	 * @see #getRepositoryObjectKey()
	 * @generated
	 */
	EAttribute getRepositoryObjectKey_ProgramID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObjectKey#getObjectTypeID <em>Object Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type ID</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectKey#getObjectTypeID()
	 * @see #getRepositoryObjectKey()
	 * @generated
	 */
	EAttribute getRepositoryObjectKey_ObjectTypeID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObjectKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectKey#getName()
	 * @see #getRepositoryObjectKey()
	 * @generated
	 */
	EAttribute getRepositoryObjectKey_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.RepositoryObject <em>Repository Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Object</em>'.
	 * @see net.sf.rcer.rom.RepositoryObject
	 * @generated
	 */
	EClass getRepositoryObject();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObject#getObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Type</em>'.
	 * @see net.sf.rcer.rom.RepositoryObject#getObjectType()
	 * @see #getRepositoryObject()
	 * @generated
	 */
	EAttribute getRepositoryObject_ObjectType();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObject#isLoaded <em>Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loaded</em>'.
	 * @see net.sf.rcer.rom.RepositoryObject#isLoaded()
	 * @see #getRepositoryObject()
	 * @generated
	 */
	EAttribute getRepositoryObject_Loaded();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.rcer.rom.RepositoryObject#getName()
	 * @see #getRepositoryObject()
	 * @generated
	 */
	EAttribute getRepositoryObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObject#getSourceSystem <em>Source System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source System</em>'.
	 * @see net.sf.rcer.rom.RepositoryObject#getSourceSystem()
	 * @see #getRepositoryObject()
	 * @generated
	 */
	EAttribute getRepositoryObject_SourceSystem();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObject#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see net.sf.rcer.rom.RepositoryObject#getAuthor()
	 * @see #getRepositoryObject()
	 * @generated
	 */
	EAttribute getRepositoryObject_Author();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.RepositoryObjectCollection <em>Repository Object Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Object Collection</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection
	 * @generated
	 */
	EClass getRepositoryObjectCollection();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObjectCollection#getSourceConnection <em>Source Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Connection</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getSourceConnection()
	 * @see #getRepositoryObjectCollection()
	 * @generated
	 */
	EAttribute getRepositoryObjectCollection_SourceConnection();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.RepositoryObjectCollection#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packages</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getPackages()
	 * @see #getRepositoryObjectCollection()
	 * @generated
	 */
	EReference getRepositoryObjectCollection_Packages();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.RepositoryObjectCollection#getDomains <em>Domains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domains</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getDomains()
	 * @see #getRepositoryObjectCollection()
	 * @generated
	 */
	EReference getRepositoryObjectCollection_Domains();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.RepositoryObjectCollection#getDataElements <em>Data Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Elements</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getDataElements()
	 * @see #getRepositoryObjectCollection()
	 * @generated
	 */
	EReference getRepositoryObjectCollection_DataElements();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.RepositoryObjectCollection#getStructures <em>Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Structures</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getStructures()
	 * @see #getRepositoryObjectCollection()
	 * @generated
	 */
	EReference getRepositoryObjectCollection_Structures();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.RepositoryObjectCollection#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getTables()
	 * @see #getRepositoryObjectCollection()
	 * @generated
	 */
	EReference getRepositoryObjectCollection_Tables();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.RepositoryObjectCollection#getTableTypes <em>Table Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Types</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getTableTypes()
	 * @see #getRepositoryObjectCollection()
	 * @generated
	 */
	EReference getRepositoryObjectCollection_TableTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.RepositoryObjectCollection#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getViews()
	 * @see #getRepositoryObjectCollection()
	 * @generated
	 */
	EReference getRepositoryObjectCollection_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.RepositoryObjectCollection#getSeachHelps <em>Seach Helps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seach Helps</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getSeachHelps()
	 * @see #getRepositoryObjectCollection()
	 * @generated
	 */
	EReference getRepositoryObjectCollection_SeachHelps();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.RepositoryObjectCollection#getEnqueueObjects <em>Enqueue Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enqueue Objects</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getEnqueueObjects()
	 * @see #getRepositoryObjectCollection()
	 * @generated
	 */
	EReference getRepositoryObjectCollection_EnqueueObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.RepositoryObjectCollection#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getInterfaces()
	 * @see #getRepositoryObjectCollection()
	 * @generated
	 */
	EReference getRepositoryObjectCollection_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.RepositoryObjectCollection#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getClasses()
	 * @see #getRepositoryObjectCollection()
	 * @generated
	 */
	EReference getRepositoryObjectCollection_Classes();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObject#isGenerated <em>Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated</em>'.
	 * @see net.sf.rcer.rom.RepositoryObject#isGenerated()
	 * @see #getRepositoryObject()
	 * @generated
	 */
	EAttribute getRepositoryObject_Generated();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObject#getOriginalLocale <em>Original Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Original Locale</em>'.
	 * @see net.sf.rcer.rom.RepositoryObject#getOriginalLocale()
	 * @see #getRepositoryObject()
	 * @generated
	 */
	EAttribute getRepositoryObject_OriginalLocale();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObject#getSoftwareComponent <em>Software Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software Component</em>'.
	 * @see net.sf.rcer.rom.RepositoryObject#getSoftwareComponent()
	 * @see #getRepositoryObject()
	 * @generated
	 */
	EAttribute getRepositoryObject_SoftwareComponent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObject#getComponentRelease <em>Component Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Release</em>'.
	 * @see net.sf.rcer.rom.RepositoryObject#getComponentRelease()
	 * @see #getRepositoryObject()
	 * @generated
	 */
	EAttribute getRepositoryObject_ComponentRelease();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryObject#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see net.sf.rcer.rom.RepositoryObject#getPackageName()
	 * @see #getRepositoryObject()
	 * @generated
	 */
	EAttribute getRepositoryObject_PackageName();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.RepositoryPackage <em>Repository Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository Package</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage
	 * @generated
	 */
	EClass getRepositoryPackage();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.RepositoryPackage#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Description</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#getDescription()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EReference getRepositoryPackage_Description();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.rcer.rom.RepositoryPackage#getObjectKeys <em>Object Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Keys</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#getObjectKeys()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EReference getRepositoryPackage_ObjectKeys();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryPackage#isChangeRecodingEnabled <em>Change Recoding Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Change Recoding Enabled</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#isChangeRecodingEnabled()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EAttribute getRepositoryPackage_ChangeRecodingEnabled();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryPackage#getResponsibleUser <em>Responsible User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsible User</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#getResponsibleUser()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EAttribute getRepositoryPackage_ResponsibleUser();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryPackage#getTransportLayer <em>Transport Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport Layer</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#getTransportLayer()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EAttribute getRepositoryPackage_TransportLayer();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryPackage#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#getNamespace()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EAttribute getRepositoryPackage_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryPackage#getInterfacePrefix <em>Interface Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Prefix</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#getInterfacePrefix()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EAttribute getRepositoryPackage_InterfacePrefix();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryPackage#getPermittedObjectTypes <em>Permitted Object Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permitted Object Types</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#getPermittedObjectTypes()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EAttribute getRepositoryPackage_PermittedObjectTypes();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryPackage#isObjectCreationRestricted <em>Object Creation Restricted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Creation Restricted</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#isObjectCreationRestricted()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EAttribute getRepositoryPackage_ObjectCreationRestricted();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryPackage#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#getType()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EAttribute getRepositoryPackage_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryPackage#isCheckedAsServer <em>Checked As Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked As Server</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#isCheckedAsServer()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EAttribute getRepositoryPackage_CheckedAsServer();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryPackage#isCheckedAsClient <em>Checked As Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked As Client</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#isCheckedAsClient()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EAttribute getRepositoryPackage_CheckedAsClient();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.rcer.rom.RepositoryPackage#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#getCollection()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EReference getRepositoryPackage_Collection();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.RepositoryPackage#isObjectsLoaded <em>Objects Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objects Loaded</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#isObjectsLoaded()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EAttribute getRepositoryPackage_ObjectsLoaded();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.rcer.rom.RepositoryPackage#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Objects</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#getObjects()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EReference getRepositoryPackage_Objects();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.rcer.rom.RepositoryPackage#getSubPackageNames <em>Sub Package Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sub Package Names</em>'.
	 * @see net.sf.rcer.rom.RepositoryPackage#getSubPackageNames()
	 * @see #getRepositoryPackage()
	 * @generated
	 */
	EAttribute getRepositoryPackage_SubPackageNames();

	/**
	 * Returns the meta object for enum '{@link net.sf.rcer.rom.RepositoryObjectType <em>Repository Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Repository Object Type</em>'.
	 * @see net.sf.rcer.rom.RepositoryObjectType
	 * @generated
	 */
	EEnum getRepositoryObjectType();

	/**
	 * Returns the meta object for enum '{@link net.sf.rcer.rom.PackageType <em>Package Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Package Type</em>'.
	 * @see net.sf.rcer.rom.PackageType
	 * @generated
	 */
	EEnum getPackageType();

	/**
	 * Returns the meta object for enum '{@link net.sf.rcer.rom.PackagePermittedObjectTypes <em>Package Permitted Object Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Package Permitted Object Types</em>'.
	 * @see net.sf.rcer.rom.PackagePermittedObjectTypes
	 * @generated
	 */
	EEnum getPackagePermittedObjectTypes();

	/**
	 * Returns the meta object for data type '{@link net.sf.rcer.conn.locales.Locale <em>Locale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Locale</em>'.
	 * @see net.sf.rcer.conn.locales.Locale
	 * @model instanceClass="net.sf.rcer.conn.locales.Locale"
	 * @generated
	 */
	EDataType getLocale();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.runtime.IStatus <em>IStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IStatus</em>'.
	 * @see org.eclipse.core.runtime.IStatus
	 * @model instanceClass="org.eclipse.core.runtime.IStatus" serializeable="false"
	 * @generated
	 */
	EDataType getIStatus();

	/**
	 * Returns the meta object for data type '{@link com.sap.conn.jco.JCoDestination <em>JCo Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>JCo Destination</em>'.
	 * @see com.sap.conn.jco.JCoDestination
	 * @model instanceClass="com.sap.conn.jco.JCoDestination" serializeable="false"
	 * @generated
	 */
	EDataType getJCoDestination();

	/**
	 * Returns the meta object for data type '{@link net.sf.rcer.rom.util.ObjectNotFoundException <em>Object Not Found Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object Not Found Exception</em>'.
	 * @see net.sf.rcer.rom.util.ObjectNotFoundException
	 * @model instanceClass="net.sf.rcer.rom.util.ObjectNotFoundException"
	 * @generated
	 */
	EDataType getObjectNotFoundException();

	/**
	 * Returns the meta object for data type '{@link net.sf.rcer.rom.util.ObjectLoadingException <em>Object Loading Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object Loading Exception</em>'.
	 * @see net.sf.rcer.rom.util.ObjectLoadingException
	 * @model instanceClass="net.sf.rcer.rom.util.ObjectLoadingException"
	 * @generated
	 */
	EDataType getObjectLoadingException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ROMFactory getROMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.impl.LocalizedStringImpl <em>Localized String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.impl.LocalizedStringImpl
		 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getLocalizedString()
		 * @generated
		 */
		EClass LOCALIZED_STRING = eINSTANCE.getLocalizedString();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALIZED_STRING__KEY = eINSTANCE.getLocalizedString_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCALIZED_STRING__VALUE = eINSTANCE.getLocalizedString_Value();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.impl.RepositoryObjectKeyImpl <em>Repository Object Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.impl.RepositoryObjectKeyImpl
		 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getRepositoryObjectKey()
		 * @generated
		 */
		EClass REPOSITORY_OBJECT_KEY = eINSTANCE.getRepositoryObjectKey();

		/**
		 * The meta object literal for the '<em><b>Program ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT_KEY__PROGRAM_ID = eINSTANCE.getRepositoryObjectKey_ProgramID();

		/**
		 * The meta object literal for the '<em><b>Object Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT_KEY__OBJECT_TYPE_ID = eINSTANCE.getRepositoryObjectKey_ObjectTypeID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT_KEY__NAME = eINSTANCE.getRepositoryObjectKey_Name();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.impl.RepositoryObjectImpl <em>Repository Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.impl.RepositoryObjectImpl
		 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getRepositoryObject()
		 * @generated
		 */
		EClass REPOSITORY_OBJECT = eINSTANCE.getRepositoryObject();

		/**
		 * The meta object literal for the '<em><b>Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT__OBJECT_TYPE = eINSTANCE.getRepositoryObject_ObjectType();

		/**
		 * The meta object literal for the '<em><b>Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT__LOADED = eINSTANCE.getRepositoryObject_Loaded();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT__NAME = eINSTANCE.getRepositoryObject_Name();

		/**
		 * The meta object literal for the '<em><b>Source System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT__SOURCE_SYSTEM = eINSTANCE.getRepositoryObject_SourceSystem();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT__AUTHOR = eINSTANCE.getRepositoryObject_Author();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.impl.RepositoryObjectCollectionImpl <em>Repository Object Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.impl.RepositoryObjectCollectionImpl
		 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getRepositoryObjectCollection()
		 * @generated
		 */
		EClass REPOSITORY_OBJECT_COLLECTION = eINSTANCE.getRepositoryObjectCollection();

		/**
		 * The meta object literal for the '<em><b>Source Connection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT_COLLECTION__SOURCE_CONNECTION = eINSTANCE.getRepositoryObjectCollection_SourceConnection();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_OBJECT_COLLECTION__PACKAGES = eINSTANCE.getRepositoryObjectCollection_Packages();

		/**
		 * The meta object literal for the '<em><b>Domains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_OBJECT_COLLECTION__DOMAINS = eINSTANCE.getRepositoryObjectCollection_Domains();

		/**
		 * The meta object literal for the '<em><b>Data Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_OBJECT_COLLECTION__DATA_ELEMENTS = eINSTANCE.getRepositoryObjectCollection_DataElements();

		/**
		 * The meta object literal for the '<em><b>Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_OBJECT_COLLECTION__STRUCTURES = eINSTANCE.getRepositoryObjectCollection_Structures();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_OBJECT_COLLECTION__TABLES = eINSTANCE.getRepositoryObjectCollection_Tables();

		/**
		 * The meta object literal for the '<em><b>Table Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_OBJECT_COLLECTION__TABLE_TYPES = eINSTANCE.getRepositoryObjectCollection_TableTypes();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_OBJECT_COLLECTION__VIEWS = eINSTANCE.getRepositoryObjectCollection_Views();

		/**
		 * The meta object literal for the '<em><b>Seach Helps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_OBJECT_COLLECTION__SEACH_HELPS = eINSTANCE.getRepositoryObjectCollection_SeachHelps();

		/**
		 * The meta object literal for the '<em><b>Enqueue Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_OBJECT_COLLECTION__ENQUEUE_OBJECTS = eINSTANCE.getRepositoryObjectCollection_EnqueueObjects();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_OBJECT_COLLECTION__INTERFACES = eINSTANCE.getRepositoryObjectCollection_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_OBJECT_COLLECTION__CLASSES = eINSTANCE.getRepositoryObjectCollection_Classes();

		/**
		 * The meta object literal for the '<em><b>Generated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT__GENERATED = eINSTANCE.getRepositoryObject_Generated();

		/**
		 * The meta object literal for the '<em><b>Original Locale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT__ORIGINAL_LOCALE = eINSTANCE.getRepositoryObject_OriginalLocale();

		/**
		 * The meta object literal for the '<em><b>Software Component</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT__SOFTWARE_COMPONENT = eINSTANCE.getRepositoryObject_SoftwareComponent();

		/**
		 * The meta object literal for the '<em><b>Component Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT__COMPONENT_RELEASE = eINSTANCE.getRepositoryObject_ComponentRelease();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_OBJECT__PACKAGE_NAME = eINSTANCE.getRepositoryObject_PackageName();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.impl.RepositoryPackageImpl <em>Repository Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.impl.RepositoryPackageImpl
		 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getRepositoryPackage()
		 * @generated
		 */
		EClass REPOSITORY_PACKAGE = eINSTANCE.getRepositoryPackage();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_PACKAGE__DESCRIPTION = eINSTANCE.getRepositoryPackage_Description();

		/**
		 * The meta object literal for the '<em><b>Object Keys</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_PACKAGE__OBJECT_KEYS = eINSTANCE.getRepositoryPackage_ObjectKeys();

		/**
		 * The meta object literal for the '<em><b>Change Recoding Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_PACKAGE__CHANGE_RECODING_ENABLED = eINSTANCE.getRepositoryPackage_ChangeRecodingEnabled();

		/**
		 * The meta object literal for the '<em><b>Responsible User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_PACKAGE__RESPONSIBLE_USER = eINSTANCE.getRepositoryPackage_ResponsibleUser();

		/**
		 * The meta object literal for the '<em><b>Transport Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_PACKAGE__TRANSPORT_LAYER = eINSTANCE.getRepositoryPackage_TransportLayer();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_PACKAGE__NAMESPACE = eINSTANCE.getRepositoryPackage_Namespace();

		/**
		 * The meta object literal for the '<em><b>Interface Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_PACKAGE__INTERFACE_PREFIX = eINSTANCE.getRepositoryPackage_InterfacePrefix();

		/**
		 * The meta object literal for the '<em><b>Permitted Object Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_PACKAGE__PERMITTED_OBJECT_TYPES = eINSTANCE.getRepositoryPackage_PermittedObjectTypes();

		/**
		 * The meta object literal for the '<em><b>Object Creation Restricted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_PACKAGE__OBJECT_CREATION_RESTRICTED = eINSTANCE.getRepositoryPackage_ObjectCreationRestricted();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_PACKAGE__TYPE = eINSTANCE.getRepositoryPackage_Type();

		/**
		 * The meta object literal for the '<em><b>Checked As Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_PACKAGE__CHECKED_AS_SERVER = eINSTANCE.getRepositoryPackage_CheckedAsServer();

		/**
		 * The meta object literal for the '<em><b>Checked As Client</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_PACKAGE__CHECKED_AS_CLIENT = eINSTANCE.getRepositoryPackage_CheckedAsClient();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_PACKAGE__COLLECTION = eINSTANCE.getRepositoryPackage_Collection();

		/**
		 * The meta object literal for the '<em><b>Objects Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_PACKAGE__OBJECTS_LOADED = eINSTANCE.getRepositoryPackage_ObjectsLoaded();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_PACKAGE__OBJECTS = eINSTANCE.getRepositoryPackage_Objects();

		/**
		 * The meta object literal for the '<em><b>Sub Package Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_PACKAGE__SUB_PACKAGE_NAMES = eINSTANCE.getRepositoryPackage_SubPackageNames();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.RepositoryObjectType <em>Repository Object Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.RepositoryObjectType
		 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getRepositoryObjectType()
		 * @generated
		 */
		EEnum REPOSITORY_OBJECT_TYPE = eINSTANCE.getRepositoryObjectType();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.PackageType <em>Package Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.PackageType
		 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getPackageType()
		 * @generated
		 */
		EEnum PACKAGE_TYPE = eINSTANCE.getPackageType();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.PackagePermittedObjectTypes <em>Package Permitted Object Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.PackagePermittedObjectTypes
		 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getPackagePermittedObjectTypes()
		 * @generated
		 */
		EEnum PACKAGE_PERMITTED_OBJECT_TYPES = eINSTANCE.getPackagePermittedObjectTypes();

		/**
		 * The meta object literal for the '<em>Locale</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.conn.locales.Locale
		 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getLocale()
		 * @generated
		 */
		EDataType LOCALE = eINSTANCE.getLocale();

		/**
		 * The meta object literal for the '<em>IStatus</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.runtime.IStatus
		 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getIStatus()
		 * @generated
		 */
		EDataType ISTATUS = eINSTANCE.getIStatus();

		/**
		 * The meta object literal for the '<em>JCo Destination</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.sap.conn.jco.JCoDestination
		 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getJCoDestination()
		 * @generated
		 */
		EDataType JCO_DESTINATION = eINSTANCE.getJCoDestination();

		/**
		 * The meta object literal for the '<em>Object Not Found Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.util.ObjectNotFoundException
		 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getObjectNotFoundException()
		 * @generated
		 */
		EDataType OBJECT_NOT_FOUND_EXCEPTION = eINSTANCE.getObjectNotFoundException();

		/**
		 * The meta object literal for the '<em>Object Loading Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.util.ObjectLoadingException
		 * @see net.sf.rcer.rom.impl.ROMPackageImpl#getObjectLoadingException()
		 * @generated
		 */
		EDataType OBJECT_LOADING_EXCEPTION = eINSTANCE.getObjectLoadingException();

	}

} //ROMPackage
