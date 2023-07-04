class Solution {
    fun solution(myString: String) = myString.split("x").sorted().filter { it != "" }
}