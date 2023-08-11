class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var sum = 0L
        for (i in 1..count) {
            sum += price * i
        }
        return if (sum > money) (sum-money).toLong() else 0L
    }
}