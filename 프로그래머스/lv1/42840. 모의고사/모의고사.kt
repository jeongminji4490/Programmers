class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf()
        var first = listOf(1, 2, 3, 4, 5)
        var second = listOf(2, 1, 2, 3, 2, 4, 2, 5)
        var third = listOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
    
        var scores = arrayListOf(0, 0, 0)
    
        for ((idx, value) in answers.withIndex()) {
            if (value == first[idx%5]) {
                scores[0] += 1
            }
            if (value == second[idx%8]) {
                scores[1] += 1
            }
            if (value == third[idx%10]) {
                scores[2] += 1
            }
        }
    
        val max = scores.maxOf { it }
    
        for ((idx, value) in scores.withIndex()) {
            if (value == max) {
                answer += (idx+1)
            }
        }
    
        return answer
    }
}