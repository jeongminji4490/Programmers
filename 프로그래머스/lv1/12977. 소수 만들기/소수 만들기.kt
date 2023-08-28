import kotlin.math.*

class Solution {
    var result = Array(3) {0}
    var answer = 0
    
    fun solution(nums: IntArray): Int {
        combination(nums, 0, 0)
        return answer
    }
    
    fun combination(nums: IntArray, index: Int, count: Int){
        if(count == 3){
            isPrime(result.sum())
            return
        }
        
        for(i in index until nums.size){
            result[count] = nums[i]
            combination(nums, i + 1, count + 1)
        }
    }
    
    fun isPrime(num: Int) {
        var isPrime = true
        val sqrt = sqrt(num.toDouble()).toInt()
        for (i in 2..sqrt) {
            if (num%i == 0) {
                isPrime = false
                break
            } 
        }
        if (isPrime) answer++
    }

}