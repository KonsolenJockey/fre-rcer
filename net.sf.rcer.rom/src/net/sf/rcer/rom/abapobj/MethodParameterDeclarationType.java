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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Method Parameter Declaration Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rom.abapobj.ABAPObjectsPackage#getMethodParameterDeclarationType()
 * @model
 * @generated
 */
public enum MethodParameterDeclarationType implements Enumerator {
	/**
	 * The '<em><b>IMPORTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPORTING_VALUE
	 * @generated
	 * @ordered
	 */
	IMPORTING(0, "IMPORTING", "IMPORTING"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>EXPORTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPORTING_VALUE
	 * @generated
	 * @ordered
	 */
	EXPORTING(1, "EXPORTING", "EXPORTING"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>CHANGING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGING_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGING(2, "CHANGING", "CHANGING"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>RETURNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURNING_VALUE
	 * @generated
	 * @ordered
	 */
	RETURNING(3, "RETURNING", "RETURNING"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>IMPORTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMPORTING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPORTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMPORTING_VALUE = 0;

	/**
	 * The '<em><b>EXPORTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXPORTING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPORTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPORTING_VALUE = 1;

	/**
	 * The '<em><b>CHANGING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHANGING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHANGING_VALUE = 2;

	/**
	 * The '<em><b>RETURNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RETURNING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETURNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RETURNING_VALUE = 3;

	/**
	 * An array of all the '<em><b>Method Parameter Declaration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MethodParameterDeclarationType[] VALUES_ARRAY =
		new MethodParameterDeclarationType[] {
			IMPORTING,
			EXPORTING,
			CHANGING,
			RETURNING,
		};

	/**
	 * A public read-only list of all the '<em><b>Method Parameter Declaration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MethodParameterDeclarationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Method Parameter Declaration Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MethodParameterDeclarationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MethodParameterDeclarationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Method Parameter Declaration Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MethodParameterDeclarationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MethodParameterDeclarationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Method Parameter Declaration Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MethodParameterDeclarationType get(int value) {
		switch (value) {
			case IMPORTING_VALUE: return IMPORTING;
			case EXPORTING_VALUE: return EXPORTING;
			case CHANGING_VALUE: return CHANGING;
			case RETURNING_VALUE: return RETURNING;
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
	private MethodParameterDeclarationType(int value, String name, String literal) {
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
	
} //MethodParameterDeclarationType
