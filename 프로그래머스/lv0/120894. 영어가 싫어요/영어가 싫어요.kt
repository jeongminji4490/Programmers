class Solution {
    fun solution(numbers: String): Long {
        var answer: String = numbers
        if (answer.contains("zero")) {
            answer = answer.replace("zero", "0")
        }
        if (answer.contains("one")) {
            answer = answer.replace("one", "1")
        }
        if (answer.contains("two")) {
            answer = answer.replace("two", "2")
        }
        if (answer.contains("three")) {
            answer = answer.replace("three", "3")
        }
        if (answer.contains("four")) {
            answer = answer.replace("four", "4")
        }
        if (answer.contains("five")) {
            answer = answer.replace("five", "5")
        }
        if (answer.contains("six")) {
            answer = answer.replace("six", "6")
        }
        if (answer.contains("seven")) {
            answer = answer.replace("seven", "7")
        }
        if (answer.contains("eight")) {
            answer = answer.replace("eight", "8")
        }
        if (answer.contains("nine")) {
            answer = answer.replace("nine", "9")
        }
        return answer.toLong()
    }
}