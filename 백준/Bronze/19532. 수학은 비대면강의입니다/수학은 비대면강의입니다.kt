fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().split(" ").map { it.toInt() }
    val a = n[0]
    val b = n[1]
    val c = n[2]
    val d = n[3]
    val e = n[4]
    val f = n[5]
    val x = (c * e - b * f) / (a * e - b * d)
    val y = (c * d - a * f) / (b * d - a * e)
    //연립방정식 가감법을 이용하여 x,y의 값을 구한다.
    println("$x $y")

}