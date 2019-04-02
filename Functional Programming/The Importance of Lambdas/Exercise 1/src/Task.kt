package theImportanceofLambdas1

import atomictest.eq

class Person(val name: String, val age: Int)

fun List<Person>.getNamesOfAdults(): List<String> {
    TODO()
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 17), Person("Bob", 19))
    people.getNamesOfAdults() eq listOf("Bob")
}