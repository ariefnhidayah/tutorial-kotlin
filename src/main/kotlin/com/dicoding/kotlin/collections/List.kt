package com.dicoding.kotlin.collections

fun main() {
//    membuat list
//    data list tidak bisa dimanipulasi
    val numberList: List<Int> = listOf(1, 2, 3, 4, 5)   // list dengan 1 tipe data
    val charList = listOf('a', 'b', 'c') //bisa ditulis seperti ini

//    membuat list dengan tipe data yang berbeda
    val anyList = listOf("String", "satu", 2, 3, true)
    val anyListDataClasses = listOf("String", "satu", 2, 3, true, User("arief", 18)) //list dengan data classes
    println(anyList[3])

//    cara merubah list agar bisa dimanipulasi
    val listAny = mutableListOf('a', "String", 3, true, User("Arief", 18))
    listAny.add('d') //menambah item diakhir
    listAny.add(1, "love") // menambah item di index 1
    listAny[3] = false //merubah item
    listAny.remove(User("Arief", 18)) //menghapus item
    println(listAny)
}

data class User(val name: String, val age: Int)