class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf()
        s.forEachIndexed { idx, it ->
            val partition = s.slice(0..idx-1) 
            if (partition.contains(it)) {
                answer += (idx - partition.lastIndexOf(it))
            } else {
                answer += -1
            }
        }
        return answer
    }
}