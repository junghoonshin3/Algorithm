fun main() {
    val reader = System.`in`.bufferedReader()
    var arr = arrayListOf<Int>()
    var sum = 0
    repeat(5) {
        val a = reader.readLine().toInt()
        sum += a
        arr.add(a)
    }

    arr = selectSort(arr)



    println(sum / 5)
    println(arr[2])
}

fun selectSort(array: ArrayList<Int>): ArrayList<Int> {
    var arr = array
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
    return arr
}