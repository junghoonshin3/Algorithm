fun main() {
    val reader = System.`in`.bufferedReader()
    val c = reader.readLine()
    val r = c.chars().map { it }
    r.forEach {
        println(it)
    }
}