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
package net.sf.rcer.rom.abapobj;

import net.sf.rcer.rom.ROMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.rcer.rom.abapobj.ABAPObjectsFactory
 * @model kind="package"
 * @generated
 */
public interface ABAPObjectsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "abapobj"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rcer.sf.net/rom/abapobj"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "net.sf.rcer.rom"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ABAPObjectsPackage eINSTANCE = net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.impl.ForwardDeclarationsImpl <em>Forward Declarations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.impl.ForwardDeclarationsImpl
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getForwardDeclarations()
	 * @generated
	 */
	int FORWARD_DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Type Pools</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DECLARATIONS__TYPE_POOLS = 0;

	/**
	 * The feature id for the '<em><b>Interface Forward Definitions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DECLARATIONS__INTERFACE_FORWARD_DEFINITIONS = 1;

	/**
	 * The feature id for the '<em><b>Class Forward Definitions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DECLARATIONS__CLASS_FORWARD_DEFINITIONS = 2;

	/**
	 * The number of structural features of the '<em>Forward Declarations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORWARD_DECLARATIONS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl <em>ABAP Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getABAPInterface()
	 * @generated
	 */
	int ABAP_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__OBJECT_TYPE = ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__NAME = ROMPackage.REPOSITORY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__LOADED = ROMPackage.REPOSITORY_OBJECT__LOADED;

	/**
	 * The feature id for the '<em><b>Source System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__SOURCE_SYSTEM = ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__AUTHOR = ROMPackage.REPOSITORY_OBJECT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__GENERATED = ROMPackage.REPOSITORY_OBJECT__GENERATED;

	/**
	 * The feature id for the '<em><b>Original Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__ORIGINAL_LOCALE = ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE;

	/**
	 * The feature id for the '<em><b>Software Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__SOFTWARE_COMPONENT = ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Component Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__COMPONENT_RELEASE = ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__PACKAGE_NAME = ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Type Pools</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__TYPE_POOLS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Forward Definitions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__INTERFACE_FORWARD_DEFINITIONS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Forward Definitions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__CLASS_FORWARD_DEFINITIONS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__DESCRIPTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__COLLECTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exit Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__EXIT_INTERFACE = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unicode Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__UNICODE_CHECKED = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__METHODS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__INTERFACES = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__ATTRIBUTES = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE__EVENTS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>ABAP Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_INTERFACE_FEATURE_COUNT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.impl.InterfaceAttributeImpl <em>Interface Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.impl.InterfaceAttributeImpl
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getInterfaceAttribute()
	 * @generated
	 */
	int INTERFACE_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ATTRIBUTE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ATTRIBUTE__TYPING = 2;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ATTRIBUTE__TYPE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ATTRIBUTE__SCOPE = 4;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ATTRIBUTE__READ_ONLY = 5;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ATTRIBUTE__DEFAULT_VALUE = 6;

	/**
	 * The number of structural features of the '<em>Interface Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ATTRIBUTE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.impl.ClassAttributeImpl
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getClassAttribute()
	 * @generated
	 */
	int CLASS_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__NAME = INTERFACE_ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__DESCRIPTION = INTERFACE_ATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__TYPING = INTERFACE_ATTRIBUTE__TYPING;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__TYPE_NAME = INTERFACE_ATTRIBUTE__TYPE_NAME;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__SCOPE = INTERFACE_ATTRIBUTE__SCOPE;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__READ_ONLY = INTERFACE_ATTRIBUTE__READ_ONLY;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__DEFAULT_VALUE = INTERFACE_ATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE__VISIBILITY = INTERFACE_ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_ATTRIBUTE_FEATURE_COUNT = INTERFACE_ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.impl.InterfaceMethodImpl <em>Interface Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.impl.InterfaceMethodImpl
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getInterfaceMethod()
	 * @generated
	 */
	int INTERFACE_METHOD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD__SCOPE = 2;

	/**
	 * The feature id for the '<em><b>Event Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD__EVENT_HANDLER = 3;

	/**
	 * The feature id for the '<em><b>Event Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD__EVENT_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD__EVENT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Class Based Exceptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD__CLASS_BASED_EXCEPTIONS = 6;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD__PARAMETERS = 7;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD__EXCEPTIONS = 8;

	/**
	 * The number of structural features of the '<em>Interface Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_METHOD_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.impl.ClassMethodImpl <em>Class Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.impl.ClassMethodImpl
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getClassMethod()
	 * @generated
	 */
	int CLASS_METHOD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD__NAME = INTERFACE_METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD__DESCRIPTION = INTERFACE_METHOD__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD__SCOPE = INTERFACE_METHOD__SCOPE;

	/**
	 * The feature id for the '<em><b>Event Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD__EVENT_HANDLER = INTERFACE_METHOD__EVENT_HANDLER;

	/**
	 * The feature id for the '<em><b>Event Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD__EVENT_CLASS = INTERFACE_METHOD__EVENT_CLASS;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD__EVENT_NAME = INTERFACE_METHOD__EVENT_NAME;

	/**
	 * The feature id for the '<em><b>Class Based Exceptions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD__CLASS_BASED_EXCEPTIONS = INTERFACE_METHOD__CLASS_BASED_EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD__PARAMETERS = INTERFACE_METHOD__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD__EXCEPTIONS = INTERFACE_METHOD__EXCEPTIONS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD__VISIBILITY = INTERFACE_METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD__ABSTRACT = INTERFACE_METHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD__FINAL = INTERFACE_METHOD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Class Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_METHOD_FEATURE_COUNT = INTERFACE_METHOD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.impl.InterfaceEventImpl <em>Interface Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.impl.InterfaceEventImpl
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getInterfaceEvent()
	 * @generated
	 */
	int INTERFACE_EVENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EVENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EVENT__SCOPE = 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EVENT__PARAMETERS = 3;

	/**
	 * The number of structural features of the '<em>Interface Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_EVENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.impl.ClassEventImpl <em>Class Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.impl.ClassEventImpl
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getClassEvent()
	 * @generated
	 */
	int CLASS_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT__NAME = INTERFACE_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT__DESCRIPTION = INTERFACE_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT__SCOPE = INTERFACE_EVENT__SCOPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT__PARAMETERS = INTERFACE_EVENT__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT__VISIBILITY = INTERFACE_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Class Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_EVENT_FEATURE_COUNT = INTERFACE_EVENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.impl.MethodParameterImpl
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getMethodParameter()
	 * @generated
	 */
	int METHOD_PARAMETER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Declaration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__DECLARATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Call By Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__CALL_BY_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__TYPING = 4;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__TYPE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__DEFAULT_VALUE = 6;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER__OPTIONAL = 7;

	/**
	 * The number of structural features of the '<em>Method Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_PARAMETER_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.impl.MethodExceptionImpl <em>Method Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.impl.MethodExceptionImpl
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getMethodException()
	 * @generated
	 */
	int METHOD_EXCEPTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXCEPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXCEPTION__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Method Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_EXCEPTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.impl.EventParameterImpl <em>Event Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.impl.EventParameterImpl
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getEventParameter()
	 * @generated
	 */
	int EVENT_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Typing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER__TYPING = 2;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER__TYPE_NAME = 3;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER__DEFAULT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER__OPTIONAL = 5;

	/**
	 * The number of structural features of the '<em>Event Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl <em>ABAP Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPClassImpl
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getABAPClass()
	 * @generated
	 */
	int ABAP_CLASS = 11;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__OBJECT_TYPE = ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__NAME = ROMPackage.REPOSITORY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__LOADED = ROMPackage.REPOSITORY_OBJECT__LOADED;

	/**
	 * The feature id for the '<em><b>Source System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__SOURCE_SYSTEM = ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__AUTHOR = ROMPackage.REPOSITORY_OBJECT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__GENERATED = ROMPackage.REPOSITORY_OBJECT__GENERATED;

	/**
	 * The feature id for the '<em><b>Original Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__ORIGINAL_LOCALE = ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE;

	/**
	 * The feature id for the '<em><b>Software Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__SOFTWARE_COMPONENT = ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Component Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__COMPONENT_RELEASE = ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__PACKAGE_NAME = ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Type Pools</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__TYPE_POOLS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Forward Definitions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__INTERFACE_FORWARD_DEFINITIONS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class Forward Definitions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__CLASS_FORWARD_DEFINITIONS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__DESCRIPTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__COLLECTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Super Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__SUPER_CLASS_NAME = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Creation Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__CREATION_SCOPE = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__FINAL = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Fixed Point Arithmetics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__FIXED_POINT_ARITHMETICS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Unicode Checked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__UNICODE_CHECKED = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__INTERFACES = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Friend Class Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__FRIEND_CLASS_NAMES = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__ATTRIBUTES = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__METHODS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS__EVENTS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>ABAP Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABAP_CLASS_FEATURE_COUNT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.impl.InterfaceImplementationImpl <em>Interface Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.impl.InterfaceImplementationImpl
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getInterfaceImplementation()
	 * @generated
	 */
	int INTERFACE_IMPLEMENTATION = 12;

	/**
	 * The feature id for the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION__INTERFACE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION__ABSTRACT = 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION__FINAL = 2;

	/**
	 * The number of structural features of the '<em>Interface Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_IMPLEMENTATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.AttributeScope <em>Attribute Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.AttributeScope
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getAttributeScope()
	 * @generated
	 */
	int ATTRIBUTE_SCOPE = 13;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.Visibility
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 14;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.AttributeTypingType <em>Attribute Typing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.AttributeTypingType
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getAttributeTypingType()
	 * @generated
	 */
	int ATTRIBUTE_TYPING_TYPE = 15;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.MethodScope <em>Method Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.MethodScope
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getMethodScope()
	 * @generated
	 */
	int METHOD_SCOPE = 16;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.MethodParameterDeclarationType <em>Method Parameter Declaration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.MethodParameterDeclarationType
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getMethodParameterDeclarationType()
	 * @generated
	 */
	int METHOD_PARAMETER_DECLARATION_TYPE = 17;


	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.abapobj.ClassCreationScope <em>Class Creation Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.abapobj.ClassCreationScope
	 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getClassCreationScope()
	 * @generated
	 */
	int CLASS_CREATION_SCOPE = 18;


	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.abapobj.ForwardDeclarations <em>Forward Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forward Declarations</em>'.
	 * @see net.sf.rcer.rom.abapobj.ForwardDeclarations
	 * @generated
	 */
	EClass getForwardDeclarations();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.rcer.rom.abapobj.ForwardDeclarations#getTypePools <em>Type Pools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type Pools</em>'.
	 * @see net.sf.rcer.rom.abapobj.ForwardDeclarations#getTypePools()
	 * @see #getForwardDeclarations()
	 * @generated
	 */
	EAttribute getForwardDeclarations_TypePools();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.rcer.rom.abapobj.ForwardDeclarations#getInterfaceForwardDefinitions <em>Interface Forward Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Interface Forward Definitions</em>'.
	 * @see net.sf.rcer.rom.abapobj.ForwardDeclarations#getInterfaceForwardDefinitions()
	 * @see #getForwardDeclarations()
	 * @generated
	 */
	EAttribute getForwardDeclarations_InterfaceForwardDefinitions();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.rcer.rom.abapobj.ForwardDeclarations#getClassForwardDefinitions <em>Class Forward Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Class Forward Definitions</em>'.
	 * @see net.sf.rcer.rom.abapobj.ForwardDeclarations#getClassForwardDefinitions()
	 * @see #getForwardDeclarations()
	 * @generated
	 */
	EAttribute getForwardDeclarations_ClassForwardDefinitions();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.abapobj.ABAPInterface <em>ABAP Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ABAP Interface</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPInterface
	 * @generated
	 */
	EClass getABAPInterface();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.abapobj.ABAPInterface#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Description</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPInterface#getDescription()
	 * @see #getABAPInterface()
	 * @generated
	 */
	EReference getABAPInterface_Description();

	/**
	 * Returns the meta object for the reference '{@link net.sf.rcer.rom.abapobj.ABAPInterface#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPInterface#getCollection()
	 * @see #getABAPInterface()
	 * @generated
	 */
	EReference getABAPInterface_Collection();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.ABAPInterface#isExitInterface <em>Exit Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit Interface</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPInterface#isExitInterface()
	 * @see #getABAPInterface()
	 * @generated
	 */
	EAttribute getABAPInterface_ExitInterface();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.ABAPInterface#isUnicodeChecked <em>Unicode Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unicode Checked</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPInterface#isUnicodeChecked()
	 * @see #getABAPInterface()
	 * @generated
	 */
	EAttribute getABAPInterface_UnicodeChecked();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.rcer.rom.abapobj.ABAPInterface#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Methods</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPInterface#getMethods()
	 * @see #getABAPInterface()
	 * @generated
	 */
	EReference getABAPInterface_Methods();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.rcer.rom.abapobj.ABAPInterface#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Interfaces</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPInterface#getInterfaces()
	 * @see #getABAPInterface()
	 * @generated
	 */
	EAttribute getABAPInterface_Interfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.abapobj.ABAPInterface#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPInterface#getAttributes()
	 * @see #getABAPInterface()
	 * @generated
	 */
	EReference getABAPInterface_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.abapobj.ABAPInterface#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPInterface#getEvents()
	 * @see #getABAPInterface()
	 * @generated
	 */
	EReference getABAPInterface_Events();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute <em>Interface Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Attribute</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceAttribute
	 * @generated
	 */
	EClass getInterfaceAttribute();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceAttribute#getName()
	 * @see #getInterfaceAttribute()
	 * @generated
	 */
	EAttribute getInterfaceAttribute_Name();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Description</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceAttribute#getDescription()
	 * @see #getInterfaceAttribute()
	 * @generated
	 */
	EReference getInterfaceAttribute_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getTyping <em>Typing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typing</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceAttribute#getTyping()
	 * @see #getInterfaceAttribute()
	 * @generated
	 */
	EAttribute getInterfaceAttribute_Typing();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceAttribute#getTypeName()
	 * @see #getInterfaceAttribute()
	 * @generated
	 */
	EAttribute getInterfaceAttribute_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceAttribute#getScope()
	 * @see #getInterfaceAttribute()
	 * @generated
	 */
	EAttribute getInterfaceAttribute_Scope();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceAttribute#isReadOnly()
	 * @see #getInterfaceAttribute()
	 * @generated
	 */
	EAttribute getInterfaceAttribute_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceAttribute#getDefaultValue()
	 * @see #getInterfaceAttribute()
	 * @generated
	 */
	EAttribute getInterfaceAttribute_DefaultValue();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.abapobj.ClassAttribute <em>Class Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Attribute</em>'.
	 * @see net.sf.rcer.rom.abapobj.ClassAttribute
	 * @generated
	 */
	EClass getClassAttribute();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.ClassAttribute#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see net.sf.rcer.rom.abapobj.ClassAttribute#getVisibility()
	 * @see #getClassAttribute()
	 * @generated
	 */
	EAttribute getClassAttribute_Visibility();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.abapobj.InterfaceMethod <em>Interface Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Method</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceMethod
	 * @generated
	 */
	EClass getInterfaceMethod();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceMethod#getName()
	 * @see #getInterfaceMethod()
	 * @generated
	 */
	EAttribute getInterfaceMethod_Name();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.abapobj.InterfaceMethod#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Description</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceMethod#getDescription()
	 * @see #getInterfaceMethod()
	 * @generated
	 */
	EReference getInterfaceMethod_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceMethod#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceMethod#getScope()
	 * @see #getInterfaceMethod()
	 * @generated
	 */
	EAttribute getInterfaceMethod_Scope();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceMethod#isEventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Handler</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceMethod#isEventHandler()
	 * @see #getInterfaceMethod()
	 * @generated
	 */
	EAttribute getInterfaceMethod_EventHandler();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceMethod#getEventClass <em>Event Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Class</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceMethod#getEventClass()
	 * @see #getInterfaceMethod()
	 * @generated
	 */
	EAttribute getInterfaceMethod_EventClass();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceMethod#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceMethod#getEventName()
	 * @see #getInterfaceMethod()
	 * @generated
	 */
	EAttribute getInterfaceMethod_EventName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceMethod#isClassBasedExceptions <em>Class Based Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Based Exceptions</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceMethod#isClassBasedExceptions()
	 * @see #getInterfaceMethod()
	 * @generated
	 */
	EAttribute getInterfaceMethod_ClassBasedExceptions();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.rcer.rom.abapobj.InterfaceMethod#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceMethod#getParameters()
	 * @see #getInterfaceMethod()
	 * @generated
	 */
	EReference getInterfaceMethod_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.rcer.rom.abapobj.InterfaceMethod#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exceptions</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceMethod#getExceptions()
	 * @see #getInterfaceMethod()
	 * @generated
	 */
	EReference getInterfaceMethod_Exceptions();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.abapobj.ClassMethod <em>Class Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Method</em>'.
	 * @see net.sf.rcer.rom.abapobj.ClassMethod
	 * @generated
	 */
	EClass getClassMethod();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.ClassMethod#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see net.sf.rcer.rom.abapobj.ClassMethod#getVisibility()
	 * @see #getClassMethod()
	 * @generated
	 */
	EAttribute getClassMethod_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.ClassMethod#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see net.sf.rcer.rom.abapobj.ClassMethod#isAbstract()
	 * @see #getClassMethod()
	 * @generated
	 */
	EAttribute getClassMethod_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.ClassMethod#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see net.sf.rcer.rom.abapobj.ClassMethod#isFinal()
	 * @see #getClassMethod()
	 * @generated
	 */
	EAttribute getClassMethod_Final();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.abapobj.InterfaceEvent <em>Interface Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Event</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceEvent
	 * @generated
	 */
	EClass getInterfaceEvent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceEvent#getName()
	 * @see #getInterfaceEvent()
	 * @generated
	 */
	EAttribute getInterfaceEvent_Name();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.abapobj.InterfaceEvent#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Description</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceEvent#getDescription()
	 * @see #getInterfaceEvent()
	 * @generated
	 */
	EReference getInterfaceEvent_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceEvent#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceEvent#getScope()
	 * @see #getInterfaceEvent()
	 * @generated
	 */
	EAttribute getInterfaceEvent_Scope();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.rcer.rom.abapobj.InterfaceEvent#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceEvent#getParameters()
	 * @see #getInterfaceEvent()
	 * @generated
	 */
	EReference getInterfaceEvent_Parameters();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.abapobj.ClassEvent <em>Class Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Event</em>'.
	 * @see net.sf.rcer.rom.abapobj.ClassEvent
	 * @generated
	 */
	EClass getClassEvent();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.ClassEvent#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see net.sf.rcer.rom.abapobj.ClassEvent#getVisibility()
	 * @see #getClassEvent()
	 * @generated
	 */
	EAttribute getClassEvent_Visibility();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.abapobj.MethodParameter <em>Method Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Parameter</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodParameter
	 * @generated
	 */
	EClass getMethodParameter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.MethodParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodParameter#getName()
	 * @see #getMethodParameter()
	 * @generated
	 */
	EAttribute getMethodParameter_Name();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.abapobj.MethodParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Description</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodParameter#getDescription()
	 * @see #getMethodParameter()
	 * @generated
	 */
	EReference getMethodParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.MethodParameter#getDeclarationType <em>Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declaration Type</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodParameter#getDeclarationType()
	 * @see #getMethodParameter()
	 * @generated
	 */
	EAttribute getMethodParameter_DeclarationType();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.MethodParameter#isCallByValue <em>Call By Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call By Value</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodParameter#isCallByValue()
	 * @see #getMethodParameter()
	 * @generated
	 */
	EAttribute getMethodParameter_CallByValue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.MethodParameter#getTyping <em>Typing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typing</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodParameter#getTyping()
	 * @see #getMethodParameter()
	 * @generated
	 */
	EAttribute getMethodParameter_Typing();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.MethodParameter#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodParameter#getTypeName()
	 * @see #getMethodParameter()
	 * @generated
	 */
	EAttribute getMethodParameter_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.MethodParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodParameter#getDefaultValue()
	 * @see #getMethodParameter()
	 * @generated
	 */
	EAttribute getMethodParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.MethodParameter#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodParameter#isOptional()
	 * @see #getMethodParameter()
	 * @generated
	 */
	EAttribute getMethodParameter_Optional();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.abapobj.MethodException <em>Method Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Exception</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodException
	 * @generated
	 */
	EClass getMethodException();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.MethodException#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodException#getName()
	 * @see #getMethodException()
	 * @generated
	 */
	EAttribute getMethodException_Name();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.abapobj.MethodException#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Description</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodException#getDescription()
	 * @see #getMethodException()
	 * @generated
	 */
	EReference getMethodException_Description();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.abapobj.EventParameter <em>Event Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Parameter</em>'.
	 * @see net.sf.rcer.rom.abapobj.EventParameter
	 * @generated
	 */
	EClass getEventParameter();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.EventParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.rcer.rom.abapobj.EventParameter#getName()
	 * @see #getEventParameter()
	 * @generated
	 */
	EAttribute getEventParameter_Name();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.abapobj.EventParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Description</em>'.
	 * @see net.sf.rcer.rom.abapobj.EventParameter#getDescription()
	 * @see #getEventParameter()
	 * @generated
	 */
	EReference getEventParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.EventParameter#getTyping <em>Typing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typing</em>'.
	 * @see net.sf.rcer.rom.abapobj.EventParameter#getTyping()
	 * @see #getEventParameter()
	 * @generated
	 */
	EAttribute getEventParameter_Typing();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.EventParameter#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see net.sf.rcer.rom.abapobj.EventParameter#getTypeName()
	 * @see #getEventParameter()
	 * @generated
	 */
	EAttribute getEventParameter_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.EventParameter#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see net.sf.rcer.rom.abapobj.EventParameter#getDefaultValue()
	 * @see #getEventParameter()
	 * @generated
	 */
	EAttribute getEventParameter_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.EventParameter#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see net.sf.rcer.rom.abapobj.EventParameter#isOptional()
	 * @see #getEventParameter()
	 * @generated
	 */
	EAttribute getEventParameter_Optional();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.abapobj.ABAPClass <em>ABAP Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ABAP Class</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass
	 * @generated
	 */
	EClass getABAPClass();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.abapobj.ABAPClass#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Description</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass#getDescription()
	 * @see #getABAPClass()
	 * @generated
	 */
	EReference getABAPClass_Description();

	/**
	 * Returns the meta object for the reference '{@link net.sf.rcer.rom.abapobj.ABAPClass#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass#getCollection()
	 * @see #getABAPClass()
	 * @generated
	 */
	EReference getABAPClass_Collection();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.ABAPClass#getSuperClassName <em>Super Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Super Class Name</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass#getSuperClassName()
	 * @see #getABAPClass()
	 * @generated
	 */
	EAttribute getABAPClass_SuperClassName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.ABAPClass#getCreationScope <em>Creation Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Scope</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass#getCreationScope()
	 * @see #getABAPClass()
	 * @generated
	 */
	EAttribute getABAPClass_CreationScope();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.ABAPClass#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass#isFinal()
	 * @see #getABAPClass()
	 * @generated
	 */
	EAttribute getABAPClass_Final();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.ABAPClass#isFixedPointArithmetics <em>Fixed Point Arithmetics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Point Arithmetics</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass#isFixedPointArithmetics()
	 * @see #getABAPClass()
	 * @generated
	 */
	EAttribute getABAPClass_FixedPointArithmetics();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.ABAPClass#isUnicodeChecked <em>Unicode Checked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unicode Checked</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass#isUnicodeChecked()
	 * @see #getABAPClass()
	 * @generated
	 */
	EAttribute getABAPClass_UnicodeChecked();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.abapobj.ABAPClass#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass#getInterfaces()
	 * @see #getABAPClass()
	 * @generated
	 */
	EReference getABAPClass_Interfaces();

	/**
	 * Returns the meta object for the attribute list '{@link net.sf.rcer.rom.abapobj.ABAPClass#getFriendClassNames <em>Friend Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Friend Class Names</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass#getFriendClassNames()
	 * @see #getABAPClass()
	 * @generated
	 */
	EAttribute getABAPClass_FriendClassNames();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.abapobj.ABAPClass#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass#getAttributes()
	 * @see #getABAPClass()
	 * @generated
	 */
	EReference getABAPClass_Attributes();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.rcer.rom.abapobj.ABAPClass#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Methods</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass#getMethods()
	 * @see #getABAPClass()
	 * @generated
	 */
	EReference getABAPClass_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.abapobj.ABAPClass#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see net.sf.rcer.rom.abapobj.ABAPClass#getEvents()
	 * @see #getABAPClass()
	 * @generated
	 */
	EReference getABAPClass_Events();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.abapobj.InterfaceImplementation <em>Interface Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Implementation</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceImplementation
	 * @generated
	 */
	EClass getInterfaceImplementation();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceImplementation#getInterfaceName <em>Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Name</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceImplementation#getInterfaceName()
	 * @see #getInterfaceImplementation()
	 * @generated
	 */
	EAttribute getInterfaceImplementation_InterfaceName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceImplementation#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceImplementation#isAbstract()
	 * @see #getInterfaceImplementation()
	 * @generated
	 */
	EAttribute getInterfaceImplementation_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.abapobj.InterfaceImplementation#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see net.sf.rcer.rom.abapobj.InterfaceImplementation#isFinal()
	 * @see #getInterfaceImplementation()
	 * @generated
	 */
	EAttribute getInterfaceImplementation_Final();

	/**
	 * Returns the meta object for enum '{@link net.sf.rcer.rom.abapobj.AttributeScope <em>Attribute Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Scope</em>'.
	 * @see net.sf.rcer.rom.abapobj.AttributeScope
	 * @generated
	 */
	EEnum getAttributeScope();

	/**
	 * Returns the meta object for enum '{@link net.sf.rcer.rom.abapobj.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see net.sf.rcer.rom.abapobj.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link net.sf.rcer.rom.abapobj.AttributeTypingType <em>Attribute Typing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Typing Type</em>'.
	 * @see net.sf.rcer.rom.abapobj.AttributeTypingType
	 * @generated
	 */
	EEnum getAttributeTypingType();

	/**
	 * Returns the meta object for enum '{@link net.sf.rcer.rom.abapobj.MethodScope <em>Method Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Scope</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodScope
	 * @generated
	 */
	EEnum getMethodScope();

	/**
	 * Returns the meta object for enum '{@link net.sf.rcer.rom.abapobj.MethodParameterDeclarationType <em>Method Parameter Declaration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method Parameter Declaration Type</em>'.
	 * @see net.sf.rcer.rom.abapobj.MethodParameterDeclarationType
	 * @generated
	 */
	EEnum getMethodParameterDeclarationType();

	/**
	 * Returns the meta object for enum '{@link net.sf.rcer.rom.abapobj.ClassCreationScope <em>Class Creation Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Class Creation Scope</em>'.
	 * @see net.sf.rcer.rom.abapobj.ClassCreationScope
	 * @generated
	 */
	EEnum getClassCreationScope();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ABAPObjectsFactory getABAPObjectsFactory();

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
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.impl.ForwardDeclarationsImpl <em>Forward Declarations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.impl.ForwardDeclarationsImpl
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getForwardDeclarations()
		 * @generated
		 */
		EClass FORWARD_DECLARATIONS = eINSTANCE.getForwardDeclarations();

		/**
		 * The meta object literal for the '<em><b>Type Pools</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORWARD_DECLARATIONS__TYPE_POOLS = eINSTANCE.getForwardDeclarations_TypePools();

		/**
		 * The meta object literal for the '<em><b>Interface Forward Definitions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORWARD_DECLARATIONS__INTERFACE_FORWARD_DEFINITIONS = eINSTANCE.getForwardDeclarations_InterfaceForwardDefinitions();

		/**
		 * The meta object literal for the '<em><b>Class Forward Definitions</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORWARD_DECLARATIONS__CLASS_FORWARD_DEFINITIONS = eINSTANCE.getForwardDeclarations_ClassForwardDefinitions();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl <em>ABAP Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPInterfaceImpl
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getABAPInterface()
		 * @generated
		 */
		EClass ABAP_INTERFACE = eINSTANCE.getABAPInterface();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABAP_INTERFACE__DESCRIPTION = eINSTANCE.getABAPInterface_Description();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABAP_INTERFACE__COLLECTION = eINSTANCE.getABAPInterface_Collection();

		/**
		 * The meta object literal for the '<em><b>Exit Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABAP_INTERFACE__EXIT_INTERFACE = eINSTANCE.getABAPInterface_ExitInterface();

		/**
		 * The meta object literal for the '<em><b>Unicode Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABAP_INTERFACE__UNICODE_CHECKED = eINSTANCE.getABAPInterface_UnicodeChecked();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABAP_INTERFACE__METHODS = eINSTANCE.getABAPInterface_Methods();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABAP_INTERFACE__INTERFACES = eINSTANCE.getABAPInterface_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABAP_INTERFACE__ATTRIBUTES = eINSTANCE.getABAPInterface_Attributes();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABAP_INTERFACE__EVENTS = eINSTANCE.getABAPInterface_Events();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.impl.InterfaceAttributeImpl <em>Interface Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.impl.InterfaceAttributeImpl
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getInterfaceAttribute()
		 * @generated
		 */
		EClass INTERFACE_ATTRIBUTE = eINSTANCE.getInterfaceAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_ATTRIBUTE__NAME = eINSTANCE.getInterfaceAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_ATTRIBUTE__DESCRIPTION = eINSTANCE.getInterfaceAttribute_Description();

		/**
		 * The meta object literal for the '<em><b>Typing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_ATTRIBUTE__TYPING = eINSTANCE.getInterfaceAttribute_Typing();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_ATTRIBUTE__TYPE_NAME = eINSTANCE.getInterfaceAttribute_TypeName();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_ATTRIBUTE__SCOPE = eINSTANCE.getInterfaceAttribute_Scope();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_ATTRIBUTE__READ_ONLY = eINSTANCE.getInterfaceAttribute_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getInterfaceAttribute_DefaultValue();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.impl.ClassAttributeImpl <em>Class Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.impl.ClassAttributeImpl
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getClassAttribute()
		 * @generated
		 */
		EClass CLASS_ATTRIBUTE = eINSTANCE.getClassAttribute();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_ATTRIBUTE__VISIBILITY = eINSTANCE.getClassAttribute_Visibility();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.impl.InterfaceMethodImpl <em>Interface Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.impl.InterfaceMethodImpl
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getInterfaceMethod()
		 * @generated
		 */
		EClass INTERFACE_METHOD = eINSTANCE.getInterfaceMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_METHOD__NAME = eINSTANCE.getInterfaceMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_METHOD__DESCRIPTION = eINSTANCE.getInterfaceMethod_Description();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_METHOD__SCOPE = eINSTANCE.getInterfaceMethod_Scope();

		/**
		 * The meta object literal for the '<em><b>Event Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_METHOD__EVENT_HANDLER = eINSTANCE.getInterfaceMethod_EventHandler();

		/**
		 * The meta object literal for the '<em><b>Event Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_METHOD__EVENT_CLASS = eINSTANCE.getInterfaceMethod_EventClass();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_METHOD__EVENT_NAME = eINSTANCE.getInterfaceMethod_EventName();

		/**
		 * The meta object literal for the '<em><b>Class Based Exceptions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_METHOD__CLASS_BASED_EXCEPTIONS = eINSTANCE.getInterfaceMethod_ClassBasedExceptions();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_METHOD__PARAMETERS = eINSTANCE.getInterfaceMethod_Parameters();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_METHOD__EXCEPTIONS = eINSTANCE.getInterfaceMethod_Exceptions();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.impl.ClassMethodImpl <em>Class Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.impl.ClassMethodImpl
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getClassMethod()
		 * @generated
		 */
		EClass CLASS_METHOD = eINSTANCE.getClassMethod();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_METHOD__VISIBILITY = eINSTANCE.getClassMethod_Visibility();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_METHOD__ABSTRACT = eINSTANCE.getClassMethod_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_METHOD__FINAL = eINSTANCE.getClassMethod_Final();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.impl.InterfaceEventImpl <em>Interface Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.impl.InterfaceEventImpl
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getInterfaceEvent()
		 * @generated
		 */
		EClass INTERFACE_EVENT = eINSTANCE.getInterfaceEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_EVENT__NAME = eINSTANCE.getInterfaceEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_EVENT__DESCRIPTION = eINSTANCE.getInterfaceEvent_Description();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_EVENT__SCOPE = eINSTANCE.getInterfaceEvent_Scope();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_EVENT__PARAMETERS = eINSTANCE.getInterfaceEvent_Parameters();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.impl.ClassEventImpl <em>Class Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.impl.ClassEventImpl
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getClassEvent()
		 * @generated
		 */
		EClass CLASS_EVENT = eINSTANCE.getClassEvent();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_EVENT__VISIBILITY = eINSTANCE.getClassEvent_Visibility();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.impl.MethodParameterImpl <em>Method Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.impl.MethodParameterImpl
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getMethodParameter()
		 * @generated
		 */
		EClass METHOD_PARAMETER = eINSTANCE.getMethodParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PARAMETER__NAME = eINSTANCE.getMethodParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_PARAMETER__DESCRIPTION = eINSTANCE.getMethodParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Declaration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PARAMETER__DECLARATION_TYPE = eINSTANCE.getMethodParameter_DeclarationType();

		/**
		 * The meta object literal for the '<em><b>Call By Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PARAMETER__CALL_BY_VALUE = eINSTANCE.getMethodParameter_CallByValue();

		/**
		 * The meta object literal for the '<em><b>Typing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PARAMETER__TYPING = eINSTANCE.getMethodParameter_Typing();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PARAMETER__TYPE_NAME = eINSTANCE.getMethodParameter_TypeName();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PARAMETER__DEFAULT_VALUE = eINSTANCE.getMethodParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_PARAMETER__OPTIONAL = eINSTANCE.getMethodParameter_Optional();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.impl.MethodExceptionImpl <em>Method Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.impl.MethodExceptionImpl
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getMethodException()
		 * @generated
		 */
		EClass METHOD_EXCEPTION = eINSTANCE.getMethodException();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_EXCEPTION__NAME = eINSTANCE.getMethodException_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_EXCEPTION__DESCRIPTION = eINSTANCE.getMethodException_Description();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.impl.EventParameterImpl <em>Event Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.impl.EventParameterImpl
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getEventParameter()
		 * @generated
		 */
		EClass EVENT_PARAMETER = eINSTANCE.getEventParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_PARAMETER__NAME = eINSTANCE.getEventParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_PARAMETER__DESCRIPTION = eINSTANCE.getEventParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Typing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_PARAMETER__TYPING = eINSTANCE.getEventParameter_Typing();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_PARAMETER__TYPE_NAME = eINSTANCE.getEventParameter_TypeName();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_PARAMETER__DEFAULT_VALUE = eINSTANCE.getEventParameter_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_PARAMETER__OPTIONAL = eINSTANCE.getEventParameter_Optional();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.impl.ABAPClassImpl <em>ABAP Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPClassImpl
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getABAPClass()
		 * @generated
		 */
		EClass ABAP_CLASS = eINSTANCE.getABAPClass();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABAP_CLASS__DESCRIPTION = eINSTANCE.getABAPClass_Description();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABAP_CLASS__COLLECTION = eINSTANCE.getABAPClass_Collection();

		/**
		 * The meta object literal for the '<em><b>Super Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABAP_CLASS__SUPER_CLASS_NAME = eINSTANCE.getABAPClass_SuperClassName();

		/**
		 * The meta object literal for the '<em><b>Creation Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABAP_CLASS__CREATION_SCOPE = eINSTANCE.getABAPClass_CreationScope();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABAP_CLASS__FINAL = eINSTANCE.getABAPClass_Final();

		/**
		 * The meta object literal for the '<em><b>Fixed Point Arithmetics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABAP_CLASS__FIXED_POINT_ARITHMETICS = eINSTANCE.getABAPClass_FixedPointArithmetics();

		/**
		 * The meta object literal for the '<em><b>Unicode Checked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABAP_CLASS__UNICODE_CHECKED = eINSTANCE.getABAPClass_UnicodeChecked();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABAP_CLASS__INTERFACES = eINSTANCE.getABAPClass_Interfaces();

		/**
		 * The meta object literal for the '<em><b>Friend Class Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABAP_CLASS__FRIEND_CLASS_NAMES = eINSTANCE.getABAPClass_FriendClassNames();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABAP_CLASS__ATTRIBUTES = eINSTANCE.getABAPClass_Attributes();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABAP_CLASS__METHODS = eINSTANCE.getABAPClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABAP_CLASS__EVENTS = eINSTANCE.getABAPClass_Events();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.impl.InterfaceImplementationImpl <em>Interface Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.impl.InterfaceImplementationImpl
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getInterfaceImplementation()
		 * @generated
		 */
		EClass INTERFACE_IMPLEMENTATION = eINSTANCE.getInterfaceImplementation();

		/**
		 * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_IMPLEMENTATION__INTERFACE_NAME = eINSTANCE.getInterfaceImplementation_InterfaceName();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_IMPLEMENTATION__ABSTRACT = eINSTANCE.getInterfaceImplementation_Abstract();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_IMPLEMENTATION__FINAL = eINSTANCE.getInterfaceImplementation_Final();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.AttributeScope <em>Attribute Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.AttributeScope
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getAttributeScope()
		 * @generated
		 */
		EEnum ATTRIBUTE_SCOPE = eINSTANCE.getAttributeScope();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.Visibility
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.AttributeTypingType <em>Attribute Typing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.AttributeTypingType
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getAttributeTypingType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPING_TYPE = eINSTANCE.getAttributeTypingType();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.MethodScope <em>Method Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.MethodScope
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getMethodScope()
		 * @generated
		 */
		EEnum METHOD_SCOPE = eINSTANCE.getMethodScope();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.MethodParameterDeclarationType <em>Method Parameter Declaration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.MethodParameterDeclarationType
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getMethodParameterDeclarationType()
		 * @generated
		 */
		EEnum METHOD_PARAMETER_DECLARATION_TYPE = eINSTANCE.getMethodParameterDeclarationType();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.abapobj.ClassCreationScope <em>Class Creation Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.abapobj.ClassCreationScope
		 * @see net.sf.rcer.rom.abapobj.impl.ABAPObjectsPackageImpl#getClassCreationScope()
		 * @generated
		 */
		EEnum CLASS_CREATION_SCOPE = eINSTANCE.getClassCreationScope();

	}

} //ABAPObjectsPackage
