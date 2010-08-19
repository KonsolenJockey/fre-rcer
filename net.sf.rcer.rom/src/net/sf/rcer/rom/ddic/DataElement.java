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
package net.sf.rcer.rom.ddic;

import net.sf.rcer.conn.locales.Locale;

import net.sf.rcer.rom.RepositoryObject;

import net.sf.rcer.rom.RepositoryObjectCollection;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getCollection <em>Collection</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getHeading <em>Heading</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getMaxHeadingLength <em>Max Heading Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getShortText <em>Short Text</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getMaxShortTextLength <em>Max Short Text Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getMediumText <em>Medium Text</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getMaxMediumTextLength <em>Max Medium Text Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getLongText <em>Long Text</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getMaxLongTextLength <em>Max Long Text Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getParameterID <em>Parameter ID</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#isLogged <em>Logged</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getValueHelpName <em>Value Help Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getValueHelpFieldName <em>Value Help Field Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getDefaultFieldName <em>Default Field Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getDictionaryDataType <em>Dictionary Data Type</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getOutputLength <em>Output Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getDecimals <em>Decimals</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#isCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#isSigned <em>Signed</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#isValueListFixed <em>Value List Fixed</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getValueTableName <em>Value Table Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getConversionExit <em>Conversion Exit</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getTypeKind <em>Type Kind</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.DataElement#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement()
 * @model
 * @generated
 */
public interface DataElement extends RepositoryObject {
	/**
	 * Returns the value of the '<em><b>Collection</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link net.sf.rcer.rom.RepositoryObjectCollection#getDataElements <em>Data Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' container reference.
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_Collection()
	 * @see net.sf.rcer.rom.RepositoryObjectCollection#getDataElements
	 * @model opposite="dataElements" transient="false" changeable="false" derived="true" ordered="false"
	 * @generated
	 */
	RepositoryObjectCollection getCollection();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' map.
	 * The key is of type {@link net.sf.rcer.conn.locales.Locale},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' map.
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_Description()
	 * @model mapType="net.sf.rcer.rom.LocalizedString<net.sf.rcer.rom.Locale, org.eclipse.emf.ecore.EString>" changeable="false" ordered="false"
	 * @generated
	 */
	EMap<Locale, String> getDescription();

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' map.
	 * The key is of type {@link net.sf.rcer.conn.locales.Locale},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heading</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' map.
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_Heading()
	 * @model mapType="net.sf.rcer.rom.LocalizedString<net.sf.rcer.rom.Locale, org.eclipse.emf.ecore.EString>" changeable="false" ordered="false"
	 * @generated
	 */
	EMap<Locale, String> getHeading();

	/**
	 * Returns the value of the '<em><b>Max Heading Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Heading Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Heading Length</em>' attribute.
	 * @see #setMaxHeadingLength(int)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_MaxHeadingLength()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getMaxHeadingLength();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getMaxHeadingLength <em>Max Heading Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Heading Length</em>' attribute.
	 * @see #getMaxHeadingLength()
	 * @generated
	 */
	void setMaxHeadingLength(int value);

	/**
	 * Returns the value of the '<em><b>Short Text</b></em>' map.
	 * The key is of type {@link net.sf.rcer.conn.locales.Locale},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Text</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Text</em>' map.
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_ShortText()
	 * @model mapType="net.sf.rcer.rom.LocalizedString<net.sf.rcer.rom.Locale, org.eclipse.emf.ecore.EString>" changeable="false" ordered="false"
	 * @generated
	 */
	EMap<Locale, String> getShortText();

	/**
	 * Returns the value of the '<em><b>Max Short Text Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Short Text Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Short Text Length</em>' attribute.
	 * @see #setMaxShortTextLength(int)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_MaxShortTextLength()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getMaxShortTextLength();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getMaxShortTextLength <em>Max Short Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Short Text Length</em>' attribute.
	 * @see #getMaxShortTextLength()
	 * @generated
	 */
	void setMaxShortTextLength(int value);

