package lambdawithReceiver1

import atomictest.eq

fun drawSquare(width: Int) = buildString {
    TODO()
}.trim()

fun main(args: Array<String>) {
    drawSquare(3) eq
            """|***
               |***
               |***""".trimMargin()
}