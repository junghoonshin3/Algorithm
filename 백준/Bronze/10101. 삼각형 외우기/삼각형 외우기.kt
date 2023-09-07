fun main() {
    val reader = System.`in`.bufferedReader()
    val arr = arrayListOf<Int>()
    repeat(3) {
        val a = reader.readLine().toInt()
        arr.add(a)
    }
    if (arr.sum() != 180) {
        println("Error")
    } else if (arr[0] == 60 && arr[1] == 60 && arr[2] == 60) {
        println("Equilateral")
    } else if (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2]) {
        println("Isosceles")
    } else {
        println("Scalene")
    }
}