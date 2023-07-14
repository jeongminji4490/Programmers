class Solution {
    fun solution(array: IntArray) = listOf(array.maxOf { it }, array.indexOf(array.maxOf { it }))
}