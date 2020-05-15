package com.dicoding.kotlin

fun main() {
//    int(32bit)
//    val intNumber = 100

//    long (64bit)
//    val longNumbers: Long = 100
//    atau
//    val longNumbers = 100L
//    print(longNumbers)

//    short(16bit)
//    val shortNumber: Short = 100

//    byte(8bit)
//    val byteNumber = 0b11010010

//    double (64bit)
//    val doubleNumbers = 1.3

//    untuk mengetahui nilai max numbers
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    println(maxInt)
    println(minInt)

//    jika memasukkan melebihi nilai maksimal
    val overRangeInt = Int.MAX_VALUE + 1
    println(overRangeInt)

//    Di Kotlin kita tidak bisa melakukan konversi secara langsung. Contoh, ketika ingin melakukan konversi dari tipe data Byte ke tipe data Int.
//    cara konversi :
//    toByte(): Byte
//    toShort(): Short
//    toInt(): Int
//    toLong(): Long
//    toFloat(): Float
//    toDouble(): Double
//    toChar(): Char
    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt()
    println(intNumber)

//    contoh lain
    val stringNumber: String = "23"
    val intNumber2 = 3
    println(intNumber2 + stringNumber.toInt())
//    kotlin juga dapat menuliskan nilai numerik yang readable
    val readableNumber = 1_000_000
    println(readableNumber)
}