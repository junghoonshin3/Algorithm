fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().toInt()
    val array = Array(n) { Pair(0, 0) }
    repeat(n) {
        val s = reader.readLine().split(" ").map { it.toInt() }
        array[it] = Pair(s[0], s[1])
    }

    array.sortWith(compareBy<Pair<Int, Int>> {
        it.first
    }.thenBy { it.second })
    array.forEach {
        println("${it.first} ${it.second}")
    }

}
