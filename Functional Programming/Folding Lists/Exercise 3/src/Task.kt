package foldingLists3

import atomictest.eq

fun <T> List<T>.any(predicate: (T) -> Boolean): Boolean =
        TODO("fold(???) { ??? }")

fun main(args: Array<String>) {
    val list = listOf(1, -2, 3)
    list.any { it < 0 } eq true
}