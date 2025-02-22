/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/conformance/storage/v1/tests.proto

package com.google.cloud.conformance.storage.v1;

/** Protobuf type {@code google.cloud.conformance.storage.v1.PostPolicyV4Test} */
public final class PostPolicyV4Test extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.conformance.storage.v1.PostPolicyV4Test)
    PostPolicyV4TestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use PostPolicyV4Test.newBuilder() to construct.
  private PostPolicyV4Test(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PostPolicyV4Test() {
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PostPolicyV4Test();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.conformance.storage.v1.Tests
        .internal_static_google_cloud_conformance_storage_v1_PostPolicyV4Test_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.conformance.storage.v1.Tests
        .internal_static_google_cloud_conformance_storage_v1_PostPolicyV4Test_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.conformance.storage.v1.PostPolicyV4Test.class,
            com.google.cloud.conformance.storage.v1.PostPolicyV4Test.Builder.class);
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";

  /**
   * <code>string description = 1;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }

  /**
   * <code>string description = 1;</code>
   *
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POLICYINPUT_FIELD_NUMBER = 2;
  private com.google.cloud.conformance.storage.v1.PolicyInput policyInput_;

  /**
   * <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code>
   *
   * @return Whether the policyInput field is set.
   */
  @java.lang.Override
  public boolean hasPolicyInput() {
    return policyInput_ != null;
  }

  /**
   * <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code>
   *
   * @return The policyInput.
   */
  @java.lang.Override
  public com.google.cloud.conformance.storage.v1.PolicyInput getPolicyInput() {
    return policyInput_ == null
        ? com.google.cloud.conformance.storage.v1.PolicyInput.getDefaultInstance()
        : policyInput_;
  }

  /** <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code> */
  @java.lang.Override
  public com.google.cloud.conformance.storage.v1.PolicyInputOrBuilder getPolicyInputOrBuilder() {
    return policyInput_ == null
        ? com.google.cloud.conformance.storage.v1.PolicyInput.getDefaultInstance()
        : policyInput_;
  }

  public static final int POLICYOUTPUT_FIELD_NUMBER = 3;
  private com.google.cloud.conformance.storage.v1.PolicyOutput policyOutput_;

  /**
   * <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code>
   *
   * @return Whether the policyOutput field is set.
   */
  @java.lang.Override
  public boolean hasPolicyOutput() {
    return policyOutput_ != null;
  }

  /**
   * <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code>
   *
   * @return The policyOutput.
   */
  @java.lang.Override
  public com.google.cloud.conformance.storage.v1.PolicyOutput getPolicyOutput() {
    return policyOutput_ == null
        ? com.google.cloud.conformance.storage.v1.PolicyOutput.getDefaultInstance()
        : policyOutput_;
  }

  /** <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code> */
  @java.lang.Override
  public com.google.cloud.conformance.storage.v1.PolicyOutputOrBuilder getPolicyOutputOrBuilder() {
    return policyOutput_ == null
        ? com.google.cloud.conformance.storage.v1.PolicyOutput.getDefaultInstance()
        : policyOutput_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, description_);
    }
    if (policyInput_ != null) {
      output.writeMessage(2, getPolicyInput());
    }
    if (policyOutput_ != null) {
      output.writeMessage(3, getPolicyOutput());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, description_);
    }
    if (policyInput_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getPolicyInput());
    }
    if (policyOutput_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getPolicyOutput());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.conformance.storage.v1.PostPolicyV4Test)) {
      return super.equals(obj);
    }
    com.google.cloud.conformance.storage.v1.PostPolicyV4Test other =
        (com.google.cloud.conformance.storage.v1.PostPolicyV4Test) obj;

    if (!getDescription().equals(other.getDescription())) return false;
    if (hasPolicyInput() != other.hasPolicyInput()) return false;
    if (hasPolicyInput()) {
      if (!getPolicyInput().equals(other.getPolicyInput())) return false;
    }
    if (hasPolicyOutput() != other.hasPolicyOutput()) return false;
    if (hasPolicyOutput()) {
      if (!getPolicyOutput().equals(other.getPolicyOutput())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (hasPolicyInput()) {
      hash = (37 * hash) + POLICYINPUT_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyInput().hashCode();
    }
    if (hasPolicyOutput()) {
      hash = (37 * hash) + POLICYOUTPUT_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyOutput().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.conformance.storage.v1.PostPolicyV4Test parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.PostPolicyV4Test parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PostPolicyV4Test parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.PostPolicyV4Test parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PostPolicyV4Test parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.conformance.storage.v1.PostPolicyV4Test parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PostPolicyV4Test parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.PostPolicyV4Test parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PostPolicyV4Test parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.PostPolicyV4Test parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.conformance.storage.v1.PostPolicyV4Test parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.conformance.storage.v1.PostPolicyV4Test parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.conformance.storage.v1.PostPolicyV4Test prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /** Protobuf type {@code google.cloud.conformance.storage.v1.PostPolicyV4Test} */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.conformance.storage.v1.PostPolicyV4Test)
      com.google.cloud.conformance.storage.v1.PostPolicyV4TestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_PostPolicyV4Test_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_PostPolicyV4Test_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.conformance.storage.v1.PostPolicyV4Test.class,
              com.google.cloud.conformance.storage.v1.PostPolicyV4Test.Builder.class);
    }

    // Construct using com.google.cloud.conformance.storage.v1.PostPolicyV4Test.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      description_ = "";
      policyInput_ = null;
      if (policyInputBuilder_ != null) {
        policyInputBuilder_.dispose();
        policyInputBuilder_ = null;
      }
      policyOutput_ = null;
      if (policyOutputBuilder_ != null) {
        policyOutputBuilder_.dispose();
        policyOutputBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.conformance.storage.v1.Tests
          .internal_static_google_cloud_conformance_storage_v1_PostPolicyV4Test_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.PostPolicyV4Test getDefaultInstanceForType() {
      return com.google.cloud.conformance.storage.v1.PostPolicyV4Test.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.PostPolicyV4Test build() {
      com.google.cloud.conformance.storage.v1.PostPolicyV4Test result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.conformance.storage.v1.PostPolicyV4Test buildPartial() {
      com.google.cloud.conformance.storage.v1.PostPolicyV4Test result =
          new com.google.cloud.conformance.storage.v1.PostPolicyV4Test(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.conformance.storage.v1.PostPolicyV4Test result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.policyInput_ =
            policyInputBuilder_ == null ? policyInput_ : policyInputBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.policyOutput_ =
            policyOutputBuilder_ == null ? policyOutput_ : policyOutputBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.conformance.storage.v1.PostPolicyV4Test) {
        return mergeFrom((com.google.cloud.conformance.storage.v1.PostPolicyV4Test) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.conformance.storage.v1.PostPolicyV4Test other) {
      if (other == com.google.cloud.conformance.storage.v1.PostPolicyV4Test.getDefaultInstance())
        return this;
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPolicyInput()) {
        mergePolicyInput(other.getPolicyInput());
      }
      if (other.hasPolicyOutput()) {
        mergePolicyOutput(other.getPolicyOutput());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                description_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getPolicyInputFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getPolicyOutputFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object description_ = "";

    /**
     * <code>string description = 1;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     * <code>string description = 1;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     * <code>string description = 1;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      description_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     * <code>string description = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     * <code>string description = 1;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.conformance.storage.v1.PolicyInput policyInput_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.conformance.storage.v1.PolicyInput,
            com.google.cloud.conformance.storage.v1.PolicyInput.Builder,
            com.google.cloud.conformance.storage.v1.PolicyInputOrBuilder>
        policyInputBuilder_;

    /**
     * <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code>
     *
     * @return Whether the policyInput field is set.
     */
    public boolean hasPolicyInput() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code>
     *
     * @return The policyInput.
     */
    public com.google.cloud.conformance.storage.v1.PolicyInput getPolicyInput() {
      if (policyInputBuilder_ == null) {
        return policyInput_ == null
            ? com.google.cloud.conformance.storage.v1.PolicyInput.getDefaultInstance()
            : policyInput_;
      } else {
        return policyInputBuilder_.getMessage();
      }
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code> */
    public Builder setPolicyInput(com.google.cloud.conformance.storage.v1.PolicyInput value) {
      if (policyInputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policyInput_ = value;
      } else {
        policyInputBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code> */
    public Builder setPolicyInput(
        com.google.cloud.conformance.storage.v1.PolicyInput.Builder builderForValue) {
      if (policyInputBuilder_ == null) {
        policyInput_ = builderForValue.build();
      } else {
        policyInputBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code> */
    public Builder mergePolicyInput(com.google.cloud.conformance.storage.v1.PolicyInput value) {
      if (policyInputBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && policyInput_ != null
            && policyInput_
                != com.google.cloud.conformance.storage.v1.PolicyInput.getDefaultInstance()) {
          getPolicyInputBuilder().mergeFrom(value);
        } else {
          policyInput_ = value;
        }
      } else {
        policyInputBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code> */
    public Builder clearPolicyInput() {
      bitField0_ = (bitField0_ & ~0x00000002);
      policyInput_ = null;
      if (policyInputBuilder_ != null) {
        policyInputBuilder_.dispose();
        policyInputBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code> */
    public com.google.cloud.conformance.storage.v1.PolicyInput.Builder getPolicyInputBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPolicyInputFieldBuilder().getBuilder();
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code> */
    public com.google.cloud.conformance.storage.v1.PolicyInputOrBuilder getPolicyInputOrBuilder() {
      if (policyInputBuilder_ != null) {
        return policyInputBuilder_.getMessageOrBuilder();
      } else {
        return policyInput_ == null
            ? com.google.cloud.conformance.storage.v1.PolicyInput.getDefaultInstance()
            : policyInput_;
      }
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyInput policyInput = 2;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.conformance.storage.v1.PolicyInput,
            com.google.cloud.conformance.storage.v1.PolicyInput.Builder,
            com.google.cloud.conformance.storage.v1.PolicyInputOrBuilder>
        getPolicyInputFieldBuilder() {
      if (policyInputBuilder_ == null) {
        policyInputBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.conformance.storage.v1.PolicyInput,
                com.google.cloud.conformance.storage.v1.PolicyInput.Builder,
                com.google.cloud.conformance.storage.v1.PolicyInputOrBuilder>(
                getPolicyInput(), getParentForChildren(), isClean());
        policyInput_ = null;
      }
      return policyInputBuilder_;
    }

    private com.google.cloud.conformance.storage.v1.PolicyOutput policyOutput_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.conformance.storage.v1.PolicyOutput,
            com.google.cloud.conformance.storage.v1.PolicyOutput.Builder,
            com.google.cloud.conformance.storage.v1.PolicyOutputOrBuilder>
        policyOutputBuilder_;

    /**
     * <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code>
     *
     * @return Whether the policyOutput field is set.
     */
    public boolean hasPolicyOutput() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     * <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code>
     *
     * @return The policyOutput.
     */
    public com.google.cloud.conformance.storage.v1.PolicyOutput getPolicyOutput() {
      if (policyOutputBuilder_ == null) {
        return policyOutput_ == null
            ? com.google.cloud.conformance.storage.v1.PolicyOutput.getDefaultInstance()
            : policyOutput_;
      } else {
        return policyOutputBuilder_.getMessage();
      }
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code> */
    public Builder setPolicyOutput(com.google.cloud.conformance.storage.v1.PolicyOutput value) {
      if (policyOutputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policyOutput_ = value;
      } else {
        policyOutputBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code> */
    public Builder setPolicyOutput(
        com.google.cloud.conformance.storage.v1.PolicyOutput.Builder builderForValue) {
      if (policyOutputBuilder_ == null) {
        policyOutput_ = builderForValue.build();
      } else {
        policyOutputBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code> */
    public Builder mergePolicyOutput(com.google.cloud.conformance.storage.v1.PolicyOutput value) {
      if (policyOutputBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && policyOutput_ != null
            && policyOutput_
                != com.google.cloud.conformance.storage.v1.PolicyOutput.getDefaultInstance()) {
          getPolicyOutputBuilder().mergeFrom(value);
        } else {
          policyOutput_ = value;
        }
      } else {
        policyOutputBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code> */
    public Builder clearPolicyOutput() {
      bitField0_ = (bitField0_ & ~0x00000004);
      policyOutput_ = null;
      if (policyOutputBuilder_ != null) {
        policyOutputBuilder_.dispose();
        policyOutputBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code> */
    public com.google.cloud.conformance.storage.v1.PolicyOutput.Builder getPolicyOutputBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPolicyOutputFieldBuilder().getBuilder();
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code> */
    public com.google.cloud.conformance.storage.v1.PolicyOutputOrBuilder
        getPolicyOutputOrBuilder() {
      if (policyOutputBuilder_ != null) {
        return policyOutputBuilder_.getMessageOrBuilder();
      } else {
        return policyOutput_ == null
            ? com.google.cloud.conformance.storage.v1.PolicyOutput.getDefaultInstance()
            : policyOutput_;
      }
    }

    /** <code>.google.cloud.conformance.storage.v1.PolicyOutput policyOutput = 3;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.conformance.storage.v1.PolicyOutput,
            com.google.cloud.conformance.storage.v1.PolicyOutput.Builder,
            com.google.cloud.conformance.storage.v1.PolicyOutputOrBuilder>
        getPolicyOutputFieldBuilder() {
      if (policyOutputBuilder_ == null) {
        policyOutputBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.conformance.storage.v1.PolicyOutput,
                com.google.cloud.conformance.storage.v1.PolicyOutput.Builder,
                com.google.cloud.conformance.storage.v1.PolicyOutputOrBuilder>(
                getPolicyOutput(), getParentForChildren(), isClean());
        policyOutput_ = null;
      }
      return policyOutputBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.conformance.storage.v1.PostPolicyV4Test)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.conformance.storage.v1.PostPolicyV4Test)
  private static final com.google.cloud.conformance.storage.v1.PostPolicyV4Test DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.conformance.storage.v1.PostPolicyV4Test();
  }

  public static com.google.cloud.conformance.storage.v1.PostPolicyV4Test getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostPolicyV4Test> PARSER =
      new com.google.protobuf.AbstractParser<PostPolicyV4Test>() {
        @java.lang.Override
        public PostPolicyV4Test parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<PostPolicyV4Test> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostPolicyV4Test> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.conformance.storage.v1.PostPolicyV4Test getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
