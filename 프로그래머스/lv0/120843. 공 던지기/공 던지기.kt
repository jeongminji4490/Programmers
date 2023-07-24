class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var arr = intArrayOf()
        repeat (k) {
            arr += numbers
        }
        return arr[(k-1)*2]
    }
}