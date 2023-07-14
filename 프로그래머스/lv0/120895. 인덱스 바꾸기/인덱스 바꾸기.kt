class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String {
        var str = my_string.toCharArray()
        str[num1] = my_string[num2]
        str[num2] = my_string[num1]
        return str.joinToString("")
    }
}