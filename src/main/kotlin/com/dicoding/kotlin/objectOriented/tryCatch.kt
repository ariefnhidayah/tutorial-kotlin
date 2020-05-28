package com.dicoding.kotlin.objectOriented

import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    val someStringValue: String? = null
    var someIntValue: Int = 0

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    } finally {
        println(someMustNotNullValue)
    }

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when (someIntValue) {
            0 -> println("Catch NullPointerException terpanggil")
            -1 -> println("Catch NumberFormatException terpanggil")
            else -> println(someIntValue)
        }
    }
}