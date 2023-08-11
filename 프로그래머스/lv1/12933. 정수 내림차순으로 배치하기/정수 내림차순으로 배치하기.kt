class Solution {
    fun solution(n: Long): Long {
        var list = n.toString().toMutableList()
        list.sortDescending()
        return list.joinToString("").toLong()
    }
}