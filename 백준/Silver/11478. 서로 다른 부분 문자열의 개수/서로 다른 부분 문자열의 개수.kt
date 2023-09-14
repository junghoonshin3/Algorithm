fun main() {
    val reader = System.`in`.bufferedReader()
    val s = reader.readLine()
    val set = mutableSetOf<String>()
    for (i in s.indices) {
        for (j in i until s.length) {
            set.add(s.substring(i, j + 1))
        }
    }
    println(set.size)
}