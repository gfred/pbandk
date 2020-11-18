package pbandk

import pbandk.wkt.FieldOptions
import kotlin.reflect.KProperty0
import kotlin.reflect.KProperty1

class FieldDescriptor<M : Message, T>(
    messageDescriptor: KProperty0<MessageDescriptor<M>>,
    @PublicForGeneratedCode
    val name: String,
    @PublicForGeneratedCode
    val number: Int,
    @PublicForGeneratedCode
    val type: Type,
    @PublicForGeneratedCode
    val value: KProperty1<M, T>,
    @PublicForGeneratedCode
    val oneofMember: Boolean = false,
    @PublicForGeneratedCode
    val jsonName: String? = null,
    val options: FieldOptions? = null
) {
    // At the time that the [FieldDescriptor] constructor is called, the parent [MessageDescriptor] has not been
    // constructed yet. This is because this [FieldDescriptor] is one of the parameters that will be passed to the
    // [MessageDescriptor] constructor. To avoid the circular dependency, this property is declared lazy.
    val messageDescriptor: MessageDescriptor<M> by lazy { messageDescriptor.get() }

    sealed class Type {
        internal abstract val hasPresence: Boolean
        internal abstract val isPackable: Boolean
        internal abstract val defaultValue: Any?

        internal abstract fun isDefaultValue(value: Any?): Boolean

        sealed class Primitive<KotlinT : Any>(override val defaultValue: KotlinT) : Type() {

            @Suppress("UNCHECKED_CAST")
            override fun isDefaultValue(value: Any?) =
                if (hasPresence) value == null else (value as? KotlinT) == defaultValue

            class Double(override val hasPresence: Boolean = false) : Primitive<kotlin.Double>(0.0) {
                override val isPackable: Boolean get() = true
            }

            class Float(override val hasPresence: Boolean = false) : Primitive<kotlin.Float>(0.0f) {
                override val isPackable: Boolean get() = true
            }

            class Int64(override val hasPresence: Boolean = false) : Primitive<Long>(0L) {
                override val isPackable: Boolean get() = true
            }

            class UInt64(override val hasPresence: Boolean = false) : Primitive<Long>(0L) {
                override val isPackable: Boolean get() = true
            }

            class Int32(override val hasPresence: Boolean = false) : Primitive<Int>(0) {
                override val isPackable: Boolean get() = true
            }

            class Fixed64(override val hasPresence: Boolean = false) : Primitive<Long>(0L) {
                override val isPackable: Boolean get() = true
            }

            class Fixed32(override val hasPresence: Boolean = false) : Primitive<Int>(0) {
                override val isPackable: Boolean get() = true
            }

            class Bool(override val hasPresence: Boolean = false) : Primitive<Boolean>(false) {
                override val isPackable: Boolean get() = true
            }

            class String(override val hasPresence: Boolean = false) : Primitive<kotlin.String>("") {
                override val isPackable: Boolean get() = false
            }

            class Bytes(override val hasPresence: Boolean = false) : Primitive<ByteArr>(ByteArr.empty) {
                override val isPackable: Boolean get() = false
            }

            class UInt32(override val hasPresence: Boolean = false) : Primitive<Int>(0) {
                override val isPackable: Boolean get() = true
            }

            class SFixed32(override val hasPresence: Boolean = false) : Primitive<Int>(0) {
                override val isPackable: Boolean get() = true
            }

            class SFixed64(override val hasPresence: Boolean = false) : Primitive<Long>(0L) {
                override val isPackable: Boolean get() = true
            }

            class SInt32(override val hasPresence: Boolean = false) : Primitive<Int>(0) {
                override val isPackable: Boolean get() = true
            }

            class SInt64(override val hasPresence: Boolean = false) : Primitive<Long>(0L) {
                override val isPackable: Boolean get() = true
            }
        }

        class Message<T : pbandk.Message>(internal val messageCompanion: pbandk.Message.Companion<T>) : Type() {
            override val hasPresence get() = true
            override val isPackable: Boolean get() = false
            override val defaultValue: Any? get() = null
            override fun isDefaultValue(value: Any?) = value == null
        }

        class Enum<T : pbandk.Message.Enum>(
            internal val enumCompanion: pbandk.Message.Enum.Companion<T>,
            override val hasPresence: Boolean = false
        ) : Type() {
            override val isPackable: Boolean get() = true
            override val defaultValue: Any? = enumCompanion.fromValue(0)
            override fun isDefaultValue(value: Any?) = (value as? pbandk.Message.Enum)?.value == 0
        }

        // TODO: replace [packed] with [FieldOptions] to be able to support custom options in the future
        class Repeated<T : Any>(internal val valueType: Type, val packed: Boolean = false) : Type() {
            override val hasPresence get() = false
            override val isPackable: Boolean get() = false
            override val defaultValue: Any? = emptyList<T>()
            override fun isDefaultValue(value: Any?) = (value as? List<*>)?.isEmpty() == true
        }

        class Map<K, V>(keyType: Type, valueType: Type) : Type() {
            internal val entryCompanion: MessageMap.Entry.Companion<K, V> =
                MessageMap.Entry.Companion(keyType, valueType)
            override val hasPresence get() = false
            override val isPackable: Boolean get() = false
            override val defaultValue: Any? = emptyMap<K, V>()
            override fun isDefaultValue(value: Any?) = (value as? kotlin.collections.Map<*, *>)?.isEmpty() == true
        }
    }

    @Suppress("UNCHECKED_CAST")
    fun <M : Message, T> parseUnknownField(
        unknownField: UnknownField.Value,
        fieldDescriptor: FieldDescriptor<M, T>
    ): T {
        return when (fieldDescriptor.type) {
            is Type.Primitive<*> -> parseUnknownFieldForPrimitiveOrComposite(fieldDescriptor.type, unknownField) as T
            is Type.Message<*> -> parseUnknownFieldForTypeMessage(fieldDescriptor.type, unknownField) as T
            else -> throw UnsupportedOperationException("fieldDescriptor.type: '${fieldDescriptor.type}' is not supported")
        }
    }

    private fun parseUnknownFieldForPrimitiveOrComposite(type: Type.Primitive<*>, unknownField: UnknownField.Value): T {
        return if (unknownField is UnknownField.Value.Composite) {
            parseUnknownFieldForPrimitive(type, unknownField.values.last())
        } else {
            parseUnknownFieldForPrimitive(type, unknownField)
        }
    }

    @Suppress("UNCHECKED_CAST")
    private fun parseUnknownFieldForPrimitive(type: Type.Primitive<*>, unknownField: UnknownField.Value) : T {
       return when (type) {
           is Type.Primitive.Int32 -> (unknownField as UnknownField.Value.Varint).varint.toInt() as T
           is Type.Primitive.Int64 -> (unknownField as UnknownField.Value.Varint).varint as T
           else -> throw UnsupportedOperationException("fieldDescriptor.type: '$type' is not supported")
       }
    }

    @Suppress("UNCHECKED_CAST")
    private fun <T : Message> parseUnknownFieldForTypeMessage(
        type: Type.Message<T>,
        unknownField: UnknownField.Value
    ): T {
        return when (unknownField) {
            is UnknownField.Value.Composite -> {
                unknownField.values
                    .map { value ->
                        type.messageCompanion.decodeFromByteArray((value as UnknownField.Value.LengthDelimited).bytes.array)
                    }
                    .reduce { acc, it -> acc.plus(it) as T }

            }
            is UnknownField.Value.LengthDelimited -> type.messageCompanion.decodeFromByteArray(unknownField.bytes.array)
            else -> throw UnsupportedOperationException("unknown field is not supported: '${unknownField}'")
        }
    }
}