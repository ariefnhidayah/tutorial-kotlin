package com.dicoding.kotlin.functionalProgramming

fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(Int::isEvenNumber)

    println(evenNumbers)
}

//fun isEvenNumber(number: Int) = number % 2 == 0
fun Int.isEvenNumber() = this % 2 == 0