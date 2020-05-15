package com.dicoding.kotlin

fun main() {

    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    filter()
    val evenList = numberList.filter { it % 2 == 0 }
//    filterNot()
    val notEvenList = numberList.filterNot { it % 2 == 0 }
//    map()
    val multipliedBy5 = numberList.map { it * 5 }
//    count()
    print(numberList.count())
    print(numberList.count { it % 3 == 0 })
//    find(), firstOrNull(), & lastOrNull()
    val firstOddNumber = numberList.find { it % 2 == 1 }
//    first() & last()
    val moreThan10 = numberList.first { it > 10 }
//    sum()
    val total = numberList.sum()
//    sorted()
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()
}