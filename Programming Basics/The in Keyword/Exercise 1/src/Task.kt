package theinKeyword1

fun getAlphabet(): String {
    var r = ""
    for (c in 'a'..'z') r += c
    return r
}

fun main(args: Array<String>) {
    println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}