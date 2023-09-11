fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().toInt()
    val arr = arrayListOf<Int>()
    repeat(n) {
        val a = reader.readLine().toInt()
        arr.add(a)
    }
    for (i in 0 until arr.size) {
        for (j in 0 until arr.size) {
            if (arr[i] < arr[j]) {
                //위치바꾸기
                var temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
    }

    arr.forEach {
        println(it)
    }
}