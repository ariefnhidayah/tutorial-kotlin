package com.dicoding.kotlin.objectOriented

open class AnimalVis2(val name: String, protected val weight: Double)

class Cat2(pName: String, pWeight: Double) : AnimalVis2(pName, pWeight)

fun main() {
    val cat = Cat2("Dicoding Miaw", 2.2)
    println("Nama ${cat.name}")
}