	/**
	 * Returns the value of the '<em><b>Medium Text</b></em>' map.
	 * The key is of type {@link net.sf.rcer.conn.locales.Locale},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medium Text</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Text</em>' map.
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_MediumText()
	 * @model mapType="net.sf.rcer.rom.LocalizedString<net.sf.rcer.rom.Locale, org.eclipse.emf.ecore.EString>" changeable="false" ordered="false"
	 * @generated
	 */
	EMap<Locale, String> getMediumText();

	/**
	 * Returns the value of the '<em><b>Max Medium Text Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Medium Text Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Medium Text Length</em>' attribute.
	 * @see #setMaxMediumTextLength(int)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_MaxMediumTextLength()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getMaxMediumTextLength();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getMaxMediumTextLength <em>Max Medium Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Medium Text Length</em>' attribute.
	 * @see #getMaxMediumTextLength()
	 * @generated
	 */
	void setMaxMediumTextLength(int value);

	/**
	 * Returns the value of the '<em><b>Long Text</b></em>' map.
	 * The key is of type {@link net.sf.rcer.conn.locales.Locale},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Text</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Text</em>' map.
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_LongText()
	 * @model mapType="net.sf.rcer.rom.LocalizedString<net.sf.rcer.rom.Locale, org.eclipse.emf.ecore.EString>" changeable="false" ordered="false"
	 * @generated
	 */
	EMap<Locale, String> getLongText();

