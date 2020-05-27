package com.dicoding.kotlin.objectOriented

class AnimalDefault {
    val name: String = "Dicoding Miaw"
    val weight: Double = 2.3
    val age: Int = 15
    val isMammal: Boolean = true
}

fun main() {
    val dicodingCat = AnimalDefault()
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}