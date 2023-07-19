class Solution {
    fun solution(my_string: String): Int {
        var answer = 0
        val split = my_string.split("[a-zA-z]+".toRegex()).toTypedArray()
        for (i in split.indices) {
            if (split[i].matches("[0-9]+".toRegex())) {
                answer += split[i].toInt()
            }
        }
        return answer

    }
}