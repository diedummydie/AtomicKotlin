package pythagorean

import kotlin.math.sqrt

class EquilateralTriangle(private val side: Double) {
    fun area() = sqrt(3.0) / 4 * side * side
}