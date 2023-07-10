class Solution {
    fun solution(my_string: String, target: String): Int {
        val list = my_string.windowed(target.length)
        return if (list.contains(target)) 1 else 0
    }
}