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
package net.sf.rcer.rom.ddic.impl;

import net.sf.rcer.conn.locales.Locale;
import net.sf.rcer.conn.locales.LocaleNotFoundException;
import net.sf.rcer.conn.locales.LocaleRegistry;
import net.sf.rcer.rom.ROMPackage;
import net.sf.rcer.rom.RepositoryObjectType;
import net.sf.rcer.rom.ddic.DDICPackage;
import net.sf.rcer.rom.ddic.DataElement;
import net.sf.rcer.rom.ddic.DictionaryDataType;
import net.sf.rcer.rom.ddic.ReferredObjectType;
import net.sf.rcer.rom.ddic.TypeKind;
import net.sf.rcer.rom.ddic.rfc.RFCDataElementData;
import net.sf.rcer.rom.ddic.rfc.RFCDataElementReader;
import net.sf.rcer.rom.ddic.rfc.RFCDataElementText;
import net.sf.rcer.rom.impl.LocalizedStringImpl;
import net.sf.rcer.rom.impl.RepositoryObjectImpl;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getMaxHeadingLength <em>Max Heading Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getShortText <em>Short Text</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getMaxShortTextLength <em>Max Short Text Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getMediumText <em>Medium Text</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getMaxMediumTextLength <em>Max Medium Text Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getLongText <em>Long Text</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getMaxLongTextLength <em>Max Long Text Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getParameterID <em>Parameter ID</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#isLogged <em>Logged</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getValueHelpName <em>Value Help Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getValueHelpFieldName <em>Value Help Field Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getDefaultFieldName <em>Default Field Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getDictionaryDataType <em>Dictionary Data Type</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getOutputLength <em>Output Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getDecimals <em>Decimals</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#isCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#isSigned <em>Signed</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#isValueListFixed <em>Value List Fixed</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getValueTableName <em>Value Table Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getConversionExit <em>Conversion Exit</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getTypeKind <em>Type Kind</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DataElementImpl#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataElementImpl extends RepositoryObjectImpl implements DataElement {
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
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected EMap<Locale, String> heading;

	/**
	 * The default value of the '{@link #getMaxHeadingLength() <em>Max Heading Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeadingLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_HEADING_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxHeadingLength() <em>Max Heading Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeadingLength()
	 * @generated
	 * @ordered
	 */
	protected int maxHeadingLength = MAX_HEADING_LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShortText() <em>Short Text</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortText()
	 * @generated
	 * @ordered
	 */
	protected EMap<Locale, String> shortText;

	/**
	 * The default value of the '{@link #getMaxShortTextLength() <em>Max Short Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxShortTextLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_SHORT_TEXT_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxShortTextLength() <em>Max Short Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxShortTextLength()
	 * @generated
	 * @ordered
	 */
	protected int maxShortTextLength = MAX_SHORT_TEXT_LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMediumText() <em>Medium Text</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediumText()
	 * @generated
	 * @ordered
	 */
	protected EMap<Locale, String> mediumText;

	/**
	 * The default value of the '{@link #getMaxMediumTextLength() <em>Max Medium Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMediumTextLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_MEDIUM_TEXT_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxMediumTextLength() <em>Max Medium Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMediumTextLength()
	 * @generated
	 * @ordered
	 */
	protected int maxMediumTextLength = MAX_MEDIUM_TEXT_LENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLongText() <em>Long Text</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongText()
	 * @generated
	 * @ordered
	 */
	protected EMap<Locale, String> longText;

	/**
	 * The default value of the '{@link #getMaxLongTextLength() <em>Max Long Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLongTextLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LONG_TEXT_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxLongTextLength() <em>Max Long Text Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLongTextLength()
	 * @generated
	 * @ordered
	 */
	protected int maxLongTextLength = MAX_LONG_TEXT_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterID() <em>Parameter ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterID()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterID() <em>Parameter ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterID()
	 * @generated
	 * @ordered
	 */
	protected String parameterID = PARAMETER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isLogged() <em>Logged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOGGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLogged() <em>Logged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLogged()
	 * @generated
	 * @ordered
	 */
	protected boolean logged = LOGGED_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueHelpName() <em>Value Help Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueHelpName()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_HELP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueHelpName() <em>Value Help Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueHelpName()
	 * @generated
	 * @ordered
	 */
	protected String valueHelpName = VALUE_HELP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueHelpFieldName() <em>Value Help Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueHelpFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_HELP_FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueHelpFieldName() <em>Value Help Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueHelpFieldName()
	 * @generated
	 * @ordered
	 */
	protected String valueHelpFieldName = VALUE_HELP_FIELD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultFieldName() <em>Default Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFieldName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_FIELD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultFieldName() <em>Default Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultFieldName()
	 * @generated
	 * @ordered
	 */
	protected String defaultFieldName = DEFAULT_FIELD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDictionaryDataType() <em>Dictionary Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DictionaryDataType DICTIONARY_DATA_TYPE_EDEFAULT = DictionaryDataType.ACCOUNTING_PERIOD;

	/**
	 * The cached value of the '{@link #getDictionaryDataType() <em>Dictionary Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDictionaryDataType()
	 * @generated
	 * @ordered
	 */
	protected DictionaryDataType dictionaryDataType = DICTIONARY_DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputLength() <em>Output Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLength()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTPUT_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutputLength() <em>Output Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLength()
	 * @generated
	 * @ordered
	 */
	protected int outputLength = OUTPUT_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecimals() <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimals()
	 * @generated
	 * @ordered
	 */
	protected static final int DECIMALS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDecimals() <em>Decimals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecimals()
	 * @generated
	 * @ordered
	 */
	protected int decimals = DECIMALS_EDEFAULT;

	/**
	 * The default value of the '{@link #isCaseSensitive() <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CASE_SENSITIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCaseSensitive() <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCaseSensitive()
	 * @generated
	 * @ordered
	 */
	protected boolean caseSensitive = CASE_SENSITIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSigned() <em>Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSigned()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIGNED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSigned() <em>Signed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSigned()
	 * @generated
	 * @ordered
	 */
	protected boolean signed = SIGNED_EDEFAULT;

	/**
	 * The default value of the '{@link #isValueListFixed() <em>Value List Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValueListFixed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_LIST_FIXED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValueListFixed() <em>Value List Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValueListFixed()
	 * @generated
	 * @ordered
	 */
	protected boolean valueListFixed = VALUE_LIST_FIXED_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueTableName() <em>Value Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_TABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueTableName() <em>Value Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTableName()
	 * @generated
	 * @ordered
	 */
	protected String valueTableName = VALUE_TABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConversionExit() <em>Conversion Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionExit()
	 * @generated
	 * @ordered
	 */
	protected static final String CONVERSION_EXIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConversionExit() <em>Conversion Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversionExit()
	 * @generated
	 * @ordered
	 */
	protected String conversionExit = CONVERSION_EXIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeKind() <em>Type Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeKind()
	 * @generated
	 * @ordered
	 */
	protected static final TypeKind TYPE_KIND_EDEFAULT = TypeKind.DICTIONARY_TYPE;

	/**
	 * The cached value of the '{@link #getTypeKind() <em>Type Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeKind()
	 * @generated
	 * @ordered
	 */
	protected TypeKind typeKind = TYPE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferredType() <em>Referred Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredType()
	 * @generated
	 * @ordered
	 */
	protected static final ReferredObjectType REFERRED_TYPE_EDEFAULT = ReferredObjectType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getReferredType() <em>Referred Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferredType()
	 * @generated
	 * @ordered
	 */
	protected ReferredObjectType referredType = REFERRED_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDICPackage.Literals.DATA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Locale, String> getDescription() {
		if (description == null) {
			description = new EcoreEMap<Locale,String>(ROMPackage.Literals.LOCALIZED_STRING, LocalizedStringImpl.class, this, DDICPackage.DATA_ELEMENT__DESCRIPTION);
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Locale, String> getHeading() {
		if (heading == null) {
			heading = new EcoreEMap<Locale,String>(ROMPackage.Literals.LOCALIZED_STRING, LocalizedStringImpl.class, this, DDICPackage.DATA_ELEMENT__HEADING);
		}
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxHeadingLength() {
		return maxHeadingLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxHeadingLength(int newMaxHeadingLength) {
		int oldMaxHeadingLength = maxHeadingLength;
		maxHeadingLength = newMaxHeadingLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__MAX_HEADING_LENGTH, oldMaxHeadingLength, maxHeadingLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Locale, String> getShortText() {
		if (shortText == null) {
			shortText = new EcoreEMap<Locale,String>(ROMPackage.Literals.LOCALIZED_STRING, LocalizedStringImpl.class, this, DDICPackage.DATA_ELEMENT__SHORT_TEXT);
		}
		return shortText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxShortTextLength() {
		return maxShortTextLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxShortTextLength(int newMaxShortTextLength) {
		int oldMaxShortTextLength = maxShortTextLength;
		maxShortTextLength = newMaxShortTextLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__MAX_SHORT_TEXT_LENGTH, oldMaxShortTextLength, maxShortTextLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Locale, String> getMediumText() {
		if (mediumText == null) {
			mediumText = new EcoreEMap<Locale,String>(ROMPackage.Literals.LOCALIZED_STRING, LocalizedStringImpl.class, this, DDICPackage.DATA_ELEMENT__MEDIUM_TEXT);
		}
		return mediumText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxMediumTextLength() {
		return maxMediumTextLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMediumTextLength(int newMaxMediumTextLength) {
		int oldMaxMediumTextLength = maxMediumTextLength;
		maxMediumTextLength = newMaxMediumTextLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__MAX_MEDIUM_TEXT_LENGTH, oldMaxMediumTextLength, maxMediumTextLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Locale, String> getLongText() {
		if (longText == null) {
			longText = new EcoreEMap<Locale,String>(ROMPackage.Literals.LOCALIZED_STRING, LocalizedStringImpl.class, this, DDICPackage.DATA_ELEMENT__LONG_TEXT);
		}
		return longText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLongTextLength() {
		return maxLongTextLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLongTextLength(int newMaxLongTextLength) {
		int oldMaxLongTextLength = maxLongTextLength;
		maxLongTextLength = newMaxLongTextLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__MAX_LONG_TEXT_LENGTH, oldMaxLongTextLength, maxLongTextLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterID() {
		return parameterID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterID(String newParameterID) {
		String oldParameterID = parameterID;
		parameterID = newParameterID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__PARAMETER_ID, oldParameterID, parameterID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLogged() {
		return logged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogged(boolean newLogged) {
		boolean oldLogged = logged;
		logged = newLogged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__LOGGED, oldLogged, logged));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueHelpName() {
		return valueHelpName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueHelpName(String newValueHelpName) {
		String oldValueHelpName = valueHelpName;
		valueHelpName = newValueHelpName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__VALUE_HELP_NAME, oldValueHelpName, valueHelpName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueHelpFieldName() {
		return valueHelpFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueHelpFieldName(String newValueHelpFieldName) {
		String oldValueHelpFieldName = valueHelpFieldName;
		valueHelpFieldName = newValueHelpFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__VALUE_HELP_FIELD_NAME, oldValueHelpFieldName, valueHelpFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultFieldName() {
		return defaultFieldName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultFieldName(String newDefaultFieldName) {
		String oldDefaultFieldName = defaultFieldName;
		defaultFieldName = newDefaultFieldName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__DEFAULT_FIELD_NAME, oldDefaultFieldName, defaultFieldName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DictionaryDataType getDictionaryDataType() {
		return dictionaryDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDictionaryDataType(DictionaryDataType newDictionaryDataType) {
		DictionaryDataType oldDictionaryDataType = dictionaryDataType;
		dictionaryDataType = newDictionaryDataType == null ? DICTIONARY_DATA_TYPE_EDEFAULT : newDictionaryDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__DICTIONARY_DATA_TYPE, oldDictionaryDataType, dictionaryDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutputLength() {
		return outputLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputLength(int newOutputLength) {
		int oldOutputLength = outputLength;
		outputLength = newOutputLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__OUTPUT_LENGTH, oldOutputLength, outputLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDecimals() {
		return decimals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimals(int newDecimals) {
		int oldDecimals = decimals;
		decimals = newDecimals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__DECIMALS, oldDecimals, decimals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCaseSensitive() {
		return caseSensitive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseSensitive(boolean newCaseSensitive) {
		boolean oldCaseSensitive = caseSensitive;
		caseSensitive = newCaseSensitive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__CASE_SENSITIVE, oldCaseSensitive, caseSensitive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSigned() {
		return signed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSigned(boolean newSigned) {
		boolean oldSigned = signed;
		signed = newSigned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__SIGNED, oldSigned, signed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValueListFixed() {
		return valueListFixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueListFixed(boolean newValueListFixed) {
		boolean oldValueListFixed = valueListFixed;
		valueListFixed = newValueListFixed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__VALUE_LIST_FIXED, oldValueListFixed, valueListFixed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueTableName() {
		return valueTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueTableName(String newValueTableName) {
		String oldValueTableName = valueTableName;
		valueTableName = newValueTableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__VALUE_TABLE_NAME, oldValueTableName, valueTableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConversionExit() {
		return conversionExit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConversionExit(String newConversionExit) {
		String oldConversionExit = conversionExit;
		conversionExit = newConversionExit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__CONVERSION_EXIT, oldConversionExit, conversionExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeKind getTypeKind() {
		return typeKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeKind(TypeKind newTypeKind) {
		TypeKind oldTypeKind = typeKind;
		typeKind = newTypeKind == null ? TYPE_KIND_EDEFAULT : newTypeKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__TYPE_KIND, oldTypeKind, typeKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferredObjectType getReferredType() {
		return referredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferredType(ReferredObjectType newReferredType) {
		ReferredObjectType oldReferredType = referredType;
		referredType = newReferredType == null ? REFERRED_TYPE_EDEFAULT : newReferredType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DATA_ELEMENT__REFERRED_TYPE, oldReferredType, referredType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DDICPackage.DATA_ELEMENT__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case DDICPackage.DATA_ELEMENT__HEADING:
				return ((InternalEList<?>)getHeading()).basicRemove(otherEnd, msgs);
			case DDICPackage.DATA_ELEMENT__SHORT_TEXT:
				return ((InternalEList<?>)getShortText()).basicRemove(otherEnd, msgs);
			case DDICPackage.DATA_ELEMENT__MEDIUM_TEXT:
				return ((InternalEList<?>)getMediumText()).basicRemove(otherEnd, msgs);
			case DDICPackage.DATA_ELEMENT__LONG_TEXT:
				return ((InternalEList<?>)getLongText()).basicRemove(otherEnd, msgs);
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
			case DDICPackage.DATA_ELEMENT__DESCRIPTION:
				if (coreType) return getDescription();
				else return getDescription().map();
			case DDICPackage.DATA_ELEMENT__HEADING:
				if (coreType) return getHeading();
				else return getHeading().map();
			case DDICPackage.DATA_ELEMENT__MAX_HEADING_LENGTH:
				return new Integer(getMaxHeadingLength());
			case DDICPackage.DATA_ELEMENT__SHORT_TEXT:
				if (coreType) return getShortText();
				else return getShortText().map();
			case DDICPackage.DATA_ELEMENT__MAX_SHORT_TEXT_LENGTH:
				return new Integer(getMaxShortTextLength());
			case DDICPackage.DATA_ELEMENT__MEDIUM_TEXT:
				if (coreType) return getMediumText();
				else return getMediumText().map();
			case DDICPackage.DATA_ELEMENT__MAX_MEDIUM_TEXT_LENGTH:
				return new Integer(getMaxMediumTextLength());
			case DDICPackage.DATA_ELEMENT__LONG_TEXT:
				if (coreType) return getLongText();
				else return getLongText().map();
			case DDICPackage.DATA_ELEMENT__MAX_LONG_TEXT_LENGTH:
				return new Integer(getMaxLongTextLength());
			case DDICPackage.DATA_ELEMENT__TYPE_NAME:
				return getTypeName();
			case DDICPackage.DATA_ELEMENT__PARAMETER_ID:
				return getParameterID();
			case DDICPackage.DATA_ELEMENT__LOGGED:
				return isLogged() ? Boolean.TRUE : Boolean.FALSE;
			case DDICPackage.DATA_ELEMENT__VALUE_HELP_NAME:
				return getValueHelpName();
			case DDICPackage.DATA_ELEMENT__VALUE_HELP_FIELD_NAME:
				return getValueHelpFieldName();
			case DDICPackage.DATA_ELEMENT__DEFAULT_FIELD_NAME:
				return getDefaultFieldName();
			case DDICPackage.DATA_ELEMENT__DICTIONARY_DATA_TYPE:
				return getDictionaryDataType();
			case DDICPackage.DATA_ELEMENT__LENGTH:
				return new Integer(getLength());
			case DDICPackage.DATA_ELEMENT__OUTPUT_LENGTH:
				return new Integer(getOutputLength());
			case DDICPackage.DATA_ELEMENT__DECIMALS:
				return new Integer(getDecimals());
			case DDICPackage.DATA_ELEMENT__CASE_SENSITIVE:
				return isCaseSensitive() ? Boolean.TRUE : Boolean.FALSE;
			case DDICPackage.DATA_ELEMENT__SIGNED:
				return isSigned() ? Boolean.TRUE : Boolean.FALSE;
			case DDICPackage.DATA_ELEMENT__VALUE_LIST_FIXED:
				return isValueListFixed() ? Boolean.TRUE : Boolean.FALSE;
			case DDICPackage.DATA_ELEMENT__VALUE_TABLE_NAME:
				return getValueTableName();
			case DDICPackage.DATA_ELEMENT__CONVERSION_EXIT:
				return getConversionExit();
			case DDICPackage.DATA_ELEMENT__TYPE_KIND:
				return getTypeKind();
			case DDICPackage.DATA_ELEMENT__REFERRED_TYPE:
				return getReferredType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DDICPackage.DATA_ELEMENT__MAX_HEADING_LENGTH:
				setMaxHeadingLength(((Integer)newValue).intValue());
				return;
			case DDICPackage.DATA_ELEMENT__MAX_SHORT_TEXT_LENGTH:
				setMaxShortTextLength(((Integer)newValue).intValue());
				return;
			case DDICPackage.DATA_ELEMENT__MAX_MEDIUM_TEXT_LENGTH:
				setMaxMediumTextLength(((Integer)newValue).intValue());
				return;
			case DDICPackage.DATA_ELEMENT__MAX_LONG_TEXT_LENGTH:
				setMaxLongTextLength(((Integer)newValue).intValue());
				return;
			case DDICPackage.DATA_ELEMENT__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case DDICPackage.DATA_ELEMENT__PARAMETER_ID:
				setParameterID((String)newValue);
				return;
			case DDICPackage.DATA_ELEMENT__LOGGED:
				setLogged(((Boolean)newValue).booleanValue());
				return;
			case DDICPackage.DATA_ELEMENT__VALUE_HELP_NAME:
				setValueHelpName((String)newValue);
				return;
			case DDICPackage.DATA_ELEMENT__VALUE_HELP_FIELD_NAME:
				setValueHelpFieldName((String)newValue);
				return;
			case DDICPackage.DATA_ELEMENT__DEFAULT_FIELD_NAME:
				setDefaultFieldName((String)newValue);
				return;
			case DDICPackage.DATA_ELEMENT__DICTIONARY_DATA_TYPE:
				setDictionaryDataType((DictionaryDataType)newValue);
				return;
			case DDICPackage.DATA_ELEMENT__LENGTH:
				setLength(((Integer)newValue).intValue());
				return;
			case DDICPackage.DATA_ELEMENT__OUTPUT_LENGTH:
				setOutputLength(((Integer)newValue).intValue());
				return;
			case DDICPackage.DATA_ELEMENT__DECIMALS:
				setDecimals(((Integer)newValue).intValue());
				return;
			case DDICPackage.DATA_ELEMENT__CASE_SENSITIVE:
				setCaseSensitive(((Boolean)newValue).booleanValue());
				return;
			case DDICPackage.DATA_ELEMENT__SIGNED:
				setSigned(((Boolean)newValue).booleanValue());
				return;
			case DDICPackage.DATA_ELEMENT__VALUE_LIST_FIXED:
				setValueListFixed(((Boolean)newValue).booleanValue());
				return;
			case DDICPackage.DATA_ELEMENT__VALUE_TABLE_NAME:
				setValueTableName((String)newValue);
				return;
			case DDICPackage.DATA_ELEMENT__CONVERSION_EXIT:
				setConversionExit((String)newValue);
				return;
			case DDICPackage.DATA_ELEMENT__TYPE_KIND:
				setTypeKind((TypeKind)newValue);
				return;
			case DDICPackage.DATA_ELEMENT__REFERRED_TYPE:
				setReferredType((ReferredObjectType)newValue);
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
			case DDICPackage.DATA_ELEMENT__MAX_HEADING_LENGTH:
				setMaxHeadingLength(MAX_HEADING_LENGTH_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__MAX_SHORT_TEXT_LENGTH:
				setMaxShortTextLength(MAX_SHORT_TEXT_LENGTH_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__MAX_MEDIUM_TEXT_LENGTH:
				setMaxMediumTextLength(MAX_MEDIUM_TEXT_LENGTH_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__MAX_LONG_TEXT_LENGTH:
				setMaxLongTextLength(MAX_LONG_TEXT_LENGTH_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__PARAMETER_ID:
				setParameterID(PARAMETER_ID_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__LOGGED:
				setLogged(LOGGED_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__VALUE_HELP_NAME:
				setValueHelpName(VALUE_HELP_NAME_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__VALUE_HELP_FIELD_NAME:
				setValueHelpFieldName(VALUE_HELP_FIELD_NAME_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__DEFAULT_FIELD_NAME:
				setDefaultFieldName(DEFAULT_FIELD_NAME_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__DICTIONARY_DATA_TYPE:
				setDictionaryDataType(DICTIONARY_DATA_TYPE_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__OUTPUT_LENGTH:
				setOutputLength(OUTPUT_LENGTH_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__DECIMALS:
				setDecimals(DECIMALS_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__CASE_SENSITIVE:
				setCaseSensitive(CASE_SENSITIVE_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__SIGNED:
				setSigned(SIGNED_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__VALUE_LIST_FIXED:
				setValueListFixed(VALUE_LIST_FIXED_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__VALUE_TABLE_NAME:
				setValueTableName(VALUE_TABLE_NAME_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__CONVERSION_EXIT:
				setConversionExit(CONVERSION_EXIT_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__TYPE_KIND:
				setTypeKind(TYPE_KIND_EDEFAULT);
				return;
			case DDICPackage.DATA_ELEMENT__REFERRED_TYPE:
				setReferredType(REFERRED_TYPE_EDEFAULT);
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
			case DDICPackage.DATA_ELEMENT__DESCRIPTION:
				return description != null && !description.isEmpty();
			case DDICPackage.DATA_ELEMENT__HEADING:
				return heading != null && !heading.isEmpty();
			case DDICPackage.DATA_ELEMENT__MAX_HEADING_LENGTH:
				return maxHeadingLength != MAX_HEADING_LENGTH_EDEFAULT;
			case DDICPackage.DATA_ELEMENT__SHORT_TEXT:
				return shortText != null && !shortText.isEmpty();
			case DDICPackage.DATA_ELEMENT__MAX_SHORT_TEXT_LENGTH:
				return maxShortTextLength != MAX_SHORT_TEXT_LENGTH_EDEFAULT;
			case DDICPackage.DATA_ELEMENT__MEDIUM_TEXT:
				return mediumText != null && !mediumText.isEmpty();
			case DDICPackage.DATA_ELEMENT__MAX_MEDIUM_TEXT_LENGTH:
				return maxMediumTextLength != MAX_MEDIUM_TEXT_LENGTH_EDEFAULT;
			case DDICPackage.DATA_ELEMENT__LONG_TEXT:
				return longText != null && !longText.isEmpty();
			case DDICPackage.DATA_ELEMENT__MAX_LONG_TEXT_LENGTH:
				return maxLongTextLength != MAX_LONG_TEXT_LENGTH_EDEFAULT;
			case DDICPackage.DATA_ELEMENT__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case DDICPackage.DATA_ELEMENT__PARAMETER_ID:
				return PARAMETER_ID_EDEFAULT == null ? parameterID != null : !PARAMETER_ID_EDEFAULT.equals(parameterID);
			case DDICPackage.DATA_ELEMENT__LOGGED:
				return logged != LOGGED_EDEFAULT;
			case DDICPackage.DATA_ELEMENT__VALUE_HELP_NAME:
				return VALUE_HELP_NAME_EDEFAULT == null ? valueHelpName != null : !VALUE_HELP_NAME_EDEFAULT.equals(valueHelpName);
			case DDICPackage.DATA_ELEMENT__VALUE_HELP_FIELD_NAME:
				return VALUE_HELP_FIELD_NAME_EDEFAULT == null ? valueHelpFieldName != null : !VALUE_HELP_FIELD_NAME_EDEFAULT.equals(valueHelpFieldName);
			case DDICPackage.DATA_ELEMENT__DEFAULT_FIELD_NAME:
				return DEFAULT_FIELD_NAME_EDEFAULT == null ? defaultFieldName != null : !DEFAULT_FIELD_NAME_EDEFAULT.equals(defaultFieldName);
			case DDICPackage.DATA_ELEMENT__DICTIONARY_DATA_TYPE:
				return dictionaryDataType != DICTIONARY_DATA_TYPE_EDEFAULT;
			case DDICPackage.DATA_ELEMENT__LENGTH:
				return length != LENGTH_EDEFAULT;
			case DDICPackage.DATA_ELEMENT__OUTPUT_LENGTH:
				return outputLength != OUTPUT_LENGTH_EDEFAULT;
			case DDICPackage.DATA_ELEMENT__DECIMALS:
				return decimals != DECIMALS_EDEFAULT;
			case DDICPackage.DATA_ELEMENT__CASE_SENSITIVE:
				return caseSensitive != CASE_SENSITIVE_EDEFAULT;
			case DDICPackage.DATA_ELEMENT__SIGNED:
				return signed != SIGNED_EDEFAULT;
			case DDICPackage.DATA_ELEMENT__VALUE_LIST_FIXED:
				return valueListFixed != VALUE_LIST_FIXED_EDEFAULT;
			case DDICPackage.DATA_ELEMENT__VALUE_TABLE_NAME:
				return VALUE_TABLE_NAME_EDEFAULT == null ? valueTableName != null : !VALUE_TABLE_NAME_EDEFAULT.equals(valueTableName);
			case DDICPackage.DATA_ELEMENT__CONVERSION_EXIT:
				return CONVERSION_EXIT_EDEFAULT == null ? conversionExit != null : !CONVERSION_EXIT_EDEFAULT.equals(conversionExit);
			case DDICPackage.DATA_ELEMENT__TYPE_KIND:
				return typeKind != TYPE_KIND_EDEFAULT;
			case DDICPackage.DATA_ELEMENT__REFERRED_TYPE:
				return referredType != REFERRED_TYPE_EDEFAULT;
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
		result.append(" (maxHeadingLength: "); //$NON-NLS-1$
		result.append(maxHeadingLength);
		result.append(", maxShortTextLength: "); //$NON-NLS-1$
		result.append(maxShortTextLength);
		result.append(", maxMediumTextLength: "); //$NON-NLS-1$
		result.append(maxMediumTextLength);
		result.append(", maxLongTextLength: "); //$NON-NLS-1$
		result.append(maxLongTextLength);
		result.append(", typeName: "); //$NON-NLS-1$
		result.append(typeName);
		result.append(", parameterID: "); //$NON-NLS-1$
		result.append(parameterID);
		result.append(", logged: "); //$NON-NLS-1$
		result.append(logged);
		result.append(", valueHelpName: "); //$NON-NLS-1$
		result.append(valueHelpName);
		result.append(", valueHelpFieldName: "); //$NON-NLS-1$
		result.append(valueHelpFieldName);
		result.append(", defaultFieldName: "); //$NON-NLS-1$
		result.append(defaultFieldName);
		result.append(", dictionaryDataType: "); //$NON-NLS-1$
		result.append(dictionaryDataType);
		result.append(", length: "); //$NON-NLS-1$
		result.append(length);
		result.append(", outputLength: "); //$NON-NLS-1$
		result.append(outputLength);
		result.append(", decimals: "); //$NON-NLS-1$
		result.append(decimals);
		result.append(", caseSensitive: "); //$NON-NLS-1$
		result.append(caseSensitive);
		result.append(", signed: "); //$NON-NLS-1$
		result.append(signed);
		result.append(", valueListFixed: "); //$NON-NLS-1$
		result.append(valueListFixed);
		result.append(", valueTableName: "); //$NON-NLS-1$
		result.append(valueTableName);
		result.append(", conversionExit: "); //$NON-NLS-1$
		result.append(conversionExit);
		result.append(", typeKind: "); //$NON-NLS-1$
		result.append(typeKind);
		result.append(", referredType: "); //$NON-NLS-1$
		result.append(referredType);
		result.append(')');
		return result.toString();
	}

	/**
	 * @see net.sf.rcer.rom.impl.RepositoryObjectImpl#getObjectType()
	 * @generated no
	 */
	@Override
	public RepositoryObjectType getObjectType() {
		return RepositoryObjectType.DOMAIN;
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
		return "DTEL";
	}
	
	/**
	 * @see net.sf.rcer.rom.impl.RepositoryObjectImpl#loadObjectData(JCoDestination)
	 * @generated no
	 */
	@Override
	public IStatus loadObjectData(JCoDestination dest) {
		try {
			RFCDataElementReader reader = new RFCDataElementReader();
			reader.setDataElementName(getName());
			reader.setLocaleID(getOriginalLocale().getID());
			reader.execute(dest);

			final RFCDataElementData data = reader.getDataElementData();
			setTypeName(data.getTypeName());
			setParameterID(data.getParameterID());
			setLogged(data.isLogged());
			setMaxHeadingLength(data.getHeadingLength());
			setMaxShortTextLength(data.getShortTextLength());
			setMaxMediumTextLength(data.getMediumTextLength());
			setMaxLongTextLength(data.getLongTextLength());
			setValueHelpName(data.getSearchHelpName());
			setValueHelpFieldName(data.getSearchHelpField());
			setDefaultFieldName(data.getDefaultFieldName());
			setDictionaryDataType(DictionaryDataType.get(data.getDataType()));
			setLength(data.getLength());
			setOutputLength(data.getOutputLength());
			setDecimals(data.getDecimals());
			setCaseSensitive(data.isCaseSensitive());
			setSigned(data.isSigned());
			setValueListFixed(data.isValueListFixed());
			setValueTableName(data.getValueTable());
			setConversionExit(data.getConversionExit());
			setTypeKind(TypeKind.get(data.getTypeKind()));
			setReferredType(ReferredObjectType.get(data.getReferenceKind()));

			for (final RFCDataElementText text: reader.getTexts()) {
				Locale locale = LocaleRegistry.getInstance().getLocaleByID(text.getLocaleID());
				getDescription().put(locale, text.getDescription());
				getHeading().put(locale, text.getHeading());
				getShortText().put(locale, text.getShortText());
				getMediumText().put(locale, text.getMediumText());
				getLongText().put(locale, text.getLongText());
			}
			
			return Status.OK_STATUS;
		} catch (JCoException e) {
			return new Status(IStatus.ERROR, "net.sf.rcer.rom", e.getMessage(), e);
		} catch (LocaleNotFoundException e) {
			return new Status(IStatus.ERROR, "net.sf.rcer.rom", e.getMessage(), e);
		}
	}

} //DataElementImpl
