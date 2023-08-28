class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = intArrayOf()
        var players = stages.size
        var array = mutableListOf<Double>()
        
        for (stage in 0 until N) {
            var count = stages.filter { it == (stage+1) }.count()
            var rate = count.toDouble()
            if (players == 0) {
                array.add(0.0)
            } else {
                array.add(rate/players)
            }
            players -= count
        }

        var max = array.maxOf { it }

        for (i in 0 until N) {
            val idx = array.indexOfFirst { it == max }
            if (idx == -1) {
                max = array.maxOf { it }
                val idx = array.indexOfFirst { it == max }
                answer += (idx + 1)
                array[idx] = -1.0
            } else {
                answer += (idx + 1)
                array[idx] = -1.0
            }
        }
        return answer
    }
}