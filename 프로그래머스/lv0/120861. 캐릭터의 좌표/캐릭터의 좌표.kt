class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var x = 0
        var y = 0 
        var maxPWidth = board[0]/2
        var maxNWidth = (board[0]/2) * -1
        var maxPHeight = board[1]/2
        var maxNHeight = (board[1]/2) * -1
        keyinput.forEach { input ->
            when (input) {
                "up" -> {
                    y++ 
                }
                "down" -> {
                    y--
                }
                "right" -> {
                    x++
                }
                "left" -> {
                    x--
                }
            }
            if (x > maxPWidth) {
                x = maxPWidth
            }
            if (x < maxNWidth) {
                x = maxNWidth
            }
            if (y > maxPHeight) {
                y = maxPHeight
            } 
            if (y < maxNHeight) {
                y = maxNHeight
            }
        }
        answer += x
        answer += y
        return answer
    }
}