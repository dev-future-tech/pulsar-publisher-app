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
public class EngineerResourceRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8863676944622677380L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EngineerResourceRequest\",\"namespace\":\"com.example.pulsarproducerapp\",\"fields\":[{\"name\":\"engineerId\",\"type\":\"long\"},{\"name\":\"role\",\"type\":[\"null\",\"string\"]},{\"name\":\"resources\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"EngineeringResource\",\"fields\":[{\"name\":\"resourceType\",\"type\":{\"type\":\"enum\",\"name\":\"ResourceType\",\"symbols\":[\"LAPTOP\",\"VPN\",\"DEVPORTAL\",\"EMAIL\",\"IM\"]}},{\"name\":\"resourceName\",\"type\":[\"null\",\"string\"]},{\"name\":\"approved\",\"type\":\"boolean\",\"default\":false}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EngineerResourceRequest> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EngineerResourceRequest> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<EngineerResourceRequest> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<EngineerResourceRequest> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<EngineerResourceRequest> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this EngineerResourceRequest to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a EngineerResourceRequest from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a EngineerResourceRequest instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static EngineerResourceRequest fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private long engineerId;
  private java.lang.CharSequence role;
  private java.util.List<com.example.pulsarproducerapp.EngineeringResource> resources;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EngineerResourceRequest() {}

  /**
   * All-args constructor.
   * @param engineerId The new value for engineerId
   * @param role The new value for role
   * @param resources The new value for resources
   */
  public EngineerResourceRequest(java.lang.Long engineerId, java.lang.CharSequence role, java.util.List<com.example.pulsarproducerapp.EngineeringResource> resources) {
    this.engineerId = engineerId;
    this.role = role;
    this.resources = resources;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return engineerId;
    case 1: return role;
    case 2: return resources;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: engineerId = (java.lang.Long)value$; break;
    case 1: role = (java.lang.CharSequence)value$; break;
    case 2: resources = (java.util.List<com.example.pulsarproducerapp.EngineeringResource>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'engineerId' field.
   * @return The value of the 'engineerId' field.
   */
  public long getEngineerId() {
    return engineerId;
  }


  /**
   * Sets the value of the 'engineerId' field.
   * @param value the value to set.
   */
  public void setEngineerId(long value) {
    this.engineerId = value;
  }

  /**
   * Gets the value of the 'role' field.
   * @return The value of the 'role' field.
   */
  public java.lang.CharSequence getRole() {
    return role;
  }


  /**
   * Sets the value of the 'role' field.
   * @param value the value to set.
   */
  public void setRole(java.lang.CharSequence value) {
    this.role = value;
  }

  /**
   * Gets the value of the 'resources' field.
   * @return The value of the 'resources' field.
   */
  public java.util.List<com.example.pulsarproducerapp.EngineeringResource> getResources() {
    return resources;
  }


  /**
   * Sets the value of the 'resources' field.
   * @param value the value to set.
   */
  public void setResources(java.util.List<com.example.pulsarproducerapp.EngineeringResource> value) {
    this.resources = value;
  }

  /**
   * Creates a new EngineerResourceRequest RecordBuilder.
   * @return A new EngineerResourceRequest RecordBuilder
   */
  public static com.example.pulsarproducerapp.EngineerResourceRequest.Builder newBuilder() {
    return new com.example.pulsarproducerapp.EngineerResourceRequest.Builder();
  }

  /**
   * Creates a new EngineerResourceRequest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EngineerResourceRequest RecordBuilder
   */
  public static com.example.pulsarproducerapp.EngineerResourceRequest.Builder newBuilder(com.example.pulsarproducerapp.EngineerResourceRequest.Builder other) {
    if (other == null) {
      return new com.example.pulsarproducerapp.EngineerResourceRequest.Builder();
    } else {
      return new com.example.pulsarproducerapp.EngineerResourceRequest.Builder(other);
    }
  }

  /**
   * Creates a new EngineerResourceRequest RecordBuilder by copying an existing EngineerResourceRequest instance.
   * @param other The existing instance to copy.
   * @return A new EngineerResourceRequest RecordBuilder
   */
  public static com.example.pulsarproducerapp.EngineerResourceRequest.Builder newBuilder(com.example.pulsarproducerapp.EngineerResourceRequest other) {
    if (other == null) {
      return new com.example.pulsarproducerapp.EngineerResourceRequest.Builder();
    } else {
      return new com.example.pulsarproducerapp.EngineerResourceRequest.Builder(other);
    }
  }

  /**
   * RecordBuilder for EngineerResourceRequest instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EngineerResourceRequest>
    implements org.apache.avro.data.RecordBuilder<EngineerResourceRequest> {

    private long engineerId;
    private java.lang.CharSequence role;
    private java.util.List<com.example.pulsarproducerapp.EngineeringResource> resources;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.pulsarproducerapp.EngineerResourceRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.engineerId)) {
        this.engineerId = data().deepCopy(fields()[0].schema(), other.engineerId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.role)) {
        this.role = data().deepCopy(fields()[1].schema(), other.role);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.resources)) {
        this.resources = data().deepCopy(fields()[2].schema(), other.resources);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing EngineerResourceRequest instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.pulsarproducerapp.EngineerResourceRequest other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.engineerId)) {
        this.engineerId = data().deepCopy(fields()[0].schema(), other.engineerId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.role)) {
        this.role = data().deepCopy(fields()[1].schema(), other.role);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.resources)) {
        this.resources = data().deepCopy(fields()[2].schema(), other.resources);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'engineerId' field.
      * @return The value.
      */
    public long getEngineerId() {
      return engineerId;
    }


    /**
      * Sets the value of the 'engineerId' field.
      * @param value The value of 'engineerId'.
      * @return This builder.
      */
    public com.example.pulsarproducerapp.EngineerResourceRequest.Builder setEngineerId(long value) {
      validate(fields()[0], value);
      this.engineerId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'engineerId' field has been set.
      * @return True if the 'engineerId' field has been set, false otherwise.
      */
    public boolean hasEngineerId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'engineerId' field.
      * @return This builder.
      */
    public com.example.pulsarproducerapp.EngineerResourceRequest.Builder clearEngineerId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'role' field.
      * @return The value.
      */
    public java.lang.CharSequence getRole() {
      return role;
    }


    /**
      * Sets the value of the 'role' field.
      * @param value The value of 'role'.
      * @return This builder.
      */
    public com.example.pulsarproducerapp.EngineerResourceRequest.Builder setRole(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.role = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'role' field has been set.
      * @return True if the 'role' field has been set, false otherwise.
      */
    public boolean hasRole() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'role' field.
      * @return This builder.
      */
    public com.example.pulsarproducerapp.EngineerResourceRequest.Builder clearRole() {
      role = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'resources' field.
      * @return The value.
      */
    public java.util.List<com.example.pulsarproducerapp.EngineeringResource> getResources() {
      return resources;
    }


    /**
      * Sets the value of the 'resources' field.
      * @param value The value of 'resources'.
      * @return This builder.
      */
    public com.example.pulsarproducerapp.EngineerResourceRequest.Builder setResources(java.util.List<com.example.pulsarproducerapp.EngineeringResource> value) {
      validate(fields()[2], value);
      this.resources = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'resources' field has been set.
      * @return True if the 'resources' field has been set, false otherwise.
      */
    public boolean hasResources() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'resources' field.
      * @return This builder.
      */
    public com.example.pulsarproducerapp.EngineerResourceRequest.Builder clearResources() {
      resources = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EngineerResourceRequest build() {
      try {
        EngineerResourceRequest record = new EngineerResourceRequest();
        record.engineerId = fieldSetFlags()[0] ? this.engineerId : (java.lang.Long) defaultValue(fields()[0]);
        record.role = fieldSetFlags()[1] ? this.role : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.resources = fieldSetFlags()[2] ? this.resources : (java.util.List<com.example.pulsarproducerapp.EngineeringResource>) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EngineerResourceRequest>
    WRITER$ = (org.apache.avro.io.DatumWriter<EngineerResourceRequest>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EngineerResourceRequest>
    READER$ = (org.apache.avro.io.DatumReader<EngineerResourceRequest>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.engineerId);

    if (this.role == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.role);
    }

    long size0 = this.resources.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.example.pulsarproducerapp.EngineeringResource e0: this.resources) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.engineerId = in.readLong();

      if (in.readIndex() != 1) {
        in.readNull();
        this.role = null;
      } else {
        this.role = in.readString(this.role instanceof Utf8 ? (Utf8)this.role : null);
      }

      long size0 = in.readArrayStart();
      java.util.List<com.example.pulsarproducerapp.EngineeringResource> a0 = this.resources;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.example.pulsarproducerapp.EngineeringResource>((int)size0, SCHEMA$.getField("resources").schema());
        this.resources = a0;
      } else a0.clear();
      SpecificData.Array<com.example.pulsarproducerapp.EngineeringResource> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.example.pulsarproducerapp.EngineeringResource>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.example.pulsarproducerapp.EngineeringResource e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.example.pulsarproducerapp.EngineeringResource();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.engineerId = in.readLong();
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.role = null;
          } else {
            this.role = in.readString(this.role instanceof Utf8 ? (Utf8)this.role : null);
          }
          break;

        case 2:
          long size0 = in.readArrayStart();
          java.util.List<com.example.pulsarproducerapp.EngineeringResource> a0 = this.resources;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.example.pulsarproducerapp.EngineeringResource>((int)size0, SCHEMA$.getField("resources").schema());
            this.resources = a0;
          } else a0.clear();
          SpecificData.Array<com.example.pulsarproducerapp.EngineeringResource> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.example.pulsarproducerapp.EngineeringResource>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.example.pulsarproducerapp.EngineeringResource e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.example.pulsarproducerapp.EngineeringResource();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










