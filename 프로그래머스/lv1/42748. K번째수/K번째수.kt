class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        
        commands.forEach { command ->
            val i = command[0]
            val j = command[1]
            val k = command[2]
            
            val sorted = array.toList().slice((i-1)..(j-1)).toList().sorted()
            answer += sorted[k-1].toInt()
        }
        
        return answer
    }
}