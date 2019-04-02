package sets2

import atomictest.eq

fun hasUniqueCharacters(s: String): Boolean {
    TODO()
}

fun main(args: Array<String>) {
    hasUniqueCharacters("abcd") eq true
    hasUniqueCharacters("abcb") eq false
}