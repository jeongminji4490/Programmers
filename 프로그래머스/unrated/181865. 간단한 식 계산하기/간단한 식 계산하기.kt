class Solution {
    fun solution(binomial: String): Int {
        var answer: Int = 0
        var str = binomial.replace(" ", "")
        
        if (str.contains("+")) {
            val arr = str.split("+")
            answer = arr[0].toInt() + arr[1].toInt()
        } else if (str.contains("-")) {
            val arr = str.split("-")
            answer = arr[0].toInt() - arr[1].toInt()
        } else {
            val arr = str.split("*")
            answer = arr[0].toInt() * arr[1].toInt()
        }
        
        return answer
    }
}