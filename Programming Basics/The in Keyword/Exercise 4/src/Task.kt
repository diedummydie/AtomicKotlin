package theinKeyword4

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty()) return false
    for (i in 0..s.lastIndex) {
        val c = s[i]
        if (c !in 'a'..'z')
            if (c !in 'A'..'Z')
                if (c != '_')
                    if (c !in '0'..'9' || i == 0)
                        return false
    }
    return true
}

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))  // true
    println(isValidIdentifier("0name"))  // false
}