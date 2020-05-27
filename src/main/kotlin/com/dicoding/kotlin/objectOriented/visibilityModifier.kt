package com.dicoding.kotlin.objectOriented

fun main() {
    val dicodingCat = AnimalVisibility("Dicoding Miaw", 22.2, 20, true)

    println(dicodingCat.getName())
    dicodingCat.setName("Ghoose")
    println(dicodingCat.getName())
}

class AnimalVisibility(private var name: String, val weight: Double, val age: Int, val isMammal: Boolean = true){
    fun getName(): String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }
}