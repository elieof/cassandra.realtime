
// Generated by Akka gRPC. DO NOT EDIT.
package com.google.longrunning;

import akka.grpc.ProtobufSerializer;
import akka.grpc.javadsl.GoogleProtobufSerializer;

public interface Operations {
  
  java.util.concurrent.CompletionStage<com.google.longrunning.ListOperationsResponse> listOperations(com.google.longrunning.ListOperationsRequest in);
  
  java.util.concurrent.CompletionStage<com.google.longrunning.Operation> getOperation(com.google.longrunning.GetOperationRequest in);
  
  java.util.concurrent.CompletionStage<com.google.protobuf.Empty> deleteOperation(com.google.longrunning.DeleteOperationRequest in);
  
  java.util.concurrent.CompletionStage<com.google.protobuf.Empty> cancelOperation(com.google.longrunning.CancelOperationRequest in);
  

  static String name = "google.longrunning.Operations";

  public static class Serializers {
    
      public static ProtobufSerializer<com.google.longrunning.CancelOperationRequest> CancelOperationRequestSerializer = new GoogleProtobufSerializer<>(com.google.longrunning.CancelOperationRequest.class);
    
      public static ProtobufSerializer<com.google.longrunning.ListOperationsResponse> ListOperationsResponseSerializer = new GoogleProtobufSerializer<>(com.google.longrunning.ListOperationsResponse.class);
    
      public static ProtobufSerializer<com.google.longrunning.DeleteOperationRequest> DeleteOperationRequestSerializer = new GoogleProtobufSerializer<>(com.google.longrunning.DeleteOperationRequest.class);
    
      public static ProtobufSerializer<com.google.protobuf.Empty> EmptySerializer = new GoogleProtobufSerializer<>(com.google.protobuf.Empty.class);
    
      public static ProtobufSerializer<com.google.longrunning.ListOperationsRequest> ListOperationsRequestSerializer = new GoogleProtobufSerializer<>(com.google.longrunning.ListOperationsRequest.class);
    
      public static ProtobufSerializer<com.google.longrunning.GetOperationRequest> GetOperationRequestSerializer = new GoogleProtobufSerializer<>(com.google.longrunning.GetOperationRequest.class);
    
      public static ProtobufSerializer<com.google.longrunning.Operation> OperationSerializer = new GoogleProtobufSerializer<>(com.google.longrunning.Operation.class);
    
  }
}