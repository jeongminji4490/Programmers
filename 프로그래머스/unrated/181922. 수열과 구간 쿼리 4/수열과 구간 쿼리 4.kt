class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        queries.forEach { query ->
            val s = query[0]
            val e = query[1]
            val k = query[2]
            for (i in 0 until arr.size) {
                if (i>=s && i<=e && i%k==0) {
                    arr[i] += 1
                }
            }
        }
        return answer
    }
}