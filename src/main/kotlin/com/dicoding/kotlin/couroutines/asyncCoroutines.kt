package com.dicoding.kotlin.couroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

fun main() = runBlocking {
    //    val capital = getCapital()
//    val income = getIncome()
//    println("Your profit is ${income - capital}")

//    menggunakan async
//    val capital = async { getCapital() }
//    val income = async { getIncome() }
//    println("Your profit is ${income.await() - capital.await()}")

//    untuk membuktikan perbedaan menggunakan async
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${capital - income}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${capital.await() - income.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms")
}