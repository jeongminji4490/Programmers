class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var answer: IntArray = intArrayOf()
        if (direction == "right") {
            answer += numbers.last()
            for (i in 0 until numbers.size-1) {
                answer += numbers[i]
            }
        } else {
            for (i in 1 until numbers.size) {
                answer += numbers[i]
            }
            answer += numbers.first()
        }
        return answer
    }
}