class Solution {
    fun solution(strArr: Array<String>): List<String> = strArr.mapIndexed { idx, item -> if (idx%2 == 0) item.toLowerCase() else item.toUpperCase() }
}