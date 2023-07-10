class Solution {
    fun solution(arr: IntArray, k: Int): List<Int> {
        return if (k%2 != 0) arr.map { it*k } else arr.map { it+k }
    }
}