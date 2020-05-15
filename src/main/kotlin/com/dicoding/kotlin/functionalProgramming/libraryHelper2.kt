package com.dicoding.kotlin.functionalProgramming

fun main() {
//    let
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }.run {
        val text = "message is null"
        println(text)
    }

//    also
    val text = "Hello Kotlin"
    val result2 = text.also {
        println("value length is ${it.length}")
    }

    println("text -> $result2")
}