fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().toInt()
    var answer = 0
    repeat(n) {
        val s = reader.readLine()
        var set = mutableSetOf<Char>()
        var prev = s[0]
        set.add(prev)
        var isGroup = true
        for (i in 1..s.length - 1) {
            if (prev == s[i]) {
                continue
            }
            if (prev != s[i]) {
                prev = s[i]
                if (!set.add(prev)) { //이미 들어가있다면 false를 반환 -> 그룹단어가 아님
                    isGroup = false
                    break
                }
            }
        }
        if (isGroup) {
            answer++
        }
    }
    println(answer)

}