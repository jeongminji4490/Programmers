class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer: Int = 0
        var _n = n
        var left = 0
        while (_n >= a) {
            left = (_n/a)*b 
            answer += left 
            _n = _n % a + left 
        }
        return answer
    }
}