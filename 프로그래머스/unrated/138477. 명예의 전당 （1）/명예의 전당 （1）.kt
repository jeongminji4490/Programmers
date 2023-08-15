class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var hallOfFame = mutableListOf<Int>()
        answer += score[0]
        hallOfFame += score[0] 
        for (i in 1 until score.size) { 
            if (i < k) {
                val min = answer.minOf { it }
                answer += if (score[i] < min) score[i] else min
                hallOfFame += score[i]
            } else { 
                val list = hallOfFame.sortedByDescending { it }
                if (score[i] >= list[k-1]) { 
                    hallOfFame += score[i] 
                    val list = hallOfFame.sortedByDescending { it }
                    answer += list[k-1] 
                } else {
                    val list = hallOfFame.sortedByDescending { it }
                    answer += list[k-1]
                }
            }
        }
        return answer
    }
}