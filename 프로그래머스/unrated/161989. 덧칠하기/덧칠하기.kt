class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 1
        var start = section[0]
        var end = section[0]+m-1
        for (value in section) {
            if (value>=start && value<=end) {
                continue
            } else {
                start = value
                end = value + (m-1)
                answer++
            }
        }
        return answer
    }
}