@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.wkt

data class Any(
    val typeUrl: String = "",
    val value: pbandk.ByteArr = pbandk.ByteArr.empty,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    @kotlin.native.concurrent.ThreadLocal
    companion object : pbandk.Message.Companion<Any> {
        val defaultInstance by lazy { Any() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Any.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Any> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<Any, *>>(2).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "type_url",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "typeUrl",
                        value = Any::typeUrl
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "value",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Primitive.Bytes(),
                        jsonName = "value",
                        value = Any::value
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = Any::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun Any?.orDefault() = this ?: Any.defaultInstance

private fun Any.protoMergeImpl(plus: pbandk.Message?): Any = (plus as? Any)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Any.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Any {
    var typeUrl = ""
    var value: pbandk.ByteArr = pbandk.ByteArr.empty

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> typeUrl = _fieldValue as String
            2 -> value = _fieldValue as pbandk.ByteArr
        }
    }
    return Any(typeUrl, value, unknownFields)
}
