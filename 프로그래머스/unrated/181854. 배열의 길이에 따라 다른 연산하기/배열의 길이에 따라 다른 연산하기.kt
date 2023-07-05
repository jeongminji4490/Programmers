class Solution {
    fun solution(arr: IntArray, n: Int): List<Int> {
        var answer = listOf<Int>()
        if (arr.size%2 != 0) {
            answer = arr.mapIndexed { idx, it -> if (idx%2 == 0) it + n else it }
        } else {
            answer = arr.mapIndexed { idx, it -> if (idx%2 != 0) it + n else it }
        }
        return answer
    }
}