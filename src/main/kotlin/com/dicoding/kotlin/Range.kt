package com.dicoding.kotlin

fun main() {
//    deklarasi range
//    val rangeInt = 1..10 step 2 //untuk merubah step
    val rangeInt = 1.rangeTo(10)
//    print(rangeInt.step)
// merubah nilai step
//    rangeInt.forEach {
//        print("$it")
//    }
//    println(rangeInt.step)

//    downTo
    val downInt = 10.downTo(1)
    if(7 in downInt) {
        println("value 7 available")
    }
    if(11 !in downInt) {
        println("No value 11 in range")
    }

//    range char
    val character = 'A'.rangeTo('G')
    character.forEach {
        print("$it")
    }
}