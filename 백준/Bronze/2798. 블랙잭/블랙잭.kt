fun main() {
    val reader = System.`in`.bufferedReader()
    val s = reader.readLine().split(" ")
    val card = reader.readLine().split(" ").map { it.toInt() }.sortedDescending()
    val n = s[0].toInt()
    val m = s[1].toInt()
    var result = 0
    for (i in card.indices) {
        for (j in i + 1 until card.size) {
            for (k in j + 1 until card.size) {
                val sum = card[i] + card[j] + card[k]
                if (sum > result && sum <= m) {
                    result = sum
                }
            }
        }
    }
    println(result)
}