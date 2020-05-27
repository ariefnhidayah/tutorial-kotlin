package com.dicoding.kotlin.functionalProgramming

fun main() {

//    FOLD
    val numbers = listOf(1, 2, 3, 9, 12)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println(fold)

//    foldRight, kebalikan dr diatas, dihitung dr listOf sebelah kanan terlebih dahulu

//    DROP
    val numberDrop = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val drop = numberDrop.drop(3)
    println(drop)

    val dropLast = numberDrop.dropLast(3)
    println(dropLast)

//    TAKE
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)
    val takeLast = total.takeLast(3)
    println(takeLast)
}