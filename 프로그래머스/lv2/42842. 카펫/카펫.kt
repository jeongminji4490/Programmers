class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {

        val sum = brown + yellow
        var row = 0
        var col = 0
        var list = intArrayOf()
        
        for (i in 1 until sum) {
            if (sum%i == 0) {
                list += i
            }
        }

        for (i in 0 until list.size) {
            for (j in 1 until list.size) {
                var result = (list[i]-2) * (list[j]-2)
                if (result == yellow) {
                    if (list[i] > list[j]) {
                        row = list[i]
                        col = list[j]
                    } else {
                        row = list[j]
                        col = list[i]
                    }
                }
            }
        }
        
        return intArrayOf(row, col)
    }
}