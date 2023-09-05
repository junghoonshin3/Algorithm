class Solution {
    fun solution(targets: Array<IntArray>): Int {
         targets.sortBy { it[1] }
    targets.sortBy { it[1] }
    var cnt = 1
    var aim_position = targets.first()[1]

    for (target in targets) {
        if (target[0] >= aim_position) {
            aim_position = target[1]
            cnt++
        }
    }
        return cnt
    }
}