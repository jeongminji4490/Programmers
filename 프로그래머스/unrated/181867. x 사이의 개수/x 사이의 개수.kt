class Solution {
    fun solution(myString: String): List<Int> = myString.split("x").map { it.length }
}