class Solution {
    fun solution(numbers: IntArray): Int {
        val sorted = numbers.toList().sortedByDescending { it }
        return sorted[0] * sorted[1]
    }
}