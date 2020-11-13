package pbandk

@Suppress("UNCHECKED_CAST")
interface ExtendableMessage : Message {
    val extensionFields: MutableMap<Int, kotlin.Any>
    fun <M: Message, T> getExtension(fd: FieldDescriptor<M, T>): T {
        val value = (extensionFields[fd.number] as? T)
            ?: unknownFields[fd.number]?.let { unknownField ->
                fd.parseUnknownField(unknownField.value, fd)
            }
        return if (value != null) {
            extensionFields[fd.number] = value as kotlin.Any
            value
        } else {
            fd.type.defaultValue as T
        }
    }
}

