class Solution {
    fun solution(s: String): Boolean {
        var answer = true
        if (s.length != 4 && s.length != 6) return false
        for (i in 0 until s.length) {
            if (!s[i].isDigit()) {
                answer = false
                break
            }
        }
        return answer
    }
}