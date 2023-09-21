class Solution {
    fun solution(s: String): IntArray {

        var _s = s
        var count = 0
        var deleted_count = 0
        
        while (_s != "1") {
            var zero_c = _s.filter { it == '0' }.count()
            deleted_count += zero_c
            var filtered = _s.filter { it == '1' }.count()
            
            _s = Integer.toBinaryString(filtered)
            count++
        }
        
        return intArrayOf(count, deleted_count)
    }
}