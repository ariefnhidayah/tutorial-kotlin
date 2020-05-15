package com.dicoding.kotlin.functionalProgramming

fun main() {
//    val fullname = getFullName(first = "Kotlin", middle = "is", last = "Awesome")
    val fullname = getFullName(middle = "is", last = "Awesome", first = "Kotlin")
    println(fullname)
    val fullname2 = getFullNameDefault()
    println(fullname2)
}

//Named argumen, bisa memindahkan nama argumen ketika dipanggil
fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

//default argument
fun getFullNameDefault(
    first: String = "Kotlin",
    middle: String = "Is",
    last: String = "Awesome"
): String {
    return "$first $middle $last"
}