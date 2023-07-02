class Solution {
    fun solution(my_string: String, alp: String): String {
        var str = my_string.toCharArray()
        for (i in 0 until str.size) {
            if (str[i] == alp.first()) {
                str[i] = str[i].toUpperCase()
            }
        }
        return str.joinToString("")
    }
}