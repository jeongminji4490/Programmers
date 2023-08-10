class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var num = 1
        while (true) {
            if (n%num == 1) {
                answer = num
                break
            }
            num++
        }
        return answer
    }
}