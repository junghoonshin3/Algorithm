fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()
    val n = reader.readLine().toInt()
    val s = reader.readLine().split(" ").map { it.toInt() }
    val sortedArr = s.distinct().sorted()

    for (i in s) {
        writer.write("${sortedArr.binarySearch(i)} ")
    }
    writer.flush()
    writer.close()
}
