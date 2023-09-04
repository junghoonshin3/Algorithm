fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().toInt()
    var count = 0
    var sum = 1
    while (true) {
        sum += (6 * count++)
        if (sum >= n) {
            break
        }
    }
    println(count)
}