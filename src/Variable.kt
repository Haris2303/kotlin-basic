const val APPLICATION = "Learn Kotlin Basic"
const val VERSION = "0.0.1"

fun main() {
    val firstName = "Ucup"
    val age: Byte = 50

    println(firstName)
    println(age)

//    Tidak direkomendasikan, sebisanya tidak menggunakan var yg bernilai null
    var name: String? = null
    name = "Ucup"
    println(name)
    println(name?.length)

    println("$APPLICATION : $VERSION")
}