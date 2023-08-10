class Solution {
    fun solution(n: Long): List<Int> {
        val str = n.toString()
        return str.map { it.digitToInt() }.reversed()
    }
}