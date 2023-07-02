class Solution {
    fun solution(num_list: IntArray) = num_list.indices.find { num_list[it] < 0 } ?: -1
}