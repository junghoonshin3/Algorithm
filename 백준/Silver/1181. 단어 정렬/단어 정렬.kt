fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().toInt()
    val set = mutableSetOf<String>()
    repeat(n) {
        val s = reader.readLine()
        set.add(s)
    }

    set.sortedWith(compareBy<String> {
        it.length
    }.thenBy { it }).forEach {
        println(it)
    }
}
