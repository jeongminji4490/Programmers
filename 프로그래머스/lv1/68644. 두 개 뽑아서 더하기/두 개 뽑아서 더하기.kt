class Solution {
    var list = mutableListOf<Int>()
    var sum = mutableSetOf<Int>()
    
    fun solution(numbers: IntArray): List<Int> {
        combination(0, 2, 0, numbers)
        return sum.sorted()
    }
    
    fun combination(cnt: Int, depth: Int, beginWith: Int, arr: IntArray) {
        if (cnt == depth) {
            sum.add(list.sum())
            return
        }
        for (index in beginWith until arr.size) {
            list.add(arr[index])
            combination(cnt + 1, depth, index + 1, arr)
            list.removeAt(list.lastIndex)
        }
    }
}