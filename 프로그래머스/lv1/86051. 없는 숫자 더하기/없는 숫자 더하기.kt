class Solution {
    fun solution(numbers: IntArray): Int {
        val list = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        val result = list.filterNot { numbers.contains(it) }
        return result.sum()
    }
}