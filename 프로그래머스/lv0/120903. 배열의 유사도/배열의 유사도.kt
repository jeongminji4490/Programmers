class Solution {
    fun solution(s1: Array<String>, s2: Array<String>): Int {
        var answer: Int = 0
        s2.forEach { if (s1.contains(it)) answer++ }
        return answer
    }
}