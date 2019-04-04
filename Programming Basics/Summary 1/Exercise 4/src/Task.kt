package summary4

fun printSnake(rows: Int, columns: Int) {
    val max = rows * columns
    val width = max.toString().length + 1
    for (row in 0 until rows) {
        for (col in 0 until columns) {
            val cell = row * columns + if (row % 2 == 0) col else columns - 1 - col
            print("%${width}d".format(cell))
        }
        println()
    }
}

fun main(args: Array<String>) {
    printSnake(4, 5)
    println()
    printSnake(3, 3)
    println()
    printSnake(-3, 3)
    println()
    printSnake(3, -3)
}
/* Output:
  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15

  0  1  2
  5  4  3
  6  7  8
*/