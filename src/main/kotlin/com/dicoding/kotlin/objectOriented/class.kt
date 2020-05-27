package com.dicoding.kotlin.objectOriented

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 20.0, 18, false)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Usia: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
    dicodingCat.eat()
    dicodingCat.sleep()
}

class Animal(
    var name: String,
    val weight: Double,
    val age: Int,
    val isMammal: Boolean
) {
    fun eat() {
        println("$name makan")
    }

    fun sleep() {
        println("$name tidur")
    }
}