class Solution {
    fun solution(arr: IntArray): List<Int> {
        if (arr.isEmpty() || arr.size == 1) {
            return listOf(-1)
        }
        else {
            val min = arr.minOf { it }
            return arr.filterNot { it == min }
        }
    }
}