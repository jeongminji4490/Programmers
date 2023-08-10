class Solution {
    fun solution(n: Int): Int {
        val str = n.toString()
        return str.map { it.digitToInt() }.sum()
    }
}