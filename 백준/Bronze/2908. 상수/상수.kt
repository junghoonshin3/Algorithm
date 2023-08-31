import java.util.Stack


fun main() {
    val reader = System.`in`.bufferedReader()
    val input = reader.readLine().split(" ")
    val num1 = input.first()
    val num2 = input.last()
    val stack1 = Stack<String>()
    val stack2 = Stack<String>()
    var reverse1 = ""
    var reverse2 = ""
    num1.forEach {
        stack1.add(it.toString())
    }
    num2.forEach {
        stack2.add(it.toString())
    }
    while (!stack1.isEmpty()) {
        reverse1 += stack1.pop()
    }

    while (!stack2.isEmpty()) {
        reverse2 += stack2.pop()
    }

    val r = if (reverse1 > reverse2) {
        reverse1
    } else {
        reverse2
    }

    println(r)
}