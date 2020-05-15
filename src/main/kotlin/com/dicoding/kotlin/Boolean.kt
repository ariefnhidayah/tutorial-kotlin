package com.dicoding.kotlin

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 12

//    val isOpen = if (now >= officeOpen && now <= officeClosed) {
//        true
//    } else {
//        false
//    }

//    lebih ringkas
//    AND
//    val isOpen = now >= officeOpen && now <= officeClosed

//    OR
//    val isOpen = now >= officeOpen || now <= officeClosed
//    print("Office open: $isOpen")

//    NOT
    val isOpen = now > officeOpen
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}