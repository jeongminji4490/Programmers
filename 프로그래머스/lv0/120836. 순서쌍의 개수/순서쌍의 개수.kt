class Solution {
    fun solution(n: Int): Int {
        var divisorList = mutableListOf<Int>()
        for (i in 1..n) {
            if (n%i == 0) 
                divisorList.add(i)
        }
        return divisorList.size
    }
}