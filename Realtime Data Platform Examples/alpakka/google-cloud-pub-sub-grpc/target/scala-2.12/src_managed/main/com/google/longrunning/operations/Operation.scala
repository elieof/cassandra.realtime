// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.longrunning.operations

/** This resource represents a long-running operation that is the result of a
  * network API call.
  *
  * @param name
  *   The server-assigned name, which is only unique within the same service that
  *   originally returns it. If you use the default HTTP mapping, the
  *   `name` should have the format of `operations/some/unique/name`.
  * @param metadata
  *   Service-specific metadata associated with the operation.  It typically
  *   contains progress information and common metadata such as create time.
  *   Some services might not provide such metadata.  Any method that returns a
  *   long-running operation should document the metadata type, if any.
  * @param done
  *   If the value is `false`, it means the operation is still in progress.
  *   If true, the operation is completed, and either `error` or `response` is
  *   available.
  */
@SerialVersionUID(0L)
final case class Operation(
    name: _root_.scala.Predef.String = "",
    metadata: _root_.scala.Option[com.google.protobuf.any.Any] = None,
    done: _root_.scala.Boolean = false,
    result: com.google.longrunning.operations.Operation.Result = com.google.longrunning.operations.Operation.Result.Empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[Operation] with scalapb.lenses.Updatable[Operation] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      if (metadata.isDefined) {
        val __value = metadata.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = done
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(3, __value)
        }
      };
      if (result.error.isDefined) {
        val __value = result.error.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (result.response.isDefined) {
        val __value = result.response.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      metadata.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = done
        if (__v != false) {
          _output__.writeBool(3, __v)
        }
      };
      result.error.foreach { __v =>
        val __m = __v
        _output__.writeTag(4, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      result.response.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.longrunning.operations.Operation = {
      var __name = this.name
      var __metadata = this.metadata
      var __done = this.done
      var __result = this.result
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __metadata = Option(_root_.scalapb.LiteParser.readMessage(_input__, __metadata.getOrElse(com.google.protobuf.any.Any.defaultInstance)))
          case 24 =>
            __done = _input__.readBool()
          case 34 =>
            __result = com.google.longrunning.operations.Operation.Result.Error(_root_.scalapb.LiteParser.readMessage(_input__, result.error.getOrElse(com.google.rpc.status.Status.defaultInstance)))
          case 42 =>
            __result = com.google.longrunning.operations.Operation.Result.Response(_root_.scalapb.LiteParser.readMessage(_input__, result.response.getOrElse(com.google.protobuf.any.Any.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.longrunning.operations.Operation(
          name = __name,
          metadata = __metadata,
          done = __done,
          result = __result
      )
    }
    def withName(__v: _root_.scala.Predef.String): Operation = copy(name = __v)
    def getMetadata: com.google.protobuf.any.Any = metadata.getOrElse(com.google.protobuf.any.Any.defaultInstance)
    def clearMetadata: Operation = copy(metadata = None)
    def withMetadata(__v: com.google.protobuf.any.Any): Operation = copy(metadata = Option(__v))
    def withDone(__v: _root_.scala.Boolean): Operation = copy(done = __v)
    def getError: com.google.rpc.status.Status = result.error.getOrElse(com.google.rpc.status.Status.defaultInstance)
    def withError(__v: com.google.rpc.status.Status): Operation = copy(result = com.google.longrunning.operations.Operation.Result.Error(__v))
    def getResponse: com.google.protobuf.any.Any = result.response.getOrElse(com.google.protobuf.any.Any.defaultInstance)
    def withResponse(__v: com.google.protobuf.any.Any): Operation = copy(result = com.google.longrunning.operations.Operation.Result.Response(__v))
    def clearResult: Operation = copy(result = com.google.longrunning.operations.Operation.Result.Empty)
    def withResult(__v: com.google.longrunning.operations.Operation.Result): Operation = copy(result = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => metadata.orNull
        case 3 => {
          val __t = done
          if (__t != false) __t else null
        }
        case 4 => result.error.orNull
        case 5 => result.response.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => metadata.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => _root_.scalapb.descriptors.PBoolean(done)
        case 4 => result.error.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 5 => result.response.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.longrunning.operations.Operation
}

object Operation extends scalapb.GeneratedMessageCompanion[com.google.longrunning.operations.Operation] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.longrunning.operations.Operation] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.longrunning.operations.Operation = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.longrunning.operations.Operation(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[com.google.protobuf.any.Any]],
      __fieldsMap.getOrElse(__fields.get(2), false).asInstanceOf[_root_.scala.Boolean],
      result = __fieldsMap.get(__fields.get(3)).asInstanceOf[_root_.scala.Option[com.google.rpc.status.Status]].map(com.google.longrunning.operations.Operation.Result.Error)
    .orElse[com.google.longrunning.operations.Operation.Result](__fieldsMap.get(__fields.get(4)).asInstanceOf[_root_.scala.Option[com.google.protobuf.any.Any]].map(com.google.longrunning.operations.Operation.Result.Response))
    .getOrElse(com.google.longrunning.operations.Operation.Result.Empty)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.longrunning.operations.Operation] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.longrunning.operations.Operation(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.any.Any]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        result = __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).flatMap(_.as[_root_.scala.Option[com.google.rpc.status.Status]]).map(com.google.longrunning.operations.Operation.Result.Error)
    .orElse[com.google.longrunning.operations.Operation.Result](__fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.any.Any]]).map(com.google.longrunning.operations.Operation.Result.Response))
    .getOrElse(com.google.longrunning.operations.Operation.Result.Empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = OperationsProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = OperationsProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.any.Any
      case 4 => __out = com.google.rpc.status.Status
      case 5 => __out = com.google.protobuf.any.Any
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.longrunning.operations.Operation(
  )
  sealed trait Result extends _root_.scalapb.GeneratedOneof {
    def isEmpty: _root_.scala.Boolean = false
    def isDefined: _root_.scala.Boolean = true
    def isError: _root_.scala.Boolean = false
    def isResponse: _root_.scala.Boolean = false
    def error: _root_.scala.Option[com.google.rpc.status.Status] = None
    def response: _root_.scala.Option[com.google.protobuf.any.Any] = None
  }
  object Result extends {
    @SerialVersionUID(0L)
    case object Empty extends com.google.longrunning.operations.Operation.Result {
      type ValueType = _root_.scala.Nothing
      override def isEmpty: _root_.scala.Boolean = true
      override def isDefined: _root_.scala.Boolean = false
      override def number: _root_.scala.Int = 0
      override def value: _root_.scala.Nothing = throw new java.util.NoSuchElementException("Empty.value")
    }
  
    @SerialVersionUID(0L)
    final case class Error(value: com.google.rpc.status.Status) extends com.google.longrunning.operations.Operation.Result {
      type ValueType = com.google.rpc.status.Status
      override def isError: _root_.scala.Boolean = true
      override def error: _root_.scala.Option[com.google.rpc.status.Status] = Some(value)
      override def number: _root_.scala.Int = 4
    }
    @SerialVersionUID(0L)
    final case class Response(value: com.google.protobuf.any.Any) extends com.google.longrunning.operations.Operation.Result {
      type ValueType = com.google.protobuf.any.Any
      override def isResponse: _root_.scala.Boolean = true
      override def response: _root_.scala.Option[com.google.protobuf.any.Any] = Some(value)
      override def number: _root_.scala.Int = 5
    }
  }
  implicit class OperationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.longrunning.operations.Operation]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.longrunning.operations.Operation](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def metadata: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.any.Any] = field(_.getMetadata)((c_, f_) => c_.copy(metadata = Option(f_)))
    def optionalMetadata: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.any.Any]] = field(_.metadata)((c_, f_) => c_.copy(metadata = f_))
    def done: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.done)((c_, f_) => c_.copy(done = f_))
    def error: _root_.scalapb.lenses.Lens[UpperPB, com.google.rpc.status.Status] = field(_.getError)((c_, f_) => c_.copy(result = com.google.longrunning.operations.Operation.Result.Error(f_)))
    def response: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.any.Any] = field(_.getResponse)((c_, f_) => c_.copy(result = com.google.longrunning.operations.Operation.Result.Response(f_)))
    def result: _root_.scalapb.lenses.Lens[UpperPB, com.google.longrunning.operations.Operation.Result] = field(_.result)((c_, f_) => c_.copy(result = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val METADATA_FIELD_NUMBER = 2
  final val DONE_FIELD_NUMBER = 3
  final val ERROR_FIELD_NUMBER = 4
  final val RESPONSE_FIELD_NUMBER = 5
  def of(
    name: _root_.scala.Predef.String,
    metadata: _root_.scala.Option[com.google.protobuf.any.Any],
    done: _root_.scala.Boolean,
    result: com.google.longrunning.operations.Operation.Result
  ): _root_.com.google.longrunning.operations.Operation = _root_.com.google.longrunning.operations.Operation(
    name,
    metadata,
    done,
    result
  )
}