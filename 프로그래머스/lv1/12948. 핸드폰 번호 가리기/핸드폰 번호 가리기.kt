class Solution {
    fun solution(phone_number: String): String {
        val lastIdx = phone_number.lastIndex - 4
        var replaceStr = ""
        
        for (i in 0..lastIdx) {
            replaceStr += "*" 
        }
        
        return phone_number.replaceRange((0..lastIdx), replaceStr)
    }
}