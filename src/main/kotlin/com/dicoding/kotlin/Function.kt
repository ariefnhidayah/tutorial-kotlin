package com.dicoding.kotlin

fun main() {
//    fungsi
//    fun NamaFunction(param: tipe_data, param: tipe_data) : return_tipe_data { }
    println(setUser("Arief", 18))
    printUser("Arief")
}

//fun setUser(name: String, age: Int): String {
//    return "Your name is $name and your age $age years old"
//}

// jika hanya 1 return bisa seperti ini
fun setUser(name: String, age: Int): String = "Your name is $name, and your age $age years old"

//jika fungsi tidak ingin mengembalikan data nilai, bisa menggunakan Unit
fun printUser(name: String): Unit {
    print("Hai $name")
}