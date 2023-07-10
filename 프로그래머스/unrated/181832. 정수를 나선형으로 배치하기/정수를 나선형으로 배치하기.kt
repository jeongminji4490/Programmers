class Solution {
    fun solution(n: Int): Array<IntArray> {
        val arr = arrayOf(
            arrayOf(0, 1, 0, -1),
            arrayOf(1, 0, -1, 0)
        )
        
        var answer: Array<IntArray> = arrayOf()
        for (i in 0 until n) {
            answer += IntArray(n)
        }

        var cnt = 1;
        var arrIdx = 0;
        var x = 0
        var y = 0
        while (cnt <= n * n) {
            while (!(x < 0 || x >= n || y < 0 || y >= n) && answer[x][y] == 0) {
                answer[x][y] = cnt++
                x += arr[0][arrIdx]
                y += arr[1][arrIdx]
            }

            x -= arr[0][arrIdx]
            y -= arr[1][arrIdx]

            arrIdx++
            if (arrIdx % 4 == 0) {
                arrIdx = 0
            }

            x += arr[0][arrIdx]
            y += arr[1][arrIdx]
        }
        return answer
    }
}