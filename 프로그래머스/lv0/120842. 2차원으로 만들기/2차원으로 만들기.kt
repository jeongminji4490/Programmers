class Solution {
    fun solution(num_list: IntArray, n: Int): List<List<Int>> {
        return num_list.toMutableList().chunked(n)
    }
}