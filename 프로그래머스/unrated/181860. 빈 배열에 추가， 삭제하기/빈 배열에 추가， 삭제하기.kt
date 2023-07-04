class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): List<Int> {
        var answer = mutableListOf<Int>()
        
        for (i in flag.indices) {
            if (flag[i] == true) {
                repeat(arr[i]*2) {
                    answer.add(arr[i])
                }
            } else {
                answer = answer.dropLast(arr[i]).toMutableList()
            }
        }
        
        return answer
    }
}