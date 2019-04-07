package objectsEverywhere2

fun isPalindrome(s: String): Boolean = s == s.reversed()

fun isPalIgnoreCase(s: String): Boolean =
    isPalindrome(s.toLowerCase())

fun main(args: Array<String>) {
    println(isPalIgnoreCase("Mom"))  // true
}