package com.dicoding.kotlin.generics

class ListNumber<T: Number>: List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

fun main() {
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
}