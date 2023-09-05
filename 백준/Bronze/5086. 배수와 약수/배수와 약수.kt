fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()
    while (true) {
        val input = reader.readLine().split(" ")
        val first = input.first().toInt()
        val second = input.last().toInt()

        if (first == 0 && second == 0) {
            break
        }

        if (second % first == 0) {
            //첫번째 조건
            writer.append("factor")
        } else if (first % second == 0) {
            //두번쨰 조건
            writer.append("multiple")
        } else if (first % second != 0 && second % first != 0) {
            writer.append("neither")
        }
        writer.newLine()
    }
    writer.flush()
    writer.close()
}