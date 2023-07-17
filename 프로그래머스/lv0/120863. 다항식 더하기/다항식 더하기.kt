class Solution {
    fun solution(polynomial: String): String {
        var answer = ""
        var list = polynomial.split(" ")
        var (poly, num) = list.partition { it.endsWith("x") }
        var polyNum = 0
        poly.forEach {
            if (!it.startsWith("x")) {
                val num = it.filter { it.isDigit() }.toInt()
                polyNum += num
            } else {
                polyNum += 1
            }
        }
        var numSum = num.filter { it != "+" }.map { it.toInt() }.sum()
        if (polyNum!=0 && numSum!=0) {
            if (polyNum == 1) {
                answer = "x + $numSum"
            } else {
                answer = "${polyNum}x + $numSum"
            }
        } else if (polyNum == 0) {
            answer = "$numSum"
        } else {
            if (polyNum == 1) {
                answer = "x"
            } else {
                answer = "${polyNum}x"
            }
        }
        return answer
    }
}