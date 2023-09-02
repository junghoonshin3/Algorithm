fun main() {
    val reader = System.`in`.bufferedReader()
    val arr = Array(9) {
        Array(9) { 0 }
    }

    repeat(9) { row ->
        val str = reader.readLine().split(" ")
        repeat(9) { col ->
            arr[row][col] = str[col].toInt()
        }
    }
    var max = 0
    var maxRow = 0
    var maxCol = 0

    arr.forEachIndexed { row, strings ->
        strings.forEachIndexed { col, s ->
            if (max < s) {
                maxRow = row
                maxCol = col
                max = s
            }
        }
    }
    print("$max \n${maxRow + 1} ${maxCol + 1}")
}