// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coffee.proto

package com.coffee;

/**
 * <pre>
 **
 * Get coffee response
 * </pre>
 *
 * Protobuf type {@code coffee.GetCoffeeResponse}
 */
public final class GetCoffeeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:coffee.GetCoffeeResponse)
    GetCoffeeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCoffeeResponse.newBuilder() to construct.
  private GetCoffeeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCoffeeResponse() {
    coffeeDescription_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCoffeeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCoffeeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              coffeeDescription_ = new java.util.ArrayList<com.coffee.CoffeeDescription>();
              mutable_bitField0_ |= 0x00000001;
            }
            coffeeDescription_.add(
                input.readMessage(com.coffee.CoffeeDescription.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        coffeeDescription_ = java.util.Collections.unmodifiableList(coffeeDescription_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.coffee.CoffeeProto.internal_static_coffee_GetCoffeeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.coffee.CoffeeProto.internal_static_coffee_GetCoffeeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.coffee.GetCoffeeResponse.class, com.coffee.GetCoffeeResponse.Builder.class);
  }

  public static final int COFFEEDESCRIPTION_FIELD_NUMBER = 1;
  private java.util.List<com.coffee.CoffeeDescription> coffeeDescription_;
  /**
   * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.coffee.CoffeeDescription> getCoffeeDescriptionList() {
    return coffeeDescription_;
  }
  /**
   * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.coffee.CoffeeDescriptionOrBuilder> 
      getCoffeeDescriptionOrBuilderList() {
    return coffeeDescription_;
  }
  /**
   * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
   */
  @java.lang.Override
  public int getCoffeeDescriptionCount() {
    return coffeeDescription_.size();
  }
  /**
   * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
   */
  @java.lang.Override
  public com.coffee.CoffeeDescription getCoffeeDescription(int index) {
    return coffeeDescription_.get(index);
  }
  /**
   * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
   */
  @java.lang.Override
  public com.coffee.CoffeeDescriptionOrBuilder getCoffeeDescriptionOrBuilder(
      int index) {
    return coffeeDescription_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < coffeeDescription_.size(); i++) {
      output.writeMessage(1, coffeeDescription_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < coffeeDescription_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, coffeeDescription_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.coffee.GetCoffeeResponse)) {
      return super.equals(obj);
    }
    com.coffee.GetCoffeeResponse other = (com.coffee.GetCoffeeResponse) obj;

    if (!getCoffeeDescriptionList()
        .equals(other.getCoffeeDescriptionList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCoffeeDescriptionCount() > 0) {
      hash = (37 * hash) + COFFEEDESCRIPTION_FIELD_NUMBER;
      hash = (53 * hash) + getCoffeeDescriptionList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.coffee.GetCoffeeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coffee.GetCoffeeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coffee.GetCoffeeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coffee.GetCoffeeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coffee.GetCoffeeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coffee.GetCoffeeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coffee.GetCoffeeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coffee.GetCoffeeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coffee.GetCoffeeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.coffee.GetCoffeeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coffee.GetCoffeeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coffee.GetCoffeeResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.coffee.GetCoffeeResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   **
   * Get coffee response
   * </pre>
   *
   * Protobuf type {@code coffee.GetCoffeeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:coffee.GetCoffeeResponse)
      com.coffee.GetCoffeeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.coffee.CoffeeProto.internal_static_coffee_GetCoffeeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.coffee.CoffeeProto.internal_static_coffee_GetCoffeeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.coffee.GetCoffeeResponse.class, com.coffee.GetCoffeeResponse.Builder.class);
    }

    // Construct using com.coffee.GetCoffeeResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getCoffeeDescriptionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (coffeeDescriptionBuilder_ == null) {
        coffeeDescription_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        coffeeDescriptionBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.coffee.CoffeeProto.internal_static_coffee_GetCoffeeResponse_descriptor;
    }

    @java.lang.Override
    public com.coffee.GetCoffeeResponse getDefaultInstanceForType() {
      return com.coffee.GetCoffeeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.coffee.GetCoffeeResponse build() {
      com.coffee.GetCoffeeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.coffee.GetCoffeeResponse buildPartial() {
      com.coffee.GetCoffeeResponse result = new com.coffee.GetCoffeeResponse(this);
      int from_bitField0_ = bitField0_;
      if (coffeeDescriptionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          coffeeDescription_ = java.util.Collections.unmodifiableList(coffeeDescription_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.coffeeDescription_ = coffeeDescription_;
      } else {
        result.coffeeDescription_ = coffeeDescriptionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.coffee.GetCoffeeResponse) {
        return mergeFrom((com.coffee.GetCoffeeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.coffee.GetCoffeeResponse other) {
      if (other == com.coffee.GetCoffeeResponse.getDefaultInstance()) return this;
      if (coffeeDescriptionBuilder_ == null) {
        if (!other.coffeeDescription_.isEmpty()) {
          if (coffeeDescription_.isEmpty()) {
            coffeeDescription_ = other.coffeeDescription_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCoffeeDescriptionIsMutable();
            coffeeDescription_.addAll(other.coffeeDescription_);
          }
          onChanged();
        }
      } else {
        if (!other.coffeeDescription_.isEmpty()) {
          if (coffeeDescriptionBuilder_.isEmpty()) {
            coffeeDescriptionBuilder_.dispose();
            coffeeDescriptionBuilder_ = null;
            coffeeDescription_ = other.coffeeDescription_;
            bitField0_ = (bitField0_ & ~0x00000001);
            coffeeDescriptionBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCoffeeDescriptionFieldBuilder() : null;
          } else {
            coffeeDescriptionBuilder_.addAllMessages(other.coffeeDescription_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.coffee.GetCoffeeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.coffee.GetCoffeeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.coffee.CoffeeDescription> coffeeDescription_ =
      java.util.Collections.emptyList();
    private void ensureCoffeeDescriptionIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        coffeeDescription_ = new java.util.ArrayList<com.coffee.CoffeeDescription>(coffeeDescription_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.coffee.CoffeeDescription, com.coffee.CoffeeDescription.Builder, com.coffee.CoffeeDescriptionOrBuilder> coffeeDescriptionBuilder_;

    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public java.util.List<com.coffee.CoffeeDescription> getCoffeeDescriptionList() {
      if (coffeeDescriptionBuilder_ == null) {
        return java.util.Collections.unmodifiableList(coffeeDescription_);
      } else {
        return coffeeDescriptionBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public int getCoffeeDescriptionCount() {
      if (coffeeDescriptionBuilder_ == null) {
        return coffeeDescription_.size();
      } else {
        return coffeeDescriptionBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public com.coffee.CoffeeDescription getCoffeeDescription(int index) {
      if (coffeeDescriptionBuilder_ == null) {
        return coffeeDescription_.get(index);
      } else {
        return coffeeDescriptionBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public Builder setCoffeeDescription(
        int index, com.coffee.CoffeeDescription value) {
      if (coffeeDescriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCoffeeDescriptionIsMutable();
        coffeeDescription_.set(index, value);
        onChanged();
      } else {
        coffeeDescriptionBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public Builder setCoffeeDescription(
        int index, com.coffee.CoffeeDescription.Builder builderForValue) {
      if (coffeeDescriptionBuilder_ == null) {
        ensureCoffeeDescriptionIsMutable();
        coffeeDescription_.set(index, builderForValue.build());
        onChanged();
      } else {
        coffeeDescriptionBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public Builder addCoffeeDescription(com.coffee.CoffeeDescription value) {
      if (coffeeDescriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCoffeeDescriptionIsMutable();
        coffeeDescription_.add(value);
        onChanged();
      } else {
        coffeeDescriptionBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public Builder addCoffeeDescription(
        int index, com.coffee.CoffeeDescription value) {
      if (coffeeDescriptionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCoffeeDescriptionIsMutable();
        coffeeDescription_.add(index, value);
        onChanged();
      } else {
        coffeeDescriptionBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public Builder addCoffeeDescription(
        com.coffee.CoffeeDescription.Builder builderForValue) {
      if (coffeeDescriptionBuilder_ == null) {
        ensureCoffeeDescriptionIsMutable();
        coffeeDescription_.add(builderForValue.build());
        onChanged();
      } else {
        coffeeDescriptionBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public Builder addCoffeeDescription(
        int index, com.coffee.CoffeeDescription.Builder builderForValue) {
      if (coffeeDescriptionBuilder_ == null) {
        ensureCoffeeDescriptionIsMutable();
        coffeeDescription_.add(index, builderForValue.build());
        onChanged();
      } else {
        coffeeDescriptionBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public Builder addAllCoffeeDescription(
        java.lang.Iterable<? extends com.coffee.CoffeeDescription> values) {
      if (coffeeDescriptionBuilder_ == null) {
        ensureCoffeeDescriptionIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, coffeeDescription_);
        onChanged();
      } else {
        coffeeDescriptionBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public Builder clearCoffeeDescription() {
      if (coffeeDescriptionBuilder_ == null) {
        coffeeDescription_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        coffeeDescriptionBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public Builder removeCoffeeDescription(int index) {
      if (coffeeDescriptionBuilder_ == null) {
        ensureCoffeeDescriptionIsMutable();
        coffeeDescription_.remove(index);
        onChanged();
      } else {
        coffeeDescriptionBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public com.coffee.CoffeeDescription.Builder getCoffeeDescriptionBuilder(
        int index) {
      return getCoffeeDescriptionFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public com.coffee.CoffeeDescriptionOrBuilder getCoffeeDescriptionOrBuilder(
        int index) {
      if (coffeeDescriptionBuilder_ == null) {
        return coffeeDescription_.get(index);  } else {
        return coffeeDescriptionBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public java.util.List<? extends com.coffee.CoffeeDescriptionOrBuilder> 
         getCoffeeDescriptionOrBuilderList() {
      if (coffeeDescriptionBuilder_ != null) {
        return coffeeDescriptionBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(coffeeDescription_);
      }
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public com.coffee.CoffeeDescription.Builder addCoffeeDescriptionBuilder() {
      return getCoffeeDescriptionFieldBuilder().addBuilder(
          com.coffee.CoffeeDescription.getDefaultInstance());
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public com.coffee.CoffeeDescription.Builder addCoffeeDescriptionBuilder(
        int index) {
      return getCoffeeDescriptionFieldBuilder().addBuilder(
          index, com.coffee.CoffeeDescription.getDefaultInstance());
    }
    /**
     * <code>repeated .coffee.CoffeeDescription coffeeDescription = 1;</code>
     */
    public java.util.List<com.coffee.CoffeeDescription.Builder> 
         getCoffeeDescriptionBuilderList() {
      return getCoffeeDescriptionFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.coffee.CoffeeDescription, com.coffee.CoffeeDescription.Builder, com.coffee.CoffeeDescriptionOrBuilder> 
        getCoffeeDescriptionFieldBuilder() {
      if (coffeeDescriptionBuilder_ == null) {
        coffeeDescriptionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.coffee.CoffeeDescription, com.coffee.CoffeeDescription.Builder, com.coffee.CoffeeDescriptionOrBuilder>(
                coffeeDescription_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        coffeeDescription_ = null;
      }
      return coffeeDescriptionBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:coffee.GetCoffeeResponse)
  }

  // @@protoc_insertion_point(class_scope:coffee.GetCoffeeResponse)
  private static final com.coffee.GetCoffeeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.coffee.GetCoffeeResponse();
  }

  public static com.coffee.GetCoffeeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCoffeeResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCoffeeResponse>() {
    @java.lang.Override
    public GetCoffeeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCoffeeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCoffeeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCoffeeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.coffee.GetCoffeeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

