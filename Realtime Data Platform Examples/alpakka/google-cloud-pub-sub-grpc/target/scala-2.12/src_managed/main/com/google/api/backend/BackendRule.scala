// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api.backend

/** A backend rule provides configuration for an individual API element.
  *
  * @param selector
  *   Selects the methods to which this rule applies.
  *  
  *   Refer to [selector][google.api.DocumentationRule.selector] for syntax details.
  * @param address
  *   The address of the API backend.
  * @param deadline
  *   The number of seconds to wait for a response from a request.  The
  *   default depends on the deployment context.
  */
@SerialVersionUID(0L)
final case class BackendRule(
    selector: _root_.scala.Predef.String = "",
    address: _root_.scala.Predef.String = "",
    deadline: _root_.scala.Double = 0.0
    ) extends scalapb.GeneratedMessage with scalapb.Message[BackendRule] with scalapb.lenses.Updatable[BackendRule] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = selector
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = address
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = deadline
        if (__value != 0.0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeDoubleSize(3, __value)
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
        val __v = selector
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = address
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = deadline
        if (__v != 0.0) {
          _output__.writeDouble(3, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.backend.BackendRule = {
      var __selector = this.selector
      var __address = this.address
      var __deadline = this.deadline
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __selector = _input__.readString()
          case 18 =>
            __address = _input__.readString()
          case 25 =>
            __deadline = _input__.readDouble()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.backend.BackendRule(
          selector = __selector,
          address = __address,
          deadline = __deadline
      )
    }
    def withSelector(__v: _root_.scala.Predef.String): BackendRule = copy(selector = __v)
    def withAddress(__v: _root_.scala.Predef.String): BackendRule = copy(address = __v)
    def withDeadline(__v: _root_.scala.Double): BackendRule = copy(deadline = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = selector
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = address
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = deadline
          if (__t != 0.0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(selector)
        case 2 => _root_.scalapb.descriptors.PString(address)
        case 3 => _root_.scalapb.descriptors.PDouble(deadline)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.backend.BackendRule
}

object BackendRule extends scalapb.GeneratedMessageCompanion[com.google.api.backend.BackendRule] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.backend.BackendRule] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.backend.BackendRule = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.backend.BackendRule(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), 0.0).asInstanceOf[_root_.scala.Double]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.backend.BackendRule] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.backend.BackendRule(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Double]).getOrElse(0.0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = BackendProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = BackendProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.backend.BackendRule(
  )
  implicit class BackendRuleLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.backend.BackendRule]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.backend.BackendRule](_l) {
    def selector: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.selector)((c_, f_) => c_.copy(selector = f_))
    def address: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.address)((c_, f_) => c_.copy(address = f_))
    def deadline: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Double] = field(_.deadline)((c_, f_) => c_.copy(deadline = f_))
  }
  final val SELECTOR_FIELD_NUMBER = 1
  final val ADDRESS_FIELD_NUMBER = 2
  final val DEADLINE_FIELD_NUMBER = 3
  def of(
    selector: _root_.scala.Predef.String,
    address: _root_.scala.Predef.String,
    deadline: _root_.scala.Double
  ): _root_.com.google.api.backend.BackendRule = _root_.com.google.api.backend.BackendRule(
    selector,
    address,
    deadline
  )
}