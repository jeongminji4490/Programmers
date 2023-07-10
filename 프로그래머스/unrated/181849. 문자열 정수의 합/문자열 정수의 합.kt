class Solution {
    fun solution(num_str: String) = num_str.chunked(1).map{ it.toInt() }.reduce { a, b -> a + b }
}