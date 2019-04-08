package constrainingVisibility2

class Robot(
        private val fieldSize: Int = 100,
        private var x: Int = 0,
        private var y: Int = 0) {


    private fun move(pos: Int, dir: Int, dist: Int): Int {
        if (dist <= 0) {
            println("Incorrect input: $dist, " +
                    "the number of steps should be positive.")
            return pos
        }
        // Wrap around fieldSize
        val vector = (pos + (dir * dist)) % fieldSize
        return when {
            vector < 0 -> vector + fieldSize
            vector >= fieldSize -> vector - fieldSize
            else -> vector
        }
    }

    fun goRight(steps: Int) {
        x = move(x, 1, steps)

    }

    fun goLeft(steps: Int) {
        x = move(x, -1, steps)

    }

    fun goDown(steps: Int) {
        y = move(y, 1, steps)

    }

    fun goUp(steps: Int) {
        y = move(y, -1, steps)

    }

    fun getLocation(): String = "($x,$y)"

    override fun toString() = "Robot(x=$x,y=$y)"
}

/*
fun main(args: Array<String>) {
    val robot = Robot(10, 1, 1)
    robot.goRight(-1)
}
*/
/* Output:
Incorrect input: -1, the number of steps should be positive.
*/