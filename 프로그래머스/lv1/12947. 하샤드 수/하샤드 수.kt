class Solution {
    fun solution(x: Int): Boolean {
        val list = x.toString().split("").filter { it != "" }.map { it.toInt() }
        val sum = list.sum()
        return if (x%sum == 0) true else false
    }
}