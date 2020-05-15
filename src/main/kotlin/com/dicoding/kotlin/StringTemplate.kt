package com.dicoding.kotlin

fun main() {
    val name = "Arief"
    val age = 18
    println("My name $name and my age $age years old")

    val hour = 7
    println("Office ${if(hour > 7) "already closed" else "is open"}")
}