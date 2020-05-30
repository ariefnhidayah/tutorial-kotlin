package com.dicoding.kotlin.generics

fun main() {
    val numbers = (1..100).toList()
    println(numbers.slice(1..10))
}