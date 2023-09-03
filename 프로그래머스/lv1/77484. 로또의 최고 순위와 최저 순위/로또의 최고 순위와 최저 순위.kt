class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val zero_count = lottos.filter { it == 0 }.count()
        val same_count = lottos.filter { win_nums.contains(it) }.count()
  
        val max_score = zero_count + same_count
        val min_score = same_count
        
        val max_ranking = getRanking(max_score)
        val min_ranking = getRanking(min_score)
        
        return intArrayOf(max_ranking, min_ranking)
    }
    
    fun getRanking(score: Int): Int {
        return when (score) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }
    }
}