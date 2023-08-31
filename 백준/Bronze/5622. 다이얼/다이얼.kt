fun main() {
    val reader = System.`in`.bufferedReader()
    val map = buildMap<String, Int> {
        put("A", 2)
        put("B", 2)
        put("C", 2)
        put("D", 3)
        put("E", 3)
        put("F", 3)
        put("G", 4)
        put("H", 4)
        put("I", 4)
        put("J", 5)
        put("K", 5)
        put("L", 5)
        put("M", 6)
        put("N", 6)
        put("O", 6)
        put("P", 7)
        put("Q", 7)
        put("R", 7)
        put("S", 7)
        put("T", 8)
        put("U", 8)
        put("V", 8)
        put("W", 9)
        put("X", 9)
        put("Y", 9)
        put("Z", 9)
    }

    val s = reader.readLine().uppercase()
    var sum = s.length
    s.forEach {
        sum += map[it.toString()] ?: 0
    }
    println(sum)
}