package constructors1

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
}

/*
fun main(args: Array<String>) {
    val robot = Robot(10, 1, 1)
    println(robot.getLocation())
    robot.goUp(2)
    println(robot.getLocation())
    robot.goLeft(10)
    println(robot.getLocation())
}
*/
/* Output:
(1,1)
(1,9)
(1,9)
*/