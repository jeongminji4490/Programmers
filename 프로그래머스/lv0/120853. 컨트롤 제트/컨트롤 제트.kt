class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        val list = s.split(" ")
        for (i in 0 until list.size) {
            if (list[i] != "Z") {
                answer += list[i].toInt()
            } else {
                answer -= list[i-1].toInt()
            }
        }
        return answer
    }
}