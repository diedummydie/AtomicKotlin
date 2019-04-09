package varargArguments2

import atomictest.eq

fun flatten(listOfLists: List<List<String>>): List<String> {
    var result: List<String> = listOf()
    for (listElem in listOfLists)
        for (elem in listElem)
            result += elem
    return result
}

fun main(args: Array<String>) {
    val listOfLists = listOf(listOf("a", "b"), listOf("c", "d"))
    flatten(listOfLists) eq listOf("a", "b", "c", "d")
}