class Solution {
    fun solution(board: Array<IntArray>): Int {
        var answer = 0
        val boomExplosionRange = 1
        val copyBoard = Array(board.size) { IntArray(board[0].size) }
        var tempIndex = 0
        for (rows in board) {
            copyBoard[tempIndex] = rows.copyOf(board[tempIndex].size)
            tempIndex++
        }
        for (i in board.indices) {
            for (j in 0 until board[i].size) {
                val `val` = board[i][j]
                if (`val` == 0) continue
                makeBoomArea(i, j, boomExplosionRange, copyBoard)
            }
        }
        for (ints in copyBoard) {
            for (anInt in ints) {
                if (anInt == 0) answer++
            }
        }
        return answer
    }

    private fun makeBoomArea(row: Int, col: Int, boomExplosionRange: Int, board: Array<IntArray>) {
        for (r in row - boomExplosionRange..row + boomExplosionRange) {
            if (r < 0 || r >= board.size) continue
            for (c in col - boomExplosionRange..col + boomExplosionRange) {
                if (c < 0 || c >= board[0].size) continue
                board[r][c] = 1
            }
        }
    }
}