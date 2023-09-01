fun main() {
    val reader = System.`in`.bufferedReader()

    val s = reader.readLine()

    if (s.isEmpty() || s.length > 100) return

    val reverse = s.reversed()
    if (s.compareTo(reverse) == 0) {
        println(1)
    } else {
        println(0)
    }


}