package testing1

import atomictest.eq
import kotlin.math.sin

fun squareArea(x: Int) = x * x

fun rectangleArea(x: Int, y: Int) = x * y

fun trapezoidArea(x: Int, y: Int, h: Int) = h / 2.0 * (x + y)

fun quadrangleArea(a: Int,
                   b: Int,
                   c: Int,
                   d: Int,
                   angleA: Double,
                   angleC: Double): Double {
    return 0.5 * a * d * sin(angleA) + 0.5 * b * c * sin(angleC)
}

fun main(args: Array<String>) {
    squareArea(1) eq 1
    squareArea(2) eq 4
    squareArea(5) eq 25
    rectangleArea(2, 2) eq 4
    rectangleArea(5, 4) eq 20
    trapezoidArea(2, 2, 4) eq 8.0
    trapezoidArea(3, 4, 1) eq 3.5
    quadrangleArea(1,1,1,1, 90.0, 90.0) eq 4
    quadrangleArea(12, 9, 5, 14, 80.0, 100.0) eq 103.79
}