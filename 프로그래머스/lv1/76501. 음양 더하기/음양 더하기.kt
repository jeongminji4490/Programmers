class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var arr = absolutes
        for (i in 0 until signs.size) {
            if (!signs[i]) {
                arr[i] *= -1
            }
        }
        return arr.sum()
    }
}