package com.upstox.marketdatafeeder.rpc.proto;

public final class Upstox {
    private Upstox() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    /**
     * Protobuf enum {@code com.upstox.marketdatafeeder.rpc.proto.Type}
     */
    public enum Type
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>initial_feed = 0;</code>
         */
        initial_feed(0),
        /**
         * <code>live_feed = 1;</code>
         */
        live_feed(1),
        UNRECOGNIZED(-1),
        ;

        /**
         * <code>initial_feed = 0;</code>
         */
        public static final int initial_feed_VALUE = 0;
        /**
         * <code>live_feed = 1;</code>
         */
        public static final int live_feed_VALUE = 1;


        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static Type valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static Type forNumber(int value) {
            switch (value) {
                case 0: return initial_feed;
                case 1: return live_feed;
                default: return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
            return internalValueMap;
        }
        private static final com.google.protobuf.Internal.EnumLiteMap<
                Type> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<Type>() {
                    public Type findValueByNumber(int number) {
                        return Type.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalStateException(
                        "Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }
        public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
            return getDescriptor();
        }
        public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.getDescriptor().getEnumTypes().get(0);
        }

        private static final Type[] VALUES = values();

        public static Type valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private Type(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:com.upstox.marketdatafeeder.rpc.proto.Type)
    }

    public interface LTPCOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.upstox.marketdatafeeder.rpc.proto.LTPC)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>double ltp = 1;</code>
         * @return The ltp.
         */
        double getLtp();

        /**
         * <code>int64 ltt = 2;</code>
         * @return The ltt.
         */
        long getLtt();

        /**
         * <code>int64 ltq = 3;</code>
         * @return The ltq.
         */
        long getLtq();

