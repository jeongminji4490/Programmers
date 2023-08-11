class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()
        for (i in 0 until arr1.size) {
            var arr = intArrayOf()
            for (j in 0 until arr1[0].size) {
                arr += arr1[i][j] + arr2[i][j]
            }
            answer += arr
        }
        return answer
    }
}