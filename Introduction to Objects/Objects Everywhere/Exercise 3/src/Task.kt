package objectsEverywhere3

fun isPalindrome(s: String): Boolean = s == s.reversed()

fun isPalIgnoreCase(s: String): Boolean =
        isPalindrome(s.toLowerCase())

fun isPalIgnoreSpecial(s: String): Boolean {
    var result = ""
    for (c in s.toLowerCase()) if (c in 'a'..'z') result += c
    return result == result.reversed()
}

fun main(args: Array<String>) {
    println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}
