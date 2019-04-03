package repetitionwithwhile1

fun sum(number: Int): Int {
    var total = 0
    var i = 0
    while (i < number) {
        total += ++i
    }
    return total
}

fun main(args: Array<String>) {
    println(sum(10))  // 55
}