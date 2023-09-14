fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()
    val n = reader.readLine().toInt()
    val nMap = mutableMapOf<String, String>()

    repeat(n) {
        val s = reader.readLine().split(" ")
        nMap[s[0]] = s[1]
    }

    nMap.filter { it.value == "enter" }.toSortedMap(compareByDescending {
        it
    }).forEach { (t, _) ->
        writer.write(t)
        writer.newLine()
    }

    writer.flush()
    writer.close()
}