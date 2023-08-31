fun main() {
    val reader = System.`in`.bufferedReader()
    while (true) {
        reader.readLine()?.let {
            if (it.isNotBlank()) {
                println(it)
            }
        } ?: break
    }
}
