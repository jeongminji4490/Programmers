class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
        var beforeArr: IntArray = intArrayOf()
        var afterArr: IntArray = arr
        
        while (true) {
            beforeArr = afterArr.copyOfRange(0, afterArr.size)
            for (i in 0 until arr.size) {
                if (afterArr[i]>=50 && afterArr[i]%2==0) {
                    afterArr[i] /= 2
                } else if (afterArr[i]<50 && afterArr[i]%2!=0) {
                    afterArr[i] = afterArr[i]*2 + 1
                }
            }
            if (beforeArr contentEquals afterArr) {
                break
            }
            answer += 1
        }
        return answer
    }
}