package fromListstoMaps02

import atomictest.eq

fun <T, R> List<T>.groupBy(keySelector: (T) -> R): Map<R, List<T>> {
    val result = mutableMapOf<R, MutableList<T>>()
    TODO()
    return result
}

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 21),
            Person("Bob", 25), Person("Charlie", 25))

    people.groupBy(Person::age) eq ""
}