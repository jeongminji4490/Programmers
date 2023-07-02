class Solution {
    fun solution(myString: String, pat: String): Int {
        val upperPat = pat.toUpperCase()
        val upperMyString = myString.toUpperCase()
        
        return if (upperMyString.contains(upperPat)) 1 else 0
    }
}