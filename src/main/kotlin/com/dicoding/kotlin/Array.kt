package com.dicoding.kotlin

fun main() {
    val array = arrayOf(1, 3, 5, 7, 8)
    val mixArray = arrayOf(1, 3, 4, "Arief", true)
    println(array[2])
    println(mixArray[3])

//    membuat array sesuai tipe data
//    intArrayOf() => int
//    booleanArrayOf() => boolean
//    charArrayOf() => char
//    longArrayOf() => long
//    shortArrayOf() => short
//    byteArrayOf() => ByteArray
    val intArray = intArrayOf(1, 3, 5, 6, 8)
    println(intArray[0])
    intArray[2] = 11
    println(intArray[2])
    print("\n")

//    menggunakan Array()
    val testArray = Array(4, {i -> i * i})
    for (arr in testArray) {
        println(arr)
    }
}