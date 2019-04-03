package numberTypes3

fun convertFahrenheitToCelsius(f: Int): Double =
        (f - 32) * 5 / 9.0

fun convertCelsiusToFahrenheit(c: Int): Double =
        c * 9 / 5.0 + 32

fun main(args: Array<String>) {
    println(convertFahrenheitToCelsius(68)) // 20.0
    println(convertCelsiusToFahrenheit(20)) // 68.0
}