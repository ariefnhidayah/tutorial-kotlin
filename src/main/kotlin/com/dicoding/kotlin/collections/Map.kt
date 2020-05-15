package com.dicoding.kotlin.collections

fun main() {
//    Turunan yang ketiga adalah Map, yakni sebuah collection yang dapat menyimpan data dengan format key-value
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])

//    menampilkan key
    val mapKeys = capital.keys
    println(mapKeys)

//    menampilkan values
    val mapValues = capital.values
    println(mapValues)

//    menjadikan mutable
    val mutableCapital = capital.toMutableMap()
//    untuk menambahkan key dan value
    mutableCapital.put("Amsterdam", "Netherlands")
    println(mutableCapital["Amsterdam"])
}