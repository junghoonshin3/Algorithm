fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()
    val t = reader.readLine().toInt()
    val arr = arrayListOf(25, 10, 5, 1)

    repeat(t) {
        var c = reader.readLine().toInt()
        arr.forEach {
            val a = c / it
            c %= it
            writer.append("$a ")
        }
        writer.newLine()
    }
    writer.flush()
    writer.close()
}