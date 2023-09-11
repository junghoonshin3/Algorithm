fun main() {
    val reader = System.`in`.bufferedReader()
    val s = reader.readLine().split(" ").map { it.toInt() }
    val n = s.first()
    val m = s.last()
    val arr = arrayListOf<String>()
    repeat(n) {
        val l = reader.readLine()
        arr.add(l)
    }
    var answer = 8 * 8
    for (i in 0..n - 8) {
        for (j in 0..m - 8) {
            var w_count = 0
            var b_count = 0

            for (k in 0 until 8) {
                for (l in 0 until 8) {
                    val nx = k + i
                    val ny = l + j

                    if (arr[nx][ny] == 'B' && (nx + ny) % 2 == 0) {
                        w_count++
                    } else if (arr[nx][ny] == 'W' && (nx + ny) % 2 == 1) {
                        w_count++
                    }

                    if (arr[nx][ny] == 'W' && (nx + ny) % 2 == 0) {
                        b_count++
                    } else if (arr[nx][ny] == 'B' && (nx + ny) % 2 == 1) {
                        b_count++
                    }
                }
            }
            if (w_count > b_count) {
                if (answer > b_count) {
                    answer = b_count
                }
            } else {
                if (answer > w_count) {
                    answer = w_count
                }
            }

        }
    }
    println(answer)
}