package com.dicoding.kotlin.objectOriented

fun main() {
//    val someValue = 6
//    println(someValue / 0)

//    val someString = "18.0"
//    println(someString.toInt())

    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)
}