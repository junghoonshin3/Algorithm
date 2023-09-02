fun main() {
    val reader = System.`in`.bufferedReader()
    var writer = System.out.bufferedWriter()
    val arr = Array(5) {
        Array(15) { "" }
    }

    repeat(5) { index ->
        val input = reader.readLine()
        input.forEachIndexed { i, c ->
            arr[index][i] = c.toString()
        }
    }
    repeat(15) { row ->
        repeat(5) { col ->
            writer.write(arr[col][row])
        }
    }
    writer.flush()
    writer.close()
}