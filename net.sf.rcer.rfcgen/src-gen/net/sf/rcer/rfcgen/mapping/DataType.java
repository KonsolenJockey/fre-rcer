/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.rcer.rfcgen.mapping;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.rcer.rfcgen.mapping.MappingPackage#getDataType()
 * @model
 * @generated
 */
public enum DataType implements Enumerator
{
  /**
   * The '<em><b>BIG DECIMAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIG_DECIMAL_VALUE
   * @generated
   * @ordered
   */
  BIG_DECIMAL(0, "BIG_DECIMAL", "BigDecimal"),

  /**
   * The '<em><b>BIG INTEGER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIG_INTEGER_VALUE
   * @generated
   * @ordered
   */
  BIG_INTEGER(1, "BIG_INTEGER", "BigInteger"),

  /**
   * The '<em><b>BOOLEAN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOLEAN_VALUE
   * @generated
   * @ordered
   */
  BOOLEAN(2, "BOOLEAN", "Boolean"),

  /**
   * The '<em><b>BYTE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BYTE_VALUE
   * @generated
   * @ordered
   */
  BYTE(3, "BYTE", "Byte"),

  /**
   * The '<em><b>BYTE ARRAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BYTE_ARRAY_VALUE
   * @generated
   * @ordered
   */
  BYTE_ARRAY(4, "BYTE_ARRAY", "ByteArray"),

  /**
   * The '<em><b>CHAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHAR_VALUE
   * @generated
   * @ordered
   */
  CHAR(5, "CHAR", "Char"),

  /**
   * The '<em><b>CHAR ARRAY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHAR_ARRAY_VALUE
   * @generated
   * @ordered
   */
  CHAR_ARRAY(6, "CHAR_ARRAY", "CharArray"),

  /**
   * The '<em><b>DATE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_VALUE
   * @generated
   * @ordered
   */
  DATE(7, "DATE", "Date"),

  /**
   * The '<em><b>DOUBLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLE_VALUE
   * @generated
   * @ordered
   */
  DOUBLE(8, "DOUBLE", "Double"),

  /**
   * The '<em><b>FLOAT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLOAT_VALUE
   * @generated
   * @ordered
   */
  FLOAT(9, "FLOAT", "Float"),

  /**
   * The '<em><b>INTEGER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER_VALUE
   * @generated
   * @ordered
   */
  INTEGER(10, "INTEGER", "Integer"),

  /**
   * The '<em><b>LONG</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LONG_VALUE
   * @generated
   * @ordered
   */
  LONG(11, "LONG", "Long"),

  /**
   * The '<em><b>SHORT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SHORT_VALUE
   * @generated
   * @ordered
   */
  SHORT(12, "SHORT", "Short"),

  /**
   * The '<em><b>STRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(13, "STRING", "String"),

  /**
   * The '<em><b>TIME</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_VALUE
   * @generated
   * @ordered
   */
  TIME(14, "TIME", "Time");

  /**
   * The '<em><b>BIG DECIMAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BIG DECIMAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BIG_DECIMAL
   * @model literal="BigDecimal"
   * @generated
   * @ordered
   */
  public static final int BIG_DECIMAL_VALUE = 0;

  /**
   * The '<em><b>BIG INTEGER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BIG INTEGER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BIG_INTEGER
   * @model literal="BigInteger"
   * @generated
   * @ordered
   */
  public static final int BIG_INTEGER_VALUE = 1;

  /**
   * The '<em><b>BOOLEAN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BOOLEAN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOLEAN
   * @model literal="Boolean"
   * @generated
   * @ordered
   */
  public static final int BOOLEAN_VALUE = 2;

  /**
   * The '<em><b>BYTE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BYTE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BYTE
   * @model literal="Byte"
   * @generated
   * @ordered
   */
  public static final int BYTE_VALUE = 3;

  /**
   * The '<em><b>BYTE ARRAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BYTE ARRAY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BYTE_ARRAY
   * @model literal="ByteArray"
   * @generated
   * @ordered
   */
  public static final int BYTE_ARRAY_VALUE = 4;

  /**
   * The '<em><b>CHAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CHAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHAR
   * @model literal="Char"
   * @generated
   * @ordered
   */
  public static final int CHAR_VALUE = 5;

  /**
   * The '<em><b>CHAR ARRAY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CHAR ARRAY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHAR_ARRAY
   * @model literal="CharArray"
   * @generated
   * @ordered
   */
  public static final int CHAR_ARRAY_VALUE = 6;

  /**
   * The '<em><b>DATE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DATE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE
   * @model literal="Date"
   * @generated
   * @ordered
   */
  public static final int DATE_VALUE = 7;

  /**
   * The '<em><b>DOUBLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DOUBLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOUBLE
   * @model literal="Double"
   * @generated
   * @ordered
   */
  public static final int DOUBLE_VALUE = 8;

  /**
   * The '<em><b>FLOAT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FLOAT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLOAT
   * @model literal="Float"
   * @generated
   * @ordered
   */
  public static final int FLOAT_VALUE = 9;

  /**
   * The '<em><b>INTEGER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INTEGER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTEGER
   * @model literal="Integer"
   * @generated
   * @ordered
   */
  public static final int INTEGER_VALUE = 10;

  /**
   * The '<em><b>LONG</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LONG</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LONG
   * @model literal="Long"
   * @generated
   * @ordered
   */
  public static final int LONG_VALUE = 11;

  /**
   * The '<em><b>SHORT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SHORT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SHORT
   * @model literal="Short"
   * @generated
   * @ordered
   */
  public static final int SHORT_VALUE = 12;

  /**
   * The '<em><b>STRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model literal="String"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 13;

  /**
   * The '<em><b>TIME</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TIME</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME
   * @model literal="Time"
   * @generated
   * @ordered
   */
  public static final int TIME_VALUE = 14;

  /**
   * An array of all the '<em><b>Data Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DataType[] VALUES_ARRAY =
    new DataType[]
    {
      BIG_DECIMAL,
      BIG_INTEGER,
      BOOLEAN,
      BYTE,
      BYTE_ARRAY,
      CHAR,
      CHAR_ARRAY,
      DATE,
      DOUBLE,
      FLOAT,
      INTEGER,
      LONG,
      SHORT,
      STRING,
      TIME,
    };

  /**
   * A public read-only list of all the '<em><b>Data Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataType get(int value)
  {
    switch (value)
    {
      case BIG_DECIMAL_VALUE: return BIG_DECIMAL;
      case BIG_INTEGER_VALUE: return BIG_INTEGER;
      case BOOLEAN_VALUE: return BOOLEAN;
      case BYTE_VALUE: return BYTE;
      case BYTE_ARRAY_VALUE: return BYTE_ARRAY;
      case CHAR_VALUE: return CHAR;
      case CHAR_ARRAY_VALUE: return CHAR_ARRAY;
      case DATE_VALUE: return DATE;
      case DOUBLE_VALUE: return DOUBLE;
      case FLOAT_VALUE: return FLOAT;
      case INTEGER_VALUE: return INTEGER;
      case LONG_VALUE: return LONG;
      case SHORT_VALUE: return SHORT;
      case STRING_VALUE: return STRING;
      case TIME_VALUE: return TIME;
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
  private DataType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DataType
