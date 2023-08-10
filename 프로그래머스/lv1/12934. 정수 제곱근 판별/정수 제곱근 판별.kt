import kotlin.math.*

class Solution {
    fun solution(n: Long): Long {
        val dn = n.toDouble()
        var sqrt = sqrt(dn)
        var floor = floor(sqrt)
        return if (sqrt == floor) {
            (sqrt+1).pow(2).toLong()
        } else -1
    }
}