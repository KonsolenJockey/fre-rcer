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
package net.sf.rcer.rom.ddic;

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
 * @see net.sf.rcer.rom.ddic.DDICFactory
 * @model kind="package"
 * @generated
 */
public interface DDICPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ddic"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://rcer.sf.net/rom/ddic"; //$NON-NLS-1$

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
	DDICPackage eINSTANCE = net.sf.rcer.rom.ddic.impl.DDICPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.DomainImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__OBJECT_TYPE = ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = ROMPackage.REPOSITORY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LOADED = ROMPackage.REPOSITORY_OBJECT__LOADED;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PROGRAM_ID = ROMPackage.REPOSITORY_OBJECT__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Object Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__OBJECT_TYPE_ID = ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Source System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SOURCE_SYSTEM = ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__AUTHOR = ROMPackage.REPOSITORY_OBJECT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__GENERATED = ROMPackage.REPOSITORY_OBJECT__GENERATED;

	/**
	 * The feature id for the '<em><b>Original Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ORIGINAL_LOCALE = ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE;

	/**
	 * The feature id for the '<em><b>Software Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SOFTWARE_COMPONENT = ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Component Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__COMPONENT_RELEASE = ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PACKAGE_NAME = ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__COLLECTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DESCRIPTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dictionary Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DICTIONARY_DATA_TYPE = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LENGTH = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__OUTPUT_LENGTH = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Decimals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DECIMALS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CASE_SENSITIVE = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SIGNED = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Value List Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VALUE_LIST_FIXED = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Value Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VALUE_TABLE_NAME = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Conversion Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CONVERSION_EXIT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VALUES = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.DomainValueImpl <em>Domain Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.DomainValueImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDomainValue()
	 * @generated
	 */
	int DOMAIN_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE__DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE__RANGE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Domain Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.DomainValueSingleImpl <em>Domain Value Single</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.DomainValueSingleImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDomainValueSingle()
	 * @generated
	 */
	int DOMAIN_VALUE_SINGLE = 2;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_SINGLE__DOMAIN = DOMAIN_VALUE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_SINGLE__POSITION = DOMAIN_VALUE__POSITION;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_SINGLE__RANGE = DOMAIN_VALUE__RANGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_SINGLE__DESCRIPTION = DOMAIN_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_SINGLE__VALUE = DOMAIN_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Value Single</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_SINGLE_FEATURE_COUNT = DOMAIN_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.DomainValueRangeImpl <em>Domain Value Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.DomainValueRangeImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDomainValueRange()
	 * @generated
	 */
	int DOMAIN_VALUE_RANGE = 3;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_RANGE__DOMAIN = DOMAIN_VALUE__DOMAIN;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_RANGE__POSITION = DOMAIN_VALUE__POSITION;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_RANGE__RANGE = DOMAIN_VALUE__RANGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_RANGE__DESCRIPTION = DOMAIN_VALUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Lower Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_RANGE__LOWER_BOUNDARY = DOMAIN_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Boundary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_RANGE__UPPER_BOUNDARY = DOMAIN_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Value Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_VALUE_RANGE_FEATURE_COUNT = DOMAIN_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.DataElementImpl <em>Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.DataElementImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDataElement()
	 * @generated
	 */
	int DATA_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__OBJECT_TYPE = ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__NAME = ROMPackage.REPOSITORY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__LOADED = ROMPackage.REPOSITORY_OBJECT__LOADED;

	/**
	 * The feature id for the '<em><b>Program ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__PROGRAM_ID = ROMPackage.REPOSITORY_OBJECT__PROGRAM_ID;

	/**
	 * The feature id for the '<em><b>Object Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__OBJECT_TYPE_ID = ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE_ID;

	/**
	 * The feature id for the '<em><b>Source System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__SOURCE_SYSTEM = ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__AUTHOR = ROMPackage.REPOSITORY_OBJECT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__GENERATED = ROMPackage.REPOSITORY_OBJECT__GENERATED;

	/**
	 * The feature id for the '<em><b>Original Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ORIGINAL_LOCALE = ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE;

	/**
	 * The feature id for the '<em><b>Software Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__SOFTWARE_COMPONENT = ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Component Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__COMPONENT_RELEASE = ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__PACKAGE_NAME = ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__COLLECTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DESCRIPTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__HEADING = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Heading Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__MAX_HEADING_LENGTH = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Short Text</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__SHORT_TEXT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Short Text Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__MAX_SHORT_TEXT_LENGTH = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Medium Text</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__MEDIUM_TEXT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Medium Text Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__MAX_MEDIUM_TEXT_LENGTH = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Long Text</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__LONG_TEXT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Max Long Text Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__MAX_LONG_TEXT_LENGTH = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__TYPE_NAME = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Parameter ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__PARAMETER_ID = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Logged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__LOGGED = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Value Help Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__VALUE_HELP_NAME = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Value Help Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__VALUE_HELP_FIELD_NAME = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Default Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DEFAULT_FIELD_NAME = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Dictionary Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DICTIONARY_DATA_TYPE = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__LENGTH = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Output Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__OUTPUT_LENGTH = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Decimals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DECIMALS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CASE_SENSITIVE = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__SIGNED = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Value List Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__VALUE_LIST_FIXED = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Value Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__VALUE_TABLE_NAME = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Conversion Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CONVERSION_EXIT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Type Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__TYPE_KIND = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Referred Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__REFERRED_TYPE = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 26;

	/**
	 * The number of structural features of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FEATURE_COUNT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 27;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.DictionaryDataType <em>Dictionary Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.DictionaryDataType
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDictionaryDataType()
	 * @generated
	 */
	int DICTIONARY_DATA_TYPE = 5;


	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.ReferredObjectType <em>Referred Object Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.ReferredObjectType
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getReferredObjectType()
	 * @generated
	 */
	int REFERRED_OBJECT_TYPE = 6;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.TypeKind <em>Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.TypeKind
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getTypeKind()
	 * @generated
	 */
	int TYPE_KIND = 7;


	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see net.sf.rcer.rom.ddic.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.rcer.rom.ddic.Domain#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection</em>'.
	 * @see net.sf.rcer.rom.ddic.Domain#getCollection()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Collection();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.ddic.Domain#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Description</em>'.
	 * @see net.sf.rcer.rom.ddic.Domain#getDescription()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.Domain#getDictionaryDataType <em>Dictionary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dictionary Data Type</em>'.
	 * @see net.sf.rcer.rom.ddic.Domain#getDictionaryDataType()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_DictionaryDataType();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.Domain#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see net.sf.rcer.rom.ddic.Domain#getLength()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Length();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.Domain#getOutputLength <em>Output Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Length</em>'.
	 * @see net.sf.rcer.rom.ddic.Domain#getOutputLength()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_OutputLength();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.Domain#getDecimals <em>Decimals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimals</em>'.
	 * @see net.sf.rcer.rom.ddic.Domain#getDecimals()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Decimals();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.Domain#isCaseSensitive <em>Case Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Sensitive</em>'.
	 * @see net.sf.rcer.rom.ddic.Domain#isCaseSensitive()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_CaseSensitive();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.Domain#isSigned <em>Signed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signed</em>'.
	 * @see net.sf.rcer.rom.ddic.Domain#isSigned()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Signed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.Domain#isValueListFixed <em>Value List Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value List Fixed</em>'.
	 * @see net.sf.rcer.rom.ddic.Domain#isValueListFixed()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_ValueListFixed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.Domain#getValueTableName <em>Value Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Table Name</em>'.
	 * @see net.sf.rcer.rom.ddic.Domain#getValueTableName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_ValueTableName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.Domain#getConversionExit <em>Conversion Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Exit</em>'.
	 * @see net.sf.rcer.rom.ddic.Domain#getConversionExit()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_ConversionExit();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.ddic.Domain#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see net.sf.rcer.rom.ddic.Domain#getValues()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_Values();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.DomainValue <em>Domain Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Value</em>'.
	 * @see net.sf.rcer.rom.ddic.DomainValue
	 * @generated
	 */
	EClass getDomainValue();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.rcer.rom.ddic.DomainValue#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Domain</em>'.
	 * @see net.sf.rcer.rom.ddic.DomainValue#getDomain()
	 * @see #getDomainValue()
	 * @generated
	 */
	EReference getDomainValue_Domain();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DomainValue#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see net.sf.rcer.rom.ddic.DomainValue#getPosition()
	 * @see #getDomainValue()
	 * @generated
	 */
	EAttribute getDomainValue_Position();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DomainValue#isRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see net.sf.rcer.rom.ddic.DomainValue#isRange()
	 * @see #getDomainValue()
	 * @generated
	 */
	EAttribute getDomainValue_Range();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.ddic.DomainValue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Description</em>'.
	 * @see net.sf.rcer.rom.ddic.DomainValue#getDescription()
	 * @see #getDomainValue()
	 * @generated
	 */
	EReference getDomainValue_Description();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.DomainValueSingle <em>Domain Value Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Value Single</em>'.
	 * @see net.sf.rcer.rom.ddic.DomainValueSingle
	 * @generated
	 */
	EClass getDomainValueSingle();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DomainValueSingle#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.rcer.rom.ddic.DomainValueSingle#getValue()
	 * @see #getDomainValueSingle()
	 * @generated
	 */
	EAttribute getDomainValueSingle_Value();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.DomainValueRange <em>Domain Value Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Value Range</em>'.
	 * @see net.sf.rcer.rom.ddic.DomainValueRange
	 * @generated
	 */
	EClass getDomainValueRange();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DomainValueRange#getLowerBoundary <em>Lower Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Boundary</em>'.
	 * @see net.sf.rcer.rom.ddic.DomainValueRange#getLowerBoundary()
	 * @see #getDomainValueRange()
	 * @generated
	 */
	EAttribute getDomainValueRange_LowerBoundary();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DomainValueRange#getUpperBoundary <em>Upper Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Boundary</em>'.
	 * @see net.sf.rcer.rom.ddic.DomainValueRange#getUpperBoundary()
	 * @see #getDomainValueRange()
	 * @generated
	 */
	EAttribute getDomainValueRange_UpperBoundary();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.DataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Element</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement
	 * @generated
	 */
	EClass getDataElement();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.rcer.rom.ddic.DataElement#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getCollection()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_Collection();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.ddic.DataElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Description</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getDescription()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_Description();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.ddic.DataElement#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Heading</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getHeading()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_Heading();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getMaxHeadingLength <em>Max Heading Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Heading Length</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getMaxHeadingLength()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_MaxHeadingLength();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.ddic.DataElement#getShortText <em>Short Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Short Text</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getShortText()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_ShortText();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getMaxShortTextLength <em>Max Short Text Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Short Text Length</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getMaxShortTextLength()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_MaxShortTextLength();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.ddic.DataElement#getMediumText <em>Medium Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Medium Text</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getMediumText()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_MediumText();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getMaxMediumTextLength <em>Max Medium Text Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Medium Text Length</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getMaxMediumTextLength()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_MaxMediumTextLength();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.ddic.DataElement#getLongText <em>Long Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Long Text</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getLongText()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_LongText();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getMaxLongTextLength <em>Max Long Text Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Long Text Length</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getMaxLongTextLength()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_MaxLongTextLength();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getTypeName()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getParameterID <em>Parameter ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter ID</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getParameterID()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_ParameterID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#isLogged <em>Logged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logged</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#isLogged()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_Logged();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getValueHelpName <em>Value Help Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Help Name</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getValueHelpName()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_ValueHelpName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getValueHelpFieldName <em>Value Help Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Help Field Name</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getValueHelpFieldName()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_ValueHelpFieldName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getDefaultFieldName <em>Default Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Field Name</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getDefaultFieldName()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_DefaultFieldName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getDictionaryDataType <em>Dictionary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dictionary Data Type</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getDictionaryDataType()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_DictionaryDataType();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getLength()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_Length();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getOutputLength <em>Output Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Length</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getOutputLength()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_OutputLength();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getDecimals <em>Decimals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimals</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getDecimals()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_Decimals();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#isCaseSensitive <em>Case Sensitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Sensitive</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#isCaseSensitive()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_CaseSensitive();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#isSigned <em>Signed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signed</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#isSigned()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_Signed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#isValueListFixed <em>Value List Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value List Fixed</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#isValueListFixed()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_ValueListFixed();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getValueTableName <em>Value Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Table Name</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getValueTableName()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_ValueTableName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getConversionExit <em>Conversion Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion Exit</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getConversionExit()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_ConversionExit();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getTypeKind <em>Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Kind</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getTypeKind()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_TypeKind();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElement#getReferredType <em>Referred Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referred Type</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElement#getReferredType()
	 * @see #getDataElement()
	 * @generated
	 */
	EAttribute getDataElement_ReferredType();

	/**
	 * Returns the meta object for enum '{@link net.sf.rcer.rom.ddic.DictionaryDataType <em>Dictionary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dictionary Data Type</em>'.
	 * @see net.sf.rcer.rom.ddic.DictionaryDataType
	 * @generated
	 */
	EEnum getDictionaryDataType();

	/**
	 * Returns the meta object for enum '{@link net.sf.rcer.rom.ddic.ReferredObjectType <em>Referred Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Referred Object Type</em>'.
	 * @see net.sf.rcer.rom.ddic.ReferredObjectType
	 * @generated
	 */
	EEnum getReferredObjectType();

	/**
	 * Returns the meta object for enum '{@link net.sf.rcer.rom.ddic.TypeKind <em>Type Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Kind</em>'.
	 * @see net.sf.rcer.rom.ddic.TypeKind
	 * @generated
	 */
	EEnum getTypeKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DDICFactory getDDICFactory();

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
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.DomainImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__COLLECTION = eINSTANCE.getDomain_Collection();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__DESCRIPTION = eINSTANCE.getDomain_Description();

		/**
		 * The meta object literal for the '<em><b>Dictionary Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__DICTIONARY_DATA_TYPE = eINSTANCE.getDomain_DictionaryDataType();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__LENGTH = eINSTANCE.getDomain_Length();

		/**
		 * The meta object literal for the '<em><b>Output Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__OUTPUT_LENGTH = eINSTANCE.getDomain_OutputLength();

		/**
		 * The meta object literal for the '<em><b>Decimals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__DECIMALS = eINSTANCE.getDomain_Decimals();

		/**
		 * The meta object literal for the '<em><b>Case Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__CASE_SENSITIVE = eINSTANCE.getDomain_CaseSensitive();

		/**
		 * The meta object literal for the '<em><b>Signed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__SIGNED = eINSTANCE.getDomain_Signed();

		/**
		 * The meta object literal for the '<em><b>Value List Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__VALUE_LIST_FIXED = eINSTANCE.getDomain_ValueListFixed();

		/**
		 * The meta object literal for the '<em><b>Value Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__VALUE_TABLE_NAME = eINSTANCE.getDomain_ValueTableName();

		/**
		 * The meta object literal for the '<em><b>Conversion Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__CONVERSION_EXIT = eINSTANCE.getDomain_ConversionExit();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__VALUES = eINSTANCE.getDomain_Values();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.DomainValueImpl <em>Domain Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.DomainValueImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDomainValue()
		 * @generated
		 */
		EClass DOMAIN_VALUE = eINSTANCE.getDomainValue();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_VALUE__DOMAIN = eINSTANCE.getDomainValue_Domain();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_VALUE__POSITION = eINSTANCE.getDomainValue_Position();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_VALUE__RANGE = eINSTANCE.getDomainValue_Range();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_VALUE__DESCRIPTION = eINSTANCE.getDomainValue_Description();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.DomainValueSingleImpl <em>Domain Value Single</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.DomainValueSingleImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDomainValueSingle()
		 * @generated
		 */
		EClass DOMAIN_VALUE_SINGLE = eINSTANCE.getDomainValueSingle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_VALUE_SINGLE__VALUE = eINSTANCE.getDomainValueSingle_Value();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.DomainValueRangeImpl <em>Domain Value Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.DomainValueRangeImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDomainValueRange()
		 * @generated
		 */
		EClass DOMAIN_VALUE_RANGE = eINSTANCE.getDomainValueRange();

		/**
		 * The meta object literal for the '<em><b>Lower Boundary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_VALUE_RANGE__LOWER_BOUNDARY = eINSTANCE.getDomainValueRange_LowerBoundary();

		/**
		 * The meta object literal for the '<em><b>Upper Boundary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_VALUE_RANGE__UPPER_BOUNDARY = eINSTANCE.getDomainValueRange_UpperBoundary();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.DataElementImpl <em>Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.DataElementImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDataElement()
		 * @generated
		 */
		EClass DATA_ELEMENT = eINSTANCE.getDataElement();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__COLLECTION = eINSTANCE.getDataElement_Collection();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__DESCRIPTION = eINSTANCE.getDataElement_Description();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__HEADING = eINSTANCE.getDataElement_Heading();

		/**
		 * The meta object literal for the '<em><b>Max Heading Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__MAX_HEADING_LENGTH = eINSTANCE.getDataElement_MaxHeadingLength();

		/**
		 * The meta object literal for the '<em><b>Short Text</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__SHORT_TEXT = eINSTANCE.getDataElement_ShortText();

		/**
		 * The meta object literal for the '<em><b>Max Short Text Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__MAX_SHORT_TEXT_LENGTH = eINSTANCE.getDataElement_MaxShortTextLength();

		/**
		 * The meta object literal for the '<em><b>Medium Text</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__MEDIUM_TEXT = eINSTANCE.getDataElement_MediumText();

		/**
		 * The meta object literal for the '<em><b>Max Medium Text Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__MAX_MEDIUM_TEXT_LENGTH = eINSTANCE.getDataElement_MaxMediumTextLength();

		/**
		 * The meta object literal for the '<em><b>Long Text</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__LONG_TEXT = eINSTANCE.getDataElement_LongText();

		/**
		 * The meta object literal for the '<em><b>Max Long Text Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__MAX_LONG_TEXT_LENGTH = eINSTANCE.getDataElement_MaxLongTextLength();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__TYPE_NAME = eINSTANCE.getDataElement_TypeName();

		/**
		 * The meta object literal for the '<em><b>Parameter ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__PARAMETER_ID = eINSTANCE.getDataElement_ParameterID();

		/**
		 * The meta object literal for the '<em><b>Logged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__LOGGED = eINSTANCE.getDataElement_Logged();

		/**
		 * The meta object literal for the '<em><b>Value Help Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__VALUE_HELP_NAME = eINSTANCE.getDataElement_ValueHelpName();

		/**
		 * The meta object literal for the '<em><b>Value Help Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__VALUE_HELP_FIELD_NAME = eINSTANCE.getDataElement_ValueHelpFieldName();

		/**
		 * The meta object literal for the '<em><b>Default Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__DEFAULT_FIELD_NAME = eINSTANCE.getDataElement_DefaultFieldName();

		/**
		 * The meta object literal for the '<em><b>Dictionary Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__DICTIONARY_DATA_TYPE = eINSTANCE.getDataElement_DictionaryDataType();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__LENGTH = eINSTANCE.getDataElement_Length();

		/**
		 * The meta object literal for the '<em><b>Output Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__OUTPUT_LENGTH = eINSTANCE.getDataElement_OutputLength();

		/**
		 * The meta object literal for the '<em><b>Decimals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__DECIMALS = eINSTANCE.getDataElement_Decimals();

		/**
		 * The meta object literal for the '<em><b>Case Sensitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__CASE_SENSITIVE = eINSTANCE.getDataElement_CaseSensitive();

		/**
		 * The meta object literal for the '<em><b>Signed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__SIGNED = eINSTANCE.getDataElement_Signed();

		/**
		 * The meta object literal for the '<em><b>Value List Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__VALUE_LIST_FIXED = eINSTANCE.getDataElement_ValueListFixed();

		/**
		 * The meta object literal for the '<em><b>Value Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__VALUE_TABLE_NAME = eINSTANCE.getDataElement_ValueTableName();

		/**
		 * The meta object literal for the '<em><b>Conversion Exit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__CONVERSION_EXIT = eINSTANCE.getDataElement_ConversionExit();

		/**
		 * The meta object literal for the '<em><b>Type Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__TYPE_KIND = eINSTANCE.getDataElement_TypeKind();

		/**
		 * The meta object literal for the '<em><b>Referred Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT__REFERRED_TYPE = eINSTANCE.getDataElement_ReferredType();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.DictionaryDataType <em>Dictionary Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.DictionaryDataType
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDictionaryDataType()
		 * @generated
		 */
		EEnum DICTIONARY_DATA_TYPE = eINSTANCE.getDictionaryDataType();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.ReferredObjectType <em>Referred Object Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.ReferredObjectType
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getReferredObjectType()
		 * @generated
		 */
		EEnum REFERRED_OBJECT_TYPE = eINSTANCE.getReferredObjectType();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.TypeKind <em>Type Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.TypeKind
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getTypeKind()
		 * @generated
		 */
		EEnum TYPE_KIND = eINSTANCE.getTypeKind();

	}

} //DDICPackage
