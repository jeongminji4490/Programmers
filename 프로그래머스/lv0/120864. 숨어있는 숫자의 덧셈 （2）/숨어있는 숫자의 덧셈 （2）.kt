class Solution {
    fun solution(my_string: String): Int {
        return my_string.split("[a-zA-z]+".toRegex()).filter { it != "" }.map { it.toInt() }.sum()
    }
}