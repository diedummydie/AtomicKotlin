package memberReferences02

import atomictest.eq

val Int.isEven: Boolean
    get() = this % 2 == 0

private fun getNonTrivialDivisors(i: Int): List<Int> {
    TODO()
}

fun Int.isPrime(): Boolean {
    TODO()
}

fun isPerfect(i: Int): Boolean {
    TODO()
}

fun main(args: Array<String>) {
    val range = 1..1000
    val even = range.filter(TODO())
    even.size eq 500

    val prime = range.filter(TODO())
    prime.take(7) eq listOf(2, 3, 5, 7, 11, 13, 17)
    prime.takeLast(7) eq
            listOf(953, 967, 971, 977, 983, 991, 997)

    val perfect = range.filter(TODO())
    perfect eq listOf(6, 28, 496)
    // 6 = 1 + 2 + 3
    // 28 = 1 + 2 + 4 + 7 + 14
}