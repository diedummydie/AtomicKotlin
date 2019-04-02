package theImportanceofLambdas2

import atomictest.eq

fun filterNonBlank(strings: List<String>): List<String> {
    TODO()
}

fun main(args: Array<String>) {
    filterNonBlank(listOf("", "a", "  ")) eq listOf("a")
}