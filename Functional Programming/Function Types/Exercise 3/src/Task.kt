package functionTypes3

import atomictest.eq

fun <T, R : Any> Iterable<T>.mapIndexedNotNull(
        transform: (Int, T) -> R?
): List<R> {
    val result = mutableListOf<R>()
    TODO()
    return result
}

fun main(args: Array<String>) {
    val list = listOf("a", "b", "c", "d")
    list.mapIndexedNotNull { index, s ->
        if (index % 2 == 0) "$s!" else null
    } eq listOf("a!", "c!")
}