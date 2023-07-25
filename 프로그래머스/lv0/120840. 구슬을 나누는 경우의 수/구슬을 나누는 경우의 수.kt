class Solution {
    
    private fun combination(n: Int, r: Int): Int {
        return if (r == 0 || n == r) {
            1
        } else {
            combination(n - 1, r - 1) +
                    combination(n - 1, r)
        }
    }

    fun solution(balls: Int, share: Int): Int {
        return combination(balls, share)
    }
}