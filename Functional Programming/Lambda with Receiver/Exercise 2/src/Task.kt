package lambdawithReceiver2

import atomictest.eq

fun buildList(action: MutableList<Int>.() -> Unit): List<Int> {
    TODO()
}

fun main(args: Array<String>) {
    val list = buildList {
        add(0)
        for (i in 1..5) {
            add(i)
        }
    }
    list eq listOf(0, 1, 2, 3, 4, 5)
}