class Solution {
    fun solution(num_list: IntArray, n: Int) = num_list.filterIndexed { idx, _ -> idx%n == 0 }
}