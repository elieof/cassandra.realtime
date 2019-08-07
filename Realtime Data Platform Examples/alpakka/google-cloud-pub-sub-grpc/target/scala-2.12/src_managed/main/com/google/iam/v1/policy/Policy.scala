// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.iam.v1.policy

/** Defines an Identity and Access Management (IAM) policy. It is used to
  * specify access control policies for Cloud Platform resources.
  *
  *
  * A `Policy` consists of a list of `bindings`. A `Binding` binds a list of
  * `members` to a `role`, where the members can be user accounts, Google groups,
  * Google domains, and service accounts. A `role` is a named list of permissions
  * defined by IAM.
  *
  * **Example**
  *
  *     {
  *       "bindings": [
  *         {
  *           "role": "roles/owner",
  *           "members": [
  *             "user:mike&#64;example.com",
  *             "group:admins&#64;example.com",
  *             "domain:google.com",
  *             "serviceAccount:my-other-app&#64;appspot.gserviceaccount.com",
  *           ]
  *         },
  *         {
  *           "role": "roles/viewer",
  *           "members": ["user:sean&#64;example.com"]
  *         }
  *       ]
  *     }
  *
  * For a description of IAM and its features, see the
  * [IAM developer's guide](https://cloud.google.com/iam).
  *
  * @param version
  *   Version of the `Policy`. The default version is 0.
  * @param bindings
  *   Associates a list of `members` to a `role`.
  *   Multiple `bindings` must not be specified for the same `role`.
  *   `bindings` with no members will result in an error.
  * @param etag
  *   `etag` is used for optimistic concurrency control as a way to help
  *   prevent simultaneous updates of a policy from overwriting each other.
  *   It is strongly suggested that systems make use of the `etag` in the
  *   read-modify-write cycle to perform policy updates in order to avoid race
  *   conditions: An `etag` is returned in the response to `getIamPolicy`, and
  *   systems are expected to put that etag in the request to `setIamPolicy` to
  *   ensure that their change will be applied to the same version of the policy.
  *  
  *   If no `etag` is provided in the call to `setIamPolicy`, then the existing
  *   policy is overwritten blindly.
  */
@SerialVersionUID(0L)
final case class Policy(
    version: _root_.scala.Int = 0,
    bindings: _root_.scala.collection.Seq[com.google.iam.v1.policy.Binding] = _root_.scala.collection.Seq.empty,
    etag: _root_.com.google.protobuf.ByteString = _root_.com.google.protobuf.ByteString.EMPTY
    ) extends scalapb.GeneratedMessage with scalapb.Message[Policy] with scalapb.lenses.Updatable[Policy] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = version
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
        }
      };
      bindings.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = etag
        if (__value != _root_.com.google.protobuf.ByteString.EMPTY) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBytesSize(3, __value)
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
        val __v = version
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      {
        val __v = etag
        if (__v != _root_.com.google.protobuf.ByteString.EMPTY) {
          _output__.writeBytes(3, __v)
        }
      };
      bindings.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.iam.v1.policy.Policy = {
      var __version = this.version
      val __bindings = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.iam.v1.policy.Binding] ++= this.bindings)
      var __etag = this.etag
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __version = _input__.readInt32()
          case 34 =>
            __bindings += _root_.scalapb.LiteParser.readMessage(_input__, com.google.iam.v1.policy.Binding.defaultInstance)
          case 26 =>
            __etag = _input__.readBytes()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.iam.v1.policy.Policy(
          version = __version,
          bindings = __bindings.result(),
          etag = __etag
      )
    }
    def withVersion(__v: _root_.scala.Int): Policy = copy(version = __v)
    def clearBindings = copy(bindings = _root_.scala.collection.Seq.empty)
    def addBindings(__vs: com.google.iam.v1.policy.Binding*): Policy = addAllBindings(__vs)
    def addAllBindings(__vs: TraversableOnce[com.google.iam.v1.policy.Binding]): Policy = copy(bindings = bindings ++ __vs)
    def withBindings(__v: _root_.scala.collection.Seq[com.google.iam.v1.policy.Binding]): Policy = copy(bindings = __v)
    def withEtag(__v: _root_.com.google.protobuf.ByteString): Policy = copy(etag = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = version
          if (__t != 0) __t else null
        }
        case 4 => bindings
        case 3 => {
          val __t = etag
          if (__t != _root_.com.google.protobuf.ByteString.EMPTY) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(version)
        case 4 => _root_.scalapb.descriptors.PRepeated(bindings.map(_.toPMessage)(_root_.scala.collection.breakOut))
        case 3 => _root_.scalapb.descriptors.PByteString(etag)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.iam.v1.policy.Policy
}

object Policy extends scalapb.GeneratedMessageCompanion[com.google.iam.v1.policy.Policy] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.iam.v1.policy.Policy] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.iam.v1.policy.Policy = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.iam.v1.policy.Policy(
      __fieldsMap.getOrElse(__fields.get(0), 0).asInstanceOf[_root_.scala.Int],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.iam.v1.policy.Binding]],
      __fieldsMap.getOrElse(__fields.get(2), _root_.com.google.protobuf.ByteString.EMPTY).asInstanceOf[_root_.com.google.protobuf.ByteString]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.iam.v1.policy.Policy] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.iam.v1.policy.Policy(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.collection.Seq[com.google.iam.v1.policy.Binding]]).getOrElse(_root_.scala.collection.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.com.google.protobuf.ByteString]).getOrElse(_root_.com.google.protobuf.ByteString.EMPTY)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = PolicyProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = PolicyProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 4 => __out = com.google.iam.v1.policy.Binding
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.iam.v1.policy.Policy(
  )
  implicit class PolicyLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.iam.v1.policy.Policy]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.iam.v1.policy.Policy](_l) {
    def version: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.version)((c_, f_) => c_.copy(version = f_))
    def bindings: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.iam.v1.policy.Binding]] = field(_.bindings)((c_, f_) => c_.copy(bindings = f_))
    def etag: _root_.scalapb.lenses.Lens[UpperPB, _root_.com.google.protobuf.ByteString] = field(_.etag)((c_, f_) => c_.copy(etag = f_))
  }
  final val VERSION_FIELD_NUMBER = 1
  final val BINDINGS_FIELD_NUMBER = 4
  final val ETAG_FIELD_NUMBER = 3
  def of(
    version: _root_.scala.Int,
    bindings: _root_.scala.collection.Seq[com.google.iam.v1.policy.Binding],
    etag: _root_.com.google.protobuf.ByteString
  ): _root_.com.google.iam.v1.policy.Policy = _root_.com.google.iam.v1.policy.Policy(
    version,
    bindings,
    etag
  )
}