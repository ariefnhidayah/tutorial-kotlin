package com.dicoding.kotlin.objectOriented

fun main() {
    val dicodingCat = Animal2()
    println("Nama ${dicodingCat.name}")
    dicodingCat.name = "Goose"
    println("Nama ${dicodingCat.name}")
}

class Animal2 {
    var name: String = "Dicoding Miaw"
        get() {
            println("Fungsi getter terpanggil")
            return field
        }
        set(value) {
            println("Fungsi setter terpanggil")
            field = value
        }
}