package com.dicoding.kotlin.objectOriented2
import kotlin.reflect.KProperty

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        value = newValue
    }
}

class NewAnimal {
    var name: String by DelegateName()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

class NewPerson {
    var name: String by DelegateName()
}

class NewHero {
    var name: String by DelegateName()
}

fun main() {
    val animal = NewAnimal()
    animal.name = "Dicoding Miaw"
    animal.age = 20
    animal.weight = 18.2
    println("Nama Hewan: ${animal.name}, Berat ${animal.weight}, Umur: ${animal.age}")

    val person = NewPerson()
    person.name = "Arief"
    println("Nama Orang: ${person.name}")

    val hero = NewHero()
    hero.name = "Superman"
    println("Superhero: ${hero.name}")
}