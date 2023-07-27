class Solution {
    fun solution(price: Int): Int {
        var answer: Int = 0
        if (price >= 500000) {
            answer = (price - (price * 0.2)).toInt()
        } else if (price >= 300000) {
            answer = (price - (price * 0.1)).toInt()
        } else if (price >= 100000) {
            answer = (price - (price * 0.05)).toInt()
        } else {
            answer = price
        }
        return answer
    }
}