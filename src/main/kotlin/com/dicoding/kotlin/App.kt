package com.dicoding.kotlin

import java.lang.reflect.Type

// main function
fun main() {
   val nama = "Arief"
   print("Hello my name is ")
   println(nama)
   println(if(true) "Always true" else "always else")
//   println dengan enter sedangkan print tidak dengan enter
//   Tipe data
//   var company: String = 'Arief'
//   perbedaan var dan val, var datanya dapat diubah sedangkan val tidak dapat diubah

//   penggunaan concat pada kotlin
   val firstWord = "Arief"
   val lastWord = "Hidayah"
   println(firstWord + " " + lastWord)

//   + pada int
   val valueA = 10
   val valueB = 20
   println(valueA + valueB)

//   tipe data character (menggunakan '' dan hanya menampung 1 karakter)
//   val character = 'A'
   var vocal = 'A'
   println("Vocal " + vocal++)
   println("Vocal " + vocal++)
   println("Vocal " + vocal++)
   println("Vocal " + vocal++)
   println("Vocal " + vocal++)
   println("Vocal " + vocal++)

//   tipe data strings
   var textString = "Kotlin"
   var firstText = textString[0]
   println("First character of $textString is $firstText")

//   for (char in textString) {
//      print("$char ")
//   }

   var statement = "Kotlin is \"Awesome!\""
   println(statement)
//   escaped :
//   \t
//   \n
//   \b
//   \r
//   \'
//   \"
//   \\

//   menambah unicode
   val unicode = "Unicode test: \u0394"
   println(unicode)

//   raw string
   val line = """
      Line 1
      Line 2
      Line 3
      Line 4
   """.trimIndent()
   print(line)
}