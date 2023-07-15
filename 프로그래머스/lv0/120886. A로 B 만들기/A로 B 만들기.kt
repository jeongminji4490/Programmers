class Solution {
    fun solution(before: String, after: String): Int {
        val arr1 = before.toList().sorted()
        val arr2 = after.toList().sorted()
        return if (arr1 == arr2) 1 else 0
    }
}