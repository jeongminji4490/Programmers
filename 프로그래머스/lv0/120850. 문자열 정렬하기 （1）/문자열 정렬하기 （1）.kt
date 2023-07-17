class Solution {
    fun solution(my_string: String): List<Int> {
        var list = mutableListOf<Int>()
        my_string.forEach { it ->
            if (it.isDigit()) list.add(it.digitToInt())
        }
        return list.sorted()
    }
}