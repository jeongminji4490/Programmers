import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        var gap = abs(n - factorial(1))
        var i = 2
        while (true) {
            var result = abs(n - factorial(i)) 
            if (result < gap && n >= factorial(i)) { 
           	    gap = result
                i++ 
            } else {
                i--
                break
            }
        }
        return i
    }
    
    fun factorial(n: Int): Int {
	    return if (n == 1) n * 1 else n * factorial(n-1)
    }
}