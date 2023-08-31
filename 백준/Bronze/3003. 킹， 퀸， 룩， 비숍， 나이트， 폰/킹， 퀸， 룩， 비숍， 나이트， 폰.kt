fun main() {
    val total = intArrayOf(1, 1, 2, 2, 2, 8)
    val input = readln().split(" ").map { it.toInt() }.toIntArray()

    input.mapIndexed { index, i ->
        input[index] = total[index] - i
    }
    var answer = ""
    input.forEach {
        answer += "$it "
    }

    println(answer.trim())
}
