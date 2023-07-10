class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        var answer: Array<IntArray> = arr
        val row = arr.size
        val col = arr[0].size
        if (row > col) {
            for (i in 0 until row) {
                repeat(row-col) {
                    answer[i] = answer[i].plus(0)
                }
            }
        } else { 
            repeat(col-row) {
                var arr1 = intArrayOf()
                repeat (col) {
                    arr1 += 0
                }
                answer += arr1
            }
        }
        return answer
    }
}