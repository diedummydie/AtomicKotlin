package constructors2

class Robot(
        val fieldSize: Int = 100,
        var x: Int = 0,
        var y: Int = 0) {

    private fun move(pos: Int, dist: Int): Int {
        val r = (pos + dist) % fieldSize
        return when {
            r < 0 -> r + fieldSize
            r >= fieldSize -> r - fieldSize
            else -> r
        }
    }

    fun goRight(steps: Int) {
        x = move(x, steps)

    }

    fun goLeft(steps: Int) {
                x = move(x, -steps)

    }

    fun goDown(steps: Int) {
        y = move(y, steps)

    }

    fun goUp(steps: Int) {
        y = move(y, -steps)

    }

    fun getLocation(): String = "($x,$y)"

    override fun toString() = "Robot(x=$x,y=$y)"
}

/*
fun main(args: Array<String>) {
    val robot = Robot(10, 1, 1)
    println(robot)
}
*/
/* Output:
Robot(1,1)
*/