import kotlin.math.*

class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        for (i in left..right) {
            if (findDivisor(i)%2 == 0) {
                answer += i
            } else {
                answer -= i
            }
        }
        return answer
    }
    
    fun findDivisor(number: Int): Int {
        val sqrt = sqrt(number.toDouble())
        val result = arrayListOf<Int>()
        for (i in 1 .. sqrt.toInt()) {
            if (number % i == 0) {
                result.add(i)
                if (number / i != i) {
                    result.add(number / i)
                }
            }
        }
        return result.size
    }
}