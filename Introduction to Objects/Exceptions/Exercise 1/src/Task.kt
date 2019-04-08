package exceptions1

import atomictest.capture
import atomictest.eq

fun repeatChar(ch: Char, n: Int): String {
    if (n < 0) throw IllegalArgumentException(
            "Count 'n' must be non-negative, but was $n."
    )
    return ch.toString().repeat(n)
}

fun main(args: Array<String>) {
    repeatChar('a', 4) eq "aaaa"
    capture {
        repeatChar('c', -2)
    } eq "IllegalArgumentException: Count 'n' must be non-negative, but was -2."
}