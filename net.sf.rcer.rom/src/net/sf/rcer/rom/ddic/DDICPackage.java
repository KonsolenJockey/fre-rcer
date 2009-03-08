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
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.StructureImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 5;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__OBJECT_TYPE = ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__NAME = ROMPackage.REPOSITORY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__LOADED = ROMPackage.REPOSITORY_OBJECT__LOADED;

	/**
	 * The feature id for the '<em><b>Source System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__SOURCE_SYSTEM = ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__AUTHOR = ROMPackage.REPOSITORY_OBJECT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__GENERATED = ROMPackage.REPOSITORY_OBJECT__GENERATED;

	/**
	 * The feature id for the '<em><b>Original Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__ORIGINAL_LOCALE = ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE;

	/**
	 * The feature id for the '<em><b>Software Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__SOFTWARE_COMPONENT = ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Component Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__COMPONENT_RELEASE = ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__PACKAGE_NAME = ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__FIELDS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__COLLECTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.TableImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 6;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__OBJECT_TYPE = ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = ROMPackage.REPOSITORY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LOADED = ROMPackage.REPOSITORY_OBJECT__LOADED;

	/**
	 * The feature id for the '<em><b>Source System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SOURCE_SYSTEM = ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__AUTHOR = ROMPackage.REPOSITORY_OBJECT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__GENERATED = ROMPackage.REPOSITORY_OBJECT__GENERATED;

	/**
	 * The feature id for the '<em><b>Original Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ORIGINAL_LOCALE = ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE;

	/**
	 * The feature id for the '<em><b>Software Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__SOFTWARE_COMPONENT = ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Component Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COMPONENT_RELEASE = ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__PACKAGE_NAME = ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__FIELDS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLLECTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.StructureFieldImpl <em>Structure Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.StructureFieldImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getStructureField()
	 * @generated
	 */
	int STRUCTURE_FIELD = 7;

	/**
	 * The number of structural features of the '<em>Structure Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FIELD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.TableFieldImpl <em>Table Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.TableFieldImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getTableField()
	 * @generated
	 */
	int TABLE_FIELD = 8;

	/**
	 * The number of structural features of the '<em>Table Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FIELD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.NamedFieldImpl <em>Named Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.NamedFieldImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getNamedField()
	 * @generated
	 */
	int NAMED_FIELD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FIELD__NAME = STRUCTURE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Named Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FIELD_FEATURE_COUNT = STRUCTURE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.StructureInclusionImpl <em>Structure Inclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.StructureInclusionImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getStructureInclusion()
	 * @generated
	 */
	int STRUCTURE_INCLUSION = 10;

	/**
	 * The feature id for the '<em><b>Included Structure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INCLUSION__INCLUDED_STRUCTURE_NAME = STRUCTURE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INCLUSION__GROUP_NAME = STRUCTURE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INCLUSION__SUFFIX = STRUCTURE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Structure Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_INCLUSION_FEATURE_COUNT = STRUCTURE_FIELD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.SingleFieldImpl <em>Single Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.SingleFieldImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getSingleField()
	 * @generated
	 */
	int SINGLE_FIELD = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD__NAME = NAMED_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Reference Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD__REFERENCE_TABLE_NAME = NAMED_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD__REFERENCE_FIELD_NAME = NAMED_FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FIELD_FEATURE_COUNT = NAMED_FIELD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.DataElementFieldImpl <em>Data Element Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.DataElementFieldImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDataElementField()
	 * @generated
	 */
	int DATA_ELEMENT_FIELD = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FIELD__NAME = SINGLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Reference Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FIELD__REFERENCE_TABLE_NAME = SINGLE_FIELD__REFERENCE_TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Reference Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FIELD__REFERENCE_FIELD_NAME = SINGLE_FIELD__REFERENCE_FIELD_NAME;

	/**
	 * The feature id for the '<em><b>Data Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FIELD__DATA_ELEMENT_NAME = SINGLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Search Help Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FIELD__SEARCH_HELP_NAME = SINGLE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Search Help Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FIELD__SEARCH_HELP_FIELD = SINGLE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Element Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FIELD_FEATURE_COUNT = SINGLE_FIELD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.DirectFieldImpl <em>Direct Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.DirectFieldImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDirectField()
	 * @generated
	 */
	int DIRECT_FIELD = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_FIELD__NAME = SINGLE_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Reference Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_FIELD__REFERENCE_TABLE_NAME = SINGLE_FIELD__REFERENCE_TABLE_NAME;

	/**
	 * The feature id for the '<em><b>Reference Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_FIELD__REFERENCE_FIELD_NAME = SINGLE_FIELD__REFERENCE_FIELD_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_FIELD__DESCRIPTION = SINGLE_FIELD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dictionary Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_FIELD__DICTIONARY_DATA_TYPE = SINGLE_FIELD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_FIELD__LENGTH = SINGLE_FIELD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Decimals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_FIELD__DECIMALS = SINGLE_FIELD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Direct Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_FIELD_FEATURE_COUNT = SINGLE_FIELD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.StructuredFieldImpl <em>Structured Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.StructuredFieldImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getStructuredField()
	 * @generated
	 */
	int STRUCTURED_FIELD = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FIELD__NAME = NAMED_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Structure Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FIELD__STRUCTURE_NAME = NAMED_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structured Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_FIELD_FEATURE_COUNT = NAMED_FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.TabularFieldImpl <em>Tabular Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.TabularFieldImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getTabularField()
	 * @generated
	 */
	int TABULAR_FIELD = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_FIELD__NAME = NAMED_FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Table Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_FIELD__TABLE_TYPE_NAME = NAMED_FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tabular Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABULAR_FIELD_FEATURE_COUNT = NAMED_FIELD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.TableTypeImpl <em>Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.TableTypeImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getTableType()
	 * @generated
	 */
	int TABLE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__OBJECT_TYPE = ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__NAME = ROMPackage.REPOSITORY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__LOADED = ROMPackage.REPOSITORY_OBJECT__LOADED;

	/**
	 * The feature id for the '<em><b>Source System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__SOURCE_SYSTEM = ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__AUTHOR = ROMPackage.REPOSITORY_OBJECT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__GENERATED = ROMPackage.REPOSITORY_OBJECT__GENERATED;

	/**
	 * The feature id for the '<em><b>Original Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__ORIGINAL_LOCALE = ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE;

	/**
	 * The feature id for the '<em><b>Software Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__SOFTWARE_COMPONENT = ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Component Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__COMPONENT_RELEASE = ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__PACKAGE_NAME = ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__COLLECTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_FEATURE_COUNT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.ViewImpl <em>View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.ViewImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getView()
	 * @generated
	 */
	int VIEW = 17;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__OBJECT_TYPE = ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__NAME = ROMPackage.REPOSITORY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__LOADED = ROMPackage.REPOSITORY_OBJECT__LOADED;

	/**
	 * The feature id for the '<em><b>Source System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SOURCE_SYSTEM = ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__AUTHOR = ROMPackage.REPOSITORY_OBJECT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__GENERATED = ROMPackage.REPOSITORY_OBJECT__GENERATED;

	/**
	 * The feature id for the '<em><b>Original Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__ORIGINAL_LOCALE = ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE;

	/**
	 * The feature id for the '<em><b>Software Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__SOFTWARE_COMPONENT = ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Component Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__COMPONENT_RELEASE = ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__PACKAGE_NAME = ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW__COLLECTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_FEATURE_COUNT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.SearchHelpImpl <em>Search Help</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.SearchHelpImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getSearchHelp()
	 * @generated
	 */
	int SEARCH_HELP = 18;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HELP__OBJECT_TYPE = ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HELP__NAME = ROMPackage.REPOSITORY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HELP__LOADED = ROMPackage.REPOSITORY_OBJECT__LOADED;

	/**
	 * The feature id for the '<em><b>Source System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HELP__SOURCE_SYSTEM = ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HELP__AUTHOR = ROMPackage.REPOSITORY_OBJECT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HELP__GENERATED = ROMPackage.REPOSITORY_OBJECT__GENERATED;

	/**
	 * The feature id for the '<em><b>Original Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HELP__ORIGINAL_LOCALE = ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE;

	/**
	 * The feature id for the '<em><b>Software Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HELP__SOFTWARE_COMPONENT = ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Component Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HELP__COMPONENT_RELEASE = ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HELP__PACKAGE_NAME = ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HELP__COLLECTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Search Help</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HELP_FEATURE_COUNT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.impl.EnqueueObjectImpl <em>Enqueue Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.impl.EnqueueObjectImpl
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getEnqueueObject()
	 * @generated
	 */
	int ENQUEUE_OBJECT = 19;

	/**
	 * The feature id for the '<em><b>Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_OBJECT__OBJECT_TYPE = ROMPackage.REPOSITORY_OBJECT__OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_OBJECT__NAME = ROMPackage.REPOSITORY_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_OBJECT__LOADED = ROMPackage.REPOSITORY_OBJECT__LOADED;

	/**
	 * The feature id for the '<em><b>Source System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_OBJECT__SOURCE_SYSTEM = ROMPackage.REPOSITORY_OBJECT__SOURCE_SYSTEM;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_OBJECT__AUTHOR = ROMPackage.REPOSITORY_OBJECT__AUTHOR;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_OBJECT__GENERATED = ROMPackage.REPOSITORY_OBJECT__GENERATED;

	/**
	 * The feature id for the '<em><b>Original Locale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_OBJECT__ORIGINAL_LOCALE = ROMPackage.REPOSITORY_OBJECT__ORIGINAL_LOCALE;

	/**
	 * The feature id for the '<em><b>Software Component</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_OBJECT__SOFTWARE_COMPONENT = ROMPackage.REPOSITORY_OBJECT__SOFTWARE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Component Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_OBJECT__COMPONENT_RELEASE = ROMPackage.REPOSITORY_OBJECT__COMPONENT_RELEASE;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_OBJECT__PACKAGE_NAME = ROMPackage.REPOSITORY_OBJECT__PACKAGE_NAME;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_OBJECT__COLLECTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enqueue Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENQUEUE_OBJECT_FEATURE_COUNT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.DictionaryDataType <em>Dictionary Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.DictionaryDataType
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDictionaryDataType()
	 * @generated
	 */
	int DICTIONARY_DATA_TYPE = 20;


	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.ReferredObjectType <em>Referred Object Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.ReferredObjectType
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getReferredObjectType()
	 * @generated
	 */
	int REFERRED_OBJECT_TYPE = 21;

	/**
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.TypeKind <em>Type Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.TypeKind
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getTypeKind()
	 * @generated
	 */
	int TYPE_KIND = 22;


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
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see net.sf.rcer.rom.ddic.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.ddic.Structure#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see net.sf.rcer.rom.ddic.Structure#getFields()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Fields();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.rcer.rom.ddic.Structure#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection</em>'.
	 * @see net.sf.rcer.rom.ddic.Structure#getCollection()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Collection();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see net.sf.rcer.rom.ddic.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.rcer.rom.ddic.Table#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see net.sf.rcer.rom.ddic.Table#getFields()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Fields();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.rcer.rom.ddic.Table#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection</em>'.
	 * @see net.sf.rcer.rom.ddic.Table#getCollection()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Collection();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.StructureField <em>Structure Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Field</em>'.
	 * @see net.sf.rcer.rom.ddic.StructureField
	 * @generated
	 */
	EClass getStructureField();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.TableField <em>Table Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Field</em>'.
	 * @see net.sf.rcer.rom.ddic.TableField
	 * @generated
	 */
	EClass getTableField();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.NamedField <em>Named Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Field</em>'.
	 * @see net.sf.rcer.rom.ddic.NamedField
	 * @generated
	 */
	EClass getNamedField();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.NamedField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.rcer.rom.ddic.NamedField#getName()
	 * @see #getNamedField()
	 * @generated
	 */
	EAttribute getNamedField_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.StructureInclusion <em>Structure Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Inclusion</em>'.
	 * @see net.sf.rcer.rom.ddic.StructureInclusion
	 * @generated
	 */
	EClass getStructureInclusion();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.StructureInclusion#getIncludedStructureName <em>Included Structure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Included Structure Name</em>'.
	 * @see net.sf.rcer.rom.ddic.StructureInclusion#getIncludedStructureName()
	 * @see #getStructureInclusion()
	 * @generated
	 */
	EAttribute getStructureInclusion_IncludedStructureName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.StructureInclusion#getGroupName <em>Group Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Name</em>'.
	 * @see net.sf.rcer.rom.ddic.StructureInclusion#getGroupName()
	 * @see #getStructureInclusion()
	 * @generated
	 */
	EAttribute getStructureInclusion_GroupName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.StructureInclusion#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see net.sf.rcer.rom.ddic.StructureInclusion#getSuffix()
	 * @see #getStructureInclusion()
	 * @generated
	 */
	EAttribute getStructureInclusion_Suffix();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.SingleField <em>Single Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Field</em>'.
	 * @see net.sf.rcer.rom.ddic.SingleField
	 * @generated
	 */
	EClass getSingleField();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.SingleField#getReferenceTableName <em>Reference Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Table Name</em>'.
	 * @see net.sf.rcer.rom.ddic.SingleField#getReferenceTableName()
	 * @see #getSingleField()
	 * @generated
	 */
	EAttribute getSingleField_ReferenceTableName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.SingleField#getReferenceFieldName <em>Reference Field Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Field Name</em>'.
	 * @see net.sf.rcer.rom.ddic.SingleField#getReferenceFieldName()
	 * @see #getSingleField()
	 * @generated
	 */
	EAttribute getSingleField_ReferenceFieldName();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.DataElementField <em>Data Element Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Element Field</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElementField
	 * @generated
	 */
	EClass getDataElementField();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElementField#getDataElementName <em>Data Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Element Name</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElementField#getDataElementName()
	 * @see #getDataElementField()
	 * @generated
	 */
	EAttribute getDataElementField_DataElementName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElementField#getSearchHelpName <em>Search Help Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Help Name</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElementField#getSearchHelpName()
	 * @see #getDataElementField()
	 * @generated
	 */
	EAttribute getDataElementField_SearchHelpName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DataElementField#getSearchHelpField <em>Search Help Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Help Field</em>'.
	 * @see net.sf.rcer.rom.ddic.DataElementField#getSearchHelpField()
	 * @see #getDataElementField()
	 * @generated
	 */
	EAttribute getDataElementField_SearchHelpField();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.DirectField <em>Direct Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Field</em>'.
	 * @see net.sf.rcer.rom.ddic.DirectField
	 * @generated
	 */
	EClass getDirectField();

	/**
	 * Returns the meta object for the map '{@link net.sf.rcer.rom.ddic.DirectField#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Description</em>'.
	 * @see net.sf.rcer.rom.ddic.DirectField#getDescription()
	 * @see #getDirectField()
	 * @generated
	 */
	EReference getDirectField_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DirectField#getDictionaryDataType <em>Dictionary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dictionary Data Type</em>'.
	 * @see net.sf.rcer.rom.ddic.DirectField#getDictionaryDataType()
	 * @see #getDirectField()
	 * @generated
	 */
	EAttribute getDirectField_DictionaryDataType();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DirectField#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see net.sf.rcer.rom.ddic.DirectField#getLength()
	 * @see #getDirectField()
	 * @generated
	 */
	EAttribute getDirectField_Length();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.DirectField#getDecimals <em>Decimals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimals</em>'.
	 * @see net.sf.rcer.rom.ddic.DirectField#getDecimals()
	 * @see #getDirectField()
	 * @generated
	 */
	EAttribute getDirectField_Decimals();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.StructuredField <em>Structured Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Field</em>'.
	 * @see net.sf.rcer.rom.ddic.StructuredField
	 * @generated
	 */
	EClass getStructuredField();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.StructuredField#getStructureName <em>Structure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure Name</em>'.
	 * @see net.sf.rcer.rom.ddic.StructuredField#getStructureName()
	 * @see #getStructuredField()
	 * @generated
	 */
	EAttribute getStructuredField_StructureName();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.TabularField <em>Tabular Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabular Field</em>'.
	 * @see net.sf.rcer.rom.ddic.TabularField
	 * @generated
	 */
	EClass getTabularField();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.rcer.rom.ddic.TabularField#getTableTypeName <em>Table Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Type Name</em>'.
	 * @see net.sf.rcer.rom.ddic.TabularField#getTableTypeName()
	 * @see #getTabularField()
	 * @generated
	 */
	EAttribute getTabularField_TableTypeName();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Type</em>'.
	 * @see net.sf.rcer.rom.ddic.TableType
	 * @generated
	 */
	EClass getTableType();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.rcer.rom.ddic.TableType#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection</em>'.
	 * @see net.sf.rcer.rom.ddic.TableType#getCollection()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Collection();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.View <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View</em>'.
	 * @see net.sf.rcer.rom.ddic.View
	 * @generated
	 */
	EClass getView();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.rcer.rom.ddic.View#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection</em>'.
	 * @see net.sf.rcer.rom.ddic.View#getCollection()
	 * @see #getView()
	 * @generated
	 */
	EReference getView_Collection();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.SearchHelp <em>Search Help</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Help</em>'.
	 * @see net.sf.rcer.rom.ddic.SearchHelp
	 * @generated
	 */
	EClass getSearchHelp();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.rcer.rom.ddic.SearchHelp#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection</em>'.
	 * @see net.sf.rcer.rom.ddic.SearchHelp#getCollection()
	 * @see #getSearchHelp()
	 * @generated
	 */
	EReference getSearchHelp_Collection();

	/**
	 * Returns the meta object for class '{@link net.sf.rcer.rom.ddic.EnqueueObject <em>Enqueue Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enqueue Object</em>'.
	 * @see net.sf.rcer.rom.ddic.EnqueueObject
	 * @generated
	 */
	EClass getEnqueueObject();

	/**
	 * Returns the meta object for the container reference '{@link net.sf.rcer.rom.ddic.EnqueueObject#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Collection</em>'.
	 * @see net.sf.rcer.rom.ddic.EnqueueObject#getCollection()
	 * @see #getEnqueueObject()
	 * @generated
	 */
	EReference getEnqueueObject_Collection();

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
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.StructureImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__FIELDS = eINSTANCE.getStructure_Fields();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__COLLECTION = eINSTANCE.getStructure_Collection();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.TableImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__FIELDS = eINSTANCE.getTable_Fields();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLLECTION = eINSTANCE.getTable_Collection();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.StructureFieldImpl <em>Structure Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.StructureFieldImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getStructureField()
		 * @generated
		 */
		EClass STRUCTURE_FIELD = eINSTANCE.getStructureField();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.TableFieldImpl <em>Table Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.TableFieldImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getTableField()
		 * @generated
		 */
		EClass TABLE_FIELD = eINSTANCE.getTableField();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.NamedFieldImpl <em>Named Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.NamedFieldImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getNamedField()
		 * @generated
		 */
		EClass NAMED_FIELD = eINSTANCE.getNamedField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_FIELD__NAME = eINSTANCE.getNamedField_Name();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.StructureInclusionImpl <em>Structure Inclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.StructureInclusionImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getStructureInclusion()
		 * @generated
		 */
		EClass STRUCTURE_INCLUSION = eINSTANCE.getStructureInclusion();

		/**
		 * The meta object literal for the '<em><b>Included Structure Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_INCLUSION__INCLUDED_STRUCTURE_NAME = eINSTANCE.getStructureInclusion_IncludedStructureName();

		/**
		 * The meta object literal for the '<em><b>Group Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_INCLUSION__GROUP_NAME = eINSTANCE.getStructureInclusion_GroupName();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_INCLUSION__SUFFIX = eINSTANCE.getStructureInclusion_Suffix();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.SingleFieldImpl <em>Single Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.SingleFieldImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getSingleField()
		 * @generated
		 */
		EClass SINGLE_FIELD = eINSTANCE.getSingleField();

		/**
		 * The meta object literal for the '<em><b>Reference Table Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_FIELD__REFERENCE_TABLE_NAME = eINSTANCE.getSingleField_ReferenceTableName();

		/**
		 * The meta object literal for the '<em><b>Reference Field Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_FIELD__REFERENCE_FIELD_NAME = eINSTANCE.getSingleField_ReferenceFieldName();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.DataElementFieldImpl <em>Data Element Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.DataElementFieldImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDataElementField()
		 * @generated
		 */
		EClass DATA_ELEMENT_FIELD = eINSTANCE.getDataElementField();

		/**
		 * The meta object literal for the '<em><b>Data Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT_FIELD__DATA_ELEMENT_NAME = eINSTANCE.getDataElementField_DataElementName();

		/**
		 * The meta object literal for the '<em><b>Search Help Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT_FIELD__SEARCH_HELP_NAME = eINSTANCE.getDataElementField_SearchHelpName();

		/**
		 * The meta object literal for the '<em><b>Search Help Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ELEMENT_FIELD__SEARCH_HELP_FIELD = eINSTANCE.getDataElementField_SearchHelpField();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.DirectFieldImpl <em>Direct Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.DirectFieldImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDirectField()
		 * @generated
		 */
		EClass DIRECT_FIELD = eINSTANCE.getDirectField();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECT_FIELD__DESCRIPTION = eINSTANCE.getDirectField_Description();

		/**
		 * The meta object literal for the '<em><b>Dictionary Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECT_FIELD__DICTIONARY_DATA_TYPE = eINSTANCE.getDirectField_DictionaryDataType();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECT_FIELD__LENGTH = eINSTANCE.getDirectField_Length();

		/**
		 * The meta object literal for the '<em><b>Decimals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECT_FIELD__DECIMALS = eINSTANCE.getDirectField_Decimals();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.StructuredFieldImpl <em>Structured Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.StructuredFieldImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getStructuredField()
		 * @generated
		 */
		EClass STRUCTURED_FIELD = eINSTANCE.getStructuredField();

		/**
		 * The meta object literal for the '<em><b>Structure Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURED_FIELD__STRUCTURE_NAME = eINSTANCE.getStructuredField_StructureName();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.TabularFieldImpl <em>Tabular Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.TabularFieldImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getTabularField()
		 * @generated
		 */
		EClass TABULAR_FIELD = eINSTANCE.getTabularField();

		/**
		 * The meta object literal for the '<em><b>Table Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABULAR_FIELD__TABLE_TYPE_NAME = eINSTANCE.getTabularField_TableTypeName();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.TableTypeImpl <em>Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.TableTypeImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getTableType()
		 * @generated
		 */
		EClass TABLE_TYPE = eINSTANCE.getTableType();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__COLLECTION = eINSTANCE.getTableType_Collection();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.ViewImpl <em>View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.ViewImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getView()
		 * @generated
		 */
		EClass VIEW = eINSTANCE.getView();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW__COLLECTION = eINSTANCE.getView_Collection();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.SearchHelpImpl <em>Search Help</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.SearchHelpImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getSearchHelp()
		 * @generated
		 */
		EClass SEARCH_HELP = eINSTANCE.getSearchHelp();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_HELP__COLLECTION = eINSTANCE.getSearchHelp_Collection();

		/**
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.impl.EnqueueObjectImpl <em>Enqueue Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.impl.EnqueueObjectImpl
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getEnqueueObject()
		 * @generated
		 */
		EClass ENQUEUE_OBJECT = eINSTANCE.getEnqueueObject();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENQUEUE_OBJECT__COLLECTION = eINSTANCE.getEnqueueObject_Collection();

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
