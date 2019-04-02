package operationsonCollections3

import atomictest.eq

fun sum(list: List<Int?>): Int {
    TODO()
}

fun main(args: Array<String>) {
    sum(listOf(1, 2, null)) eq 3
}