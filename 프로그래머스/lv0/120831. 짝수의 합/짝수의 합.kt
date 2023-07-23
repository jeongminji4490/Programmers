class Solution {
    fun solution(n: Int) = (2..n).filter { it%2 == 0 }.sum()
}