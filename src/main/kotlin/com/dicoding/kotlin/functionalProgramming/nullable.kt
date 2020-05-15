package com.dicoding.kotlin.functionalProgramming

fun main() {
    val value: Int? = null
    println(value.slice2)
}

val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)

//atau
val Int?.slice2: Int
    get() = this?.div(2) ?: 0