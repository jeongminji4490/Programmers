class Solution {
    fun solution(arr: Array<IntArray>): Int {
        var answer: Int = 0
        for (i in 0 until arr.size) {
            for (j in 0 until arr.size) {
                if (arr[i][j] == arr[j][i]) {
                    answer = 1
                } else {
                    answer = 0
                    break
                }
            }
            if (answer == 0) break
        }
        return answer
    }
}