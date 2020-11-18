@file:OptIn(pbandk.PublicForGeneratedCode::class)

package pbandk.testpb

data class Foo(
    val `val`: String = "",
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    @kotlin.native.concurrent.ThreadLocal
    companion object : pbandk.Message.Companion<Foo> {
        val defaultInstance by lazy { Foo() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Foo.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Foo> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<Foo, *>>(1).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "val",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Primitive.String(),
                        jsonName = "val",
                        value = Foo::`val`
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = Foo::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class Bar(
    val foos: List<pbandk.testpb.Foo> = emptyList(),
    val singleFoo: pbandk.testpb.Foo? = null,
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    @kotlin.native.concurrent.ThreadLocal
    companion object : pbandk.Message.Companion<Bar> {
        val defaultInstance by lazy { Bar() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Bar.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Bar> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<Bar, *>>(2).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "foos",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.Foo>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion)),
                        jsonName = "foos",
                        value = Bar::foos
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "single_foo",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion),
                        jsonName = "singleFoo",
                        value = Bar::singleFoo
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = Bar::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

data class MessageWithMap(
    val map: Map<String, String> = emptyMap(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    @kotlin.native.concurrent.ThreadLocal
    companion object : pbandk.Message.Companion<MessageWithMap> {
        val defaultInstance by lazy { MessageWithMap() }
        override fun decodeWith(u: pbandk.MessageDecoder) = MessageWithMap.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<MessageWithMap> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<MessageWithMap, *>>(1).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, String>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Primitive.String()),
                        jsonName = "map",
                        value = MessageWithMap::map
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = MessageWithMap::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    data class MapEntry(
        override val key: String = "",
        override val value: String = "",
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, String> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        @kotlin.native.concurrent.ThreadLocal
        companion object : pbandk.Message.Companion<MessageWithMap.MapEntry> {
            val defaultInstance by lazy { MessageWithMap.MapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = MessageWithMap.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<MessageWithMap.MapEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<MessageWithMap.MapEntry, *>>(2).apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = MessageWithMap.MapEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "value",
                            value = MessageWithMap.MapEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = MessageWithMap.MapEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

data class FooMap(
    val map: Map<String, pbandk.testpb.Foo?> = emptyMap(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    @kotlin.native.concurrent.ThreadLocal
    companion object : pbandk.Message.Companion<FooMap> {
        val defaultInstance by lazy { FooMap() }
        override fun decodeWith(u: pbandk.MessageDecoder) = FooMap.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<FooMap> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<FooMap, *>>(1).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Map<String, pbandk.testpb.Foo?>(keyType = pbandk.FieldDescriptor.Type.Primitive.String(), valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion)),
                        jsonName = "map",
                        value = FooMap::map
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = FooMap::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    data class MapEntry(
        override val key: String = "",
        override val value: pbandk.testpb.Foo? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message, Map.Entry<String, pbandk.testpb.Foo?> {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        @kotlin.native.concurrent.ThreadLocal
        companion object : pbandk.Message.Companion<FooMap.MapEntry> {
            val defaultInstance by lazy { FooMap.MapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = FooMap.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<FooMap.MapEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<FooMap.MapEntry, *>>(2).apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = FooMap.MapEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion),
                            jsonName = "value",
                            value = FooMap.MapEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = FooMap.MapEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

data class FooMapEntries(
    val map: List<pbandk.testpb.FooMapEntries.MapEntry> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    @kotlin.native.concurrent.ThreadLocal
    companion object : pbandk.Message.Companion<FooMapEntries> {
        val defaultInstance by lazy { FooMapEntries() }
        override fun decodeWith(u: pbandk.MessageDecoder) = FooMapEntries.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<FooMapEntries> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<FooMapEntries, *>>(1).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "map",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Repeated<pbandk.testpb.FooMapEntries.MapEntry>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.FooMapEntries.MapEntry.Companion)),
                        jsonName = "map",
                        value = FooMapEntries::map
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = FooMapEntries::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }

    data class MapEntry(
        val key: String = "",
        val value: pbandk.testpb.Foo? = null,
        override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
    ) : pbandk.Message {
        override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
        override val descriptor get() = Companion.descriptor
        override val protoSize by lazy { super.protoSize }
        @kotlin.native.concurrent.ThreadLocal
        companion object : pbandk.Message.Companion<FooMapEntries.MapEntry> {
            val defaultInstance by lazy { FooMapEntries.MapEntry() }
            override fun decodeWith(u: pbandk.MessageDecoder) = FooMapEntries.MapEntry.decodeWithImpl(u)

            override val descriptor: pbandk.MessageDescriptor<FooMapEntries.MapEntry> by lazy {
                val fieldsList = ArrayList<pbandk.FieldDescriptor<FooMapEntries.MapEntry, *>>(2).apply {
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "key",
                            number = 1,
                            type = pbandk.FieldDescriptor.Type.Primitive.String(),
                            jsonName = "key",
                            value = FooMapEntries.MapEntry::key
                        )
                    )
                    add(
                        pbandk.FieldDescriptor(
                            messageDescriptor = this@Companion::descriptor,
                            name = "value",
                            number = 2,
                            type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.testpb.Foo.Companion),
                            jsonName = "value",
                            value = FooMapEntries.MapEntry::value
                        )
                    )
                }
                pbandk.MessageDescriptor(
                    messageClass = FooMapEntries.MapEntry::class,
                    messageCompanion = this,
                    fields = fieldsList
                )
            }
        }
    }
}

data class Wrappers(
    val stringValue: String? = null,
    val uint64Values: List<Long> = emptyList(),
    override val unknownFields: Map<Int, pbandk.UnknownField> = emptyMap()
) : pbandk.Message {
    override operator fun plus(other: pbandk.Message?) = protoMergeImpl(other)
    override val descriptor get() = Companion.descriptor
    override val protoSize by lazy { super.protoSize }
    @kotlin.native.concurrent.ThreadLocal
    companion object : pbandk.Message.Companion<Wrappers> {
        val defaultInstance by lazy { Wrappers() }
        override fun decodeWith(u: pbandk.MessageDecoder) = Wrappers.decodeWithImpl(u)

        override val descriptor: pbandk.MessageDescriptor<Wrappers> by lazy {
            val fieldsList = ArrayList<pbandk.FieldDescriptor<Wrappers, *>>(2).apply {
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "string_value",
                        number = 1,
                        type = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.StringValue.Companion),
                        jsonName = "stringValue",
                        value = Wrappers::stringValue
                    )
                )
                add(
                    pbandk.FieldDescriptor(
                        messageDescriptor = this@Companion::descriptor,
                        name = "uint64_values",
                        number = 2,
                        type = pbandk.FieldDescriptor.Type.Repeated<Long>(valueType = pbandk.FieldDescriptor.Type.Message(messageCompanion = pbandk.wkt.UInt64Value.Companion)),
                        jsonName = "uint64Values",
                        value = Wrappers::uint64Values
                    )
                )
            }
            pbandk.MessageDescriptor(
                messageClass = Wrappers::class,
                messageCompanion = this,
                fields = fieldsList
            )
        }
    }
}

fun Foo?.orDefault() = this ?: Foo.defaultInstance

private fun Foo.protoMergeImpl(plus: pbandk.Message?): Foo = (plus as? Foo)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Foo.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Foo {
    var `val` = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> `val` = _fieldValue as String
        }
    }
    return Foo(`val`, unknownFields)
}

fun Bar?.orDefault() = this ?: Bar.defaultInstance

private fun Bar.protoMergeImpl(plus: pbandk.Message?): Bar = (plus as? Bar)?.copy(
    foos = foos + plus.foos,
    singleFoo = singleFoo?.plus(plus.singleFoo) ?: plus.singleFoo,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Bar.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Bar {
    var foos: pbandk.ListWithSize.Builder<pbandk.testpb.Foo>? = null
    var singleFoo: pbandk.testpb.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> foos = (foos ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.Foo> }
            2 -> singleFoo = _fieldValue as pbandk.testpb.Foo
        }
    }
    return Bar(pbandk.ListWithSize.Builder.fixed(foos), singleFoo, unknownFields)
}

fun MessageWithMap?.orDefault() = this ?: MessageWithMap.defaultInstance

private fun MessageWithMap.protoMergeImpl(plus: pbandk.Message?): MessageWithMap = (plus as? MessageWithMap)?.copy(
    map = map + plus.map,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithMap.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithMap {
    var map: pbandk.MessageMap.Builder<String, String>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, String>> }
        }
    }
    return MessageWithMap(pbandk.MessageMap.Builder.fixed(map), unknownFields)
}

