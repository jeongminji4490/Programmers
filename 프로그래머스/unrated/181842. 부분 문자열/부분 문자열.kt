class Solution {
    fun solution(str1: String, str2: String): Int {
        val list = str2.windowed(str1.length)
        return if (list.contains(str1)) 1 else 0
    }
}