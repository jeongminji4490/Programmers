class Solution {
    fun solution(myString: String) = myString.map { if (it == 'a' || it == 'A') it.toUpperCase() else it.toLowerCase() }.joinToString("")
}