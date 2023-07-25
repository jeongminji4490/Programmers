class Solution {
    fun solution(emergency: IntArray): IntArray {
        var answer = intArrayOf()
        val list = emergency.sortedByDescending { it }
        emergency.forEach { item ->
            answer += list.indexOf(item) + 1
        }
        return answer
    }
}