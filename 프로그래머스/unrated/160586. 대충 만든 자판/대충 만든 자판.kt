class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        var list = mutableListOf<Int>()
        var result = 0

        targets.forEach { target ->
            for (s in target) { 
                
                for (key in keymap) { 
                    key.mapIndexed { idx, it -> if(it.toChar() == s) list.add(idx) }
                }
                if (list.isEmpty()) {
                    result = -1
                    break
                } else {
                    val min = list.minOf { it }
            		result += min+1
                	list.clear()
                }
            }
            answer += result
            result = 0
 
    }
        
        return answer
    }
}