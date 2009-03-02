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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = ROMPackage.REPOSITORY_OBJECT__NAME;

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
	 * The feature id for the '<em><b>Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CONTAINER = ROMPackage.REPOSITORY_OBJECT__CONTAINER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__PACKAGE = ROMPackage.REPOSITORY_OBJECT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__COLLECTION = ROMPackage.REPOSITORY_OBJECT__COLLECTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DESCRIPTION = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dictionary Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DICTIONARY_DATA_TYPE = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__LENGTH = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__OUTPUT_LENGTH = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Decimals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DECIMALS = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CASE_SENSITIVE = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__SIGNED = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Value List Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VALUE_LIST_FIXED = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Value Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VALUE_TABLE_NAME = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Conversion Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CONVERSION_EXIT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__VALUES = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = ROMPackage.REPOSITORY_OBJECT_FEATURE_COUNT + 11;

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
	 * The meta object id for the '{@link net.sf.rcer.rom.ddic.DictionaryDataType <em>Dictionary Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.rcer.rom.ddic.DictionaryDataType
	 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDictionaryDataType()
	 * @generated
	 */
	int DICTIONARY_DATA_TYPE = 4;


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
	 * Returns the meta object for enum '{@link net.sf.rcer.rom.ddic.DictionaryDataType <em>Dictionary Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dictionary Data Type</em>'.
	 * @see net.sf.rcer.rom.ddic.DictionaryDataType
	 * @generated
	 */
	EEnum getDictionaryDataType();

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
		 * The meta object literal for the '{@link net.sf.rcer.rom.ddic.DictionaryDataType <em>Dictionary Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.rcer.rom.ddic.DictionaryDataType
		 * @see net.sf.rcer.rom.ddic.impl.DDICPackageImpl#getDictionaryDataType()
		 * @generated
		 */
		EEnum DICTIONARY_DATA_TYPE = eINSTANCE.getDictionaryDataType();

	}

} //DDICPackage
