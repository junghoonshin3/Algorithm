fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine()
    val start = (n.toInt() - n.length * 9)
    var arr = arrayListOf<Int>()
    for (i in start..n.toInt()) {
        val l = i.toString()
        var sum = 0
        for (j in l) {
            val num = j - '0'
            sum += num
        }
        if (i + sum == n.toInt()) {
            arr.add(i)
        }
    }
    if (arr.size == 0) {
        println(0)
        return
    }
    println(arr.min())
}