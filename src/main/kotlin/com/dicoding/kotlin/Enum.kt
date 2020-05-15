package com.dicoding.kotlin

fun main() {
//    val colorRed = Color.RED
//    val colorGreen = Color.GREEN
//    val colorBlue = Color.BLUE
//    print(colorRed)
//    val color : Color = Color.RED
//    print(color)

//    untuk mengambil banyak objek enum
//    val colors : Array<Color> = Color.values()
//    colors.forEach { color ->
//        println(color)
//    }
//    untuk mengambil 1 objek enum
//    val red : Color = Color.valueOf("RED")
//    println("Color is $red")

//    atau
//    val colors2 : Array<Color> = enumValues()
//    colors2.forEach {color2 ->
//        println(color2)
//    }
//
//    val red : Color = enumValueOf("RED")
//    println("Color is $red")

//    ordinal, mendapatkan posisi enum seperti array dimulai dr 0
//    val color : Color = Color.RED
//    println("Position RED is ${color.ordinal}")

//    cara kita mengecek instance dari Enum itu sendiri? menggunakan when expression
    val color: Color = Color.GREEN
    when(color) {
        Color.RED -> print("Color is RED")
        Color.BLUE -> print("Color is BLUE")
        Color.GREEN -> print("Color is GREEN")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

//enum class Color {
//    RED, GREEN, BLUE
//}

//enum class Color (val value: Int) {
//    RED(0xFF0000) {
//        override fun printValue() {
//            println("value of RED is $value")
//        }
//    },
//    GREEN(0x00FF00) {
//        override fun printValue() {
//            println("value of GREEN is $value")
//        }
//    },
//    BLUE(0x0000FF) {
//        override fun printValue() {
//            println("value of BLUE is $value")
//        }
//    };
//
//    abstract fun printValue()
//}