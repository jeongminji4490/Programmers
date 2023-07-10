class Solution {
    fun solution(n_str: String): String {
        val arr = n_str.toCharArray()
        val idx1 = arr.indexOfFirst { it != '0' }
        return arr.filterIndexed { idx, item -> item != '0' || idx >= idx1  }.joinToString("")
    }
}