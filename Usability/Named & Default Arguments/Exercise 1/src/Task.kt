package namedandDefaultArguments1

import atomictest.eq

class SimpleTime(
) {
    fun toSecondOfDay(): Int = TODO()

    fun toNanoOfDay(): Long = TODO()
}

/*
fun main(args: Array<String>) {
    val noon = SimpleTime(12)
    noon.toSecondOfDay() eq 12 * 60 * 60

    val halfPastSeven = SimpleTime(hours = 6, minutes = 30)
    halfPastSeven.toNanoOfDay() eq 23400000000000

    val nanosecond = SimpleTime(nanoseconds = 1)
    nanosecond.toNanoOfDay() eq 1

    val second = SimpleTime(seconds = 1)
    second.toNanoOfDay() eq 1000000000
}
*/