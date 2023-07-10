class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for (i in 0 until picture.size) {
            var str = ""
            for (j in 0 until picture[i].length) {
                repeat(k) {
                    str += picture[i][j]
                }
            }
            repeat(k) {
                answer += str
            }
        }
        return answer
    }
}