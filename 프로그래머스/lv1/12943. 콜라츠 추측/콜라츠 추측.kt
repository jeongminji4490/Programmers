class Solution {
    fun solution(num: Int): Int {
        if (num == 1) return 0
        var answer = 0
        var n = num.toLong()
        while (true) {
            if (n%2L == 0L) {
                n /= 2
            } else {
                n = n*3 + 1
            }
            answer++
            if (n == 1L || answer > 500) {
                break
            }
        }
        return if (answer <= 500) answer else -1
    }
}