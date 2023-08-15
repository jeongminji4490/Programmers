class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = intArrayOf()
        
        photo.forEach { arr ->
            var sum = 0
            arr.forEach { element ->
                if (name.contains(element)) {
                    val nameIdx = name.indexOf(element)
                    sum += yearning[nameIdx]
                }
            }
            answer += sum
        }
        return answer
    }
}