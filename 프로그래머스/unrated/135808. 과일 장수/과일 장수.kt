class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        var _score = score.toMutableList()
    
        var sortedScore = _score.sortedByDescending { it }
        var slicedSortedScore = sortedScore.chunked(m)
        slicedSortedScore = slicedSortedScore.filter { it.size == m }
  
        slicedSortedScore.forEach { score ->
            var min = score.minOf { it }
            answer += min * m
        }
        return answer
    }
}