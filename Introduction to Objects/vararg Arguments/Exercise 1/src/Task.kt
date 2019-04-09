package varargArguments1

import atomictest.eq

fun listOfChunks(size: Int, vararg elements: String): List<List<String>> {
    //return elements.toList().chunked(size)
    var cursor = 0
    var worker: List<String> = listOf()
    var result: List<List<String>> = listOf()
    for (elem in elements) {
        worker += elem
        if (     cursor > 0 &&
                (cursor + 1) % size == 0 ||
                 cursor == elements.lastIndex
        ) {
            result += listOf(worker)
            worker = listOf()
        }
        cursor++
    }
    return result
}

fun main(args: Array<String>) {
    val chunks = listOfChunks(3, "a", "b", "c", "d", "e", "f", "g")
    chunks eq listOf(listOf("a", "b", "c"), listOf("d", "e", "f"), listOf("g"))
}