class Solution {
    fun solution(t: String, p: String): Int {
        var answer: Int = 0
        val list = t.windowed(p.length)
        for (i in 0 until list.size) {
            if (list[i] <= p) {
                answer++
            }
        }
        return answer
    }
}