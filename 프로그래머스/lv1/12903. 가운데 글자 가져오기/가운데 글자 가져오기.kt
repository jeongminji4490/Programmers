class Solution {
    fun solution(s: String): String {
        if (s.length%2 != 0) {
            return s[s.length/2].toString()
        } else {
            return s[s.length/2-1].toString() + s[s.length/2].toString()
        }
    }
}