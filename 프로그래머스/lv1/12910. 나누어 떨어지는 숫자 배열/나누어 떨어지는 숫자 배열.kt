class Solution {
    fun solution(arr: IntArray, divisor: Int): List<Int> {
        var answer = intArrayOf()
        var n = false
        for (i in 0 until arr.size) {
            if (arr[i]%divisor == 0) {
                answer += arr[i]
                n = true
            }
        }
        return if (n) answer.sorted() else listOf(-1)
    }
}