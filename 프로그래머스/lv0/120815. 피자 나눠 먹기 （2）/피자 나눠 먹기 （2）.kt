class Solution {
    fun solution(n: Int): Int {
        var n_num = n
        while (true) {
            if (n_num%6 == 0) {
                break
            }
            n_num += n
        }
        return n_num/6
    }
}