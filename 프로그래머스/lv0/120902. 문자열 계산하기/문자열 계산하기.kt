class Solution {
    fun solution(my_string: String): Int {
        val arr = my_string.split(" ")
        var answer = arr[0].toInt()

        for (i in 1 until arr.size - 1) {
            if (arr[i] == "+") {
                answer += arr[i+1].toInt()
            } 
            if (arr[i] == "-") {
                answer -= arr[i+1].toInt()
            }
        }
        return answer
    }
}