package maps3

import atomictest.capture
import atomictest.eq

class Hamster(val name: String) {
    override fun toString(): String {
        return "Hamster('$name')"
    }
}

class Cage(private val maxCapacity: Int) {
    private val hamsters: MutableMap<String, Hamster> =
            TODO()

    fun put(hamster: Hamster): Boolean =
            if (hamsters.size == maxCapacity)
                false
            else {
                TODO()
                true
            }

    fun takeHamsterByName(name: String): Hamster =
            TODO()
}

fun main(args: Array<String>) {
    val cage = Cage(2)
    cage.put(Hamster("Alice")) eq true
    cage.takeHamsterByName("Alice") eq "Hamster('Alice')"
    capture {
        cage.takeHamsterByName("Bob")
    } eq "NoSuchElementException: " +
            "Key Bob is missing in the map."
}