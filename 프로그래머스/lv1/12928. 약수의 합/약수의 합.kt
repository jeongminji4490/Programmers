import kotlin.math.*

class Solution {
    fun solution(n: Int): Int {
        return findDivisor(n)
    }
    
    fun findDivisor(number: Int): Int {
        val sqrt = sqrt(number.toDouble())
        val list = arrayListOf<Int>()
        for (i in 1 .. sqrt.toInt()) {
            if (number % i == 0) {
                list.add(i)
                if (number / i != i) {
                    list.add(number / i)
                }
            }
        }
        return list.sum()
    }
}