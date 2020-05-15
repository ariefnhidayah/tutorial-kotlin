package com.dicoding.kotlin

fun main() {
//    val ranges = 1..5
//    val ranges = 1.rangeTo(5)
    val ranges = 1.rangeTo(10) step 3
//    for (i in ranges) {
//        println("value is $i")
//    }

//    dengan index
//    for((index, value) in ranges.withIndex()) {
//        println("value $value with index $index")
//    }

//    forEach
//    ranges.forEach { value ->
//        println("value is $value")
//    }

//    forEach with index
//    ranges.forEachIndexed {index, value ->
//        println("value $value with index $index")
//    }

//    jika ingin menggunakan indexnya saja
    ranges.forEachIndexed { index, _ ->
        println("index is $index")
    }
}