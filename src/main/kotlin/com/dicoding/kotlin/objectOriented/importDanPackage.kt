package com.dicoding.kotlin.objectOriented
import kotlin.random.Random
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sqrt as akar
//mengimpor seluruh kelas = kotlin.math.*

fun main() {
    val someInt = Random(0).nextInt(1, 100)
    println(someInt)

    println(PI)
    println(cos(120.0))
    println(akar(9.0))
}