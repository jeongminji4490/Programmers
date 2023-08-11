class Solution {
    fun solution(s: String): String {
        var answer = ""
        var list = s.split(" ")
        for (i in 0 until list.size) {
            answer += list[i].mapIndexed { idx, item -> if(idx%2==0 && item!=' ') item.toUpperCase() else item.toLowerCase() }.joinToString("")
            if (i < list.size - 1) {
                answer += " "
            }
        }
        return answer
    }
}