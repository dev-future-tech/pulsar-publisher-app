/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.pulsarproducerapp;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class EngineeringResource extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8983847221414138020L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EngineeringResource\",\"namespace\":\"com.example.pulsarproducerapp\",\"fields\":[{\"name\":\"resourceType\",\"type\":{\"type\":\"enum\",\"name\":\"ResourceType\",\"symbols\":[\"LAPTOP\",\"VPN\",\"DEVPORTAL\",\"EMAIL\",\"IM\"]}},{\"name\":\"resourceName\",\"type\":[\"null\",\"string\"]},{\"name\":\"approved\",\"type\":\"boolean\",\"default\":false}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EngineeringResource> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EngineeringResource> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<EngineeringResource> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<EngineeringResource> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<EngineeringResource> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this EngineeringResource to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a EngineeringResource from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a EngineeringResource instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static EngineeringResource fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private com.example.pulsarproducerapp.ResourceType resourceType;
  private java.lang.CharSequence resourceName;
  private boolean approved;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EngineeringResource() {}

  /**
   * All-args constructor.
   * @param resourceType The new value for resourceType
   * @param resourceName The new value for resourceName
   * @param approved The new value for approved
   */
  public EngineeringResource(com.example.pulsarproducerapp.ResourceType resourceType, java.lang.CharSequence resourceName, java.lang.Boolean approved) {
    this.resourceType = resourceType;
    this.resourceName = resourceName;
    this.approved = approved;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return resourceType;
    case 1: return resourceName;
    case 2: return approved;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: resourceType = (com.example.pulsarproducerapp.ResourceType)value$; break;
    case 1: resourceName = (java.lang.CharSequence)value$; break;
    case 2: approved = (java.lang.Boolean)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'resourceType' field.
   * @return The value of the 'resourceType' field.
   */
  public com.example.pulsarproducerapp.ResourceType getResourceType() {
    return resourceType;
  }


  /**
   * Sets the value of the 'resourceType' field.
   * @param value the value to set.
   */
  public void setResourceType(com.example.pulsarproducerapp.ResourceType value) {
    this.resourceType = value;
  }

  /**
   * Gets the value of the 'resourceName' field.
   * @return The value of the 'resourceName' field.
   */
  public java.lang.CharSequence getResourceName() {
    return resourceName;
  }


  /**
   * Sets the value of the 'resourceName' field.
   * @param value the value to set.
   */
  public void setResourceName(java.lang.CharSequence value) {
    this.resourceName = value;
  }

  /**
   * Gets the value of the 'approved' field.
   * @return The value of the 'approved' field.
   */
  public boolean getApproved() {
    return approved;
  }


  /**
   * Sets the value of the 'approved' field.
   * @param value the value to set.
   */
  public void setApproved(boolean value) {
    this.approved = value;
  }

  /**
   * Creates a new EngineeringResource RecordBuilder.
   * @return A new EngineeringResource RecordBuilder
   */
  public static com.example.pulsarproducerapp.EngineeringResource.Builder newBuilder() {
    return new com.example.pulsarproducerapp.EngineeringResource.Builder();
  }

  /**
   * Creates a new EngineeringResource RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EngineeringResource RecordBuilder
   */
  public static com.example.pulsarproducerapp.EngineeringResource.Builder newBuilder(com.example.pulsarproducerapp.EngineeringResource.Builder other) {
    if (other == null) {
      return new com.example.pulsarproducerapp.EngineeringResource.Builder();
    } else {
      return new com.example.pulsarproducerapp.EngineeringResource.Builder(other);
    }
  }

  /**
   * Creates a new EngineeringResource RecordBuilder by copying an existing EngineeringResource instance.
   * @param other The existing instance to copy.
   * @return A new EngineeringResource RecordBuilder
   */
  public static com.example.pulsarproducerapp.EngineeringResource.Builder newBuilder(com.example.pulsarproducerapp.EngineeringResource other) {
    if (other == null) {
      return new com.example.pulsarproducerapp.EngineeringResource.Builder();
    } else {
      return new com.example.pulsarproducerapp.EngineeringResource.Builder(other);
    }
  }

  /**
   * RecordBuilder for EngineeringResource instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EngineeringResource>
    implements org.apache.avro.data.RecordBuilder<EngineeringResource> {

    private com.example.pulsarproducerapp.ResourceType resourceType;
    private java.lang.CharSequence resourceName;
    private boolean approved;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.pulsarproducerapp.EngineeringResource.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[0].schema(), other.resourceType);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.resourceName)) {
        this.resourceName = data().deepCopy(fields()[1].schema(), other.resourceName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.approved)) {
        this.approved = data().deepCopy(fields()[2].schema(), other.approved);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing EngineeringResource instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.pulsarproducerapp.EngineeringResource other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[0].schema(), other.resourceType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.resourceName)) {
        this.resourceName = data().deepCopy(fields()[1].schema(), other.resourceName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.approved)) {
        this.approved = data().deepCopy(fields()[2].schema(), other.approved);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'resourceType' field.
      * @return The value.
      */
    public com.example.pulsarproducerapp.ResourceType getResourceType() {
      return resourceType;
    }


    /**
      * Sets the value of the 'resourceType' field.
      * @param value The value of 'resourceType'.
      * @return This builder.
      */
    public com.example.pulsarproducerapp.EngineeringResource.Builder setResourceType(com.example.pulsarproducerapp.ResourceType value) {
      validate(fields()[0], value);
      this.resourceType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'resourceType' field has been set.
      * @return True if the 'resourceType' field has been set, false otherwise.
      */
    public boolean hasResourceType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'resourceType' field.
      * @return This builder.
      */
    public com.example.pulsarproducerapp.EngineeringResource.Builder clearResourceType() {
      resourceType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'resourceName' field.
      * @return The value.
      */
    public java.lang.CharSequence getResourceName() {
      return resourceName;
    }


    /**
      * Sets the value of the 'resourceName' field.
      * @param value The value of 'resourceName'.
      * @return This builder.
      */
    public com.example.pulsarproducerapp.EngineeringResource.Builder setResourceName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.resourceName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'resourceName' field has been set.
      * @return True if the 'resourceName' field has been set, false otherwise.
      */
    public boolean hasResourceName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'resourceName' field.
      * @return This builder.
      */
    public com.example.pulsarproducerapp.EngineeringResource.Builder clearResourceName() {
      resourceName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'approved' field.
      * @return The value.
      */
    public boolean getApproved() {
      return approved;
    }


    /**
      * Sets the value of the 'approved' field.
      * @param value The value of 'approved'.
      * @return This builder.
      */
    public com.example.pulsarproducerapp.EngineeringResource.Builder setApproved(boolean value) {
      validate(fields()[2], value);
      this.approved = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'approved' field has been set.
      * @return True if the 'approved' field has been set, false otherwise.
      */
    public boolean hasApproved() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'approved' field.
      * @return This builder.
      */
    public com.example.pulsarproducerapp.EngineeringResource.Builder clearApproved() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EngineeringResource build() {
      try {
        EngineeringResource record = new EngineeringResource();
        record.resourceType = fieldSetFlags()[0] ? this.resourceType : (com.example.pulsarproducerapp.ResourceType) defaultValue(fields()[0]);
        record.resourceName = fieldSetFlags()[1] ? this.resourceName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.approved = fieldSetFlags()[2] ? this.approved : (java.lang.Boolean) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EngineeringResource>
    WRITER$ = (org.apache.avro.io.DatumWriter<EngineeringResource>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EngineeringResource>
    READER$ = (org.apache.avro.io.DatumReader<EngineeringResource>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeEnum(this.resourceType.ordinal());

    if (this.resourceName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.resourceName);
    }

    out.writeBoolean(this.approved);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.resourceType = com.example.pulsarproducerapp.ResourceType.values()[in.readEnum()];

      if (in.readIndex() != 1) {
        in.readNull();
        this.resourceName = null;
      } else {
        this.resourceName = in.readString(this.resourceName instanceof Utf8 ? (Utf8)this.resourceName : null);
      }

      this.approved = in.readBoolean();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.resourceType = com.example.pulsarproducerapp.ResourceType.values()[in.readEnum()];
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.resourceName = null;
          } else {
            this.resourceName = in.readString(this.resourceName instanceof Utf8 ? (Utf8)this.resourceName : null);
          }
          break;

        case 2:
          this.approved = in.readBoolean();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










