package repetitionwithwhile2

fun sumOfEven(n: Int): Int {
    var sum = 0
    var i = 0
    while (i < n) if (++i % 2 == 0) sum += i
    return sum
}

fun main(args: Array<String>) {
    println(sumOfEven(10))  // 30
}