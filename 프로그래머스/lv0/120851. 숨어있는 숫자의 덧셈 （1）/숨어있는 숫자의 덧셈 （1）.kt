class Solution {
    fun solution(my_string: String): Int {
        return my_string.filter { it.isDigit() == true }.map { it.digitToInt() }.reduce { a, b -> a + b }
    }
}