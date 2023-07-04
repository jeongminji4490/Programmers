class Solution {
    fun solution(myStr: String): List<String> {
        val result = myStr.split('a', 'b', 'c').filter { it != "" } 
        return if (result.isEmpty()) listOf("EMPTY") else result
     }
}