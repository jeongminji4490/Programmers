class Solution {
    fun solution(myString: String, pat: String): String {
        val lastChar = pat.last()
        val lastIdx = myString.indexOfLast { it == lastChar }
        return myString.slice(0..lastIdx)
    }
}