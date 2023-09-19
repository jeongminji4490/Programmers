class Solution {
    fun solution(s: String): String {
        var answer = ""
        var str = s
        if (str[0].isLowerCase()) {
            answer += str[0].toUpperCase()
        } else {
            answer += str[0]
        }
        for (i in 1 until str.length) {
            if (str[i-1] == ' ') {
                answer += str[i].toUpperCase()
            } else {
                answer += str[i].toLowerCase()
            }
        }
        
        return answer
    }
}