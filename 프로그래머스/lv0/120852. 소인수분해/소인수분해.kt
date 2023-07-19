import kotlin.math.*

class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val primeArr = getPrimeNumArray(2, n)
        
        for (i in 0 until primeArr.size) {
            if (n%primeArr[i] == 0) {
                answer += primeArr[i]
            }
        }
        return answer
    }
    
    fun getPrimeNumArray(n: Int, m: Int): IntArray { 
        val prime = BooleanArray(m + 1){true}
        var arr = intArrayOf()
        val sqrtOfM = sqrt(m.toDouble()).toInt()
        for (i in 2..sqrtOfM){ 
            if (!prime[i]) continue 
            else {
                var j = 2
                while (i*j <= m) {
                    if (prime[i*j]) prime[i*j] = false
                    j++
                }
            }
        }

        for (i in n..m){
            if (i == 0 || i == 1) continue
            if (prime[i]) arr += i
        }
        return arr
    }
}