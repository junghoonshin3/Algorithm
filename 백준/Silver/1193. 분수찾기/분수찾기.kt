fun main() {
    val reader = System.`in`.bufferedReader()
    val n = reader.readLine().toInt()
    var sum = 0
    var group = 0
    // 순서 합산의 결과
    //1 번째 그룹  1-> 1/1 ----- 1
    //2 번쨰 그룹  2-> 1/2 2/1 -----3
    //3 번쨰 그룹  3-> 3/1 2/2 1/3 --- 6
    //4 번쨰 그룹  4-> 4/1 3/2 2/3 1/4 -> 10
    // 5번쨰 분수는 뒤에서 1번째 앞에 있음 => 6 - 5 =1
    // 짝수번째 그룹은 왼쪽 부터 시작, 옆칸으로 이동시 분모가 1씩 감소, 분자는 1씩 증가
    // 홀수번재 그룹은 오른쪽에서 부터 시작, 옆칸으로 이동시 분자가 1씩 감소, 분모는 1씩 증가
    // 같은 그룹의 분모와 분자의 합은 같음
    for (i in 1..n) {
        sum += i
        group = i
        if (sum >= n) break
    }

    if (group % 2 == 0) {
        //짝수
        val move = sum - n // 옆칸으로 이동해야하는 수
        //짝수니까 맨 오른쪽에서 이동
        val mother = 1 + move
        val child = group - move
        println("$child/$mother")
    } else {
        //홀수
        val move = sum - n // 옆칸으로 이동해야하는 수
        //홀수니까 맨 오른쪽에서 이동
        val mother = group - move
        val child = 1 + move
        println("$child/$mother")
    }
}