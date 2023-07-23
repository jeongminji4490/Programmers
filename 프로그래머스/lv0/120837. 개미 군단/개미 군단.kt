class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = 0
        var left = hp
        if (left/5 != 0) {
            answer += hp/5
            left = hp%5 
        } 
        if (left/3 != 0) {
            answer += left/3
            left = left%3
        }
        if (left != 0) {
            answer += left/1
        }
        return answer
    }
}