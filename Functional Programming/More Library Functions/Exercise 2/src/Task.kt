package moreLibraryFunctions2

import atomictest.eq

fun fibonacciNumbers(): Sequence<Int> {
    var previous = 1
    return generateSequence(0) {
        TODO()
    }
}

fun main(args: Array<String>) {
    fibonacciNumbers().take(10).toList() eq
            listOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
}