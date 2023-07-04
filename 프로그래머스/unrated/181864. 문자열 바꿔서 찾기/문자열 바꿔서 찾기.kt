class Solution {
    fun solution(myString: String, pat: String): Int {
        var str = myString.map { if (it == 'A') 'B' else 'A' }.joinToString("")
        return if (str.contains(pat)) 1 else 0
    }
}