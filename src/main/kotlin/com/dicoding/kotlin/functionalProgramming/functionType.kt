package com.dicoding.kotlin.functionalProgramming

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB}

    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(10, 10)

    val sumResult1 = sum(10, 10)
    val multiplyResult1 = multiply(10, 10)

    val sum1: Arithmetic1 = { valueA, valueB -> valueA + valueB}
    val sumNull = sum1?.invoke(10, 10)
}
typealias Arithmetic = (Int, Int) -> Int

typealias Arithmetic1 = ((Int, Int) -> Int)?