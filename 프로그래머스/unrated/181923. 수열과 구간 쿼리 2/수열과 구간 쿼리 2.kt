class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        
        queries.forEach { query -> 
            var testArr = intArrayOf()
            val s = query[0]
            val e = query[1]
            val k = query[2]
            for (i in 0 until arr.size) {
                if (i>=s && i<=e && arr[i] > k) {
                    testArr += arr[i]
                }
            }
            if (testArr.isEmpty()) {
                answer += -1
            } else {
                answer += testArr.minOf{ it }
            }
        }
        return answer
    }
}