package com.dicoding.kotlin.objectOriented

fun main() {
    val dicodingCat = Cat("Dicoding Miaw", 3.2, 2, true, "Brown", 4)
    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()
}

open class AnimalParent(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
    open fun eat() {
        println("$name sedang makan")
    }

    open fun sleep() {
        println("$name sedang tidur")
    }
}

class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : AnimalParent(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name sedang bermain bersama Manusia")
    }

    override fun eat() {
        println("$name sedang makan ikan")
    }

    override fun sleep() {
        println("$name sedang tidur dibantal")
    }

}