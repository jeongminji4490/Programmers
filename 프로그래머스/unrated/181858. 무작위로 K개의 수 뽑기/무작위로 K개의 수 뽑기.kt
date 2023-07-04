class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val newArr = arr.distinct()

        if (newArr.size < k) {
            val n = k - newArr.size
            answer = newArr.toIntArray()
            repeat(n) {
                answer += -1
            }
        } else {
            answer = newArr.dropLast(newArr.size-k).toIntArray()
        }
        return answer
    }
}