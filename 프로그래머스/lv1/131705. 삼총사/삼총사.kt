class Solution {
    var answer: Int = 0
    val pickednum = mutableListOf<Int>()
    
    fun solution(number: IntArray): Int {
        combination(0, 3, 0, number)
        return answer
    }
    
    fun combination(cnt: Int, depth: Int, beginWith: Int, arr: IntArray) {
        if (cnt == depth) {
            if (pickednum.sum() == 0) {
                answer++
            }
            return
        }
        for (index in beginWith until arr.size) {
            pickednum.add(arr[index])
            combination(cnt + 1, depth, index + 1, arr)
            pickednum.removeAt(pickednum.lastIndex)
        }
    }
}