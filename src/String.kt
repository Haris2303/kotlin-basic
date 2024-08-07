fun main() {
    var firstName: String = "Otong"
    var lastName: String = "Surotong"

    var address: String = """
        Jalan Rusak, RT 003 RW 006
        Kabupaten Mamayo
        Sulawesi
        Indonesia
    """.trimIndent()

    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = firstName + " " + lastName
    println(fullName)

    var desc: String = "$firstName $lastName Markotong, char : ${fullName.length}"
    println(desc)
}