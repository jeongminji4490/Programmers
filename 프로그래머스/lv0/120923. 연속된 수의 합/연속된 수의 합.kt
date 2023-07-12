class Solution {
    fun solution(num: Int, total: Int): List<Int> {
        var answer: IntArray = intArrayOf()
        var n = total + num
        var arr = intArrayOf()
        while (true) {
            var s = n
            repeat (num) {
                arr += s
                s--
            } 
            if (arr.sum() == total) {
                answer += arr
                break
            }
            n--
            arr = intArrayOf()
        }
        return answer.sorted()
    }
}