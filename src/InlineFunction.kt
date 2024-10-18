inline fun hello(firstName: () -> String, noinline lastName: () -> String): String {
    return "Hello ${firstName()} ${lastName()}"
}

fun main() {

    println(hello({"Ucup"}, {"Surucup"}))
    println(hello({"Otong"}, {"Surotong"}))
}