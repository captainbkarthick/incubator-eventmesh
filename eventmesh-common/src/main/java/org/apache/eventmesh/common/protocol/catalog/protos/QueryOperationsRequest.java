/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: catalog.proto

package org.apache.eventmesh.common.protocol.catalog.protos;

/**
 * Protobuf type {@code eventmesh.catalog.api.protocol.QueryOperationsRequest}
 */
@SuppressWarnings({"all"})
public final class QueryOperationsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:eventmesh.catalog.api.protocol.QueryOperationsRequest)
    QueryOperationsRequestOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use QueryOperationsRequest.newBuilder() to construct.
    private QueryOperationsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private QueryOperationsRequest() {
        serviceName_ = "";
        operationId_ = "";
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
        return new QueryOperationsRequest();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    private QueryOperationsRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new NullPointerException();
        }
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
                        String s = input.readStringRequireUtf8();

                        serviceName_ = s;
                        break;
                    }
                    case 18: {
                        String s = input.readStringRequireUtf8();

                        operationId_ = s;
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
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return EventmeshCatalogGrpc.internal_static_eventmesh_catalog_api_protocol_QueryOperationsRequest_descriptor;
    }

    @Override
    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return EventmeshCatalogGrpc.internal_static_eventmesh_catalog_api_protocol_QueryOperationsRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                QueryOperationsRequest.class, Builder.class);
    }

    public static final int SERVICE_NAME_FIELD_NUMBER = 1;
    private volatile Object serviceName_;

    /**
     * <code>string service_name = 1;</code>
     *
     * @return The serviceName.
     */
    @Override
    public String getServiceName() {
        Object ref = serviceName_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            serviceName_ = s;
            return s;
        }
    }

    /**
     * <code>string service_name = 1;</code>
     *
     * @return The bytes for serviceName.
     */
    @Override
    public com.google.protobuf.ByteString
    getServiceNameBytes() {
        Object ref = serviceName_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                    (String) ref);
            serviceName_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int OPERATION_ID_FIELD_NUMBER = 2;
    private volatile Object operationId_;

    /**
     * <code>string operation_id = 2;</code>
     *
     * @return The operationId.
     */
    @Override
    public String getOperationId() {
        Object ref = operationId_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            operationId_ = s;
            return s;
        }
    }

    /**
     * <code>string operation_id = 2;</code>
     *
     * @return The bytes for operationId.
     */
    @Override
    public com.google.protobuf.ByteString
    getOperationIdBytes() {
        Object ref = operationId_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8(
                    (String) ref);
            operationId_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) {
            return true;
        }
        if (isInitialized == 0) {
            return false;
        }

        memoizedIsInitialized = 1;
        return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
        throws java.io.IOException {
        if (!getServiceNameBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceName_);
        }
        if (!getOperationIdBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 2, operationId_);
        }
        unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) {
            return size;
        }

        size = 0;
        if (!getServiceNameBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceName_);
        }
        if (!getOperationIdBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, operationId_);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QueryOperationsRequest)) {
            return super.equals(obj);
        }
        QueryOperationsRequest other = (QueryOperationsRequest) obj;

        if (!getServiceName()
            .equals(other.getServiceName())) {
            return false;
        }
        if (!getOperationId()
            .equals(other.getOperationId())) {
            return false;
        }
        if (!unknownFields.equals(other.unknownFields)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getServiceName().hashCode();
        hash = (37 * hash) + OPERATION_ID_FIELD_NUMBER;
        hash = (53 * hash) + getOperationId().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static QueryOperationsRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static QueryOperationsRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static QueryOperationsRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static QueryOperationsRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static QueryOperationsRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static QueryOperationsRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static QueryOperationsRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static QueryOperationsRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static QueryOperationsRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input);
    }

    public static QueryOperationsRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static QueryOperationsRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input);
    }

    public static QueryOperationsRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
            .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(QueryOperationsRequest prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
            ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code eventmesh.catalog.api.protocol.QueryOperationsRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:eventmesh.catalog.api.protocol.QueryOperationsRequest)
        QueryOperationsRequestOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return EventmeshCatalogGrpc.internal_static_eventmesh_catalog_api_protocol_QueryOperationsRequest_descriptor;
        }

        @Override
        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return EventmeshCatalogGrpc.internal_static_eventmesh_catalog_api_protocol_QueryOperationsRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    QueryOperationsRequest.class, Builder.class);
        }

        // Construct using org.apache.eventmesh.common.protocol.catalog.protos.QueryOperationsRequest.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
            BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
            }
        }

        @Override
        public Builder clear() {
            super.clear();
            serviceName_ = "";

            operationId_ = "";

            return this;
        }

        @Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return EventmeshCatalogGrpc.internal_static_eventmesh_catalog_api_protocol_QueryOperationsRequest_descriptor;
        }

        @Override
        public QueryOperationsRequest getDefaultInstanceForType() {
            return QueryOperationsRequest.getDefaultInstance();
        }

        @Override
        public QueryOperationsRequest build() {
            QueryOperationsRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @Override
        public QueryOperationsRequest buildPartial() {
            QueryOperationsRequest result = new QueryOperationsRequest(this);
            result.serviceName_ = serviceName_;
            result.operationId_ = operationId_;
            onBuilt();
            return result;
        }

        @Override
        public Builder clone() {
            return super.clone();
        }

        @Override
        public Builder setField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
            return super.setField(field, value);
        }

        @Override
        public Builder clearField(
            com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        @Override
        public Builder clearOneof(
            com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        @Override
        public Builder setRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            int index, Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @Override
        public Builder addRepeatedField(
            com.google.protobuf.Descriptors.FieldDescriptor field,
            Object value) {
            return super.addRepeatedField(field, value);
        }

        @Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof QueryOperationsRequest) {
                return mergeFrom((QueryOperationsRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(QueryOperationsRequest other) {
            if (other == QueryOperationsRequest.getDefaultInstance()) {
                return this;
            }
            if (!other.getServiceName().isEmpty()) {
                serviceName_ = other.serviceName_;
                onChanged();
            }
            if (!other.getOperationId().isEmpty()) {
                operationId_ = other.operationId_;
                onChanged();
            }
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        @Override
        public final boolean isInitialized() {
            return true;
        }

        @Override
        public Builder mergeFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            QueryOperationsRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (QueryOperationsRequest) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private Object serviceName_ = "";

        /**
         * <code>string service_name = 1;</code>
         *
         * @return The serviceName.
         */
        public String getServiceName() {
            Object ref = serviceName_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                serviceName_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>string service_name = 1;</code>
         *
         * @return The bytes for serviceName.
         */
        public com.google.protobuf.ByteString
        getServiceNameBytes() {
            Object ref = serviceName_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (String) ref);
                serviceName_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string service_name = 1;</code>
         *
         * @param value The serviceName to set.
         * @return This builder for chaining.
         */
        public Builder setServiceName(
            String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            serviceName_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string service_name = 1;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearServiceName() {

            serviceName_ = getDefaultInstance().getServiceName();
            onChanged();
            return this;
        }

        /**
         * <code>string service_name = 1;</code>
         *
         * @param value The bytes for serviceName to set.
         * @return This builder for chaining.
         */
        public Builder setServiceNameBytes(
            com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            serviceName_ = value;
            onChanged();
            return this;
        }

        private Object operationId_ = "";

        /**
         * <code>string operation_id = 2;</code>
         *
         * @return The operationId.
         */
        public String getOperationId() {
            Object ref = operationId_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                operationId_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>string operation_id = 2;</code>
         *
         * @return The bytes for operationId.
         */
        public com.google.protobuf.ByteString
        getOperationIdBytes() {
            Object ref = operationId_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                        (String) ref);
                operationId_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>string operation_id = 2;</code>
         *
         * @param value The operationId to set.
         * @return This builder for chaining.
         */
        public Builder setOperationId(
            String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            operationId_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>string operation_id = 2;</code>
         *
         * @return This builder for chaining.
         */
        public Builder clearOperationId() {

            operationId_ = getDefaultInstance().getOperationId();
            onChanged();
            return this;
        }

        /**
         * <code>string operation_id = 2;</code>
         *
         * @param value The bytes for operationId to set.
         * @return This builder for chaining.
         */
        public Builder setOperationIdBytes(
            com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            operationId_ = value;
            onChanged();
            return this;
        }

        @Override
        public final Builder setUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @Override
        public final Builder mergeUnknownFields(
            final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:eventmesh.catalog.api.protocol.QueryOperationsRequest)
    }

    // @@protoc_insertion_point(class_scope:eventmesh.catalog.api.protocol.QueryOperationsRequest)
    private static final QueryOperationsRequest DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new QueryOperationsRequest();
    }

    public static QueryOperationsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QueryOperationsRequest>
        PARSER = new com.google.protobuf.AbstractParser<QueryOperationsRequest>() {
        @Override
        public QueryOperationsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return new QueryOperationsRequest(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<QueryOperationsRequest> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<QueryOperationsRequest> getParserForType() {
        return PARSER;
    }

    @Override
    public QueryOperationsRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

