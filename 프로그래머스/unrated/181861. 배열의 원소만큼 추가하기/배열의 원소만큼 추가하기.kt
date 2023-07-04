class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (i in arr.indices) {
            repeat(arr[i]) {
                answer += arr[i]
            }
        }
        
        return answer
    }
}