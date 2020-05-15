package com.dicoding.kotlin

fun main() {
    val openHours = 7
    val closeHours = 16
    val now = 16
//    val office: String
//    if (now > openHours && now < closeHours) {
//        office = "office already open"
//    } else {
//        office = "office is closed"
//    }
//
//    print(office)

//    bisa seperti ini
    val office = if (now > openHours && now <= closeHours) {
        "Office already open"
    } else if(now == openHours) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }
    print(office)
}