package com.dicoding.kotlin.objectOriented2

interface IFly {
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if (numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I'm flying without wings")
    }
}

fun main() {
    val bird = Bird(0)
    println(bird.fly())
}