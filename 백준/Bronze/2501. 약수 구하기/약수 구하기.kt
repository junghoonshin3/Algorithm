fun main() {
    val reader = System.`in`.bufferedReader()
    val input = reader.readLine().split(" ")
    val n = input[0].toInt()
    val k = input[1].toInt()
    val arr = arrayListOf<Int>()
    for (i in 1..n) {
        val m = n % i
        if (m == 0) {
            arr.add(i)
        }
    }
    if (arr.size < k) {
        println(0)
        return
    }
    arr.sorted().filterIndexed { index, _ -> index == k - 1 }
        .map {
            println(it)
        }
}