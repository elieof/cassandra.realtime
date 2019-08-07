// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.iam.v1.iam_policy

/** Request message for `GetIamPolicy` method.
  *
  * @param resource
  *   REQUIRED: The resource for which the policy is being requested.
  *   `resource` is usually specified as a path. For example, a Project
  *   resource is specified as `projects/{project}`.
  */
@SerialVersionUID(0L)
final case class GetIamPolicyRequest(
    resource: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[GetIamPolicyRequest] with scalapb.lenses.Updatable[GetIamPolicyRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = resource
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = resource
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.iam.v1.iam_policy.GetIamPolicyRequest = {
      var __resource = this.resource
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __resource = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.iam.v1.iam_policy.GetIamPolicyRequest(
          resource = __resource
      )
    }
    def withResource(__v: _root_.scala.Predef.String): GetIamPolicyRequest = copy(resource = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = resource
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(resource)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.iam.v1.iam_policy.GetIamPolicyRequest
}

object GetIamPolicyRequest extends scalapb.GeneratedMessageCompanion[com.google.iam.v1.iam_policy.GetIamPolicyRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.iam.v1.iam_policy.GetIamPolicyRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.iam.v1.iam_policy.GetIamPolicyRequest = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.iam.v1.iam_policy.GetIamPolicyRequest(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.iam.v1.iam_policy.GetIamPolicyRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.iam.v1.iam_policy.GetIamPolicyRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = IamPolicyProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = IamPolicyProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.iam.v1.iam_policy.GetIamPolicyRequest(
  )
  implicit class GetIamPolicyRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.iam.v1.iam_policy.GetIamPolicyRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.iam.v1.iam_policy.GetIamPolicyRequest](_l) {
    def resource: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.resource)((c_, f_) => c_.copy(resource = f_))
  }
  final val RESOURCE_FIELD_NUMBER = 1
  def of(
    resource: _root_.scala.Predef.String
  ): _root_.com.google.iam.v1.iam_policy.GetIamPolicyRequest = _root_.com.google.iam.v1.iam_policy.GetIamPolicyRequest(
    resource
  )
}