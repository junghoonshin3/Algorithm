fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().toInt()
    if (n == 1) return
    var temp = n
    val result = arrayListOf<Int>()
    while (temp > 1) {
        for (i in 2..temp) {
            if (temp % i == 0) {
                result.add(i)
                temp /= i
                break
            }
        }
    }
    result.sorted().forEach {
        println(it)
    }
}