fun toUpper(value: String): String = value.uppercase()

fun main() {
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val fullName = contohLambda("Otong", "Surotong")
    println(fullName)

    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello(fullName))

    val toUpperCase : (String) -> String = ::toUpper

    println(toUpperCase(fullName))
}