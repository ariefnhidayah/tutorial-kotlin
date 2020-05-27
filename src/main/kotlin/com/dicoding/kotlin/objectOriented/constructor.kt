package com.dicoding.kotlin.objectOriented

fun main() {
    val dicodingCat = AnimalPrimary("Dicoding Miaw", 44.2, isMammal = true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
    val dicodingCat2 = AnimalInit("Dicoding Miaw", 44.2, 18, true)
    println("Nama: ${dicodingCat2.name}, Berat: ${dicodingCat2.weight}, Umur: ${dicodingCat2.age}, mamalia: ${dicodingCat2.isMammal}")
    val dicodingCat3 = AnimalInit2("Dicoding Miaw", 22.2, 25, true)
    println("Nama: ${dicodingCat3.name}, Berat: ${dicodingCat3.weight}, Umur: ${dicodingCat3.age}, mamalia: ${dicodingCat3.isMammal}")
}

//PRIMARY CONSTRUCTOR
class AnimalPrimary(val name: String, val weight: Double, val age: Int = 22, val isMammal: Boolean) {

}

//PRIMARY INIT
class AnimalInit(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if (pWeight < 0) 0.1 else pWeight
        age = if (pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}

class AnimalInit2(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = isMammal
    }
}