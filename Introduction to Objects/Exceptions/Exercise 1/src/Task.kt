package exceptions1

import atomictest.capture
import atomictest.eq

fun repeatChar(ch: Char, n: Int): String {
    TODO()
}

fun main(args: Array<String>) {
    repeatChar('a', 4) eq "aaaa"
    capture {
        repeatChar('c', -2)
    } eq "IllegalArgumentException: Count 'n' must be non-negative, but was -2."
}