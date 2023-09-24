class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 0
        
        if (arr.size == 1) {
            return arr[0]
        } else if (arr.size == 2) {
            return lcd(arr[0], arr[1])
        } else {
            var n1 = arr[arr.size-1]
            var n2 = arr[arr.size-2]
        
            var lcd = lcd(n1, n2)
            answer = lcd
            
            for (i in arr.size-3 downTo 0) {
                while (true) {
                    if (answer%arr[i] == 0) {
                        lcd = answer
                        break
                    }
                    answer += lcd 
                }
            }
        
        }
        
        return answer  
    }
    
    fun lcd(a: Int, b: Int) = (a * b)/gcd(a, b)
    
    fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a%b) else a
        
}