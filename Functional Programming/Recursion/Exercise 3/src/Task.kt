package recursion3

import atomictest.eq

class City(val name: String) {
    val connections = mutableListOf<City>()

    override fun toString() = "($name, " +
            "connections: ${connections.map { it.name }})"
}

fun addConnection(first: City, second: City) {
    first.connections += second
    second.connections += first
}

fun isReachableRecursive(from: City, to: City): Boolean {
    val connections = mutableSetOf<City>()

    fun buildConnections(current: City) {
        TODO()
    }

    buildConnections(from)
    return to in connections
}

fun isReachableIterative(from: City, to: City): Boolean {
    val connections = mutableSetOf<City>()
    val citiesToVisit = mutableSetOf(from)
    while (citiesToVisit.isNotEmpty()) {
        val current = citiesToVisit.first()
        citiesToVisit.remove(current)

        TODO()
    }
    return false
}

fun main(args: Array<String>) {
    val dublin = City("Dublin")
    val liverpool = City("Liverpool")
    val manchester = City("Manchester")
    val leeds = City("Leeds")

    addConnection(liverpool, manchester)
    addConnection(manchester, leeds)

    isReachableRecursive(liverpool, leeds) eq true
    isReachableRecursive(liverpool, dublin) eq false

    isReachableIterative(liverpool, leeds) eq true
    isReachableIterative(liverpool, dublin) eq false
}