class Solution {
    fun solution(rsp: String): String {
        var answer: String = ""
        val list = rsp.split("").filter { it != "" }
        list.forEach { it ->
            when (it) {
                "2" -> answer += "0"
                "0" -> answer += "5"
                else -> answer += "2"
            }
        }
        return answer
    }
}