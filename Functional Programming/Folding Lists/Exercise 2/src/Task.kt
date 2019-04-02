package foldingLists02

import atomictest.eq

fun <T> List<T>.count(predicate: (T) -> Boolean): Int =
        TODO("fold(???) { ??? }")

fun main(args: Array<String>) {
    val list = listOf(1, -2, 3)
    list.count { it > 0 } eq 2
}