package com.dicoding.kotlin.generics

class ListNumber<T: Number>: List<Int> {
    override fun get(index: Int): Int {
        return 1
    }
}

fun main() {
    val numbers2 = ListNumber<Int>()
}