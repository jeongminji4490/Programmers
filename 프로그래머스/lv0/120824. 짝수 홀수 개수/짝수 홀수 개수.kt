class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var evenNum = 0
        var oddNum = 0
        for (i in 0 until num_list.size) {
            if (num_list[i]%2 == 0) {
                evenNum += 1
            } else {
                oddNum += 1
            }
        }
        answer += evenNum
        answer += oddNum
        return answer
    }
}