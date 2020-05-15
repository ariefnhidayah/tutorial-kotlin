package com.dicoding.kotlin

import kotlin.random.Random

fun main() {
    val value = 7
//    when(value) {
//        7 -> print("value is 7")
//        6 -> print("value is 6")
//        5 -> print("value is 5")
//        else -> print("value cannot be reached")
//    }
//    val stringOfValue = when(value) {
//        7 -> print("value is 7")
//        6 -> print("value is 6")
//        5 -> print("value is 5")
//        else -> print("value cannot be reached")
//    }

//    println(stringOfValue)

    val stringOfValues = when(value) {
        7 -> {
            println("Seven")
            "value is 7"
        }
        6 -> {
            println("Six")
            "value is 6"
        }
        5 -> {
            println("Five")
            "value is 5"
        }
        else -> {
            println("Undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValues)

//    cek tipe data
    val anyType : Any = "100L"
    when (anyType) {
        is Long -> println("the value has long type")
        is String -> println("the value has string type")
        else -> println("Undefined")
    }

//    mengecek range
    val value2 = 20
    val range = 10..50

    when (value2) {
        in range -> println("value is in the range")
        !in range -> println("value is outside the range")
        else -> println("value undefined")
    }

//    dapat seperti
    val registerNumber = when (val regis = getRegisterNumber()) {
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    println(registerNumber)

//    val testing = when(10) {
//        is 5 > 20 -> true
//    }

}

fun getRegisterNumber() = Random.nextInt(100)