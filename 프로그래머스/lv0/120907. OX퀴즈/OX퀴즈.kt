class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        var result = 0
        quiz.forEach { it ->
            val arr = it.split(" ")
            when (arr[1]) {
                "+" -> {
                    result = arr[0].toInt() + arr[2].toInt()
                } 
                "-" -> {
                    result = arr[0].toInt() - arr[2].toInt()
                }
            }
            answer += if (arr[4].toInt()==result) "O" else "X" 
        }
        return answer
    }
}