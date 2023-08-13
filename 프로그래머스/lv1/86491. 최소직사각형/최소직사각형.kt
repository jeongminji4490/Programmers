class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var max = intArrayOf()
        var min = intArrayOf()
        
        for (i in 0 until sizes.size) {
            if (sizes[i][0] > sizes[i][1]) {
                max += sizes[i][0]
                min += sizes[i][1]
            } else {
                max += sizes[i][1]
                min += sizes[i][0]
            }
        }
      
        return max.maxOf {it} * min.maxOf {it}
    }
}