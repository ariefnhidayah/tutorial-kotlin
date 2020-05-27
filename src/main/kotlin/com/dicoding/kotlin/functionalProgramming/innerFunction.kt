package com.dicoding.kotlin.functionalProgramming

fun main() {
    val test = setWord("Hai semua")
    println(sum(10, 20, 20))
}

//function didalam function

fun setWord(message: String) {
    fun printMessage(text: String) {
        println(text)
    }

    printMessage(message)
}

//contoh lain
fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB
}