class Solution {
    fun solution(money: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val coffee = money/5500
        val remain = money%5500
        answer += coffee
        answer += remain
        return answer
    }
}