import kotlin.math.*

class Solution {
    fun solution(array: IntArray): Int {
        var answer = 0
        var map = mutableMapOf<Int, Int>()
        val _array = array.distinct()
        for (i in 0 until _array.size) {
            val key = _array[i]
            map[key] = array.count { it == _array[i] }
        }
        val max = map.maxOf { it.value }
        val count = map.filter { it.value == max }.count()
        if (count > 1) {
            answer = -1
        } else {
            answer = map.filter { it.value == max }.keys.first()
        }
        return answer
    }
}