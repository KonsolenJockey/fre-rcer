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
package net.sf.rcer.rom.ddic.impl;

import java.util.Collection;

import net.sf.rcer.conn.locales.Locale;
import net.sf.rcer.rom.ROMPackage;
import net.sf.rcer.rom.RepositoryObjectCollection;
import net.sf.rcer.rom.RepositoryObjectType;
import net.sf.rcer.rom.ddic.DDICPackage;
import net.sf.rcer.rom.ddic.DictionaryDataType;
import net.sf.rcer.rom.ddic.Domain;
import net.sf.rcer.rom.ddic.DomainValue;
import net.sf.rcer.rom.impl.LocalizedStringImpl;
import net.sf.rcer.rom.impl.RepositoryObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainImpl#getCollection <em>Collection</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainImpl#getDictionaryDataType <em>Dictionary Data Type</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainImpl#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainImpl#getOutputLength <em>Output Length</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainImpl#getDecimals <em>Decimals</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainImpl#isCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainImpl#isSigned <em>Signed</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainImpl#isValueListFixed <em>Value List Fixed</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainImpl#getValueTableName <em>Value Table Name</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainImpl#getConversionExit <em>Conversion Exit</em>}</li>
 *   <li>{@link net.sf.rcer.rom.ddic.impl.DomainImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends RepositoryObjectImpl implements Domain {
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
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainValue> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DDICPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepositoryObjectCollection getCollection() {
		if (eContainerFeatureID != DDICPackage.DOMAIN__COLLECTION) return null;
		return (RepositoryObjectCollection)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<Locale, String> getDescription() {
		if (description == null) {
			description = new EcoreEMap<Locale,String>(ROMPackage.Literals.LOCALIZED_STRING, LocalizedStringImpl.class, this, DDICPackage.DOMAIN__DESCRIPTION);
		}
		return description;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DOMAIN__DICTIONARY_DATA_TYPE, oldDictionaryDataType, dictionaryDataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DOMAIN__LENGTH, oldLength, length));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DOMAIN__OUTPUT_LENGTH, oldOutputLength, outputLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DOMAIN__DECIMALS, oldDecimals, decimals));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DOMAIN__CASE_SENSITIVE, oldCaseSensitive, caseSensitive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DOMAIN__SIGNED, oldSigned, signed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DOMAIN__VALUE_LIST_FIXED, oldValueListFixed, valueListFixed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DOMAIN__VALUE_TABLE_NAME, oldValueTableName, valueTableName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DDICPackage.DOMAIN__CONVERSION_EXIT, oldConversionExit, conversionExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentWithInverseEList<DomainValue>(DomainValue.class, this, DDICPackage.DOMAIN__VALUES, DDICPackage.DOMAIN_VALUE__DOMAIN);
		}
		return values;
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
			case DDICPackage.DOMAIN__COLLECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, DDICPackage.DOMAIN__COLLECTION, msgs);
			case DDICPackage.DOMAIN__VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues()).basicAdd(otherEnd, msgs);
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
			case DDICPackage.DOMAIN__COLLECTION:
				return eBasicSetContainer(null, DDICPackage.DOMAIN__COLLECTION, msgs);
			case DDICPackage.DOMAIN__DESCRIPTION:
				return ((InternalEList<?>)getDescription()).basicRemove(otherEnd, msgs);
			case DDICPackage.DOMAIN__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case DDICPackage.DOMAIN__COLLECTION:
				return eInternalContainer().eInverseRemove(this, ROMPackage.REPOSITORY_OBJECT_COLLECTION__DOMAINS, RepositoryObjectCollection.class, msgs);
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
			case DDICPackage.DOMAIN__COLLECTION:
				return getCollection();
			case DDICPackage.DOMAIN__DESCRIPTION:
				if (coreType) return getDescription();
				else return getDescription().map();
			case DDICPackage.DOMAIN__DICTIONARY_DATA_TYPE:
				return getDictionaryDataType();
			case DDICPackage.DOMAIN__LENGTH:
				return new Integer(getLength());
			case DDICPackage.DOMAIN__OUTPUT_LENGTH:
				return new Integer(getOutputLength());
			case DDICPackage.DOMAIN__DECIMALS:
				return new Integer(getDecimals());
			case DDICPackage.DOMAIN__CASE_SENSITIVE:
				return isCaseSensitive() ? Boolean.TRUE : Boolean.FALSE;
			case DDICPackage.DOMAIN__SIGNED:
				return isSigned() ? Boolean.TRUE : Boolean.FALSE;
			case DDICPackage.DOMAIN__VALUE_LIST_FIXED:
				return isValueListFixed() ? Boolean.TRUE : Boolean.FALSE;
			case DDICPackage.DOMAIN__VALUE_TABLE_NAME:
				return getValueTableName();
			case DDICPackage.DOMAIN__CONVERSION_EXIT:
				return getConversionExit();
			case DDICPackage.DOMAIN__VALUES:
				return getValues();
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
			case DDICPackage.DOMAIN__DICTIONARY_DATA_TYPE:
				setDictionaryDataType((DictionaryDataType)newValue);
				return;
			case DDICPackage.DOMAIN__LENGTH:
				setLength(((Integer)newValue).intValue());
				return;
			case DDICPackage.DOMAIN__OUTPUT_LENGTH:
				setOutputLength(((Integer)newValue).intValue());
				return;
			case DDICPackage.DOMAIN__DECIMALS:
				setDecimals(((Integer)newValue).intValue());
				return;
			case DDICPackage.DOMAIN__CASE_SENSITIVE:
				setCaseSensitive(((Boolean)newValue).booleanValue());
				return;
			case DDICPackage.DOMAIN__SIGNED:
				setSigned(((Boolean)newValue).booleanValue());
				return;
			case DDICPackage.DOMAIN__VALUE_LIST_FIXED:
				setValueListFixed(((Boolean)newValue).booleanValue());
				return;
			case DDICPackage.DOMAIN__VALUE_TABLE_NAME:
				setValueTableName((String)newValue);
				return;
			case DDICPackage.DOMAIN__CONVERSION_EXIT:
				setConversionExit((String)newValue);
				return;
			case DDICPackage.DOMAIN__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends DomainValue>)newValue);
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
			case DDICPackage.DOMAIN__DICTIONARY_DATA_TYPE:
				setDictionaryDataType(DICTIONARY_DATA_TYPE_EDEFAULT);
				return;
			case DDICPackage.DOMAIN__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case DDICPackage.DOMAIN__OUTPUT_LENGTH:
				setOutputLength(OUTPUT_LENGTH_EDEFAULT);
				return;
			case DDICPackage.DOMAIN__DECIMALS:
				setDecimals(DECIMALS_EDEFAULT);
				return;
			case DDICPackage.DOMAIN__CASE_SENSITIVE:
				setCaseSensitive(CASE_SENSITIVE_EDEFAULT);
				return;
			case DDICPackage.DOMAIN__SIGNED:
				setSigned(SIGNED_EDEFAULT);
				return;
			case DDICPackage.DOMAIN__VALUE_LIST_FIXED:
				setValueListFixed(VALUE_LIST_FIXED_EDEFAULT);
				return;
			case DDICPackage.DOMAIN__VALUE_TABLE_NAME:
				setValueTableName(VALUE_TABLE_NAME_EDEFAULT);
				return;
			case DDICPackage.DOMAIN__CONVERSION_EXIT:
				setConversionExit(CONVERSION_EXIT_EDEFAULT);
				return;
			case DDICPackage.DOMAIN__VALUES:
				getValues().clear();
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
			case DDICPackage.DOMAIN__COLLECTION:
				return getCollection() != null;
			case DDICPackage.DOMAIN__DESCRIPTION:
				return description != null && !description.isEmpty();
			case DDICPackage.DOMAIN__DICTIONARY_DATA_TYPE:
				return dictionaryDataType != DICTIONARY_DATA_TYPE_EDEFAULT;
			case DDICPackage.DOMAIN__LENGTH:
				return length != LENGTH_EDEFAULT;
			case DDICPackage.DOMAIN__OUTPUT_LENGTH:
				return outputLength != OUTPUT_LENGTH_EDEFAULT;
			case DDICPackage.DOMAIN__DECIMALS:
				return decimals != DECIMALS_EDEFAULT;
			case DDICPackage.DOMAIN__CASE_SENSITIVE:
				return caseSensitive != CASE_SENSITIVE_EDEFAULT;
			case DDICPackage.DOMAIN__SIGNED:
				return signed != SIGNED_EDEFAULT;
			case DDICPackage.DOMAIN__VALUE_LIST_FIXED:
				return valueListFixed != VALUE_LIST_FIXED_EDEFAULT;
			case DDICPackage.DOMAIN__VALUE_TABLE_NAME:
				return VALUE_TABLE_NAME_EDEFAULT == null ? valueTableName != null : !VALUE_TABLE_NAME_EDEFAULT.equals(valueTableName);
			case DDICPackage.DOMAIN__CONVERSION_EXIT:
				return CONVERSION_EXIT_EDEFAULT == null ? conversionExit != null : !CONVERSION_EXIT_EDEFAULT.equals(conversionExit);
			case DDICPackage.DOMAIN__VALUES:
				return values != null && !values.isEmpty();
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
		result.append(" (dictionaryDataType: "); //$NON-NLS-1$
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
		return "DOMA";
	}
	
} //DomainImpl
