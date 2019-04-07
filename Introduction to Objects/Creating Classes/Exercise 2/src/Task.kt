package creatingClasses2

fun isPalIgnoreCase(s: SimpleString): Boolean {
    var r = ""
    for (i in 0 until s.length()) {
        val c = s.get(i).toLowerCase()
        if (c in 'a'..'z')
            r += c
    }
    return r == r.reversed()
}

fun main(args: Array<String>) {
    println(isPalIgnoreCase(SimpleString("Mom")))
}
/* Output:
true
*/