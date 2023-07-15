class Solution {
    fun solution(sides: IntArray): Int {
        val max = sides.maxOf {it}
        val maxIdx = sides.indexOfFirst { it == max }
        val minList = sides.filterIndexed { idx, _ -> idx != maxIdx }
   
        return if (minList.sum() > max) 1 else 2
    }
}