// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: abstractMessage.proto

package io.seata.codec.protobuf.generated;

public final class AbstractMessage {
  private AbstractMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_seata_protocol_protobuf_AbstractMessageProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_seata_protocol_protobuf_AbstractMessageProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025abstractMessage.proto\022\032io.seata.protoc" +
      "ol.protobuf\032\021messageType.proto\"Y\n\024Abstra" +
      "ctMessageProto\022A\n\013messageType\030\001 \001(\0162,.io" +
      ".seata.protocol.protobuf.MessageTypeProt" +
      "oB6\n!io.seata.codec.protobuf.generatedB\017" +
      "AbstractMessageP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.seata.codec.protobuf.generated.MessageType.getDescriptor(),
        }, assigner);
    internal_static_io_seata_protocol_protobuf_AbstractMessageProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_seata_protocol_protobuf_AbstractMessageProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_seata_protocol_protobuf_AbstractMessageProto_descriptor,
        new java.lang.String[] { "MessageType", });
    io.seata.codec.protobuf.generated.MessageType.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
