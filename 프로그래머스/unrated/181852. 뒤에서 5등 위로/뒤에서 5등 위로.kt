class Solution {
    fun solution(num_list: IntArray) = num_list.sorted().filterIndexed { idx, _ -> idx > 4 }
}