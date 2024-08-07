fun main() {
    val names: Array<String> = arrayOf("Otong", "Ucup", "Bambang")

    val otong: String = names.get(0)
    val ucup: String = names.get(1)
    val bambang: String = names.get(2)

    println(otong)
    println(ucup)
    println(bambang)

    names[1] = "Rusdi"
    val rusdi: String = names[1]

    println(rusdi)

//    Array null

    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Ambatron"
    members[1] = "Ambatron"
    members[2] = null
    members[3] = "Ambatron"
    members[4] = "Ambatron"
    println(members[0])
    println(members.size)
}