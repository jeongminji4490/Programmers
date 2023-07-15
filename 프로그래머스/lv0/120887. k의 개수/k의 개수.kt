class Solution {
    fun solution(i: Int, j: Int, k: Int) = (i..j).map { it.toString() }.joinToString("").count { it.toString()==k.toString() }
}