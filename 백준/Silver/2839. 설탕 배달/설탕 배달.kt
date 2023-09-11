fun main() {
    val reader = System.`in`.bufferedReader()
    var kg = reader.readLine().toInt()
    var count = 0
    while (kg > 0) {
        if (kg % 5 == 0) {
            count += kg / 5
            kg = 0
            break
        }
        kg -= 3
        count++
    }
    if (kg != 0) {
        println(-1)
        return
    }
    println(count)
}