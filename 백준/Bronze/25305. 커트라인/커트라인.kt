fun main() {
    val reader = System.`in`.bufferedReader()
    val s = reader.readLine().split(" ").map { it.toInt() }
    val n = s[0]
    val k = s[1]
    val x = reader.readLine().split(" ").map { it.toInt() }.toMutableList()
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (x[i] < x[j]) {
                val temp = x[i]
                x[i] = x[j]
                x[j] = temp
            }
        }
    }
    println(x[n - k])

}
