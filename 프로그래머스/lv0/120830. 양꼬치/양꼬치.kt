class Solution {
    fun solution(n: Int, k: Int): Int {
        var service = 0
        if (n >= 10) {
            service += (n/10)
        }
        service = k - service
        return (n*12000) + ((service) * 2000)
    }
}