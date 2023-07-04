class Solution {
    fun solution(num_list: IntArray): List<Int> {
        return num_list.sorted().filterIndexed { idx, item -> idx < 5 }
    }
}