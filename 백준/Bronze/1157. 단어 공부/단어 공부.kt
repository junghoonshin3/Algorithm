fun main() {
    val reader = System.`in`.bufferedReader()

    val s = reader.readLine()
    var map = mutableMapOf<Char, Int>()
    for (i in s.indices) {
        val t1 = s[i].code
        if (map.containsKey(s[i])) continue
        else map[s[i]] = 1
        for (j in i + 1 until s.length) {
            val t2 = s[j].code
            if (t1 == t2 || t1 - t2 == -32 || t1 - t2 == 32) {
                map[s[i]] = map.getOrDefault(s[i], 1).plus(1)
            }
        }
    }

    var count = map.count {
        it.value == map.values.max()
    }
    if (count != 1) {
        println("?")
        return
    }

    map.filter { it.value == map.values.max() }.map {
        println(it.key.uppercase())
    }
}