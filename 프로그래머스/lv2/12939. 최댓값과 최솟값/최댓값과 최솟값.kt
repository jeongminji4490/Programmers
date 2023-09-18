class Solution {
    fun solution(s: String): String {
        var answer = ""
        var list = s.split(" ")
        var _list = mutableListOf<Int>()
        list.forEach { it ->
            _list.add(it.toInt())
        }
        val min = _list.minOf { it }
        val max = _list.maxOf { it }
        answer = min.toString() + " " + max.toString()
        return answer
    }
}