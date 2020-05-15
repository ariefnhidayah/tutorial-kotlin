package com.dicoding.kotlin

fun main() {
//    val listOfInt = listOf(1, 2, 3, null, 5, 6, null, 8)
//
//    for (i in listOfInt) {
//        if(i == null) break
//        print(i)
//    }

//    break dan continue label
    loop@ for (i in 1..100) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if(j > 5) break@loop
        }
    }
}