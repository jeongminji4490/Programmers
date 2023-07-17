class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var x_list = mutableListOf<Int>()
        var y_list = mutableListOf<Int>()
        for (i in 0 until dots.size) {
            x_list.add(dots[i][0])
            y_list.add(dots[i][1])
        }
        var max_x = x_list.maxOf {it}
        var min_x = x_list.minOf {it}
        var max_y = y_list.maxOf {it}
        var min_y = y_list.minOf {it}
       
        return (max_x - min_x) * (max_y - min_y)
    }
}