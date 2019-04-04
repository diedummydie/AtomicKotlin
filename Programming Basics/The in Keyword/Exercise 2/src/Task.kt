package theinKeyword2

fun sumOfEven(n: Int): Int {
    var r = 0
    for (i in 0..n step 2) r += i
    return r
}

fun main(args: Array<String>) {
    println(sumOfEven(10))  // 30
}