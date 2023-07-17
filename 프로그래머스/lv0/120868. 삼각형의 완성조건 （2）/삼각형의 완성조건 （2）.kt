class Solution {
    fun solution(sides: IntArray): Int {
    	var answer = 0
        val sum = sides[0] + sides[1] 
        val lside = sides.maxOf { it } 
        val sside = sides.minOf { it } 
        repeat (sum-(lside+1)) { 
            answer += 1
        }
        for (i in (lside+1-sside)..lside) {
            answer+=1 
        }   
        return answer
    }
}