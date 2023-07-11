import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var arr = listOf(a, b, c, d)
        var result = arr.groupingBy { it }.eachCount()
        var answer = 0
        val num1 = result.values.first()
        val num2 = result.values.last()
        val srr = arr.distinct()
        
        if (result.values.first() == 4) {
            answer = 1111 * arr[0]
        } else if (num1==3 || num2 ==3) { 
            if (num1 > num2) {
                val p = result.keys.first()
                val q = result.keys.last()
                answer = (10*p + q)*(10*p + q)
            } else {
                val p = result.keys.last()
                val q = result.keys.first()
                answer = (10*p + q)*(10*p + q)
            }
        } else if (num1==2 && num2==2) { 
            val p = result.keys.first()
            val q = result.keys.last()
            answer = (p+q) * abs(p-q)
        } else if (srr.size == 3) { 
            val list = result.filter { it.value != 2 }
            val q = list.keys.first()
            val r = list.keys.last()
            answer = q*r
        } else {
            answer = arr.minOf { it }
        }
        return answer
    }
}