class Solution {
    fun solution(order: Array<String>): Int {
        var answer: Int = 0
        order.forEach {
            when (it) {
                "icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte" -> {
                    answer += 5000
                }
                else -> {
                    answer += 4500
                }
            }
        }
        return answer
    }
}