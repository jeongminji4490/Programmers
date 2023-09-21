class Solution {

    fun solution(n: Int, a: Int, b: Int): Int {  
        var a = a
        var b = b
        var turn =0
        while(a!=b){
            a = (a+1)/2
            b = (b+1)/2
            turn++
        }

        return turn
    }
}