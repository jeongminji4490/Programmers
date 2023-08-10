class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        var _x = x.toLong()
        for (i in 1..n) {
            answer += _x
            _x += x
        }
        return answer
    }
}