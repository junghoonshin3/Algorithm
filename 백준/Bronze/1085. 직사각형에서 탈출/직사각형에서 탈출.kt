fun main() {
    val reader = System.`in`.bufferedReader()
    val s = reader.readLine().split(" ")
    val x = s[0].toInt()
    val y = s[1].toInt()
    val w = s[2].toInt()
    val h = s[3].toInt()
    val a = 0
    val b = 0

    val l = if (x - a > w - x) {
        w - x
    } else {
        x - a
    }
    val t = if (y - b > h - y) {
        h - y
    } else {
        y - b
    }

    val result = if (t > l) l else t
    println(result)
}