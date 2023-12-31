/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.kafka.schema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class PersonDetails extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1418948455345780529L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PersonDetails\",\"namespace\":\"com.example.kafka.schema\",\"fields\":[{\"name\":\"empId\",\"type\":\"int\"},{\"name\":\"firstName\",\"type\":[\"null\",\"string\"]},{\"name\":\"lastName\",\"type\":[\"null\",\"string\"]},{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"sex\",\"type\":[\"null\",\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PersonDetails> ENCODER =
      new BinaryMessageEncoder<PersonDetails>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PersonDetails> DECODER =
      new BinaryMessageDecoder<PersonDetails>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<PersonDetails> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<PersonDetails> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PersonDetails>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this PersonDetails to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a PersonDetails from a ByteBuffer. */
  public static PersonDetails fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int empId;
  @Deprecated public java.lang.CharSequence firstName;
  @Deprecated public java.lang.CharSequence lastName;
  @Deprecated public int age;
  @Deprecated public java.lang.CharSequence sex;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PersonDetails() {}

  /**
   * All-args constructor.
   * @param empId The new value for empId
   * @param firstName The new value for firstName
   * @param lastName The new value for lastName
   * @param age The new value for age
   * @param sex The new value for sex
   */
  public PersonDetails(java.lang.Integer empId, java.lang.CharSequence firstName, java.lang.CharSequence lastName, java.lang.Integer age, java.lang.CharSequence sex) {
    this.empId = empId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.sex = sex;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return empId;
    case 1: return firstName;
    case 2: return lastName;
    case 3: return age;
    case 4: return sex;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: empId = (java.lang.Integer)value$; break;
    case 1: firstName = (java.lang.CharSequence)value$; break;
    case 2: lastName = (java.lang.CharSequence)value$; break;
    case 3: age = (java.lang.Integer)value$; break;
    case 4: sex = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'empId' field.
   * @return The value of the 'empId' field.
   */
  public java.lang.Integer getEmpId() {
    return empId;
  }

  /**
   * Sets the value of the 'empId' field.
   * @param value the value to set.
   */
  public void setEmpId(java.lang.Integer value) {
    this.empId = value;
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return The value of the 'firstName' field.
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the 'firstName' field.
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   * @return The value of the 'lastName' field.
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the 'lastName' field.
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'sex' field.
   * @return The value of the 'sex' field.
   */
  public java.lang.CharSequence getSex() {
    return sex;
  }

  /**
   * Sets the value of the 'sex' field.
   * @param value the value to set.
   */
  public void setSex(java.lang.CharSequence value) {
    this.sex = value;
  }

  /**
   * Creates a new PersonDetails RecordBuilder.
   * @return A new PersonDetails RecordBuilder
   */
  public static com.example.kafka.schema.PersonDetails.Builder newBuilder() {
    return new com.example.kafka.schema.PersonDetails.Builder();
  }

  /**
   * Creates a new PersonDetails RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PersonDetails RecordBuilder
   */
  public static com.example.kafka.schema.PersonDetails.Builder newBuilder(com.example.kafka.schema.PersonDetails.Builder other) {
    return new com.example.kafka.schema.PersonDetails.Builder(other);
  }

  /**
   * Creates a new PersonDetails RecordBuilder by copying an existing PersonDetails instance.
   * @param other The existing instance to copy.
   * @return A new PersonDetails RecordBuilder
   */
  public static com.example.kafka.schema.PersonDetails.Builder newBuilder(com.example.kafka.schema.PersonDetails other) {
    return new com.example.kafka.schema.PersonDetails.Builder(other);
  }

  /**
   * RecordBuilder for PersonDetails instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PersonDetails>
    implements org.apache.avro.data.RecordBuilder<PersonDetails> {

    private int empId;
    private java.lang.CharSequence firstName;
    private java.lang.CharSequence lastName;
    private int age;
    private java.lang.CharSequence sex;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.kafka.schema.PersonDetails.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.empId)) {
        this.empId = data().deepCopy(fields()[0].schema(), other.empId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.firstName)) {
        this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.age)) {
        this.age = data().deepCopy(fields()[3].schema(), other.age);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.sex)) {
        this.sex = data().deepCopy(fields()[4].schema(), other.sex);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing PersonDetails instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.kafka.schema.PersonDetails other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.empId)) {
        this.empId = data().deepCopy(fields()[0].schema(), other.empId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.firstName)) {
        this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.age)) {
        this.age = data().deepCopy(fields()[3].schema(), other.age);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.sex)) {
        this.sex = data().deepCopy(fields()[4].schema(), other.sex);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'empId' field.
      * @return The value.
      */
    public java.lang.Integer getEmpId() {
      return empId;
    }

    /**
      * Sets the value of the 'empId' field.
      * @param value The value of 'empId'.
      * @return This builder.
      */
    public com.example.kafka.schema.PersonDetails.Builder setEmpId(int value) {
      validate(fields()[0], value);
      this.empId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'empId' field has been set.
      * @return True if the 'empId' field has been set, false otherwise.
      */
    public boolean hasEmpId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'empId' field.
      * @return This builder.
      */
    public com.example.kafka.schema.PersonDetails.Builder clearEmpId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'firstName' field.
      * @return The value.
      */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }

    /**
      * Sets the value of the 'firstName' field.
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public com.example.kafka.schema.PersonDetails.Builder setFirstName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.firstName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'firstName' field.
      * @return This builder.
      */
    public com.example.kafka.schema.PersonDetails.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * @return The value.
      */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }

    /**
      * Sets the value of the 'lastName' field.
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public com.example.kafka.schema.PersonDetails.Builder setLastName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.lastName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'lastName' field.
      * @return This builder.
      */
    public com.example.kafka.schema.PersonDetails.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.example.kafka.schema.PersonDetails.Builder setAge(int value) {
      validate(fields()[3], value);
      this.age = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public com.example.kafka.schema.PersonDetails.Builder clearAge() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'sex' field.
      * @return The value.
      */
    public java.lang.CharSequence getSex() {
      return sex;
    }

    /**
      * Sets the value of the 'sex' field.
      * @param value The value of 'sex'.
      * @return This builder.
      */
    public com.example.kafka.schema.PersonDetails.Builder setSex(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.sex = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'sex' field has been set.
      * @return True if the 'sex' field has been set, false otherwise.
      */
    public boolean hasSex() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'sex' field.
      * @return This builder.
      */
    public com.example.kafka.schema.PersonDetails.Builder clearSex() {
      sex = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PersonDetails build() {
      try {
        PersonDetails record = new PersonDetails();
        record.empId = fieldSetFlags()[0] ? this.empId : (java.lang.Integer) defaultValue(fields()[0]);
        record.firstName = fieldSetFlags()[1] ? this.firstName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.lastName = fieldSetFlags()[2] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.age = fieldSetFlags()[3] ? this.age : (java.lang.Integer) defaultValue(fields()[3]);
        record.sex = fieldSetFlags()[4] ? this.sex : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PersonDetails>
    WRITER$ = (org.apache.avro.io.DatumWriter<PersonDetails>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PersonDetails>
    READER$ = (org.apache.avro.io.DatumReader<PersonDetails>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
