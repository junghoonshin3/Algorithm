fun main() {
    val reader = System.`in`.bufferedReader()
    val num = reader.readLine().toInt()

    repeat(3) {
        val s = reader.readLine()
        println("${s.first()}${s.last()}")
    }
}