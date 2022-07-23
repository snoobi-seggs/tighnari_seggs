// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerOfferingData.proto

package emu.grasscutter.net.proto;

public final class PlayerOfferingDataOuterClass {
  private PlayerOfferingDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerOfferingDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerOfferingData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 offering_id = 8;</code>
     * @return The offeringId.
     */
    int getOfferingId();

    /**
     * <code>uint32 level = 2;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>repeated uint32 takenLevelRewordList = 6;</code>
     * @return A list containing the takenLevelRewordList.
     */
    java.util.List<java.lang.Integer> getTakenLevelRewordListList();
    /**
     * <code>repeated uint32 takenLevelRewordList = 6;</code>
     * @return The count of takenLevelRewordList.
     */
    int getTakenLevelRewordListCount();
    /**
     * <code>repeated uint32 takenLevelRewordList = 6;</code>
     * @param index The index of the element to return.
     * @return The takenLevelRewordList at the given index.
     */
    int getTakenLevelRewordList(int index);

    /**
     * <code>bool isNewMaxLevel = 1;</code>
     * @return The isNewMaxLevel.
     */
    boolean getIsNewMaxLevel();

    /**
     * <code>bool isFirstInteract = 5;</code>
     * @return The isFirstInteract.
     */
    boolean getIsFirstInteract();
  }
  /**
   * Protobuf type {@code PlayerOfferingData}
   */
  public static final class PlayerOfferingData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerOfferingData)
      PlayerOfferingDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerOfferingData.newBuilder() to construct.
    private PlayerOfferingData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerOfferingData() {
      takenLevelRewordList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerOfferingData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerOfferingData(
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
            case 8: {

              isNewMaxLevel_ = input.readBool();
              break;
            }
            case 16: {

              level_ = input.readUInt32();
              break;
            }
            case 40: {

              isFirstInteract_ = input.readBool();
              break;
            }
            case 48: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                takenLevelRewordList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              takenLevelRewordList_.addInt(input.readUInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                takenLevelRewordList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                takenLevelRewordList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 64: {

              offeringId_ = input.readInt32();
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
          takenLevelRewordList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.internal_static_PlayerOfferingData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.internal_static_PlayerOfferingData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.class, emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder.class);
    }

    public static final int OFFERING_ID_FIELD_NUMBER = 8;
    private int offeringId_;
    /**
     * <code>int32 offering_id = 8;</code>
     * @return The offeringId.
     */
    @java.lang.Override
    public int getOfferingId() {
      return offeringId_;
    }

    public static final int LEVEL_FIELD_NUMBER = 2;
    private int level_;
    /**
     * <code>uint32 level = 2;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int TAKENLEVELREWORDLIST_FIELD_NUMBER = 6;
    private com.google.protobuf.Internal.IntList takenLevelRewordList_;
    /**
     * <code>repeated uint32 takenLevelRewordList = 6;</code>
     * @return A list containing the takenLevelRewordList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getTakenLevelRewordListList() {
      return takenLevelRewordList_;
    }
    /**
     * <code>repeated uint32 takenLevelRewordList = 6;</code>
     * @return The count of takenLevelRewordList.
     */
    public int getTakenLevelRewordListCount() {
      return takenLevelRewordList_.size();
    }
    /**
     * <code>repeated uint32 takenLevelRewordList = 6;</code>
     * @param index The index of the element to return.
     * @return The takenLevelRewordList at the given index.
     */
    public int getTakenLevelRewordList(int index) {
      return takenLevelRewordList_.getInt(index);
    }
    private int takenLevelRewordListMemoizedSerializedSize = -1;

    public static final int ISNEWMAXLEVEL_FIELD_NUMBER = 1;
    private boolean isNewMaxLevel_;
    /**
     * <code>bool isNewMaxLevel = 1;</code>
     * @return The isNewMaxLevel.
     */
    @java.lang.Override
    public boolean getIsNewMaxLevel() {
      return isNewMaxLevel_;
    }

    public static final int ISFIRSTINTERACT_FIELD_NUMBER = 5;
    private boolean isFirstInteract_;
    /**
     * <code>bool isFirstInteract = 5;</code>
     * @return The isFirstInteract.
     */
    @java.lang.Override
    public boolean getIsFirstInteract() {
      return isFirstInteract_;
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
      getSerializedSize();
      if (isNewMaxLevel_ != false) {
        output.writeBool(1, isNewMaxLevel_);
      }
      if (level_ != 0) {
        output.writeUInt32(2, level_);
      }
      if (isFirstInteract_ != false) {
        output.writeBool(5, isFirstInteract_);
      }
      if (getTakenLevelRewordListList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(takenLevelRewordListMemoizedSerializedSize);
      }
      for (int i = 0; i < takenLevelRewordList_.size(); i++) {
        output.writeUInt32NoTag(takenLevelRewordList_.getInt(i));
      }
      if (offeringId_ != 0) {
        output.writeInt32(8, offeringId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isNewMaxLevel_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isNewMaxLevel_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, level_);
      }
      if (isFirstInteract_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, isFirstInteract_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < takenLevelRewordList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(takenLevelRewordList_.getInt(i));
        }
        size += dataSize;
        if (!getTakenLevelRewordListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        takenLevelRewordListMemoizedSerializedSize = dataSize;
      }
      if (offeringId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, offeringId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData other = (emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData) obj;

      if (getOfferingId()
          != other.getOfferingId()) return false;
      if (getLevel()
          != other.getLevel()) return false;
      if (!getTakenLevelRewordListList()
          .equals(other.getTakenLevelRewordListList())) return false;
      if (getIsNewMaxLevel()
          != other.getIsNewMaxLevel()) return false;
      if (getIsFirstInteract()
          != other.getIsFirstInteract()) return false;
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
      hash = (37 * hash) + OFFERING_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOfferingId();
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      if (getTakenLevelRewordListCount() > 0) {
        hash = (37 * hash) + TAKENLEVELREWORDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getTakenLevelRewordListList().hashCode();
      }
      hash = (37 * hash) + ISNEWMAXLEVEL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewMaxLevel());
      hash = (37 * hash) + ISFIRSTINTERACT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFirstInteract());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData prototype) {
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
     * Protobuf type {@code PlayerOfferingData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerOfferingData)
        emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.internal_static_PlayerOfferingData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.internal_static_PlayerOfferingData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.class, emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        offeringId_ = 0;

        level_ = 0;

        takenLevelRewordList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        isNewMaxLevel_ = false;

        isFirstInteract_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.internal_static_PlayerOfferingData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData build() {
        emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData buildPartial() {
        emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData result = new emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData(this);
        int from_bitField0_ = bitField0_;
        result.offeringId_ = offeringId_;
        result.level_ = level_;
        if (((bitField0_ & 0x00000001) != 0)) {
          takenLevelRewordList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.takenLevelRewordList_ = takenLevelRewordList_;
        result.isNewMaxLevel_ = isNewMaxLevel_;
        result.isFirstInteract_ = isFirstInteract_;
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
        if (other instanceof emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData other) {
        if (other == emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData.getDefaultInstance()) return this;
        if (other.getOfferingId() != 0) {
          setOfferingId(other.getOfferingId());
        }
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (!other.takenLevelRewordList_.isEmpty()) {
          if (takenLevelRewordList_.isEmpty()) {
            takenLevelRewordList_ = other.takenLevelRewordList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTakenLevelRewordListIsMutable();
            takenLevelRewordList_.addAll(other.takenLevelRewordList_);
          }
          onChanged();
        }
        if (other.getIsNewMaxLevel() != false) {
          setIsNewMaxLevel(other.getIsNewMaxLevel());
        }
        if (other.getIsFirstInteract() != false) {
          setIsFirstInteract(other.getIsFirstInteract());
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
        emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int offeringId_ ;
      /**
       * <code>int32 offering_id = 8;</code>
       * @return The offeringId.
       */
      @java.lang.Override
      public int getOfferingId() {
        return offeringId_;
      }
      /**
       * <code>int32 offering_id = 8;</code>
       * @param value The offeringId to set.
       * @return This builder for chaining.
       */
      public Builder setOfferingId(int value) {
        
        offeringId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 offering_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearOfferingId() {
        
        offeringId_ = 0;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 2;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 2;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList takenLevelRewordList_ = emptyIntList();
      private void ensureTakenLevelRewordListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          takenLevelRewordList_ = mutableCopy(takenLevelRewordList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 takenLevelRewordList = 6;</code>
       * @return A list containing the takenLevelRewordList.
       */
      public java.util.List<java.lang.Integer>
          getTakenLevelRewordListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(takenLevelRewordList_) : takenLevelRewordList_;
      }
      /**
       * <code>repeated uint32 takenLevelRewordList = 6;</code>
       * @return The count of takenLevelRewordList.
       */
      public int getTakenLevelRewordListCount() {
        return takenLevelRewordList_.size();
      }
      /**
       * <code>repeated uint32 takenLevelRewordList = 6;</code>
       * @param index The index of the element to return.
       * @return The takenLevelRewordList at the given index.
       */
      public int getTakenLevelRewordList(int index) {
        return takenLevelRewordList_.getInt(index);
      }
      /**
       * <code>repeated uint32 takenLevelRewordList = 6;</code>
       * @param index The index to set the value at.
       * @param value The takenLevelRewordList to set.
       * @return This builder for chaining.
       */
      public Builder setTakenLevelRewordList(
          int index, int value) {
        ensureTakenLevelRewordListIsMutable();
        takenLevelRewordList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 takenLevelRewordList = 6;</code>
       * @param value The takenLevelRewordList to add.
       * @return This builder for chaining.
       */
      public Builder addTakenLevelRewordList(int value) {
        ensureTakenLevelRewordListIsMutable();
        takenLevelRewordList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 takenLevelRewordList = 6;</code>
       * @param values The takenLevelRewordList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTakenLevelRewordList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTakenLevelRewordListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, takenLevelRewordList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 takenLevelRewordList = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearTakenLevelRewordList() {
        takenLevelRewordList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isNewMaxLevel_ ;
      /**
       * <code>bool isNewMaxLevel = 1;</code>
       * @return The isNewMaxLevel.
       */
      @java.lang.Override
      public boolean getIsNewMaxLevel() {
        return isNewMaxLevel_;
      }
      /**
       * <code>bool isNewMaxLevel = 1;</code>
       * @param value The isNewMaxLevel to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewMaxLevel(boolean value) {
        
        isNewMaxLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isNewMaxLevel = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewMaxLevel() {
        
        isNewMaxLevel_ = false;
        onChanged();
        return this;
      }

      private boolean isFirstInteract_ ;
      /**
       * <code>bool isFirstInteract = 5;</code>
       * @return The isFirstInteract.
       */
      @java.lang.Override
      public boolean getIsFirstInteract() {
        return isFirstInteract_;
      }
      /**
       * <code>bool isFirstInteract = 5;</code>
       * @param value The isFirstInteract to set.
       * @return This builder for chaining.
       */
      public Builder setIsFirstInteract(boolean value) {
        
        isFirstInteract_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool isFirstInteract = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFirstInteract() {
        
        isFirstInteract_ = false;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:PlayerOfferingData)
    }

    // @@protoc_insertion_point(class_scope:PlayerOfferingData)
    private static final emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData();
    }

    public static emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerOfferingData>
        PARSER = new com.google.protobuf.AbstractParser<PlayerOfferingData>() {
      @java.lang.Override
      public PlayerOfferingData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerOfferingData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerOfferingData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerOfferingData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerOfferingDataOuterClass.PlayerOfferingData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerOfferingData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerOfferingData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030PlayerOfferingData.proto\"\206\001\n\022PlayerOff" +
      "eringData\022\023\n\013offering_id\030\010 \001(\005\022\r\n\005level\030" +
      "\002 \001(\r\022\034\n\024takenLevelRewordList\030\006 \003(\r\022\025\n\ri" +
      "sNewMaxLevel\030\001 \001(\010\022\027\n\017isFirstInteract\030\005 " +
      "\001(\010B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PlayerOfferingData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerOfferingData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerOfferingData_descriptor,
        new java.lang.String[] { "OfferingId", "Level", "TakenLevelRewordList", "IsNewMaxLevel", "IsFirstInteract", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}