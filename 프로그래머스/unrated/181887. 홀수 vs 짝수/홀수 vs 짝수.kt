import kotlin.math.*

class Solution {
    fun solution(num_list: IntArray) = max(num_list.filterIndexed { idx, item -> (idx+1)%2 != 0 }.sum(), num_list.filterIndexed { idx, item -> (idx+1)%2 == 0 }.sum())
}