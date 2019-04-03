package numberTypes4

fun convertToMilliseconds(
        hours: Int,
        minutes: Int,
        seconds: Int
): Long =       hours * 60L * 60 * 1000 +
                minutes * 60L * 1000 +
                seconds * 1000L

fun main(args: Array<String>) {
    println(convertToMilliseconds(1, 30, 0))
}