class Solution {
    fun solution(cipher: String, code: Int) = cipher.filterIndexed { idx, item -> idx%code == code-1 }
}