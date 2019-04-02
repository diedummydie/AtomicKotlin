package whenExpressions2

import atomictest.eq

fun getTemperatureDescription(temperature: Int): String = TODO()

fun main(args: Array<String>) {
    getTemperatureDescription(30) eq "Hot"
    getTemperatureDescription(10) eq "Cool"
    getTemperatureDescription(-30) eq "Freezing"
}