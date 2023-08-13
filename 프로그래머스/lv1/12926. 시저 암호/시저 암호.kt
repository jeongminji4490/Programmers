class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""
        s.map {
            when (it) {
                in 'A'..'Z' -> {
                    if (it + n > 'Z') {
                        answer += (it - 26 + n)
                    } else {
                        answer += (it + n)
                    }
                }
                in 'a'..'z' -> {
                    if (it + n > 'z') {
                        answer += (it - 26 + n)
                    } else {
                        answer += (it + n)
                    }
                }
                else -> {
                    answer += it
                }
            }
        }
        return answer
    }
}