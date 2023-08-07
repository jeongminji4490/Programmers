class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var numerSum = 0
        var denomSum = 0
        
        if (denom1 == denom2) {
            numerSum = numer1 + numer2 
            val gcd = gcd(numerSum, denom1)
            if (numerSum%gcd == 0 && denom1%gcd == 0) {
                answer += numerSum/gcd
                answer += denom1/gcd
            } else { 
                answer += numerSum
                answer += denom1
            }
        } else {
            val lcd = (denom1 * denom2) / gcd(denom1, denom2) 
            var _denom1 = denom1 * (lcd / denom1) 
            var _denom2 = denom2 * (lcd / denom2) 
            var _numer1 = numer1 * (lcd / denom1) 
            var _numer2 = numer2 * (lcd / denom2) 
        
            var numerSum = _numer1 + _numer2 
        
            val gcd = gcd(numerSum, _denom1) 
        
            if (gcd == 1) {
                answer += numerSum
                answer += _denom1
            } else {
                answer += numerSum/gcd
                answer += _denom1/gcd
            }
        }
        return answer
    }
    
    fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a
}