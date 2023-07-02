class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var result = 0
        for (number in numbers) {
            if (result > n) {
                break
            } else {
                result += number
            }
        }
        return result
    }
}