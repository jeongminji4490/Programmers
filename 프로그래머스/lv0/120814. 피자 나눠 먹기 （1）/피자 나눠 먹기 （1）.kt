class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        if (n < 7) {
            answer = 1
        } else {
            var _answer = n
            answer += n/7
            if (_answer%7 != 0) {
                answer += 1
            }
        }
        return answer
    }
}