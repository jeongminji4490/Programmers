class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = arr
        
        for (i in 0 until answer.size) {
            if (answer[i] >= 50 && answer[i]%2 == 0) {
                answer[i] /= 2
            } else if (answer[i] < 50 && answer[i]%2 != 0) {
                answer[i] *= 2
            }
        }

        return answer
    }
}