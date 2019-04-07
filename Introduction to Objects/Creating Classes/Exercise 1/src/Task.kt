package creatingClasses1

fun isPalindrome(s: SimpleString): Boolean {
    var r = ""
    for (i in 0 until s.length())
        if (s.get(i) in 'a'..'z')
            r += s.get(i)
    return r == r.reversed()
}

fun main(args: Array<String>) {
    println(isPalindrome(SimpleString("mom")))
    println(isPalindrome(SimpleString("mom!")))
}
/* Output:
true
*/