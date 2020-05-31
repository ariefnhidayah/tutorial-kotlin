package com.dicoding.kotlin.couroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000L)
        println("Coroucotines!")
    }
    println("Hello,")
    delay(2000L)
}