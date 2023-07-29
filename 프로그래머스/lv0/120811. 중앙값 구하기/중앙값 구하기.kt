class Solution {
    fun solution(array: IntArray): Int {
        val _array = array.toList().sorted()
        val median_idx = (_array.size-1) / 2
        return _array[median_idx]
    }
}