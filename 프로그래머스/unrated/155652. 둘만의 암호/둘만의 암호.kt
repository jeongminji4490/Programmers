class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""

        val alpha_list = ('a'..'z').toList()
        val filtered = alpha_list.filter { !skip.contains(it) }
        
        s.forEach { i ->
            var count = 1
            var result = i
            var idx = 0
            while (count <= index) {
                idx = filtered.indexOf(result) 
                if (idx >= filtered.size-1) { 
                    result = filtered[0] 
                } else {
                    idx++
                    result = filtered[idx]
                }
                count++ 
            }
            answer += result
        }
    
        return answer
    }
}