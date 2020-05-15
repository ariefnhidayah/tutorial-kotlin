package com.dicoding.kotlin.collections

fun main() {
//     Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik
//    nilai tidak ada yg boleh sama
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

//    urutan set tidak terlalu penting
    val setA = setOf(1, 2, 5, 6, 2)
    val setB = setOf(2, 5, 1, 6)
    println(setA == setB)

//    dapat melakukan pengecekan apakah nilai tersebut ada didalam set
    println(5 in setA)

//    fungsi union dan intersect untuk mengetahui gabungan dan irisan dari 2 (dua) buah Set
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

//    Pada Set kita bisa menambah dan menghapus item namun tak bisa mengubah nilai seperti pada List
    val setD = mutableSetOf(1, 5, 7)
    setD.add(10)
    setD.remove(1)
    println(setD)
}