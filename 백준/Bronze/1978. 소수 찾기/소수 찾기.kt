fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().toInt()
    val input = reader.readLine().split(" ")
    var count = 0
    for (i in input) {
        val num = i.toInt()
        var flag = true
        if (num == 1) {
            continue
        }
        for (j in 2 until num) {
            if (num % j == 0) {
                flag = false
                break
            }
        }
        if (flag) {
            count++
        }
    }
    println(count)
}