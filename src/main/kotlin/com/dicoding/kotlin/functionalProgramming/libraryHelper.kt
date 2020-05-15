package com.dicoding.kotlin.functionalProgramming

fun main() {
//    lambda receiver this
//    Beberapa fungsi yang menggunakan lambda receiver adalah run, with, dan apply.
//    contoh apply
    val buildString = StringBuilder().apply {
        append("Hello ")
        append("Kotlin ")
    }

    println(buildString)

//    lambda argument it (let dan also)
    val text = "Hello"
    text.let {
        val message = "$it kotlin"
        println(message)
    }

//    run
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result $result")

//    with
    val message = "Hello Kotlin!"
    val result2 = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }

    val result3 = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }
    println(result3)
}