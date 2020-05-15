package com.dicoding.kotlin.functionalProgramming

fun main() {
//    printResult(10 ,sum)
    printResult(10){value ->
        value + value
    }
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

//var sum: (Int) -> Int = { value -> value + value }