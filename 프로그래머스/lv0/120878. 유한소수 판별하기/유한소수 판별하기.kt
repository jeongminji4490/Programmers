import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int): Int {
        var calB = b / gcd(a, b) 
        while (calB != 1) {
            calB /= if (calB % 2 == 0) {
                2
            } else if (calB % 5 == 0) {
                5
            } else {
                return 2
            }
        }
        return 1
    }
    
    fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
}