package extensionsforNullableTypes1

import atomictest.eq

fun String?.orEmpty(): String = TODO()

fun main(args: Array<String>) {

    null.orEmpty() eq ""

    "abc".orEmpty() eq "abc"
}