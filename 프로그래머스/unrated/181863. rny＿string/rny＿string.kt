class Solution {
    fun solution(rny_string: String): String {
        val str = rny_string.map { it.toString() }.toTypedArray()
        return str.map { if (it == "m") "rn" else it }.joinToString("")
    }
}