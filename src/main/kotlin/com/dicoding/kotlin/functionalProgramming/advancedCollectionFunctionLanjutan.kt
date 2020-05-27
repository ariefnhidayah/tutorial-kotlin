package com.dicoding.kotlin.functionalProgramming

fun main() {
//    slice
    val index = listOf(2, 3, 5, 8)
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6 step 2)
    val sliceIndex = total.slice(index)

    println(slice)
    println(sliceIndex)

//    DISTINCT
    val totalDistinct = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = totalDistinct.distinct()
    println(distinct)

    data class Item(val key: String, val value: Any)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItem = items.distinctBy { it.key }
    distinctItem.forEach {
        println("${it.key} with value ${it.value}")
    }

//    distinctBy dapat menyaring item yang memiliki panjangnya sama
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinctText = text.distinctBy { it.length }
    println(distinctText)

//    CHUNKED
    val word = "QWERTY"
    val chunked = word.chunked(3)
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }
    println(chunked)
    println(chunkedTransform)
}