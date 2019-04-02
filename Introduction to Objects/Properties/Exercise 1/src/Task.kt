package properties1

class Robot {
    /*TODO*/

    fun goRight(steps: Int) {
        TODO()
    }

    fun goLeft(steps: Int) {
        TODO()
    }

    fun goDown(steps: Int) {
        TODO()
    }

    fun goUp(steps: Int) {
        TODO()
    }

    fun getLocation(): String = TODO()
}

fun main(args: Array<String>) {
    val robot = Robot()
    println(robot.getLocation())
    robot.goRight(1)
    println(robot.getLocation())
    robot.goDown(2)
    println(robot.getLocation())
}
/* Output:
(0,0)
(1,0)
(1,2)
*/