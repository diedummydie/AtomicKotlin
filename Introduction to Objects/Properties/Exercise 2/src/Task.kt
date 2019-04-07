package properties2

class Robot {
    var x = 0
    var y = 0
    val fieldSize = 100

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
}

fun main(args: Array<String>) {
    val robot = Robot()
    println("-3 % 100: ${-3%100}")
    println(robot.getLocation())
    robot.goUp(1)
    println(robot.getLocation())
    robot.goLeft(10)
    println(robot.getLocation())
}
/* Output:
(0,0)
(0,99)
(90,99)
*/