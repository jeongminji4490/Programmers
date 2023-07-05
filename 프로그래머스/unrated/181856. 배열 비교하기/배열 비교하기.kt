class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        var answer: Int = 0
        
        var length1 = arr1.size
        var length2 = arr2.size
        
        if (length1 != length2) {
            answer = if (length1 > length2) 1 else -1
        } else {
            if (arr1.sum() != arr2.sum()) {
                answer = if (arr1.sum() > arr2.sum()) 1 else -1
            } else {
                answer = 0
            }
        }
        
        return answer
    }
}