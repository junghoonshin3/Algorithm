fun main() {
    val reader = System.`in`.bufferedReader()
    val m = reader.readLine().toInt()
    val n = reader.readLine().toInt()
    var arr = arrayListOf<Int>()
    for (i in m..n) {
        var flag = true
        if (i == 1) continue
        for (j in 2 until i) {
            if (i % j == 0) {
                flag = false
                break
            }
        }
        if (!flag) continue else arr.add(i)
    }
    if (arr.size == 0) {
        println(-1)
        return
    }
    println(arr.sum())
    println(arr.min())
}