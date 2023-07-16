import kotlin.math.*

class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray {
        var answer = intArrayOf()
        var numList = numlist.toMutableList()
        var absList = numlist.map { abs(n-it) }.toMutableList()
   
        for (i in 0 until absList.size) {
            val min = absList.minOf {it} 
            val isDuplicate = absList.mapIndexedNotNull { idx, item -> if(item==min) idx else null }.count()
            if (isDuplicate > 1) {
                val duplicateList = absList.mapIndexedNotNull { idx, item -> if(item==min) idx else null } 
                val minList = numList.filterIndexed { idx, _ -> duplicateList.contains(idx) } 
                val max = minList.maxOf {it} 
                answer += max 
                val idx = numList.indexOf(max) 
                absList.removeAt(idx)
                numList.removeAt(idx)
            } else {
                val idx = absList.indexOf(min) 
        	    answer += numList[idx] 
                absList.removeAt(idx)
                numList.removeAt(idx)
            }
        }
        return answer
    }
}