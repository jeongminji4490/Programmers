class Solution {
    fun solution(strArr: Array<String>) = strArr.groupBy { it.length }.maxOf { (k, v) -> v.size }
}