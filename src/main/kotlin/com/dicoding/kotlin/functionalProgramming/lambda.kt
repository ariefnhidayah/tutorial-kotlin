package com.dicoding.kotlin.functionalProgramming

fun main() {
    message()
    printMessage("Hello World!")
}

// Lambda
val message = {
    println("Hello from lambda")
}

val printMessage = {
    message: String ->
    println(message)
}