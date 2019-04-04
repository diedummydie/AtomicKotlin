package summary3

fun printPyramid(n: Int) {
    for (i in 1..n) {
        repeat(n-i)     { print(" ") }
        repeat(i + i-1) { print("#") }
        println()
    }
}

fun main(args: Array<String>) {
    printPyramid(4)
}
/* Output:
   #
  ###
 #####
#######
*/