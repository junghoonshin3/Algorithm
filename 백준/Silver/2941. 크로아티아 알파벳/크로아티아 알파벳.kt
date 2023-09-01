fun main() {
    val reader = System.`in`.bufferedReader()

    var s = reader.readLine()
    val alphabet = buildMap {
        put("c=", "č")
        put("c-", "ć")
        put("dz=", "dž")
        put("d-", "đ")
        put("lj", "lj")
        put("nj", "nj")
        put("s=", "š")
        put("z=", "ž")
    }
    alphabet.forEach { alpha ->
        if (s.contains(alpha.key)) {
            s = s.replace(alpha.key, " ") //공백으로 치환하여 하나의 문자로 카운터 되도록 한다.
        }
    }

    println(s.length)
}