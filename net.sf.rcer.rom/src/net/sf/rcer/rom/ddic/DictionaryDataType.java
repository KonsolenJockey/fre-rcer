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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Dictionary Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rom.ddic.DDICPackage#getDictionaryDataType()
 * @model
 * @generated
 */
public enum DictionaryDataType implements Enumerator {
	/**
	 * The '<em><b>ACCOUNTING PERIOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNTING_PERIOD_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNTING_PERIOD(1, "ACCOUNTING_PERIOD", "ACCP"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>CHARACTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_VALUE
	 * @generated
	 * @ordered
	 */
	CHARACTER(2, "CHARACTER", "CHAR"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>CLIENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT(3, "CLIENT", "CLNT"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>CURRENCY KEY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENCY_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENCY_KEY(4, "CURRENCY_KEY", "CUKY"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>CURRENCY VALUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURRENCY_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	CURRENCY_VALUE(5, "CURRENCY_VALUE", "CURR"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(6, "DATE", "DATS"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>DECIMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(7, "DECIMAL", "DEC"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>FLOATING POINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOATING_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOATING_POINT(8, "FLOATING_POINT", "FLTP"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>INT BYTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	INT_BYTE(9, "INT_BYTE", "INT1"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>INT WORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_WORD_VALUE
	 * @generated
	 * @ordered
	 */
	INT_WORD(10, "INT_WORD", "INT2"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>INT DWORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_DWORD_VALUE
	 * @generated
	 * @ordered
	 */
	INT_DWORD(11, "INT_DWORD", "INT4"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>LOCALE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCALE_VALUE
	 * @generated
	 * @ordered
	 */
	LOCALE(12, "LOCALE", "LANG"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>LONG CHARACTER SEQUENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_CHARACTER_SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	LONG_CHARACTER_SEQUENCE(13, "LONG_CHARACTER_SEQUENCE", "LCHR"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>LONG BYTE SEQUENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_BYTE_SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	LONG_BYTE_SEQUENCE(14, "LONG_BYTE_SEQUENCE", "LRAW"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>NUMERICAL CHARACTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERICAL_CHARACTER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERICAL_CHARACTER(15, "NUMERICAL_CHARACTER", "NUMC"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>PRECISION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECISION_VALUE
	 * @generated
	 * @ordered
	 */
	PRECISION(16, "PRECISION", "PREC"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>QUANTITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUANTITY_VALUE
	 * @generated
	 * @ordered
	 */
	QUANTITY(17, "QUANTITY", "QUAN"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>BYTES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTES_VALUE
	 * @generated
	 * @ordered
	 */
	BYTES(18, "BYTES", "RAW"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>BYTE STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	BYTE_STRING(19, "BYTE_STRING", "RSTR"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>SHORT CHARACTER STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_CHARACTER_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT_CHARACTER_STRING(20, "SHORT_CHARACTER_STRING", "SSTR"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>CHARACTER STRING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	CHARACTER_STRING(21, "CHARACTER_STRING", "STRG"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(22, "TIME", "TIMS"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>VAR CHARACTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VAR_CHARACTER_VALUE
	 * @generated
	 * @ordered
	 */
	VAR_CHARACTER(23, "VAR_CHARACTER", "VARC"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>UNIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIT_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT(24, "UNIT", "UNIT"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>ACCOUNTING PERIOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACCOUNTING PERIOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCOUNTING_PERIOD
	 * @model literal="ACCP"
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNTING_PERIOD_VALUE = 1;

	/**
	 * The '<em><b>CHARACTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARACTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTER
	 * @model literal="CHAR"
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTER_VALUE = 2;

	/**
	 * The '<em><b>CLIENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLIENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIENT
	 * @model literal="CLNT"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_VALUE = 3;

	/**
	 * The '<em><b>CURRENCY KEY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURRENCY KEY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURRENCY_KEY
	 * @model literal="CUKY"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENCY_KEY_VALUE = 4;

	/**
	 * The '<em><b>CURRENCY VALUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURRENCY VALUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURRENCY_VALUE
	 * @model literal="CURR"
	 * @generated
	 * @ordered
	 */
	public static final int CURRENCY_VALUE_VALUE = 5;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model literal="DATS"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 6;

	/**
	 * The '<em><b>DECIMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DECIMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DECIMAL
	 * @model literal="DEC"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 7;

	/**
	 * The '<em><b>FLOATING POINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOATING POINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOATING_POINT
	 * @model literal="FLTP"
	 * @generated
	 * @ordered
	 */
	public static final int FLOATING_POINT_VALUE = 8;

	/**
	 * The '<em><b>INT BYTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT BYTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT_BYTE
	 * @model literal="INT1"
	 * @generated
	 * @ordered
	 */
	public static final int INT_BYTE_VALUE = 9;

	/**
	 * The '<em><b>INT WORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT WORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT_WORD
	 * @model literal="INT2"
	 * @generated
	 * @ordered
	 */
	public static final int INT_WORD_VALUE = 10;

	/**
	 * The '<em><b>INT DWORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INT DWORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INT_DWORD
	 * @model literal="INT4"
	 * @generated
	 * @ordered
	 */
	public static final int INT_DWORD_VALUE = 11;

	/**
	 * The '<em><b>LOCALE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOCALE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCALE
	 * @model literal="LANG"
	 * @generated
	 * @ordered
	 */
	public static final int LOCALE_VALUE = 12;

	/**
	 * The '<em><b>LONG CHARACTER SEQUENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LONG CHARACTER SEQUENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG_CHARACTER_SEQUENCE
	 * @model literal="LCHR"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_CHARACTER_SEQUENCE_VALUE = 13;

	/**
	 * The '<em><b>LONG BYTE SEQUENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LONG BYTE SEQUENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG_BYTE_SEQUENCE
	 * @model literal="LRAW"
	 * @generated
	 * @ordered
	 */
	public static final int LONG_BYTE_SEQUENCE_VALUE = 14;

	/**
	 * The '<em><b>NUMERICAL CHARACTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUMERICAL CHARACTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERICAL_CHARACTER
	 * @model literal="NUMC"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERICAL_CHARACTER_VALUE = 15;

	/**
	 * The '<em><b>PRECISION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRECISION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRECISION
	 * @model literal="PREC"
	 * @generated
	 * @ordered
	 */
	public static final int PRECISION_VALUE = 16;

	/**
	 * The '<em><b>QUANTITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>QUANTITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUANTITY
	 * @model literal="QUAN"
	 * @generated
	 * @ordered
	 */
	public static final int QUANTITY_VALUE = 17;

	/**
	 * The '<em><b>BYTES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BYTES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTES
	 * @model literal="RAW"
	 * @generated
	 * @ordered
	 */
	public static final int BYTES_VALUE = 18;

	/**
	 * The '<em><b>BYTE STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BYTE STRING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BYTE_STRING
	 * @model literal="RSTR"
	 * @generated
	 * @ordered
	 */
	public static final int BYTE_STRING_VALUE = 19;

	/**
	 * The '<em><b>SHORT CHARACTER STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHORT CHARACTER STRING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORT_CHARACTER_STRING
	 * @model literal="SSTR"
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_CHARACTER_STRING_VALUE = 20;

	/**
	 * The '<em><b>CHARACTER STRING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHARACTER STRING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARACTER_STRING
	 * @model literal="STRG"
	 * @generated
	 * @ordered
	 */
	public static final int CHARACTER_STRING_VALUE = 21;

	/**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model literal="TIMS"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 22;

	/**
	 * The '<em><b>VAR CHARACTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VAR CHARACTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VAR_CHARACTER
	 * @model literal="VARC"
	 * @generated
	 * @ordered
	 */
	public static final int VAR_CHARACTER_VALUE = 23;

	/**
	 * The '<em><b>UNIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_VALUE = 24;

	/**
	 * An array of all the '<em><b>Dictionary Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DictionaryDataType[] VALUES_ARRAY =
		new DictionaryDataType[] {
			ACCOUNTING_PERIOD,
			CHARACTER,
			CLIENT,
			CURRENCY_KEY,
			CURRENCY_VALUE,
			DATE,
			DECIMAL,
			FLOATING_POINT,
			INT_BYTE,
			INT_WORD,
			INT_DWORD,
			LOCALE,
			LONG_CHARACTER_SEQUENCE,
			LONG_BYTE_SEQUENCE,
			NUMERICAL_CHARACTER,
			PRECISION,
			QUANTITY,
			BYTES,
			BYTE_STRING,
			SHORT_CHARACTER_STRING,
			CHARACTER_STRING,
			TIME,
			VAR_CHARACTER,
			UNIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Dictionary Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DictionaryDataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dictionary Data Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DictionaryDataType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DictionaryDataType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dictionary Data Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DictionaryDataType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DictionaryDataType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dictionary Data Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DictionaryDataType get(int value) {
		switch (value) {
			case ACCOUNTING_PERIOD_VALUE: return ACCOUNTING_PERIOD;
			case CHARACTER_VALUE: return CHARACTER;
			case CLIENT_VALUE: return CLIENT;
			case CURRENCY_KEY_VALUE: return CURRENCY_KEY;
			case CURRENCY_VALUE_VALUE: return CURRENCY_VALUE;
			case DATE_VALUE: return DATE;
			case DECIMAL_VALUE: return DECIMAL;
			case FLOATING_POINT_VALUE: return FLOATING_POINT;
			case INT_BYTE_VALUE: return INT_BYTE;
			case INT_WORD_VALUE: return INT_WORD;
			case INT_DWORD_VALUE: return INT_DWORD;
			case LOCALE_VALUE: return LOCALE;
			case LONG_CHARACTER_SEQUENCE_VALUE: return LONG_CHARACTER_SEQUENCE;
			case LONG_BYTE_SEQUENCE_VALUE: return LONG_BYTE_SEQUENCE;
			case NUMERICAL_CHARACTER_VALUE: return NUMERICAL_CHARACTER;
			case PRECISION_VALUE: return PRECISION;
			case QUANTITY_VALUE: return QUANTITY;
			case BYTES_VALUE: return BYTES;
			case BYTE_STRING_VALUE: return BYTE_STRING;
			case SHORT_CHARACTER_STRING_VALUE: return SHORT_CHARACTER_STRING;
			case CHARACTER_STRING_VALUE: return CHARACTER_STRING;
			case TIME_VALUE: return TIME;
			case VAR_CHARACTER_VALUE: return VAR_CHARACTER;
			case UNIT_VALUE: return UNIT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DictionaryDataType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DictionaryDataType
