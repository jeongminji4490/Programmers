class Solution {
    fun solution(n: Int) = (1..n).toList().sorted().filter { it%2 != 0 }
}