package enumerations3

import atomictest.eq
import enumerations3.Result.*
import enumerations3.Rochambeau.*

enum class Rochambeau {
    ROCK, PAPER, SCISSORS
}

enum class Result {
    DRAW, FIRST_WINS, SECOND_WINS
}

fun findWinner(first: Rochambeau, second: Rochambeau): Result {
    TODO()
}

fun main(args: Array<String>) {
    findWinner(ROCK, SCISSORS) eq FIRST_WINS
    findWinner(SCISSORS, ROCK) eq SECOND_WINS
    findWinner(PAPER, PAPER) eq DRAW
}