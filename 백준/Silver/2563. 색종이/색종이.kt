fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().toInt()
    val recode = mutableMapOf<String, Int>()
    repeat(n) {
        val p = reader.readLine().split(" ")
        val pX = p[0].toInt()
        val pY = p[1].toInt()
        for (i in pX until pX + 10) {
            for (j in pY until pY + 10) {
                recode["${i},${j}"] = recode.getOrDefault("${i},${j}", 0).plus(1)
            }
        }
    }
    println(recode.size)
}