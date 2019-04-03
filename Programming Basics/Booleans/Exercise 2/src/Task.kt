package booleans2

fun and(b1: Boolean, b2: Boolean): Boolean =
        if (b1) (if (b2) true else false) else false

fun or(b1: Boolean, b2: Boolean): Boolean =
        if (b1) true else (if (b2) true else false)

fun main(args: Array<String>) {
    println(and(true, true)) // true
    println(or(true, false)) // true
}