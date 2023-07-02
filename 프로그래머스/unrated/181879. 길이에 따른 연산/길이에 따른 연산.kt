class Solution {
    fun solution(num_list: IntArray) = if (num_list.size <= 10) num_list.reduce { a, b -> a*b} else num_list.sum()
}