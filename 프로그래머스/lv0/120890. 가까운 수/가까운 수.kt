import kotlin.math.*

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var arr = arrayOf<Int>()
        var idxList = arrayOf<Int>()
        array.forEach {
            arr += abs(it-n)
        }
        val min = arr.minOf { it } 
        arr.forEachIndexed { idx, it ->
            if (it == min) {
                idxList += idx
            }
        }
        val minList = array.filterIndexed { idx, it -> idxList.contains(idx) }
        return minList.minOf {it} 
    }
}