class Solution {
    fun solution(strArr: Array<String>): Int {

        val arr = strArr.groupBy { it.length }
        val values = arr.values
        var newArr = intArrayOf()
        
        values.forEach {
            newArr += it.size
        }

        return newArr.maxOf {it}
    }
}