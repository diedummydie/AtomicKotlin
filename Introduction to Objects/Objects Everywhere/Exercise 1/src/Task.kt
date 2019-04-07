package objectsEverywhere1

fun isPalindrome(s: String): Boolean = s.toLowerCase() == s.toLowerCase().reversed()

fun main(args: Array<String>) {
    println(isPalindrome("mom"))     // true
    println(isPalindrome("street"))  // false
}