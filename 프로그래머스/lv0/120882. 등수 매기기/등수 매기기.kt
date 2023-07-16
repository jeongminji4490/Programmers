class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        var answer = intArrayOf()
        var average = mutableListOf<Double>()
        score.forEach { arr ->
            val avg = (arr[0]+arr[1])/2.0
            average.add(avg)
        }
        val sortedList = average.sortedByDescending {it}
        for (i in 0 until average.size) {
            answer += sortedList.indexOf(average[i]) + 1
        }
        return answer
    }
}