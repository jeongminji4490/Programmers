class Solution {
    fun solution(s: String): String {
        var map = mutableMapOf<Char, Int>()
        s.forEach { char ->
            var count = s.count { it == char }
            map.put(char, count)
        }
        val minKeys = map.filter { it.value == 1 }.keys
        return minKeys.sorted().joinToString("")
    }
}