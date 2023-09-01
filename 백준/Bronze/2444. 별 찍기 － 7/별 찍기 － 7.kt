fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().toInt()
    for (i in 1..n) {
        for (j in 1..n - i) print(" ")
        for (j in 1..(2 * i) - 1) print("*")
        println()
    }
    for (i in n - 1 downTo (1)) {
        for (j in i until n) print(" ")
        for (j in 1 until 2 * i) print("*")
        println()
    }
}