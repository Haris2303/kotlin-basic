fun hitungTotal(vararg values: Int): Int {
    var total = 0;
    for (value in values) {
        total += value;
    }
    return total;
}

fun main() {
    // val values = arrayOf(10,10,20)
    val result = hitungTotal(10, 10, 10, 20, 20)

    println(result)
}