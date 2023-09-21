class Solution {
    companion object {
        lateinit var memo: IntArray
    }
    
    fun solution(n: Int): Int {
        var answer = 0
        memo = IntArray(n+1) 
        answer = fibonacci(n)
        return answer
    }
    
    fun fibonacci(n: Int): Int {
        return if (n==0) {
            0
        } else if (n<=2) {
            1
        } else if (n==3) {
            2
        } else if (n==5) {
            5
        } else {
            if (memo[n]!=0) {
                memo[n]
            } else {
                memo[n] = (fibonacci(n-1) + fibonacci(n-2))%1234567
                memo[n]
            }
        }
        
    }
}