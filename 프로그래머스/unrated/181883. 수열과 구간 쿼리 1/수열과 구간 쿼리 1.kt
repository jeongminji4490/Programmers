class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        
        queries.forEach { query ->
            val firstIdx = query[0]
            val lastIdx = query[1]
            for (i in firstIdx..lastIdx) {
                answer[i] += 1
            }
        }
                
        return answer
    }
}