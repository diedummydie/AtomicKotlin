package lists1

import atomictest.eq

fun findMax(list: IntList): Int {
    var max = 0
    for (i in list) if (i > max) max = i
    return max
}

fun main(args: Array<String>) {
    val list = IntList(listOf(1, 2, 3, 2))
    findMax(list) eq 3
}