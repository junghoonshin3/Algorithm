fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()
    val s = reader.readLine().split(" ").map { it.toInt() }
    val a = reader.readLine().split(" ")
    val b = reader.readLine().split(" ")
    val aMap = mutableMapOf<String, Int>()
    val bMap = mutableMapOf<String, Int>()
    var aC = 0
    var bC = 0
    for (i in a) {
        aMap[i] = 0
    }
    for (i in b) {
        bMap[i] = 0
    }
    b.forEach {
        if (!aMap.containsKey(it)) {
            aC++
        }
    }

    a.forEach {
        if (!bMap.containsKey(it)) {
            bC++
        }
    }

    println(aC + bC)
}