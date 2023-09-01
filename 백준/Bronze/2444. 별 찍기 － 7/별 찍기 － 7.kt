fun main() {
    val reader = System.`in`.bufferedReader()

    val n = reader.readLine().toInt()

    for (i in 1..n) {
        for (j in 1..n - i) print(" ")
        for (j in 1..2 * i - 1) print("*")
        println()
    }
    for (i in 1..n) {
        for (j in 1..i) print(" ")
        for (j in i until (2 * n - 1) - i) print("*")
        println()
    }
}