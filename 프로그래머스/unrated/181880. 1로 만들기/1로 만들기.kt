class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var arr = num_list
        
        for (i in 0 until arr.size) {
            while (arr[i] != 1) {
                if (arr[i]%2 == 0) {
                    arr[i] /= 2
                    answer += 1
                } else {
                    arr[i] = (arr[i]-1)/2
                    answer += 1
                }
            }
        }
        
        return answer
    }
}