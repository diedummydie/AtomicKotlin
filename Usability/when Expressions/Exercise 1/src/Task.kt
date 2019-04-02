package whenExpressions1

import atomictest.capture
import atomictest.eq

fun getCloudinessDescription(cloudiness: Int): String = TODO()

fun main(args: Array<String>) {
    getCloudinessDescription(100) eq "Sunny"
    getCloudinessDescription(70) eq "Mostly Sunny"
    getCloudinessDescription(50) eq "Partly Sunny"
    getCloudinessDescription(30) eq "Mostly Cloudy"
    getCloudinessDescription(0) eq "Cloudy"
    capture {
        getCloudinessDescription(1000)
    } eq "IllegalArgumentException: Cloudiness value should be between 0 and 100"
}