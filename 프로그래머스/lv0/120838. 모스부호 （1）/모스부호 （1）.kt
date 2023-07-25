class Solution {
    fun solution(letter: String): String {
        var answer: String = ""
        val splitLetter = letter.split(" ")
        val map = mapOf(
            "a" to ".-", "b" to "-...", "c" to "-.-.", "d" to "-..", "e" to ".", "f" to "..-.",
            "g" to "--.", "h" to "....", "i" to "..", "j" to ".---", "k" to "-.-", "l" to ".-..",
            "m" to "--", "n" to "-.", "o" to "---", "p" to ".--.", "q" to "--.-", "r" to ".-.",
            "s" to "...", "t" to "-", "u" to "..-", "v" to "...-", "w" to ".--", "x" to "-..-", 
            "y" to "-.--", "z" to "--.."
        )
        splitLetter.forEach { value ->
            answer += map.filterValues { it == value }.keys.toTypedArray().joinToString("")
        }
        return answer
    }
}