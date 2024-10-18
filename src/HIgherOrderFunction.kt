fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    val toUpper = {value: String -> value.uppercase()}
    println(hello("Otong", toUpper))

    println(hello("Ucup", {value: String -> value.lowercase()}))

    val result = hello("Bambang") { value: String ->
        value.lowercase()
    }

    println(result)
}