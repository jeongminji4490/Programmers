class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer: IntArray = arr
        
        for (i in query.indices) {
            val firstIdx = 0
            val lastIdx = answer.size - 1
            if (i%2 == 0) {
                answer = answer.slice(firstIdx..query[i]).toIntArray()
            } else {
                answer = answer.slice(query[i]..lastIdx).toIntArray()
            }
        }
        
        return answer
    }
}