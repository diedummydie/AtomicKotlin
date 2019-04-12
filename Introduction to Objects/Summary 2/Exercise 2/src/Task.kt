package summary22

import atomictest.eq

val romanNumeralToIntMap: Map<String, Int> = mapOf(
    "M" to 1000,
    "CM" to 900,
    "D"  to 500,
    "CD" to 400,
    "C"  to 100,
    "XC" to 90,
    "L"  to 50,
    "XL" to 40,
    "X"  to 10,
    "IX" to 9,
    "V"  to 5,
    "IV" to 4,
    "I"  to 1
)

fun convertFromRoman(roman: String): Int {
    var result = 0
    for (i in 0 until roman.length) {
        // Subtract if next Roman Numeral character is larger
        val curr = romanNumeralToIntMap.getValue(roman[i].toString())
        if (i+1 < roman.length) {
            val next = romanNumeralToIntMap.getValue(roman[i+1].toString())
            if (next > curr) {
                result -= curr
                continue
            }
        }
        // Add since next is smaller or at end
        result += curr
    }
    return result
}

fun betterFromRoman(roman: String): Int {
    var result = 0
    var max = 0
    for (s in roman.reversed()) {
        val int = romanNumeralToIntMap.getValue("$s")
        if (int >= max) {
            result += int
            max = int
        } else { result -= int }
    }
    return result
}

fun main(args: Array<String>) {
    convertFromRoman("XXIII") eq 23
    convertFromRoman("XLIV") eq 44
    convertFromRoman("C") eq 100
    convertFromRoman("MMXVIII") eq 2018
}