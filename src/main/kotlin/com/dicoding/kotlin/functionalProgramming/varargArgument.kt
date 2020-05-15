package com.dicoding.kotlin.functionalProgramming

fun main() {
    val numbers = setNumbers(20, 21, 22, 10)
    println(numbers)
    val numberSize = getNumberSize(20, 21, 22, 10)
    println(numberSize)

//    penggunaan ketika terdapat vararg dan argument biasa
    println(sets(20, 21, 22, name = "Arief"))
}

fun setNumbers(vararg number: Int): Int {
    return number.sum()
}

// Selain itu, kita juga bisa menerapkan Generic untuk tipe parameter ketika parameter tersebut ditentukan dengan vararg. Contohnya seperti berikut:
fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input) {
        result.add(item)
    }
    return result
}

fun getNumberSize(vararg number: Int): Int {
    return number.size
}

// Aturan vararg
// 1. Dalam penggunaannya, terdapat aturan yang perlu kita ketahui. Pertama, di dalam sebuah fungsi, tidak diizinkan untuk memiliki 2 (dua) parameter bertanda vararg.
// 2. Selanjutnya, jika kita ingin menambahkan parameter baru tanpa kata kunci vararg, parameter yang ditandai dengan vararg harus berada pada posisi pertama. Contohnya seperti berikut:

fun sets(vararg number: Int, name: String): String {
    return "$name ${number.sum()}"
}