        /**
         * <pre>
         *close price
         * </pre>
         *
         * <code>double cp = 4;</code>
         * @return The cp.
         */
        double getCp();
    }
    /**
     * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.LTPC}
     */
    public static final class LTPC extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.upstox.marketdatafeeder.rpc.proto.LTPC)
            LTPCOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use LTPC.newBuilder() to construct.
        private LTPC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private LTPC() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new LTPC();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_LTPC_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_LTPC_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder.class);
        }

        public static final int LTP_FIELD_NUMBER = 1;
        private double ltp_ = 0D;
        /**
         * <code>double ltp = 1;</code>
         * @return The ltp.
         */
        @java.lang.Override
        public double getLtp() {
            return ltp_;
        }

        public static final int LTT_FIELD_NUMBER = 2;
        private long ltt_ = 0L;
        /**
         * <code>int64 ltt = 2;</code>
         * @return The ltt.
         */
        @java.lang.Override
        public long getLtt() {
            return ltt_;
        }

        public static final int LTQ_FIELD_NUMBER = 3;
        private long ltq_ = 0L;
        /**
         * <code>int64 ltq = 3;</code>
         * @return The ltq.
         */
        @java.lang.Override
        public long getLtq() {
            return ltq_;
        }

        public static final int CP_FIELD_NUMBER = 4;
        private double cp_ = 0D;
        /**
         * <pre>
         *close price
         * </pre>
         *
         * <code>double cp = 4;</code>
         * @return The cp.
         */
        @java.lang.Override
        public double getCp() {
            return cp_;
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
            if (java.lang.Double.doubleToRawLongBits(ltp_) != 0) {
                output.writeDouble(1, ltp_);
            }
            if (ltt_ != 0L) {
                output.writeInt64(2, ltt_);
            }
            if (ltq_ != 0L) {
                output.writeInt64(3, ltq_);
            }
            if (java.lang.Double.doubleToRawLongBits(cp_) != 0) {
                output.writeDouble(4, cp_);
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (java.lang.Double.doubleToRawLongBits(ltp_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(1, ltp_);
            }
            if (ltt_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(2, ltt_);
            }
            if (ltq_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(3, ltq_);
            }
            if (java.lang.Double.doubleToRawLongBits(cp_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(4, cp_);
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
            if (!(obj instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC)) {
                return super.equals(obj);
            }
            com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC other = (com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC) obj;

            if (java.lang.Double.doubleToLongBits(getLtp())
                    != java.lang.Double.doubleToLongBits(
                    other.getLtp())) return false;
            if (getLtt()
                    != other.getLtt()) return false;
            if (getLtq()
                    != other.getLtq()) return false;
            if (java.lang.Double.doubleToLongBits(getCp())
                    != java.lang.Double.doubleToLongBits(
                    other.getCp())) return false;
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
            hash = (37 * hash) + LTP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getLtp()));
            hash = (37 * hash) + LTT_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getLtt());
            hash = (37 * hash) + LTQ_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getLtq());
            hash = (37 * hash) + CP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getCp()));
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC parseFrom(
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
        public static Builder newBuilder(com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC prototype) {
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
         * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.LTPC}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.upstox.marketdatafeeder.rpc.proto.LTPC)
                com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_LTPC_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_LTPC_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder.class);
            }

            // Construct using com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.newBuilder()
            private Builder() {

            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);

            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                ltp_ = 0D;
                ltt_ = 0L;
                ltq_ = 0L;
                cp_ = 0D;
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_LTPC_descriptor;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getDefaultInstanceForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance();
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC build() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC buildPartial() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC result = new com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC(this);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartial0(com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC result) {
                int from_bitField0_ = bitField0_;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.ltp_ = ltp_;
                }
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    result.ltt_ = ltt_;
                }
                if (((from_bitField0_ & 0x00000004) != 0)) {
                    result.ltq_ = ltq_;
                }
                if (((from_bitField0_ & 0x00000008) != 0)) {
                    result.cp_ = cp_;
                }
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
                if (other instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC) {
                    return mergeFrom((com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC other) {
                if (other == com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance()) return this;
                if (other.getLtp() != 0D) {
                    setLtp(other.getLtp());
                }
                if (other.getLtt() != 0L) {
                    setLtt(other.getLtt());
                }
                if (other.getLtq() != 0L) {
                    setLtq(other.getLtq());
                }
                if (other.getCp() != 0D) {
                    setCp(other.getCp());
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
                            case 9: {
                                ltp_ = input.readDouble();
                                bitField0_ |= 0x00000001;
                                break;
                            } // case 9
                            case 16: {
                                ltt_ = input.readInt64();
                                bitField0_ |= 0x00000002;
                                break;
                            } // case 16
                            case 24: {
                                ltq_ = input.readInt64();
                                bitField0_ |= 0x00000004;
                                break;
                            } // case 24
                            case 33: {
                                cp_ = input.readDouble();
                                bitField0_ |= 0x00000008;
                                break;
                            } // case 33
                            default: {
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

            private double ltp_ ;
            /**
             * <code>double ltp = 1;</code>
             * @return The ltp.
             */
            @java.lang.Override
            public double getLtp() {
                return ltp_;
            }
            /**
             * <code>double ltp = 1;</code>
             * @param value The ltp to set.
             * @return This builder for chaining.
             */
            public Builder setLtp(double value) {

                ltp_ = value;
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <code>double ltp = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearLtp() {
                bitField0_ = (bitField0_ & ~0x00000001);
                ltp_ = 0D;
                onChanged();
                return this;
            }

            private long ltt_ ;
            /**
             * <code>int64 ltt = 2;</code>
             * @return The ltt.
             */
            @java.lang.Override
            public long getLtt() {
                return ltt_;
            }
            /**
             * <code>int64 ltt = 2;</code>
             * @param value The ltt to set.
             * @return This builder for chaining.
             */
            public Builder setLtt(long value) {

                ltt_ = value;
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }
            /**
             * <code>int64 ltt = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearLtt() {
                bitField0_ = (bitField0_ & ~0x00000002);
                ltt_ = 0L;
                onChanged();
                return this;
            }

            private long ltq_ ;
            /**
             * <code>int64 ltq = 3;</code>
             * @return The ltq.
             */
            @java.lang.Override
            public long getLtq() {
                return ltq_;
            }
            /**
             * <code>int64 ltq = 3;</code>
             * @param value The ltq to set.
             * @return This builder for chaining.
             */
            public Builder setLtq(long value) {

                ltq_ = value;
                bitField0_ |= 0x00000004;
                onChanged();
                return this;
            }
            /**
             * <code>int64 ltq = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearLtq() {
                bitField0_ = (bitField0_ & ~0x00000004);
                ltq_ = 0L;
                onChanged();
                return this;
            }

            private double cp_ ;
            /**
             * <pre>
             *close price
             * </pre>
             *
             * <code>double cp = 4;</code>
             * @return The cp.
             */
            @java.lang.Override
            public double getCp() {
                return cp_;
            }
            /**
             * <pre>
             *close price
             * </pre>
             *
             * <code>double cp = 4;</code>
             * @param value The cp to set.
             * @return This builder for chaining.
             */
            public Builder setCp(double value) {

                cp_ = value;
                bitField0_ |= 0x00000008;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *close price
             * </pre>
             *
             * <code>double cp = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearCp() {
                bitField0_ = (bitField0_ & ~0x00000008);
                cp_ = 0D;
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


            // @@protoc_insertion_point(builder_scope:com.upstox.marketdatafeeder.rpc.proto.LTPC)
        }

        // @@protoc_insertion_point(class_scope:com.upstox.marketdatafeeder.rpc.proto.LTPC)
        private static final com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC();
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<LTPC>
                PARSER = new com.google.protobuf.AbstractParser<LTPC>() {
            @java.lang.Override
            public LTPC parsePartialFrom(
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

        public static com.google.protobuf.Parser<LTPC> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<LTPC> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface MarketLevelOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.upstox.marketdatafeeder.rpc.proto.MarketLevel)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
         */
        java.util.List<com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote>
        getBidAskQuoteList();
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote getBidAskQuote(int index);
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
         */
        int getBidAskQuoteCount();
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
         */
        java.util.List<? extends com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder>
        getBidAskQuoteOrBuilderList();
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder getBidAskQuoteOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.MarketLevel}
     */
    public static final class MarketLevel extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.upstox.marketdatafeeder.rpc.proto.MarketLevel)
            MarketLevelOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use MarketLevel.newBuilder() to construct.
        private MarketLevel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private MarketLevel() {
            bidAskQuote_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new MarketLevel();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketLevel_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketLevel_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.Builder.class);
        }

        public static final int BIDASKQUOTE_FIELD_NUMBER = 1;
        @SuppressWarnings("serial")
        private java.util.List<com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote> bidAskQuote_;
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
         */
        @java.lang.Override
        public java.util.List<com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote> getBidAskQuoteList() {
            return bidAskQuote_;
        }
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
         */
        @java.lang.Override
        public java.util.List<? extends com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder>
        getBidAskQuoteOrBuilderList() {
            return bidAskQuote_;
        }
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
         */
        @java.lang.Override
        public int getBidAskQuoteCount() {
            return bidAskQuote_.size();
        }
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote getBidAskQuote(int index) {
            return bidAskQuote_.get(index);
        }
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder getBidAskQuoteOrBuilder(
                int index) {
            return bidAskQuote_.get(index);
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
            for (int i = 0; i < bidAskQuote_.size(); i++) {
                output.writeMessage(1, bidAskQuote_.get(i));
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < bidAskQuote_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, bidAskQuote_.get(i));
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
            if (!(obj instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel)) {
                return super.equals(obj);
            }
            com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel other = (com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel) obj;

            if (!getBidAskQuoteList()
                    .equals(other.getBidAskQuoteList())) return false;
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
            if (getBidAskQuoteCount() > 0) {
                hash = (37 * hash) + BIDASKQUOTE_FIELD_NUMBER;
                hash = (53 * hash) + getBidAskQuoteList().hashCode();
            }
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel parseFrom(
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
        public static Builder newBuilder(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel prototype) {
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
         * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.MarketLevel}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.upstox.marketdatafeeder.rpc.proto.MarketLevel)
                com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevelOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketLevel_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketLevel_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.Builder.class);
            }

            // Construct using com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.newBuilder()
            private Builder() {

            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);

            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                if (bidAskQuoteBuilder_ == null) {
                    bidAskQuote_ = java.util.Collections.emptyList();
                } else {
                    bidAskQuote_ = null;
                    bidAskQuoteBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketLevel_descriptor;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel getDefaultInstanceForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.getDefaultInstance();
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel build() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel buildPartial() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel result = new com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel(this);
                buildPartialRepeatedFields(result);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartialRepeatedFields(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel result) {
                if (bidAskQuoteBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        bidAskQuote_ = java.util.Collections.unmodifiableList(bidAskQuote_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.bidAskQuote_ = bidAskQuote_;
                } else {
                    result.bidAskQuote_ = bidAskQuoteBuilder_.build();
                }
            }

            private void buildPartial0(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel result) {
                int from_bitField0_ = bitField0_;
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
                if (other instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel) {
                    return mergeFrom((com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel other) {
                if (other == com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.getDefaultInstance()) return this;
                if (bidAskQuoteBuilder_ == null) {
                    if (!other.bidAskQuote_.isEmpty()) {
                        if (bidAskQuote_.isEmpty()) {
                            bidAskQuote_ = other.bidAskQuote_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureBidAskQuoteIsMutable();
                            bidAskQuote_.addAll(other.bidAskQuote_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.bidAskQuote_.isEmpty()) {
                        if (bidAskQuoteBuilder_.isEmpty()) {
                            bidAskQuoteBuilder_.dispose();
                            bidAskQuoteBuilder_ = null;
                            bidAskQuote_ = other.bidAskQuote_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            bidAskQuoteBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getBidAskQuoteFieldBuilder() : null;
                        } else {
                            bidAskQuoteBuilder_.addAllMessages(other.bidAskQuote_);
                        }
                    }
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
                            case 10: {
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote m =
                                        input.readMessage(
                                                com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.parser(),
                                                extensionRegistry);
                                if (bidAskQuoteBuilder_ == null) {
                                    ensureBidAskQuoteIsMutable();
                                    bidAskQuote_.add(m);
                                } else {
                                    bidAskQuoteBuilder_.addMessage(m);
                                }
                                break;
                            } // case 10
                            default: {
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

            private java.util.List<com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote> bidAskQuote_ =
                    java.util.Collections.emptyList();
            private void ensureBidAskQuoteIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    bidAskQuote_ = new java.util.ArrayList<com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote>(bidAskQuote_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote, com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder> bidAskQuoteBuilder_;

            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public java.util.List<com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote> getBidAskQuoteList() {
                if (bidAskQuoteBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(bidAskQuote_);
                } else {
                    return bidAskQuoteBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public int getBidAskQuoteCount() {
                if (bidAskQuoteBuilder_ == null) {
                    return bidAskQuote_.size();
                } else {
                    return bidAskQuoteBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote getBidAskQuote(int index) {
                if (bidAskQuoteBuilder_ == null) {
                    return bidAskQuote_.get(index);
                } else {
                    return bidAskQuoteBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public Builder setBidAskQuote(
                    int index, com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote value) {
                if (bidAskQuoteBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureBidAskQuoteIsMutable();
                    bidAskQuote_.set(index, value);
                    onChanged();
                } else {
                    bidAskQuoteBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public Builder setBidAskQuote(
                    int index, com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder builderForValue) {
                if (bidAskQuoteBuilder_ == null) {
                    ensureBidAskQuoteIsMutable();
                    bidAskQuote_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    bidAskQuoteBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public Builder addBidAskQuote(com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote value) {
                if (bidAskQuoteBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureBidAskQuoteIsMutable();
                    bidAskQuote_.add(value);
                    onChanged();
                } else {
                    bidAskQuoteBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public Builder addBidAskQuote(
                    int index, com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote value) {
                if (bidAskQuoteBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureBidAskQuoteIsMutable();
                    bidAskQuote_.add(index, value);
                    onChanged();
                } else {
                    bidAskQuoteBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public Builder addBidAskQuote(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder builderForValue) {
                if (bidAskQuoteBuilder_ == null) {
                    ensureBidAskQuoteIsMutable();
                    bidAskQuote_.add(builderForValue.build());
                    onChanged();
                } else {
                    bidAskQuoteBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public Builder addBidAskQuote(
                    int index, com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder builderForValue) {
                if (bidAskQuoteBuilder_ == null) {
                    ensureBidAskQuoteIsMutable();
                    bidAskQuote_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    bidAskQuoteBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public Builder addAllBidAskQuote(
                    java.lang.Iterable<? extends com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote> values) {
                if (bidAskQuoteBuilder_ == null) {
                    ensureBidAskQuoteIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, bidAskQuote_);
                    onChanged();
                } else {
                    bidAskQuoteBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public Builder clearBidAskQuote() {
                if (bidAskQuoteBuilder_ == null) {
                    bidAskQuote_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    bidAskQuoteBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public Builder removeBidAskQuote(int index) {
                if (bidAskQuoteBuilder_ == null) {
                    ensureBidAskQuoteIsMutable();
                    bidAskQuote_.remove(index);
                    onChanged();
                } else {
                    bidAskQuoteBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder getBidAskQuoteBuilder(
                    int index) {
                return getBidAskQuoteFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder getBidAskQuoteOrBuilder(
                    int index) {
                if (bidAskQuoteBuilder_ == null) {
                    return bidAskQuote_.get(index);  } else {
                    return bidAskQuoteBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public java.util.List<? extends com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder>
            getBidAskQuoteOrBuilderList() {
                if (bidAskQuoteBuilder_ != null) {
                    return bidAskQuoteBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(bidAskQuote_);
                }
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder addBidAskQuoteBuilder() {
                return getBidAskQuoteFieldBuilder().addBuilder(
                        com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.getDefaultInstance());
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder addBidAskQuoteBuilder(
                    int index) {
                return getBidAskQuoteFieldBuilder().addBuilder(
                        index, com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.getDefaultInstance());
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 1;</code>
             */
            public java.util.List<com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder>
            getBidAskQuoteBuilderList() {
                return getBidAskQuoteFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote, com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder>
            getBidAskQuoteFieldBuilder() {
                if (bidAskQuoteBuilder_ == null) {
                    bidAskQuoteBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote, com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder>(
                            bidAskQuote_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    bidAskQuote_ = null;
                }
                return bidAskQuoteBuilder_;
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


            // @@protoc_insertion_point(builder_scope:com.upstox.marketdatafeeder.rpc.proto.MarketLevel)
        }

        // @@protoc_insertion_point(class_scope:com.upstox.marketdatafeeder.rpc.proto.MarketLevel)
        private static final com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel();
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<MarketLevel>
                PARSER = new com.google.protobuf.AbstractParser<MarketLevel>() {
            @java.lang.Override
            public MarketLevel parsePartialFrom(
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

        public static com.google.protobuf.Parser<MarketLevel> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<MarketLevel> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface MarketOHLCOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.upstox.marketdatafeeder.rpc.proto.MarketOHLC)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
         */
        java.util.List<com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC>
        getOhlcList();
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC getOhlc(int index);
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
         */
        int getOhlcCount();
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
         */
        java.util.List<? extends com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLCOrBuilder>
        getOhlcOrBuilderList();
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLCOrBuilder getOhlcOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.MarketOHLC}
     */
    public static final class MarketOHLC extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.upstox.marketdatafeeder.rpc.proto.MarketOHLC)
            MarketOHLCOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use MarketOHLC.newBuilder() to construct.
        private MarketOHLC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private MarketOHLC() {
            ohlc_ = java.util.Collections.emptyList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new MarketOHLC();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketOHLC_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketOHLC_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.Builder.class);
        }

        public static final int OHLC_FIELD_NUMBER = 1;
        @SuppressWarnings("serial")
        private java.util.List<com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC> ohlc_;
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
         */
        @java.lang.Override
        public java.util.List<com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC> getOhlcList() {
            return ohlc_;
        }
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
         */
        @java.lang.Override
        public java.util.List<? extends com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLCOrBuilder>
        getOhlcOrBuilderList() {
            return ohlc_;
        }
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
         */
        @java.lang.Override
        public int getOhlcCount() {
            return ohlc_.size();
        }
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC getOhlc(int index) {
            return ohlc_.get(index);
        }
        /**
         * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLCOrBuilder getOhlcOrBuilder(
                int index) {
            return ohlc_.get(index);
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
            for (int i = 0; i < ohlc_.size(); i++) {
                output.writeMessage(1, ohlc_.get(i));
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < ohlc_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, ohlc_.get(i));
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
            if (!(obj instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC)) {
                return super.equals(obj);
            }
            com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC other = (com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC) obj;

            if (!getOhlcList()
                    .equals(other.getOhlcList())) return false;
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
            if (getOhlcCount() > 0) {
                hash = (37 * hash) + OHLC_FIELD_NUMBER;
                hash = (53 * hash) + getOhlcList().hashCode();
            }
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC parseFrom(
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
        public static Builder newBuilder(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC prototype) {
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
         * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.MarketOHLC}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.upstox.marketdatafeeder.rpc.proto.MarketOHLC)
                com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLCOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketOHLC_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketOHLC_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.Builder.class);
            }

            // Construct using com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.newBuilder()
            private Builder() {

            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);

            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                if (ohlcBuilder_ == null) {
                    ohlc_ = java.util.Collections.emptyList();
                } else {
                    ohlc_ = null;
                    ohlcBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketOHLC_descriptor;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC getDefaultInstanceForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.getDefaultInstance();
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC build() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC buildPartial() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC result = new com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC(this);
                buildPartialRepeatedFields(result);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartialRepeatedFields(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC result) {
                if (ohlcBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        ohlc_ = java.util.Collections.unmodifiableList(ohlc_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.ohlc_ = ohlc_;
                } else {
                    result.ohlc_ = ohlcBuilder_.build();
                }
            }

            private void buildPartial0(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC result) {
                int from_bitField0_ = bitField0_;
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
                if (other instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC) {
                    return mergeFrom((com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC other) {
                if (other == com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.getDefaultInstance()) return this;
                if (ohlcBuilder_ == null) {
                    if (!other.ohlc_.isEmpty()) {
                        if (ohlc_.isEmpty()) {
                            ohlc_ = other.ohlc_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureOhlcIsMutable();
                            ohlc_.addAll(other.ohlc_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.ohlc_.isEmpty()) {
                        if (ohlcBuilder_.isEmpty()) {
                            ohlcBuilder_.dispose();
                            ohlcBuilder_ = null;
                            ohlc_ = other.ohlc_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            ohlcBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getOhlcFieldBuilder() : null;
                        } else {
                            ohlcBuilder_.addAllMessages(other.ohlc_);
                        }
                    }
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
                            case 10: {
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC m =
                                        input.readMessage(
                                                com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.parser(),
                                                extensionRegistry);
                                if (ohlcBuilder_ == null) {
                                    ensureOhlcIsMutable();
                                    ohlc_.add(m);
                                } else {
                                    ohlcBuilder_.addMessage(m);
                                }
                                break;
                            } // case 10
                            default: {
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

            private java.util.List<com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC> ohlc_ =
                    java.util.Collections.emptyList();
            private void ensureOhlcIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    ohlc_ = new java.util.ArrayList<com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC>(ohlc_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC, com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLCOrBuilder> ohlcBuilder_;

            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public java.util.List<com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC> getOhlcList() {
                if (ohlcBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(ohlc_);
                } else {
                    return ohlcBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public int getOhlcCount() {
                if (ohlcBuilder_ == null) {
                    return ohlc_.size();
                } else {
                    return ohlcBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC getOhlc(int index) {
                if (ohlcBuilder_ == null) {
                    return ohlc_.get(index);
                } else {
                    return ohlcBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public Builder setOhlc(
                    int index, com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC value) {
                if (ohlcBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureOhlcIsMutable();
                    ohlc_.set(index, value);
                    onChanged();
                } else {
                    ohlcBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public Builder setOhlc(
                    int index, com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.Builder builderForValue) {
                if (ohlcBuilder_ == null) {
                    ensureOhlcIsMutable();
                    ohlc_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    ohlcBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public Builder addOhlc(com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC value) {
                if (ohlcBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureOhlcIsMutable();
                    ohlc_.add(value);
                    onChanged();
                } else {
                    ohlcBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public Builder addOhlc(
                    int index, com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC value) {
                if (ohlcBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureOhlcIsMutable();
                    ohlc_.add(index, value);
                    onChanged();
                } else {
                    ohlcBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public Builder addOhlc(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.Builder builderForValue) {
                if (ohlcBuilder_ == null) {
                    ensureOhlcIsMutable();
                    ohlc_.add(builderForValue.build());
                    onChanged();
                } else {
                    ohlcBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public Builder addOhlc(
                    int index, com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.Builder builderForValue) {
                if (ohlcBuilder_ == null) {
                    ensureOhlcIsMutable();
                    ohlc_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    ohlcBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public Builder addAllOhlc(
                    java.lang.Iterable<? extends com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC> values) {
                if (ohlcBuilder_ == null) {
                    ensureOhlcIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, ohlc_);
                    onChanged();
                } else {
                    ohlcBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public Builder clearOhlc() {
                if (ohlcBuilder_ == null) {
                    ohlc_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    ohlcBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public Builder removeOhlc(int index) {
                if (ohlcBuilder_ == null) {
                    ensureOhlcIsMutable();
                    ohlc_.remove(index);
                    onChanged();
                } else {
                    ohlcBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.Builder getOhlcBuilder(
                    int index) {
                return getOhlcFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLCOrBuilder getOhlcOrBuilder(
                    int index) {
                if (ohlcBuilder_ == null) {
                    return ohlc_.get(index);  } else {
                    return ohlcBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public java.util.List<? extends com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLCOrBuilder>
            getOhlcOrBuilderList() {
                if (ohlcBuilder_ != null) {
                    return ohlcBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(ohlc_);
                }
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.Builder addOhlcBuilder() {
                return getOhlcFieldBuilder().addBuilder(
                        com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.getDefaultInstance());
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.Builder addOhlcBuilder(
                    int index) {
                return getOhlcFieldBuilder().addBuilder(
                        index, com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.getDefaultInstance());
            }
            /**
             * <code>repeated .com.upstox.marketdatafeeder.rpc.proto.OHLC ohlc = 1;</code>
             */
            public java.util.List<com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.Builder>
            getOhlcBuilderList() {
                return getOhlcFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC, com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLCOrBuilder>
            getOhlcFieldBuilder() {
                if (ohlcBuilder_ == null) {
                    ohlcBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC, com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLCOrBuilder>(
                            ohlc_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    ohlc_ = null;
                }
                return ohlcBuilder_;
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


            // @@protoc_insertion_point(builder_scope:com.upstox.marketdatafeeder.rpc.proto.MarketOHLC)
        }

        // @@protoc_insertion_point(class_scope:com.upstox.marketdatafeeder.rpc.proto.MarketOHLC)
        private static final com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC();
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<MarketOHLC>
                PARSER = new com.google.protobuf.AbstractParser<MarketOHLC>() {
            @java.lang.Override
            public MarketOHLC parsePartialFrom(
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

        public static com.google.protobuf.Parser<MarketOHLC> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<MarketOHLC> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface QuoteOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.upstox.marketdatafeeder.rpc.proto.Quote)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         *bid quantity
         * </pre>
         *
         * <code>int32 bq = 1;</code>
         * @return The bq.
         */
        int getBq();

        /**
         * <pre>
         *bid price
         * </pre>
         *
         * <code>double bp = 2;</code>
         * @return The bp.
         */
        double getBp();

        /**
         * <pre>
         *bid number of orders
         * </pre>
         *
         * <code>int32 bno = 3;</code>
         * @return The bno.
         */
        int getBno();

        /**
         * <pre>
         * ask quantity
         * </pre>
         *
         * <code>int32 aq = 4;</code>
         * @return The aq.
         */
        int getAq();

        /**
         * <pre>
         * ask price
         * </pre>
         *
         * <code>double ap = 5;</code>
         * @return The ap.
         */
        double getAp();

        /**
         * <pre>
         * ask number of orders
         * </pre>
         *
         * <code>int32 ano = 6;</code>
         * @return The ano.
         */
        int getAno();
    }
    /**
     * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.Quote}
     */
    public static final class Quote extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.upstox.marketdatafeeder.rpc.proto.Quote)
            QuoteOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use Quote.newBuilder() to construct.
        private Quote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private Quote() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new Quote();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_Quote_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_Quote_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder.class);
        }

        public static final int BQ_FIELD_NUMBER = 1;
        private int bq_ = 0;
        /**
         * <pre>
         *bid quantity
         * </pre>
         *
         * <code>int32 bq = 1;</code>
         * @return The bq.
         */
        @java.lang.Override
        public int getBq() {
            return bq_;
        }

        public static final int BP_FIELD_NUMBER = 2;
        private double bp_ = 0D;
        /**
         * <pre>
         *bid price
         * </pre>
         *
         * <code>double bp = 2;</code>
         * @return The bp.
         */
        @java.lang.Override
        public double getBp() {
            return bp_;
        }

        public static final int BNO_FIELD_NUMBER = 3;
        private int bno_ = 0;
        /**
         * <pre>
         *bid number of orders
         * </pre>
         *
         * <code>int32 bno = 3;</code>
         * @return The bno.
         */
        @java.lang.Override
        public int getBno() {
            return bno_;
        }

        public static final int AQ_FIELD_NUMBER = 4;
        private int aq_ = 0;
        /**
         * <pre>
         * ask quantity
         * </pre>
         *
         * <code>int32 aq = 4;</code>
         * @return The aq.
         */
        @java.lang.Override
        public int getAq() {
            return aq_;
        }

        public static final int AP_FIELD_NUMBER = 5;
        private double ap_ = 0D;
        /**
         * <pre>
         * ask price
         * </pre>
         *
         * <code>double ap = 5;</code>
         * @return The ap.
         */
        @java.lang.Override
        public double getAp() {
            return ap_;
        }

        public static final int ANO_FIELD_NUMBER = 6;
        private int ano_ = 0;
        /**
         * <pre>
         * ask number of orders
         * </pre>
         *
         * <code>int32 ano = 6;</code>
         * @return The ano.
         */
        @java.lang.Override
        public int getAno() {
            return ano_;
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
            if (bq_ != 0) {
                output.writeInt32(1, bq_);
            }
            if (java.lang.Double.doubleToRawLongBits(bp_) != 0) {
                output.writeDouble(2, bp_);
            }
            if (bno_ != 0) {
                output.writeInt32(3, bno_);
            }
            if (aq_ != 0) {
                output.writeInt32(4, aq_);
            }
            if (java.lang.Double.doubleToRawLongBits(ap_) != 0) {
                output.writeDouble(5, ap_);
            }
            if (ano_ != 0) {
                output.writeInt32(6, ano_);
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (bq_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, bq_);
            }
            if (java.lang.Double.doubleToRawLongBits(bp_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(2, bp_);
            }
            if (bno_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, bno_);
            }
            if (aq_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(4, aq_);
            }
            if (java.lang.Double.doubleToRawLongBits(ap_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(5, ap_);
            }
            if (ano_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(6, ano_);
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
            if (!(obj instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote)) {
                return super.equals(obj);
            }
            com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote other = (com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote) obj;

            if (getBq()
                    != other.getBq()) return false;
            if (java.lang.Double.doubleToLongBits(getBp())
                    != java.lang.Double.doubleToLongBits(
                    other.getBp())) return false;
            if (getBno()
                    != other.getBno()) return false;
            if (getAq()
                    != other.getAq()) return false;
            if (java.lang.Double.doubleToLongBits(getAp())
                    != java.lang.Double.doubleToLongBits(
                    other.getAp())) return false;
            if (getAno()
                    != other.getAno()) return false;
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
            hash = (37 * hash) + BQ_FIELD_NUMBER;
            hash = (53 * hash) + getBq();
            hash = (37 * hash) + BP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getBp()));
            hash = (37 * hash) + BNO_FIELD_NUMBER;
            hash = (53 * hash) + getBno();
            hash = (37 * hash) + AQ_FIELD_NUMBER;
            hash = (53 * hash) + getAq();
            hash = (37 * hash) + AP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getAp()));
            hash = (37 * hash) + ANO_FIELD_NUMBER;
            hash = (53 * hash) + getAno();
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote parseFrom(
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
        public static Builder newBuilder(com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote prototype) {
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
         * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.Quote}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.upstox.marketdatafeeder.rpc.proto.Quote)
                com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_Quote_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_Quote_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder.class);
            }

            // Construct using com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.newBuilder()
            private Builder() {

            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);

            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                bq_ = 0;
                bp_ = 0D;
                bno_ = 0;
                aq_ = 0;
                ap_ = 0D;
                ano_ = 0;
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_Quote_descriptor;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote getDefaultInstanceForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.getDefaultInstance();
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote build() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote buildPartial() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote result = new com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote(this);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartial0(com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote result) {
                int from_bitField0_ = bitField0_;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.bq_ = bq_;
                }
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    result.bp_ = bp_;
                }
                if (((from_bitField0_ & 0x00000004) != 0)) {
                    result.bno_ = bno_;
                }
                if (((from_bitField0_ & 0x00000008) != 0)) {
                    result.aq_ = aq_;
                }
                if (((from_bitField0_ & 0x00000010) != 0)) {
                    result.ap_ = ap_;
                }
                if (((from_bitField0_ & 0x00000020) != 0)) {
                    result.ano_ = ano_;
                }
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
                if (other instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote) {
                    return mergeFrom((com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote other) {
                if (other == com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.getDefaultInstance()) return this;
                if (other.getBq() != 0) {
                    setBq(other.getBq());
                }
                if (other.getBp() != 0D) {
                    setBp(other.getBp());
                }
                if (other.getBno() != 0) {
                    setBno(other.getBno());
                }
                if (other.getAq() != 0) {
                    setAq(other.getAq());
                }
                if (other.getAp() != 0D) {
                    setAp(other.getAp());
                }
                if (other.getAno() != 0) {
                    setAno(other.getAno());
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
                            case 8: {
                                bq_ = input.readInt32();
                                bitField0_ |= 0x00000001;
                                break;
                            } // case 8
                            case 17: {
                                bp_ = input.readDouble();
                                bitField0_ |= 0x00000002;
                                break;
                            } // case 17
                            case 24: {
                                bno_ = input.readInt32();
                                bitField0_ |= 0x00000004;
                                break;
                            } // case 24
                            case 32: {
                                aq_ = input.readInt32();
                                bitField0_ |= 0x00000008;
                                break;
                            } // case 32
                            case 41: {
                                ap_ = input.readDouble();
                                bitField0_ |= 0x00000010;
                                break;
                            } // case 41
                            case 48: {
                                ano_ = input.readInt32();
                                bitField0_ |= 0x00000020;
                                break;
                            } // case 48
                            default: {
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

            private int bq_ ;
            /**
             * <pre>
             *bid quantity
             * </pre>
             *
             * <code>int32 bq = 1;</code>
             * @return The bq.
             */
            @java.lang.Override
            public int getBq() {
                return bq_;
            }
            /**
             * <pre>
             *bid quantity
             * </pre>
             *
             * <code>int32 bq = 1;</code>
             * @param value The bq to set.
             * @return This builder for chaining.
             */
            public Builder setBq(int value) {

                bq_ = value;
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *bid quantity
             * </pre>
             *
             * <code>int32 bq = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearBq() {
                bitField0_ = (bitField0_ & ~0x00000001);
                bq_ = 0;
                onChanged();
                return this;
            }

            private double bp_ ;
            /**
             * <pre>
             *bid price
             * </pre>
             *
             * <code>double bp = 2;</code>
             * @return The bp.
             */
            @java.lang.Override
            public double getBp() {
                return bp_;
            }
            /**
             * <pre>
             *bid price
             * </pre>
             *
             * <code>double bp = 2;</code>
             * @param value The bp to set.
             * @return This builder for chaining.
             */
            public Builder setBp(double value) {

                bp_ = value;
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *bid price
             * </pre>
             *
             * <code>double bp = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearBp() {
                bitField0_ = (bitField0_ & ~0x00000002);
                bp_ = 0D;
                onChanged();
                return this;
            }

            private int bno_ ;
            /**
             * <pre>
             *bid number of orders
             * </pre>
             *
             * <code>int32 bno = 3;</code>
             * @return The bno.
             */
            @java.lang.Override
            public int getBno() {
                return bno_;
            }
            /**
             * <pre>
             *bid number of orders
             * </pre>
             *
             * <code>int32 bno = 3;</code>
             * @param value The bno to set.
             * @return This builder for chaining.
             */
            public Builder setBno(int value) {

                bno_ = value;
                bitField0_ |= 0x00000004;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *bid number of orders
             * </pre>
             *
             * <code>int32 bno = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearBno() {
                bitField0_ = (bitField0_ & ~0x00000004);
                bno_ = 0;
                onChanged();
                return this;
            }

            private int aq_ ;
            /**
             * <pre>
             * ask quantity
             * </pre>
             *
             * <code>int32 aq = 4;</code>
             * @return The aq.
             */
            @java.lang.Override
            public int getAq() {
                return aq_;
            }
            /**
             * <pre>
             * ask quantity
             * </pre>
             *
             * <code>int32 aq = 4;</code>
             * @param value The aq to set.
             * @return This builder for chaining.
             */
            public Builder setAq(int value) {

                aq_ = value;
                bitField0_ |= 0x00000008;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * ask quantity
             * </pre>
             *
             * <code>int32 aq = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearAq() {
                bitField0_ = (bitField0_ & ~0x00000008);
                aq_ = 0;
                onChanged();
                return this;
            }

            private double ap_ ;
            /**
             * <pre>
             * ask price
             * </pre>
             *
             * <code>double ap = 5;</code>
             * @return The ap.
             */
            @java.lang.Override
            public double getAp() {
                return ap_;
            }
            /**
             * <pre>
             * ask price
             * </pre>
             *
             * <code>double ap = 5;</code>
             * @param value The ap to set.
             * @return This builder for chaining.
             */
            public Builder setAp(double value) {

                ap_ = value;
                bitField0_ |= 0x00000010;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * ask price
             * </pre>
             *
             * <code>double ap = 5;</code>
             * @return This builder for chaining.
             */
            public Builder clearAp() {
                bitField0_ = (bitField0_ & ~0x00000010);
                ap_ = 0D;
                onChanged();
                return this;
            }

            private int ano_ ;
            /**
             * <pre>
             * ask number of orders
             * </pre>
             *
             * <code>int32 ano = 6;</code>
             * @return The ano.
             */
            @java.lang.Override
            public int getAno() {
                return ano_;
            }
            /**
             * <pre>
             * ask number of orders
             * </pre>
             *
             * <code>int32 ano = 6;</code>
             * @param value The ano to set.
             * @return This builder for chaining.
             */
            public Builder setAno(int value) {

                ano_ = value;
                bitField0_ |= 0x00000020;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * ask number of orders
             * </pre>
             *
             * <code>int32 ano = 6;</code>
             * @return This builder for chaining.
             */
            public Builder clearAno() {
                bitField0_ = (bitField0_ & ~0x00000020);
                ano_ = 0;
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


            // @@protoc_insertion_point(builder_scope:com.upstox.marketdatafeeder.rpc.proto.Quote)
        }

        // @@protoc_insertion_point(class_scope:com.upstox.marketdatafeeder.rpc.proto.Quote)
        private static final com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote();
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Quote>
                PARSER = new com.google.protobuf.AbstractParser<Quote>() {
            @java.lang.Override
            public Quote parsePartialFrom(
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

        public static com.google.protobuf.Parser<Quote> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Quote> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface OptionGreeksOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.upstox.marketdatafeeder.rpc.proto.OptionGreeks)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * option price
         * </pre>
         *
         * <code>double op = 1;</code>
         * @return The op.
         */
        double getOp();

        /**
         * <pre>
         *underlying price
         * </pre>
         *
         * <code>double up = 2;</code>
         * @return The up.
         */
        double getUp();

        /**
         * <pre>
         * implied volatility
         * </pre>
         *
         * <code>double iv = 3;</code>
         * @return The iv.
         */
        double getIv();

        /**
         * <code>double delta = 4;</code>
         * @return The delta.
         */
        double getDelta();

        /**
         * <code>double theta = 5;</code>
         * @return The theta.
         */
        double getTheta();

        /**
         * <code>double gamma = 6;</code>
         * @return The gamma.
         */
        double getGamma();

        /**
         * <code>double vega = 7;</code>
         * @return The vega.
         */
        double getVega();

        /**
         * <code>double rho = 8;</code>
         * @return The rho.
         */
        double getRho();
    }
    /**
     * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.OptionGreeks}
     */
    public static final class OptionGreeks extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.upstox.marketdatafeeder.rpc.proto.OptionGreeks)
            OptionGreeksOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use OptionGreeks.newBuilder() to construct.
        private OptionGreeks(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private OptionGreeks() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new OptionGreeks();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionGreeks_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionGreeks_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.Builder.class);
        }

        public static final int OP_FIELD_NUMBER = 1;
        private double op_ = 0D;
        /**
         * <pre>
         * option price
         * </pre>
         *
         * <code>double op = 1;</code>
         * @return The op.
         */
        @java.lang.Override
        public double getOp() {
            return op_;
        }

        public static final int UP_FIELD_NUMBER = 2;
        private double up_ = 0D;
        /**
         * <pre>
         *underlying price
         * </pre>
         *
         * <code>double up = 2;</code>
         * @return The up.
         */
        @java.lang.Override
        public double getUp() {
            return up_;
        }

        public static final int IV_FIELD_NUMBER = 3;
        private double iv_ = 0D;
        /**
         * <pre>
         * implied volatility
         * </pre>
         *
         * <code>double iv = 3;</code>
         * @return The iv.
         */
        @java.lang.Override
        public double getIv() {
            return iv_;
        }

        public static final int DELTA_FIELD_NUMBER = 4;
        private double delta_ = 0D;
        /**
         * <code>double delta = 4;</code>
         * @return The delta.
         */
        @java.lang.Override
        public double getDelta() {
            return delta_;
        }

        public static final int THETA_FIELD_NUMBER = 5;
        private double theta_ = 0D;
        /**
         * <code>double theta = 5;</code>
         * @return The theta.
         */
        @java.lang.Override
        public double getTheta() {
            return theta_;
        }

        public static final int GAMMA_FIELD_NUMBER = 6;
        private double gamma_ = 0D;
        /**
         * <code>double gamma = 6;</code>
         * @return The gamma.
         */
        @java.lang.Override
        public double getGamma() {
            return gamma_;
        }

        public static final int VEGA_FIELD_NUMBER = 7;
        private double vega_ = 0D;
        /**
         * <code>double vega = 7;</code>
         * @return The vega.
         */
        @java.lang.Override
        public double getVega() {
            return vega_;
        }

        public static final int RHO_FIELD_NUMBER = 8;
        private double rho_ = 0D;
        /**
         * <code>double rho = 8;</code>
         * @return The rho.
         */
        @java.lang.Override
        public double getRho() {
            return rho_;
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
            if (java.lang.Double.doubleToRawLongBits(op_) != 0) {
                output.writeDouble(1, op_);
            }
            if (java.lang.Double.doubleToRawLongBits(up_) != 0) {
                output.writeDouble(2, up_);
            }
            if (java.lang.Double.doubleToRawLongBits(iv_) != 0) {
                output.writeDouble(3, iv_);
            }
            if (java.lang.Double.doubleToRawLongBits(delta_) != 0) {
                output.writeDouble(4, delta_);
            }
            if (java.lang.Double.doubleToRawLongBits(theta_) != 0) {
                output.writeDouble(5, theta_);
            }
            if (java.lang.Double.doubleToRawLongBits(gamma_) != 0) {
                output.writeDouble(6, gamma_);
            }
            if (java.lang.Double.doubleToRawLongBits(vega_) != 0) {
                output.writeDouble(7, vega_);
            }
            if (java.lang.Double.doubleToRawLongBits(rho_) != 0) {
                output.writeDouble(8, rho_);
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (java.lang.Double.doubleToRawLongBits(op_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(1, op_);
            }
            if (java.lang.Double.doubleToRawLongBits(up_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(2, up_);
            }
            if (java.lang.Double.doubleToRawLongBits(iv_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(3, iv_);
            }
            if (java.lang.Double.doubleToRawLongBits(delta_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(4, delta_);
            }
            if (java.lang.Double.doubleToRawLongBits(theta_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(5, theta_);
            }
            if (java.lang.Double.doubleToRawLongBits(gamma_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(6, gamma_);
            }
            if (java.lang.Double.doubleToRawLongBits(vega_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(7, vega_);
            }
            if (java.lang.Double.doubleToRawLongBits(rho_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(8, rho_);
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
            if (!(obj instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks)) {
                return super.equals(obj);
            }
            com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks other = (com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks) obj;

            if (java.lang.Double.doubleToLongBits(getOp())
                    != java.lang.Double.doubleToLongBits(
                    other.getOp())) return false;
            if (java.lang.Double.doubleToLongBits(getUp())
                    != java.lang.Double.doubleToLongBits(
                    other.getUp())) return false;
            if (java.lang.Double.doubleToLongBits(getIv())
                    != java.lang.Double.doubleToLongBits(
                    other.getIv())) return false;
            if (java.lang.Double.doubleToLongBits(getDelta())
                    != java.lang.Double.doubleToLongBits(
                    other.getDelta())) return false;
            if (java.lang.Double.doubleToLongBits(getTheta())
                    != java.lang.Double.doubleToLongBits(
                    other.getTheta())) return false;
            if (java.lang.Double.doubleToLongBits(getGamma())
                    != java.lang.Double.doubleToLongBits(
                    other.getGamma())) return false;
            if (java.lang.Double.doubleToLongBits(getVega())
                    != java.lang.Double.doubleToLongBits(
                    other.getVega())) return false;
            if (java.lang.Double.doubleToLongBits(getRho())
                    != java.lang.Double.doubleToLongBits(
                    other.getRho())) return false;
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
            hash = (37 * hash) + OP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getOp()));
            hash = (37 * hash) + UP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getUp()));
            hash = (37 * hash) + IV_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getIv()));
            hash = (37 * hash) + DELTA_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getDelta()));
            hash = (37 * hash) + THETA_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getTheta()));
            hash = (37 * hash) + GAMMA_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getGamma()));
            hash = (37 * hash) + VEGA_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getVega()));
            hash = (37 * hash) + RHO_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getRho()));
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks parseFrom(
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
        public static Builder newBuilder(com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks prototype) {
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
         * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.OptionGreeks}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.upstox.marketdatafeeder.rpc.proto.OptionGreeks)
                com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeksOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionGreeks_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionGreeks_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.Builder.class);
            }

            // Construct using com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.newBuilder()
            private Builder() {

            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);

            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                op_ = 0D;
                up_ = 0D;
                iv_ = 0D;
                delta_ = 0D;
                theta_ = 0D;
                gamma_ = 0D;
                vega_ = 0D;
                rho_ = 0D;
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionGreeks_descriptor;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks getDefaultInstanceForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.getDefaultInstance();
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks build() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks buildPartial() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks result = new com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks(this);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartial0(com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks result) {
                int from_bitField0_ = bitField0_;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.op_ = op_;
                }
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    result.up_ = up_;
                }
                if (((from_bitField0_ & 0x00000004) != 0)) {
                    result.iv_ = iv_;
                }
                if (((from_bitField0_ & 0x00000008) != 0)) {
                    result.delta_ = delta_;
                }
                if (((from_bitField0_ & 0x00000010) != 0)) {
                    result.theta_ = theta_;
                }
                if (((from_bitField0_ & 0x00000020) != 0)) {
                    result.gamma_ = gamma_;
                }
                if (((from_bitField0_ & 0x00000040) != 0)) {
                    result.vega_ = vega_;
                }
                if (((from_bitField0_ & 0x00000080) != 0)) {
                    result.rho_ = rho_;
                }
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
                if (other instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks) {
                    return mergeFrom((com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks other) {
                if (other == com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.getDefaultInstance()) return this;
                if (other.getOp() != 0D) {
                    setOp(other.getOp());
                }
                if (other.getUp() != 0D) {
                    setUp(other.getUp());
                }
                if (other.getIv() != 0D) {
                    setIv(other.getIv());
                }
                if (other.getDelta() != 0D) {
                    setDelta(other.getDelta());
                }
                if (other.getTheta() != 0D) {
                    setTheta(other.getTheta());
                }
                if (other.getGamma() != 0D) {
                    setGamma(other.getGamma());
                }
                if (other.getVega() != 0D) {
                    setVega(other.getVega());
                }
                if (other.getRho() != 0D) {
                    setRho(other.getRho());
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
                            case 9: {
                                op_ = input.readDouble();
                                bitField0_ |= 0x00000001;
                                break;
                            } // case 9
                            case 17: {
                                up_ = input.readDouble();
                                bitField0_ |= 0x00000002;
                                break;
                            } // case 17
                            case 25: {
                                iv_ = input.readDouble();
                                bitField0_ |= 0x00000004;
                                break;
                            } // case 25
                            case 33: {
                                delta_ = input.readDouble();
                                bitField0_ |= 0x00000008;
                                break;
                            } // case 33
                            case 41: {
                                theta_ = input.readDouble();
                                bitField0_ |= 0x00000010;
                                break;
                            } // case 41
                            case 49: {
                                gamma_ = input.readDouble();
                                bitField0_ |= 0x00000020;
                                break;
                            } // case 49
                            case 57: {
                                vega_ = input.readDouble();
                                bitField0_ |= 0x00000040;
                                break;
                            } // case 57
                            case 65: {
                                rho_ = input.readDouble();
                                bitField0_ |= 0x00000080;
                                break;
                            } // case 65
                            default: {
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

            private double op_ ;
            /**
             * <pre>
             * option price
             * </pre>
             *
             * <code>double op = 1;</code>
             * @return The op.
             */
            @java.lang.Override
            public double getOp() {
                return op_;
            }
            /**
             * <pre>
             * option price
             * </pre>
             *
             * <code>double op = 1;</code>
             * @param value The op to set.
             * @return This builder for chaining.
             */
            public Builder setOp(double value) {

                op_ = value;
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * option price
             * </pre>
             *
             * <code>double op = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearOp() {
                bitField0_ = (bitField0_ & ~0x00000001);
                op_ = 0D;
                onChanged();
                return this;
            }

            private double up_ ;
            /**
             * <pre>
             *underlying price
             * </pre>
             *
             * <code>double up = 2;</code>
             * @return The up.
             */
            @java.lang.Override
            public double getUp() {
                return up_;
            }
            /**
             * <pre>
             *underlying price
             * </pre>
             *
             * <code>double up = 2;</code>
             * @param value The up to set.
             * @return This builder for chaining.
             */
            public Builder setUp(double value) {

                up_ = value;
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *underlying price
             * </pre>
             *
             * <code>double up = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearUp() {
                bitField0_ = (bitField0_ & ~0x00000002);
                up_ = 0D;
                onChanged();
                return this;
            }

            private double iv_ ;
            /**
             * <pre>
             * implied volatility
             * </pre>
             *
             * <code>double iv = 3;</code>
             * @return The iv.
             */
            @java.lang.Override
            public double getIv() {
                return iv_;
            }
            /**
             * <pre>
             * implied volatility
             * </pre>
             *
             * <code>double iv = 3;</code>
             * @param value The iv to set.
             * @return This builder for chaining.
             */
            public Builder setIv(double value) {

                iv_ = value;
                bitField0_ |= 0x00000004;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * implied volatility
             * </pre>
             *
             * <code>double iv = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearIv() {
                bitField0_ = (bitField0_ & ~0x00000004);
                iv_ = 0D;
                onChanged();
                return this;
            }

            private double delta_ ;
            /**
             * <code>double delta = 4;</code>
             * @return The delta.
             */
            @java.lang.Override
            public double getDelta() {
                return delta_;
            }
            /**
             * <code>double delta = 4;</code>
             * @param value The delta to set.
             * @return This builder for chaining.
             */
            public Builder setDelta(double value) {

                delta_ = value;
                bitField0_ |= 0x00000008;
                onChanged();
                return this;
            }
            /**
             * <code>double delta = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearDelta() {
                bitField0_ = (bitField0_ & ~0x00000008);
                delta_ = 0D;
                onChanged();
                return this;
            }

            private double theta_ ;
            /**
             * <code>double theta = 5;</code>
             * @return The theta.
             */
            @java.lang.Override
            public double getTheta() {
                return theta_;
            }
            /**
             * <code>double theta = 5;</code>
             * @param value The theta to set.
             * @return This builder for chaining.
             */
            public Builder setTheta(double value) {

                theta_ = value;
                bitField0_ |= 0x00000010;
                onChanged();
                return this;
            }
            /**
             * <code>double theta = 5;</code>
             * @return This builder for chaining.
             */
            public Builder clearTheta() {
                bitField0_ = (bitField0_ & ~0x00000010);
                theta_ = 0D;
                onChanged();
                return this;
            }

            private double gamma_ ;
            /**
             * <code>double gamma = 6;</code>
             * @return The gamma.
             */
            @java.lang.Override
            public double getGamma() {
                return gamma_;
            }
            /**
             * <code>double gamma = 6;</code>
             * @param value The gamma to set.
             * @return This builder for chaining.
             */
            public Builder setGamma(double value) {

                gamma_ = value;
                bitField0_ |= 0x00000020;
                onChanged();
                return this;
            }
            /**
             * <code>double gamma = 6;</code>
             * @return This builder for chaining.
             */
            public Builder clearGamma() {
                bitField0_ = (bitField0_ & ~0x00000020);
                gamma_ = 0D;
                onChanged();
                return this;
            }

            private double vega_ ;
            /**
             * <code>double vega = 7;</code>
             * @return The vega.
             */
            @java.lang.Override
            public double getVega() {
                return vega_;
            }
            /**
             * <code>double vega = 7;</code>
             * @param value The vega to set.
             * @return This builder for chaining.
             */
            public Builder setVega(double value) {

                vega_ = value;
                bitField0_ |= 0x00000040;
                onChanged();
                return this;
            }
            /**
             * <code>double vega = 7;</code>
             * @return This builder for chaining.
             */
            public Builder clearVega() {
                bitField0_ = (bitField0_ & ~0x00000040);
                vega_ = 0D;
                onChanged();
                return this;
            }

            private double rho_ ;
            /**
             * <code>double rho = 8;</code>
             * @return The rho.
             */
            @java.lang.Override
            public double getRho() {
                return rho_;
            }
            /**
             * <code>double rho = 8;</code>
             * @param value The rho to set.
             * @return This builder for chaining.
             */
            public Builder setRho(double value) {

                rho_ = value;
                bitField0_ |= 0x00000080;
                onChanged();
                return this;
            }
            /**
             * <code>double rho = 8;</code>
             * @return This builder for chaining.
             */
            public Builder clearRho() {
                bitField0_ = (bitField0_ & ~0x00000080);
                rho_ = 0D;
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


            // @@protoc_insertion_point(builder_scope:com.upstox.marketdatafeeder.rpc.proto.OptionGreeks)
        }

        // @@protoc_insertion_point(class_scope:com.upstox.marketdatafeeder.rpc.proto.OptionGreeks)
        private static final com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks();
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<OptionGreeks>
                PARSER = new com.google.protobuf.AbstractParser<OptionGreeks>() {
            @java.lang.Override
            public OptionGreeks parsePartialFrom(
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

        public static com.google.protobuf.Parser<OptionGreeks> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<OptionGreeks> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface ExtendedFeedDetailsOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         *avg traded price
         * </pre>
         *
         * <code>double atp = 1;</code>
         * @return The atp.
         */
        double getAtp();

        /**
         * <pre>
         *close price
         * </pre>
         *
         * <code>double cp = 2;</code>
         * @return The cp.
         */
        double getCp();

        /**
         * <pre>
         *volume traded today
         * </pre>
         *
         * <code>int64 vtt = 3;</code>
         * @return The vtt.
         */
        long getVtt();

        /**
         * <pre>
         *open interest
         * </pre>
         *
         * <code>double oi = 4;</code>
         * @return The oi.
         */
        double getOi();

        /**
         * <pre>
         *change oi
         * </pre>
         *
         * <code>double changeOi = 5;</code>
         * @return The changeOi.
         */
        double getChangeOi();

        /**
         * <code>double lastClose = 6;</code>
         * @return The lastClose.
         */
        double getLastClose();

        /**
         * <pre>
         *total buy quantity
         * </pre>
         *
         * <code>double tbq = 7;</code>
         * @return The tbq.
         */
        double getTbq();

        /**
         * <pre>
         *total sell quantity
         * </pre>
         *
         * <code>double tsq = 8;</code>
         * @return The tsq.
         */
        double getTsq();

        /**
         * <code>double close = 9;</code>
         * @return The close.
         */
        double getClose();

        /**
         * <pre>
         *lower circuit
         * </pre>
         *
         * <code>double lc = 10;</code>
         * @return The lc.
         */
        double getLc();

        /**
         * <pre>
         *upper circuit
         * </pre>
         *
         * <code>double uc = 11;</code>
         * @return The uc.
         */
        double getUc();

        /**
         * <pre>
         *yearly high
         * </pre>
         *
         * <code>double yh = 12;</code>
         * @return The yh.
         */
        double getYh();

        /**
         * <pre>
         *yearly low
         * </pre>
         *
         * <code>double yl = 13;</code>
         * @return The yl.
         */
        double getYl();

        /**
         * <pre>
         *fill price
         * </pre>
         *
         * <code>double fp = 14;</code>
         * @return The fp.
         */
        double getFp();

        /**
         * <pre>
         *fill volume
         * </pre>
         *
         * <code>int32 fv = 15;</code>
         * @return The fv.
         */
        int getFv();

        /**
         * <pre>
         *mbp buy
         * </pre>
         *
         * <code>int64 mbpBuy = 16;</code>
         * @return The mbpBuy.
         */
        long getMbpBuy();

        /**
         * <pre>
         *mbp sell
         * </pre>
         *
         * <code>int64 mbpSell = 17;</code>
         * @return The mbpSell.
         */
        long getMbpSell();

        /**
         * <pre>
         *traded volume
         * </pre>
         *
         * <code>int64 tv = 18;</code>
         * @return The tv.
         */
        long getTv();

        /**
         * <pre>
         *day high open interest
         * </pre>
         *
         * <code>double dhoi = 19;</code>
         * @return The dhoi.
         */
        double getDhoi();

        /**
         * <pre>
         *day low open interest
         * </pre>
         *
         * <code>double dloi = 20;</code>
         * @return The dloi.
         */
        double getDloi();

        /**
         * <pre>
         *spot price
         * </pre>
         *
         * <code>double sp = 21;</code>
         * @return The sp.
         */
        double getSp();

        /**
         * <pre>
         *previous open interest
         * </pre>
         *
         * <code>double poi = 22;</code>
         * @return The poi.
         */
        double getPoi();
    }
    /**
     * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails}
     */
    public static final class ExtendedFeedDetails extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails)
            ExtendedFeedDetailsOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ExtendedFeedDetails.newBuilder() to construct.
        private ExtendedFeedDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private ExtendedFeedDetails() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new ExtendedFeedDetails();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_ExtendedFeedDetails_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_ExtendedFeedDetails_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.Builder.class);
        }

        public static final int ATP_FIELD_NUMBER = 1;
        private double atp_ = 0D;
        /**
         * <pre>
         *avg traded price
         * </pre>
         *
         * <code>double atp = 1;</code>
         * @return The atp.
         */
        @java.lang.Override
        public double getAtp() {
            return atp_;
        }

        public static final int CP_FIELD_NUMBER = 2;
        private double cp_ = 0D;
        /**
         * <pre>
         *close price
         * </pre>
         *
         * <code>double cp = 2;</code>
         * @return The cp.
         */
        @java.lang.Override
        public double getCp() {
            return cp_;
        }

        public static final int VTT_FIELD_NUMBER = 3;
        private long vtt_ = 0L;
        /**
         * <pre>
         *volume traded today
         * </pre>
         *
         * <code>int64 vtt = 3;</code>
         * @return The vtt.
         */
        @java.lang.Override
        public long getVtt() {
            return vtt_;
        }

        public static final int OI_FIELD_NUMBER = 4;
        private double oi_ = 0D;
        /**
         * <pre>
         *open interest
         * </pre>
         *
         * <code>double oi = 4;</code>
         * @return The oi.
         */
        @java.lang.Override
        public double getOi() {
            return oi_;
        }

        public static final int CHANGEOI_FIELD_NUMBER = 5;
        private double changeOi_ = 0D;
        /**
         * <pre>
         *change oi
         * </pre>
         *
         * <code>double changeOi = 5;</code>
         * @return The changeOi.
         */
        @java.lang.Override
        public double getChangeOi() {
            return changeOi_;
        }

        public static final int LASTCLOSE_FIELD_NUMBER = 6;
        private double lastClose_ = 0D;
        /**
         * <code>double lastClose = 6;</code>
         * @return The lastClose.
         */
        @java.lang.Override
        public double getLastClose() {
            return lastClose_;
        }

        public static final int TBQ_FIELD_NUMBER = 7;
        private double tbq_ = 0D;
        /**
         * <pre>
         *total buy quantity
         * </pre>
         *
         * <code>double tbq = 7;</code>
         * @return The tbq.
         */
        @java.lang.Override
        public double getTbq() {
            return tbq_;
        }

        public static final int TSQ_FIELD_NUMBER = 8;
        private double tsq_ = 0D;
        /**
         * <pre>
         *total sell quantity
         * </pre>
         *
         * <code>double tsq = 8;</code>
         * @return The tsq.
         */
        @java.lang.Override
        public double getTsq() {
            return tsq_;
        }

        public static final int CLOSE_FIELD_NUMBER = 9;
        private double close_ = 0D;
        /**
         * <code>double close = 9;</code>
         * @return The close.
         */
        @java.lang.Override
        public double getClose() {
            return close_;
        }

        public static final int LC_FIELD_NUMBER = 10;
        private double lc_ = 0D;
        /**
         * <pre>
         *lower circuit
         * </pre>
         *
         * <code>double lc = 10;</code>
         * @return The lc.
         */
        @java.lang.Override
        public double getLc() {
            return lc_;
        }

        public static final int UC_FIELD_NUMBER = 11;
        private double uc_ = 0D;
        /**
         * <pre>
         *upper circuit
         * </pre>
         *
         * <code>double uc = 11;</code>
         * @return The uc.
         */
        @java.lang.Override
        public double getUc() {
            return uc_;
        }

        public static final int YH_FIELD_NUMBER = 12;
        private double yh_ = 0D;
        /**
         * <pre>
         *yearly high
         * </pre>
         *
         * <code>double yh = 12;</code>
         * @return The yh.
         */
        @java.lang.Override
        public double getYh() {
            return yh_;
        }

        public static final int YL_FIELD_NUMBER = 13;
        private double yl_ = 0D;
        /**
         * <pre>
         *yearly low
         * </pre>
         *
         * <code>double yl = 13;</code>
         * @return The yl.
         */
        @java.lang.Override
        public double getYl() {
            return yl_;
        }

        public static final int FP_FIELD_NUMBER = 14;
        private double fp_ = 0D;
        /**
         * <pre>
         *fill price
         * </pre>
         *
         * <code>double fp = 14;</code>
         * @return The fp.
         */
        @java.lang.Override
        public double getFp() {
            return fp_;
        }

        public static final int FV_FIELD_NUMBER = 15;
        private int fv_ = 0;
        /**
         * <pre>
         *fill volume
         * </pre>
         *
         * <code>int32 fv = 15;</code>
         * @return The fv.
         */
        @java.lang.Override
        public int getFv() {
            return fv_;
        }

        public static final int MBPBUY_FIELD_NUMBER = 16;
        private long mbpBuy_ = 0L;
        /**
         * <pre>
         *mbp buy
         * </pre>
         *
         * <code>int64 mbpBuy = 16;</code>
         * @return The mbpBuy.
         */
        @java.lang.Override
        public long getMbpBuy() {
            return mbpBuy_;
        }

        public static final int MBPSELL_FIELD_NUMBER = 17;
        private long mbpSell_ = 0L;
        /**
         * <pre>
         *mbp sell
         * </pre>
         *
         * <code>int64 mbpSell = 17;</code>
         * @return The mbpSell.
         */
        @java.lang.Override
        public long getMbpSell() {
            return mbpSell_;
        }

        public static final int TV_FIELD_NUMBER = 18;
        private long tv_ = 0L;
        /**
         * <pre>
         *traded volume
         * </pre>
         *
         * <code>int64 tv = 18;</code>
         * @return The tv.
         */
        @java.lang.Override
        public long getTv() {
            return tv_;
        }

        public static final int DHOI_FIELD_NUMBER = 19;
        private double dhoi_ = 0D;
        /**
         * <pre>
         *day high open interest
         * </pre>
         *
         * <code>double dhoi = 19;</code>
         * @return The dhoi.
         */
        @java.lang.Override
        public double getDhoi() {
            return dhoi_;
        }

        public static final int DLOI_FIELD_NUMBER = 20;
        private double dloi_ = 0D;
        /**
         * <pre>
         *day low open interest
         * </pre>
         *
         * <code>double dloi = 20;</code>
         * @return The dloi.
         */
        @java.lang.Override
        public double getDloi() {
            return dloi_;
        }

        public static final int SP_FIELD_NUMBER = 21;
        private double sp_ = 0D;
        /**
         * <pre>
         *spot price
         * </pre>
         *
         * <code>double sp = 21;</code>
         * @return The sp.
         */
        @java.lang.Override
        public double getSp() {
            return sp_;
        }

        public static final int POI_FIELD_NUMBER = 22;
        private double poi_ = 0D;
        /**
         * <pre>
         *previous open interest
         * </pre>
         *
         * <code>double poi = 22;</code>
         * @return The poi.
         */
        @java.lang.Override
        public double getPoi() {
            return poi_;
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
            if (java.lang.Double.doubleToRawLongBits(atp_) != 0) {
                output.writeDouble(1, atp_);
            }
            if (java.lang.Double.doubleToRawLongBits(cp_) != 0) {
                output.writeDouble(2, cp_);
            }
            if (vtt_ != 0L) {
                output.writeInt64(3, vtt_);
            }
            if (java.lang.Double.doubleToRawLongBits(oi_) != 0) {
                output.writeDouble(4, oi_);
            }
            if (java.lang.Double.doubleToRawLongBits(changeOi_) != 0) {
                output.writeDouble(5, changeOi_);
            }
            if (java.lang.Double.doubleToRawLongBits(lastClose_) != 0) {
                output.writeDouble(6, lastClose_);
            }
            if (java.lang.Double.doubleToRawLongBits(tbq_) != 0) {
                output.writeDouble(7, tbq_);
            }
            if (java.lang.Double.doubleToRawLongBits(tsq_) != 0) {
                output.writeDouble(8, tsq_);
            }
            if (java.lang.Double.doubleToRawLongBits(close_) != 0) {
                output.writeDouble(9, close_);
            }
            if (java.lang.Double.doubleToRawLongBits(lc_) != 0) {
                output.writeDouble(10, lc_);
            }
            if (java.lang.Double.doubleToRawLongBits(uc_) != 0) {
                output.writeDouble(11, uc_);
            }
            if (java.lang.Double.doubleToRawLongBits(yh_) != 0) {
                output.writeDouble(12, yh_);
            }
            if (java.lang.Double.doubleToRawLongBits(yl_) != 0) {
                output.writeDouble(13, yl_);
            }
            if (java.lang.Double.doubleToRawLongBits(fp_) != 0) {
                output.writeDouble(14, fp_);
            }
            if (fv_ != 0) {
                output.writeInt32(15, fv_);
            }
            if (mbpBuy_ != 0L) {
                output.writeInt64(16, mbpBuy_);
            }
            if (mbpSell_ != 0L) {
                output.writeInt64(17, mbpSell_);
            }
            if (tv_ != 0L) {
                output.writeInt64(18, tv_);
            }
            if (java.lang.Double.doubleToRawLongBits(dhoi_) != 0) {
                output.writeDouble(19, dhoi_);
            }
            if (java.lang.Double.doubleToRawLongBits(dloi_) != 0) {
                output.writeDouble(20, dloi_);
            }
            if (java.lang.Double.doubleToRawLongBits(sp_) != 0) {
                output.writeDouble(21, sp_);
            }
            if (java.lang.Double.doubleToRawLongBits(poi_) != 0) {
                output.writeDouble(22, poi_);
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (java.lang.Double.doubleToRawLongBits(atp_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(1, atp_);
            }
            if (java.lang.Double.doubleToRawLongBits(cp_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(2, cp_);
            }
            if (vtt_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(3, vtt_);
            }
            if (java.lang.Double.doubleToRawLongBits(oi_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(4, oi_);
            }
            if (java.lang.Double.doubleToRawLongBits(changeOi_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(5, changeOi_);
            }
            if (java.lang.Double.doubleToRawLongBits(lastClose_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(6, lastClose_);
            }
            if (java.lang.Double.doubleToRawLongBits(tbq_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(7, tbq_);
            }
            if (java.lang.Double.doubleToRawLongBits(tsq_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(8, tsq_);
            }
            if (java.lang.Double.doubleToRawLongBits(close_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(9, close_);
            }
            if (java.lang.Double.doubleToRawLongBits(lc_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(10, lc_);
            }
            if (java.lang.Double.doubleToRawLongBits(uc_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(11, uc_);
            }
            if (java.lang.Double.doubleToRawLongBits(yh_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(12, yh_);
            }
            if (java.lang.Double.doubleToRawLongBits(yl_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(13, yl_);
            }
            if (java.lang.Double.doubleToRawLongBits(fp_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(14, fp_);
            }
            if (fv_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(15, fv_);
            }
            if (mbpBuy_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(16, mbpBuy_);
            }
            if (mbpSell_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(17, mbpSell_);
            }
            if (tv_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(18, tv_);
            }
            if (java.lang.Double.doubleToRawLongBits(dhoi_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(19, dhoi_);
            }
            if (java.lang.Double.doubleToRawLongBits(dloi_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(20, dloi_);
            }
            if (java.lang.Double.doubleToRawLongBits(sp_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(21, sp_);
            }
            if (java.lang.Double.doubleToRawLongBits(poi_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(22, poi_);
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
            if (!(obj instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails)) {
                return super.equals(obj);
            }
            com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails other = (com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails) obj;

            if (java.lang.Double.doubleToLongBits(getAtp())
                    != java.lang.Double.doubleToLongBits(
                    other.getAtp())) return false;
            if (java.lang.Double.doubleToLongBits(getCp())
                    != java.lang.Double.doubleToLongBits(
                    other.getCp())) return false;
            if (getVtt()
                    != other.getVtt()) return false;
            if (java.lang.Double.doubleToLongBits(getOi())
                    != java.lang.Double.doubleToLongBits(
                    other.getOi())) return false;
            if (java.lang.Double.doubleToLongBits(getChangeOi())
                    != java.lang.Double.doubleToLongBits(
                    other.getChangeOi())) return false;
            if (java.lang.Double.doubleToLongBits(getLastClose())
                    != java.lang.Double.doubleToLongBits(
                    other.getLastClose())) return false;
            if (java.lang.Double.doubleToLongBits(getTbq())
                    != java.lang.Double.doubleToLongBits(
                    other.getTbq())) return false;
            if (java.lang.Double.doubleToLongBits(getTsq())
                    != java.lang.Double.doubleToLongBits(
                    other.getTsq())) return false;
            if (java.lang.Double.doubleToLongBits(getClose())
                    != java.lang.Double.doubleToLongBits(
                    other.getClose())) return false;
            if (java.lang.Double.doubleToLongBits(getLc())
                    != java.lang.Double.doubleToLongBits(
                    other.getLc())) return false;
            if (java.lang.Double.doubleToLongBits(getUc())
                    != java.lang.Double.doubleToLongBits(
                    other.getUc())) return false;
            if (java.lang.Double.doubleToLongBits(getYh())
                    != java.lang.Double.doubleToLongBits(
                    other.getYh())) return false;
            if (java.lang.Double.doubleToLongBits(getYl())
                    != java.lang.Double.doubleToLongBits(
                    other.getYl())) return false;
            if (java.lang.Double.doubleToLongBits(getFp())
                    != java.lang.Double.doubleToLongBits(
                    other.getFp())) return false;
            if (getFv()
                    != other.getFv()) return false;
            if (getMbpBuy()
                    != other.getMbpBuy()) return false;
            if (getMbpSell()
                    != other.getMbpSell()) return false;
            if (getTv()
                    != other.getTv()) return false;
            if (java.lang.Double.doubleToLongBits(getDhoi())
                    != java.lang.Double.doubleToLongBits(
                    other.getDhoi())) return false;
            if (java.lang.Double.doubleToLongBits(getDloi())
                    != java.lang.Double.doubleToLongBits(
                    other.getDloi())) return false;
            if (java.lang.Double.doubleToLongBits(getSp())
                    != java.lang.Double.doubleToLongBits(
                    other.getSp())) return false;
            if (java.lang.Double.doubleToLongBits(getPoi())
                    != java.lang.Double.doubleToLongBits(
                    other.getPoi())) return false;
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
            hash = (37 * hash) + ATP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getAtp()));
            hash = (37 * hash) + CP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getCp()));
            hash = (37 * hash) + VTT_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getVtt());
            hash = (37 * hash) + OI_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getOi()));
            hash = (37 * hash) + CHANGEOI_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getChangeOi()));
            hash = (37 * hash) + LASTCLOSE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getLastClose()));
            hash = (37 * hash) + TBQ_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getTbq()));
            hash = (37 * hash) + TSQ_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getTsq()));
            hash = (37 * hash) + CLOSE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getClose()));
            hash = (37 * hash) + LC_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getLc()));
            hash = (37 * hash) + UC_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getUc()));
            hash = (37 * hash) + YH_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getYh()));
            hash = (37 * hash) + YL_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getYl()));
            hash = (37 * hash) + FP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getFp()));
            hash = (37 * hash) + FV_FIELD_NUMBER;
            hash = (53 * hash) + getFv();
            hash = (37 * hash) + MBPBUY_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getMbpBuy());
            hash = (37 * hash) + MBPSELL_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getMbpSell());
            hash = (37 * hash) + TV_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getTv());
            hash = (37 * hash) + DHOI_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getDhoi()));
            hash = (37 * hash) + DLOI_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getDloi()));
            hash = (37 * hash) + SP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getSp()));
            hash = (37 * hash) + POI_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getPoi()));
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails parseFrom(
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
        public static Builder newBuilder(com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails prototype) {
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
         * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails)
                com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetailsOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_ExtendedFeedDetails_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_ExtendedFeedDetails_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.Builder.class);
            }

            // Construct using com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.newBuilder()
            private Builder() {

            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);

            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                atp_ = 0D;
                cp_ = 0D;
                vtt_ = 0L;
                oi_ = 0D;
                changeOi_ = 0D;
                lastClose_ = 0D;
                tbq_ = 0D;
                tsq_ = 0D;
                close_ = 0D;
                lc_ = 0D;
                uc_ = 0D;
                yh_ = 0D;
                yl_ = 0D;
                fp_ = 0D;
                fv_ = 0;
                mbpBuy_ = 0L;
                mbpSell_ = 0L;
                tv_ = 0L;
                dhoi_ = 0D;
                dloi_ = 0D;
                sp_ = 0D;
                poi_ = 0D;
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_ExtendedFeedDetails_descriptor;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails getDefaultInstanceForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.getDefaultInstance();
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails build() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails buildPartial() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails result = new com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails(this);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartial0(com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails result) {
                int from_bitField0_ = bitField0_;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.atp_ = atp_;
                }
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    result.cp_ = cp_;
                }
                if (((from_bitField0_ & 0x00000004) != 0)) {
                    result.vtt_ = vtt_;
                }
                if (((from_bitField0_ & 0x00000008) != 0)) {
                    result.oi_ = oi_;
                }
                if (((from_bitField0_ & 0x00000010) != 0)) {
                    result.changeOi_ = changeOi_;
                }
                if (((from_bitField0_ & 0x00000020) != 0)) {
                    result.lastClose_ = lastClose_;
                }
                if (((from_bitField0_ & 0x00000040) != 0)) {
                    result.tbq_ = tbq_;
                }
                if (((from_bitField0_ & 0x00000080) != 0)) {
                    result.tsq_ = tsq_;
                }
                if (((from_bitField0_ & 0x00000100) != 0)) {
                    result.close_ = close_;
                }
                if (((from_bitField0_ & 0x00000200) != 0)) {
                    result.lc_ = lc_;
                }
                if (((from_bitField0_ & 0x00000400) != 0)) {
                    result.uc_ = uc_;
                }
                if (((from_bitField0_ & 0x00000800) != 0)) {
                    result.yh_ = yh_;
                }
                if (((from_bitField0_ & 0x00001000) != 0)) {
                    result.yl_ = yl_;
                }
                if (((from_bitField0_ & 0x00002000) != 0)) {
                    result.fp_ = fp_;
                }
                if (((from_bitField0_ & 0x00004000) != 0)) {
                    result.fv_ = fv_;
                }
                if (((from_bitField0_ & 0x00008000) != 0)) {
                    result.mbpBuy_ = mbpBuy_;
                }
                if (((from_bitField0_ & 0x00010000) != 0)) {
                    result.mbpSell_ = mbpSell_;
                }
                if (((from_bitField0_ & 0x00020000) != 0)) {
                    result.tv_ = tv_;
                }
                if (((from_bitField0_ & 0x00040000) != 0)) {
                    result.dhoi_ = dhoi_;
                }
                if (((from_bitField0_ & 0x00080000) != 0)) {
                    result.dloi_ = dloi_;
                }
                if (((from_bitField0_ & 0x00100000) != 0)) {
                    result.sp_ = sp_;
                }
                if (((from_bitField0_ & 0x00200000) != 0)) {
                    result.poi_ = poi_;
                }
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
                if (other instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails) {
                    return mergeFrom((com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails other) {
                if (other == com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.getDefaultInstance()) return this;
                if (other.getAtp() != 0D) {
                    setAtp(other.getAtp());
                }
                if (other.getCp() != 0D) {
                    setCp(other.getCp());
                }
                if (other.getVtt() != 0L) {
                    setVtt(other.getVtt());
                }
                if (other.getOi() != 0D) {
                    setOi(other.getOi());
                }
                if (other.getChangeOi() != 0D) {
                    setChangeOi(other.getChangeOi());
                }
                if (other.getLastClose() != 0D) {
                    setLastClose(other.getLastClose());
                }
                if (other.getTbq() != 0D) {
                    setTbq(other.getTbq());
                }
                if (other.getTsq() != 0D) {
                    setTsq(other.getTsq());
                }
                if (other.getClose() != 0D) {
                    setClose(other.getClose());
                }
                if (other.getLc() != 0D) {
                    setLc(other.getLc());
                }
                if (other.getUc() != 0D) {
                    setUc(other.getUc());
                }
                if (other.getYh() != 0D) {
                    setYh(other.getYh());
                }
                if (other.getYl() != 0D) {
                    setYl(other.getYl());
                }
                if (other.getFp() != 0D) {
                    setFp(other.getFp());
                }
                if (other.getFv() != 0) {
                    setFv(other.getFv());
                }
                if (other.getMbpBuy() != 0L) {
                    setMbpBuy(other.getMbpBuy());
                }
                if (other.getMbpSell() != 0L) {
                    setMbpSell(other.getMbpSell());
                }
                if (other.getTv() != 0L) {
                    setTv(other.getTv());
                }
                if (other.getDhoi() != 0D) {
                    setDhoi(other.getDhoi());
                }
                if (other.getDloi() != 0D) {
                    setDloi(other.getDloi());
                }
                if (other.getSp() != 0D) {
                    setSp(other.getSp());
                }
                if (other.getPoi() != 0D) {
                    setPoi(other.getPoi());
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
                            case 9: {
                                atp_ = input.readDouble();
                                bitField0_ |= 0x00000001;
                                break;
                            } // case 9
                            case 17: {
                                cp_ = input.readDouble();
                                bitField0_ |= 0x00000002;
                                break;
                            } // case 17
                            case 24: {
                                vtt_ = input.readInt64();
                                bitField0_ |= 0x00000004;
                                break;
                            } // case 24
                            case 33: {
                                oi_ = input.readDouble();
                                bitField0_ |= 0x00000008;
                                break;
                            } // case 33
                            case 41: {
                                changeOi_ = input.readDouble();
                                bitField0_ |= 0x00000010;
                                break;
                            } // case 41
                            case 49: {
                                lastClose_ = input.readDouble();
                                bitField0_ |= 0x00000020;
                                break;
                            } // case 49
                            case 57: {
                                tbq_ = input.readDouble();
                                bitField0_ |= 0x00000040;
                                break;
                            } // case 57
                            case 65: {
                                tsq_ = input.readDouble();
                                bitField0_ |= 0x00000080;
                                break;
                            } // case 65
                            case 73: {
                                close_ = input.readDouble();
                                bitField0_ |= 0x00000100;
                                break;
                            } // case 73
                            case 81: {
                                lc_ = input.readDouble();
                                bitField0_ |= 0x00000200;
                                break;
                            } // case 81
                            case 89: {
                                uc_ = input.readDouble();
                                bitField0_ |= 0x00000400;
                                break;
                            } // case 89
                            case 97: {
                                yh_ = input.readDouble();
                                bitField0_ |= 0x00000800;
                                break;
                            } // case 97
                            case 105: {
                                yl_ = input.readDouble();
                                bitField0_ |= 0x00001000;
                                break;
                            } // case 105
                            case 113: {
                                fp_ = input.readDouble();
                                bitField0_ |= 0x00002000;
                                break;
                            } // case 113
                            case 120: {
                                fv_ = input.readInt32();
                                bitField0_ |= 0x00004000;
                                break;
                            } // case 120
                            case 128: {
                                mbpBuy_ = input.readInt64();
                                bitField0_ |= 0x00008000;
                                break;
                            } // case 128
                            case 136: {
                                mbpSell_ = input.readInt64();
                                bitField0_ |= 0x00010000;
                                break;
                            } // case 136
                            case 144: {
                                tv_ = input.readInt64();
                                bitField0_ |= 0x00020000;
                                break;
                            } // case 144
                            case 153: {
                                dhoi_ = input.readDouble();
                                bitField0_ |= 0x00040000;
                                break;
                            } // case 153
                            case 161: {
                                dloi_ = input.readDouble();
                                bitField0_ |= 0x00080000;
                                break;
                            } // case 161
                            case 169: {
                                sp_ = input.readDouble();
                                bitField0_ |= 0x00100000;
                                break;
                            } // case 169
                            case 177: {
                                poi_ = input.readDouble();
                                bitField0_ |= 0x00200000;
                                break;
                            } // case 177
                            default: {
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

            private double atp_ ;
            /**
             * <pre>
             *avg traded price
             * </pre>
             *
             * <code>double atp = 1;</code>
             * @return The atp.
             */
            @java.lang.Override
            public double getAtp() {
                return atp_;
            }
            /**
             * <pre>
             *avg traded price
             * </pre>
             *
             * <code>double atp = 1;</code>
             * @param value The atp to set.
             * @return This builder for chaining.
             */
            public Builder setAtp(double value) {

                atp_ = value;
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *avg traded price
             * </pre>
             *
             * <code>double atp = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearAtp() {
                bitField0_ = (bitField0_ & ~0x00000001);
                atp_ = 0D;
                onChanged();
                return this;
            }

            private double cp_ ;
            /**
             * <pre>
             *close price
             * </pre>
             *
             * <code>double cp = 2;</code>
             * @return The cp.
             */
            @java.lang.Override
            public double getCp() {
                return cp_;
            }
            /**
             * <pre>
             *close price
             * </pre>
             *
             * <code>double cp = 2;</code>
             * @param value The cp to set.
             * @return This builder for chaining.
             */
            public Builder setCp(double value) {

                cp_ = value;
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *close price
             * </pre>
             *
             * <code>double cp = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearCp() {
                bitField0_ = (bitField0_ & ~0x00000002);
                cp_ = 0D;
                onChanged();
                return this;
            }

            private long vtt_ ;
            /**
             * <pre>
             *volume traded today
             * </pre>
             *
             * <code>int64 vtt = 3;</code>
             * @return The vtt.
             */
            @java.lang.Override
            public long getVtt() {
                return vtt_;
            }
            /**
             * <pre>
             *volume traded today
             * </pre>
             *
             * <code>int64 vtt = 3;</code>
             * @param value The vtt to set.
             * @return This builder for chaining.
             */
            public Builder setVtt(long value) {

                vtt_ = value;
                bitField0_ |= 0x00000004;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *volume traded today
             * </pre>
             *
             * <code>int64 vtt = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearVtt() {
                bitField0_ = (bitField0_ & ~0x00000004);
                vtt_ = 0L;
                onChanged();
                return this;
            }

            private double oi_ ;
            /**
             * <pre>
             *open interest
             * </pre>
             *
             * <code>double oi = 4;</code>
             * @return The oi.
             */
            @java.lang.Override
            public double getOi() {
                return oi_;
            }
            /**
             * <pre>
             *open interest
             * </pre>
             *
             * <code>double oi = 4;</code>
             * @param value The oi to set.
             * @return This builder for chaining.
             */
            public Builder setOi(double value) {

                oi_ = value;
                bitField0_ |= 0x00000008;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *open interest
             * </pre>
             *
             * <code>double oi = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearOi() {
                bitField0_ = (bitField0_ & ~0x00000008);
                oi_ = 0D;
                onChanged();
                return this;
            }

            private double changeOi_ ;
            /**
             * <pre>
             *change oi
             * </pre>
             *
             * <code>double changeOi = 5;</code>
             * @return The changeOi.
             */
            @java.lang.Override
            public double getChangeOi() {
                return changeOi_;
            }
            /**
             * <pre>
             *change oi
             * </pre>
             *
             * <code>double changeOi = 5;</code>
             * @param value The changeOi to set.
             * @return This builder for chaining.
             */
            public Builder setChangeOi(double value) {

                changeOi_ = value;
                bitField0_ |= 0x00000010;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *change oi
             * </pre>
             *
             * <code>double changeOi = 5;</code>
             * @return This builder for chaining.
             */
            public Builder clearChangeOi() {
                bitField0_ = (bitField0_ & ~0x00000010);
                changeOi_ = 0D;
                onChanged();
                return this;
            }

            private double lastClose_ ;
            /**
             * <code>double lastClose = 6;</code>
             * @return The lastClose.
             */
            @java.lang.Override
            public double getLastClose() {
                return lastClose_;
            }
            /**
             * <code>double lastClose = 6;</code>
             * @param value The lastClose to set.
             * @return This builder for chaining.
             */
            public Builder setLastClose(double value) {

                lastClose_ = value;
                bitField0_ |= 0x00000020;
                onChanged();
                return this;
            }
            /**
             * <code>double lastClose = 6;</code>
             * @return This builder for chaining.
             */
            public Builder clearLastClose() {
                bitField0_ = (bitField0_ & ~0x00000020);
                lastClose_ = 0D;
                onChanged();
                return this;
            }

            private double tbq_ ;
            /**
             * <pre>
             *total buy quantity
             * </pre>
             *
             * <code>double tbq = 7;</code>
             * @return The tbq.
             */
            @java.lang.Override
            public double getTbq() {
                return tbq_;
            }
            /**
             * <pre>
             *total buy quantity
             * </pre>
             *
             * <code>double tbq = 7;</code>
             * @param value The tbq to set.
             * @return This builder for chaining.
             */
            public Builder setTbq(double value) {

                tbq_ = value;
                bitField0_ |= 0x00000040;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *total buy quantity
             * </pre>
             *
             * <code>double tbq = 7;</code>
             * @return This builder for chaining.
             */
            public Builder clearTbq() {
                bitField0_ = (bitField0_ & ~0x00000040);
                tbq_ = 0D;
                onChanged();
                return this;
            }

            private double tsq_ ;
            /**
             * <pre>
             *total sell quantity
             * </pre>
             *
             * <code>double tsq = 8;</code>
             * @return The tsq.
             */
            @java.lang.Override
            public double getTsq() {
                return tsq_;
            }
            /**
             * <pre>
             *total sell quantity
             * </pre>
             *
             * <code>double tsq = 8;</code>
             * @param value The tsq to set.
             * @return This builder for chaining.
             */
            public Builder setTsq(double value) {

                tsq_ = value;
                bitField0_ |= 0x00000080;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *total sell quantity
             * </pre>
             *
             * <code>double tsq = 8;</code>
             * @return This builder for chaining.
             */
            public Builder clearTsq() {
                bitField0_ = (bitField0_ & ~0x00000080);
                tsq_ = 0D;
                onChanged();
                return this;
            }

            private double close_ ;
            /**
             * <code>double close = 9;</code>
             * @return The close.
             */
            @java.lang.Override
            public double getClose() {
                return close_;
            }
            /**
             * <code>double close = 9;</code>
             * @param value The close to set.
             * @return This builder for chaining.
             */
            public Builder setClose(double value) {

                close_ = value;
                bitField0_ |= 0x00000100;
                onChanged();
                return this;
            }
            /**
             * <code>double close = 9;</code>
             * @return This builder for chaining.
             */
            public Builder clearClose() {
                bitField0_ = (bitField0_ & ~0x00000100);
                close_ = 0D;
                onChanged();
                return this;
            }

            private double lc_ ;
            /**
             * <pre>
             *lower circuit
             * </pre>
             *
             * <code>double lc = 10;</code>
             * @return The lc.
             */
            @java.lang.Override
            public double getLc() {
                return lc_;
            }
            /**
             * <pre>
             *lower circuit
             * </pre>
             *
             * <code>double lc = 10;</code>
             * @param value The lc to set.
             * @return This builder for chaining.
             */
            public Builder setLc(double value) {

                lc_ = value;
                bitField0_ |= 0x00000200;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *lower circuit
             * </pre>
             *
             * <code>double lc = 10;</code>
             * @return This builder for chaining.
             */
            public Builder clearLc() {
                bitField0_ = (bitField0_ & ~0x00000200);
                lc_ = 0D;
                onChanged();
                return this;
            }

            private double uc_ ;
            /**
             * <pre>
             *upper circuit
             * </pre>
             *
             * <code>double uc = 11;</code>
             * @return The uc.
             */
            @java.lang.Override
            public double getUc() {
                return uc_;
            }
            /**
             * <pre>
             *upper circuit
             * </pre>
             *
             * <code>double uc = 11;</code>
             * @param value The uc to set.
             * @return This builder for chaining.
             */
            public Builder setUc(double value) {

                uc_ = value;
                bitField0_ |= 0x00000400;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *upper circuit
             * </pre>
             *
             * <code>double uc = 11;</code>
             * @return This builder for chaining.
             */
            public Builder clearUc() {
                bitField0_ = (bitField0_ & ~0x00000400);
                uc_ = 0D;
                onChanged();
                return this;
            }

            private double yh_ ;
            /**
             * <pre>
             *yearly high
             * </pre>
             *
             * <code>double yh = 12;</code>
             * @return The yh.
             */
            @java.lang.Override
            public double getYh() {
                return yh_;
            }
            /**
             * <pre>
             *yearly high
             * </pre>
             *
             * <code>double yh = 12;</code>
             * @param value The yh to set.
             * @return This builder for chaining.
             */
            public Builder setYh(double value) {

                yh_ = value;
                bitField0_ |= 0x00000800;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *yearly high
             * </pre>
             *
             * <code>double yh = 12;</code>
             * @return This builder for chaining.
             */
            public Builder clearYh() {
                bitField0_ = (bitField0_ & ~0x00000800);
                yh_ = 0D;
                onChanged();
                return this;
            }

            private double yl_ ;
            /**
             * <pre>
             *yearly low
             * </pre>
             *
             * <code>double yl = 13;</code>
             * @return The yl.
             */
            @java.lang.Override
            public double getYl() {
                return yl_;
            }
            /**
             * <pre>
             *yearly low
             * </pre>
             *
             * <code>double yl = 13;</code>
             * @param value The yl to set.
             * @return This builder for chaining.
             */
            public Builder setYl(double value) {

                yl_ = value;
                bitField0_ |= 0x00001000;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *yearly low
             * </pre>
             *
             * <code>double yl = 13;</code>
             * @return This builder for chaining.
             */
            public Builder clearYl() {
                bitField0_ = (bitField0_ & ~0x00001000);
                yl_ = 0D;
                onChanged();
                return this;
            }

            private double fp_ ;
            /**
             * <pre>
             *fill price
             * </pre>
             *
             * <code>double fp = 14;</code>
             * @return The fp.
             */
            @java.lang.Override
            public double getFp() {
                return fp_;
            }
            /**
             * <pre>
             *fill price
             * </pre>
             *
             * <code>double fp = 14;</code>
             * @param value The fp to set.
             * @return This builder for chaining.
             */
            public Builder setFp(double value) {

                fp_ = value;
                bitField0_ |= 0x00002000;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *fill price
             * </pre>
             *
             * <code>double fp = 14;</code>
             * @return This builder for chaining.
             */
            public Builder clearFp() {
                bitField0_ = (bitField0_ & ~0x00002000);
                fp_ = 0D;
                onChanged();
                return this;
            }

            private int fv_ ;
            /**
             * <pre>
             *fill volume
             * </pre>
             *
             * <code>int32 fv = 15;</code>
             * @return The fv.
             */
            @java.lang.Override
            public int getFv() {
                return fv_;
            }
            /**
             * <pre>
             *fill volume
             * </pre>
             *
             * <code>int32 fv = 15;</code>
             * @param value The fv to set.
             * @return This builder for chaining.
             */
            public Builder setFv(int value) {

                fv_ = value;
                bitField0_ |= 0x00004000;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *fill volume
             * </pre>
             *
             * <code>int32 fv = 15;</code>
             * @return This builder for chaining.
             */
            public Builder clearFv() {
                bitField0_ = (bitField0_ & ~0x00004000);
                fv_ = 0;
                onChanged();
                return this;
            }

            private long mbpBuy_ ;
            /**
             * <pre>
             *mbp buy
             * </pre>
             *
             * <code>int64 mbpBuy = 16;</code>
             * @return The mbpBuy.
             */
            @java.lang.Override
            public long getMbpBuy() {
                return mbpBuy_;
            }
            /**
             * <pre>
             *mbp buy
             * </pre>
             *
             * <code>int64 mbpBuy = 16;</code>
             * @param value The mbpBuy to set.
             * @return This builder for chaining.
             */
            public Builder setMbpBuy(long value) {

                mbpBuy_ = value;
                bitField0_ |= 0x00008000;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *mbp buy
             * </pre>
             *
             * <code>int64 mbpBuy = 16;</code>
             * @return This builder for chaining.
             */
            public Builder clearMbpBuy() {
                bitField0_ = (bitField0_ & ~0x00008000);
                mbpBuy_ = 0L;
                onChanged();
                return this;
            }

            private long mbpSell_ ;
            /**
             * <pre>
             *mbp sell
             * </pre>
             *
             * <code>int64 mbpSell = 17;</code>
             * @return The mbpSell.
             */
            @java.lang.Override
            public long getMbpSell() {
                return mbpSell_;
            }
            /**
             * <pre>
             *mbp sell
             * </pre>
             *
             * <code>int64 mbpSell = 17;</code>
             * @param value The mbpSell to set.
             * @return This builder for chaining.
             */
            public Builder setMbpSell(long value) {

                mbpSell_ = value;
                bitField0_ |= 0x00010000;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *mbp sell
             * </pre>
             *
             * <code>int64 mbpSell = 17;</code>
             * @return This builder for chaining.
             */
            public Builder clearMbpSell() {
                bitField0_ = (bitField0_ & ~0x00010000);
                mbpSell_ = 0L;
                onChanged();
                return this;
            }

            private long tv_ ;
            /**
             * <pre>
             *traded volume
             * </pre>
             *
             * <code>int64 tv = 18;</code>
             * @return The tv.
             */
            @java.lang.Override
            public long getTv() {
                return tv_;
            }
            /**
             * <pre>
             *traded volume
             * </pre>
             *
             * <code>int64 tv = 18;</code>
             * @param value The tv to set.
             * @return This builder for chaining.
             */
            public Builder setTv(long value) {

                tv_ = value;
                bitField0_ |= 0x00020000;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *traded volume
             * </pre>
             *
             * <code>int64 tv = 18;</code>
             * @return This builder for chaining.
             */
            public Builder clearTv() {
                bitField0_ = (bitField0_ & ~0x00020000);
                tv_ = 0L;
                onChanged();
                return this;
            }

            private double dhoi_ ;
            /**
             * <pre>
             *day high open interest
             * </pre>
             *
             * <code>double dhoi = 19;</code>
             * @return The dhoi.
             */
            @java.lang.Override
            public double getDhoi() {
                return dhoi_;
            }
            /**
             * <pre>
             *day high open interest
             * </pre>
             *
             * <code>double dhoi = 19;</code>
             * @param value The dhoi to set.
             * @return This builder for chaining.
             */
            public Builder setDhoi(double value) {

                dhoi_ = value;
                bitField0_ |= 0x00040000;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *day high open interest
             * </pre>
             *
             * <code>double dhoi = 19;</code>
             * @return This builder for chaining.
             */
            public Builder clearDhoi() {
                bitField0_ = (bitField0_ & ~0x00040000);
                dhoi_ = 0D;
                onChanged();
                return this;
            }

            private double dloi_ ;
            /**
             * <pre>
             *day low open interest
             * </pre>
             *
             * <code>double dloi = 20;</code>
             * @return The dloi.
             */
            @java.lang.Override
            public double getDloi() {
                return dloi_;
            }
            /**
             * <pre>
             *day low open interest
             * </pre>
             *
             * <code>double dloi = 20;</code>
             * @param value The dloi to set.
             * @return This builder for chaining.
             */
            public Builder setDloi(double value) {

                dloi_ = value;
                bitField0_ |= 0x00080000;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *day low open interest
             * </pre>
             *
             * <code>double dloi = 20;</code>
             * @return This builder for chaining.
             */
            public Builder clearDloi() {
                bitField0_ = (bitField0_ & ~0x00080000);
                dloi_ = 0D;
                onChanged();
                return this;
            }

            private double sp_ ;
            /**
             * <pre>
             *spot price
             * </pre>
             *
             * <code>double sp = 21;</code>
             * @return The sp.
             */
            @java.lang.Override
            public double getSp() {
                return sp_;
            }
            /**
             * <pre>
             *spot price
             * </pre>
             *
             * <code>double sp = 21;</code>
             * @param value The sp to set.
             * @return This builder for chaining.
             */
            public Builder setSp(double value) {

                sp_ = value;
                bitField0_ |= 0x00100000;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *spot price
             * </pre>
             *
             * <code>double sp = 21;</code>
             * @return This builder for chaining.
             */
            public Builder clearSp() {
                bitField0_ = (bitField0_ & ~0x00100000);
                sp_ = 0D;
                onChanged();
                return this;
            }

            private double poi_ ;
            /**
             * <pre>
             *previous open interest
             * </pre>
             *
             * <code>double poi = 22;</code>
             * @return The poi.
             */
            @java.lang.Override
            public double getPoi() {
                return poi_;
            }
            /**
             * <pre>
             *previous open interest
             * </pre>
             *
             * <code>double poi = 22;</code>
             * @param value The poi to set.
             * @return This builder for chaining.
             */
            public Builder setPoi(double value) {

                poi_ = value;
                bitField0_ |= 0x00200000;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *previous open interest
             * </pre>
             *
             * <code>double poi = 22;</code>
             * @return This builder for chaining.
             */
            public Builder clearPoi() {
                bitField0_ = (bitField0_ & ~0x00200000);
                poi_ = 0D;
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


            // @@protoc_insertion_point(builder_scope:com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails)
        }

        // @@protoc_insertion_point(class_scope:com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails)
        private static final com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails();
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ExtendedFeedDetails>
                PARSER = new com.google.protobuf.AbstractParser<ExtendedFeedDetails>() {
            @java.lang.Override
            public ExtendedFeedDetails parsePartialFrom(
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

        public static com.google.protobuf.Parser<ExtendedFeedDetails> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ExtendedFeedDetails> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface OHLCOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.upstox.marketdatafeeder.rpc.proto.OHLC)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string interval = 1;</code>
         * @return The interval.
         */
        java.lang.String getInterval();
        /**
         * <code>string interval = 1;</code>
         * @return The bytes for interval.
         */
        com.google.protobuf.ByteString
        getIntervalBytes();

        /**
         * <code>double open = 2;</code>
         * @return The open.
         */
        double getOpen();

        /**
         * <code>double high = 3;</code>
         * @return The high.
         */
        double getHigh();

        /**
         * <code>double low = 4;</code>
         * @return The low.
         */
        double getLow();

        /**
         * <code>double close = 5;</code>
         * @return The close.
         */
        double getClose();

        /**
         * <code>int32 volume = 6;</code>
         * @return The volume.
         */
        int getVolume();

        /**
         * <code>int64 ts = 7;</code>
         * @return The ts.
         */
        long getTs();
    }
    /**
     * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.OHLC}
     */
    public static final class OHLC extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.upstox.marketdatafeeder.rpc.proto.OHLC)
            OHLCOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use OHLC.newBuilder() to construct.
        private OHLC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private OHLC() {
            interval_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new OHLC();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OHLC_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OHLC_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.Builder.class);
        }

        public static final int INTERVAL_FIELD_NUMBER = 1;
        @SuppressWarnings("serial")
        private volatile java.lang.Object interval_ = "";
        /**
         * <code>string interval = 1;</code>
         * @return The interval.
         */
        @java.lang.Override
        public java.lang.String getInterval() {
            java.lang.Object ref = interval_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                interval_ = s;
                return s;
            }
        }
        /**
         * <code>string interval = 1;</code>
         * @return The bytes for interval.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString
        getIntervalBytes() {
            java.lang.Object ref = interval_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                interval_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int OPEN_FIELD_NUMBER = 2;
        private double open_ = 0D;
        /**
         * <code>double open = 2;</code>
         * @return The open.
         */
        @java.lang.Override
        public double getOpen() {
            return open_;
        }

        public static final int HIGH_FIELD_NUMBER = 3;
        private double high_ = 0D;
        /**
         * <code>double high = 3;</code>
         * @return The high.
         */
        @java.lang.Override
        public double getHigh() {
            return high_;
        }

        public static final int LOW_FIELD_NUMBER = 4;
        private double low_ = 0D;
        /**
         * <code>double low = 4;</code>
         * @return The low.
         */
        @java.lang.Override
        public double getLow() {
            return low_;
        }

        public static final int CLOSE_FIELD_NUMBER = 5;
        private double close_ = 0D;
        /**
         * <code>double close = 5;</code>
         * @return The close.
         */
        @java.lang.Override
        public double getClose() {
            return close_;
        }

        public static final int VOLUME_FIELD_NUMBER = 6;
        private int volume_ = 0;
        /**
         * <code>int32 volume = 6;</code>
         * @return The volume.
         */
        @java.lang.Override
        public int getVolume() {
            return volume_;
        }

        public static final int TS_FIELD_NUMBER = 7;
        private long ts_ = 0L;
        /**
         * <code>int64 ts = 7;</code>
         * @return The ts.
         */
        @java.lang.Override
        public long getTs() {
            return ts_;
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
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(interval_)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, interval_);
            }
            if (java.lang.Double.doubleToRawLongBits(open_) != 0) {
                output.writeDouble(2, open_);
            }
            if (java.lang.Double.doubleToRawLongBits(high_) != 0) {
                output.writeDouble(3, high_);
            }
            if (java.lang.Double.doubleToRawLongBits(low_) != 0) {
                output.writeDouble(4, low_);
            }
            if (java.lang.Double.doubleToRawLongBits(close_) != 0) {
                output.writeDouble(5, close_);
            }
            if (volume_ != 0) {
                output.writeInt32(6, volume_);
            }
            if (ts_ != 0L) {
                output.writeInt64(7, ts_);
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(interval_)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, interval_);
            }
            if (java.lang.Double.doubleToRawLongBits(open_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(2, open_);
            }
            if (java.lang.Double.doubleToRawLongBits(high_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(3, high_);
            }
            if (java.lang.Double.doubleToRawLongBits(low_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(4, low_);
            }
            if (java.lang.Double.doubleToRawLongBits(close_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(5, close_);
            }
            if (volume_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(6, volume_);
            }
            if (ts_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(7, ts_);
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
            if (!(obj instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC)) {
                return super.equals(obj);
            }
            com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC other = (com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC) obj;

            if (!getInterval()
                    .equals(other.getInterval())) return false;
            if (java.lang.Double.doubleToLongBits(getOpen())
                    != java.lang.Double.doubleToLongBits(
                    other.getOpen())) return false;
            if (java.lang.Double.doubleToLongBits(getHigh())
                    != java.lang.Double.doubleToLongBits(
                    other.getHigh())) return false;
            if (java.lang.Double.doubleToLongBits(getLow())
                    != java.lang.Double.doubleToLongBits(
                    other.getLow())) return false;
            if (java.lang.Double.doubleToLongBits(getClose())
                    != java.lang.Double.doubleToLongBits(
                    other.getClose())) return false;
            if (getVolume()
                    != other.getVolume()) return false;
            if (getTs()
                    != other.getTs()) return false;
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
            hash = (37 * hash) + INTERVAL_FIELD_NUMBER;
            hash = (53 * hash) + getInterval().hashCode();
            hash = (37 * hash) + OPEN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getOpen()));
            hash = (37 * hash) + HIGH_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getHigh()));
            hash = (37 * hash) + LOW_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getLow()));
            hash = (37 * hash) + CLOSE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getClose()));
            hash = (37 * hash) + VOLUME_FIELD_NUMBER;
            hash = (53 * hash) + getVolume();
            hash = (37 * hash) + TS_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    getTs());
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC parseFrom(
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
        public static Builder newBuilder(com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC prototype) {
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
         * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.OHLC}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.upstox.marketdatafeeder.rpc.proto.OHLC)
                com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLCOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OHLC_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OHLC_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.Builder.class);
            }

            // Construct using com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.newBuilder()
            private Builder() {

            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);

            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                interval_ = "";
                open_ = 0D;
                high_ = 0D;
                low_ = 0D;
                close_ = 0D;
                volume_ = 0;
                ts_ = 0L;
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OHLC_descriptor;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC getDefaultInstanceForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.getDefaultInstance();
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC build() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC buildPartial() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC result = new com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC(this);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartial0(com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC result) {
                int from_bitField0_ = bitField0_;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.interval_ = interval_;
                }
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    result.open_ = open_;
                }
                if (((from_bitField0_ & 0x00000004) != 0)) {
                    result.high_ = high_;
                }
                if (((from_bitField0_ & 0x00000008) != 0)) {
                    result.low_ = low_;
                }
                if (((from_bitField0_ & 0x00000010) != 0)) {
                    result.close_ = close_;
                }
                if (((from_bitField0_ & 0x00000020) != 0)) {
                    result.volume_ = volume_;
                }
                if (((from_bitField0_ & 0x00000040) != 0)) {
                    result.ts_ = ts_;
                }
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
                if (other instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC) {
                    return mergeFrom((com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC other) {
                if (other == com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC.getDefaultInstance()) return this;
                if (!other.getInterval().isEmpty()) {
                    interval_ = other.interval_;
                    bitField0_ |= 0x00000001;
                    onChanged();
                }
                if (other.getOpen() != 0D) {
                    setOpen(other.getOpen());
                }
                if (other.getHigh() != 0D) {
                    setHigh(other.getHigh());
                }
                if (other.getLow() != 0D) {
                    setLow(other.getLow());
                }
                if (other.getClose() != 0D) {
                    setClose(other.getClose());
                }
                if (other.getVolume() != 0) {
                    setVolume(other.getVolume());
                }
                if (other.getTs() != 0L) {
                    setTs(other.getTs());
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
                            case 10: {
                                interval_ = input.readStringRequireUtf8();
                                bitField0_ |= 0x00000001;
                                break;
                            } // case 10
                            case 17: {
                                open_ = input.readDouble();
                                bitField0_ |= 0x00000002;
                                break;
                            } // case 17
                            case 25: {
                                high_ = input.readDouble();
                                bitField0_ |= 0x00000004;
                                break;
                            } // case 25
                            case 33: {
                                low_ = input.readDouble();
                                bitField0_ |= 0x00000008;
                                break;
                            } // case 33
                            case 41: {
                                close_ = input.readDouble();
                                bitField0_ |= 0x00000010;
                                break;
                            } // case 41
                            case 48: {
                                volume_ = input.readInt32();
                                bitField0_ |= 0x00000020;
                                break;
                            } // case 48
                            case 56: {
                                ts_ = input.readInt64();
                                bitField0_ |= 0x00000040;
                                break;
                            } // case 56
                            default: {
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

            private java.lang.Object interval_ = "";
            /**
             * <code>string interval = 1;</code>
             * @return The interval.
             */
            public java.lang.String getInterval() {
                java.lang.Object ref = interval_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    interval_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }
            /**
             * <code>string interval = 1;</code>
             * @return The bytes for interval.
             */
            public com.google.protobuf.ByteString
            getIntervalBytes() {
                java.lang.Object ref = interval_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    interval_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>string interval = 1;</code>
             * @param value The interval to set.
             * @return This builder for chaining.
             */
            public Builder setInterval(
                    java.lang.String value) {
                if (value == null) { throw new NullPointerException(); }
                interval_ = value;
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <code>string interval = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearInterval() {
                interval_ = getDefaultInstance().getInterval();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }
            /**
             * <code>string interval = 1;</code>
             * @param value The bytes for interval to set.
             * @return This builder for chaining.
             */
            public Builder setIntervalBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) { throw new NullPointerException(); }
                checkByteStringIsUtf8(value);
                interval_ = value;
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }

            private double open_ ;
            /**
             * <code>double open = 2;</code>
             * @return The open.
             */
            @java.lang.Override
            public double getOpen() {
                return open_;
            }
            /**
             * <code>double open = 2;</code>
             * @param value The open to set.
             * @return This builder for chaining.
             */
            public Builder setOpen(double value) {

                open_ = value;
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }
            /**
             * <code>double open = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearOpen() {
                bitField0_ = (bitField0_ & ~0x00000002);
                open_ = 0D;
                onChanged();
                return this;
            }

            private double high_ ;
            /**
             * <code>double high = 3;</code>
             * @return The high.
             */
            @java.lang.Override
            public double getHigh() {
                return high_;
            }
            /**
             * <code>double high = 3;</code>
             * @param value The high to set.
             * @return This builder for chaining.
             */
            public Builder setHigh(double value) {

                high_ = value;
                bitField0_ |= 0x00000004;
                onChanged();
                return this;
            }
            /**
             * <code>double high = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearHigh() {
                bitField0_ = (bitField0_ & ~0x00000004);
                high_ = 0D;
                onChanged();
                return this;
            }

            private double low_ ;
            /**
             * <code>double low = 4;</code>
             * @return The low.
             */
            @java.lang.Override
            public double getLow() {
                return low_;
            }
            /**
             * <code>double low = 4;</code>
             * @param value The low to set.
             * @return This builder for chaining.
             */
            public Builder setLow(double value) {

                low_ = value;
                bitField0_ |= 0x00000008;
                onChanged();
                return this;
            }
            /**
             * <code>double low = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearLow() {
                bitField0_ = (bitField0_ & ~0x00000008);
                low_ = 0D;
                onChanged();
                return this;
            }

            private double close_ ;
            /**
             * <code>double close = 5;</code>
             * @return The close.
             */
            @java.lang.Override
            public double getClose() {
                return close_;
            }
            /**
             * <code>double close = 5;</code>
             * @param value The close to set.
             * @return This builder for chaining.
             */
            public Builder setClose(double value) {

                close_ = value;
                bitField0_ |= 0x00000010;
                onChanged();
                return this;
            }
            /**
             * <code>double close = 5;</code>
             * @return This builder for chaining.
             */
            public Builder clearClose() {
                bitField0_ = (bitField0_ & ~0x00000010);
                close_ = 0D;
                onChanged();
                return this;
            }

            private int volume_ ;
            /**
             * <code>int32 volume = 6;</code>
             * @return The volume.
             */
            @java.lang.Override
            public int getVolume() {
                return volume_;
            }
            /**
             * <code>int32 volume = 6;</code>
             * @param value The volume to set.
             * @return This builder for chaining.
             */
            public Builder setVolume(int value) {

                volume_ = value;
                bitField0_ |= 0x00000020;
                onChanged();
                return this;
            }
            /**
             * <code>int32 volume = 6;</code>
             * @return This builder for chaining.
             */
            public Builder clearVolume() {
                bitField0_ = (bitField0_ & ~0x00000020);
                volume_ = 0;
                onChanged();
                return this;
            }

            private long ts_ ;
            /**
             * <code>int64 ts = 7;</code>
             * @return The ts.
             */
            @java.lang.Override
            public long getTs() {
                return ts_;
            }
            /**
             * <code>int64 ts = 7;</code>
             * @param value The ts to set.
             * @return This builder for chaining.
             */
            public Builder setTs(long value) {

                ts_ = value;
                bitField0_ |= 0x00000040;
                onChanged();
                return this;
            }
            /**
             * <code>int64 ts = 7;</code>
             * @return This builder for chaining.
             */
            public Builder clearTs() {
                bitField0_ = (bitField0_ & ~0x00000040);
                ts_ = 0L;
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


            // @@protoc_insertion_point(builder_scope:com.upstox.marketdatafeeder.rpc.proto.OHLC)
        }

        // @@protoc_insertion_point(class_scope:com.upstox.marketdatafeeder.rpc.proto.OHLC)
        private static final com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC();
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<OHLC>
                PARSER = new com.google.protobuf.AbstractParser<OHLC>() {
            @java.lang.Override
            public OHLC parsePartialFrom(
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

        public static com.google.protobuf.Parser<OHLC> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<OHLC> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.OHLC getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface MarketFullFeedOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return Whether the ltpc field is set.
         */
        boolean hasLtpc();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return The ltpc.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getLtpc();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder getLtpcOrBuilder();

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
         * @return Whether the marketLevel field is set.
         */
        boolean hasMarketLevel();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
         * @return The marketLevel.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel getMarketLevel();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevelOrBuilder getMarketLevelOrBuilder();

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
         * @return Whether the optionGreeks field is set.
         */
        boolean hasOptionGreeks();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
         * @return The optionGreeks.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks getOptionGreeks();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeksOrBuilder getOptionGreeksOrBuilder();

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
         * @return Whether the marketOHLC field is set.
         */
        boolean hasMarketOHLC();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
         * @return The marketOHLC.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC getMarketOHLC();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLCOrBuilder getMarketOHLCOrBuilder();

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
         * @return Whether the eFeedDetails field is set.
         */
        boolean hasEFeedDetails();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
         * @return The eFeedDetails.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails getEFeedDetails();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetailsOrBuilder getEFeedDetailsOrBuilder();
    }
    /**
     * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed}
     */
    public static final class MarketFullFeed extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed)
            MarketFullFeedOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use MarketFullFeed.newBuilder() to construct.
        private MarketFullFeed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private MarketFullFeed() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new MarketFullFeed();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketFullFeed_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketFullFeed_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.Builder.class);
        }

        private int bitField0_;
        public static final int LTPC_FIELD_NUMBER = 1;
        private com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC ltpc_;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return Whether the ltpc field is set.
         */
        @java.lang.Override
        public boolean hasLtpc() {
            return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return The ltpc.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getLtpc() {
            return ltpc_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance() : ltpc_;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder getLtpcOrBuilder() {
            return ltpc_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance() : ltpc_;
        }

        public static final int MARKETLEVEL_FIELD_NUMBER = 2;
        private com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel marketLevel_;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
         * @return Whether the marketLevel field is set.
         */
        @java.lang.Override
        public boolean hasMarketLevel() {
            return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
         * @return The marketLevel.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel getMarketLevel() {
            return marketLevel_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.getDefaultInstance() : marketLevel_;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevelOrBuilder getMarketLevelOrBuilder() {
            return marketLevel_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.getDefaultInstance() : marketLevel_;
        }

        public static final int OPTIONGREEKS_FIELD_NUMBER = 3;
        private com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks optionGreeks_;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
         * @return Whether the optionGreeks field is set.
         */
        @java.lang.Override
        public boolean hasOptionGreeks() {
            return ((bitField0_ & 0x00000004) != 0);
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
         * @return The optionGreeks.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks getOptionGreeks() {
            return optionGreeks_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.getDefaultInstance() : optionGreeks_;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeksOrBuilder getOptionGreeksOrBuilder() {
            return optionGreeks_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.getDefaultInstance() : optionGreeks_;
        }

        public static final int MARKETOHLC_FIELD_NUMBER = 4;
        private com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC marketOHLC_;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
         * @return Whether the marketOHLC field is set.
         */
        @java.lang.Override
        public boolean hasMarketOHLC() {
            return ((bitField0_ & 0x00000008) != 0);
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
         * @return The marketOHLC.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC getMarketOHLC() {
            return marketOHLC_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.getDefaultInstance() : marketOHLC_;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLCOrBuilder getMarketOHLCOrBuilder() {
            return marketOHLC_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.getDefaultInstance() : marketOHLC_;
        }

        public static final int EFEEDDETAILS_FIELD_NUMBER = 5;
        private com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails eFeedDetails_;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
         * @return Whether the eFeedDetails field is set.
         */
        @java.lang.Override
        public boolean hasEFeedDetails() {
            return ((bitField0_ & 0x00000010) != 0);
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
         * @return The eFeedDetails.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails getEFeedDetails() {
            return eFeedDetails_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.getDefaultInstance() : eFeedDetails_;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetailsOrBuilder getEFeedDetailsOrBuilder() {
            return eFeedDetails_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.getDefaultInstance() : eFeedDetails_;
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
            if (((bitField0_ & 0x00000001) != 0)) {
                output.writeMessage(1, getLtpc());
            }
            if (((bitField0_ & 0x00000002) != 0)) {
                output.writeMessage(2, getMarketLevel());
            }
            if (((bitField0_ & 0x00000004) != 0)) {
                output.writeMessage(3, getOptionGreeks());
            }
            if (((bitField0_ & 0x00000008) != 0)) {
                output.writeMessage(4, getMarketOHLC());
            }
            if (((bitField0_ & 0x00000010) != 0)) {
                output.writeMessage(5, getEFeedDetails());
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getLtpc());
            }
            if (((bitField0_ & 0x00000002) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getMarketLevel());
            }
            if (((bitField0_ & 0x00000004) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, getOptionGreeks());
            }
            if (((bitField0_ & 0x00000008) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(4, getMarketOHLC());
            }
            if (((bitField0_ & 0x00000010) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(5, getEFeedDetails());
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
            if (!(obj instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed)) {
                return super.equals(obj);
            }
            com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed other = (com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed) obj;

            if (hasLtpc() != other.hasLtpc()) return false;
            if (hasLtpc()) {
                if (!getLtpc()
                        .equals(other.getLtpc())) return false;
            }
            if (hasMarketLevel() != other.hasMarketLevel()) return false;
            if (hasMarketLevel()) {
                if (!getMarketLevel()
                        .equals(other.getMarketLevel())) return false;
            }
            if (hasOptionGreeks() != other.hasOptionGreeks()) return false;
            if (hasOptionGreeks()) {
                if (!getOptionGreeks()
                        .equals(other.getOptionGreeks())) return false;
            }
            if (hasMarketOHLC() != other.hasMarketOHLC()) return false;
            if (hasMarketOHLC()) {
                if (!getMarketOHLC()
                        .equals(other.getMarketOHLC())) return false;
            }
            if (hasEFeedDetails() != other.hasEFeedDetails()) return false;
            if (hasEFeedDetails()) {
                if (!getEFeedDetails()
                        .equals(other.getEFeedDetails())) return false;
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
            if (hasLtpc()) {
                hash = (37 * hash) + LTPC_FIELD_NUMBER;
                hash = (53 * hash) + getLtpc().hashCode();
            }
            if (hasMarketLevel()) {
                hash = (37 * hash) + MARKETLEVEL_FIELD_NUMBER;
                hash = (53 * hash) + getMarketLevel().hashCode();
            }
            if (hasOptionGreeks()) {
                hash = (37 * hash) + OPTIONGREEKS_FIELD_NUMBER;
                hash = (53 * hash) + getOptionGreeks().hashCode();
            }
            if (hasMarketOHLC()) {
                hash = (37 * hash) + MARKETOHLC_FIELD_NUMBER;
                hash = (53 * hash) + getMarketOHLC().hashCode();
            }
            if (hasEFeedDetails()) {
                hash = (37 * hash) + EFEEDDETAILS_FIELD_NUMBER;
                hash = (53 * hash) + getEFeedDetails().hashCode();
            }
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed parseFrom(
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
        public static Builder newBuilder(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed prototype) {
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
         * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed)
                com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeedOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketFullFeed_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketFullFeed_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.Builder.class);
            }

            // Construct using com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.newBuilder()
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
                    getLtpcFieldBuilder();
                    getMarketLevelFieldBuilder();
                    getOptionGreeksFieldBuilder();
                    getMarketOHLCFieldBuilder();
                    getEFeedDetailsFieldBuilder();
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                ltpc_ = null;
                if (ltpcBuilder_ != null) {
                    ltpcBuilder_.dispose();
                    ltpcBuilder_ = null;
                }
                marketLevel_ = null;
                if (marketLevelBuilder_ != null) {
                    marketLevelBuilder_.dispose();
                    marketLevelBuilder_ = null;
                }
                optionGreeks_ = null;
                if (optionGreeksBuilder_ != null) {
                    optionGreeksBuilder_.dispose();
                    optionGreeksBuilder_ = null;
                }
                marketOHLC_ = null;
                if (marketOHLCBuilder_ != null) {
                    marketOHLCBuilder_.dispose();
                    marketOHLCBuilder_ = null;
                }
                eFeedDetails_ = null;
                if (eFeedDetailsBuilder_ != null) {
                    eFeedDetailsBuilder_.dispose();
                    eFeedDetailsBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketFullFeed_descriptor;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed getDefaultInstanceForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.getDefaultInstance();
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed build() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed buildPartial() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed result = new com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed(this);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartial0(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed result) {
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.ltpc_ = ltpcBuilder_ == null
                            ? ltpc_
                            : ltpcBuilder_.build();
                    to_bitField0_ |= 0x00000001;
                }
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    result.marketLevel_ = marketLevelBuilder_ == null
                            ? marketLevel_
                            : marketLevelBuilder_.build();
                    to_bitField0_ |= 0x00000002;
                }
                if (((from_bitField0_ & 0x00000004) != 0)) {
                    result.optionGreeks_ = optionGreeksBuilder_ == null
                            ? optionGreeks_
                            : optionGreeksBuilder_.build();
                    to_bitField0_ |= 0x00000004;
                }
                if (((from_bitField0_ & 0x00000008) != 0)) {
                    result.marketOHLC_ = marketOHLCBuilder_ == null
                            ? marketOHLC_
                            : marketOHLCBuilder_.build();
                    to_bitField0_ |= 0x00000008;
                }
                if (((from_bitField0_ & 0x00000010) != 0)) {
                    result.eFeedDetails_ = eFeedDetailsBuilder_ == null
                            ? eFeedDetails_
                            : eFeedDetailsBuilder_.build();
                    to_bitField0_ |= 0x00000010;
                }
                result.bitField0_ |= to_bitField0_;
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
                if (other instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed) {
                    return mergeFrom((com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed other) {
                if (other == com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.getDefaultInstance()) return this;
                if (other.hasLtpc()) {
                    mergeLtpc(other.getLtpc());
                }
                if (other.hasMarketLevel()) {
                    mergeMarketLevel(other.getMarketLevel());
                }
                if (other.hasOptionGreeks()) {
                    mergeOptionGreeks(other.getOptionGreeks());
                }
                if (other.hasMarketOHLC()) {
                    mergeMarketOHLC(other.getMarketOHLC());
                }
                if (other.hasEFeedDetails()) {
                    mergeEFeedDetails(other.getEFeedDetails());
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
                            case 10: {
                                input.readMessage(
                                        getLtpcFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                bitField0_ |= 0x00000001;
                                break;
                            } // case 10
                            case 18: {
                                input.readMessage(
                                        getMarketLevelFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                bitField0_ |= 0x00000002;
                                break;
                            } // case 18
                            case 26: {
                                input.readMessage(
                                        getOptionGreeksFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                bitField0_ |= 0x00000004;
                                break;
                            } // case 26
                            case 34: {
                                input.readMessage(
                                        getMarketOHLCFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                bitField0_ |= 0x00000008;
                                break;
                            } // case 34
                            case 42: {
                                input.readMessage(
                                        getEFeedDetailsFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                bitField0_ |= 0x00000010;
                                break;
                            } // case 42
                            default: {
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

            private com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC ltpc_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder> ltpcBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             * @return Whether the ltpc field is set.
             */
            public boolean hasLtpc() {
                return ((bitField0_ & 0x00000001) != 0);
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             * @return The ltpc.
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getLtpc() {
                if (ltpcBuilder_ == null) {
                    return ltpc_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance() : ltpc_;
                } else {
                    return ltpcBuilder_.getMessage();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder setLtpc(com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC value) {
                if (ltpcBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ltpc_ = value;
                } else {
                    ltpcBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder setLtpc(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder builderForValue) {
                if (ltpcBuilder_ == null) {
                    ltpc_ = builderForValue.build();
                } else {
                    ltpcBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder mergeLtpc(com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC value) {
                if (ltpcBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0) &&
                            ltpc_ != null &&
                            ltpc_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance()) {
                        getLtpcBuilder().mergeFrom(value);
                    } else {
                        ltpc_ = value;
                    }
                } else {
                    ltpcBuilder_.mergeFrom(value);
                }
                if (ltpc_ != null) {
                    bitField0_ |= 0x00000001;
                    onChanged();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder clearLtpc() {
                bitField0_ = (bitField0_ & ~0x00000001);
                ltpc_ = null;
                if (ltpcBuilder_ != null) {
                    ltpcBuilder_.dispose();
                    ltpcBuilder_ = null;
                }
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder getLtpcBuilder() {
                bitField0_ |= 0x00000001;
                onChanged();
                return getLtpcFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder getLtpcOrBuilder() {
                if (ltpcBuilder_ != null) {
                    return ltpcBuilder_.getMessageOrBuilder();
                } else {
                    return ltpc_ == null ?
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance() : ltpc_;
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder>
            getLtpcFieldBuilder() {
                if (ltpcBuilder_ == null) {
                    ltpcBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder>(
                            getLtpc(),
                            getParentForChildren(),
                            isClean());
                    ltpc_ = null;
                }
                return ltpcBuilder_;
            }

            private com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel marketLevel_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevelOrBuilder> marketLevelBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
             * @return Whether the marketLevel field is set.
             */
            public boolean hasMarketLevel() {
                return ((bitField0_ & 0x00000002) != 0);
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
             * @return The marketLevel.
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel getMarketLevel() {
                if (marketLevelBuilder_ == null) {
                    return marketLevel_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.getDefaultInstance() : marketLevel_;
                } else {
                    return marketLevelBuilder_.getMessage();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
             */
            public Builder setMarketLevel(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel value) {
                if (marketLevelBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    marketLevel_ = value;
                } else {
                    marketLevelBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
             */
            public Builder setMarketLevel(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.Builder builderForValue) {
                if (marketLevelBuilder_ == null) {
                    marketLevel_ = builderForValue.build();
                } else {
                    marketLevelBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
             */
            public Builder mergeMarketLevel(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel value) {
                if (marketLevelBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) != 0) &&
                            marketLevel_ != null &&
                            marketLevel_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.getDefaultInstance()) {
                        getMarketLevelBuilder().mergeFrom(value);
                    } else {
                        marketLevel_ = value;
                    }
                } else {
                    marketLevelBuilder_.mergeFrom(value);
                }
                if (marketLevel_ != null) {
                    bitField0_ |= 0x00000002;
                    onChanged();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
             */
            public Builder clearMarketLevel() {
                bitField0_ = (bitField0_ & ~0x00000002);
                marketLevel_ = null;
                if (marketLevelBuilder_ != null) {
                    marketLevelBuilder_.dispose();
                    marketLevelBuilder_ = null;
                }
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.Builder getMarketLevelBuilder() {
                bitField0_ |= 0x00000002;
                onChanged();
                return getMarketLevelFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevelOrBuilder getMarketLevelOrBuilder() {
                if (marketLevelBuilder_ != null) {
                    return marketLevelBuilder_.getMessageOrBuilder();
                } else {
                    return marketLevel_ == null ?
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.getDefaultInstance() : marketLevel_;
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketLevel marketLevel = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevelOrBuilder>
            getMarketLevelFieldBuilder() {
                if (marketLevelBuilder_ == null) {
                    marketLevelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevel.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketLevelOrBuilder>(
                            getMarketLevel(),
                            getParentForChildren(),
                            isClean());
                    marketLevel_ = null;
                }
                return marketLevelBuilder_;
            }

            private com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks optionGreeks_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeksOrBuilder> optionGreeksBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             * @return Whether the optionGreeks field is set.
             */
            public boolean hasOptionGreeks() {
                return ((bitField0_ & 0x00000004) != 0);
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             * @return The optionGreeks.
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks getOptionGreeks() {
                if (optionGreeksBuilder_ == null) {
                    return optionGreeks_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.getDefaultInstance() : optionGreeks_;
                } else {
                    return optionGreeksBuilder_.getMessage();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            public Builder setOptionGreeks(com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks value) {
                if (optionGreeksBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    optionGreeks_ = value;
                } else {
                    optionGreeksBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000004;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            public Builder setOptionGreeks(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.Builder builderForValue) {
                if (optionGreeksBuilder_ == null) {
                    optionGreeks_ = builderForValue.build();
                } else {
                    optionGreeksBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000004;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            public Builder mergeOptionGreeks(com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks value) {
                if (optionGreeksBuilder_ == null) {
                    if (((bitField0_ & 0x00000004) != 0) &&
                            optionGreeks_ != null &&
                            optionGreeks_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.getDefaultInstance()) {
                        getOptionGreeksBuilder().mergeFrom(value);
                    } else {
                        optionGreeks_ = value;
                    }
                } else {
                    optionGreeksBuilder_.mergeFrom(value);
                }
                if (optionGreeks_ != null) {
                    bitField0_ |= 0x00000004;
                    onChanged();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            public Builder clearOptionGreeks() {
                bitField0_ = (bitField0_ & ~0x00000004);
                optionGreeks_ = null;
                if (optionGreeksBuilder_ != null) {
                    optionGreeksBuilder_.dispose();
                    optionGreeksBuilder_ = null;
                }
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.Builder getOptionGreeksBuilder() {
                bitField0_ |= 0x00000004;
                onChanged();
                return getOptionGreeksFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeksOrBuilder getOptionGreeksOrBuilder() {
                if (optionGreeksBuilder_ != null) {
                    return optionGreeksBuilder_.getMessageOrBuilder();
                } else {
                    return optionGreeks_ == null ?
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.getDefaultInstance() : optionGreeks_;
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeksOrBuilder>
            getOptionGreeksFieldBuilder() {
                if (optionGreeksBuilder_ == null) {
                    optionGreeksBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeksOrBuilder>(
                            getOptionGreeks(),
                            getParentForChildren(),
                            isClean());
                    optionGreeks_ = null;
                }
                return optionGreeksBuilder_;
            }

            private com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC marketOHLC_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLCOrBuilder> marketOHLCBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
             * @return Whether the marketOHLC field is set.
             */
            public boolean hasMarketOHLC() {
                return ((bitField0_ & 0x00000008) != 0);
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
             * @return The marketOHLC.
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC getMarketOHLC() {
                if (marketOHLCBuilder_ == null) {
                    return marketOHLC_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.getDefaultInstance() : marketOHLC_;
                } else {
                    return marketOHLCBuilder_.getMessage();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
             */
            public Builder setMarketOHLC(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC value) {
                if (marketOHLCBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    marketOHLC_ = value;
                } else {
                    marketOHLCBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000008;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
             */
            public Builder setMarketOHLC(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.Builder builderForValue) {
                if (marketOHLCBuilder_ == null) {
                    marketOHLC_ = builderForValue.build();
                } else {
                    marketOHLCBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000008;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
             */
            public Builder mergeMarketOHLC(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC value) {
                if (marketOHLCBuilder_ == null) {
                    if (((bitField0_ & 0x00000008) != 0) &&
                            marketOHLC_ != null &&
                            marketOHLC_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.getDefaultInstance()) {
                        getMarketOHLCBuilder().mergeFrom(value);
                    } else {
                        marketOHLC_ = value;
                    }
                } else {
                    marketOHLCBuilder_.mergeFrom(value);
                }
                if (marketOHLC_ != null) {
                    bitField0_ |= 0x00000008;
                    onChanged();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
             */
            public Builder clearMarketOHLC() {
                bitField0_ = (bitField0_ & ~0x00000008);
                marketOHLC_ = null;
                if (marketOHLCBuilder_ != null) {
                    marketOHLCBuilder_.dispose();
                    marketOHLCBuilder_ = null;
                }
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.Builder getMarketOHLCBuilder() {
                bitField0_ |= 0x00000008;
                onChanged();
                return getMarketOHLCFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLCOrBuilder getMarketOHLCOrBuilder() {
                if (marketOHLCBuilder_ != null) {
                    return marketOHLCBuilder_.getMessageOrBuilder();
                } else {
                    return marketOHLC_ == null ?
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.getDefaultInstance() : marketOHLC_;
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 4;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLCOrBuilder>
            getMarketOHLCFieldBuilder() {
                if (marketOHLCBuilder_ == null) {
                    marketOHLCBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLCOrBuilder>(
                            getMarketOHLC(),
                            getParentForChildren(),
                            isClean());
                    marketOHLC_ = null;
                }
                return marketOHLCBuilder_;
            }

            private com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails eFeedDetails_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetailsOrBuilder> eFeedDetailsBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
             * @return Whether the eFeedDetails field is set.
             */
            public boolean hasEFeedDetails() {
                return ((bitField0_ & 0x00000010) != 0);
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
             * @return The eFeedDetails.
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails getEFeedDetails() {
                if (eFeedDetailsBuilder_ == null) {
                    return eFeedDetails_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.getDefaultInstance() : eFeedDetails_;
                } else {
                    return eFeedDetailsBuilder_.getMessage();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
             */
            public Builder setEFeedDetails(com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails value) {
                if (eFeedDetailsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eFeedDetails_ = value;
                } else {
                    eFeedDetailsBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000010;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
             */
            public Builder setEFeedDetails(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.Builder builderForValue) {
                if (eFeedDetailsBuilder_ == null) {
                    eFeedDetails_ = builderForValue.build();
                } else {
                    eFeedDetailsBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000010;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
             */
            public Builder mergeEFeedDetails(com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails value) {
                if (eFeedDetailsBuilder_ == null) {
                    if (((bitField0_ & 0x00000010) != 0) &&
                            eFeedDetails_ != null &&
                            eFeedDetails_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.getDefaultInstance()) {
                        getEFeedDetailsBuilder().mergeFrom(value);
                    } else {
                        eFeedDetails_ = value;
                    }
                } else {
                    eFeedDetailsBuilder_.mergeFrom(value);
                }
                if (eFeedDetails_ != null) {
                    bitField0_ |= 0x00000010;
                    onChanged();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
             */
            public Builder clearEFeedDetails() {
                bitField0_ = (bitField0_ & ~0x00000010);
                eFeedDetails_ = null;
                if (eFeedDetailsBuilder_ != null) {
                    eFeedDetailsBuilder_.dispose();
                    eFeedDetailsBuilder_ = null;
                }
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.Builder getEFeedDetailsBuilder() {
                bitField0_ |= 0x00000010;
                onChanged();
                return getEFeedDetailsFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetailsOrBuilder getEFeedDetailsOrBuilder() {
                if (eFeedDetailsBuilder_ != null) {
                    return eFeedDetailsBuilder_.getMessageOrBuilder();
                } else {
                    return eFeedDetails_ == null ?
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.getDefaultInstance() : eFeedDetails_;
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 5;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetailsOrBuilder>
            getEFeedDetailsFieldBuilder() {
                if (eFeedDetailsBuilder_ == null) {
                    eFeedDetailsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetailsOrBuilder>(
                            getEFeedDetails(),
                            getParentForChildren(),
                            isClean());
                    eFeedDetails_ = null;
                }
                return eFeedDetailsBuilder_;
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


            // @@protoc_insertion_point(builder_scope:com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed)
        }

        // @@protoc_insertion_point(class_scope:com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed)
        private static final com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed();
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<MarketFullFeed>
                PARSER = new com.google.protobuf.AbstractParser<MarketFullFeed>() {
            @java.lang.Override
            public MarketFullFeed parsePartialFrom(
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

        public static com.google.protobuf.Parser<MarketFullFeed> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<MarketFullFeed> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface IndexFullFeedOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return Whether the ltpc field is set.
         */
        boolean hasLtpc();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return The ltpc.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getLtpc();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder getLtpcOrBuilder();

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
         * @return Whether the marketOHLC field is set.
         */
        boolean hasMarketOHLC();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
         * @return The marketOHLC.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC getMarketOHLC();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLCOrBuilder getMarketOHLCOrBuilder();

        /**
         * <code>double lastClose = 3;</code>
         * @return The lastClose.
         */
        double getLastClose();

        /**
         * <pre>
         *yearly high
         * </pre>
         *
         * <code>double yh = 4;</code>
         * @return The yh.
         */
        double getYh();

        /**
         * <pre>
         *yearly low
         * </pre>
         *
         * <code>double yl = 5;</code>
         * @return The yl.
         */
        double getYl();
    }
    /**
     * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed}
     */
    public static final class IndexFullFeed extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed)
            IndexFullFeedOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use IndexFullFeed.newBuilder() to construct.
        private IndexFullFeed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private IndexFullFeed() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new IndexFullFeed();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_IndexFullFeed_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_IndexFullFeed_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.Builder.class);
        }

        private int bitField0_;
        public static final int LTPC_FIELD_NUMBER = 1;
        private com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC ltpc_;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return Whether the ltpc field is set.
         */
        @java.lang.Override
        public boolean hasLtpc() {
            return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return The ltpc.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getLtpc() {
            return ltpc_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance() : ltpc_;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder getLtpcOrBuilder() {
            return ltpc_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance() : ltpc_;
        }

        public static final int MARKETOHLC_FIELD_NUMBER = 2;
        private com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC marketOHLC_;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
         * @return Whether the marketOHLC field is set.
         */
        @java.lang.Override
        public boolean hasMarketOHLC() {
            return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
         * @return The marketOHLC.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC getMarketOHLC() {
            return marketOHLC_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.getDefaultInstance() : marketOHLC_;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLCOrBuilder getMarketOHLCOrBuilder() {
            return marketOHLC_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.getDefaultInstance() : marketOHLC_;
        }

        public static final int LASTCLOSE_FIELD_NUMBER = 3;
        private double lastClose_ = 0D;
        /**
         * <code>double lastClose = 3;</code>
         * @return The lastClose.
         */
        @java.lang.Override
        public double getLastClose() {
            return lastClose_;
        }

        public static final int YH_FIELD_NUMBER = 4;
        private double yh_ = 0D;
        /**
         * <pre>
         *yearly high
         * </pre>
         *
         * <code>double yh = 4;</code>
         * @return The yh.
         */
        @java.lang.Override
        public double getYh() {
            return yh_;
        }

        public static final int YL_FIELD_NUMBER = 5;
        private double yl_ = 0D;
        /**
         * <pre>
         *yearly low
         * </pre>
         *
         * <code>double yl = 5;</code>
         * @return The yl.
         */
        @java.lang.Override
        public double getYl() {
            return yl_;
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
            if (((bitField0_ & 0x00000001) != 0)) {
                output.writeMessage(1, getLtpc());
            }
            if (((bitField0_ & 0x00000002) != 0)) {
                output.writeMessage(2, getMarketOHLC());
            }
            if (java.lang.Double.doubleToRawLongBits(lastClose_) != 0) {
                output.writeDouble(3, lastClose_);
            }
            if (java.lang.Double.doubleToRawLongBits(yh_) != 0) {
                output.writeDouble(4, yh_);
            }
            if (java.lang.Double.doubleToRawLongBits(yl_) != 0) {
                output.writeDouble(5, yl_);
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getLtpc());
            }
            if (((bitField0_ & 0x00000002) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getMarketOHLC());
            }
            if (java.lang.Double.doubleToRawLongBits(lastClose_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(3, lastClose_);
            }
            if (java.lang.Double.doubleToRawLongBits(yh_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(4, yh_);
            }
            if (java.lang.Double.doubleToRawLongBits(yl_) != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeDoubleSize(5, yl_);
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
            if (!(obj instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed)) {
                return super.equals(obj);
            }
            com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed other = (com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed) obj;

            if (hasLtpc() != other.hasLtpc()) return false;
            if (hasLtpc()) {
                if (!getLtpc()
                        .equals(other.getLtpc())) return false;
            }
            if (hasMarketOHLC() != other.hasMarketOHLC()) return false;
            if (hasMarketOHLC()) {
                if (!getMarketOHLC()
                        .equals(other.getMarketOHLC())) return false;
            }
            if (java.lang.Double.doubleToLongBits(getLastClose())
                    != java.lang.Double.doubleToLongBits(
                    other.getLastClose())) return false;
            if (java.lang.Double.doubleToLongBits(getYh())
                    != java.lang.Double.doubleToLongBits(
                    other.getYh())) return false;
            if (java.lang.Double.doubleToLongBits(getYl())
                    != java.lang.Double.doubleToLongBits(
                    other.getYl())) return false;
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
            if (hasLtpc()) {
                hash = (37 * hash) + LTPC_FIELD_NUMBER;
                hash = (53 * hash) + getLtpc().hashCode();
            }
            if (hasMarketOHLC()) {
                hash = (37 * hash) + MARKETOHLC_FIELD_NUMBER;
                hash = (53 * hash) + getMarketOHLC().hashCode();
            }
            hash = (37 * hash) + LASTCLOSE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getLastClose()));
            hash = (37 * hash) + YH_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getYh()));
            hash = (37 * hash) + YL_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                    java.lang.Double.doubleToLongBits(getYl()));
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed parseFrom(
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
        public static Builder newBuilder(com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed prototype) {
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
         * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed)
                com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeedOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_IndexFullFeed_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_IndexFullFeed_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.Builder.class);
            }

            // Construct using com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.newBuilder()
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
                    getLtpcFieldBuilder();
                    getMarketOHLCFieldBuilder();
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                ltpc_ = null;
                if (ltpcBuilder_ != null) {
                    ltpcBuilder_.dispose();
                    ltpcBuilder_ = null;
                }
                marketOHLC_ = null;
                if (marketOHLCBuilder_ != null) {
                    marketOHLCBuilder_.dispose();
                    marketOHLCBuilder_ = null;
                }
                lastClose_ = 0D;
                yh_ = 0D;
                yl_ = 0D;
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_IndexFullFeed_descriptor;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed getDefaultInstanceForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.getDefaultInstance();
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed build() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed buildPartial() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed result = new com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed(this);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartial0(com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed result) {
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.ltpc_ = ltpcBuilder_ == null
                            ? ltpc_
                            : ltpcBuilder_.build();
                    to_bitField0_ |= 0x00000001;
                }
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    result.marketOHLC_ = marketOHLCBuilder_ == null
                            ? marketOHLC_
                            : marketOHLCBuilder_.build();
                    to_bitField0_ |= 0x00000002;
                }
                if (((from_bitField0_ & 0x00000004) != 0)) {
                    result.lastClose_ = lastClose_;
                }
                if (((from_bitField0_ & 0x00000008) != 0)) {
                    result.yh_ = yh_;
                }
                if (((from_bitField0_ & 0x00000010) != 0)) {
                    result.yl_ = yl_;
                }
                result.bitField0_ |= to_bitField0_;
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
                if (other instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed) {
                    return mergeFrom((com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed other) {
                if (other == com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.getDefaultInstance()) return this;
                if (other.hasLtpc()) {
                    mergeLtpc(other.getLtpc());
                }
                if (other.hasMarketOHLC()) {
                    mergeMarketOHLC(other.getMarketOHLC());
                }
                if (other.getLastClose() != 0D) {
                    setLastClose(other.getLastClose());
                }
                if (other.getYh() != 0D) {
                    setYh(other.getYh());
                }
                if (other.getYl() != 0D) {
                    setYl(other.getYl());
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
                            case 10: {
                                input.readMessage(
                                        getLtpcFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                bitField0_ |= 0x00000001;
                                break;
                            } // case 10
                            case 18: {
                                input.readMessage(
                                        getMarketOHLCFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                bitField0_ |= 0x00000002;
                                break;
                            } // case 18
                            case 25: {
                                lastClose_ = input.readDouble();
                                bitField0_ |= 0x00000004;
                                break;
                            } // case 25
                            case 33: {
                                yh_ = input.readDouble();
                                bitField0_ |= 0x00000008;
                                break;
                            } // case 33
                            case 41: {
                                yl_ = input.readDouble();
                                bitField0_ |= 0x00000010;
                                break;
                            } // case 41
                            default: {
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

            private com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC ltpc_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder> ltpcBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             * @return Whether the ltpc field is set.
             */
            public boolean hasLtpc() {
                return ((bitField0_ & 0x00000001) != 0);
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             * @return The ltpc.
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getLtpc() {
                if (ltpcBuilder_ == null) {
                    return ltpc_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance() : ltpc_;
                } else {
                    return ltpcBuilder_.getMessage();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder setLtpc(com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC value) {
                if (ltpcBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ltpc_ = value;
                } else {
                    ltpcBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder setLtpc(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder builderForValue) {
                if (ltpcBuilder_ == null) {
                    ltpc_ = builderForValue.build();
                } else {
                    ltpcBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder mergeLtpc(com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC value) {
                if (ltpcBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0) &&
                            ltpc_ != null &&
                            ltpc_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance()) {
                        getLtpcBuilder().mergeFrom(value);
                    } else {
                        ltpc_ = value;
                    }
                } else {
                    ltpcBuilder_.mergeFrom(value);
                }
                if (ltpc_ != null) {
                    bitField0_ |= 0x00000001;
                    onChanged();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder clearLtpc() {
                bitField0_ = (bitField0_ & ~0x00000001);
                ltpc_ = null;
                if (ltpcBuilder_ != null) {
                    ltpcBuilder_.dispose();
                    ltpcBuilder_ = null;
                }
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder getLtpcBuilder() {
                bitField0_ |= 0x00000001;
                onChanged();
                return getLtpcFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder getLtpcOrBuilder() {
                if (ltpcBuilder_ != null) {
                    return ltpcBuilder_.getMessageOrBuilder();
                } else {
                    return ltpc_ == null ?
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance() : ltpc_;
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder>
            getLtpcFieldBuilder() {
                if (ltpcBuilder_ == null) {
                    ltpcBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder>(
                            getLtpc(),
                            getParentForChildren(),
                            isClean());
                    ltpc_ = null;
                }
                return ltpcBuilder_;
            }

            private com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC marketOHLC_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLCOrBuilder> marketOHLCBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
             * @return Whether the marketOHLC field is set.
             */
            public boolean hasMarketOHLC() {
                return ((bitField0_ & 0x00000002) != 0);
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
             * @return The marketOHLC.
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC getMarketOHLC() {
                if (marketOHLCBuilder_ == null) {
                    return marketOHLC_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.getDefaultInstance() : marketOHLC_;
                } else {
                    return marketOHLCBuilder_.getMessage();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
             */
            public Builder setMarketOHLC(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC value) {
                if (marketOHLCBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    marketOHLC_ = value;
                } else {
                    marketOHLCBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
             */
            public Builder setMarketOHLC(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.Builder builderForValue) {
                if (marketOHLCBuilder_ == null) {
                    marketOHLC_ = builderForValue.build();
                } else {
                    marketOHLCBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
             */
            public Builder mergeMarketOHLC(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC value) {
                if (marketOHLCBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) != 0) &&
                            marketOHLC_ != null &&
                            marketOHLC_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.getDefaultInstance()) {
                        getMarketOHLCBuilder().mergeFrom(value);
                    } else {
                        marketOHLC_ = value;
                    }
                } else {
                    marketOHLCBuilder_.mergeFrom(value);
                }
                if (marketOHLC_ != null) {
                    bitField0_ |= 0x00000002;
                    onChanged();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
             */
            public Builder clearMarketOHLC() {
                bitField0_ = (bitField0_ & ~0x00000002);
                marketOHLC_ = null;
                if (marketOHLCBuilder_ != null) {
                    marketOHLCBuilder_.dispose();
                    marketOHLCBuilder_ = null;
                }
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.Builder getMarketOHLCBuilder() {
                bitField0_ |= 0x00000002;
                onChanged();
                return getMarketOHLCFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLCOrBuilder getMarketOHLCOrBuilder() {
                if (marketOHLCBuilder_ != null) {
                    return marketOHLCBuilder_.getMessageOrBuilder();
                } else {
                    return marketOHLC_ == null ?
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.getDefaultInstance() : marketOHLC_;
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketOHLC marketOHLC = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLCOrBuilder>
            getMarketOHLCFieldBuilder() {
                if (marketOHLCBuilder_ == null) {
                    marketOHLCBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketOHLCOrBuilder>(
                            getMarketOHLC(),
                            getParentForChildren(),
                            isClean());
                    marketOHLC_ = null;
                }
                return marketOHLCBuilder_;
            }

            private double lastClose_ ;
            /**
             * <code>double lastClose = 3;</code>
             * @return The lastClose.
             */
            @java.lang.Override
            public double getLastClose() {
                return lastClose_;
            }
            /**
             * <code>double lastClose = 3;</code>
             * @param value The lastClose to set.
             * @return This builder for chaining.
             */
            public Builder setLastClose(double value) {

                lastClose_ = value;
                bitField0_ |= 0x00000004;
                onChanged();
                return this;
            }
            /**
             * <code>double lastClose = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearLastClose() {
                bitField0_ = (bitField0_ & ~0x00000004);
                lastClose_ = 0D;
                onChanged();
                return this;
            }

            private double yh_ ;
            /**
             * <pre>
             *yearly high
             * </pre>
             *
             * <code>double yh = 4;</code>
             * @return The yh.
             */
            @java.lang.Override
            public double getYh() {
                return yh_;
            }
            /**
             * <pre>
             *yearly high
             * </pre>
             *
             * <code>double yh = 4;</code>
             * @param value The yh to set.
             * @return This builder for chaining.
             */
            public Builder setYh(double value) {

                yh_ = value;
                bitField0_ |= 0x00000008;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *yearly high
             * </pre>
             *
             * <code>double yh = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearYh() {
                bitField0_ = (bitField0_ & ~0x00000008);
                yh_ = 0D;
                onChanged();
                return this;
            }

            private double yl_ ;
            /**
             * <pre>
             *yearly low
             * </pre>
             *
             * <code>double yl = 5;</code>
             * @return The yl.
             */
            @java.lang.Override
            public double getYl() {
                return yl_;
            }
            /**
             * <pre>
             *yearly low
             * </pre>
             *
             * <code>double yl = 5;</code>
             * @param value The yl to set.
             * @return This builder for chaining.
             */
            public Builder setYl(double value) {

                yl_ = value;
                bitField0_ |= 0x00000010;
                onChanged();
                return this;
            }
            /**
             * <pre>
             *yearly low
             * </pre>
             *
             * <code>double yl = 5;</code>
             * @return This builder for chaining.
             */
            public Builder clearYl() {
                bitField0_ = (bitField0_ & ~0x00000010);
                yl_ = 0D;
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


            // @@protoc_insertion_point(builder_scope:com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed)
        }

        // @@protoc_insertion_point(class_scope:com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed)
        private static final com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed();
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<IndexFullFeed>
                PARSER = new com.google.protobuf.AbstractParser<IndexFullFeed>() {
            @java.lang.Override
            public IndexFullFeed parsePartialFrom(
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

        public static com.google.protobuf.Parser<IndexFullFeed> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<IndexFullFeed> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface FullFeedOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.upstox.marketdatafeeder.rpc.proto.FullFeed)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
         * @return Whether the marketFF field is set.
         */
        boolean hasMarketFF();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
         * @return The marketFF.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed getMarketFF();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeedOrBuilder getMarketFFOrBuilder();

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
         * @return Whether the indexFF field is set.
         */
        boolean hasIndexFF();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
         * @return The indexFF.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed getIndexFF();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeedOrBuilder getIndexFFOrBuilder();

        com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.FullFeedUnionCase getFullFeedUnionCase();
    }
    /**
     * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.FullFeed}
     */
    public static final class FullFeed extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.upstox.marketdatafeeder.rpc.proto.FullFeed)
            FullFeedOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use FullFeed.newBuilder() to construct.
        private FullFeed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private FullFeed() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new FullFeed();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_FullFeed_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_FullFeed_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.Builder.class);
        }

        private int fullFeedUnionCase_ = 0;
        @SuppressWarnings("serial")
        private java.lang.Object fullFeedUnion_;
        public enum FullFeedUnionCase
                implements com.google.protobuf.Internal.EnumLite,
                com.google.protobuf.AbstractMessage.InternalOneOfEnum {
            MARKETFF(1),
            INDEXFF(2),
            FULLFEEDUNION_NOT_SET(0);
            private final int value;
            private FullFeedUnionCase(int value) {
                this.value = value;
            }
            /**
             * @param value The number of the enum to look for.
             * @return The enum associated with the given number.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static FullFeedUnionCase valueOf(int value) {
                return forNumber(value);
            }

            public static FullFeedUnionCase forNumber(int value) {
                switch (value) {
                    case 1: return MARKETFF;
                    case 2: return INDEXFF;
                    case 0: return FULLFEEDUNION_NOT_SET;
                    default: return null;
                }
            }
            public int getNumber() {
                return this.value;
            }
        };

        public FullFeedUnionCase
        getFullFeedUnionCase() {
            return FullFeedUnionCase.forNumber(
                    fullFeedUnionCase_);
        }

        public static final int MARKETFF_FIELD_NUMBER = 1;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
         * @return Whether the marketFF field is set.
         */
        @java.lang.Override
        public boolean hasMarketFF() {
            return fullFeedUnionCase_ == 1;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
         * @return The marketFF.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed getMarketFF() {
            if (fullFeedUnionCase_ == 1) {
                return (com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed) fullFeedUnion_;
            }
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.getDefaultInstance();
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeedOrBuilder getMarketFFOrBuilder() {
            if (fullFeedUnionCase_ == 1) {
                return (com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed) fullFeedUnion_;
            }
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.getDefaultInstance();
        }

        public static final int INDEXFF_FIELD_NUMBER = 2;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
         * @return Whether the indexFF field is set.
         */
        @java.lang.Override
        public boolean hasIndexFF() {
            return fullFeedUnionCase_ == 2;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
         * @return The indexFF.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed getIndexFF() {
            if (fullFeedUnionCase_ == 2) {
                return (com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed) fullFeedUnion_;
            }
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.getDefaultInstance();
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeedOrBuilder getIndexFFOrBuilder() {
            if (fullFeedUnionCase_ == 2) {
                return (com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed) fullFeedUnion_;
            }
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.getDefaultInstance();
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
            if (fullFeedUnionCase_ == 1) {
                output.writeMessage(1, (com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed) fullFeedUnion_);
            }
            if (fullFeedUnionCase_ == 2) {
                output.writeMessage(2, (com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed) fullFeedUnion_);
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (fullFeedUnionCase_ == 1) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, (com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed) fullFeedUnion_);
            }
            if (fullFeedUnionCase_ == 2) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, (com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed) fullFeedUnion_);
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
            if (!(obj instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed)) {
                return super.equals(obj);
            }
            com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed other = (com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed) obj;

            if (!getFullFeedUnionCase().equals(other.getFullFeedUnionCase())) return false;
            switch (fullFeedUnionCase_) {
                case 1:
                    if (!getMarketFF()
                            .equals(other.getMarketFF())) return false;
                    break;
                case 2:
                    if (!getIndexFF()
                            .equals(other.getIndexFF())) return false;
                    break;
                case 0:
                default:
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
            switch (fullFeedUnionCase_) {
                case 1:
                    hash = (37 * hash) + MARKETFF_FIELD_NUMBER;
                    hash = (53 * hash) + getMarketFF().hashCode();
                    break;
                case 2:
                    hash = (37 * hash) + INDEXFF_FIELD_NUMBER;
                    hash = (53 * hash) + getIndexFF().hashCode();
                    break;
                case 0:
                default:
            }
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed parseFrom(
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
        public static Builder newBuilder(com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed prototype) {
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
         * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.FullFeed}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.upstox.marketdatafeeder.rpc.proto.FullFeed)
                com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeedOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_FullFeed_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_FullFeed_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.Builder.class);
            }

            // Construct using com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.newBuilder()
            private Builder() {

            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);

            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                if (marketFFBuilder_ != null) {
                    marketFFBuilder_.clear();
                }
                if (indexFFBuilder_ != null) {
                    indexFFBuilder_.clear();
                }
                fullFeedUnionCase_ = 0;
                fullFeedUnion_ = null;
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_FullFeed_descriptor;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed getDefaultInstanceForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.getDefaultInstance();
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed build() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed buildPartial() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed result = new com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed(this);
                if (bitField0_ != 0) { buildPartial0(result); }
                buildPartialOneofs(result);
                onBuilt();
                return result;
            }

            private void buildPartial0(com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed result) {
                int from_bitField0_ = bitField0_;
            }

            private void buildPartialOneofs(com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed result) {
                result.fullFeedUnionCase_ = fullFeedUnionCase_;
                result.fullFeedUnion_ = this.fullFeedUnion_;
                if (fullFeedUnionCase_ == 1 &&
                        marketFFBuilder_ != null) {
                    result.fullFeedUnion_ = marketFFBuilder_.build();
                }
                if (fullFeedUnionCase_ == 2 &&
                        indexFFBuilder_ != null) {
                    result.fullFeedUnion_ = indexFFBuilder_.build();
                }
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
                if (other instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed) {
                    return mergeFrom((com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed other) {
                if (other == com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.getDefaultInstance()) return this;
                switch (other.getFullFeedUnionCase()) {
                    case MARKETFF: {
                        mergeMarketFF(other.getMarketFF());
                        break;
                    }
                    case INDEXFF: {
                        mergeIndexFF(other.getIndexFF());
                        break;
                    }
                    case FULLFEEDUNION_NOT_SET: {
                        break;
                    }
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
                            case 10: {
                                input.readMessage(
                                        getMarketFFFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                fullFeedUnionCase_ = 1;
                                break;
                            } // case 10
                            case 18: {
                                input.readMessage(
                                        getIndexFFFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                fullFeedUnionCase_ = 2;
                                break;
                            } // case 18
                            default: {
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
            private int fullFeedUnionCase_ = 0;
            private java.lang.Object fullFeedUnion_;
            public FullFeedUnionCase
            getFullFeedUnionCase() {
                return FullFeedUnionCase.forNumber(
                        fullFeedUnionCase_);
            }

            public Builder clearFullFeedUnion() {
                fullFeedUnionCase_ = 0;
                fullFeedUnion_ = null;
                onChanged();
                return this;
            }

            private int bitField0_;

            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeedOrBuilder> marketFFBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
             * @return Whether the marketFF field is set.
             */
            @java.lang.Override
            public boolean hasMarketFF() {
                return fullFeedUnionCase_ == 1;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
             * @return The marketFF.
             */
            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed getMarketFF() {
                if (marketFFBuilder_ == null) {
                    if (fullFeedUnionCase_ == 1) {
                        return (com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed) fullFeedUnion_;
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.getDefaultInstance();
                } else {
                    if (fullFeedUnionCase_ == 1) {
                        return marketFFBuilder_.getMessage();
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.getDefaultInstance();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
             */
            public Builder setMarketFF(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed value) {
                if (marketFFBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    fullFeedUnion_ = value;
                    onChanged();
                } else {
                    marketFFBuilder_.setMessage(value);
                }
                fullFeedUnionCase_ = 1;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
             */
            public Builder setMarketFF(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.Builder builderForValue) {
                if (marketFFBuilder_ == null) {
                    fullFeedUnion_ = builderForValue.build();
                    onChanged();
                } else {
                    marketFFBuilder_.setMessage(builderForValue.build());
                }
                fullFeedUnionCase_ = 1;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
             */
            public Builder mergeMarketFF(com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed value) {
                if (marketFFBuilder_ == null) {
                    if (fullFeedUnionCase_ == 1 &&
                            fullFeedUnion_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.getDefaultInstance()) {
                        fullFeedUnion_ = com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.newBuilder((com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed) fullFeedUnion_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        fullFeedUnion_ = value;
                    }
                    onChanged();
                } else {
                    if (fullFeedUnionCase_ == 1) {
                        marketFFBuilder_.mergeFrom(value);
                    } else {
                        marketFFBuilder_.setMessage(value);
                    }
                }
                fullFeedUnionCase_ = 1;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
             */
            public Builder clearMarketFF() {
                if (marketFFBuilder_ == null) {
                    if (fullFeedUnionCase_ == 1) {
                        fullFeedUnionCase_ = 0;
                        fullFeedUnion_ = null;
                        onChanged();
                    }
                } else {
                    if (fullFeedUnionCase_ == 1) {
                        fullFeedUnionCase_ = 0;
                        fullFeedUnion_ = null;
                    }
                    marketFFBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.Builder getMarketFFBuilder() {
                return getMarketFFFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
             */
            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeedOrBuilder getMarketFFOrBuilder() {
                if ((fullFeedUnionCase_ == 1) && (marketFFBuilder_ != null)) {
                    return marketFFBuilder_.getMessageOrBuilder();
                } else {
                    if (fullFeedUnionCase_ == 1) {
                        return (com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed) fullFeedUnion_;
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.getDefaultInstance();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.MarketFullFeed marketFF = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeedOrBuilder>
            getMarketFFFieldBuilder() {
                if (marketFFBuilder_ == null) {
                    if (!(fullFeedUnionCase_ == 1)) {
                        fullFeedUnion_ = com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.getDefaultInstance();
                    }
                    marketFFBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeedOrBuilder>(
                            (com.upstox.marketdatafeeder.rpc.proto.Upstox.MarketFullFeed) fullFeedUnion_,
                            getParentForChildren(),
                            isClean());
                    fullFeedUnion_ = null;
                }
                fullFeedUnionCase_ = 1;
                onChanged();
                return marketFFBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed, com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeedOrBuilder> indexFFBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
             * @return Whether the indexFF field is set.
             */
            @java.lang.Override
            public boolean hasIndexFF() {
                return fullFeedUnionCase_ == 2;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
             * @return The indexFF.
             */
            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed getIndexFF() {
                if (indexFFBuilder_ == null) {
                    if (fullFeedUnionCase_ == 2) {
                        return (com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed) fullFeedUnion_;
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.getDefaultInstance();
                } else {
                    if (fullFeedUnionCase_ == 2) {
                        return indexFFBuilder_.getMessage();
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.getDefaultInstance();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
             */
            public Builder setIndexFF(com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed value) {
                if (indexFFBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    fullFeedUnion_ = value;
                    onChanged();
                } else {
                    indexFFBuilder_.setMessage(value);
                }
                fullFeedUnionCase_ = 2;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
             */
            public Builder setIndexFF(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.Builder builderForValue) {
                if (indexFFBuilder_ == null) {
                    fullFeedUnion_ = builderForValue.build();
                    onChanged();
                } else {
                    indexFFBuilder_.setMessage(builderForValue.build());
                }
                fullFeedUnionCase_ = 2;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
             */
            public Builder mergeIndexFF(com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed value) {
                if (indexFFBuilder_ == null) {
                    if (fullFeedUnionCase_ == 2 &&
                            fullFeedUnion_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.getDefaultInstance()) {
                        fullFeedUnion_ = com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.newBuilder((com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed) fullFeedUnion_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        fullFeedUnion_ = value;
                    }
                    onChanged();
                } else {
                    if (fullFeedUnionCase_ == 2) {
                        indexFFBuilder_.mergeFrom(value);
                    } else {
                        indexFFBuilder_.setMessage(value);
                    }
                }
                fullFeedUnionCase_ = 2;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
             */
            public Builder clearIndexFF() {
                if (indexFFBuilder_ == null) {
                    if (fullFeedUnionCase_ == 2) {
                        fullFeedUnionCase_ = 0;
                        fullFeedUnion_ = null;
                        onChanged();
                    }
                } else {
                    if (fullFeedUnionCase_ == 2) {
                        fullFeedUnionCase_ = 0;
                        fullFeedUnion_ = null;
                    }
                    indexFFBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.Builder getIndexFFBuilder() {
                return getIndexFFFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
             */
            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeedOrBuilder getIndexFFOrBuilder() {
                if ((fullFeedUnionCase_ == 2) && (indexFFBuilder_ != null)) {
                    return indexFFBuilder_.getMessageOrBuilder();
                } else {
                    if (fullFeedUnionCase_ == 2) {
                        return (com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed) fullFeedUnion_;
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.getDefaultInstance();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.IndexFullFeed indexFF = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed, com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeedOrBuilder>
            getIndexFFFieldBuilder() {
                if (indexFFBuilder_ == null) {
                    if (!(fullFeedUnionCase_ == 2)) {
                        fullFeedUnion_ = com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.getDefaultInstance();
                    }
                    indexFFBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed, com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeedOrBuilder>(
                            (com.upstox.marketdatafeeder.rpc.proto.Upstox.IndexFullFeed) fullFeedUnion_,
                            getParentForChildren(),
                            isClean());
                    fullFeedUnion_ = null;
                }
                fullFeedUnionCase_ = 2;
                onChanged();
                return indexFFBuilder_;
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


            // @@protoc_insertion_point(builder_scope:com.upstox.marketdatafeeder.rpc.proto.FullFeed)
        }

        // @@protoc_insertion_point(class_scope:com.upstox.marketdatafeeder.rpc.proto.FullFeed)
        private static final com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed();
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<FullFeed>
                PARSER = new com.google.protobuf.AbstractParser<FullFeed>() {
            @java.lang.Override
            public FullFeed parsePartialFrom(
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

        public static com.google.protobuf.Parser<FullFeed> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<FullFeed> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface OptionChainOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.upstox.marketdatafeeder.rpc.proto.OptionChain)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return Whether the ltpc field is set.
         */
        boolean hasLtpc();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return The ltpc.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getLtpc();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder getLtpcOrBuilder();

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
         * @return Whether the bidAskQuote field is set.
         */
        boolean hasBidAskQuote();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
         * @return The bidAskQuote.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote getBidAskQuote();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder getBidAskQuoteOrBuilder();

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
         * @return Whether the optionGreeks field is set.
         */
        boolean hasOptionGreeks();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
         * @return The optionGreeks.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks getOptionGreeks();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeksOrBuilder getOptionGreeksOrBuilder();

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
         * @return Whether the eFeedDetails field is set.
         */
        boolean hasEFeedDetails();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
         * @return The eFeedDetails.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails getEFeedDetails();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetailsOrBuilder getEFeedDetailsOrBuilder();
    }
    /**
     * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.OptionChain}
     */
    public static final class OptionChain extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.upstox.marketdatafeeder.rpc.proto.OptionChain)
            OptionChainOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use OptionChain.newBuilder() to construct.
        private OptionChain(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private OptionChain() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new OptionChain();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionChain_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionChain_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.Builder.class);
        }

        private int bitField0_;
        public static final int LTPC_FIELD_NUMBER = 1;
        private com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC ltpc_;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return Whether the ltpc field is set.
         */
        @java.lang.Override
        public boolean hasLtpc() {
            return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return The ltpc.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getLtpc() {
            return ltpc_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance() : ltpc_;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder getLtpcOrBuilder() {
            return ltpc_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance() : ltpc_;
        }

        public static final int BIDASKQUOTE_FIELD_NUMBER = 2;
        private com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote bidAskQuote_;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
         * @return Whether the bidAskQuote field is set.
         */
        @java.lang.Override
        public boolean hasBidAskQuote() {
            return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
         * @return The bidAskQuote.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote getBidAskQuote() {
            return bidAskQuote_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.getDefaultInstance() : bidAskQuote_;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder getBidAskQuoteOrBuilder() {
            return bidAskQuote_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.getDefaultInstance() : bidAskQuote_;
        }

        public static final int OPTIONGREEKS_FIELD_NUMBER = 3;
        private com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks optionGreeks_;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
         * @return Whether the optionGreeks field is set.
         */
        @java.lang.Override
        public boolean hasOptionGreeks() {
            return ((bitField0_ & 0x00000004) != 0);
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
         * @return The optionGreeks.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks getOptionGreeks() {
            return optionGreeks_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.getDefaultInstance() : optionGreeks_;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeksOrBuilder getOptionGreeksOrBuilder() {
            return optionGreeks_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.getDefaultInstance() : optionGreeks_;
        }

        public static final int EFEEDDETAILS_FIELD_NUMBER = 4;
        private com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails eFeedDetails_;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
         * @return Whether the eFeedDetails field is set.
         */
        @java.lang.Override
        public boolean hasEFeedDetails() {
            return ((bitField0_ & 0x00000008) != 0);
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
         * @return The eFeedDetails.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails getEFeedDetails() {
            return eFeedDetails_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.getDefaultInstance() : eFeedDetails_;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetailsOrBuilder getEFeedDetailsOrBuilder() {
            return eFeedDetails_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.getDefaultInstance() : eFeedDetails_;
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
            if (((bitField0_ & 0x00000001) != 0)) {
                output.writeMessage(1, getLtpc());
            }
            if (((bitField0_ & 0x00000002) != 0)) {
                output.writeMessage(2, getBidAskQuote());
            }
            if (((bitField0_ & 0x00000004) != 0)) {
                output.writeMessage(3, getOptionGreeks());
            }
            if (((bitField0_ & 0x00000008) != 0)) {
                output.writeMessage(4, getEFeedDetails());
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getLtpc());
            }
            if (((bitField0_ & 0x00000002) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getBidAskQuote());
            }
            if (((bitField0_ & 0x00000004) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, getOptionGreeks());
            }
            if (((bitField0_ & 0x00000008) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(4, getEFeedDetails());
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
            if (!(obj instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain)) {
                return super.equals(obj);
            }
            com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain other = (com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain) obj;

            if (hasLtpc() != other.hasLtpc()) return false;
            if (hasLtpc()) {
                if (!getLtpc()
                        .equals(other.getLtpc())) return false;
            }
            if (hasBidAskQuote() != other.hasBidAskQuote()) return false;
            if (hasBidAskQuote()) {
                if (!getBidAskQuote()
                        .equals(other.getBidAskQuote())) return false;
            }
            if (hasOptionGreeks() != other.hasOptionGreeks()) return false;
            if (hasOptionGreeks()) {
                if (!getOptionGreeks()
                        .equals(other.getOptionGreeks())) return false;
            }
            if (hasEFeedDetails() != other.hasEFeedDetails()) return false;
            if (hasEFeedDetails()) {
                if (!getEFeedDetails()
                        .equals(other.getEFeedDetails())) return false;
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
            if (hasLtpc()) {
                hash = (37 * hash) + LTPC_FIELD_NUMBER;
                hash = (53 * hash) + getLtpc().hashCode();
            }
            if (hasBidAskQuote()) {
                hash = (37 * hash) + BIDASKQUOTE_FIELD_NUMBER;
                hash = (53 * hash) + getBidAskQuote().hashCode();
            }
            if (hasOptionGreeks()) {
                hash = (37 * hash) + OPTIONGREEKS_FIELD_NUMBER;
                hash = (53 * hash) + getOptionGreeks().hashCode();
            }
            if (hasEFeedDetails()) {
                hash = (37 * hash) + EFEEDDETAILS_FIELD_NUMBER;
                hash = (53 * hash) + getEFeedDetails().hashCode();
            }
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain parseFrom(
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
        public static Builder newBuilder(com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain prototype) {
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
         * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.OptionChain}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.upstox.marketdatafeeder.rpc.proto.OptionChain)
                com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChainOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionChain_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionChain_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.Builder.class);
            }

            // Construct using com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.newBuilder()
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
                    getLtpcFieldBuilder();
                    getBidAskQuoteFieldBuilder();
                    getOptionGreeksFieldBuilder();
                    getEFeedDetailsFieldBuilder();
                }
            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                ltpc_ = null;
                if (ltpcBuilder_ != null) {
                    ltpcBuilder_.dispose();
                    ltpcBuilder_ = null;
                }
                bidAskQuote_ = null;
                if (bidAskQuoteBuilder_ != null) {
                    bidAskQuoteBuilder_.dispose();
                    bidAskQuoteBuilder_ = null;
                }
                optionGreeks_ = null;
                if (optionGreeksBuilder_ != null) {
                    optionGreeksBuilder_.dispose();
                    optionGreeksBuilder_ = null;
                }
                eFeedDetails_ = null;
                if (eFeedDetailsBuilder_ != null) {
                    eFeedDetailsBuilder_.dispose();
                    eFeedDetailsBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionChain_descriptor;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain getDefaultInstanceForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.getDefaultInstance();
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain build() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain buildPartial() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain result = new com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain(this);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartial0(com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain result) {
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.ltpc_ = ltpcBuilder_ == null
                            ? ltpc_
                            : ltpcBuilder_.build();
                    to_bitField0_ |= 0x00000001;
                }
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    result.bidAskQuote_ = bidAskQuoteBuilder_ == null
                            ? bidAskQuote_
                            : bidAskQuoteBuilder_.build();
                    to_bitField0_ |= 0x00000002;
                }
                if (((from_bitField0_ & 0x00000004) != 0)) {
                    result.optionGreeks_ = optionGreeksBuilder_ == null
                            ? optionGreeks_
                            : optionGreeksBuilder_.build();
                    to_bitField0_ |= 0x00000004;
                }
                if (((from_bitField0_ & 0x00000008) != 0)) {
                    result.eFeedDetails_ = eFeedDetailsBuilder_ == null
                            ? eFeedDetails_
                            : eFeedDetailsBuilder_.build();
                    to_bitField0_ |= 0x00000008;
                }
                result.bitField0_ |= to_bitField0_;
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
                if (other instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain) {
                    return mergeFrom((com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain other) {
                if (other == com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.getDefaultInstance()) return this;
                if (other.hasLtpc()) {
                    mergeLtpc(other.getLtpc());
                }
                if (other.hasBidAskQuote()) {
                    mergeBidAskQuote(other.getBidAskQuote());
                }
                if (other.hasOptionGreeks()) {
                    mergeOptionGreeks(other.getOptionGreeks());
                }
                if (other.hasEFeedDetails()) {
                    mergeEFeedDetails(other.getEFeedDetails());
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
                            case 10: {
                                input.readMessage(
                                        getLtpcFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                bitField0_ |= 0x00000001;
                                break;
                            } // case 10
                            case 18: {
                                input.readMessage(
                                        getBidAskQuoteFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                bitField0_ |= 0x00000002;
                                break;
                            } // case 18
                            case 26: {
                                input.readMessage(
                                        getOptionGreeksFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                bitField0_ |= 0x00000004;
                                break;
                            } // case 26
                            case 34: {
                                input.readMessage(
                                        getEFeedDetailsFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                bitField0_ |= 0x00000008;
                                break;
                            } // case 34
                            default: {
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

            private com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC ltpc_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder> ltpcBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             * @return Whether the ltpc field is set.
             */
            public boolean hasLtpc() {
                return ((bitField0_ & 0x00000001) != 0);
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             * @return The ltpc.
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getLtpc() {
                if (ltpcBuilder_ == null) {
                    return ltpc_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance() : ltpc_;
                } else {
                    return ltpcBuilder_.getMessage();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder setLtpc(com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC value) {
                if (ltpcBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ltpc_ = value;
                } else {
                    ltpcBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder setLtpc(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder builderForValue) {
                if (ltpcBuilder_ == null) {
                    ltpc_ = builderForValue.build();
                } else {
                    ltpcBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder mergeLtpc(com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC value) {
                if (ltpcBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0) &&
                            ltpc_ != null &&
                            ltpc_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance()) {
                        getLtpcBuilder().mergeFrom(value);
                    } else {
                        ltpc_ = value;
                    }
                } else {
                    ltpcBuilder_.mergeFrom(value);
                }
                if (ltpc_ != null) {
                    bitField0_ |= 0x00000001;
                    onChanged();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder clearLtpc() {
                bitField0_ = (bitField0_ & ~0x00000001);
                ltpc_ = null;
                if (ltpcBuilder_ != null) {
                    ltpcBuilder_.dispose();
                    ltpcBuilder_ = null;
                }
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder getLtpcBuilder() {
                bitField0_ |= 0x00000001;
                onChanged();
                return getLtpcFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder getLtpcOrBuilder() {
                if (ltpcBuilder_ != null) {
                    return ltpcBuilder_.getMessageOrBuilder();
                } else {
                    return ltpc_ == null ?
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance() : ltpc_;
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder>
            getLtpcFieldBuilder() {
                if (ltpcBuilder_ == null) {
                    ltpcBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder>(
                            getLtpc(),
                            getParentForChildren(),
                            isClean());
                    ltpc_ = null;
                }
                return ltpcBuilder_;
            }

            private com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote bidAskQuote_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote, com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder> bidAskQuoteBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
             * @return Whether the bidAskQuote field is set.
             */
            public boolean hasBidAskQuote() {
                return ((bitField0_ & 0x00000002) != 0);
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
             * @return The bidAskQuote.
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote getBidAskQuote() {
                if (bidAskQuoteBuilder_ == null) {
                    return bidAskQuote_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.getDefaultInstance() : bidAskQuote_;
                } else {
                    return bidAskQuoteBuilder_.getMessage();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
             */
            public Builder setBidAskQuote(com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote value) {
                if (bidAskQuoteBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bidAskQuote_ = value;
                } else {
                    bidAskQuoteBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
             */
            public Builder setBidAskQuote(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder builderForValue) {
                if (bidAskQuoteBuilder_ == null) {
                    bidAskQuote_ = builderForValue.build();
                } else {
                    bidAskQuoteBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000002;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
             */
            public Builder mergeBidAskQuote(com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote value) {
                if (bidAskQuoteBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) != 0) &&
                            bidAskQuote_ != null &&
                            bidAskQuote_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.getDefaultInstance()) {
                        getBidAskQuoteBuilder().mergeFrom(value);
                    } else {
                        bidAskQuote_ = value;
                    }
                } else {
                    bidAskQuoteBuilder_.mergeFrom(value);
                }
                if (bidAskQuote_ != null) {
                    bitField0_ |= 0x00000002;
                    onChanged();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
             */
            public Builder clearBidAskQuote() {
                bitField0_ = (bitField0_ & ~0x00000002);
                bidAskQuote_ = null;
                if (bidAskQuoteBuilder_ != null) {
                    bidAskQuoteBuilder_.dispose();
                    bidAskQuoteBuilder_ = null;
                }
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder getBidAskQuoteBuilder() {
                bitField0_ |= 0x00000002;
                onChanged();
                return getBidAskQuoteFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder getBidAskQuoteOrBuilder() {
                if (bidAskQuoteBuilder_ != null) {
                    return bidAskQuoteBuilder_.getMessageOrBuilder();
                } else {
                    return bidAskQuote_ == null ?
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.getDefaultInstance() : bidAskQuote_;
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Quote bidAskQuote = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote, com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder>
            getBidAskQuoteFieldBuilder() {
                if (bidAskQuoteBuilder_ == null) {
                    bidAskQuoteBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote, com.upstox.marketdatafeeder.rpc.proto.Upstox.Quote.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.QuoteOrBuilder>(
                            getBidAskQuote(),
                            getParentForChildren(),
                            isClean());
                    bidAskQuote_ = null;
                }
                return bidAskQuoteBuilder_;
            }

            private com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks optionGreeks_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeksOrBuilder> optionGreeksBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             * @return Whether the optionGreeks field is set.
             */
            public boolean hasOptionGreeks() {
                return ((bitField0_ & 0x00000004) != 0);
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             * @return The optionGreeks.
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks getOptionGreeks() {
                if (optionGreeksBuilder_ == null) {
                    return optionGreeks_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.getDefaultInstance() : optionGreeks_;
                } else {
                    return optionGreeksBuilder_.getMessage();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            public Builder setOptionGreeks(com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks value) {
                if (optionGreeksBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    optionGreeks_ = value;
                } else {
                    optionGreeksBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000004;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            public Builder setOptionGreeks(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.Builder builderForValue) {
                if (optionGreeksBuilder_ == null) {
                    optionGreeks_ = builderForValue.build();
                } else {
                    optionGreeksBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000004;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            public Builder mergeOptionGreeks(com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks value) {
                if (optionGreeksBuilder_ == null) {
                    if (((bitField0_ & 0x00000004) != 0) &&
                            optionGreeks_ != null &&
                            optionGreeks_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.getDefaultInstance()) {
                        getOptionGreeksBuilder().mergeFrom(value);
                    } else {
                        optionGreeks_ = value;
                    }
                } else {
                    optionGreeksBuilder_.mergeFrom(value);
                }
                if (optionGreeks_ != null) {
                    bitField0_ |= 0x00000004;
                    onChanged();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            public Builder clearOptionGreeks() {
                bitField0_ = (bitField0_ & ~0x00000004);
                optionGreeks_ = null;
                if (optionGreeksBuilder_ != null) {
                    optionGreeksBuilder_.dispose();
                    optionGreeksBuilder_ = null;
                }
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.Builder getOptionGreeksBuilder() {
                bitField0_ |= 0x00000004;
                onChanged();
                return getOptionGreeksFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeksOrBuilder getOptionGreeksOrBuilder() {
                if (optionGreeksBuilder_ != null) {
                    return optionGreeksBuilder_.getMessageOrBuilder();
                } else {
                    return optionGreeks_ == null ?
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.getDefaultInstance() : optionGreeks_;
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionGreeks optionGreeks = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeksOrBuilder>
            getOptionGreeksFieldBuilder() {
                if (optionGreeksBuilder_ == null) {
                    optionGreeksBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeks.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionGreeksOrBuilder>(
                            getOptionGreeks(),
                            getParentForChildren(),
                            isClean());
                    optionGreeks_ = null;
                }
                return optionGreeksBuilder_;
            }

            private com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails eFeedDetails_;
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetailsOrBuilder> eFeedDetailsBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
             * @return Whether the eFeedDetails field is set.
             */
            public boolean hasEFeedDetails() {
                return ((bitField0_ & 0x00000008) != 0);
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
             * @return The eFeedDetails.
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails getEFeedDetails() {
                if (eFeedDetailsBuilder_ == null) {
                    return eFeedDetails_ == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.getDefaultInstance() : eFeedDetails_;
                } else {
                    return eFeedDetailsBuilder_.getMessage();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
             */
            public Builder setEFeedDetails(com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails value) {
                if (eFeedDetailsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    eFeedDetails_ = value;
                } else {
                    eFeedDetailsBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000008;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
             */
            public Builder setEFeedDetails(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.Builder builderForValue) {
                if (eFeedDetailsBuilder_ == null) {
                    eFeedDetails_ = builderForValue.build();
                } else {
                    eFeedDetailsBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000008;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
             */
            public Builder mergeEFeedDetails(com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails value) {
                if (eFeedDetailsBuilder_ == null) {
                    if (((bitField0_ & 0x00000008) != 0) &&
                            eFeedDetails_ != null &&
                            eFeedDetails_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.getDefaultInstance()) {
                        getEFeedDetailsBuilder().mergeFrom(value);
                    } else {
                        eFeedDetails_ = value;
                    }
                } else {
                    eFeedDetailsBuilder_.mergeFrom(value);
                }
                if (eFeedDetails_ != null) {
                    bitField0_ |= 0x00000008;
                    onChanged();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
             */
            public Builder clearEFeedDetails() {
                bitField0_ = (bitField0_ & ~0x00000008);
                eFeedDetails_ = null;
                if (eFeedDetailsBuilder_ != null) {
                    eFeedDetailsBuilder_.dispose();
                    eFeedDetailsBuilder_ = null;
                }
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.Builder getEFeedDetailsBuilder() {
                bitField0_ |= 0x00000008;
                onChanged();
                return getEFeedDetailsFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetailsOrBuilder getEFeedDetailsOrBuilder() {
                if (eFeedDetailsBuilder_ != null) {
                    return eFeedDetailsBuilder_.getMessageOrBuilder();
                } else {
                    return eFeedDetails_ == null ?
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.getDefaultInstance() : eFeedDetails_;
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.ExtendedFeedDetails eFeedDetails = 4;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetailsOrBuilder>
            getEFeedDetailsFieldBuilder() {
                if (eFeedDetailsBuilder_ == null) {
                    eFeedDetailsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetails.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.ExtendedFeedDetailsOrBuilder>(
                            getEFeedDetails(),
                            getParentForChildren(),
                            isClean());
                    eFeedDetails_ = null;
                }
                return eFeedDetailsBuilder_;
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


            // @@protoc_insertion_point(builder_scope:com.upstox.marketdatafeeder.rpc.proto.OptionChain)
        }

        // @@protoc_insertion_point(class_scope:com.upstox.marketdatafeeder.rpc.proto.OptionChain)
        private static final com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain();
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<OptionChain>
                PARSER = new com.google.protobuf.AbstractParser<OptionChain>() {
            @java.lang.Override
            public OptionChain parsePartialFrom(
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

        public static com.google.protobuf.Parser<OptionChain> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<OptionChain> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface FeedOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.upstox.marketdatafeeder.rpc.proto.Feed)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return Whether the ltpc field is set.
         */
        boolean hasLtpc();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return The ltpc.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getLtpc();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder getLtpcOrBuilder();

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
         * @return Whether the ff field is set.
         */
        boolean hasFf();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
         * @return The ff.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed getFf();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeedOrBuilder getFfOrBuilder();

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
         * @return Whether the oc field is set.
         */
        boolean hasOc();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
         * @return The oc.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain getOc();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChainOrBuilder getOcOrBuilder();

        com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.FeedUnionCase getFeedUnionCase();
    }
    /**
     * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.Feed}
     */
    public static final class Feed extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.upstox.marketdatafeeder.rpc.proto.Feed)
            FeedOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use Feed.newBuilder() to construct.
        private Feed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private Feed() {
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new Feed();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_Feed_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_Feed_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.Builder.class);
        }

        private int feedUnionCase_ = 0;
        @SuppressWarnings("serial")
        private java.lang.Object feedUnion_;
        public enum FeedUnionCase
                implements com.google.protobuf.Internal.EnumLite,
                com.google.protobuf.AbstractMessage.InternalOneOfEnum {
            LTPC(1),
            FF(2),
            OC(3),
            FEEDUNION_NOT_SET(0);
            private final int value;
            private FeedUnionCase(int value) {
                this.value = value;
            }
            /**
             * @param value The number of the enum to look for.
             * @return The enum associated with the given number.
             * @deprecated Use {@link #forNumber(int)} instead.
             */
            @java.lang.Deprecated
            public static FeedUnionCase valueOf(int value) {
                return forNumber(value);
            }

            public static FeedUnionCase forNumber(int value) {
                switch (value) {
                    case 1: return LTPC;
                    case 2: return FF;
                    case 3: return OC;
                    case 0: return FEEDUNION_NOT_SET;
                    default: return null;
                }
            }
            public int getNumber() {
                return this.value;
            }
        };

        public FeedUnionCase
        getFeedUnionCase() {
            return FeedUnionCase.forNumber(
                    feedUnionCase_);
        }

        public static final int LTPC_FIELD_NUMBER = 1;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return Whether the ltpc field is set.
         */
        @java.lang.Override
        public boolean hasLtpc() {
            return feedUnionCase_ == 1;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         * @return The ltpc.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getLtpc() {
            if (feedUnionCase_ == 1) {
                return (com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC) feedUnion_;
            }
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance();
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder getLtpcOrBuilder() {
            if (feedUnionCase_ == 1) {
                return (com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC) feedUnion_;
            }
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance();
        }

        public static final int FF_FIELD_NUMBER = 2;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
         * @return Whether the ff field is set.
         */
        @java.lang.Override
        public boolean hasFf() {
            return feedUnionCase_ == 2;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
         * @return The ff.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed getFf() {
            if (feedUnionCase_ == 2) {
                return (com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed) feedUnion_;
            }
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.getDefaultInstance();
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeedOrBuilder getFfOrBuilder() {
            if (feedUnionCase_ == 2) {
                return (com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed) feedUnion_;
            }
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.getDefaultInstance();
        }

        public static final int OC_FIELD_NUMBER = 3;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
         * @return Whether the oc field is set.
         */
        @java.lang.Override
        public boolean hasOc() {
            return feedUnionCase_ == 3;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
         * @return The oc.
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain getOc() {
            if (feedUnionCase_ == 3) {
                return (com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain) feedUnion_;
            }
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.getDefaultInstance();
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChainOrBuilder getOcOrBuilder() {
            if (feedUnionCase_ == 3) {
                return (com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain) feedUnion_;
            }
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.getDefaultInstance();
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
            if (feedUnionCase_ == 1) {
                output.writeMessage(1, (com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC) feedUnion_);
            }
            if (feedUnionCase_ == 2) {
                output.writeMessage(2, (com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed) feedUnion_);
            }
            if (feedUnionCase_ == 3) {
                output.writeMessage(3, (com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain) feedUnion_);
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (feedUnionCase_ == 1) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, (com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC) feedUnion_);
            }
            if (feedUnionCase_ == 2) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, (com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed) feedUnion_);
            }
            if (feedUnionCase_ == 3) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, (com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain) feedUnion_);
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
            if (!(obj instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed)) {
                return super.equals(obj);
            }
            com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed other = (com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed) obj;

            if (!getFeedUnionCase().equals(other.getFeedUnionCase())) return false;
            switch (feedUnionCase_) {
                case 1:
                    if (!getLtpc()
                            .equals(other.getLtpc())) return false;
                    break;
                case 2:
                    if (!getFf()
                            .equals(other.getFf())) return false;
                    break;
                case 3:
                    if (!getOc()
                            .equals(other.getOc())) return false;
                    break;
                case 0:
                default:
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
            switch (feedUnionCase_) {
                case 1:
                    hash = (37 * hash) + LTPC_FIELD_NUMBER;
                    hash = (53 * hash) + getLtpc().hashCode();
                    break;
                case 2:
                    hash = (37 * hash) + FF_FIELD_NUMBER;
                    hash = (53 * hash) + getFf().hashCode();
                    break;
                case 3:
                    hash = (37 * hash) + OC_FIELD_NUMBER;
                    hash = (53 * hash) + getOc().hashCode();
                    break;
                case 0:
                default:
            }
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed parseFrom(
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
        public static Builder newBuilder(com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed prototype) {
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
         * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.Feed}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.upstox.marketdatafeeder.rpc.proto.Feed)
                com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_Feed_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_Feed_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.Builder.class);
            }

            // Construct using com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.newBuilder()
            private Builder() {

            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);

            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                if (ltpcBuilder_ != null) {
                    ltpcBuilder_.clear();
                }
                if (ffBuilder_ != null) {
                    ffBuilder_.clear();
                }
                if (ocBuilder_ != null) {
                    ocBuilder_.clear();
                }
                feedUnionCase_ = 0;
                feedUnion_ = null;
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_Feed_descriptor;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed getDefaultInstanceForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.getDefaultInstance();
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed build() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed buildPartial() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed result = new com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed(this);
                if (bitField0_ != 0) { buildPartial0(result); }
                buildPartialOneofs(result);
                onBuilt();
                return result;
            }

            private void buildPartial0(com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed result) {
                int from_bitField0_ = bitField0_;
            }

            private void buildPartialOneofs(com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed result) {
                result.feedUnionCase_ = feedUnionCase_;
                result.feedUnion_ = this.feedUnion_;
                if (feedUnionCase_ == 1 &&
                        ltpcBuilder_ != null) {
                    result.feedUnion_ = ltpcBuilder_.build();
                }
                if (feedUnionCase_ == 2 &&
                        ffBuilder_ != null) {
                    result.feedUnion_ = ffBuilder_.build();
                }
                if (feedUnionCase_ == 3 &&
                        ocBuilder_ != null) {
                    result.feedUnion_ = ocBuilder_.build();
                }
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
                if (other instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed) {
                    return mergeFrom((com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed other) {
                if (other == com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.getDefaultInstance()) return this;
                switch (other.getFeedUnionCase()) {
                    case LTPC: {
                        mergeLtpc(other.getLtpc());
                        break;
                    }
                    case FF: {
                        mergeFf(other.getFf());
                        break;
                    }
                    case OC: {
                        mergeOc(other.getOc());
                        break;
                    }
                    case FEEDUNION_NOT_SET: {
                        break;
                    }
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
                            case 10: {
                                input.readMessage(
                                        getLtpcFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                feedUnionCase_ = 1;
                                break;
                            } // case 10
                            case 18: {
                                input.readMessage(
                                        getFfFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                feedUnionCase_ = 2;
                                break;
                            } // case 18
                            case 26: {
                                input.readMessage(
                                        getOcFieldBuilder().getBuilder(),
                                        extensionRegistry);
                                feedUnionCase_ = 3;
                                break;
                            } // case 26
                            default: {
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
            private int feedUnionCase_ = 0;
            private java.lang.Object feedUnion_;
            public FeedUnionCase
            getFeedUnionCase() {
                return FeedUnionCase.forNumber(
                        feedUnionCase_);
            }

            public Builder clearFeedUnion() {
                feedUnionCase_ = 0;
                feedUnion_ = null;
                onChanged();
                return this;
            }

            private int bitField0_;

            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder> ltpcBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             * @return Whether the ltpc field is set.
             */
            @java.lang.Override
            public boolean hasLtpc() {
                return feedUnionCase_ == 1;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             * @return The ltpc.
             */
            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC getLtpc() {
                if (ltpcBuilder_ == null) {
                    if (feedUnionCase_ == 1) {
                        return (com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC) feedUnion_;
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance();
                } else {
                    if (feedUnionCase_ == 1) {
                        return ltpcBuilder_.getMessage();
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder setLtpc(com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC value) {
                if (ltpcBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    feedUnion_ = value;
                    onChanged();
                } else {
                    ltpcBuilder_.setMessage(value);
                }
                feedUnionCase_ = 1;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder setLtpc(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder builderForValue) {
                if (ltpcBuilder_ == null) {
                    feedUnion_ = builderForValue.build();
                    onChanged();
                } else {
                    ltpcBuilder_.setMessage(builderForValue.build());
                }
                feedUnionCase_ = 1;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder mergeLtpc(com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC value) {
                if (ltpcBuilder_ == null) {
                    if (feedUnionCase_ == 1 &&
                            feedUnion_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance()) {
                        feedUnion_ = com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.newBuilder((com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC) feedUnion_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        feedUnion_ = value;
                    }
                    onChanged();
                } else {
                    if (feedUnionCase_ == 1) {
                        ltpcBuilder_.mergeFrom(value);
                    } else {
                        ltpcBuilder_.setMessage(value);
                    }
                }
                feedUnionCase_ = 1;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public Builder clearLtpc() {
                if (ltpcBuilder_ == null) {
                    if (feedUnionCase_ == 1) {
                        feedUnionCase_ = 0;
                        feedUnion_ = null;
                        onChanged();
                    }
                } else {
                    if (feedUnionCase_ == 1) {
                        feedUnionCase_ = 0;
                        feedUnion_ = null;
                    }
                    ltpcBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder getLtpcBuilder() {
                return getLtpcFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder getLtpcOrBuilder() {
                if ((feedUnionCase_ == 1) && (ltpcBuilder_ != null)) {
                    return ltpcBuilder_.getMessageOrBuilder();
                } else {
                    if (feedUnionCase_ == 1) {
                        return (com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC) feedUnion_;
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.LTPC ltpc = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder>
            getLtpcFieldBuilder() {
                if (ltpcBuilder_ == null) {
                    if (!(feedUnionCase_ == 1)) {
                        feedUnion_ = com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.getDefaultInstance();
                    }
                    ltpcBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPCOrBuilder>(
                            (com.upstox.marketdatafeeder.rpc.proto.Upstox.LTPC) feedUnion_,
                            getParentForChildren(),
                            isClean());
                    feedUnion_ = null;
                }
                feedUnionCase_ = 1;
                onChanged();
                return ltpcBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed, com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeedOrBuilder> ffBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
             * @return Whether the ff field is set.
             */
            @java.lang.Override
            public boolean hasFf() {
                return feedUnionCase_ == 2;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
             * @return The ff.
             */
            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed getFf() {
                if (ffBuilder_ == null) {
                    if (feedUnionCase_ == 2) {
                        return (com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed) feedUnion_;
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.getDefaultInstance();
                } else {
                    if (feedUnionCase_ == 2) {
                        return ffBuilder_.getMessage();
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.getDefaultInstance();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
             */
            public Builder setFf(com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed value) {
                if (ffBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    feedUnion_ = value;
                    onChanged();
                } else {
                    ffBuilder_.setMessage(value);
                }
                feedUnionCase_ = 2;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
             */
            public Builder setFf(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.Builder builderForValue) {
                if (ffBuilder_ == null) {
                    feedUnion_ = builderForValue.build();
                    onChanged();
                } else {
                    ffBuilder_.setMessage(builderForValue.build());
                }
                feedUnionCase_ = 2;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
             */
            public Builder mergeFf(com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed value) {
                if (ffBuilder_ == null) {
                    if (feedUnionCase_ == 2 &&
                            feedUnion_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.getDefaultInstance()) {
                        feedUnion_ = com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.newBuilder((com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed) feedUnion_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        feedUnion_ = value;
                    }
                    onChanged();
                } else {
                    if (feedUnionCase_ == 2) {
                        ffBuilder_.mergeFrom(value);
                    } else {
                        ffBuilder_.setMessage(value);
                    }
                }
                feedUnionCase_ = 2;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
             */
            public Builder clearFf() {
                if (ffBuilder_ == null) {
                    if (feedUnionCase_ == 2) {
                        feedUnionCase_ = 0;
                        feedUnion_ = null;
                        onChanged();
                    }
                } else {
                    if (feedUnionCase_ == 2) {
                        feedUnionCase_ = 0;
                        feedUnion_ = null;
                    }
                    ffBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.Builder getFfBuilder() {
                return getFfFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
             */
            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeedOrBuilder getFfOrBuilder() {
                if ((feedUnionCase_ == 2) && (ffBuilder_ != null)) {
                    return ffBuilder_.getMessageOrBuilder();
                } else {
                    if (feedUnionCase_ == 2) {
                        return (com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed) feedUnion_;
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.getDefaultInstance();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.FullFeed ff = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed, com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeedOrBuilder>
            getFfFieldBuilder() {
                if (ffBuilder_ == null) {
                    if (!(feedUnionCase_ == 2)) {
                        feedUnion_ = com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.getDefaultInstance();
                    }
                    ffBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed, com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeedOrBuilder>(
                            (com.upstox.marketdatafeeder.rpc.proto.Upstox.FullFeed) feedUnion_,
                            getParentForChildren(),
                            isClean());
                    feedUnion_ = null;
                }
                feedUnionCase_ = 2;
                onChanged();
                return ffBuilder_;
            }

            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChainOrBuilder> ocBuilder_;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
             * @return Whether the oc field is set.
             */
            @java.lang.Override
            public boolean hasOc() {
                return feedUnionCase_ == 3;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
             * @return The oc.
             */
            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain getOc() {
                if (ocBuilder_ == null) {
                    if (feedUnionCase_ == 3) {
                        return (com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain) feedUnion_;
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.getDefaultInstance();
                } else {
                    if (feedUnionCase_ == 3) {
                        return ocBuilder_.getMessage();
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.getDefaultInstance();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
             */
            public Builder setOc(com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain value) {
                if (ocBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    feedUnion_ = value;
                    onChanged();
                } else {
                    ocBuilder_.setMessage(value);
                }
                feedUnionCase_ = 3;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
             */
            public Builder setOc(
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.Builder builderForValue) {
                if (ocBuilder_ == null) {
                    feedUnion_ = builderForValue.build();
                    onChanged();
                } else {
                    ocBuilder_.setMessage(builderForValue.build());
                }
                feedUnionCase_ = 3;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
             */
            public Builder mergeOc(com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain value) {
                if (ocBuilder_ == null) {
                    if (feedUnionCase_ == 3 &&
                            feedUnion_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.getDefaultInstance()) {
                        feedUnion_ = com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.newBuilder((com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain) feedUnion_)
                                .mergeFrom(value).buildPartial();
                    } else {
                        feedUnion_ = value;
                    }
                    onChanged();
                } else {
                    if (feedUnionCase_ == 3) {
                        ocBuilder_.mergeFrom(value);
                    } else {
                        ocBuilder_.setMessage(value);
                    }
                }
                feedUnionCase_ = 3;
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
             */
            public Builder clearOc() {
                if (ocBuilder_ == null) {
                    if (feedUnionCase_ == 3) {
                        feedUnionCase_ = 0;
                        feedUnion_ = null;
                        onChanged();
                    }
                } else {
                    if (feedUnionCase_ == 3) {
                        feedUnionCase_ = 0;
                        feedUnion_ = null;
                    }
                    ocBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.Builder getOcBuilder() {
                return getOcFieldBuilder().getBuilder();
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
             */
            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChainOrBuilder getOcOrBuilder() {
                if ((feedUnionCase_ == 3) && (ocBuilder_ != null)) {
                    return ocBuilder_.getMessageOrBuilder();
                } else {
                    if (feedUnionCase_ == 3) {
                        return (com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain) feedUnion_;
                    }
                    return com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.getDefaultInstance();
                }
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.OptionChain oc = 3;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChainOrBuilder>
            getOcFieldBuilder() {
                if (ocBuilder_ == null) {
                    if (!(feedUnionCase_ == 3)) {
                        feedUnion_ = com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.getDefaultInstance();
                    }
                    ocBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain.Builder, com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChainOrBuilder>(
                            (com.upstox.marketdatafeeder.rpc.proto.Upstox.OptionChain) feedUnion_,
                            getParentForChildren(),
                            isClean());
                    feedUnion_ = null;
                }
                feedUnionCase_ = 3;
                onChanged();
                return ocBuilder_;
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


            // @@protoc_insertion_point(builder_scope:com.upstox.marketdatafeeder.rpc.proto.Feed)
        }

        // @@protoc_insertion_point(class_scope:com.upstox.marketdatafeeder.rpc.proto.Feed)
        private static final com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed();
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Feed>
                PARSER = new com.google.protobuf.AbstractParser<Feed>() {
            @java.lang.Override
            public Feed parsePartialFrom(
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

        public static com.google.protobuf.Parser<Feed> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Feed> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface FeedResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.upstox.marketdatafeeder.rpc.proto.FeedResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.Type type = 1;</code>
         * @return The enum numeric value on the wire for type.
         */
        int getTypeValue();
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.Type type = 1;</code>
         * @return The type.
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.Type getType();

        /**
         * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
         */
        int getFeedsCount();
        /**
         * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
         */
        boolean containsFeeds(
                java.lang.String key);
        /**
         * Use {@link #getFeedsMap()} instead.
         */
        @java.lang.Deprecated
        java.util.Map<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed>
        getFeeds();
        /**
         * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
         */
        java.util.Map<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed>
        getFeedsMap();
        /**
         * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
         */
        /* nullable */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed getFeedsOrDefault(
                java.lang.String key,
                /* nullable */
                com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed defaultValue);
        /**
         * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
         */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed getFeedsOrThrow(
                java.lang.String key);
    }
    /**
     * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.FeedResponse}
     */
    public static final class FeedResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.upstox.marketdatafeeder.rpc.proto.FeedResponse)
            FeedResponseOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use FeedResponse.newBuilder() to construct.
        private FeedResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private FeedResponse() {
            type_ = 0;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new FeedResponse();
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_descriptor;
        }

        @SuppressWarnings({"rawtypes"})
        @java.lang.Override
        protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
                int number) {
            switch (number) {
                case 2:
                    return internalGetFeeds();
                default:
                    throw new RuntimeException(
                            "Invalid map field number: " + number);
            }
        }
        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse.Builder.class);
        }

        public static final int TYPE_FIELD_NUMBER = 1;
        private int type_ = 0;
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.Type type = 1;</code>
         * @return The enum numeric value on the wire for type.
         */
        @java.lang.Override public int getTypeValue() {
            return type_;
        }
        /**
         * <code>.com.upstox.marketdatafeeder.rpc.proto.Type type = 1;</code>
         * @return The type.
         */
        @java.lang.Override public com.upstox.marketdatafeeder.rpc.proto.Upstox.Type getType() {
            com.upstox.marketdatafeeder.rpc.proto.Upstox.Type result = com.upstox.marketdatafeeder.rpc.proto.Upstox.Type.forNumber(type_);
            return result == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.Type.UNRECOGNIZED : result;
        }

        public static final int FEEDS_FIELD_NUMBER = 2;
        private static final class FeedsDefaultEntryHolder {
            static final com.google.protobuf.MapEntry<
                    java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed> defaultEntry =
                    com.google.protobuf.MapEntry
                            .<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed>newDefaultInstance(
                                    com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_FeedsEntry_descriptor,
                                    com.google.protobuf.WireFormat.FieldType.STRING,
                                    "",
                                    com.google.protobuf.WireFormat.FieldType.MESSAGE,
                                    com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.getDefaultInstance());
        }
        @SuppressWarnings("serial")
        private com.google.protobuf.MapField<
                java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed> feeds_;
        private com.google.protobuf.MapField<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed>
        internalGetFeeds() {
            if (feeds_ == null) {
                return com.google.protobuf.MapField.emptyMapField(
                        FeedsDefaultEntryHolder.defaultEntry);
            }
            return feeds_;
        }
        public int getFeedsCount() {
            return internalGetFeeds().getMap().size();
        }
        /**
         * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
         */
        @java.lang.Override
        public boolean containsFeeds(
                java.lang.String key) {
            if (key == null) { throw new NullPointerException("map key"); }
            return internalGetFeeds().getMap().containsKey(key);
        }
        /**
         * Use {@link #getFeedsMap()} instead.
         */
        @java.lang.Override
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed> getFeeds() {
            return getFeedsMap();
        }
        /**
         * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
         */
        @java.lang.Override
        public java.util.Map<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed> getFeedsMap() {
            return internalGetFeeds().getMap();
        }
        /**
         * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
         */
        @java.lang.Override
        public /* nullable */
        com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed getFeedsOrDefault(
                java.lang.String key,
                /* nullable */
                com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed defaultValue) {
            if (key == null) { throw new NullPointerException("map key"); }
            java.util.Map<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed> map =
                    internalGetFeeds().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }
        /**
         * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
         */
        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed getFeedsOrThrow(
                java.lang.String key) {
            if (key == null) { throw new NullPointerException("map key"); }
            java.util.Map<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed> map =
                    internalGetFeeds().getMap();
            if (!map.containsKey(key)) {
                throw new java.lang.IllegalArgumentException();
            }
            return map.get(key);
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
            if (type_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.Type.initial_feed.getNumber()) {
                output.writeEnum(1, type_);
            }
            com.google.protobuf.GeneratedMessageV3
                    .serializeStringMapTo(
                            output,
                            internalGetFeeds(),
                            FeedsDefaultEntryHolder.defaultEntry,
                            2);
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (type_ != com.upstox.marketdatafeeder.rpc.proto.Upstox.Type.initial_feed.getNumber()) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(1, type_);
            }
            for (java.util.Map.Entry<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed> entry
                    : internalGetFeeds().getMap().entrySet()) {
                com.google.protobuf.MapEntry<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed>
                        feeds__ = FeedsDefaultEntryHolder.defaultEntry.newBuilderForType()
                        .setKey(entry.getKey())
                        .setValue(entry.getValue())
                        .build();
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, feeds__);
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
            if (!(obj instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse)) {
                return super.equals(obj);
            }
            com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse other = (com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse) obj;

            if (type_ != other.type_) return false;
            if (!internalGetFeeds().equals(
                    other.internalGetFeeds())) return false;
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
            hash = (37 * hash) + TYPE_FIELD_NUMBER;
            hash = (53 * hash) + type_;
            if (!internalGetFeeds().getMap().isEmpty()) {
                hash = (37 * hash) + FEEDS_FIELD_NUMBER;
                hash = (53 * hash) + internalGetFeeds().hashCode();
            }
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse parseFrom(
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
        public static Builder newBuilder(com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse prototype) {
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
         * Protobuf type {@code com.upstox.marketdatafeeder.rpc.proto.FeedResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.upstox.marketdatafeeder.rpc.proto.FeedResponse)
                com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_descriptor;
            }

            @SuppressWarnings({"rawtypes"})
            protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
                    int number) {
                switch (number) {
                    case 2:
                        return internalGetFeeds();
                    default:
                        throw new RuntimeException(
                                "Invalid map field number: " + number);
                }
            }
            @SuppressWarnings({"rawtypes"})
            protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
                    int number) {
                switch (number) {
                    case 2:
                        return internalGetMutableFeeds();
                    default:
                        throw new RuntimeException(
                                "Invalid map field number: " + number);
                }
            }
            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse.class, com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse.Builder.class);
            }

            // Construct using com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse.newBuilder()
            private Builder() {

            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);

            }
            @java.lang.Override
            public Builder clear() {
                super.clear();
                bitField0_ = 0;
                type_ = 0;
                internalGetMutableFeeds().clear();
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_descriptor;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse getDefaultInstanceForType() {
                return com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse.getDefaultInstance();
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse build() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse buildPartial() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse result = new com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse(this);
                if (bitField0_ != 0) { buildPartial0(result); }
                onBuilt();
                return result;
            }

            private void buildPartial0(com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse result) {
                int from_bitField0_ = bitField0_;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.type_ = type_;
                }
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    result.feeds_ = internalGetFeeds().build(FeedsDefaultEntryHolder.defaultEntry);
                }
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
                if (other instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse) {
                    return mergeFrom((com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse other) {
                if (other == com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse.getDefaultInstance()) return this;
                if (other.type_ != 0) {
                    setTypeValue(other.getTypeValue());
                }
                internalGetMutableFeeds().mergeFrom(
                        other.internalGetFeeds());
                bitField0_ |= 0x00000002;
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
                            case 8: {
                                type_ = input.readEnum();
                                bitField0_ |= 0x00000001;
                                break;
                            } // case 8
                            case 18: {
                                com.google.protobuf.MapEntry<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed>
                                        feeds__ = input.readMessage(
                                        FeedsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                                internalGetMutableFeeds().ensureBuilderMap().put(
                                        feeds__.getKey(), feeds__.getValue());
                                bitField0_ |= 0x00000002;
                                break;
                            } // case 18
                            default: {
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

            private int type_ = 0;
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Type type = 1;</code>
             * @return The enum numeric value on the wire for type.
             */
            @java.lang.Override public int getTypeValue() {
                return type_;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Type type = 1;</code>
             * @param value The enum numeric value on the wire for type to set.
             * @return This builder for chaining.
             */
            public Builder setTypeValue(int value) {
                type_ = value;
                bitField0_ |= 0x00000001;
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Type type = 1;</code>
             * @return The type.
             */
            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Type getType() {
                com.upstox.marketdatafeeder.rpc.proto.Upstox.Type result = com.upstox.marketdatafeeder.rpc.proto.Upstox.Type.forNumber(type_);
                return result == null ? com.upstox.marketdatafeeder.rpc.proto.Upstox.Type.UNRECOGNIZED : result;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Type type = 1;</code>
             * @param value The type to set.
             * @return This builder for chaining.
             */
            public Builder setType(com.upstox.marketdatafeeder.rpc.proto.Upstox.Type value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                type_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>.com.upstox.marketdatafeeder.rpc.proto.Type type = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearType() {
                bitField0_ = (bitField0_ & ~0x00000001);
                type_ = 0;
                onChanged();
                return this;
            }

            private static final class FeedsConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedOrBuilder, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed> {
                @java.lang.Override
                public com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed build(com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedOrBuilder val) {
                    if (val instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed) { return (com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed) val; }
                    return ((com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.Builder) val).build();
                }

                @java.lang.Override
                public com.google.protobuf.MapEntry<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed> defaultEntry() {
                    return FeedsDefaultEntryHolder.defaultEntry;
                }
            };
            private static final FeedsConverter feedsConverter = new FeedsConverter();

            private com.google.protobuf.MapFieldBuilder<
                    java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedOrBuilder, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.Builder> feeds_;
            private com.google.protobuf.MapFieldBuilder<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedOrBuilder, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.Builder>
            internalGetFeeds() {
                if (feeds_ == null) {
                    return new com.google.protobuf.MapFieldBuilder<>(feedsConverter);
                }
                return feeds_;
            }
            private com.google.protobuf.MapFieldBuilder<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedOrBuilder, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.Builder>
            internalGetMutableFeeds() {
                if (feeds_ == null) {
                    feeds_ = new com.google.protobuf.MapFieldBuilder<>(feedsConverter);
                }
                bitField0_ |= 0x00000002;
                onChanged();
                return feeds_;
            }
            public int getFeedsCount() {
                return internalGetFeeds().ensureBuilderMap().size();
            }
            /**
             * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
             */
            @java.lang.Override
            public boolean containsFeeds(
                    java.lang.String key) {
                if (key == null) { throw new NullPointerException("map key"); }
                return internalGetFeeds().ensureBuilderMap().containsKey(key);
            }
            /**
             * Use {@link #getFeedsMap()} instead.
             */
            @java.lang.Override
            @java.lang.Deprecated
            public java.util.Map<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed> getFeeds() {
                return getFeedsMap();
            }
            /**
             * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
             */
            @java.lang.Override
            public java.util.Map<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed> getFeedsMap() {
                return internalGetFeeds().getImmutableMap();
            }
            /**
             * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
             */
            @java.lang.Override
            public /* nullable */
            com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed getFeedsOrDefault(
                    java.lang.String key,
                    /* nullable */
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed defaultValue) {
                if (key == null) { throw new NullPointerException("map key"); }
                java.util.Map<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedOrBuilder> map = internalGetMutableFeeds().ensureBuilderMap();
                return map.containsKey(key) ? feedsConverter.build(map.get(key)) : defaultValue;
            }
            /**
             * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
             */
            @java.lang.Override
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed getFeedsOrThrow(
                    java.lang.String key) {
                if (key == null) { throw new NullPointerException("map key"); }
                java.util.Map<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedOrBuilder> map = internalGetMutableFeeds().ensureBuilderMap();
                if (!map.containsKey(key)) {
                    throw new java.lang.IllegalArgumentException();
                }
                return feedsConverter.build(map.get(key));
            }
            public Builder clearFeeds() {
                bitField0_ = (bitField0_ & ~0x00000002);
                internalGetMutableFeeds().clear();
                return this;
            }
            /**
             * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
             */
            public Builder removeFeeds(
                    java.lang.String key) {
                if (key == null) { throw new NullPointerException("map key"); }
                internalGetMutableFeeds().ensureBuilderMap()
                        .remove(key);
                return this;
            }
            /**
             * Use alternate mutation accessors instead.
             */
            @java.lang.Deprecated
            public java.util.Map<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed>
            getMutableFeeds() {
                bitField0_ |= 0x00000002;
                return internalGetMutableFeeds().ensureMessageMap();
            }
            /**
             * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
             */
            public Builder putFeeds(
                    java.lang.String key,
                    com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed value) {
                if (key == null) { throw new NullPointerException("map key"); }
                if (value == null) { throw new NullPointerException("map value"); }
                internalGetMutableFeeds().ensureBuilderMap()
                        .put(key, value);
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
             */
            public Builder putAllFeeds(
                    java.util.Map<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed> values) {
                for (java.util.Map.Entry<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed> e : values.entrySet()) {
                    if (e.getKey() == null || e.getValue() == null) {
                        throw new NullPointerException();
                    }
                }
                internalGetMutableFeeds().ensureBuilderMap()
                        .putAll(values);
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <code>map&lt;string, .com.upstox.marketdatafeeder.rpc.proto.Feed&gt; feeds = 2;</code>
             */
            public com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.Builder putFeedsBuilderIfAbsent(
                    java.lang.String key) {
                java.util.Map<java.lang.String, com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedOrBuilder> builderMap = internalGetMutableFeeds().ensureBuilderMap();
                com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedOrBuilder entry = builderMap.get(key);
                if (entry == null) {
                    entry = com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.newBuilder();
                    builderMap.put(key, entry);
                }
                if (entry instanceof com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed) {
                    entry = ((com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed) entry).toBuilder();
                    builderMap.put(key, entry);
                }
                return (com.upstox.marketdatafeeder.rpc.proto.Upstox.Feed.Builder) entry;
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


            // @@protoc_insertion_point(builder_scope:com.upstox.marketdatafeeder.rpc.proto.FeedResponse)
        }

        // @@protoc_insertion_point(class_scope:com.upstox.marketdatafeeder.rpc.proto.FeedResponse)
        private static final com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse();
        }

        public static com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<FeedResponse>
                PARSER = new com.google.protobuf.AbstractParser<FeedResponse>() {
            @java.lang.Override
            public FeedResponse parsePartialFrom(
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

        public static com.google.protobuf.Parser<FeedResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<FeedResponse> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public com.upstox.marketdatafeeder.rpc.proto.Upstox.FeedResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_LTPC_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_LTPC_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketLevel_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketLevel_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketOHLC_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketOHLC_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_Quote_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_Quote_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionGreeks_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionGreeks_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_ExtendedFeedDetails_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_ExtendedFeedDetails_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_OHLC_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_OHLC_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketFullFeed_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketFullFeed_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_IndexFullFeed_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_IndexFullFeed_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_FullFeed_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_FullFeed_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionChain_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionChain_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_Feed_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_Feed_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_FeedsEntry_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_FeedsEntry_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        java.lang.String[] descriptorData = {
                "\n\014upstox.proto\022%com.upstox.marketdatafee" +
                        "der.rpc.proto\"9\n\004LTPC\022\013\n\003ltp\030\001 \001(\001\022\013\n\003lt" +
                        "t\030\002 \001(\003\022\013\n\003ltq\030\003 \001(\003\022\n\n\002cp\030\004 \001(\001\"P\n\013Mark" +
                        "etLevel\022A\n\013bidAskQuote\030\001 \003(\0132,.com.upsto" +
                        "x.marketdatafeeder.rpc.proto.Quote\"G\n\nMa" +
                        "rketOHLC\0229\n\004ohlc\030\001 \003(\0132+.com.upstox.mark" +
                        "etdatafeeder.rpc.proto.OHLC\"Q\n\005Quote\022\n\n\002" +
                        "bq\030\001 \001(\005\022\n\n\002bp\030\002 \001(\001\022\013\n\003bno\030\003 \001(\005\022\n\n\002aq\030" +
                        "\004 \001(\005\022\n\n\002ap\030\005 \001(\001\022\013\n\003ano\030\006 \001(\005\"z\n\014Option" +
                        "Greeks\022\n\n\002op\030\001 \001(\001\022\n\n\002up\030\002 \001(\001\022\n\n\002iv\030\003 \001" +
                        "(\001\022\r\n\005delta\030\004 \001(\001\022\r\n\005theta\030\005 \001(\001\022\r\n\005gamm" +
                        "a\030\006 \001(\001\022\014\n\004vega\030\007 \001(\001\022\013\n\003rho\030\010 \001(\001\"\277\002\n\023E" +
                        "xtendedFeedDetails\022\013\n\003atp\030\001 \001(\001\022\n\n\002cp\030\002 " +
                        "\001(\001\022\013\n\003vtt\030\003 \001(\003\022\n\n\002oi\030\004 \001(\001\022\020\n\010changeOi" +
                        "\030\005 \001(\001\022\021\n\tlastClose\030\006 \001(\001\022\013\n\003tbq\030\007 \001(\001\022\013" +
                        "\n\003tsq\030\010 \001(\001\022\r\n\005close\030\t \001(\001\022\n\n\002lc\030\n \001(\001\022\n" +
                        "\n\002uc\030\013 \001(\001\022\n\n\002yh\030\014 \001(\001\022\n\n\002yl\030\r \001(\001\022\n\n\002fp" +
                        "\030\016 \001(\001\022\n\n\002fv\030\017 \001(\005\022\016\n\006mbpBuy\030\020 \001(\003\022\017\n\007mb" +
                        "pSell\030\021 \001(\003\022\n\n\002tv\030\022 \001(\003\022\014\n\004dhoi\030\023 \001(\001\022\014\n" +
                        "\004dloi\030\024 \001(\001\022\n\n\002sp\030\025 \001(\001\022\013\n\003poi\030\026 \001(\001\"l\n\004" +
                        "OHLC\022\020\n\010interval\030\001 \001(\t\022\014\n\004open\030\002 \001(\001\022\014\n\004" +
                        "high\030\003 \001(\001\022\013\n\003low\030\004 \001(\001\022\r\n\005close\030\005 \001(\001\022\016" +
                        "\n\006volume\030\006 \001(\005\022\n\n\002ts\030\007 \001(\003\"\370\002\n\016MarketFul" +
                        "lFeed\0229\n\004ltpc\030\001 \001(\0132+.com.upstox.marketd" +
                        "atafeeder.rpc.proto.LTPC\022G\n\013marketLevel\030" +
                        "\002 \001(\01322.com.upstox.marketdatafeeder.rpc." +
                        "proto.MarketLevel\022I\n\014optionGreeks\030\003 \001(\0132" +
                        "3.com.upstox.marketdatafeeder.rpc.proto." +
                        "OptionGreeks\022E\n\nmarketOHLC\030\004 \001(\01321.com.u" +
                        "pstox.marketdatafeeder.rpc.proto.MarketO" +
                        "HLC\022P\n\014eFeedDetails\030\005 \001(\0132:.com.upstox.m" +
                        "arketdatafeeder.rpc.proto.ExtendedFeedDe" +
                        "tails\"\274\001\n\rIndexFullFeed\0229\n\004ltpc\030\001 \001(\0132+." +
                        "com.upstox.marketdatafeeder.rpc.proto.LT" +
                        "PC\022E\n\nmarketOHLC\030\002 \001(\01321.com.upstox.mark" +
                        "etdatafeeder.rpc.proto.MarketOHLC\022\021\n\tlas" +
                        "tClose\030\003 \001(\001\022\n\n\002yh\030\004 \001(\001\022\n\n\002yl\030\005 \001(\001\"\257\001\n" +
                        "\010FullFeed\022I\n\010marketFF\030\001 \001(\01325.com.upstox" +
                        ".marketdatafeeder.rpc.proto.MarketFullFe" +
                        "edH\000\022G\n\007indexFF\030\002 \001(\01324.com.upstox.marke" +
                        "tdatafeeder.rpc.proto.IndexFullFeedH\000B\017\n" +
                        "\rFullFeedUnion\"\250\002\n\013OptionChain\0229\n\004ltpc\030\001" +
                        " \001(\0132+.com.upstox.marketdatafeeder.rpc.p" +
                        "roto.LTPC\022A\n\013bidAskQuote\030\002 \001(\0132,.com.ups" +
                        "tox.marketdatafeeder.rpc.proto.Quote\022I\n\014" +
                        "optionGreeks\030\003 \001(\01323.com.upstox.marketda" +
                        "tafeeder.rpc.proto.OptionGreeks\022P\n\014eFeed" +
                        "Details\030\004 \001(\0132:.com.upstox.marketdatafee" +
                        "der.rpc.proto.ExtendedFeedDetails\"\321\001\n\004Fe" +
                        "ed\022;\n\004ltpc\030\001 \001(\0132+.com.upstox.marketdata" +
                        "feeder.rpc.proto.LTPCH\000\022=\n\002ff\030\002 \001(\0132/.co" +
                        "m.upstox.marketdatafeeder.rpc.proto.Full" +
                        "FeedH\000\022@\n\002oc\030\003 \001(\01322.com.upstox.marketda" +
                        "tafeeder.rpc.proto.OptionChainH\000B\013\n\tFeed" +
                        "Union\"\363\001\n\014FeedResponse\0229\n\004type\030\001 \001(\0162+.c" +
                        "om.upstox.marketdatafeeder.rpc.proto.Typ" +
                        "e\022M\n\005feeds\030\002 \003(\0132>.com.upstox.marketdata" +
                        "feeder.rpc.proto.FeedResponse.FeedsEntry" +
                        "\032Y\n\nFeedsEntry\022\013\n\003key\030\001 \001(\t\022:\n\005value\030\002 \001" +
                        "(\0132+.com.upstox.marketdatafeeder.rpc.pro" +
                        "to.Feed:\0028\001*\'\n\004Type\022\020\n\014initial_feed\020\000\022\r\n" +
                        "\tlive_feed\020\001b\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_LTPC_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_LTPC_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_LTPC_descriptor,
                new java.lang.String[] { "Ltp", "Ltt", "Ltq", "Cp", });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketLevel_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketLevel_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketLevel_descriptor,
                new java.lang.String[] { "BidAskQuote", });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketOHLC_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketOHLC_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketOHLC_descriptor,
                new java.lang.String[] { "Ohlc", });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_Quote_descriptor =
                getDescriptor().getMessageTypes().get(3);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_Quote_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_Quote_descriptor,
                new java.lang.String[] { "Bq", "Bp", "Bno", "Aq", "Ap", "Ano", });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionGreeks_descriptor =
                getDescriptor().getMessageTypes().get(4);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionGreeks_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionGreeks_descriptor,
                new java.lang.String[] { "Op", "Up", "Iv", "Delta", "Theta", "Gamma", "Vega", "Rho", });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_ExtendedFeedDetails_descriptor =
                getDescriptor().getMessageTypes().get(5);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_ExtendedFeedDetails_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_ExtendedFeedDetails_descriptor,
                new java.lang.String[] { "Atp", "Cp", "Vtt", "Oi", "ChangeOi", "LastClose", "Tbq", "Tsq", "Close", "Lc", "Uc", "Yh", "Yl", "Fp", "Fv", "MbpBuy", "MbpSell", "Tv", "Dhoi", "Dloi", "Sp", "Poi", });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_OHLC_descriptor =
                getDescriptor().getMessageTypes().get(6);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_OHLC_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_OHLC_descriptor,
                new java.lang.String[] { "Interval", "Open", "High", "Low", "Close", "Volume", "Ts", });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketFullFeed_descriptor =
                getDescriptor().getMessageTypes().get(7);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketFullFeed_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_MarketFullFeed_descriptor,
                new java.lang.String[] { "Ltpc", "MarketLevel", "OptionGreeks", "MarketOHLC", "EFeedDetails", });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_IndexFullFeed_descriptor =
                getDescriptor().getMessageTypes().get(8);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_IndexFullFeed_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_IndexFullFeed_descriptor,
                new java.lang.String[] { "Ltpc", "MarketOHLC", "LastClose", "Yh", "Yl", });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_FullFeed_descriptor =
                getDescriptor().getMessageTypes().get(9);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_FullFeed_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_FullFeed_descriptor,
                new java.lang.String[] { "MarketFF", "IndexFF", "FullFeedUnion", });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionChain_descriptor =
                getDescriptor().getMessageTypes().get(10);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionChain_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_OptionChain_descriptor,
                new java.lang.String[] { "Ltpc", "BidAskQuote", "OptionGreeks", "EFeedDetails", });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_Feed_descriptor =
                getDescriptor().getMessageTypes().get(11);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_Feed_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_Feed_descriptor,
                new java.lang.String[] { "Ltpc", "Ff", "Oc", "FeedUnion", });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_descriptor =
                getDescriptor().getMessageTypes().get(12);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_descriptor,
                new java.lang.String[] { "Type", "Feeds", });
        internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_FeedsEntry_descriptor =
                internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_descriptor.getNestedTypes().get(0);
        internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_FeedsEntry_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_upstox_marketdatafeeder_rpc_proto_FeedResponse_FeedsEntry_descriptor,
                new java.lang.String[] { "Key", "Value", });
    }
}
