package com.dicoding.kotlin.dataClasses

import javax.xml.crypto.Data

fun main() {
    val user = User("Arief", 18)
    val dataUser = DataUser("Arief", 18)

    println(user)
    println(dataUser)

//    kelebihan data classes lain
//    terdapat fungsi equals secara otomatis
    val dataUser2 = DataUser("Arief", 18)
    val dataUser3 = DataUser("Hidayah", 20)
//    println(dataUser.equals(dataUser2))
//    println(dataUser.equals(dataUser3))

//    copy
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 29)
    println(dataUser4)
    println(dataUser5)

//    destructuring declaration = memetakan objek menjadi sebuah variabel
//    val name = dataUser.component1()
//    val age = dataUser.component2()
//    println("My name si $name, I'm $age years old")

//    atau bisa
    val (name, age) = dataUser
    println("My name is $name, I'm $age years old")
}

class User (val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser (val name: String, val age: Int)