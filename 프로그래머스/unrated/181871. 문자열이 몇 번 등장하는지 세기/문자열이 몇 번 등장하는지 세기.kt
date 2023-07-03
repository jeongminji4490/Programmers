class Solution {
    fun solution(myString: String, pat: String) = myString.windowed(pat.length).count { it == pat }
}