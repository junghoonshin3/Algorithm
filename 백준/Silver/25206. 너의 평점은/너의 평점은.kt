fun main() {
    val reader = System.`in`.bufferedReader()
    val n = 20
    val scoreList = buildMap {
        put("A+", 4.5)
        put("A0", 4.0)
        put("B+", 3.5)
        put("B0", 3.0)
        put("C+", 2.5)
        put("C0", 2.0)
        put("D+", 1.5)
        put("D0", 1.0)
        put("F", 0.0)
    }
    var majorSum = 0.0
    var totalScore = 0.0
    repeat(n) {
        val l = reader.readLine()
        val score = l.split(" ")[1].toDouble()
        val grade = l.split(" ")[2]
        if (grade != "P") {
            majorSum += score * scoreList[grade]!!
            totalScore += score
        }
    }
    val result = majorSum.div(totalScore)

    println(String.format("%.6f", result))
}