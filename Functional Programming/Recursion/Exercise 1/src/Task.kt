package recursion1

import atomictest.eq

fun factorial(n: Long): Long {
    TODO()
}

fun main(args: Array<String>) {
    factorial(3) eq 6
    factorial(4) eq 24
    factorial(11) eq 39916800
}