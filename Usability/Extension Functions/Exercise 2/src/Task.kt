package extensionFunctions2

import atomictest.eq

fun Int.isOdd(): Boolean = TODO()
fun Int.isEven(): Boolean = TODO()

fun main(args: Array<String>) {
    1.isOdd() eq true
    2.isEven() eq true
    13.isEven() eq false
}