package com.dicoding.kotlin.generics

fun main() {
//    val generics = listOf("Test", "Ini", "Arief")
//    println(generics)
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
    println(firstLong)
}

//mendeklarasikan class generics
interface List<T> {
    operator fun get(index: Int): T
}

//contoh menggunakan inheritance
class LongList: List<Long> {
    override fun get(index: Int): Long {
        return 0
    }
}

class ArrayList<T>: List<Int> {
    override fun get(index: Int): Int {
        return 0
    }
}