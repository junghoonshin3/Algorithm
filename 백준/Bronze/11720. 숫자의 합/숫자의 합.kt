fun main() {
    val reader = System.`in`.bufferedReader()
    val r = reader.readLine().toInt()
    val numArray = IntArray(size = r)
    repeat(r) {
        numArray[it] = reader.read() - '0'.code
    }
    println(numArray.sum())
}