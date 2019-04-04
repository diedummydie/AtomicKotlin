package loopingandRanges3

fun sumOfEven(n: Int): Int {
    var sum = 0
    for (i in 1..n) if (i % 2 == 0) sum += i
    return sum
}

fun main(args: Array<String>) {
    println(sumOfEven(10))  // 30
}