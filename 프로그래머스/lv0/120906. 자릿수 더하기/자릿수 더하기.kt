class Solution {
    fun solution(n: Int) = n.toString().toList().map { it.digitToInt() }.sum()
}