infix fun String.to(type: String): String {
    if(type == "UP") {
        return this.uppercase()
    } else {
        return this.lowercase()
    }
}

fun main() {
    val result = "Otong" to "UP"
    println(result)
}