class Solution {
    fun solution(num1: Int, num2: Int): Int {
        val a = num1.toDouble()
        val b = num2.toDouble()
        return ((a / b) * 1000).toInt()
    }
}