package nonnullAssertions1

import atomictest.eq

fun sumOfFirstAndLast(list: List<Int>): Int = TODO()

fun main(args: Array<String>) {
    sumOfFirstAndLast(listOf()) eq 0
    sumOfFirstAndLast(listOf(1)) eq 1
    sumOfFirstAndLast(listOf(1, 2)) eq 3
    sumOfFirstAndLast(listOf(1, 2, 3)) eq 4
}