class Solution {
    fun solution(arr: IntArray): IntArray {
        val firstIdx = arr.indexOfFirst { it == 2 }
        val lastIdx = arr.indexOfLast { it == 2 }
        return if (firstIdx != -1 && lastIdx != -1) arr.slice(firstIdx..lastIdx).toIntArray() else intArrayOf(-1)
    }
}