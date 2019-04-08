package constrainingVisibility1

class Robot(
        private val fieldSize: Int = 100,
        private var x: Int = 0,
        private var y: Int = 0) {

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
    // Coordinates should be private:
//    println(robot.x)
}
*/