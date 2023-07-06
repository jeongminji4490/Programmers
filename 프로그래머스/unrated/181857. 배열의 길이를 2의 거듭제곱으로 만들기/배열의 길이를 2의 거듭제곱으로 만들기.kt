import kotlin.math.*

class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = arr
        val size = answer.size
        
        if (isPower(size) != 1) {
            val num = findTargetNumber(size)
            repeat (num-size) {
                answer += 0
            }
        } 
        
        return answer
    }
    
    fun isPower(num: Int): Int {
        return if (num%2 != 0) num else isPower(num/2)
    }
    
    fun findTargetNumber(num: Int): Int {
        var result = 1

        while (true) { 
            if (result > num) 
                break
            result *= 2 
        }
        
        return result
    }
}