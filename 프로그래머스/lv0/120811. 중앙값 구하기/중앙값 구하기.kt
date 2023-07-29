class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        val _array = array.toList().sorted()
        val median_idx = (_array.size-1) / 2
        return _array[median_idx]
    }
}