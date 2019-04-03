package varandval2

fun main(args: Array<String>) {
    var x = 1
    var y = 2
    val z = x
    x = y
    y = z
    println(x)
    println(y)
}