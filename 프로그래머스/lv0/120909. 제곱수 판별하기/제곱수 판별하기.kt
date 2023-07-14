import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        val a = sqrt(n.toDouble())
        val b = floor(a)
        
        return if (a==b) 1 else 2
    }
}