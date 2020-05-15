package com.dicoding.kotlin.functionalProgramming

fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }
    println(message)
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return action.toString()
}