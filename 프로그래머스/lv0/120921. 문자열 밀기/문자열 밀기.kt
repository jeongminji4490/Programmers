class Solution {
    fun solution(A: String, B: String): Int {        
        var answer = 0
        var n = false
        if (A == B) {
            return answer
        } else {
            var newStr = A 
            for (i in 0 until A.length) { 
                val last = newStr.last() 
                newStr = last + newStr.slice(0..(newStr.lastIndex-1))
                answer++
                if (newStr == B) {
                    n = true
                    break
                }
            }
            return if (n) answer else -1
        }
    }
}