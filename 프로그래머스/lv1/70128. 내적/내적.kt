class Solution {
    fun solution(a: IntArray, b: IntArray): Int {
        return factorial(a.size, 0, a, b)
    }
    
    tailrec fun factorial(n: Int, idx: Int, a: IntArray, b: IntArray): Int {
        if (idx == n-1) {
            return a[n-1]*b[n-1]
        } else {
            return a[idx]*b[idx] + factorial(n, idx+1, a, b)
        }
    }
}