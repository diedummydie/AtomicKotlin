package constructors3

class Human(
        val name: String,
        val age: Int
) {
    /*TODO*/
}

fun main(args: Array<String>) {
    val human = Human("Rick", 70)
    println(human)
}
/* Expected output:
Human(name='Rick', age=70)
*/