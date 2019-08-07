
// Generated by Akka gRPC. DO NOT EDIT.
package com.google.longrunning.operations

trait Operations {
  
  def listOperations(in: com.google.longrunning.operations.ListOperationsRequest): scala.concurrent.Future[com.google.longrunning.operations.ListOperationsResponse]
  
  def getOperation(in: com.google.longrunning.operations.GetOperationRequest): scala.concurrent.Future[com.google.longrunning.operations.Operation]
  
  def deleteOperation(in: com.google.longrunning.operations.DeleteOperationRequest): scala.concurrent.Future[com.google.protobuf.empty.Empty]
  
  def cancelOperation(in: com.google.longrunning.operations.CancelOperationRequest): scala.concurrent.Future[com.google.protobuf.empty.Empty]
  
}

object Operations {
  val name = "google.longrunning.Operations"

  object Serializers {
    import akka.grpc.scaladsl.ScalapbProtobufSerializer
    
    val OperationSerializer = new ScalapbProtobufSerializer(com.google.longrunning.operations.Operation.messageCompanion)
    
    val GetOperationRequestSerializer = new ScalapbProtobufSerializer(com.google.longrunning.operations.GetOperationRequest.messageCompanion)
    
    val DeleteOperationRequestSerializer = new ScalapbProtobufSerializer(com.google.longrunning.operations.DeleteOperationRequest.messageCompanion)
    
    val ListOperationsRequestSerializer = new ScalapbProtobufSerializer(com.google.longrunning.operations.ListOperationsRequest.messageCompanion)
    
    val ListOperationsResponseSerializer = new ScalapbProtobufSerializer(com.google.longrunning.operations.ListOperationsResponse.messageCompanion)
    
    val CancelOperationRequestSerializer = new ScalapbProtobufSerializer(com.google.longrunning.operations.CancelOperationRequest.messageCompanion)
    
    val EmptySerializer = new ScalapbProtobufSerializer(com.google.protobuf.empty.Empty.messageCompanion)
    
  }
}