class Solution {
    fun solution(n: Int): Int {
        var list1 = (1..1000).toList().map { it.toString() }
        var list2 = list1.filter { (it.toInt())%3 != 0 && !it.contains("3") }
        return list2[n-1].toInt()
    }
}