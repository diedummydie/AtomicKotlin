package summary21

import atomictest.eq

val intToRomanNumeralMap: Map<Int, String> = mapOf(
        1000 to "M",
        900 to "CM",
        500 to "D",
        400 to "CD",
        100 to "C",
        90 to "XC",
        50 to "L",
        40 to "XL",
        10 to "X",
        9 to "IX",
        5 to "V",
        4 to "IV",
        1 to "I"
)

val intToRomanMinimal = mapOf(
        1000 to "M",
        500 to "D",
        100 to "C",
        50 to "L",
        10 to "X",
        5 to "V",
        1 to "I"
)

fun convertToRoman(number: Int): String {
    var result = ""
    var remain = number
    for ((int, rom) in intToRomanNumeralMap) {
        result += rom.repeat(remain / int)
        remain %= int
    }
    println("$number: $result")
    return result
}

fun main(args: Array<String>) {
    convertToRoman(23) eq "XXIII"
    convertToRoman(44) eq "XLIV"
    convertToRoman(100) eq "C"
    convertToRoman(2018) eq "MMXVIII"
    convertToRoman(45)
    convertToRoman(79)
}