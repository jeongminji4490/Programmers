import kotlin.math.*

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var divisorList = arrayListOf<Int>()
        var divisorNumList = arrayListOf<Int>() 
    
        for (i in 1..number) {
            val sqrt = sqrt(i.toDouble())
            for (j in 1 .. sqrt.toInt()) {
        	    if (i % j == 0) {
            	    divisorList.add(j)
            	    if (i / j != j) {
                	    divisorList.add(i / j)
            	    }
        	    }
            }
            divisorNumList.add(divisorList.count())
            divisorList.clear()
        }
    
        for (i in 0 until divisorNumList.size) {
            if (divisorNumList[i] > limit) {
                divisorNumList[i] = power
            }
        }
        return divisorNumList.sum()
    }
    
}