fun MessageWithMap.MapEntry?.orDefault() = this ?: MessageWithMap.MapEntry.defaultInstance

private fun MessageWithMap.MapEntry.protoMergeImpl(plus: pbandk.Message?): MessageWithMap.MapEntry = (plus as? MessageWithMap.MapEntry)?.copy(
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun MessageWithMap.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): MessageWithMap.MapEntry {
    var key = ""
    var value = ""

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as String
        }
    }
    return MessageWithMap.MapEntry(key, value, unknownFields)
}

fun FooMap?.orDefault() = this ?: FooMap.defaultInstance

private fun FooMap.protoMergeImpl(plus: pbandk.Message?): FooMap = (plus as? FooMap)?.copy(
    map = map + plus.map,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMap.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMap {
    var map: pbandk.MessageMap.Builder<String, pbandk.testpb.Foo?>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.MessageMap.Builder()).apply { this.entries += _fieldValue as Sequence<pbandk.MessageMap.Entry<String, pbandk.testpb.Foo?>> }
        }
    }
    return FooMap(pbandk.MessageMap.Builder.fixed(map), unknownFields)
}

fun FooMap.MapEntry?.orDefault() = this ?: FooMap.MapEntry.defaultInstance

private fun FooMap.MapEntry.protoMergeImpl(plus: pbandk.Message?): FooMap.MapEntry = (plus as? FooMap.MapEntry)?.copy(
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMap.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMap.MapEntry {
    var key = ""
    var value: pbandk.testpb.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.Foo
        }
    }
    return FooMap.MapEntry(key, value, unknownFields)
}

