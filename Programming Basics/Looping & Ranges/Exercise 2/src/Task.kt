package loopingandRanges2

fun factorial(n: Int): Long {
    var result = 1L
    for (i in 1..n) result *= i
    return result
}

fun sumOfFactorials(n: Int): Long {
    var result = 0L
    for (i in 1..n) result += factorial(i)
    return result
    // f(3) = 1! = 1
    // + 2! = 1 * 2 = 2
    // + 3! = 1 * 2 * 3 = 6
}

fun main(args: Array<String>) {
    println(sumOfFactorials(10))  // 4037913
}