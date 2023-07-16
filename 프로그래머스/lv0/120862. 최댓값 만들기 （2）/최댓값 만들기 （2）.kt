class Solution {
    fun solution(numbers: IntArray): Int {
        var max = numbers[0]*numbers[1]
        for (i in 0 until numbers.size) {
            for (j in 0 until numbers.size) {
                if (numbers[j]!=numbers[i]) {
                    val result = numbers[i]*numbers[j]
                    if (result>max) {
                        max = result
                    }
                }
            }
        }
        return max
    }
}