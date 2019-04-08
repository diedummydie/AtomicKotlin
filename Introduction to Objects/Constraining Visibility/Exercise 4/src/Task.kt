package constrainingVisibility4

fun printSum(x: Int) {
    if (checkArgument(x)) return
    println((0..x).sum())
}

fun printAverage(x: Int) {
    if (checkArgument(x)) return
    println((0..x).average())
}

private fun checkArgument(x: Int): Boolean {
    if (x <= 0) {
        println("Incorrect input: $x should be positive")
        return true
    }
    return false
}

fun main(args: Array<String>) {
    printSum(-10)
    printAverage(-10)
}
/* Output:
Incorrect input: -10 should be positive
Incorrect input: -10 should be positive
*/