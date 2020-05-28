package com.dicoding.kotlin.objectOriented2

class AnimalExtention(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val AnimalExtention.getAnimalInfo: String
    get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age}, Mamalia: ${this.isMammal}"

fun main() {
    val dicodingCat = AnimalExtention("Dicoding Miaw", 20.0, 10, true)
    println(dicodingCat.getAnimalInfo)
}