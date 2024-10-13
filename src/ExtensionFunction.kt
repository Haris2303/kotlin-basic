fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {
    val name = "Ucup"
    println(name.hello())

    name.printHello()
}