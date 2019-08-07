
// Generated by Akka gRPC. DO NOT EDIT.
package com.google.iam.v1.iam_policy

trait IAMPolicy {
  
  def setIamPolicy(in: com.google.iam.v1.iam_policy.SetIamPolicyRequest): scala.concurrent.Future[com.google.iam.v1.policy.Policy]
  
  def getIamPolicy(in: com.google.iam.v1.iam_policy.GetIamPolicyRequest): scala.concurrent.Future[com.google.iam.v1.policy.Policy]
  
  def testIamPermissions(in: com.google.iam.v1.iam_policy.TestIamPermissionsRequest): scala.concurrent.Future[com.google.iam.v1.iam_policy.TestIamPermissionsResponse]
  
}

object IAMPolicy {
  val name = "google.iam.v1.IAMPolicy"

  object Serializers {
    import akka.grpc.scaladsl.ScalapbProtobufSerializer
    
    val TestIamPermissionsRequestSerializer = new ScalapbProtobufSerializer(com.google.iam.v1.iam_policy.TestIamPermissionsRequest.messageCompanion)
    
    val PolicySerializer = new ScalapbProtobufSerializer(com.google.iam.v1.policy.Policy.messageCompanion)
    
    val TestIamPermissionsResponseSerializer = new ScalapbProtobufSerializer(com.google.iam.v1.iam_policy.TestIamPermissionsResponse.messageCompanion)
    
    val GetIamPolicyRequestSerializer = new ScalapbProtobufSerializer(com.google.iam.v1.iam_policy.GetIamPolicyRequest.messageCompanion)
    
    val SetIamPolicyRequestSerializer = new ScalapbProtobufSerializer(com.google.iam.v1.iam_policy.SetIamPolicyRequest.messageCompanion)
    
  }
}