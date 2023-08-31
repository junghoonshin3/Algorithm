fun main() {
    val reader = System.`in`.bufferedReader()
    val s = reader.readLine()
    if (s.isNullOrBlank()) println(0)
    else {
        val result = s.trim().split(" ")
        println(result.size)
    }
}