fun FooMapEntries?.orDefault() = this ?: FooMapEntries.defaultInstance

private fun FooMapEntries.protoMergeImpl(plus: pbandk.Message?): FooMapEntries = (plus as? FooMapEntries)?.copy(
    map = map + plus.map,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMapEntries.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMapEntries {
    var map: pbandk.ListWithSize.Builder<pbandk.testpb.FooMapEntries.MapEntry>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> map = (map ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<pbandk.testpb.FooMapEntries.MapEntry> }
        }
    }
    return FooMapEntries(pbandk.ListWithSize.Builder.fixed(map), unknownFields)
}

fun FooMapEntries.MapEntry?.orDefault() = this ?: FooMapEntries.MapEntry.defaultInstance

private fun FooMapEntries.MapEntry.protoMergeImpl(plus: pbandk.Message?): FooMapEntries.MapEntry = (plus as? FooMapEntries.MapEntry)?.copy(
    value = value?.plus(plus.value) ?: plus.value,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun FooMapEntries.MapEntry.Companion.decodeWithImpl(u: pbandk.MessageDecoder): FooMapEntries.MapEntry {
    var key = ""
    var value: pbandk.testpb.Foo? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> key = _fieldValue as String
            2 -> value = _fieldValue as pbandk.testpb.Foo
        }
    }
    return FooMapEntries.MapEntry(key, value, unknownFields)
}

fun Wrappers?.orDefault() = this ?: Wrappers.defaultInstance

private fun Wrappers.protoMergeImpl(plus: pbandk.Message?): Wrappers = (plus as? Wrappers)?.copy(
    stringValue = plus.stringValue ?: stringValue,
    uint64Values = uint64Values + plus.uint64Values,
    unknownFields = unknownFields + plus.unknownFields
) ?: this

@Suppress("UNCHECKED_CAST")
private fun Wrappers.Companion.decodeWithImpl(u: pbandk.MessageDecoder): Wrappers {
    var stringValue: String? = null
    var uint64Values: pbandk.ListWithSize.Builder<Long>? = null

    val unknownFields = u.readMessage(this) { _fieldNumber, _fieldValue ->
        when (_fieldNumber) {
            1 -> stringValue = _fieldValue as String
            2 -> uint64Values = (uint64Values ?: pbandk.ListWithSize.Builder()).apply { this += _fieldValue as Sequence<Long> }
        }
    }
    return Wrappers(stringValue, pbandk.ListWithSize.Builder.fixed(uint64Values), unknownFields)
}