	/**
	 * Returns the value of the '<em><b>Max Long Text Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Long Text Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Long Text Length</em>' attribute.
	 * @see #setMaxLongTextLength(int)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_MaxLongTextLength()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getMaxLongTextLength();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getMaxLongTextLength <em>Max Long Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Long Text Length</em>' attribute.
	 * @see #getMaxLongTextLength()
	 * @generated
	 */
	void setMaxLongTextLength(int value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_TypeName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter ID</em>' attribute.
	 * @see #setParameterID(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_ParameterID()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getParameterID();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getParameterID <em>Parameter ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter ID</em>' attribute.
	 * @see #getParameterID()
	 * @generated
	 */
	void setParameterID(String value);

	/**
	 * Returns the value of the '<em><b>Logged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logged</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logged</em>' attribute.
	 * @see #setLogged(boolean)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_Logged()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isLogged();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#isLogged <em>Logged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logged</em>' attribute.
	 * @see #isLogged()
	 * @generated
	 */
	void setLogged(boolean value);

	/**
	 * Returns the value of the '<em><b>Value Help Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Help Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Help Name</em>' attribute.
	 * @see #setValueHelpName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_ValueHelpName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getValueHelpName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getValueHelpName <em>Value Help Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Help Name</em>' attribute.
	 * @see #getValueHelpName()
	 * @generated
	 */
	void setValueHelpName(String value);

	/**
	 * Returns the value of the '<em><b>Value Help Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Help Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Help Field Name</em>' attribute.
	 * @see #setValueHelpFieldName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_ValueHelpFieldName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getValueHelpFieldName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getValueHelpFieldName <em>Value Help Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Help Field Name</em>' attribute.
	 * @see #getValueHelpFieldName()
	 * @generated
	 */
	void setValueHelpFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Default Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Field Name</em>' attribute.
	 * @see #setDefaultFieldName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_DefaultFieldName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getDefaultFieldName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getDefaultFieldName <em>Default Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Field Name</em>' attribute.
	 * @see #getDefaultFieldName()
	 * @generated
	 */
	void setDefaultFieldName(String value);

	/**
	 * Returns the value of the '<em><b>Dictionary Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.rcer.rom.ddic.DictionaryDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dictionary Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dictionary Data Type</em>' attribute.
	 * @see net.sf.rcer.rom.ddic.DictionaryDataType
	 * @see #setDictionaryDataType(DictionaryDataType)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_DictionaryDataType()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	DictionaryDataType getDictionaryDataType();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getDictionaryDataType <em>Dictionary Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dictionary Data Type</em>' attribute.
	 * @see net.sf.rcer.rom.ddic.DictionaryDataType
	 * @see #getDictionaryDataType()
	 * @generated
	 */
	void setDictionaryDataType(DictionaryDataType value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_Length()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Output Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Length</em>' attribute.
	 * @see #setOutputLength(int)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_OutputLength()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getOutputLength();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getOutputLength <em>Output Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Length</em>' attribute.
	 * @see #getOutputLength()
	 * @generated
	 */
	void setOutputLength(int value);

	/**
	 * Returns the value of the '<em><b>Decimals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimals</em>' attribute.
	 * @see #setDecimals(int)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_Decimals()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getDecimals();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getDecimals <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimals</em>' attribute.
	 * @see #getDecimals()
	 * @generated
	 */
	void setDecimals(int value);

	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Sensitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' attribute.
	 * @see #setCaseSensitive(boolean)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_CaseSensitive()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isCaseSensitive();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#isCaseSensitive <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' attribute.
	 * @see #isCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(boolean value);

	/**
	 * Returns the value of the '<em><b>Signed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signed</em>' attribute.
	 * @see #setSigned(boolean)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_Signed()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isSigned();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#isSigned <em>Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signed</em>' attribute.
	 * @see #isSigned()
	 * @generated
	 */
	void setSigned(boolean value);

	/**
	 * Returns the value of the '<em><b>Value List Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value List Fixed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value List Fixed</em>' attribute.
	 * @see #setValueListFixed(boolean)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_ValueListFixed()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isValueListFixed();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#isValueListFixed <em>Value List Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value List Fixed</em>' attribute.
	 * @see #isValueListFixed()
	 * @generated
	 */
	void setValueListFixed(boolean value);

	/**
	 * Returns the value of the '<em><b>Value Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Table Name</em>' attribute.
	 * @see #setValueTableName(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_ValueTableName()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getValueTableName();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getValueTableName <em>Value Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Table Name</em>' attribute.
	 * @see #getValueTableName()
	 * @generated
	 */
	void setValueTableName(String value);

	/**
	 * Returns the value of the '<em><b>Conversion Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversion Exit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion Exit</em>' attribute.
	 * @see #setConversionExit(String)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_ConversionExit()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getConversionExit();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getConversionExit <em>Conversion Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion Exit</em>' attribute.
	 * @see #getConversionExit()
	 * @generated
	 */
	void setConversionExit(String value);

	/**
	 * Returns the value of the '<em><b>Type Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.rcer.rom.ddic.TypeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Kind</em>' attribute.
	 * @see net.sf.rcer.rom.ddic.TypeKind
	 * @see #setTypeKind(TypeKind)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_TypeKind()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	TypeKind getTypeKind();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getTypeKind <em>Type Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Kind</em>' attribute.
	 * @see net.sf.rcer.rom.ddic.TypeKind
	 * @see #getTypeKind()
	 * @generated
	 */
	void setTypeKind(TypeKind value);

	/**
	 * Returns the value of the '<em><b>Referred Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.rcer.rom.ddic.ReferredObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referred Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Type</em>' attribute.
	 * @see net.sf.rcer.rom.ddic.ReferredObjectType
	 * @see #setReferredType(ReferredObjectType)
	 * @see net.sf.rcer.rom.ddic.DDICPackage#getDataElement_ReferredType()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	ReferredObjectType getReferredType();

	/**
	 * Sets the value of the '{@link net.sf.rcer.rom.ddic.DataElement#getReferredType <em>Referred Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Type</em>' attribute.
	 * @see net.sf.rcer.rom.ddic.ReferredObjectType
	 * @see #getReferredType()
	 * @generated
	 */
	void setReferredType(ReferredObjectType value);

} // DataElement
