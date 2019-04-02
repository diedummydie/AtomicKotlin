package nonnullAssertions2

import atomictest.eq
import kotlin.math.absoluteValue

fun maxEqualsMinInAbsoluteValue(list: List<Int>): Boolean {
    TODO()
}

fun main(args: Array<String>) {
    maxEqualsMinInAbsoluteValue(listOf(-10, 1, 10)) eq true
    maxEqualsMinInAbsoluteValue(listOf(10, 10)) eq true
    maxEqualsMinInAbsoluteValue(listOf(-10, 1)) eq false
}