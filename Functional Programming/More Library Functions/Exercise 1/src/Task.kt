package moreLibraryFunctions1

import atomictest.eq

fun from(n: Int): Sequence<Int> = TODO()

fun main(args: Array<String>) {
    from(10).take(2).toList() eq listOf(10, 11)
}