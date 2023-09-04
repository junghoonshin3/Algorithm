fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().toInt()
    var m = 1
    //한변의 갯수 1 -> 2 -> 4 -> 8 -> 16 -> 32
    //한변의 점의 갯수는 위에꺼 +1 /  2 -> 3 -> 5 -> 9 -> 17 -> 33
    // 모든 점의 갯수는 한변의 점의 갯수의 제곱임
    for (i in 1..n) {
        m *= 2
    }
    var answer = 1

    for (i in 1..2) {
        answer *= (m + 1)
    }

    println(answer)

}