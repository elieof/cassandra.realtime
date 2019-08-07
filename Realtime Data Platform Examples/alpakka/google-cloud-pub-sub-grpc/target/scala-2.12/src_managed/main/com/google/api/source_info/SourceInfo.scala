// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api.source_info

/** Source information used to create a Service Config
  *
  * @param sourceFiles
  *   All files used during config generation.
  */
@SerialVersionUID(0L)
final case class SourceInfo(
    sourceFiles: _root_.scala.collection.Seq[com.google.protobuf.any.Any] = _root_.scala.collection.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[SourceInfo] with scalapb.lenses.Updatable[SourceInfo] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      sourceFiles.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
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
      sourceFiles.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.source_info.SourceInfo = {
      val __sourceFiles = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.protobuf.any.Any] ++= this.sourceFiles)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __sourceFiles += _root_.scalapb.LiteParser.readMessage(_input__, com.google.protobuf.any.Any.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.source_info.SourceInfo(
          sourceFiles = __sourceFiles.result()
      )
    }
    def clearSourceFiles = copy(sourceFiles = _root_.scala.collection.Seq.empty)
    def addSourceFiles(__vs: com.google.protobuf.any.Any*): SourceInfo = addAllSourceFiles(__vs)
    def addAllSourceFiles(__vs: TraversableOnce[com.google.protobuf.any.Any]): SourceInfo = copy(sourceFiles = sourceFiles ++ __vs)
    def withSourceFiles(__v: _root_.scala.collection.Seq[com.google.protobuf.any.Any]): SourceInfo = copy(sourceFiles = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => sourceFiles
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(sourceFiles.map(_.toPMessage)(_root_.scala.collection.breakOut))
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.source_info.SourceInfo
}

object SourceInfo extends scalapb.GeneratedMessageCompanion[com.google.api.source_info.SourceInfo] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.source_info.SourceInfo] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.source_info.SourceInfo = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.source_info.SourceInfo(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.collection.Seq[com.google.protobuf.any.Any]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.source_info.SourceInfo] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.source_info.SourceInfo(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.collection.Seq[com.google.protobuf.any.Any]]).getOrElse(_root_.scala.collection.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = SourceInfoProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = SourceInfoProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.any.Any
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.source_info.SourceInfo(
  )
  implicit class SourceInfoLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.source_info.SourceInfo]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.source_info.SourceInfo](_l) {
    def sourceFiles: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.Seq[com.google.protobuf.any.Any]] = field(_.sourceFiles)((c_, f_) => c_.copy(sourceFiles = f_))
  }
  final val SOURCE_FILES_FIELD_NUMBER = 1
  def of(
    sourceFiles: _root_.scala.collection.Seq[com.google.protobuf.any.Any]
  ): _root_.com.google.api.source_info.SourceInfo = _root_.com.google.api.source_info.SourceInfo(
    sourceFiles
  )
}