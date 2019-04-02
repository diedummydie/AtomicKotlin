package propertyAccessors2

import atomictest.eq

class Strange {

    val accesses: Int
        get() = TODO()
}

fun main(args: Array<String>) {
    val strange = Strange()
    strange.accesses eq 1
    strange.accesses eq 2
    strange.accesses eq 3

    val strange2 = Strange()
    repeat(10) {
        strange2.accesses
    }
    strange2.accesses eq 11
}