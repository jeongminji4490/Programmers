class Solution {
    fun solution(age: Int): String {
        var answer: String = ""
        val map = mapOf("0" to "a", "1" to "b", "2" to "c", "3" to "d", "4" to "e", "5" to "f", "6" to "g", 
                       "7" to "h", "8" to "i", "9" to "j")
        val split = age.toString().split("").filter { it != "" }
        split.forEach {
            answer += map[it]
        }
        return answer
    }
}