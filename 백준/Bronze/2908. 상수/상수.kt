fun main() {
    val reader = System.`in`.bufferedReader()
    val input = reader.readLine().split(" ")
    val num1 = input.first().reversed()
    val num2 = input.last().reversed()

    println(if (num1 > num2) num1 else num2)
}