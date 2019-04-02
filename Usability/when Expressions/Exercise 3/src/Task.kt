package whenExpressions3

import atomictest.eq

fun isBalanced(input: String): Boolean {
    TODO()
}

fun main(args: Array<String>) {
    isBalanced("(()) ()") eq true
    isBalanced(")(") eq false
}