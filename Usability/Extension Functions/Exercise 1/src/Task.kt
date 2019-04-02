package extensionFunctions1

import atomictest.eq

fun String.wrapInTag(tagName: String): String = TODO()

fun main(args: Array<String>) {
    "cat".wrapInTag("animal") eq "<animal>cat</animal>"
}