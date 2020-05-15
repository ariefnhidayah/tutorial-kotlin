package com.dicoding.kotlin.functionalProgramming

fun main() {
    10.printInt()
    println(10.printThree())
    println(10.slice)
}

// Extension Functions
fun Int.printInt() {
    println("value $this")
}

fun Int.printThree(): Int {
    return this + 3
}

// Extension Properties
val Int.slice: Int
    get() = this / 2