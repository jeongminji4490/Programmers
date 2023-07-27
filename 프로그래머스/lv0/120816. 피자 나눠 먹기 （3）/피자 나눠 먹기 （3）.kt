class Solution {
    fun solution(slice: Int, n: Int): Int {
        var _slice = slice
        var answer: Int = 1
        if (slice < n) {
            
            while (true) {
                answer++
                _slice += slice
                
                if (_slice >= n) break
            }
        }
        return answer
    }
        
}