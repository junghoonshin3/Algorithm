fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()
    while (true) {
        val a = reader.readLine().toInt()
        var arr = arrayListOf<Int>()
        if (a == -1) break

        for (i in 1 until a) {
            if (a % i == 0) {
                arr.add(i)
            }
        }
        if (arr.sum() == a) {
            writer.append("$a = ")
            arr.sorted().forEachIndexed { index, i ->
                if (arr.size - 1 == index) {
                    writer.append("$i")
                    return@forEachIndexed
                }
                writer.append("$i + ")
            }
        } else {
            writer.append("$a is NOT perfect.")
        }
        writer.newLine()
    }
    writer.flush()
    writer.close()
}