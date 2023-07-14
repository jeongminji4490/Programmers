class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer = num.toString().indexOfFirst { it.digitToInt() == k }
        return if (answer != -1) answer+1 else answer
    }
}